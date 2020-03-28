package org.bernatpol.pocketmoodle;

import android.graphics.Color;


import org.bernatpol.pocketmoodle.subject.Subject;
import org.bernatpol.pocketmoodle.task.Task;
import org.bernatpol.pocketmoodle.teacher.Teacher;
import org.bernatpol.pocketmoodle.ui.timetable.Timetable;
import org.bernatpol.pocketmoodle.ui.timetable.TimetableSubject;

import java.util.ArrayList;
import java.util.HashMap;

public class PlaceholderServer {
    public static ArrayList<Subject> getSubjects() {
        ArrayList<Subject> subjects = new ArrayList<>();

        subjects.add(new Subject("M03", "Programació 2", Color.rgb(50, 255, 100)));
        subjects.add(new Subject("M05", "Entorns de desenvolupament", Color.rgb(255, 0, 255)));
        subjects.add(new Subject("M06", "Accés a dades", Color.rgb(0, 50, 255)));
        subjects.add(new Subject("M07", "Desenvolupament d'interfícies", Color.rgb(255, 100, 255)));
        subjects.add(new Subject("M08", "Programació multimèdia i dispositius", Color.rgb(100, 100, 255)));
        subjects.add(new Subject("M09", "Serveis i processos", Color.rgb(0, 255, 50)));
        subjects.add(new Subject("M10", "Sistemes de gestió empresarial", Color.rgb(0, 0, 255)));

        return subjects;
    }

    public static ArrayList<Task> getTasks() {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task(0, "M10", "Examen UF01", "entra tot", "2020-03-03 11:11:11", false));
        tasks.add(new Task(1, "M08", "Entrega pt12", "no android", "2020-03-04 11:11:11", true));
        tasks.add(new Task(2, "M06", "k kieren" , "boludooos", "2020-04-03 11:11:11", false));
        tasks.add(new Task(3, "M07", "is this an insect", "answer now", "2020-03-03 11:11:11", false));

        return tasks;
    }

    public static ArrayList<String> getTypes() {
        ArrayList<String> types = new ArrayList<>();

        types.add("Exam");
        types.add("Homework");

        return types;
    }

    public static ArrayList<Teacher> getTeachers() {
        ArrayList<Teacher> teachers = new ArrayList<>();

        teachers.add(new Teacher(0, "Charlotte Maguique", "charlotte@escoladeltreball.org"));
        teachers.add(new Teacher(1, "Ramonuru Sensei", "ramonuru@escoladeltreball.org"));
        teachers.add(new Teacher(2, "Laquecanta Lalalá", "singalong@escoladeltreball.org"));

        return teachers;
    }

    public static HashMap<String, Integer> getSubjectTeacherRelationship() {
        HashMap<String, Integer> relationship = new HashMap<>();

        relationship.put("M03", 2);
        relationship.put("M05", 0);
        relationship.put("M06", 2);
        relationship.put("M07", 0);
        relationship.put("M08", 2);
        relationship.put("M09", 1);
        relationship.put("M10", 0);

        return relationship;
    }

    public static int getCountEmails() {
        return 0;
    }

    public static Timetable getTimetable() {
        ArrayList<TimetableSubject> monday = new ArrayList<>();
        monday.add(new TimetableSubject("m06", "16:00", "17:50"));
        monday.add(new TimetableSubject("m06", "17:50", "20:10"));
        monday.add(new TimetableSubject("m06", "20:10", "21:05"));

        ArrayList<TimetableSubject> tuesday = new ArrayList<>();
        tuesday.add(new TimetableSubject("m06", "16:00", "17:50"));
        tuesday.add(new TimetableSubject("m06", "17:50", "20:10"));
        tuesday.add(new TimetableSubject("m06", "20:10", "21:05"));

        ArrayList<TimetableSubject> wednesday = new ArrayList<>();
        wednesday.add(new TimetableSubject("m06", "16:00", "17:50"));
        wednesday.add(new TimetableSubject("m06", "17:50", "20:10"));
        wednesday.add(new TimetableSubject("m06", "20:10", "21:05"));

        ArrayList<TimetableSubject> thursday = new ArrayList<>();
        thursday.add(new TimetableSubject("m06", "16:00", "17:50"));
        thursday.add(new TimetableSubject("m06", "17:50", "20:10"));
        thursday.add(new TimetableSubject("m06", "20:10", "21:05"));

        ArrayList<TimetableSubject> friday = new ArrayList<>();
        friday.add(new TimetableSubject("m06", "16:00", "17:50"));
        friday.add(new TimetableSubject("m06", "17:50", "20:10"));
        friday.add(new TimetableSubject("m06", "20:10", "21:05"));

        return new Timetable(monday, tuesday, wednesday, thursday, friday);
    }
}
