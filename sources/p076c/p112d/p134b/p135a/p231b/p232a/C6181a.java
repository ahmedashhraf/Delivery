package p076c.p112d.p134b.p135a.p231b.p232a;

import android.os.Build.VERSION;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.b.a.a */
/* compiled from: AndroidUtils */
public class C6181a {
    private C6181a() {
    }

    /* renamed from: a */
    public static void m28396a(int i) {
        C6381h0.m29668a(m28397b(i), "running on Android SDK level %s but requires minimum %s", Integer.valueOf(VERSION.SDK_INT), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static boolean m28397b(int i) {
        return VERSION.SDK_INT >= i;
    }
}
