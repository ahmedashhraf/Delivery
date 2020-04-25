package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.C0183c0;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0206n;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0214q0;
import androidx.core.app.C0815z;
import androidx.core.p033k.C0935c;
import androidx.core.p034l.C0994j;
import androidx.lifecycle.C1457g;
import androidx.lifecycle.C1458h;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1460j;
import androidx.lifecycle.C1467n;
import androidx.lifecycle.C1483v;
import androidx.lifecycle.C1484w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LiveData;
import androidx.loader.p046a.C1492a;
import androidx.savedstate.C1788b;
import androidx.savedstate.C1789c;
import androidx.savedstate.SavedStateRegistry;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, C1459i, C1484w, C1789c {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    boolean mAdded;
    C1366d mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    @C0193h0
    C1386i mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    @C0183c0
    private int mContentLayoutId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    C1386i mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C1381g mHost;
    boolean mInLayout;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1460j mLifecycleRegistry;
    State mMaxState;
    boolean mMenuVisible;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1788b mSavedStateRegistryController;
    @C0195i0
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    @C0195i0
    C1423r mViewLifecycleOwner;
    C1467n<C1459i> mViewLifecycleOwnerLiveData;
    @C0193h0
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@C0193h0 String str, @C0195i0 Exception exc) {
            super(str, exc);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        @C0193h0
        public static final Creator<SavedState> CREATOR = new C1362a();
        final Bundle mState;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        static class C1362a implements ClassLoaderCreator<SavedState> {
            C1362a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        SavedState(Bundle bundle) {
            this.mState = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            parcel.writeBundle(this.mState);
        }

        SavedState(@C0193h0 Parcel parcel, @C0195i0 ClassLoader classLoader) {
            this.mState = parcel.readBundle();
            if (classLoader != null) {
                Bundle bundle = this.mState;
                if (bundle != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C1363a implements Runnable {
        C1363a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C1364b implements Runnable {
        C1364b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C1365c extends C1378d {
        C1365c() {
        }

        @C0195i0
        /* renamed from: a */
        public View mo6050a(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" does not have a view");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public boolean mo6051a() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    static class C1366d {

        /* renamed from: a */
        View f5357a;

        /* renamed from: b */
        Animator f5358b;

        /* renamed from: c */
        int f5359c;

        /* renamed from: d */
        int f5360d;

        /* renamed from: e */
        int f5361e;

        /* renamed from: f */
        int f5362f;

        /* renamed from: g */
        Object f5363g = null;

        /* renamed from: h */
        Object f5364h;

        /* renamed from: i */
        Object f5365i;

        /* renamed from: j */
        Object f5366j;

        /* renamed from: k */
        Object f5367k;

        /* renamed from: l */
        Object f5368l;

        /* renamed from: m */
        Boolean f5369m;

        /* renamed from: n */
        Boolean f5370n;

        /* renamed from: o */
        C0815z f5371o;

        /* renamed from: p */
        C0815z f5372p;

        /* renamed from: q */
        boolean f5373q;

        /* renamed from: r */
        C1367e f5374r;

        /* renamed from: s */
        boolean f5375s;

        C1366d() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f5364h = obj;
            this.f5365i = null;
            this.f5366j = obj;
            this.f5367k = null;
            this.f5368l = obj;
            this.f5371o = null;
            this.f5372p = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    interface C1367e {
        /* renamed from: a */
        void mo6052a();

        /* renamed from: b */
        void mo6053b();
    }

    public Fragment() {
        this.mState = 0;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C1386i();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C1363a();
        this.mMaxState = State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C1467n<>();
        initLifecycle();
    }

    private C1366d ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C1366d();
        }
        return this.mAnimationInfo;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C1460j(this);
        this.mSavedStateRegistryController = C1788b.m9655a((C1789c) this);
        if (VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.mo6472a((C1458h) new C1457g() {
                /* renamed from: a */
                public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                    if (aVar == C1441a.ON_STOP) {
                        View view = Fragment.this.mView;
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
    }

    @C0193h0
    @Deprecated
    public static Fragment instantiate(@C0193h0 Context context, @C0193h0 String str) {
        return instantiate(context, str, null);
    }

    /* access modifiers changed from: 0000 */
    public void callStartTransitionListener() {
        C1366d dVar = this.mAnimationInfo;
        C1367e eVar = null;
        if (dVar != null) {
            dVar.f5373q = false;
            C1367e eVar2 = dVar.f5374r;
            dVar.f5374r = null;
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.mo6053b();
        }
    }

    public void dump(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C1492a.m7755a(this).mo6545a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        C1386i iVar = this.mChildFragmentManager;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        iVar.mo6232a(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@C0195i0 Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    public Fragment findFragmentByWho(@C0193h0 String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.mo6291b(str);
    }

    @C0195i0
    public final C1376c getActivity() {
        C1381g gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return (C1376c) gVar.mo6217b();
    }

    public boolean getAllowEnterTransitionOverlap() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar != null) {
            Boolean bool = dVar.f5370n;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar != null) {
            Boolean bool = dVar.f5369m;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public View getAnimatingAway() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5357a;
    }

    /* access modifiers changed from: 0000 */
    public Animator getAnimator() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5358b;
    }

    @C0195i0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @C0193h0
    public final C1382h getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    @C0195i0
    public Context getContext() {
        C1381g gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return gVar.mo6218c();
    }

    @C0195i0
    public Object getEnterTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5363g;
    }

    /* access modifiers changed from: 0000 */
    public C0815z getEnterTransitionCallback() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5371o;
    }

    @C0195i0
    public Object getExitTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5365i;
    }

    /* access modifiers changed from: 0000 */
    public C0815z getExitTransitionCallback() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5372p;
    }

    @C0195i0
    public final C1382h getFragmentManager() {
        return this.mFragmentManager;
    }

    @C0195i0
    public final Object getHost() {
        C1381g gVar = this.mHost;
        if (gVar == null) {
            return null;
        }
        return gVar.mo6169e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @C0193h0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @C0193h0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @C0193h0
    @Deprecated
    public C1492a getLoaderManager() {
        return C1492a.m7755a(this);
    }

    /* access modifiers changed from: 0000 */
    public int getNextAnim() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f5360d;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f5361e;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransitionStyle() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f5362f;
    }

    @C0195i0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @C0195i0
    public Object getReenterTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f5366j;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getExitTransition();
        }
        return obj;
    }

    @C0193h0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @C0195i0
    public Object getReturnTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f5364h;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getEnterTransition();
        }
        return obj;
    }

    @C0193h0
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo8043a();
    }

    @C0195i0
    public Object getSharedElementEnterTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        return dVar.f5367k;
    }

    @C0195i0
    public Object getSharedElementReturnTransition() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f5368l;
        if (obj == USE_DEFAULT_TRANSITION) {
            obj = getSharedElementEnterTransition();
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    public int getStateAfterAnimating() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return 0;
        }
        return dVar.f5359c;
    }

    @C0193h0
    public final String getString(@C0214q0 int i) {
        return getResources().getString(i);
    }

    @C0195i0
    public final String getTag() {
        return this.mTag;
    }

    @C0195i0
    public final Fragment getTargetFragment() {
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        C1386i iVar = this.mFragmentManager;
        if (iVar != null) {
            String str = this.mTargetWho;
            if (str != null) {
                return (Fragment) iVar.f5444S.get(str);
            }
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @C0193h0
    public final CharSequence getText(@C0214q0 int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @C0195i0
    public View getView() {
        return this.mView;
    }

    @C0193h0
    @C0187e0
    public C1459i getViewLifecycleOwner() {
        C1423r rVar = this.mViewLifecycleOwner;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @C0193h0
    public LiveData<C1459i> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @C0193h0
    public C1483v getViewModelStore() {
        C1386i iVar = this.mFragmentManager;
        if (iVar != null) {
            return iVar.mo6315h(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1386i();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHideReplaced() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.f5375s;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPostponed() {
        C1366d dVar = this.mAnimationInfo;
        if (dVar == null) {
            return false;
        }
        return dVar.f5373q;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    public final boolean isStateSaved() {
        C1386i iVar = this.mFragmentManager;
        if (iVar == null) {
            return false;
        }
        return iVar.mo6243h();
    }

    public final boolean isVisible() {
        if (isAdded() && !isHidden()) {
            View view = this.mView;
            if (!(view == null || view.getWindowToken() == null || this.mView.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.mo6264C();
    }

    @C0194i
    public void onActivityCreated(@C0195i0 Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i, int i2, @C0195i0 Intent intent) {
    }

    @C0194i
    public void onAttach(@C0193h0 Context context) {
        this.mCalled = true;
        C1381g gVar = this.mHost;
        Activity b = gVar == null ? null : gVar.mo6217b();
        if (b != null) {
            this.mCalled = false;
            onAttach(b);
        }
    }

    public void onAttachFragment(@C0193h0 Fragment fragment) {
    }

    @C0194i
    public void onConfigurationChanged(@C0193h0 Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@C0193h0 MenuItem menuItem) {
        return false;
    }

    @C0194i
    public void onCreate(@C0195i0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.mo6308d(1)) {
            this.mChildFragmentManager.mo6324n();
        }
    }

    @C0195i0
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @C0195i0
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(@C0193h0 ContextMenu contextMenu, @C0193h0 View view, @C0195i0 ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(@C0193h0 Menu menu, @C0193h0 MenuInflater menuInflater) {
    }

    @C0195i0
    public View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @C0194i
    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    @C0194i
    public void onDestroyView() {
        this.mCalled = true;
    }

    @C0194i
    public void onDetach() {
        this.mCalled = true;
    }

    @C0193h0
    public LayoutInflater onGetLayoutInflater(@C0195i0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @C0194i
    public void onInflate(@C0193h0 Context context, @C0193h0 AttributeSet attributeSet, @C0195i0 Bundle bundle) {
        this.mCalled = true;
        C1381g gVar = this.mHost;
        Activity b = gVar == null ? null : gVar.mo6217b();
        if (b != null) {
            this.mCalled = false;
            onInflate(b, attributeSet, bundle);
        }
    }

    @C0194i
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(@C0193h0 MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(@C0193h0 Menu menu) {
    }

    @C0194i
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(@C0193h0 Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
    }

    @C0194i
    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
    }

    @C0194i
    public void onStart() {
        this.mCalled = true;
    }

    @C0194i
    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@C0193h0 View view, @C0195i0 Bundle bundle) {
    }

    @C0194i
    public void onViewStateRestored(@C0195i0 Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: 0000 */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.mo6264C();
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.mo6322m();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C1427t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performAttach() {
        this.mChildFragmentManager.mo6285a(this.mHost, (C1378d) new C1365c(), this);
        this.mCalled = false;
        onAttach(this.mHost.mo6218c());
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new C1427t(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performConfigurationChanged(@C0193h0 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.mo6273a(configuration);
    }

    /* access modifiers changed from: 0000 */
    public boolean performContextItemSelected(@C0193h0 MenuItem menuItem) {
        if (this.mHidden || (!onContextItemSelected(menuItem) && !this.mChildFragmentManager.mo6288a(menuItem))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.mo6264C();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.mo8044a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo6513a(C1441a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C1427t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean performCreateOptionsMenu(@C0193h0 Menu menu, @C0193h0 MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.mo6287a(menu, menuInflater);
    }

    /* access modifiers changed from: 0000 */
    public void performCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        this.mChildFragmentManager.mo6264C();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1423r();
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo6455a();
            this.mViewLifecycleOwnerLiveData.mo6483b(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.mo6457b()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroy() {
        this.mChildFragmentManager.mo6326o();
        this.mLifecycleRegistry.mo6513a(C1441a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new C1427t(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroyView() {
        this.mChildFragmentManager.mo6330p();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo6456a(C1441a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C1492a.m7755a(this).mo6549b();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C1427t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C1427t(sb.toString());
        } else if (!this.mChildFragmentManager.mo6242g()) {
            this.mChildFragmentManager.mo6326o();
            this.mChildFragmentManager = new C1386i();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    public LayoutInflater performGetLayoutInflater(@C0195i0 Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.mo6332q();
    }

    /* access modifiers changed from: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.mo6297b(z);
    }

    /* access modifiers changed from: 0000 */
    public boolean performOptionsItemSelected(@C0193h0 MenuItem menuItem) {
        if (this.mHidden || ((!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) && !this.mChildFragmentManager.mo6299b(menuItem))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performOptionsMenuClosed(@C0193h0 Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo6276a(menu);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPause() {
        this.mChildFragmentManager.mo6335r();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo6456a(C1441a.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo6513a(C1441a.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C1427t(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.mo6304c(z);
    }

    /* access modifiers changed from: 0000 */
    public boolean performPrepareOptionsMenu(@C0193h0 Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.mo6298b(menu);
    }

    /* access modifiers changed from: 0000 */
    public void performPrimaryNavigationFragmentChanged() {
        boolean j = this.mFragmentManager.mo6318j(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != j) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(j);
            onPrimaryNavigationFragmentChanged(j);
            this.mChildFragmentManager.mo6336s();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performResume() {
        this.mChildFragmentManager.mo6264C();
        this.mChildFragmentManager.mo6345x();
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo6513a(C1441a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo6456a(C1441a.ON_RESUME);
            }
            this.mChildFragmentManager.mo6338t();
            this.mChildFragmentManager.mo6345x();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C1427t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo8045b(bundle);
        Parcelable F = this.mChildFragmentManager.mo6267F();
        if (F != null) {
            bundle.putParcelable("android:support:fragments", F);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performStart() {
        this.mChildFragmentManager.mo6264C();
        this.mChildFragmentManager.mo6345x();
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo6513a(C1441a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo6456a(C1441a.ON_START);
            }
            this.mChildFragmentManager.mo6341u();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C1427t(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStop() {
        this.mChildFragmentManager.mo6343v();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo6456a(C1441a.ON_STOP);
        }
        this.mLifecycleRegistry.mo6513a(C1441a.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C1427t(sb.toString());
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f5373q = true;
    }

    public void registerForContextMenu(@C0193h0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(@C0193h0 String[] strArr, int i) {
        C1381g gVar = this.mHost;
        if (gVar != null) {
            gVar.mo6165a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    public final C1376c requireActivity() {
        C1376c activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    public final C1382h requireFragmentManager() {
        C1382h fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        String str = "Fragment ";
        if (getContext() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this);
        sb2.append(" is not a child Fragment, it is directly attached to ");
        sb2.append(getContext());
        throw new IllegalStateException(sb2.toString());
    }

    @C0193h0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void restoreChildFragmentState(@C0195i0 Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.mChildFragmentManager.mo6274a(parcelable);
                this.mChildFragmentManager.mo6324n();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C1427t(sb.toString());
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo6456a(C1441a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f5370n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f5369m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f5357a = view;
    }

    /* access modifiers changed from: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f5358b = animator;
    }

    public void setArguments(@C0195i0 Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(@C0195i0 C0815z zVar) {
        ensureAnimationInfo().f5371o = zVar;
    }

    public void setEnterTransition(@C0195i0 Object obj) {
        ensureAnimationInfo().f5363g = obj;
    }

    public void setExitSharedElementCallback(@C0195i0 C0815z zVar) {
        ensureAnimationInfo().f5372p = zVar;
    }

    public void setExitTransition(@C0195i0 Object obj) {
        ensureAnimationInfo().f5365i = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo6173i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f5375s = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r2 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInitialSavedState(@androidx.annotation.C0195i0 androidx.fragment.app.Fragment.SavedState r2) {
        /*
            r1 = this;
            androidx.fragment.app.i r0 = r1.mFragmentManager
            if (r0 != 0) goto L_0x000f
            if (r2 == 0) goto L_0x000b
            android.os.Bundle r2 = r2.mState
            if (r2 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.mSavedFragmentState = r2
            return
        L_0x000f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.setInitialSavedState(androidx.fragment.app.Fragment$SavedState):void");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo6173i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f5360d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            C1366d dVar = this.mAnimationInfo;
            dVar.f5361e = i;
            dVar.f5362f = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnStartEnterTransitionListener(C1367e eVar) {
        ensureAnimationInfo();
        C1367e eVar2 = this.mAnimationInfo.f5374r;
        if (eVar != eVar2) {
            if (eVar == null || eVar2 == null) {
                C1366d dVar = this.mAnimationInfo;
                if (dVar.f5373q) {
                    dVar.f5374r = eVar;
                }
                if (eVar != null) {
                    eVar.mo6052a();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setReenterTransition(@C0195i0 Object obj) {
        ensureAnimationInfo().f5366j = obj;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        C1386i iVar = this.mFragmentManager;
        if (iVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            iVar.mo6292b(this);
        } else {
            iVar.mo6333q(this);
        }
    }

    public void setReturnTransition(@C0195i0 Object obj) {
        ensureAnimationInfo().f5364h = obj;
    }

    public void setSharedElementEnterTransition(@C0195i0 Object obj) {
        ensureAnimationInfo().f5367k = obj;
    }

    public void setSharedElementReturnTransition(@C0195i0 Object obj) {
        ensureAnimationInfo().f5368l = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f5359c = i;
    }

    public void setTargetFragment(@C0195i0 Fragment fragment, int i) {
        C1382h fragmentManager = getFragmentManager();
        C1382h fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.mo6327o(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@C0193h0 String str) {
        C1381g gVar = this.mHost;
        if (gVar != null) {
            return gVar.mo6167a(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4, @C0195i0 Bundle bundle) throws SendIntentException {
        C1381g gVar = this.mHost;
        if (gVar != null) {
            gVar.mo6164a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startPostponedEnterTransition() {
        C1386i iVar = this.mFragmentManager;
        if (iVar == null || iVar.f5454c0 == null) {
            ensureAnimationInfo().f5373q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f5454c0.mo6219d().getLooper()) {
            this.mFragmentManager.f5454c0.mo6219d().postAtFrontOfQueue(new C1364b());
        } else {
            callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0935c.m5324a(this, sb);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(C3868i.f12248b);
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(@C0193h0 View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @C0193h0
    @Deprecated
    public static Fragment instantiate(@C0193h0 Context context, @C0193h0 String str, @C0195i0 Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) C1380f.m7262d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            throw new InstantiationException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new InstantiationException(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new InstantiationException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(sb4.toString(), e4);
        }
    }

    @C0193h0
    public final String getString(@C0214q0 int i, @C0195i0 Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, @C0193h0 TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f5373q = true;
        C1386i iVar = this.mFragmentManager;
        if (iVar != null) {
            handler = iVar.f5454c0.mo6219d();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @C0195i0 Bundle bundle) {
        C1381g gVar = this.mHost;
        if (gVar != null) {
            gVar.mo6163a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0195i0 Bundle bundle) {
        C1381g gVar = this.mHost;
        if (gVar != null) {
            gVar.mo6163a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@C0195i0 Bundle bundle) {
        C1381g gVar = this.mHost;
        if (gVar != null) {
            LayoutInflater f = gVar.mo6170f();
            C0994j.m5713b(f, this.mChildFragmentManager.mo6262A());
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    @C0194i
    public void onAttach(@C0193h0 Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    @C0194i
    public void onInflate(@C0193h0 Activity activity, @C0193h0 AttributeSet attributeSet, @C0195i0 Bundle bundle) {
        this.mCalled = true;
    }

    @C0206n
    public Fragment(@C0183c0 int i) {
        this();
        this.mContentLayoutId = i;
    }
}
