package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityPage1 extends AppCompatActivity {
    Button gotoPage_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        gotoPage_B =(Button)findViewById(R.id.button_gotoPageB);
        gotoPage_B.setOnClickListener(gotoPage_BOnClick);
        Log.d("Activity Flow", "onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Flow", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Flow", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Flow", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Flow", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Flow", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Flow", "onDestroy");
    }
    private View.OnClickListener gotoPage_BOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(ActivityPage1.this, ActivityPage2.class);
            startActivity(it);
        }
    };
}