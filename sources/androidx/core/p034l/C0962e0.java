package androidx.core.p034l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.DragShadowBuilder;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;
import androidx.annotation.C0222u0;
import androidx.annotation.C0225w;
import androidx.annotation.RequiresApi;
import androidx.collection.C0635a;
import androidx.core.C0721R;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1021e;
import androidx.core.p034l.p035o0.C1025g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.core.l.e0 */
/* compiled from: ViewCompat */
public class C0962e0 {

    /* renamed from: A */
    public static final int f4301A = 1;

    /* renamed from: B */
    public static final int f4302B = 1;

    /* renamed from: C */
    public static final int f4303C = 2;

    /* renamed from: D */
    public static final int f4304D = 4;

    /* renamed from: E */
    public static final int f4305E = 8;

    /* renamed from: F */
    public static final int f4306F = 16;

    /* renamed from: G */
    public static final int f4307G = 32;

    /* renamed from: H */
    private static final AtomicInteger f4308H = new AtomicInteger(1);

    /* renamed from: I */
    private static Field f4309I = null;

    /* renamed from: J */
    private static boolean f4310J = false;

    /* renamed from: K */
    private static Field f4311K = null;

    /* renamed from: L */
    private static boolean f4312L = false;

    /* renamed from: M */
    private static Method f4313M = null;

    /* renamed from: N */
    private static Method f4314N = null;

    /* renamed from: O */
    private static boolean f4315O = false;

    /* renamed from: P */
    private static WeakHashMap<View, String> f4316P = null;

    /* renamed from: Q */
    private static WeakHashMap<View, C0990i0> f4317Q = null;

    /* renamed from: R */
    private static Method f4318R = null;

    /* renamed from: S */
    private static Field f4319S = null;

    /* renamed from: T */
    private static boolean f4320T = false;

    /* renamed from: U */
    private static ThreadLocal<Rect> f4321U = null;

    /* renamed from: V */
    private static final int[] f4322V = {C0721R.C0724id.accessibility_custom_action_0, C0721R.C0724id.accessibility_custom_action_1, C0721R.C0724id.accessibility_custom_action_2, C0721R.C0724id.accessibility_custom_action_3, C0721R.C0724id.accessibility_custom_action_4, C0721R.C0724id.accessibility_custom_action_5, C0721R.C0724id.accessibility_custom_action_6, C0721R.C0724id.accessibility_custom_action_7, C0721R.C0724id.accessibility_custom_action_8, C0721R.C0724id.accessibility_custom_action_9, C0721R.C0724id.accessibility_custom_action_10, C0721R.C0724id.accessibility_custom_action_11, C0721R.C0724id.accessibility_custom_action_12, C0721R.C0724id.accessibility_custom_action_13, C0721R.C0724id.accessibility_custom_action_14, C0721R.C0724id.accessibility_custom_action_15, C0721R.C0724id.accessibility_custom_action_16, C0721R.C0724id.accessibility_custom_action_17, C0721R.C0724id.accessibility_custom_action_18, C0721R.C0724id.accessibility_custom_action_19, C0721R.C0724id.accessibility_custom_action_20, C0721R.C0724id.accessibility_custom_action_21, C0721R.C0724id.accessibility_custom_action_22, C0721R.C0724id.accessibility_custom_action_23, C0721R.C0724id.accessibility_custom_action_24, C0721R.C0724id.accessibility_custom_action_25, C0721R.C0724id.accessibility_custom_action_26, C0721R.C0724id.accessibility_custom_action_27, C0721R.C0724id.accessibility_custom_action_28, C0721R.C0724id.accessibility_custom_action_29, C0721R.C0724id.accessibility_custom_action_30, C0721R.C0724id.accessibility_custom_action_31};

    /* renamed from: W */
    private static C0968f f4323W = new C0968f();

    /* renamed from: a */
    private static final String f4324a = "ViewCompat";
    @Deprecated

    /* renamed from: b */
    public static final int f4325b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f4326c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f4327d = 2;

    /* renamed from: e */
    public static final int f4328e = 0;

    /* renamed from: f */
    public static final int f4329f = 1;

    /* renamed from: g */
    public static final int f4330g = 2;

    /* renamed from: h */
    public static final int f4331h = 4;

    /* renamed from: i */
    public static final int f4332i = 0;

    /* renamed from: j */
    public static final int f4333j = 1;

    /* renamed from: k */
    public static final int f4334k = 2;
    @Deprecated

