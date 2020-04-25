package com.mrsool.p417t;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.databinding.C1284m;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.customeview.CustomeTextViewRobotoRegular;

/* renamed from: com.mrsool.t.e */
/* compiled from: ViewTooltipBinding */
public abstract class C11551e extends ViewDataBinding {
    @C0193h0

    /* renamed from: p0 */
    public final MaterialButton f32695p0;
    @C0193h0

    /* renamed from: q0 */
    public final ImageView f32696q0;
    @C0193h0

    /* renamed from: r0 */
    public final LinearLayout f32697r0;
    @C0193h0

    /* renamed from: s0 */
    public final LinearLayout f32698s0;
    @C0193h0

    /* renamed from: t0 */
    public final CustomeTextViewRobotoRegular f32699t0;

    protected C11551e(Object obj, View view, int i, MaterialButton materialButton, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, CustomeTextViewRobotoRegular customeTextViewRobotoRegular) {
        super(obj, view, i);
        this.f32695p0 = materialButton;
        this.f32696q0 = imageView;
        this.f32697r0 = linearLayout;
        this.f32698s0 = linearLayout2;
        this.f32699t0 = customeTextViewRobotoRegular;
    }

    @C0193h0
    /* renamed from: a */
    public static C11551e m52071a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z) {
        return m52072a(layoutInflater, viewGroup, z, C1284m.m6873a());
    }

    /* renamed from: c */
    public static C11551e m52075c(@C0193h0 View view) {
        return m52074a(view, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11551e m52072a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z, @C0195i0 Object obj) {
        return (C11551e) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.view_tooltip, viewGroup, z, obj);
    }

    @C0193h0
    /* renamed from: a */
    public static C11551e m52070a(@C0193h0 LayoutInflater layoutInflater) {
        return m52073a(layoutInflater, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11551e m52073a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 Object obj) {
        return (C11551e) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.view_tooltip, (ViewGroup) null, false, obj);
    }

    @Deprecated
    /* renamed from: a */
    public static C11551e m52074a(@C0193h0 View view, @C0195i0 Object obj) {
        return (C11551e) ViewDataBinding.m6577a(obj, view, (int) C10232R.layout.view_tooltip);
    }
}
