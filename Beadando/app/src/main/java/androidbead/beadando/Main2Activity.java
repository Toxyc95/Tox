package androidbead.beadando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String resultquality = i.getExtras().getString("resultq");
        TextView resulttextview = (TextView)findViewById(R.id.resultquality);
        resulttextview.setText(resultquality);


        Toast.makeText(this,"Másik activity!!!",Toast.LENGTH_LONG).show();
    }
}
