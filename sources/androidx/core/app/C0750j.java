package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.collection.C0649h;
import androidx.core.p034l.C0988i;
import androidx.core.p034l.C0988i.C0989a;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1460j;
import androidx.lifecycle.C1471r;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.j */
/* compiled from: ComponentActivity */
public class C0750j extends Activity implements C1459i, C0989a {
    private C0649h<Class<? extends C0751a>, C0751a> mExtraDataMap = new C0649h<>();
    private C1460j mLifecycleRegistry = new C1460j(this);

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.app.j$a */
    /* compiled from: ComponentActivity */
    public static class C0751a {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0988i.m5667a(decorView, keyEvent)) {
            return C0988i.m5668a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0988i.m5667a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public <T extends C0751a> T getExtraData(Class<T> cls) {
        return (C0751a) this.mExtraDataMap.get(cls);
    }

    @C0193h0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        C1471r.m7727b((Activity) this);
    }

    /* access modifiers changed from: protected */
    @C0194i
    public void onSaveInstanceState(@C0193h0 Bundle bundle) {
        this.mLifecycleRegistry.mo6512a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void putExtraData(C0751a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
