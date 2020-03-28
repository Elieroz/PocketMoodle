package org.bernatpol.pocketmoodle.task;

import java.io.Serializable;

public class Task implements Serializable {
    private int id;
    private String subject;
    private String title;
    private String description;
    private String dateEnd;
    private boolean isComplete;

    public Task(int id, String subject, String title, String description, String dateEnd, boolean isComplete) {
        this.id = id;
        this.subject = subject;
        this.title = title;
        this.description = description;
        this.dateEnd = dateEnd;
        this.isComplete = isComplete;
    }

    public int getId() {
        return this.id;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDateEnd() {
        return this.dateEnd;
    }

    public boolean isComplete() {
        return isComplete;
    }
}
