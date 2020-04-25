package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.C0287b.C0289b;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.appcompat.p011d.C0341d;
import androidx.appcompat.p011d.C0343f.C0344a;
import androidx.appcompat.p011d.C0345g;
import androidx.appcompat.p011d.C0350i;
import androidx.appcompat.view.menu.C0367e;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0483c0;
import androidx.appcompat.widget.C0483c0.C0484a;
import androidx.appcompat.widget.C0510i;
import androidx.appcompat.widget.C0549t0;
import androidx.appcompat.widget.C0564y;
import androidx.appcompat.widget.C0565y0;
import androidx.appcompat.widget.C0567z0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ContentFrameLayout.C0433a;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0635a;
import androidx.core.app.C0727a;
import androidx.core.app.C0768n;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0988i;
import androidx.core.p034l.C0988i.C0989a;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C0994j;
import androidx.core.p034l.C0996j0;
import androidx.core.p034l.C0998k0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1054x;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.Lifecycle.State;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

@C0207n0({C0208a.LIBRARY})
class AppCompatDelegateImpl extends C0297f implements C0371a, Factory2 {

    /* renamed from: W0 */
    private static final Map<Class<?>, Integer> f764W0 = new C0635a();

    /* renamed from: X0 */
    private static final boolean f765X0 = false;

    /* renamed from: Y0 */
    private static final boolean f766Y0 = (VERSION.SDK_INT < 21);

    /* renamed from: Z0 */
    private static final int[] f767Z0 = {16842836};

    /* renamed from: a1 */
    private static boolean f768a1 = true;

    /* renamed from: b1 */
    private static final boolean f769b1;

    /* renamed from: c1 */
    static final String f770c1 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: A0 */
    boolean f771A0;

    /* renamed from: B0 */
    private boolean f772B0;

    /* renamed from: C0 */
    private PanelFeatureState[] f773C0;

    /* renamed from: D0 */
    private PanelFeatureState f774D0;

    /* renamed from: E0 */
    private boolean f775E0;

    /* renamed from: F0 */
    private boolean f776F0;

    /* renamed from: G0 */
    private boolean f777G0;

    /* renamed from: H0 */
    private boolean f778H0;

    /* renamed from: I0 */
    boolean f779I0;

    /* renamed from: J0 */
    private int f780J0;

    /* renamed from: K0 */
    private int f781K0;

    /* renamed from: L0 */
    private boolean f782L0;

    /* renamed from: M0 */
    private boolean f783M0;

    /* renamed from: N0 */
    private C0273m f784N0;

    /* renamed from: O0 */
    private C0273m f785O0;

    /* renamed from: P0 */
    boolean f786P0;

    /* renamed from: Q0 */
    int f787Q0;

    /* renamed from: R0 */
    private final Runnable f788R0;

    /* renamed from: S0 */
    private boolean f789S0;

    /* renamed from: T0 */
    private Rect f790T0;

    /* renamed from: U0 */
    private Rect f791U0;

    /* renamed from: V0 */
    private AppCompatViewInflater f792V0;

    /* renamed from: Z */
    final Object f793Z;

    /* renamed from: a0 */
    final Context f794a0;

    /* renamed from: b0 */
    Window f795b0;

    /* renamed from: c0 */
    private C0271k f796c0;

    /* renamed from: d0 */
    final C0296e f797d0;

    /* renamed from: e0 */
    C0279a f798e0;

    /* renamed from: f0 */
    MenuInflater f799f0;

    /* renamed from: g0 */
    private CharSequence f800g0;

    /* renamed from: h0 */
    private C0564y f801h0;

    /* renamed from: i0 */
    private C0268i f802i0;

    /* renamed from: j0 */
    private C0277p f803j0;

    /* renamed from: k0 */
    C0338b f804k0;

    /* renamed from: l0 */
    ActionBarContextView f805l0;

    /* renamed from: m0 */
    PopupWindow f806m0;

    /* renamed from: n0 */
    Runnable f807n0;

    /* renamed from: o0 */
    C0990i0 f808o0;

    /* renamed from: p0 */
    private boolean f809p0;

    /* renamed from: q0 */
    private boolean f810q0;

    /* renamed from: r0 */
    private ViewGroup f811r0;

    /* renamed from: s0 */
    private TextView f812s0;

    /* renamed from: t0 */
    private View f813t0;

    /* renamed from: u0 */
    private boolean f814u0;

    /* renamed from: v0 */
    private boolean f815v0;

    /* renamed from: w0 */
    boolean f816w0;

    /* renamed from: x0 */
    boolean f817x0;

    /* renamed from: y0 */
    boolean f818y0;

    /* renamed from: z0 */
    boolean f819z0;

    protected static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        C0367e listMenuPresenter;
        Context listPresenterContext;
        C0370g menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;

        /* renamed from: x */
        int f820x;

        /* renamed from: y */
        int f821y;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new C0258a();

            /* renamed from: N */
            Bundle f822N;

            /* renamed from: a */
            int f823a;

