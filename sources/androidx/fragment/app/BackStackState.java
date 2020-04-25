package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C1360a();

    /* renamed from: N */
    final int[] f5338N;

    /* renamed from: O */
    final int[] f5339O;

    /* renamed from: P */
    final int f5340P;

    /* renamed from: Q */
    final int f5341Q;

    /* renamed from: R */
    final String f5342R;

    /* renamed from: S */
    final int f5343S;

    /* renamed from: T */
    final int f5344T;

    /* renamed from: U */
    final CharSequence f5345U;

    /* renamed from: V */
    final int f5346V;

    /* renamed from: W */
    final CharSequence f5347W;

    /* renamed from: X */
    final ArrayList<String> f5348X;

    /* renamed from: Y */
    final ArrayList<String> f5349Y;

    /* renamed from: Z */
    final boolean f5350Z;

    /* renamed from: a */
    final int[] f5351a;

    /* renamed from: b */
    final ArrayList<String> f5352b;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    static class C1360a implements Creator<BackStackState> {
        C1360a() {
        }

        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C1373a aVar) {
        int size = aVar.f5552a.size();
        this.f5351a = new int[(size * 5)];
        if (aVar.f5559h) {
            this.f5352b = new ArrayList<>(size);
            this.f5338N = new int[size];
            this.f5339O = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1407a aVar2 = (C1407a) aVar.f5552a.get(i);
                int i3 = i2 + 1;
                this.f5351a[i2] = aVar2.f5570a;
                ArrayList<String> arrayList = this.f5352b;
                Fragment fragment = aVar2.f5571b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f5351a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f5572c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f5573d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f5574e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f5575f;
                this.f5338N[i] = aVar2.f5576g.ordinal();
                this.f5339O[i] = aVar2.f5577h.ordinal();
                i++;
                i2 = i7;
            }
            this.f5340P = aVar.f5557f;
            this.f5341Q = aVar.f5558g;
            this.f5342R = aVar.f5561j;
            this.f5343S = aVar.f5412M;
            this.f5344T = aVar.f5562k;
            this.f5345U = aVar.f5563l;
            this.f5346V = aVar.f5564m;
            this.f5347W = aVar.f5565n;
            this.f5348X = aVar.f5566o;
            this.f5349Y = aVar.f5567p;
            this.f5350Z = aVar.f5568q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1373a mo5874a(C1386i iVar) {
        C1373a aVar = new C1373a(iVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f5351a.length) {
            C1407a aVar2 = new C1407a();
            int i3 = i + 1;
            aVar2.f5570a = this.f5351a[i];
            if (C1386i.f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f5351a[i3]);
                sb.toString();
            }
            String str = (String) this.f5352b.get(i2);
            if (str != null) {
                aVar2.f5571b = (Fragment) iVar.f5444S.get(str);
            } else {
                aVar2.f5571b = null;
            }
            aVar2.f5576g = State.values()[this.f5338N[i2]];
            aVar2.f5577h = State.values()[this.f5339O[i2]];
            int[] iArr = this.f5351a;
            int i4 = i3 + 1;
            aVar2.f5572c = iArr[i3];
            int i5 = i4 + 1;
            aVar2.f5573d = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f5574e = iArr[i5];
            int i7 = i6 + 1;
            aVar2.f5575f = iArr[i6];
            aVar.f5553b = aVar2.f5572c;
            aVar.f5554c = aVar2.f5573d;
            aVar.f5555d = aVar2.f5574e;
            aVar.f5556e = aVar2.f5575f;
            aVar.mo6403a(aVar2);
            i2++;
            i = i7;
        }
        aVar.f5557f = this.f5340P;
        aVar.f5558g = this.f5341Q;
        aVar.f5561j = this.f5342R;
        aVar.f5412M = this.f5343S;
        aVar.f5559h = true;
        aVar.f5562k = this.f5344T;
        aVar.f5563l = this.f5345U;
        aVar.f5564m = this.f5346V;
        aVar.f5565n = this.f5347W;
        aVar.f5566o = this.f5348X;
        aVar.f5567p = this.f5349Y;
        aVar.f5568q = this.f5350Z;
        aVar.mo6099e(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f5351a);
        parcel.writeStringList(this.f5352b);
        parcel.writeIntArray(this.f5338N);
        parcel.writeIntArray(this.f5339O);
        parcel.writeInt(this.f5340P);
        parcel.writeInt(this.f5341Q);
        parcel.writeString(this.f5342R);
        parcel.writeInt(this.f5343S);
        parcel.writeInt(this.f5344T);
        TextUtils.writeToParcel(this.f5345U, parcel, 0);
        parcel.writeInt(this.f5346V);
        TextUtils.writeToParcel(this.f5347W, parcel, 0);
        parcel.writeStringList(this.f5348X);
        parcel.writeStringList(this.f5349Y);
        parcel.writeInt(this.f5350Z ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f5351a = parcel.createIntArray();
        this.f5352b = parcel.createStringArrayList();
        this.f5338N = parcel.createIntArray();
        this.f5339O = parcel.createIntArray();
        this.f5340P = parcel.readInt();
        this.f5341Q = parcel.readInt();
        this.f5342R = parcel.readString();
        this.f5343S = parcel.readInt();
        this.f5344T = parcel.readInt();
        this.f5345U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5346V = parcel.readInt();
        this.f5347W = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5348X = parcel.createStringArrayList();
        this.f5349Y = parcel.createStringArrayList();
        this.f5350Z = parcel.readInt() != 0;
    }
}
