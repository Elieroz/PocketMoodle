package org.bernatpol.pocketmoodle.teacher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.bernatpol.pocketmoodle.PlaceholderServer;
import org.bernatpol.pocketmoodle.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherFragment extends Fragment implements TeacherAdapter.OnTeacherEmailClickListener {
    private TeacherAdapter teacherAdapter;

    public TeacherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(
                R.layout.fragment_teacher,
                container,
                false
        );

        RecyclerView teacherRecycler = root.findViewById(R.id.teacher_recycler);
        teacherRecycler.setHasFixedSize(true);

        RecyclerView.LayoutManager teacherManager =
                new LinearLayoutManager(this.getContext())
        ;

        this.teacherAdapter = new TeacherAdapter(
                PlaceholderServer.getTeachers(),
                this
        );

        teacherRecycler.setLayoutManager(teacherManager);
        teacherRecycler.setAdapter(this.teacherAdapter);

        return root;
    }

    @Override
    public void onTeacherEmailClick(int position) {
        Teacher teacher = this.teacherAdapter.getItem(position);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + teacher.getEmail()));
        startActivity(intent);
    }
}
