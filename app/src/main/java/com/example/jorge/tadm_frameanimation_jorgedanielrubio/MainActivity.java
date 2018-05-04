package com.example.jorge.tadm_frameanimation_jorgedanielrubio;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private AnimationDrawable animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.animation);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.anim);

        animacion = (AnimationDrawable) imageView.getBackground();
        animacion.setOneShot(true);
    }
    public void onStartBtnClick(View v) {
        imageView.setVisibility(View.VISIBLE);
        if (animacion.isRunning()) {
            animacion.stop();
        }
        animacion.start();
    }

    public void onStopBtnClick(View v) {
        animacion.stop();
    }
}
