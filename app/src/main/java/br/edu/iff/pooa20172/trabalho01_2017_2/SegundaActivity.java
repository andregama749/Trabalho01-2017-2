package br.edu.iff.pooa20172.trabalho01_2017_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    public TextView salario_bruto, salario_liquido, ir, inss, sindicato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();

        Double salario_l = (Double) intent.getSerializableExtra("salario_liquido");
        Double imp = (Double) intent.getSerializableExtra("ir");
        Double ins = (Double) intent.getSerializableExtra("inss");
        Double sind = (Double) intent.getSerializableExtra("sindicato");
        Float salario_b = (Float) intent.getSerializableExtra("salario_bruto");

        salario_bruto = (TextView) findViewById(R.id.salario_bruto);
        salario_liquido = (TextView) findViewById(R.id.salario_liquido);
        ir = (TextView) findViewById(R.id.ir);
        inss = (TextView) findViewById(R.id.inss);
        sindicato = (TextView) findViewById(R.id.sindicato);

        salario_bruto.setText("Salário Bruto: "+salario_b);
        salario_liquido.setText("Salário Líquido: "+salario_l);
        ir.setText("Imposto de renda: "+imp);
        inss.setText("INSS: "+ins);
        sindicato.setText("Sindicato: "+sind);
    }
}