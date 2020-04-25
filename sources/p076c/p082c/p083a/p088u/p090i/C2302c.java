package p076c.p082c.p083a.p088u.p090i;

/* renamed from: c.c.a.u.i.c */
/* compiled from: DiskCacheStrategy */
public enum C2302c {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);
    
    private final boolean cacheResult;
    private final boolean cacheSource;

    private C2302c(boolean z, boolean z2) {
        this.cacheSource = z;
        this.cacheResult = z2;
    }

    /* renamed from: d */
    public boolean mo9677d() {
        return this.cacheResult;
    }

    /* renamed from: e */
    public boolean mo9678e() {
        return this.cacheSource;
    }
}
