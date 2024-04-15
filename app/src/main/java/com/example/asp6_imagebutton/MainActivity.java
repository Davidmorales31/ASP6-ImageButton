package com.example.asp6_imagebutton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Referenciamos los objetos
    ImageView iv1, iv2;
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
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
    }

    public void Dado(View v) {
        int int1 = 1 + (int)(Math.random() * 6);
        int int2 = 1 + (int)(Math.random() * 6);

        switch (int1) {
            case 1: iv1.setImageResource(R.drawable.dado1); break;
            case 2: iv1.setImageResource(R.drawable.dado2); break;
            case 3: iv1.setImageResource(R.drawable.dado3); break;
            case 4: iv1.setImageResource(R.drawable.dado4); break;
            case 5: iv1.setImageResource(R.drawable.dado5); break;
            case 6: iv1.setImageResource(R.drawable.dado6); break;
        }

        switch (int2) {
            case 1: iv2.setImageResource(R.drawable.dado1); break;
            case 2: iv2.setImageResource(R.drawable.dado2); break;
            case 3: iv2.setImageResource(R.drawable.dado3); break;
            case 4: iv2.setImageResource(R.drawable.dado4); break;
            case 5: iv2.setImageResource(R.drawable.dado5); break;
            case 6: iv2.setImageResource(R.drawable.dado6); break;
        }
    }

}