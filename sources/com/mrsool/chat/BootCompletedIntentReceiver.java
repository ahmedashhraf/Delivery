package com.mrsool.chat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.mrsool.utils.C5887x;

public class BootCompletedIntentReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            new C5887x(context).mo23626i();
        }
    }
}
