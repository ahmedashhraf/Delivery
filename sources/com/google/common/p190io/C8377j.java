package com.google.common.p190io;

import com.google.common.base.C5785c;
import com.google.common.base.C5786c0;
import com.google.common.base.C7397x;
import com.google.common.collect.C7603c;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8309z3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.io.j */
/* compiled from: CharSource */
public abstract class C8377j implements C8421u<Reader> {

    /* renamed from: com.google.common.io.j$a */
    /* compiled from: CharSource */
    private static class C8378a extends C8377j {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final C5786c0 f22273b = C5786c0.m25364a(Pattern.compile("\r\n|\n|\r"));
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final CharSequence f22274a;

        /* renamed from: com.google.common.io.j$a$a */
        /* compiled from: CharSource */
        class C8379a implements Iterable<String> {

            /* renamed from: com.google.common.io.j$a$a$a */
            /* compiled from: CharSource */
            class C8380a extends C7603c<String> {

                /* renamed from: N */
                Iterator<String> f22276N = C8378a.f22273b.mo23075a(C8378a.this.f22274a).iterator();

                C8380a() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public String m39863b() {
                    if (this.f22276N.hasNext()) {
                        String str = (String) this.f22276N.next();
                        if (this.f22276N.hasNext() || str.length() != 0) {
                            return str;
                        }
                    }
                    return (String) mo29793c();
                }
            }

            C8379a() {
            }

            public Iterator<String> iterator() {
                return new C8380a();
            }
        }

        protected C8378a(CharSequence charSequence) {
            this.f22274a = (CharSequence) C7397x.m35664a(charSequence);
        }

        /* renamed from: j */
        private Iterable<String> m39854j() {
            return new C8379a();
        }

        /* renamed from: b */
        public boolean mo31498b() {
            return this.f22274a.length() == 0;
        }

        /* renamed from: d */
        public Reader mo31462d() {
            return new C8375h(this.f22274a);
        }

        /* renamed from: e */
        public String mo31500e() {
            return this.f22274a.toString();
        }

        /* renamed from: f */
        public String mo31501f() {
            Iterator it = m39854j().iterator();
            if (it.hasNext()) {
                return (String) it.next();
            }
            return null;
        }

        /* renamed from: g */
        public C8257x2<String> mo31502g() {
            return C8257x2.m39392a(m39854j());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharSource.wrap(");
            sb.append(C5785c.m25355a(this.f22274a, 30, "..."));
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo31455a() throws IOException {
            return C8377j.super.m39844a();
        }

        /* renamed from: a */
        public <T> T mo31497a(C8423w<T> wVar) throws IOException {
            for (String a : m39854j()) {
                if (!wVar.mo31447a(a)) {
                    break;
                }
            }
            return wVar.getResult();
        }
    }

    /* renamed from: com.google.common.io.j$b */
    /* compiled from: CharSource */
    private static final class C8381b extends C8377j {

        /* renamed from: a */
        private final Iterable<? extends C8377j> f22278a;

        C8381b(Iterable<? extends C8377j> iterable) {
            this.f22278a = (Iterable) C7397x.m35664a(iterable);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo31455a() throws IOException {
            return C8377j.super.m39844a();
        }

        /* renamed from: b */
        public boolean mo31498b() throws IOException {
            for (C8377j b : this.f22278a) {
                if (!b.mo31498b()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public Reader mo31462d() throws IOException {
            return new C8347b0(this.f22278a.iterator());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharSource.concat(");
            sb.append(this.f22278a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.j$c */
    /* compiled from: CharSource */
    private static final class C8382c extends C8378a {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final C8382c f22279c = new C8382c();

        private C8382c() {
            super("");
        }

        public String toString() {
            return "CharSource.empty()";
        }
    }

    protected C8377j() {
    }

    /* renamed from: h */
    public static C8377j m39840h() {
        return C8382c.f22279c;
    }

    /* renamed from: b */
    public boolean mo31498b() throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            boolean z = ((Reader) a.mo31523a(mo31462d())).read() == -1;
            a.close();
            return z;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: c */
    public BufferedReader mo31499c() throws IOException {
        Reader d = mo31462d();
        return d instanceof BufferedReader ? (BufferedReader) d : new BufferedReader(d);
    }

    /* renamed from: d */
    public abstract Reader mo31462d() throws IOException;

    /* renamed from: e */
    public String mo31500e() throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            String c = C8383k.m39889c((Readable) (Reader) a.mo31523a(mo31462d()));
            a.close();
            return c;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    @C5952h
    /* renamed from: f */
    public String mo31501f() throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            String readLine = ((BufferedReader) a.mo31523a(mo31499c())).readLine();
            a.close();
            return readLine;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: g */
    public C8257x2<String> mo31502g() throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            BufferedReader bufferedReader = (BufferedReader) a.mo31523a(mo31499c());
            ArrayList a2 = C8309z3.m39648a();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    a2.add(readLine);
                } else {
                    C8257x2<String> a3 = C8257x2.m39405a((Collection<? extends E>) a2);
                    a.close();
                    return a3;
                }
            }
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final Reader m39844a() throws IOException {
        return mo31462d();
    }

    /* renamed from: a */
    public long mo31496a(Appendable appendable) throws IOException {
        C7397x.m35664a(appendable);
        C8390m a = C8390m.m39900a();
        try {
            long a2 = C8383k.m39870a((Readable) (Reader) a.mo31523a(mo31462d()), appendable);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public long mo31495a(C8376i iVar) throws IOException {
        C7397x.m35664a(iVar);
        C8390m a = C8390m.m39900a();
        try {
            long a2 = C8383k.m39870a((Readable) (Reader) a.mo31523a(mo31462d()), (Appendable) (Writer) a.mo31523a(iVar.mo31445c()));
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    @C2775a
    /* renamed from: a */
    public <T> T mo31497a(C8423w<T> wVar) throws IOException {
        C7397x.m35664a(wVar);
        C8390m a = C8390m.m39900a();
        try {
            T a2 = C8383k.m39884a((Readable) (Reader) a.mo31523a(mo31462d()), wVar);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static C8377j m39837a(Iterable<? extends C8377j> iterable) {
        return new C8381b(iterable);
    }

    /* renamed from: a */
    public static C8377j m39838a(Iterator<? extends C8377j> it) {
        return m39837a((Iterable<? extends C8377j>) C8257x2.m39406a(it));
    }

    /* renamed from: a */
    public static C8377j m39839a(C8377j... jVarArr) {
        return m39837a((Iterable<? extends C8377j>) C8257x2.m39410c(jVarArr));
    }

    /* renamed from: a */
    public static C8377j m39836a(CharSequence charSequence) {
        return new C8378a(charSequence);
    }
}
