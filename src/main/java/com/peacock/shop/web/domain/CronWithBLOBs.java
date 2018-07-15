package com.peacock.shop.web.domain;

public class CronWithBLOBs extends Cron {
    private String cronDesc;

    private String cronConfig;

    public CronWithBLOBs(Byte cronId, String cronCode, String cronName, Byte cronOrder, Integer thistime, Integer nextime, Byte day, String week, String hour, String minute, Boolean enable, Boolean runOnce, String allowIp, String alowFiles, String cronDesc, String cronConfig) {
        super(cronId, cronCode, cronName, cronOrder, thistime, nextime, day, week, hour, minute, enable, runOnce, allowIp, alowFiles);
        this.cronDesc = cronDesc;
        this.cronConfig = cronConfig;
    }

    public CronWithBLOBs() {
        super();
    }

    public String getCronDesc() {
        return cronDesc;
    }

    public void setCronDesc(String cronDesc) {
        this.cronDesc = cronDesc == null ? null : cronDesc.trim();
    }

    public String getCronConfig() {
        return cronConfig;
    }

    public void setCronConfig(String cronConfig) {
        this.cronConfig = cronConfig == null ? null : cronConfig.trim();
    }
}