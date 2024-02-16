package com.kaiogalvao.aula05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtView_Titulo = findViewById(R.id.textView_Titulo);
        Button btn_Mudar = findViewById(R.id.btn_mudar);
        Button btn_Reset = findViewById(R.id.btn_resetar);

        btn_Mudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView_Titulo.setText("Meu Titulo");
                btn_Mudar.setText("Mudei");
            }
        });

        btn_Reset.setOnClickListener(view -> {
            txtView_Titulo.setText("Titulo");
            btn_Mudar.setText("Mudar");
        });
    }
}