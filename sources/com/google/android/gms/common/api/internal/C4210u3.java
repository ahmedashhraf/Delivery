package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.collection.C0635a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p076c.p112d.p113a.p114a.p118d.p122d.C2617e;

/* renamed from: com.google.android.gms.common.api.internal.u3 */
public final class C4210u3 extends Fragment implements C4162m {

    /* renamed from: O */
    private static WeakHashMap<Activity, WeakReference<C4210u3>> f13160O = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Bundle f13161N;

    /* renamed from: a */
    private Map<String, LifecycleCallback> f13162a = new C0635a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f13163b = 0;

    /* renamed from: a */
    public static C4210u3 m18228a(Activity activity) {
        String str = "LifecycleFragmentImpl";
        WeakReference weakReference = (WeakReference) f13160O.get(activity);
        if (weakReference != null) {
            C4210u3 u3Var = (C4210u3) weakReference.get();
            if (u3Var != null) {
                return u3Var;
            }
        }
        try {
            C4210u3 u3Var2 = (C4210u3) activity.getFragmentManager().findFragmentByTag(str);
            if (u3Var2 == null || u3Var2.isRemoving()) {
                u3Var2 = new C4210u3();
                activity.getFragmentManager().beginTransaction().add(u3Var2, str).commitAllowingStateLoss();
            }
            f13160O.put(activity, new WeakReference(u3Var2));
            return u3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f13162a.values()) {
            a.mo17760a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f13162a.values()) {
            a.mo17758a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13163b = 1;
        this.f13161N = bundle;
        for (Entry entry : this.f13162a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo17759a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f13163b = 5;
        for (LifecycleCallback b : this.f13162a.values()) {
            b.mo17761b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f13163b = 3;
        for (LifecycleCallback c : this.f13162a.values()) {
            c.mo17763c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f13162a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo17762b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f13163b = 2;
        for (LifecycleCallback d : this.f13162a.values()) {
            d.mo17764d();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f13163b = 4;
        for (LifecycleCallback e : this.f13162a.values()) {
            e.mo17765e();
        }
    }

    /* renamed from: q */
    public final boolean mo17921q() {
        return this.f13163b > 0;
    }

    /* renamed from: s */
    public final Activity mo17922s() {
        return getActivity();
    }

    /* renamed from: u */
    public final boolean mo17924u() {
        return this.f13163b >= 2;
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo17919a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f13162a.get(str));
    }

    /* renamed from: a */
    public final void mo17920a(String str, @C0193h0 LifecycleCallback lifecycleCallback) {
        if (!this.f13162a.containsKey(str)) {
            this.f13162a.put(str, lifecycleCallback);
            if (this.f13163b > 0) {
                new C2617e(Looper.getMainLooper()).post(new C4215v3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
}
