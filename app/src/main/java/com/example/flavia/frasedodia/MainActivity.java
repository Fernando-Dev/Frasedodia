package com.example.flavia.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaoNovaFrase;
    private TextView textoNovaFrase;

    private String[] frases = {"Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos", "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "A vida é melhor para aqueles que fazem o possível para ter o melhor", "Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum", "Escolha uma ideia. Faça dessa ideia a sua vida. Pense nela, sonhe com ela, viva pensando nela. Deixe cérebro, músculos, nervos, todas as partes do seu corpo serem preenchidas com essa ideia. Esse é o caminho para o sucesso",
            "Para de perseguir o dinheiro e comece a perseguir o sucesso", "Todos os seus sonhos podem se tornar realidade se você tem coragem para persegui-los",
            "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo", "Sempre que você vir uma pessoa de sucesso, você sempre verá as glórias, nunca os sacrifícios que os levaram até ali",
            "Sucesso? Eu não sei o que isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa Para mim, sucesso é paz anterior",
            "Oportunidades não surgem. É você que as cria", "Não tente ser uma pessoa de sucesso. Em vez disso, seja uma pessoa de valor", "Não é o mais forte que sobrevive, nem o mais inteligente. Quem sobrevive é o mais disposto à mudança",
            "A melhor vingança é um sucesso estrondoso", "Eu não falhei. Só descobri 10 mil caminhos que não eram o certo", "Eu não falhei. Só descobri 10 mil caminhos que não eram o certo",
            "Ninguém pode fazer você se sentir inferior sem o seu consentimento", "O grande segredo de uma boa vida é encontrar qual é o seu destino. E realizá-lo", "Se você está atravessando um inferno, continue atravessando"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);
        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);


//        textoNovaFrase.setText(frases[0]);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numeroAleatorio = random.nextInt(frases.length);
                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
