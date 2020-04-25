package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0177c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0206n;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0650i;
import androidx.core.app.C0727a;
import androidx.core.app.C0727a.C0729b;
import androidx.core.app.C0727a.C0730c;
import androidx.core.app.C0727a.C0731d;
import androidx.core.app.C0815z;
import androidx.core.p024e.p025b.C0886a;
import androidx.lifecycle.C1460j;
import androidx.lifecycle.C1483v;
import androidx.lifecycle.C1484w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import androidx.loader.p046a.C1492a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.c */
/* compiled from: FragmentActivity */
public class C1376c extends ComponentActivity implements C0729b, C0731d {
    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final C1460j mFragmentLifecycleRegistry = new C1460j(this);
    final C1379e mFragments = C1379e.m7218a((C1381g<?>) new C1377a<Object>());
    int mNextCandidateRequestIndex;
    C0650i<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: FragmentActivity */
    class C1377a extends C1381g<C1376c> implements C1484w, C0177c {
        public C1377a() {
            super(C1376c.this);
        }

        /* renamed from: a */
        public void mo6166a(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr) {
            C1376c.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: b */
        public boolean mo6168b(@C0193h0 Fragment fragment) {
            return !C1376c.this.isFinishing();
        }

        @C0193h0
        /* renamed from: f */
        public LayoutInflater mo6170f() {
            return C1376c.this.getLayoutInflater().cloneInContext(C1376c.this);
        }

        /* renamed from: g */
        public int mo6171g() {
            Window window = C1376c.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @C0193h0
        public Lifecycle getLifecycle() {
            return C1376c.this.mFragmentLifecycleRegistry;
        }

        @C0193h0
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return C1376c.this.getOnBackPressedDispatcher();
        }

        @C0193h0
        public C1483v getViewModelStore() {
            return C1376c.this.getViewModelStore();
        }

        /* renamed from: h */
        public boolean mo6172h() {
            return C1376c.this.getWindow() != null;
        }

        /* renamed from: i */
        public void mo6173i() {
            C1376c.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: a */
        public void mo6162a(@C0193h0 Fragment fragment, Intent intent, int i) {
            C1376c.this.startActivityFromFragment(fragment, intent, i);
        }

        /* renamed from: e */
        public C1376c m7210e() {
            return C1376c.this;
        }

        /* renamed from: a */
        public void mo6163a(@C0193h0 Fragment fragment, Intent intent, int i, @C0195i0 Bundle bundle) {
            C1376c.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo6164a(@C0193h0 Fragment fragment, IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
            C1376c.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo6165a(@C0193h0 Fragment fragment, @C0193h0 String[] strArr, int i) {
            C1376c.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public boolean mo6167a(@C0193h0 String str) {
            return C0727a.m4245a((Activity) C1376c.this, str);
        }

        /* renamed from: a */
        public void mo6161a(@C0193h0 Fragment fragment) {
            C1376c.this.onAttachFragment(fragment);
        }

        @C0195i0
        /* renamed from: a */
        public View mo6050a(int i) {
            return C1376c.this.findViewById(i);
        }

        /* renamed from: a */
        public boolean mo6051a() {
            Window window = C1376c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public C1376c() {
    }

    private int allocateRequestIndex(@C0193h0 Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo3395d() < MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            while (this.mPendingFragmentActivityResults.mo3396d(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo3392c(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void checkForValidRequestCode(int i) {
        if ((i & C0886a.f4059c) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), State.CREATED));
    }

    private static boolean markState(C1382h hVar, State state) {
        boolean z = false;
        for (Fragment fragment : hVar.mo6240e()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo6471a().isAtLeast(State.STARTED)) {
                    fragment.mLifecycleRegistry.mo6515b(state);
                    z = true;
                }
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    public final View dispatchFragmentsOnCreateView(@C0195i0 View view, @C0193h0 String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        return this.mFragments.mo6175a(view, str, context, attributeSet);
    }

    public void dump(@C0193h0 String str, @C0195i0 FileDescriptor fileDescriptor, @C0193h0 PrintWriter printWriter, @C0195i0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C1492a.m7755a(this).mo6545a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo6208p().mo6232a(str, fileDescriptor, printWriter, strArr);
    }

    @C0193h0
    public C1382h getSupportFragmentManager() {
        return this.mFragments.mo6208p();
    }

    @C0193h0
    @Deprecated
    public C1492a getSupportLoaderManager() {
        return C1492a.m7755a(this);
    }

    /* access modifiers changed from: protected */
    @C0194i
    public void onActivityResult(int i, int i2, @C0195i0 Intent intent) {
        this.mFragments.mo6210r();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo3391c(i4);
            this.mPendingFragmentActivityResults.mo3401f(i4);
            if (str != null) {
                Fragment a = this.mFragments.mo6176a(str);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Activity result no fragment exists for who: ");
                    sb.append(str);
                    sb.toString();
                } else {
                    a.onActivityResult(i & 65535, i2, intent);
                }
                return;
            }
            return;
        }
        C0730c a2 = C0727a.m4237a();
        if (a2 == null || !a2.mo4062a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onAttachFragment(@C0193h0 Fragment fragment) {
    }

    public void onConfigurationChanged(@C0193h0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo6210r();
        this.mFragments.mo6179a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        this.mFragments.mo6185a((Fragment) null);
        if (bundle != null) {
            this.mFragments.mo6180a(bundle.getParcelable(FRAGMENTS_TAG));
            String str = NEXT_CANDIDATE_REQUEST_INDEX_TAG;
            if (bundle.containsKey(str)) {
                this.mNextCandidateRequestIndex = bundle.getInt(str);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.mPendingFragmentActivityResults = new C0650i<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo3392c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0650i<>();
            this.mNextCandidateRequestIndex = 0;
        }
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_CREATE);
        this.mFragments.mo6190b();
    }

    public boolean onCreatePanelMenu(int i, @C0193h0 Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo6188a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @C0195i0
    public View onCreateView(@C0195i0 View view, @C0193h0 String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.mo6194c();
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo6197e();
    }

    public boolean onMenuItemSelected(int i, @C0193h0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo6193b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo6189a(menuItem);
    }

    @C0194i
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo6187a(z);
    }

    /* access modifiers changed from: protected */
    @C0194i
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo6210r();
    }

    public void onPanelClosed(int i, @C0193h0 Menu menu) {
        if (i == 0) {
            this.mFragments.mo6183a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.mo6198f();
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_PAUSE);
    }

    @C0194i
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo6191b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public boolean onPrepareOptionsPanel(@C0195i0 View view, @C0193h0 Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, @C0195i0 View view, @C0193h0 Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.mo6192b(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        this.mFragments.mo6210r();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo3391c(i3);
            this.mPendingFragmentActivityResults.mo3401f(i3);
            if (str != null) {
                Fragment a = this.mFragments.mo6176a(str);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Activity result no fragment exists for who: ");
                    sb.append(str);
                    sb.toString();
                } else {
                    a.onRequestPermissionsResult(i & 65535, strArr, iArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo6210r();
        this.mFragments.mo6206n();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_RESUME);
        this.mFragments.mo6200h();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_STOP);
        Parcelable w = this.mFragments.mo6215w();
        if (w != null) {
            bundle.putParcelable(FRAGMENTS_TAG, w);
        }
        if (this.mPendingFragmentActivityResults.mo3395d() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo3395d()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo3395d()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo3395d(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo3398e(i);
                strArr[i] = (String) this.mPendingFragmentActivityResults.mo3404h(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo6178a();
        }
        this.mFragments.mo6210r();
        this.mFragments.mo6206n();
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_START);
        this.mFragments.mo6201i();
    }

    public void onStateNotSaved() {
        this.mFragments.mo6210r();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo6202j();
        this.mFragmentLifecycleRegistry.mo6513a(C1441a.ON_STOP);
    }

    /* access modifiers changed from: 0000 */
    public void requestPermissionsFromFragment(@C0193h0 Fragment fragment, @C0193h0 String[] strArr, int i) {
        if (i == -1) {
            C0727a.m4243a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C0727a.m4243a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    public void setEnterSharedElementCallback(@C0195i0 C0815z zVar) {
        C0727a.m4242a((Activity) this, zVar);
    }

    public void setExitSharedElementCallback(@C0195i0 C0815z zVar) {
        C0727a.m4247b(this, zVar);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityFromFragment(@C0193h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromFragment(@C0193h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4, @C0195i0 Bundle bundle) throws SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                C0727a.m4241a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0727a.m4241a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    public void supportFinishAfterTransition() {
        C0727a.m4246b(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0727a.m4250e(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0727a.m4252g(this);
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void startActivityFromFragment(@C0193h0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0195i0 Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C0727a.m4240a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0727a.m4240a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    @C0195i0
    public View onCreateView(@C0193h0 String str, @C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @C0195i0 Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @C0195i0 Intent intent, int i2, int i3, int i4, @C0195i0 Bundle bundle) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @C0206n
    public C1376c(@C0183c0 int i) {
        super(i);
    }
}
