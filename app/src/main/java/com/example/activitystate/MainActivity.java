package com.example.activitystate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter =5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.edit_user_name);
        Password = findViewById(R.id.edit_password);
        Login=findViewById(R.id.login);
        Info = findViewById(R.id.tvinfo);
        Info.setText("No Of attempts: 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

        Log.d(TAG, "-------");
        Log.d(TAG, "onCreate");
        Toast.makeText(getApplicationContext(),"oncreate",Toast.LENGTH_SHORT).show();
    }
    private void validate (String userName , String userPassword){

        if ((userName.equals("admin"))&&(userPassword.equals("admin"))){
            Intent intent = new Intent(MainActivity.this,Welcome.class);
            startActivity(intent);
        }
        else {

            counter --;
            Info.setText("No Of attempts: "+ String.valueOf( counter));
            if(counter==0)
            {
                Login.setEnabled(false);
            }
        }

    }
    public void register (View view){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
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
