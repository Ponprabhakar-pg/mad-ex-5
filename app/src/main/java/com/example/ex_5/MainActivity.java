package com.example.ex_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private final String Channel_ID="Notification_Exercise";
    private final int Notify_No=001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayNotification(View view){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,Channel_ID);
        builder.setSmallIcon(R.drawable.ic_notify_pg);
        builder.setContentTitle("PG notification");
        builder.setContentText("This is an Lab Exercise");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(Notify_No,builder.build());
    }
}