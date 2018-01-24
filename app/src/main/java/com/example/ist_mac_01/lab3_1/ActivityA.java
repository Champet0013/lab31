package com.example.ist_mac_01.lab3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity; import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class ActivityA extends AppCompatActivity {
    Button btn;
    String msg1 = "Lab3";
    String msg2 = "Activity A : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(),ActivityB.class);
                startActivity(intent);
            }

        });


    }
    @Override
    protected void onStart() { super.onStart();
        Log.d(msg1, msg2+"onStart");
    }
    /** Called when the activity has become visible. */
    @Override
    protected void onResume() { super.onResume();
        Log.d(msg1, msg2+"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg1, msg2+"onPause");
    }
    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg1, msg2+"onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg1, msg2+"onDestroy");
    }
}
