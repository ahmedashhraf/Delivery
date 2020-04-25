package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.annotation.C0225w;
import androidx.appcompat.app.C0287b.C0289b;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.appcompat.widget.C0565y0;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0637b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: AppCompatDelegate */
public abstract class C0297f {
    @Deprecated

    /* renamed from: N */
    public static final int f890N = 0;
    @Deprecated

    /* renamed from: O */
    public static final int f891O = 0;

    /* renamed from: P */
    public static final int f892P = 1;

    /* renamed from: Q */
    public static final int f893Q = 2;

    /* renamed from: R */
    public static final int f894R = 3;

    /* renamed from: S */
    public static final int f895S = -100;

    /* renamed from: T */
    private static int f896T = -100;

    /* renamed from: U */
    private static final C0637b<WeakReference<C0297f>> f897U = new C0637b<>();

    /* renamed from: V */
    private static final Object f898V = new Object();

    /* renamed from: W */
    public static final int f899W = 108;

    /* renamed from: X */
    public static final int f900X = 109;

    /* renamed from: Y */
    public static final int f901Y = 10;

    /* renamed from: a */
    static final String f902a = "AppCompatDelegate";

    /* renamed from: b */
    public static final int f903b = -1;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.f$a */
    /* compiled from: AppCompatDelegate */
    public @interface C0298a {
    }

    C0297f() {
    }

    @C0193h0
    /* renamed from: a */
    public static C0297f m1470a(@C0193h0 Activity activity, @C0195i0 C0296e eVar) {
        return new AppCompatDelegateImpl(activity, eVar);
    }

    /* renamed from: b */
    public static void m1476b(boolean z) {
        C0565y0.m3089a(z);
    }

    /* renamed from: c */
    private static void m1477c(@C0193h0 C0297f fVar) {
        synchronized (f898V) {
            Iterator it = f897U.iterator();
            while (it.hasNext()) {
                C0297f fVar2 = (C0297f) ((WeakReference) it.next()).get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: g */
    public static void m1478g(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f896T != i) {
            f896T = i;
            mo833m();
        }
    }

    /* renamed from: m */
    private static void mo833m() {
        synchronized (f898V) {
            Iterator it = f897U.iterator();
            while (it.hasNext()) {
                C0297f fVar = (C0297f) ((WeakReference) it.next()).get();
                if (fVar != null) {
                    fVar.mo800a();
                }
            }
        }
    }

    /* renamed from: n */
    public static int m1480n() {
        return f896T;
    }

    /* renamed from: o */
    public static boolean m1481o() {
        return C0565y0.m3090a();
    }

    @C0195i0
    /* renamed from: a */
    public abstract <T extends View> T mo783a(@C0225w int i);

    /* renamed from: a */
    public abstract View mo784a(@C0195i0 View view, String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet);

    @C0195i0
    /* renamed from: a */
    public abstract C0338b mo787a(@C0193h0 C0339a aVar);

    /* renamed from: a */
    public void mo789a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo790a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo791a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo792a(View view);

    /* renamed from: a */
    public abstract void mo793a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo797a(@C0195i0 Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo798a(@C0195i0 CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo799a(boolean z);

    /* renamed from: a */
    public abstract boolean mo800a();

    @C0195i0
    /* renamed from: b */
    public abstract C0289b mo804b();

    /* renamed from: b */
    public abstract void mo806b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo807b(View view, LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo809b(int i);

    /* renamed from: c */
    public int mo811c() {
        return -100;
    }

    /* renamed from: c */
    public abstract void mo812c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo813c(int i);

    /* renamed from: d */
    public abstract MenuInflater mo815d();

    /* renamed from: d */
    public abstract void mo816d(@C0183c0 int i);

    @C0195i0
    /* renamed from: e */
    public abstract C0279a mo817e();

    /* renamed from: e */
    public abstract void mo818e(int i);

    /* renamed from: f */
    public abstract void mo819f();

    /* renamed from: f */
    public void mo820f(@C0216r0 int i) {
    }

    /* renamed from: g */
    public abstract void mo821g();

    /* renamed from: h */
    public abstract boolean mo823h();

    /* renamed from: i */
    public abstract void mo824i();

    /* renamed from: j */
    public abstract void mo827j();

    /* renamed from: k */
    public abstract void mo828k();

    /* renamed from: l */
    public abstract void mo830l();

    @C0193h0
    /* renamed from: a */
    public static C0297f m1471a(@C0193h0 Dialog dialog, @C0195i0 C0296e eVar) {
        return new AppCompatDelegateImpl(dialog, eVar);
    }

    /* renamed from: b */
    static void m1475b(@C0193h0 C0297f fVar) {
        synchronized (f898V) {
            m1477c(fVar);
        }
    }

    @C0193h0
    /* renamed from: a */
    public static C0297f m1473a(@C0193h0 Context context, @C0193h0 Window window, @C0195i0 C0296e eVar) {
        return new AppCompatDelegateImpl(context, window, eVar);
    }

    @C0193h0
    /* renamed from: a */
    public static C0297f m1472a(@C0193h0 Context context, @C0193h0 Activity activity, @C0195i0 C0296e eVar) {
        return new AppCompatDelegateImpl(context, activity, eVar);
    }

    /* renamed from: a */
    static void m1474a(@C0193h0 C0297f fVar) {
        synchronized (f898V) {
            m1477c(fVar);
            f897U.add(new WeakReference(fVar));
        }
    }
}
