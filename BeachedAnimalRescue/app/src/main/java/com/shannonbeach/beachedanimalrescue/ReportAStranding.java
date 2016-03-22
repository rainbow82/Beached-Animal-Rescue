package com.shannonbeach.beachedanimalrescue;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReportAStranding extends ActionBarActivity {

    private Button  btn_dos, btn_donts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_a_stranding);

       btn_dos = (Button)findViewById(R.id.btn_dos);
        btn_donts = (Button)findViewById(R.id.btn_donts);

        btn_donts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReportAStranding.this,Donts.class );
                startActivity(intent);
            }
        });

        btn_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(ReportAStranding.this, Dos.class);
                startActivity(intent);
            }
        });

//        //open screen with help facts
//        instructions_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ReportAStranding.this, HowToHelp.class);
//                startActivity(intent);
//
//            }
//        });
    }


}
