package kotlin.p217i1;

import kotlin.C14737p0;
import kotlin.C6096e0;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.i1.w */
/* compiled from: StringBuilder.kt */
class C6109w extends C6108v {
    @C6041f
    /* renamed from: a */
    private static final String m27829a(C6080l<? super StringBuilder, C14737p0> lVar) {
        StringBuilder sb = new StringBuilder();
        lVar.invoke(sb);
        String sb2 = sb.toString();
        C14445h0.m62453a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final String m27828a(int i, C6080l<? super StringBuilder, C14737p0> lVar) {
        StringBuilder sb = new StringBuilder(i);
        lVar.invoke(sb);
        String sb2 = sb.toString();
        C14445h0.m62453a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @C6003d
    /* renamed from: a */
    public static final <T extends Appendable> T m27827a(@C6003d T t, @C6003d CharSequence... charSequenceArr) {
        C14445h0.m62478f(t, "$receiver");
        C14445h0.m62478f(charSequenceArr, "value");
        for (CharSequence append : charSequenceArr) {
            t.append(append);
        }
        return t;
    }

    @C6003d
    /* renamed from: a */
    public static final StringBuilder m27831a(@C6003d StringBuilder sb, @C6003d String... strArr) {
        C14445h0.m62478f(sb, "$receiver");
        C14445h0.m62478f(strArr, "value");
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }

    @C6003d
    /* renamed from: a */
    public static final StringBuilder m27830a(@C6003d StringBuilder sb, @C6003d Object... objArr) {
        C14445h0.m62478f(sb, "$receiver");
        C14445h0.m62478f(objArr, "value");
        for (Object append : objArr) {
            sb.append(append);
        }
        return sb;
    }

    @C6041f
    /* renamed from: a */
    private static final void m27833a(@C6003d StringBuilder sb, int i, char c) {
        C14445h0.m62478f(sb, "$receiver");
        sb.setCharAt(i, c);
    }

    /* renamed from: a */
    public static <T> void m27832a(@C6003d Appendable appendable, T t, @C6004e C6080l<? super T, ? extends CharSequence> lVar) {
        C14445h0.m62478f(appendable, "$receiver");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
