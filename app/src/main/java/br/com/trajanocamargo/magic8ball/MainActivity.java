package br.com.trajanocamargo.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewBolaMagica);
    }

    public void perguntar(View view) {
        //TODO: Trocar as imagens da bola magica
        //Criar objeto para gerar numero randomico
        Random random = new Random();

        //Gerar numero randomico com escopo de 1 a 8
        int numeroImagem = random.nextInt(8) + 1;

        String nomeRecurso = "resposta_" + numeroImagem;

        //TODO: Gerar Drawable
        //Este trecho gera o id de um recurso na pasta res/drawable
        int drawable = getResources().getIdentifier(nomeRecurso, "drawable", getPackageName());

        // Atribuimos o id do recurso ao objeto imageView
        imageView.setImageResource(drawable);
    }

    public void reiniciar(View view) {
        //TODO: Alterar a imgaem para [inicio.png]
        imageView.setImageResource(R.drawable.inicio);
    }
}