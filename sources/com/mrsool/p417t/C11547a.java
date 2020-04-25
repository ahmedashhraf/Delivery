package com.mrsool.p417t;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.C1176c;
import androidx.databinding.C1284m;
import androidx.databinding.ViewDataBinding;
import com.mrsool.C10232R;
import com.mrsool.customeview.CustomeTextViewRobotoRegular;
import p438de.hdodenhof.circleimageview.CircleImageView;

/* renamed from: com.mrsool.t.a */
/* compiled from: CustomMarkerBranchNewOrderBinding */
public abstract class C11547a extends ViewDataBinding {
    @C0193h0

    /* renamed from: p0 */
    public final FrameLayout f32678p0;
    @C0193h0

    /* renamed from: q0 */
    public final CircleImageView f32679q0;
    @C0193h0

    /* renamed from: r0 */
    public final AppCompatImageView f32680r0;
    @C0193h0

    /* renamed from: s0 */
    public final CustomeTextViewRobotoRegular f32681s0;
    @C1176c

    /* renamed from: t0 */
    protected Boolean f32682t0;

    protected C11547a(Object obj, View view, int i, FrameLayout frameLayout, CircleImageView circleImageView, AppCompatImageView appCompatImageView, CustomeTextViewRobotoRegular customeTextViewRobotoRegular) {
        super(obj, view, i);
        this.f32678p0 = frameLayout;
        this.f32679q0 = circleImageView;
        this.f32680r0 = appCompatImageView;
        this.f32681s0 = customeTextViewRobotoRegular;
    }

    @C0193h0
    /* renamed from: a */
    public static C11547a m52046a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z) {
        return m52047a(layoutInflater, viewGroup, z, C1284m.m6873a());
    }

    /* renamed from: c */
    public static C11547a m52050c(@C0193h0 View view) {
        return m52049a(view, (Object) C1284m.m6873a());
    }

    /* renamed from: b */
    public abstract void mo39684b(@C0195i0 Boolean bool);

    @C0195i0
    /* renamed from: u */
    public Boolean mo39685u() {
        return this.f32682t0;
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11547a m52047a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z, @C0195i0 Object obj) {
        return (C11547a) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.custom_marker_branch_new_order, viewGroup, z, obj);
    }

    @C0193h0
    /* renamed from: a */
    public static C11547a m52045a(@C0193h0 LayoutInflater layoutInflater) {
        return m52048a(layoutInflater, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11547a m52048a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 Object obj) {
        return (C11547a) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.custom_marker_branch_new_order, (ViewGroup) null, false, obj);
    }

    @Deprecated
    /* renamed from: a */
    public static C11547a m52049a(@C0193h0 View view, @C0195i0 Object obj) {
        return (C11547a) ViewDataBinding.m6577a(obj, view, (int) C10232R.layout.custom_marker_branch_new_order);
    }
}
