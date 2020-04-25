package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.lifecycle.Lifecycle.State;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new C1369a();

    /* renamed from: N */
    final boolean f5381N;

    /* renamed from: O */
    final int f5382O;

    /* renamed from: P */
    final int f5383P;

    /* renamed from: Q */
    final String f5384Q;

    /* renamed from: R */
    final boolean f5385R;

    /* renamed from: S */
    final boolean f5386S;

    /* renamed from: T */
    final boolean f5387T;

    /* renamed from: U */
    final Bundle f5388U;

    /* renamed from: V */
    final boolean f5389V;

    /* renamed from: W */
    final int f5390W;

    /* renamed from: X */
    Bundle f5391X;

    /* renamed from: Y */
    Fragment f5392Y;

    /* renamed from: a */
    final String f5393a;

    /* renamed from: b */
    final String f5394b;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    static class C1369a implements Creator<FragmentState> {
        C1369a() {
        }

        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f5393a = fragment.getClass().getName();
        this.f5394b = fragment.mWho;
        this.f5381N = fragment.mFromLayout;
        this.f5382O = fragment.mFragmentId;
        this.f5383P = fragment.mContainerId;
        this.f5384Q = fragment.mTag;
        this.f5385R = fragment.mRetainInstance;
        this.f5386S = fragment.mRemoving;
        this.f5387T = fragment.mDetached;
        this.f5388U = fragment.mArguments;
        this.f5389V = fragment.mHidden;
        this.f5390W = fragment.mMaxState.ordinal();
    }

    /* renamed from: a */
    public Fragment mo6058a(@C0193h0 ClassLoader classLoader, @C0193h0 C1380f fVar) {
        if (this.f5392Y == null) {
            Bundle bundle = this.f5388U;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
            this.f5392Y = fVar.mo6216a(classLoader, this.f5393a);
            this.f5392Y.setArguments(this.f5388U);
            Bundle bundle2 = this.f5391X;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
                this.f5392Y.mSavedFragmentState = this.f5391X;
            } else {
                this.f5392Y.mSavedFragmentState = new Bundle();
            }
            Fragment fragment = this.f5392Y;
            fragment.mWho = this.f5394b;
            fragment.mFromLayout = this.f5381N;
            fragment.mRestored = true;
            fragment.mFragmentId = this.f5382O;
            fragment.mContainerId = this.f5383P;
            fragment.mTag = this.f5384Q;
            fragment.mRetainInstance = this.f5385R;
            fragment.mRemoving = this.f5386S;
            fragment.mDetached = this.f5387T;
            fragment.mHidden = this.f5389V;
            fragment.mMaxState = State.values()[this.f5390W];
            if (C1386i.f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiated fragment ");
                sb.append(this.f5392Y);
                sb.toString();
            }
        }
        return this.f5392Y;
    }

    public int describeContents() {
        return 0;
    }

    @C0193h0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5393a);
        sb.append(" (");
        sb.append(this.f5394b);
        sb.append(")}:");
        if (this.f5381N) {
            sb.append(" fromLayout");
        }
        if (this.f5383P != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5383P));
        }
        String str = this.f5384Q;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f5384Q);
        }
        if (this.f5385R) {
            sb.append(" retainInstance");
        }
        if (this.f5386S) {
            sb.append(" removing");
        }
        if (this.f5387T) {
            sb.append(" detached");
        }
        if (this.f5389V) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5393a);
        parcel.writeString(this.f5394b);
        parcel.writeInt(this.f5381N ? 1 : 0);
        parcel.writeInt(this.f5382O);
        parcel.writeInt(this.f5383P);
        parcel.writeString(this.f5384Q);
        parcel.writeInt(this.f5385R ? 1 : 0);
        parcel.writeInt(this.f5386S ? 1 : 0);
        parcel.writeInt(this.f5387T ? 1 : 0);
        parcel.writeBundle(this.f5388U);
        parcel.writeInt(this.f5389V ? 1 : 0);
        parcel.writeBundle(this.f5391X);
        parcel.writeInt(this.f5390W);
    }

    FragmentState(Parcel parcel) {
        this.f5393a = parcel.readString();
        this.f5394b = parcel.readString();
        boolean z = true;
        this.f5381N = parcel.readInt() != 0;
        this.f5382O = parcel.readInt();
        this.f5383P = parcel.readInt();
        this.f5384Q = parcel.readString();
        this.f5385R = parcel.readInt() != 0;
        this.f5386S = parcel.readInt() != 0;
        this.f5387T = parcel.readInt() != 0;
        this.f5388U = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f5389V = z;
        this.f5391X = parcel.readBundle();
        this.f5390W = parcel.readInt();
    }
}
