package org.apache.http.impl.auth;

import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.C5785c;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.apache.http.C15133c;
import org.apache.http.C15463o;
import org.apache.http.C15472x;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15124g;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.p528k.C15130c;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15329f;
import org.apache.http.p547h0.C15337n;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p550k0.C15454b;
import org.apache.http.p550k0.C15455c;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.AuthMechanism;
import org.jivesoftware.smack.util.StringUtils;
import p212io.fabric.sdk.android.services.network.HttpRequest;

@C6145c
/* renamed from: org.apache.http.impl.auth.d */
/* compiled from: DigestScheme */
public class C15363d extends C15368h {

    /* renamed from: f */
    private static final char[] f44441f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g */
    private static final String f44442g = "00000001";

    /* renamed from: h */
    private static final int f44443h = 0;

    /* renamed from: i */
    private static final int f44444i = 1;

    /* renamed from: j */
    private static final int f44445j = 2;

    /* renamed from: c */
    private boolean f44446c = false;

    /* renamed from: d */
    private int f44447d = 0;

    /* renamed from: e */
    private String f44448e;

    /* renamed from: g */
    public static String m68062g() {
        return m68059a(m68060a(StringUtils.MD5).digest(C15455c.m68495a(Long.toString(System.currentTimeMillis()))));
    }

    /* renamed from: h */
    private String m68063h() {
        if (this.f44448e == null) {
            this.f44448e = m68062g();
        }
        return this.f44448e;
    }

    /* renamed from: i */
    private String m68064i() {
        return this.f44447d == 1 ? "auth-int" : AuthMechanism.ELEMENT;
    }

