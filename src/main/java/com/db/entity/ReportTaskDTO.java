package com.db.entity;

import com.alibaba.fastjson.JSONObject;
import com.enums.ReportTaskType;
import lombok.Data;

/**
 * ClassName: ReportTaskDTO
 *
 * @author: davidwang2006@aliyun.com DavidWang
 * @date: 2021/12/8 15:37
 * @description:
 */
@Data
public class ReportTaskDTO {
    //任务类型
    private String taskType;
    //版本号
    private String version;

    //关联参数
    private JSONObject params;

    public static ReportTaskDTO of(ReportTaskType taskType, String version, Object params){
        ReportTaskDTO dto = new ReportTaskDTO();
        dto.setTaskType(taskType.v);
        dto.setVersion(version);
        dto.setParams((JSONObject) JSONObject.toJSON(params));
        return dto;
    }

}
