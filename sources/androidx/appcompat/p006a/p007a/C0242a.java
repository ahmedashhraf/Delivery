package androidx.appcompat.p006a.p007a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.C0841b;
import androidx.core.content.p020h.C0862a;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.a.a.a */
/* compiled from: AppCompatResources */
public final class C0242a {

    /* renamed from: a */
    private static final String f639a = "AppCompatResources";

    /* renamed from: b */
    private static final ThreadLocal<TypedValue> f640b = new ThreadLocal<>();

    /* renamed from: c */
    private static final WeakHashMap<Context, SparseArray<C0243a>> f641c = new WeakHashMap<>(0);

    /* renamed from: d */
    private static final Object f642d = new Object();

    /* renamed from: androidx.appcompat.a.a.a$a */
    /* compiled from: AppCompatResources */
    private static class C0243a {

        /* renamed from: a */
        final ColorStateList f643a;

        /* renamed from: b */
        final Configuration f644b;

        C0243a(@C0193h0 ColorStateList colorStateList, @C0193h0 Configuration configuration) {
            this.f643a = colorStateList;
            this.f644b = configuration;
        }
    }

    private C0242a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    @androidx.annotation.C0195i0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m1105a(@androidx.annotation.C0193h0 android.content.Context r4, @androidx.annotation.C0202m int r5) {
        /*
            java.lang.Object r0 = f642d
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.a.a.a$a>> r1 = f641c     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            androidx.appcompat.a.a.a$a r2 = (androidx.appcompat.p006a.p007a.C0242a.C0243a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f644b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f643a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p006a.p007a.C0242a.m1105a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m1108b(@C0193h0 Context context, @C0202m int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m1105a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m1110d(context, i);
        if (d == null) {
            return C0841b.m4924b(context, i);
        }
        m1107a(context, i, d);
        return d;
    }

    @C0195i0
    /* renamed from: c */
    public static Drawable m1109c(@C0193h0 Context context, @C0213q int i) {
        return ResourceManagerInternal.get().getDrawable(context, i);
    }

    @C0195i0
    /* renamed from: d */
    private static ColorStateList m1110d(Context context, int i) {
        if (m1111e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0862a.m5000a(resources, (XmlPullParser) resources.getXml(i), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m1111e(@C0193h0 Context context, @C0202m int i) {
        Resources resources = context.getResources();
        TypedValue a = m1106a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m1107a(@C0193h0 Context context, @C0202m int i, @C0193h0 ColorStateList colorStateList) {
        synchronized (f642d) {
            SparseArray sparseArray = (SparseArray) f641c.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f641c.put(context, sparseArray);
            }
            sparseArray.append(i, new C0243a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    @C0193h0
    /* renamed from: a */
    private static TypedValue m1106a() {
        TypedValue typedValue = (TypedValue) f640b.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f640b.set(typedValue2);
        return typedValue2;
    }
}
