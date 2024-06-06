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

public class Caso3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caso3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void verificar_btn(View view){

        EditText numero = findViewById(R.id.txt_numero);
        double valor = Double.parseDouble(numero.getText().toString());
        //Estrutura de decisão composta com 1 if-else-if
        if (valor >= 6){
            Toast.makeText(this, "O aluno passou com nota: "+valor, Toast.LENGTH_SHORT).show();
        }else if (valor >= 5.5){
            Toast.makeText(this, "Arredondar nota para 6, nota atual: "+valor, Toast.LENGTH_SHORT).show();
        }else{

            Toast.makeText(this, "O aluno reprovou com nota: "+valor, Toast.LENGTH_SHORT).show();
        }
    }

    public void caso2(View view){

        Intent intent = new Intent(this, Caso2.class);
        startActivity(intent);
    }

    public void caso4(View view){

        Intent intent = new Intent(this, Caso4.class);
        startActivity(intent);
    }



}