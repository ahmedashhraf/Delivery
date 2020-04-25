package androidx.browser.p013a;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import androidx.collection.C0635a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p000a.p001a.p002a.C0000a;
import p000a.p001a.p002a.C0003b.C0004a;

/* renamed from: androidx.browser.a.d */
/* compiled from: CustomTabsService */
public abstract class C0593d extends Service {

    /* renamed from: N */
    public static final String f2372N = "android.support.customtabs.action.CustomTabsService";

    /* renamed from: O */
    public static final String f2373O = "android.support.customtabs.otherurls.URL";

    /* renamed from: P */
    public static final int f2374P = 0;

    /* renamed from: Q */
    public static final int f2375Q = -1;

    /* renamed from: R */
    public static final int f2376R = -2;

    /* renamed from: S */
    public static final int f2377S = -3;

    /* renamed from: T */
    public static final int f2378T = 1;

    /* renamed from: U */
    public static final int f2379U = 2;

    /* renamed from: a */
    final Map<IBinder, DeathRecipient> f2380a = new C0635a();

    /* renamed from: b */
    private C0004a f2381b = new C0594a();

    /* renamed from: androidx.browser.a.d$a */
    /* compiled from: CustomTabsService */
    class C0594a extends C0004a {

        /* renamed from: androidx.browser.a.d$a$a */
        /* compiled from: CustomTabsService */
        class C0595a implements DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C0601g f2383a;

            C0595a(C0601g gVar) {
                this.f2383a = gVar;
            }

            public void binderDied() {
                C0593d.this.mo3051a(this.f2383a);
            }
        }

        C0594a() {
        }

        /* renamed from: a */
        public boolean mo10a(C0000a aVar) {
            C0601g gVar = new C0601g(aVar);
            try {
                C0595a aVar2 = new C0595a(gVar);
                synchronized (C0593d.this.f2380a) {
                    aVar.asBinder().linkToDeath(aVar2, 0);
                    C0593d.this.f2380a.put(aVar.asBinder(), aVar2);
                }
                return C0593d.this.mo3056b(gVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: b */
        public boolean mo15b(long j) {
            return C0593d.this.mo3050a(j);
        }

        /* renamed from: d */
        public Bundle mo17d(String str, Bundle bundle) {
            return C0593d.this.mo3049a(str, bundle);
        }

        /* renamed from: b */
        public boolean mo16b(C0000a aVar, Bundle bundle) {
            return C0593d.this.mo3055a(new C0601g(aVar), bundle);
        }

        /* renamed from: b */
        public int mo14b(C0000a aVar, String str, Bundle bundle) {
            return C0593d.this.mo3048a(new C0601g(aVar), str, bundle);
        }

        /* renamed from: a */
        public boolean mo13a(C0000a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return C0593d.this.mo3054a(new C0601g(aVar), uri, bundle, list);
        }

        /* renamed from: a */
        public boolean mo12a(C0000a aVar, Uri uri) {
            return C0593d.this.mo3053a(new C0601g(aVar), uri);
        }

        /* renamed from: a */
        public boolean mo11a(C0000a aVar, int i, Uri uri, Bundle bundle) {
            return C0593d.this.mo3052a(new C0601g(aVar), i, uri, bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.a.d$b */
    /* compiled from: CustomTabsService */
    public @interface C0596b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.browser.a.d$c */
    /* compiled from: CustomTabsService */
    public @interface C0597c {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo3048a(C0601g gVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bundle mo3049a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3050a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3051a(C0601g gVar) {
        try {
            synchronized (this.f2380a) {
                IBinder b = gVar.mo3071b();
                b.unlinkToDeath((DeathRecipient) this.f2380a.get(b), 0);
                this.f2380a.remove(b);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3052a(C0601g gVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3053a(C0601g gVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3054a(C0601g gVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3055a(C0601g gVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo3056b(C0601g gVar);

    public IBinder onBind(Intent intent) {
        return this.f2381b;
    }
}
