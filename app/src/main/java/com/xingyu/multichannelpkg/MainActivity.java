package com.xingyu.multichannelpkg;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView channelName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        channelName = findViewById(R.id.channelName);
        try {
            ApplicationInfo appInfo = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            String temp = appInfo.metaData.getString("QINGFENG_CHANNEL");
            channelName.setText(temp);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
