package com.kaiogalvao.variaveis;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

    public void verint(View view){

        EditText txtInt = findViewById(R.id.editTextTextInt);

        //Declarar variavel e atribuir

        int pessoas = 0;
        //atribuir
        pessoas = Integer.parseInt(txtInt.getText().toString());

        Toast.makeText(this, "O inteiro é: "+ pessoas, Toast.LENGTH_SHORT).show();
    }
    public void verdouble(View view){

        EditText txtdouble = findViewById(R.id.editTextTextDouble);

        //Declarar variavel e atribuir

        double valor = 0;

        //atribuir
        valor = Double.parseDouble(txtdouble.getText().toString());

        Toast.makeText(this, "O double é: "+ valor, Toast.LENGTH_SHORT).show();
    }

    public void verstring(View view){

        EditText txtstring = findViewById(R.id.editTextTextString);

        //Declarar variavel e atribuir

        String texto;

        //atribuir
        texto = String.valueOf(txtstring.getText());

        Toast.makeText(this, "O texto digitado é: "+ texto, Toast.LENGTH_SHORT).show();
    }

    public void versolteira(View view){
        
        Boolean validador;

        // Suponha que radioGroup seja o seu RadioGroup
        RadioGroup radioGroup = findViewById(R.id.radioGroupSolteira);

    // Obtém o ID do RadioButton selecionado
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

    // Se nenhum RadioButton estiver selecionado, o valor retornado será -1
        if (selectedRadioButtonId != -1) {
            // Obtém a referência ao RadioButton selecionado
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);

            // Obtém o texto do RadioButton selecionado
            String textoSelecionado = selectedRadioButton.getText().toString();
            
            if (textoSelecionado.equals("Verdadeiro")) {
                validador = true;
                Toast.makeText(this, "O boolean é: "+ textoSelecionado +" == "+ validador, Toast.LENGTH_SHORT).show();
            } else if (textoSelecionado.equals("Falso")) {
                validador = false;

                Toast.makeText(this, "O boolean é: "+ textoSelecionado +" == "+ validador, Toast.LENGTH_SHORT).show();
            }


            // Faça o que precisar com o textoSelecionado aqui...
        } else {
            Toast.makeText(this, "Escolha verdadeiro ou falso", Toast.LENGTH_SHORT).show();
            // Tratar o caso em que nenhum RadioButton está selecionado
        }

    }
    public void vercheckedbox(View view){

        Boolean validadorCheck;

    // Suponha que checkBox seja o seu CheckBox
        CheckBox checkBox = findViewById(R.id.checkBox);

    // Verifica se o checkBox está marcado
        if (checkBox.isChecked()) {
            // Se estiver marcado, faça o que precisar aqui...
            // Por exemplo, exiba uma mensagem
            validadorCheck = true;
            Toast.makeText(getApplicationContext(), "CheckBox está marcado! == "+validadorCheck, Toast.LENGTH_SHORT).show();
        } else {
            // Se não estiver marcado, faça outra coisa aqui...
            // Por exemplo, exiba outra mensagem
            validadorCheck = false;
            Toast.makeText(getApplicationContext(), "CheckBox não está marcado! == "+validadorCheck, Toast.LENGTH_SHORT).show();
        }
    }
}