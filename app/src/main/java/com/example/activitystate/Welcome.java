package com.example.activitystate;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class Welcome extends AppCompatActivity {
    private static final String TAG = "WelcomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(getApplicationContext(),"onstart",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(getApplicationContext(),"onrestart",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(getApplicationContext(),"onpause",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(getApplicationContext(),"onresume",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(getApplicationContext(),"onstop",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(getApplicationContext(),"ondestroy",Toast.LENGTH_SHORT).show();
    }
}
