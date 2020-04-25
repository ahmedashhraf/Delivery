package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0635a;
import java.lang.reflect.Method;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.versionedparcelable.e */
/* compiled from: VersionedParcelParcel */
class C1999e extends VersionedParcel {

    /* renamed from: B */
    private static final boolean f7712B = false;

    /* renamed from: C */
    private static final String f7713C = "VersionedParcelParcel";

    /* renamed from: A */
    private int f7714A;

    /* renamed from: t */
    private final SparseIntArray f7715t;

    /* renamed from: u */
    private final Parcel f7716u;

    /* renamed from: v */
    private final int f7717v;

    /* renamed from: w */
    private final int f7718w;

    /* renamed from: x */
    private final String f7719x;

    /* renamed from: y */
    private int f7720y;

    /* renamed from: z */
    private int f7721z;

    C1999e(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new C0635a(), new C0635a(), new C0635a());
    }

    /* renamed from: a */
    public boolean mo8723a(int i) {
        while (true) {
            boolean z = true;
            if (this.f7721z < this.f7718w) {
                int i2 = this.f7714A;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.f7716u.setDataPosition(this.f7721z);
                int readInt = this.f7716u.readInt();
                this.f7714A = this.f7716u.readInt();
                this.f7721z += readInt;
            } else {
                if (this.f7714A != i) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public void mo8738b(int i) {
        mo8699a();
        this.f7720y = i;
        this.f7715t.put(i, this.f7716u.dataPosition());
        mo8764c(0);
        mo8764c(i);
    }

    /* renamed from: c */
    public void mo8764c(int i) {
        this.f7716u.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo8766d() {
        return this.f7716u.readInt() != 0;
    }

    /* renamed from: f */
    public Bundle mo8768f() {
        return this.f7716u.readBundle(C1999e.class.getClassLoader());
    }

    /* renamed from: g */
    public byte[] mo8769g() {
        int readInt = this.f7716u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f7716u.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public CharSequence mo8770h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f7716u);
    }

    /* renamed from: i */
    public double mo8771i() {
        return this.f7716u.readDouble();
    }

    /* renamed from: k */
    public float mo8773k() {
        return this.f7716u.readFloat();
    }

    /* renamed from: m */
    public int mo8775m() {
        return this.f7716u.readInt();
    }

    /* renamed from: o */
    public long mo8777o() {
        return this.f7716u.readLong();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo8779q() {
        return this.f7716u.readParcelable(C1999e.class.getClassLoader());
    }

    /* renamed from: s */
    public String mo8781s() {
        return this.f7716u.readString();
    }

    /* renamed from: t */
    public IBinder mo8782t() {
        return this.f7716u.readStrongBinder();
    }

    private C1999e(Parcel parcel, int i, int i2, String str, C0635a<String, Method> aVar, C0635a<String, Method> aVar2, C0635a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f7715t = new SparseIntArray();
        this.f7720y = -1;
        this.f7721z = 0;
        this.f7714A = -1;
        this.f7716u = parcel;
        this.f7717v = i;
        this.f7718w = i2;
        this.f7721z = this.f7717v;
        this.f7719x = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public VersionedParcel mo8734b() {
        Parcel parcel = this.f7716u;
        int dataPosition = parcel.dataPosition();
        int i = this.f7721z;
        if (i == this.f7717v) {
            i = this.f7718w;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7719x);
        sb.append("  ");
        C1999e eVar = new C1999e(parcel, dataPosition, i2, sb.toString(), this.f7707a, this.f7708b, this.f7709c);
        return eVar;
    }

    /* renamed from: a */
    public void mo8699a() {
        int i = this.f7720y;
        if (i >= 0) {
            int i2 = this.f7715t.get(i);
            int dataPosition = this.f7716u.dataPosition();
            int i3 = dataPosition - i2;
            this.f7716u.setDataPosition(i2);
            this.f7716u.writeInt(i3);
            this.f7716u.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo8715a(byte[] bArr) {
        if (bArr != null) {
            this.f7716u.writeInt(bArr.length);
            this.f7716u.writeByteArray(bArr);
            return;
        }
        this.f7716u.writeInt(-1);
    }

    /* renamed from: a */
    public void mo8716a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f7716u.writeInt(bArr.length);
            this.f7716u.writeByteArray(bArr, i, i2);
            return;
        }
        this.f7716u.writeInt(-1);
    }

    /* renamed from: a */
    public void mo8702a(long j) {
        this.f7716u.writeLong(j);
    }

    /* renamed from: a */
    public void mo8701a(float f) {
        this.f7716u.writeFloat(f);
    }

    /* renamed from: a */
    public void mo8700a(double d) {
        this.f7716u.writeDouble(d);
    }

    /* renamed from: a */
    public void mo8712a(String str) {
        this.f7716u.writeString(str);
    }

    /* renamed from: a */
    public void mo8704a(IBinder iBinder) {
        this.f7716u.writeStrongBinder(iBinder);
    }

    /* renamed from: a */
    public void mo8707a(Parcelable parcelable) {
        this.f7716u.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo8713a(boolean z) {
        this.f7716u.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo8705a(IInterface iInterface) {
        this.f7716u.writeStrongInterface(iInterface);
    }

    /* renamed from: a */
    public void mo8703a(Bundle bundle) {
        this.f7716u.writeBundle(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8711a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f7716u, 0);
    }
}
