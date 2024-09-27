package com.example.exo3tp1;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView q1,rep1,q2,rep2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        q1=findViewById(R.id.qt1);
        rep1=findViewById(R.id.rep1);
        q2=findViewById(R.id.qt2);
        rep2=findViewById(R.id.rep2);
        q1.setText(this.getIntent().getStringExtra("q1"));
        rep1.setText(this.getIntent().getStringExtra("rep1"));
        q2.setText(this.getIntent().getStringExtra("q2"));
        rep2.setText(this.getIntent().getStringExtra("rep2"));
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}