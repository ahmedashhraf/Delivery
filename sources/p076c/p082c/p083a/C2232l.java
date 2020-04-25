package p076c.p082c.p083a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.C1376c;
import com.bumptech.glide.load.resource.bitmap.C2965f;
import com.bumptech.glide.load.resource.bitmap.C2970h;
import com.bumptech.glide.load.resource.bitmap.C2972j;
import com.bumptech.glide.load.resource.bitmap.C2973k;
import com.bumptech.glide.load.resource.bitmap.C2977n;
import com.bumptech.glide.load.resource.bitmap.C2978o;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2303d;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2350a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i;
import p076c.p082c.p083a.p088u.p090i.p094q.C2387b;
import p076c.p082c.p083a.p088u.p090i.p094q.C2389d.C2390a;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2395d;
import p076c.p082c.p083a.p088u.p095j.C2400g;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.p096s.C2416a.C2417a;
import p076c.p082c.p083a.p088u.p095j.p096s.C2419c.C2420a;
import p076c.p082c.p083a.p088u.p095j.p096s.C2421d.C2422a;
import p076c.p082c.p083a.p088u.p095j.p096s.C2423e.C2424a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2426b.C2427a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2429d.C2430a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2431e.C2432a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2434g.C2435a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2436h.C2437a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2438i.C2439a;
import p076c.p082c.p083a.p088u.p095j.p097t.C2440j.C2441a;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p088u.p098k.p101h.C2454d;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;
import p076c.p082c.p083a.p088u.p098k.p102i.C2460c;
import p076c.p082c.p083a.p088u.p098k.p103j.C2477a;
import p076c.p082c.p083a.p088u.p098k.p103j.C2484f;
import p076c.p082c.p083a.p088u.p098k.p103j.C2485g;
import p076c.p082c.p083a.p088u.p098k.p104k.C2488c;
import p076c.p082c.p083a.p088u.p098k.p104k.C2490e;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p088u.p098k.p104k.C2492g;
import p076c.p082c.p083a.p105v.C2508k;
import p076c.p082c.p083a.p106w.C2514a;
import p076c.p082c.p083a.p106w.C2515b;
import p076c.p082c.p083a.p107x.C2517b;
import p076c.p082c.p083a.p107x.C2518c;
import p076c.p082c.p083a.p108y.C2522a;
import p076c.p082c.p083a.p108y.C2525c;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2554g;
import p076c.p082c.p083a.p108y.p110j.C2561m;
import p076c.p082c.p083a.p108y.p110j.C2562n;

/* renamed from: c.c.a.l */
/* compiled from: Glide */
public class C2232l {

    /* renamed from: o */
    private static final String f8829o = "Glide";

    /* renamed from: p */
    private static volatile C2232l f8830p;

    /* renamed from: a */
    private final C2393c f8831a;

    /* renamed from: b */
    private final C2303d f8832b;

    /* renamed from: c */
    private final C2330c f8833c;

    /* renamed from: d */
    private final C2367i f8834d;

    /* renamed from: e */
    private final C2270a f8835e;

    /* renamed from: f */
    private final C2554g f8836f = new C2554g();

    /* renamed from: g */
    private final C2492g f8837g = new C2492g();

    /* renamed from: h */
    private final C2518c f8838h;

    /* renamed from: i */
    private final C2965f f8839i;

    /* renamed from: j */
    private final C2484f f8840j;

    /* renamed from: k */
    private final C2972j f8841k;

    /* renamed from: l */
    private final C2484f f8842l;

    /* renamed from: m */
    private final Handler f8843m;

    /* renamed from: n */
    private final C2387b f8844n;

    /* renamed from: c.c.a.l$a */
    /* compiled from: Glide */
    private static class C2233a extends C2562n<View, Object> {
        public C2233a(View view) {
            super(view);
        }

        /* renamed from: a */
        public void mo9486a(Drawable drawable) {
        }

        /* renamed from: a */
        public void mo9487a(Exception exc, Drawable drawable) {
        }

        /* renamed from: a */
        public void mo9404a(Object obj, C2535c<? super Object> cVar) {
        }

        /* renamed from: b */
        public void mo9488b(Drawable drawable) {
        }
    }

