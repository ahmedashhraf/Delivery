package com.clevertap.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.clevertap.android.sdk.s1 */
/* compiled from: StorageHelper */
final class C3217s1 {
    C3217s1() {
    }

    /* renamed from: a */
    static String m15527a(Context context, String str, String str2) {
        return m15525a(context).getString(str, str2);
    }

    /* renamed from: b */
    static void m15534b(Context context, String str, String str2) {
        m15529a(m15525a(context).edit().putString(str, str2));
    }

    /* renamed from: a */
    static String m15528a(Context context, String str, String str2, String str3) {
        return m15526a(context, str).getString(str2, str3);
    }

    /* renamed from: a */
    static long m15523a(Context context, String str, long j) {
        return m15525a(context).getLong(str, j);
    }

    /* renamed from: a */
    static long m15524a(Context context, String str, String str2, long j) {
        return m15526a(context, str).getLong(str2, j);
    }

    /* renamed from: b */
    static void m15531b(Context context, String str) {
        m15529a(m15525a(context).edit().remove(str));
    }

    /* renamed from: a */
    static int m15522a(Context context, String str, int i) {
        return m15525a(context).getInt(str, i);
    }

    /* renamed from: a */
    static boolean m15530a(Context context, String str, boolean z) {
        return m15525a(context).getBoolean(str, z);
    }

    /* renamed from: a */
    static SharedPreferences m15526a(Context context, String str) {
        String str2 = "WizRocket";
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(str);
            str2 = sb.toString();
        }
        return context.getSharedPreferences(str2, 0);
    }

    /* renamed from: b */
    static void m15533b(Context context, String str, long j) {
        m15529a(m15525a(context).edit().putLong(str, j));
    }

    /* renamed from: a */
    static SharedPreferences m15525a(Context context) {
        return m15526a(context, null);
    }

    /* renamed from: a */
    static void m15529a(Editor editor) {
        try {
            editor.apply();
        } catch (Throwable th) {
            C3111h1.m14941f("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    /* renamed from: b */
    static void m15532b(Context context, String str, int i) {
        m15529a(m15525a(context).edit().putInt(str, i));
    }

    /* renamed from: b */
    static void m15535b(Context context, String str, boolean z) {
        m15529a(m15525a(context).edit().putBoolean(str, z));
    }
}
