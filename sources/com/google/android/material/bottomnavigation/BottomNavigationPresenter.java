package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o;
import androidx.appcompat.view.menu.C0395s;
import com.google.android.material.badge.C5622a;
import com.google.android.material.internal.ParcelableSparseArray;

@C0207n0({C0208a.LIBRARY_GROUP})
public class BottomNavigationPresenter implements C0386n {

    /* renamed from: N */
    private boolean f16182N = false;

    /* renamed from: O */
    private int f16183O;

    /* renamed from: a */
    private C0370g f16184a;

    /* renamed from: b */
    private C5653c f16185b;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C5643a();

        /* renamed from: a */
        int f16186a;
        @C0195i0

        /* renamed from: b */
        ParcelableSparseArray f16187b;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a */
        static class C5643a implements Creator<SavedState> {
            C5643a() {
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @C0193h0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            parcel.writeInt(this.f16186a);
            parcel.writeParcelable(this.f16187b, 0);
        }

        SavedState(@C0193h0 Parcel parcel) {
            this.f16186a = parcel.readInt();
            this.f16187b = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
    }

    /* renamed from: a */
    public void mo1488a(C0387a aVar) {
    }

    /* renamed from: a */
    public void mo22358a(C5653c cVar) {
        this.f16185b = cVar;
    }

    /* renamed from: a */
    public boolean mo1490a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1493a(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        return false;
    }

    /* renamed from: b */
    public void mo22359b(boolean z) {
        this.f16182N = z;
    }

    /* renamed from: b */
    public boolean mo1497b(C0370g gVar, C0375j jVar) {
        return false;
    }

    @C0193h0
    /* renamed from: c */
    public Parcelable mo1512c() {
        SavedState savedState = new SavedState();
        savedState.f16186a = this.f16185b.getSelectedItemId();
        savedState.f16187b = C5622a.m24507a(this.f16185b.getBadgeDrawables());
        return savedState;
    }

    public int getId() {
        return this.f16183O;
    }

    /* renamed from: a */
    public void mo1484a(Context context, C0370g gVar) {
        this.f16184a = gVar;
        this.f16185b.mo1411a(this.f16184a);
    }

    /* renamed from: a */
    public C0388o mo1482a(ViewGroup viewGroup) {
        return this.f16185b;
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        if (!this.f16182N) {
            if (z) {
                this.f16185b.mo22421a();
            } else {
                this.f16185b.mo22425c();
            }
        }
    }

    /* renamed from: a */
    public void mo22357a(int i) {
        this.f16183O = i;
    }

    /* renamed from: a */
    public void mo1505a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f16185b.mo22428f(savedState.f16186a);
            this.f16185b.setBadgeDrawables(C5622a.m24506a(this.f16185b.getContext(), savedState.f16187b));
        }
    }
}
