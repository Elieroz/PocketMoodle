package org.bernatpol.pocketmoodle.ui.timetable;

import java.util.ArrayList;

public class Timetable {
    private ArrayList<TimetableSubject> monday;
    private ArrayList<TimetableSubject> tuesday;
    private ArrayList<TimetableSubject> wednesday;
    private ArrayList<TimetableSubject> thursday;
    private ArrayList<TimetableSubject> friday;

    public Timetable(ArrayList<TimetableSubject> monday, ArrayList<TimetableSubject> tuesday, ArrayList<TimetableSubject> wednesday, ArrayList<TimetableSubject> thursday, ArrayList<TimetableSubject> friday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
    }

    public ArrayList<TimetableSubject> getMonday() {
        return this.monday;
    }

    public ArrayList<TimetableSubject> getTuesday() {
        return this.tuesday;
    }

    public ArrayList<TimetableSubject> getWednesday() {
        return this.wednesday;
    }

    public ArrayList<TimetableSubject> getThursday() {
        return this.thursday;
    }

    public ArrayList<TimetableSubject> getFriday() {
        return this.friday;
    }

    public ArrayList<TimetableSubject> getSubjects() {
        ArrayList<TimetableSubject> subjects = new ArrayList<>();

        ArrayList<TimetableSubject>[] days = new ArrayList[]{this.monday, this.tuesday, this.wednesday, this.thursday, this.friday};

        for (int i = 0; i < 3; i += 1) {
            for (ArrayList<TimetableSubject> day : days) {
                subjects.add(day.remove(0));
            }
        }

        return subjects;
    }
}
