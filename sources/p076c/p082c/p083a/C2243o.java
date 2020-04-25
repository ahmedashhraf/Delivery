package p076c.p082c.p083a;

/* renamed from: c.c.a.o */
/* compiled from: MemoryCategory */
public enum C2243o {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private float multiplier;

    private C2243o(float f) {
        this.multiplier = f;
    }

    /* renamed from: d */
    public float mo9508d() {
        return this.multiplier;
    }
}
