package com.jeeps.laboratorioutpl.model.access;

import com.google.gson.annotations.SerializedName;
import com.jeeps.laboratorioutpl.model.Sala;

public class AccessWithRoom {
    @SerializedName("_id")
    private String id;
    private String date;
    private String hour;
    private String user;
    private Sala sala;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
