package androidx.browser.p013a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.C0000a.C0001a;
import p000a.p001a.p002a.C0003b;

/* renamed from: androidx.browser.a.b */
/* compiled from: CustomTabsClient */
public class C0583b {

    /* renamed from: a */
    private final C0003b f2316a;

    /* renamed from: b */
    private final ComponentName f2317b;

    /* renamed from: androidx.browser.a.b$a */
    /* compiled from: CustomTabsClient */
    static class C0584a extends C0598e {

        /* renamed from: a */
        final /* synthetic */ Context f2318a;

        C0584a(Context context) {
            this.f2318a = context;
        }

        /* renamed from: a */
        public final void mo3025a(ComponentName componentName, C0583b bVar) {
            bVar.mo3024a(0);
            this.f2318a.unbindService(this);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: androidx.browser.a.b$b */
    /* compiled from: CustomTabsClient */
    class C0585b extends C0001a {

        /* renamed from: R */
        private Handler f2319R = new Handler(Looper.getMainLooper());

        /* renamed from: S */
        final /* synthetic */ C0582a f2320S;

        /* renamed from: androidx.browser.a.b$b$a */
        /* compiled from: CustomTabsClient */
        class C0586a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f2323a;

            /* renamed from: b */
            final /* synthetic */ Bundle f2324b;

            C0586a(int i, Bundle bundle) {
                this.f2323a = i;
                this.f2324b = bundle;
            }

            public void run() {
                C0585b.this.f2320S.mo3018a(this.f2323a, this.f2324b);
            }
        }

        /* renamed from: androidx.browser.a.b$b$b */
        /* compiled from: CustomTabsClient */
        class C0587b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f2326a;

            /* renamed from: b */
            final /* synthetic */ Bundle f2327b;

            C0587b(String str, Bundle bundle) {
                this.f2326a = str;
                this.f2327b = bundle;
            }

            public void run() {
                C0585b.this.f2320S.mo3020a(this.f2326a, this.f2327b);
            }
        }

        /* renamed from: androidx.browser.a.b$b$c */
        /* compiled from: CustomTabsClient */
        class C0588c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f2328a;

            C0588c(Bundle bundle) {
                this.f2328a = bundle;
            }

            public void run() {
                C0585b.this.f2320S.mo3019a(this.f2328a);
            }
        }

        /* renamed from: androidx.browser.a.b$b$d */
        /* compiled from: CustomTabsClient */
        class C0589d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f2331a;

            /* renamed from: b */
            final /* synthetic */ Bundle f2332b;

            C0589d(String str, Bundle bundle) {
                this.f2331a = str;
                this.f2332b = bundle;
            }

            public void run() {
                C0585b.this.f2320S.mo3021b(this.f2331a, this.f2332b);
            }
        }

        /* renamed from: androidx.browser.a.b$b$e */
        /* compiled from: CustomTabsClient */
        class C0590e implements Runnable {

            /* renamed from: N */
            final /* synthetic */ boolean f2333N;

            /* renamed from: O */
            final /* synthetic */ Bundle f2334O;

            /* renamed from: a */
            final /* synthetic */ int f2336a;

            /* renamed from: b */
            final /* synthetic */ Uri f2337b;

            C0590e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f2336a = i;
                this.f2337b = uri;
                this.f2333N = z;
                this.f2334O = bundle;
            }

            public void run() {
                C0585b.this.f2320S.mo3017a(this.f2336a, this.f2337b, this.f2333N, this.f2334O);
            }
        }

        C0585b(C0582a aVar) {
            this.f2320S = aVar;
        }

        /* renamed from: a */
        public void mo2a(int i, Bundle bundle) {
            if (this.f2320S != null) {
                this.f2319R.post(new C0586a(i, bundle));
            }
        }

        /* renamed from: d */
        public void mo3d(Bundle bundle) throws RemoteException {
            if (this.f2320S != null) {
                this.f2319R.post(new C0588c(bundle));
            }
        }

        /* renamed from: g */
        public void mo4g(String str, Bundle bundle) throws RemoteException {
            if (this.f2320S != null) {
                this.f2319R.post(new C0587b(str, bundle));
            }
        }

        /* renamed from: h */
        public void mo5h(String str, Bundle bundle) throws RemoteException {
            if (this.f2320S != null) {
                this.f2319R.post(new C0589d(str, bundle));
            }
        }

        /* renamed from: a */
        public void mo1a(int i, Uri uri, boolean z, @C0195i0 Bundle bundle) throws RemoteException {
            if (this.f2320S != null) {
                Handler handler = this.f2319R;
                C0590e eVar = new C0590e(i, uri, z, bundle);
                handler.post(eVar);
            }
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    C0583b(C0003b bVar, ComponentName componentName) {
        this.f2316a = bVar;
        this.f2317b = componentName;
    }

    /* renamed from: a */
    public static boolean m3158a(Context context, String str, C0598e eVar) {
        Intent intent = new Intent(C0593d.f2372N);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    /* renamed from: a */
    public static String m3155a(Context context, @C0195i0 List<String> list) {
        return m3156a(context, list, false);
    }

    /* renamed from: a */
    public static String m3156a(Context context, @C0195i0 List<String> list, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z) {
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                arrayList2.add(str);
                if (list != null) {
                    arrayList2.addAll(list);
                }
                arrayList = arrayList2;
            }
        }
        Intent intent2 = new Intent(C0593d.f2372N);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3157a(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m3158a(applicationContext, str, (C0598e) new C0584a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3024a(long j) {
        try {
            return this.f2316a.mo15b(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public C0600f mo3023a(C0582a aVar) {
        C0585b bVar = new C0585b(aVar);
        C0600f fVar = null;
        try {
            if (!this.f2316a.mo10a(bVar)) {
                return null;
            }
            fVar = new C0600f(this.f2316a, bVar, this.f2317b);
            return fVar;
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: a */
    public Bundle mo3022a(String str, Bundle bundle) {
        try {
            return this.f2316a.mo17d(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
