package com.example.gesture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int action, keycode;
        action = event.getAction();
        keycode = event.getKeyCode();

        switch (keycode) {
            case KeyEvent.KEYCODE_VOLUME_UP: {
                if (KeyEvent.ACTION_UP == action)
                    openActivity2();
            }
            break;
            return super.dispatchKeyEvent(event);
        }
        return false;
    }
    public void openActivity2(){
        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);
    }

}

