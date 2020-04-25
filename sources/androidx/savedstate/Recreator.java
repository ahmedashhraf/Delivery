package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.lifecycle.C1456f;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.savedstate.SavedStateRegistry.C1785a;
import androidx.savedstate.SavedStateRegistry.C1786b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C1456f {

    /* renamed from: b */
    static final String f6921b = "classes_to_restore";

    /* renamed from: c */
    static final String f6922c = "androidx.savedstate.Restarter";

    /* renamed from: a */
    private final C1789c f6923a;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C1783a implements C1786b {

        /* renamed from: a */
        final Set<String> f6924a = new HashSet();

        C1783a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo8039a(Recreator.f6922c, (C1786b) this);
        }

        @C0193h0
        /* renamed from: a */
        public Bundle mo8033a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f6921b, new ArrayList(this.f6924a));
            return bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8034a(String str) {
            this.f6924a.add(str);
        }
    }

    Recreator(C1789c cVar) {
        this.f6923a = cVar;
    }

    /* renamed from: a */
    public void mo632a(C1459i iVar, C1441a aVar) {
        if (aVar == C1441a.ON_CREATE) {
            iVar.getLifecycle().mo6473b(this);
            Bundle a = this.f6923a.getSavedStateRegistry().mo8035a(f6922c);
            if (a != null) {
                ArrayList stringArrayList = a.getStringArrayList(f6921b);
                if (stringArrayList != null) {
                    Iterator it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m9641a((String) it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    /* renamed from: a */
    private void m9641a(String str) {
        try {
            Class asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1785a.class);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((C1785a) declaredConstructor.newInstance(new Object[0])).mo8042a(this.f6923a);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e);
                }
            } catch (NoSuchMethodException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Class");
                sb2.append(asSubclass.getSimpleName());
                sb2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalStateException(sb2.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Class ");
            sb3.append(str);
            sb3.append(" wasn't found");
            throw new RuntimeException(sb3.toString(), e3);
        }
    }
}
