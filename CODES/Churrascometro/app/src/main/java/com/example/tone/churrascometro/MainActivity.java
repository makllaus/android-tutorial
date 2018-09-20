package com.example.tone.churrascometro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    SeekBar sbMen, sbWomen, sbKids;
    TextView tvMen, tvWomen, tvKids, outputSausage, outputMeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view) {

        sbMen = (SeekBar)findViewById(R.id.seekBarMen);
        sbWomen = (SeekBar)findViewById(R.id.seekBarWomen);
        sbKids = (SeekBar)findViewById(R.id.seekBarKids);
        tvMen = (TextView)findViewById(R.id.textViewMen);
        tvWomen = (TextView)findViewById(R.id.textViewWomen);
        tvKids = (TextView)findViewById(R.id.textViewKids);
        outputSausage = (TextView)findViewById(R.id.outputSausage);
        outputMeat = (TextView)findViewById(R.id.outputMeat);

        sbMen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvMen.setText(String.valueOf(progress));
                calculate(sbMen.getProgress(), sbWomen.getProgress(), sbKids.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbWomen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvWomen.setText(String.valueOf(progress));
                calculate(sbMen.getProgress(), sbWomen.getProgress(), sbKids.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbKids.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvKids.setText(String.valueOf(progress));
                calculate(sbMen.getProgress(), sbWomen.getProgress(), sbKids.getProgress());
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
        double carne = 0, ling = 0;

        ling = ling + (homem * 250);
        ling = ling + (mulher * 200);
        ling = ling + (crianca * 100);
        ling = ling / 1000;

        carne = carne + (homem * 500);
        carne = carne + (mulher * 300);
        carne = carne + (crianca * 200);
        carne = carne / 1000;

        outputMeat.setText("Carne: " + carne + "Kg");
        outputSausage.setText("Linguica: " + ling + "Kg");
    }
}
