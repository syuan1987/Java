package cn.syuan.jnshu.model;

import java.io.Serializable;

public class EntryFormWithBLOBs extends EntryForm implements Serializable {
    private String dailylink;

    private String aim;

    private String wherefrom;

    private static final long serialVersionUID = 1L;

    public String getDailylink() {
        return dailylink;
    }

    public void setDailylink(String dailylink) {
        this.dailylink = dailylink == null ? null : dailylink.trim();
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim == null ? null : aim.trim();
    }

    public String getWherefrom() {
        return wherefrom;
    }

    public void setWherefrom(String wherefrom) {
        this.wherefrom = wherefrom == null ? null : wherefrom.trim();
    }
}