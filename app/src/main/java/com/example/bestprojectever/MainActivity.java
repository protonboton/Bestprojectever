package com.example.bestprojectever;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Water Tracker Button
        LinearLayout waterTrackerButton = findViewById(R.id.waterTrackerButton);
        waterTrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WaterActivity.class);
                startActivity(intent);
            }
        });

        // Workout Tracker Button
        LinearLayout workoutTrackerButton = findViewById(R.id.workoutTrackerButton);
        workoutTrackerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}