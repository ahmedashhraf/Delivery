package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.recyclerview.widget.g0 */
/* compiled from: ViewBoundsCheck */
class C1708g0 {

    /* renamed from: c */
    static final int f6559c = 1;

    /* renamed from: d */
    static final int f6560d = 2;

    /* renamed from: e */
    static final int f6561e = 4;

    /* renamed from: f */
    static final int f6562f = 0;

    /* renamed from: g */
    static final int f6563g = 1;

    /* renamed from: h */
    static final int f6564h = 2;

    /* renamed from: i */
    static final int f6565i = 4;

    /* renamed from: j */
    static final int f6566j = 4;

    /* renamed from: k */
    static final int f6567k = 16;

    /* renamed from: l */
    static final int f6568l = 32;

    /* renamed from: m */
    static final int f6569m = 64;

    /* renamed from: n */
    static final int f6570n = 8;

    /* renamed from: o */
    static final int f6571o = 256;

    /* renamed from: p */
    static final int f6572p = 512;

    /* renamed from: q */
    static final int f6573q = 1024;

    /* renamed from: r */
    static final int f6574r = 12;

    /* renamed from: s */
    static final int f6575s = 4096;

    /* renamed from: t */
    static final int f6576t = 8192;

    /* renamed from: u */
    static final int f6577u = 16384;

    /* renamed from: v */
    static final int f6578v = 7;

    /* renamed from: a */
    final C1710b f6579a;

    /* renamed from: b */
    C1709a f6580b = new C1709a();

    /* renamed from: androidx.recyclerview.widget.g0$a */
    /* compiled from: ViewBoundsCheck */
    static class C1709a {

        /* renamed from: a */
        int f6581a = 0;

        /* renamed from: b */
        int f6582b;

        /* renamed from: c */
        int f6583c;

        /* renamed from: d */
        int f6584d;

        /* renamed from: e */
        int f6585e;

        C1709a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo7835a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7837a(int i, int i2, int i3, int i4) {
            this.f6582b = i;
            this.f6583c = i2;
            this.f6584d = i3;
            this.f6585e = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7839b() {
            this.f6581a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7836a(int i) {
            this.f6581a = i | this.f6581a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7838a() {
            int i = this.f6581a;
            if ((i & 7) != 0 && (i & (mo7835a(this.f6584d, this.f6582b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f6581a;
            if ((i2 & 112) != 0 && (i2 & (mo7835a(this.f6584d, this.f6583c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f6581a;
            if ((i3 & 1792) != 0 && (i3 & (mo7835a(this.f6585e, this.f6582b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f6581a;
            if ((i4 & 28672) == 0 || (i4 & (mo7835a(this.f6585e, this.f6583c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g0$b */
    /* compiled from: ViewBoundsCheck */
    interface C1710b {
        /* renamed from: a */
        int mo7512a();

        /* renamed from: a */
        int mo7513a(View view);

        /* renamed from: a */
        View mo7514a(int i);

        /* renamed from: b */
        int mo7515b();

        /* renamed from: b */
        int mo7516b(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.recyclerview.widget.g0$c */
    /* compiled from: ViewBoundsCheck */
    public @interface C1711c {
    }

    C1708g0(C1710b bVar) {
        this.f6579a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo7833a(int i, int i2, int i3, int i4) {
        int a = this.f6579a.mo7512a();
        int b = this.f6579a.mo7515b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f6579a.mo7514a(i);
            this.f6580b.mo7837a(a, b, this.f6579a.mo7513a(a2), this.f6579a.mo7516b(a2));
            if (i3 != 0) {
                this.f6580b.mo7839b();
                this.f6580b.mo7836a(i3);
                if (this.f6580b.mo7838a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f6580b.mo7839b();
                this.f6580b.mo7836a(i4);
                if (this.f6580b.mo7838a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7834a(View view, int i) {
        this.f6580b.mo7837a(this.f6579a.mo7512a(), this.f6579a.mo7515b(), this.f6579a.mo7513a(view), this.f6579a.mo7516b(view));
        if (i == 0) {
            return false;
        }
        this.f6580b.mo7839b();
        this.f6580b.mo7836a(i);
        return this.f6580b.mo7838a();
    }
}
