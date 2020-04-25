package com.mrsool.p417t;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.databinding.C1273l;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.customeview.CustomeTextViewRobotoRegular;

/* renamed from: com.mrsool.t.f */
/* compiled from: ViewTooltipBindingImpl */
public class C11552f extends C11551e {
    @C0195i0

    /* renamed from: w0 */
    private static final C1162j f32700w0 = null;
    @C0195i0

    /* renamed from: x0 */
    private static final SparseIntArray f32701x0 = new SparseIntArray();
    @C0193h0

    /* renamed from: u0 */
    private final LinearLayout f32702u0;

    /* renamed from: v0 */
    private long f32703v0;

    static {
        f32701x0.put(C10232R.C10236id.llToolTipMain, 1);
        f32701x0.put(C10232R.C10236id.llToolTip, 2);
        f32701x0.put(C10232R.C10236id.tvTooltipMessage, 3);
        f32701x0.put(C10232R.C10236id.btnTooltipDone, 4);
        f32701x0.put(C10232R.C10236id.ivToolTipArrow, 5);
    }

    public C11552f(@C0195i0 C1273l lVar, @C0193h0 View view) {
        this(lVar, view, ViewDataBinding.m6613a(lVar, view, 6, f32700w0, f32701x0));
    }

    /* renamed from: a */
    public boolean mo5529a(int i, @C0195i0 Object obj) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5530a(int i, Object obj, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5534i() {
        synchronized (this) {
            this.f32703v0 = 0;
        }
    }

    /* renamed from: n */
    public boolean mo5539n() {
        synchronized (this) {
            if (this.f32703v0 != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o */
    public void mo5540o() {
        synchronized (this) {
            this.f32703v0 = 1;
        }
        mo5541p();
    }

    private C11552f(C1273l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (MaterialButton) objArr[4], (ImageView) objArr[5], (LinearLayout) objArr[2], (LinearLayout) objArr[1], (CustomeTextViewRobotoRegular) objArr[3]);
        this.f32703v0 = -1;
        this.f32702u0 = objArr[0];
        this.f32702u0.setTag(null);
        mo5519a(view);
        mo5540o();
    }
}
