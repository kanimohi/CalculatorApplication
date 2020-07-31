package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Model {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual,btnAdd,btnSub,btnMul,btnDiv,btnClear;
    EditText ed1;
    float Res1,Res2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =(Button)findViewById(R.id.button1);
        btn2 =(Button)findViewById(R.id.button2);
        btn3 =(Button)findViewById(R.id.button3);
        btn4 =(Button)findViewById(R.id.button4);
        btn5 =(Button)findViewById(R.id.button5);
        btn6 =(Button)findViewById(R.id.button6);
        btn7 =(Button)findViewById(R.id.button7);
        btn8 =(Button)findViewById(R.id.button8);
        btn9 =(Button)findViewById(R.id.button9);
        btn0 =(Button)findViewById(R.id.button0);
        btnDot =(Button)findViewById(R.id.button10);
        btnEqual =(Button)findViewById(R.id.buttoneql);
        btnAdd =(Button)findViewById(R.id.buttonadd);
        btnSub =(Button)findViewById(R.id.buttonsub);
        btnMul =(Button)findViewById(R.id.buttonmul);
        btnDiv =(Button)findViewById(R.id.buttondiv);
        btnClear =(Button)findViewById(R.id.buttonC);
        ed1 = (EditText)findViewById(R.id.edt1);
        btn1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new android.view.View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText(ed1.getText() + ".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    Add = true;
                    ed1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    Sub = true;
                    ed1.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    Mul = true;
                    ed1.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    Res1 = Float.parseFloat(ed1.getText() + "");
                    Div = true;
                    ed1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Res2 = Float.parseFloat(ed1.getText() + "");
                if (Add == true) {
                    ed1.setText(Res1 + Res2 + "");
                    Add = false;
                }
                if (Sub == true) {
                    ed1.setText(Res1 - Res2 + "");
                    Sub = false;
                }
                if (Mul == true) {
                    ed1.setText(Res1 * Res2 + "");
                    Mul = false;
                }
                if (Div == true) {
                    ed1.setText(Res1 / Res2 + "");
                    Div = false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                ed1.setText("");
            }
        });

    }
    @Override
    public double add(double val1, double val2) {
        return val1 + val2;
    }
    @Override
    public double sub(double val1, double val2) {
        return val1 + val2;
    }
    @Override
    public double mul(double val1, double val2) {
        return val1 + val2;
    }
    @Override
    public double div(double val1, double val2) {
        if(val2 != 0)
            return val1 / val2;
        else
            throw new IllegalArgumentException("cannot divide by zero");
    }
}