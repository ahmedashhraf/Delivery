package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import androidx.viewpager2.widget.ViewPager2.C2056j;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.g */
/* compiled from: ScrollEventAdapter */
final class C2073g extends C1660t {

    /* renamed from: n */
    private static final int f7915n = 0;

    /* renamed from: o */
    private static final int f7916o = 1;

    /* renamed from: p */
    private static final int f7917p = 2;

    /* renamed from: q */
    private static final int f7918q = 3;

    /* renamed from: r */
    private static final int f7919r = 4;

    /* renamed from: s */
    private static final int f7920s = -1;

    /* renamed from: a */
    private C2056j f7921a;
    @C0193h0

    /* renamed from: b */
    private final ViewPager2 f7922b;
    @C0193h0

    /* renamed from: c */
    private final RecyclerView f7923c = this.f7922b.f7865U;
    @C0193h0

    /* renamed from: d */
    private final LinearLayoutManager f7924d = ((LinearLayoutManager) this.f7923c.getLayoutManager());

    /* renamed from: e */
    private int f7925e;

    /* renamed from: f */
    private int f7926f;

    /* renamed from: g */
    private C2074a f7927g = new C2074a();

    /* renamed from: h */
    private int f7928h;

    /* renamed from: i */
    private int f7929i;

    /* renamed from: j */
    private boolean f7930j;

    /* renamed from: k */
    private boolean f7931k;

    /* renamed from: l */
    private boolean f7932l;

    /* renamed from: m */
    private boolean f7933m;

    /* renamed from: androidx.viewpager2.widget.g$a */
    /* compiled from: ScrollEventAdapter */
    private static final class C2074a {

        /* renamed from: a */
        int f7934a;

        /* renamed from: b */
        float f7935b;

        /* renamed from: c */
        int f7936c;

        C2074a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9045a() {
            this.f7934a = -1;
            this.f7935b = 0.0f;
            this.f7936c = 0;
        }
    }

    C2073g(@C0193h0 ViewPager2 viewPager2) {
        this.f7922b = viewPager2;
        m10800k();
    }

    /* renamed from: i */
    private int m10798i() {
        return this.f7924d.mo6959N();
    }

    /* renamed from: j */
    private boolean m10799j() {
        int i = this.f7925e;
        return i == 1 || i == 4;
    }

    /* renamed from: k */
    private void m10800k() {
        this.f7925e = 0;
        this.f7926f = 0;
        this.f7927g.mo9045a();
        this.f7928h = -1;
        this.f7929i = -1;
        this.f7930j = false;
        this.f7931k = false;
        this.f7933m = false;
        this.f7932l = false;
    }

