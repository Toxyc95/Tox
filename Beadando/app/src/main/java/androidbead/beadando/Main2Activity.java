package androidbead.beadando;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String resultquality = i.getExtras().getString("resultq");
        String resulotionfin =i.getExtras().getString("spin");
        String vsyn = i.getExtras().getString("vsin");
        TextView resulttextview = (TextView)findViewById(R.id.resultquality);
        TextView resu = (TextView)findViewById(R.id.resus);
        TextView vsintv = (TextView)findViewById(R.id.vsintvs);
        resulttextview.setText(resultquality);
        resu.setText(resulotionfin);
        vsintv.setText(vsyn);


        Toast.makeText(this,"Másik activity!!!",Toast.LENGTH_LONG).show();
    }
}
