package com.google.zxing.p346y.p347c0.p348g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.y.c0.g.c */
/* compiled from: ExpandedRow */
final class C9115c {

    /* renamed from: a */
    private final List<C9114b> f23905a;

    /* renamed from: b */
    private final int f23906b;

    /* renamed from: c */
    private final boolean f23907c;

    C9115c(List<C9114b> list, int i, boolean z) {
        this.f23905a = new ArrayList(list);
        this.f23906b = i;
        this.f23907c = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C9114b> mo33147a() {
        return this.f23905a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo33149b() {
        return this.f23906b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo33150c() {
        return this.f23907c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9115c)) {
            return false;
        }
        C9115c cVar = (C9115c) obj;
        if (!this.f23905a.equals(cVar.mo33147a()) || this.f23907c != cVar.f23907c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f23905a.hashCode() ^ Boolean.valueOf(this.f23907c).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        sb.append(this.f23905a);
        sb.append(" }");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33148a(List<C9114b> list) {
        return this.f23905a.equals(list);
    }
}
