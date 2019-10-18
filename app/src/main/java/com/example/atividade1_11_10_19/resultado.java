package com.example.atividade1_11_10_19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        int pontuacao = intent.getIntExtra("pontuacao", 0);

        String strMessage="";

        // PONTUACAO 0 - 10
        if(pontuacao >= 0 && pontuacao <= 10)

            strMessage="0 a 10\nSó nas Calorias ninguém vive só de pizza e brigadeiro né? Claro que tudo isso é uma delícia, mas nosso corpo precisa de um pouco de tudo: carboidratos, proteínas, fibras… Consultar um nutricionista pose ser uma ótima maneira de começar";

        // PONTUACAO 11 - 20
        if(pontuacao >= 11 && pontuacao <= 20)

            strMessage="11 a 20\n#partiumalhar Cuidar da alimentação é o primeiro passo para uma vida saudável. Lembre: Você é aquilo que você come. Fazer algum exercício físico também ajuda a manter o peso em equilíbrio. Pode ser jazz, natação, vôlei…";

        // PONTUACAO 21 - 28
        if(pontuacao >= 21 && pontuacao <= 28)

            strMessage="21 a 28\nViva a genética Às vezes, rolam algumas encanações com o corpo, certo? Mas, mesmo assim, você sabe que é bonito(a) do seu jeito e não precisa fazer muita coisa para continuar de bem com a balança. Só fique esperta para também manter a saúde em dia!";

        // PONTUACAO 29 - 40
        if(pontuacao >= 29 && pontuacao <= 40)

            strMessage="29 a 40\nGaroto(a) Fitness Comer frutas nos intervalos das refeições, se exercitar três vezes por semana e não jantar coisa muito pesadas: é assim que você leva a vida. Parabéns pelo foco! Só que não precisa virar a doida da dieta, combinado? Tudo em exagero acaba sendo prejudicial a saúde";

        TextView txtResult = findViewById(R.id.txtResult);
        txtResult.setText("Sua pontuacao: " + String.valueOf(pontuacao) + "\n" + strMessage);
    }

    // TOAST FUNCTION
    public void toast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
