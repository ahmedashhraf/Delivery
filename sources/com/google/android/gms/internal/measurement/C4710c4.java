package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.measurement.c4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public enum C4710c4 {
    DOUBLE(0, C4756f4.SCALAR, C4957s4.DOUBLE),
    FLOAT(1, C4756f4.SCALAR, C4957s4.FLOAT),
    INT64(2, C4756f4.SCALAR, C4957s4.LONG),
    UINT64(3, C4756f4.SCALAR, C4957s4.LONG),
    INT32(4, C4756f4.SCALAR, C4957s4.INT),
    FIXED64(5, C4756f4.SCALAR, C4957s4.LONG),
    FIXED32(6, C4756f4.SCALAR, C4957s4.INT),
    BOOL(7, C4756f4.SCALAR, C4957s4.BOOLEAN),
    STRING(8, C4756f4.SCALAR, C4957s4.STRING),
    MESSAGE(9, C4756f4.SCALAR, C4957s4.MESSAGE),
    BYTES(10, C4756f4.SCALAR, C4957s4.BYTE_STRING),
    UINT32(11, C4756f4.SCALAR, C4957s4.INT),
    ENUM(12, C4756f4.SCALAR, C4957s4.ENUM),
    SFIXED32(13, C4756f4.SCALAR, C4957s4.INT),
    SFIXED64(14, C4756f4.SCALAR, C4957s4.LONG),
    SINT32(15, C4756f4.SCALAR, C4957s4.INT),
    SINT64(16, C4756f4.SCALAR, C4957s4.LONG),
    GROUP(17, C4756f4.SCALAR, C4957s4.MESSAGE),
    DOUBLE_LIST(18, C4756f4.VECTOR, C4957s4.DOUBLE),
    FLOAT_LIST(19, C4756f4.VECTOR, C4957s4.FLOAT),
    INT64_LIST(20, C4756f4.VECTOR, C4957s4.LONG),
    UINT64_LIST(21, C4756f4.VECTOR, C4957s4.LONG),
    INT32_LIST(22, C4756f4.VECTOR, C4957s4.INT),
    FIXED64_LIST(23, C4756f4.VECTOR, C4957s4.LONG),
    FIXED32_LIST(24, C4756f4.VECTOR, C4957s4.INT),
    BOOL_LIST(25, C4756f4.VECTOR, C4957s4.BOOLEAN),
    STRING_LIST(26, C4756f4.VECTOR, C4957s4.STRING),
    MESSAGE_LIST(27, C4756f4.VECTOR, C4957s4.MESSAGE),
    BYTES_LIST(28, C4756f4.VECTOR, C4957s4.BYTE_STRING),
    UINT32_LIST(29, C4756f4.VECTOR, C4957s4.INT),
    ENUM_LIST(30, C4756f4.VECTOR, C4957s4.ENUM),
    SFIXED32_LIST(31, C4756f4.VECTOR, C4957s4.INT),
    SFIXED64_LIST(32, C4756f4.VECTOR, C4957s4.LONG),
    SINT32_LIST(33, C4756f4.VECTOR, C4957s4.INT),
    SINT64_LIST(34, C4756f4.VECTOR, C4957s4.LONG),
    DOUBLE_LIST_PACKED(35, C4756f4.PACKED_VECTOR, C4957s4.DOUBLE),
    FLOAT_LIST_PACKED(36, C4756f4.PACKED_VECTOR, C4957s4.FLOAT),
    INT64_LIST_PACKED(37, C4756f4.PACKED_VECTOR, C4957s4.LONG),
    UINT64_LIST_PACKED(38, C4756f4.PACKED_VECTOR, C4957s4.LONG),
    INT32_LIST_PACKED(39, C4756f4.PACKED_VECTOR, C4957s4.INT),
    FIXED64_LIST_PACKED(40, C4756f4.PACKED_VECTOR, C4957s4.LONG),
    FIXED32_LIST_PACKED(41, C4756f4.PACKED_VECTOR, C4957s4.INT),
    BOOL_LIST_PACKED(42, C4756f4.PACKED_VECTOR, C4957s4.BOOLEAN),
    UINT32_LIST_PACKED(43, C4756f4.PACKED_VECTOR, C4957s4.INT),
    ENUM_LIST_PACKED(44, C4756f4.PACKED_VECTOR, C4957s4.ENUM),
    SFIXED32_LIST_PACKED(45, C4756f4.PACKED_VECTOR, C4957s4.INT),
    SFIXED64_LIST_PACKED(46, C4756f4.PACKED_VECTOR, C4957s4.LONG),
    SINT32_LIST_PACKED(47, C4756f4.PACKED_VECTOR, C4957s4.INT),
    SINT64_LIST_PACKED(48, C4756f4.PACKED_VECTOR, C4957s4.LONG),
    GROUP_LIST(49, C4756f4.VECTOR, C4957s4.MESSAGE),
    MAP(50, C4756f4.MAP, C4957s4.VOID);
    
    private static final C4710c4[] zzbe = null;
    private static final Type[] zzbf = null;
    private final C4957s4 zzaz;
    private final int zzba;
    private final C4756f4 zzbb;
    private final Class<?> zzbc;
    private final boolean zzbd;

    static {
        int i;
        zzbf = new Type[0];
        C4710c4[] values = values();
        zzbe = new C4710c4[values.length];
        for (C4710c4 c4Var : values) {
            zzbe[c4Var.zzba] = c4Var;
        }
    }

    private C4710c4(int i, C4756f4 f4Var, C4957s4 s4Var) {
        this.zzba = i;
        this.zzbb = f4Var;
        this.zzaz = s4Var;
        int i2 = C4696b4.f13994a[f4Var.ordinal()];
        if (i2 == 1) {
            this.zzbc = s4Var.mo19452a();
        } else if (i2 != 2) {
            this.zzbc = null;
        } else {
            this.zzbc = s4Var.mo19452a();
        }
        boolean z = false;
        if (f4Var == C4756f4.SCALAR) {
            int i3 = C4696b4.f13995b[s4Var.ordinal()];
            if (!(i3 == 1 || i3 == 2 || i3 == 3)) {
                z = true;
            }
        }
        this.zzbd = z;
    }

    /* renamed from: a */
    public final int mo18886a() {
        return this.zzba;
    }
}
