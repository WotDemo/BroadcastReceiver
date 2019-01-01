package ysn.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * @Author yangsanning
 * @ClassName TestReceiver1
 * @Description 一句话概括作用
 * @Date 2018/12/28
 * @History 2018/12/28 author: description:
 */
public class TestReceiver1 extends BroadcastReceiver {

    public static final String ACTION = "general";

    public TestReceiver1() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "TestReceiver1收到了", Toast.LENGTH_SHORT).show();
        Log.d("test", "TestReceiver1: " + this.toString());
    }
}