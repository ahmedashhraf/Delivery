package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.data.DataHolder.C4262a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C4056a
/* renamed from: com.google.android.gms.common.data.g */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4270g<T extends SafeParcelable> extends C4263a<T> {

    /* renamed from: N */
    private static final String[] f13266N = {"data"};

    /* renamed from: b */
    private final Creator<T> f13267b;

    @C4056a
    public C4270g(DataHolder dataHolder, Creator<T> creator) {
        super(dataHolder);
        this.f13267b = creator;
    }

    @C4056a
    /* renamed from: a */
    public static C4262a m18456a() {
        return DataHolder.m18397a(f13266N);
    }

    @C4056a
    public T get(int i) {
        DataHolder dataHolder = this.f13259a;
        byte[] c = dataHolder.mo18039c("data", i, dataHolder.mo18045g(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(c, 0, c.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f13267b.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @C4056a
    /* renamed from: a */
    public static <T extends SafeParcelable> void m18457a(C4262a aVar, T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", obtain.marshall());
        aVar.mo18053a(contentValues);
        obtain.recycle();
    }
}
