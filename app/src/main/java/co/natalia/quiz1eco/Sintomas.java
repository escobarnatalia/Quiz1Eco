package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Sintomas extends AppCompatActivity implements View.OnClickListener{

    private CheckBox opcionSin1;
    private CheckBox opcionSin2;
    private CheckBox opcionSin3;
    private CheckBox opcionSin4;
    private CheckBox opcionSin5;
    private CheckBox opcionSin6;
    private CheckBox opcionSin7;
    private Button finalizarBtn;
    private int resulSint;

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
        opcionSin7 = findViewById(R.id.opcionSin7);
        finalizarBtn = findViewById(R.id.finalizarBtn);
        resulSint = 0;

        finalizarBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.finalizarBtn:
                Intent w = new Intent(this, MainActivity.class);
                startActivity(w);
                finish();
            break;

            case R.id.opcionSin6:
                if (opcionSin6.isChecked()==true){
                    opcionSin1.setChecked(false);
                    opcionSin2.setChecked(false);
                    opcionSin3.setChecked(false);
                    opcionSin4.setChecked(false);
                    opcionSin5.setChecked(false);
                    opcionSin7.setChecked(false);
                    resulSint = 0;
                }
                break;

            case R.id.opcionSin1:
                if (opcionSin1.isChecked() == true){
                    resulSint += 4;
                }else{
                    resulSint -= 4;
                }
                break;

            case R.id.opcionSin2:
                if (opcionSin2.isChecked() == true){
                    resulSint += 4;
                }else{
                    resulSint -= 4;
                }
                break;

            case R.id.opcionSin3:
                if (opcionSin3.isChecked() == true){
                    resulSint += 4;
                }else{
                    resulSint -= 4;
                }
                break;

            case R.id.opcionSin4:
                if (opcionSin4.isChecked() == true){
                    resulSint += 4;
                }else{
                    resulSint -= 4;
                }
                break;

            case R.id.opcionSin5:
                if (opcionSin5.isChecked() == true){
                    resulSint += 4;
                }else{
                    resulSint -= 4;
                }
                break;

            case R.id.opcionSin7:
                if (opcionSin7.isChecked() == true){
                    resulSint += 4;
                }else{
                    resulSint -= 4;
                }
                break;







        }

    }
}