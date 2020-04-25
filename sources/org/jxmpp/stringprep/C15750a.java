package org.jxmpp.stringprep;

import p205i.p486d.p487a.p488c.C14056a;
import p205i.p486d.p487a.p488c.C14060c;

/* renamed from: org.jxmpp.stringprep.a */
/* compiled from: XmppStringPrepUtil */
public class C15750a {

    /* renamed from: a */
    private static final C14056a<String, String> f45028a = new C14060c(100);

    /* renamed from: b */
    private static final C14056a<String, String> f45029b = new C14060c(100);

    /* renamed from: c */
    private static final C14056a<String, String> f45030c = new C14060c(100);

    /* renamed from: d */
    private static C15751b f45031d;

    /* renamed from: a */
    public static void m68715a(C15751b bVar) {
        f45031d = bVar;
    }

    /* renamed from: b */
    public static String m68716b(String str) throws XmppStringprepException {
        if (f45031d == null) {
            return str;
        }
        m68718d(str);
        String str2 = (String) f45028a.get(str);
        if (str2 != null) {
            return str2;
        }
        String a = f45031d.mo51818a(str);
        f45028a.put(str, a);
        return a;
    }

    /* renamed from: c */
    public static String m68717c(String str) throws XmppStringprepException {
        if (f45031d == null) {
            return str;
        }
        m68718d(str);
        String str2 = (String) f45030c.get(str);
        if (str2 != null) {
            return str2;
        }
        String b = f45031d.mo51819b(str);
        f45030c.put(str, b);
        return b;
    }

    /* renamed from: d */
    private static void m68718d(String str) throws XmppStringprepException {
        if (str.length() == 0) {
            throw new XmppStringprepException(str, "Argument can't be the empty string");
        }
    }

    /* renamed from: a */
    public static String m68713a(String str) throws XmppStringprepException {
        if (f45031d == null) {
            return str;
        }
        m68718d(str);
        String str2 = (String) f45029b.get(str);
        if (str2 != null) {
            return str2;
        }
        String c = f45031d.mo51820c(str);
        f45029b.put(str, c);
        return c;
    }

    /* renamed from: a */
    public static void m68714a(int i) {
        f45028a.mo44384a(i);
        f45029b.mo44384a(i);
        f45030c.mo44384a(i);
    }
}
