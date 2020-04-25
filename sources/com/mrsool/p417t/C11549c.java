package com.mrsool.p417t;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.databinding.C1284m;
import androidx.databinding.ViewDataBinding;
import com.mrsool.C10232R;
import com.mrsool.customeview.CustomeTextViewRobotoMedium;

/* renamed from: com.mrsool.t.c */
/* compiled from: TooltipCardCvvExpiryBinding */
public abstract class C11549c extends ViewDataBinding {
    @C0193h0

    /* renamed from: p0 */
    public final ImageView f32687p0;
    @C0193h0

    /* renamed from: q0 */
    public final ImageView f32688q0;
    @C0193h0

    /* renamed from: r0 */
    public final CustomeTextViewRobotoMedium f32689r0;
    @C0193h0

    /* renamed from: s0 */
    public final CustomeTextViewRobotoMedium f32690s0;

    protected C11549c(Object obj, View view, int i, ImageView imageView, ImageView imageView2, CustomeTextViewRobotoMedium customeTextViewRobotoMedium, CustomeTextViewRobotoMedium customeTextViewRobotoMedium2) {
        super(obj, view, i);
        this.f32687p0 = imageView;
        this.f32688q0 = imageView2;
        this.f32689r0 = customeTextViewRobotoMedium;
        this.f32690s0 = customeTextViewRobotoMedium2;
    }

    @C0193h0
    /* renamed from: a */
    public static C11549c m52060a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z) {
        return m52061a(layoutInflater, viewGroup, z, C1284m.m6873a());
    }

    /* renamed from: c */
    public static C11549c m52064c(@C0193h0 View view) {
        return m52063a(view, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11549c m52061a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, boolean z, @C0195i0 Object obj) {
        return (C11549c) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.tooltip_card_cvv_expiry, viewGroup, z, obj);
    }

    @C0193h0
    /* renamed from: a */
    public static C11549c m52059a(@C0193h0 LayoutInflater layoutInflater) {
        return m52062a(layoutInflater, (Object) C1284m.m6873a());
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public static C11549c m52062a(@C0193h0 LayoutInflater layoutInflater, @C0195i0 Object obj) {
        return (C11549c) ViewDataBinding.m6576a(layoutInflater, (int) C10232R.layout.tooltip_card_cvv_expiry, (ViewGroup) null, false, obj);
    }

    @Deprecated
    /* renamed from: a */
    public static C11549c m52063a(@C0193h0 View view, @C0195i0 Object obj) {
        return (C11549c) ViewDataBinding.m6577a(obj, view, (int) C10232R.layout.tooltip_card_cvv_expiry);
    }
}
