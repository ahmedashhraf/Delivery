package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.databinding.e0 */
/* compiled from: ViewStubProxy */
public class C1182e0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ViewStub f5065a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewDataBinding f5066b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f5067c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public OnInflateListener f5068d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ViewDataBinding f5069e;

    /* renamed from: f */
    private OnInflateListener f5070f = new C1183a();

    /* renamed from: androidx.databinding.e0$a */
    /* compiled from: ViewStubProxy */
    class C1183a implements OnInflateListener {
        C1183a() {
        }

        public void onInflate(ViewStub viewStub, View view) {
            C1182e0.this.f5067c = view;
            C1182e0 e0Var = C1182e0.this;
            e0Var.f5066b = C1284m.m6870a(e0Var.f5069e.f5041W, view, viewStub.getLayoutResource());
            C1182e0.this.f5065a = null;
            if (C1182e0.this.f5068d != null) {
                C1182e0.this.f5068d.onInflate(viewStub, view);
                C1182e0.this.f5068d = null;
            }
            C1182e0.this.f5069e.mo5540o();
            C1182e0.this.f5069e.mo5536k();
        }
    }

    public C1182e0(@C0193h0 ViewStub viewStub) {
        this.f5065a = viewStub;
        this.f5065a.setOnInflateListener(this.f5070f);
    }

    @C0195i0
    /* renamed from: c */
    public ViewStub mo5596c() {
        return this.f5065a;
    }

    /* renamed from: d */
    public boolean mo5597d() {
        return this.f5067c != null;
    }

    /* renamed from: b */
    public View mo5595b() {
        return this.f5067c;
    }

    /* renamed from: a */
    public void mo5594a(@C0193h0 ViewDataBinding viewDataBinding) {
        this.f5069e = viewDataBinding;
    }

    @C0195i0
    /* renamed from: a */
    public ViewDataBinding mo5592a() {
        return this.f5066b;
    }

    /* renamed from: a */
    public void mo5593a(@C0195i0 OnInflateListener onInflateListener) {
        if (this.f5065a != null) {
            this.f5068d = onInflateListener;
        }
    }
}
