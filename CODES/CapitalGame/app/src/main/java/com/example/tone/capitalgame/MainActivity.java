package com.example.tone.capitalgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random sort;
    int index;
    Capitais[] game = new Capitais[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lblEstado = (TextView)findViewById(R.id.lblEstado);
        TextView output = (TextView)findViewById(R.id.output);
        for (int i = 0; i < game.length; i++){
            game[i] = new Capitais();
        }

        game[0].add("Mato Grosso", "Cuiaba");
        game[1].add("Parana", "Curitiba");
        game[2].add("Sao Paulo", "Sao Paulo");
        game[3].add("Acre", "Rio Branco");
        game[4].add("Maranhao", "Sao Luis");
        sort = new Random();
        index = sort.nextInt(5);
        lblEstado.setText(game[index].estado());
        output.setText("");
    }


    public void confirm(View view){
        TextView lblEstado = (TextView)findViewById(R.id.lblEstado);
        TextView output = (TextView)findViewById(R.id.output);
        EditText capital = (EditText)findViewById(R.id.inputCapital);

        String strCapital = capital.getText().toString();
        if (strCapital.length() == 0){
            Toast msg = Toast.makeText(this,"Digite o nome da capital!!", Toast.LENGTH_SHORT);
        } else if (strCapital.equals(game[index].capital().toString())){
            output.setText("ACERTOUU!!");
            index = sort.nextInt(5);
            lblEstado.setText(game[index].estado());
        } else {
            output.setText("ERROU!!");
        }
    }
}
