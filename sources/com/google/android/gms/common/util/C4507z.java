package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4300a0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@C4056a
/* renamed from: com.google.android.gms.common.util.z */
public final class C4507z {
    private C4507z() {
    }

    @C4056a
    /* renamed from: a */
    public static Set<Scope> m19426a(Collection<String> collection) {
        C4300a0.m18621a(collection, (Object) "scopeStrings can't be null.");
        return m19427a((String[]) collection.toArray(new String[collection.size()]));
    }

    @C4056a
    /* renamed from: a */
    public static Set<Scope> m19427a(String... strArr) {
        C4300a0.m18621a(strArr, (Object) "scopeStrings can't be null.");
        HashSet hashSet = new HashSet(strArr.length);
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(new Scope(str));
            }
        }
        return hashSet;
    }

    @C4056a
    /* renamed from: a */
    public static String[] m19429a(Scope[] scopeArr) {
        C4300a0.m18621a(scopeArr, (Object) "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].mo17606N();
        }
        return strArr;
    }

    @C4056a
    /* renamed from: a */
    public static String[] m19428a(Set<Scope> set) {
        C4300a0.m18621a(set, (Object) "scopes can't be null.");
        return m19429a((Scope[]) set.toArray(new Scope[set.size()]));
    }
}
