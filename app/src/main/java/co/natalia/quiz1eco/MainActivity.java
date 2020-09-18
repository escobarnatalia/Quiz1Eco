package co.natalia.quiz1eco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

        registrarBtn.setOnClickListener(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = getSharedPreferences("Datos", MODE_PRIVATE);
        String registro = preferences.getString("nombreSha", "");

        String[] informacion = registro.split(":");

        textInfo.setText("");
        for (int i=0; i<informacion.length; i++){
            textInfo.append(informacion[i] + "\n");
        }

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.registrarBtn:
                Intent i = new Intent(this, Registro.class);
                startActivity(i);
                break;

        }

    }
}