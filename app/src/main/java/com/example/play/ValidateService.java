package com.example.play;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ValidateService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

        public int onStartCommand (Intent intent,int flags,int startID) {
            String uname = intent.getExtras().getString("username");
            String pass = intent.getExtras().getString("password");


            if (uname.equals("Vishwa") && pass.equals("remo")) {
                Intent it = new Intent(ValidateService.this, MainActivity.class);
                it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(it);
            }
            return flags;
        }
}