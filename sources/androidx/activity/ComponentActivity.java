package androidx.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0183c0;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0206n;
import androidx.core.app.C0750j;
import androidx.lifecycle.C1457g;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1460j;
import androidx.lifecycle.C1471r;
import androidx.lifecycle.C1483v;
import androidx.lifecycle.C1484w;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import androidx.savedstate.C1788b;
import androidx.savedstate.C1789c;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0750j implements C1459i, C1484w, C1789c, C0177c {
    @C0183c0
    private int mContentLayoutId;
    private final C1460j mLifecycleRegistry;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final C1788b mSavedStateRegistryController;
    private C1483v mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0168a implements Runnable {
        C0168a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0169b {

        /* renamed from: a */
        Object f610a;

        /* renamed from: b */
        C1483v f611b;

        C0169b() {
        }
    }

    public ComponentActivity() {
        this.mLifecycleRegistry = new C1460j(this);
        this.mSavedStateRegistryController = C1788b.m9655a((C1789c) this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new C0168a());
        if (getLifecycle() != null) {
            if (VERSION.SDK_INT >= 19) {
                getLifecycle().mo6472a(new C1457g() {
                    /* renamed from: a */
                    public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                        if (aVar == C1441a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().mo6472a(new C1457g() {
                /* renamed from: a */
                public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                    if (aVar == C1441a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().mo6540a();
                    }
                }
            });
            int i = VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().mo6472a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Deprecated
    @C0195i0
    public Object getLastCustomNonConfigurationInstance() {
        C0169b bVar = (C0169b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f610a;
        }
        return null;
    }

    @C0193h0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @C0193h0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @C0193h0
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.mo8043a();
    }

    @C0193h0
    public C1483v getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0169b bVar = (C0169b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f611b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C1483v();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @C0187e0
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo638b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        this.mSavedStateRegistryController.mo8044a(bundle);
        C1471r.m7727b((Activity) this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    @C0195i0
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @C0195i0
    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1483v vVar = this.mViewModelStore;
        if (vVar == null) {
            C0169b bVar = (C0169b) getLastNonConfigurationInstance();
            if (bVar != null) {
                vVar = bVar.f611b;
            }
        }
        if (vVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0169b bVar2 = new C0169b();
        bVar2.f610a = onRetainCustomNonConfigurationInstance;
        bVar2.f611b = vVar;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    @C0194i
    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C1460j) {
            ((C1460j) lifecycle).mo6515b(State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo8045b(bundle);
    }

    @C0206n
    public ComponentActivity(@C0183c0 int i) {
        this();
        this.mContentLayoutId = i;
    }
}
