package com.zblog.model;

import java.util.Date;

public class Discuss extends DiscussKey {
    private Date discussDatetime;

    private String discusscontent;

    public Date getDiscussDatetime() {
        return discussDatetime;
    }

    public void setDiscussDatetime(Date discussDatetime) {
        this.discussDatetime = discussDatetime;
    }

    public String getDiscusscontent() {
        return discusscontent;
    }

    public void setDiscusscontent(String discusscontent) {
        this.discusscontent = discusscontent == null ? null : discusscontent.trim();
    }
}