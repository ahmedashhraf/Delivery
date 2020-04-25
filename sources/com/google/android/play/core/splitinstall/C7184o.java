package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.o */
final class C7184o {

    /* renamed from: a */
    private final Context f20321a;

    C7184o(Context context) {
        this.f20321a = context;
    }

    /* renamed from: b */
    private final SharedPreferences m34485b() {
        return this.f20321a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return new java.util.HashSet();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Set<java.lang.String> mo28605a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.m34485b()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "deferred_uninstall_module_list"
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x001d }
            r2.<init>()     // Catch:{ Exception -> 0x001d }
            java.util.Set r0 = r0.getStringSet(r1, r2)     // Catch:{ Exception -> 0x001d }
            if (r0 != 0) goto L_0x0019
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            monitor-exit(r3)
            return r0
        L_0x0019:
            monitor-exit(r3)
            return r0
        L_0x001b:
            r0 = move-exception
            goto L_0x0024
        L_0x001d:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x001b }
            r0.<init>()     // Catch:{ all -> 0x001b }
            monitor-exit(r3)
            return r0
        L_0x0024:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C7184o.mo28605a():java.util.Set");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo28606a(Collection<String> collection) {
        Set a = mo28605a();
        boolean z = false;
        for (String add : collection) {
            if (a.add(add)) {
                z = true;
            }
        }
        if (z) {
            try {
                m34485b().edit().putStringSet("deferred_uninstall_module_list", a).apply();
            } catch (Exception unused) {
            }
        }
    }
}
