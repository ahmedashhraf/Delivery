package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.widget.C0508h0;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.appcompat.view.menu.r */
/* compiled from: StandardMenuPopup */
final class C0392r extends C0383l implements OnDismissListener, OnItemClickListener, C0386n, OnKeyListener {

    /* renamed from: g0 */
    private static final int f1437g0 = C0238R.layout.abc_popup_menu_item_layout;

    /* renamed from: N */
    private final C0370g f1438N;

    /* renamed from: O */
    private final C0369f f1439O;

    /* renamed from: P */
    private final boolean f1440P;

    /* renamed from: Q */
    private final int f1441Q;

    /* renamed from: R */
    private final int f1442R;

    /* renamed from: S */
    private final int f1443S;

    /* renamed from: T */
    final C0508h0 f1444T;

    /* renamed from: U */
    final OnGlobalLayoutListener f1445U = new C0393a();

    /* renamed from: V */
    private final OnAttachStateChangeListener f1446V = new C0394b();

    /* renamed from: W */
    private OnDismissListener f1447W;

    /* renamed from: X */
    private View f1448X;

    /* renamed from: Y */
    View f1449Y;

    /* renamed from: Z */
    private C0387a f1450Z;

    /* renamed from: a0 */
    ViewTreeObserver f1451a0;

    /* renamed from: b */
    private final Context f1452b;

    /* renamed from: b0 */
    private boolean f1453b0;

    /* renamed from: c0 */
    private boolean f1454c0;

    /* renamed from: d0 */
    private int f1455d0;

    /* renamed from: e0 */
    private int f1456e0 = 0;

    /* renamed from: f0 */
    private boolean f1457f0;

    /* renamed from: androidx.appcompat.view.menu.r$a */
    /* compiled from: StandardMenuPopup */
    class C0393a implements OnGlobalLayoutListener {
        C0393a() {
        }

