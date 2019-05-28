package com.arghya.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Mukku_Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    Button add,sub,mul,div,cls;
    TextView tv;
    Double num1,num2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mukku__calculator);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        cls = findViewById(R.id.cls);
        tv = findViewById(R.id.tv);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try {

            num1 = Double.parseDouble(et1.getText().toString());
            num2 = Double.parseDouble(et2.getText().toString());

            switch(v.getId())
            {

                case R.id.add:
                    res = num1 + num2;
                    tv.setText("The sum is: " + res);
                    break;

                case R.id.sub:
                    res = num1 - num2;
                    tv.setText("The difference is: " + res);
                    break;

                case R.id.mul:
                    res = num1 * num2;
                    tv.setText("The product is: " + res);
                    break;

                case R.id.div:
                    res = num1 / num2;
                    tv.setText("The quotient is: " + res);
                    break;
            }

        }
        catch (Exception e)
        {
            Toast.makeText(this,"Please enter the two numbers to be operated upon",Toast.LENGTH_SHORT).show();
        }
    }

    public void close(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}
