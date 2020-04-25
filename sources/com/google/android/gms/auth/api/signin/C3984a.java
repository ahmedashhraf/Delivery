package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C3983a;
import com.google.android.gms.auth.api.signin.internal.C4004i;
import com.google.android.gms.auth.api.signin.internal.C4012q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4305c;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5566n;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C3984a {
    private C3984a() {
    }

    /* renamed from: a */
    public static C3986c m17337a(@C0193h0 Context context, @C0193h0 GoogleSignInOptions googleSignInOptions) {
        return new C3986c(context, (GoogleSignInOptions) C4300a0.m18620a(googleSignInOptions));
    }

    /* renamed from: a */
    public static C3986c m17336a(@C0193h0 Activity activity, @C0193h0 GoogleSignInOptions googleSignInOptions) {
        return new C3986c(activity, (GoogleSignInOptions) C4300a0.m18620a(googleSignInOptions));
    }

    /* renamed from: a */
    public static C5560k<GoogleSignInAccount> m17338a(@C0195i0 Intent intent) {
        C3990e a = C4004i.m17411a(intent);
        if (a == null) {
            return C5566n.m24210a((Exception) C4305c.m18635a(Status.f12782R));
        }
        if (!a.mo17504f().mo17617T() || a.mo17502a() == null) {
            return C5566n.m24210a((Exception) C4305c.m18635a(a.mo17504f()));
        }
        return C5566n.m24211a(a.mo17502a());
    }

    @C0195i0
    /* renamed from: a */
    public static GoogleSignInAccount m17333a(Context context) {
        return C4012q.m17427a(context).mo17539b();
    }

    @C0193h0
    /* renamed from: a */
    public static GoogleSignInAccount m17335a(@C0193h0 Context context, @C0193h0 Scope scope, Scope... scopeArr) {
        C4300a0.m18621a(context, (Object) "please provide a valid Context object");
        C4300a0.m18621a(scope, (Object) "please provide at least one valid scope");
        GoogleSignInAccount a = m17333a(context);
        if (a == null) {
            a = GoogleSignInAccount.m17277a0();
        }
        a.mo17456a(scope);
        a.mo17456a(scopeArr);
        return a;
    }

    @C0193h0
    /* renamed from: a */
    public static GoogleSignInAccount m17334a(@C0193h0 Context context, @C0193h0 C3989d dVar) {
        C4300a0.m18621a(context, (Object) "please provide a valid Context object");
        C4300a0.m18621a(dVar, (Object) "please provide valid GoogleSignInOptionsExtension");
        GoogleSignInAccount a = m17333a(context);
        if (a == null) {
            a = GoogleSignInAccount.m17277a0();
        }
        return a.mo17456a(m17345a(dVar.mo17501c()));
    }

    /* renamed from: a */
    public static boolean m17343a(@C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 C3989d dVar) {
        C4300a0.m18621a(dVar, (Object) "Please provide a non-null GoogleSignInOptionsExtension");
        return m17344a(googleSignInAccount, m17345a(dVar.mo17501c()));
    }

    /* renamed from: a */
    public static boolean m17344a(@C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.mo17447R().containsAll(hashSet);
    }

    /* renamed from: a */
    public static void m17339a(@C0193h0 Activity activity, int i, @C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 C3989d dVar) {
        C4300a0.m18621a(activity, (Object) "Please provide a non-null Activity");
        C4300a0.m18621a(dVar, (Object) "Please provide a non-null GoogleSignInOptionsExtension");
        m17340a(activity, i, googleSignInAccount, m17345a(dVar.mo17501c()));
    }

    /* renamed from: a */
    public static void m17341a(@C0193h0 Fragment fragment, int i, @C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 C3989d dVar) {
        C4300a0.m18621a(fragment, (Object) "Please provide a non-null Fragment");
        C4300a0.m18621a(dVar, (Object) "Please provide a non-null GoogleSignInOptionsExtension");
        m17342a(fragment, i, googleSignInAccount, m17345a(dVar.mo17501c()));
    }

    /* renamed from: a */
    public static void m17340a(@C0193h0 Activity activity, int i, @C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 Scope... scopeArr) {
        C4300a0.m18621a(activity, (Object) "Please provide a non-null Activity");
        C4300a0.m18621a(scopeArr, (Object) "Please provide at least one scope");
        activity.startActivityForResult(m17332a(activity, googleSignInAccount, scopeArr), i);
    }

    /* renamed from: a */
    public static void m17342a(@C0193h0 Fragment fragment, int i, @C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 Scope... scopeArr) {
        C4300a0.m18621a(fragment, (Object) "Please provide a non-null Fragment");
        C4300a0.m18621a(scopeArr, (Object) "Please provide at least one scope");
        fragment.startActivityForResult(m17332a((Activity) fragment.getActivity(), googleSignInAccount, scopeArr), i);
    }

    @C0193h0
    /* renamed from: a */
    private static Intent m17332a(@C0193h0 Activity activity, @C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 Scope... scopeArr) {
        C3983a aVar = new C3983a();
        if (scopeArr.length > 0) {
            aVar.mo17475a(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.mo17444O())) {
            aVar.mo17482c(googleSignInAccount.mo17444O());
        }
        return new C3986c(activity, aVar.mo17478a()).mo17494k();
    }

    @C0193h0
    /* renamed from: a */
    private static Scope[] m17345a(@C0195i0 List<Scope> list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }
}
