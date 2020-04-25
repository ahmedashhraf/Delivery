package kotlin.p217i1;

import kotlin.p214b1.C6053c;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.i1.r */
/* compiled from: StringNumberConversions.kt */
final class C14689r {
    @C6003d
    @C6053c

    /* renamed from: a */
    public static final C14679o f42919a;

    /* renamed from: b */
    public static final C14689r f42920b = new C14689r();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("[eE][+-]?");
        String str = "(\\p{Digit}+)";
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        String str2 = "(0[xX]";
        sb3.append(str2);
        String str3 = "(\\p{XDigit}+)";
        sb3.append(str3);
        sb3.append("(\\.)?)|");
        sb3.append(str2);
        sb3.append(str3);
        sb3.append("?(\\.)");
        sb3.append(str3);
        sb3.append(')');
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append('(');
        sb5.append(str);
        sb5.append("(\\.)?(");
        sb5.append(str);
        sb5.append("?)(");
        sb5.append(sb2);
        String str4 = ")?)|";
        sb5.append(str4);
        sb5.append("(\\.(");
        sb5.append(str);
        sb5.append(")(");
        sb5.append(sb2);
        sb5.append(str4);
        sb5.append("((");
        sb5.append(sb4);
        sb5.append(")[pP][+-]?");
        sb5.append(str);
        sb5.append(')');
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb7.append(sb6);
        sb7.append(")[fFdD]?))[\\x00-\\x20]*");
        f42919a = new C14679o(sb7.toString());
    }

    private C14689r() {
    }
}
