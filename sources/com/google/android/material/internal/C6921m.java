package com.google.android.material.internal;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0237z;
import androidx.core.p033k.C0944i;
import java.lang.reflect.Constructor;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.m */
/* compiled from: StaticLayoutBuilderCompat */
final class C6921m {

    /* renamed from: j */
    private static final String f19368j = "android.text.TextDirectionHeuristic";

    /* renamed from: k */
    private static final String f19369k = "android.text.TextDirectionHeuristics";

    /* renamed from: l */
    private static final String f19370l = "FIRSTSTRONG_LTR";

    /* renamed from: m */
    private static boolean f19371m;
    @C0195i0

    /* renamed from: n */
    private static Constructor<StaticLayout> f19372n;
    @C0195i0

    /* renamed from: o */
    private static Object f19373o;

    /* renamed from: a */
    private final CharSequence f19374a;

    /* renamed from: b */
    private final TextPaint f19375b;

    /* renamed from: c */
    private final int f19376c;

    /* renamed from: d */
    private int f19377d = 0;

    /* renamed from: e */
    private int f19378e;

    /* renamed from: f */
    private Alignment f19379f;

    /* renamed from: g */
    private int f19380g;

    /* renamed from: h */
    private boolean f19381h;
    @C0195i0

    /* renamed from: i */
    private TruncateAt f19382i;

    /* renamed from: com.google.android.material.internal.m$a */
    /* compiled from: StaticLayoutBuilderCompat */
    static class C6922a extends Exception {
        C6922a(Throwable th) {
            super("Error thrown initializing StaticLayout", th);
        }
    }

    private C6921m(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f19374a = charSequence;
        this.f19375b = textPaint;
        this.f19376c = i;
        this.f19378e = charSequence.length();
        this.f19379f = Alignment.ALIGN_NORMAL;
        this.f19380g = Integer.MAX_VALUE;
        this.f19381h = true;
        this.f19382i = null;
    }

    @C0193h0
    /* renamed from: a */
    public static C6921m m33230a(@C0193h0 CharSequence charSequence, @C0193h0 TextPaint textPaint, @C0237z(from = 0) int i) {
        return new C6921m(charSequence, textPaint, i);
    }

    @C0193h0
    /* renamed from: b */
    public C6921m mo27645b(@C0237z(from = 0) int i) {
        this.f19380g = i;
        return this;
    }

    @C0193h0
    /* renamed from: c */
    public C6921m mo27646c(@C0237z(from = 0) int i) {
        this.f19377d = i;
        return this;
    }

    /* renamed from: b */
    private static void m33231b() throws C6922a {
        Class cls;
        if (!f19371m) {
            try {
                if (VERSION.SDK_INT >= 18) {
                    cls = TextDirectionHeuristic.class;
                    f19373o = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    ClassLoader classLoader = C6921m.class.getClassLoader();
                    Class loadClass = classLoader.loadClass(f19368j);
                    Class loadClass2 = classLoader.loadClass(f19369k);
                    f19373o = loadClass2.getField(f19370l).get(loadClass2);
                    cls = loadClass;
                }
                f19372n = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TruncateAt.class, Integer.TYPE, Integer.TYPE});
                f19372n.setAccessible(true);
                f19371m = true;
            } catch (Exception e) {
                throw new C6922a(e);
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    public C6921m mo27642a(@C0193h0 Alignment alignment) {
        this.f19379f = alignment;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C6921m mo27644a(boolean z) {
        this.f19381h = z;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C6921m mo27641a(@C0237z(from = 0) int i) {
        this.f19378e = i;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public C6921m mo27643a(@C0195i0 TruncateAt truncateAt) {
        this.f19382i = truncateAt;
        return this;
    }

    /* renamed from: a */
    public StaticLayout mo27640a() throws C6922a {
        if (VERSION.SDK_INT >= 23) {
            Builder obtain = Builder.obtain(this.f19374a, this.f19377d, this.f19378e, this.f19375b, this.f19376c);
            obtain.setAlignment(this.f19379f);
            obtain.setIncludePad(this.f19381h);
            TruncateAt truncateAt = this.f19382i;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f19380g);
            return obtain.build();
        }
        m33231b();
        try {
            return (StaticLayout) ((Constructor) C0944i.m5337a(f19372n)).newInstance(new Object[]{this.f19374a, Integer.valueOf(this.f19377d), Integer.valueOf(this.f19378e), this.f19375b, Integer.valueOf(this.f19376c), this.f19379f, C0944i.m5337a(f19373o), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f19381h), this.f19382i, Integer.valueOf(this.f19376c), Integer.valueOf(this.f19380g)});
        } catch (Exception e) {
            throw new C6922a(e);
        }
    }
}
