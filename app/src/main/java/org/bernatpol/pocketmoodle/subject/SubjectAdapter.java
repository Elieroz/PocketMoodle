package org.bernatpol.pocketmoodle.subject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.bernatpol.pocketmoodle.R;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {
    private ArrayList<Subject> subjects;
    private OnSubjectClickListener onSubjectClickListener;

    public SubjectAdapter(ArrayList<Subject> subjects, OnSubjectClickListener onSubjectClickListener) {
        this.subjects = subjects;
        this.onSubjectClickListener = onSubjectClickListener;
    }

    public Subject getItem(int position) {
        return this.subjects.get(position);
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.subject, parent, false)
        ;
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {
        Subject subject = this.subjects.get(position);

        holder.module.setText(subject.getModule());
        holder.title.setText(subject.getTitle());
        holder.cardView.setCardBackgroundColor(subject.getColor());
//        holder.cardView.setBackgroundColor(subject.getColor());
    }

    @Override
    public int getItemCount() {
        return this.subjects.size();
    }

    class SubjectViewHolder extends RecyclerView.ViewHolder {
        TextView module;
        TextView title;
        CardView cardView;

        SubjectViewHolder(@NonNull View itemView) {
            super(itemView);

            this.module = itemView.findViewById(R.id.module);
            this.title = itemView.findViewById(R.id.title);
            this.cardView = itemView.findViewById(R.id.card_view_subject);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onSubjectClickListener.onSubjectClick(getAdapterPosition());
                }
            });
        }
    }

    public interface OnSubjectClickListener {
        void onSubjectClick(int position);
    }
}
