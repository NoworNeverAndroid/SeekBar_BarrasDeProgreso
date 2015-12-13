package com.example.nowor_000.seekbartutorial;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String INDICES = "indices";

    SeekBar seekBarRojo, seekBarverde, seekBarazul;

    TextView tvColor;
    TextView tvTexto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicialiarVistas();
    }


    public void inicialiarVistas(){

        seekBarRojo = (SeekBar)findViewById(R.id.SeekRojo);
        seekBarverde = (SeekBar)findViewById(R.id.SeekVerde);
        seekBarazul = (SeekBar)findViewById(R.id.SeekAzul);
        tvColor = (TextView)findViewById(R.id.color);
        tvTexto = (TextView)findViewById(R.id.texto);

        seekBarRojo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


            //Notification that the progress level has changed.
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                modificarColor();
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBarverde.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                modificarColor();
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        seekBarazul.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                modificarColor();
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

    private void modificarColor() {
        int IndiceRojo = seekBarRojo.getProgress();
        int IndiceAzul = seekBarazul.getProgress();
        int IndiceVerde = seekBarverde.getProgress();


        Log.v(INDICES, "Rojo=" + IndiceRojo + ", Verde=" + IndiceVerde + ", Azul=" + IndiceAzul);

        tvTexto.setText("Rojo=" + IndiceRojo + ", Verde=" + IndiceVerde + ", Azul=" + IndiceAzul);

        tvColor.setBackgroundColor(Color.rgb(IndiceRojo, IndiceVerde, IndiceAzul));
    }
}
