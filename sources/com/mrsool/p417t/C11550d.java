package com.mrsool.p417t;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.cardview.widget.CardView;
import androidx.databinding.C1273l;
import androidx.databinding.ViewDataBinding;
import com.mrsool.C10232R;
import com.mrsool.customeview.CustomeTextViewRobotoMedium;

/* renamed from: com.mrsool.t.d */
/* compiled from: TooltipCardCvvExpiryBindingImpl */
public class C11550d extends C11549c {
    @C0195i0

    /* renamed from: v0 */
    private static final C1162j f32691v0 = null;
    @C0195i0

    /* renamed from: w0 */
    private static final SparseIntArray f32692w0 = new SparseIntArray();
    @C0193h0

    /* renamed from: t0 */
    private final CardView f32693t0;

    /* renamed from: u0 */
    private long f32694u0;

    static {
        f32692w0.put(C10232R.C10236id.tvContentTitle, 1);
        f32692w0.put(C10232R.C10236id.ivClose, 2);
        f32692w0.put(C10232R.C10236id.tvContentDesc, 3);
        f32692w0.put(C10232R.C10236id.ivContentImage, 4);
    }

    public C11550d(@C0195i0 C1273l lVar, @C0193h0 View view) {
        this(lVar, view, ViewDataBinding.m6613a(lVar, view, 5, f32691v0, f32692w0));
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
            this.f32694u0 = 0;
        }
    }

    /* renamed from: n */
    public boolean mo5539n() {
        synchronized (this) {
            if (this.f32694u0 != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o */
    public void mo5540o() {
        synchronized (this) {
            this.f32694u0 = 1;
        }
        mo5541p();
    }

    private C11550d(C1273l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (ImageView) objArr[2], (ImageView) objArr[4], (CustomeTextViewRobotoMedium) objArr[3], (CustomeTextViewRobotoMedium) objArr[1]);
        this.f32694u0 = -1;
        this.f32693t0 = objArr[0];
        this.f32693t0.setTag(null);
        mo5519a(view);
        mo5540o();
    }
}
