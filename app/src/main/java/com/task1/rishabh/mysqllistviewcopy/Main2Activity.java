package com.task1.rishabh.mysqllistviewcopy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.task1.rishabh.mysqllistviewcopy.m_MySQL.Downloader;

public class Main2Activity extends AppCompatActivity
{

    final static String urlAddress="http://192.168.0.103/php/spacecraft_select_images.php";
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        final ListView lv= (ListView) findViewById(R.id.lv);
        new Downloader(Main2Activity.this,urlAddress,lv).execute();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Downloader(Main2Activity.this,urlAddress,lv).execute();
            }
        });
    }
}

