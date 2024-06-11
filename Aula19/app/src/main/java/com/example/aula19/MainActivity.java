package com.example.aula19;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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
    public void gerar(View view) {

        EditText num = findViewById(R.id.editText_numero);
        int valor = Integer.parseInt(String.valueOf(num.getText()));

        TextView text = findViewById(R.id.txtResultado);
        String tabuada = "";

        if (valor == 0) {
            Toast.makeText(this, "Insira um número válido", Toast.LENGTH_SHORT).show();

        } else {
            for (int i = 0; i <= 10; i++) {
                String temp = tabuada;
                tabuada = temp + "\n"
                        + valor + " X " + i + " = " + (valor * i);

            }
            text.setText(tabuada);

        }
    }
    public void exemplo_2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

}