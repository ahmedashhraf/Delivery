package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.internal.m */
public final class C4366m {

    /* renamed from: c */
    private static final int f13508c = 15;

    /* renamed from: d */
    private static final String f13509d = null;

    /* renamed from: a */
    private final String f13510a;

    /* renamed from: b */
    private final String f13511b;

    public C4366m(String str, String str2) {
        C4300a0.m18621a(str, (Object) "log tag cannot be null");
        C4300a0.m18629a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f13510a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f13511b = null;
        } else {
            this.f13511b = str2;
        }
    }

    @C4056a
    /* renamed from: a */
    public final boolean mo18351a() {
        return false;
    }

    @C4056a
    /* renamed from: a */
    public final boolean mo18352a(int i) {
        return Log.isLoggable(this.f13510a, i);
    }

    @C4056a
    /* renamed from: b */
    public final void mo18355b(String str, String str2, Object... objArr) {
        if (mo18352a(5)) {
            m18849a(str2, objArr);
        }
    }

    @C4056a
    /* renamed from: c */
    public final void mo18356c(String str, String str2) {
        if (mo18352a(4)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: d */
    public final void mo18358d(String str, String str2) {
        if (mo18351a()) {
            String valueOf = String.valueOf(str);
            String str3 = " PII_LOG";
            if (str3.length() != 0) {
                valueOf.concat(str3);
            } else {
                new String(valueOf);
            }
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: e */
    public final void mo18360e(String str, String str2) {
        if (mo18352a(2)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: f */
    public final void mo18362f(String str, String str2) {
        if (mo18352a(5)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: g */
    public final void mo18364g(String str, String str2, Throwable th) {
        if (mo18352a(7)) {
            m18848a(str2);
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: a */
    public final void mo18348a(String str, String str2) {
        if (mo18352a(3)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: b */
    public final void mo18353b(String str, String str2) {
        if (mo18352a(6)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: c */
    public final void mo18357c(String str, String str2, Throwable th) {
        if (mo18352a(4)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: d */
    public final void mo18359d(String str, String str2, Throwable th) {
        if (mo18351a()) {
            String valueOf = String.valueOf(str);
            String str3 = " PII_LOG";
            if (str3.length() != 0) {
                valueOf.concat(str3);
            } else {
                new String(valueOf);
            }
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: e */
    public final void mo18361e(String str, String str2, Throwable th) {
        if (mo18352a(2)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: f */
    public final void mo18363f(String str, String str2, Throwable th) {
        if (mo18352a(5)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: a */
    public final void mo18349a(String str, String str2, Throwable th) {
        if (mo18352a(3)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: b */
    public final void mo18354b(String str, String str2, Throwable th) {
        if (mo18352a(6)) {
            m18848a(str2);
        }
    }

    @C4056a
    /* renamed from: a */
    public final void mo18350a(String str, String str2, Object... objArr) {
        if (mo18352a(6)) {
            m18849a(str2, objArr);
        }
    }

    /* renamed from: a */
    private final String m18848a(String str) {
        String str2 = this.f13511b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    public C4366m(String str) {
        this(str, null);
    }

    /* renamed from: a */
    private final String m18849a(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.f13511b;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }
}
