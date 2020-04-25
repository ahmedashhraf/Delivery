package com.clevertap.android.sdk;

import com.google.android.gms.plus.p177g.p178a.C5495a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.clevertap.android.sdk.m1 */
/* compiled from: ProfileHandler */
public class C3137m1 {

    /* renamed from: a */
    private WeakReference<C3150p0> f11208a;

    C3137m1(C3150p0 p0Var) {
        this.f11208a = new WeakReference<>(p0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo12393a(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12445a(str, str2);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12398b(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12462b(str, str2);
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo12400c(String str, ArrayList<String> arrayList) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12470c(str, arrayList);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo12394a(String str, ArrayList<String> arrayList) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12447a(str, arrayList);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12399b(String str, ArrayList<String> arrayList) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12463b(str, arrayList);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo12395a(Map<String, Object> map) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12465b(map);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12397b(String str) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12485j(str);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo12396a(JSONObject jSONObject) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12453a(jSONObject);
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo12392a(C5495a aVar) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12442a(aVar);
        }
    }

    @Deprecated
    /* renamed from: a */
    public Object mo12391a(String str) {
        C3150p0 p0Var = (C3150p0) this.f11208a.get();
        if (p0Var != null) {
            return p0Var.mo12478g(str);
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return null;
    }
}
