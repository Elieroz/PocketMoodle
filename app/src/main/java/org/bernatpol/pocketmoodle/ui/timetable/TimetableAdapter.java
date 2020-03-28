package org.bernatpol.pocketmoodle.ui.timetable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import org.bernatpol.pocketmoodle.R;

import java.util.ArrayList;

public class TimetableAdapter extends RecyclerView.Adapter<TimetableAdapter.TimetableViewHolder> {
    private ArrayList<TimetableSubject> subjects;

    public TimetableAdapter(Timetable timetable) {
        this.subjects = timetable.getSubjects();
    }

    @NonNull
    @Override
    public TimetableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.timetable_subject, parent, false)
                ;
        return new TimetableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimetableViewHolder holder, int position) {
        TimetableSubject subject = this.subjects.get(position);

        holder.container.setMinimumHeight(200);

//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(80, 0, 1);
//        holder.container.setLayoutParams(params);
        holder.module.setText(subject.getModule());
//        holder.hourBegin.setText(subject.getHourBegin());
//        holder.hourEnd.setText(subject.getHourEnd());
    }

    @Override
    public int getItemCount() {
        return this.subjects.size();
    }

    class TimetableViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout container;
        TextView module;
//        TextView hourBegin;
//        TextView hourEnd;

        public TimetableViewHolder(@NonNull View itemView) {
            super(itemView);

            this.container = itemView.findViewById(R.id.container);
            this.module = itemView.findViewById(R.id.module);
//            this.hourBegin = itemView.findViewById(R.id.hour_begin);
//            this.hourEnd = itemView.findViewById(R.id.hour_end);
        }
    }
}
