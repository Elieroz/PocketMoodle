package org.bernatpol.pocketmoodle.subject;

import java.io.Serializable;

public class Subject implements Serializable {
    private String module;
    private String title;
    private int color;

    public Subject(String module, String title, int color) {
        this.module = module;
        this.title = title;
        this.color = color;
    }

    public String getModule() {
        return this.module;
    }

    public String getTitle() {
        return this.title;
    }

    public int getColor() {
        return this.color;
    }
}
