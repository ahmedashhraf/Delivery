package com.google.android.play.core.internal;

import java.io.File;
import java.util.Set;
import org.apache.http.cookie.C15222a;

/* renamed from: com.google.android.play.core.internal.s */
final class C5760s implements C5739e {
    C5760s() {
    }

    /* renamed from: b */
    static void m25273b(ClassLoader classLoader, Set<File> set) {
        C5751m.m25258a(classLoader, set, new C5764v());
    }

    /* renamed from: b */
    static boolean m25274b(ClassLoader classLoader, File file, File file2, boolean z) {
        return C5741g.m25237a(classLoader, file, file2, z, new C5757p(), C15222a.f44141w, new C5763u());
    }

    /* renamed from: a */
    public final void mo23039a(ClassLoader classLoader, Set<File> set) {
        m25273b(classLoader, set);
    }

    /* renamed from: a */
    public final boolean mo23040a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m25274b(classLoader, file, file2, z);
    }
}
