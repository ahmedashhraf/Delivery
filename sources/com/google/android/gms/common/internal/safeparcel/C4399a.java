package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.core.p024e.p025b.C0886a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C4399a {
    private C4399a() {
    }

    /* renamed from: a */
    public static int m18958a(Parcel parcel) {
        return m19000b(parcel, 20293);
    }

    /* renamed from: b */
    private static void m19001b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | C0886a.f4059c);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: c */
    private static void m19004c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: d */
    public static void m19008d(Parcel parcel, int i, List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeBinderList(list);
        m19004c(parcel, b);
    }

    /* renamed from: e */
    public static void m19010e(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        m19004c(parcel, b);
    }

    /* renamed from: f */
    public static void m19012f(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeList(list);
        m19004c(parcel, b);
    }

    /* renamed from: g */
    public static void m19014g(Parcel parcel, int i, List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        m19004c(parcel, b);
    }

    /* renamed from: h */
    public static void m19015h(Parcel parcel, int i, List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcel parcel2 = (Parcel) list.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m19004c(parcel, b);
    }

    /* renamed from: i */
    public static void m19016i(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeStringList(list);
        m19004c(parcel, b);
    }

    /* renamed from: j */
    public static <T extends Parcelable> void m19017j(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m18999a(parcel, (T) parcelable, 0);
            }
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18959a(Parcel parcel, int i) {
        m19004c(parcel, i);
    }

    /* renamed from: a */
    public static void m18984a(Parcel parcel, int i, boolean z) {
        m19001b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    private static int m19000b(Parcel parcel, int i) {
        parcel.writeInt(i | C0886a.f4059c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: a */
    public static void m18974a(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        m19001b(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* renamed from: c */
    public static void m19006c(Parcel parcel, int i, List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeFloat(((Float) list.get(i2)).floatValue());
        }
        m19004c(parcel, b);
    }

    /* renamed from: d */
    public static void m19007d(Parcel parcel, int i, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeStrongBinder((IBinder) sparseArray.valueAt(i2));
        }
        m19004c(parcel, b);
    }

    /* renamed from: f */
    public static void m19011f(Parcel parcel, int i, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeString((String) sparseArray.valueAt(i2));
        }
        m19004c(parcel, b);
    }

    /* renamed from: b */
    public static void m19003b(Parcel parcel, int i, List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeDouble(((Double) list.get(i2)).doubleValue());
        }
        m19004c(parcel, b);
    }

    /* renamed from: e */
    public static void m19009e(Parcel parcel, int i, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcel parcel2 = (Parcel) sparseArray.valueAt(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m19004c(parcel, b);
    }

    /* renamed from: g */
    public static <T extends Parcelable> void m19013g(Parcel parcel, int i, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            Parcelable parcelable = (Parcelable) sparseArray.valueAt(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m18999a(parcel, (T) parcelable, 0);
            }
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18960a(Parcel parcel, int i, byte b) {
        m19001b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m18961a(Parcel parcel, int i, char c) {
        m19001b(parcel, i, 4);
        parcel.writeInt(c);
    }

    /* renamed from: c */
    public static void m19005c(Parcel parcel, int i, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeFloat(((Float) sparseArray.valueAt(i2)).floatValue());
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18983a(Parcel parcel, int i, short s) {
        m19001b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: b */
    public static void m19002b(Parcel parcel, int i, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeDouble(((Double) sparseArray.valueAt(i2)).doubleValue());
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18964a(Parcel parcel, int i, int i2) {
        m19001b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m18977a(Parcel parcel, int i, Integer num, boolean z) {
        if (num == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        m19001b(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    /* renamed from: a */
    public static void m18965a(Parcel parcel, int i, long j) {
        m19001b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m18978a(Parcel parcel, int i, Long l, boolean z) {
        if (l == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        m19001b(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    /* renamed from: a */
    public static void m18981a(Parcel parcel, int i, BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeByteArray(bigInteger.toByteArray());
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18963a(Parcel parcel, int i, float f) {
        m19001b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m18976a(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        m19001b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    /* renamed from: a */
    public static void m18962a(Parcel parcel, int i, double d) {
        m19001b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m18975a(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        m19001b(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    /* renamed from: a */
    public static void m18980a(Parcel parcel, int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18979a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeString(str);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18967a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18969a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18966a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeBundle(bundle);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18985a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeByteArray(bArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18998a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeInt(r5);
        for (byte[] writeByteArray : bArr) {
            parcel.writeByteArray(writeByteArray);
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18997a(Parcel parcel, int i, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeBooleanArray(zArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18986a(Parcel parcel, int i, char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeCharArray(cArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18989a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeIntArray(iArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18990a(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeLongArray(jArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18996a(Parcel parcel, int i, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeInt(r5);
        for (BigInteger byteArray : bigIntegerArr) {
            parcel.writeByteArray(byteArray.toByteArray());
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18988a(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeFloatArray(fArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18987a(Parcel parcel, int i, double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeDoubleArray(dArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18995a(Parcel parcel, int i, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18994a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeStringArray(strArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18991a(Parcel parcel, int i, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeBinderArray(iBinderArr);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18982a(Parcel parcel, int i, List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Boolean) list.get(i2)).booleanValue() ? 1 : 0);
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m18993a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeInt(r7);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m18999a(parcel, t, i2);
            }
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m18999a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static void m18968a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18992a(Parcel parcel, int i, Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeInt(r7);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18971a(Parcel parcel, int i, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        parcel.writeSparseBooleanArray(sparseBooleanArray);
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18972a(Parcel parcel, int i, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseIntArray.keyAt(i2));
            parcel.writeInt(sparseIntArray.valueAt(i2));
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18973a(Parcel parcel, int i, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseLongArray.keyAt(i2));
            parcel.writeLong(sparseLongArray.valueAt(i2));
        }
        m19004c(parcel, b);
    }

    /* renamed from: a */
    public static void m18970a(Parcel parcel, int i, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m19001b(parcel, i, 0);
            }
            return;
        }
        int b = m19000b(parcel, i);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(sparseArray.keyAt(i2));
            parcel.writeByteArray((byte[]) sparseArray.valueAt(i2));
        }
        m19004c(parcel, b);
    }
}
