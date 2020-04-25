package com.google.api.client.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p076c.p112d.p134b.p135a.p143g.C6362b;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6385j;
import p076c.p112d.p134b.p135a.p143g.C6387k;
import p076c.p112d.p134b.p135a.p143g.C6398n;
import p076c.p112d.p134b.p135a.p143g.C6406p0;
import p076c.p112d.p134b.p135a.p143g.C6409q0;
import p076c.p112d.p134b.p135a.p143g.C6412r;
import p076c.p112d.p134b.p135a.p143g.C6413s;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6417a;

/* renamed from: com.google.api.client.http.i0 */
/* compiled from: UrlEncodedParser */
public class C7273i0 implements C6372e0 {

    /* renamed from: a */
    public static final String f20574a = "application/x-www-form-urlencoded";

    /* renamed from: b */
    public static final String f20575b = new C7303s("application/x-www-form-urlencoded").mo29063a(C6385j.f17804a).mo29064a();

    /* renamed from: a */
    public static void m35101a(String str, Object obj) {
        if (str != null) {
            try {
                m35100a((Reader) new StringReader(str), obj);
            } catch (IOException e) {
                throw C6406p0.m29736a(e);
            }
        }
    }

    /* renamed from: a */
    public static void m35100a(Reader reader, Object obj) throws IOException {
        int read;
        Object obj2 = obj;
        Class cls = obj.getClass();
        C6387k a = C6387k.m29691a(cls);
        List asList = Arrays.asList(new Type[]{cls});
        C6413s sVar = C6413s.class.isAssignableFrom(cls) ? (C6413s) obj2 : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj2 : null;
        C6362b bVar = new C6362b(obj2);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            StringWriter stringWriter3 = stringWriter2;
            StringWriter stringWriter4 = stringWriter;
            boolean z = true;
            while (true) {
                read = reader.read();
                if (read == -1 || read == 38) {
                    String a2 = C6417a.m29796a(stringWriter4.toString());
                } else if (read == 61) {
                    z = false;
                } else if (z) {
                    stringWriter4.write(read);
                } else {
                    stringWriter3.write(read);
                }
            }
            String a22 = C6417a.m29796a(stringWriter4.toString());
            if (a22.length() != 0) {
                String a3 = C6417a.m29796a(stringWriter3.toString());
                C6412r b = a.mo25769b(a22);
                if (b != null) {
                    Type a4 = C6398n.m29717a(asList, b.mo25833d());
                    if (C6409q0.m29776d(a4)) {
                        Class a5 = C6409q0.m29763a(asList, C6409q0.m29769a(a4));
                        bVar.mo25747a(b.mo25832c(), a5, m35099a((Type) a5, asList, a3));
                    } else if (C6409q0.m29773a(C6409q0.m29763a(asList, a4), Iterable.class)) {
                        Collection collection = (Collection) b.mo25829a(obj2);
                        if (collection == null) {
                            collection = C6398n.m29722b(a4);
                            b.mo25830a(obj2, (Object) collection);
                        }
                        collection.add(m35099a(a4 == Object.class ? null : C6409q0.m29774b(a4), asList, a3));
                    } else {
                        b.mo25830a(obj2, m35099a(a4, asList, a3));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(a22);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (sVar != null) {
                            sVar.mo25098b(a22, arrayList);
                        } else {
                            map.put(a22, arrayList);
                        }
                    }
                    arrayList.add(a3);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (read != -1);
        bVar.mo25745a();
    }

    /* renamed from: a */
    private static Object m35099a(Type type, List<Type> list, String str) {
        return C6398n.m29716a(C6398n.m29717a(list, type), str);
    }

    /* renamed from: a */
    public <T> T mo25503a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo25505a((Reader) new InputStreamReader(inputStream, charset), cls);
    }

    /* renamed from: a */
    public Object mo25504a(InputStream inputStream, Charset charset, Type type) throws IOException {
        return mo25506a((Reader) new InputStreamReader(inputStream, charset), type);
    }

    /* renamed from: a */
    public <T> T mo25505a(Reader reader, Class<T> cls) throws IOException {
        return mo25506a(reader, (Type) cls);
    }

    /* renamed from: a */
    public Object mo25506a(Reader reader, Type type) throws IOException {
        C6381h0.m29667a(type instanceof Class, (Object) "dataType has to be of type Class<?>");
        Object a = C6409q0.m29766a((Class) type);
        m35100a((Reader) new BufferedReader(reader), a);
        return a;
    }
}
