package com.javier.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity_";
    @BindView(R.id.a_main_txt)
    TextView textView;

    @BindString(R.string.app_name)
    String appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);

    }

    @OnClick(R.id.a_main_btn)
    public void doMagic(View view){
        Log.d(TAG, "doMagic: " + view.getId());
        Log.d(TAG, "doMagic: "+ appName);

        textView.setText(appName);
    }
}