        public void onGlobalLayout() {
            if (C0392r.this.mo1515d() && !C0392r.this.f1444T.mo2637x()) {
                View view = C0392r.this.f1449Y;
                if (view == null || !view.isShown()) {
                    C0392r.this.dismiss();
                } else {
                    C0392r.this.f1444T.mo1509b();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.r$b */
    /* compiled from: StandardMenuPopup */
    class C0394b implements OnAttachStateChangeListener {
        C0394b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0392r.this.f1451a0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0392r.this.f1451a0 = view.getViewTreeObserver();
                }
                C0392r rVar = C0392r.this;
                rVar.f1451a0.removeGlobalOnLayoutListener(rVar.f1445U);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0392r(Context context, C0370g gVar, View view, int i, int i2, boolean z) {
        this.f1452b = context;
        this.f1438N = gVar;
        this.f1440P = z;
        this.f1439O = new C0369f(gVar, LayoutInflater.from(context), this.f1440P, f1437g0);
        this.f1442R = i;
        this.f1443S = i2;
        Resources resources = context.getResources();
        this.f1441Q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0238R.dimen.abc_config_prefDialogWidth));
        this.f1448X = view;
        this.f1444T = new C0508h0(this.f1452b, null, this.f1442R, this.f1443S);
        gVar.mo1563a((C0386n) this, context);
    }

    /* renamed from: h */
    private boolean m2228h() {
        if (mo1515d()) {
            return true;
        }
        if (!this.f1453b0) {
            View view = this.f1448X;
            if (view != null) {
                this.f1449Y = view;
                this.f1444T.mo2596a((OnDismissListener) this);
                this.f1444T.mo2594a((OnItemClickListener) this);
                this.f1444T.mo2605c(true);
                View view2 = this.f1449Y;
                boolean z = this.f1451a0 == null;
                this.f1451a0 = view2.getViewTreeObserver();
                if (z) {
                    this.f1451a0.addOnGlobalLayoutListener(this.f1445U);
                }
                view2.addOnAttachStateChangeListener(this.f1446V);
                this.f1444T.mo2601b(view2);
                this.f1444T.mo2613g(this.f1456e0);
                if (!this.f1454c0) {
                    this.f1455d0 = C0383l.m2173a(this.f1439O, null, this.f1452b, this.f1441Q);
                    this.f1454c0 = true;
                }
                this.f1444T.mo2611f(this.f1455d0);
                this.f1444T.mo2616i(2);
                this.f1444T.mo2592a(mo1766g());
                this.f1444T.mo1509b();
                ListView f = this.f1444T.mo1518f();
                f.setOnKeyListener(this);
                if (this.f1457f0 && this.f1438N.mo1608i() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1452b).inflate(C0238R.layout.abc_popup_menu_header_item_layout, f, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f1438N.mo1608i());
                    }
                    frameLayout.setEnabled(false);
                    f.addHeaderView(frameLayout, null, false);
                }
                this.f1444T.mo2100a((ListAdapter) this.f1439O);
                this.f1444T.mo1509b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo1504a(int i) {
        this.f1456e0 = i;
    }

    /* renamed from: a */
    public void mo1505a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo1508a(C0370g gVar) {
    }

    /* renamed from: a */
    public boolean mo1490a() {
        return false;
    }

    /* renamed from: b */
    public void mo1511b(boolean z) {
        this.f1439O.mo1542a(z);
    }

    /* renamed from: c */
    public Parcelable mo1512c() {
        return null;
    }

    /* renamed from: c */
    public void mo1513c(int i) {
        this.f1444T.mo2599b(i);
    }

    /* renamed from: d */
    public boolean mo1515d() {
        return !this.f1453b0 && this.f1444T.mo1515d();
    }

    public void dismiss() {
        if (mo1515d()) {
            this.f1444T.dismiss();
        }
    }

    /* renamed from: f */
    public ListView mo1518f() {
        return this.f1444T.mo1518f();
    }

    public void onDismiss() {
        this.f1453b0 = true;
        this.f1438N.close();
        ViewTreeObserver viewTreeObserver = this.f1451a0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1451a0 = this.f1449Y.getViewTreeObserver();
            }
            this.f1451a0.removeGlobalOnLayoutListener(this.f1445U);
            this.f1451a0 = null;
        }
        this.f1449Y.removeOnAttachStateChangeListener(this.f1446V);
        OnDismissListener onDismissListener = this.f1447W;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        this.f1454c0 = false;
        C0369f fVar = this.f1439O;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo1509b() {
        if (!m2228h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public void mo1514c(boolean z) {
        this.f1457f0 = z;
    }

    /* renamed from: b */
    public void mo1510b(int i) {
        this.f1444T.mo2591a(i);
    }

    /* renamed from: a */
    public void mo1488a(C0387a aVar) {
        this.f1450Z = aVar;
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        if (sVar.hasVisibleItems()) {
            C0384m mVar = new C0384m(this.f1452b, sVar, this.f1449Y, this.f1440P, this.f1442R, this.f1443S);
            mVar.mo1637a(this.f1450Z);
            mVar.mo1773a(C0383l.m2175b((C0370g) sVar));
            mVar.mo1772a(this.f1447W);
            this.f1447W = null;
            this.f1438N.mo1565a(false);
            int a = this.f1444T.mo2588a();
            int g = this.f1444T.mo2612g();
            if ((Gravity.getAbsoluteGravity(this.f1456e0, C0962e0.m5566x(this.f1448X)) & 7) == 5) {
                a += this.f1448X.getWidth();
            }
            if (mVar.mo1775b(a, g)) {
                C0387a aVar = this.f1450Z;
                if (aVar != null) {
                    aVar.mo873a(sVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
        if (gVar == this.f1438N) {
            dismiss();
            C0387a aVar = this.f1450Z;
            if (aVar != null) {
                aVar.mo872a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo1506a(View view) {
        this.f1448X = view;
    }

    /* renamed from: a */
    public void mo1507a(OnDismissListener onDismissListener) {
        this.f1447W = onDismissListener;
    }
}
