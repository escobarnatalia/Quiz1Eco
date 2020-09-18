package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity implements View.OnClickListener{

    private EditText nombreEdit;
    private EditText idEdit;
    private TextView textDatos;
    private TextView textRegistro;
    private Button continuarBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombreEdit = findViewById(R.id.nombreEdit);
        idEdit = findViewById(R.id.idEdit);
        continuarBtn = findViewById(R.id.continuarBtn);

        continuarBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.continuarBtn:
                SharedPreferences preferences = getSharedPreferences("Datos", MODE_PRIVATE);

                String datos = nombreEdit.getText().toString();

                String registro = datos + ":" + " ";

                preferences.edit().putString("registro", registro).apply();

                Intent i = new Intent(this, Nexo.class);
                startActivity(i);
                break;
        }
    }
}