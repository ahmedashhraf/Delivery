package p076c.p112d.p113a.p130b.p131a.p225a;

import android.app.PendingIntent;

/* renamed from: c.d.a.b.a.a.a */
public abstract class C6147a {
    /* renamed from: a */
    public static C6147a m28230a(String str, int i, int i2, int i3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        C6158l lVar = new C6158l(str, i, i2, i3, pendingIntent, pendingIntent2);
        return lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract PendingIntent mo25035a();

    /* renamed from: a */
    public boolean mo25036a(int i) {
        return i == 0 ? mo25038c() != null : i == 1 && mo25035a() != null;
    }

    /* renamed from: b */
    public abstract int mo25037b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract PendingIntent mo25038c();

    /* renamed from: d */
    public abstract int mo25039d();

    /* renamed from: e */
    public abstract String mo25040e();

    /* renamed from: f */
    public abstract int mo25041f();
}
