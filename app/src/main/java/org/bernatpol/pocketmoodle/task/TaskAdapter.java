package org.bernatpol.pocketmoodle.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.bernatpol.pocketmoodle.R;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    private ArrayList<Task> tasks;
    private OnTaskClickListener onTaskClickListener;

    public TaskAdapter(ArrayList<Task> tasks, OnTaskClickListener onTaskClickListener) {
        this.tasks = tasks;
        this.onTaskClickListener = onTaskClickListener;
    }

//    void setOnTaskClickListener(OnTaskClickListener onTaskClickListener) {
//        this.onTaskClickListener = onTaskClickListener;
//    }

    public Task getItem(int position) {
        return this.tasks.get(position);
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.task, parent, false)
        ;
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = this.tasks.get(position);

        holder.txtSubject.setText(task.getSubject());
        holder.txtTitle.setText(task.getTitle());
        holder.txtDescription.setText(task.getDescription());
        holder.txtDateEnd.setText(task.getDateEnd());
        holder.chkIsComplete.setChecked(task.isComplete());
    }

    @Override
    public int getItemCount() {
        return this.tasks.size();
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView txtSubject;
        TextView txtTitle;
        TextView txtDescription;
        TextView txtDateEnd;
        CheckBox chkIsComplete;

        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);

            this.txtSubject = itemView.findViewById(R.id.txt_subject);
            this.txtTitle = itemView.findViewById(R.id.txt_title);
            this.txtDescription = itemView.findViewById(R.id.txt_description);
            this.txtDateEnd = itemView.findViewById(R.id.txt_date_end);
            this.chkIsComplete = itemView.findViewById(R.id.chk_is_complete);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onTaskClickListener.onTaskClick(getAdapterPosition());
                }
            });
        }
    }

    public interface OnTaskClickListener {
        void onTaskClick(int position);
    }
}
