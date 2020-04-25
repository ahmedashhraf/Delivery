package com.mrsool.stickers;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

class StickerPack implements Parcelable {
    public static final Creator<StickerPack> CREATOR = new C11479a();

    /* renamed from: N */
    String f32395N;

    /* renamed from: O */
    String f32396O;

    /* renamed from: P */
    final String f32397P;

    /* renamed from: Q */
    final String f32398Q;

    /* renamed from: R */
    final String f32399R;

    /* renamed from: S */
    final String f32400S;

    /* renamed from: T */
    String f32401T;

    /* renamed from: U */
    private List<Sticker> f32402U;

    /* renamed from: V */
    private long f32403V;

    /* renamed from: W */
    String f32404W;

    /* renamed from: X */
    private boolean f32405X;

    /* renamed from: a */
    String f32406a;

    /* renamed from: b */
    String f32407b;

    /* renamed from: com.mrsool.stickers.StickerPack$a */
    static class C11479a implements Creator<StickerPack> {
        C11479a() {
        }

        public StickerPack createFromParcel(Parcel parcel) {
            return new StickerPack(parcel);
        }

        public StickerPack[] newArray(int i) {
            return new StickerPack[i];
        }
    }

    StickerPack(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f32406a = str;
        this.f32407b = str2;
        this.f32395N = str3;
        this.f32396O = str4;
        this.f32397P = str5;
        this.f32398Q = str6;
        this.f32399R = str7;
        this.f32400S = str8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo39586a(boolean z) {
        this.f32405X = z;
    }

    /* renamed from: b */
    public List<Sticker> mo39588b() {
        return this.f32402U;
    }

    /* renamed from: c */
    public void mo39590c(String str) {
        this.f32401T = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32406a);
        parcel.writeString(this.f32407b);
        parcel.writeString(this.f32395N);
        parcel.writeString(this.f32396O);
        parcel.writeString(this.f32397P);
        parcel.writeString(this.f32398Q);
        parcel.writeString(this.f32399R);
        parcel.writeString(this.f32400S);
        parcel.writeString(this.f32401T);
        parcel.writeTypedList(this.f32402U);
        parcel.writeLong(this.f32403V);
        parcel.writeString(this.f32404W);
        parcel.writeByte(this.f32405X ? (byte) 1 : 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo39587a() {
        return this.f32405X;
    }

    /* renamed from: c */
    public long mo39589c() {
        return this.f32403V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo39585a(List<Sticker> list) {
        this.f32402U = list;
        this.f32403V = 0;
        for (Sticker sticker : list) {
            this.f32403V += sticker.f32367N;
        }
    }

    /* renamed from: a */
    public void mo39584a(String str) {
        this.f32404W = str;
    }

    protected StickerPack(Parcel parcel) {
        this.f32406a = parcel.readString();
        this.f32407b = parcel.readString();
        this.f32395N = parcel.readString();
        this.f32396O = parcel.readString();
        this.f32397P = parcel.readString();
        this.f32398Q = parcel.readString();
        this.f32399R = parcel.readString();
        this.f32400S = parcel.readString();
        this.f32401T = parcel.readString();
        this.f32402U = parcel.createTypedArrayList(Sticker.CREATOR);
        this.f32403V = parcel.readLong();
        this.f32404W = parcel.readString();
        this.f32405X = parcel.readByte() != 0;
    }
}
