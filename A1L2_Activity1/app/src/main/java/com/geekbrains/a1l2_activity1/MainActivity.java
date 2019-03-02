package com.geekbrains.a1l2_activity1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popLiveCycle("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        popLiveCycle("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        popLiveCycle("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        popLiveCycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        popLiveCycle("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        popLiveCycle("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        popLiveCycle("onDestroy");
    }

    private void popLiveCycle(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        Log.i(TAG, text);

    }
}
