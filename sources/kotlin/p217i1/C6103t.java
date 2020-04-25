package kotlin.p217i1;

import java.util.ArrayList;
import java.util.List;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, mo24990d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.i1.t */
/* compiled from: Indent.kt */
class C6103t {

    /* renamed from: kotlin.i1.t$a */
    /* compiled from: Indent.kt */
    static final class C6104a extends C14448i0 implements C6080l<String, String> {

        /* renamed from: a */
        public static final C6104a f17312a = new C6104a();

        C6104a() {
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final String invoke(@C6003d String str) {
            C14445h0.m62478f(str, "line");
            return str;
        }
    }

    /* renamed from: kotlin.i1.t$b */
    /* compiled from: Indent.kt */
    static final class C6105b extends C14448i0 implements C6080l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f17313a;

        C6105b(String str) {
            this.f17313a = str;
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final String invoke(@C6003d String str) {
            C14445h0.m62478f(str, "line");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17313a);
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: kotlin.i1.t$c */
    /* compiled from: Indent.kt */
    static final class C6106c extends C14448i0 implements C6080l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f17314a;

        C6106c(String str) {
            this.f17314a = str;
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final String invoke(@C6003d String str) {
            C14445h0.m62478f(str, "it");
            if (!C6111y.m27897a((CharSequence) str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f17314a);
                sb.append(str);
                return sb.toString();
            } else if (str.length() < this.f17314a.length()) {
                return this.f17314a;
            } else {
                return str;
            }
        }
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27793a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return m27792a(str, str2, str3);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m27798b(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return m27797b(str, str2);
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ String m27801c(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m27800c(str, str2);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27792a(@C6003d String str, @C6003d String str2, @C6003d String str3) {
        int i;
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "newIndent");
        C14445h0.m62478f(str3, "marginPrefix");
        if (!C6111y.m27897a((CharSequence) str3)) {
            List<String> k = C6112z.m28085k((CharSequence) str);
            int length = str.length() + (str2.length() * k.size());
            C6080l a = m27795a(str2);
            int a2 = C6129u.m28125a((List) k);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (String str4 : k) {
                int i3 = i2 + 1;
                String str5 = null;
                if ((i2 == 0 || i2 == a2) && C6111y.m27897a((CharSequence) str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C14661d.m63553p(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C6111y.m27904a(str4, str3, i, false, 4, (Object) null)) {
                            int length3 = i5 + str3.length();
                            if (str4 != null) {
                                str5 = str4.substring(length3);
                                C14445h0.m62453a((Object) str5, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    if (str5 != null) {
                        String str6 = (String) a.invoke(str5);
                        if (str6 != null) {
                            str4 = str6;
                        }
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C14848z.m65679a(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            C14445h0.m62453a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    @C6003d
    /* renamed from: b */
    public static final String m27797b(@C6003d String str, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "newIndent");
        List<String> k = C6112z.m28085k((CharSequence) str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (Object next : k) {
            if (!C6111y.m27897a((CharSequence) (String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6131v.m28159a((Iterable) arrayList, 10));
        for (String b : arrayList) {
            arrayList2.add(Integer.valueOf(m27796b(b)));
        }
        Integer num = (Integer) C14848z.m65838x((Iterable) arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * k.size());
        C6080l a = m27795a(str2);
        int a2 = C6129u.m28125a((List) k);
        ArrayList arrayList3 = new ArrayList();
        for (String str3 : k) {
            int i2 = i + 1;
            if ((i == 0 || i == a2) && C6111y.m27897a((CharSequence) str3)) {
                str3 = null;
            } else {
                String a3 = C14646a0.m63416a(str3, intValue);
                if (a3 != null) {
                    String str4 = (String) a.invoke(a3);
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) C14848z.m65679a(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        C14445h0.m62453a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @C6003d
    /* renamed from: c */
    public static final String m27800c(@C6003d String str, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "marginPrefix");
        return m27792a(str, "", str2);
    }

    @C6003d
    /* renamed from: c */
    public static final String m27799c(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        return m27797b(str, "");
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27791a(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return m27790a(str, str2);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27790a(@C6003d String str, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "indent");
        return C14604p.m63224a(C14604p.m63321v(C6112z.m28083j(str), new C6106c(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    /* renamed from: b */
    private static final int m27796b(@C6003d String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C14661d.m63553p(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: a */
    private static final C6080l<String, String> m27795a(String str) {
        if (str.length() == 0) {
            return C6104a.f17312a;
        }
        return new C6105b(str);
    }

    /* renamed from: a */
    private static final String m27794a(@C6003d List<String> list, int i, C6080l<? super String, String> lVar, C6080l<? super String, String> lVar2) {
        int a = C6129u.m28125a((List) list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (String str : list) {
            int i3 = i2 + 1;
            if ((i2 == 0 || i2 == a) && C6111y.m27897a((CharSequence) str)) {
                str = null;
            } else {
                String str2 = (String) lVar2.invoke(str);
                if (str2 != null) {
                    String str3 = (String) lVar.invoke(str2);
                    if (str3 != null) {
                        str = str3;
                    }
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) C14848z.m65679a(arrayList, new StringBuilder(i), "\n", null, null, 0, null, null, 124, null)).toString();
        C14445h0.m62453a((Object) sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }
}
