package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.base.C4049R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4327e0;
import com.google.android.gms.common.internal.C4332f0;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.gms.common.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4421k extends FrameLayout implements OnClickListener {

    /* renamed from: P */
    public static final int f13578P = 0;

    /* renamed from: Q */
    public static final int f13579Q = 1;

    /* renamed from: R */
    public static final int f13580R = 2;

    /* renamed from: S */
    public static final int f13581S = 0;

    /* renamed from: T */
    public static final int f13582T = 1;

    /* renamed from: U */
    public static final int f13583U = 2;

    /* renamed from: N */
    private View f13584N;

    /* renamed from: O */
    private OnClickListener f13585O;

    /* renamed from: a */
    private int f13586a;

    /* renamed from: b */
    private int f13587b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.k$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public @interface C4422a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.k$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public @interface C4423b {
    }

    public C4421k(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo18411a(int i, int i2) {
        this.f13586a = i;
        this.f13587b = i2;
        Context context = getContext();
        View view = this.f13584N;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f13584N = C4327e0.m18732a(context, this.f13586a, this.f13587b);
        } catch (RemoteCreatorException unused) {
            int i3 = this.f13586a;
            int i4 = this.f13587b;
            C4332f0 f0Var = new C4332f0(context);
            f0Var.mo18318a(context.getResources(), i3, i4);
            this.f13584N = f0Var;
        }
        addView(this.f13584N);
        this.f13584N.setEnabled(isEnabled());
        this.f13584N.setOnClickListener(this);
    }

    public final void onClick(View view) {
        OnClickListener onClickListener = this.f13585O;
        if (onClickListener != null && view == this.f13584N) {
            onClickListener.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        mo18411a(this.f13586a, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f13584N.setEnabled(z);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f13585O = onClickListener;
        View view = this.f13584N;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        mo18411a(this.f13586a, this.f13587b);
    }

    public final void setSize(int i) {
        mo18411a(i, this.f13587b);
    }

    public C4421k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public C4421k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13585O = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C4049R.styleable.SignInButton, 0, 0);
        try {
            this.f13586a = obtainStyledAttributes.getInt(C4049R.styleable.SignInButton_buttonSize, 0);
            this.f13587b = obtainStyledAttributes.getInt(C4049R.styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            mo18411a(this.f13586a, this.f13587b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo18412a(int i, int i2, Scope[] scopeArr) {
        mo18411a(i, i2);
    }
}
