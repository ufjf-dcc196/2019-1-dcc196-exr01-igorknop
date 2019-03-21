package br.ufjf.dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textMensagem = findViewById(R.id.textMensagem);
        textMensagem.setText(R.string.mensagem_secundaria);

        final EditText editNome = findViewById(R.id.editNome);

        Button buttonMensagem = findViewById(R.id.buttonMensagem);
        buttonMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textMensagem.setText(getText(R.string.mensagem_terciaria)+" "+editNome.getText());
            }
        });

    }
}
