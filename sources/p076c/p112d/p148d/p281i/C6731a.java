package p076c.p112d.p148d.p281i;

import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.util.StringUtils;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p275b.C6517f;
import p076c.p112d.p148d.p275b.C6519g;
import p076c.p112d.p148d.p275b.C6519g.C6522c;

@C2776b
@C2775a
/* renamed from: c.d.d.i.a */
/* compiled from: XmlEscapers */
public class C6731a {

    /* renamed from: a */
    private static final char f18708a = '\u0000';

    /* renamed from: b */
    private static final char f18709b = '\u001f';

    /* renamed from: c */
    private static final C6517f f18710c;

    /* renamed from: d */
    private static final C6517f f18711d;

    /* renamed from: e */
    private static final C6517f f18712e;

    static {
        C6522c a = C6519g.m30999a();
        a.mo26411a(0, 65535);
        String str = "";
        a.mo26413a(str);
        for (char c = 0; c <= 31; c = (char) (c + 1)) {
            if (!(c == 9 || c == 10 || c == 13)) {
                a.mo26412a(c, str);
            }
        }
        a.mo26412a((char) C14662d0.f42852c, StringUtils.AMP_ENCODE);
        a.mo26412a((char) C14662d0.f42853d, StringUtils.LT_ENCODE);
        a.mo26412a((char) C14662d0.f42854e, StringUtils.GT_ENCODE);
        f18711d = a.mo26410a();
        a.mo26412a('\'', StringUtils.APOS_ENCODE);
        a.mo26412a((char) C14662d0.f42850a, StringUtils.QUOTE_ENCODE);
        f18710c = a.mo26410a();
        a.mo26412a(9, "&#x9;");
        a.mo26412a(10, "&#xA;");
        a.mo26412a(13, "&#xD;");
        f18712e = a.mo26410a();
    }

    private C6731a() {
    }

    /* renamed from: a */
    public static C6517f m32121a() {
        return f18712e;
    }

    /* renamed from: b */
    public static C6517f m32122b() {
        return f18711d;
    }
}
