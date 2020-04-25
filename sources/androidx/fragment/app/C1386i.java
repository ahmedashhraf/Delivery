package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.C0176b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0637b;
import androidx.core.p033k.C0935c;
import androidx.core.p033k.C0936d;
import androidx.core.p034l.C1055y;
import androidx.fragment.app.C1382h.C1383a;
import androidx.fragment.app.C1382h.C1384b;
import androidx.fragment.app.C1382h.C1385c;
import androidx.fragment.app.Fragment.SavedState;
import androidx.lifecycle.C1483v;
import androidx.lifecycle.C1484w;
import androidx.lifecycle.Lifecycle.State;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentManagerImpl */
final class C1386i extends C1382h implements Factory2 {

    /* renamed from: A0 */
    static final Interpolator f5425A0 = new DecelerateInterpolator(1.5f);

    /* renamed from: B0 */
    static final int f5426B0 = 220;

    /* renamed from: C0 */
    public static final int f5427C0 = 1;

    /* renamed from: D0 */
    public static final int f5428D0 = 2;

    /* renamed from: E0 */
    public static final int f5429E0 = 3;

    /* renamed from: F0 */
    public static final int f5430F0 = 4;

    /* renamed from: G0 */
    public static final int f5431G0 = 5;

    /* renamed from: H0 */
    public static final int f5432H0 = 6;

    /* renamed from: t0 */
    static boolean f5433t0 = false;

    /* renamed from: u0 */
    static final String f5434u0 = "FragmentManager";

    /* renamed from: v0 */
    static final String f5435v0 = "android:target_req_state";

    /* renamed from: w0 */
    static final String f5436w0 = "android:target_state";

    /* renamed from: x0 */
    static final String f5437x0 = "android:view_state";

    /* renamed from: y0 */
    static final String f5438y0 = "android:user_visible_hint";

    /* renamed from: z0 */
    static final Interpolator f5439z0 = new DecelerateInterpolator(2.5f);

    /* renamed from: O */
    ArrayList<C1398k> f5440O;

    /* renamed from: P */
    boolean f5441P;

    /* renamed from: Q */
    int f5442Q = 0;

    /* renamed from: R */
    final ArrayList<Fragment> f5443R = new ArrayList<>();

    /* renamed from: S */
    final HashMap<String, Fragment> f5444S = new HashMap<>();

    /* renamed from: T */
    ArrayList<C1373a> f5445T;

    /* renamed from: U */
    ArrayList<Fragment> f5446U;

    /* renamed from: V */
    private OnBackPressedDispatcher f5447V;

    /* renamed from: W */
    private final C0176b f5448W = new C1387a(false);

    /* renamed from: X */
    ArrayList<C1373a> f5449X;

    /* renamed from: Y */
    ArrayList<Integer> f5450Y;

    /* renamed from: Z */
    ArrayList<C1385c> f5451Z;

    /* renamed from: a0 */
    private final CopyOnWriteArrayList<C1396i> f5452a0 = new CopyOnWriteArrayList<>();

    /* renamed from: b0 */
    int f5453b0 = 0;

    /* renamed from: c0 */
    C1381g f5454c0;

    /* renamed from: d0 */
    C1378d f5455d0;

    /* renamed from: e0 */
    Fragment f5456e0;
    @C0195i0

    /* renamed from: f0 */
    Fragment f5457f0;

    /* renamed from: g0 */
    boolean f5458g0;

    /* renamed from: h0 */
    boolean f5459h0;

    /* renamed from: i0 */
    boolean f5460i0;

    /* renamed from: j0 */
    boolean f5461j0;

    /* renamed from: k0 */
    boolean f5462k0;

    /* renamed from: l0 */
    ArrayList<C1373a> f5463l0;

    /* renamed from: m0 */
    ArrayList<Boolean> f5464m0;

    /* renamed from: n0 */
    ArrayList<Fragment> f5465n0;

    /* renamed from: o0 */
    Bundle f5466o0 = null;

    /* renamed from: p0 */
    SparseArray<Parcelable> f5467p0 = null;

    /* renamed from: q0 */
    ArrayList<C1400m> f5468q0;

    /* renamed from: r0 */
    private C1402k f5469r0;

    /* renamed from: s0 */
    Runnable f5470s0 = new C1388b();

    /* renamed from: androidx.fragment.app.i$a */
    /* compiled from: FragmentManagerImpl */
    class C1387a extends C0176b {
        C1387a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo640a() {
            C1386i.this.mo6263B();
        }
    }

    /* renamed from: androidx.fragment.app.i$b */
    /* compiled from: FragmentManagerImpl */
    class C1388b implements Runnable {
        C1388b() {
        }

        public void run() {
            C1386i.this.mo6345x();
        }
    }

    /* renamed from: androidx.fragment.app.i$c */
    /* compiled from: FragmentManagerImpl */
    class C1389c implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5474a;

        /* renamed from: b */
        final /* synthetic */ Fragment f5475b;

        /* renamed from: androidx.fragment.app.i$c$a */
        /* compiled from: FragmentManagerImpl */
        class C1390a implements Runnable {
            C1390a() {
            }

