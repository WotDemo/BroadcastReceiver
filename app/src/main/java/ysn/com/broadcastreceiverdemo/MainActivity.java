package ysn.com.broadcastreceiverdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 静态广播
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                sendBroadcast(new Intent(("ysn.com.broadcastreceiverdemo.TestReceiver")));

                // 有序广播
                sendOrderedBroadcast((new Intent(("ysn.com.broadcastreceiverdemo.TestReceiver"))), null);
            }
        });
    }
}