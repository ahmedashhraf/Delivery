package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Pattern;

/* renamed from: i.b.a.a.c.j.c.f.n */
/* compiled from: SignatureRemover */
public class C14028n {

    /* renamed from: b */
    private static final Pattern f41221b = Pattern.compile("META-INF/[^/]*\\.SF|META-INF/[^/]*\\.DSA|META-INF/[^/]*\\.RSA|META-INF/SIG-[^/]*");

    /* renamed from: c */
    private static final String f41222c = "META-INF/MANIFEST.MF";

    /* renamed from: d */
    private static final String f41223d = "-Digest";

    /* renamed from: a */
    private boolean f41224a = true;

    /* renamed from: a */
    public void mo44316a(boolean z) {
        this.f41224a = z;
    }

    /* renamed from: a */
    public boolean mo44317a(String str) {
        return this.f41224a && f41221b.matcher(str).matches();
    }

    /* renamed from: a */
    public boolean mo44318a(String str, InputStream inputStream, OutputStream outputStream) throws IOException {
        if (!this.f41224a || !f41222c.equals(str)) {
            return false;
        }
        Manifest manifest = new Manifest(inputStream);
        m60518a(manifest.getEntries().values());
        manifest.write(outputStream);
        return true;
    }

    /* renamed from: a */
    private void m60518a(Collection<Attributes> collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Attributes attributes = (Attributes) it.next();
            m60519a(attributes);
            if (attributes.isEmpty()) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private void m60519a(Attributes attributes) {
        Iterator it = attributes.keySet().iterator();
        while (it.hasNext()) {
            if (String.valueOf(it.next()).endsWith(f41223d)) {
                it.remove();
            }
        }
    }
}
