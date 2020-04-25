package com.instabug.library.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.broadcast.a */
/* compiled from: SDKInvokedBroadcast */
public class C9778a extends BroadcastReceiver {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25946b;

    /* renamed from: a */
    private C9779a f25947a;

    /* renamed from: com.instabug.library.broadcast.a$a */
    /* compiled from: SDKInvokedBroadcast */
    public interface C9779a {
        /* renamed from: a */
        void mo34831a(boolean z);
    }

    public C9778a(C9779a aVar) {
        boolean[] a = m45626a();
        this.f25947a = aVar;
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45626a() {
        boolean[] zArr = f25946b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7155776600391888774L, "com/instabug/library/broadcast/SDKInvokedBroadcast", 4);
        f25946b = a;
        return a;
    }

    public void onReceive(Context context, Intent intent) {
        boolean[] a = m45626a();
        InstabugSDKLogger.m46626v(this, " - onReceive");
        a[1] = true;
        boolean z = intent.getExtras().getBoolean("SDK invoking state");
        a[2] = true;
        this.f25947a.mo34831a(z);
        a[3] = true;
    }
}
