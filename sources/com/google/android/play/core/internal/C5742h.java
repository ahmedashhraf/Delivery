package com.google.android.play.core.internal;

import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.core.internal.h */
public class C5742h {

    /* renamed from: a */
    private final String f16615a;

    public C5742h(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f16615a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private int m25241a(int i, String str, Object[] objArr) {
        String str2 = "PlayCore";
        if (Log.isLoggable(str2, i)) {
            return Log.i(str2, m25243a(this.f16615a, str, objArr));
        }
        return 0;
    }

    /* renamed from: a */
    public static C5739e m25242a() {
        if (VERSION.SDK_INT >= 23 && VERSION.PREVIEW_SDK_INT != 0) {
            int i = VERSION.SDK_INT;
            if (i == 27) {
                return new C5765w();
            }
            if (i == 28) {
                return new C5768z();
            }
        }
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            switch (i2) {
                case 21:
                    return new C5741g();
                case 22:
                    return new C5753n();
                case 23:
                    return new C5751m();
                case 24:
                    return new C5758q();
                case 25:
                    return new C5761t();
                case 26:
                    return new C5760s();
                case 27:
                    return new C5766x();
                case 28:
                    if (!VERSION.CODENAME.equalsIgnoreCase("Q")) {
                        return new C5765w();
                    }
                    break;
            }
            return new C5768z();
        }
        throw new AssertionError("Unsupported Android Version");
    }

    /* renamed from: a */
    private static String m25243a(String str, String str2, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String str3 = "Unable to format ";
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3.concat(valueOf);
                } else {
                    new String(str3);
                }
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public int mo23043a(String str, Object... objArr) {
        return m25241a(4, str, objArr);
    }

    /* renamed from: a */
    public int mo23044a(Throwable th, String str, Object... objArr) {
        String str2 = "PlayCore";
        if (Log.isLoggable(str2, 6)) {
            return Log.e(str2, m25243a(this.f16615a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo23045b(String str, Object... objArr) {
        return m25241a(3, str, objArr);
    }

    /* renamed from: c */
    public int mo23046c(String str, Object... objArr) {
        return m25241a(5, str, objArr);
    }

    /* renamed from: d */
    public int mo23047d(String str, Object... objArr) {
        return m25241a(6, str, objArr);
    }
}
