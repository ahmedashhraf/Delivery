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

/* renamed from: com.mrsool.t.g */
/* compiled from: ViewTooltipUpEndArrow1Binding */
public abstract class C11553g extends ViewDataBinding {
    @C0193h0

    /* renamed from: p0 */
    public final MaterialButton f32704p0;
    @C0193h0

    /* renamed from: q0 */
    public final ImageView f32705q0;
    @C0193h0

    /* renamed from: r0 */
    public final LinearLayout f32706r0;
    @C0193h0

    /* renamed from: s0 */
    public final LinearLayout f32707s0;
    @C0193h0

    /* renamed from: t0 */
    public final CustomeTextViewRobotoRegular f32708t0;

    protected C11553g(Object obj, View view, int i, MaterialButton materialButton, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, CustomeTextViewRobotoRegular customeTextViewRobotoRegular) {
        super(obj, view, i);
        this.f32704p0 = materialButton;
        this.f32705q0 = imageView;
        this.f32706r0 = linearLayout;
        this.f32707s0 = linearLayout2;
        this.f32708t0 = customeTextViewRobotoRegular;
    }

    @C0193h0
    /* renamed from: a */
    public static C11553g m52082a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z) {
        return m52083a(layoutInflater, viewGroup, z, C1284m.m6873a());
    }

    /* renamed from: c */
    public static C11553g m52086c(@C0193h0 View view) {
        return m52085a(view, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11553g m52083a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z, @C0195i0 Object obj) {
        return (C11553g) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.view_tooltip_up_end_arrow1, viewGroup, z, obj);
    }

    @C0193h0
    /* renamed from: a */
    public static C11553g m52081a(@C0193h0 LayoutInflater layoutInflater) {
        return m52084a(layoutInflater, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11553g m52084a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 Object obj) {
        return (C11553g) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.view_tooltip_up_end_arrow1, (ViewGroup) null, false, obj);
    }

    @Deprecated
    /* renamed from: a */
    public static C11553g m52085a(@C0193h0 View view, @C0195i0 Object obj) {
        return (C11553g) ViewDataBinding.m6577a(obj, view, (int) C10232R.layout.view_tooltip_up_end_arrow1);
    }
}
