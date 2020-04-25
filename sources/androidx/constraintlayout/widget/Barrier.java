package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.p014h.C0664b;

public class Barrier extends C0698a {

    /* renamed from: U */
    public static final int f2945U = 0;

    /* renamed from: V */
    public static final int f2946V = 2;

    /* renamed from: W */
    public static final int f2947W = 1;

    /* renamed from: a0 */
    public static final int f2948a0 = 3;

    /* renamed from: b0 */
    public static final int f2949b0 = 5;

    /* renamed from: c0 */
    public static final int f2950c0 = 6;

    /* renamed from: R */
    private int f2951R;

    /* renamed from: S */
    private int f2952S;

    /* renamed from: T */
    private C0664b f2953T;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3791a(AttributeSet attributeSet) {
        super.mo3791a(attributeSet);
        this.f2953T = new C0664b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0696R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0696R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2953T.mo3507c(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f3117O = this.f2953T;
        mo3838a();
    }

    /* renamed from: b */
    public boolean mo3792b() {
        return this.f2953T.mo3510s0();
    }

    public int getType() {
        return this.f2951R;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2953T.mo3507c(z);
    }

    public void setType(int i) {
        this.f2951R = i;
        this.f2952S = i;
        if (VERSION.SDK_INT < 17) {
            int i2 = this.f2951R;
            if (i2 == 5) {
                this.f2952S = 0;
            } else if (i2 == 6) {
                this.f2952S = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.f2951R;
                if (i3 == 5) {
                    this.f2952S = 1;
                } else if (i3 == 6) {
                    this.f2952S = 0;
                }
            } else {
                int i4 = this.f2951R;
                if (i4 == 5) {
                    this.f2952S = 0;
                } else if (i4 == 6) {
                    this.f2952S = 1;
                }
            }
        }
        this.f2953T.mo3511z(this.f2952S);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
