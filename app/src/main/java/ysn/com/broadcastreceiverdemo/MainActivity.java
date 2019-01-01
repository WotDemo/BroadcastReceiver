package ysn.com.broadcastreceiverdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TestReceiver1 testReceiver1 = null;
    private TestReceiver1 testReceiver2 = null;

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
                sendOrderedBroadcast((new Intent(("general"))), null);
            }
        });

        findViewById(R.id.btnSend).setOnClickListener(this);
        findViewById(R.id.btnReg).setOnClickListener(this);
        findViewById(R.id.btnUnreg).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        switch (id) {
            case R.id.btnSend:
                Intent i = new Intent(TestReceiver1.ACTION);
                sendBroadcast(i);
                break;
            case R.id.btnReg:
                //注册广播
                if (testReceiver1 == null) {
                    testReceiver1 = new TestReceiver1();
                    registerReceiver(testReceiver1, new IntentFilter(TestReceiver1.ACTION));
                }
                if (testReceiver2 == null) {
                    testReceiver2 = new TestReceiver1();
                    registerReceiver(testReceiver2, new IntentFilter(TestReceiver1.ACTION));
                }
                break;
            case R.id.btnUnreg:
                //注销广播
                if (testReceiver1 != null) {
                    unregisterReceiver(testReceiver1);
                    testReceiver1 = null;
                }
                if (testReceiver2 != null) {
                    unregisterReceiver(testReceiver2);
                    testReceiver2 = null;
                }
                break;
            default:
                break;
        }

    }
}