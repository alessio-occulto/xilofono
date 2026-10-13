package com.aloc.xilofono;
import android.media.MediaPlayer;


import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.CodeSource;

public class MainActivity extends AppCompatActivity {

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NR_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    private int mCButtonId;
    private int mDButtonId;
    private int mEButtonId;
    private int mFButtonId;
    private int mGButtonId;
    private int mAButtonId;
    private int mBButtonId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mCSoundId = R.raw.note1_c;
        mDSoundId = R.raw.note2_d;
        mESoundId = R.raw.note3_e;
        mFSoundId = R.raw.note4_f;
        mGSoundId = R.raw.note5_g;
        mASoundId = R.raw.note6_a;
        mBSoundId = R.raw.note7_b;

        mCButtonId = findViewById(R.id.c_key).getId();
        mDButtonId = findViewById(R.id.d_key).getId();
        mEButtonId = findViewById(R.id.e_key).getId();
        mFButtonId = findViewById(R.id.f_key).getId();
        mGButtonId = findViewById(R.id.g_key).getId();
        mAButtonId = findViewById(R.id.a_key).getId();
        mBButtonId = findViewById(R.id.b_key).getId();
    }

    public void playKey(View view) {
        int id = view.getId();

        MediaPlayer mediaPlayer;

        if (id == mCButtonId) {
            mediaPlayer = MediaPlayer.create(this, mCSoundId);
            mediaPlayer.start();
        } else if (id == mDButtonId) {
            mediaPlayer = MediaPlayer.create(this, mDSoundId);
            mediaPlayer.start();
        } else if (id == mEButtonId) {
            mediaPlayer = MediaPlayer.create(this, mESoundId);
            mediaPlayer.start();
        } else if (id == mFButtonId) {
            mediaPlayer = MediaPlayer.create(this, mFSoundId);
            mediaPlayer.start();
        } else if (id == mGButtonId) {
            mediaPlayer = MediaPlayer.create(this, mGSoundId);
            mediaPlayer.start();
        } else if (id == mAButtonId) {
            mediaPlayer = MediaPlayer.create(this, mASoundId);
            mediaPlayer.start();
        } else if (id == mBButtonId) {
            mediaPlayer = MediaPlayer.create(this, mBSoundId);
            mediaPlayer.start();
        }
    }
}