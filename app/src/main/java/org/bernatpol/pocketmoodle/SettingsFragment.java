package org.bernatpol.pocketmoodle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
        final Preference logOut = findPreference("log_out");
        logOut.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                logOutDialog();
                return true;
            }
        });
    }

    private void logOutDialog() {
        new AlertDialog.Builder(getContext())
                .setTitle("u sure u wanna log out?? >_>")
                .setMessage("u gotta think bout it")
                .setPositiveButton("I'm sure", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Erase the local database.
//                        TaskMasterSQLiteHelper sqLiteHelper = new TaskMasterSQLiteHelper(getContext());
//                        sqLiteHelper.clearData();

                        // Erase the stored user's username and password.
                        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username", "");
                        editor.putString("password", "");
                        editor.apply();

                        getActivity().finish();

                        Intent intent = new Intent(getActivity(), LoginActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Hmm, no...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();
    }
}