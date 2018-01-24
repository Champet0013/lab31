package com.example.ist_mac_01.lab3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        en=(EditText)findViewById(R.id.mapButton);
        button.setOnClickListener(new Button.OnClickListener(){
            public  void onClick(View v){
                try {
                    String address.replace('', '+');
                    Intent geoIntent
                    (android.content.Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + address));
                    startActivity(geoIntent);
                }catch(Exceptione){}
                }
            }
        })
    }
}
