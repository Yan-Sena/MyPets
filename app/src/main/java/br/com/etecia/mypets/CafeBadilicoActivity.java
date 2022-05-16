package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CafeBadilicoActivity extends AppCompatActivity {

    CardView idCardView;
    Button btn5h,btn7h,btn8h,btn9h,btnReserve;
    FloatingActionButton idFABCafe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_badilico_layout);

        idCardView = findViewById(R.id.idCardView);
        btn5h = findViewById(R.id.btn5h);
        btn7h = findViewById(R.id.btn7h);
        btn8h = findViewById(R.id.btn8h);
        btn9h = findViewById(R.id.btn9h);
        btnReserve = findViewById(R.id.btnReserve);
        idFABCafe = findViewById(R.id.idFABCafe);


        idCardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"Cliquei no CardView",Toast.LENGTH_SHORT).show();
        }
    });//OnClickCARDVIEW


        btn5h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no Primeiro Botão",Toast.LENGTH_SHORT).show();
            }
        });//OnClickbtn5

        btn7h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no Segundo Botão",Toast.LENGTH_SHORT).show();
            }
        });//OnClickbtn7

        btn8h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no Terceiro Botão",Toast.LENGTH_SHORT).show();
            }
        });//OnClickbtn8

        btn9h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no Quarto Botão",Toast.LENGTH_SHORT).show();
            }
        });//OnClickbtn9

        btnReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no Quinto Botão",Toast.LENGTH_SHORT).show();
            }
        });//OnClickbtnReserve

        idFABCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Cliquei no Floating Button",Toast.LENGTH_SHORT).show();
            }
        });



    }//oncreate
} //publicclass