package com.oppwa.mobile.connect.p427b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;

/* renamed from: com.oppwa.mobile.connect.b.c */
public class C11780c {
    @C0195i0
    /* renamed from: a */
    public static String m52956a(@C0195i0 byte[] bArr) {
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    /* renamed from: a */
    public static void m52957a(@C0193h0 Parcel parcel, @C0195i0 byte[] bArr) {
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }

    /* renamed from: a */
    public static boolean m52958a(@C0195i0 Object obj, @C0195i0 Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @C0195i0
    /* renamed from: a */
    public static byte[] m52959a(@C0193h0 Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @C0195i0
    /* renamed from: a */
    public static byte[] m52960a(@C0195i0 String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    /* renamed from: b */
    public static String m52961b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = "";
        C11779b.m52950a(sb, "-", str2);
        C11779b.m52950a(sb, C3868i.f12248b, str2);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m52962c(String str) {
        return TextUtils.isEmpty(str) ? str : str.trim();
    }
}
