package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4473c;
import com.google.android.gms.common.util.C4476d0;
import java.util.ArrayList;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public final class C4400b {
    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> byte[] m19025a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @C4056a
    /* renamed from: b */
    public static <T extends SafeParcelable> String m19026b(T t) {
        return C4473c.m19317b(m19025a(t));
    }

    @C4056a
    /* renamed from: b */
    public static <T extends SafeParcelable> ArrayList<T> m19027b(Intent intent, String str, Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(m19020a((byte[]) obj, creator));
        }
        return arrayList2;
    }

    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> T m19020a(byte[] bArr, Creator<T> creator) {
        C4300a0.m18620a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> void m19024a(Iterable<T> iterable, Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        for (T a : iterable) {
            arrayList.add(m19025a(a));
        }
        bundle.putSerializable(str, arrayList);
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> ArrayList<T> m19021a(Bundle bundle, String str, Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(m19020a((byte[]) obj, creator));
        }
        return arrayList2;
    }

    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> T m19019a(String str, Creator<T> creator) {
        return m19020a(C4473c.m19318b(str), creator);
    }

    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> void m19022a(T t, Intent intent, String str) {
        intent.putExtra(str, m19025a(t));
    }

    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> T m19018a(Intent intent, String str, Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m19020a(byteArrayExtra, creator);
    }

    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> void m19023a(Iterable<T> iterable, Intent intent, String str) {
        ArrayList arrayList = new ArrayList();
        for (T a : iterable) {
            arrayList.add(m19025a(a));
        }
        intent.putExtra(str, arrayList);
    }
}
