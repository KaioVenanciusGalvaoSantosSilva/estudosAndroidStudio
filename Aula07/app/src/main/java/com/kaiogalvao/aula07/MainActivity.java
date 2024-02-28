package com.kaiogalvao.aula07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_enviar = findViewById(R.id.btn_enviar);
        EditText txt_nome = findViewById(R.id.editTextText_nome);
        EditText txt_sobrenome = findViewById(R.id.editTextText_sobrenome);
        EditText txt_telefone = findViewById(R.id.editTextPhone_telefone);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              String nome = String.valueOf(txt_nome.getText());
              String sobrenome = String.valueOf(txt_sobrenome.getText());
              String telefone = String.valueOf(txt_telefone.getText());

                Toast.makeText(MainActivity.this, "Os dados coletados são:\n Nome completo: "+ nome +
                        " "+ sobrenome +"." + "\n Telefone: "+telefone+".", Toast.LENGTH_SHORT).show();

            }
        });
    }
}