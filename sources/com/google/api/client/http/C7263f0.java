package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6397m0;

/* renamed from: com.google.api.client.http.f0 */
/* compiled from: MultipartContent */
public class C7263f0 extends C7252a {

    /* renamed from: d */
    static final String f20556d = "\r\n";

    /* renamed from: e */
    private static final String f20557e = "--";

    /* renamed from: c */
    private ArrayList<C7264a> f20558c = new ArrayList<>();

    /* renamed from: com.google.api.client.http.f0$a */
    /* compiled from: MultipartContent */
    public static final class C7264a {

        /* renamed from: a */
        C7295m f20559a;

        /* renamed from: b */
        C7299q f20560b;

        /* renamed from: c */
        C7296n f20561c;

        public C7264a() {
            this(null);
        }

        /* renamed from: a */
        public C7264a mo28887a(C7295m mVar) {
            this.f20559a = mVar;
            return this;
        }

        /* renamed from: b */
        public C7296n mo28891b() {
            return this.f20561c;
        }

        /* renamed from: c */
        public C7299q mo28892c() {
            return this.f20560b;
        }

        public C7264a(C7295m mVar) {
            this(null, mVar);
        }

        /* renamed from: a */
        public C7295m mo28890a() {
            return this.f20559a;
        }

        public C7264a(C7299q qVar, C7295m mVar) {
            mo28889a(qVar);
            mo28887a(mVar);
        }

        /* renamed from: a */
        public C7264a mo28889a(C7299q qVar) {
            this.f20560b = qVar;
            return this;
        }

        /* renamed from: a */
        public C7264a mo28888a(C7296n nVar) {
            this.f20561c = nVar;
            return this;
        }
    }

    public C7263f0() {
        super(new C7303s("multipart/related").mo29062a("boundary", "__END_OF_PART__"));
    }

    /* renamed from: b */
    public C7263f0 mo28884b(Collection<C7264a> collection) {
        this.f20558c = new ArrayList<>(collection);
        return this;
    }

    /* renamed from: f */
    public final String mo28885f() {
        return mo28856e().mo29065a("boundary");
    }

    /* renamed from: g */
    public final Collection<C7264a> mo28886g() {
        return Collections.unmodifiableCollection(this.f20558c);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        C6397m0 m0Var;
        long j;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, mo28855d());
        String f = mo28885f();
        Iterator it = this.f20558c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = f20557e;
            String str2 = f20556d;
            if (hasNext) {
                C7264a aVar = (C7264a) it.next();
                C7299q d = new C7299q().mo29016d(null);
                C7299q qVar = aVar.f20560b;
                if (qVar != null) {
                    d.mo29011a(qVar);
                }
                String str3 = "Content-Transfer-Encoding";
                d.mo29024h(null).mo29059z(null).mo29030k(null).mo29013b((Long) null).mo25098b(str3, (Object) null);
                C7295m mVar = aVar.f20559a;
                if (mVar != 0) {
                    d.mo25098b(str3, (Object) Arrays.asList(new String[]{"binary"}));
                    d.mo29030k(mVar.getType());
                    C7296n nVar = aVar.f20561c;
                    if (nVar == null) {
                        j = mVar.mo25634b();
                        m0Var = mVar;
                    } else {
                        d.mo29024h(nVar.getName());
                        C6397m0 oVar = new C7297o(mVar, nVar);
                        long a = C7252a.m34969a(mVar);
                        m0Var = oVar;
                        j = a;
                    }
                    if (j != -1) {
                        d.mo29013b(Long.valueOf(j));
                    }
                } else {
                    m0Var = 0;
                }
                outputStreamWriter.write(str);
                outputStreamWriter.write(f);
                outputStreamWriter.write(str2);
                C7299q.m35232a(d, null, null, outputStreamWriter);
                if (m0Var != 0) {
                    outputStreamWriter.write(str2);
                    outputStreamWriter.flush();
                    m0Var.writeTo(outputStream);
                }
                outputStreamWriter.write(str2);
            } else {
                outputStreamWriter.write(str);
                outputStreamWriter.write(f);
                outputStreamWriter.write(str);
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo25633a() {
        Iterator it = this.f20558c.iterator();
        while (it.hasNext()) {
            if (!((C7264a) it.next()).f20559a.mo25633a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public C7263f0 m35036a(C7303s sVar) {
        super.mo28853a(sVar);
        return this;
    }

    /* renamed from: a */
    public C7263f0 mo28881a(C7264a aVar) {
        this.f20558c.add(C6381h0.m29663a(aVar));
        return this;
    }

    /* renamed from: a */
    public C7263f0 mo28883a(Collection<? extends C7295m> collection) {
        this.f20558c = new ArrayList<>(collection.size());
        for (C7295m aVar : collection) {
            mo28881a(new C7264a(aVar));
        }
        return this;
    }

    /* renamed from: a */
    public C7263f0 mo28882a(String str) {
        mo28856e().mo29062a("boundary", (String) C6381h0.m29663a(str));
        return this;
    }
}
