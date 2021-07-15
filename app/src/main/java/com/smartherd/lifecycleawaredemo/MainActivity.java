package com.smartherd.lifecycleawaredemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

// Life Cycle Owner
public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"OWNER ON_CREATE");
        getLifecycle().addObserver(new MainActivityObserver()); // adding the addObserver to add observer class
    }

    @Override
    protected void onStart() {
        Log.i(TAG,"OWNER ON_START");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"OWNER ON_PAUSE");
        super.onPause();
    }

    @Override
    protected void onPostResume() {
        Log.i(TAG,"OWNER ON_RESUME");
        super.onPostResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"OWNER ON_STOP");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"OWNER ON_DESTROY");
        super.onDestroy();
    }
}




















