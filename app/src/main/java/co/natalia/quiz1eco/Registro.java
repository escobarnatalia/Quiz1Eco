package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        continuarBtn = findViewById(R.id.continuar2Btn);

        continuarBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.continuar2Btn:
                SharedPreferences preferences = getSharedPreferences("Datos", MODE_PRIVATE);

               // String registroActual = preferences.getString("registro", "");

                String registroSha = preferences.getString("nombreSha", "");

                String nombres = nombreEdit.getText().toString();
                String id = idEdit.getText().toString();

                String registro = registroSha + ":" + nombres + ":" + " ";

                preferences.edit().putString("nombreSha", registro).apply();


                /*String nombreSha = preferences.getString("nombreSha", "no hay nombre aun");
                String idSha = preferences.getString("idSha", "no hay id aun");*/





                if(nombres.trim().isEmpty()){
                    Toast.makeText(this, "Ingresa el nombre", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (id.trim().isEmpty()){
                    Toast.makeText(this, "Ingresa un id", Toast.LENGTH_SHORT).show();
                    return;
                }

               /* if(idSha.contains(id)){
                    Toast.makeText(this, "Usuario ya registrado", Toast.LENGTH_SHORT).show();
                }else{
                    String name = nombres + ":" + nombres;

                    preferences.edit().putString("nombreSha", nombreSha).apply();
                    preferences.edit().putString("idSha", idSha).apply();



                }*/

                 Intent x = new Intent(this, Nexo.class);
                    startActivity(x);


                break;

        }
    }
}