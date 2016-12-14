package androidbead2.beadando22;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Attila on 2016.12.12..
 */

public class MainScreen extends AppCompatActivity {
    private Button ms_logout;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        session = new Session(this);
        if(!session.loggedin()){
            logout();
        }

        ms_logout = (Button)findViewById(R.id.ms_logout);
        ms_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });


    }

    private void logout(){
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(MainScreen.this, Login.class));
    }
}
