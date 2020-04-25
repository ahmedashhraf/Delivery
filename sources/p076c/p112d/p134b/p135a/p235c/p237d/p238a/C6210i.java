package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a.C6304a;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p228a.p230b.C6175a;
import p076c.p112d.p134b.p135a.p228a.p230b.C6175a.C6176a;

@C2766f
/* renamed from: c.d.b.a.c.d.a.i */
/* compiled from: GoogleIdToken */
public class C6210i extends C6175a {

    @C2766f
    /* renamed from: c.d.b.a.c.d.a.i$a */
    /* compiled from: GoogleIdToken */
    public static class C6211a extends C6176a {
        @C2768v("hd")

        /* renamed from: c0 */
        private String f17483c0;
        @C2768v("email")

        /* renamed from: d0 */
        private String f17484d0;
        @C2768v("email_verified")

        /* renamed from: e0 */
        private Object f17485e0;

        /* renamed from: i */
        public C6211a mo25294i(String str) {
            this.f17484d0 = str;
            return this;
        }

        /* renamed from: j */
        public C6211a mo25295j(String str) {
            this.f17483c0 = str;
            return this;
        }

        @Deprecated
        /* renamed from: k */
        public C6211a mo25296k(String str) {
            return mo25105f(str);
        }

        @Deprecated
        /* renamed from: l */
        public C6211a mo25297l(String str) {
            return m28699c(str);
        }

        /* renamed from: v */
        public String mo25298v() {
            return this.f17484d0;
        }

        /* renamed from: w */
        public Boolean mo25299w() {
            Object obj = this.f17485e0;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return Boolean.valueOf((String) obj);
        }

        /* renamed from: x */
        public String mo25300x() {
            return this.f17483c0;
        }

        @Deprecated
        /* renamed from: y */
        public String mo25301y() {
            return mo25110r();
        }

        @Deprecated
        /* renamed from: z */
        public String mo25302z() {
            return mo25581n();
        }

        /* renamed from: e */
        public C6211a m28706e(String str) {
            return (C6211a) super.mo25104e(str);
        }

        /* renamed from: f */
        public C6211a m28708f(String str) {
            return (C6211a) super.mo25105f(str);
        }

        /* renamed from: g */
        public C6211a m28710g(String str) {
            return (C6211a) super.mo25106g(str);
        }

        /* renamed from: h */
        public C6211a m28712h(String str) {
            return (C6211a) super.mo25107h(str);
        }

        /* renamed from: d */
        public C6211a m28702d(Long l) {
            return (C6211a) super.mo25102d(l);
        }

        /* renamed from: c */
        public C6211a m28696c(Long l) {
            return (C6211a) super.m28346c(l);
        }

        /* renamed from: d */
        public C6211a m28703d(String str) {
            return (C6211a) super.m28350d(str);
        }

        /* renamed from: a */
        public C6211a mo25293a(Boolean bool) {
            this.f17485e0 = bool;
            return this;
        }

        /* renamed from: c */
        public C6211a m28697c(String str) {
            return (C6211a) super.m28347c(str);
        }

        public C6211a clone() {
            return (C6211a) super.clone();
        }

        /* renamed from: a */
        public C6211a m28677a(List<String> list) {
            return (C6211a) super.mo25094a(list);
        }

        /* renamed from: a */
        public C6211a m28675a(Long l) {
            return (C6211a) super.m28332a(l);
        }

        /* renamed from: a */
        public C6211a m28676a(String str) {
            return (C6211a) super.m28333a(str);
        }

        /* renamed from: b */
        public C6211a m28684b(Long l) {
            return (C6211a) super.m28339b(l);
        }

        /* renamed from: b */
        public C6211a m28685b(Object obj) {
            return (C6211a) super.m28340b(obj);
        }

        /* renamed from: b */
        public C6211a m28686b(String str) {
            return (C6211a) super.m28341b(str);
        }

        /* renamed from: b */
        public C6211a m28687b(String str, Object obj) {
            return (C6211a) super.m28343b(str, obj);
        }
    }

    public C6210i(C6304a aVar, C6211a aVar2, byte[] bArr, byte[] bArr2) {
        super(aVar, aVar2, bArr, bArr2);
    }

    /* renamed from: a */
    public static C6210i m28666a(C6290d dVar, String str) throws IOException {
        C6303a a = C6303a.m29298a(dVar).mo25568b(C6211a.class).mo25565a(str);
        return new C6210i(a.m29303a(), (C6211a) a.mo25088b(), a.mo25542c(), a.mo25543d());
    }

    /* renamed from: a */
    public boolean mo25292a(C6212j jVar) throws GeneralSecurityException, IOException {
        return jVar.mo25304a(this);
    }

    /* renamed from: b */
    public C6211a m28669b() {
        return (C6211a) super.m28325b();
    }
}
