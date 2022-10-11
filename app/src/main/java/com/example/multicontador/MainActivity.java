package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btnReset1,btnReset2,btnReset3,btnReset4,btnResetAll;
    TextView txt1,txt2,txt3,txt4,txtresetall;
    int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;
    int contadorGlobal = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtresetall = findViewById(R.id.txtresetall);
        btnResetAll = findViewById(R.id.btnresetall);

        //Botones 1
        btn1 = findViewById(R.id.btnsumar1);
        btnReset1 = findViewById(R.id.btnreset1);
        txt1 = findViewById(R.id.txt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGlobal++;
                contador1++;
                txt1.setText(""+contador1);
                txtresetall.setText(""+contadorGlobal);
            }
        });

        btnReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1 = 0;
                txt1.setText(""+contador1);
            }
        });
        //Botones 2
        btn2 = findViewById(R.id.btnsumar2);
        btnReset2 = findViewById(R.id.btnreset2);
        txt2=findViewById(R.id.txt2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal++;
                contador2++;
                txt2.setText(""+contador2);
                txtresetall.setText(""+contadorGlobal);
            }
        });

        btnReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2 = 0;
                txt2.setText(""+contador2);
            }
        });

        //Botones 3
        btn3 = findViewById(R.id.btnsumar3);
        btnReset3 = findViewById(R.id.btnreset3);
        txt3=findViewById(R.id.txt3);

        btn2 = findViewById(R.id.btnsumar2);
        btnReset2 = findViewById(R.id.btnreset2);
        txt2=findViewById(R.id.txt2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal++;
                contador3++;
                txt3.setText(""+contador3);
                txtresetall.setText(""+contadorGlobal);
            }
        });

        btnReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3 = 0;
                txt3.setText(""+contador3);
            }
        });

        //Botones 4
        btn4 = findViewById(R.id.btnsumar4);
        btnReset4 = findViewById(R.id.btnreset4);
        txt4=findViewById(R.id.txt4);

        btn2 = findViewById(R.id.btnsumar2);
        btnReset2 = findViewById(R.id.btnreset2);
        txt2=findViewById(R.id.txt2);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal++;
                contador4++;
                txt4.setText(""+contador4);
                txtresetall.setText(""+contadorGlobal);
            }
        });

        btnReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4 = 0;
                txt4.setText(String.valueOf(""+contador4));
            }
        });


        btnResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorGlobal = 0;
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;

                txtresetall.setText(String.valueOf(""+contadorGlobal));
                txt1.setText(String.valueOf(""+contador1));
                txt2.setText(String.valueOf(""+contador2));
                txt3.setText(String.valueOf(""+contador3));
                txt4.setText(String.valueOf(""+contador4));
            }
        });

    }
}