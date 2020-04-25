package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.m */
/* compiled from: MenuPopupHelper */
public class C0384m implements C0374i {

    /* renamed from: m */
    private static final int f1422m = 48;

    /* renamed from: a */
    private final Context f1423a;

    /* renamed from: b */
    private final C0370g f1424b;

    /* renamed from: c */
    private final boolean f1425c;

    /* renamed from: d */
    private final int f1426d;

    /* renamed from: e */
    private final int f1427e;

    /* renamed from: f */
    private View f1428f;

    /* renamed from: g */
    private int f1429g;

    /* renamed from: h */
    private boolean f1430h;

    /* renamed from: i */
    private C0387a f1431i;

    /* renamed from: j */
    private C0383l f1432j;

    /* renamed from: k */
    private OnDismissListener f1433k;

    /* renamed from: l */
    private final OnDismissListener f1434l;

    /* renamed from: androidx.appcompat.view.menu.m$a */
    /* compiled from: MenuPopupHelper */
    class C0385a implements OnDismissListener {
        C0385a() {
        }

        public void onDismiss() {
            C0384m.this.mo1778e();
        }
    }

    public C0384m(@C0193h0 Context context, @C0193h0 C0370g gVar) {
        this(context, gVar, null, false, C0238R.attr.popupMenuStyle, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.r] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [androidx.appcompat.view.menu.r]
      assigns: [androidx.appcompat.view.menu.r, androidx.appcompat.view.menu.d]
      uses: [androidx.appcompat.view.menu.r, androidx.appcompat.view.menu.l, androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.d]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    @androidx.annotation.C0193h0
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0383l m2192h() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1423a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1423a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = androidx.appcompat.C0238R.dimen.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f1423a
            android.view.View r3 = r14.f1428f
            int r4 = r14.f1426d
            int r5 = r14.f1427e
            boolean r6 = r14.f1425c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.r r0 = new androidx.appcompat.view.menu.r
            android.content.Context r8 = r14.f1423a
            androidx.appcompat.view.menu.g r9 = r14.f1424b
            android.view.View r10 = r14.f1428f
            int r11 = r14.f1426d
            int r12 = r14.f1427e
            boolean r13 = r14.f1425c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.g r1 = r14.f1424b
            r0.mo1508a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1434l
            r0.mo1507a(r1)
            android.view.View r1 = r14.f1428f
            r0.mo1506a(r1)
            androidx.appcompat.view.menu.n$a r1 = r14.f1431i
            r0.mo1488a(r1)
            boolean r1 = r14.f1430h
            r0.mo1511b(r1)
            int r1 = r14.f1429g
            r0.mo1504a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0384m.m2192h():androidx.appcompat.view.menu.l");
    }

    /* renamed from: a */
    public void mo1772a(@C0195i0 OnDismissListener onDismissListener) {
        this.f1433k = onDismissListener;
    }

    /* renamed from: b */
    public boolean mo1775b(int i, int i2) {
        if (mo1777d()) {
            return true;
        }
        if (this.f1428f == null) {
            return false;
        }
        m2191a(i, i2, true, true);
        return true;
    }

    @C0193h0
    /* renamed from: c */
    public C0383l mo1776c() {
        if (this.f1432j == null) {
            this.f1432j = m2192h();
        }
        return this.f1432j;
    }

    /* renamed from: d */
    public boolean mo1777d() {
        C0383l lVar = this.f1432j;
        return lVar != null && lVar.mo1515d();
    }

    public void dismiss() {
        if (mo1777d()) {
            this.f1432j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1778e() {
        this.f1432j = null;
        OnDismissListener onDismissListener = this.f1433k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void mo1779f() {
        if (!mo1780g()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: g */
    public boolean mo1780g() {
        if (mo1777d()) {
            return true;
        }
        if (this.f1428f == null) {
            return false;
        }
        m2191a(0, 0, false, false);
        return true;
    }

    public C0384m(@C0193h0 Context context, @C0193h0 C0370g gVar, @C0193h0 View view) {
        this(context, gVar, view, false, C0238R.attr.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public void mo1771a(@C0193h0 View view) {
        this.f1428f = view;
    }

    public C0384m(@C0193h0 Context context, @C0193h0 C0370g gVar, @C0193h0 View view, boolean z, @C0188f int i) {
        this(context, gVar, view, z, i, 0);
    }

    /* renamed from: a */
    public void mo1773a(boolean z) {
        this.f1430h = z;
        C0383l lVar = this.f1432j;
        if (lVar != null) {
            lVar.mo1511b(z);
        }
    }

    public C0384m(@C0193h0 Context context, @C0193h0 C0370g gVar, @C0193h0 View view, boolean z, @C0188f int i, @C0216r0 int i2) {
        this.f1429g = C0984g.f4394b;
        this.f1434l = new C0385a();
        this.f1423a = context;
        this.f1424b = gVar;
        this.f1428f = view;
        this.f1425c = z;
        this.f1426d = i;
        this.f1427e = i2;
    }

    /* renamed from: b */
    public ListView mo1774b() {
        return mo1776c().mo1518f();
    }

    /* renamed from: a */
    public void mo1769a(int i) {
        this.f1429g = i;
    }

    /* renamed from: a */
    public int mo1768a() {
        return this.f1429g;
    }

    /* renamed from: a */
    public void mo1770a(int i, int i2) {
        if (!mo1775b(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    private void m2191a(int i, int i2, boolean z, boolean z2) {
        C0383l c = mo1776c();
        c.mo1514c(z2);
        if (z) {
            if ((C0984g.m5636a(this.f1429g, C0962e0.m5566x(this.f1428f)) & 7) == 5) {
                i -= this.f1428f.getWidth();
            }
            c.mo1510b(i);
            c.mo1513c(i2);
            int i3 = (int) ((this.f1423a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo1765a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo1509b();
    }

    /* renamed from: a */
    public void mo1637a(@C0195i0 C0387a aVar) {
        this.f1431i = aVar;
        C0383l lVar = this.f1432j;
        if (lVar != null) {
            lVar.mo1488a(aVar);
        }
    }
}
