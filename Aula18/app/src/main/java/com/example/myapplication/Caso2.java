package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Caso2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caso2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void verificar_btn(View view){

        EditText numero = findViewById(R.id.txt_cor);
        double valor = Double.parseDouble(numero.getText().toString());
        //Estrutura de decisão com 1 if e else
        if (valor >= 6){
            Toast.makeText(this, "O aluno passou com nota: "+valor, Toast.LENGTH_SHORT).show();
        }else{

            Toast.makeText(this, "O aluno reprovou com nota: "+valor, Toast.LENGTH_SHORT).show();
        }
    }


    public void caso1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void caso3(View view){

        Intent intent = new Intent(this, Caso3.class);
        startActivity(intent);
    }
}