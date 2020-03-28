package org.bernatpol.pocketmoodle.ui.timetable;

public class TimetableSubject {
    private String module;
    private String hourBegin;
    private String hourEnd;

    public TimetableSubject(String module, String hourBegin, String hourEnd) {
        this.module = module;
        this.hourBegin = hourBegin;
        this.hourEnd = hourEnd;
    }

    public String getModule() {
        return this.module;
    }

    public String getHourBegin() {
        return this.hourBegin;
    }

    public String getHourEnd() {
        return this.hourEnd;
    }
}
