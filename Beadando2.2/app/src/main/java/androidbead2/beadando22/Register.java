package androidbead2.beadando22;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Attila on 2016.12.12..
 */

public class Register extends AppCompatActivity implements View.OnClickListener{
    private Button rg_registration, rg_backtologin;
    private EditText rg_username, rg_password;
    private DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DbHelper(this);
        rg_registration=(Button) findViewById(R.id.rg_registration);
        rg_backtologin=(Button) findViewById(R.id.rg_backtologin);
        rg_username=(EditText) findViewById(R.id.rg_username);
        rg_password=(EditText) findViewById(R.id.rg_password);
        rg_registration.setOnClickListener(this);
        rg_backtologin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rg_registration:
                register();
                break;
            case R.id.rg_backtologin:
                startActivity(new Intent(Register.this,Login.class));
                finish();
                break;
            default:
        }
    }

    private void register(){
        String username = rg_username.getText().toString();
        String password = rg_password.getText().toString();
        if(username.isEmpty() && password.isEmpty()){
            displayToast("Wrong Username or Password!");
        }
        else {
            db.addUser(username,password);
            displayToast("Registration Successful!");
            finish();
        }
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
    }


}
