package br.edu.iff.pooa20172.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    public Button cancelar,calcular;
    public EditText nome,valor_hora,horas;
    public TextView tnome,tvalor,thoras;
    Double salario_liquido,ir,inss,sindicato;
    Float salario_bruto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cancelar = (Button)  findViewById(R.id.cancelar);
        calcular = (Button)  findViewById(R.id.calcular);

        nome = (EditText) findViewById(R.id.editText1);
        valor_hora = (EditText) findViewById(R.id.editText2);
        horas = (EditText) findViewById(R.id.editText3);

        tnome = (TextView) findViewById(R.id.textView1);
        tvalor = (TextView) findViewById(R.id.textView2);
        thoras = (TextView) findViewById(R.id.textView3);
    }

    public void Cancelar(View view){
        nome.setText("");
        valor_hora.setText("");
        horas.setText("");
    }

    public void Calcular(View view){
        Float valor = Float.parseFloat(valor_hora.getText().toString());
        int hora = Integer.parseInt(horas.getText().toString());

        ir = (valor*hora)*0.11;
        inss = (valor*hora)*0.08;
        sindicato = (valor*hora)*0.05;
        salario_liquido = (valor*hora) - ((valor*hora)*0.11) - ((valor*hora)*0.08) - ((valor*hora)*0.05);
        salario_bruto = (valor*hora);

        Intent intent = new Intent(PrincipalActivity.this, SegundaActivity.class);
        intent.putExtra("salario_bruto", salario_bruto);
        intent.putExtra("salario_liquido", salario_liquido);
        intent.putExtra("ir", ir);
        intent.putExtra("inss", inss);
        intent.putExtra("sindicato", sindicato);
        startActivity(intent);
    }
}
