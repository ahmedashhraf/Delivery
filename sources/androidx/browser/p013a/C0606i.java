package androidx.browser.p013a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p000a.p001a.p002a.C0000a;
import p000a.p001a.p002a.C0000a.C0001a;
import p000a.p001a.p002a.C0006c;
import p000a.p001a.p002a.C0006c.C0007a;

/* renamed from: androidx.browser.a.i */
/* compiled from: PostMessageServiceConnection */
public abstract class C0606i implements ServiceConnection {

    /* renamed from: a */
    private final Object f2397a = new Object();

    /* renamed from: b */
    private final C0000a f2398b;

    /* renamed from: c */
    private C0006c f2399c;

    public C0606i(C0601g gVar) {
        this.f2398b = C0001a.m5a(gVar.mo3071b());
    }

    /* renamed from: a */
    public void mo3075a() {
    }

    /* renamed from: a */
    public boolean mo3077a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(str, C0604h.class.getName());
        return context.bindService(intent, this, 1);
    }

    /* renamed from: b */
    public void mo3080b() {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2399c = C0007a.m32a(iBinder);
        mo3075a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2399c = null;
        mo3080b();
    }

    /* renamed from: a */
    public void mo3076a(Context context) {
        context.unbindService(this);
    }

    /* renamed from: a */
    public final boolean mo3078a(Bundle bundle) {
        if (this.f2399c == null) {
            return false;
        }
        synchronized (this.f2397a) {
            try {
                this.f2399c.mo22a(this.f2398b, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo3079a(String str, Bundle bundle) {
        if (this.f2399c == null) {
            return false;
        }
        synchronized (this.f2397a) {
            try {
                this.f2399c.mo23a(this.f2398b, str, bundle);
            } catch (RemoteException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
