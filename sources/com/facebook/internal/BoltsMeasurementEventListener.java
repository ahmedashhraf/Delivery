package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.AppEventsLogger;
import p053b.p072g.p073b.C2128a;

public class BoltsMeasurementEventListener extends BroadcastReceiver {
    private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";
    private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
    private static BoltsMeasurementEventListener _instance;
    private Context applicationContext;

    private BoltsMeasurementEventListener(Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    private void close() {
        C2128a.m11089a(this.applicationContext).mo9217a((BroadcastReceiver) this);
    }

    public static BoltsMeasurementEventListener getInstance(Context context) {
        BoltsMeasurementEventListener boltsMeasurementEventListener = _instance;
        if (boltsMeasurementEventListener != null) {
            return boltsMeasurementEventListener;
        }
        _instance = new BoltsMeasurementEventListener(context);
        _instance.open();
        return _instance;
    }

    private void open() {
        C2128a.m11089a(this.applicationContext).mo9218a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        AppEventsLogger newLogger = AppEventsLogger.newLogger(context);
        StringBuilder sb = new StringBuilder();
        sb.append(BOLTS_MEASUREMENT_EVENT_PREFIX);
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            String str2 = "";
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", str2).replaceAll("[ -]*$", str2), (String) bundleExtra.get(str));
        }
        newLogger.logEvent(sb2, bundle);
    }
}
