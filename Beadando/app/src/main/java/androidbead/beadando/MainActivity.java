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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String r1=null;
    String vs1=null;
    String resultquality=null;
    Integer vd1=0;
    Button apply;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    public void select_quality(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.lowradiobutton:
                if(checked)
                {
                    resultquality="Graphic Quality is set to Low";
                }
                break;
            case R.id.mediumradiobutton:
                if(checked)
                {
                    resultquality="Graphic Quality is set to Medium";
                }
                break;
            case R.id.highradiobutton:
                if(checked)
                {
                    resultquality="Graphic Quality is set to High";
                }
                break;


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinnerres);
        adapter = ArrayAdapter.createFromResource(this,R.array.resolutions,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position)+" selected",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        apply = (Button) findViewById(R.id.apbutton);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("resultq",resultquality);
                startActivity(i);
            }
        });
    }


}