            /* renamed from: b */
            boolean f824b;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            static class C0258a implements ClassLoaderCreator<SavedState> {
                C0258a() {
                }

                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m1273a(parcel, classLoader);
                }

                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m1273a(parcel, null);
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m1273a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f823a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f824b = z;
                if (savedState.f824b) {
                    savedState.f822N = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f823a);
                parcel.writeInt(this.f824b ? 1 : 0);
                if (this.f824b) {
                    parcel.writeBundle(this.f822N);
                }
            }
        }

        PanelFeatureState(int i) {
            this.featureId = i;
        }

        /* access modifiers changed from: 0000 */
        public void applyFrozenState() {
            C0370g gVar = this.menu;
            if (gVar != null) {
                Bundle bundle = this.frozenMenuState;
                if (bundle != null) {
                    gVar.mo1581b(bundle);
                    this.frozenMenuState = null;
                }
            }
        }

        public void clearMenuPresenters() {
            C0370g gVar = this.menu;
            if (gVar != null) {
                gVar.mo1582b((C0386n) this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        /* access modifiers changed from: 0000 */
        public C0388o getListMenuView(C0387a aVar) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                this.listMenuPresenter = new C0367e(this.listPresenterContext, C0238R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter.mo1488a(aVar);
                this.menu.mo1562a((C0386n) this.listMenuPresenter);
            }
            return this.listMenuPresenter.mo1482a(this.decorView);
        }

        public boolean hasPanelItems() {
            boolean z = false;
            if (this.shownPanelView == null) {
                return false;
            }
            if (this.createdPanelView != null) {
                return true;
            }
            if (this.listMenuPresenter.mo1530b().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.f823a;
            this.wasLastOpen = savedState.f824b;
            this.frozenMenuState = savedState.f822N;
            this.shownPanelView = null;
            this.decorView = null;
        }

        /* access modifiers changed from: 0000 */
        public Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.f823a = this.featureId;
            savedState.f824b = this.isOpen;
            if (this.menu != null) {
                savedState.f822N = new Bundle();
                this.menu.mo1595d(savedState.f822N);
            }
            return savedState;
        }

        /* access modifiers changed from: 0000 */
        public void setMenu(C0370g gVar) {
            C0370g gVar2 = this.menu;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo1582b((C0386n) this.listMenuPresenter);
                }
                this.menu = gVar;
                if (gVar != null) {
                    C0367e eVar = this.listMenuPresenter;
                    if (eVar != null) {
                        gVar.mo1562a((C0386n) eVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void setStyle(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0238R.attr.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0238R.attr.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C0238R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0341d dVar = new C0341d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.listPresenterContext = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0238R.styleable.AppCompatTheme);
            this.background = obtainStyledAttributes.getResourceId(C0238R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = obtainStyledAttributes.getResourceId(C0238R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    static class C0259a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ UncaughtExceptionHandler f825a;

        C0259a(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f825a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m1274a(Throwable th) {
            if (!(th instanceof NotFoundException)) {
                return false;
            }
            String message = th.getMessage();
            if (message == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m1274a(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append(th.getMessage());
                sb.append(AppCompatDelegateImpl.f770c1);
                NotFoundException notFoundException = new NotFoundException(sb.toString());
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f825a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f825a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    class C0260b implements Runnable {
        C0260b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f787Q0 & 1) != 0) {
                appCompatDelegateImpl.mo825i(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f787Q0 & 4096) != 0) {
                appCompatDelegateImpl2.mo825i(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f786P0 = false;
            appCompatDelegateImpl3.f787Q0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    class C0261c implements C1054x {
        C0261c() {
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, C1006n0 n0Var) {
            int l = n0Var.mo4888l();
            int m = AppCompatDelegateImpl.this.mo832m(l);
            if (l != m) {
                n0Var = n0Var.mo4874a(n0Var.mo4886j(), m, n0Var.mo4887k(), n0Var.mo4885i());
            }
            return C0962e0.m5469b(view, n0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    class C0262d implements C0484a {
        C0262d() {
        }

        /* renamed from: a */
        public void mo861a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.mo832m(rect.top);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    class C0263e implements C0433a {
        C0263e() {
        }

        /* renamed from: a */
        public void mo862a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo833m();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    class C0264f implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f$a */
        class C0265a extends C0998k0 {
            C0265a() {
            }

            /* renamed from: b */
            public void mo865b(View view) {
                AppCompatDelegateImpl.this.f805l0.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f808o0.mo4827a((C0996j0) null);
                AppCompatDelegateImpl.this.f808o0 = null;
            }

            /* renamed from: c */
            public void mo866c(View view) {
                AppCompatDelegateImpl.this.f805l0.setVisibility(0);
            }
        }

        C0264f() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f806m0.showAtLocation(appCompatDelegateImpl.f805l0, 55, 0, 0);
            AppCompatDelegateImpl.this.mo836p();
            if (AppCompatDelegateImpl.this.mo844x()) {
                AppCompatDelegateImpl.this.f805l0.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f808o0 = C0962e0.m5428a(appCompatDelegateImpl2.f805l0).mo4824a(1.0f);
                AppCompatDelegateImpl.this.f808o0.mo4827a((C0996j0) new C0265a());
                return;
            }
            AppCompatDelegateImpl.this.f805l0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f805l0.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    class C0266g extends C0998k0 {
        C0266g() {
        }

        /* renamed from: b */
        public void mo865b(View view) {
            AppCompatDelegateImpl.this.f805l0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f808o0.mo4827a((C0996j0) null);
            AppCompatDelegateImpl.this.f808o0 = null;
        }

        /* renamed from: c */
        public void mo866c(View view) {
            AppCompatDelegateImpl.this.f805l0.setVisibility(0);
            AppCompatDelegateImpl.this.f805l0.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f805l0.getParent() instanceof View) {
                C0962e0.m5563v0((View) AppCompatDelegateImpl.this.f805l0.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    private class C0267h implements C0289b {
        C0267h() {
        }

        /* renamed from: a */
        public Drawable mo867a() {
            C0549t0 a = C0549t0.m2909a(mo871c(), (AttributeSet) null, new int[]{C0238R.attr.homeAsUpIndicator});
            Drawable b = a.mo2875b(0);
            a.mo2887f();
            return b;
        }

        /* renamed from: b */
        public boolean mo870b() {
            C0279a e = AppCompatDelegateImpl.this.mo817e();
            return (e == null || (e.mo962h() & 4) == 0) ? false : true;
        }

        /* renamed from: c */
        public Context mo871c() {
            return AppCompatDelegateImpl.this.mo837q();
        }

        /* renamed from: a */
        public void mo869a(Drawable drawable, int i) {
            C0279a e = AppCompatDelegateImpl.this.mo817e();
            if (e != null) {
                e.mo937b(drawable);
                e.mo960g(i);
            }
        }

        /* renamed from: a */
        public void mo868a(int i) {
            C0279a e = AppCompatDelegateImpl.this.mo817e();
            if (e != null) {
                e.mo960g(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    private final class C0268i implements C0387a {
        C0268i() {
        }

        /* renamed from: a */
        public boolean mo873a(C0370g gVar) {
            Callback u = AppCompatDelegateImpl.this.mo841u();
            if (u != null) {
                u.onMenuOpened(108, gVar);
            }
            return true;
        }

        /* renamed from: a */
        public void mo872a(C0370g gVar, boolean z) {
            AppCompatDelegateImpl.this.mo808b(gVar);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    class C0269j implements C0339a {

        /* renamed from: a */
        private C0339a f835a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j$a */
        class C0270a extends C0998k0 {
            C0270a() {
            }

            /* renamed from: b */
            public void mo865b(View view) {
                AppCompatDelegateImpl.this.f805l0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f806m0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f805l0.getParent() instanceof View) {
                    C0962e0.m5563v0((View) AppCompatDelegateImpl.this.f805l0.getParent());
                }
                AppCompatDelegateImpl.this.f805l0.removeAllViews();
                AppCompatDelegateImpl.this.f808o0.mo4827a((C0996j0) null);
                AppCompatDelegateImpl.this.f808o0 = null;
            }
        }

        public C0269j(C0339a aVar) {
            this.f835a = aVar;
        }

        /* renamed from: a */
        public boolean mo875a(C0338b bVar, Menu menu) {
            return this.f835a.mo875a(bVar, menu);
        }

        /* renamed from: b */
        public boolean mo877b(C0338b bVar, Menu menu) {
            return this.f835a.mo877b(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo876a(C0338b bVar, MenuItem menuItem) {
            return this.f835a.mo876a(bVar, menuItem);
        }

        /* renamed from: a */
        public void mo874a(C0338b bVar) {
            this.f835a.mo874a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f806m0 != null) {
                appCompatDelegateImpl.f795b0.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f807n0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f805l0 != null) {
                appCompatDelegateImpl2.mo836p();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f808o0 = C0962e0.m5428a(appCompatDelegateImpl3.f805l0).mo4824a(0.0f);
                AppCompatDelegateImpl.this.f808o0.mo4827a((C0996j0) new C0270a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0296e eVar = appCompatDelegateImpl4.f797d0;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(appCompatDelegateImpl4.f804k0);
            }
            AppCompatDelegateImpl.this.f804k0 = null;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    class C0271k extends C0350i {
        C0271k(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ActionMode mo878a(ActionMode.Callback callback) {
            C0344a aVar = new C0344a(AppCompatDelegateImpl.this.f794a0, callback);
            C0338b a = AppCompatDelegateImpl.this.mo787a((C0339a) aVar);
            if (a != null) {
                return aVar.mo1353b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo802a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo810b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0370g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo829k(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo831l(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0370g gVar = menu instanceof C0370g ? (C0370g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo1597d(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo1597d(false);
            }
            return onPreparePanel;
        }

        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = AppCompatDelegateImpl.this.mo785a(0, true);
            if (a != null) {
                C0370g gVar = a.menu;
                if (gVar != null) {
                    super.onProvideKeyboardShortcuts(list, gVar, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo823h()) {
                return mo878a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @RequiresApi(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo823h() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo878a(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    private class C0272l extends C0273m {

        /* renamed from: c */
        private final PowerManager f839c;

        C0272l(@C0193h0 Context context) {
            super();
            this.f839c = (PowerManager) context.getSystemService("power");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo889b() {
            if (VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo890c() {
            if (VERSION.SDK_INT < 21 || !this.f839c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: e */
        public void mo891e() {
            AppCompatDelegateImpl.this.mo800a();
        }
    }

    @C0207n0({C0208a.LIBRARY})
    @C0224v0
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    abstract class C0273m {

        /* renamed from: a */
        private BroadcastReceiver f841a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m$a */
        class C0274a extends BroadcastReceiver {
            C0274a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0273m.this.mo891e();
            }
        }

        C0273m() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo892a() {
            BroadcastReceiver broadcastReceiver = this.f841a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f794a0.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f841a = null;
            }
        }

        /* access modifiers changed from: 0000 */
        @C0195i0
        /* renamed from: b */
        public abstract IntentFilter mo889b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract int mo890c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo893d() {
            return this.f841a != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo891e();

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo894f() {
            mo892a();
            IntentFilter b = mo889b();
            if (b != null && b.countActions() != 0) {
                if (this.f841a == null) {
                    this.f841a = new C0274a();
                }
                AppCompatDelegateImpl.this.f794a0.registerReceiver(this.f841a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    private class C0275n extends C0273m {

        /* renamed from: c */
        private final C0311m f844c;

        C0275n(@C0193h0 C0311m mVar) {
            super();
            this.f844c = mVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public IntentFilter mo889b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo890c() {
            return this.f844c.mo1107a() ? 2 : 1;
        }

        /* renamed from: e */
        public void mo891e() {
            AppCompatDelegateImpl.this.mo800a();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    private class C0276o extends ContentFrameLayout {
        public C0276o(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m1307a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo802a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1307a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo822h(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0242a.m1109c(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    private final class C0277p implements C0387a {
        C0277p() {
        }

        /* renamed from: a */
        public void mo872a(C0370g gVar, boolean z) {
            C0370g n = gVar.mo1614n();
            boolean z2 = n != gVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                gVar = n;
            }
            PanelFeatureState a = appCompatDelegateImpl.mo786a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo788a(a.featureId, a, n);
                AppCompatDelegateImpl.this.mo795a(a, true);
                return;
            }
            AppCompatDelegateImpl.this.mo795a(a, z);
        }

        /* renamed from: a */
        public boolean mo873a(C0370g gVar) {
            if (gVar == null) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f816w0) {
                    Callback u = appCompatDelegateImpl.mo841u();
                    if (u != null && !AppCompatDelegateImpl.this.f779I0) {
                        u.onMenuOpened(108, gVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        boolean z = false;
        int i = VERSION.SDK_INT;
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f769b1 = z;
        if (f766Y0 && !f768a1) {
            Thread.setDefaultUncaughtExceptionHandler(new C0259a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    AppCompatDelegateImpl(Activity activity, C0296e eVar) {
        this(activity, null, eVar, activity);
    }

    /* renamed from: A */
    private void m1186A() {
        C0273m mVar = this.f784N0;
        if (mVar != null) {
            mVar.mo892a();
        }
        C0273m mVar2 = this.f785O0;
        if (mVar2 != null) {
            mVar2.mo892a();
        }
    }

    /* renamed from: B */
    private ViewGroup m1187B() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f794a0.obtainStyledAttributes(C0238R.styleable.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0238R.styleable.AppCompatTheme_windowNoTitle, false)) {
                mo813c(1);
            } else if (obtainStyledAttributes.getBoolean(C0238R.styleable.AppCompatTheme_windowActionBar, false)) {
                mo813c(108);
            }
            if (obtainStyledAttributes.getBoolean(C0238R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                mo813c(109);
            }
            if (obtainStyledAttributes.getBoolean(C0238R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                mo813c(10);
            }
            this.f819z0 = obtainStyledAttributes.getBoolean(C0238R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m1189D();
            this.f795b0.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f794a0);
            if (this.f771A0) {
                if (this.f818y0) {
                    viewGroup = (ViewGroup) from.inflate(C0238R.layout.abc_screen_simple_overlay_action_mode, null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C0238R.layout.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    C0962e0.m5448a((View) viewGroup, (C1054x) new C0261c());
                } else {
                    ((C0483c0) viewGroup).setOnFitSystemWindowsListener(new C0262d());
                }
            } else if (this.f819z0) {
                viewGroup = (ViewGroup) from.inflate(C0238R.layout.abc_dialog_title_material, null);
                this.f817x0 = false;
                this.f816w0 = false;
            } else if (this.f816w0) {
                TypedValue typedValue = new TypedValue();
                this.f794a0.getTheme().resolveAttribute(C0238R.attr.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    context = new C0341d(this.f794a0, i);
                } else {
                    context = this.f794a0;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C0238R.layout.abc_screen_toolbar, null);
                this.f801h0 = (C0564y) viewGroup.findViewById(C0238R.C0241id.decor_content_parent);
                this.f801h0.setWindowCallback(mo841u());
                if (this.f817x0) {
                    this.f801h0.mo1883a(109);
                }
                if (this.f814u0) {
                    this.f801h0.mo1883a(2);
                }
                if (this.f815v0) {
                    this.f801h0.mo1883a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f801h0 == null) {
                    this.f812s0 = (TextView) viewGroup.findViewById(C0238R.C0241id.title);
                }
                C0567z0.m3142b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0238R.C0241id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f795b0.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f795b0.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0263e());
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f816w0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f817x0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f819z0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f818y0);
            sb.append(", windowNoTitle: ");
            sb.append(this.f771A0);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: C */
    private void m1188C() {
        if (!this.f810q0) {
            this.f811r0 = m1187B();
            CharSequence t = mo840t();
            if (!TextUtils.isEmpty(t)) {
                C0564y yVar = this.f801h0;
                if (yVar != null) {
                    yVar.setWindowTitle(t);
                } else if (mo843w() != null) {
                    mo843w().mo949d(t);
                } else {
                    TextView textView = this.f812s0;
                    if (textView != null) {
                        textView.setText(t);
                    }
                }
            }
            m1211y();
            mo794a(this.f811r0);
            this.f810q0 = true;
            PanelFeatureState a = mo785a(0, false);
            if (this.f779I0) {
                return;
            }
            if (a == null || a.menu == null) {
                m1209n(108);
            }
        }
    }

    /* renamed from: D */
    private void m1189D() {
        if (this.f795b0 == null) {
            Object obj = this.f793Z;
            if (obj instanceof Activity) {
                m1195a(((Activity) obj).getWindow());
            }
        }
        if (this.f795b0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: E */
    private C0273m m1190E() {
        if (this.f785O0 == null) {
            this.f785O0 = new C0272l(this.f794a0);
        }
        return this.f785O0;
    }

    /* renamed from: F */
    private void m1191F() {
        m1188C();
        if (this.f816w0 && this.f798e0 == null) {
            Object obj = this.f793Z;
            if (obj instanceof Activity) {
                this.f798e0 = new C0313n((Activity) obj, this.f817x0);
            } else if (obj instanceof Dialog) {
                this.f798e0 = new C0313n((Dialog) obj);
            }
            C0279a aVar = this.f798e0;
            if (aVar != null) {
                aVar.mo946c(this.f789S0);
            }
        }
    }

    /* renamed from: G */
    private boolean m1192G() {
        if (!this.f783M0 && (this.f793Z instanceof Activity)) {
            PackageManager packageManager = this.f794a0.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f794a0, this.f793Z.getClass()), 0);
                this.f782L0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (NameNotFoundException unused) {
                this.f782L0 = false;
            }
        }
        this.f783M0 = true;
        return this.f782L0;
    }

    /* renamed from: H */
    private void m1193H() {
        if (this.f810q0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @C0195i0
    /* renamed from: I */
    private C0295d m1194I() {
        Context context = this.f794a0;
        while (context != null) {
            if (!(context instanceof C0295d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0295d) context;
            }
        }
        return null;
    }

    /* renamed from: n */
    private void m1209n(int i) {
        this.f787Q0 = (1 << i) | this.f787Q0;
        if (!this.f786P0) {
            C0962e0.m5451a(this.f795b0.getDecorView(), this.f788R0);
            this.f786P0 = true;
        }
    }

    /* renamed from: o */
    private int m1210o(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            i = 109;
        }
        return i;
    }

    /* renamed from: y */
    private void m1211y() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f811r0.findViewById(16908290);
        View decorView = this.f795b0.getDecorView();
        contentFrameLayout.mo2172a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f794a0.obtainStyledAttributes(C0238R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(C0238R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0238R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0238R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0238R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0238R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0238R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0238R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: z */
    private int m1212z() {
        int i = this.f780J0;
        return i != -100 ? i : C0297f.m1480n();
    }

    /* renamed from: a */
    public void mo789a(Context context) {
        m1206c(false);
        this.f776F0 = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo794a(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo806b(Bundle bundle) {
        m1188C();
    }

    /* renamed from: c */
    public void mo812c(Bundle bundle) {
        if (this.f780J0 != -100) {
            f764W0.put(this.f793Z.getClass(), Integer.valueOf(this.f780J0));
        }
    }

    /* renamed from: d */
    public MenuInflater mo815d() {
        if (this.f799f0 == null) {
            m1191F();
            C0279a aVar = this.f798e0;
            this.f799f0 = new C0345g(aVar != null ? aVar.mo983r() : this.f794a0);
        }
        return this.f799f0;
    }

    /* renamed from: e */
    public C0279a mo817e() {
        m1191F();
        return this.f798e0;
    }

    /* renamed from: f */
    public void mo820f(@C0216r0 int i) {
        this.f781K0 = i;
    }

    /* renamed from: g */
    public void mo821g() {
        C0279a e = mo817e();
        if (e == null || !e.mo986u()) {
            m1209n(0);
        }
    }

    /* renamed from: h */
    public boolean mo823h() {
        return this.f809p0;
    }

    /* renamed from: i */
    public void mo824i() {
        C0297f.m1475b((C0297f) this);
        if (this.f786P0) {
            this.f795b0.getDecorView().removeCallbacks(this.f788R0);
        }
        this.f778H0 = false;
        this.f779I0 = true;
        C0279a aVar = this.f798e0;
        if (aVar != null) {
            aVar.mo991z();
        }
        m1186A();
    }

    /* renamed from: j */
    public void mo827j() {
        C0279a e = mo817e();
        if (e != null) {
            e.mo973k(true);
        }
    }

    /* renamed from: k */
    public void mo828k() {
        this.f778H0 = true;
        mo800a();
        C0297f.m1474a((C0297f) this);
    }

    /* renamed from: l */
    public void mo830l() {
        this.f778H0 = false;
        C0297f.m1475b((C0297f) this);
        C0279a e = mo817e();
        if (e != null) {
            e.mo973k(false);
        }
        if (this.f793Z instanceof Dialog) {
            m1186A();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public int mo832m(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f805l0;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f805l0.getLayoutParams();
            z = true;
            if (this.f805l0.isShown()) {
                if (this.f790T0 == null) {
                    this.f790T0 = new Rect();
                    this.f791U0 = new Rect();
                }
                Rect rect = this.f790T0;
                Rect rect2 = this.f791U0;
                rect.set(0, i, 0, 0);
                C0567z0.m3140a(this.f811r0, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f813t0;
                    if (view == null) {
                        this.f813t0 = new View(this.f794a0);
                        this.f813t0.setBackgroundColor(this.f794a0.getResources().getColor(C0238R.C0239color.abc_input_method_navigation_guard));
                        this.f811r0.addView(this.f813t0, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f813t0.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f813t0 == null) {
                    z = false;
                }
                if (!this.f818y0 && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f805l0.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f813t0;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo784a(view, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo836p() {
        C0990i0 i0Var = this.f808o0;
        if (i0Var != null) {
            i0Var.mo4830a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final Context mo837q() {
        C0279a e = mo817e();
        Context r = e != null ? e.mo983r() : null;
        return r == null ? this.f794a0 : r;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    @C0207n0({C0208a.LIBRARY})
    /* renamed from: r */
    public final C0273m mo838r() {
        if (this.f784N0 == null) {
            this.f784N0 = new C0275n(C0311m.m1599a(this.f794a0));
        }
        return this.f784N0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public ViewGroup mo839s() {
        return this.f811r0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final CharSequence mo840t() {
        Object obj = this.f793Z;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f800g0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final Callback mo841u() {
        return this.f795b0.getCallback();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public boolean mo842v() {
        C0338b bVar = this.f804k0;
        if (bVar != null) {
            bVar.mo1121a();
            return true;
        }
        C0279a e = mo817e();
        if (e == null || !e.mo958f()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final C0279a mo843w() {
        return this.f798e0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final boolean mo844x() {
        if (this.f810q0) {
            ViewGroup viewGroup = this.f811r0;
            if (viewGroup != null && C0962e0.m5540n0(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    AppCompatDelegateImpl(Dialog dialog, C0296e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    /* renamed from: b */
    public void mo807b(View view, LayoutParams layoutParams) {
        m1188C();
        ViewGroup viewGroup = (ViewGroup) this.f811r0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f796c0.mo1372a().onContentChanged();
    }

    /* renamed from: f */
    public void mo819f() {
        LayoutInflater from = LayoutInflater.from(this.f794a0);
        if (from.getFactory() == null) {
            C0994j.m5713b(from, this);
        } else {
            boolean z = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo822h(int i) {
        mo795a(mo785a(i, true), true);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, C0296e eVar) {
        this(context, window, eVar, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1208e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            androidx.appcompat.d.b r0 = r3.f804k0
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r3.mo785a(r4, r0)
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.y r4 = r3.f801h0
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo1899f()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f794a0
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            androidx.appcompat.widget.y r4 = r3.f801h0
            boolean r4 = r4.mo1893b()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f779I0
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m1203b(r2, r5)
            if (r4 == 0) goto L_0x0063
            androidx.appcompat.widget.y r4 = r3.f801h0
            boolean r4 = r4.mo1910j()
            goto L_0x006a
        L_0x003c:
            androidx.appcompat.widget.y r4 = r3.f801h0
            boolean r4 = r4.mo1909i()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.isOpen
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.isHandled
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.isPrepared
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.refreshMenuContent
            if (r4 == 0) goto L_0x005b
            r2.isPrepared = r1
            boolean r4 = r3.m1203b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m1196a(r2, r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.isOpen
            r3.mo795a(r2, r0)
        L_0x006a:
            if (r4 == 0) goto L_0x007b
            android.content.Context r5 = r3.f794a0
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007b
            r5.playSoundEffect(r1)
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m1208e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public void mo791a(Bundle bundle) {
        this.f776F0 = true;
        m1206c(false);
        m1189D();
        Object obj = this.f793Z;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0768n.m4360b((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0279a w = mo843w();
                if (w == null) {
                    this.f789S0 = true;
                } else {
                    w.mo946c(true);
                }
            }
        }
        this.f777G0 = true;
    }

    /* renamed from: c */
    public boolean mo813c(int i) {
        int o = m1210o(i);
        if (this.f771A0 && o == 108) {
            return false;
        }
        if (this.f816w0 && o == 1) {
            this.f816w0 = false;
        }
        if (o == 1) {
            m1193H();
            this.f771A0 = true;
            return true;
        } else if (o == 2) {
            m1193H();
            this.f814u0 = true;
            return true;
        } else if (o == 5) {
            m1193H();
            this.f815v0 = true;
            return true;
        } else if (o == 10) {
            m1193H();
            this.f818y0 = true;
            return true;
        } else if (o == 108) {
            m1193H();
            this.f816w0 = true;
            return true;
        } else if (o != 109) {
            return this.f795b0.requestFeature(o);
        } else {
            m1193H();
            this.f817x0 = true;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo826j(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m1190E().mo890c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f794a0.getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                i = mo838r().mo890c();
            }
        }
        return i;
    }

    AppCompatDelegateImpl(Context context, Activity activity, C0296e eVar) {
        this(context, null, eVar, activity);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo829k(int i) {
        if (i == 108) {
            C0279a e = mo817e();
            if (e != null) {
                e.mo941b(true);
            }
        }
    }

    private AppCompatDelegateImpl(Context context, Window window, C0296e eVar, Object obj) {
        this.f808o0 = null;
        this.f809p0 = true;
        this.f780J0 = -100;
        this.f788R0 = new C0260b();
        this.f794a0 = context;
        this.f797d0 = eVar;
        this.f793Z = obj;
        if (this.f780J0 == -100 && (this.f793Z instanceof Dialog)) {
            C0295d I = m1194I();
            if (I != null) {
                this.f780J0 = I.getDelegate().mo811c();
            }
        }
        if (this.f780J0 == -100) {
            Integer num = (Integer) f764W0.get(this.f793Z.getClass());
            if (num != null) {
                this.f780J0 = num.intValue();
                f764W0.remove(this.f793Z.getClass());
            }
        }
        if (window != null) {
            m1195a(window);
        }
        C0510i.m2771c();
    }

    /* renamed from: d */
    public void mo816d(int i) {
        m1188C();
        ViewGroup viewGroup = (ViewGroup) this.f811r0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f794a0).inflate(i, viewGroup);
        this.f796c0.mo1372a().onContentChanged();
    }

    /* renamed from: b */
    public boolean mo809b(int i) {
        boolean z;
        int o = m1210o(i);
        if (o == 1) {
            z = this.f771A0;
        } else if (o == 2) {
            z = this.f814u0;
        } else if (o == 5) {
            z = this.f815v0;
        } else if (o == 10) {
            z = this.f818y0;
        } else if (o == 108) {
            z = this.f816w0;
        } else if (o != 109) {
            z = false;
        } else {
            z = this.f817x0;
        }
        if (z || this.f795b0.hasFeature(i)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo831l(int i) {
        if (i == 108) {
            C0279a e = mo817e();
            if (e != null) {
                e.mo941b(false);
            }
        } else if (i == 0) {
            PanelFeatureState a = mo785a(i, true);
            if (a.isOpen) {
                mo795a(a, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo825i(int i) {
        PanelFeatureState a = mo785a(i, true);
        if (a.menu != null) {
            Bundle bundle = new Bundle();
            a.menu.mo1587c(bundle);
            if (bundle.size() > 0) {
                a.frozenActionViewState = bundle;
            }
            a.menu.mo1630t();
            a.menu.clear();
        }
        a.refreshMenuContent = true;
        a.refreshDecorView = true;
        if ((i == 108 || i == 0) && this.f801h0 != null) {
            PanelFeatureState a2 = mo785a(0, false);
            if (a2 != null) {
                a2.isPrepared = false;
                m1203b(a2, (KeyEvent) null);
            }
        }
    }

    /* renamed from: d */
    private boolean m1207d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState a = mo785a(i, true);
            if (!a.isOpen) {
                return m1203b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo797a(Toolbar toolbar) {
        if (this.f793Z instanceof Activity) {
            C0279a e = mo817e();
            if (!(e instanceof C0313n)) {
                this.f799f0 = null;
                if (e != null) {
                    e.mo991z();
                }
                if (toolbar != null) {
                    C0304k kVar = new C0304k(toolbar, mo840t(), this.f796c0);
                    this.f798e0 = kVar;
                    this.f795b0.setCallback(kVar.mo1101E());
                } else {
                    this.f798e0 = null;
                    this.f795b0.setCallback(this.f796c0);
                }
                mo821g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.p011d.C0338b mo805b(@androidx.annotation.C0193h0 androidx.appcompat.p011d.C0338b.C0339a r8) {
        /*
            r7 = this;
            r7.mo836p()
            androidx.appcompat.d.b r0 = r7.f804k0
            if (r0 == 0) goto L_0x000a
            r0.mo1121a()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0269j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$j r0 = new androidx.appcompat.app.AppCompatDelegateImpl$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f797d0
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f779I0
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.d.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f804k0 = r0
            goto L_0x0166
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f805l0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f819z0
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f794a0
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.C0238R.attr.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f794a0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.d.d r4 = new androidx.appcompat.d.d
            android.content.Context r6 = r7.f794a0
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f794a0
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f805l0 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.C0238R.attr.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f806m0 = r5
            android.widget.PopupWindow r5 = r7.f806m0
            r6 = 2
            androidx.core.widget.C1118k.m6345a(r5, r6)
            android.widget.PopupWindow r5 = r7.f806m0
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f805l0
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f806m0
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.C0238R.attr.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f805l0
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f806m0
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>()
            r7.f807n0 = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f811r0
            int r4 = androidx.appcompat.C0238R.C0241id.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo837q()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo2447a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f805l0 = r0
        L_0x00d6:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f805l0
            if (r0 == 0) goto L_0x0166
            r7.mo836p()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f805l0
            r0.mo1867k()
            androidx.appcompat.d.e r0 = new androidx.appcompat.d.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f805l0
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f805l0
            android.widget.PopupWindow r6 = r7.f806m0
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo1132c()
            boolean r8 = r8.mo875a(r0, r3)
            if (r8 == 0) goto L_0x0164
            r0.mo1136i()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            r8.mo1850a(r0)
            r7.f804k0 = r0
            boolean r8 = r7.mo844x()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012e
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            androidx.core.l.i0 r8 = androidx.core.p034l.C0962e0.m5428a(r8)
            androidx.core.l.i0 r8 = r8.mo4824a(r0)
            r7.f808o0 = r8
            androidx.core.l.i0 r8 = r7.f808o0
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>()
            r8.mo4827a(r0)
            goto L_0x0154
        L_0x012e:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0154
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f805l0
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.p034l.C0962e0.m5563v0(r8)
        L_0x0154:
            android.widget.PopupWindow r8 = r7.f806m0
            if (r8 == 0) goto L_0x0166
            android.view.Window r8 = r7.f795b0
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f807n0
            r8.post(r0)
            goto L_0x0166
        L_0x0164:
            r7.f804k0 = r1
        L_0x0166:
            androidx.appcompat.d.b r8 = r7.f804k0
            if (r8 == 0) goto L_0x0171
            androidx.appcompat.app.e r0 = r7.f797d0
            if (r0 == 0) goto L_0x0171
            r0.onSupportActionModeStarted(r8)
        L_0x0171:
            androidx.appcompat.d.b r8 = r7.f804k0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo805b(androidx.appcompat.d.b$a):androidx.appcompat.d.b");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo814c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f775E0;
            this.f775E0 = false;
            PanelFeatureState a = mo785a(0, false);
            if (a != null && a.isOpen) {
                if (!z) {
                    mo795a(a, true);
                }
                return true;
            } else if (mo842v()) {
                return true;
            }
        } else if (i == 82) {
            m1208e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo818e(int i) {
        if (this.f780J0 != i) {
            this.f780J0 = i;
            mo800a();
        }
    }

    @C0195i0
    /* renamed from: a */
    public <T extends View> T mo783a(@C0225w int i) {
        m1188C();
        return this.f795b0.findViewById(i);
    }

    /* renamed from: a */
    public void mo790a(Configuration configuration) {
        if (this.f816w0 && this.f810q0) {
            C0279a e = mo817e();
            if (e != null) {
                e.mo923a(configuration);
            }
        }
        C0510i.m2770b().mo2673a(this.f794a0);
        m1206c(false);
    }

    /* renamed from: c */
    private boolean m1205c(PanelFeatureState panelFeatureState) {
        Context context = this.f794a0;
        int i = panelFeatureState.featureId;
        if ((i == 0 || i == 108) && this.f801h0 != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0238R.attr.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0238R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0238R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0341d dVar = new C0341d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0370g gVar = new C0370g(context);
        gVar.mo1561a((C0371a) this);
        panelFeatureState.setMenu(gVar);
        return true;
    }

    /* renamed from: a */
    public void mo792a(View view) {
        m1188C();
        ViewGroup viewGroup = (ViewGroup) this.f811r0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f796c0.mo1372a().onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo833m() {
        C0564y yVar = this.f801h0;
        if (yVar != null) {
            yVar.mo1911k();
        }
        if (this.f806m0 != null) {
            this.f795b0.getDecorView().removeCallbacks(this.f807n0);
            if (this.f806m0.isShowing()) {
                try {
                    this.f806m0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f806m0 = null;
        }
        mo836p();
        PanelFeatureState a = mo785a(0, false);
        if (a != null) {
            C0370g gVar = a.menu;
            if (gVar != null) {
                gVar.close();
            }
        }
    }

    /* renamed from: a */
    public void mo793a(View view, LayoutParams layoutParams) {
        m1188C();
        ((ViewGroup) this.f811r0.findViewById(16908290)).addView(view, layoutParams);
        this.f796c0.mo1372a().onContentChanged();
    }

    /* renamed from: a */
    private void m1195a(@C0193h0 Window window) {
        String str = "AppCompat has already installed itself into the Window";
        if (this.f795b0 == null) {
            Callback callback = window.getCallback();
            if (!(callback instanceof C0271k)) {
                this.f796c0 = new C0271k(callback);
                window.setCallback(this.f796c0);
                C0549t0 a = C0549t0.m2909a(this.f794a0, (AttributeSet) null, f767Z0);
                Drawable c = a.mo2877c(0);
                if (c != null) {
                    window.setBackgroundDrawable(c);
                }
                a.mo2887f();
                this.f795b0 = window;
                return;
            }
            throw new IllegalStateException(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    private boolean m1206c(boolean z) {
        if (this.f779I0) {
            return false;
        }
        int z2 = m1212z();
        boolean b = m1201b(mo826j(z2), z);
        if (z2 == 0) {
            mo838r().mo894f();
        } else {
            C0273m mVar = this.f784N0;
            if (mVar != null) {
                mVar.mo892a();
            }
        }
        if (z2 == 3) {
            m1190E().mo894f();
        } else {
            C0273m mVar2 = this.f785O0;
            if (mVar2 != null) {
                mVar2.mo892a();
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo798a(CharSequence charSequence) {
        this.f800g0 = charSequence;
        C0564y yVar = this.f801h0;
        if (yVar != null) {
            yVar.setWindowTitle(charSequence);
        } else if (mo843w() != null) {
            mo843w().mo949d(charSequence);
        } else {
            TextView textView = this.f812s0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: c */
    public int mo811c() {
        return this.f780J0;
    }

    /* renamed from: c */
    private void m1204c(int i, boolean z) {
        Resources resources = this.f794a0.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration, null);
        if (VERSION.SDK_INT < 26) {
            C0303j.m1513a(resources);
        }
        int i2 = this.f781K0;
        if (i2 != 0) {
            this.f794a0.setTheme(i2);
            if (VERSION.SDK_INT >= 23) {
                this.f794a0.getTheme().applyStyle(this.f781K0, true);
            }
        }
        if (z) {
            Object obj = this.f793Z;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C1459i) {
                    if (((C1459i) activity).getLifecycle().mo6471a().isAtLeast(State.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.f778H0) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo803a(C0370g gVar, MenuItem menuItem) {
        Callback u = mo841u();
        if (u != null && !this.f779I0) {
            PanelFeatureState a = mo786a((Menu) gVar.mo1614n());
            if (a != null) {
                return u.onMenuItemSelected(a.featureId, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo796a(C0370g gVar) {
        m1197a(gVar, true);
    }

    /* renamed from: a */
    public C0338b mo787a(@C0193h0 C0339a aVar) {
        if (aVar != null) {
            C0338b bVar = this.f804k0;
            if (bVar != null) {
                bVar.mo1121a();
            }
            C0269j jVar = new C0269j(aVar);
            C0279a e = mo817e();
            if (e != null) {
                this.f804k0 = e.mo920a((C0339a) jVar);
                C0338b bVar2 = this.f804k0;
                if (bVar2 != null) {
                    C0296e eVar = this.f797d0;
                    if (eVar != null) {
                        eVar.onSupportActionModeStarted(bVar2);
                    }
                }
            }
            if (this.f804k0 == null) {
                this.f804k0 = mo805b((C0339a) jVar);
            }
            return this.f804k0;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo810b(int i, KeyEvent keyEvent) {
        C0279a e = mo817e();
        if (e != null && e.mo934a(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f774D0;
        if (panelFeatureState == null || !m1200a(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f774D0 == null) {
                PanelFeatureState a = mo785a(0, true);
                m1203b(a, keyEvent);
                boolean a2 = m1200a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.isPrepared = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f774D0;
        if (panelFeatureState2 != null) {
            panelFeatureState2.isHandled = true;
        }
        return true;
    }

    /* renamed from: a */
    public void mo799a(boolean z) {
        this.f809p0 = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo802a(KeyEvent keyEvent) {
        Object obj = this.f793Z;
        boolean z = true;
        if ((obj instanceof C0989a) || (obj instanceof C0299g)) {
            View decorView = this.f795b0.getDecorView();
            if (decorView != null && C0988i.m5667a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f796c0.mo1372a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo801a(keyCode, keyEvent) : mo814c(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo801a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f775E0 = z;
        } else if (i == 82) {
            m1207d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m1202b(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(mo837q());
        panelFeatureState.decorView = new C0276o(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    /* renamed from: a */
    public View mo784a(View view, String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f792V0 == null) {
            String string = this.f794a0.obtainStyledAttributes(C0238R.styleable.AppCompatTheme).getString(C0238R.styleable.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f792V0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f792V0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    sb.toString();
                    this.f792V0 = new AppCompatViewInflater();
                }
            }
        }
        if (f766Y0) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m1198a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f792V0.mo900a(view, str, context, attributeSet, z, f766Y0, true, C0565y0.m3091b());
    }

    /* renamed from: b */
    private boolean m1203b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f779I0) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f774D0;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo795a(panelFeatureState2, false);
        }
        Callback u = mo841u();
        if (u != null) {
            panelFeatureState.createdPanelView = u.onCreatePanelView(panelFeatureState.featureId);
        }
        int i = panelFeatureState.featureId;
        boolean z = i == 0 || i == 108;
        if (z) {
            C0564y yVar = this.f801h0;
            if (yVar != null) {
                yVar.mo1896d();
            }
        }
        if (panelFeatureState.createdPanelView == null && (!z || !(mo843w() instanceof C0304k))) {
            if (panelFeatureState.menu == null || panelFeatureState.refreshMenuContent) {
                if (panelFeatureState.menu == null && (!m1205c(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z && this.f801h0 != null) {
                    if (this.f802i0 == null) {
                        this.f802i0 = new C0268i();
                    }
                    this.f801h0.mo1885a(panelFeatureState.menu, this.f802i0);
                }
                panelFeatureState.menu.mo1630t();
                if (!u.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z) {
                        C0564y yVar2 = this.f801h0;
                        if (yVar2 != null) {
                            yVar2.mo1885a(null, this.f802i0);
                        }
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.mo1630t();
            Bundle bundle = panelFeatureState.frozenActionViewState;
            if (bundle != null) {
                panelFeatureState.menu.mo1558a(bundle);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!u.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z) {
                    C0564y yVar3 = this.f801h0;
                    if (yVar3 != null) {
                        yVar3.mo1885a(null, this.f802i0);
                    }
                }
                panelFeatureState.menu.mo1623s();
                return false;
            }
            panelFeatureState.qwertyMode = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
            panelFeatureState.menu.mo1623s();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.f774D0 = panelFeatureState;
        return true;
    }

    /* renamed from: a */
    private boolean m1198a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f795b0.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0962e0.m5515h0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a */
    private void m1196a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        if (!panelFeatureState.isOpen && !this.f779I0) {
            if (panelFeatureState.featureId == 0) {
                if ((this.f794a0.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback u = mo841u();
            if (u == null || u.onMenuOpened(panelFeatureState.featureId, panelFeatureState.menu)) {
                WindowManager windowManager = (WindowManager) this.f794a0.getSystemService("window");
                if (windowManager != null && m1203b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.decorView == null || panelFeatureState.refreshDecorView) {
                        ViewGroup viewGroup = panelFeatureState.decorView;
                        if (viewGroup == null) {
                            if (!m1202b(panelFeatureState) || panelFeatureState.decorView == null) {
                                return;
                            }
                        } else if (panelFeatureState.refreshDecorView && viewGroup.getChildCount() > 0) {
                            panelFeatureState.decorView.removeAllViews();
                        }
                        if (m1199a(panelFeatureState) && panelFeatureState.hasPanelItems()) {
                            LayoutParams layoutParams = panelFeatureState.shownPanelView.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
                            ViewParent parent = panelFeatureState.shownPanelView.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(panelFeatureState.shownPanelView);
                            }
                            panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, layoutParams);
                            if (!panelFeatureState.shownPanelView.hasFocus()) {
                                panelFeatureState.shownPanelView.requestFocus();
                            }
                        }
                    } else {
                        View view = panelFeatureState.createdPanelView;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i = -1;
                                panelFeatureState.isHandled = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f820x, panelFeatureState.f821y, 1002, 8519680, -3);
                                layoutParams3.gravity = panelFeatureState.gravity;
                                layoutParams3.windowAnimations = panelFeatureState.windowAnimations;
                                windowManager.addView(panelFeatureState.decorView, layoutParams3);
                                panelFeatureState.isOpen = true;
                            }
                        }
                    }
                    i = -2;
                    panelFeatureState.isHandled = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f820x, panelFeatureState.f821y, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.gravity;
                    layoutParams32.windowAnimations = panelFeatureState.windowAnimations;
                    windowManager.addView(panelFeatureState.decorView, layoutParams32);
                    panelFeatureState.isOpen = true;
                }
            } else {
                mo795a(panelFeatureState, true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo808b(C0370g gVar) {
        if (!this.f772B0) {
            this.f772B0 = true;
            this.f801h0.mo1911k();
            Callback u = mo841u();
            if (u != null && !this.f779I0) {
                u.onPanelClosed(108, gVar);
            }
            this.f772B0 = false;
        }
    }

    /* renamed from: b */
    private boolean m1201b(int i, boolean z) {
        int i2 = this.f794a0.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean G = m1192G();
        boolean z3 = false;
        if ((f769b1 || i3 != i2) && !G && VERSION.SDK_INT >= 17 && !this.f776F0 && (this.f793Z instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & -49) | i3;
            try {
                ((ContextThemeWrapper) this.f793Z).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException unused) {
            }
        }
        int i4 = this.f794a0.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !G && this.f776F0 && (VERSION.SDK_INT >= 17 || this.f777G0)) {
            Object obj = this.f793Z;
            if (obj instanceof Activity) {
                C0727a.m4251f((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m1204c(i3, G);
        }
        if (z2) {
            Object obj2 = this.f793Z;
            if (obj2 instanceof C0295d) {
                ((C0295d) obj2).onNightModeChanged(i);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private void m1197a(C0370g gVar, boolean z) {
        C0564y yVar = this.f801h0;
        if (yVar == null || !yVar.mo1899f() || (ViewConfiguration.get(this.f794a0).hasPermanentMenuKey() && !this.f801h0.mo1908h())) {
            PanelFeatureState a = mo785a(0, true);
            a.refreshDecorView = true;
            mo795a(a, false);
            m1196a(a, (KeyEvent) null);
            return;
        }
        Callback u = mo841u();
        if (this.f801h0.mo1893b() && z) {
            this.f801h0.mo1909i();
            if (!this.f779I0) {
                u.onPanelClosed(108, mo785a(0, true).menu);
            }
        } else if (u != null && !this.f779I0) {
            if (this.f786P0 && (this.f787Q0 & 1) != 0) {
                this.f795b0.getDecorView().removeCallbacks(this.f788R0);
                this.f788R0.run();
            }
            PanelFeatureState a2 = mo785a(0, true);
            C0370g gVar2 = a2.menu;
            if (gVar2 != null && !a2.refreshMenuContent && u.onPreparePanel(0, a2.createdPanelView, gVar2)) {
                u.onMenuOpened(108, a2.menu);
                this.f801h0.mo1910j();
            }
        }
    }

    /* renamed from: b */
    public final C0289b mo804b() {
        return new C0267h();
    }

    /* renamed from: a */
    private boolean m1199a(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.createdPanelView;
        boolean z = true;
        if (view != null) {
            panelFeatureState.shownPanelView = view;
            return true;
        } else if (panelFeatureState.menu == null) {
            return false;
        } else {
            if (this.f803j0 == null) {
                this.f803j0 = new C0277p();
            }
            panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.f803j0);
            if (panelFeatureState.shownPanelView == null) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo795a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.featureId == 0) {
            C0564y yVar = this.f801h0;
            if (yVar != null && yVar.mo1893b()) {
                mo808b(panelFeatureState.menu);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f794a0.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen) {
            ViewGroup viewGroup = panelFeatureState.decorView;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo788a(panelFeatureState.featureId, panelFeatureState, null);
                }
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.f774D0 == panelFeatureState) {
            this.f774D0 = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo788a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f773C0;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.f779I0) {
            this.f796c0.mo1372a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PanelFeatureState mo786a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f773C0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PanelFeatureState mo785a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f773C0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f773C0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: a */
    private boolean m1200a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (panelFeatureState.isPrepared || m1203b(panelFeatureState, keyEvent)) {
            C0370g gVar = panelFeatureState.menu;
            if (gVar != null) {
                z = gVar.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f801h0 == null) {
            mo795a(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo800a() {
        return m1206c(true);
    }
}
