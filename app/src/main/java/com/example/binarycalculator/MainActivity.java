package com.example.binarycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAns;
    EditText etSubmit;
    Button btn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAns = findViewById(R.id.tvAns);
        etSubmit = findViewById(R.id.etInput);
        btn = findViewById(R.id.btnSubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = etSubmit.getText().toString();
                int n = Integer.parseInt(str);
                tvAns.setText("The Binary is : " + Integer.toBinaryString(n));
            }
        });
    }
}