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

/* renamed from: com.mrsool.t.j */
/* compiled from: ViewTooltipUpEndArrowBindingImpl */
public class C11556j extends C11555i {
    @C0195i0

    /* renamed from: w0 */
    private static final C1162j f32718w0 = null;
    @C0195i0

    /* renamed from: x0 */
    private static final SparseIntArray f32719x0 = new SparseIntArray();
    @C0193h0

    /* renamed from: u0 */
    private final LinearLayout f32720u0;

    /* renamed from: v0 */
    private long f32721v0;

    static {
        f32719x0.put(C10232R.C10236id.llToolTipMain, 1);
        f32719x0.put(C10232R.C10236id.ivToolTipArrow, 2);
        f32719x0.put(C10232R.C10236id.llToolTip, 3);
        f32719x0.put(C10232R.C10236id.tvTooltipMessage, 4);
        f32719x0.put(C10232R.C10236id.btnTooltipDone, 5);
    }

    public C11556j(@C0195i0 C1273l lVar, @C0193h0 View view) {
        this(lVar, view, ViewDataBinding.m6613a(lVar, view, 6, f32718w0, f32719x0));
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
            this.f32721v0 = 0;
        }
    }

    /* renamed from: n */
    public boolean mo5539n() {
        synchronized (this) {
            if (this.f32721v0 != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o */
    public void mo5540o() {
        synchronized (this) {
            this.f32721v0 = 1;
        }
        mo5541p();
    }

    private C11556j(C1273l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (MaterialButton) objArr[5], (ImageView) objArr[2], (LinearLayout) objArr[3], (LinearLayout) objArr[1], (CustomeTextViewRobotoRegular) objArr[4]);
        this.f32721v0 = -1;
        this.f32720u0 = objArr[0];
        this.f32720u0.setTag(null);
        mo5519a(view);
        mo5540o();
    }
}
