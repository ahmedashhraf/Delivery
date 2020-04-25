package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public enum C4957s4 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C5070z2.class, C5070z2.class, C5070z2.f14557b),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzk;
    private final Class<?> zzl;
    private final Object zzm;

    private C4957s4(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzk = cls;
        this.zzl = cls2;
        this.zzm = obj;
    }

    /* renamed from: a */
    public final Class<?> mo19452a() {
        return this.zzl;
    }
}
