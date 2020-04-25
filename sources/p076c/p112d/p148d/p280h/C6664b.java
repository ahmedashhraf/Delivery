package p076c.p112d.p148d.p280h;

import com.facebook.common.util.UriUtil;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.common.base.C5786c0;
import com.google.common.base.C5799e;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.collect.C5838k1;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C7859g3;
import com.google.common.collect.C7859g3.C7860a;
import com.google.common.collect.C8047m5;
import com.google.common.collect.C8068n3;
import com.google.common.collect.C8068n3.C8069a;
import com.google.common.collect.C8133r4;
import com.google.common.collect.C8302z2;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.jar.Attributes.Name;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.b */
/* compiled from: ClassPath */
public final class C6664b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f18639b = Logger.getLogger(C6664b.class.getName());

    /* renamed from: c */
    private static final C5831y<C6666b> f18640c = new C6665a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C5786c0 f18641d = C5786c0.m25369b(C3868i.f12248b).mo23072a();

    /* renamed from: e */
    private static final String f18642e = ".class";

    /* renamed from: a */
    private final C7859g3<C6667c> f18643a;

    /* renamed from: c.d.d.h.b$a */
    /* compiled from: ClassPath */
    static class C6665a implements C5831y<C6666b> {
        C6665a() {
        }

        /* renamed from: a */
        public boolean apply(C6666b bVar) {
            return bVar.f18644c.indexOf(36) == -1;
        }
    }

    @C2775a
    /* renamed from: c.d.d.h.b$b */
    /* compiled from: ClassPath */
    public static final class C6666b extends C6667c {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f18644c;

        C6666b(String str, ClassLoader classLoader) {
            super(str, classLoader);
            this.f18644c = C6664b.m31819c(str);
        }

        /* renamed from: c */
        public String mo26736c() {
            return this.f18644c;
        }

        /* renamed from: d */
        public String mo26737d() {
            return C6682h.m31922a(this.f18644c);
        }

        /* renamed from: e */
        public String mo26738e() {
            int lastIndexOf = this.f18644c.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return C5799e.f16734Q.mo23109j(this.f18644c.substring(lastIndexOf + 1));
            }
            String d = mo26737d();
            if (d.length() == 0) {
                return this.f18644c;
            }
            return this.f18644c.substring(d.length() + 1);
        }

        /* renamed from: f */
        public Class<?> mo26739f() {
            try {
                return this.f18646b.loadClass(this.f18644c);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }

        public String toString() {
            return this.f18644c;
        }
    }

    @C2775a
    /* renamed from: c.d.d.h.b$c */
    /* compiled from: ClassPath */
    public static class C6667c {

        /* renamed from: a */
        private final String f18645a;

        /* renamed from: b */
        final ClassLoader f18646b;

        C6667c(String str, ClassLoader classLoader) {
            this.f18645a = (String) C7397x.m35664a(str);
            this.f18646b = (ClassLoader) C7397x.m35664a(classLoader);
        }

        /* renamed from: a */
        static C6667c m31833a(String str, ClassLoader classLoader) {
            if (str.endsWith(C6664b.f18642e)) {
                return new C6666b(str, classLoader);
            }
            return new C6667c(str, classLoader);
        }

        /* renamed from: b */
        public final URL mo26742b() {
            return (URL) C7397x.m35666a(this.f18646b.getResource(this.f18645a), "Failed to load resource: %s", this.f18645a);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6667c)) {
                return false;
            }
            C6667c cVar = (C6667c) obj;
            if (!this.f18645a.equals(cVar.f18645a) || this.f18646b != cVar.f18646b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f18645a.hashCode();
        }

        public String toString() {
            return this.f18645a;
        }

        /* renamed from: a */
        public final String mo26741a() {
            return this.f18645a;
        }
    }

    @C2778d
    /* renamed from: c.d.d.h.b$d */
    /* compiled from: ClassPath */
    static final class C6668d {

        /* renamed from: a */
        private final C8069a<C6667c> f18647a = new C8069a<>(C8133r4.m38944k());

        /* renamed from: b */
        private final Set<URI> f18648b = C8047m5.m38530c();

        C6668d() {
        }

        /* renamed from: b */
        private void m31839b(File file, ClassLoader classLoader) throws IOException {
            m31838a(file, classLoader, "", C7859g3.m37512m());
        }

        /* renamed from: c */
        private void m31840c(File file, ClassLoader classLoader) throws IOException {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    Iterator it = m31836a(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        mo26747a((URI) it.next(), classLoader);
                    }
                    Enumeration entries = jarFile.entries();
                    while (entries.hasMoreElements()) {
                        JarEntry jarEntry = (JarEntry) entries.nextElement();
                        if (!jarEntry.isDirectory()) {
                            if (!jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
                                this.f18647a.m38637a((Object) C6667c.m31833a(jarEntry.getName(), classLoader));
                            }
                        }
                    }
                } finally {
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8068n3<C6667c> mo26745a() {
            return this.f18647a.m38640a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26747a(URI uri, ClassLoader classLoader) throws IOException {
            if (uri.getScheme().equals(UriUtil.LOCAL_FILE_SCHEME) && this.f18648b.add(uri)) {
                mo26746a(new File(uri), classLoader);
            }
        }

        /* access modifiers changed from: 0000 */
        @C2778d
        /* renamed from: a */
        public void mo26746a(File file, ClassLoader classLoader) throws IOException {
            if (file.exists()) {
                if (file.isDirectory()) {
                    m31839b(file, classLoader);
                } else {
                    m31840c(file, classLoader);
                }
            }
        }

        /* renamed from: a */
        private void m31838a(File file, ClassLoader classLoader, String str, C7859g3<File> g3Var) throws IOException {
            File canonicalFile = file.getCanonicalFile();
            if (!g3Var.contains(canonicalFile)) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    Logger d = C6664b.f18639b;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot read directory ");
                    sb.append(file);
                    d.warning(sb.toString());
                    return;
                }
                C7859g3 a = C7859g3.m37511l().m37520a((Iterable<? extends E>) g3Var).m37521a(canonicalFile).m37524a();
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    if (file2.isDirectory()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(name);
                        sb2.append("/");
                        m31838a(file2, classLoader, sb2.toString(), a);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(name);
                        String sb4 = sb3.toString();
                        if (!sb4.equals("META-INF/MANIFEST.MF")) {
                            this.f18647a.m38637a((Object) C6667c.m31833a(sb4, classLoader));
                        }
                    }
                }
            }
        }

        @C2778d
        /* renamed from: a */
        static C7859g3<URI> m31836a(File file, @C5952h Manifest manifest) {
            if (manifest == null) {
                return C7859g3.m37512m();
            }
            C7860a l = C7859g3.m37511l();
            String value = manifest.getMainAttributes().getValue(Name.CLASS_PATH.toString());
            if (value != null) {
                for (String str : C6664b.f18641d.mo23075a((CharSequence) value)) {
                    try {
                        l.m37521a(m31837a(file, str));
                    } catch (URISyntaxException unused) {
                        Logger d = C6664b.f18639b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid Class-Path entry: ");
                        sb.append(str);
                        d.warning(sb.toString());
                    }
                }
            }
            return l.m37524a();
        }

        @C2778d
        /* renamed from: a */
        static URI m31837a(File file, String str) throws URISyntaxException {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                return uri;
            }
            return new File(file.getParentFile(), str.replace('/', File.separatorChar)).toURI();
        }
    }

    private C6664b(C7859g3<C6667c> g3Var) {
        this.f18643a = g3Var;
    }

    /* renamed from: a */
    public static C6664b m31817a(ClassLoader classLoader) throws IOException {
        C6668d dVar = new C6668d();
        Iterator it = m31818b(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            dVar.mo26747a((URI) entry.getKey(), (ClassLoader) entry.getValue());
        }
        return new C6664b(dVar.mo26745a());
    }

    /* renamed from: b */
    public C7859g3<C6667c> mo26732b() {
        return this.f18643a;
    }

    /* renamed from: c */
    public C7859g3<C6666b> mo26734c() {
        return C5838k1.m25634a((Iterable<E>) this.f18643a).mo23204a(C6666b.class).mo23217c(f18640c).mo23222e();
    }

    @C2778d
    /* renamed from: c */
    static String m31819c(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    /* renamed from: b */
    public C7859g3<C6666b> mo26733b(String str) {
        C7397x.m35664a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        String sb2 = sb.toString();
        C7860a l = C7859g3.m37511l();
        Iterator it = mo26734c().iterator();
        while (it.hasNext()) {
            C6666b bVar = (C6666b) it.next();
            if (bVar.mo26736c().startsWith(sb2)) {
                l.m37521a(bVar);
            }
        }
        return l.m37524a();
    }

    /* renamed from: a */
    public C7859g3<C6666b> mo26730a() {
        return C5838k1.m25634a((Iterable<E>) this.f18643a).mo23204a(C6666b.class).mo23222e();
    }

    /* renamed from: a */
    public C7859g3<C6666b> mo26731a(String str) {
        C7397x.m35664a(str);
        C7860a l = C7859g3.m37511l();
        Iterator it = mo26734c().iterator();
        while (it.hasNext()) {
            C6666b bVar = (C6666b) it.next();
            if (bVar.mo26737d().equals(str)) {
                l.m37521a(bVar);
            }
        }
        return l.m37524a();
    }

    @C2778d
    /* renamed from: b */
    static C8302z2<URI, ClassLoader> m31818b(ClassLoader classLoader) {
        LinkedHashMap e = C7800f4.m37347e();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            e.putAll(m31818b(parent));
        }
        if (classLoader instanceof URLClassLoader) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            int length = uRLs.length;
            int i = 0;
            while (i < length) {
                try {
                    URI uri = uRLs[i].toURI();
                    if (!e.containsKey(uri)) {
                        e.put(uri, classLoader);
                    }
                    i++;
                } catch (URISyntaxException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
        }
        return C8302z2.m39622a(e);
    }
}
