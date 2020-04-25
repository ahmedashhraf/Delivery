package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.google.android.material.badge.BadgeDrawable.SavedState;
import com.google.android.material.internal.ParcelableSparseArray;

@C0207n0({C0208a.LIBRARY})
/* renamed from: com.google.android.material.badge.a */
/* compiled from: BadgeUtils */
public class C5622a {

    /* renamed from: a */
    public static final boolean f16090a = (VERSION.SDK_INT < 18);

    private C5622a() {
    }

    /* renamed from: a */
    public static void m24508a(@C0193h0 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }

    /* renamed from: b */
    public static void m24510b(@C0195i0 BadgeDrawable badgeDrawable, @C0193h0 View view, @C0193h0 FrameLayout frameLayout) {
        if (badgeDrawable != null) {
            if (f16090a) {
                frameLayout.setForeground(null);
            } else {
                view.getOverlay().remove(badgeDrawable);
            }
        }
    }

    /* renamed from: c */
    public static void m24511c(@C0193h0 BadgeDrawable badgeDrawable, @C0193h0 View view, @C0193h0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f16090a ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.mo22251a(view, (ViewGroup) frameLayout);
    }

    /* renamed from: a */
    public static void m24509a(@C0193h0 BadgeDrawable badgeDrawable, @C0193h0 View view, @C0193h0 FrameLayout frameLayout) {
        m24511c(badgeDrawable, view, frameLayout);
        if (f16090a) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    @C0193h0
    /* renamed from: a */
    public static ParcelableSparseArray m24507a(@C0193h0 SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable badgeDrawable = (BadgeDrawable) sparseArray.valueAt(i);
            if (badgeDrawable != null) {
                parcelableSparseArray.put(keyAt, badgeDrawable.mo22275j());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    @C0193h0
    /* renamed from: a */
    public static SparseArray<BadgeDrawable> m24506a(Context context, @C0193h0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            SavedState savedState = (SavedState) parcelableSparseArray.valueAt(i);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.m24473a(context, savedState));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }
}
