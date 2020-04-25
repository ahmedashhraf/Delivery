package androidx.browser.p013a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.RemoteViews;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import java.util.List;
import p000a.p001a.p002a.C0000a;
import p000a.p001a.p002a.C0003b;

/* renamed from: androidx.browser.a.f */
/* compiled from: CustomTabsSession */
public final class C0600f {

    /* renamed from: e */
    private static final String f2386e = "CustomTabsSession";

    /* renamed from: a */
    private final Object f2387a = new Object();

    /* renamed from: b */
    private final C0003b f2388b;

    /* renamed from: c */
    private final C0000a f2389c;

    /* renamed from: d */
    private final ComponentName f2390d;

    C0600f(C0003b bVar, C0000a aVar, ComponentName componentName) {
        this.f2388b = bVar;
        this.f2389c = aVar;
        this.f2390d = componentName;
    }

    @C0193h0
    @C0224v0
    /* renamed from: a */
    public static C0600f m3205a(@C0193h0 ComponentName componentName) {
        return new C0600f(null, new C0603b(), componentName);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ComponentName mo3068b() {
        return this.f2390d;
    }

    /* renamed from: a */
    public boolean mo3066a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f2388b.mo13a(this.f2389c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3064a(@C0193h0 Bitmap bitmap, @C0193h0 String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0591c.f2352n, bitmap);
        bundle.putString(C0591c.f2353o, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(C0591c.f2349k, bundle);
        try {
            return this.f2388b.mo16b(this.f2389c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3067a(@C0195i0 RemoteViews remoteViews, @C0195i0 int[] iArr, @C0195i0 PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0591c.f2360v, remoteViews);
        bundle.putIntArray(C0591c.f2361w, iArr);
        bundle.putParcelable(C0591c.f2362x, pendingIntent);
        try {
            return this.f2388b.mo16b(this.f2389c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo3062a(int i, @C0193h0 Bitmap bitmap, @C0193h0 String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0591c.f2338A, i);
        bundle.putParcelable(C0591c.f2352n, bitmap);
        bundle.putString(C0591c.f2353o, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(C0591c.f2349k, bundle);
        try {
            return this.f2388b.mo16b(this.f2389c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3065a(Uri uri) {
        try {
            return this.f2388b.mo12a(this.f2389c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public int mo3060a(String str, Bundle bundle) {
        int b;
        synchronized (this.f2387a) {
            try {
                b = this.f2388b.mo14b(this.f2389c, str, bundle);
            } catch (RemoteException unused) {
                return -2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo3063a(int i, @C0193h0 Uri uri, @C0195i0 Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.f2388b.mo11a(this.f2389c, i, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IBinder mo3061a() {
        return this.f2389c.asBinder();
    }
}
