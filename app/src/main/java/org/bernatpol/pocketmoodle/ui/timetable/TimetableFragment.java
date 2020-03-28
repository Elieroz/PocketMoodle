package org.bernatpol.pocketmoodle.ui.timetable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import org.bernatpol.pocketmoodle.PlaceholderServer;
import org.bernatpol.pocketmoodle.R;

public class TimetableFragment extends Fragment {

    private TimetableViewModel timetableViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        timetableViewModel =
//                ViewModelProviders.of(this).get(TimetableViewModel.class);
        View root = inflater.inflate(R.layout.fragment_timetable, container, false);
//        final TextView textView = root.findViewById(R.id.text_timetable);
//        timetableViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        this.createTimetable(root);

        return root;
    }

    private void createTimetable(View root) {
//        TableLayout tableLayout = root.findViewById(R.id.timetable);
//
//        Timetable timetable = PlaceholderServer.getTimetable();
//        for (TimetableSubject subject : timetable.getMonday()) {
//        }
//
//        for (TimetableSubject subject : PlaceholderServer.getSubjects()) {
//            tableLayout.addView(new LayoutInflater().inflate(R.layout.timetable_subject, ));
//        }
    }
}
