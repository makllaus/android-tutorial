package com.example.tone.urnaeletronica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int numTitulo = 789456;
    int psw = 123456;
    EditText eleitor, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void logar(View view){
        eleitor = (EditText)findViewById(R.id.numTiuloEleitor);
        senha = (EditText)findViewById(R.id.password);

        if (eleitor.length() != 0 && senha.length() != 0){
            int titulo = Integer.parseInt(eleitor.getText().toString());
            int pass = Integer.parseInt(senha.getText().toString());
            if (numTitulo != titulo || psw != pass){
                Toast.makeText(this, "Titulo ou Senha inválidos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Sucess!!", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Preencher os campos", Toast.LENGTH_SHORT).show();
        }
    }
}