            public void run() {
                if (C1389c.this.f5475b.getAnimatingAway() != null) {
                    C1389c.this.f5475b.setAnimatingAway(null);
                    C1389c cVar = C1389c.this;
                    C1386i iVar = C1386i.this;
                    Fragment fragment = cVar.f5475b;
                    iVar.mo6277a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        C1389c(ViewGroup viewGroup, Fragment fragment) {
            this.f5474a = viewGroup;
            this.f5475b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.f5474a.post(new C1390a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.i$d */
    /* compiled from: FragmentManagerImpl */
    class C1391d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5477a;

        /* renamed from: b */
        final /* synthetic */ View f5478b;

        /* renamed from: c */
        final /* synthetic */ Fragment f5479c;

        C1391d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f5477a = viewGroup;
            this.f5478b = view;
            this.f5479c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5477a.endViewTransition(this.f5478b);
            Animator animator2 = this.f5479c.getAnimator();
            this.f5479c.setAnimator(null);
            if (animator2 != null && this.f5477a.indexOfChild(this.f5478b) < 0) {
                C1386i iVar = C1386i.this;
                Fragment fragment = this.f5479c;
                iVar.mo6277a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$e */
    /* compiled from: FragmentManagerImpl */
    class C1392e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5481a;

        /* renamed from: b */
        final /* synthetic */ View f5482b;

        /* renamed from: c */
        final /* synthetic */ Fragment f5483c;

        C1392e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f5481a = viewGroup;
            this.f5482b = view;
            this.f5483c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5481a.endViewTransition(this.f5482b);
            animator.removeListener(this);
            Fragment fragment = this.f5483c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$f */
    /* compiled from: FragmentManagerImpl */
    class C1393f extends C1380f {
        C1393f() {
        }

        @C0193h0
        /* renamed from: a */
        public Fragment mo6216a(@C0193h0 ClassLoader classLoader, @C0193h0 String str) {
            C1381g gVar = C1386i.this.f5454c0;
            return gVar.mo6174a(gVar.mo6218c(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.i$g */
    /* compiled from: FragmentManagerImpl */
    private static class C1394g {

        /* renamed from: a */
        public final Animation f5486a;

        /* renamed from: b */
        public final Animator f5487b;

        C1394g(Animation animation) {
            this.f5486a = animation;
            this.f5487b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1394g(Animator animator) {
            this.f5486a = null;
            this.f5487b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$h */
    /* compiled from: FragmentManagerImpl */
    private static class C1395h extends AnimationSet implements Runnable {

        /* renamed from: N */
        private boolean f5488N;

        /* renamed from: O */
        private boolean f5489O;

        /* renamed from: P */
        private boolean f5490P = true;

        /* renamed from: a */
        private final ViewGroup f5491a;

        /* renamed from: b */
        private final View f5492b;

        C1395h(@C0193h0 Animation animation, @C0193h0 ViewGroup viewGroup, @C0193h0 View view) {
            super(false);
            this.f5491a = viewGroup;
            this.f5492b = view;
            addAnimation(animation);
            this.f5491a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f5490P = true;
            if (this.f5488N) {
                return !this.f5489O;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f5488N = true;
                C1055y.m6136a(this.f5491a, this);
            }
            return true;
        }

        public void run() {
            if (this.f5488N || !this.f5490P) {
                this.f5491a.endViewTransition(this.f5492b);
                this.f5489O = true;
                return;
            }
            this.f5490P = false;
            this.f5491a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f5490P = true;
            if (this.f5488N) {
                return !this.f5489O;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f5488N = true;
                C1055y.m6136a(this.f5491a, this);
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.i$i */
    /* compiled from: FragmentManagerImpl */
    private static final class C1396i {

        /* renamed from: a */
        final C1384b f5493a;

        /* renamed from: b */
        final boolean f5494b;

        C1396i(C1384b bVar, boolean z) {
            this.f5493a = bVar;
            this.f5494b = z;
        }
    }

    /* renamed from: androidx.fragment.app.i$j */
    /* compiled from: FragmentManagerImpl */
    static class C1397j {

        /* renamed from: a */
        public static final int[] f5495a = {16842755, 16842960, 16842961};

        /* renamed from: b */
        public static final int f5496b = 1;

        /* renamed from: c */
        public static final int f5497c = 0;

        /* renamed from: d */
        public static final int f5498d = 2;

        private C1397j() {
        }
    }

    /* renamed from: androidx.fragment.app.i$k */
    /* compiled from: FragmentManagerImpl */
    interface C1398k {
        /* renamed from: a */
        boolean mo6087a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.i$l */
    /* compiled from: FragmentManagerImpl */
    private class C1399l implements C1398k {

        /* renamed from: a */
        final String f5499a;

        /* renamed from: b */
        final int f5500b;

        /* renamed from: c */
        final int f5501c;

        C1399l(String str, int i, int i2) {
            this.f5499a = str;
            this.f5500b = i;
            this.f5501c = i2;
        }

        /* renamed from: a */
        public boolean mo6087a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C1386i.this.f5457f0;
            if (fragment != null && this.f5500b < 0 && this.f5499a == null && fragment.getChildFragmentManager().mo6246k()) {
                return false;
            }
            return C1386i.this.mo6289a(arrayList, arrayList2, this.f5499a, this.f5500b, this.f5501c);
        }
    }

    /* renamed from: androidx.fragment.app.i$m */
    /* compiled from: FragmentManagerImpl */
    static class C1400m implements C1367e {

        /* renamed from: a */
        final boolean f5503a;

        /* renamed from: b */
        final C1373a f5504b;

        /* renamed from: c */
        private int f5505c;

        C1400m(C1373a aVar, boolean z) {
            this.f5503a = z;
            this.f5504b = aVar;
        }

        /* renamed from: a */
        public void mo6052a() {
            this.f5505c++;
        }

        /* renamed from: b */
        public void mo6053b() {
            this.f5505c--;
            if (this.f5505c == 0) {
                this.f5504b.f5410K.mo6268G();
            }
        }

        /* renamed from: c */
        public void mo6358c() {
            C1373a aVar = this.f5504b;
            aVar.f5410K.mo6284a(aVar, this.f5503a, false, false);
        }

        /* renamed from: d */
        public void mo6359d() {
            boolean z = this.f5505c > 0;
            C1386i iVar = this.f5504b.f5410K;
            int size = iVar.f5443R.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) iVar.f5443R.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C1373a aVar = this.f5504b;
            aVar.f5410K.mo6284a(aVar, this.f5503a, !z, true);
        }

        /* renamed from: e */
        public boolean mo6360e() {
            return this.f5505c == 0;
        }
    }

    C1386i() {
    }

    /* renamed from: I */
    private void m7329I() {
        this.f5444S.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: J */
    private void m7330J() {
        if (mo6243h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: K */
    private void m7331K() {
        this.f5441P = false;
        this.f5464m0.clear();
        this.f5463l0.clear();
    }

    /* renamed from: L */
    private void m7332L() {
        for (Fragment fragment : this.f5444S.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    mo6277a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    /* renamed from: M */
    private void m7333M() {
        if (this.f5468q0 != null) {
            while (!this.f5468q0.isEmpty()) {
                ((C1400m) this.f5468q0.remove(0)).mo6359d();
            }
        }
    }

    /* renamed from: N */
    private void m7334N() {
        ArrayList<C1398k> arrayList = this.f5440O;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            C0176b bVar = this.f5448W;
            if (mo6238c() <= 0 || !mo6318j(this.f5456e0)) {
                z = false;
            }
            bVar.mo642a(z);
            return;
        }
        this.f5448W.mo642a(true);
    }

    /* renamed from: a */
    private void m7340a(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C0936d(f5434u0));
        C1381g gVar = this.f5454c0;
        String str = "  ";
        if (gVar != null) {
            try {
                gVar.mo6166a(str, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            mo6232a(str, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public static int m7344b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: f */
    public static int m7351f(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i == 4099) {
            return C1406n.f5543J;
        }
        if (i != 8194) {
            return 0;
        }
        return C1406n.f5541H;
    }

    /* renamed from: w */
    private Fragment m7353w(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f5443R.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.f5443R.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public Factory2 mo6262A() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo6263B() {
        mo6345x();
        if (this.f5448W.mo644b()) {
            mo6246k();
        } else {
            this.f5447V.mo638b();
        }
    }

    /* renamed from: C */
    public void mo6264C() {
        this.f5459h0 = false;
        this.f5460i0 = false;
        int size = this.f5443R.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public void mo6265D() {
        if (this.f5451Z != null) {
            for (int i = 0; i < this.f5451Z.size(); i++) {
                ((C1385c) this.f5451Z.get(i)).mo6261z();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: E */
    public C1401j mo6266E() {
        if (this.f5454c0 instanceof C1484w) {
            m7340a((RuntimeException) new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f5469r0.mo6371d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public Parcelable mo6267F() {
        String str;
        String str2;
        String str3;
        ArrayList<String> arrayList;
        m7333M();
        m7332L();
        mo6345x();
        this.f5459h0 = true;
        BackStackState[] backStackStateArr = null;
        if (this.f5444S.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.f5444S.size());
        Iterator it = this.f5444S.values().iterator();
        boolean z = false;
        while (true) {
            str = ": ";
            str2 = " was removed from the FragmentManager";
            str3 = "Failure saving state: active ";
            if (!it.hasNext()) {
                break;
            }
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                if (fragment.mFragmentManager != this) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(fragment);
                    sb.append(str2);
                    m7340a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                arrayList2.add(fragmentState);
                if (fragment.mState <= 0 || fragmentState.f5391X != null) {
                    fragmentState.f5391X = fragment.mSavedFragmentState;
                } else {
                    fragmentState.f5391X = mo6334r(fragment);
                    String str4 = fragment.mTargetWho;
                    if (str4 != null) {
                        Fragment fragment2 = (Fragment) this.f5444S.get(str4);
                        if (fragment2 == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failure saving state: ");
                            sb2.append(fragment);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(fragment.mTargetWho);
                            m7340a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (fragmentState.f5391X == null) {
                            fragmentState.f5391X = new Bundle();
                        }
                        mo6226a(fragmentState.f5391X, f5436w0, fragment2);
                        int i = fragment.mTargetRequestCode;
                        if (i != 0) {
                            fragmentState.f5391X.putInt(f5435v0, i);
                        }
                    }
                }
                if (f5433t0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Saved state of ");
                    sb3.append(fragment);
                    sb3.append(str);
                    sb3.append(fragmentState.f5391X);
                    sb3.toString();
                }
                z = true;
            }
        }
        if (!z) {
            boolean z2 = f5433t0;
            return null;
        }
        int size = this.f5443R.size();
        if (size > 0) {
            arrayList = new ArrayList<>(size);
            Iterator it2 = this.f5443R.iterator();
            while (it2.hasNext()) {
                Fragment fragment3 = (Fragment) it2.next();
                arrayList.add(fragment3.mWho);
                if (fragment3.mFragmentManager != this) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str3);
                    sb4.append(fragment3);
                    sb4.append(str2);
                    m7340a((RuntimeException) new IllegalStateException(sb4.toString()));
                }
                if (f5433t0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("saveAllState: adding fragment (");
                    sb5.append(fragment3.mWho);
                    sb5.append("): ");
                    sb5.append(fragment3);
                    sb5.toString();
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<C1373a> arrayList3 = this.f5445T;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            if (size2 > 0) {
                backStackStateArr = new BackStackState[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    backStackStateArr[i2] = new BackStackState((C1373a) this.f5445T.get(i2));
                    if (f5433t0) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("saveAllState: adding back stack #");
                        sb6.append(i2);
                        sb6.append(str);
                        sb6.append(this.f5445T.get(i2));
                        sb6.toString();
                    }
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f5379a = arrayList2;
        fragmentManagerState.f5380b = arrayList;
        fragmentManagerState.f5376N = backStackStateArr;
        Fragment fragment4 = this.f5457f0;
        if (fragment4 != null) {
            fragmentManagerState.f5377O = fragment4.mWho;
        }
        fragmentManagerState.f5378P = this.f5442Q;
        return fragmentManagerState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public void mo6268G() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f5468q0 != null && !this.f5468q0.isEmpty();
            if (this.f5440O != null && this.f5440O.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f5454c0.mo6219d().removeCallbacks(this.f5470s0);
                this.f5454c0.mo6219d().post(this.f5470s0);
                m7334N();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo6269H() {
        for (Fragment fragment : this.f5444S.values()) {
            if (fragment != null) {
                mo6327o(fragment);
            }
        }
    }

    /* renamed from: b */
    public boolean mo6235b() {
        boolean x = mo6345x();
        m7333M();
        return x;
    }

    /* renamed from: c */
    public int mo6238c() {
        ArrayList<C1373a> arrayList = this.f5445T;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo6308d(int i) {
        return this.f5453b0 >= i;
    }

    /* renamed from: e */
    public List<Fragment> mo6240e() {
        List<Fragment> list;
        if (this.f5443R.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f5443R) {
            list = (List) this.f5443R.clone();
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo6311f(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                mo6280a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: g */
    public C1402k mo6313g(@C0193h0 Fragment fragment) {
        return this.f5469r0.mo6369c(fragment);
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: h */
    public C1483v mo6315h(@C0193h0 Fragment fragment) {
        return this.f5469r0.mo6372d(fragment);
    }

    /* renamed from: i */
    public void mo6317i(Fragment fragment) {
        if (f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            sb.toString();
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo6318j(@C0195i0 Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        C1386i iVar = fragment.mFragmentManager;
        if (fragment != iVar.mo6241f() || !mo6318j(iVar.f5456e0)) {
            z = false;
        }
        return z;
    }

    /* renamed from: k */
    public boolean mo6246k() {
        m7330J();
        return m7343a((String) null, -1, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo6320l(Fragment fragment) {
        if (this.f5444S.get(fragment.mWho) != null) {
            if (f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removed fragment from active set ");
                sb.append(fragment);
                sb.toString();
            }
            for (Fragment fragment2 : this.f5444S.values()) {
                if (fragment2 != null && fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
            this.f5444S.put(fragment.mWho, null);
            mo6333q(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = (Fragment) this.f5444S.get(str);
            }
            fragment.initState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo6323m(Fragment fragment) {
        if (fragment != null) {
            if (!this.f5444S.containsKey(fragment.mWho)) {
                if (f5433t0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ignoring moving ");
                    sb.append(fragment);
                    sb.append(" to state ");
                    sb.append(this.f5453b0);
                    sb.append("since it is not added to ");
                    sb.append(this);
                    sb.toString();
                }
                return;
            }
            int i = this.f5453b0;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            mo6277a(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment w = m7353w(fragment);
                if (w != null) {
                    View view = w.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    float f = fragment.mPostponedAlpha;
                    if (f > 0.0f) {
                        fragment.mView.setAlpha(f);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C1394g a = mo6270a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        Animation animation = a.f5486a;
                        if (animation != null) {
                            fragment.mView.startAnimation(animation);
                        } else {
                            a.f5487b.setTarget(fragment.mView);
                            a.f5487b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                mo6305d(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo6325n(Fragment fragment) {
        mo6277a(fragment, this.f5453b0, 0, 0, false);
    }

    /* renamed from: o */
    public void mo6327o(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f5441P) {
                this.f5462k0 = true;
                return;
            }
            fragment.mDeferStart = false;
            mo6277a(fragment, this.f5453b0, 0, 0, false);
        }
    }

    @C0195i0
    public View onCreateView(@C0195i0 View view, @C0193h0 String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        Fragment fragment;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        Fragment fragment2 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C1397j.f5495a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str3 == null || !C1380f.m7260b(context.getClassLoader(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment2 = mo6221a(resourceId);
        }
        if (fragment2 == null && string != null) {
            fragment2 = mo6223a(string);
        }
        if (fragment2 == null && i != -1) {
            fragment2 = mo6221a(i);
        }
        if (f5433t0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str3);
            sb2.append(" existing=");
            sb2.append(fragment2);
            sb2.toString();
        }
        if (fragment2 == null) {
            Fragment a = mo6239d().mo6216a(context.getClassLoader(), str3);
            a.mFromLayout = true;
            a.mFragmentId = resourceId != 0 ? resourceId : i;
            a.mContainerId = i;
            a.mTag = string;
            a.mInLayout = true;
            a.mFragmentManager = this;
            C1381g gVar = this.f5454c0;
            a.mHost = gVar;
            a.onInflate(gVar.mo6218c(), attributeSet2, a.mSavedFragmentState);
            mo6282a(a, true);
            fragment = a;
        } else if (!fragment2.mInLayout) {
            fragment2.mInLayout = true;
            C1381g gVar2 = this.f5454c0;
            fragment2.mHost = gVar2;
            fragment2.onInflate(gVar2.mo6218c(), attributeSet2, fragment2.mSavedFragmentState);
            fragment = fragment2;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(" with another fragment for ");
            sb3.append(str3);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (this.f5453b0 >= 1 || !fragment.mFromLayout) {
            mo6325n(fragment);
        } else {
            mo6277a(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(str3);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }

    /* renamed from: p */
    public void mo6331p(Fragment fragment) {
        if (f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
            sb.toString();
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f5443R) {
                this.f5443R.remove(fragment);
            }
            if (m7354x(fragment)) {
                this.f5458g0 = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo6333q(@C0193h0 Fragment fragment) {
        if (mo6243h()) {
            boolean z = f5433t0;
            return;
        }
        if (this.f5469r0.mo6374e(fragment) && f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            sb.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public Bundle mo6334r(Fragment fragment) {
        Bundle bundle;
        if (this.f5466o0 == null) {
            this.f5466o0 = new Bundle();
        }
        fragment.performSaveInstanceState(this.f5466o0);
        mo6306d(fragment, this.f5466o0, false);
        if (!this.f5466o0.isEmpty()) {
            bundle = this.f5466o0;
            this.f5466o0 = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            mo6337s(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f5437x0, fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f5438y0, fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo6337s(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.f5467p0;
            if (sparseArray == null) {
                this.f5467p0 = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f5467p0);
            if (this.f5467p0.size() > 0) {
                fragment.mSavedViewState = this.f5467p0;
                this.f5467p0 = null;
            }
        }
    }

    /* renamed from: t */
    public void mo6338t() {
        this.f5459h0 = false;
        this.f5460i0 = false;
        m7350e(4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f5456e0;
        if (fragment != null) {
            C0935c.m5324a(fragment, sb);
        } else {
            C0935c.m5324a(this.f5454c0, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo6342u(Fragment fragment) {
        if (f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            sb.toString();
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: v */
    public void mo6343v() {
        this.f5460i0 = true;
        m7350e(2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: x */
    public boolean mo6345x() {
        m7349d(true);
        boolean z = false;
        while (m7347b(this.f5463l0, this.f5464m0)) {
            this.f5441P = true;
            try {
                m7348c(this.f5463l0, this.f5464m0);
                m7331K();
                z = true;
            } catch (Throwable th) {
                m7331K();
                throw th;
            }
        }
        m7334N();
        mo6344w();
        m7329I();
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public int mo6346y() {
        return this.f5444S.size();
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: z */
    public List<Fragment> mo6347z() {
        return new ArrayList(this.f5444S.values());
    }

    /* renamed from: c */
    public void mo6301c(Fragment fragment) {
        if (f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            sb.toString();
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f5443R.contains(fragment)) {
                if (f5433t0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    sb2.toString();
                }
                synchronized (this.f5443R) {
                    this.f5443R.add(fragment);
                }
                fragment.mAdded = true;
                if (m7354x(fragment)) {
                    this.f5458g0 = true;
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment already added: ");
            sb3.append(fragment);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo6305d(Fragment fragment) {
        if (fragment.mView != null) {
            C1394g a = mo6270a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a != null) {
                Animator animator = a.f5487b;
                if (animator != null) {
                    animator.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        a.f5487b.addListener(new C1392e(viewGroup, view, fragment));
                    }
                    a.f5487b.start();
                }
            }
            if (a != null) {
                fragment.mView.startAnimation(a.f5486a);
                a.f5486a.start();
            }
            fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && m7354x(fragment)) {
            this.f5458g0 = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: g */
    public boolean mo6242g() {
        return this.f5461j0;
    }

    /* renamed from: h */
    public boolean mo6243h() {
        return this.f5459h0 || this.f5460i0;
    }

    /* renamed from: n */
    public void mo6324n() {
        this.f5459h0 = false;
        this.f5460i0 = false;
        m7350e(1);
    }

    /* renamed from: v */
    private void m7352v(@C0195i0 Fragment fragment) {
        if (fragment != null && this.f5444S.get(fragment.mWho) == fragment) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: b */
    public boolean mo6237b(@C0195i0 String str, int i) {
        m7330J();
        return m7343a(str, -1, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo6314g(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6314g(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6259f(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo6316h(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6316h(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6260g(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo6319k(Fragment fragment) {
        if (this.f5444S.get(fragment.mWho) == null) {
            this.f5444S.put(fragment.mWho, fragment);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    mo6292b(fragment);
                } else {
                    mo6333q(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(fragment);
                sb.toString();
            }
        }
    }

    /* renamed from: t */
    public void mo6339t(Fragment fragment) {
        if (fragment == null || (this.f5444S.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            Fragment fragment2 = this.f5457f0;
            this.f5457f0 = fragment;
            m7352v(fragment2);
            m7352v(this.f5457f0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public boolean mo6236b(int i, int i2) {
        m7330J();
        mo6345x();
        if (i >= 0) {
            return m7343a((String) null, i, i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: j */
    public void mo6245j() {
        mo6286a((C1398k) new C1399l(null, -1, 0), false);
    }

    /* renamed from: u */
    public void mo6341u() {
        this.f5459h0 = false;
        this.f5460i0 = false;
        m7350e(3);
    }

    /* renamed from: e */
    public void mo6309e(Fragment fragment) {
        if (f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            sb.toString();
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (f5433t0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    sb2.toString();
                }
                synchronized (this.f5443R) {
                    this.f5443R.remove(fragment);
                }
                if (m7354x(fragment)) {
                    this.f5458g0 = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: o */
    public void mo6326o() {
        this.f5461j0 = true;
        mo6345x();
        m7350e(0);
        this.f5454c0 = null;
        this.f5455d0 = null;
        this.f5456e0 = null;
        if (this.f5447V != null) {
            this.f5448W.mo645c();
            this.f5447V = null;
        }
    }

    /* renamed from: q */
    public void mo6332q() {
        for (int i = 0; i < this.f5443R.size(); i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo6344w() {
        if (this.f5462k0) {
            this.f5462k0 = false;
            mo6269H();
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1406n mo6224a() {
        return new C1373a(this);
    }

    /* renamed from: a */
    public void mo6231a(@C0195i0 String str, int i) {
        mo6286a((C1398k) new C1399l(str, -1, i), false);
    }

    /* renamed from: b */
    public C1383a mo6233b(int i) {
        return (C1383a) this.f5445T.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo6336s() {
        m7334N();
        m7352v(this.f5457f0);
    }

    /* renamed from: x */
    private boolean m7354x(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo6321l();
    }

    /* renamed from: a */
    public void mo6225a(int i, int i2) {
        if (i >= 0) {
            mo6286a((C1398k) new C1399l(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo6234b(C1385c cVar) {
        ArrayList<C1385c> arrayList = this.f5451Z;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    @C0195i0
    /* renamed from: f */
    public Fragment mo6241f() {
        return this.f5457f0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo6312f(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6312f(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6258e(this, fragment);
            }
        }
    }

    /* renamed from: a */
    private boolean m7343a(String str, int i, int i2) {
        mo6345x();
        m7349d(true);
        Fragment fragment = this.f5457f0;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo6246k()) {
            return true;
        }
        boolean a = mo6289a(this.f5463l0, this.f5464m0, str, i, i2);
        if (a) {
            this.f5441P = true;
            try {
                m7348c(this.f5463l0, this.f5464m0);
            } finally {
                m7331K();
            }
        }
        m7334N();
        mo6344w();
        m7329I();
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6292b(@C0193h0 Fragment fragment) {
        if (mo6243h()) {
            boolean z = f5433t0;
            return;
        }
        if (this.f5469r0.mo6366a(fragment) && f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            sb.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo6321l() {
        boolean z = false;
        for (Fragment fragment : this.f5444S.values()) {
            if (fragment != null) {
                z = m7354x(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void mo6330p() {
        m7350e(1);
    }

    /* renamed from: c */
    public void mo6300c(int i) {
        synchronized (this) {
            this.f5449X.set(i, null);
            if (this.f5450Y == null) {
                this.f5450Y = new ArrayList<>();
            }
            if (f5433t0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing back stack index ");
                sb.append(i);
                sb.toString();
            }
            this.f5450Y.add(Integer.valueOf(i));
        }
    }

    /* renamed from: r */
    public void mo6335r() {
        m7350e(3);
    }

    /* renamed from: b */
    public Fragment mo6291b(@C0193h0 String str) {
        for (Fragment fragment : this.f5444S.values()) {
            if (fragment != null) {
                Fragment findFragmentByWho = fragment.findFragmentByWho(str);
                if (findFragmentByWho != null) {
                    return findFragmentByWho;
                }
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m7350e(int i) {
        try {
            this.f5441P = true;
            mo6272a(i, false);
            this.f5441P = false;
            mo6345x();
        } catch (Throwable th) {
            this.f5441P = false;
            throw th;
        }
    }

    /* renamed from: b */
    public int mo6290b(C1373a aVar) {
        synchronized (this) {
            if (this.f5450Y != null) {
                if (this.f5450Y.size() > 0) {
                    int intValue = ((Integer) this.f5450Y.remove(this.f5450Y.size() - 1)).intValue();
                    if (f5433t0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding back stack index ");
                        sb.append(intValue);
                        sb.append(" with ");
                        sb.append(aVar);
                        sb.toString();
                    }
                    this.f5449X.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.f5449X == null) {
                this.f5449X = new ArrayList<>();
            }
            int size = this.f5449X.size();
            if (f5433t0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting back stack index ");
                sb2.append(size);
                sb2.append(" to ");
                sb2.append(aVar);
                sb2.toString();
            }
            this.f5449X.add(aVar);
            return size;
        }
    }

    /* renamed from: c */
    private void m7348c(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m7341a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C1373a) arrayList.get(i)).f5568q) {
                    if (i2 != i) {
                        m7346b(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C1373a) arrayList.get(i2)).f5568q) {
                            i2++;
                        }
                    }
                    m7346b(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m7346b(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6310e(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6310e(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6256d(this, fragment);
            }
        }
    }

    /* renamed from: a */
    public void mo6230a(C1385c cVar) {
        if (this.f5451Z == null) {
            this.f5451Z = new ArrayList<>();
        }
        this.f5451Z.add(cVar);
    }

    /* renamed from: d */
    private void m7349d(boolean z) {
        if (this.f5441P) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f5454c0 == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f5454c0.mo6219d().getLooper()) {
            if (!z) {
                m7330J();
            }
            if (this.f5463l0 == null) {
                this.f5463l0 = new ArrayList<>();
                this.f5464m0 = new ArrayList<>();
            }
            this.f5441P = true;
            try {
                m7341a(null, null);
            } finally {
                this.f5441P = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: a */
    public void mo6226a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m7340a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putString(str, fragment.mWho);
    }

    @C0195i0
    /* renamed from: a */
    public Fragment mo6222a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.f5444S.get(string);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            m7340a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    /* renamed from: b */
    public void mo6296b(C1398k kVar, boolean z) {
        if (!z || (this.f5454c0 != null && !this.f5461j0)) {
            m7349d(z);
            if (kVar.mo6087a(this.f5463l0, this.f5464m0)) {
                this.f5441P = true;
                try {
                    m7348c(this.f5463l0, this.f5464m0);
                } finally {
                    m7331K();
                }
            }
            m7334N();
            mo6344w();
            m7329I();
        }
    }

    /* renamed from: m */
    public void mo6322m() {
        this.f5459h0 = false;
        this.f5460i0 = false;
        m7350e(2);
    }

    @C0195i0
    /* renamed from: a */
    public SavedState mo6220a(@C0193h0 Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m7340a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (fragment.mState <= 0) {
            return null;
        }
        Bundle r = mo6334r(fragment);
        if (r != null) {
            return new SavedState(r);
        }
        return null;
    }

    /* renamed from: c */
    public void mo6304c(boolean z) {
        for (int size = this.f5443R.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f5443R.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6302c(@C0193h0 Fragment fragment, @C0195i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6302c(fragment, bundle, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6255c(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo6232a(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.f5444S.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f5444S.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.dump(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.f5443R.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment2 = (Fragment) this.f5443R.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f5446U;
        if (arrayList != null) {
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i2 = 0; i2 < size2; i2++) {
                    Fragment fragment3 = (Fragment) this.f5446U.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        ArrayList<C1373a> arrayList2 = this.f5445T;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C1373a aVar = (C1373a) this.f5445T.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo6084a(sb2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.f5449X != null) {
                int size4 = this.f5449X.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        C1373a aVar2 = (C1373a) this.f5449X.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(aVar2);
                    }
                }
            }
            if (this.f5450Y != null && this.f5450Y.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f5450Y.toArray()));
            }
        }
        ArrayList<C1398k> arrayList3 = this.f5440O;
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            if (size5 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size5; i5++) {
                    C1398k kVar = (C1398k) this.f5440O.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(kVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5454c0);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5455d0);
        if (this.f5456e0 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5456e0);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5453b0);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f5459h0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f5460i0);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f5461j0);
        if (this.f5458g0) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5458g0);
        }
    }

    @C0193h0
    /* renamed from: d */
    public C1380f mo6239d() {
        if (super.mo6239d() == C1382h.f5423b) {
            Fragment fragment = this.f5456e0;
            if (fragment != null) {
                return fragment.mFragmentManager.mo6239d();
            }
            mo6227a((C1380f) new C1393f());
        }
        return super.mo6239d();
    }

    /* renamed from: b */
    private void m7346b(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C1373a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C1373a) arrayList3.get(i4)).f5568q;
        ArrayList<Fragment> arrayList5 = this.f5465n0;
        if (arrayList5 == null) {
            this.f5465n0 = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f5465n0.addAll(this.f5443R);
        Fragment f = mo6241f();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C1373a aVar = (C1373a) arrayList3.get(i6);
            if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                f = aVar.mo6079a(this.f5465n0, f);
            } else {
                f = aVar.mo6089b(this.f5465n0, f);
            }
            z2 = z2 || aVar.f5559h;
        }
        this.f5465n0.clear();
        if (!z) {
            C1408o.m7560a(this, arrayList, arrayList2, i, i2, false);
        }
        m7342a(arrayList, arrayList2, i, i2);
        if (z) {
            C0637b bVar = new C0637b();
            m7338a(bVar);
            int a = m7335a(arrayList, arrayList2, i, i2, bVar);
            m7345b(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C1408o.m7560a(this, arrayList, arrayList2, i, i3, true);
            mo6272a(this.f5453b0, true);
        }
        while (i4 < i5) {
            C1373a aVar2 = (C1373a) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue()) {
                int i7 = aVar2.f5412M;
                if (i7 >= 0) {
                    mo6300c(i7);
                    aVar2.f5412M = -1;
                }
            }
            aVar2.mo6110n();
            i4++;
        }
        if (z2) {
            mo6265D();
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6303c(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6303c(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6251b(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo6307d(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6307d(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6254c(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo6306d(@C0193h0 Fragment fragment, @C0193h0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6306d(fragment, bundle, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6257d(this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    private void m7345b(C0637b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo3233d(i);
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7347b(java.util.ArrayList<androidx.fragment.app.C1373a> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.i$k> r0 = r4.f5440O     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<androidx.fragment.app.i$k> r0 = r4.f5440O     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<androidx.fragment.app.i$k> r0 = r4.f5440O     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<androidx.fragment.app.i$k> r3 = r4.f5440O     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            androidx.fragment.app.i$k r3 = (androidx.fragment.app.C1386i.C1398k) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo6087a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<androidx.fragment.app.i$k> r5 = r4.f5440O     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            androidx.fragment.app.g r5 = r4.f5454c0     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo6219d()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f5470s0     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003f:
            throw r5
        L_0x0040:
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1386i.m7347b(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: b */
    public void mo6297b(boolean z) {
        for (int size = this.f5443R.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f5443R.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo6298b(@C0193h0 Menu menu) {
        if (this.f5453b0 < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f5443R.size(); i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo6299b(@C0193h0 MenuItem menuItem) {
        if (this.f5453b0 < 1) {
            return false;
        }
        for (int i = 0; i < this.f5443R.size(); i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6293b(@C0193h0 Fragment fragment, @C0193h0 Context context, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6293b(fragment, context, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6252b((C1382h) this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    static C1394g m7337a(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f5439z0);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f5425A0);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C1394g((Animation) animationSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6294b(@C0193h0 Fragment fragment, @C0195i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6294b(fragment, bundle, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6253b((C1382h) this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    static C1394g m7336a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f5425A0);
        alphaAnimation.setDuration(220);
        return new C1394g((Animation) alphaAnimation);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6295b(@C0193h0 Fragment fragment, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6295b(fragment, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6247a(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1394g mo6270a(Fragment fragment, int i, boolean z, int i2) {
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C1394g(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C1394g(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.f5454c0.mo6218c().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f5454c0.mo6218c(), nextAnim);
                    if (loadAnimation != null) {
                        return new C1394g(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f5454c0.mo6218c(), nextAnim);
                    if (loadAnimator != null) {
                        return new C1394g(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f5454c0.mo6218c(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new C1394g(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b = m7344b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m7337a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m7337a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m7337a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m7337a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m7336a(0.0f, 1.0f);
            case 6:
                return m7336a(1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f5454c0.mo6172h()) {
                    i2 = this.f5454c0.mo6171g();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r8v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0082, code lost:
        if (r0 != 3) goto L_0x04a6;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v4
      assigns: []
      uses: []
      mth insns count: 477
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
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04ab  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6277a(androidx.fragment.app.Fragment r18, int r19, int r20, int r21, boolean r22) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r19
            goto L_0x0016
        L_0x0011:
            r0 = r19
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r18.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0037
            if (r0 <= r10) goto L_0x0037
            r0 = 2
        L_0x0037:
            androidx.lifecycle.Lifecycle$State r1 = r7.mMaxState
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.mState
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x0307
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x005a
            return
        L_0x005a:
            android.view.View r0 = r18.getAnimatingAway()
            if (r0 != 0) goto L_0x0066
            android.animation.Animator r0 = r18.getAnimator()
            if (r0 == 0) goto L_0x007a
        L_0x0066:
            r7.setAnimatingAway(r13)
            r7.setAnimator(r13)
            int r2 = r18.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r17
            r1 = r18
            r0.mo6277a(r1, r2, r3, r4, r5)
        L_0x007a:
            int r0 = r7.mState
            if (r0 == 0) goto L_0x0089
            if (r0 == r8) goto L_0x01d7
            if (r0 == r10) goto L_0x02c7
            if (r0 == r9) goto L_0x0086
            goto L_0x04a6
        L_0x0086:
            r0 = 3
            goto L_0x02e5
        L_0x0089:
            if (r11 <= 0) goto L_0x01d7
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x009f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x009f:
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00f8
            androidx.fragment.app.g r1 = r6.f5454c0
            android.content.Context r1 = r1.mo6218c()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.mo6222a(r0, r1)
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = r0.mWho
            goto L_0x00c8
        L_0x00c7:
            r0 = r13
        L_0x00c8:
            r7.mTargetWho = r0
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x00d8
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r12)
            r7.mTargetRequestCode = r0
        L_0x00d8:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r13
            goto L_0x00ef
        L_0x00e5:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00ef:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00f8
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00f8
            r11 = 2
        L_0x00f8:
            androidx.fragment.app.g r0 = r6.f5454c0
            r7.mHost = r0
            androidx.fragment.app.Fragment r1 = r6.f5456e0
            r7.mParentFragment = r1
            if (r1 == 0) goto L_0x0105
            androidx.fragment.app.i r0 = r1.mChildFragmentManager
            goto L_0x0107
        L_0x0105:
            androidx.fragment.app.i r0 = r0.f5419P
        L_0x0107:
            r7.mFragmentManager = r0
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r14 = " that does not belong to this FragmentManager!"
            java.lang.String r15 = " declared target fragment "
            java.lang.String r5 = "Fragment "
            if (r0 == 0) goto L_0x015c
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f5444S
            java.lang.String r0 = r0.mWho
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x013b
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x0131
            r2 = 1
            r3 = 0
            r4 = 0
            r16 = 1
            r0 = r17
            r9 = r5
            r5 = r16
            r0.mo6277a(r1, r2, r3, r4, r5)
            goto L_0x0132
        L_0x0131:
            r9 = r5
        L_0x0132:
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r0 = r0.mWho
            r7.mTargetWho = r0
            r7.mTarget = r13
            goto L_0x015d
        L_0x013b:
            r9 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r15)
            androidx.fragment.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x015c:
            r9 = r5
        L_0x015d:
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x019a
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f5444S
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x017a
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x019a
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r17
            r0.mo6277a(r1, r2, r3, r4, r5)
            goto L_0x019a
        L_0x017a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            r1.append(r15)
            java.lang.String r2 = r7.mTargetWho
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x019a:
            androidx.fragment.app.g r0 = r6.f5454c0
            android.content.Context r0 = r0.mo6218c()
            r6.mo6293b(r7, r0, r12)
            r18.performAttach()
            androidx.fragment.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x01b0
            androidx.fragment.app.g r0 = r6.f5454c0
            r0.mo6161a(r7)
            goto L_0x01b3
        L_0x01b0:
            r0.onAttachFragment(r7)
        L_0x01b3:
            androidx.fragment.app.g r0 = r6.f5454c0
            android.content.Context r0 = r0.mo6218c()
            r6.mo6278a(r7, r0, r12)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x01d0
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo6302c(r7, r0, r12)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo6294b(r7, r0, r12)
            goto L_0x01d7
        L_0x01d0:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x01d7:
            if (r11 <= 0) goto L_0x01dc
            r17.mo6311f(r18)
        L_0x01dc:
            if (r11 <= r8) goto L_0x02c7
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x01f2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x01f2:
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x02b2
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x0268
            r1 = -1
            if (r0 != r1) goto L_0x021b
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.m7340a(r0)
        L_0x021b:
            androidx.fragment.app.d r0 = r6.f5455d0
            int r1 = r7.mContainerId
            android.view.View r0 = r0.mo6050a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0269
            boolean r1 = r7.mRestored
            if (r1 != 0) goto L_0x0269
            android.content.res.Resources r1 = r18.getResources()     // Catch:{ NotFoundException -> 0x0236 }
            int r2 = r7.mContainerId     // Catch:{ NotFoundException -> 0x0236 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0236 }
            goto L_0x0238
        L_0x0236:
            java.lang.String r1 = "unknown"
        L_0x0238:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No view found for id 0x"
            r3.append(r4)
            int r4 = r7.mContainerId
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r6.m7340a(r2)
            goto L_0x0269
        L_0x0268:
            r0 = r13
        L_0x0269:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r7.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r7.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x02b0
            r7.mInnerView = r1
            r1.setSaveFromParentEnabled(r12)
            if (r0 == 0) goto L_0x0286
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x0286:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x0291
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x0291:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r7.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r6.mo6280a(r7, r0, r1, r12)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x02ac
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x02ac
            goto L_0x02ad
        L_0x02ac:
            r8 = 0
        L_0x02ad:
            r7.mIsNewlyAdded = r8
            goto L_0x02b2
        L_0x02b0:
            r7.mInnerView = r13
        L_0x02b2:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.mo6279a(r7, r0, r12)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x02c5
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreViewState(r0)
        L_0x02c5:
            r7.mSavedFragmentState = r13
        L_0x02c7:
            if (r11 <= r10) goto L_0x0086
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x02dd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x02dd:
            r18.performStart()
            r6.mo6312f(r7, r12)
            goto L_0x0086
        L_0x02e5:
            if (r11 <= r0) goto L_0x04a6
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x02fb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESUMED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x02fb:
            r18.performResume()
            r6.mo6310e(r7, r12)
            r7.mSavedFragmentState = r13
            r7.mSavedViewState = r13
            goto L_0x04a6
        L_0x0307:
            if (r0 <= r11) goto L_0x04a6
            if (r0 == r8) goto L_0x03d9
            if (r0 == r10) goto L_0x034e
            r1 = 3
            if (r0 == r1) goto L_0x0331
            r1 = 4
            if (r0 == r1) goto L_0x0315
            goto L_0x04a6
        L_0x0315:
            if (r11 >= r1) goto L_0x0331
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x032b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x032b:
            r18.performPause()
            r6.mo6307d(r7, r12)
        L_0x0331:
            r0 = 3
            if (r11 >= r0) goto L_0x034e
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x0348
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x0348:
            r18.performStop()
            r6.mo6314g(r7, r12)
        L_0x034e:
            if (r11 >= r10) goto L_0x03d9
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x0364
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom ACTIVITY_CREATED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x0364:
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x0377
            androidx.fragment.app.g r0 = r6.f5454c0
            boolean r0 = r0.mo6168b(r7)
            if (r0 == 0) goto L_0x0377
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x0377
            r17.mo6337s(r18)
        L_0x0377:
            r18.performDestroyView()
            r6.mo6316h(r7, r12)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x03ca
            android.view.ViewGroup r1 = r7.mContainer
            if (r1 == 0) goto L_0x03ca
            r1.endViewTransition(r0)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r18.getParentFragment()
            if (r0 == 0) goto L_0x039b
            androidx.fragment.app.Fragment r0 = r18.getParentFragment()
            boolean r0 = r0.mRemoving
            if (r0 != 0) goto L_0x03ca
        L_0x039b:
            int r0 = r6.f5453b0
            r1 = 0
            if (r0 <= 0) goto L_0x03bb
            boolean r0 = r6.f5461j0
            if (r0 != 0) goto L_0x03bb
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03bb
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03bb
            r0 = r20
            r2 = r21
            androidx.fragment.app.i$g r0 = r6.mo6270a(r7, r0, r12, r2)
            goto L_0x03bc
        L_0x03bb:
            r0 = r13
        L_0x03bc:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x03c3
            r6.m7339a(r7, r0, r11)
        L_0x03c3:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x03ca:
            r7.mContainer = r13
            r7.mView = r13
            r7.mViewLifecycleOwner = r13
            androidx.lifecycle.n<androidx.lifecycle.i> r0 = r7.mViewLifecycleOwnerLiveData
            r0.mo6483b(r13)
            r7.mInnerView = r13
            r7.mInLayout = r12
        L_0x03d9:
            if (r11 >= r8) goto L_0x04a6
            boolean r0 = r6.f5461j0
            if (r0 == 0) goto L_0x0400
            android.view.View r0 = r18.getAnimatingAway()
            if (r0 == 0) goto L_0x03f0
            android.view.View r0 = r18.getAnimatingAway()
            r7.setAnimatingAway(r13)
            r0.clearAnimation()
            goto L_0x0400
        L_0x03f0:
            android.animation.Animator r0 = r18.getAnimator()
            if (r0 == 0) goto L_0x0400
            android.animation.Animator r0 = r18.getAnimator()
            r7.setAnimator(r13)
            r0.cancel()
        L_0x0400:
            android.view.View r0 = r18.getAnimatingAway()
            if (r0 != 0) goto L_0x04a2
            android.animation.Animator r0 = r18.getAnimator()
            if (r0 == 0) goto L_0x040e
            goto L_0x04a2
        L_0x040e:
            boolean r0 = f5433t0
            if (r0 == 0) goto L_0x0422
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            r0.append(r1)
            r0.append(r7)
            r0.toString()
        L_0x0422:
            boolean r0 = r7.mRemoving
            if (r0 == 0) goto L_0x042e
            boolean r0 = r18.isInBackStack()
            if (r0 != 0) goto L_0x042e
            r0 = 1
            goto L_0x042f
        L_0x042e:
            r0 = 0
        L_0x042f:
            if (r0 != 0) goto L_0x043d
            androidx.fragment.app.k r1 = r6.f5469r0
            boolean r1 = r1.mo6376f(r7)
            if (r1 == 0) goto L_0x043a
            goto L_0x043d
        L_0x043a:
            r7.mState = r12
            goto L_0x046e
        L_0x043d:
            androidx.fragment.app.g r1 = r6.f5454c0
            boolean r2 = r1 instanceof androidx.lifecycle.C1484w
            if (r2 == 0) goto L_0x044a
            androidx.fragment.app.k r1 = r6.f5469r0
            boolean r8 = r1.mo6373e()
            goto L_0x045f
        L_0x044a:
            android.content.Context r1 = r1.mo6218c()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x045f
            androidx.fragment.app.g r1 = r6.f5454c0
            android.content.Context r1 = r1.mo6218c()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x045f:
            if (r0 != 0) goto L_0x0463
            if (r8 == 0) goto L_0x0468
        L_0x0463:
            androidx.fragment.app.k r1 = r6.f5469r0
            r1.mo6368b(r7)
        L_0x0468:
            r18.performDestroy()
            r6.mo6295b(r7, r12)
        L_0x046e:
            r18.performDetach()
            r6.mo6303c(r7, r12)
            if (r22 != 0) goto L_0x04a6
            if (r0 != 0) goto L_0x049e
            androidx.fragment.app.k r0 = r6.f5469r0
            boolean r0 = r0.mo6376f(r7)
            if (r0 == 0) goto L_0x0481
            goto L_0x049e
        L_0x0481:
            r7.mHost = r13
            r7.mParentFragment = r13
            r7.mFragmentManager = r13
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x04a6
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.f5444S
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x04a6
            boolean r1 = r0.getRetainInstance()
            if (r1 == 0) goto L_0x04a6
            r7.mTarget = r0
            goto L_0x04a6
        L_0x049e:
            r17.mo6320l(r18)
            goto L_0x04a6
        L_0x04a2:
            r7.setStateAfterAnimating(r11)
            goto L_0x04a7
        L_0x04a6:
            r8 = r11
        L_0x04a7:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x04cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.mState
            r0.append(r1)
            r0.toString()
            r7.mState = r8
        L_0x04cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1386i.mo6277a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m7339a(@C0193h0 Fragment fragment, @C0193h0 C1394g gVar, int i) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        Animation animation = gVar.f5486a;
        if (animation != null) {
            C1395h hVar = new C1395h(animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            hVar.setAnimationListener(new C1389c(viewGroup, fragment));
            fragment.mView.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f5487b;
        fragment.setAnimator(animator);
        animator.addListener(new C1391d(viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6272a(int i, boolean z) {
        if (this.f5454c0 == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f5453b0) {
            this.f5453b0 = i;
            int size = this.f5443R.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo6323m((Fragment) this.f5443R.get(i2));
            }
            for (Fragment fragment : this.f5444S.values()) {
                if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                    mo6323m(fragment);
                }
            }
            mo6269H();
            if (this.f5458g0) {
                C1381g gVar = this.f5454c0;
                if (gVar != null && this.f5453b0 == 4) {
                    gVar.mo6173i();
                    this.f5458g0 = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6282a(Fragment fragment, boolean z) {
        if (f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            sb.toString();
        }
        mo6319k(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f5443R.contains(fragment)) {
            synchronized (this.f5443R) {
                this.f5443R.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m7354x(fragment)) {
                this.f5458g0 = true;
            }
            if (z) {
                mo6325n(fragment);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment already added: ");
        sb2.append(fragment);
        throw new IllegalStateException(sb2.toString());
    }

    @C0195i0
    /* renamed from: a */
    public Fragment mo6221a(int i) {
        for (int size = this.f5443R.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f5443R.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f5444S.values()) {
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: a */
    public Fragment mo6223a(@C0195i0 String str) {
        if (str != null) {
            for (int size = this.f5443R.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f5443R.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.f5444S.values()) {
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo6286a(C1398k kVar, boolean z) {
        if (!z) {
            m7330J();
        }
        synchronized (this) {
            if (!this.f5461j0) {
                if (this.f5454c0 != null) {
                    if (this.f5440O == null) {
                        this.f5440O = new ArrayList<>();
                    }
                    this.f5440O.add(kVar);
                    mo6268G();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo6271a(int i, C1373a aVar) {
        synchronized (this) {
            if (this.f5449X == null) {
                this.f5449X = new ArrayList<>();
            }
            int size = this.f5449X.size();
            if (i < size) {
                if (f5433t0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting back stack index ");
                    sb.append(i);
                    sb.append(" to ");
                    sb.append(aVar);
                    sb.toString();
                }
                this.f5449X.set(i, aVar);
            } else {
                while (size < i) {
                    this.f5449X.add(null);
                    if (this.f5450Y == null) {
                        this.f5450Y = new ArrayList<>();
                    }
                    if (f5433t0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding available back stack index ");
                        sb2.append(size);
                        sb2.toString();
                    }
                    this.f5450Y.add(Integer.valueOf(size));
                    size++;
                }
                if (f5433t0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding back stack index ");
                    sb3.append(i);
                    sb3.append(" with ");
                    sb3.append(aVar);
                    sb3.toString();
                }
                this.f5449X.add(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m7341a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<C1400m> arrayList3 = this.f5468q0;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C1400m mVar = (C1400m) this.f5468q0.get(i);
            if (arrayList != null && !mVar.f5503a) {
                int indexOf = arrayList.indexOf(mVar.f5504b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    this.f5468q0.remove(i);
                    i--;
                    size--;
                    mVar.mo6358c();
                    i++;
                }
            }
            if (mVar.mo6360e() || (arrayList != null && mVar.f5504b.mo6086a(arrayList, 0, arrayList.size()))) {
                this.f5468q0.remove(i);
                i--;
                size--;
                if (arrayList != null && !mVar.f5503a) {
                    int indexOf2 = arrayList.indexOf(mVar.f5504b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        mVar.mo6358c();
                    }
                }
                mVar.mo6359d();
            }
            i++;
        }
    }

    /* renamed from: a */
    private int m7335a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0637b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C1373a aVar = (C1373a) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (aVar.mo6109m() && !aVar.mo6086a(arrayList, i4 + 1, i2)) {
                if (this.f5468q0 == null) {
                    this.f5468q0 = new ArrayList<>();
                }
                C1400m mVar = new C1400m(aVar, booleanValue);
                this.f5468q0.add(mVar);
                aVar.mo6083a(mVar);
                if (booleanValue) {
                    aVar.mo6108l();
                } else {
                    aVar.mo6096d(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m7338a(bVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6284a(C1373a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo6096d(z3);
        } else {
            aVar.mo6108l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C1408o.m7560a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo6272a(this.f5453b0, true);
        }
        for (Fragment fragment : this.f5444S.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.mo6102f(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                if (z3) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m7342a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C1373a aVar = (C1373a) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                aVar.mo6099e(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo6096d(z);
            } else {
                aVar.mo6099e(1);
                aVar.mo6108l();
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m7338a(C0637b<Fragment> bVar) {
        int i = this.f5453b0;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f5443R.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.f5443R.get(i2);
                if (fragment.mState < min) {
                    mo6277a(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6283a(C1373a aVar) {
        if (this.f5445T == null) {
            this.f5445T = new ArrayList<>();
        }
        this.f5445T.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6289a(ArrayList<C1373a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C1373a> arrayList3 = this.f5445T;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f5445T.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                i3 = this.f5445T.size() - 1;
                while (i3 >= 0) {
                    C1373a aVar = (C1373a) this.f5445T.get(i3);
                    if ((str != null && str.equals(aVar.getName())) || (i >= 0 && i == aVar.f5412M)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C1373a aVar2 = (C1373a) this.f5445T.get(i3);
                        if ((str == null || !str.equals(aVar2.getName())) && (i < 0 || i != aVar2.f5412M)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f5445T.size() - 1) {
                return false;
            }
            for (int size2 = this.f5445T.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f5445T.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6275a(Parcelable parcelable, C1401j jVar) {
        if (this.f5454c0 instanceof C1484w) {
            m7340a((RuntimeException) new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f5469r0.mo6365a(jVar);
        mo6274a(parcelable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6274a(Parcelable parcelable) {
        FragmentState fragmentState;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f5379a != null) {
                for (Fragment fragment : this.f5469r0.mo6370c()) {
                    if (f5433t0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragment);
                        sb.toString();
                    }
                    Iterator it = fragmentManagerState.f5379a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fragmentState = null;
                            break;
                        }
                        fragmentState = (FragmentState) it.next();
                        if (fragmentState.f5394b.equals(fragment.mWho)) {
                            break;
                        }
                    }
                    if (fragmentState == null) {
                        if (f5433t0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Discarding retained Fragment ");
                            sb2.append(fragment);
                            sb2.append(" that was not found in the set of active Fragments ");
                            sb2.append(fragmentManagerState.f5379a);
                            sb2.toString();
                        }
                        Fragment fragment2 = fragment;
                        mo6277a(fragment2, 1, 0, 0, false);
                        fragment.mRemoving = true;
                        mo6277a(fragment2, 0, 0, 0, false);
                    } else {
                        fragmentState.f5392Y = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        Fragment fragment3 = fragment.mTarget;
                        fragment.mTargetWho = fragment3 != null ? fragment3.mWho : null;
                        fragment.mTarget = null;
                        Bundle bundle = fragmentState.f5391X;
                        if (bundle != null) {
                            bundle.setClassLoader(this.f5454c0.mo6218c().getClassLoader());
                            fragment.mSavedViewState = fragmentState.f5391X.getSparseParcelableArray(f5437x0);
                            fragment.mSavedFragmentState = fragmentState.f5391X;
                        }
                    }
                }
                this.f5444S.clear();
                Iterator it2 = fragmentManagerState.f5379a.iterator();
                while (it2.hasNext()) {
                    FragmentState fragmentState2 = (FragmentState) it2.next();
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.mo6058a(this.f5454c0.mo6218c().getClassLoader(), mo6239d());
                        a.mFragmentManager = this;
                        if (f5433t0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreSaveState: active (");
                            sb3.append(a.mWho);
                            sb3.append("): ");
                            sb3.append(a);
                            sb3.toString();
                        }
                        this.f5444S.put(a.mWho, a);
                        fragmentState2.f5392Y = null;
                    }
                }
                this.f5443R.clear();
                ArrayList<String> arrayList = fragmentManagerState.f5380b;
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str = (String) it3.next();
                        Fragment fragment4 = (Fragment) this.f5444S.get(str);
                        if (fragment4 == null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("No instantiated fragment for (");
                            sb4.append(str);
                            sb4.append(")");
                            m7340a((RuntimeException) new IllegalStateException(sb4.toString()));
                        }
                        fragment4.mAdded = true;
                        if (f5433t0) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("restoreSaveState: added (");
                            sb5.append(str);
                            sb5.append("): ");
                            sb5.append(fragment4);
                            sb5.toString();
                        }
                        if (!this.f5443R.contains(fragment4)) {
                            synchronized (this.f5443R) {
                                this.f5443R.add(fragment4);
                            }
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Already added ");
                            sb6.append(fragment4);
                            throw new IllegalStateException(sb6.toString());
                        }
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.f5376N;
                if (backStackStateArr != null) {
                    this.f5445T = new ArrayList<>(backStackStateArr.length);
                    int i = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.f5376N;
                        if (i >= backStackStateArr2.length) {
                            break;
                        }
                        C1373a a2 = backStackStateArr2[i].mo5874a(this);
                        if (f5433t0) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("restoreAllState: back stack #");
                            sb7.append(i);
                            sb7.append(" (index ");
                            sb7.append(a2.f5412M);
                            sb7.append("): ");
                            sb7.append(a2);
                            sb7.toString();
                            PrintWriter printWriter = new PrintWriter(new C0936d(f5434u0));
                            a2.mo6085a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f5445T.add(a2);
                        int i2 = a2.f5412M;
                        if (i2 >= 0) {
                            mo6271a(i2, a2);
                        }
                        i++;
                    }
                } else {
                    this.f5445T = null;
                }
                String str2 = fragmentManagerState.f5377O;
                if (str2 != null) {
                    this.f5457f0 = (Fragment) this.f5444S.get(str2);
                    m7352v(this.f5457f0);
                }
                this.f5442Q = fragmentManagerState.f5378P;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [androidx.lifecycle.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6285a(@androidx.annotation.C0193h0 androidx.fragment.app.C1381g r3, @androidx.annotation.C0193h0 androidx.fragment.app.C1378d r4, @androidx.annotation.C0195i0 androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.g r0 = r2.f5454c0
            if (r0 != 0) goto L_0x004d
            r2.f5454c0 = r3
            r2.f5455d0 = r4
            r2.f5456e0 = r5
            androidx.fragment.app.Fragment r4 = r2.f5456e0
            if (r4 == 0) goto L_0x0011
            r2.m7334N()
        L_0x0011:
            boolean r4 = r3 instanceof androidx.activity.C0177c
            if (r4 == 0) goto L_0x0028
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0177c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f5447V = r0
            if (r5 == 0) goto L_0x0021
            r4 = r5
        L_0x0021:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f5447V
            androidx.activity.b r1 = r2.f5448W
            r0.mo635a(r4, r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            androidx.fragment.app.i r3 = r5.mFragmentManager
            androidx.fragment.app.k r3 = r3.mo6313g(r5)
            r2.f5469r0 = r3
            goto L_0x004c
        L_0x0033:
            boolean r4 = r3 instanceof androidx.lifecycle.C1484w
            if (r4 == 0) goto L_0x0044
            androidx.lifecycle.w r3 = (androidx.lifecycle.C1484w) r3
            androidx.lifecycle.v r3 = r3.getViewModelStore()
            androidx.fragment.app.k r3 = androidx.fragment.app.C1402k.m7476a(r3)
            r2.f5469r0 = r3
            goto L_0x004c
        L_0x0044:
            androidx.fragment.app.k r3 = new androidx.fragment.app.k
            r4 = 0
            r3.<init>(r4)
            r2.f5469r0 = r3
        L_0x004c:
            return
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1386i.mo6285a(androidx.fragment.app.g, androidx.fragment.app.d, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    public void mo6273a(@C0193h0 Configuration configuration) {
        for (int i = 0; i < this.f5443R.size(); i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: a */
    public boolean mo6287a(@C0193h0 Menu menu, @C0193h0 MenuInflater menuInflater) {
        if (this.f5453b0 < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f5443R.size(); i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f5446U != null) {
            for (int i2 = 0; i2 < this.f5446U.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f5446U.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f5446U = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo6288a(@C0193h0 MenuItem menuItem) {
        if (this.f5453b0 < 1) {
            return false;
        }
        for (int i = 0; i < this.f5443R.size(); i++) {
            Fragment fragment = (Fragment) this.f5443R.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo6276a(@C0193h0 Menu menu) {
        if (this.f5453b0 >= 1) {
            for (int i = 0; i < this.f5443R.size(); i++) {
                Fragment fragment = (Fragment) this.f5443R.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6281a(Fragment fragment, State state) {
        if (this.f5444S.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = state;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo6229a(@C0193h0 C1384b bVar, boolean z) {
        this.f5452a0.add(new C1396i(bVar, z));
    }

    /* renamed from: a */
    public void mo6228a(@C0193h0 C1384b bVar) {
        synchronized (this.f5452a0) {
            int i = 0;
            int size = this.f5452a0.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C1396i) this.f5452a0.get(i)).f5493a == bVar) {
                    this.f5452a0.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6278a(@C0193h0 Fragment fragment, @C0193h0 Context context, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6278a(fragment, context, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6248a((C1382h) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6279a(@C0193h0 Fragment fragment, @C0195i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6279a(fragment, bundle, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6249a((C1382h) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6280a(@C0193h0 Fragment fragment, @C0193h0 View view, @C0195i0 Bundle bundle, boolean z) {
        Fragment fragment2 = this.f5456e0;
        if (fragment2 != null) {
            C1382h fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof C1386i) {
                ((C1386i) fragmentManager).mo6280a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f5452a0.iterator();
        while (it.hasNext()) {
            C1396i iVar = (C1396i) it.next();
            if (!z || iVar.f5494b) {
                iVar.f5493a.mo6250a(this, fragment, view, bundle);
            }
        }
    }
}
