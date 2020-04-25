package com.google.zxing.p346y.p347c0.p348g;

import com.google.zxing.p346y.p347c0.C9108b;
import com.google.zxing.p346y.p347c0.C9109c;

/* renamed from: com.google.zxing.y.c0.g.b */
/* compiled from: ExpandedPair */
final class C9114b {

    /* renamed from: a */
    private final boolean f23901a;

    /* renamed from: b */
    private final C9108b f23902b;

    /* renamed from: c */
    private final C9108b f23903c;

    /* renamed from: d */
    private final C9109c f23904d;

    C9114b(C9108b bVar, C9108b bVar2, C9109c cVar, boolean z) {
        this.f23902b = bVar;
        this.f23903c = bVar2;
        this.f23904d = cVar;
        this.f23901a = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9109c mo33139a() {
        return this.f23904d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9108b mo33140b() {
        return this.f23902b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C9108b mo33141c() {
        return this.f23903c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo33142d() {
        return this.f23901a;
    }

    /* renamed from: e */
    public boolean mo33143e() {
        return this.f23903c == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9114b)) {
            return false;
        }
        C9114b bVar = (C9114b) obj;
        if (!m42619a(this.f23902b, bVar.f23902b) || !m42619a(this.f23903c, bVar.f23903c) || !m42619a(this.f23904d, bVar.f23904d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (m42618a(this.f23902b) ^ m42618a(this.f23903c)) ^ m42618a(this.f23904d);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f23902b);
        sb.append(" , ");
        sb.append(this.f23903c);
        sb.append(" : ");
        C9109c cVar = this.f23904d;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.mo33133c());
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m42619a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static int m42618a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
