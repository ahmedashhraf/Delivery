package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1656p;

/* renamed from: androidx.recyclerview.widget.w */
/* compiled from: OrientationHelper */
public abstract class C1775w {

    /* renamed from: d */
    private static final int f6907d = Integer.MIN_VALUE;

    /* renamed from: e */
    public static final int f6908e = 0;

    /* renamed from: f */
    public static final int f6909f = 1;

    /* renamed from: a */
    protected final C1651o f6910a;

    /* renamed from: b */
    private int f6911b;

    /* renamed from: c */
    final Rect f6912c;

    /* renamed from: androidx.recyclerview.widget.w$a */
    /* compiled from: OrientationHelper */
    static class C1776a extends C1775w {
        C1776a(C1651o oVar) {
            super(oVar, null);
        }

        /* renamed from: a */
        public int mo8011a() {
            return this.f6910a.mo7503t();
        }

        /* renamed from: b */
        public int mo8015b() {
            return this.f6910a.mo7503t() - this.f6910a.mo7497q();
        }

        /* renamed from: c */
        public int mo8018c(View view) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            return this.f6910a.mo7484j(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: d */
        public int mo8019d(View view) {
            return this.f6910a.mo7482i(view) - ((C1656p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: e */
        public int mo8022e(View view) {
            this.f6910a.mo7414a(view, true, this.f6912c);
            return this.f6912c.right;
        }

        /* renamed from: f */
        public int mo8024f(View view) {
            this.f6910a.mo7414a(view, true, this.f6912c);
            return this.f6912c.left;
        }

        /* renamed from: g */
        public int mo8025g() {
            return this.f6910a.mo7495p();
        }

        /* renamed from: h */
        public int mo8026h() {
            return (this.f6910a.mo7503t() - this.f6910a.mo7495p()) - this.f6910a.mo7497q();
        }

        /* renamed from: a */
        public void mo8013a(int i) {
            this.f6910a.mo7468e(i);
        }

        /* renamed from: b */
        public int mo8016b(View view) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            return this.f6910a.mo7486k(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: a */
        public int mo8012a(View view) {
            return this.f6910a.mo7488l(view) + ((C1656p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: c */
        public int mo8017c() {
            return this.f6910a.mo7497q();
        }

        /* renamed from: e */
        public int mo8021e() {
            return this.f6910a.mo7505u();
        }

        /* renamed from: f */
        public int mo8023f() {
            return this.f6910a.mo7481i();
        }

        /* renamed from: a */
        public void mo8014a(View view, int i) {
            view.offsetLeftAndRight(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    /* compiled from: OrientationHelper */
    static class C1777b extends C1775w {
        C1777b(C1651o oVar) {
            super(oVar, null);
        }

        /* renamed from: a */
        public int mo8011a() {
            return this.f6910a.mo7478h();
        }

        /* renamed from: b */
        public int mo8015b() {
            return this.f6910a.mo7478h() - this.f6910a.mo7491n();
        }

        /* renamed from: c */
        public int mo8018c(View view) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            return this.f6910a.mo7486k(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: d */
        public int mo8019d(View view) {
            return this.f6910a.mo7490m(view) - ((C1656p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: e */
        public int mo8022e(View view) {
            this.f6910a.mo7414a(view, true, this.f6912c);
            return this.f6912c.bottom;
        }

        /* renamed from: f */
        public int mo8024f(View view) {
            this.f6910a.mo7414a(view, true, this.f6912c);
            return this.f6912c.top;
        }

        /* renamed from: g */
        public int mo8025g() {
            return this.f6910a.mo7501s();
        }

        /* renamed from: h */
        public int mo8026h() {
            return (this.f6910a.mo7478h() - this.f6910a.mo7501s()) - this.f6910a.mo7491n();
        }

        /* renamed from: a */
        public void mo8013a(int i) {
            this.f6910a.mo7472f(i);
        }

        /* renamed from: b */
        public int mo8016b(View view) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            return this.f6910a.mo7484j(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: a */
        public int mo8012a(View view) {
            return this.f6910a.mo7479h(view) + ((C1656p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: c */
        public int mo8017c() {
            return this.f6910a.mo7491n();
        }

        /* renamed from: e */
        public int mo8021e() {
            return this.f6910a.mo7481i();
        }

        /* renamed from: f */
        public int mo8023f() {
            return this.f6910a.mo7505u();
        }

        /* renamed from: a */
        public void mo8014a(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* synthetic */ C1775w(C1651o oVar, C1776a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C1775w m9558a(C1651o oVar, int i) {
        if (i == 0) {
            return m9557a(oVar);
        }
        if (i == 1) {
            return m9559b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C1775w m9559b(C1651o oVar) {
        return new C1777b(oVar);
    }

    /* renamed from: a */
    public abstract int mo8011a();

    /* renamed from: a */
    public abstract int mo8012a(View view);

    /* renamed from: a */
    public abstract void mo8013a(int i);

    /* renamed from: a */
    public abstract void mo8014a(View view, int i);

    /* renamed from: b */
    public abstract int mo8015b();

    /* renamed from: b */
    public abstract int mo8016b(View view);

    /* renamed from: c */
    public abstract int mo8017c();

    /* renamed from: c */
    public abstract int mo8018c(View view);

    /* renamed from: d */
    public abstract int mo8019d(View view);

    /* renamed from: d */
    public C1651o mo8020d() {
        return this.f6910a;
    }

    /* renamed from: e */
    public abstract int mo8021e();

    /* renamed from: e */
    public abstract int mo8022e(View view);

    /* renamed from: f */
    public abstract int mo8023f();

    /* renamed from: f */
    public abstract int mo8024f(View view);

    /* renamed from: g */
    public abstract int mo8025g();

    /* renamed from: h */
    public abstract int mo8026h();

    /* renamed from: i */
    public int mo8027i() {
        if (Integer.MIN_VALUE == this.f6911b) {
            return 0;
        }
        return mo8026h() - this.f6911b;
    }

    /* renamed from: j */
    public void mo8028j() {
        this.f6911b = mo8026h();
    }

    private C1775w(C1651o oVar) {
        this.f6911b = Integer.MIN_VALUE;
        this.f6912c = new Rect();
        this.f6910a = oVar;
    }

    /* renamed from: a */
    public static C1775w m9557a(C1651o oVar) {
        return new C1776a(oVar);
    }
}
