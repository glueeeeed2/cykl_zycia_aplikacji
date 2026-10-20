package com.example.cykl_zycia_aplikacji_jakup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
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

        incrementBtn = findViewById(R.id.incrementBtn);
        decrementBtn = findViewById(R.id.decrementBtn);
        textViewPunkty = findViewById(R.id.pointsTextView);

        incrementBtn.setOnClickListener(view -> {
            points++;
            textViewPunkty.setText(Integer.toString(points));
        });

        decrementBtn.setOnClickListener(view -> {
            points--;
            textViewPunkty.setText(Integer.toString(points));
        });

    }
}