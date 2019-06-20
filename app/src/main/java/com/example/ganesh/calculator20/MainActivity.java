package com.example.ganesh.calculator20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btndec,btnadd,btnsub,btnmul,btndiv,btnclr,btncalc, btnPercentage;
    TextView edtExpression, Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btnZero);
        btn1 = (Button) findViewById(R.id.btnOne);
        btn2 = (Button) findViewById(R.id.btnTwo);
        btn3 = (Button) findViewById(R.id.btnThree);
        btn4 = (Button) findViewById(R.id.btnFour);
        btn5 = (Button) findViewById(R.id.btnFive);
        btn6 = (Button) findViewById(R.id.btnSix);
        btn7 = (Button) findViewById(R.id.btnSeven);
        btn8 = (Button) findViewById(R.id.btnEight);
        btn9 = (Button) findViewById(R.id.btnNine);

        btndec = (Button) findViewById(R.id.btnDecimal);
        btn00 = (Button) findViewById(R.id.btnDoubleZero);


        /* Operator Buttons */
        btnclr = (Button) findViewById(R.id.btnClear);
        btnPercentage = (Button) findViewById(R.id.btnpercentage);
        btndiv = (Button) findViewById(R.id.btndivide);
        btnmul = (Button) findViewById(R.id.btnmultiple);
        btnsub = (Button) findViewById(R.id.btnMinus);
        btnadd = (Button) findViewById(R.id.btnAdd);
        btncalc = (Button) findViewById(R.id.btnEqual);

        Result=(TextView) findViewById(R.id.tvResult);
        edtExpression=(TextView)findViewById(R.id.tvExpression);
        clearScreen();

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
            }
        });


        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = edtExpression.getText().toString();

                Expression e = new Expression(expression);


                String result = String.valueOf(e.calculate());

                Result.setText(result);
            }
        });







        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("0");
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("00");
            }
        });
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression(".");
            }
        });


        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("%");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("*");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("+");
            }
        });








    }


    void writeExpression(String value){
        String expression = edtExpression.getText().toString();
        expression = expression + value;

        edtExpression.setText(expression);
    }

    void clearScreen(){
        edtExpression.setText("");
        Result.setText("0");
    }

}

