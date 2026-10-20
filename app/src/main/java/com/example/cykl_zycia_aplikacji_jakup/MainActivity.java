package com.example.cykl_zycia_aplikacji_jakup;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button incrementBtn , decrementBtn;

    TextView textViewPunkty;

    private int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        if (savedInstanceState != null) {
            points = savedInstanceState.getInt("POINTS", 0);
        }

        incrementBtn = findViewById(R.id.incrementBtn);
        decrementBtn = findViewById(R.id.decrementBtn);
        textViewPunkty = findViewById(R.id.pointsTextView);
        textViewPunkty.setText(Integer.toString(points));

        incrementBtn.setOnClickListener(view -> {
            points++;
            textViewPunkty.setText(Integer.toString(points));
        });

        decrementBtn.setOnClickListener(view -> {
            points--;
            textViewPunkty.setText(Integer.toString(points));
        });

        Log.i("TIME", "Executed onCreate method");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TIME", "Executed onStart method");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TIME", "Executed onResume method");

    }



//    DOCS
//    https://developer.android.com/guide/components/activities/activity-lifecycle?hl=pl



    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TIME", "Executed onRestart method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TIME", "Executed onPause method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TIME", "Executed onStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TIME", "Executed onDestroy method");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("TIME", "Executed onSaveInstance method");
        outState.putInt("POINTS",  points);

    }
}