    /* renamed from: l */
    public static final int f4335l = 0;
    @Deprecated

    /* renamed from: m */
    public static final int f4336m = 1;
    @Deprecated

    /* renamed from: n */
    public static final int f4337n = 2;

    /* renamed from: o */
    public static final int f4338o = 0;

    /* renamed from: p */
    public static final int f4339p = 1;

    /* renamed from: q */
    public static final int f4340q = 2;

    /* renamed from: r */
    public static final int f4341r = 3;
    @Deprecated

    /* renamed from: s */
    public static final int f4342s = 16777215;
    @Deprecated

    /* renamed from: t */
    public static final int f4343t = -16777216;
    @Deprecated

    /* renamed from: u */
    public static final int f4344u = 16;
    @Deprecated

    /* renamed from: v */
    public static final int f4345v = 16777216;

    /* renamed from: w */
    public static final int f4346w = 0;

    /* renamed from: x */
    public static final int f4347x = 1;

    /* renamed from: y */
    public static final int f4348y = 2;

    /* renamed from: z */
    public static final int f4349z = 0;

    /* renamed from: androidx.core.l.e0$a */
    /* compiled from: ViewCompat */
    static class C0963a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C1054x f4350a;

        C0963a(C1054x xVar) {
            this.f4350a = xVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C1006n0.m5756a(this.f4350a.mo860a(view, C1006n0.m5755a((Object) windowInsets)));
        }
    }

    /* renamed from: androidx.core.l.e0$b */
    /* compiled from: ViewCompat */
    static class C0964b implements OnUnhandledKeyEventListener {

        /* renamed from: a */
        final /* synthetic */ C0974l f4351a;

        C0964b(C0974l lVar) {
            this.f4351a = lVar;
        }

        public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
            return this.f4351a.onUnhandledKeyEvent(view, keyEvent);
        }
    }

    /* renamed from: androidx.core.l.e0$c */
    /* compiled from: ViewCompat */
    static class C0965c extends C0969g<Boolean> {
        C0965c(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4797a(Boolean bool, Boolean bool2) {
            return !mo4808a(bool, bool2);
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(28)
        /* renamed from: a */
        public Boolean m5572a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(28)
        /* renamed from: a */
        public void mo4796a(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }
    }

    /* renamed from: androidx.core.l.e0$d */
    /* compiled from: ViewCompat */
    static class C0966d extends C0969g<CharSequence> {
        C0966d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(28)
        /* renamed from: a */
        public CharSequence m5578a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(28)
        /* renamed from: a */
        public void mo4796a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4797a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: androidx.core.l.e0$e */
    /* compiled from: ViewCompat */
    static class C0967e extends C0969g<Boolean> {
        C0967e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4797a(Boolean bool, Boolean bool2) {
            return !mo4808a(bool, bool2);
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(28)
        /* renamed from: a */
        public Boolean m5584a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(28)
        /* renamed from: a */
        public void mo4796a(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }
    }

    /* renamed from: androidx.core.l.e0$f */
    /* compiled from: ViewCompat */
    static class C0968f implements OnGlobalLayoutListener, OnAttachStateChangeListener {

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f4352a = new WeakHashMap<>();

        C0968f() {
        }

        @RequiresApi(19)
        /* renamed from: c */
        private void m5590c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @RequiresApi(19)
        /* renamed from: d */
        private void m5591d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(19)
        /* renamed from: a */
        public void mo4803a(View view) {
            this.f4352a.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                m5590c(view);
            }
        }

        /* access modifiers changed from: 0000 */
        @RequiresApi(19)
        /* renamed from: b */
        public void mo4804b(View view) {
            this.f4352a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m5591d(view);
        }

        @RequiresApi(19)
        public void onGlobalLayout() {
            for (Entry entry : this.f4352a.entrySet()) {
                m5589a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }

        @RequiresApi(19)
        public void onViewAttachedToWindow(View view) {
            m5590c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        @RequiresApi(19)
        /* renamed from: a */
        private void m5589a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C0962e0.m5503f(view, 16);
                }
                this.f4352a.put(view, Boolean.valueOf(z2));
            }
        }
    }

    /* renamed from: androidx.core.l.e0$g */
    /* compiled from: ViewCompat */
    static abstract class C0969g<T> {

        /* renamed from: a */
        private final int f4353a;

        /* renamed from: b */
        private final Class<T> f4354b;

        /* renamed from: c */
        private final int f4355c;

        /* renamed from: d */
        private final int f4356d;

        C0969g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        private boolean m5594a() {
            return VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo4794a(View view);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo4796a(View view, T t);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4810b(View view, T t) {
            if (m5595b()) {
                mo4796a(view, t);
            } else if (m5594a() && mo4797a((T) mo4809b(view), t)) {
                C0962e0.m5402F(view);
                view.setTag(this.f4353a, t);
                C0962e0.m5503f(view, 0);
            }
        }

        C0969g(int i, Class<T> cls, int i2, int i3) {
            this.f4353a = i;
            this.f4354b = cls;
            this.f4356d = i2;
            this.f4355c = i3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4797a(T t, T t2) {
            return !t2.equals(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4808a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public T mo4809b(View view) {
            if (m5595b()) {
                return mo4794a(view);
            }
            if (m5594a()) {
                T tag = view.getTag(this.f4353a);
                if (this.f4354b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        /* renamed from: b */
        private boolean m5595b() {
            return VERSION.SDK_INT >= this.f4355c;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.l.e0$h */
    /* compiled from: ViewCompat */
    public @interface C0970h {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.l.e0$i */
    /* compiled from: ViewCompat */
    public @interface C0971i {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.l.e0$j */
    /* compiled from: ViewCompat */
    public @interface C0972j {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.l.e0$k */
    /* compiled from: ViewCompat */
    public @interface C0973k {
    }

    /* renamed from: androidx.core.l.e0$l */
    /* compiled from: ViewCompat */
    public interface C0974l {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.l.e0$m */
    /* compiled from: ViewCompat */
    public @interface C0975m {
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.l.e0$n */
    /* compiled from: ViewCompat */
    public @interface C0976n {
    }

    /* renamed from: androidx.core.l.e0$o */
    /* compiled from: ViewCompat */
    static class C0977o {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f4357d = new ArrayList<>();
        @C0195i0

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f4358a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f4359b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f4360c = null;

        C0977o() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m5602a() {
            if (this.f4359b == null) {
                this.f4359b = new SparseArray<>();
            }
            return this.f4359b;
        }

        @C0195i0
        /* renamed from: b */
        private View m5604b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4358a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m5604b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m5608c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: c */
        private boolean m5608c(@C0193h0 View view, @C0193h0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0721R.C0724id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C0974l) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        static C0977o m5603a(View view) {
            C0977o oVar = (C0977o) view.getTag(C0721R.C0724id.tag_unhandled_key_event_manager);
            if (oVar != null) {
                return oVar;
            }
            C0977o oVar2 = new C0977o();
            view.setTag(C0721R.C0724id.tag_unhandled_key_event_manager, oVar2);
            return oVar2;
        }

        /* renamed from: c */
        static void m5607c(View view) {
            synchronized (f4357d) {
                for (int i = 0; i < f4357d.size(); i++) {
                    if (((WeakReference) f4357d.get(i)).get() == view) {
                        f4357d.remove(i);
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        static void m5606b(View view) {
            synchronized (f4357d) {
                Iterator it = f4357d.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == view) {
                        return;
                    }
                }
                f4357d.add(new WeakReference(view));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4813a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m5605b();
            }
            View b = m5604b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m5602a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }

        /* renamed from: b */
        private void m5605b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4358a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f4357d.isEmpty()) {
                synchronized (f4357d) {
                    if (this.f4358a == null) {
                        this.f4358a = new WeakHashMap<>();
                    }
                    for (int size = f4357d.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f4357d.get(size)).get();
                        if (view == null) {
                            f4357d.remove(size);
                        } else {
                            this.f4358a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f4358a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4812a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f4360c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f4360c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray a = m5602a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C0962e0.m5515h0(view)) {
                m5608c(view, keyEvent);
            }
            return true;
        }
    }

    protected C0962e0() {
    }

    @Deprecated
    /* renamed from: A */
    public static int m5397A(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    /* renamed from: B */
    public static int m5398B(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: C */
    public static int m5399C(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f4312L) {
            try {
                f4311K = View.class.getDeclaredField("mMinHeight");
                f4311K.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4312L = true;
        }
        Field field = f4311K;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: D */
    public static int m5400D(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f4310J) {
            try {
                f4309I = View.class.getDeclaredField("mMinWidth");
                f4309I.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4310J = true;
        }
        Field field = f4309I;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: E */
    public static int m5401E(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    /* renamed from: F */
    static C0947a m5402F(@C0193h0 View view) {
        C0947a f = m5500f(view);
        if (f == null) {
            f = new C0947a();
        }
        m5443a(view, f);
        return f;
    }

    @Deprecated
    /* renamed from: G */
    public static int m5403G(View view) {
        return view.getOverScrollMode();
    }

    @C0199k0
    /* renamed from: H */
    public static int m5404H(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    @C0199k0
    /* renamed from: I */
    public static int m5405I(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: J */
    public static ViewParent m5406J(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    @Deprecated
    /* renamed from: K */
    public static float m5407K(View view) {
        return view.getPivotX();
    }

    @Deprecated
    /* renamed from: L */
    public static float m5408L(View view) {
        return view.getPivotY();
    }

    @Deprecated
    /* renamed from: M */
    public static float m5409M(View view) {
        return view.getRotation();
    }

    @Deprecated
    /* renamed from: N */
    public static float m5410N(View view) {
        return view.getRotationX();
    }

    @Deprecated
    /* renamed from: O */
    public static float m5411O(View view) {
        return view.getRotationY();
    }

    @Deprecated
    /* renamed from: P */
    public static float m5412P(View view) {
        return view.getScaleX();
    }

    @Deprecated
    /* renamed from: Q */
    public static float m5413Q(View view) {
        return view.getScaleY();
    }

    /* renamed from: R */
    public static int m5414R(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 23) {
            return view.getScrollIndicators();
        }
        return 0;
    }

    @C0195i0
    /* renamed from: S */
    public static String m5415S(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f4316P;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    @Deprecated
    /* renamed from: T */
    public static float m5416T(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    /* renamed from: U */
    public static float m5417U(View view) {
        return view.getTranslationY();
    }

    /* renamed from: V */
    public static float m5418V(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    /* renamed from: W */
    public static int m5419W(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    @Deprecated
    /* renamed from: X */
    public static float m5420X(View view) {
        return view.getX();
    }

    @Deprecated
    /* renamed from: Y */
    public static float m5421Y(View view) {
        return view.getY();
    }

    /* renamed from: Z */
    public static float m5422Z(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m5460a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: a0 */
    public static boolean m5468a0(@C0193h0 View view) {
        return m5506g(view) != null;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m5478b(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: b0 */
    public static boolean m5481b0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.hasExplicitFocusable();
        }
        return view.hasFocusable();
    }

    /* renamed from: c */
    public static void m5483c(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!f4315O) {
            m5470b();
        }
        Method method = f4314N;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    /* renamed from: c0 */
    public static boolean m5487c0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.hasNestedScrollingParent();
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).hasNestedScrollingParent();
        }
        return false;
    }

    /* renamed from: d */
    private static Rect m5488d() {
        if (f4321U == null) {
            f4321U = new ThreadLocal<>();
        }
        Rect rect = (Rect) f4321U.get();
        if (rect == null) {
            rect = new Rect();
            f4321U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: d0 */
    public static boolean m5493d0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: e */
    public static void m5497e(@C0193h0 View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: e0 */
    public static boolean m5499e0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    @C0195i0
    /* renamed from: f */
    public static C0947a m5500f(@C0193h0 View view) {
        AccessibilityDelegate g = m5506g(view);
        if (g == null) {
            return null;
        }
        if (g instanceof C0948a) {
            return ((C0948a) g).f4285a;
        }
        return new C0947a(g);
    }

    /* renamed from: f0 */
    public static boolean m5505f0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    @C0195i0
    /* renamed from: g */
    private static AccessibilityDelegate m5506g(@C0193h0 View view) {
        if (f4320T) {
            return null;
        }
        if (f4319S == null) {
            try {
                f4319S = View.class.getDeclaredField("mAccessibilityDelegate");
                f4319S.setAccessible(true);
            } catch (Throwable unused) {
                f4320T = true;
                return null;
            }
        }
        try {
            Object obj = f4319S.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4320T = true;
            return null;
        }
    }

    @C0222u0
    /* renamed from: g0 */
    public static boolean m5510g0(View view) {
        Boolean bool = (Boolean) m5427a().mo4809b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: h */
    public static int m5511h(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: h0 */
    public static boolean m5515h0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: i */
    public static void m5518i(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            m5430a(i, view);
            m5503f(view, 0);
        }
    }

    /* renamed from: i0 */
    public static boolean m5520i0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    @C0193h0
    /* renamed from: j */
    public static <T extends View> T m5521j(@C0193h0 View view, @C0225w int i) {
        if (VERSION.SDK_INT >= 28) {
            return view.requireViewById(i);
        }
        T findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: j0 */
    public static boolean m5524j0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isImportantForAccessibility();
        }
        return true;
    }

    /* renamed from: k */
    private static List<C1017a> m5525k(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0721R.C0724id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C0721R.C0724id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: k0 */
    public static boolean m5528k0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    /* renamed from: l */
    public static void m5531l(@C0193h0 View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: l0 */
    public static boolean m5532l0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    /* renamed from: m */
    public static void m5535m(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: m0 */
    public static boolean m5536m0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    /* renamed from: n */
    public static void m5539n(@C0193h0 View view, @C0225w int i) {
        if (VERSION.SDK_INT >= 17) {
            view.setLabelFor(i);
        }
    }

    /* renamed from: n0 */
    public static boolean m5540n0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: o */
    public static void m5543o(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: o0 */
    public static boolean m5544o0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLayoutDirectionResolved();
        }
        return false;
    }

    @C0195i0
    /* renamed from: p */
    public static Rect m5545p(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: p0 */
    public static boolean m5547p0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).isNestedScrollingEnabled();
        }
        return false;
    }

    @Deprecated
    /* renamed from: q */
    public static void m5549q(View view, int i) {
        view.setOverScrollMode(i);
    }

    @Deprecated
    /* renamed from: q0 */
    public static boolean m5550q0(View view) {
        return view.isOpaque();
    }

    /* renamed from: r */
    public static float m5551r(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: r0 */
    public static boolean m5553r0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m5554s(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    @C0222u0
    /* renamed from: s0 */
    public static boolean m5556s0(View view) {
        Boolean bool = (Boolean) m5501f().mo4809b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: t */
    public static int m5557t(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @Deprecated
    /* renamed from: t0 */
    public static void m5559t0(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: u */
    public static int m5560u(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: u0 */
    public static void m5561u0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: v */
    public static int m5562v(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLabelFor();
        }
        return 0;
    }

    /* renamed from: v0 */
    public static void m5563v0(@C0193h0 View view) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    @Deprecated
    /* renamed from: w */
    public static int m5564w(View view) {
        return view.getLayerType();
    }

    /* renamed from: w0 */
    public static boolean m5565w0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.restoreDefaultFocus();
        }
        return view.requestFocus();
    }

    /* renamed from: x */
    public static int m5566x(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: x0 */
    public static void m5567x0(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C1048r) {
            ((C1048r) view).stopNestedScroll();
        }
    }

    @Deprecated
    @C0195i0
    /* renamed from: y */
    public static Matrix m5568y(View view) {
        return view.getMatrix();
    }

    /* renamed from: y0 */
    private static void m5569y0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Deprecated
    /* renamed from: z */
    public static int m5570z(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    /* renamed from: a */
    public static void m5442a(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    /* renamed from: b */
    public static void m5474b(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @C0195i0
    /* renamed from: q */
    public static Display m5548q(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m5515h0(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    public static void m5447a(@C0193h0 View view, C1016d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.mo4986f0());
    }

    /* renamed from: b */
    public static void m5473b(@C0193h0 View view, @C0199k0 int i, @C0199k0 int i2, @C0199k0 int i3, @C0199k0 int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: e */
    public static void m5495e(View view) {
        if (VERSION.SDK_INT >= 19) {
            m5402F(view);
        }
    }

    @Deprecated
    /* renamed from: h */
    public static void m5512h(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: m */
    private static int m5533m(View view) {
        List k = m5525k(view);
        int i = 0;
        int i2 = -1;
        while (true) {
            int[] iArr = f4322V;
            if (i >= iArr.length || i2 != -1) {
                return i2;
            }
            int i3 = iArr[i];
            boolean z = true;
            for (int i4 = 0; i4 < k.size(); i4++) {
                z &= ((C1017a) k.get(i4)).mo5037a() != i3;
            }
            if (z) {
                i2 = i3;
            }
            i++;
        }
        return i2;
    }

    @Deprecated
    /* renamed from: n */
    public static void m5538n(View view, float f) {
        view.setY(f);
    }

    /* renamed from: o */
    public static Mode m5541o(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof C0955c0 ? ((C0955c0) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: p */
    public static void m5546p(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(i);
        }
    }

    /* renamed from: r */
    public static void m5552r(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i);
        }
    }

    /* renamed from: s */
    public static boolean m5555s(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 21) {
            return view.startNestedScroll(i);
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).startNestedScroll(i);
        }
        return false;
    }

    /* renamed from: t */
    public static void m5558t(@C0193h0 View view, int i) {
        if (view instanceof C1035p) {
            ((C1035p) view).stopNestedScroll(i);
        } else if (i == 0) {
            m5567x0(view);
        }
    }

    /* renamed from: a */
    public static void m5443a(@C0193h0 View view, C0947a aVar) {
        AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m5506g(view) instanceof C0948a)) {
            aVar = new C0947a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo4746a();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    @Deprecated
    /* renamed from: h */
    public static void m5514h(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    /* renamed from: i */
    public static C1021e m5516i(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
            if (accessibilityNodeProvider != null) {
                return new C1021e(accessibilityNodeProvider);
            }
        }
        return null;
    }

    @Deprecated
    /* renamed from: l */
    public static float m5529l(View view) {
        return view.getAlpha();
    }

    /* renamed from: n */
    public static ColorStateList m5537n(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof C0955c0 ? ((C0955c0) view).getSupportBackgroundTintList() : null;
    }

    @Deprecated
    /* renamed from: e */
    public static void m5496e(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    /* renamed from: f */
    public static void m5502f(View view, float f) {
        view.setRotationX(f);
    }

    /* renamed from: h */
    public static void m5513h(@C0193h0 View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect d = m5488d();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                d.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !d.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m5491d(view, i);
            if (z && d.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(d);
            }
        } else {
            m5491d(view, i);
        }
    }

    @Deprecated
    /* renamed from: j */
    public static void m5523j(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: k */
    public static void m5527k(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: l */
    public static void m5530l(@C0193h0 View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: b */
    private static void m5470b() {
        try {
            f4313M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f4314N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        f4315O = true;
    }

    /* renamed from: e */
    public static boolean m5498e(@C0193h0 View view, int i) {
        if (view instanceof C1035p) {
            ((C1035p) view).hasNestedScrollingParent(i);
        } else if (i == 0) {
            return m5487c0(view);
        }
        return false;
    }

    /* renamed from: f */
    public static void m5504f(@C0193h0 View view, boolean z) {
        if (VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z);
        }
    }

    @C0222u0
    /* renamed from: j */
    public static CharSequence m5522j(View view) {
        return (CharSequence) m5494e().mo4809b(view);
    }

    /* renamed from: a */
    public static void m5456a(@C0193h0 View view, @C0195i0 String... strArr) {
        if (VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    /* renamed from: d */
    public static void m5489d(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!f4315O) {
            m5470b();
        }
        Method method = f4313M;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    @Deprecated
    /* renamed from: i */
    public static void m5517i(View view, float f) {
        view.setScaleY(f);
    }

    @Deprecated
    /* renamed from: k */
    public static void m5526k(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: o */
    public static void m5542o(@C0193h0 View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static void m5484c(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: f */
    private static C0969g<Boolean> m5501f() {
        return new C0965c(C0721R.C0724id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @C0222u0
    /* renamed from: i */
    public static void m5519i(View view, boolean z) {
        m5501f().mo4810b(view, Boolean.valueOf(z));
    }

    @Deprecated
    /* renamed from: m */
    public static void m5534m(View view, float f) {
        view.setX(f);
    }

    /* renamed from: a */
    public static void m5433a(@C0193h0 View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m5472b(@C0193h0 View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static void m5486c(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: e */
    private static C0969g<CharSequence> m5494e() {
        return new C0966d(C0721R.C0724id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @RequiresApi(19)
    /* renamed from: f */
    static void m5503f(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m5522j(view) != null;
            if (m5511h(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    sb.toString();
                }
            }
        }
    }

    /* renamed from: c */
    private static void m5485c(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m5569y0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m5569y0((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static C1006n0 m5469b(@C0193h0 View view, C1006n0 n0Var) {
        if (VERSION.SDK_INT < 21) {
            return n0Var;
        }
        WindowInsets windowInsets = (WindowInsets) C1006n0.m5756a(n0Var);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C1006n0.m5755a((Object) windowInsets);
    }

    @Deprecated
    /* renamed from: g */
    public static void m5507g(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: a */
    public static void m5451a(@C0193h0 View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: g */
    public static void m5509g(@C0193h0 View view, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof C1048r) {
            ((C1048r) view).setNestedScrollingEnabled(z);
        }
    }

    @Deprecated
    /* renamed from: d */
    public static void m5490d(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: a */
    public static void m5452a(@C0193h0 View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: d */
    private static void m5491d(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m5569y0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m5569y0((View) parent);
            }
        }
    }

    /* renamed from: c */
    public static int m5482c() {
        int i;
        int i2;
        if (VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f4308H.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f4308H.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: g */
    public static void m5508g(@C0193h0 View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect d = m5488d();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                d.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !d.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m5485c(view, i);
            if (z && d.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(d);
            }
        } else {
            m5485c(view, i);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m5477b(View view, boolean z) {
        view.setActivated(z);
    }

    /* renamed from: a */
    public static boolean m5465a(@C0193h0 View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m5479b(@C0193h0 View view, int i, int i2) {
        if (view instanceof C1035p) {
            return ((C1035p) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return m5555s(view, i);
        }
        return false;
    }

    /* renamed from: a */
    public static int m5425a(@C0193h0 View view, @C0193h0 CharSequence charSequence, @C0193h0 C1025g gVar) {
        int m = m5533m(view);
        if (m != -1) {
            m5445a(view, new C1017a(m, charSequence, gVar));
        }
        return m;
    }

    /* renamed from: b */
    public static void m5476b(@C0193h0 View view, @C0195i0 CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: d */
    public static void m5492d(@C0193h0 View view, boolean z) {
        if (VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z);
        }
    }

    /* renamed from: a */
    public static void m5446a(@C0193h0 View view, @C0193h0 C1017a aVar, @C0195i0 CharSequence charSequence, @C0195i0 C1025g gVar) {
        m5445a(view, aVar.mo5038a(charSequence, gVar));
    }

    /* renamed from: b */
    public static void m5471b(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }

    /* renamed from: a */
    private static void m5445a(@C0193h0 View view, @C0193h0 C1017a aVar) {
        if (VERSION.SDK_INT >= 21) {
            m5402F(view);
            m5430a(aVar.mo5037a(), view);
            m5525k(view).add(aVar);
            m5503f(view, 0);
        }
    }

    /* renamed from: b */
    public static void m5475b(@C0193h0 View view, @C0193h0 C0974l lVar) {
        if (VERSION.SDK_INT >= 28) {
            Map map = (Map) view.getTag(C0721R.C0724id.tag_unhandled_key_listeners);
            if (map != null) {
                OnUnhandledKeyEventListener onUnhandledKeyEventListener = (OnUnhandledKeyEventListener) map.get(lVar);
                if (onUnhandledKeyEventListener != null) {
                    view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
                }
                return;
            }
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0721R.C0724id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(lVar);
            if (arrayList.size() == 0) {
                C0977o.m5607c(view);
            }
        }
    }

    /* renamed from: a */
    private static void m5430a(int i, View view) {
        List k = m5525k(view);
        for (int i2 = 0; i2 < k.size(); i2++) {
            if (((C1017a) k.get(i2)).mo5037a() == i) {
                k.remove(i2);
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m5435a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: a */
    public static void m5437a(@C0193h0 View view, Paint paint) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    @C0222u0
    /* renamed from: b */
    static boolean m5480b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0977o.m5603a(view).mo4812a(keyEvent);
    }

    @Deprecated
    /* renamed from: a */
    public static int m5424a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    @Deprecated
    /* renamed from: a */
    public static int m5423a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    @C0193h0
    /* renamed from: a */
    public static C0990i0 m5428a(@C0193h0 View view) {
        if (f4317Q == null) {
            f4317Q = new WeakHashMap<>();
        }
        C0990i0 i0Var = (C0990i0) f4317Q.get(view);
        if (i0Var != null) {
            return i0Var;
        }
        C0990i0 i0Var2 = new C0990i0(view);
        f4317Q.put(view, i0Var2);
        return i0Var2;
    }

    @Deprecated
    /* renamed from: a */
    public static void m5431a(View view, @C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        view.setAlpha(f);
    }

    /* renamed from: a */
    public static void m5453a(@C0193h0 View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f4316P == null) {
            f4316P = new WeakHashMap<>();
        }
        f4316P.put(view, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m5457a(ViewGroup viewGroup, boolean z) {
        if (f4318R == null) {
            try {
                f4318R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            f4318R.setAccessible(true);
        }
        try {
            f4318R.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    /* renamed from: a */
    public static void m5448a(@C0193h0 View view, C1054x xVar) {
        if (VERSION.SDK_INT >= 21) {
            if (xVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new C0963a(xVar));
        }
    }

    /* renamed from: a */
    public static C1006n0 m5429a(@C0193h0 View view, C1006n0 n0Var) {
        if (VERSION.SDK_INT < 21) {
            return n0Var;
        }
        WindowInsets windowInsets = (WindowInsets) C1006n0.m5756a(n0Var);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C1006n0.m5755a((Object) windowInsets);
    }

    /* renamed from: a */
    public static void m5440a(@C0193h0 View view, @C0195i0 Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m5436a(@C0193h0 View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0955c0) {
            ((C0955c0) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m5438a(@C0193h0 View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0955c0) {
            ((C0955c0) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static boolean m5461a(@C0193h0 View view, int i, int i2, int i3, int i4, @C0195i0 int[] iArr) {
        if (VERSION.SDK_INT >= 21) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).dispatchNestedScroll(i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5463a(@C0193h0 View view, int i, int i2, @C0195i0 int[] iArr, @C0195i0 int[] iArr2) {
        if (VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }
        return false;
    }

    /* renamed from: a */
    public static void m5434a(@C0193h0 View view, int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5, @C0193h0 int[] iArr2) {
        View view2 = view;
        if (view2 instanceof C1038q) {
            ((C1038q) view2).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            m5462a(view, i, i2, i3, i4, iArr, i5);
        }
    }

    /* renamed from: a */
    public static boolean m5462a(@C0193h0 View view, int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5) {
        if (view instanceof C1035p) {
            return ((C1035p) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return m5461a(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5464a(@C0193h0 View view, int i, int i2, @C0195i0 int[] iArr, @C0195i0 int[] iArr2, int i3) {
        if (view instanceof C1035p) {
            return ((C1035p) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return m5463a(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5459a(@C0193h0 View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            return view.dispatchNestedFling(f, f2, z);
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).dispatchNestedFling(f, f2, z);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5458a(@C0193h0 View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            return view.dispatchNestedPreFling(f, f2);
        }
        if (view instanceof C1048r) {
            return ((C1048r) view).dispatchNestedPreFling(f, f2);
        }
        return false;
    }

    /* renamed from: a */
    public static void m5439a(@C0193h0 View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m5432a(@C0193h0 View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m5449a(@C0193h0 View view, C1056z zVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (zVar != null ? zVar.mo5198a() : null));
        }
    }

    /* renamed from: a */
    public static boolean m5466a(@C0193h0 View view, ClipData clipData, DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        if (VERSION.SDK_INT >= 24) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }
        return view.startDrag(clipData, dragShadowBuilder, obj, i);
    }

    /* renamed from: a */
    public static void m5441a(@C0193h0 View view, DragShadowBuilder dragShadowBuilder) {
        if (VERSION.SDK_INT >= 24) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: a */
    public static View m5426a(@C0193h0 View view, View view2, int i) {
        if (VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }
        return null;
    }

    /* renamed from: a */
    public static void m5454a(@C0193h0 View view, @C0193h0 Collection<View> collection, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, i);
        }
    }

    /* renamed from: a */
    public static void m5444a(@C0193h0 View view, @C0193h0 C0974l lVar) {
        if (VERSION.SDK_INT >= 28) {
            Map map = (Map) view.getTag(C0721R.C0724id.tag_unhandled_key_listeners);
            if (map == null) {
                map = new C0635a();
                view.setTag(C0721R.C0724id.tag_unhandled_key_listeners, map);
            }
            C0964b bVar = new C0964b(lVar);
            map.put(lVar, bVar);
            view.addOnUnhandledKeyEventListener(bVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0721R.C0724id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C0721R.C0724id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(lVar);
        if (arrayList.size() == 1) {
            C0977o.m5606b(view);
        }
    }

    @C0222u0
    /* renamed from: a */
    static boolean m5467a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0977o.m5603a(view).mo4813a(view, keyEvent);
    }

    @C0222u0
    /* renamed from: a */
    public static void m5450a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 19) {
            m5494e().mo4810b(view, charSequence);
            if (charSequence != null) {
                f4323W.mo4803a(view);
            } else {
                f4323W.mo4804b(view);
            }
        }
    }

    @C0222u0
    /* renamed from: a */
    public static void m5455a(View view, boolean z) {
        m5427a().mo4810b(view, Boolean.valueOf(z));
    }

    /* renamed from: a */
    private static C0969g<Boolean> m5427a() {
        return new C0967e(C0721R.C0724id.tag_accessibility_heading, Boolean.class, 28);
    }
}
