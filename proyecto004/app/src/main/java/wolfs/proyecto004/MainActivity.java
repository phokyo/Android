package wolfs.proyecto004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private CheckBox check1,check2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);
        check1=(CheckBox)findViewById(R.id.check1);
        check2=(CheckBox)findViewById(R.id.check2);


    }

    public void operar(View view){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        String resu = "";

        if(check1.isChecked()==true){
            int suma = n1+n2;
            resu = "La Suma es: " + suma + " ";
        }

        if(check2.isChecked()==true){
            int resta = n1-n2;
            resu = resu + "La Resta es: " + resta;

        }
        tv1.setText(resu);

    }

}
