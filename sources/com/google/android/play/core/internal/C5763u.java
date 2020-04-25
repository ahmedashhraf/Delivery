package com.google.android.play.core.internal;

import java.io.File;

/* renamed from: com.google.android.play.core.internal.u */
final class C5763u implements C5749l {
    C5763u() {
    }

    /* renamed from: a */
    public final boolean mo23048a(Object obj, File file, File file2) {
        try {
            if (!((Boolean) C5732a0.m25196a(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue()) {
                return true;
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
