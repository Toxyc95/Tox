package androidbead2.beadando22;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInstaller;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private Button lg_login, lg_register;
    private EditText lg_username, lg_password;
    private DbHelper db;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DbHelper(this);
        session = new Session(this);
        lg_login = (Button) findViewById(R.id.lg_login);
        lg_register = (Button) findViewById(R.id.lg_registration);
        lg_username= (EditText)findViewById(R.id.lg_username);
        lg_password= (EditText)findViewById(R.id.lg_password);
        lg_login.setOnClickListener(this);
        lg_register.setOnClickListener(this);

        if(session.loggedin()){
            startActivity(new Intent(Login.this,MainScreen.class));
            finish();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lg_login:
                login();
                break;
            case R.id.lg_registration:
                startActivity(new Intent(Login.this, Register.class));
                break;
            default:
        }

    }

    private void login(){
        String username = lg_username.getText().toString();
        String password = lg_password.getText().toString();

        if(db.getUser(username,password)){
            session.setLoggedin(true);
            startActivity(new Intent(Login.this, MainScreen.class));
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(), "Wrong username or password!", Toast.LENGTH_SHORT).show();
        }
    }
}
