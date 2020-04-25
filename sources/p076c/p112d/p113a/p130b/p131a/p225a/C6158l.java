package p076c.p112d.p113a.p130b.p131a.p225a;

import android.app.PendingIntent;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: c.d.a.b.a.a.l */
final class C6158l extends C6147a {

    /* renamed from: a */
    private final String f17355a;

    /* renamed from: b */
    private final int f17356b;

    /* renamed from: c */
    private final int f17357c;

    /* renamed from: d */
    private final int f17358d;

    /* renamed from: e */
    private final PendingIntent f17359e;

    /* renamed from: f */
    private final PendingIntent f17360f;

    C6158l(String str, int i, int i2, int i3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (str != null) {
            this.f17355a = str;
            this.f17356b = i;
            this.f17357c = i2;
            this.f17358d = i3;
            this.f17359e = pendingIntent;
            this.f17360f = pendingIntent2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo25035a() {
        return this.f17359e;
    }

    /* renamed from: b */
    public final int mo25037b() {
        return this.f17356b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final PendingIntent mo25038c() {
        return this.f17360f;
    }

    /* renamed from: d */
    public final int mo25039d() {
        return this.f17358d;
    }

    /* renamed from: e */
    public final String mo25040e() {
        return this.f17355a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6147a) {
            C6147a aVar = (C6147a) obj;
            if (this.f17355a.equals(aVar.mo25040e()) && this.f17356b == aVar.mo25037b() && this.f17357c == aVar.mo25041f() && this.f17358d == aVar.mo25039d()) {
                PendingIntent pendingIntent = this.f17359e;
                if (pendingIntent != null ? pendingIntent.equals(aVar.mo25035a()) : aVar.mo25035a() == null) {
                    PendingIntent pendingIntent2 = this.f17360f;
                    PendingIntent c = aVar.mo25038c();
                    return pendingIntent2 != null ? pendingIntent2.equals(c) : c == null;
                }
            }
        }
    }

    /* renamed from: f */
    public final int mo25041f() {
        return this.f17357c;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f17355a.hashCode() ^ 1000003) * 1000003) ^ this.f17356b) * 1000003) ^ this.f17357c) * 1000003) ^ this.f17358d) * 1000003;
        PendingIntent pendingIntent = this.f17359e;
        int i = 0;
        int hashCode2 = (hashCode ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f17360f;
        if (pendingIntent2 != null) {
            i = pendingIntent2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String str = this.f17355a;
        int i = this.f17356b;
        int i2 = this.f17357c;
        int i3 = this.f17358d;
        String valueOf = String.valueOf(this.f17359e);
        String valueOf2 = String.valueOf(this.f17360f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + C13959t.f40780D2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
