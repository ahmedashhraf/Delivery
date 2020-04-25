package com.aurelhubert.ahbottomnavigation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.p034l.C0962e0;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.aurelhubert.ahbottomnavigation.notification.C2923a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p053b.p065e.p066b.p067a.C2118c;

public class AHBottomNavigation extends FrameLayout {

    /* renamed from: O0 */
    public static final int f10238O0 = -1;

    /* renamed from: P0 */
    public static final int f10239P0 = -1;

    /* renamed from: Q0 */
    private static String f10240Q0 = "AHBottomNavigation";

    /* renamed from: R0 */
    private static final String f10241R0 = "The position (%d) is out of bounds of the items (%d elements)";

    /* renamed from: S0 */
    private static final int f10242S0 = 4;

    /* renamed from: T0 */
    private static final int f10243T0 = 5;

    /* renamed from: A0 */
    private float f10244A0;

    /* renamed from: B0 */
    private boolean f10245B0;

    /* renamed from: C0 */
    private TitleState f10246C0;

    /* renamed from: D0 */
    private ImageView f10247D0;

    /* renamed from: E0 */
    private C0894c f10248E0;
    @C0198k

    /* renamed from: F0 */
    private int f10249F0;
    @C0198k

    /* renamed from: G0 */
    private int f10250G0;

    /* renamed from: H0 */
    private Drawable f10251H0;

    /* renamed from: I0 */
    private Typeface f10252I0;

    /* renamed from: J0 */
    private int f10253J0;

    /* renamed from: K0 */
    private int f10254K0;

    /* renamed from: L0 */
    private int f10255L0;

    /* renamed from: M0 */
    private int f10256M0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Context f10257N;

    /* renamed from: N0 */
    private long f10258N0;

    /* renamed from: O */
    private Resources f10259O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ArrayList<C2909b> f10260P = new ArrayList<>();

    /* renamed from: Q */
    private ArrayList<View> f10261Q = new ArrayList<>();

    /* renamed from: R */
    private AHBottomNavigationBehavior<AHBottomNavigation> f10262R;

    /* renamed from: S */
    private LinearLayout f10263S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f10264T;

    /* renamed from: U */
    private Animator f10265U;

    /* renamed from: V */
    private boolean f10266V = false;

    /* renamed from: W */
    private boolean f10267W = false;

    /* renamed from: a */
    private C2899f f10268a;

    /* renamed from: a0 */
    private boolean f10269a0;

    /* renamed from: b */
    private C2898e f10270b;

    /* renamed from: b0 */
    private List<AHNotification> f10271b0 = AHNotification.m13948a(5);

    /* renamed from: c0 */
    private Boolean[] f10272c0;

    /* renamed from: d0 */
    private boolean f10273d0;

    /* renamed from: e0 */
    private int f10274e0;

    /* renamed from: f0 */
    private int f10275f0;

    /* renamed from: g0 */
    private boolean f10276g0;

    /* renamed from: h0 */
    private boolean f10277h0;

    /* renamed from: i0 */
    private boolean f10278i0;

    /* renamed from: j0 */
    private boolean f10279j0;

    /* renamed from: k0 */
    private int f10280k0;

    /* renamed from: l0 */
    private Typeface f10281l0;

    /* renamed from: m0 */
    private int f10282m0;

    /* renamed from: n0 */
    private int f10283n0;
    @C0198k

    /* renamed from: o0 */
    private int f10284o0;
    @C0198k

    /* renamed from: p0 */
    private int f10285p0;
    @C0198k

    /* renamed from: q0 */
    private int f10286q0;
    @C0198k

    /* renamed from: r0 */
    private int f10287r0;
    @C0198k

    /* renamed from: s0 */
    private int f10288s0;
    @C0198k

    /* renamed from: t0 */
    private int f10289t0;
    @C0198k

    /* renamed from: u0 */
    private int f10290u0;

    /* renamed from: v0 */
    private float f10291v0;

    /* renamed from: w0 */
    private float f10292w0;

    /* renamed from: x0 */
    private int f10293x0;

    /* renamed from: y0 */
    private int f10294y0;

    /* renamed from: z0 */
    private float f10295z0;

    public enum TitleState {
        SHOW_WHEN_ACTIVE,
        SHOW_WHEN_ACTIVE_FORCE,
        ALWAYS_SHOW,
        ALWAYS_HIDE
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$a */
    class C2894a implements Runnable {
        C2894a() {
        }

