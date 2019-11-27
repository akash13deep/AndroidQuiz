package com.example.multiplechiocequestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  button(View v)
    {
        EditText ed = findViewById(R.id.result);
        RadioButton r1 = findViewById(R.id.r13);
        RadioButton r2 = findViewById(R.id.r24);
        RadioButton r3 = findViewById(R.id.r32);
        RadioButton r4 = findViewById(R.id.r44);
        RadioButton r5 = findViewById(R.id.r51);
        RadioButton r6 = findViewById(R.id.r62);
        RadioButton r7 = findViewById(R.id.r73);
        RadioButton r8 = findViewById(R.id.r83);
        RadioButton r9 = findViewById(R.id.r92);
        RadioButton r10 = findViewById(R.id.r102);

        if(r1.isChecked()){
            score = score + 10;
        }
        if(r2.isChecked()){
            score = score + 10;
        }
        if(r3.isChecked()){
            score = score + 10;
        }
        if(r4.isChecked()){
            score = score + 10;
        }
        if(r5.isChecked()){
            score = score + 10;
        }
        if(r6.isChecked()){
            score = score + 10;
        }
        if(r7.isChecked()){
        score = score + 10;
    }
        if(r8.isChecked()){
            score = score + 10;
        }
        if(r9.isChecked()){
            score = score + 10;
        }
        if(r10.isChecked()){
            score = score + 10;
        }

        ed.setText(""+score);

    }
    public  void  reset(View v) {
        EditText ed = findViewById(R.id.result);
        ed.setText("");
        score = 0;

        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radio1);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radio2);
        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radio3);
        RadioGroup radioGroup4 = (RadioGroup)findViewById(R.id.radio4);
        RadioGroup radioGroup5 = (RadioGroup)findViewById(R.id.radio5);
        RadioGroup radioGroup6 = (RadioGroup)findViewById(R.id.radio6);
        RadioGroup radioGroup7 = (RadioGroup)findViewById(R.id.radio7);
        RadioGroup radioGroup8 = (RadioGroup)findViewById(R.id.radio8);
        RadioGroup radioGroup9 = (RadioGroup)findViewById(R.id.radio9);
        RadioGroup radioGroup10 = (RadioGroup)findViewById(R.id.radio10);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();
    }
}
