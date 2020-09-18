package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textEncuestas;
    private TextView textInfo;
    private Button registrarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInfo =findViewById(R.id.textInfo);
        textEncuestas = findViewById(R.id.textEncuestas);
        registrarBtn = findViewById(R.id.registrarBtn);


    }
}