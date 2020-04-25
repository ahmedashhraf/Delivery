package com.google.api.client.googleapis.json;

import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6292f.C6293a;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6398n;

/* renamed from: com.google.api.client.googleapis.json.a */
/* compiled from: GoogleJsonError */
public class C7245a extends C6288b {
    @C2768v

    /* renamed from: O */
    private List<C7246a> f20477O;
    @C2768v

    /* renamed from: P */
    private int f20478P;
    @C2768v

    /* renamed from: Q */
    private String f20479Q;

    /* renamed from: com.google.api.client.googleapis.json.a$a */
    /* compiled from: GoogleJsonError */
    public static class C7246a extends C6288b {
        @C2768v

        /* renamed from: O */
        private String f20480O;
        @C2768v

        /* renamed from: P */
        private String f20481P;
        @C2768v

        /* renamed from: Q */
        private String f20482Q;
        @C2768v

        /* renamed from: R */
        private String f20483R;
        @C2768v

        /* renamed from: S */
        private String f20484S;

        /* renamed from: a */
        public final void mo28784a(String str) {
            this.f20480O = str;
        }

        /* renamed from: c */
        public final void mo28786c(String str) {
            this.f20484S = str;
        }

        /* renamed from: d */
        public final void mo28787d(String str) {
            this.f20482Q = str;
        }

        /* renamed from: e */
        public final void mo28788e(String str) {
            this.f20481P = str;
        }

        /* renamed from: f */
        public final String mo28789f() {
            return this.f20480O;
        }

        /* renamed from: g */
        public final String mo28790g() {
            return this.f20483R;
        }

        /* renamed from: h */
        public final String mo28791h() {
            return this.f20484S;
        }

        /* renamed from: i */
        public final String mo28792i() {
            return this.f20482Q;
        }

        /* renamed from: j */
        public final String mo28793j() {
            return this.f20481P;
        }

        /* renamed from: b */
        public final void mo28785b(String str) {
            this.f20483R = str;
        }

        /* renamed from: b */
        public C7246a m34881b(String str, Object obj) {
            return (C7246a) super.m29152b(str, obj);
        }

        public C7246a clone() {
            return (C7246a) super.clone();
        }
    }

    static {
        C6398n.m29721b(C7246a.class);
    }

    /* renamed from: a */
    public static C7245a m34868a(C6290d dVar, C7309x xVar) throws IOException {
        return (C7245a) new C6293a(dVar).mo25508a(Collections.singleton("error")).mo25509a().mo25503a(xVar.mo29145b(), xVar.mo29146c(), C7245a.class);
    }

    /* renamed from: f */
    public final int mo28781f() {
        return this.f20478P;
    }

    /* renamed from: g */
    public final List<C7246a> mo28782g() {
        return this.f20477O;
    }

    /* renamed from: h */
    public final String mo28783h() {
        return this.f20479Q;
    }

    /* renamed from: a */
    public final void mo28780a(List<C7246a> list) {
        this.f20477O = list;
    }

    /* renamed from: b */
    public C7245a m34874b(String str, Object obj) {
        return (C7245a) super.m29152b(str, obj);
    }

    /* renamed from: a */
    public final void mo28778a(int i) {
        this.f20478P = i;
    }

    public C7245a clone() {
        return (C7245a) super.clone();
    }

    /* renamed from: a */
    public final void mo28779a(String str) {
        this.f20479Q = str;
    }
}
