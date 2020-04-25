package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4805d;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.v5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5021v5<T> implements C4790h6<T> {

    /* renamed from: r */
    private static final int[] f14464r = new int[0];

    /* renamed from: s */
    private static final Unsafe f14465s = C4759f7.m20161c();

    /* renamed from: a */
    private final int[] f14466a;

    /* renamed from: b */
    private final Object[] f14467b;

    /* renamed from: c */
    private final int f14468c;

    /* renamed from: d */
    private final int f14469d;

    /* renamed from: e */
    private final C4945r5 f14470e;

    /* renamed from: f */
    private final boolean f14471f;

    /* renamed from: g */
    private final boolean f14472g;

    /* renamed from: h */
    private final boolean f14473h;

    /* renamed from: i */
    private final boolean f14474i;

    /* renamed from: j */
    private final int[] f14475j;

    /* renamed from: k */
    private final int f14476k;

    /* renamed from: l */
    private final int f14477l;

    /* renamed from: m */
    private final C5073z5 f14478m;

    /* renamed from: n */
    private final C4683a5 f14479n;

    /* renamed from: o */
    private final C5074z6<?, ?> f14480o;

    /* renamed from: p */
    private final C5032w3<?> f14481p;

    /* renamed from: q */
    private final C4834k5 f14482q;

    private C5021v5(int[] iArr, Object[] objArr, int i, int i2, C4945r5 r5Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C5073z5 z5Var, C4683a5 a5Var, C5074z6<?, ?> z6Var, C5032w3<?> w3Var, C4834k5 k5Var) {
        this.f14466a = iArr;
        this.f14467b = objArr;
        this.f14468c = i;
        this.f14469d = i2;
        this.f14472g = r5Var instanceof C4801i4;
        this.f14473h = z;
        this.f14471f = w3Var != null && w3Var.mo19717a(r5Var);
        this.f14474i = false;
        this.f14475j = iArr2;
        this.f14476k = i3;
        this.f14477l = i4;
        this.f14478m = z5Var;
        this.f14479n = a5Var;
        this.f14480o = z6Var;
        this.f14481p = w3Var;
        this.f14470e = r5Var;
        this.f14482q = k5Var;
    }

    /* renamed from: a */
    static <T> C5021v5<T> m21654a(Class<T> cls, C4913p5 p5Var, C5073z5 z5Var, C4683a5 a5Var, C5074z6<?, ?> z6Var, C5032w3<?> w3Var, C4834k5 k5Var) {
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Class cls2;
        int i17;
        int i18;
        Field field;
        int i19;
        char charAt;
        int i20;
        char c2;
        Field field2;
        Field field3;
        int i21;
        char charAt2;
        int i22;
        char charAt3;
        int i23;
        char charAt4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        char charAt5;
        int i30;
        char charAt6;
        int i31;
        char charAt7;
        int i32;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        char charAt14;
        C4913p5 p5Var2 = p5Var;
        if (p5Var2 instanceof C4758f6) {
            C4758f6 f6Var = (C4758f6) p5Var2;
            char c3 = 0;
            boolean z = f6Var.mo18988a() == C4805d.f14196j;
            String b = f6Var.mo18989b();
            int length = b.length();
            char charAt15 = b.charAt(0);
            if (charAt15 >= 55296) {
                char c4 = charAt15 & 8191;
                int i33 = 1;
                int i34 = 13;
                while (true) {
                    i = i33 + 1;
                    charAt14 = b.charAt(i33);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c4 |= (charAt14 & 8191) << i34;
                    i34 += 13;
                    i33 = i;
                }
                charAt15 = (charAt14 << i34) | c4;
            } else {
                i = 1;
            }
            int i35 = i + 1;
            char charAt16 = b.charAt(i);
            if (charAt16 >= 55296) {
                char c5 = charAt16 & 8191;
                int i36 = 13;
                while (true) {
                    i2 = i35 + 1;
                    charAt13 = b.charAt(i35);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c5 |= (charAt13 & 8191) << i36;
                    i36 += 13;
                    i35 = i2;
                }
                charAt16 = c5 | (charAt13 << i36);
            } else {
                i2 = i35;
            }
            if (charAt16 == 0) {
                iArr = f14464r;
                c = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
                i3 = 0;
            } else {
                int i37 = i2 + 1;
                int charAt17 = b.charAt(i2);
                if (charAt17 >= 55296) {
                    int i38 = charAt17 & 8191;
                    int i39 = 13;
                    while (true) {
                        i24 = i37 + 1;
                        charAt12 = b.charAt(i37);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i38 |= (charAt12 & 8191) << i39;
                        i39 += 13;
                        i37 = i24;
                    }
                    charAt17 = (charAt12 << i39) | i38;
                } else {
                    i24 = i37;
                }
                int i40 = i24 + 1;
                char charAt18 = b.charAt(i24);
                if (charAt18 >= 55296) {
                    char c6 = charAt18 & 8191;
                    int i41 = 13;
                    while (true) {
                        i25 = i40 + 1;
                        charAt11 = b.charAt(i40);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c6 |= (charAt11 & 8191) << i41;
                        i41 += 13;
                        i40 = i25;
                    }
                    charAt18 = c6 | (charAt11 << i41);
                } else {
                    i25 = i40;
                }
                int i42 = i25 + 1;
                int charAt19 = b.charAt(i25);
                if (charAt19 >= 55296) {
                    int i43 = charAt19 & 8191;
                    int i44 = 13;
                    while (true) {
                        i26 = i42 + 1;
                        charAt10 = b.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i26;
                    }
                    charAt19 = (charAt10 << i44) | i43;
                } else {
                    i26 = i42;
                }
                int i45 = i26 + 1;
                i5 = b.charAt(i26);
                if (i5 >= 55296) {
                    int i46 = i5 & 8191;
                    int i47 = 13;
                    while (true) {
                        i27 = i45 + 1;
                        charAt9 = b.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i27;
                    }
                    i5 = (charAt9 << i47) | i46;
                } else {
                    i27 = i45;
                }
                int i48 = i27 + 1;
                i4 = b.charAt(i27);
                if (i4 >= 55296) {
                    int i49 = i4 & 8191;
                    int i50 = 13;
                    while (true) {
                        i32 = i48 + 1;
                        charAt8 = b.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i32;
                    }
                    i4 = (charAt8 << i50) | i49;
                    i48 = i32;
                }
                int i51 = i48 + 1;
                c = b.charAt(i48);
                if (c >= 55296) {
                    char c7 = c & 8191;
                    int i52 = 13;
                    while (true) {
                        i31 = i51 + 1;
                        charAt7 = b.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c7 |= (charAt7 & 8191) << i52;
                        i52 += 13;
                        i51 = i31;
                    }
                    c = c7 | (charAt7 << i52);
                    i51 = i31;
                }
                int i53 = i51 + 1;
                char charAt20 = b.charAt(i51);
                if (charAt20 >= 55296) {
                    int i54 = 13;
                    int i55 = i53;
                    int i56 = charAt20 & 8191;
                    int i57 = i55;
                    while (true) {
                        i30 = i57 + 1;
                        charAt6 = b.charAt(i57);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i56 |= (charAt6 & 8191) << i54;
                        i54 += 13;
                        i57 = i30;
                    }
                    charAt20 = i56 | (charAt6 << i54);
                    i28 = i30;
                } else {
                    i28 = i53;
                }
                int i58 = i28 + 1;
                c3 = b.charAt(i28);
                if (c3 >= 55296) {
                    int i59 = 13;
                    int i60 = i58;
                    int i61 = c3 & 8191;
                    int i62 = i60;
                    while (true) {
                        i29 = i62 + 1;
                        charAt5 = b.charAt(i62);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i61 |= (charAt5 & 8191) << i59;
                        i59 += 13;
                        i62 = i29;
                    }
                    c3 = i61 | (charAt5 << i59);
                    i58 = i29;
                }
                iArr = new int[(c3 + c + charAt20)];
                i6 = (charAt17 << 1) + charAt18;
                int i63 = i58;
                i3 = charAt17;
                i7 = charAt19;
                i2 = i63;
            }
            Unsafe unsafe = f14465s;
            Object[] c8 = f6Var.mo18990c();
            Class cls3 = f6Var.mo18992l().getClass();
            int i64 = i6;
            int[] iArr2 = new int[(i4 * 3)];
            Object[] objArr = new Object[(i4 << 1)];
            int i65 = c3 + c;
            int i66 = c3;
            int i67 = i65;
            int i68 = 0;
            int i69 = 0;
            while (i2 < length) {
                int i70 = i2 + 1;
                int charAt21 = b.charAt(i2);
                char c9 = 55296;
                if (charAt21 >= 55296) {
                    int i71 = 13;
                    int i72 = i70;
                    int i73 = charAt21 & 8191;
                    int i74 = i72;
                    while (true) {
                        i23 = i74 + 1;
                        charAt4 = b.charAt(i74);
                        if (charAt4 < c9) {
                            break;
                        }
                        i73 |= (charAt4 & 8191) << i71;
                        i71 += 13;
                        i74 = i23;
                        c9 = 55296;
                    }
                    charAt21 = i73 | (charAt4 << i71);
                    i8 = i23;
                } else {
                    i8 = i70;
                }
                int i75 = i8 + 1;
                char charAt22 = b.charAt(i8);
                int i76 = length;
                char c10 = 55296;
                if (charAt22 >= 55296) {
                    int i77 = 13;
                    int i78 = i75;
                    int i79 = charAt22 & 8191;
                    int i80 = i78;
                    while (true) {
                        i22 = i80 + 1;
                        charAt3 = b.charAt(i80);
                        if (charAt3 < c10) {
                            break;
                        }
                        i79 |= (charAt3 & 8191) << i77;
                        i77 += 13;
                        i80 = i22;
                        c10 = 55296;
                    }
                    charAt22 = i79 | (charAt3 << i77);
                    i9 = i22;
                } else {
                    i9 = i75;
                }
                int i81 = c3;
                char c11 = charAt22 & 255;
                boolean z2 = z;
                if ((charAt22 & 1024) != 0) {
                    int i82 = i68 + 1;
                    iArr[i68] = i69;
                    i68 = i82;
                }
                int i83 = i68;
                if (c11 >= '3') {
                    int i84 = i9 + 1;
                    char charAt23 = b.charAt(i9);
                    char c12 = 55296;
                    if (charAt23 >= 55296) {
                        char c13 = charAt23 & 8191;
                        int i85 = 13;
                        while (true) {
                            i21 = i84 + 1;
                            charAt2 = b.charAt(i84);
                            if (charAt2 < c12) {
                                break;
                            }
                            c13 |= (charAt2 & 8191) << i85;
                            i85 += 13;
                            i84 = i21;
                            c12 = 55296;
                        }
                        charAt23 = c13 | (charAt2 << i85);
                        i84 = i21;
                    }
                    int i86 = c11 - '3';
                    int i87 = i84;
                    if (i86 == 9 || i86 == 17) {
                        c2 = 1;
                        int i88 = i64 + 1;
                        objArr[((i69 / 3) << 1) + 1] = c8[i64];
                        i64 = i88;
                    } else {
                        if (i86 == 12 && (charAt15 & 1) == 1) {
                            int i89 = i64 + 1;
                            objArr[((i69 / 3) << 1) + 1] = c8[i64];
                            i64 = i89;
                        }
                        c2 = 1;
                    }
                    int i90 = charAt23 << c2;
                    Object obj = c8[i90];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = m21657a(cls3, (String) obj);
                        c8[i90] = field2;
                    }
                    int i91 = i7;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    int i92 = i90 + 1;
                    Object obj2 = c8[i92];
                    int i93 = objectFieldOffset;
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = m21657a(cls3, (String) obj2);
                        c8[i92] = field3;
                    }
                    str = b;
                    i15 = (int) unsafe.objectFieldOffset(field3);
                    cls2 = cls3;
                    i11 = i64;
                    i14 = i93;
                    i16 = 0;
                    i10 = i91;
                    i12 = i5;
                    i13 = charAt21;
                    i18 = i87;
                } else {
                    int i94 = i7;
                    int i95 = i64 + 1;
                    Field a = m21657a(cls3, (String) c8[i64]);
                    i12 = i5;
                    if (c11 == 9 || c11 == 17) {
                        i10 = i94;
                        objArr[((i69 / 3) << 1) + 1] = a.getType();
                    } else {
                        if (c11 == 27 || c11 == '1') {
                            i10 = i94;
                            i20 = i95 + 1;
                            objArr[((i69 / 3) << 1) + 1] = c8[i95];
                        } else if (c11 == 12 || c11 == 30 || c11 == ',') {
                            i10 = i94;
                            if ((charAt15 & 1) == 1) {
                                i20 = i95 + 1;
                                objArr[((i69 / 3) << 1) + 1] = c8[i95];
                            }
                        } else if (c11 == '2') {
                            int i96 = i66 + 1;
                            iArr[i66] = i69;
                            int i97 = (i69 / 3) << 1;
                            int i98 = i95 + 1;
                            objArr[i97] = c8[i95];
                            if ((charAt22 & 2048) != 0) {
                                i95 = i98 + 1;
                                objArr[i97 + 1] = c8[i98];
                                i10 = i94;
                                i66 = i96;
                            } else {
                                i66 = i96;
                                i95 = i98;
                                i10 = i94;
                            }
                        } else {
                            i10 = i94;
                        }
                        i13 = charAt21;
                        i95 = i20;
                        i14 = (int) unsafe.objectFieldOffset(a);
                        if ((charAt15 & 1) == 1 || c11 > 17) {
                            str = b;
                            cls2 = cls3;
                            i11 = i95;
                            i17 = i9;
                            i16 = 0;
                            i15 = 0;
                        } else {
                            i17 = i9 + 1;
                            char charAt24 = b.charAt(i9);
                            if (charAt24 >= 55296) {
                                char c14 = charAt24 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i19 = i17 + 1;
                                    charAt = b.charAt(i17);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    c14 |= (charAt & 8191) << i99;
                                    i99 += 13;
                                    i17 = i19;
                                }
                                charAt24 = c14 | (charAt << i99);
                                i17 = i19;
                            }
                            int i100 = (i3 << 1) + (charAt24 / ' ');
                            Object obj3 = c8[i100];
                            str = b;
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = m21657a(cls3, (String) obj3);
                                c8[i100] = field;
                            }
                            cls2 = cls3;
                            i11 = i95;
                            i15 = (int) unsafe.objectFieldOffset(field);
                            i16 = charAt24 % ' ';
                        }
                        if (c11 >= 18 && c11 <= '1') {
                            int i101 = i67 + 1;
                            iArr[i67] = i14;
                            i67 = i101;
                        }
                        i18 = i17;
                    }
                    i13 = charAt21;
                    i14 = (int) unsafe.objectFieldOffset(a);
                    if ((charAt15 & 1) == 1) {
                    }
                    str = b;
                    cls2 = cls3;
                    i11 = i95;
                    i17 = i9;
                    i16 = 0;
                    i15 = 0;
                    int i1012 = i67 + 1;
                    iArr[i67] = i14;
                    i67 = i1012;
                    i18 = i17;
                }
                int i102 = i69 + 1;
                iArr2[i69] = i13;
                int i103 = i102 + 1;
                iArr2[i102] = (c11 << 20) | ((charAt22 & 256) != 0 ? 268435456 : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | i14;
                i69 = i103 + 1;
                iArr2[i103] = (i16 << 20) | i15;
                cls3 = cls2;
                i5 = i12;
                c3 = i81;
                i64 = i11;
                length = i76;
                z = z2;
                i7 = i10;
                i68 = i83;
                b = str;
            }
            boolean z3 = z;
            C5021v5 v5Var = new C5021v5(iArr2, objArr, i7, i5, f6Var.mo18992l(), z, false, iArr, c3, i65, z5Var, a5Var, z6Var, w3Var, k5Var);
            return v5Var;
        }
        int a2 = ((C5035w6) p5Var2).mo18988a();
        int i104 = C4805d.f14196j;
        throw new NoSuchMethodError();
    }

    /* renamed from: c */
    private final C4899o4 m21676c(int i) {
        return (C4899o4) this.f14467b[((i / 3) << 1) + 1];
    }

    /* renamed from: e */
    private static C4699b7 m21682e(Object obj) {
        C4801i4 i4Var = (C4801i4) obj;
        C4699b7 b7Var = i4Var.zzb;
        if (b7Var != C4699b7.m19962d()) {
            return b7Var;
        }
        C4699b7 e = C4699b7.m19963e();
        i4Var.zzb = e;
        return e;
    }

    /* renamed from: f */
    private static boolean m21683f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: f */
    private static <T> boolean m21684f(T t, long j) {
        return ((Boolean) C4759f7.m20173f(t, j)).booleanValue();
    }

    /* renamed from: g */
    private final int m21685g(int i) {
        if (i < this.f14468c || i > this.f14469d) {
            return -1;
        }
        return m21669b(i, 0);
    }

    /* renamed from: b */
    public final void mo19034b(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f14466a.length; i += 3) {
                int d = m21678d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f14466a[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20147a((Object) t, j, C4759f7.m20170e(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 1:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20148a((Object) t, j, C4759f7.m20165d(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 2:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20150a((Object) t, j, C4759f7.m20156b(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 3:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20150a((Object) t, j, C4759f7.m20156b(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 4:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 5:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20150a((Object) t, j, C4759f7.m20156b(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 6:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 7:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20152a((Object) t, j, C4759f7.m20164c(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 8:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20151a((Object) t, j, C4759f7.m20173f(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 9:
                        m21663a(t, t2, i);
                        break;
                    case 10:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20151a((Object) t, j, C4759f7.m20173f(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 11:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 12:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 13:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 14:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20150a((Object) t, j, C4759f7.m20156b(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 15:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 16:
                        if (!m21664a(t2, i)) {
                            break;
                        } else {
                            C4759f7.m20150a((Object) t, j, C4759f7.m20156b(t2, j));
                            m21671b(t, i);
                            break;
                        }
                    case 17:
                        m21663a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f14479n.mo18827a(t, t2, j);
                        break;
                    case 50:
                        C4821j6.m20415a(this.f14482q, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m21665a(t2, i2, i)) {
                            break;
                        } else {
                            C4759f7.m20151a((Object) t, j, C4759f7.m20173f(t2, j));
                            m21672b(t, i2, i);
                            break;
                        }
                    case 60:
                        m21674b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m21665a(t2, i2, i)) {
                            break;
                        } else {
                            C4759f7.m20151a((Object) t, j, C4759f7.m20173f(t2, j));
                            m21672b(t, i2, i);
                            break;
                        }
                    case 68:
                        m21674b(t, t2, i);
                        break;
                }
            }
            if (!this.f14473h) {
                C4821j6.m20417a(this.f14480o, t, t2);
                if (this.f14471f) {
                    C4821j6.m20416a(this.f14481p, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0834, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0900, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0915, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x095a, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a0b, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a2e, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19037d(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f14473h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = f14465s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f14466a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.m21678d(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f14466a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.c4 r14 = com.google.android.gms.internal.measurement.C4710c4.DOUBLE_LIST_PACKED
            int r14 = r14.mo18886a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.c4 r14 = com.google.android.gms.internal.measurement.C4710c4.SINT64_LIST_PACKED
            int r14 = r14.mo18886a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f14466a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            com.google.android.gms.internal.measurement.r5 r5 = (com.google.android.gms.internal.measurement.C4945r5) r5
            com.google.android.gms.internal.measurement.h6 r6 = r0.m21653a(r12)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21938c(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m21681e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21950f(r3, r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m21679d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21957h(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21958h(r3, r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21964j(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m21679d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21966k(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m21679d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21953g(r3, r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            com.google.android.gms.internal.measurement.z2 r5 = (com.google.android.gms.internal.measurement.C5070z2) r5
            int r3 = com.google.android.gms.internal.measurement.zzek.m21939c(r3, r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            com.google.android.gms.internal.measurement.h6 r6 = r0.m21653a(r12)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20403a(r3, r5, r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C5070z2
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.measurement.z2 r5 = (com.google.android.gms.internal.measurement.C5070z2) r5
            int r3 = com.google.android.gms.internal.measurement.zzek.m21939c(r3, r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zzek.m21931b(r3, r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21932b(r3, r8)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21961i(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21954g(r3, r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m21679d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21949f(r3, r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m21681e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21946e(r3, r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.m21665a((T) r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m21681e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21942d(r3, r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21927b(r3, r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.m21665a((T) r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zzek.m21926b(r3, r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.gms.internal.measurement.k5 r14 = r0.f14482q
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            java.lang.Object r6 = r0.m21670b(r12)
            int r3 = r14.mo19173a(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = m21658a(r1, r5)
            com.google.android.gms.internal.measurement.h6 r6 = r0.m21653a(r12)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20421b(r3, r5, r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20429c(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20444g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20450i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20447h(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20433d(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20441f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20453j(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20447h(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20450i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20437e(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20423b(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20407a(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20447h(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C4821j6.m20450i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14474i
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.measurement.zzek.m21945e(r3)
            int r6 = com.google.android.gms.internal.measurement.zzek.m21952g(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20428c(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20443g(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20449i(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20446h(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20432d(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20440f(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20420b(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = m21658a(r1, r5)
            com.google.android.gms.internal.measurement.h6 r6 = r0.m21653a(r12)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20405a(r3, r5, r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20404a(r3, r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20452j(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20446h(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20449i(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20436e(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20422b(r3, r5, r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20406a(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20446h(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = m21658a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20449i(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            com.google.android.gms.internal.measurement.r5 r5 = (com.google.android.gms.internal.measurement.C4945r5) r5
            com.google.android.gms.internal.measurement.h6 r6 = r0.m21653a(r12)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21938c(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21950f(r3, r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21957h(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21958h(r3, r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21964j(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21966k(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21953g(r3, r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            com.google.android.gms.internal.measurement.z2 r5 = (com.google.android.gms.internal.measurement.C5070z2) r5
            int r3 = com.google.android.gms.internal.measurement.zzek.m21939c(r3, r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            com.google.android.gms.internal.measurement.h6 r6 = r0.m21653a(r12)
            int r3 = com.google.android.gms.internal.measurement.C4821j6.m20403a(r3, r5, r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.C5070z2
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.measurement.z2 r5 = (com.google.android.gms.internal.measurement.C5070z2) r5
            int r3 = com.google.android.gms.internal.measurement.zzek.m21939c(r3, r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zzek.m21931b(r3, r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21932b(r3, r8)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21961i(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21954g(r3, r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21949f(r3, r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21946e(r3, r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.m21664a((T) r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zzek.m21942d(r3, r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zzek.m21927b(r3, r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.m21664a((T) r1, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zzek.m21926b(r3, r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.gms.internal.measurement.z6<?, ?> r2 = r0.f14480o
            int r1 = m21648a(r2, (T) r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = f14465s
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x04f9:
            int[] r13 = r0.f14466a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0a39
            int r13 = r0.m21678d(r3)
            int[] r14 = r0.f14466a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0525
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r18 = r11 >>> 20
            int r18 = r8 << r18
            if (r14 == r6) goto L_0x0522
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            goto L_0x0523
        L_0x0522:
            r14 = r6
        L_0x0523:
            r6 = r14
            goto L_0x0545
        L_0x0525:
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x0542
            com.google.android.gms.internal.measurement.c4 r8 = com.google.android.gms.internal.measurement.C4710c4.DOUBLE_LIST_PACKED
            int r8 = r8.mo18886a()
            if (r4 < r8) goto L_0x0542
            com.google.android.gms.internal.measurement.c4 r8 = com.google.android.gms.internal.measurement.C4710c4.SINT64_LIST_PACKED
            int r8 = r8.mo18886a()
            if (r4 > r8) goto L_0x0542
            int[] r8 = r0.f14466a
            int r9 = r3 + 2
            r8 = r8[r9]
            r11 = r8 & r7
            goto L_0x0543
        L_0x0542:
            r11 = 0
        L_0x0543:
            r18 = 0
        L_0x0545:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0a1e;
                case 1: goto L_0x0a0d;
                case 2: goto L_0x09fb;
                case 3: goto L_0x09ea;
                case 4: goto L_0x09d9;
                case 5: goto L_0x09cc;
                case 6: goto L_0x09bf;
                case 7: goto L_0x09b3;
                case 8: goto L_0x0997;
                case 9: goto L_0x0985;
                case 10: goto L_0x0976;
                case 11: goto L_0x0969;
                case 12: goto L_0x095c;
                case 13: goto L_0x0951;
                case 14: goto L_0x0946;
                case 15: goto L_0x0939;
                case 16: goto L_0x092c;
                case 17: goto L_0x0919;
                case 18: goto L_0x0905;
                case 19: goto L_0x08f5;
                case 20: goto L_0x08e9;
                case 21: goto L_0x08dd;
                case 22: goto L_0x08d1;
                case 23: goto L_0x08c5;
                case 24: goto L_0x08b9;
                case 25: goto L_0x08ad;
                case 26: goto L_0x08a2;
                case 27: goto L_0x0892;
                case 28: goto L_0x0886;
                case 29: goto L_0x0879;
                case 30: goto L_0x086c;
                case 31: goto L_0x085f;
                case 32: goto L_0x0852;
                case 33: goto L_0x0845;
                case 34: goto L_0x0838;
                case 35: goto L_0x0818;
                case 36: goto L_0x07fb;
                case 37: goto L_0x07de;
                case 38: goto L_0x07c1;
                case 39: goto L_0x07a3;
                case 40: goto L_0x0785;
                case 41: goto L_0x0767;
                case 42: goto L_0x0749;
                case 43: goto L_0x072b;
                case 44: goto L_0x070d;
                case 45: goto L_0x06ef;
                case 46: goto L_0x06d1;
                case 47: goto L_0x06b3;
                case 48: goto L_0x0695;
                case 49: goto L_0x0685;
                case 50: goto L_0x0675;
                case 51: goto L_0x0667;
                case 52: goto L_0x065a;
                case 53: goto L_0x064a;
                case 54: goto L_0x063a;
                case 55: goto L_0x062a;
                case 56: goto L_0x061c;
                case 57: goto L_0x060f;
                case 58: goto L_0x0602;
                case 59: goto L_0x05e4;
                case 60: goto L_0x05d0;
                case 61: goto L_0x05be;
                case 62: goto L_0x05ae;
                case 63: goto L_0x059e;
                case 64: goto L_0x0591;
                case 65: goto L_0x0583;
                case 66: goto L_0x0573;
                case 67: goto L_0x0563;
                case 68: goto L_0x054d;
                default: goto L_0x054b;
            }
        L_0x054b:
            goto L_0x0911
        L_0x054d:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.r5 r4 = (com.google.android.gms.internal.measurement.C4945r5) r4
            com.google.android.gms.internal.measurement.h6 r8 = r0.m21653a(r3)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21938c(r15, r4, r8)
            goto L_0x0910
        L_0x0563:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m21681e(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21950f(r15, r8)
            goto L_0x0910
        L_0x0573:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m21679d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21957h(r15, r4)
            goto L_0x0910
        L_0x0583:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzek.m21958h(r15, r8)
            goto L_0x0910
        L_0x0591:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzek.m21964j(r15, r4)
            goto L_0x095a
        L_0x059e:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m21679d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21966k(r15, r4)
            goto L_0x0910
        L_0x05ae:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m21679d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21953g(r15, r4)
            goto L_0x0910
        L_0x05be:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C5070z2) r4
            int r4 = com.google.android.gms.internal.measurement.zzek.m21939c(r15, r4)
            goto L_0x0910
        L_0x05d0:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.h6 r8 = r0.m21653a(r3)
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20403a(r15, r4, r8)
            goto L_0x0910
        L_0x05e4:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.measurement.C5070z2
            if (r8 == 0) goto L_0x05fa
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C5070z2) r4
            int r4 = com.google.android.gms.internal.measurement.zzek.m21939c(r15, r4)
            goto L_0x0910
        L_0x05fa:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzek.m21931b(r15, r4)
            goto L_0x0910
        L_0x0602:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = com.google.android.gms.internal.measurement.zzek.m21932b(r15, r4)
            goto L_0x095a
        L_0x060f:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzek.m21961i(r15, r4)
            goto L_0x095a
        L_0x061c:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzek.m21954g(r15, r8)
            goto L_0x0910
        L_0x062a:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m21679d(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21949f(r15, r4)
            goto L_0x0910
        L_0x063a:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m21681e(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21946e(r15, r8)
            goto L_0x0910
        L_0x064a:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m21681e(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21942d(r15, r8)
            goto L_0x0910
        L_0x065a:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzek.m21927b(r15, r4)
            goto L_0x095a
        L_0x0667:
            boolean r4 = r0.m21665a((T) r1, r15, r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzek.m21926b(r15, r8)
            goto L_0x0910
        L_0x0675:
            com.google.android.gms.internal.measurement.k5 r4 = r0.f14482q
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m21670b(r3)
            int r4 = r4.mo19173a(r15, r8, r9)
            goto L_0x0910
        L_0x0685:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.h6 r8 = r0.m21653a(r3)
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20421b(r15, r4, r8)
            goto L_0x0910
        L_0x0695:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20429c(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x06a9
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06a9:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x06b3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20444g(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x06c7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06c7:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x06d1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20450i(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x06e5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06e5:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x06ef:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20447h(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x0703
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0703:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x070d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20433d(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x0721
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0721:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x072b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20441f(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x073f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x073f:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x0749:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20453j(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x075d
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x075d:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x0767:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20447h(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x077b
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x077b:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x0785:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20450i(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x0799
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0799:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x07a3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20437e(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x07b7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07b7:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x07c1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20423b(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x07d5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07d5:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x07de:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20407a(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x07f2
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07f2:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x07fb:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20447h(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x080f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x080f:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
            goto L_0x0834
        L_0x0818:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20450i(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f14474i
            if (r8 == 0) goto L_0x082c
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x082c:
            int r8 = com.google.android.gms.internal.measurement.zzek.m21945e(r15)
            int r9 = com.google.android.gms.internal.measurement.zzek.m21952g(r4)
        L_0x0834:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x095a
        L_0x0838:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20428c(r15, r4, r10)
            goto L_0x0900
        L_0x0845:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20443g(r15, r4, r10)
            goto L_0x0900
        L_0x0852:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20449i(r15, r4, r10)
            goto L_0x0900
        L_0x085f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20446h(r15, r4, r10)
            goto L_0x0900
        L_0x086c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20432d(r15, r4, r10)
            goto L_0x0900
        L_0x0879:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20440f(r15, r4, r10)
            goto L_0x0910
        L_0x0886:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20420b(r15, r4)
            goto L_0x0910
        L_0x0892:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.h6 r8 = r0.m21653a(r3)
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20405a(r15, r4, r8)
            goto L_0x0910
        L_0x08a2:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20404a(r15, r4)
            goto L_0x0910
        L_0x08ad:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20452j(r15, r4, r10)
            goto L_0x0900
        L_0x08b9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20446h(r15, r4, r10)
            goto L_0x0900
        L_0x08c5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20449i(r15, r4, r10)
            goto L_0x0900
        L_0x08d1:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20436e(r15, r4, r10)
            goto L_0x0900
        L_0x08dd:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20422b(r15, r4, r10)
            goto L_0x0900
        L_0x08e9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20406a(r15, r4, r10)
            goto L_0x0900
        L_0x08f5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20446h(r15, r4, r10)
        L_0x0900:
            int r5 = r5 + r4
            r4 = 1
        L_0x0902:
            r7 = 0
            goto L_0x0915
        L_0x0905:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20449i(r15, r4, r10)
        L_0x0910:
            int r5 = r5 + r4
        L_0x0911:
            r4 = 1
        L_0x0912:
            r7 = 0
            r10 = 0
        L_0x0915:
            r13 = 0
            goto L_0x0a2e
        L_0x0919:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.r5 r4 = (com.google.android.gms.internal.measurement.C4945r5) r4
            com.google.android.gms.internal.measurement.h6 r8 = r0.m21653a(r3)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21938c(r15, r4, r8)
            goto L_0x0910
        L_0x092c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            long r8 = r2.getLong(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21950f(r15, r8)
            goto L_0x0910
        L_0x0939:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21957h(r15, r4)
            goto L_0x0910
        L_0x0946:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = com.google.android.gms.internal.measurement.zzek.m21958h(r15, r8)
            goto L_0x0910
        L_0x0951:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = com.google.android.gms.internal.measurement.zzek.m21964j(r15, r4)
        L_0x095a:
            int r5 = r5 + r8
            goto L_0x0911
        L_0x095c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21966k(r15, r4)
            goto L_0x0910
        L_0x0969:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = com.google.android.gms.internal.measurement.zzek.m21953g(r15, r4)
            goto L_0x0910
        L_0x0976:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C5070z2) r4
            int r4 = com.google.android.gms.internal.measurement.zzek.m21939c(r15, r4)
            goto L_0x0910
        L_0x0985:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            com.google.android.gms.internal.measurement.h6 r8 = r0.m21653a(r3)
            int r4 = com.google.android.gms.internal.measurement.C4821j6.m20403a(r15, r4, r8)
            goto L_0x0910
        L_0x0997:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof com.google.android.gms.internal.measurement.C5070z2
            if (r8 == 0) goto L_0x09ab
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C5070z2) r4
            int r4 = com.google.android.gms.internal.measurement.zzek.m21939c(r15, r4)
            goto L_0x0910
        L_0x09ab:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zzek.m21931b(r15, r4)
            goto L_0x0910
        L_0x09b3:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = com.google.android.gms.internal.measurement.zzek.m21932b(r15, r4)
            int r5 = r5 + r8
            goto L_0x0912
        L_0x09bf:
            r4 = 1
            r8 = r12 & r18
            r10 = 0
            if (r8 == 0) goto L_0x0902
            int r8 = com.google.android.gms.internal.measurement.zzek.m21961i(r15, r10)
            int r5 = r5 + r8
            goto L_0x0902
        L_0x09cc:
            r4 = 1
            r10 = 0
            r8 = r12 & r18
            r13 = 0
            if (r8 == 0) goto L_0x0a1b
            int r8 = com.google.android.gms.internal.measurement.zzek.m21954g(r15, r13)
            goto L_0x0a0b
        L_0x09d9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.zzek.m21949f(r15, r8)
            goto L_0x0a0b
        L_0x09ea:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.zzek.m21946e(r15, r8)
            goto L_0x0a0b
        L_0x09fb:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.measurement.zzek.m21942d(r15, r8)
        L_0x0a0b:
            int r5 = r5 + r8
            goto L_0x0a1b
        L_0x0a0d:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r18
            if (r8 == 0) goto L_0x0a1b
            r8 = 0
            int r9 = com.google.android.gms.internal.measurement.zzek.m21927b(r15, r8)
            int r5 = r5 + r9
        L_0x0a1b:
            r7 = 0
            goto L_0x0a2e
        L_0x0a1e:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a1b
            r7 = 0
            int r11 = com.google.android.gms.internal.measurement.zzek.m21926b(r15, r7)
            int r5 = r5 + r11
        L_0x0a2e:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x04f9
        L_0x0a39:
            r10 = 0
            com.google.android.gms.internal.measurement.z6<?, ?> r2 = r0.f14480o
            int r2 = m21648a(r2, (T) r1)
            int r5 = r5 + r2
            boolean r2 = r0.f14471f
            if (r2 == 0) goto L_0x0a93
            com.google.android.gms.internal.measurement.w3<?> r2 = r0.f14481p
            com.google.android.gms.internal.measurement.x3 r1 = r2.mo19711a(r1)
            r2 = 0
        L_0x0a4c:
            com.google.android.gms.internal.measurement.m6<T, java.lang.Object> r3 = r1.f14506a
            int r3 = r3.mo19300c()
            if (r10 >= r3) goto L_0x0a6c
            com.google.android.gms.internal.measurement.m6<T, java.lang.Object> r3 = r1.f14506a
            java.util.Map$Entry r3 = r3.mo19298a(r10)
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.measurement.z3 r4 = (com.google.android.gms.internal.measurement.C5071z3) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.measurement.C5045x3.m21775a(r4, r3)
            int r2 = r2 + r3
            int r10 = r10 + 1
            goto L_0x0a4c
        L_0x0a6c:
            com.google.android.gms.internal.measurement.m6<T, java.lang.Object> r1 = r1.f14506a
            java.lang.Iterable r1 = r1.mo19303d()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a76:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a92
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.measurement.z3 r4 = (com.google.android.gms.internal.measurement.C5071z3) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.measurement.C5045x3.m21775a(r4, r3)
            int r2 = r2 + r3
            goto L_0x0a76
        L_0x0a92:
            int r5 = r5 + r2
        L_0x0a93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19037d(java.lang.Object):int");
    }

    /* renamed from: c */
    public final void mo19036c(T t) {
        int i;
        int i2 = this.f14476k;
        while (true) {
            i = this.f14477l;
            if (i2 >= i) {
                break;
            }
            long d = (long) (m21678d(this.f14475j[i2]) & 1048575);
            Object f = C4759f7.m20173f(t, d);
            if (f != null) {
                C4759f7.m20151a((Object) t, d, this.f14482q.mo19176b(f));
            }
            i2++;
        }
        int length = this.f14475j.length;
        while (i < length) {
            this.f14479n.mo18828b(t, (long) this.f14475j[i]);
            i++;
        }
        this.f14480o.mo18844d(t);
        if (this.f14471f) {
            this.f14481p.mo19719c(t);
        }
    }

    /* renamed from: e */
    private final int m21680e(int i) {
        return this.f14466a[i + 2];
    }

    /* renamed from: e */
    private static <T> long m21681e(T t, long j) {
        return ((Long) C4759f7.m20173f(t, j)).longValue();
    }

    /* renamed from: c */
    private static <T> float m21675c(T t, long j) {
        return ((Float) C4759f7.m20173f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final boolean m21677c(T t, T t2, int i) {
        return m21664a(t, i) == m21664a(t2, i);
    }

    /* renamed from: b */
    private final void m21674b(T t, T t2, int i) {
        int d = m21678d(i);
        int i2 = this.f14466a[i];
        long j = (long) (d & 1048575);
        if (m21665a(t2, i2, i)) {
            Object f = C4759f7.m20173f(t, j);
            Object f2 = C4759f7.m20173f(t2, j);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C4759f7.m20151a((Object) t, j, f2);
                    m21672b(t, i2, i);
                }
                return;
            }
            C4759f7.m20151a((Object) t, j, C4819j4.m20395a(f, f2));
            m21672b(t, i2, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21673b(T r19, com.google.android.gms.internal.measurement.C5036w7 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f14471f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.measurement.w3<?> r3 = r0.f14481p
            com.google.android.gms.internal.measurement.x3 r3 = r3.mo19711a(r1)
            com.google.android.gms.internal.measurement.m6<T, java.lang.Object> r5 = r3.f14506a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo19742c()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.f14466a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f14465s
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002e:
            if (r5 >= r7) goto L_0x04ad
            int r12 = r0.m21678d(r5)
            int[] r13 = r0.f14466a
            r14 = r13[r5]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f14473h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0062
            r4 = 17
            if (r15 > r4) goto L_0x0062
            int r4 = r5 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0058
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            goto L_0x0059
        L_0x0058:
            r13 = r6
        L_0x0059:
            int r4 = r4 >>> 20
            r6 = 1
            int r9 = r6 << r4
            r6 = r13
            r10 = r17
            goto L_0x0067
        L_0x0062:
            r17 = r10
            r10 = r17
            r9 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0086
            com.google.android.gms.internal.measurement.w3<?> r4 = r0.f14481p
            int r4 = r4.mo19710a(r10)
            if (r4 > r14) goto L_0x0086
            com.google.android.gms.internal.measurement.w3<?> r4 = r0.f14481p
            r4.mo19715a(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0067
        L_0x0084:
            r10 = 0
            goto L_0x0067
        L_0x0086:
            r4 = r12 & r16
            long r12 = (long) r4
            switch(r15) {
                case 0: goto L_0x049d;
                case 1: goto L_0x0490;
                case 2: goto L_0x0483;
                case 3: goto L_0x0476;
                case 4: goto L_0x0469;
                case 5: goto L_0x045c;
                case 6: goto L_0x044f;
                case 7: goto L_0x0442;
                case 8: goto L_0x0434;
                case 9: goto L_0x0422;
                case 10: goto L_0x0412;
                case 11: goto L_0x0404;
                case 12: goto L_0x03f6;
                case 13: goto L_0x03e8;
                case 14: goto L_0x03da;
                case 15: goto L_0x03cc;
                case 16: goto L_0x03be;
                case 17: goto L_0x03ac;
                case 18: goto L_0x039c;
                case 19: goto L_0x038c;
                case 20: goto L_0x037c;
                case 21: goto L_0x036c;
                case 22: goto L_0x035c;
                case 23: goto L_0x034c;
                case 24: goto L_0x033c;
                case 25: goto L_0x032c;
                case 26: goto L_0x031d;
                case 27: goto L_0x030a;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02eb;
                case 30: goto L_0x02db;
                case 31: goto L_0x02cb;
                case 32: goto L_0x02bb;
                case 33: goto L_0x02ab;
                case 34: goto L_0x029b;
                case 35: goto L_0x028b;
                case 36: goto L_0x027b;
                case 37: goto L_0x026b;
                case 38: goto L_0x025b;
                case 39: goto L_0x024b;
                case 40: goto L_0x023b;
                case 41: goto L_0x022b;
                case 42: goto L_0x021b;
                case 43: goto L_0x020b;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01eb;
                case 46: goto L_0x01db;
                case 47: goto L_0x01cb;
                case 48: goto L_0x01bb;
                case 49: goto L_0x01a8;
                case 50: goto L_0x019f;
                case 51: goto L_0x0190;
                case 52: goto L_0x0181;
                case 53: goto L_0x0172;
                case 54: goto L_0x0163;
                case 55: goto L_0x0154;
                case 56: goto L_0x0145;
                case 57: goto L_0x0136;
                case 58: goto L_0x0127;
                case 59: goto L_0x0118;
                case 60: goto L_0x0105;
                case 61: goto L_0x00f5;
                case 62: goto L_0x00e7;
                case 63: goto L_0x00d9;
                case 64: goto L_0x00cb;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00af;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r15 = 0
            goto L_0x04a9
        L_0x008f:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.h6 r9 = r0.m21653a(r5)
            r2.mo19409a(r14, r4, r9)
            goto L_0x008c
        L_0x00a1:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m21681e(r1, r12)
            r2.mo19429e(r14, r12)
            goto L_0x008c
        L_0x00af:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m21679d(r1, r12)
            r2.mo19424d(r14, r4)
            goto L_0x008c
        L_0x00bd:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m21681e(r1, r12)
            r2.mo19405a(r14, r12)
            goto L_0x008c
        L_0x00cb:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m21679d(r1, r12)
            r2.mo19421c(r14, r4)
            goto L_0x008c
        L_0x00d9:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m21679d(r1, r12)
            r2.mo19404a(r14, r4)
            goto L_0x008c
        L_0x00e7:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m21679d(r1, r12)
            r2.mo19431f(r14, r4)
            goto L_0x008c
        L_0x00f5:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C5070z2) r4
            r2.mo19407a(r14, r4)
            goto L_0x008c
        L_0x0105:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.h6 r9 = r0.m21653a(r5)
            r2.mo19417b(r14, r4, r9)
            goto L_0x008c
        L_0x0118:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            m21659a(r14, r4, r2)
            goto L_0x008c
        L_0x0127:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            boolean r4 = m21684f(r1, r12)
            r2.mo19414a(r14, r4)
            goto L_0x008c
        L_0x0136:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m21679d(r1, r12)
            r2.mo19428e(r14, r4)
            goto L_0x008c
        L_0x0145:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m21681e(r1, r12)
            r2.mo19425d(r14, r12)
            goto L_0x008c
        L_0x0154:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m21679d(r1, r12)
            r2.mo19415b(r14, r4)
            goto L_0x008c
        L_0x0163:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m21681e(r1, r12)
            r2.mo19416b(r14, r12)
            goto L_0x008c
        L_0x0172:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m21681e(r1, r12)
            r2.mo19422c(r14, r12)
            goto L_0x008c
        L_0x0181:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            float r4 = m21675c(r1, r12)
            r2.mo19403a(r14, r4)
            goto L_0x008c
        L_0x0190:
            boolean r4 = r0.m21665a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            double r12 = m21668b((T) r1, r12)
            r2.mo19402a(r14, r12)
            goto L_0x008c
        L_0x019f:
            java.lang.Object r4 = r8.getObject(r1, r12)
            r0.m21660a(r2, r14, r4, r5)
            goto L_0x008c
        L_0x01a8:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.h6 r12 = r0.m21653a(r5)
            com.google.android.gms.internal.measurement.C4821j6.m20426b(r4, r9, r2, r12)
            goto L_0x008c
        L_0x01bb:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 1
            com.google.android.gms.internal.measurement.C4821j6.m20439e(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01cb:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20454j(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01db:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20445g(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01eb:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20456l(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01fb:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20457m(r4, r9, r2, r14)
            goto L_0x008c
        L_0x020b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20451i(r4, r9, r2, r14)
            goto L_0x008c
        L_0x021b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20458n(r4, r9, r2, r14)
            goto L_0x008c
        L_0x022b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20455k(r4, r9, r2, r14)
            goto L_0x008c
        L_0x023b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20442f(r4, r9, r2, r14)
            goto L_0x008c
        L_0x024b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20448h(r4, r9, r2, r14)
            goto L_0x008c
        L_0x025b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20435d(r4, r9, r2, r14)
            goto L_0x008c
        L_0x026b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20431c(r4, r9, r2, r14)
            goto L_0x008c
        L_0x027b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20427b(r4, r9, r2, r14)
            goto L_0x008c
        L_0x028b:
            r14 = 1
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20414a(r4, r9, r2, r14)
            goto L_0x008c
        L_0x029b:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 0
            com.google.android.gms.internal.measurement.C4821j6.m20439e(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02ab:
            r14 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20454j(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02bb:
            r14 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20445g(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02cb:
            r14 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20456l(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02db:
            r14 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20457m(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02eb:
            r14 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20451i(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02fb:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20425b(r4, r9, r2)
            goto L_0x008c
        L_0x030a:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.h6 r12 = r0.m21653a(r5)
            com.google.android.gms.internal.measurement.C4821j6.m20413a(r4, r9, r2, r12)
            goto L_0x008c
        L_0x031d:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20412a(r4, r9, r2)
            goto L_0x008c
        L_0x032c:
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r15 = 0
            com.google.android.gms.internal.measurement.C4821j6.m20458n(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x033c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20455k(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x034c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20442f(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x035c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20448h(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x036c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20435d(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x037c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20431c(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x038c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20427b(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x039c:
            r15 = 0
            int[] r4 = r0.f14466a
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20414a(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x03ac:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.h6 r9 = r0.m21653a(r5)
            r2.mo19409a(r14, r4, r9)
            goto L_0x04a9
        L_0x03be:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.mo19429e(r14, r12)
            goto L_0x04a9
        L_0x03cc:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.mo19424d(r14, r4)
            goto L_0x04a9
        L_0x03da:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.mo19405a(r14, r12)
            goto L_0x04a9
        L_0x03e8:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.mo19421c(r14, r4)
            goto L_0x04a9
        L_0x03f6:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.mo19404a(r14, r4)
            goto L_0x04a9
        L_0x0404:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.mo19431f(r14, r4)
            goto L_0x04a9
        L_0x0412:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.z2 r4 = (com.google.android.gms.internal.measurement.C5070z2) r4
            r2.mo19407a(r14, r4)
            goto L_0x04a9
        L_0x0422:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.measurement.h6 r9 = r0.m21653a(r5)
            r2.mo19417b(r14, r4, r9)
            goto L_0x04a9
        L_0x0434:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            m21659a(r14, r4, r2)
            goto L_0x04a9
        L_0x0442:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            boolean r4 = com.google.android.gms.internal.measurement.C4759f7.m20164c(r1, r12)
            r2.mo19414a(r14, r4)
            goto L_0x04a9
        L_0x044f:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.mo19428e(r14, r4)
            goto L_0x04a9
        L_0x045c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.mo19425d(r14, r12)
            goto L_0x04a9
        L_0x0469:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.mo19415b(r14, r4)
            goto L_0x04a9
        L_0x0476:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.mo19416b(r14, r12)
            goto L_0x04a9
        L_0x0483:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.mo19422c(r14, r12)
            goto L_0x04a9
        L_0x0490:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            float r4 = com.google.android.gms.internal.measurement.C4759f7.m20165d(r1, r12)
            r2.mo19403a(r14, r4)
            goto L_0x04a9
        L_0x049d:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            double r12 = com.google.android.gms.internal.measurement.C4759f7.m20170e(r1, r12)
            r2.mo19402a(r14, r12)
        L_0x04a9:
            int r5 = r5 + 3
            goto L_0x002e
        L_0x04ad:
            r17 = r10
            r4 = r17
        L_0x04b1:
            if (r4 == 0) goto L_0x04c7
            com.google.android.gms.internal.measurement.w3<?> r5 = r0.f14481p
            r5.mo19715a(r2, r4)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c5
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x04b1
        L_0x04c5:
            r4 = 0
            goto L_0x04b1
        L_0x04c7:
            com.google.android.gms.internal.measurement.z6<?, ?> r3 = r0.f14480o
            m21661a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.m21673b(java.lang.Object, com.google.android.gms.internal.measurement.w7):void");
    }

    /* renamed from: a */
    private static Field m21657a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public final T mo19029a() {
        return this.f14478m.mo19755a(this.f14470e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.C4821j6.m20419a(com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6), com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.C4821j6.m20419a(com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6), com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.C4821j6.m20419a(com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6), com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.C4821j6.m20419a(com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6), com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20164c(r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20164c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20143a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6) == com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C4759f7.m20165d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C4759f7.m20165d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C4759f7.m20170e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C4759f7.m20170e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.C4821j6.m20419a(com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6), com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19033a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f14466a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m21678d(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m21680e(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C4821j6.m20419a(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.C4759f7.m20164c(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C4759f7.m20164c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.C4759f7.m20165d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C4759f7.m20165d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m21677c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.C4759f7.m20170e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C4759f7.m20170e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.measurement.z6<?, ?> r0 = r9.f14480o
            java.lang.Object r0 = r0.mo18838b(r10)
            com.google.android.gms.internal.measurement.z6<?, ?> r2 = r9.f14480o
            java.lang.Object r2 = r2.mo18838b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f14471f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.w3<?> r0 = r9.f14481p
            com.google.android.gms.internal.measurement.x3 r10 = r0.mo19711a(r10)
            com.google.android.gms.internal.measurement.w3<?> r0 = r9.f14481p
            com.google.android.gms.internal.measurement.x3 r11 = r0.mo19711a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19033a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19028a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f14466a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m21678d(r1)
            int[] r4 = r8.f14466a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m21681e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m21679d(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m21681e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m21679d(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m21679d(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m21679d(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m21684f(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20393a(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m21679d(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m21681e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m21679d(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m21681e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m21681e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m21675c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m21665a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m21668b((T) r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C4759f7.m20164c(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20393a(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C4759f7.m20165d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C4759f7.m20170e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C4819j4.m20392a(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.z6<?, ?> r0 = r8.f14480o
            java.lang.Object r0 = r0.mo18838b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f14471f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.w3<?> r0 = r8.f14481p
            com.google.android.gms.internal.measurement.x3 r9 = r0.mo19711a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19028a(java.lang.Object):int");
    }

    /* renamed from: a */
    private final void m21663a(T t, T t2, int i) {
        long d = (long) (m21678d(i) & 1048575);
        if (m21664a(t2, i)) {
            Object f = C4759f7.m20173f(t, d);
            Object f2 = C4759f7.m20173f(t2, d);
            if (f == null || f2 == null) {
                if (f2 != null) {
                    C4759f7.m20151a((Object) t, d, f2);
                    m21671b(t, i);
                }
                return;
            }
            C4759f7.m20151a((Object) t, d, C4819j4.m20395a(f, f2));
            m21671b(t, i);
        }
    }

    /* renamed from: a */
    private static <UT, UB> int m21648a(C5074z6<UT, UB> z6Var, T t) {
        return z6Var.mo18846f(z6Var.mo18838b(t));
    }

    /* renamed from: a */
    private static List<?> m21658a(Object obj, long j) {
        return (List) C4759f7.m20173f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19031a(T r14, com.google.android.gms.internal.measurement.C5036w7 r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo19400a()
            int r1 = com.google.android.gms.internal.measurement.C4801i4.C4805d.f14199m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.measurement.z6<?, ?> r0 = r13.f14480o
            m21661a(r0, (T) r14, r15)
            boolean r0 = r13.f14471f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.w3<?> r0 = r13.f14481p
            com.google.android.gms.internal.measurement.x3 r0 = r0.mo19711a(r14)
            com.google.android.gms.internal.measurement.m6<T, java.lang.Object> r1 = r0.f14506a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo19744d()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f14466a
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.m21678d(r7)
            int[] r9 = r13.f14466a
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.measurement.w3<?> r10 = r13.f14481p
            int r10 = r10.mo19710a(r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.measurement.w3<?> r10 = r13.f14481p
            r10.mo19715a(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            com.google.android.gms.internal.measurement.h6 r10 = r13.m21653a(r7)
            r15.mo19409a(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m21681e(r14, r10)
            r15.mo19429e(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m21679d(r14, r10)
            r15.mo19424d(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m21681e(r14, r10)
            r15.mo19405a(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m21679d(r14, r10)
            r15.mo19421c(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m21679d(r14, r10)
            r15.mo19404a(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m21679d(r14, r10)
            r15.mo19431f(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            com.google.android.gms.internal.measurement.z2 r8 = (com.google.android.gms.internal.measurement.C5070z2) r8
            r15.mo19407a(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            com.google.android.gms.internal.measurement.h6 r10 = r13.m21653a(r7)
            r15.mo19417b(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            m21659a(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m21684f(r14, r10)
            r15.mo19414a(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m21679d(r14, r10)
            r15.mo19428e(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m21681e(r14, r10)
            r15.mo19425d(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m21679d(r14, r10)
            r15.mo19415b(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m21681e(r14, r10)
            r15.mo19416b(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m21681e(r14, r10)
            r15.mo19422c(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m21675c(r14, r10)
            r15.mo19403a(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.m21665a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m21668b((T) r14, r10)
            r15.mo19402a(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            r13.m21660a(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.h6 r10 = r13.m21653a(r7)
            com.google.android.gms.internal.measurement.C4821j6.m20426b(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20439e(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20454j(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20445g(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20456l(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20457m(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20451i(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20458n(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20455k(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20442f(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20448h(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20435d(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20431c(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20427b(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20414a(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20439e(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20454j(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20445g(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20456l(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20457m(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20451i(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20425b(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.h6 r10 = r13.m21653a(r7)
            com.google.android.gms.internal.measurement.C4821j6.m20413a(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20412a(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20458n(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20455k(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20442f(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20448h(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20435d(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20431c(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20427b(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f14466a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C4821j6.m20414a(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            com.google.android.gms.internal.measurement.h6 r10 = r13.m21653a(r7)
            r15.mo19409a(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r10)
            r15.mo19429e(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r10)
            r15.mo19424d(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r10)
            r15.mo19405a(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r10)
            r15.mo19421c(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r10)
            r15.mo19404a(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r10)
            r15.mo19431f(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            com.google.android.gms.internal.measurement.z2 r8 = (com.google.android.gms.internal.measurement.C5070z2) r8
            r15.mo19407a(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            com.google.android.gms.internal.measurement.h6 r10 = r13.m21653a(r7)
            r15.mo19417b(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r10)
            m21659a(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C4759f7.m20164c(r14, r10)
            r15.mo19414a(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r10)
            r15.mo19428e(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r10)
            r15.mo19425d(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r10)
            r15.mo19415b(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r10)
            r15.mo19416b(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r10)
            r15.mo19422c(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C4759f7.m20165d(r14, r10)
            r15.mo19403a(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.m21664a((T) r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.measurement.C4759f7.m20170e(r14, r10)
            r15.mo19402a(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.measurement.w3<?> r14 = r13.f14481p
            r14.mo19715a(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f14473h
            if (r0 == 0) goto L_0x0a46
            boolean r0 = r13.f14471f
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.measurement.w3<?> r0 = r13.f14481p
            com.google.android.gms.internal.measurement.x3 r0 = r0.mo19711a(r14)
            com.google.android.gms.internal.measurement.m6<T, java.lang.Object> r1 = r0.f14506a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.mo19742c()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f14466a
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x0551:
            if (r1 >= r7) goto L_0x0a29
            int r9 = r13.m21678d(r1)
            int[] r10 = r13.f14466a
            r10 = r10[r1]
        L_0x055b:
            if (r8 == 0) goto L_0x0579
            com.google.android.gms.internal.measurement.w3<?> r11 = r13.f14481p
            int r11 = r11.mo19710a(r8)
            if (r11 > r10) goto L_0x0579
            com.google.android.gms.internal.measurement.w3<?> r11 = r13.f14481p
            r11.mo19715a(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0577
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x055b
        L_0x0577:
            r8 = r3
            goto L_0x055b
        L_0x0579:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a16;
                case 1: goto L_0x0a06;
                case 2: goto L_0x09f6;
                case 3: goto L_0x09e6;
                case 4: goto L_0x09d6;
                case 5: goto L_0x09c6;
                case 6: goto L_0x09b6;
                case 7: goto L_0x09a5;
                case 8: goto L_0x0994;
                case 9: goto L_0x097f;
                case 10: goto L_0x096c;
                case 11: goto L_0x095b;
                case 12: goto L_0x094a;
                case 13: goto L_0x0939;
                case 14: goto L_0x0928;
                case 15: goto L_0x0917;
                case 16: goto L_0x0906;
                case 17: goto L_0x08f1;
                case 18: goto L_0x08e0;
                case 19: goto L_0x08cf;
                case 20: goto L_0x08be;
                case 21: goto L_0x08ad;
                case 22: goto L_0x089c;
                case 23: goto L_0x088b;
                case 24: goto L_0x087a;
                case 25: goto L_0x0869;
                case 26: goto L_0x0858;
                case 27: goto L_0x0843;
                case 28: goto L_0x0832;
                case 29: goto L_0x0821;
                case 30: goto L_0x0810;
                case 31: goto L_0x07ff;
                case 32: goto L_0x07ee;
                case 33: goto L_0x07dd;
                case 34: goto L_0x07cc;
                case 35: goto L_0x07bb;
                case 36: goto L_0x07aa;
                case 37: goto L_0x0799;
                case 38: goto L_0x0788;
                case 39: goto L_0x0777;
                case 40: goto L_0x0766;
                case 41: goto L_0x0755;
                case 42: goto L_0x0744;
                case 43: goto L_0x0733;
                case 44: goto L_0x0722;
                case 45: goto L_0x0711;
                case 46: goto L_0x0700;
                case 47: goto L_0x06ef;
                case 48: goto L_0x06de;
                case 49: goto L_0x06c9;
                case 50: goto L_0x06be;
                case 51: goto L_0x06ad;
                case 52: goto L_0x069c;
                case 53: goto L_0x068b;
                case 54: goto L_0x067a;
                case 55: goto L_0x0669;
                case 56: goto L_0x0658;
                case 57: goto L_0x0647;
                case 58: goto L_0x0636;
                case 59: goto L_0x0625;
                case 60: goto L_0x0610;
                case 61: goto L_0x05fd;
                case 62: goto L_0x05ec;
                case 63: goto L_0x05db;
                case 64: goto L_0x05ca;
                case 65: goto L_0x05b9;
                case 66: goto L_0x05a8;
                case 67: goto L_0x0597;
                case 68: goto L_0x0582;
                default: goto L_0x0580;
            }
        L_0x0580:
            goto L_0x0a25
        L_0x0582:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            com.google.android.gms.internal.measurement.h6 r11 = r13.m21653a(r1)
            r15.mo19409a(r10, r9, r11)
            goto L_0x0a25
        L_0x0597:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m21681e(r14, r11)
            r15.mo19429e(r10, r11)
            goto L_0x0a25
        L_0x05a8:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m21679d(r14, r11)
            r15.mo19424d(r10, r9)
            goto L_0x0a25
        L_0x05b9:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m21681e(r14, r11)
            r15.mo19405a(r10, r11)
            goto L_0x0a25
        L_0x05ca:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m21679d(r14, r11)
            r15.mo19421c(r10, r9)
            goto L_0x0a25
        L_0x05db:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m21679d(r14, r11)
            r15.mo19404a(r10, r9)
            goto L_0x0a25
        L_0x05ec:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m21679d(r14, r11)
            r15.mo19431f(r10, r9)
            goto L_0x0a25
        L_0x05fd:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            com.google.android.gms.internal.measurement.z2 r9 = (com.google.android.gms.internal.measurement.C5070z2) r9
            r15.mo19407a(r10, r9)
            goto L_0x0a25
        L_0x0610:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            com.google.android.gms.internal.measurement.h6 r11 = r13.m21653a(r1)
            r15.mo19417b(r10, r9, r11)
            goto L_0x0a25
        L_0x0625:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            m21659a(r10, r9, r15)
            goto L_0x0a25
        L_0x0636:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m21684f(r14, r11)
            r15.mo19414a(r10, r9)
            goto L_0x0a25
        L_0x0647:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m21679d(r14, r11)
            r15.mo19428e(r10, r9)
            goto L_0x0a25
        L_0x0658:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m21681e(r14, r11)
            r15.mo19425d(r10, r11)
            goto L_0x0a25
        L_0x0669:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m21679d(r14, r11)
            r15.mo19415b(r10, r9)
            goto L_0x0a25
        L_0x067a:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m21681e(r14, r11)
            r15.mo19416b(r10, r11)
            goto L_0x0a25
        L_0x068b:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m21681e(r14, r11)
            r15.mo19422c(r10, r11)
            goto L_0x0a25
        L_0x069c:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m21675c(r14, r11)
            r15.mo19403a(r10, r9)
            goto L_0x0a25
        L_0x06ad:
            boolean r11 = r13.m21665a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m21668b((T) r14, r11)
            r15.mo19402a(r10, r11)
            goto L_0x0a25
        L_0x06be:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            r13.m21660a(r15, r10, r9, r1)
            goto L_0x0a25
        L_0x06c9:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.h6 r11 = r13.m21653a(r1)
            com.google.android.gms.internal.measurement.C4821j6.m20426b(r10, r9, r15, r11)
            goto L_0x0a25
        L_0x06de:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20439e(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x06ef:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20454j(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0700:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20445g(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0711:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20456l(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0722:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20457m(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0733:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20451i(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0744:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20458n(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0755:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20455k(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0766:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20442f(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0777:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20448h(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0788:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20435d(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0799:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20431c(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07aa:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20427b(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07bb:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20414a(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07cc:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20439e(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07dd:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20454j(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07ee:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20445g(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07ff:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20456l(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0810:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20457m(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0821:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20451i(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0832:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20425b(r10, r9, r15)
            goto L_0x0a25
        L_0x0843:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.h6 r11 = r13.m21653a(r1)
            com.google.android.gms.internal.measurement.C4821j6.m20413a(r10, r9, r15, r11)
            goto L_0x0a25
        L_0x0858:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20412a(r10, r9, r15)
            goto L_0x0a25
        L_0x0869:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20458n(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x087a:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20455k(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x088b:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20442f(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x089c:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20448h(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08ad:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20435d(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08be:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20431c(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08cf:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20427b(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08e0:
            int[] r10 = r13.f14466a
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.C4821j6.m20414a(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08f1:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            com.google.android.gms.internal.measurement.h6 r11 = r13.m21653a(r1)
            r15.mo19409a(r10, r9, r11)
            goto L_0x0a25
        L_0x0906:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r11)
            r15.mo19429e(r10, r11)
            goto L_0x0a25
        L_0x0917:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r11)
            r15.mo19424d(r10, r9)
            goto L_0x0a25
        L_0x0928:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r11)
            r15.mo19405a(r10, r11)
            goto L_0x0a25
        L_0x0939:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r11)
            r15.mo19421c(r10, r9)
            goto L_0x0a25
        L_0x094a:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r11)
            r15.mo19404a(r10, r9)
            goto L_0x0a25
        L_0x095b:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r11)
            r15.mo19431f(r10, r9)
            goto L_0x0a25
        L_0x096c:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            com.google.android.gms.internal.measurement.z2 r9 = (com.google.android.gms.internal.measurement.C5070z2) r9
            r15.mo19407a(r10, r9)
            goto L_0x0a25
        L_0x097f:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            com.google.android.gms.internal.measurement.h6 r11 = r13.m21653a(r1)
            r15.mo19417b(r10, r9, r11)
            goto L_0x0a25
        L_0x0994:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r14, r11)
            m21659a(r10, r9, r15)
            goto L_0x0a25
        L_0x09a5:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.measurement.C4759f7.m20164c(r14, r11)
            r15.mo19414a(r10, r9)
            goto L_0x0a25
        L_0x09b6:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r11)
            r15.mo19428e(r10, r9)
            goto L_0x0a25
        L_0x09c6:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r11)
            r15.mo19425d(r10, r11)
            goto L_0x0a25
        L_0x09d6:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.measurement.C4759f7.m20143a(r14, r11)
            r15.mo19415b(r10, r9)
            goto L_0x0a25
        L_0x09e6:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r11)
            r15.mo19416b(r10, r11)
            goto L_0x0a25
        L_0x09f6:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.measurement.C4759f7.m20156b(r14, r11)
            r15.mo19422c(r10, r11)
            goto L_0x0a25
        L_0x0a06:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.measurement.C4759f7.m20165d(r14, r11)
            r15.mo19403a(r10, r9)
            goto L_0x0a25
        L_0x0a16:
            boolean r11 = r13.m21664a((T) r14, r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.measurement.C4759f7.m20170e(r14, r11)
            r15.mo19402a(r10, r11)
        L_0x0a25:
            int r1 = r1 + 3
            goto L_0x0551
        L_0x0a29:
            if (r8 == 0) goto L_0x0a40
            com.google.android.gms.internal.measurement.w3<?> r1 = r13.f14481p
            r1.mo19715a(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a29
        L_0x0a3e:
            r8 = r3
            goto L_0x0a29
        L_0x0a40:
            com.google.android.gms.internal.measurement.z6<?, ?> r0 = r13.f14480o
            m21661a(r0, (T) r14, r15)
            return
        L_0x0a46:
            r13.m21673b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19031a(java.lang.Object, com.google.android.gms.internal.measurement.w7):void");
    }

    /* renamed from: b */
    private final Object m21670b(int i) {
        return this.f14467b[(i / 3) << 1];
    }

    /* renamed from: b */
    public final boolean mo19035b(T t) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f14476k) {
                return !this.f14471f || this.f14481p.mo19711a((Object) t).mo19745e();
            }
            int i5 = this.f14475j[i2];
            int i6 = this.f14466a[i5];
            int d = m21678d(i5);
            if (!this.f14473h) {
                int i7 = this.f14466a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = f14465s.getInt(t, (long) i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & d) != 0) && !m21666a(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & d) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m21665a(t, i6, i5) && !m21667a((Object) t, d, m21653a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map d2 = this.f14482q.mo19178d(C4759f7.m20173f(t, (long) (d & 1048575)));
                            if (!d2.isEmpty()) {
                                if (this.f14482q.mo19179e(m21670b(i5)).f14203c.mo19396a() == C4996t7.MESSAGE) {
                                    C4790h6 h6Var = null;
                                    Iterator it = d2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (h6Var == null) {
                                            h6Var = C4712c6.m19997a().mo18887a(next.getClass());
                                        }
                                        if (!h6Var.mo19035b(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C4759f7.m20173f(t, (long) (d & 1048575));
                if (!list.isEmpty()) {
                    C4790h6 a = m21653a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!a.mo19035b(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m21666a(t, i5, i4, i) && !m21667a((Object) t, d, m21653a(i5))) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: b */
    private static <T> double m21668b(T t, long j) {
        return ((Double) C4759f7.m20173f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final void m21671b(T t, int i) {
        if (!this.f14473h) {
            int e = m21680e(i);
            long j = (long) (e & 1048575);
            C4759f7.m20149a((Object) t, j, C4759f7.m20143a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m21672b(T t, int i, int i2) {
        C4759f7.m20149a((Object) t, (long) (m21680e(i2) & 1048575), i);
    }

    /* renamed from: b */
    private final int m21669b(int i, int i2) {
        int length = (this.f14466a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f14466a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private final int m21678d(int i) {
        return this.f14466a[i + 1];
    }

    /* renamed from: d */
    private static <T> int m21679d(T t, long j) {
        return ((Integer) C4759f7.m20173f(t, j)).intValue();
    }

    /* renamed from: a */
    private final <K, V> void m21660a(C5036w7 w7Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            w7Var.mo19406a(i, this.f14482q.mo19179e(m21670b(i2)), this.f14482q.mo19178d(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m21661a(C5074z6<UT, UB> z6Var, T t, C5036w7 w7Var) throws IOException {
        z6Var.mo18835a(z6Var.mo18838b(t), w7Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:151|152|(1:154)|155|(6:178|157|(2:160|158)|260|(1:162)|163)(1:256)) */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r7.mo18837a(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x05a0, code lost:
        if (r10 == null) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05a2, code lost:
        r10 = r7.mo18842c(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x05ab, code lost:
        if (r7.mo19774a(r10, r14) == false) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05ad, code lost:
        r14 = r12.f14476k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05b1, code lost:
        if (r14 < r12.f14477l) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05b3, code lost:
        r10 = m21656a((java.lang.Object) r13, r12.f14475j[r14], (UB) r10, r7);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x05be, code lost:
        if (r10 != null) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05c0, code lost:
        r7.mo18841b((java.lang.Object) r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05c3, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x059d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19030a(T r13, com.google.android.gms.internal.measurement.C4808i6 r14, com.google.android.gms.internal.measurement.C5005u3 r15) throws java.io.IOException {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x05dc
            com.google.android.gms.internal.measurement.z6<?, ?> r7 = r12.f14480o
            com.google.android.gms.internal.measurement.w3<?> r8 = r12.f14481p
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x0009:
            int r1 = r14.mo19070a()     // Catch:{ all -> 0x05c4 }
            int r2 = r12.m21685g(r1)     // Catch:{ all -> 0x05c4 }
            if (r2 >= 0) goto L_0x0077
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f14476k
        L_0x001a:
            int r15 = r12.f14477l
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f14475j
            r15 = r15[r14]
            java.lang.Object r10 = r12.m21656a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r7.mo18841b(r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r2 = r12.f14471f     // Catch:{ all -> 0x05c4 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.measurement.r5 r2 = r12.f14470e     // Catch:{ all -> 0x05c4 }
            java.lang.Object r1 = r8.mo19713a(r15, r2, r1)     // Catch:{ all -> 0x05c4 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.measurement.x3 r0 = r8.mo19718b(r13)     // Catch:{ all -> 0x05c4 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.mo19712a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05c4 }
            r0 = r11
            goto L_0x0009
        L_0x0051:
            r7.mo18837a(r14)     // Catch:{ all -> 0x05c4 }
            if (r10 != 0) goto L_0x005a
            java.lang.Object r10 = r7.mo18842c(r13)     // Catch:{ all -> 0x05c4 }
        L_0x005a:
            boolean r1 = r7.mo19774a(r10, r14)     // Catch:{ all -> 0x05c4 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f14476k
        L_0x0062:
            int r15 = r12.f14477l
            if (r14 >= r15) goto L_0x0071
            int[] r15 = r12.f14475j
            r15 = r15[r14]
            java.lang.Object r10 = r12.m21656a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x0062
        L_0x0071:
            if (r10 == 0) goto L_0x0076
            r7.mo18841b(r13, r10)
        L_0x0076:
            return
        L_0x0077:
            int r3 = r12.m21678d(r2)     // Catch:{ all -> 0x05c4 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0562;
                case 2: goto L_0x0553;
                case 3: goto L_0x0544;
                case 4: goto L_0x0535;
                case 5: goto L_0x0526;
                case 6: goto L_0x0517;
                case 7: goto L_0x0508;
                case 8: goto L_0x0500;
                case 9: goto L_0x04cf;
                case 10: goto L_0x04c0;
                case 11: goto L_0x04b1;
                case 12: goto L_0x048f;
                case 13: goto L_0x0480;
                case 14: goto L_0x0471;
                case 15: goto L_0x0462;
                case 16: goto L_0x0453;
                case 17: goto L_0x0422;
                case 18: goto L_0x0414;
                case 19: goto L_0x0406;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0390;
                case 27: goto L_0x037e;
                case 28: goto L_0x0370;
                case 29: goto L_0x0362;
                case 30: goto L_0x034d;
                case 31: goto L_0x033f;
                case 32: goto L_0x0331;
                case 33: goto L_0x0323;
                case 34: goto L_0x0315;
                case 35: goto L_0x0307;
                case 36: goto L_0x02f9;
                case 37: goto L_0x02eb;
                case 38: goto L_0x02dd;
                case 39: goto L_0x02cf;
                case 40: goto L_0x02c1;
                case 41: goto L_0x02b3;
                case 42: goto L_0x02a5;
                case 43: goto L_0x0297;
                case 44: goto L_0x0282;
                case 45: goto L_0x0274;
                case 46: goto L_0x0266;
                case 47: goto L_0x0258;
                case 48: goto L_0x024a;
                case 49: goto L_0x0238;
                case 50: goto L_0x01f6;
                case 51: goto L_0x01e4;
                case 52: goto L_0x01d2;
                case 53: goto L_0x01c0;
                case 54: goto L_0x01ae;
                case 55: goto L_0x019c;
                case 56: goto L_0x018a;
                case 57: goto L_0x0178;
                case 58: goto L_0x0166;
                case 59: goto L_0x015e;
                case 60: goto L_0x012d;
                case 61: goto L_0x011f;
                case 62: goto L_0x010d;
                case 63: goto L_0x00e8;
                case 64: goto L_0x00d6;
                case 65: goto L_0x00c4;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a0;
                case 68: goto L_0x008e;
                default: goto L_0x0086;
            }
        L_0x0086:
            if (r10 != 0) goto L_0x0580
            java.lang.Object r10 = r7.mo18829a()     // Catch:{ zzfm -> 0x059d }
            goto L_0x0580
        L_0x008e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r5 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r5 = r14.mo19071a(r5, r15)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x00a0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19069F()     // Catch:{ zzfm -> 0x059d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x00b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            int r5 = r14.mo19106q()     // Catch:{ zzfm -> 0x059d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x00c4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19081d()     // Catch:{ zzfm -> 0x059d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x00d6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            int r5 = r14.mo19079c()     // Catch:{ zzfm -> 0x059d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x00e8:
            int r4 = r14.mo19098m()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.o4 r6 = r12.m21676c(r2)     // Catch:{ zzfm -> 0x059d }
            if (r6 == 0) goto L_0x00ff
            boolean r6 = r6.mo19348a(r4)     // Catch:{ zzfm -> 0x059d }
            if (r6 == 0) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            java.lang.Object r10 = com.google.android.gms.internal.measurement.C4821j6.m20410a(r1, r4, r10, r7)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x00ff:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzfm -> 0x059d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r5, r3)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x010d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            int r5 = r14.mo19100n()     // Catch:{ zzfm -> 0x059d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x011f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.z2 r5 = r14.mo19083e()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x012d:
            boolean r4 = r12.m21665a((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            if (r4 == 0) goto L_0x0149
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r13, r3)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r6 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r6 = r14.mo19076b(r6, r15)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r5, r6)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0159
        L_0x0149:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r5 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r5 = r14.mo19076b(r5, r15)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
        L_0x0159:
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x015e:
            r12.m21662a(r13, r3, r14)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0166:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            boolean r5 = r14.mo19108w()     // Catch:{ zzfm -> 0x059d }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0178:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            int r5 = r14.mo19085f()     // Catch:{ zzfm -> 0x059d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x018a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19075b()     // Catch:{ zzfm -> 0x059d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x019c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            int r5 = r14.mo19089h()     // Catch:{ zzfm -> 0x059d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x01ae:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19094k()     // Catch:{ zzfm -> 0x059d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x01c0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19102o()     // Catch:{ zzfm -> 0x059d }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x01d2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            float r5 = r14.zze()     // Catch:{ zzfm -> 0x059d }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x01e4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzfm -> 0x059d }
            double r5 = r14.zzd()     // Catch:{ zzfm -> 0x059d }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21672b((T) r13, r1, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x01f6:
            java.lang.Object r1 = r12.m21670b(r2)     // Catch:{ zzfm -> 0x059d }
            int r2 = r12.m21678d(r2)     // Catch:{ zzfm -> 0x059d }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r13, r2)     // Catch:{ zzfm -> 0x059d }
            if (r4 != 0) goto L_0x0210
            com.google.android.gms.internal.measurement.k5 r4 = r12.f14482q     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r4 = r4.mo19180f(r1)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r2, r4)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0227
        L_0x0210:
            com.google.android.gms.internal.measurement.k5 r5 = r12.f14482q     // Catch:{ zzfm -> 0x059d }
            boolean r5 = r5.mo19177c(r4)     // Catch:{ zzfm -> 0x059d }
            if (r5 == 0) goto L_0x0227
            com.google.android.gms.internal.measurement.k5 r5 = r12.f14482q     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r5 = r5.mo19180f(r1)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.k5 r6 = r12.f14482q     // Catch:{ zzfm -> 0x059d }
            r6.mo19174a(r5, r4)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r2, r5)     // Catch:{ zzfm -> 0x059d }
            r4 = r5
        L_0x0227:
            com.google.android.gms.internal.measurement.k5 r2 = r12.f14482q     // Catch:{ zzfm -> 0x059d }
            java.util.Map r2 = r2.mo19175a(r4)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.k5 r3 = r12.f14482q     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.i5 r1 = r3.mo19179e(r1)     // Catch:{ zzfm -> 0x059d }
            r14.mo19074a(r2, r1, r15)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0238:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r1 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.a5 r2 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            java.util.List r2 = r2.mo18826a(r13, r3)     // Catch:{ zzfm -> 0x059d }
            r14.mo19078b(r2, r1, r15)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x024a:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19092i(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0258:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19080c(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0266:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19082d(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0274:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19101n(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0282:
            com.google.android.gms.internal.measurement.a5 r4 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzfm -> 0x059d }
            java.util.List r3 = r4.mo18826a(r13, r5)     // Catch:{ zzfm -> 0x059d }
            r14.mo19105p(r3)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.o4 r2 = r12.m21676c(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r10 = com.google.android.gms.internal.measurement.C4821j6.m20411a(r1, r3, r2, r10, r7)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0297:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19093j(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02a5:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19072a(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02b3:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19077b(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02c1:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19084e(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02cf:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19103o(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02dd:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19095k(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02eb:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19107q(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x02f9:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19099m(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0307:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19088g(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0315:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19092i(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0323:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19080c(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0331:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19082d(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x033f:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19101n(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x034d:
            com.google.android.gms.internal.measurement.a5 r4 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzfm -> 0x059d }
            java.util.List r3 = r4.mo18826a(r13, r5)     // Catch:{ zzfm -> 0x059d }
            r14.mo19105p(r3)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.o4 r2 = r12.m21676c(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r10 = com.google.android.gms.internal.measurement.C4821j6.m20411a(r1, r3, r2, r10, r7)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0362:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19093j(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0370:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19096l(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x037e:
            com.google.android.gms.internal.measurement.h6 r1 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.a5 r4 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            java.util.List r2 = r4.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19073a(r2, r1, r15)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0390:
            boolean r1 = m21683f(r3)     // Catch:{ zzfm -> 0x059d }
            if (r1 == 0) goto L_0x03a4
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19086f(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03a4:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19090h(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03b2:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19072a(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03c0:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19077b(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03ce:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19084e(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03dc:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19103o(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03ea:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19095k(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x03f8:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19107q(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0406:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19099m(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0414:
            com.google.android.gms.internal.measurement.a5 r1 = r12.f14479n     // Catch:{ zzfm -> 0x059d }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzfm -> 0x059d }
            java.util.List r1 = r1.mo18826a(r13, r2)     // Catch:{ zzfm -> 0x059d }
            r14.mo19088g(r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0422:
            boolean r1 = r12.m21664a((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            if (r1 == 0) goto L_0x0440
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r13, r3)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r2 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r2 = r14.mo19071a(r2, r15)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r1, r2)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0440:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r1 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r1 = r14.mo19071a(r1, r15)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0453:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19069F()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20150a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            int r1 = r14.mo19106q()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20149a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0471:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19081d()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20150a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0480:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            int r1 = r14.mo19079c()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20149a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x048f:
            int r4 = r14.mo19098m()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.o4 r6 = r12.m21676c(r2)     // Catch:{ zzfm -> 0x059d }
            if (r6 == 0) goto L_0x04a6
            boolean r6 = r6.mo19348a(r4)     // Catch:{ zzfm -> 0x059d }
            if (r6 == 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            java.lang.Object r10 = com.google.android.gms.internal.measurement.C4821j6.m20410a(r1, r4, r10, r7)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x04a6:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20149a(r13, r5, r4)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x04b1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            int r1 = r14.mo19100n()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20149a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x04c0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.z2 r1 = r14.mo19083e()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x04cf:
            boolean r1 = r12.m21664a((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            if (r1 == 0) goto L_0x04ed
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4759f7.m20173f(r13, r3)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r2 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r2 = r14.mo19076b(r2, r15)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r1, r2)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x04ed:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.h6 r1 = r12.m21653a(r2)     // Catch:{ zzfm -> 0x059d }
            java.lang.Object r1 = r14.mo19076b(r1, r15)     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20151a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0500:
            r12.m21662a(r13, r3, r14)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0508:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            boolean r1 = r14.mo19108w()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20152a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0517:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            int r1 = r14.mo19085f()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20149a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0526:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19075b()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20150a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0535:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            int r1 = r14.mo19089h()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20149a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0544:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19094k()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20150a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0553:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            long r5 = r14.mo19102o()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20150a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0562:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            float r1 = r14.zze()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20148a(r13, r3, r1)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0571:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzfm -> 0x059d }
            double r5 = r14.zzd()     // Catch:{ zzfm -> 0x059d }
            com.google.android.gms.internal.measurement.C4759f7.m20147a(r13, r3, r5)     // Catch:{ zzfm -> 0x059d }
            r12.m21671b((T) r13, r2)     // Catch:{ zzfm -> 0x059d }
            goto L_0x0009
        L_0x0580:
            boolean r1 = r7.mo19774a(r10, r14)     // Catch:{ zzfm -> 0x059d }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f14476k
        L_0x0588:
            int r15 = r12.f14477l
            if (r14 >= r15) goto L_0x0597
            int[] r15 = r12.f14475j
            r15 = r15[r14]
            java.lang.Object r10 = r12.m21656a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x0588
        L_0x0597:
            if (r10 == 0) goto L_0x059c
            r7.mo18841b(r13, r10)
        L_0x059c:
            return
        L_0x059d:
            r7.mo18837a(r14)     // Catch:{ all -> 0x05c4 }
            if (r10 != 0) goto L_0x05a7
            java.lang.Object r1 = r7.mo18842c(r13)     // Catch:{ all -> 0x05c4 }
            r10 = r1
        L_0x05a7:
            boolean r1 = r7.mo19774a(r10, r14)     // Catch:{ all -> 0x05c4 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f14476k
        L_0x05af:
            int r15 = r12.f14477l
            if (r14 >= r15) goto L_0x05be
            int[] r15 = r12.f14475j
            r15 = r15[r14]
            java.lang.Object r10 = r12.m21656a(r13, r15, (UB) r10, r7)
            int r14 = r14 + 1
            goto L_0x05af
        L_0x05be:
            if (r10 == 0) goto L_0x05c3
            r7.mo18841b(r13, r10)
        L_0x05c3:
            return
        L_0x05c4:
            r14 = move-exception
            int r15 = r12.f14476k
        L_0x05c7:
            int r0 = r12.f14477l
            if (r15 >= r0) goto L_0x05d6
            int[] r0 = r12.f14475j
            r0 = r0[r15]
            java.lang.Object r10 = r12.m21656a(r13, r0, (UB) r10, r7)
            int r15 = r15 + 1
            goto L_0x05c7
        L_0x05d6:
            if (r10 == 0) goto L_0x05db
            r7.mo18841b(r13, r10)
        L_0x05db:
            throw r14
        L_0x05dc:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>()
            goto L_0x05e3
        L_0x05e2:
            throw r13
        L_0x05e3:
            goto L_0x05e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19030a(java.lang.Object, com.google.android.gms.internal.measurement.i6, com.google.android.gms.internal.measurement.u3):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21652a(byte[] r1, int r2, int r3, com.google.android.gms.internal.measurement.C4934q7 r4, java.lang.Class<?> r5, com.google.android.gms.internal.measurement.C5004u2 r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.measurement.C5008u5.f14446a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21631d(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r1, r2, r6)
            long r2 = r6.f14434b
            long r2 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f14435c = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r1, r2, r6)
            int r2 = r6.f14433a
            int r2 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f14435c = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.measurement.c6 r4 = com.google.android.gms.internal.measurement.C4712c6.m19997a()
            com.google.android.gms.internal.measurement.h6 r4 = r4.mo18887a(r5)
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21622a(r4, r1, r2, r3, r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r1, r2, r6)
            long r2 = r6.f14434b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f14435c = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r1, r2, r6)
            int r2 = r6.f14433a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f14435c = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f14435c = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f14435c = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f14435c = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f14435c = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21632e(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r1, r2, r6)
            long r2 = r6.f14434b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f14435c = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.m21652a(byte[], int, int, com.google.android.gms.internal.measurement.q7, java.lang.Class, com.google.android.gms.internal.measurement.u2):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:869)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    /* renamed from: a */
    private final int m21650a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.C5004u2 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f14465s
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.p4 r11 = (com.google.android.gms.internal.measurement.C4912p4) r11
            boolean r12 = r11.mo19360a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.measurement.p4 r11 = r11.mo18907a(r12)
            sun.misc.Unsafe r12 = f14465s
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.measurement.h6 r1 = r0.m21653a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21621a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f14435c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r9 = r7.f14433a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21621a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f14435c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.measurement.f5 r11 = (com.google.android.gms.internal.measurement.C4757f5) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r1, r7)
            long r4 = r7.f14434b
            long r4 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r4)
            r11.mo18982a(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.f5 r11 = (com.google.android.gms.internal.measurement.C4757f5) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r7)
            long r8 = r7.f14434b
            long r8 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r8)
            r11.mo18982a(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r7)
            long r8 = r7.f14434b
            long r8 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r8)
            r11.mo18982a(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.measurement.k4 r11 = (com.google.android.gms.internal.measurement.C4833k4) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r4 = r7.f14433a
            int r4 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r4)
            r11.mo19167b(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.k4 r11 = (com.google.android.gms.internal.measurement.C4833k4) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r4 = r7.f14433a
            int r4 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r4)
            r11.mo19167b(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r4 = r7.f14433a
            int r4 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r4)
            r11.mo19167b(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21624a(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21617a(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            com.google.android.gms.internal.measurement.i4 r1 = (com.google.android.gms.internal.measurement.C4801i4) r1
            com.google.android.gms.internal.measurement.b7 r3 = r1.zzb
            com.google.android.gms.internal.measurement.b7 r4 = com.google.android.gms.internal.measurement.C4699b7.m19962d()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.measurement.o4 r4 = r0.m21676c(r8)
            com.google.android.gms.internal.measurement.z6<?, ?> r5 = r0.f14480o
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4821j6.m20411a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.measurement.b7 r3 = (com.google.android.gms.internal.measurement.C4699b7) r3
            if (r3 == 0) goto L_0x014e
            r1.zzb = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r4 = r7.f14433a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.measurement.z2 r4 = com.google.android.gms.internal.measurement.C5070z2.f14557b
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.measurement.z2 r6 = com.google.android.gms.internal.measurement.C5070z2.m21869a(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r4 = r7.f14433a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.measurement.z2 r4 = com.google.android.gms.internal.measurement.C5070z2.f14557b
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.measurement.z2 r6 = com.google.android.gms.internal.measurement.C5070z2.m21869a(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22029d()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22029d()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.measurement.h6 r1 = r0.m21653a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21620a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r6 = r7.f14433a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C4819j4.f14218a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r8 = r7.f14433a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r6, r7)
            int r6 = r7.f14433a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C4819j4.f14218a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22029d()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22029d()
            throw r1
        L_0x0216:
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r6 = r7.f14433a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C4809i7.m20371a(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C4819j4.f14218a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r8 = r7.f14433a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r6, r7)
            int r6 = r7.f14433a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C4809i7.m20371a(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C4819j4.f14218a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22035j()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22029d()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22035j()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22029d()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.measurement.x2 r11 = (com.google.android.gms.internal.measurement.C5044x2) r11
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r4 = r7.f14433a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r2, r7)
            long r5 = r7.f14434b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.mo19735a(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.x2 r11 = (com.google.android.gms.internal.measurement.C5044x2) r11
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r7)
            long r8 = r7.f14434b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.mo19735a(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r8 = r7.f14433a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r6, r7)
            long r8 = r7.f14434b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.mo19735a(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.measurement.k4 r11 = (com.google.android.gms.internal.measurement.C4833k4) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r3, r1)
            r11.mo19167b(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.k4 r11 = (com.google.android.gms.internal.measurement.C4833k4) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r18, r19)
            r11.mo19167b(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r3, r4)
            r11.mo19167b(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.measurement.f5 r11 = (com.google.android.gms.internal.measurement.C4757f5) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r3, r1)
            r11.mo18982a(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.f5 r11 = (com.google.android.gms.internal.measurement.C4757f5) r11
            long r8 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r18, r19)
            r11.mo18982a(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r3, r4)
            r11.mo18982a(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21624a(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21617a(r21, r22, r23, r24, r25, r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.measurement.f5 r11 = (com.google.android.gms.internal.measurement.C4757f5) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r1, r7)
            long r4 = r7.f14434b
            r11.mo18982a(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.f5 r11 = (com.google.android.gms.internal.measurement.C4757f5) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r7)
            long r8 = r7.f14434b
            r11.mo18982a(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r7)
            long r8 = r7.f14434b
            r11.mo18982a(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.measurement.d4 r11 = (com.google.android.gms.internal.measurement.C4724d4) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r3, r1)
            r11.mo18908a(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.d4 r11 = (com.google.android.gms.internal.measurement.C4724d4) r11
            float r1 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r18, r19)
            r11.mo18908a(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r3, r4)
            r11.mo18908a(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.measurement.t3 r11 = (com.google.android.gms.internal.measurement.C4992t3) r11
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r7)
            int r2 = r7.f14433a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r3, r1)
            r11.mo19685a(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.t3 r11 = (com.google.android.gms.internal.measurement.C4992t3) r11
            double r8 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r18, r19)
            r11.mo19685a(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r1, r7)
            int r6 = r7.f14433a
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r3, r4)
            r11.mo19685a(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.m21650a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.u2):int");
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [int] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m21651a(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.measurement.C5004u2 r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f14465s
            java.lang.Object r12 = r7.m21670b(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.measurement.k5 r2 = r7.f14482q
            boolean r2 = r2.mo19177c(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.k5 r2 = r7.f14482q
            java.lang.Object r2 = r2.mo19180f(r12)
            com.google.android.gms.internal.measurement.k5 r3 = r7.f14482q
            r3.mo19174a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.measurement.k5 r8 = r7.f14482q
            com.google.android.gms.internal.measurement.i5 r8 = r8.mo19179e(r12)
            com.google.android.gms.internal.measurement.k5 r12 = r7.f14482q
            java.util.Map r12 = r12.mo19175a(r1)
            int r10 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r9, r10, r15)
            int r13 = r15.f14433a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f14202b
            V r0 = r8.f14204d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21619a(r10, r9, r1, r15)
            int r10 = r15.f14433a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.measurement.q7 r1 = r8.f14203c
            int r1 = r1.mo19397i()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.q7 r4 = r8.f14203c
            V r10 = r8.f14204d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m21652a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f14435c
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.measurement.q7 r1 = r8.f14201a
            int r1 = r1.mo19397i()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.measurement.q7 r4 = r8.f14201a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m21652a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f14435c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.measurement.C5018v2.m21618a(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.measurement.zzfn r8 = com.google.android.gms.internal.measurement.zzfn.m22034i()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.measurement.zzfn r8 = com.google.android.gms.internal.measurement.zzfn.m22028a()
            goto L_0x009d
        L_0x009c:
            throw r8
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.m21651a(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.measurement.u2):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m21649a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.measurement.C5004u2 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f14465s
            int[] r7 = r0.f14466a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.measurement.h6 r2 = r0.m21653a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21621a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f14435c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f14435c
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r11)
            long r3 = r11.f14434b
            long r3 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r11)
            int r3 = r11.f14433a
            int r3 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r11)
            int r4 = r11.f14433a
            com.google.android.gms.internal.measurement.o4 r5 = r0.m21676c(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo19348a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.measurement.b7 r1 = m21682e(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo18865a(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21632e(r3, r4, r11)
            java.lang.Object r3 = r11.f14435c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.measurement.h6 r2 = r0.m21653a(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21622a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f14435c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f14435c
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r11)
            int r4 = r11.f14433a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.measurement.C4809i7.m20371a(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.measurement.zzfn r1 = com.google.android.gms.internal.measurement.zzfn.m22035j()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.C4819j4.f14218a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r11)
            long r3 = r11.f14434b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r3, r4, r11)
            int r3 = r11.f14433a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r3, r4, r11)
            long r3 = r11.f14434b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.m21649a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.measurement.u2):int");
    }

    /* renamed from: a */
    private final C4790h6 m21653a(int i) {
        int i2 = (i / 3) << 1;
        C4790h6 h6Var = (C4790h6) this.f14467b[i2];
        if (h6Var != null) {
            return h6Var;
        }
        C4790h6 a = C4712c6.m19997a().mo18887a((Class) this.f14467b[i2 + 1]);
        this.f14467b[i2] = a;
        return a;
    }

    /* JADX WARNING: type inference failed for: r31v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v13, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v18, types: [int] */
    /* JADX WARNING: type inference failed for: r1v12, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v27, types: [int] */
    /* JADX WARNING: type inference failed for: r1v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r25v0 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r25v2 */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r2v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v8, types: [int] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r2v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [int] */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r1v29, types: [int] */
    /* JADX WARNING: type inference failed for: r2v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r12v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r12v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r12v25, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r12v26, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r12v29, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v29, types: [int] */
    /* JADX WARNING: type inference failed for: r12v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r12v31, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r12v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r1v61, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r8v36 */
    /* JADX WARNING: type inference failed for: r12v36 */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r3v27, types: [int] */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r25v7 */
    /* JADX WARNING: type inference failed for: r25v8 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r8v39 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r8v40 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r8v41 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r8v42 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r8v43 */
    /* JADX WARNING: type inference failed for: r8v44 */
    /* JADX WARNING: type inference failed for: r8v45 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r8v46 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r12v59 */
    /* JADX WARNING: type inference failed for: r12v60 */
    /* JADX WARNING: type inference failed for: r8v47 */
    /* JADX WARNING: type inference failed for: r8v48 */
    /* JADX WARNING: type inference failed for: r12v61 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0370, code lost:
        if (r0 == r15) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b9, code lost:
        if (r0 == r15) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0017, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0017, code lost:
        r12 = r12;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        r7 = r4;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0178, code lost:
        r6 = r6 | r22;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0217, code lost:
        r6 = r6 | r22;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0219, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r34;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0243, code lost:
        r32 = r7;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ba, code lost:
        r0 = r7 + 8;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02bc, code lost:
        r6 = r6 | r22;
        r7 = r32;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c0, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c4, code lost:
        r13 = r33;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ca, code lost:
        r17 = r32;
        r19 = r6;
        r2 = r7;
        r7 = r8;
        r18 = r9;
        r26 = r10;
        r24 = r11;
        r6 = r34;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v13, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r31v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 602
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x043c  */
    /* JADX WARNING: Unknown variable types count: 61 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo19723a(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.C5004u2 r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f14465s
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x047e
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21619a(r0, r12, r3, r9)
            int r3 = r9.f14433a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.m21647a(r3, r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.m21685g(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004e
            r24 = r3
            r2 = r4
            r19 = r6
            r17 = r7
            r26 = r10
            r6 = r11
            r18 = 0
            r7 = r5
            goto L_0x03e3
        L_0x004e:
            int[] r1 = r15.f14466a
            int r18 = r2 + 1
            r8 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r5
            r5 = r8 & r18
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x02da
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r5
            r1 = r1 & r18
            r5 = -1
            if (r1 == r7) goto L_0x0082
            if (r7 == r5) goto L_0x007c
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x007c:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x0082:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02a2;
                case 1: goto L_0x0288;
                case 2: goto L_0x0262;
                case 3: goto L_0x0262;
                case 4: goto L_0x0247;
                case 5: goto L_0x0222;
                case 6: goto L_0x01ff;
                case 7: goto L_0x01d7;
                case 8: goto L_0x01b2;
                case 9: goto L_0x017c;
                case 10: goto L_0x0161;
                case 11: goto L_0x0247;
                case 12: goto L_0x012f;
                case 13: goto L_0x01ff;
                case 14: goto L_0x0222;
                case 15: goto L_0x0114;
                case 16: goto L_0x00e7;
                case 17: goto L_0x0095;
                default: goto L_0x0086;
            }
        L_0x0086:
            r12 = r31
            r13 = r35
            r9 = r2
            r11 = r3
            r32 = r7
            r8 = r19
            r18 = -1
        L_0x0092:
            r7 = r4
            goto L_0x02ca
        L_0x0095:
            r8 = 3
            if (r0 != r8) goto L_0x00db
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.measurement.h6 r0 = r15.m21653a(r2)
            r1 = r31
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r33
            r4 = r8
            r8 = r19
            r18 = -1
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21621a(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00be
            r5 = r35
            java.lang.Object r1 = r5.f14435c
            r10.putObject(r14, r12, r1)
            goto L_0x00cd
        L_0x00be:
            r5 = r35
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.f14435c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00cd:
            r6 = r6 | r22
            r12 = r31
            r13 = r33
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r34
            r9 = r5
            goto L_0x0017
        L_0x00db:
            r9 = r2
            r11 = r3
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            goto L_0x0243
        L_0x00e7:
            r5 = r35
            r9 = r2
            r11 = r3
            r8 = r19
            r18 = -1
            if (r0 != 0) goto L_0x010f
            r2 = r12
            r12 = r31
            int r13 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r12, r4, r5)
            long r0 = r5.f14434b
            long r19 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r0)
            r0 = r10
            r1 = r30
            r32 = r13
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r32
            goto L_0x02c0
        L_0x010f:
            r12 = r31
            r13 = r5
            goto L_0x0243
        L_0x0114:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x0243
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r12, r4, r13)
            int r1 = r13.f14433a
            int r1 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0178
        L_0x012f:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x0243
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r12, r4, r13)
            int r1 = r13.f14433a
            com.google.android.gms.internal.measurement.o4 r4 = r15.m21676c(r9)
            if (r4 == 0) goto L_0x015d
            boolean r4 = r4.mo19348a(r1)
            if (r4 == 0) goto L_0x014f
            goto L_0x015d
        L_0x014f:
            com.google.android.gms.internal.measurement.b7 r2 = m21682e(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo18865a(r8, r1)
            goto L_0x02c0
        L_0x015d:
            r10.putInt(r14, r2, r1)
            goto L_0x0178
        L_0x0161:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21632e(r12, r4, r13)
            java.lang.Object r1 = r13.f14435c
            r10.putObject(r14, r2, r1)
        L_0x0178:
            r6 = r6 | r22
            goto L_0x02c0
        L_0x017c:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x01ae
            com.google.android.gms.internal.measurement.h6 r0 = r15.m21653a(r9)
            r5 = r33
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21622a(r0, r12, r4, r5, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x019f
            java.lang.Object r1 = r13.f14435c
            r10.putObject(r14, r2, r1)
            goto L_0x0217
        L_0x019f:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.f14435c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0217
        L_0x01ae:
            r5 = r33
            goto L_0x0243
        L_0x01b2:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01cd
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21629c(r12, r4, r13)
            goto L_0x01d1
        L_0x01cd:
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21631d(r12, r4, r13)
        L_0x01d1:
            java.lang.Object r1 = r13.f14435c
            r10.putObject(r14, r2, r1)
            goto L_0x0217
        L_0x01d7:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x0243
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r12, r4, r13)
            r32 = r0
            long r0 = r13.f14434b
            r19 = 0
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x01f6
            r0 = 1
            goto L_0x01f7
        L_0x01f6:
            r0 = 0
        L_0x01f7:
            com.google.android.gms.internal.measurement.C4759f7.m20152a(r14, r2, r0)
            r6 = r6 | r22
            r0 = r32
            goto L_0x0219
        L_0x01ff:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0217:
            r6 = r6 | r22
        L_0x0219:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r34
            r13 = r5
            goto L_0x0017
        L_0x0222:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            long r19 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r12, r4)
            r0 = r10
            r1 = r30
            r32 = r7
            r7 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x02ba
        L_0x0243:
            r32 = r7
            goto L_0x0092
        L_0x0247:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02ca
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r12, r7, r13)
            int r1 = r13.f14433a
            r10.putInt(r14, r2, r1)
            goto L_0x02bc
        L_0x0262:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02ca
            int r7 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r12, r7, r13)
            long r4 = r13.f14434b
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r32
            goto L_0x02c4
        L_0x0288:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02ca
            float r0 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r12, r7)
            com.google.android.gms.internal.measurement.C4759f7.m20148a(r14, r2, r0)
            int r0 = r7 + 4
            goto L_0x02bc
        L_0x02a2:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r1 = 1
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02ca
            double r0 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r12, r7)
            com.google.android.gms.internal.measurement.C4759f7.m20147a(r14, r2, r0)
        L_0x02ba:
            int r0 = r7 + 8
        L_0x02bc:
            r6 = r6 | r22
            r7 = r32
        L_0x02c0:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02c4:
            r13 = r33
            r11 = r34
            goto L_0x0017
        L_0x02ca:
            r17 = r32
            r19 = r6
            r2 = r7
            r7 = r8
            r18 = r9
            r26 = r10
            r24 = r11
            r6 = r34
            goto L_0x03e3
        L_0x02da:
            r5 = r3
            r17 = r7
            r8 = r19
            r18 = -1
            r7 = r4
            r27 = r12
            r12 = r31
            r13 = r9
            r9 = r2
            r2 = r27
            r1 = 27
            if (r11 != r1) goto L_0x033f
            r1 = 2
            if (r0 != r1) goto L_0x0332
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.measurement.p4 r0 = (com.google.android.gms.internal.measurement.C4912p4) r0
            boolean r1 = r0.mo19360a()
            if (r1 != 0) goto L_0x030f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0306
            r1 = 10
            goto L_0x0308
        L_0x0306:
            int r1 = r1 << 1
        L_0x0308:
            com.google.android.gms.internal.measurement.p4 r0 = r0.mo18907a(r1)
            r10.putObject(r14, r2, r0)
        L_0x030f:
            r11 = r0
            com.google.android.gms.internal.measurement.h6 r0 = r15.m21653a(r9)
            r1 = r8
            r2 = r31
            r3 = r7
            r4 = r33
            r7 = r5
            r5 = r11
            r19 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21620a(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r17
            r6 = r19
            r13 = r33
            goto L_0x0017
        L_0x0332:
            r19 = r6
            r24 = r5
            r15 = r7
            r25 = r8
            r18 = r9
            r26 = r10
            goto L_0x03bc
        L_0x033f:
            r19 = r6
            r6 = r5
            r1 = 49
            if (r11 > r1) goto L_0x038e
            r5 = r20
            long r4 = (long) r5
            r1 = r0
            r0 = r29
            r32 = r1
            r1 = r30
            r22 = r2
            r2 = r31
            r3 = r7
            r20 = r4
            r4 = r33
            r5 = r8
            r24 = r6
            r15 = r7
            r7 = r32
            r25 = r8
            r8 = r9
            r18 = r9
            r26 = r10
            r9 = r20
            r12 = r22
            r14 = r35
            int r0 = r0.m21650a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0374
            goto L_0x03df
        L_0x0374:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r7 = r17
            r2 = r18
            r6 = r19
            r1 = r24
            r3 = r25
        L_0x038a:
            r10 = r26
            goto L_0x0017
        L_0x038e:
            r32 = r0
            r22 = r2
            r24 = r6
            r15 = r7
            r25 = r8
            r18 = r9
            r26 = r10
            r5 = r20
            r0 = 50
            if (r11 != r0) goto L_0x03c2
            r7 = r32
            r0 = 2
            if (r7 != r0) goto L_0x03bc
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r22
            r8 = r35
            int r0 = r0.m21651a((T) r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0374
            goto L_0x03df
        L_0x03bc:
            r6 = r34
            r2 = r15
        L_0x03bf:
            r7 = r25
            goto L_0x03e3
        L_0x03c2:
            r7 = r32
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r25
            r6 = r24
            r9 = r11
            r10 = r22
            r12 = r18
            r13 = r35
            int r0 = r0.m21649a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0464
        L_0x03df:
            r6 = r34
            r2 = r0
            goto L_0x03bf
        L_0x03e3:
            if (r7 != r6) goto L_0x03f4
            if (r6 != 0) goto L_0x03e8
            goto L_0x03f4
        L_0x03e8:
            r4 = -1
            r8 = r29
            r11 = r30
            r3 = r7
            r0 = r17
            r1 = r19
            goto L_0x048d
        L_0x03f4:
            r8 = r29
            boolean r0 = r8.f14471f
            if (r0 == 0) goto L_0x043c
            r9 = r35
            com.google.android.gms.internal.measurement.u3 r0 = r9.f14436d
            com.google.android.gms.internal.measurement.u3 r1 = com.google.android.gms.internal.measurement.C5005u3.m21602a()
            if (r0 == r1) goto L_0x0439
            com.google.android.gms.internal.measurement.r5 r0 = r8.f14470e
            com.google.android.gms.internal.measurement.u3 r1 = r9.f14436d
            r10 = r24
            com.google.android.gms.internal.measurement.i4$e r0 = r1.mo19703a(r0, r10)
            if (r0 != 0) goto L_0x0429
            com.google.android.gms.internal.measurement.b7 r4 = m21682e(r30)
            r0 = r7
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21616a(r0, r1, r2, r3, r4, r5)
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r6
            r3 = r7
            r15 = r8
            goto L_0x0475
        L_0x0429:
            r11 = r30
            r0 = r11
            com.google.android.gms.internal.measurement.i4$b r0 = (com.google.android.gms.internal.measurement.C4801i4.C4803b) r0
            r0.mo19068a()
            com.google.android.gms.internal.measurement.x3<java.lang.Object> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0439:
            r11 = r30
            goto L_0x0440
        L_0x043c:
            r11 = r30
            r9 = r35
        L_0x0440:
            r10 = r24
            com.google.android.gms.internal.measurement.b7 r4 = m21682e(r30)
            r0 = r7
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21616a(r0, r1, r2, r3, r4, r5)
            r12 = r31
            r13 = r33
            r3 = r7
            r15 = r8
            r1 = r10
            r14 = r11
            r7 = r17
            r2 = r18
            r10 = r26
            r11 = r6
            r6 = r19
            goto L_0x0017
        L_0x0464:
            r10 = r24
            r7 = r25
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r3 = r7
        L_0x0475:
            r1 = r10
            r7 = r17
            r2 = r18
            r6 = r19
            goto L_0x038a
        L_0x047e:
            r19 = r6
            r17 = r7
            r26 = r10
            r6 = r11
            r11 = r14
            r8 = r15
            r2 = r0
            r0 = r17
            r1 = r19
            r4 = -1
        L_0x048d:
            if (r0 == r4) goto L_0x0495
            long r4 = (long) r0
            r0 = r26
            r0.putInt(r11, r4, r1)
        L_0x0495:
            r0 = 0
            int r1 = r8.f14476k
        L_0x0498:
            int r4 = r8.f14477l
            if (r1 >= r4) goto L_0x04ab
            int[] r4 = r8.f14475j
            r4 = r4[r1]
            com.google.android.gms.internal.measurement.z6<?, ?> r5 = r8.f14480o
            java.lang.Object r0 = r8.m21656a(r11, r4, (UB) r0, r5)
            com.google.android.gms.internal.measurement.b7 r0 = (com.google.android.gms.internal.measurement.C4699b7) r0
            int r1 = r1 + 1
            goto L_0x0498
        L_0x04ab:
            if (r0 == 0) goto L_0x04b2
            com.google.android.gms.internal.measurement.z6<?, ?> r1 = r8.f14480o
            r1.mo18841b(r11, r0)
        L_0x04b2:
            if (r6 != 0) goto L_0x04be
            r0 = r33
            if (r2 != r0) goto L_0x04b9
            goto L_0x04c4
        L_0x04b9:
            com.google.android.gms.internal.measurement.zzfn r0 = com.google.android.gms.internal.measurement.zzfn.m22034i()
            throw r0
        L_0x04be:
            r0 = r33
            if (r2 > r0) goto L_0x04c5
            if (r3 != r6) goto L_0x04c5
        L_0x04c4:
            return r2
        L_0x04c5:
            com.google.android.gms.internal.measurement.zzfn r0 = com.google.android.gms.internal.measurement.zzfn.m22034i()
            goto L_0x04cb
        L_0x04ca:
            throw r0
        L_0x04cb:
            goto L_0x04ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19723a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.u2):int");
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r17v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v9, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r3v13, types: [int] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0251, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0251, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r29v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 271
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19032a(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.measurement.C5004u2 r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.f14473h
            if (r0 == 0) goto L_0x025d
            sun.misc.Unsafe r9 = f14465s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0254
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21619a(r0, r12, r3, r11)
            int r3 = r11.f14433a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m21647a(r7, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m21685g(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0231
        L_0x004b:
            int[] r0 = r15.f14466a
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r12, r8, r11)
            r19 = r1
            long r0 = r11.f14434b
            long r21 = com.google.android.gms.internal.measurement.C4872m3.m20649a(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r12, r8, r11)
            int r1 = r11.f14433a
            int r1 = com.google.android.gms.internal.measurement.C4872m3.m20651e(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r12, r8, r11)
            int r1 = r11.f14433a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21632e(r12, r8, r11)
            java.lang.Object r1 = r11.f14435c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            com.google.android.gms.internal.measurement.h6 r0 = r15.m21653a(r4)
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21622a(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.f14435c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.f14435c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C4819j4.m20395a(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21629c(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21631d(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.f14435c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r12, r8, r11)
            long r5 = r11.f14434b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            com.google.android.gms.internal.measurement.C4759f7.m20152a(r14, r2, r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21623a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x0251
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = com.google.android.gms.internal.measurement.C5018v2.m21627b(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21625a(r12, r8, r11)
            int r1 = r11.f14433a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = com.google.android.gms.internal.measurement.C5018v2.m21626b(r12, r8, r11)
            long r4 = r11.f14434b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = com.google.android.gms.internal.measurement.C5018v2.m21630d(r12, r8)
            com.google.android.gms.internal.measurement.C4759f7.m20148a(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = com.google.android.gms.internal.measurement.C5018v2.m21628c(r12, r8)
            com.google.android.gms.internal.measurement.C4759f7.m20147a(r14, r2, r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x0251
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01af
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.measurement.p4 r0 = (com.google.android.gms.internal.measurement.C4912p4) r0
            boolean r3 = r0.mo19360a()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            com.google.android.gms.internal.measurement.p4 r0 = r0.mo18907a(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            com.google.android.gms.internal.measurement.h6 r0 = r15.m21653a(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21620a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0251
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x0212
        L_0x01af:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e5
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.m21650a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x01e5:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0214
            r7 = r30
            if (r7 != r10) goto L_0x0212
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.m21651a((T) r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x0212:
            r2 = r15
            goto L_0x0231
        L_0x0214:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.m21649a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0241
        L_0x0230:
            r2 = r0
        L_0x0231:
            com.google.android.gms.internal.measurement.b7 r4 = m21682e(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.android.gms.internal.measurement.C5018v2.m21616a(r0, r1, r2, r3, r4, r5)
        L_0x0241:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0251:
            r10 = -1
            goto L_0x0017
        L_0x0254:
            r4 = r13
            if (r0 != r4) goto L_0x0258
            return
        L_0x0258:
            com.google.android.gms.internal.measurement.zzfn r0 = com.google.android.gms.internal.measurement.zzfn.m22034i()
            throw r0
        L_0x025d:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.mo19723a((T) r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5021v5.mo19032a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.u2):void");
    }

    /* renamed from: a */
    private final <UT, UB> UB m21656a(Object obj, int i, UB ub, C5074z6<UT, UB> z6Var) {
        int i2 = this.f14466a[i];
        Object f = C4759f7.m20173f(obj, (long) (m21678d(i) & 1048575));
        if (f == null) {
            return ub;
        }
        C4899o4 c = m21676c(i);
        if (c == null) {
            return ub;
        }
        return m21655a(i, i2, this.f14482q.mo19175a(f), c, ub, z6Var);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m21655a(int i, int i2, Map<K, V> map, C4899o4 o4Var, UB ub, C5074z6<UT, UB> z6Var) {
        C4807i5 e = this.f14482q.mo19179e(m21670b(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!o4Var.mo19348a(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = z6Var.mo18829a();
                }
                C4800i3 f = C5070z2.m21873f(C4820j5.m20401a(e, entry.getKey(), entry.getValue()));
                try {
                    C4820j5.m20402a(f.mo19041b(), e, entry.getKey(), entry.getValue());
                    z6Var.mo18833a(ub, i2, f.mo19040a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    private static boolean m21667a(Object obj, int i, C4790h6 h6Var) {
        return h6Var.mo19035b(C4759f7.m20173f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m21659a(int i, Object obj, C5036w7 w7Var) throws IOException {
        if (obj instanceof String) {
            w7Var.mo19410a(i, (String) obj);
        } else {
            w7Var.mo19407a(i, (C5070z2) obj);
        }
    }

    /* renamed from: a */
    private final void m21662a(Object obj, int i, C4808i6 i6Var) throws IOException {
        if (m21683f(i)) {
            C4759f7.m20151a(obj, (long) (i & 1048575), (Object) i6Var.mo19087g());
        } else if (this.f14472g) {
            C4759f7.m20151a(obj, (long) (i & 1048575), (Object) i6Var.mo19104p());
        } else {
            C4759f7.m20151a(obj, (long) (i & 1048575), (Object) i6Var.mo19083e());
        }
    }

    /* renamed from: a */
    private final boolean m21666a(T t, int i, int i2, int i3) {
        if (this.f14473h) {
            return m21664a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m21664a(T t, int i) {
        if (this.f14473h) {
            int d = m21678d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C4759f7.m20170e(t, j) != 0.0d;
                case 1:
                    return C4759f7.m20165d(t, j) != 0.0f;
                case 2:
                    return C4759f7.m20156b(t, j) != 0;
                case 3:
                    return C4759f7.m20156b(t, j) != 0;
                case 4:
                    return C4759f7.m20143a((Object) t, j) != 0;
                case 5:
                    return C4759f7.m20156b(t, j) != 0;
                case 6:
                    return C4759f7.m20143a((Object) t, j) != 0;
                case 7:
                    return C4759f7.m20164c(t, j);
                case 8:
                    Object f = C4759f7.m20173f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C5070z2) {
                        return !C5070z2.f14557b.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C4759f7.m20173f(t, j) != null;
                case 10:
                    return !C5070z2.f14557b.equals(C4759f7.m20173f(t, j));
                case 11:
                    return C4759f7.m20143a((Object) t, j) != 0;
                case 12:
                    return C4759f7.m20143a((Object) t, j) != 0;
                case 13:
                    return C4759f7.m20143a((Object) t, j) != 0;
                case 14:
                    return C4759f7.m20156b(t, j) != 0;
                case 15:
                    return C4759f7.m20143a((Object) t, j) != 0;
                case 16:
                    return C4759f7.m20156b(t, j) != 0;
                case 17:
                    return C4759f7.m20173f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m21680e(i);
            return (C4759f7.m20143a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m21665a(T t, int i, int i2) {
        return C4759f7.m20143a((Object) t, (long) (m21680e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final int m21647a(int i, int i2) {
        if (i < this.f14468c || i > this.f14469d) {
            return -1;
        }
        return m21669b(i, i2);
    }
}
