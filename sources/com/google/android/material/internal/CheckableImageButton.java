package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.widget.C0522l;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.customview.view.AbsSavedState;

@C0207n0({C0208a.LIBRARY_GROUP})
public class CheckableImageButton extends C0522l implements Checkable {

    /* renamed from: Q */
    private static final int[] f19233Q = {16842912};

    /* renamed from: N */
    private boolean f19234N;

    /* renamed from: O */
    private boolean f19235O;

    /* renamed from: P */
    private boolean f19236P;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C6887a();

        /* renamed from: a */
        boolean f19237a;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        static class C6887a implements ClassLoaderCreator<SavedState> {
            C6887a() {
            }

            @C0193h0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m33077a(@C0193h0 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f19237a = z;
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f19237a ? 1 : 0);
        }

        public SavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m33077a(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C6888a extends C0947a {
        C6888a() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4962c(CheckableImageButton.this.mo27496a());
            dVar.mo4970d(CheckableImageButton.this.isChecked());
        }

        /* renamed from: b */
        public void mo4753b(View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
            super.mo4753b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public boolean mo27496a() {
        return this.f19235O;
    }

    /* renamed from: b */
    public boolean mo27497b() {
        return this.f19236P;
    }

    public boolean isChecked() {
        return this.f19234N;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f19234N) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f19233Q.length), f19233Q);
        }
        return super.onCreateDrawableState(i);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f19237a);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f19237a = this.f19234N;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f19235O != z) {
            this.f19235O = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f19235O && this.f19234N != z) {
            this.f19234N = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f19236P = z;
    }

    public void setPressed(boolean z) {
        if (this.f19236P) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f19234N);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19235O = true;
        this.f19236P = true;
        C0962e0.m5443a((View) this, (C0947a) new C6888a());
    }
}
