package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.solver.p014h.C0685l;
import androidx.constraintlayout.widget.C0696R.C0697id;
import androidx.constraintlayout.widget.ConstraintLayout.C0694a;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.widget.a */
/* compiled from: ConstraintHelper */
public abstract class C0698a extends View {

    /* renamed from: N */
    protected Context f3116N;

    /* renamed from: O */
    protected C0685l f3117O;

    /* renamed from: P */
    protected boolean f3118P = false;

    /* renamed from: Q */
    private String f3119Q;

    /* renamed from: a */
    protected int[] f3120a = new int[32];

    /* renamed from: b */
    protected int f3121b;

    public C0698a(Context context) {
        super(context);
        this.f3116N = context;
        mo3791a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m4006a(str.substring(i));
                    return;
                } else {
                    m4006a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3791a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0696R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0696R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f3119Q = obtainStyledAttributes.getString(index);
                    setIds(this.f3119Q);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3830a(ConstraintLayout constraintLayout) {
    }

    /* renamed from: b */
    public void mo3839b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo3831c(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f3119Q);
        }
        C0685l lVar = this.f3117O;
        if (lVar != null) {
            lVar.mo3742r0();
            for (int i = 0; i < this.f3121b; i++) {
                View a = constraintLayout.mo3796a(this.f3120a[i]);
                if (a != null) {
                    this.f3117O.mo3751f(constraintLayout.mo3797a(a));
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3120a, this.f3121b);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f3118P) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3121b = 0;
        for (int tag : iArr) {
            setTag(tag, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f3121b + 1;
        int[] iArr = this.f3120a;
        if (i2 > iArr.length) {
            this.f3120a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3120a;
        int i3 = this.f3121b;
        iArr2[i3] = i;
        this.f3121b = i3 + 1;
    }

    public C0698a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3116N = context;
        mo3791a(attributeSet);
    }

    /* renamed from: a */
    public void mo3838a() {
        if (this.f3117O != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0694a) {
                ((C0694a) layoutParams).f3048l0 = this.f3117O;
            }
        }
    }

    public C0698a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3116N = context;
        mo3791a(attributeSet);
    }

    /* renamed from: a */
    private void m4006a(String str) {
        int i;
        if (str != null && this.f3116N != null) {
            String trim = str.trim();
            try {
                i = C0697id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f3116N.getResources().getIdentifier(trim, "id", this.f3116N.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) getParent()).mo3798a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i != 0) {
                setTag(i, null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                sb.toString();
            }
        }
    }
}
