package androidx.core.p034l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.view.PointerIcon;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: androidx.core.l.z */
/* compiled from: PointerIconCompat */
public final class C1056z {

    /* renamed from: b */
    public static final int f4700b = 0;

    /* renamed from: c */
    public static final int f4701c = 1000;

    /* renamed from: d */
    public static final int f4702d = 1001;

    /* renamed from: e */
    public static final int f4703e = 1002;

    /* renamed from: f */
    public static final int f4704f = 1003;

    /* renamed from: g */
    public static final int f4705g = 1004;

    /* renamed from: h */
    public static final int f4706h = 1006;

    /* renamed from: i */
    public static final int f4707i = 1007;

    /* renamed from: j */
    public static final int f4708j = 1008;

    /* renamed from: k */
    public static final int f4709k = 1009;

    /* renamed from: l */
    public static final int f4710l = 1010;

    /* renamed from: m */
    public static final int f4711m = 1011;

    /* renamed from: n */
    public static final int f4712n = 1012;

    /* renamed from: o */
    public static final int f4713o = 1013;

    /* renamed from: p */
    public static final int f4714p = 1014;

    /* renamed from: q */
    public static final int f4715q = 1015;

    /* renamed from: r */
    public static final int f4716r = 1016;

    /* renamed from: s */
    public static final int f4717s = 1017;

    /* renamed from: t */
    public static final int f4718t = 1018;

    /* renamed from: u */
    public static final int f4719u = 1019;

    /* renamed from: v */
    public static final int f4720v = 1020;

    /* renamed from: w */
    public static final int f4721w = 1021;

    /* renamed from: x */
    public static final int f4722x = 1000;

    /* renamed from: a */
    private Object f4723a;

    private C1056z(Object obj) {
        this.f4723a = obj;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public Object mo5198a() {
        return this.f4723a;
    }

    /* renamed from: a */
    public static C1056z m6138a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C1056z(PointerIcon.getSystemIcon(context, i));
        }
        return new C1056z(null);
    }

    /* renamed from: a */
    public static C1056z m6140a(Bitmap bitmap, float f, float f2) {
        if (VERSION.SDK_INT >= 24) {
            return new C1056z(PointerIcon.create(bitmap, f, f2));
        }
        return new C1056z(null);
    }

    /* renamed from: a */
    public static C1056z m6139a(Resources resources, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C1056z(PointerIcon.load(resources, i));
        }
        return new C1056z(null);
    }
}
