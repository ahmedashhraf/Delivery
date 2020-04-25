package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p179a.C5596j;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    @C0195i0

    /* renamed from: l */
    private Map<View, Integer> f20212l;

    public FabTransformationSheetBehavior() {
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: a */
    public C7116e mo28473a(Context context, boolean z) {
        int i;
        if (z) {
            i = C5582R.C5583animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C5582R.C5583animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C7116e eVar = new C7116e();
        eVar.f20201a = C5594h.m24263a(context, i);
        eVar.f20202b = new C5596j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0194i
    /* renamed from: a */
    public boolean mo28468a(@C0193h0 View view, @C0193h0 View view2, boolean z, boolean z2) {
        m34293a(view2, z);
        return super.mo28468a(view, view2, z, z2);
    }

    /* renamed from: a */
    private void m34293a(@C0193h0 View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f20212l = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof C0716g) && (((C0716g) childAt.getLayoutParams()).mo4027d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f20212l;
                        if (map != null && map.containsKey(childAt)) {
                            C0962e0.m5531l(childAt, ((Integer) this.f20212l.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.f20212l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0962e0.m5531l(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f20212l = null;
            }
        }
    }
}
