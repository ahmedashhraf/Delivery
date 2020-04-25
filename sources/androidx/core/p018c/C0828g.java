package androidx.core.p018c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.LruCache;
import androidx.core.content.p020h.C0865d.C0866a;
import androidx.core.content.p020h.C0865d.C0868c;
import androidx.core.content.p020h.C0865d.C0870e;
import androidx.core.content.p020h.C0874g.C0875a;
import androidx.core.provider.C1074a;
import androidx.core.provider.C1074a.C1091h;

/* renamed from: androidx.core.c.g */
/* compiled from: TypefaceCompat */
public class C0828g {

    /* renamed from: a */
    private static final C0833l f3921a;

    /* renamed from: b */
    private static final LruCache<String, Typeface> f3922b = new LruCache<>(16);

    static {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            f3921a = new C0832k();
        } else if (i >= 26) {
            f3921a = new C0831j();
        } else if (i >= 24 && C0830i.m4851a()) {
            f3921a = new C0830i();
        } else if (VERSION.SDK_INT >= 21) {
            f3921a = new C0829h();
        } else {
            f3921a = new C0833l();
        }
    }

    private C0828g() {
    }

    /* renamed from: a */
    private static String m4840a(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: b */
    public static Typeface m4842b(@C0193h0 Resources resources, int i, int i2) {
        return (Typeface) f3922b.get(m4840a(resources, i, i2));
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: a */
    public static Typeface m4839a(@C0193h0 Context context, @C0193h0 C0866a aVar, @C0193h0 Resources resources, int i, int i2, @C0195i0 C0875a aVar2, @C0195i0 Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0870e) {
            C0870e eVar = (C0870e) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : eVar.mo4548a() == 0) {
                z2 = true;
            }
            typeface = C1074a.m6203a(context, eVar.mo4549b(), aVar2, handler, z2, z ? eVar.mo4550c() : -1, i2);
        } else {
            typeface = f3921a.mo4471a(context, (C0868c) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo4552a(typeface, handler);
                } else {
                    aVar2.mo4551a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3922b.put(m4840a(resources, i, i2), typeface);
        }
        return typeface;
    }

    @C0195i0
    /* renamed from: b */
    private static Typeface m4841b(Context context, Typeface typeface, int i) {
        C0868c a = f3921a.mo4482a(typeface);
        if (a == null) {
            return null;
        }
        return f3921a.mo4471a(context, a, context.getResources(), i);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: a */
    public static Typeface m4836a(@C0193h0 Context context, @C0193h0 Resources resources, int i, String str, int i2) {
        Typeface a = f3921a.mo4472a(context, resources, i, str, i2);
        if (a != null) {
            f3922b.put(m4840a(resources, i, i2), a);
        }
        return a;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    /* renamed from: a */
    public static Typeface m4838a(@C0193h0 Context context, @C0195i0 CancellationSignal cancellationSignal, @C0193h0 C1091h[] hVarArr, int i) {
        return f3921a.mo4470a(context, cancellationSignal, hVarArr, i);
    }

    @C0193h0
    /* renamed from: a */
    public static Typeface m4837a(@C0193h0 Context context, @C0195i0 Typeface typeface, int i) {
        if (context != null) {
            if (VERSION.SDK_INT < 21) {
                Typeface b = m4841b(context, typeface, i);
                if (b != null) {
                    return b;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
