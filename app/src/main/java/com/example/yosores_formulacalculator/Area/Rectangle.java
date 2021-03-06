package com.example.yosores_formulacalculator.Area;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yosores_formulacalculator.R;

public class Rectangle extends AppCompatActivity implements View.OnClickListener {

    EditText txt_length, txt_width;
    double var1, var2 ,ans;
    TextView txt_answer;
    Button btn_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_rectangle);
        btn_calc = findViewById(R.id.calculate);
        txt_length = findViewById(R.id.input2);
        txt_width = findViewById(R.id.input3);
        txt_answer = findViewById(R.id.answer);
        btn_calc.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txt_length.getText().toString());
        var2 = Double.parseDouble(txt_width.getText().toString());
        ans = var1 * var2;
        txt_answer.setText("Answer: " + ans);
    }

}
