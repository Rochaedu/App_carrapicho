package com.example.atividade1_11_10_19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    int answer[]={0,0,0,0,0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 1
        //

        RadioGroup rgroup = findViewById(R.id.rgroup1);
        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[1]=4;
                        break;
                    case R.id.radioButton2:
                        answer[1]=2;
                        break;
                    case R.id.radioButton3:
                        answer[1]=3;
                        break;
                    case R.id.radioButton4:
                        answer[1]=1;
                        break;
                }
            }
        });

        //
        //  PERGUNTA 2
        //

        RadioGroup rgroup2 = findViewById(R.id.rgroup2);
        rgroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[2]=1;
                        break;
                    case R.id.radioButton2:
                        answer[2]=2;
                        break;
                    case R.id.radioButton3:
                        answer[3]=4;
                        break;
                    case R.id.radioButton4:
                        answer[4]=3;
                        break;
                }
            }
        });


        //
        //  PERGUNTA 3
        //

        RadioGroup rgroup3 = findViewById(R.id.rgroup3);
        rgroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[3]=2;
                        break;
                    case R.id.radioButton2:
                        answer[3]=1;
                        break;
                    case R.id.radioButton3:
                        answer[3]=3;
                        break;
                    case R.id.radioButton4:
                        answer[3]=4;
                        break;
                }
            }
        });

        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 4
        //

        RadioGroup rgroup4 = findViewById(R.id.rgroup4);
        rgroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[4]=3;
                        break;
                    case R.id.radioButton2:
                        answer[4]=4;
                        break;
                    case R.id.radioButton3:
                        answer[4]=1;
                        break;
                    case R.id.radioButton4:
                        answer[4]=2;
                        break;
                }
            }
        });

        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 5
        //

        RadioGroup rgroup5 = findViewById(R.id.rgroup5);
        rgroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[5]=1;
                        break;
                    case R.id.radioButton2:
                        answer[5]=3;
                        break;
                    case R.id.radioButton3:
                        answer[5]=2;
                        break;
                    case R.id.radioButton4:
                        answer[5]=4;
                        break;
                }
            }
        });

        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 6
        //

        RadioGroup rgroup6 = findViewById(R.id.rgroup6);
        rgroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[6]=1;
                        break;
                    case R.id.radioButton2:
                        answer[6]=3;
                        break;
                    case R.id.radioButton3:
                        answer[6]=2;
                        break;
                    case R.id.radioButton4:
                        answer[6]=4;
                        break;
                }
            }
        });

        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 7
        //

        RadioGroup rgroup7 = findViewById(R.id.rgroup7);
        rgroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[7]=4;
                        break;
                    case R.id.radioButton2:
                        answer[7]=3;
                        break;
                    case R.id.radioButton3:
                        answer[7]=1;
                        break;
                    case R.id.radioButton4:
                        answer[7]=2;
                        break;
                }
            }
        });

        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 8
        //

        RadioGroup rgroup8 = findViewById(R.id.rgroup8);
        rgroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[8]=3;
                        break;
                    case R.id.radioButton2:
                        answer[8]=2;
                        break;
                    case R.id.radioButton3:
                        answer[8]=1;
                        break;
                    case R.id.radioButton4:
                        answer[8]=4;
                        break;
                }
            }
        });


        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 9
        //

        RadioGroup rgroup9 = findViewById(R.id.rgroup9);
        rgroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[9]=2;
                        break;
                    case R.id.radioButton2:
                        answer[9]=3;
                        break;
                    case R.id.radioButton3:
                        answer[9]=1;
                        break;
                    case R.id.radioButton4:
                        answer[9]=4;
                        break;
                }
            }
        });


        /*
              1 2 3 4 5 6 7 8 9 10
            A 4 1 2 3 1 3 4 3 2 1
            B 2 2 1 4 3 1 3 2 3 4
            C 3 4 3 1 2 2 1 1 1 3
            D 1 3 4 2 4 4 2 4 4 2
         */

        //
        //  PERGUNTA 9
        //

        RadioGroup rgroup10 = findViewById(R.id.rgroup10);
        rgroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        answer[10]=1;
                        break;
                    case R.id.radioButton2:
                        answer[10]=4;
                        break;
                    case R.id.radioButton3:
                        answer[10]=3;
                        break;
                    case R.id.radioButton4:
                        answer[10]=2;
                        break;
                }
            }
        });

        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pontuacao=0;
                for(int i=1; i<=10; i++){
                    pontuacao += answer[i];
                }
                //toast("pontuacao: " + pontuacao);

                Intent intent = new Intent(getApplicationContext(), resultado.class);
                intent.putExtra("pontuacao", pontuacao);
                startActivity(intent);
            }
        });

    }

    // TOAST FUNCTION
    public void toast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


}
