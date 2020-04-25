package com.google.android.material.p179a;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import com.google.android.material.C5582R;

/* renamed from: com.google.android.material.a.d */
/* compiled from: ChildrenAlphaProperty */
public class C5590d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f15935a = new C5590d("childrenAlpha");

    private C5590d(String str) {
        super(Float.class, str);
    }

    @C0193h0
    /* renamed from: a */
    public Float get(@C0193h0 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(C5582R.C5586id.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: a */
    public void set(@C0193h0 ViewGroup viewGroup, @C0193h0 Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(C5582R.C5586id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
