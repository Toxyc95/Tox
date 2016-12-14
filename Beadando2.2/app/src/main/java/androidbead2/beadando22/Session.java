package androidbead2.beadando22;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInstaller;

/**
 * Created by Attila on 2016.12.14..
 */

public class Session {
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Context ctx;

    public Session (Context ctx){
        this.ctx=ctx;
        prefs = ctx.getSharedPreferences("myapp", Context.MODE_PRIVATE);
        editor = prefs.edit();
    }

    public void setLoggedin(boolean loggedin){
        editor.putBoolean("loggedInmode", loggedin);
        editor.commit();
    }

    public boolean loggedin(){
        return prefs.getBoolean("loggedInmode", false);

    }
}
