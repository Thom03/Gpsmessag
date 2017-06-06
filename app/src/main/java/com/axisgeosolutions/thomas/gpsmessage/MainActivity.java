package com.axisgeosolutions.thomas.gpsmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.putExtra("address", "0740287216");
        i.putExtra("sms_body", "smslink654321");
        i.setType("vnd.android-dir/mms-sms");
        startActivity(i);
    }
}
