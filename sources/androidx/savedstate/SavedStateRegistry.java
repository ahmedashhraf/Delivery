package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.C1456f;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;
import java.util.Map.Entry;
import p053b.p054a.p055a.p057c.C2083b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: f */
    private static final String f6925f = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* renamed from: a */
    private C2083b<String, C1786b> f6926a = new C2083b<>();
    @C0195i0

    /* renamed from: b */
    private Bundle f6927b;

    /* renamed from: c */
    private boolean f6928c;

    /* renamed from: d */
    private C1783a f6929d;

    /* renamed from: e */
    boolean f6930e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C1785a {
        /* renamed from: a */
        void mo8042a(@C0193h0 C1789c cVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C1786b {
        @C0193h0
        /* renamed from: a */
        Bundle mo8033a();
    }

    SavedStateRegistry() {
    }

    @C0187e0
    @C0195i0
    /* renamed from: a */
    public Bundle mo8035a(@C0193h0 String str) {
        if (this.f6928c) {
            Bundle bundle = this.f6927b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f6927b.remove(str);
            if (this.f6927b.isEmpty()) {
                this.f6927b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    @C0187e0
    /* renamed from: b */
    public void mo8041b(@C0193h0 String str) {
        this.f6926a.remove(str);
    }

    @C0187e0
    /* renamed from: a */
    public void mo8039a(@C0193h0 String str, @C0193h0 C1786b bVar) {
        if (((C1786b) this.f6926a.mo9055b(str, bVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @C0187e0
    /* renamed from: a */
    public boolean mo8040a() {
        return this.f6928c;
    }

    @C0187e0
    /* renamed from: a */
    public void mo8038a(@C0193h0 Class<? extends C1785a> cls) {
        if (this.f6930e) {
            if (this.f6929d == null) {
                this.f6929d = new C1783a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f6929d.mo8034a(cls.getName());
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* access modifiers changed from: 0000 */
    @C0187e0
    /* renamed from: a */
    public void mo8037a(@C0193h0 Lifecycle lifecycle, @C0195i0 Bundle bundle) {
        if (!this.f6928c) {
            if (bundle != null) {
                this.f6927b = bundle.getBundle(f6925f);
            }
            lifecycle.mo6472a(new C1456f() {
                /* renamed from: a */
                public void mo632a(C1459i iVar, C1441a aVar) {
                    if (aVar == C1441a.ON_START) {
                        SavedStateRegistry.this.f6930e = true;
                    } else if (aVar == C1441a.ON_STOP) {
                        SavedStateRegistry.this.f6930e = false;
                    }
                }
            });
            this.f6928c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: 0000 */
    @C0187e0
    /* renamed from: a */
    public void mo8036a(@C0193h0 Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f6927b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C2087d c = this.f6926a.mo9061c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            bundle2.putBundle((String) entry.getKey(), ((C1786b) entry.getValue()).mo8033a());
        }
        bundle.putBundle(f6925f, bundle2);
    }
}
