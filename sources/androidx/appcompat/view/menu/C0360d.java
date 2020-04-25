package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.widget.C0505g0;
import androidx.appcompat.widget.C0508h0;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: CascadingMenuPopup */
final class C0360d extends C0383l implements C0386n, OnKeyListener, OnDismissListener {

    /* renamed from: m0 */
    private static final int f1272m0 = C0238R.layout.abc_cascading_menu_item_layout;

    /* renamed from: n0 */
    static final int f1273n0 = 0;

    /* renamed from: o0 */
    static final int f1274o0 = 1;

    /* renamed from: p0 */
    static final int f1275p0 = 200;

    /* renamed from: N */
    private final int f1276N;

    /* renamed from: O */
    private final int f1277O;

    /* renamed from: P */
    private final int f1278P;

    /* renamed from: Q */
    private final boolean f1279Q;

    /* renamed from: R */
    final Handler f1280R;

    /* renamed from: S */
    private final List<C0370g> f1281S = new ArrayList();

    /* renamed from: T */
    final List<C0365d> f1282T = new ArrayList();

    /* renamed from: U */
    final OnGlobalLayoutListener f1283U = new C0361a();

    /* renamed from: V */
    private final OnAttachStateChangeListener f1284V = new C0362b();

    /* renamed from: W */
    private final C0505g0 f1285W = new C0363c();

    /* renamed from: X */
    private int f1286X = 0;

    /* renamed from: Y */
    private int f1287Y = 0;

    /* renamed from: Z */
    private View f1288Z;

    /* renamed from: a0 */
    View f1289a0;

    /* renamed from: b */
    private final Context f1290b;

    /* renamed from: b0 */
    private int f1291b0;

    /* renamed from: c0 */
    private boolean f1292c0;

    /* renamed from: d0 */
    private boolean f1293d0;

    /* renamed from: e0 */
    private int f1294e0;

    /* renamed from: f0 */
    private int f1295f0;

    /* renamed from: g0 */
    private boolean f1296g0;

    /* renamed from: h0 */
    private boolean f1297h0;

    /* renamed from: i0 */
    private C0387a f1298i0;

    /* renamed from: j0 */
    ViewTreeObserver f1299j0;

    /* renamed from: k0 */
    private OnDismissListener f1300k0;

    /* renamed from: l0 */
    boolean f1301l0;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* compiled from: CascadingMenuPopup */
    class C0361a implements OnGlobalLayoutListener {
        C0361a() {
        }

