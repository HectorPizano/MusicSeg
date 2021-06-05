package com.example.musicseg;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class Myservice extends Service {

    MediaPlayer mediaPlayer;
    NotificationCompat.Builder builder;
    int n=1;
    String chan="my_channel_01";

    public Myservice() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        MediaPlayer mediaPlayer= MediaPlayer.create(getApplicationContext(), R.raw.xd);
        mediaPlayer.start();
        return  START_NOT_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}