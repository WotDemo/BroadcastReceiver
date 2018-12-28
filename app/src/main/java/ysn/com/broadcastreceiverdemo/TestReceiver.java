package ysn.com.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * @Author yangsanning
 * @ClassName TestReceiver
 * @Description 一句话概括作用
 * @Date 2018/12/28
 * @History 2018/12/28 author: description:
 */
public class TestReceiver extends BroadcastReceiver {
    public TestReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // 拦截
        abortBroadcast();
        Toast.makeText(context, "收到了", Toast.LENGTH_SHORT).show();
    }
}
