package androidx.constraintlayout.solver.p014h;

import androidx.constraintlayout.solver.p014h.C0667e.C0670c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.h.r */
/* compiled from: Snapshot */
public class C0691r {

    /* renamed from: a */
    private int f2934a;

    /* renamed from: b */
    private int f2935b;

    /* renamed from: c */
    private int f2936c;

    /* renamed from: d */
    private int f2937d;

    /* renamed from: e */
    private ArrayList<C0692a> f2938e = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.solver.h.r$a */
    /* compiled from: Snapshot */
    static class C0692a {

        /* renamed from: a */
        private C0667e f2939a;

        /* renamed from: b */
        private C0667e f2940b;

        /* renamed from: c */
        private int f2941c;

        /* renamed from: d */
        private C0670c f2942d;

        /* renamed from: e */
        private int f2943e;

        public C0692a(C0667e eVar) {
            this.f2939a = eVar;
            this.f2940b = eVar.mo3546k();
            this.f2941c = eVar.mo3536c();
            this.f2942d = eVar.mo3545j();
            this.f2943e = eVar.mo3521a();
        }

        /* renamed from: a */
        public void mo3782a(C0677h hVar) {
            hVar.mo3599a(this.f2939a.mo3547l()).mo3530a(this.f2940b, this.f2941c, this.f2942d, this.f2943e);
        }

        /* renamed from: b */
        public void mo3783b(C0677h hVar) {
            this.f2939a = hVar.mo3599a(this.f2939a.mo3547l());
            C0667e eVar = this.f2939a;
            if (eVar != null) {
                this.f2940b = eVar.mo3546k();
                this.f2941c = this.f2939a.mo3536c();
                this.f2942d = this.f2939a.mo3545j();
                this.f2943e = this.f2939a.mo3521a();
                return;
            }
            this.f2940b = null;
            this.f2941c = 0;
            this.f2942d = C0670c.STRONG;
            this.f2943e = 0;
        }
    }

    public C0691r(C0677h hVar) {
        this.f2934a = hVar.mo3596X();
        this.f2935b = hVar.mo3597Y();
        this.f2936c = hVar.mo3593U();
        this.f2937d = hVar.mo3688q();
        ArrayList c = hVar.mo3637c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            this.f2938e.add(new C0692a((C0667e) c.get(i)));
        }
    }

    /* renamed from: a */
    public void mo3780a(C0677h hVar) {
        hVar.mo3705x(this.f2934a);
        hVar.mo3707y(this.f2935b);
        hVar.mo3699u(this.f2936c);
        hVar.mo3679m(this.f2937d);
        int size = this.f2938e.size();
        for (int i = 0; i < size; i++) {
            ((C0692a) this.f2938e.get(i)).mo3782a(hVar);
        }
    }

    /* renamed from: b */
    public void mo3781b(C0677h hVar) {
        this.f2934a = hVar.mo3596X();
        this.f2935b = hVar.mo3597Y();
        this.f2936c = hVar.mo3593U();
        this.f2937d = hVar.mo3688q();
        int size = this.f2938e.size();
        for (int i = 0; i < size; i++) {
            ((C0692a) this.f2938e.get(i)).mo3783b(hVar);
        }
    }
}
