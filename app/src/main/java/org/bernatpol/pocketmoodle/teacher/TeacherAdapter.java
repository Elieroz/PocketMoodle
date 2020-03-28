package org.bernatpol.pocketmoodle.teacher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.bernatpol.pocketmoodle.R;

import java.util.ArrayList;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder> {
    private ArrayList<Teacher> teachers;
    private OnTeacherEmailClickListener onTeacherEmailClickListener;

    public TeacherAdapter(ArrayList<Teacher> teachers, OnTeacherEmailClickListener onTeacherEmailClickListener) {
        this.teachers = teachers;
        this.onTeacherEmailClickListener = onTeacherEmailClickListener;
    }

    public Teacher getItem(int position) {
        return this.teachers.get(position);
    }

    @NonNull
    @Override
    public TeacherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.teacher, parent, false)
        ;
        return new TeacherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherViewHolder holder, int position) {
        Teacher teacher = this.teachers.get(position);

        holder.fullName.setText(teacher.getFullName());
        holder.picture.setImageResource(R.drawable.ic_launcher_background);
    }

    @Override
    public int getItemCount() {
        return this.teachers.size();
    }

    class TeacherViewHolder extends RecyclerView.ViewHolder {
        TextView fullName;
        ImageView picture;
        ImageButton sendEmail;

        public TeacherViewHolder(@NonNull View itemView) {
            super(itemView);

            this.fullName = itemView.findViewById(R.id.txt_name);
            this.picture = itemView.findViewById(R.id.img_teacher);
            this.sendEmail = itemView.findViewById(R.id.btn_email);

            this.sendEmail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onTeacherEmailClickListener.onTeacherEmailClick(getAdapterPosition());
                }
            });
        }
    }

    public interface OnTeacherEmailClickListener {
        void onTeacherEmailClick(int position);
    }
}