    C2232l(C2303d dVar, C2367i iVar, C2330c cVar, Context context, C2270a aVar) {
        Class<C2477a> cls = C2477a.class;
        Class<C2400g> cls2 = C2400g.class;
        this.f8832b = dVar;
        this.f8833c = cVar;
        this.f8834d = iVar;
        this.f8835e = aVar;
        this.f8831a = new C2393c(context);
        this.f8843m = new Handler(Looper.getMainLooper());
        this.f8844n = new C2387b(iVar, cVar, aVar);
        this.f8838h = new C2518c();
        C2978o oVar = new C2978o(cVar, aVar);
        this.f8838h.mo9983a(InputStream.class, Bitmap.class, oVar);
        C2970h hVar = new C2970h(cVar, aVar);
        this.f8838h.mo9983a(ParcelFileDescriptor.class, Bitmap.class, hVar);
        C2977n nVar = new C2977n(oVar, hVar);
        this.f8838h.mo9983a(cls2, Bitmap.class, nVar);
        C2460c cVar2 = new C2460c(context, cVar);
        this.f8838h.mo9983a(InputStream.class, C2458b.class, cVar2);
        this.f8838h.mo9983a(cls2, cls, new C2485g(nVar, cVar2, cVar));
        this.f8838h.mo9983a(InputStream.class, File.class, new C2454d());
        mo9473a(File.class, ParcelFileDescriptor.class, (C2410m<T, Y>) new C2417a<T,Y>());
        mo9473a(File.class, InputStream.class, (C2410m<T, Y>) new C2432a<T,Y>());
        mo9473a(Integer.TYPE, ParcelFileDescriptor.class, (C2410m<T, Y>) new C2420a<T,Y>());
        mo9473a(Integer.TYPE, InputStream.class, (C2410m<T, Y>) new C2435a<T,Y>());
        mo9473a(Integer.class, ParcelFileDescriptor.class, (C2410m<T, Y>) new C2420a<T,Y>());
        mo9473a(Integer.class, InputStream.class, (C2410m<T, Y>) new C2435a<T,Y>());
        mo9473a(String.class, ParcelFileDescriptor.class, (C2410m<T, Y>) new C2422a<T,Y>());
        mo9473a(String.class, InputStream.class, (C2410m<T, Y>) new C2437a<T,Y>());
        mo9473a(Uri.class, ParcelFileDescriptor.class, (C2410m<T, Y>) new C2424a<T,Y>());
        mo9473a(Uri.class, InputStream.class, (C2410m<T, Y>) new C2439a<T,Y>());
        mo9473a(URL.class, InputStream.class, (C2410m<T, Y>) new C2441a<T,Y>());
        mo9473a(C2395d.class, InputStream.class, (C2410m<T, Y>) new C2427a<T,Y>());
        mo9473a(byte[].class, InputStream.class, (C2410m<T, Y>) new C2430a<T,Y>());
        this.f8837g.mo9929a(Bitmap.class, C2973k.class, new C2490e(context.getResources(), cVar));
        this.f8837g.mo9929a(cls, C2449b.class, new C2488c(new C2490e(context.getResources(), cVar)));
        this.f8839i = new C2965f(cVar);
        this.f8840j = new C2484f(cVar, (C2276g<Bitmap>) this.f8839i);
        this.f8841k = new C2972j(cVar);
        this.f8842l = new C2484f(cVar, (C2276g<Bitmap>) this.f8841k);
    }

    /* renamed from: a */
    public static File m11641a(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        boolean isLoggable = Log.isLoggable(f8829o, 6);
        return null;
    }

    /* renamed from: b */
    public static File m11648b(Context context) {
        return m11641a(context, C2350a.f9269b);
    }

    /* renamed from: k */
    private C2393c m11650k() {
        return this.f8831a;
    }

    @Deprecated
    /* renamed from: l */
    public static boolean m11651l() {
        return f8830p != null;
    }

