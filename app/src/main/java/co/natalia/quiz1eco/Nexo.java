package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Nexo extends AppCompatActivity {

    private CheckBox opcion1;
    private CheckBox opcion2;
    private CheckBox opcion3;
    private CheckBox opcion4;
    private CheckBox opcion5;
    private Button continuarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo);

        opcion1 = (CheckBox) findViewById(R.id.opcion1);
        opcion2 = (CheckBox) findViewById(R.id.opcion2);
        opcion3 = (CheckBox) findViewById(R.id.opcion3);
        opcion4 = (CheckBox) findViewById(R.id.opcion4);
        opcion5 = (CheckBox) findViewById(R.id.opcion5);
        continuarBtn = findViewById(R.id.continuarBtn);

    }
}