package org.apache.http.p550k0;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.C15236d;
import org.apache.http.C15423j;
import org.apache.http.C15472x;
import org.apache.http.ParseException;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: org.apache.http.k0.d */
/* compiled from: EntityUtils */
public final class C15456d {
    private C15456d() {
    }

    /* renamed from: a */
    public static String m68497a(C15423j jVar) throws ParseException {
        if (jVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        } else if (jVar.getContentType() == null) {
            return null;
        } else {
            C15236d[] b = jVar.getContentType().mo46915b();
            if (b.length <= 0) {
                return null;
            }
            C15472x a = b[0].mo47151a(HttpRequest.f42450O);
            if (a != null) {
                return a.getValue();
            }
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static byte[] m68499b(C15423j jVar) throws IOException {
        if (jVar != null) {
            InputStream content = jVar.getContent();
            if (content == null) {
                return new byte[0];
            }
            if (jVar.getContentLength() <= 2147483647L) {
                int contentLength = (int) jVar.getContentLength();
                if (contentLength < 0) {
                    contentLength = 4096;
                }
                C15453a aVar = new C15453a(contentLength);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = content.read(bArr);
                        if (read != -1) {
                            aVar.mo47741a(bArr, 0, read);
                        } else {
                            content.close();
                            return aVar.mo47751g();
                        }
                    }
                } catch (Throwable th) {
                    content.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }

    /* renamed from: c */
    public static String m68500c(C15423j jVar) throws IOException, ParseException {
        return m68498a(jVar, null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m68498a(C15423j jVar, String str) throws IOException, ParseException {
        if (jVar != null) {
            InputStream content = jVar.getContent();
            if (content == null) {
                return "";
            }
            if (jVar.getContentLength() <= 2147483647L) {
                int contentLength = (int) jVar.getContentLength();
                if (contentLength < 0) {
                    contentLength = 4096;
                }
                String a = m68497a(jVar);
                if (a == null) {
                    a = str;
                }
                if (a == null) {
                    a = "ISO-8859-1";
                }
                InputStreamReader inputStreamReader = new InputStreamReader(content, a);
                C15454b bVar = new C15454b(contentLength);
                try {
                    char[] cArr = new char[1024];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            bVar.mo47762a(cArr, 0, read);
                        } else {
                            inputStreamReader.close();
                            return bVar.toString();
                        }
                    }
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
            }
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }
}
