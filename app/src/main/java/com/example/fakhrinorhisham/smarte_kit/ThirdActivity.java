package com.example.fakhrinorhisham.smarte_kit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    RadioGroup rg1,rg2;
    RadioButton rb1,rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        rg1=(RadioGroup) findViewById (R.id.rgroup1);
        rg2=(RadioGroup) findViewById(R.id.radioGroup2);
    }

    public void rbclick1(View v)
    {
        int radiobuttonid = rg1.getCheckedRadioButtonId();
        rb1= (RadioButton) findViewById(radiobuttonid);

        Toast.makeText(getBaseContext(),rb1.getText(),Toast.LENGTH_LONG).show();
    }

    public void rbclick2(View v)
    {
        int radiobuttonid = rg2.getCheckedRadioButtonId();
        rb2= (RadioButton) findViewById(radiobuttonid);

        Toast.makeText(getBaseContext(),rb2.getText(), Toast.LENGTH_LONG).show();
    }

}
