package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import p053b.p072g.p073b.C2128a;

public class CustomTabActivity extends Activity {
    public static final String CUSTOM_TAB_REDIRECT_ACTION;
    private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;
    public static final String DESTROY_ACTION;
    private BroadcastReceiver closeReceiver;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomTabActivity.class.getSimpleName());
        sb.append(".action_customTabRedirect");
        CUSTOM_TAB_REDIRECT_ACTION = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CustomTabActivity.class.getSimpleName());
        sb2.append(".action_destroy");
        DESTROY_ACTION = sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
            intent2.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
            C2128a.m11089a((Context) this).mo9219a(intent2);
            this.closeReceiver = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            C2128a.m11089a((Context) this).mo9218a(this.closeReceiver, new IntentFilter(DESTROY_ACTION));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(CUSTOM_TAB_REDIRECT_ACTION);
        intent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C2128a.m11089a((Context) this).mo9217a(this.closeReceiver);
        super.onDestroy();
    }
}
