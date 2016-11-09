package com.example.miksten.korkolaskuri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void haeArvot(View view) {

// Haetaan ensin viite tekstikenttään ja luetaan sisältö teksti -muuttujaan
        EditText kentta = (EditText) findViewById(R.id.alkupaaoma);
        String teksti = kentta.getText().toString();

// Testataan onko kentäät tyhjiä. Vain else haara jatkaa laskutoimitusten tekoa
// Tarkistus pitää tehdä kaikille kentille

        if (teksti.equals("")) {
            Toast.makeText(this, "Kentässä ei ole arvoa!", Toast.LENGTH_LONG).show();
        } else {
            EditText kentta2 = (EditText) findViewById(R.id.korko);
            String korko = kentta2.getText().toString();

            EditText kentta3 = (EditText) findViewById(R.id.vuodet);
            String vuodet = kentta3.getText().toString();

            // Tekstikentästä luettu data palautuu aina String-muodossa,
            // se pitää muuttaa luvuksi laskemista varten

            double paaomaLukuna = Double.parseDouble(teksti);
            double korkoLukuna = Double.parseDouble(korko);
            double vuodetLukuna = Double.parseDouble(vuodet);

            // Lopuksi lasketaan loppusumma korolle kaavan mukaan

            double tulos = paaomaLukuna * (korkoLukuna / 100) * vuodetLukuna;

            // Tulos pitää esittää vielä tekstinä
            String tulosTekstinä = Double.toString(tulos);

            // Asettaa saatu tulos lopputulos-teksikentän arvoksi

            TextView lopputulos = (TextView) findViewById(R.id.lopputulos);
            lopputulos.setText("Korko: " + tulosTekstinä);
        } // else
    }


}
