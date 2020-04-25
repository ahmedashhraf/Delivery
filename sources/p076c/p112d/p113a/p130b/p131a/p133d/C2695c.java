package p076c.p112d.p113a.p130b.p131a.p133d;

import java.io.File;

/* renamed from: c.d.a.b.a.d.c */
final class C2695c extends C2711s {

    /* renamed from: a */
    private final File f9815a;

    /* renamed from: b */
    private final String f9816b;

    C2695c(File file, String str) {
        if (file != null) {
            this.f9815a = file;
            if (str != null) {
                this.f9816b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo10359a() {
        return this.f9815a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo10360b() {
        return this.f9816b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2711s) {
            C2711s sVar = (C2711s) obj;
            return this.f9815a.equals(sVar.mo10359a()) && this.f9816b.equals(sVar.mo10360b());
        }
    }

    public final int hashCode() {
        return ((this.f9815a.hashCode() ^ 1000003) * 1000003) ^ this.f9816b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9815a);
        String str = this.f9816b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(str).length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
