package com.example.myapplication12312312321;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    // Method to handle button click to change text
    public void onBtnChangeTextClick(View view) {
        TextView tvChangeText = findViewById(R.id.tvChangeText);
        tvChangeText.setText("Hello00000000");
    }

    // Method to handle button click to change text color
    public void onBtnChangeColorClick(View view) {
        TextView tvChangeText = findViewById(R.id.tvChangeText);
        tvChangeText.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
    }
}
