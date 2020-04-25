package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0391q;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.C1118k;
import java.lang.reflect.Method;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: androidx.appcompat.widget.f0 */
/* compiled from: ListPopupWindow */
public class C0495f0 implements C0391q {

    /* renamed from: A0 */
    public static final int f1976A0 = -1;

    /* renamed from: B0 */
    public static final int f1977B0 = -2;

    /* renamed from: C0 */
    public static final int f1978C0 = 0;

    /* renamed from: D0 */
    public static final int f1979D0 = 1;

    /* renamed from: E0 */
    public static final int f1980E0 = 2;

    /* renamed from: s0 */
    private static final String f1981s0 = "ListPopupWindow";

    /* renamed from: t0 */
    private static final boolean f1982t0 = false;

    /* renamed from: u0 */
    static final int f1983u0 = 250;

    /* renamed from: v0 */
    private static Method f1984v0 = null;

    /* renamed from: w0 */
    private static Method f1985w0 = null;

    /* renamed from: x0 */
    private static Method f1986x0 = null;

    /* renamed from: y0 */
    public static final int f1987y0 = 0;

    /* renamed from: z0 */
    public static final int f1988z0 = 1;

    /* renamed from: N */
    C0472b0 f1989N;

    /* renamed from: O */
    private int f1990O;

    /* renamed from: P */
    private int f1991P;

    /* renamed from: Q */
    private int f1992Q;

    /* renamed from: R */
    private int f1993R;

    /* renamed from: S */
    private int f1994S;

    /* renamed from: T */
    private boolean f1995T;

    /* renamed from: U */
    private boolean f1996U;

    /* renamed from: V */
    private boolean f1997V;

    /* renamed from: W */
    private boolean f1998W;

    /* renamed from: X */
    private int f1999X;

    /* renamed from: Y */
    private boolean f2000Y;

    /* renamed from: Z */
    private boolean f2001Z;

    /* renamed from: a */
    private Context f2002a;

    /* renamed from: a0 */
    int f2003a0;

    /* renamed from: b */
    private ListAdapter f2004b;

    /* renamed from: b0 */
    private View f2005b0;

    /* renamed from: c0 */
    private int f2006c0;

    /* renamed from: d0 */
    private DataSetObserver f2007d0;

    /* renamed from: e0 */
    private View f2008e0;

    /* renamed from: f0 */
    private Drawable f2009f0;

    /* renamed from: g0 */
    private OnItemClickListener f2010g0;

    /* renamed from: h0 */
    private OnItemSelectedListener f2011h0;

    /* renamed from: i0 */
    final C0503h f2012i0;

    /* renamed from: j0 */
    private final C0502g f2013j0;

    /* renamed from: k0 */
    private final C0501f f2014k0;

    /* renamed from: l0 */
    private final C0499d f2015l0;

    /* renamed from: m0 */
    private Runnable f2016m0;

    /* renamed from: n0 */
    final Handler f2017n0;

    /* renamed from: o0 */
    private final Rect f2018o0;

    /* renamed from: p0 */
    private Rect f2019p0;

    /* renamed from: q0 */
    private boolean f2020q0;

    /* renamed from: r0 */
    PopupWindow f2021r0;

    /* renamed from: androidx.appcompat.widget.f0$a */
    /* compiled from: ListPopupWindow */
    class C0496a extends C0486d0 {
        C0496a(View view) {
            super(view);
        }

