package com.mq;

import com.enums.ReportTaskType;
import com.rabbitmq.client.*;
import com.util.AESUtil;
import com.util.MapBuilder;
import org.apache.commons.codec.binary.Base64;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * @author sunke
 * @DATE 2021/12/28
 **/
public class DigitalMQ {
    public static final String MQ_EX_ICOMMUNITY = "ex_icommunity";
    public static final String MQ_KEY_QUEUE_DEAD_IC_REPORT_TASK = "key_queue_dead_ic_report_task";
    public static final String MSG_KEY = "TlrsYnTInlO+e3Flre4mwPQrcG9SD3Px/HlN1wf+ftc=";
    public static void main(String[] args) throws IOException, TimeoutException {
        FileInputStream file = new FileInputStream("C:\\Users\\10247\\Desktop\\digital.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(file);
        XSSFSheet sheet = book.getSheetAt(0);
        int rows = sheet.getPhysicalNumberOfRows();
        ConnectionFactory factory = new ConnectionFactory();
        //factory.setHost("192.168.0.94");
        factory.setHost("localhost");
        //factory.setPort(5672);
        factory.setPort(18888);
        factory.setUsername("jnh");
        factory.setPassword("Welcome123");
        factory.setVirtualHost("/tesilian");
        X509TrustManager x509m = new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
        SslContextFactory sslContextFactory = s -> {
            SSLContext ssl = null;
            try {
                ssl = SSLContext.getInstance("TLS");
                ssl.init(null, new TrustManager[] { x509m },
                        new java.security.SecureRandom());
            } catch (NoSuchAlgorithmException | KeyManagementException e) {
                e.printStackTrace();
            }
            return ssl;
        };

        factory.setSslContextFactory(sslContextFactory);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        int count = 0;
        for (int i = 1; i < rows; i++) {
            Long userId = Long.valueOf(sheet.getRow(i).getCell(1).getRawValue());
            System.out.println(userId);
            Map<String, Object> map = MapBuilder.normal().put("userId", userId).build();
            String raw = MapBuilder.normal()
                    .put("params", map)
                    .put("taskType", ReportTaskType.DIGITAL_TASK_SEND.v)
                    .put("version", ReportTaskType.VERSION)
                    .json();
            System.out.println(raw);
            Map<String, Object> headers = new HashMap<>();
            headers.put("crypt", Boolean.FALSE);
            AMQP.BasicProperties properties = new AMQP.BasicProperties().builder()
                    .contentEncoding("UTF-8")
                    .headers(headers)
                    .build();
            byte[] bytes = null;
            try {
                bytes = AESUtil.encrypt(AESUtil.ALGO_ECB_PKCS5, Base64.decodeBase64(MSG_KEY), raw.getBytes());
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("加密异常",e);
            }
            channel.basicPublish(MQ_EX_ICOMMUNITY,MQ_KEY_QUEUE_DEAD_IC_REPORT_TASK,properties,bytes);
            count ++ ;
        }
        System.out.println(count);
    }
}
