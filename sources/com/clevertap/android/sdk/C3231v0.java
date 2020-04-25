package com.clevertap.android.sdk;

import android.os.Bundle;
import com.clevertap.android.sdk.exceptions.InvalidEventNameException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.clevertap.android.sdk.v0 */
/* compiled from: EventHandler */
public class C3231v0 {

    /* renamed from: a */
    private WeakReference<C3150p0> f11700a;

    C3231v0(C3150p0 p0Var) {
        this.f11700a = new WeakReference<>(p0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo12638a(String str, Map<String, Object> map) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12448a(str, map);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12640b(Bundle bundle) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12435a(bundle);
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo12642c(Bundle bundle) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12469c(bundle);
        }
    }

    @Deprecated
    /* renamed from: d */
    public int mo12643d(String str) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var != null) {
            return p0Var.mo12476f(str);
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: e */
    public void mo12644e(String str) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12481h(str);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo12637a(String str, HashMap<String, Object> hashMap, ArrayList<HashMap<String, Object>> arrayList) throws InvalidEventNameException {
        if (str.equals(C3150p0.f11230R0)) {
            C3150p0 p0Var = (C3150p0) this.f11700a.get();
            if (p0Var == null) {
                C3111h1.m14930d("CleverTap Instance is null.");
            } else {
                p0Var.mo12450a(hashMap, arrayList);
            }
        } else {
            throw new InvalidEventNameException("Not a charged event");
        }
    }

    @Deprecated
    /* renamed from: b */
    public C3227u0 mo12639b(String str) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var != null) {
            return p0Var.mo12467c(str);
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return null;
    }

    @Deprecated
    /* renamed from: c */
    public int mo12641c(String str) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var != null) {
            return p0Var.mo12472d(str);
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: a */
    public void mo12635a(Bundle bundle) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12435a(bundle);
        }
    }

    @Deprecated
    /* renamed from: a */
    public Map<String, C3227u0> mo12634a() {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var != null) {
            return p0Var.mo12482i();
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public int mo12633a(String str) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var != null) {
            return p0Var.mo12457b(str);
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: a */
    public void mo12636a(String str, int i) {
        C3150p0 p0Var = (C3150p0) this.f11700a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12444a(str, i);
        }
    }
}
