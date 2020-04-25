package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public enum C4934q7 {
    DOUBLE(C4996t7.DOUBLE, 1),
    FLOAT(C4996t7.FLOAT, 5),
    INT64(C4996t7.LONG, 0),
    UINT64(C4996t7.LONG, 0),
    INT32(C4996t7.INT, 0),
    FIXED64(C4996t7.LONG, 1),
    FIXED32(C4996t7.INT, 5),
    BOOL(C4996t7.BOOLEAN, 0),
    STRING(C4996t7.STRING, 2),
    GROUP(C4996t7.MESSAGE, 3),
    MESSAGE(C4996t7.MESSAGE, 2),
    BYTES(C4996t7.BYTE_STRING, 2),
    UINT32(C4996t7.INT, 0),
    ENUM(C4996t7.ENUM, 0),
    SFIXED32(C4996t7.INT, 5),
    SFIXED64(C4996t7.LONG, 1),
    SINT32(C4996t7.INT, 0),
    SINT64(C4996t7.LONG, 0);
    
    private final C4996t7 zzs;
    private final int zzt;

    private C4934q7(C4996t7 t7Var, int i) {
        this.zzs = t7Var;
        this.zzt = i;
    }

    /* renamed from: a */
    public final C4996t7 mo19396a() {
        return this.zzs;
    }

    /* renamed from: i */
    public final int mo19397i() {
        return this.zzt;
    }
}
