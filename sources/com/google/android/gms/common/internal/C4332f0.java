package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.C0892a;
import com.google.android.gms.base.C4049R;
import com.google.android.gms.common.util.C4493l;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4332f0 extends Button {
    public C4332f0(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo18319a(Resources resources, SignInButtonConfig signInButtonConfig) {
        mo18318a(resources, signInButtonConfig.mo18214N(), signInButtonConfig.mo18215O());
    }

    public C4332f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    /* renamed from: a */
    public final void mo18318a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C4049R.C4051drawable.common_google_signin_btn_icon_dark;
        int i5 = C4049R.C4051drawable.common_google_signin_btn_icon_light;
        int a = m18773a(i2, i4, i5, i5);
        int i6 = C4049R.C4051drawable.common_google_signin_btn_text_dark;
        int i7 = C4049R.C4051drawable.common_google_signin_btn_text_light;
        int a2 = m18773a(i2, i6, i7, i7);
        String str = "Unknown button size: ";
        if (i == 0 || i == 1) {
            a = a2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(str);
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable i8 = C0892a.m5161i(resources.getDrawable(a));
        C0892a.m5146a(i8, resources.getColorStateList(C4049R.C4050color.common_google_signin_btn_tint));
        C0892a.m5149a(i8, Mode.SRC_ATOP);
        setBackgroundDrawable(i8);
        int i9 = C4049R.C4050color.common_google_signin_btn_text_dark;
        int i10 = C4049R.C4050color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) C4300a0.m18620a(resources.getColorStateList(m18773a(i2, i9, i10, i10))));
        if (i == 0) {
            setText(resources.getString(C4049R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C4049R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText(null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(str);
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod(null);
        if (C4493l.m19381e(getContext())) {
            setGravity(19);
        }
    }

    /* renamed from: a */
    private static int m18773a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
