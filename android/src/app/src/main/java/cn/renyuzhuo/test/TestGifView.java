package cn.renyuzhuo.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

import cn.renyuzhuo.R;
import cn.renyuzhuo.rlib.rlog;
import cn.renyuzhuo.rlib.views.GifView;

import static android.support.v7.appcompat.R.id.time;

public class TestGifView extends AppCompatActivity implements View.OnClickListener {

    Button button;
    GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_gif_view);

        button = (Button) findViewById(R.id.play);

        gifView = (GifView) findViewById(R.id.gif);
        gifView.setGifResource(R.mipmap.gif5);
        gifView.setVisibility(View.VISIBLE);
        gifView.play();

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (gifView.isPlaying()) {
            gifView.pause();
            return;
        }
        if (gifView.isPaused()) {
            gifView.play();
            return;
        }
    }
}