        /* renamed from: a */
        public C0495f0 m2744a() {
            return C0495f0.this;
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$b */
    /* compiled from: ListPopupWindow */
    class C0497b implements Runnable {
        C0497b() {
        }

        public void run() {
            View j = C0495f0.this.mo2617j();
            if (j != null && j.getWindowToken() != null) {
                C0495f0.this.mo1509b();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$c */
    /* compiled from: ListPopupWindow */
    class C0498c implements OnItemSelectedListener {
        C0498c() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                C0472b0 b0Var = C0495f0.this.f1989N;
                if (b0Var != null) {
                    b0Var.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$d */
    /* compiled from: ListPopupWindow */
    private class C0499d implements Runnable {
        C0499d() {
        }

        public void run() {
            C0495f0.this.mo2615i();
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$e */
    /* compiled from: ListPopupWindow */
    private class C0500e extends DataSetObserver {
        C0500e() {
        }

        public void onChanged() {
            if (C0495f0.this.mo1515d()) {
                C0495f0.this.mo1509b();
            }
        }

        public void onInvalidated() {
            C0495f0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$f */
    /* compiled from: ListPopupWindow */
    private class C0501f implements OnScrollListener {
        C0501f() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0495f0.this.mo2636w() && C0495f0.this.f2021r0.getContentView() != null) {
                C0495f0 f0Var = C0495f0.this;
                f0Var.f2017n0.removeCallbacks(f0Var.f2012i0);
                C0495f0.this.f2012i0.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$g */
    /* compiled from: ListPopupWindow */
    private class C0502g implements OnTouchListener {
        C0502g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = C0495f0.this.f2021r0;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < C0495f0.this.f2021r0.getWidth() && y >= 0 && y < C0495f0.this.f2021r0.getHeight()) {
                    C0495f0 f0Var = C0495f0.this;
                    f0Var.f2017n0.postDelayed(f0Var.f2012i0, 250);
                    return false;
                }
            }
            if (action == 1) {
                C0495f0 f0Var2 = C0495f0.this;
                f0Var2.f2017n0.removeCallbacks(f0Var2.f2012i0);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.f0$h */
    /* compiled from: ListPopupWindow */
    private class C0503h implements Runnable {
        C0503h() {
        }

        public void run() {
            C0472b0 b0Var = C0495f0.this.f1989N;
            if (b0Var != null && C0962e0.m5515h0(b0Var) && C0495f0.this.f1989N.getCount() > C0495f0.this.f1989N.getChildCount()) {
                int childCount = C0495f0.this.f1989N.getChildCount();
                C0495f0 f0Var = C0495f0.this;
                if (childCount <= f0Var.f2003a0) {
                    f0Var.f2021r0.setInputMethodMode(2);
                    C0495f0.this.mo1509b();
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT <= 28) {
            try {
                f1984v0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1986x0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (VERSION.SDK_INT <= 23) {
            try {
                f1985w0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C0495f0(@C0193h0 Context context) {
        this(context, null, C0238R.attr.listPopupWindowStyle);
    }

    /* renamed from: A */
    private void m2683A() {
        View view = this.f2005b0;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2005b0);
            }
        }
    }

    /* renamed from: p */
    private static boolean m2686p(int i) {
        return i == 66 || i == 23;
    }

    /* renamed from: z */
    private int mo2125z() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        boolean z = true;
        if (this.f1989N == null) {
            Context context = this.f2002a;
            this.f2016m0 = new C0497b();
            this.f1989N = mo2590a(context, !this.f2020q0);
            Drawable drawable = this.f2009f0;
            if (drawable != null) {
                this.f1989N.setSelector(drawable);
            }
            this.f1989N.setAdapter(this.f2004b);
            this.f1989N.setOnItemClickListener(this.f2010g0);
            this.f1989N.setFocusable(true);
            this.f1989N.setFocusableInTouchMode(true);
            this.f1989N.setOnItemSelectedListener(new C0498c());
            this.f1989N.setOnScrollListener(this.f2014k0);
            OnItemSelectedListener onItemSelectedListener = this.f2011h0;
            if (onItemSelectedListener != null) {
                this.f1989N.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view2 = this.f1989N;
            View view3 = this.f2005b0;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                int i4 = this.f2006c0;
                if (i4 == 0) {
                    linearLayout.addView(view3);
                    linearLayout.addView(view2, layoutParams);
                } else if (i4 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f2006c0);
                    sb.toString();
                } else {
                    linearLayout.addView(view2, layoutParams);
                    linearLayout.addView(view3);
                }
                int i5 = this.f1991P;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f2021r0.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f2021r0.getContentView();
            View view4 = this.f2005b0;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f2021r0.getBackground();
        if (background != null) {
            background.getPadding(this.f2018o0);
            Rect rect = this.f2018o0;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f1995T) {
                this.f1993R = -i6;
            }
        } else {
            this.f2018o0.setEmpty();
            i2 = 0;
        }
        if (this.f2021r0.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m2684a(mo2617j(), this.f1993R, z);
        if (this.f2000Y || this.f1990O == -1) {
            return a + i2;
        }
        int i7 = this.f1991P;
        if (i7 == -2) {
            int i8 = this.f2002a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f2018o0;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i7, C6637f.f18605b);
        } else {
            int i9 = this.f2002a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f2018o0;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), C6637f.f18605b);
        }
        int a2 = this.f1989N.mo2472a(makeMeasureSpec, 0, -1, a - i, -1);
        if (a2 > 0) {
            i += i2 + this.f1989N.getPaddingTop() + this.f1989N.getPaddingBottom();
        }
        return a2 + i;
    }

    /* renamed from: a */
    public void mo2100a(@C0195i0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2007d0;
        if (dataSetObserver == null) {
            this.f2007d0 = new C0500e();
        } else {
            ListAdapter listAdapter2 = this.f2004b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2004b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2007d0);
        }
        C0472b0 b0Var = this.f1989N;
        if (b0Var != null) {
            b0Var.setAdapter(this.f2004b);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public void mo2602b(boolean z) {
        this.f2001Z = z;
    }

    /* renamed from: c */
    public void mo2605c(boolean z) {
        this.f2020q0 = z;
        this.f2021r0.setFocusable(z);
    }

    /* renamed from: d */
    public boolean mo1515d() {
        return this.f2021r0.isShowing();
    }

    public void dismiss() {
        this.f2021r0.dismiss();
        m2683A();
        this.f2021r0.setContentView(null);
        this.f1989N = null;
        this.f2017n0.removeCallbacks(this.f2012i0);
    }

    @C0195i0
    /* renamed from: e */
    public Drawable mo2609e() {
        return this.f2021r0.getBackground();
    }

    /* renamed from: f */
    public void mo2611f(int i) {
        Drawable background = this.f2021r0.getBackground();
        if (background != null) {
            background.getPadding(this.f2018o0);
            Rect rect = this.f2018o0;
            this.f1991P = rect.left + rect.right + i;
            return;
        }
        mo2626n(i);
    }

    /* renamed from: g */
    public int mo2612g() {
        if (!this.f1995T) {
            return 0;
        }
        return this.f1993R;
    }

    /* renamed from: h */
    public void mo2614h(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.f1990O = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    /* renamed from: i */
    public void mo2616i(int i) {
        this.f2021r0.setInputMethodMode(i);
    }

    @C0195i0
    /* renamed from: j */
    public View mo2617j() {
        return this.f2008e0;
    }

    /* renamed from: k */
    public void mo2620k(int i) {
        this.f2006c0 = i;
    }

    @C0195i0
    /* renamed from: l */
    public Rect mo2621l() {
        Rect rect = this.f2019p0;
        if (rect != null) {
            return new Rect(rect);
        }
        return null;
    }

    /* renamed from: m */
    public void mo2624m(int i) {
        this.f2021r0.setSoftInputMode(i);
    }

    /* renamed from: n */
    public void mo2626n(int i) {
        this.f1991P = i;
    }

    /* renamed from: o */
    public int mo2627o() {
        return this.f2006c0;
    }

    @C0195i0
    /* renamed from: p */
    public Object mo2629p() {
        if (!mo1515d()) {
            return null;
        }
        return this.f1989N.getSelectedItem();
    }

    /* renamed from: q */
    public long mo2630q() {
        if (!mo1515d()) {
            return Long.MIN_VALUE;
        }
        return this.f1989N.getSelectedItemId();
    }

    /* renamed from: r */
    public int mo2631r() {
        if (!mo1515d()) {
            return -1;
        }
        return this.f1989N.getSelectedItemPosition();
    }

    @C0195i0
    /* renamed from: s */
    public View mo2632s() {
        if (!mo1515d()) {
            return null;
        }
        return this.f1989N.getSelectedView();
    }

    /* renamed from: t */
    public int mo2633t() {
        return this.f2021r0.getSoftInputMode();
    }

    /* renamed from: u */
    public int mo2634u() {
        return this.f1991P;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: v */
    public boolean mo2635v() {
        return this.f2000Y;
    }

    /* renamed from: w */
    public boolean mo2636w() {
        return this.f2021r0.getInputMethodMode() == 2;
    }

    /* renamed from: x */
    public boolean mo2637x() {
        return this.f2020q0;
    }

    /* renamed from: y */
    public void mo2638y() {
        this.f2017n0.post(this.f2016m0);
    }

    public C0495f0(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.listPopupWindowStyle);
    }

    /* renamed from: b */
    public void mo2600b(Drawable drawable) {
        this.f2009f0 = drawable;
    }

    /* renamed from: d */
    public boolean mo2608d(int i) {
        if (!mo1515d()) {
            return false;
        }
        if (this.f2010g0 != null) {
            C0472b0 b0Var = this.f1989N;
            int i2 = i;
            this.f2010g0.onItemClick(b0Var, b0Var.getChildAt(i - b0Var.getFirstVisiblePosition()), i2, b0Var.getAdapter().getItemId(i));
        }
        return true;
    }

    /* renamed from: e */
    public void mo2610e(@C0216r0 int i) {
        this.f2021r0.setAnimationStyle(i);
    }

    /* renamed from: i */
    public void mo2615i() {
        C0472b0 b0Var = this.f1989N;
        if (b0Var != null) {
            b0Var.setListSelectionHidden(true);
            b0Var.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2618j(int i) {
        this.f2003a0 = i;
    }

    @C0216r0
    /* renamed from: k */
    public int mo2619k() {
        return this.f2021r0.getAnimationStyle();
    }

    /* renamed from: l */
    public void mo2622l(int i) {
        C0472b0 b0Var = this.f1989N;
        if (mo1515d() && b0Var != null) {
            b0Var.setListSelectionHidden(false);
            b0Var.setSelection(i);
            if (b0Var.getChoiceMode() != 0) {
                b0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: m */
    public int mo2623m() {
        return this.f1990O;
    }

    /* renamed from: n */
    public int mo2625n() {
        return this.f2021r0.getInputMethodMode();
    }

    /* renamed from: o */
    public void mo2628o(int i) {
        this.f1994S = i;
    }

    public C0495f0(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: e */
    private void mo2666e(boolean z) {
        if (VERSION.SDK_INT <= 28) {
            Method method = f1984v0;
            if (method != null) {
                try {
                    method.invoke(this.f2021r0, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f2021r0.setIsClippedToScreen(z);
        }
    }

    /* renamed from: b */
    public void mo2601b(@C0195i0 View view) {
        this.f2008e0 = view;
    }

    /* renamed from: c */
    public void mo2604c(@C0195i0 View view) {
        boolean d = mo1515d();
        if (d) {
            m2683A();
        }
        this.f2005b0 = view;
        if (d) {
            mo1509b();
        }
    }

    /* renamed from: g */
    public void mo2613g(int i) {
        this.f1999X = i;
    }

    public C0495f0(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        this.f1990O = -2;
        this.f1991P = -2;
        this.f1994S = 1002;
        this.f1996U = true;
        this.f1999X = 0;
        this.f2000Y = false;
        this.f2001Z = false;
        this.f2003a0 = Integer.MAX_VALUE;
        this.f2006c0 = 0;
        this.f2012i0 = new C0503h();
        this.f2013j0 = new C0502g();
        this.f2014k0 = new C0501f();
        this.f2015l0 = new C0499d();
        this.f2018o0 = new Rect();
        this.f2002a = context;
        this.f2017n0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ListPopupWindow, i, i2);
        this.f1992Q = obtainStyledAttributes.getDimensionPixelOffset(C0238R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1993R = obtainStyledAttributes.getDimensionPixelOffset(C0238R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1993R != 0) {
            this.f1995T = true;
        }
        obtainStyledAttributes.recycle();
        this.f2021r0 = new C0537o(context, attributeSet, i, i2);
        this.f2021r0.setInputMethodMode(1);
    }

    /* renamed from: b */
    public void mo2599b(int i) {
        this.f1993R = i;
        this.f1995T = true;
    }

    @C0195i0
    /* renamed from: f */
    public ListView mo1518f() {
        return this.f1989N;
    }

    /* renamed from: b */
    public void mo1509b() {
        int z = mo2125z();
        boolean w = mo2636w();
        C1118k.m6345a(this.f2021r0, this.f1994S);
        boolean z2 = true;
        if (!this.f2021r0.isShowing()) {
            int i = this.f1991P;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2617j().getWidth();
            }
            int i2 = this.f1990O;
            if (i2 == -1) {
                z = -1;
            } else if (i2 != -2) {
                z = i2;
            }
            this.f2021r0.setWidth(i);
            this.f2021r0.setHeight(z);
            mo2666e(true);
            this.f2021r0.setOutsideTouchable(!this.f2001Z && !this.f2000Y);
            this.f2021r0.setTouchInterceptor(this.f2013j0);
            if (this.f1998W) {
                C1118k.m6347a(this.f2021r0, this.f1997V);
            }
            if (VERSION.SDK_INT <= 28) {
                Method method = f1986x0;
                if (method != null) {
                    try {
                        method.invoke(this.f2021r0, new Object[]{this.f2019p0});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.f2021r0.setEpicenterBounds(this.f2019p0);
            }
            C1118k.m6346a(this.f2021r0, mo2617j(), this.f1992Q, this.f1993R, this.f1999X);
            this.f1989N.setSelection(-1);
            if (!this.f2020q0 || this.f1989N.isInTouchMode()) {
                mo2615i();
            }
            if (!this.f2020q0) {
                this.f2017n0.post(this.f2015l0);
            }
        } else if (C0962e0.m5515h0(mo2617j())) {
            int i3 = this.f1991P;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2617j().getWidth();
            }
            int i4 = this.f1990O;
            if (i4 == -1) {
                if (!w) {
                    z = -1;
                }
                if (w) {
                    this.f2021r0.setWidth(this.f1991P == -1 ? -1 : 0);
                    this.f2021r0.setHeight(0);
                } else {
                    this.f2021r0.setWidth(this.f1991P == -1 ? -1 : 0);
                    this.f2021r0.setHeight(-1);
                }
            } else if (i4 != -2) {
                z = i4;
            }
            PopupWindow popupWindow = this.f2021r0;
            if (this.f2001Z || this.f2000Y) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.f2021r0.update(mo2617j(), this.f1992Q, this.f1993R, i3 < 0 ? -1 : i3, z < 0 ? -1 : z);
        }
    }

    /* renamed from: c */
    public boolean mo2606c(int i, @C0193h0 KeyEvent keyEvent) {
        if (!mo1515d() || this.f1989N.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f1989N.onKeyUp(i, keyEvent);
        if (onKeyUp && m2686p(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public void mo2607d(boolean z) {
        this.f1998W = true;
        this.f1997V = z;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2597a(boolean z) {
        this.f2000Y = z;
    }

    /* renamed from: a */
    public void mo2593a(@C0195i0 Drawable drawable) {
        this.f2021r0.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public int mo2588a() {
        return this.f1992Q;
    }

    /* renamed from: a */
    public void mo2591a(int i) {
        this.f1992Q = i;
    }

    /* renamed from: a */
    public void mo2592a(@C0195i0 Rect rect) {
        this.f2019p0 = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public void mo2594a(@C0195i0 OnItemClickListener onItemClickListener) {
        this.f2010g0 = onItemClickListener;
    }

    /* renamed from: a */
    public void mo2595a(@C0195i0 OnItemSelectedListener onItemSelectedListener) {
        this.f2011h0 = onItemSelectedListener;
    }

    /* renamed from: a */
    public void mo2596a(@C0195i0 OnDismissListener onDismissListener) {
        this.f2021r0.setOnDismissListener(onDismissListener);
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: a */
    public C0472b0 mo2590a(Context context, boolean z) {
        return new C0472b0(context, z);
    }

    /* renamed from: a */
    public boolean mo2598a(int i, @C0193h0 KeyEvent keyEvent) {
        int i2;
        int i3;
        if (mo1515d() && i != 62 && (this.f1989N.getSelectedItemPosition() >= 0 || !m2686p(i))) {
            int selectedItemPosition = this.f1989N.getSelectedItemPosition();
            boolean z = !this.f2021r0.isAboveAnchor();
            ListAdapter listAdapter = this.f2004b;
            int i4 = Integer.MAX_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i3 = 0;
                } else {
                    i3 = this.f1989N.mo2473a(0, true);
                }
                if (areAllItemsEnabled) {
                    i2 = listAdapter.getCount() - 1;
                } else {
                    i2 = this.f1989N.mo2473a(listAdapter.getCount() - 1, false);
                }
                i4 = i3;
            } else {
                i2 = Integer.MIN_VALUE;
            }
            if ((!z || i != 19 || selectedItemPosition > i4) && (z || i != 20 || selectedItemPosition < i2)) {
                this.f1989N.setListSelectionHidden(false);
                if (this.f1989N.onKeyDown(i, keyEvent)) {
                    this.f2021r0.setInputMethodMode(2);
                    this.f1989N.requestFocusFromTouch();
                    mo1509b();
                    if (i == 19 || i == 20 || i == 23 || i == 66) {
                        return true;
                    }
                } else if (!z || i != 20) {
                    if (!z && i == 19 && selectedItemPosition == i4) {
                        return true;
                    }
                    return false;
                } else if (selectedItemPosition == i2) {
                    return true;
                }
            } else {
                mo2615i();
                this.f2021r0.setInputMethodMode(1);
                mo1509b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public OnTouchListener mo2589a(View view) {
        return new C0496a(view);
    }

    /* renamed from: a */
    private int m2684a(View view, int i, boolean z) {
        if (VERSION.SDK_INT > 23) {
            return this.f2021r0.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1985w0;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2021r0, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f2021r0.getMaxAvailableHeight(view, i);
    }

    /* renamed from: b */
    public boolean mo2603b(int i, @C0193h0 KeyEvent keyEvent) {
        if (i == 4 && mo1515d()) {
            View view = this.f2008e0;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    dismiss();
                    return true;
                }
            }
        }
        return false;
    }
}
