package com.instabug.library.invocation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Invocation {

    /* renamed from: a */
    public static final int f26217a = 0;

    /* renamed from: b */
    public static final int f26218b = 1;

    /* renamed from: c */
    public static final int f26219c = 2;

    /* renamed from: d */
    public static final int f26220d = 3;

    /* renamed from: e */
    public static final int f26221e = 4;

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f26222f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface InvocationMode {
    }

    public Invocation() {
        m45984a()[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45984a() {
        boolean[] zArr = f26222f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2412772502877026893L, "com/instabug/library/invocation/Invocation", 1);
        f26222f = a;
        return a;
    }
}