    /* renamed from: l */
    private void m10801l() {
        int i;
        C2074a aVar = this.f7927g;
        aVar.f7934a = this.f7924d.mo6959N();
        int i2 = aVar.f7934a;
        if (i2 == -1) {
            aVar.mo9045a();
            return;
        }
        View c = this.f7924d.mo6989c(i2);
        if (c == null) {
            aVar.mo9045a();
            return;
        }
        int o = this.f7924d.mo7494o(c);
        int q = this.f7924d.mo7498q(c);
        int r = this.f7924d.mo7500r(c);
        int g = this.f7924d.mo7475g(c);
        LayoutParams layoutParams = c.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            o += marginLayoutParams.leftMargin;
            q += marginLayoutParams.rightMargin;
            r += marginLayoutParams.topMargin;
            g += marginLayoutParams.bottomMargin;
        }
        int height = c.getHeight() + r + g;
        int width = q + c.getWidth() + o;
        if (this.f7924d.mo6963R() == 0) {
            i = (c.getLeft() - o) - this.f7923c.getPaddingLeft();
            if (this.f7922b.mo8966e()) {
                i = -i;
            }
        } else {
            i = (c.getTop() - r) - this.f7923c.getPaddingTop();
            width = height;
        }
        aVar.f7936c = -i;
        int i3 = aVar.f7936c;
        if (i3 >= 0) {
            aVar.f7935b = width == 0 ? 0.0f : ((float) i3) / ((float) width);
        } else if (new C2066a(this.f7924d).mo9022a()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f7936c)}));
        }
    }

    /* renamed from: a */
    public void mo7531a(@C0193h0 RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f7925e == 1 && this.f7926f == 1) && i == 1) {
            m10796a(false);
        } else if (!m10799j() || i != 2) {
            if (m10799j() && i == 0) {
                m10801l();
                if (!this.f7931k) {
                    int i2 = this.f7927g.f7934a;
                    if (i2 != -1) {
                        m10795a(i2, 0.0f, 0);
                    }
                } else {
                    C2074a aVar = this.f7927g;
                    if (aVar.f7936c == 0) {
                        int i3 = this.f7928h;
                        int i4 = aVar.f7934a;
                        if (i3 != i4) {
                            m10794a(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m10797b(0);
                    m10800k();
                }
            }
            if (this.f7925e == 2 && i == 0 && this.f7932l) {
                m10801l();
                C2074a aVar2 = this.f7927g;
                if (aVar2.f7936c == 0) {
                    int i5 = this.f7929i;
                    int i6 = aVar2.f7934a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m10794a(i6);
                    }
                    m10797b(0);
                    m10800k();
                }
            }
        } else {
            if (this.f7931k) {
                m10797b(2);
                this.f7930j = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo9038b() {
        return this.f7926f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo9039c() {
        return this.f7926f == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo9040d() {
        return this.f7933m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo9041e() {
        return this.f7926f == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9042f() {
        this.f7925e = 4;
        m10796a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo9043g() {
        this.f7932l = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo9044h() {
        if (!mo9039c() || this.f7933m) {
            this.f7933m = false;
            m10801l();
            C2074a aVar = this.f7927g;
            if (aVar.f7936c == 0) {
                int i = aVar.f7934a;
                if (i != this.f7928h) {
                    m10794a(i);
                }
                m10797b(0);
                m10800k();
            } else {
                m10797b(2);
            }
        }
    }

    /* renamed from: b */
    private void m10797b(int i) {
        if ((this.f7925e != 3 || this.f7926f != 0) && this.f7926f != i) {
            this.f7926f = i;
            C2056j jVar = this.f7921a;
            if (jVar != null) {
                jVar.mo8944a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f7922b.mo8966e()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7532a(@androidx.annotation.C0193h0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f7931k = r4
            r3.m10801l()
            boolean r0 = r3.f7930j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            r3.f7930j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f7922b
            boolean r6 = r6.mo8966e()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.g$a r5 = r3.f7927g
            int r6 = r5.f7936c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f7934a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.g$a r5 = r3.f7927g
            int r5 = r5.f7934a
        L_0x0033:
            r3.f7929i = r5
            int r5 = r3.f7928h
            int r6 = r3.f7929i
            if (r5 == r6) goto L_0x004d
            r3.m10794a(r6)
            goto L_0x004d
        L_0x003f:
            int r5 = r3.f7925e
            if (r5 != 0) goto L_0x004d
            androidx.viewpager2.widget.g$a r5 = r3.f7927g
            int r5 = r5.f7934a
            if (r5 != r1) goto L_0x004a
            r5 = 0
        L_0x004a:
            r3.m10794a(r5)
        L_0x004d:
            androidx.viewpager2.widget.g$a r5 = r3.f7927g
            int r5 = r5.f7934a
            if (r5 != r1) goto L_0x0054
            r5 = 0
        L_0x0054:
            androidx.viewpager2.widget.g$a r6 = r3.f7927g
            float r0 = r6.f7935b
            int r6 = r6.f7936c
            r3.m10795a(r5, r0, r6)
            androidx.viewpager2.widget.g$a r5 = r3.f7927g
            int r5 = r5.f7934a
            int r6 = r3.f7929i
            if (r5 == r6) goto L_0x0067
            if (r6 != r1) goto L_0x0077
        L_0x0067:
            androidx.viewpager2.widget.g$a r5 = r3.f7927g
            int r5 = r5.f7936c
            if (r5 != 0) goto L_0x0077
            int r5 = r3.f7926f
            if (r5 == r4) goto L_0x0077
            r3.m10797b(r2)
            r3.m10800k()
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C2073g.mo7532a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: a */
    private void m10796a(boolean z) {
        this.f7933m = z;
        this.f7925e = z ? 4 : 1;
        int i = this.f7929i;
        if (i != -1) {
            this.f7928h = i;
            this.f7929i = -1;
        } else if (this.f7928h == -1) {
            this.f7928h = m10798i();
        }
        m10797b(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9036a(int i, boolean z) {
        this.f7925e = z ? 2 : 3;
        boolean z2 = false;
        this.f7933m = false;
        if (this.f7929i != i) {
            z2 = true;
        }
        this.f7929i = i;
        m10797b(2);
        if (z2) {
            m10794a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9037a(C2056j jVar) {
        this.f7921a = jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public double mo9035a() {
        m10801l();
        C2074a aVar = this.f7927g;
        double d = (double) aVar.f7934a;
        double d2 = (double) aVar.f7935b;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d + d2;
    }

    /* renamed from: a */
    private void m10794a(int i) {
        C2056j jVar = this.f7921a;
        if (jVar != null) {
            jVar.mo8945b(i);
        }
    }

    /* renamed from: a */
    private void m10795a(int i, float f, int i2) {
        C2056j jVar = this.f7921a;
        if (jVar != null) {
            jVar.mo9016a(i, f, i2);
        }
    }
}
