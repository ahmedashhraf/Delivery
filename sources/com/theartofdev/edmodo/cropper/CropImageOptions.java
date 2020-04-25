package com.theartofdev.edmodo.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.theartofdev.edmodo.cropper.CropImageView.C12062c;
import com.theartofdev.edmodo.cropper.CropImageView.C12063d;
import com.theartofdev.edmodo.cropper.CropImageView.C12069j;
import com.theartofdev.edmodo.cropper.CropImageView.C12070k;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class CropImageOptions implements Parcelable {
    public static final Creator<CropImageOptions> CREATOR = new C12059a();

    /* renamed from: A0 */
    public boolean f34781A0;

    /* renamed from: B0 */
    public boolean f34782B0;

    /* renamed from: C0 */
    public int f34783C0;

    /* renamed from: D0 */
    public boolean f34784D0;

    /* renamed from: E0 */
    public boolean f34785E0;

    /* renamed from: F0 */
    public CharSequence f34786F0;

    /* renamed from: G0 */
    public int f34787G0;

    /* renamed from: N */
    public float f34788N;

    /* renamed from: O */
    public C12063d f34789O;

    /* renamed from: P */
    public C12070k f34790P;

    /* renamed from: Q */
    public boolean f34791Q;

    /* renamed from: R */
    public boolean f34792R;

    /* renamed from: S */
    public boolean f34793S;

    /* renamed from: T */
    public boolean f34794T;

    /* renamed from: U */
    public int f34795U;

    /* renamed from: V */
    public float f34796V;

    /* renamed from: W */
    public boolean f34797W;

    /* renamed from: X */
    public int f34798X;

    /* renamed from: Y */
    public int f34799Y;

    /* renamed from: Z */
    public float f34800Z;

    /* renamed from: a */
    public C12062c f34801a;

    /* renamed from: a0 */
    public int f34802a0;

    /* renamed from: b */
    public float f34803b;

    /* renamed from: b0 */
    public float f34804b0;

    /* renamed from: c0 */
    public float f34805c0;

    /* renamed from: d0 */
    public float f34806d0;

    /* renamed from: e0 */
    public int f34807e0;

    /* renamed from: f0 */
    public float f34808f0;

    /* renamed from: g0 */
    public int f34809g0;

    /* renamed from: h0 */
    public int f34810h0;

    /* renamed from: i0 */
    public int f34811i0;

    /* renamed from: j0 */
    public int f34812j0;

    /* renamed from: k0 */
    public int f34813k0;

    /* renamed from: l0 */
    public int f34814l0;

    /* renamed from: m0 */
    public int f34815m0;

    /* renamed from: n0 */
    public int f34816n0;

    /* renamed from: o0 */
    public CharSequence f34817o0;

    /* renamed from: p0 */
    public int f34818p0;

    /* renamed from: q0 */
    public Uri f34819q0;

    /* renamed from: r0 */
    public CompressFormat f34820r0;

    /* renamed from: s0 */
    public int f34821s0;

    /* renamed from: t0 */
    public int f34822t0;

    /* renamed from: u0 */
    public int f34823u0;

    /* renamed from: v0 */
    public C12069j f34824v0;

    /* renamed from: w0 */
    public boolean f34825w0;

    /* renamed from: x0 */
    public Rect f34826x0;

    /* renamed from: y0 */
    public int f34827y0;

    /* renamed from: z0 */
    public boolean f34828z0;

    /* renamed from: com.theartofdev.edmodo.cropper.CropImageOptions$a */
    static class C12059a implements Creator<CropImageOptions> {
        C12059a() {
        }

        public CropImageOptions createFromParcel(Parcel parcel) {
            return new CropImageOptions(parcel);
        }

        public CropImageOptions[] newArray(int i) {
            return new CropImageOptions[i];
        }
    }

    public CropImageOptions() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f34801a = C12062c.RECTANGLE;
        this.f34803b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f34788N = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f34789O = C12063d.ON_TOUCH;
        this.f34790P = C12070k.FIT_CENTER;
        this.f34791Q = true;
        this.f34792R = true;
        this.f34793S = true;
        this.f34794T = false;
        this.f34795U = 4;
        this.f34796V = 0.1f;
        this.f34797W = false;
        this.f34798X = 1;
        this.f34799Y = 1;
        this.f34800Z = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f34802a0 = Color.argb(C13959t.f40792G2, 255, 255, 255);
        this.f34804b0 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.f34805c0 = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.f34806d0 = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.f34807e0 = -1;
        this.f34808f0 = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.f34809g0 = Color.argb(C13959t.f40792G2, 255, 255, 255);
        this.f34810h0 = Color.argb(119, 0, 0, 0);
        this.f34811i0 = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f34812j0 = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.f34813k0 = 40;
        this.f34814l0 = 40;
        this.f34815m0 = 99999;
        this.f34816n0 = 99999;
        this.f34817o0 = "";
        this.f34818p0 = 0;
        this.f34819q0 = Uri.EMPTY;
        this.f34820r0 = CompressFormat.JPEG;
        this.f34821s0 = 90;
        this.f34822t0 = 0;
        this.f34823u0 = 0;
        this.f34824v0 = C12069j.NONE;
        this.f34825w0 = false;
        this.f34826x0 = null;
        this.f34827y0 = -1;
        this.f34828z0 = true;
        this.f34781A0 = true;
        this.f34782B0 = false;
        this.f34783C0 = 90;
        this.f34784D0 = false;
        this.f34785E0 = false;
        this.f34786F0 = null;
        this.f34787G0 = 0;
    }

    /* renamed from: a */
    public void mo41285a() {
        if (this.f34795U < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.f34788N >= 0.0f) {
            float f = this.f34796V;
            if (f < 0.0f || ((double) f) >= 0.5d) {
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            }
            String str = "Cannot set aspect ratio value to a number less than or equal to 0.";
            if (this.f34798X <= 0) {
                throw new IllegalArgumentException(str);
            } else if (this.f34799Y <= 0) {
                throw new IllegalArgumentException(str);
            } else if (this.f34800Z < 0.0f) {
                throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            } else if (this.f34804b0 < 0.0f) {
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
            } else if (this.f34808f0 < 0.0f) {
                throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
            } else if (this.f34812j0 >= 0) {
                int i = this.f34813k0;
                if (i >= 0) {
                    int i2 = this.f34814l0;
                    if (i2 < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.f34815m0 < i) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.f34816n0 < i2) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.f34822t0 < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.f34823u0 >= 0) {
                        int i3 = this.f34783C0;
                        if (i3 < 0 || i3 > 360) {
                            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                }
            } else {
                throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
            }
        } else {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34801a.ordinal());
        parcel.writeFloat(this.f34803b);
        parcel.writeFloat(this.f34788N);
        parcel.writeInt(this.f34789O.ordinal());
        parcel.writeInt(this.f34790P.ordinal());
        parcel.writeByte(this.f34791Q ? (byte) 1 : 0);
        parcel.writeByte(this.f34792R ? (byte) 1 : 0);
        parcel.writeByte(this.f34793S ? (byte) 1 : 0);
        parcel.writeByte(this.f34794T ? (byte) 1 : 0);
        parcel.writeInt(this.f34795U);
        parcel.writeFloat(this.f34796V);
        parcel.writeByte(this.f34797W ? (byte) 1 : 0);
        parcel.writeInt(this.f34798X);
        parcel.writeInt(this.f34799Y);
        parcel.writeFloat(this.f34800Z);
        parcel.writeInt(this.f34802a0);
        parcel.writeFloat(this.f34804b0);
        parcel.writeFloat(this.f34805c0);
        parcel.writeFloat(this.f34806d0);
        parcel.writeInt(this.f34807e0);
        parcel.writeFloat(this.f34808f0);
        parcel.writeInt(this.f34809g0);
        parcel.writeInt(this.f34810h0);
        parcel.writeInt(this.f34811i0);
        parcel.writeInt(this.f34812j0);
        parcel.writeInt(this.f34813k0);
        parcel.writeInt(this.f34814l0);
        parcel.writeInt(this.f34815m0);
        parcel.writeInt(this.f34816n0);
        TextUtils.writeToParcel(this.f34817o0, parcel, i);
        parcel.writeInt(this.f34818p0);
        parcel.writeParcelable(this.f34819q0, i);
        parcel.writeString(this.f34820r0.name());
        parcel.writeInt(this.f34821s0);
        parcel.writeInt(this.f34822t0);
        parcel.writeInt(this.f34823u0);
        parcel.writeInt(this.f34824v0.ordinal());
        parcel.writeInt(this.f34825w0 ? 1 : 0);
        parcel.writeParcelable(this.f34826x0, i);
        parcel.writeInt(this.f34827y0);
        parcel.writeByte(this.f34828z0 ? (byte) 1 : 0);
        parcel.writeByte(this.f34781A0 ? (byte) 1 : 0);
        parcel.writeByte(this.f34782B0 ? (byte) 1 : 0);
        parcel.writeInt(this.f34783C0);
        parcel.writeByte(this.f34784D0 ? (byte) 1 : 0);
        parcel.writeByte(this.f34785E0 ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f34786F0, parcel, i);
        parcel.writeInt(this.f34787G0);
    }

    protected CropImageOptions(Parcel parcel) {
        this.f34801a = C12062c.values()[parcel.readInt()];
        this.f34803b = parcel.readFloat();
        this.f34788N = parcel.readFloat();
        this.f34789O = C12063d.values()[parcel.readInt()];
        this.f34790P = C12070k.values()[parcel.readInt()];
        boolean z = true;
        this.f34791Q = parcel.readByte() != 0;
        this.f34792R = parcel.readByte() != 0;
        this.f34793S = parcel.readByte() != 0;
        this.f34794T = parcel.readByte() != 0;
        this.f34795U = parcel.readInt();
        this.f34796V = parcel.readFloat();
        this.f34797W = parcel.readByte() != 0;
        this.f34798X = parcel.readInt();
        this.f34799Y = parcel.readInt();
        this.f34800Z = parcel.readFloat();
        this.f34802a0 = parcel.readInt();
        this.f34804b0 = parcel.readFloat();
        this.f34805c0 = parcel.readFloat();
        this.f34806d0 = parcel.readFloat();
        this.f34807e0 = parcel.readInt();
        this.f34808f0 = parcel.readFloat();
        this.f34809g0 = parcel.readInt();
        this.f34810h0 = parcel.readInt();
        this.f34811i0 = parcel.readInt();
        this.f34812j0 = parcel.readInt();
        this.f34813k0 = parcel.readInt();
        this.f34814l0 = parcel.readInt();
        this.f34815m0 = parcel.readInt();
        this.f34816n0 = parcel.readInt();
        this.f34817o0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f34818p0 = parcel.readInt();
        this.f34819q0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f34820r0 = CompressFormat.valueOf(parcel.readString());
        this.f34821s0 = parcel.readInt();
        this.f34822t0 = parcel.readInt();
        this.f34823u0 = parcel.readInt();
        this.f34824v0 = C12069j.values()[parcel.readInt()];
        this.f34825w0 = parcel.readByte() != 0;
        this.f34826x0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f34827y0 = parcel.readInt();
        this.f34828z0 = parcel.readByte() != 0;
        this.f34781A0 = parcel.readByte() != 0;
        this.f34782B0 = parcel.readByte() != 0;
        this.f34783C0 = parcel.readInt();
        this.f34784D0 = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f34785E0 = z;
        this.f34786F0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f34787G0 = parcel.readInt();
    }
}
