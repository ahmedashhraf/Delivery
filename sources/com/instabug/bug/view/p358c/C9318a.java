package com.instabug.bug.view.p358c;

import androidx.annotation.C0193h0;
import androidx.annotation.C0213q;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"SE_TRANSIENT_FIELD_NOT_RESTORED"})
/* renamed from: com.instabug.bug.view.c.a */
/* compiled from: ActionItem */
public class C9318a implements Serializable {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f24687O;

    /* renamed from: N */
    private transient Runnable f24688N;

    /* renamed from: a */
    private String f24689a;

    /* renamed from: b */
    private int f24690b;

    public C9318a(String str, @C0213q int i, @C0193h0 Runnable runnable) {
        boolean[] f = m43641f();
        this.f24689a = str;
        this.f24688N = runnable;
        this.f24690b = i;
        f[0] = true;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m43641f() {
        boolean[] zArr = f24687O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3163971262873228901L, "com/instabug/bug/view/actionList/ActionItem", 7);
        f24687O = a;
        return a;
    }

    @C0193h0
    /* renamed from: a */
    public Runnable mo33720a() {
        boolean[] f = m43641f();
        Runnable runnable = this.f24688N;
        f[1] = true;
        return runnable;
    }

    /* renamed from: d */
    public String mo33721d() {
        boolean[] f = m43641f();
        String str = this.f24689a;
        f[2] = true;
        return str;
    }

    /* renamed from: e */
    public int mo33722e() {
        boolean[] f = m43641f();
        int i = this.f24690b;
        f[3] = true;
        return i;
    }
}
