package com.kaiogalvao.aula10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EntrarActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);
    }
    public void loggedActivity(View view){

        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress3);
        EditText editTextSenha = findViewById(R.id.editTextTextPassword);

        String email = String.valueOf(editTextEmail.getText());
        String senha = String.valueOf(editTextSenha.getText());

        if (email.isEmpty() || senha.isEmpty()){

            Toast.makeText(this, "Preencha os campos", Toast.LENGTH_SHORT).show();

        }else{
            //Nessa parte é feita a verificação caso os campos estiverem preenchidos prossegue
            //Nesse local é colocado os códigos para abrir o banco de dados verificar se os dados são os mesmos do banco e permite o acesso.
            Toast.makeText(this, "Você esta logado", Toast.LENGTH_SHORT).show();

             Intent intent = new Intent(this, LogadoActivity.class);
            startActivity(intent);

        }

    }
    public void recoveryActivity(View view){

            Intent intent = new Intent(this, RecuperarSenhaActivity.class);
            startActivity(intent);

    }
    public void voltarMainActivity(View view){

        finish();

    }

}