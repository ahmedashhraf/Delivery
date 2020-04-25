package androidx.appcompat.p011d;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C0996j0;
import androidx.core.p034l.C0998k0;
import java.util.ArrayList;
import java.util.Iterator;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.d.h */
/* compiled from: ViewPropertyAnimatorCompatSet */
public class C0348h {

    /* renamed from: a */
    final ArrayList<C0990i0> f1185a = new ArrayList<>();

    /* renamed from: b */
    private long f1186b = -1;

    /* renamed from: c */
    private Interpolator f1187c;

    /* renamed from: d */
    C0996j0 f1188d;

    /* renamed from: e */
    private boolean f1189e;

    /* renamed from: f */
    private final C0998k0 f1190f = new C0349a();

    /* renamed from: androidx.appcompat.d.h$a */
    /* compiled from: ViewPropertyAnimatorCompatSet */
    class C0349a extends C0998k0 {

        /* renamed from: a */
        private boolean f1191a = false;

        /* renamed from: b */
        private int f1192b = 0;

        C0349a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1371a() {
            this.f1192b = 0;
            this.f1191a = false;
            C0348h.this.mo1369b();
        }

        /* renamed from: b */
        public void mo865b(View view) {
            int i = this.f1192b + 1;
            this.f1192b = i;
            if (i == C0348h.this.f1185a.size()) {
                C0996j0 j0Var = C0348h.this.f1188d;
                if (j0Var != null) {
                    j0Var.mo865b(null);
                }
                mo1371a();
            }
        }

        /* renamed from: c */
        public void mo866c(View view) {
            if (!this.f1191a) {
                this.f1191a = true;
                C0996j0 j0Var = C0348h.this.f1188d;
                if (j0Var != null) {
                    j0Var.mo866c(null);
                }
            }
        }
    }

    /* renamed from: a */
    public C0348h mo1365a(C0990i0 i0Var) {
        if (!this.f1189e) {
            this.f1185a.add(i0Var);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1369b() {
        this.f1189e = false;
    }

    /* renamed from: c */
    public void mo1370c() {
        if (!this.f1189e) {
            Iterator it = this.f1185a.iterator();
            while (it.hasNext()) {
                C0990i0 i0Var = (C0990i0) it.next();
                long j = this.f1186b;
                if (j >= 0) {
                    i0Var.mo4825a(j);
                }
                Interpolator interpolator = this.f1187c;
                if (interpolator != null) {
                    i0Var.mo4826a(interpolator);
                }
                if (this.f1188d != null) {
                    i0Var.mo4827a((C0996j0) this.f1190f);
                }
                i0Var.mo4840e();
            }
            this.f1189e = true;
        }
    }

    /* renamed from: a */
    public C0348h mo1366a(C0990i0 i0Var, C0990i0 i0Var2) {
        this.f1185a.add(i0Var);
        i0Var2.mo4833b(i0Var.mo4831b());
        this.f1185a.add(i0Var2);
        return this;
    }

    /* renamed from: a */
    public void mo1368a() {
        if (this.f1189e) {
            Iterator it = this.f1185a.iterator();
            while (it.hasNext()) {
                ((C0990i0) it.next()).mo4830a();
            }
            this.f1189e = false;
        }
    }

    /* renamed from: a */
    public C0348h mo1363a(long j) {
        if (!this.f1189e) {
            this.f1186b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0348h mo1364a(Interpolator interpolator) {
        if (!this.f1189e) {
            this.f1187c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0348h mo1367a(C0996j0 j0Var) {
        if (!this.f1189e) {
            this.f1188d = j0Var;
        }
        return this;
    }
}
