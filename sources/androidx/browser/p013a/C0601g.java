package androidx.browser.p013a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.core.app.C0748i;
import p000a.p001a.p002a.C0000a;
import p000a.p001a.p002a.C0000a.C0001a;

/* renamed from: androidx.browser.a.g */
/* compiled from: CustomTabsSessionToken */
public class C0601g {

    /* renamed from: c */
    private static final String f2391c = "CustomTabsSessionToken";

    /* renamed from: a */
    final C0000a f2392a;

    /* renamed from: b */
    private final C0582a f2393b = new C0602a();

    /* renamed from: androidx.browser.a.g$a */
    /* compiled from: CustomTabsSessionToken */
    class C0602a extends C0582a {
        C0602a() {
        }

        /* renamed from: a */
        public void mo3018a(int i, Bundle bundle) {
            try {
                C0601g.this.f2392a.mo2a(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public void mo3021b(String str, Bundle bundle) {
            try {
                C0601g.this.f2392a.mo5h(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo3020a(String str, Bundle bundle) {
            try {
                C0601g.this.f2392a.mo4g(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo3019a(Bundle bundle) {
            try {
                C0601g.this.f2392a.mo3d(bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public void mo3017a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                C0601g.this.f2392a.mo1a(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.browser.a.g$b */
    /* compiled from: CustomTabsSessionToken */
    static class C0603b extends C0001a {
        C0603b() {
        }

        /* renamed from: a */
        public void mo1a(int i, Uri uri, boolean z, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2a(int i, Bundle bundle) {
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: d */
        public void mo3d(Bundle bundle) {
        }

        /* renamed from: g */
        public void mo4g(String str, Bundle bundle) {
        }

        /* renamed from: h */
        public void mo5h(String str, Bundle bundle) {
        }
    }

    C0601g(C0000a aVar) {
        this.f2392a = aVar;
    }

    /* renamed from: a */
    public static C0601g m3215a(Intent intent) {
        IBinder a = C0748i.m4315a(intent.getExtras(), C0591c.f2342d);
        if (a == null) {
            return null;
        }
        return new C0601g(C0001a.m5a(a));
    }

    @C0193h0
    /* renamed from: c */
    public static C0601g m3216c() {
        return new C0601g(new C0603b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public IBinder mo3071b() {
        return this.f2392a.asBinder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0601g)) {
            return false;
        }
        return ((C0601g) obj).mo3071b().equals(this.f2392a.asBinder());
    }

    public int hashCode() {
        return mo3071b().hashCode();
    }

    /* renamed from: a */
    public C0582a mo3069a() {
        return this.f2393b;
    }

    /* renamed from: a */
    public boolean mo3070a(C0600f fVar) {
        return fVar.mo3061a().equals(this.f2392a);
    }
}
