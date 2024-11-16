package com.example.swadeshibazar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private static final String TAG = "WelcomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome); // Make sure activity_welcome.xml is correct

        // Initialize buttons
        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonSignup = findViewById(R.id.buttonSignup);

        // Set onClick listeners
        buttonLogin.setOnClickListener(view -> openActivity(LoginActivity.class));
        buttonSignup.setOnClickListener(view -> openActivity(SignupActivity.class));
    }

    // A method to open activities with better error handling
    private void openActivity(Class<?> activityClass) {
        try {
            Intent intent = new Intent(WelcomeActivity.this, activityClass);
            startActivity(intent);
        } catch (Exception e) {
            Log.e(TAG, "Error opening activity: " + activityClass.getSimpleName(), e);
        }
    }
}
