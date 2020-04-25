package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.g */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final /* synthetic */ class C3992g implements Comparator {

    /* renamed from: a */
    static final Comparator f12669a = new C3992g();

    private C3992g() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).mo17606N().compareTo(((Scope) obj2).mo17606N());
    }
}
