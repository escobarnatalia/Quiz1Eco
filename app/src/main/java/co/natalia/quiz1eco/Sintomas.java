package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Sintomas extends AppCompatActivity {

    private CheckBox opcionSin1;
    private CheckBox opcionSin2;
    private CheckBox opcionSin3;
    private CheckBox opcionSin4;
    private CheckBox opcionSin5;
    private CheckBox opcionSin6;
    private Button finalizarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);

        opcionSin1 = findViewById(R.id. opcionSin1);
        opcionSin2 = findViewById(R.id.opcionSin2);
        opcionSin3 = findViewById(R.id.opcionSin3);
        opcionSin4 = findViewById(R.id.opcionSin4);
        opcionSin5 = findViewById(R.id.opcionSin5);
        opcionSin6 = findViewById(R.id.opcionSin6);
        finalizarBtn = findViewById(R.id.finalizarBtn);



    }
}