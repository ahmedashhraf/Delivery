package org.jxmpp.stringprep.p559c;

import java.util.Locale;
import kotlin.p217i1.C14662d0;
import org.jxmpp.stringprep.C15750a;
import org.jxmpp.stringprep.C15751b;
import org.jxmpp.stringprep.XmppStringprepException;

/* renamed from: org.jxmpp.stringprep.c.a */
/* compiled from: SimpleXmppStringprep */
public class C15752a implements C15751b {

    /* renamed from: a */
    private static C15752a f45032a;

    /* renamed from: b */
    private static final char[] f45033b = {C14662d0.f42850a, C14662d0.f42852c, '\'', '/', ',', C14662d0.f42853d, C14662d0.f42854e, '@', ' '};

    private C15752a() {
    }

    /* renamed from: a */
    public static C15752a m68722a() {
        if (f45032a == null) {
            f45032a = new C15752a();
        }
        return f45032a;
    }

    /* renamed from: b */
    public static void m68723b() {
        C15750a.m68715a((C15751b) m68722a());
    }

    /* renamed from: d */
    private static String m68724d(String str) {
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public String mo51819b(String str) throws XmppStringprepException {
        return str;
    }

    /* renamed from: c */
    public String mo51820c(String str) throws XmppStringprepException {
        return m68724d(str);
    }

    /* renamed from: a */
    public String mo51818a(String str) throws XmppStringprepException {
        char[] charArray;
        String d = m68724d(str);
        for (char c : d.toCharArray()) {
            char[] cArr = f45033b;
            int length = cArr.length;
            int i = 0;
            while (i < length) {
                char c2 = cArr[i];
                if (c != c2) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Localpart must not contain '");
                    sb.append(c2);
                    sb.append("'");
                    throw new XmppStringprepException(d, sb.toString());
                }
            }
        }
        return d;
    }
}
