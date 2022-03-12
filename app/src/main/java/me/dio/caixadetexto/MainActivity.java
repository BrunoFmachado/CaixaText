package me.dio.caixadetexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText CampoNome;
    private TextInputEditText CampoEmail;
    private TextView TextoResultado;

    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;

    private RadioButton sexoMasculino;
    private RadioButton sexoFeminino;

    private RadioGroup RadioGroupSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText CampoNome = findViewById(R.id.TextNome);
        TextInputEditText CampoEmail = findViewById(R.id.TextEmail);
        TextView TextoResultado = findViewById(R.id.TextResultado);

        checkVerde      = findViewById(R.id.checVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);


        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        sexoFeminino    = findViewById(R.id.radioButtonMsculino);

        RadioGroupSexo  = findViewById(R.id.RadioGroupSexo);
    }


    public void RadioButton(){
        RadioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                if (id == R.id.radioButtonMsculino) {
                    TextoResultado.setText("Masculino");
                } else if (id == R.id.radioButtonFeminino) ;
                TextoResultado.setText("Feminino");


            }
        }
        );


/*       if (  sexoFeminino.isChecked()){
        TextoResultado.setText("Masculino");
       }else if(sexoMasculino.isChecked()){
           TextoResultado.setText("Feminino");
/*
       }

    }


    public void enviar (View view){

        RadioButton();

        //checkbox();

        /*
        String nome     = CampoNome.getText().toString();
        String email    = CampoEmail.getText().toString();


        TextoResultado.setText("Nome: +" + "email: " + email);

         */
        }

        public void checkbox(){

            String texto = "";

            //String CorSelecionada = checkVerde.getText().tostring();
            //texto = CorSelecionada;

            if (checkVerde.isChecked()) {
                texto = "Verde Selecionado- ";
            }
            if (checkBranco.isChecked()) {
                texto = texto + "Branco Selecionado- ";
            }
            if (checkVermelho.isChecked()) {
                texto = texto + "Vermelho Selecionado- ";
            }


            TextoResultado.setText(texto);
        }


        public void Limpar(View View){

            CampoNome.setText("");
            CampoEmail.setText("");
        }
    }

