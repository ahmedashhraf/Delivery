package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.core.p024e.p025b.C0886a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    private SafeParcelReader() {
    }

    /* renamed from: A */
    public static ArrayList<Parcel> m18893A(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + Y);
        return arrayList;
    }

    /* renamed from: B */
    public static SparseArray<Parcel> m18894B(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, null);
            }
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: C */
    public static SparseBooleanArray m18895C(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + Y);
        return readSparseBooleanArray;
    }

    /* renamed from: D */
    public static SparseIntArray m18896D(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseIntArray;
    }

    /* renamed from: E */
    public static SparseLongArray m18897E(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseLongArray;
    }

    /* renamed from: F */
    public static String m18898F(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + Y);
        return readString;
    }

    /* renamed from: G */
    public static String[] m18899G(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + Y);
        return createStringArray;
    }

    /* renamed from: H */
    public static ArrayList<String> m18900H(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + Y);
        return createStringArrayList;
    }

    /* renamed from: I */
    public static SparseArray<String> m18901I(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: J */
    public static void m18902J(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: K */
    public static boolean m18903K(Parcel parcel, int i) {
        m18923a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: L */
    public static Boolean m18904L(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        if (Y == 0) {
            return null;
        }
        m18924a(parcel, i, Y, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: M */
    public static byte m18905M(Parcel parcel, int i) {
        m18923a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: N */
    public static char m18906N(Parcel parcel, int i) {
        m18923a(parcel, i, 4);
        return (char) parcel.readInt();
    }

    /* renamed from: O */
    public static double m18907O(Parcel parcel, int i) {
        m18923a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: P */
    public static Double m18908P(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        if (Y == 0) {
            return null;
        }
        m18924a(parcel, i, Y, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: Q */
    public static float m18909Q(Parcel parcel, int i) {
        m18923a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: R */
    public static Float m18910R(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        if (Y == 0) {
            return null;
        }
        m18924a(parcel, i, Y, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: S */
    public static IBinder m18911S(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + Y);
        return readStrongBinder;
    }

    /* renamed from: T */
    public static int m18912T(Parcel parcel, int i) {
        m18923a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: U */
    public static Integer m18913U(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        if (Y == 0) {
            return null;
        }
        m18924a(parcel, i, Y, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: V */
    public static long m18914V(Parcel parcel, int i) {
        m18923a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: W */
    public static Long m18915W(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        if (Y == 0) {
            return null;
        }
        m18924a(parcel, i, Y, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: X */
    public static short m18916X(Parcel parcel, int i) {
        m18923a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: Y */
    public static int m18917Y(Parcel parcel, int i) {
        return (i & C0886a.f4059c) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: Z */
    public static void m18918Z(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m18917Y(parcel, i));
    }

    /* renamed from: a */
    public static int m18919a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m18920a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: b */
    public static int m18926b(Parcel parcel) {
        int a = m18920a(parcel);
        int Y = m18917Y(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m18919a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new ParseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = Y + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: c */
    public static BigInteger m18929c(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + Y);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m18932d(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + Y);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m18933e(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + Y);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static ArrayList<Boolean> m18934f(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(dataPosition + Y);
        return arrayList;
    }

    /* renamed from: g */
    public static Bundle m18935g(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + Y);
        return readBundle;
    }

    /* renamed from: h */
    public static byte[] m18936h(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + Y);
        return createByteArray;
    }

    /* renamed from: i */
    public static byte[][] m18937i(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + Y);
        return bArr;
    }

    /* renamed from: j */
    public static SparseArray<byte[]> m18938j(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: k */
    public static char[] m18939k(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + Y);
        return createCharArray;
    }

    /* renamed from: l */
    public static double[] m18940l(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + Y);
        return createDoubleArray;
    }

    /* renamed from: m */
    public static ArrayList<Double> m18941m(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + Y);
        return arrayList;
    }

    /* renamed from: n */
    public static SparseArray<Double> m18942n(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: o */
    public static float[] m18943o(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + Y);
        return createFloatArray;
    }

    /* renamed from: p */
    public static ArrayList<Float> m18944p(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + Y);
        return arrayList;
    }

    /* renamed from: q */
    public static SparseArray<Float> m18945q(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: r */
    public static IBinder[] m18946r(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + Y);
        return createBinderArray;
    }

    /* renamed from: s */
    public static ArrayList<IBinder> m18947s(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + Y);
        return createBinderArrayList;
    }

    /* renamed from: t */
    public static SparseArray<IBinder> m18948t(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: u */
    public static int[] m18949u(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + Y);
        return createIntArray;
    }

    /* renamed from: v */
    public static ArrayList<Integer> m18950v(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + Y);
        return arrayList;
    }

    /* renamed from: w */
    public static long[] m18951w(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + Y);
        return createLongArray;
    }

    /* renamed from: x */
    public static ArrayList<Long> m18952x(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + Y);
        return arrayList;
    }

    /* renamed from: y */
    public static Parcel m18953y(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, Y);
        parcel.setDataPosition(dataPosition + Y);
        return obtain;
    }

    /* renamed from: z */
    public static Parcel[] m18954z(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + Y);
        return parcelArr;
    }

    /* renamed from: a */
    private static void m18923a(Parcel parcel, int i, int i2) {
        int Y = m18917Y(parcel, i);
        if (Y != i2) {
            String hexString = Integer.toHexString(Y);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(Y);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m18924a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m18930c(Parcel parcel, int i, Creator<T> creator) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + Y);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static BigDecimal m18922a(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + Y);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: d */
    public static <T> SparseArray<T> m18931d(Parcel parcel, int i, Creator<T> creator) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(dataPosition + Y);
        return sparseArray;
    }

    /* renamed from: b */
    public static BigDecimal[] m18928b(Parcel parcel, int i) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + Y);
        return bigDecimalArr;
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m18921a(Parcel parcel, int i, Creator<T> creator) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + Y);
        return t;
    }

    /* renamed from: b */
    public static <T> T[] m18927b(Parcel parcel, int i, Creator<T> creator) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + Y);
        return createTypedArray;
    }

    /* renamed from: a */
    public static void m18925a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int Y = m18917Y(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (Y != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + Y);
        }
    }
}
