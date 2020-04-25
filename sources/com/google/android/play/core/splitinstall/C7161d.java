package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.splitinstall.d */
public class C7161d {

    /* renamed from: a */
    private final List<String> f20272a;

    /* renamed from: b */
    private final List<Locale> f20273b;

    /* renamed from: com.google.android.play.core.splitinstall.d$a */
    public static class C7162a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f20274a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<Locale> f20275b;

        private C7162a() {
            this.f20274a = new ArrayList();
            this.f20275b = new ArrayList();
        }

        /* synthetic */ C7162a(byte b) {
            this();
        }

        /* renamed from: a */
        public C7162a mo28590a(String str) {
            this.f20274a.add(str);
            return this;
        }

        /* renamed from: a */
        public C7162a mo28591a(Locale locale) {
            this.f20275b.add(locale);
            return this;
        }

        /* renamed from: a */
        public C7161d mo28592a() {
            return new C7161d(this, 0);
        }
    }

    private C7161d(C7162a aVar) {
        this.f20272a = new ArrayList(aVar.f20274a);
        this.f20273b = new ArrayList(aVar.f20275b);
    }

    /* synthetic */ C7161d(C7162a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: c */
    public static C7162a m34415c() {
        return new C7162a(0);
    }

    /* renamed from: a */
    public List<Locale> mo28587a() {
        return this.f20273b;
    }

    /* renamed from: b */
    public List<String> mo28588b() {
        return this.f20272a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f20272a, this.f20273b});
    }
}
