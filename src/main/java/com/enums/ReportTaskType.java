package com.enums;


public enum ReportTaskType {
    TASK_MATTER_VOTE_DOCX("task.matter.vote.docx","业主大会线上投票导出"),
    DIGITAL_TASK_SEND("digital.task.send","同步新注册用户信息"),
    NOOP("noop","不可用");
    public final String v;
    public final String remark;

    public static final String VERSION = "0.0.1";

    ReportTaskType(String v, String remark) {
        this.v = v;
        this.remark = remark;
    }

    public static ReportTaskType of(String v){
        ReportTaskType[] vals = ReportTaskType.values();
        for (int i = 0; i < vals.length; i++) {
            if(vals[i].v.equals(v)){
                return vals[i];
            }
        }
        return null;
    }

}
