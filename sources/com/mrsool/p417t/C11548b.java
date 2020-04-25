package com.mrsool.p417t;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.C1273l;
import androidx.databinding.ViewDataBinding;
import com.mrsool.C10232R;
import com.mrsool.customeview.CustomeTextViewRobotoRegular;
import p438de.hdodenhof.circleimageview.CircleImageView;

/* renamed from: com.mrsool.t.b */
/* compiled from: CustomMarkerBranchNewOrderBindingImpl */
public class C11548b extends C11547a {
    @C0195i0

    /* renamed from: w0 */
    private static final C1162j f32683w0 = null;
    @C0195i0

    /* renamed from: x0 */
    private static final SparseIntArray f32684x0 = new SparseIntArray();
    @C0193h0

    /* renamed from: u0 */
    private final RelativeLayout f32685u0;

    /* renamed from: v0 */
    private long f32686v0;

    static {
        f32684x0.put(C10232R.C10236id.flTitle, 1);
        f32684x0.put(C10232R.C10236id.tvTitle, 2);
        f32684x0.put(C10232R.C10236id.ivLocationPin, 3);
        f32684x0.put(C10232R.C10236id.ivBranchPin, 4);
    }

    public C11548b(@C0195i0 C1273l lVar, @C0193h0 View view) {
        this(lVar, view, ViewDataBinding.m6613a(lVar, view, 5, f32683w0, f32684x0));
    }

    /* renamed from: a */
    public boolean mo5529a(int i, @C0195i0 Object obj) {
        if (1 != i) {
            return false;
        }
        mo39684b((Boolean) obj);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5530a(int i, Object obj, int i2) {
        return false;
    }

    /* renamed from: b */
    public void mo39684b(@C0195i0 Boolean bool) {
        this.f32682t0 = bool;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5534i() {
        synchronized (this) {
            this.f32686v0 = 0;
        }
    }

    /* renamed from: n */
    public boolean mo5539n() {
        synchronized (this) {
            if (this.f32686v0 != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o */
    public void mo5540o() {
        synchronized (this) {
            this.f32686v0 = 2;
        }
        mo5541p();
    }

    private C11548b(C1273l lVar, View view, Object[] objArr) {
        super(lVar, view, 0, (FrameLayout) objArr[1], (CircleImageView) objArr[4], (AppCompatImageView) objArr[3], (CustomeTextViewRobotoRegular) objArr[2]);
        this.f32686v0 = -1;
        this.f32685u0 = objArr[0];
        this.f32685u0.setTag(null);
        mo5519a(view);
        mo5540o();
    }
}
