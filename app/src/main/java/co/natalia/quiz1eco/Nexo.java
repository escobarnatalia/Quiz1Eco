package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Nexo extends AppCompatActivity implements View.OnClickListener{

    private CheckBox opcion1;
    private CheckBox opcion2;
    private CheckBox opcion3;
    private CheckBox opcion4;
    private CheckBox opcion5;
    private Button continuarNexoBtn;
    private int resulNex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo);

        opcion1 = (CheckBox) findViewById(R.id.opcion1);
        opcion2 = (CheckBox) findViewById(R.id.opcion2);
        opcion3 = (CheckBox) findViewById(R.id.opcion3);
        opcion4 = (CheckBox) findViewById(R.id.opcion4);
        opcion5 = (CheckBox) findViewById(R.id.opcion5);
        continuarNexoBtn = findViewById(R.id.continuarNexoBtn);
        resulNex = 0;

        continuarNexoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.continuarNexoBtn:
                Intent z = new Intent(this, Sintomas.class);
                startActivity(z);
                break;

            case R.id.opcion5:
                if (opcion5.isChecked()==true){
                    opcion1.setChecked(false);
                    opcion2.setChecked(false);
                    opcion3.setChecked(false);
                    opcion4.setChecked(false);
                    resulNex = 0;
                }
                break;
            case R.id.opcion1:
                if (opcion1.isChecked() == true){
                    resulNex += 3;
                }else{
                    resulNex -= 3;
                }break;

            case R.id.opcion2:
                if (opcion2.isChecked() == true){
                    resulNex += 3;
                }else{
                    resulNex -= 3;
                }break;

            case R.id.opcion3:
                if (opcion3.isChecked() == true){
                    resulNex += 3;
                }else{
                    resulNex -= 3;
                }break;

            case R.id.opcion4:
                if (opcion4.isChecked() == true){
                    resulNex += 3;
                }else{
                    resulNex -= 3;
                }


        }
    }
}
