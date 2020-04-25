package androidx.browser.p013a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p000a.p001a.p002a.C0003b;
import p000a.p001a.p002a.C0003b.C0004a;

/* renamed from: androidx.browser.a.e */
/* compiled from: CustomTabsServiceConnection */
public abstract class C0598e implements ServiceConnection {

    /* renamed from: androidx.browser.a.e$a */
    /* compiled from: CustomTabsServiceConnection */
    class C0599a extends C0583b {
        C0599a(C0003b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    /* renamed from: a */
    public abstract void mo3025a(ComponentName componentName, C0583b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo3025a(componentName, new C0599a(C0004a.m20a(iBinder), componentName));
    }
}