        public void onGlobalLayout() {
            if (C0360d.this.mo1515d() && C0360d.this.f1282T.size() > 0 && !((C0365d) C0360d.this.f1282T.get(0)).f1309a.mo2637x()) {
                View view = C0360d.this.f1289a0;
                if (view == null || !view.isShown()) {
                    C0360d.this.dismiss();
                    return;
                }
                for (C0365d dVar : C0360d.this.f1282T) {
                    dVar.f1309a.mo1509b();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* compiled from: CascadingMenuPopup */
    class C0362b implements OnAttachStateChangeListener {
        C0362b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0360d.this.f1299j0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0360d.this.f1299j0 = view.getViewTreeObserver();
                }
                C0360d dVar = C0360d.this;
                dVar.f1299j0.removeGlobalOnLayoutListener(dVar.f1283U);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* compiled from: CascadingMenuPopup */
    class C0363c implements C0505g0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0364a implements Runnable {

            /* renamed from: N */
            final /* synthetic */ C0370g f1305N;

            /* renamed from: a */
            final /* synthetic */ C0365d f1307a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f1308b;

            C0364a(C0365d dVar, MenuItem menuItem, C0370g gVar) {
                this.f1307a = dVar;
                this.f1308b = menuItem;
                this.f1305N = gVar;
            }

            public void run() {
                C0365d dVar = this.f1307a;
                if (dVar != null) {
                    C0360d.this.f1301l0 = true;
                    dVar.f1310b.mo1565a(false);
                    C0360d.this.f1301l0 = false;
                }
                if (this.f1308b.isEnabled() && this.f1308b.hasSubMenu()) {
                    this.f1305N.mo1566a(this.f1308b, 4);
                }
            }
        }

        C0363c() {
        }

        /* renamed from: a */
        public void mo1524a(@C0193h0 C0370g gVar, @C0193h0 MenuItem menuItem) {
            C0365d dVar = null;
            C0360d.this.f1280R.removeCallbacksAndMessages(null);
            int size = C0360d.this.f1282T.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == ((C0365d) C0360d.this.f1282T.get(i)).f1310b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0360d.this.f1282T.size()) {
                    dVar = (C0365d) C0360d.this.f1282T.get(i2);
                }
                C0360d.this.f1280R.postAtTime(new C0364a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo1525b(@C0193h0 C0370g gVar, @C0193h0 MenuItem menuItem) {
            C0360d.this.f1280R.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0365d {

        /* renamed from: a */
        public final C0508h0 f1309a;

        /* renamed from: b */
        public final C0370g f1310b;

        /* renamed from: c */
        public final int f1311c;

        public C0365d(@C0193h0 C0508h0 h0Var, @C0193h0 C0370g gVar, int i) {
            this.f1309a = h0Var;
            this.f1310b = gVar;
            this.f1311c = i;
        }

        /* renamed from: a */
        public ListView mo1527a() {
            return this.f1309a.mo1518f();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.view.menu.d$e */
    /* compiled from: CascadingMenuPopup */
    public @interface C0366e {
    }

    public C0360d(@C0193h0 Context context, @C0193h0 View view, @C0188f int i, @C0216r0 int i2, boolean z) {
        this.f1290b = context;
        this.f1288Z = view;
        this.f1277O = i;
        this.f1278P = i2;
        this.f1279Q = z;
        this.f1296g0 = false;
        this.f1291b0 = m2013i();
        Resources resources = context.getResources();
        this.f1276N = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0238R.dimen.abc_config_prefDialogWidth));
        this.f1280R = new Handler();
    }

    /* renamed from: c */
    private int m2009c(@C0193h0 C0370g gVar) {
        int size = this.f1282T.size();
        for (int i = 0; i < size; i++) {
            if (gVar == ((C0365d) this.f1282T.get(i)).f1310b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m2010d(int i) {
        List<C0365d> list = this.f1282T;
        ListView a = ((C0365d) list.get(list.size() - 1)).mo1527a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1289a0.getWindowVisibleDisplayFrame(rect);
        if (this.f1291b0 == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: h */
    private C0508h0 m2012h() {
        C0508h0 h0Var = new C0508h0(this.f1290b, null, this.f1277O, this.f1278P);
        h0Var.mo2663a(this.f1285W);
        h0Var.mo2594a((OnItemClickListener) this);
        h0Var.mo2596a((OnDismissListener) this);
        h0Var.mo2601b(this.f1288Z);
        h0Var.mo2613g(this.f1287Y);
        h0Var.mo2605c(true);
        h0Var.mo2616i(2);
        return h0Var;
    }

    /* renamed from: i */
    private int m2013i() {
        return C0962e0.m5566x(this.f1288Z) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo1505a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo1508a(C0370g gVar) {
        gVar.mo1563a((C0386n) this, this.f1290b);
        if (mo1515d()) {
            m2011d(gVar);
        } else {
            this.f1281S.add(gVar);
        }
    }

    /* renamed from: a */
    public boolean mo1490a() {
        return false;
    }

    /* renamed from: b */
    public void mo1511b(boolean z) {
        this.f1296g0 = z;
    }

    /* renamed from: c */
    public Parcelable mo1512c() {
        return null;
    }

    public void dismiss() {
        int size = this.f1282T.size();
        if (size > 0) {
            C0365d[] dVarArr = (C0365d[]) this.f1282T.toArray(new C0365d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0365d dVar = dVarArr[i];
                if (dVar.f1309a.mo1515d()) {
                    dVar.f1309a.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo1517e() {
        return false;
    }

    /* renamed from: f */
    public ListView mo1518f() {
        if (this.f1282T.isEmpty()) {
            return null;
        }
        List<C0365d> list = this.f1282T;
        return ((C0365d) list.get(list.size() - 1)).mo1527a();
    }

    public void onDismiss() {
        C0365d dVar;
        int size = this.f1282T.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0365d) this.f1282T.get(i);
            if (!dVar.f1309a.mo1515d()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f1310b.mo1565a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: b */
    public void mo1509b() {
        if (!mo1515d()) {
            for (C0370g d : this.f1281S) {
                m2011d(d);
            }
            this.f1281S.clear();
            this.f1289a0 = this.f1288Z;
            if (this.f1289a0 != null) {
                boolean z = this.f1299j0 == null;
                this.f1299j0 = this.f1289a0.getViewTreeObserver();
                if (z) {
                    this.f1299j0.addOnGlobalLayoutListener(this.f1283U);
                }
                this.f1289a0.addOnAttachStateChangeListener(this.f1284V);
            }
        }
    }

    /* renamed from: c */
    public void mo1513c(int i) {
        this.f1293d0 = true;
        this.f1295f0 = i;
    }

    /* renamed from: a */
    private MenuItem m2007a(@C0193h0 C0370g gVar, @C0193h0 C0370g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo1514c(boolean z) {
        this.f1297h0 = z;
    }

    @C0195i0
    /* renamed from: a */
    private View m2008a(@C0193h0 C0365d dVar, @C0193h0 C0370g gVar) {
        int i;
        C0369f fVar;
        MenuItem a = m2007a(dVar.f1310b, gVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo1527a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0369f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0369f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: d */
    private void m2011d(@C0193h0 C0370g gVar) {
        View view;
        C0365d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1290b);
        C0369f fVar = new C0369f(gVar, from, this.f1279Q, f1272m0);
        if (!mo1515d() && this.f1296g0) {
            fVar.mo1542a(true);
        } else if (mo1515d()) {
            fVar.mo1542a(C0383l.m2175b(gVar));
        }
        int a = C0383l.m2173a(fVar, null, this.f1290b, this.f1276N);
        C0508h0 h = m2012h();
        h.mo2100a((ListAdapter) fVar);
        h.mo2611f(a);
        h.mo2613g(this.f1287Y);
        if (this.f1282T.size() > 0) {
            List<C0365d> list = this.f1282T;
            dVar = (C0365d) list.get(list.size() - 1);
            view = m2008a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            h.mo2666e(false);
            h.mo2664a((Object) null);
            int d = m2010d(a);
            boolean z = d == 1;
            this.f1291b0 = d;
            if (VERSION.SDK_INT >= 26) {
                h.mo2601b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1288Z.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1287Y & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1288Z.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1287Y & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                h.mo2591a(i3);
                h.mo2607d(true);
                h.mo2599b(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                h.mo2591a(i3);
                h.mo2607d(true);
                h.mo2599b(i2);
            }
            i3 = i + a;
            h.mo2591a(i3);
            h.mo2607d(true);
            h.mo2599b(i2);
        } else {
            if (this.f1292c0) {
                h.mo2591a(this.f1294e0);
            }
            if (this.f1293d0) {
                h.mo2599b(this.f1295f0);
            }
            h.mo2592a(mo1766g());
        }
        this.f1282T.add(new C0365d(h, gVar, this.f1291b0));
        h.mo1509b();
        ListView f = h.mo1518f();
        f.setOnKeyListener(this);
        if (dVar == null && this.f1297h0 && gVar.mo1608i() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0238R.layout.abc_popup_menu_header_item_layout, f, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(gVar.mo1608i());
            f.addHeaderView(frameLayout, null, false);
            h.mo1509b();
        }
    }

    /* renamed from: b */
    public void mo1510b(int i) {
        this.f1292c0 = true;
        this.f1294e0 = i;
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        for (C0365d a : this.f1282T) {
            C0383l.m2174a(a.mo1527a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo1488a(C0387a aVar) {
        this.f1298i0 = aVar;
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        for (C0365d dVar : this.f1282T) {
            if (sVar == dVar.f1310b) {
                dVar.mo1527a().requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        mo1508a((C0370g) sVar);
        C0387a aVar = this.f1298i0;
        if (aVar != null) {
            aVar.mo873a(sVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
        int c = m2009c(gVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f1282T.size()) {
                ((C0365d) this.f1282T.get(i)).f1310b.mo1565a(false);
            }
            C0365d dVar = (C0365d) this.f1282T.remove(c);
            dVar.f1310b.mo1582b((C0386n) this);
            if (this.f1301l0) {
                dVar.f1309a.mo2665b(null);
                dVar.f1309a.mo2610e(0);
            }
            dVar.f1309a.dismiss();
            int size = this.f1282T.size();
            if (size > 0) {
                this.f1291b0 = ((C0365d) this.f1282T.get(size - 1)).f1311c;
            } else {
                this.f1291b0 = m2013i();
            }
            if (size == 0) {
                dismiss();
                C0387a aVar = this.f1298i0;
                if (aVar != null) {
                    aVar.mo872a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1299j0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1299j0.removeGlobalOnLayoutListener(this.f1283U);
                    }
                    this.f1299j0 = null;
                }
                this.f1289a0.removeOnAttachStateChangeListener(this.f1284V);
                this.f1300k0.onDismiss();
            } else if (z) {
                ((C0365d) this.f1282T.get(0)).f1310b.mo1565a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo1504a(int i) {
        if (this.f1286X != i) {
            this.f1286X = i;
            this.f1287Y = C0984g.m5636a(i, C0962e0.m5566x(this.f1288Z));
        }
    }

    /* renamed from: a */
    public void mo1506a(@C0193h0 View view) {
        if (this.f1288Z != view) {
            this.f1288Z = view;
            this.f1287Y = C0984g.m5636a(this.f1286X, C0962e0.m5566x(this.f1288Z));
        }
    }

    /* renamed from: d */
    public boolean mo1515d() {
        return this.f1282T.size() > 0 && ((C0365d) this.f1282T.get(0)).f1309a.mo1515d();
    }

    /* renamed from: a */
    public void mo1507a(OnDismissListener onDismissListener) {
        this.f1300k0 = onDismissListener;
    }
}
