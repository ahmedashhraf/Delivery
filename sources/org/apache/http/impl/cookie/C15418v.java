package org.apache.http.impl.cookie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.v */
/* compiled from: PublicSuffixListParser */
public class C15418v {

    /* renamed from: b */
    private static final int f44551b = 256;

    /* renamed from: a */
    private final C15417u f44552a;

    C15418v(C15417u uVar) {
        this.f44552a = uVar;
    }

    /* renamed from: a */
    public void mo47683a(Reader reader) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder(256);
        boolean z = true;
        while (z) {
            z = m68343a(bufferedReader, sb);
            String sb2 = sb.toString();
            if (sb2.length() != 0 && !sb2.startsWith("//")) {
                if (sb2.startsWith(".")) {
                    sb2 = sb2.substring(1);
                }
                boolean startsWith = sb2.startsWith("!");
                if (startsWith) {
                    sb2 = sb2.substring(1);
                }
                if (startsWith) {
                    arrayList2.add(sb2);
                } else {
                    arrayList.add(sb2);
                }
            }
        }
        this.f44552a.mo47682b(arrayList);
        this.f44552a.mo47681a((Collection<String>) arrayList2);
    }

    /* renamed from: a */
    private boolean m68343a(Reader reader, StringBuilder sb) throws IOException {
        sb.setLength(0);
        boolean z = false;
        do {
            int read = reader.read();
            if (read != -1) {
                char c = (char) read;
                if (c != 10) {
                    if (Character.isWhitespace(c)) {
                        z = true;
                    }
                    if (!z) {
                        sb.append(c);
                    }
                }
            }
            if (read != -1) {
                return true;
            }
            return false;
        } while (sb.length() <= 256);
        throw new IOException("Line too long");
    }
}
