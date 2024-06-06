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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void verificar_btn(View view){

        EditText numero = findViewById(R.id.txt_cor);
        String valor = String.valueOf(numero.getText());
        //Estrutura de decisão simples apenas com 1 if
        if (!valor.isEmpty()){
        Toast.makeText(this, "O valor digitado é: "+valor, Toast.LENGTH_SHORT).show();
        }
    }
    public void caso2(View view){

        Intent intent = new Intent(this, Caso2.class);
        startActivity(intent);
    }

}