        public void run() {
            AHBottomNavigation.this.requestLayout();
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$b */
    class C2895b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f10297a;

        C2895b(int i) {
            this.f10297a = i;
        }

        public void onClick(View view) {
            AHBottomNavigation.this.m13829b(this.f10297a, true);
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$c */
    class C2896c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f10299a;

        C2896c(int i) {
            this.f10299a = i;
        }

        public void onClick(View view) {
            AHBottomNavigation.this.m13833c(this.f10299a, true);
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$d */
    class C2897d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ int f10301a;

        C2897d(int i) {
            this.f10301a = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AHBottomNavigation aHBottomNavigation = AHBottomNavigation.this;
            aHBottomNavigation.setBackgroundColor(((C2909b) aHBottomNavigation.f10260P.get(this.f10301a)).mo11580a(AHBottomNavigation.this.f10257N));
            AHBottomNavigation.this.f10264T.setBackgroundColor(0);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            AHBottomNavigation.this.f10264T.setBackgroundColor(((C2909b) AHBottomNavigation.this.f10260P.get(this.f10301a)).mo11580a(AHBottomNavigation.this.f10257N));
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$e */
    public interface C2898e {
        /* renamed from: a */
        void mo11556a(int i);
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigation$f */
    public interface C2899f {
        /* renamed from: a */
        boolean mo11557a(int i, boolean z);
    }

    public AHBottomNavigation(Context context) {
        super(context);
        Boolean valueOf = Boolean.valueOf(true);
        this.f10272c0 = new Boolean[]{valueOf, valueOf, valueOf, valueOf, valueOf};
        this.f10273d0 = false;
        this.f10274e0 = 0;
        this.f10275f0 = 0;
        this.f10276g0 = true;
        this.f10277h0 = false;
        this.f10278i0 = false;
        this.f10279j0 = true;
        this.f10280k0 = 3;
        this.f10282m0 = -1;
        this.f10283n0 = 0;
        this.f10294y0 = 0;
        this.f10245B0 = false;
        this.f10246C0 = TitleState.SHOW_WHEN_ACTIVE;
        m13824a(context, (AttributeSet) null);
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    /* renamed from: f */
    private int m13834f(int i) {
        if (!this.f10269a0) {
            return i;
        }
        int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.f10294y0 = this.f10259O.getDimensionPixelSize(identifier);
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{16842973, 16843760});
        obtainStyledAttributes.getBoolean(0, false);
        boolean z = obtainStyledAttributes.getBoolean(1, true);
        if (mo11492a() && z) {
            i += this.f10294y0;
        }
        obtainStyledAttributes.recycle();
        return i;
    }

    /* renamed from: m */
    private void m13835m() {
        if (this.f10260P.size() >= 4) {
            int size = this.f10260P.size();
        }
        int dimension = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_height);
        removeAllViews();
        this.f10261Q.clear();
        this.f10264T = new View(this.f10257N);
        if (VERSION.SDK_INT >= 21) {
            addView(this.f10264T, new LayoutParams(-1, m13834f(dimension)));
            this.f10293x0 = dimension;
        }
        this.f10263S = new LinearLayout(this.f10257N);
        this.f10263S.setOrientation(0);
        this.f10263S.setGravity(17);
        addView(this.f10263S, new LayoutParams(-1, dimension));
        TitleState titleState = this.f10246C0;
        if (titleState == TitleState.ALWAYS_HIDE || titleState == TitleState.SHOW_WHEN_ACTIVE_FORCE || !(this.f10260P.size() == 4 || this.f10246C0 == TitleState.ALWAYS_SHOW)) {
            m13830b(this.f10263S);
        } else {
            m13825a(this.f10263S);
        }
        post(new C2894a());
    }

    /* renamed from: n */
    private boolean m13836n() {
        return this.f10246C0 == TitleState.ALWAYS_SHOW || (this.f10260P.size() <= 4 && this.f10246C0 != TitleState.ALWAYS_SHOW);
    }

    /* renamed from: d */
    public boolean mo11502d() {
        return this.f10266V;
    }

    /* renamed from: e */
    public void mo11503e(int i) {
        if (i < this.f10260P.size()) {
            this.f10260P.remove(i);
            m13835m();
        }
    }

    /* renamed from: g */
    public boolean mo11506g() {
        return this.f10269a0;
    }

    public int getAccentColor() {
        return this.f10284o0;
    }

    public int getCurrentItem() {
        return this.f10274e0;
    }

    public int getDefaultBackgroundColor() {
        return this.f10282m0;
    }

    public int getINDEX_PROFILE() {
        return this.f10280k0;
    }

    public int getInactiveColor() {
        return this.f10285p0;
    }

    public int getItemsCount() {
        return this.f10260P.size();
    }

    public TitleState getTitleState() {
        return this.f10246C0;
    }

    /* renamed from: h */
    public void mo11514h() {
        m13835m();
    }

    /* renamed from: i */
    public void mo11515i() {
        this.f10260P.clear();
        m13835m();
    }

    /* renamed from: j */
    public void mo11516j() {
        this.f10270b = null;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f10262R;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.mo11568e();
        }
    }

    /* renamed from: k */
    public void mo11517k() {
        this.f10268a = null;
    }

    /* renamed from: l */
    public void mo11518l() {
        mo11497b(true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f10273d0) {
            setBehaviorTranslationEnabled(this.f10276g0);
            this.f10273d0 = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f10274e0 = bundle.getInt("current_item");
            this.f10271b0 = bundle.getParcelableArrayList("notifications");
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putInt("current_item", this.f10274e0);
        bundle.putParcelableArrayList("notifications", new ArrayList(this.f10271b0));
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m13835m();
    }

    public void setAccentColor(int i) {
        this.f10286q0 = i;
        this.f10284o0 = i;
        m13835m();
    }

    public void setBehaviorTranslationEnabled(boolean z) {
        this.f10276g0 = z;
        if (getParent() instanceof CoordinatorLayout) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f10262R;
            if (aHBottomNavigationBehavior == null) {
                this.f10262R = new AHBottomNavigationBehavior<>(z, this.f10294y0);
            } else {
                aHBottomNavigationBehavior.mo11564a(z, this.f10294y0);
            }
            C2898e eVar = this.f10270b;
            if (eVar != null) {
                this.f10262R.mo11563a(eVar);
            }
            ((C0716g) layoutParams).mo4017a((C0712c) this.f10262R);
            if (this.f10277h0) {
                this.f10277h0 = false;
                this.f10262R.mo11559a(this, this.f10293x0, this.f10278i0);
            }
        }
    }

    public void setColored(boolean z) {
        this.f10266V = z;
        this.f10284o0 = z ? this.f10289t0 : this.f10286q0;
        this.f10285p0 = z ? this.f10290u0 : this.f10288s0;
        m13835m();
    }

    public void setCurrentItem(int i) {
        mo11484a(i, true);
    }

    public void setDefaultBackgroundColor(@C0198k int i) {
        this.f10282m0 = i;
        m13835m();
    }

    public void setDefaultBackgroundResource(@C0213q int i) {
        this.f10283n0 = i;
        m13835m();
    }

    public void setForceTint(boolean z) {
        this.f10245B0 = z;
        m13835m();
    }

    public void setINDEX_PROFILE(int i) {
        this.f10280k0 = i;
    }

    public void setInactiveColor(int i) {
        this.f10288s0 = i;
        this.f10285p0 = i;
        m13835m();
    }

    public void setItemDisableColor(@C0198k int i) {
        this.f10287r0 = i;
    }

    public void setNotificationAnimationDuration(long j) {
        this.f10258N0 = j;
        m13827a(true, -1);
    }

    public void setNotificationBackground(Drawable drawable) {
        this.f10251H0 = drawable;
        m13827a(true, -1);
    }

    public void setNotificationBackgroundColor(@C0198k int i) {
        this.f10250G0 = i;
        m13827a(true, -1);
    }

    public void setNotificationBackgroundColorResource(@C0202m int i) {
        this.f10250G0 = C0841b.m4915a(this.f10257N, i);
        m13827a(true, -1);
    }

    public void setNotificationTextColor(@C0198k int i) {
        this.f10249F0 = i;
        m13827a(true, -1);
    }

    public void setNotificationTextColorResource(@C0202m int i) {
        this.f10249F0 = C0841b.m4915a(this.f10257N, i);
        m13827a(true, -1);
    }

    public void setNotificationTypeface(Typeface typeface) {
        this.f10252I0 = typeface;
        m13827a(true, -1);
    }

    public void setOnNavigationPositionListener(C2898e eVar) {
        this.f10270b = eVar;
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f10262R;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.mo11563a(eVar);
        }
    }

    public void setOnTabSelectedListener(C2899f fVar) {
        this.f10268a = fVar;
    }

    public void setProfilePic(C0894c cVar) {
        ImageView imageView = this.f10247D0;
        if (imageView != null) {
            imageView.setImageDrawable(cVar);
        }
    }

    public void setSelectedBackgroundVisible(boolean z) {
        this.f10267W = z;
        m13835m();
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f10279j0 = z;
    }

    public void setTitleState(TitleState titleState) {
        this.f10246C0 = titleState;
        m13835m();
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f10281l0 = typeface;
        m13835m();
    }

    public void setTranslucentNavigationEnabled(boolean z) {
        this.f10269a0 = z;
    }

    public void setUseElevation(boolean z) {
        C0962e0.m5472b((View) this, z ? this.f10259O.getDimension(C2902R.dimen.bottom_navigation_elevation) : 0.0f);
        setClipToPadding(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13833c(int i, boolean z) {
        int i2 = i;
        if (this.f10274e0 == i2) {
            C2899f fVar = this.f10268a;
            if (fVar != null && z) {
                fVar.mo11557a(i2, true);
            }
            return;
        }
        C2899f fVar2 = this.f10268a;
        if (fVar2 == null || !z || fVar2.mo11557a(i2, false)) {
            int dimension = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_small_margin_top_active);
            int dimension2 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_small_margin_top);
            int i3 = 0;
            while (i3 < this.f10261Q.size()) {
                View view = (View) this.f10261Q.get(i3);
                if (this.f10267W) {
                    view.setSelected(i3 == i2);
                }
                if (i3 == i2) {
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(C2902R.C2906id.bottom_navigation_small_container);
                    TextView textView = (TextView) view.findViewById(C2902R.C2906id.bottom_navigation_small_item_title);
                    ImageView imageView = (ImageView) view.findViewById(C2902R.C2906id.bottom_navigation_small_item_icon);
                    TextView textView2 = (TextView) view.findViewById(C2902R.C2906id.bottom_navigation_notification);
                    imageView.setSelected(true);
                    if (this.f10246C0 != TitleState.ALWAYS_HIDE) {
                        C2910c.m13941b((View) imageView, dimension2, dimension);
                        C2910c.m13936a((View) textView2, this.f10254K0, this.f10253J0);
                        C2910c.m13941b((View) textView2, this.f10256M0, this.f10255L0);
                        C2910c.m13939a(textView, this.f10285p0, this.f10284o0);
                        C2910c.m13940b((View) frameLayout, this.f10244A0, this.f10295z0);
                    }
                    C2910c.m13935a((View) textView, 0.0f, 1.0f);
                    C2910c.m13934a(this.f10257N, ((C2909b) this.f10260P.get(i2)).mo11584b(this.f10257N), imageView, this.f10285p0, this.f10284o0, this.f10245B0);
                    if (VERSION.SDK_INT >= 21 && this.f10266V) {
                        int max = Math.max(getWidth(), getHeight());
                        int x = ((int) ((View) this.f10261Q.get(i2)).getX()) + (((View) this.f10261Q.get(i2)).getWidth() / 2);
                        int height = ((View) this.f10261Q.get(i2)).getHeight() / 2;
                        Animator animator = this.f10265U;
                        if (animator != null && animator.isRunning()) {
                            this.f10265U.cancel();
                            setBackgroundColor(((C2909b) this.f10260P.get(i2)).mo11580a(this.f10257N));
                            this.f10264T.setBackgroundColor(0);
                        }
                        this.f10265U = ViewAnimationUtils.createCircularReveal(this.f10264T, x, height, 0.0f, (float) max);
                        this.f10265U.setStartDelay(5);
                        this.f10265U.addListener(new C2897d(i2));
                        this.f10265U.start();
                    } else if (this.f10266V) {
                        C2910c.m13944c(this, this.f10275f0, ((C2909b) this.f10260P.get(i2)).mo11580a(this.f10257N));
                    } else {
                        int i4 = this.f10283n0;
                        if (i4 != 0) {
                            setBackgroundResource(i4);
                        } else {
                            setBackgroundColor(this.f10282m0);
                        }
                        this.f10264T.setBackgroundColor(0);
                    }
                } else if (i3 == this.f10274e0) {
                    View findViewById = view.findViewById(C2902R.C2906id.bottom_navigation_small_container);
                    TextView textView3 = (TextView) view.findViewById(C2902R.C2906id.bottom_navigation_small_item_title);
                    ImageView imageView2 = (ImageView) view.findViewById(C2902R.C2906id.bottom_navigation_small_item_icon);
                    TextView textView4 = (TextView) view.findViewById(C2902R.C2906id.bottom_navigation_notification);
                    imageView2.setSelected(false);
                    if (this.f10246C0 != TitleState.ALWAYS_HIDE) {
                        C2910c.m13941b((View) imageView2, dimension, dimension2);
                        C2910c.m13936a((View) textView4, this.f10253J0, this.f10254K0);
                        C2910c.m13941b((View) textView4, this.f10255L0, this.f10256M0);
                        C2910c.m13939a(textView3, this.f10284o0, this.f10285p0);
                        C2910c.m13940b(findViewById, this.f10295z0, this.f10244A0);
                    }
                    C2910c.m13935a((View) textView3, 1.0f, 0.0f);
                    C2910c.m13934a(this.f10257N, ((C2909b) this.f10260P.get(this.f10274e0)).mo11584b(this.f10257N), imageView2, this.f10284o0, this.f10285p0, this.f10245B0);
                }
                i3++;
            }
            this.f10274e0 = i2;
            int i5 = this.f10274e0;
            if (i5 > 0 && i5 < this.f10260P.size()) {
                this.f10275f0 = ((C2909b) this.f10260P.get(this.f10274e0)).mo11580a(this.f10257N);
            } else if (this.f10274e0 == -1) {
                int i6 = this.f10283n0;
                if (i6 != 0) {
                    setBackgroundResource(i6);
                } else {
                    setBackgroundColor(this.f10282m0);
                }
                this.f10264T.setBackgroundColor(0);
            }
        }
    }

    /* renamed from: d */
    public View mo11501d(int i) {
        LinearLayout linearLayout = this.f10263S;
        if (linearLayout == null || i < 0 || i >= linearLayout.getChildCount()) {
            return null;
        }
        return this.f10263S.getChildAt(i);
    }

    /* renamed from: a */
    private void m13824a(Context context, AttributeSet attributeSet) {
        this.f10257N = context;
        this.f10259O = this.f10257N.getResources();
        this.f10286q0 = C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationAccent);
        this.f10288s0 = C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationInactive);
        this.f10287r0 = C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationDisable);
        this.f10289t0 = C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationActiveColored);
        this.f10290u0 = C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationInactiveColored);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2902R.styleable.AHBottomNavigationBehavior_Params, 0, 0);
            try {
                this.f10267W = obtainStyledAttributes.getBoolean(C2902R.styleable.AHBottomNavigationBehavior_Params_selectedBackgroundVisible, false);
                this.f10269a0 = obtainStyledAttributes.getBoolean(C2902R.styleable.AHBottomNavigationBehavior_Params_translucentNavigationEnabled, false);
                this.f10286q0 = obtainStyledAttributes.getColor(C2902R.styleable.AHBottomNavigationBehavior_Params_accentColor, C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationAccent));
                this.f10288s0 = obtainStyledAttributes.getColor(C2902R.styleable.AHBottomNavigationBehavior_Params_inactiveColor, C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationInactive));
                this.f10287r0 = obtainStyledAttributes.getColor(C2902R.styleable.AHBottomNavigationBehavior_Params_disableColor, C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationDisable));
                this.f10289t0 = obtainStyledAttributes.getColor(C2902R.styleable.AHBottomNavigationBehavior_Params_coloredActive, C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationActiveColored));
                this.f10290u0 = obtainStyledAttributes.getColor(C2902R.styleable.AHBottomNavigationBehavior_Params_coloredInactive, C0841b.m4915a(context, C2902R.C2904color.colorBottomNavigationInactiveColored));
                this.f10266V = obtainStyledAttributes.getBoolean(C2902R.styleable.AHBottomNavigationBehavior_Params_colored, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f10249F0 = C0841b.m4915a(context, 17170443);
        this.f10293x0 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_height);
        this.f10284o0 = this.f10286q0;
        this.f10285p0 = this.f10288s0;
        this.f10253J0 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_notification_margin_left_active);
        this.f10254K0 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_notification_margin_left);
        this.f10255L0 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_notification_margin_top_active);
        this.f10256M0 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_notification_margin_top);
        this.f10258N0 = 150;
        C0962e0.m5472b((View) this, this.f10259O.getDimension(C2902R.dimen.bottom_navigation_elevation));
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.f10293x0));
    }

    /* renamed from: b */
    private void m13830b(LinearLayout linearLayout) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f10257N.getSystemService("layout_inflater");
        float dimension = this.f10259O.getDimension(C2902R.dimen.bottom_navigation_height);
        float dimension2 = this.f10259O.getDimension(C2902R.dimen.bottom_navigation_small_inactive_min_width);
        float dimension3 = this.f10259O.getDimension(C2902R.dimen.bottom_navigation_small_inactive_max_width);
        int width = getWidth();
        if (width != 0 && this.f10260P.size() != 0) {
            float size = (float) (width / this.f10260P.size());
            if (size >= dimension2) {
                dimension2 = size > dimension3 ? dimension3 : size;
            }
            int dimension4 = (int) this.f10259O.getDimension(C2902R.dimen.bottom_navigation_small_margin_top_active);
            float dimension5 = this.f10259O.getDimension(C2902R.dimen.bottom_navigation_small_selected_width_difference);
            this.f10295z0 = (((float) this.f10260P.size()) * dimension5) + dimension2;
            float f = dimension2 - dimension5;
            this.f10244A0 = f;
            int i = 0;
            while (i < this.f10260P.size()) {
                C2909b bVar = (C2909b) this.f10260P.get(i);
                View inflate = layoutInflater.inflate(C2902R.layout.bottom_navigation_small_item, this, false);
                ImageView imageView = (ImageView) inflate.findViewById(C2902R.C2906id.bottom_navigation_small_item_icon);
                TextView textView = (TextView) inflate.findViewById(C2902R.C2906id.bottom_navigation_small_item_title);
                TextView textView2 = (TextView) inflate.findViewById(C2902R.C2906id.bottom_navigation_notification);
                imageView.setImageDrawable(bVar.mo11584b(this.f10257N));
                if (this.f10246C0 != TitleState.ALWAYS_HIDE) {
                    textView.setText(bVar.mo11586c(this.f10257N));
                }
                float f2 = this.f10291v0;
                if (f2 != 0.0f) {
                    textView.setTextSize(0, f2);
                }
                Typeface typeface = this.f10281l0;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
                if (i == this.f10274e0) {
                    if (this.f10267W) {
                        inflate.setSelected(true);
                    }
                    imageView.setSelected(true);
                    if (this.f10246C0 != TitleState.ALWAYS_HIDE && (inflate.getLayoutParams() instanceof MarginLayoutParams)) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimension4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) textView2.getLayoutParams();
                        marginLayoutParams2.setMargins(this.f10253J0, this.f10255L0, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                        inflate.requestLayout();
                    }
                } else {
                    imageView.setSelected(false);
                    MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) textView2.getLayoutParams();
                    marginLayoutParams3.setMargins(this.f10254K0, this.f10256M0, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                }
                if (!this.f10266V) {
                    int i2 = this.f10283n0;
                    if (i2 != 0) {
                        setBackgroundResource(i2);
                    } else {
                        setBackgroundColor(this.f10282m0);
                    }
                } else if (i == this.f10274e0) {
                    setBackgroundColor(bVar.mo11580a(this.f10257N));
                    this.f10275f0 = bVar.mo11580a(this.f10257N);
                }
                if (this.f10272c0[i].booleanValue()) {
                    imageView.setImageDrawable(C2910c.m13933a(((C2909b) this.f10260P.get(i)).mo11584b(this.f10257N), this.f10274e0 == i ? this.f10284o0 : this.f10285p0, this.f10245B0));
                    textView.setTextColor(this.f10274e0 == i ? this.f10284o0 : this.f10285p0);
                    textView.setAlpha(this.f10274e0 == i ? 1.0f : 0.0f);
                    inflate.setOnClickListener(new C2896c(i));
                    inflate.setSoundEffectsEnabled(this.f10279j0);
                } else {
                    imageView.setImageDrawable(C2910c.m13933a(((C2909b) this.f10260P.get(i)).mo11584b(this.f10257N), this.f10287r0, this.f10245B0));
                    textView.setTextColor(this.f10287r0);
                    textView.setAlpha(0.0f);
                }
                int i3 = i == this.f10274e0 ? (int) this.f10295z0 : (int) f;
                if (this.f10246C0 == TitleState.ALWAYS_HIDE) {
                    double d = (double) f;
                    Double.isNaN(d);
                    i3 = (int) (d * 1.16d);
                }
                linearLayout.addView(inflate, new LayoutParams(i3, (int) dimension));
                this.f10261Q.add(inflate);
                i++;
            }
            m13827a(true, -1);
        }
    }

    /* renamed from: e */
    public boolean mo11504e() {
        return this.f10245B0;
    }

    /* renamed from: f */
    public boolean mo11505f() {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f10262R;
        if (aHBottomNavigationBehavior != null) {
            return aHBottomNavigationBehavior.mo11567d();
        }
        return false;
    }

    public AHBottomNavigation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Boolean valueOf = Boolean.valueOf(true);
        this.f10272c0 = new Boolean[]{valueOf, valueOf, valueOf, valueOf, valueOf};
        this.f10273d0 = false;
        this.f10274e0 = 0;
        this.f10275f0 = 0;
        this.f10276g0 = true;
        this.f10277h0 = false;
        this.f10278i0 = false;
        this.f10279j0 = true;
        this.f10280k0 = 3;
        this.f10282m0 = -1;
        this.f10283n0 = 0;
        this.f10294y0 = 0;
        this.f10245B0 = false;
        this.f10246C0 = TitleState.SHOW_WHEN_ACTIVE;
        m13824a(context, attributeSet);
    }

    public AHBottomNavigation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Boolean valueOf = Boolean.valueOf(true);
        this.f10272c0 = new Boolean[]{valueOf, valueOf, valueOf, valueOf, valueOf};
        this.f10273d0 = false;
        this.f10274e0 = 0;
        this.f10275f0 = 0;
        this.f10276g0 = true;
        this.f10277h0 = false;
        this.f10278i0 = false;
        this.f10279j0 = true;
        this.f10280k0 = 3;
        this.f10282m0 = -1;
        this.f10283n0 = 0;
        this.f10294y0 = 0;
        this.f10245B0 = false;
        this.f10246C0 = TitleState.SHOW_WHEN_ACTIVE;
        m13824a(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    @TargetApi(21)
    /* renamed from: a */
    public boolean mo11492a() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i2 > displayMetrics2.widthPixels || i > displayMetrics2.heightPixels;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13825a(android.widget.LinearLayout r20) {
        /*
            r19 = this;
            r0 = r19
            android.content.Context r1 = r0.f10257N
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            android.content.res.Resources r2 = r0.f10259O
            int r3 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_height
            float r2 = r2.getDimension(r3)
            android.content.res.Resources r3 = r0.f10259O
            int r4 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_min_width
            float r3 = r3.getDimension(r4)
            android.content.res.Resources r4 = r0.f10259O
            int r5 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_max_width
            float r4 = r4.getDimension(r5)
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r5 = r0.f10246C0
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r6 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.TitleState.ALWAYS_SHOW
            r7 = 4
            if (r5 != r6) goto L_0x0043
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r5 = r0.f10260P
            int r5 = r5.size()
            if (r5 <= r7) goto L_0x0043
            android.content.res.Resources r3 = r0.f10259O
            int r4 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_small_inactive_min_width
            float r3 = r3.getDimension(r4)
            android.content.res.Resources r4 = r0.f10259O
            int r5 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_small_inactive_max_width
            float r4 = r4.getDimension(r5)
        L_0x0043:
            int r5 = r19.getWidth()
            if (r5 == 0) goto L_0x0281
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r6 = r0.f10260P
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0053
            goto L_0x0281
        L_0x0053:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r6 = r0.f10260P
            int r6 = r6.size()
            int r5 = r5 / r6
            float r5 = (float) r5
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0060
            goto L_0x0067
        L_0x0060:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0066
            r3 = r4
            goto L_0x0067
        L_0x0066:
            r3 = r5
        L_0x0067:
            android.content.res.Resources r4 = r0.f10259O
            int r5 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_active
            float r4 = r4.getDimension(r5)
            android.content.res.Resources r5 = r0.f10259O
            int r6 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_inactive
            float r5 = r5.getDimension(r6)
            android.content.res.Resources r6 = r0.f10259O
            int r8 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_margin_top_active
            float r6 = r6.getDimension(r8)
            int r6 = (int) r6
            float r8 = r0.f10291v0
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 == 0) goto L_0x0090
            float r10 = r0.f10292w0
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0090
            r4 = r8
            r5 = r10
            goto L_0x00ae
        L_0x0090:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r8 = r0.f10246C0
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r9 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.TitleState.ALWAYS_SHOW
            if (r8 != r9) goto L_0x00ae
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r8 = r0.f10260P
            int r8 = r8.size()
            if (r8 <= r7) goto L_0x00ae
            android.content.res.Resources r4 = r0.f10259O
            int r5 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_forced_active
            float r4 = r4.getDimension(r5)
            android.content.res.Resources r5 = r0.f10259O
            int r8 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_forced_inactive
            float r5 = r5.getDimension(r8)
        L_0x00ae:
            r8 = 0
            r9 = 0
        L_0x00b0:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r10 = r0.f10260P
            int r10 = r10.size()
            if (r9 >= r10) goto L_0x027c
            int r10 = r0.f10274e0
            if (r10 != r9) goto L_0x00be
            r10 = 1
            goto L_0x00bf
        L_0x00be:
            r10 = 0
        L_0x00bf:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r12 = r0.f10260P
            java.lang.Object r12 = r12.get(r9)
            com.aurelhubert.ahbottomnavigation.b r12 = (com.aurelhubert.ahbottomnavigation.C2909b) r12
            int r13 = com.aurelhubert.ahbottomnavigation.C2902R.layout.bottom_navigation_item
            android.view.View r13 = r1.inflate(r13, r0, r8)
            int r14 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_container
            android.view.View r14 = r13.findViewById(r14)
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            int r15 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_icon
            android.view.View r15 = r13.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            int r11 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_title
            android.view.View r11 = r13.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            int r7 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_notification
            android.view.View r7 = r13.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r8 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_profile
            android.view.View r8 = r13.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r16 = r1
            android.content.Context r1 = r0.f10257N
            android.graphics.drawable.Drawable r1 = r12.mo11584b(r1)
            r15.setImageDrawable(r1)
            android.content.Context r1 = r0.f10257N
            java.lang.String r1 = r12.mo11586c(r1)
            r11.setText(r1)
            int r1 = r0.f10280k0
            if (r9 != r1) goto L_0x0135
            r1 = 8
            r11.setVisibility(r1)
            r7.setVisibility(r1)
            r15.setVisibility(r1)
            r1 = 0
            r8.setVisibility(r1)
            r0.f10247D0 = r8
            android.content.Context r1 = r0.f10257N
            android.graphics.drawable.Drawable r1 = r12.mo11584b(r1)
            r8.setImageDrawable(r1)
            android.content.Context r1 = r0.f10257N
            r17 = r4
            int r4 = com.aurelhubert.ahbottomnavigation.C2902R.string.lbl_me_tab
            java.lang.String r1 = r1.getString(r4)
            r13.setContentDescription(r1)
            goto L_0x0137
        L_0x0135:
            r17 = r4
        L_0x0137:
            android.graphics.Typeface r1 = r0.f10281l0
            if (r1 == 0) goto L_0x013e
            r11.setTypeface(r1)
        L_0x013e:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r1 = r0.f10246C0
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r4 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.TitleState.ALWAYS_SHOW
            if (r1 != r4) goto L_0x015c
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r1 = r0.f10260P
            int r1 = r1.size()
            r4 = 4
            if (r1 <= r4) goto L_0x015c
            int r1 = r14.getPaddingTop()
            int r4 = r14.getPaddingBottom()
            r18 = r5
            r5 = 0
            r14.setPadding(r5, r1, r5, r4)
            goto L_0x015e
        L_0x015c:
            r18 = r5
        L_0x015e:
            if (r10 == 0) goto L_0x0199
            boolean r1 = r0.f10267W
            if (r1 == 0) goto L_0x0169
            r1 = 1
            r13.setSelected(r1)
            goto L_0x016a
        L_0x0169:
            r1 = 1
        L_0x016a:
            r15.setSelected(r1)
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            boolean r1 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r1.leftMargin
            int r5 = r1.rightMargin
            int r14 = r1.bottomMargin
            r1.setMargins(r4, r6, r5, r14)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r0.f10253J0
            int r5 = r1.topMargin
            int r7 = r1.rightMargin
            int r14 = r1.bottomMargin
            r1.setMargins(r4, r5, r7, r14)
            r13.requestLayout()
            goto L_0x01ae
        L_0x0199:
            r1 = 0
            r15.setSelected(r1)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = r0.f10254K0
            int r5 = r1.topMargin
            int r7 = r1.rightMargin
            int r14 = r1.bottomMargin
            r1.setMargins(r4, r5, r7, r14)
        L_0x01ae:
            boolean r1 = r0.f10266V
            if (r1 == 0) goto L_0x01c6
            if (r10 == 0) goto L_0x01d3
            android.content.Context r1 = r0.f10257N
            int r1 = r12.mo11580a(r1)
            r0.setBackgroundColor(r1)
            android.content.Context r1 = r0.f10257N
            int r1 = r12.mo11580a(r1)
            r0.f10275f0 = r1
            goto L_0x01d3
        L_0x01c6:
            int r1 = r0.f10283n0
            if (r1 == 0) goto L_0x01ce
            r0.setBackgroundResource(r1)
            goto L_0x01d3
        L_0x01ce:
            int r1 = r0.f10282m0
            r0.setBackgroundColor(r1)
        L_0x01d3:
            if (r10 == 0) goto L_0x01d8
            r1 = r17
            goto L_0x01da
        L_0x01d8:
            r1 = r18
        L_0x01da:
            r4 = 0
            r11.setTextSize(r4, r1)
            java.lang.Boolean[] r1 = r0.f10272c0
            r1 = r1[r9]
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x023c
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$b r1 = new com.aurelhubert.ahbottomnavigation.AHBottomNavigation$b
            r1.<init>(r9)
            r13.setOnClickListener(r1)
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r1 = r0.f10260P
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.b r1 = (com.aurelhubert.ahbottomnavigation.C2909b) r1
            android.content.Context r5 = r0.f10257N
            android.graphics.drawable.Drawable r1 = r1.mo11584b(r5)
            if (r10 == 0) goto L_0x0203
            int r5 = r0.f10284o0
            goto L_0x0205
        L_0x0203:
            int r5 = r0.f10285p0
        L_0x0205:
            boolean r7 = r0.f10245B0
            android.graphics.drawable.Drawable r1 = com.aurelhubert.ahbottomnavigation.C2910c.m13933a(r1, r5, r7)
            r15.setImageDrawable(r1)
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r1 = r0.f10260P
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.b r1 = (com.aurelhubert.ahbottomnavigation.C2909b) r1
            android.content.Context r5 = r0.f10257N
            android.graphics.drawable.Drawable r1 = r1.mo11584b(r5)
            if (r10 == 0) goto L_0x0221
            int r5 = r0.f10284o0
            goto L_0x0223
        L_0x0221:
            int r5 = r0.f10285p0
        L_0x0223:
            boolean r7 = r0.f10245B0
            android.graphics.drawable.Drawable r1 = com.aurelhubert.ahbottomnavigation.C2910c.m13933a(r1, r5, r7)
            r8.setImageDrawable(r1)
            if (r10 == 0) goto L_0x0231
            int r1 = r0.f10284o0
            goto L_0x0233
        L_0x0231:
            int r1 = r0.f10285p0
        L_0x0233:
            r11.setTextColor(r1)
            boolean r1 = r0.f10279j0
            r13.setSoundEffectsEnabled(r1)
            goto L_0x025a
        L_0x023c:
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r1 = r0.f10260P
            java.lang.Object r1 = r1.get(r9)
            com.aurelhubert.ahbottomnavigation.b r1 = (com.aurelhubert.ahbottomnavigation.C2909b) r1
            android.content.Context r5 = r0.f10257N
            android.graphics.drawable.Drawable r1 = r1.mo11584b(r5)
            int r5 = r0.f10287r0
            boolean r7 = r0.f10245B0
            android.graphics.drawable.Drawable r1 = com.aurelhubert.ahbottomnavigation.C2910c.m13933a(r1, r5, r7)
            r15.setImageDrawable(r1)
            int r1 = r0.f10287r0
            r11.setTextColor(r1)
        L_0x025a:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            int r5 = (int) r3
            int r7 = (int) r2
            r1.<init>(r5, r7)
            int r5 = r0.f10283n0
            r13.setBackgroundResource(r5)
            r5 = r20
            r5.addView(r13, r1)
            java.util.ArrayList<android.view.View> r1 = r0.f10261Q
            r1.add(r13)
            int r9 = r9 + 1
            r1 = r16
            r4 = r17
            r5 = r18
            r7 = 4
            r8 = 0
            goto L_0x00b0
        L_0x027c:
            r1 = -1
            r2 = 1
            r0.m13827a(r2, r1)
        L_0x0281:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aurelhubert.ahbottomnavigation.AHBottomNavigation.m13825a(android.widget.LinearLayout):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0194  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13829b(int r19, boolean r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.f10274e0
            r3 = 1
            if (r2 != r1) goto L_0x0013
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$f r2 = r0.f10268a
            if (r2 == 0) goto L_0x0012
            if (r20 == 0) goto L_0x0012
            r2.mo11557a(r1, r3)
        L_0x0012:
            return
        L_0x0013:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$f r2 = r0.f10268a
            r4 = 0
            if (r2 == 0) goto L_0x0021
            if (r20 == 0) goto L_0x0021
            boolean r2 = r2.mo11557a(r1, r4)
            if (r2 != 0) goto L_0x0021
            return
        L_0x0021:
            android.content.res.Resources r2 = r0.f10259O
            int r5 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_margin_top_active
            float r2 = r2.getDimension(r5)
            int r2 = (int) r2
            android.content.res.Resources r5 = r0.f10259O
            int r6 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_margin_top_inactive
            float r5 = r5.getDimension(r6)
            int r5 = (int) r5
            android.content.res.Resources r6 = r0.f10259O
            int r7 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_active
            float r6 = r6.getDimension(r7)
            android.content.res.Resources r7 = r0.f10259O
            int r8 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_inactive
            float r7 = r7.getDimension(r8)
            float r8 = r0.f10291v0
            r9 = 0
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 == 0) goto L_0x0053
            float r10 = r0.f10292w0
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0053
            r6 = r8
            r7 = r10
            goto L_0x0072
        L_0x0053:
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r8 = r0.f10246C0
            com.aurelhubert.ahbottomnavigation.AHBottomNavigation$TitleState r9 = com.aurelhubert.ahbottomnavigation.AHBottomNavigation.TitleState.ALWAYS_SHOW
            if (r8 != r9) goto L_0x0072
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r8 = r0.f10260P
            int r8 = r8.size()
            r9 = 4
            if (r8 <= r9) goto L_0x0072
            android.content.res.Resources r6 = r0.f10259O
            int r7 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_forced_active
            float r6 = r6.getDimension(r7)
            android.content.res.Resources r7 = r0.f10259O
            int r8 = com.aurelhubert.ahbottomnavigation.C2902R.dimen.bottom_navigation_text_size_forced_inactive
            float r7 = r7.getDimension(r8)
        L_0x0072:
            r8 = 0
        L_0x0073:
            java.util.ArrayList<android.view.View> r9 = r0.f10261Q
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x016e
            java.util.ArrayList<android.view.View> r9 = r0.f10261Q
            java.lang.Object r9 = r9.get(r8)
            android.view.View r9 = (android.view.View) r9
            boolean r10 = r0.f10267W
            if (r10 == 0) goto L_0x008f
            if (r8 != r1) goto L_0x008b
            r10 = 1
            goto L_0x008c
        L_0x008b:
            r10 = 0
        L_0x008c:
            r9.setSelected(r10)
        L_0x008f:
            if (r8 != r1) goto L_0x0117
            int r10 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_title     // Catch:{ Exception -> 0x016a }
            android.view.View r10 = r9.findViewById(r10)     // Catch:{ Exception -> 0x016a }
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ Exception -> 0x016a }
            int r11 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_icon     // Catch:{ Exception -> 0x016a }
            android.view.View r11 = r9.findViewById(r11)     // Catch:{ Exception -> 0x016a }
            r14 = r11
            android.widget.ImageView r14 = (android.widget.ImageView) r14     // Catch:{ Exception -> 0x016a }
            int r11 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_notification     // Catch:{ Exception -> 0x016a }
            android.view.View r9 = r9.findViewById(r11)     // Catch:{ Exception -> 0x016a }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ Exception -> 0x016a }
            r14.setSelected(r3)     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.C2910c.m13941b(r14, r5, r2)     // Catch:{ Exception -> 0x016a }
            int r11 = r0.f10254K0     // Catch:{ Exception -> 0x016a }
            int r12 = r0.f10253J0     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.C2910c.m13936a(r9, r11, r12)     // Catch:{ Exception -> 0x016a }
            int r9 = r0.f10285p0     // Catch:{ Exception -> 0x016a }
            int r11 = r0.f10284o0     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.C2910c.m13939a(r10, r9, r11)     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.C2910c.m13938a(r10, r7, r6)     // Catch:{ Exception -> 0x016a }
            android.content.Context r12 = r0.f10257N     // Catch:{ Exception -> 0x016a }
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r9 = r0.f10260P     // Catch:{ Exception -> 0x016a }
            java.lang.Object r9 = r9.get(r1)     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.b r9 = (com.aurelhubert.ahbottomnavigation.C2909b) r9     // Catch:{ Exception -> 0x016a }
            android.content.Context r10 = r0.f10257N     // Catch:{ Exception -> 0x016a }
            android.graphics.drawable.Drawable r13 = r9.mo11584b(r10)     // Catch:{ Exception -> 0x016a }
            int r15 = r0.f10285p0     // Catch:{ Exception -> 0x016a }
            int r9 = r0.f10284o0     // Catch:{ Exception -> 0x016a }
            boolean r10 = r0.f10245B0     // Catch:{ Exception -> 0x016a }
            r16 = r9
            r17 = r10
            com.aurelhubert.ahbottomnavigation.C2910c.m13934a(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x016a }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x016a }
            r10 = 21
            if (r9 < r10) goto L_0x00ea
            boolean r9 = r0.f10266V     // Catch:{ Exception -> 0x016a }
            if (r9 == 0) goto L_0x00ea
            goto L_0x016a
        L_0x00ea:
            boolean r9 = r0.f10266V     // Catch:{ Exception -> 0x016a }
            if (r9 == 0) goto L_0x0102
            int r9 = r0.f10275f0     // Catch:{ Exception -> 0x016a }
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r10 = r0.f10260P     // Catch:{ Exception -> 0x016a }
            java.lang.Object r10 = r10.get(r1)     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.b r10 = (com.aurelhubert.ahbottomnavigation.C2909b) r10     // Catch:{ Exception -> 0x016a }
            android.content.Context r11 = r0.f10257N     // Catch:{ Exception -> 0x016a }
            int r10 = r10.mo11580a(r11)     // Catch:{ Exception -> 0x016a }
            com.aurelhubert.ahbottomnavigation.C2910c.m13944c(r0, r9, r10)     // Catch:{ Exception -> 0x016a }
            goto L_0x016a
        L_0x0102:
            int r9 = r0.f10283n0     // Catch:{ Exception -> 0x016a }
            if (r9 == 0) goto L_0x010c
            int r9 = r0.f10283n0     // Catch:{ Exception -> 0x016a }
            r0.setBackgroundResource(r9)     // Catch:{ Exception -> 0x016a }
            goto L_0x0111
        L_0x010c:
            int r9 = r0.f10282m0     // Catch:{ Exception -> 0x016a }
            r0.setBackgroundColor(r9)     // Catch:{ Exception -> 0x016a }
        L_0x0111:
            android.view.View r9 = r0.f10264T     // Catch:{ Exception -> 0x016a }
            r9.setBackgroundColor(r4)     // Catch:{ Exception -> 0x016a }
            goto L_0x016a
        L_0x0117:
            int r10 = r0.f10274e0
            if (r8 != r10) goto L_0x016a
            int r10 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_title
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            int r11 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_item_icon
            android.view.View r11 = r9.findViewById(r11)
            r14 = r11
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            int r11 = com.aurelhubert.ahbottomnavigation.C2902R.C2906id.bottom_navigation_notification
            android.view.View r9 = r9.findViewById(r11)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r14.setSelected(r4)
            com.aurelhubert.ahbottomnavigation.C2910c.m13941b(r14, r2, r5)
            int r11 = r0.f10253J0
            int r12 = r0.f10254K0
            com.aurelhubert.ahbottomnavigation.C2910c.m13936a(r9, r11, r12)
            int r9 = r0.f10284o0
            int r11 = r0.f10285p0
            com.aurelhubert.ahbottomnavigation.C2910c.m13939a(r10, r9, r11)
            com.aurelhubert.ahbottomnavigation.C2910c.m13938a(r10, r6, r7)
            android.content.Context r12 = r0.f10257N
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r9 = r0.f10260P
            int r10 = r0.f10274e0
            java.lang.Object r9 = r9.get(r10)
            com.aurelhubert.ahbottomnavigation.b r9 = (com.aurelhubert.ahbottomnavigation.C2909b) r9
            android.content.Context r10 = r0.f10257N
            android.graphics.drawable.Drawable r13 = r9.mo11584b(r10)
            int r15 = r0.f10284o0
            int r9 = r0.f10285p0
            boolean r10 = r0.f10245B0
            r16 = r9
            r17 = r10
            com.aurelhubert.ahbottomnavigation.C2910c.m13934a(r12, r13, r14, r15, r16, r17)
        L_0x016a:
            int r8 = r8 + 1
            goto L_0x0073
        L_0x016e:
            r0.f10274e0 = r1
            int r1 = r0.f10274e0
            if (r1 <= 0) goto L_0x018f
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r2 = r0.f10260P
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x018f
            java.util.ArrayList<com.aurelhubert.ahbottomnavigation.b> r1 = r0.f10260P
            int r2 = r0.f10274e0
            java.lang.Object r1 = r1.get(r2)
            com.aurelhubert.ahbottomnavigation.b r1 = (com.aurelhubert.ahbottomnavigation.C2909b) r1
            android.content.Context r2 = r0.f10257N
            int r1 = r1.mo11580a(r2)
            r0.f10275f0 = r1
            goto L_0x01a6
        L_0x018f:
            int r1 = r0.f10274e0
            r2 = -1
            if (r1 != r2) goto L_0x01a6
            int r1 = r0.f10283n0
            if (r1 == 0) goto L_0x019c
            r0.setBackgroundResource(r1)
            goto L_0x01a1
        L_0x019c:
            int r1 = r0.f10282m0
            r0.setBackgroundColor(r1)
        L_0x01a1:
            android.view.View r1 = r0.f10264T
            r1.setBackgroundColor(r4)
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aurelhubert.ahbottomnavigation.AHBottomNavigation.m13829b(int, boolean):void");
    }

    /* renamed from: c */
    public C2909b mo11498c(int i) {
        if (i >= 0 && i <= this.f10260P.size() - 1) {
            return (C2909b) this.f10260P.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The position is out of bounds of the items (");
        sb.append(this.f10260P.size());
        sb.append(" elements)");
        sb.toString();
        return null;
    }

    /* renamed from: c */
    public boolean mo11500c() {
        return this.f10276g0;
    }

    /* renamed from: c */
    public void mo11499c(int i, int i2) {
        this.f10253J0 = i;
        this.f10254K0 = i2;
        m13835m();
    }

    /* renamed from: b */
    public void mo11494b(float f, float f2) {
        this.f10291v0 = TypedValue.applyDimension(2, f, this.f10259O.getDisplayMetrics());
        this.f10292w0 = TypedValue.applyDimension(2, f2, this.f10259O.getDisplayMetrics());
        m13835m();
    }

    /* renamed from: b */
    public void mo11493b() {
        mo11490a(true);
    }

    /* renamed from: b */
    public void mo11497b(boolean z) {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f10262R;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.mo11561a(this, z);
        } else {
            C0962e0.m5428a(this).mo4851o(0.0f).mo4826a((Interpolator) new C2118c()).mo4825a(z ? 300 : 0).mo4840e();
        }
    }

    /* renamed from: a */
    private void m13827a(boolean z, int i) {
        int i2 = 0;
        while (i2 < this.f10261Q.size() && i2 < this.f10271b0.size()) {
            if (i == -1 || i == i2) {
                AHNotification aHNotification = (AHNotification) this.f10271b0.get(i2);
                int b = C2923a.m13959b(aHNotification, this.f10249F0);
                int a = C2923a.m13958a(aHNotification, this.f10250G0);
                TextView textView = (TextView) ((View) this.f10261Q.get(i2)).findViewById(C2902R.C2906id.bottom_navigation_notification);
                boolean z2 = !textView.getText().toString().equals(String.valueOf(aHNotification.mo11599b()));
                if (z) {
                    textView.setTextColor(b);
                    Typeface typeface = this.f10252I0;
                    if (typeface != null) {
                        textView.setTypeface(typeface);
                    } else {
                        textView.setTypeface(null, 1);
                    }
                    Drawable drawable = this.f10251H0;
                    if (drawable != null) {
                        if (VERSION.SDK_INT >= 16) {
                            textView.setBackground(drawable.getConstantState().newDrawable());
                        } else {
                            textView.setBackgroundDrawable(drawable);
                        }
                    } else if (a != 0) {
                        Drawable c = C0841b.m4928c(this.f10257N, C2902R.C2905drawable.notification_background);
                        if (VERSION.SDK_INT >= 16) {
                            textView.setBackground(C2910c.m13933a(c, a, this.f10245B0));
                        } else {
                            textView.setBackgroundDrawable(C2910c.m13933a(c, a, this.f10245B0));
                        }
                    }
                }
                if (aHNotification.mo11602i() && textView.getText().length() > 0) {
                    textView.setText("");
                    if (z2) {
                        textView.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(this.f10258N0).start();
                    }
                } else if (!aHNotification.mo11602i()) {
                    textView.setText(String.valueOf(aHNotification.mo11599b()));
                    if (z2) {
                        textView.setScaleX(0.0f);
                        textView.setScaleY(0.0f);
                        textView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(this.f10258N0).start();
                    }
                }
            }
            i2++;
        }
    }

    /* renamed from: b */
    public void mo11496b(int i, int i2) {
        String str;
        if (i2 < 0 || i2 > this.f10260P.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, f10241R0, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f10260P.size())}));
        }
        if (i == 0) {
            str = "";
        } else {
            str = String.valueOf(i);
        }
        this.f10271b0.set(i2, AHNotification.m13946a(str));
        m13827a(false, i2);
    }

    /* renamed from: b */
    public void mo11495b(int i) {
        if (i < 0 || i > this.f10260P.size() - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("The position is out of bounds of the items (");
            sb.append(this.f10260P.size());
            sb.append(" elements)");
            sb.toString();
            return;
        }
        this.f10272c0[i] = Boolean.valueOf(true);
        m13835m();
    }

    /* renamed from: a */
    public void mo11485a(C2909b bVar) {
        int size = this.f10260P.size();
        this.f10260P.add(bVar);
        m13835m();
    }

    /* renamed from: a */
    public void mo11489a(List<C2909b> list) {
        if (list.size() <= 5) {
            int size = this.f10260P.size() + list.size();
        }
        this.f10260P.addAll(list);
        m13835m();
    }

    /* renamed from: a */
    public void mo11483a(@C0198k int i, @C0198k int i2) {
        this.f10289t0 = i;
        this.f10290u0 = i2;
        m13835m();
    }

    /* renamed from: a */
    public void mo11481a(float f, float f2) {
        this.f10291v0 = f;
        this.f10292w0 = f2;
        m13835m();
    }

    /* renamed from: a */
    public void mo11484a(int i, boolean z) {
        if (i >= this.f10260P.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("The position is out of bounds of the items (");
            sb.append(this.f10260P.size());
            sb.append(" elements)");
            sb.toString();
            return;
        }
        if (this.f10246C0 == TitleState.ALWAYS_HIDE || !(this.f10260P.size() == 4 || this.f10246C0 == TitleState.ALWAYS_SHOW)) {
            m13833c(i, z);
        } else {
            m13829b(i, z);
        }
    }

    /* renamed from: a */
    public void mo11487a(FloatingActionButton floatingActionButton) {
        if (floatingActionButton.getParent() instanceof CoordinatorLayout) {
            ((C0716g) floatingActionButton.getLayoutParams()).mo4017a((C0712c) new AHBottomNavigationFABBehavior(this.f10294y0));
        }
    }

    /* renamed from: a */
    public void mo11490a(boolean z) {
        AHBottomNavigationBehavior<AHBottomNavigation> aHBottomNavigationBehavior = this.f10262R;
        if (aHBottomNavigationBehavior != null) {
            aHBottomNavigationBehavior.mo11559a(this, this.f10293x0, z);
        } else if (getParent() instanceof CoordinatorLayout) {
            this.f10277h0 = true;
            this.f10278i0 = z;
        } else {
            C0962e0.m5428a(this).mo4851o((float) this.f10293x0).mo4826a((Interpolator) new C2118c()).mo4825a(z ? 300 : 0).mo4840e();
        }
    }

    /* renamed from: a */
    public void mo11488a(String str, int i) {
        if (i < 0 || i > this.f10260P.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, f10241R0, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f10260P.size())}));
        }
        this.f10271b0.set(i, AHNotification.m13946a(str));
        m13827a(false, i);
    }

    /* renamed from: a */
    public void mo11486a(AHNotification aHNotification, int i) {
        if (i < 0 || i > this.f10260P.size() - 1) {
            throw new IndexOutOfBoundsException(String.format(Locale.US, f10241R0, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f10260P.size())}));
        }
        if (aHNotification == null) {
            aHNotification = new AHNotification();
        }
        this.f10271b0.set(i, aHNotification);
        m13827a(true, i);
    }

    /* renamed from: a */
    public void mo11491a(boolean z, float f) {
        if (!z) {
            f = 0.0f;
        }
        C0962e0.m5472b((View) this, f);
        setClipToPadding(false);
    }

    /* renamed from: a */
    public void mo11482a(int i) {
        if (i < 0 || i > this.f10260P.size() - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("The position is out of bounds of the items (");
            sb.append(this.f10260P.size());
            sb.append(" elements)");
            sb.toString();
            return;
        }
        this.f10272c0[i] = Boolean.valueOf(false);
        m13835m();
    }
}
