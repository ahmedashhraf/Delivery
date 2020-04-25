package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0694a;

public class Group extends C0698a {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3791a(AttributeSet attributeSet) {
        super.mo3791a(attributeSet);
        this.f3118P = false;
    }

    /* renamed from: c */
    public void mo3831c(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f3121b; i++) {
            View a = constraintLayout.mo3796a(this.f3120a[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo3830a(ConstraintLayout constraintLayout) {
        C0694a aVar = (C0694a) getLayoutParams();
        aVar.f3048l0.mo3699u(0);
        aVar.f3048l0.mo3679m(0);
    }
}
