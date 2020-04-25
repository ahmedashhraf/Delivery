package com.mrsool.p423v;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/* renamed from: com.mrsool.v.a */
/* compiled from: DownloadUtils */
public class C11716a {

    /* renamed from: a */
    private DownloadManager f33905a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f33906b = null;

    /* renamed from: c */
    private BroadcastReceiver f33907c = new C11717a();

    /* renamed from: com.mrsool.v.a$a */
    /* compiled from: DownloadUtils */
    class C11717a extends BroadcastReceiver {
        C11717a() {
        }

        public void onReceive(Context context, Intent intent) {
            long longExtra = intent.getLongExtra("extra_download_id", -1);
            Context a = C11716a.this.f33906b;
            StringBuilder sb = new StringBuilder();
            sb.append("Image Download Complete : ");
            sb.append(longExtra);
            Toast.makeText(a, sb.toString(), 1).show();
        }
    }
}
