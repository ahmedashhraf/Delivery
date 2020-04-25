package p212io.fabric.sdk.android.p493p.p495b;

/* renamed from: io.fabric.sdk.android.p.b.b */
/* compiled from: AdvertisingInfo */
class C14237b {

    /* renamed from: a */
    public final String f41980a;

    /* renamed from: b */
    public final boolean f41981b;

    C14237b(String str, boolean z) {
        this.f41980a = str;
        this.f41981b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14237b.class != obj.getClass()) {
            return false;
        }
        C14237b bVar = (C14237b) obj;
        if (this.f41981b != bVar.f41981b) {
            return false;
        }
        String str = this.f41980a;
        String str2 = bVar.f41980a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f41980a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f41981b ? 1 : 0);
    }
}
