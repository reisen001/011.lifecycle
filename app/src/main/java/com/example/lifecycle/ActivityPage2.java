package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPage2 extends AppCompatActivity {
    Button gotoPage_A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        gotoPage_A =(Button)findViewById(R.id.button_gotoPageA);
        gotoPage_A.setOnClickListener(gotoPage_AOnClick);
    }
    private View.OnClickListener gotoPage_AOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it = new Intent();
            it.setClass(ActivityPage2.this, ActivityPage1.class);
            startActivity(it);
        }
    };
}
