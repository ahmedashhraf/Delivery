package com.google.android.gms.common.p169n;

import android.util.Log;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4366m;
import java.util.Locale;

@C4056a
/* renamed from: com.google.android.gms.common.n.a */
public class C4432a {

    /* renamed from: a */
    private final String f13598a;

    /* renamed from: b */
    private final String f13599b;

    /* renamed from: c */
    private final C4366m f13600c;

    /* renamed from: d */
    private final int f13601d;

    @C4056a
    public C4432a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append(']');
            sb.append(' ');
            str2 = sb.toString();
        }
        this(str, str2);
    }

    /* renamed from: f */
    private final String m19086f(String str, @C0195i0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f13599b.concat(str);
    }

    @C4056a
    /* renamed from: a */
    public void mo18431a(Throwable th) {
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18432a(int i) {
        return this.f13601d <= i;
    }

    @C4056a
    /* renamed from: b */
    public void mo18434b(String str, @C0195i0 Object... objArr) {
        m19086f(str, objArr);
    }

    @C4056a
    /* renamed from: c */
    public void mo18435c(String str, @C0195i0 Object... objArr) {
        m19086f(str, objArr);
    }

    @C4056a
    /* renamed from: d */
    public void mo18436d(String str, @C0195i0 Object... objArr) {
        if (mo18432a(2)) {
            m19086f(str, objArr);
        }
    }

    @C4056a
    /* renamed from: e */
    public void mo18437e(String str, @C0195i0 Object... objArr) {
        m19086f(str, objArr);
    }

    @C4056a
    /* renamed from: a */
    public void mo18430a(String str, @C0195i0 Object... objArr) {
        if (mo18432a(3)) {
            m19086f(str, objArr);
        }
    }

    @C4056a
    /* renamed from: b */
    public void mo18433b(String str, Throwable th, @C0195i0 Object... objArr) {
        m19086f(str, objArr);
    }

    @C4056a
    /* renamed from: a */
    public void mo18429a(String str, Throwable th, @C0195i0 Object... objArr) {
        m19086f(str, objArr);
    }

    private C4432a(String str, String str2) {
        this.f13599b = str2;
        this.f13598a = str;
        this.f13600c = new C4366m(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f13598a, i)) {
            i++;
        }
        this.f13601d = i;
    }
}
