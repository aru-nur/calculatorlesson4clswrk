package kz.course.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button7, button8;
    TextView tvSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8)
        tvSan = findViewById(R.id.tv_san);
        button7 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan .setText("7");
            }
        });
        button8 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSan .setText("8");
            }
        });
    }

}