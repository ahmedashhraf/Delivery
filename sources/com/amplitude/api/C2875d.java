package com.amplitude.api;

import android.util.Log;

/* renamed from: com.amplitude.api.d */
/* compiled from: AmplitudeLog */
public class C2875d {

    /* renamed from: c */
    protected static C2875d f10089c = new C2875d();

    /* renamed from: a */
    private volatile boolean f10090a = true;

    /* renamed from: b */
    private volatile int f10091b = 4;

    private C2875d() {
    }

    /* renamed from: a */
    public static C2875d m13566a() {
        return f10089c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo11292b(String str, String str2) {
        if (!this.f10090a || this.f10091b > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo11295c(String str, String str2) {
        if (!this.f10090a || this.f10091b > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo11297d(String str, String str2) {
        if (!this.f10090a || this.f10091b > 2) {
            return 0;
        }
        return Log.v(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo11299e(String str, String str2) {
        if (!this.f10090a || this.f10091b > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo11301f(String str, String str2) {
        if (!this.f10090a || this.f10091b > 7) {
            return 0;
        }
        return Log.wtf(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2875d mo11289a(boolean z) {
        this.f10090a = z;
        return f10089c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo11293b(String str, String str2, Throwable th) {
        if (!this.f10090a || this.f10091b > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo11296c(String str, String str2, Throwable th) {
        if (!this.f10090a || this.f10091b > 4) {
            return 0;
        }
        return Log.i(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo11298d(String str, String str2, Throwable th) {
        if (!this.f10090a || this.f10091b > 2) {
            return 0;
        }
        return Log.v(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo11300e(String str, String str2, Throwable th) {
        if (!this.f10090a || this.f10091b > 5) {
            return 0;
        }
        return Log.w(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo11302f(String str, String str2, Throwable th) {
        if (!this.f10090a || this.f10091b > 7) {
            return 0;
        }
        return Log.wtf(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo11294b(String str, Throwable th) {
        if (!this.f10090a || this.f10091b > 7) {
            return 0;
        }
        return Log.wtf(str, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2875d mo11288a(int i) {
        this.f10091b = i;
        return f10089c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11285a(String str, String str2) {
        if (!this.f10090a || this.f10091b > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11286a(String str, String str2, Throwable th) {
        if (!this.f10090a || this.f10091b > 3) {
            return 0;
        }
        return Log.d(str, str2, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo11290a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo11291a(String str, int i) {
        return Log.isLoggable(str, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11284a(int i, String str, String str2) {
        return Log.println(i, str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11287a(String str, Throwable th) {
        if (!this.f10090a || this.f10091b > 5) {
            return 0;
        }
        return Log.w(str, th);
    }
}
