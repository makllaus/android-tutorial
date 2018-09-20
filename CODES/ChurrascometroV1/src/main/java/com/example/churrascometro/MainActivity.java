package com.example.churrascometro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar skmen, skwm, skch;
    TextView tvmen, saida, saidaMeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular() {
        skmen = (SeekBar) findViewById(R.id.seekBarHomem);
        skwm = (SeekBar) findViewById(R.id.seekBarMulher);
        skch = (SeekBar) findViewById(R.id.seekBarCrianca);
        tvmen = (TextView) findViewById(R.id.textView);
        saida = (TextView) findViewById(R.id.ResultLinguica);
        saidaMeat = (TextView) findViewById(R.id.ResultCarne);

            skmen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    tvmen.setText(String.valueOf(progress));
                    calculate(progress, skwm.getProgress(), skch.getProgress());
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
    }


        public void calculate(int homem,int mulher,int crianca){
            double carne, ling;

            ling = homem * 250;
            ling = mulher * 200;
            ling = crianca * 100;
            ling = ling / 1000;

            carne = homem * 500;
            carne = mulher * 300;
            carne = crianca * 200;
            carne = carne / 1000;

            saidaMeat.setText("Carne: " + carne + "Kg");
            saida.setText("Linguica: " + ling + "Kg");
        }
}

