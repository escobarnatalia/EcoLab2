package co.natalia.ecolab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText usuarioRespuesta;
    private TextView enunciado;
    private Button responderBtn;
    private TextView puntaje;
    private TextView numContador;
    private int contador;

    private Pregunta pregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Referenciar
        usuarioRespuesta =findViewById(R.id.usuarioRespuesta);
        enunciado = findViewById(R.id.enunciado);
        responderBtn = findViewById(R.id.responderBtn);
        puntaje = findViewById(R.id.puntajeTx);
        numContador= findViewById(R.id.numeroContador);

        pregunta = new Pregunta();

        pregunta.preguntas();  
        enunciado.setText(pregunta.getPregunta1() + "+" +pregunta.getPregunta2()));


        responderBtn.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        String respuesta = usuarioRespuesta.getText().toString();
        contador++;
        numContador.setText(""+contador); 

    }
}