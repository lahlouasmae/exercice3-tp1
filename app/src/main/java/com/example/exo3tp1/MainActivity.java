package com.example.exo3tp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private CheckBox cb1,cb2,cb3,cb4;
    private RadioButton rb1,rb2;
    private Button bt1,bt2;
    private TextView q1,q2;
    private String rep1="pas de reponse",rep2="pas de reponse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cb1.findViewById(R.id.cb1);
        cb2.findViewById(R.id.cb2);
        cb3.findViewById(R.id.cb3);
        cb4.findViewById(R.id.cb4);
        rb1.findViewById(R.id.rb1);
        rb2.findViewById(R.id.rb1);
        bt1.findViewById(R.id.quitter);
        bt2.findViewById(R.id.suivant);
        q1.findViewById(R.id.q1);
        q2.findViewById(R.id.q2);
        bt2.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);

            public void onClick(View view) {
                getIntent().putExtra("q1",q1.getText().toString());
                if(cb1.isChecked()){
                    rep1=cb1.getText().toString();
                }
                else if(cb2.isChecked()){
                    rep1=cb2.getText().toString();
            }
                else if(cb3.isChecked()){
                    rep1=cb3.getText().toString();
                }
                else if (cb4.isChecked()){
                    rep1=cb4.getText().toString();
                }
                getIntent().putExtra("rep1",rep1);
                getIntent().putExtra("q2",q2.getText().toString());

                if (rb1.isChecked()){
                    rep2="OUI";
                }
                else if (rb2.isChecked()){
                    rep2="NON";
                }
                getIntent().putExtra("rep2",rep2);
            }});
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                   MainActivity.this.finish();
                               }});
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });;
    }
}