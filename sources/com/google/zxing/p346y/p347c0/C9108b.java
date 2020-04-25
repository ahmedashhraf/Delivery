package com.google.zxing.p346y.p347c0;

/* renamed from: com.google.zxing.y.c0.b */
/* compiled from: DataCharacter */
public class C9108b {

    /* renamed from: a */
    private final int f23885a;

    /* renamed from: b */
    private final int f23886b;

    public C9108b(int i, int i2) {
        this.f23885a = i;
        this.f23886b = i2;
    }

    /* renamed from: a */
    public final int mo33126a() {
        return this.f23886b;
    }

    /* renamed from: b */
    public final int mo33127b() {
        return this.f23885a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9108b)) {
            return false;
        }
        C9108b bVar = (C9108b) obj;
        if (this.f23885a == bVar.f23885a && this.f23886b == bVar.f23886b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23885a ^ this.f23886b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23885a);
        sb.append("(");
        sb.append(this.f23886b);
        sb.append(')');
        return sb.toString();
    }
}