    /* renamed from: a */
    public void mo46868a(C15133c cVar) throws MalformedChallengeException {
        super.mo46868a(cVar);
        if (mo46869b("realm") == null) {
            throw new MalformedChallengeException("missing realm in challange");
        } else if (mo46869b("nonce") != null) {
            boolean z = false;
            String b = mo46869b("qop");
            if (b != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(b, ",");
                while (true) {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String trim = stringTokenizer.nextToken().trim();
                    if (trim.equals(AuthMechanism.ELEMENT)) {
                        this.f44447d = 2;
                        break;
                    } else if (trim.equals("auth-int")) {
                        this.f44447d = 1;
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || this.f44447d != 0) {
                this.f44448e = null;
                this.f44446c = true;
                return;
            }
            throw new MalformedChallengeException("None of the qop methods is supported");
        } else {
            throw new MalformedChallengeException("missing nonce in challange");
        }
    }

    /* renamed from: b */
    public boolean mo46870b() {
        return false;
    }

    /* renamed from: c */
    public String mo46871c() {
        return "digest";
    }

    /* renamed from: d */
    public boolean mo46872d() {
        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(mo46869b("stale"))) {
            return false;
        }
        return this.f44446c;
    }

    /* renamed from: a */
    public void mo47571a(String str, String str2) {
        mo47574f().put(str, str2);
    }

    /* renamed from: a */
    public C15133c mo46867a(C15124g gVar, C15463o oVar) throws AuthenticationException {
        if (gVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (oVar != null) {
            mo47574f().put("methodname", oVar.mo46956h().mo46855e());
            mo47574f().put(ShareConstants.MEDIA_URI, oVar.mo46956h().mo46856f());
            String str = HttpRequest.f42450O;
            if (mo46869b(str) == null) {
                mo47574f().put(str, C15130c.m67197a(oVar.getParams()));
            }
            return m68061a(gVar, m68058a(gVar));
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    /* renamed from: a */
    private static MessageDigest m68060a(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported algorithm in HTTP Digest authentication: ");
            sb.append(str);
            throw new UnsupportedDigestAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    private String m68058a(C15124g gVar) throws AuthenticationException {
        String str;
        String b = mo46869b(ShareConstants.MEDIA_URI);
        String b2 = mo46869b("realm");
        String b3 = mo46869b("nonce");
        String b4 = mo46869b("methodname");
        String b5 = mo46869b("algorithm");
        if (b == null) {
            throw new IllegalStateException("URI may not be null");
        } else if (b2 == null) {
            throw new IllegalStateException("Realm may not be null");
        } else if (b3 != null) {
            String str2 = StringUtils.MD5;
            if (b5 == null) {
                b5 = str2;
            }
            String b6 = mo46869b(HttpRequest.f42450O);
            if (b6 == null) {
                b6 = "ISO-8859-1";
            }
            if (this.f44447d != 1) {
                String str3 = "MD5-sess";
                if (!b5.equalsIgnoreCase(str3)) {
                    str2 = b5;
                }
                MessageDigest a = m68060a(str2);
                String name = gVar.mo46891a().getName();
                String b7 = gVar.mo46892b();
                StringBuilder sb = new StringBuilder(name.length() + b2.length() + b7.length() + 2);
                sb.append(name);
                sb.append(':');
                sb.append(b2);
                sb.append(':');
                sb.append(b7);
                String sb2 = sb.toString();
                if (b5.equalsIgnoreCase(str3)) {
                    String h = m68063h();
                    String a2 = m68059a(a.digest(C15455c.m68496a(sb2, b6)));
                    StringBuilder sb3 = new StringBuilder(a2.length() + b3.length() + h.length() + 2);
                    sb3.append(a2);
                    sb3.append(':');
                    sb3.append(b3);
                    sb3.append(':');
                    sb3.append(h);
                    sb2 = sb3.toString();
                }
                String a3 = m68059a(a.digest(C15455c.m68496a(sb2, b6)));
                String str4 = null;
                if (this.f44447d != 1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(b4);
                    sb4.append(':');
                    sb4.append(b);
                    str4 = sb4.toString();
                }
                String a4 = m68059a(a.digest(C15455c.m68495a(str4)));
                if (this.f44447d == 0) {
                    StringBuilder sb5 = new StringBuilder(a3.length() + b3.length() + a3.length());
                    sb5.append(a3);
                    sb5.append(':');
                    sb5.append(b3);
                    sb5.append(':');
                    sb5.append(a4);
                    str = sb5.toString();
                } else {
                    String i = m68064i();
                    String h2 = m68063h();
                    StringBuilder sb6 = new StringBuilder(a3.length() + b3.length() + 8 + h2.length() + i.length() + a4.length() + 5);
                    sb6.append(a3);
                    sb6.append(':');
                    sb6.append(b3);
                    sb6.append(':');
                    sb6.append(f44442g);
                    sb6.append(':');
                    sb6.append(h2);
                    sb6.append(':');
                    sb6.append(i);
                    sb6.append(':');
                    sb6.append(a4);
                    str = sb6.toString();
                }
                return m68059a(a.digest(C15455c.m68495a(str)));
            }
            throw new AuthenticationException("Unsupported qop in HTTP Digest authentication");
        } else {
            throw new IllegalStateException("Nonce may not be null");
        }
    }

    /* renamed from: a */
    private C15133c m68061a(C15124g gVar, String str) {
        C15454b bVar = new C15454b(128);
        if (mo47569e()) {
            bVar.mo47757a("Proxy-Authorization");
        } else {
            bVar.mo47757a("Authorization");
        }
        bVar.mo47757a(": Digest ");
        String str2 = ShareConstants.MEDIA_URI;
        String b = mo46869b(str2);
        String str3 = "realm";
        String b2 = mo46869b(str3);
        String str4 = "nonce";
        String b3 = mo46869b(str4);
        String str5 = "opaque";
        String b4 = mo46869b(str5);
        String str6 = "algorithm";
        String b5 = mo46869b(str6);
        String name = gVar.mo46891a().getName();
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new C15337n("username", name));
        arrayList.add(new C15337n(str3, b2));
        arrayList.add(new C15337n(str4, b3));
        arrayList.add(new C15337n(str2, b));
        arrayList.add(new C15337n("response", str));
        String str7 = "nc";
        String str8 = "qop";
        if (this.f44447d != 0) {
            arrayList.add(new C15337n(str8, m68064i()));
            arrayList.add(new C15337n(str7, f44442g));
            arrayList.add(new C15337n("cnonce", m68063h()));
        }
        if (b5 != null) {
            arrayList.add(new C15337n(str6, b5));
        }
        if (b4 != null) {
            arrayList.add(new C15337n(str5, b4));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C15337n nVar = (C15337n) arrayList.get(i);
            if (i > 0) {
                bVar.mo47757a(", ");
            }
            C15329f.f44377a.mo47446a(bVar, (C15472x) nVar, !(str7.equals(nVar.getName()) || str8.equals(nVar.getName())));
        }
        return new C15341r(bVar);
    }

    /* renamed from: a */
    private static String m68059a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i] & C5785c.f16698q;
            int i2 = (bArr[i] & 240) >> 4;
            int i3 = i * 2;
            char[] cArr2 = f44441f;
            cArr[i3] = cArr2[i2];
            cArr[i3 + 1] = cArr2[b];
        }
        return new String(cArr);
    }
}
