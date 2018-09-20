package com.example.tone.sortday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Random sort;
    int index;
    Frases[] sortDay = new Frases[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < sortDay.length; i++){
            sortDay[i] = new Frases();
        }

        sortDay[0].setFrase("A vida trará coisas boas se tiveres paciência");
        sortDay[1].setFrase("Demonstre amor e alegria em todas as oportunidades e verás\n" +
                "que a paz nasce dentro de você.");
        sortDay[2].setFrase("Não compense na ira o que lhe falta na razão");
        sortDay[3].setFrase("Defeitos e virtudes são apenas dois lados da mesma moeda");
        sortDay[4].setFrase("A maior de todas as torres começa no solo");
        sortDay[5].setFrase("Não há que ser forte. Há que ser flexível");
        sortDay[6].setFrase("Gente todo dia arruma os cabelos, por que não o coração?");
        sortDay[7].setFrase("Há três coisas que jamais voltam; a flecha lançada, a palavra\n" +
                "dita e a oportunidade perdida");
        sortDay[8].setFrase("A juventude não é uma época da vida, é um estado de espírito");
        sortDay[9].setFrase("Podemos escolher o que semear, mas somos obrigados a\n" +
                "colher o que plantamos");

        sort = new Random();
    }

    public void sortFrase(View view){
        TextView output = (TextView)findViewById(R.id.output);
        index = sort.nextInt(10);
        output.setText(sortDay[index].getFrase());
    }

}
