package androidbead2.beadando22;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private Button lg_login, lg_register;
    private EditText lg_username, lg_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lg_login = (Button) findViewById(R.id.lg_login);
        lg_register = (Button) findViewById(R.id.lg_registration);
        lg_username= (EditText)findViewById(R.id.lg_username);
        lg_password= (EditText)findViewById(R.id.lg_password);
        lg_login.setOnClickListener(this);
        lg_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lg_login:

                break;
            case R.id.lg_registration:

                break;
            default:
        }

    }
}
