package org.bernatpol.pocketmoodle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (!sharedPreferences.getString("username", "").isEmpty()) {
            this.startMainActivity();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.username = this.findViewById(R.id.username);
        this.password = this.findViewById(R.id.password);

        Button login = this.findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.login) {
            this.checkUserDataAndLogin();
        }
    }

    private void startMainActivity() {
        finish();
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    private void checkUserDataAndLogin() {
        String username = this.username.getText().toString();
        if (username.length() < 10) {
            Toast.makeText(this, "Username nope", Toast.LENGTH_SHORT).show();
            return;
        }

        String password = this.password.getText().toString();
        if (password.length() < 10) {
            Toast.makeText(this, "Password nope", Toast.LENGTH_SHORT).show();
            return;
        }

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.putString("password", password);
//        editor.commit();
        editor.apply();

        this.startMainActivity();
    }
}
