package org.bernatpol.pocketmoodle.teacher;

public class Teacher {
    private int id;
    private String fullName;
    private String email;

    public Teacher(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }
}
