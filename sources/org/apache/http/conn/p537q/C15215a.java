package org.apache.http.conn.p537q;

import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.p217i1.C14662d0;
import org.apache.http.conn.p538r.C15221a;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.conn.q.a */
/* compiled from: AbstractVerifier */
public abstract class C15215a implements C15220f {

    /* renamed from: a */
    private static final String[] f44120a = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};

    static {
        Arrays.sort(f44120a);
    }

    /* renamed from: b */
    public static String[] m67447b(X509Certificate x509Certificate) {
        return m67445a(x509Certificate, (String) null);
    }

    /* renamed from: c */
    private static boolean m67448c(String str) {
        return str != null && (C15221a.m67467a(str) || C15221a.m67468b(str));
    }

    /* renamed from: a */
    public final void mo47090a(String str, SSLSocket sSLSocket) throws IOException {
        if (str != null) {
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.getInputStream().available();
                session = sSLSocket.getSession();
                if (session == null) {
                    sSLSocket.startHandshake();
                    session = sSLSocket.getSession();
                }
            }
            mo47089a(str, (X509Certificate) session.getPeerCertificates()[0]);
            return;
        }
        throw new NullPointerException("host to verify is null");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            mo47089a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m67446b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo47089a(String str, X509Certificate x509Certificate) throws SSLException {
        mo47093a(str, m67444a(x509Certificate), m67445a(x509Certificate, str));
    }

    /* renamed from: a */
    public final void mo47091a(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                stringBuffer.append(" <");
                stringBuffer.append(lowerCase2);
                stringBuffer.append(C14662d0.f42854e);
                if (it.hasNext()) {
                    stringBuffer.append(" OR");
                }
                boolean z3 = true;
                if (lowerCase2.startsWith("*.") && lowerCase2.lastIndexOf(46) >= 0 && m67443a(lowerCase2) && !m67448c(str)) {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (!endsWith || !z) {
                        z2 = endsWith;
                        continue;
                    } else {
                        if (m67446b(lowerCase) != m67446b(lowerCase2)) {
                            z3 = false;
                        }
                        z2 = z3;
                        continue;
                    }
                } else {
                    z2 = lowerCase.equals(lowerCase2);
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (!z2) {
                StringBuilder sb = new StringBuilder();
                sb.append("hostname in certificate didn't match: <");
                sb.append(str);
                sb.append("> !=");
                sb.append(stringBuffer);
                throw new SSLException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate for <");
        sb2.append(str);
        sb2.append("> doesn't contain CN or DNS subjectAlt");
        throw new SSLException(sb2.toString());
    }

    /* renamed from: a */
    public static boolean m67443a(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i = length - 3;
        if (str.charAt(i) != '.') {
            return true;
        }
        if (Arrays.binarySearch(f44120a, str.substring(2, i)) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m67444a(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("CN=");
            if (indexOf >= 0) {
                linkedList.add(nextToken.substring(indexOf + 3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    private static String[] m67445a(X509Certificate x509Certificate, String str) {
        Collection<List> collection;
        int i = m67448c(str) ? 7 : 2;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Logger.getLogger(C15215a.class.getName()).log(Level.FINE, "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List list : collection) {
                if (((Integer) list.get(0)).intValue() == i) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }
}
