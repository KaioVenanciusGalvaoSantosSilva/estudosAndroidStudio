package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Caso4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caso4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("ResourceAsColor")
    public void verificar_btn(View view){

        Button verificar = findViewById(R.id.button_verificar);

        EditText color = findViewById(R.id.txt_cor);
        String cor = String.valueOf(color.getText());

        switch (cor) {
            case "vermelho":
                verificar.setBackgroundColor(Color.RED);
                break;
            case "verde":
                verificar.setBackgroundColor(Color.GREEN);
                break;
            case "azul":
                verificar.setBackgroundColor(Color.BLUE);
                break;
            default:
                Toast.makeText(this, "A cor" + cor + " não foi definida", Toast.LENGTH_SHORT).show();
                verificar.setBackgroundColor(Color.BLACK);
                break;
        }
    }

    public void caso3(View view){

        Intent intent = new Intent(this, Caso3.class);
        startActivity(intent);
    }

    public void caso1(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}