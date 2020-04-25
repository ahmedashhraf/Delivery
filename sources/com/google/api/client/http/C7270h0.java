package com.google.api.client.http;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map.Entry;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6398n;
import p076c.p112d.p134b.p135a.p143g.C6409q0;
import p076c.p112d.p134b.p135a.p143g.C6412r;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6417a;

/* renamed from: com.google.api.client.http.h0 */
/* compiled from: UrlEncodedContent */
public class C7270h0 extends C7252a {

    /* renamed from: c */
    private Object f20572c;

    public C7270h0(Object obj) {
        super(C7273i0.f20575b);
        mo28920a(obj);
    }

    /* renamed from: f */
    public final Object mo28921f() {
        return this.f20572c;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, mo28855d()));
        boolean z = true;
        for (Entry entry : C6398n.m29725d(this.f20572c).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String b = C6417a.m29797b((String) entry.getKey());
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object a : C6409q0.m29765a(value)) {
                        z = m35093a(z, bufferedWriter, b, a);
                    }
                } else {
                    z = m35093a(z, bufferedWriter, b, value);
                }
            }
        }
        bufferedWriter.flush();
    }

    /* renamed from: a */
    public C7270h0 m35095a(C7303s sVar) {
        super.mo28853a(sVar);
        return this;
    }

    /* renamed from: a */
    public C7270h0 mo28920a(Object obj) {
        this.f20572c = C6381h0.m29663a(obj);
        return this;
    }

    /* renamed from: a */
    public static C7270h0 m35092a(C7305u uVar) {
        C7295m e = uVar.mo29105e();
        if (e != null) {
            return (C7270h0) e;
        }
        C7270h0 h0Var = new C7270h0(new HashMap());
        uVar.mo29084a((C7295m) h0Var);
        return h0Var;
    }

    /* renamed from: a */
    private static boolean m35093a(boolean z, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !C6398n.m29723b(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String b = C6417a.m29797b(obj instanceof Enum ? C6412r.m29777a((Enum) obj).mo25834e() : obj.toString());
            if (b.length() != 0) {
                writer.write("=");
                writer.write(b);
            }
        }
        return z;
    }
}