    /* renamed from: m */
    static void m11652m() {
        f8830p = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C2965f mo9477c() {
        return this.f8839i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C2972j mo9479d() {
        return this.f8841k;
    }

    /* renamed from: e */
    public C2330c mo9480e() {
        return this.f8833c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C2270a mo9481f() {
        return this.f8835e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C2484f mo9482g() {
        return this.f8840j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C2484f mo9483h() {
        return this.f8842l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C2303d mo9484i() {
        return this.f8832b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Handler mo9485j() {
        return this.f8843m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <Z, R> C2491f<Z, R> mo9475b(Class<Z> cls, Class<R> cls2) {
        return this.f8837g.mo9928a(cls, cls2);
    }

    @Deprecated
    /* renamed from: c */
    public <T, Y> void mo9478c(Class<T> cls, Class<Y> cls2) {
        C2410m b = this.f8831a.mo9816b(cls, cls2);
        if (b != null) {
            b.mo9848a();
        }
    }

    /* renamed from: b */
    public void mo9476b() {
        C2216i.m11347b();
        this.f8834d.mo9776b();
        this.f8833c.mo9736b();
    }

    /* renamed from: c */
    public static C2245q m11649c(Context context) {
        return C2508k.m12460a().mo9951a(context);
    }

    /* renamed from: a */
    public static C2232l m11632a(Context context) {
        if (f8830p == null) {
            synchronized (C2232l.class) {
                if (f8830p == null) {
                    Context applicationContext = context.getApplicationContext();
                    List<C2514a> a = new C2515b(applicationContext).mo9973a();
                    C2234m mVar = new C2234m(applicationContext);
                    for (C2514a a2 : a) {
                        a2.mo9972a(applicationContext, mVar);
                    }
                    f8830p = mVar.mo9489a();
                    for (C2514a a3 : a) {
                        a3.mo9971a(applicationContext, f8830p);
                    }
                }
            }
        }
        return f8830p;
    }

    /* renamed from: b */
    public static <T> C2409l<T, InputStream> m11646b(Class<T> cls, Context context) {
        return m11638a(cls, InputStream.class, context);
    }

    /* renamed from: b */
    public static <T> C2409l<T, InputStream> m11647b(T t, Context context) {
        return m11640a(t, InputStream.class, context);
    }

    @Deprecated
    /* renamed from: a */
    public static void m11643a(C2234m mVar) {
        if (!m11651l()) {
            f8830p = mVar.mo9489a();
            return;
        }
        throw new IllegalArgumentException("Glide is already setup, check with isSetup() first");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T, Z> C2517b<T, Z> mo9468a(Class<T> cls, Class<Z> cls2) {
        return this.f8838h.mo9982a(cls, cls2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <R> C2561m<R> mo9469a(ImageView imageView, Class<R> cls) {
        return this.f8836f.mo10027a(imageView, cls);
    }

    /* renamed from: a */
    public void mo9474a(C2390a... aVarArr) {
        this.f8844n.mo9796a(aVarArr);
    }

    /* renamed from: a */
    public void mo9471a(int i) {
        C2216i.m11347b();
        this.f8834d.mo9771a(i);
        this.f8833c.mo9733a(i);
    }

    /* renamed from: a */
    public void mo9470a() {
        C2216i.m11343a();
        mo9484i().mo9680a();
    }

    /* renamed from: a */
    public void mo9472a(C2243o oVar) {
        C2216i.m11347b();
        this.f8834d.mo9775a(oVar.mo9508d());
        this.f8833c.mo9732a(oVar.mo9508d());
    }

    /* renamed from: a */
    public static void m11645a(C2561m<?> mVar) {
        C2216i.m11347b();
        C2525c a = mVar.mo10000a();
        if (a != null) {
            a.clear();
            mVar.mo10001a((C2525c) null);
        }
    }

    /* renamed from: a */
    public static void m11644a(C2522a<?> aVar) {
        aVar.clear();
    }

    /* renamed from: a */
    public static void m11642a(View view) {
        m11645a((C2561m<?>) new C2233a<Object>(view));
    }

    /* renamed from: a */
    public <T, Y> void mo9473a(Class<T> cls, Class<Y> cls2, C2410m<T, Y> mVar) {
        C2410m a = this.f8831a.mo9815a(cls, cls2, mVar);
        if (a != null) {
            a.mo9848a();
        }
    }

    /* renamed from: a */
    public static <T, Y> C2409l<T, Y> m11638a(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return m11632a(context).m11650k().mo9813a(cls, cls2);
        }
        boolean isLoggable = Log.isLoggable(f8829o, 3);
        return null;
    }

    /* renamed from: a */
    public static <T, Y> C2409l<T, Y> m11640a(T t, Class<Y> cls, Context context) {
        return m11638a(t != null ? t.getClass() : null, cls, context);
    }

    /* renamed from: a */
    public static <T> C2409l<T, ParcelFileDescriptor> m11637a(Class<T> cls, Context context) {
        return m11638a(cls, ParcelFileDescriptor.class, context);
    }

    /* renamed from: a */
    public static <T> C2409l<T, ParcelFileDescriptor> m11639a(T t, Context context) {
        return m11640a(t, ParcelFileDescriptor.class, context);
    }

    /* renamed from: a */
    public static C2245q m11633a(Activity activity) {
        return C2508k.m12460a().mo9949a(activity);
    }

    /* renamed from: a */
    public static C2245q m11636a(C1376c cVar) {
        return C2508k.m12460a().mo9955a(cVar);
    }

    @TargetApi(11)
    /* renamed from: a */
    public static C2245q m11634a(Fragment fragment) {
        return C2508k.m12460a().mo9950a(fragment);
    }

    /* renamed from: a */
    public static C2245q m11635a(androidx.fragment.app.Fragment fragment) {
        return C2508k.m12460a().mo9954a(fragment);
    }
}
