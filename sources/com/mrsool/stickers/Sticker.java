package com.mrsool.stickers;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

class Sticker implements Parcelable {
    public static final Creator<Sticker> CREATOR = new C11478a();

    /* renamed from: N */
    long f32367N;

    /* renamed from: a */
    String f32368a;

    /* renamed from: b */
    List<String> f32369b;

    /* renamed from: com.mrsool.stickers.Sticker$a */
    static class C11478a implements Creator<Sticker> {
        C11478a() {
        }

        public Sticker createFromParcel(Parcel parcel) {
            return new Sticker(parcel);
        }

        public Sticker[] newArray(int i) {
            return new Sticker[i];
        }
    }

    Sticker(String str, List<String> list) {
        this.f32368a = str;
        this.f32369b = list;
    }

    /* renamed from: c */
    public void mo39571c(long j) {
        this.f32367N = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32368a);
        parcel.writeStringList(this.f32369b);
        parcel.writeLong(this.f32367N);
    }

    protected Sticker(Parcel parcel) {
        this.f32368a = parcel.readString();
        this.f32369b = parcel.createStringArrayList();
        this.f32367N = parcel.readLong();
    }
}
