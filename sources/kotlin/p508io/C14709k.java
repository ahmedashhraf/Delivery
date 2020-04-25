package kotlin.p508io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.p214b1.p216u.C14445h0;
import org.apache.http.cookie.C15222a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.io.k */
/* compiled from: FilePathComponents.kt */
class C14709k {
    /* renamed from: a */
    private static final int m63760a(@C6003d String str) {
        int a = C6112z.m27935a((CharSequence) str, File.separatorChar, 0, false, 4, (Object) null);
        if (a == 0) {
            if (str.length() > 1) {
                char charAt = str.charAt(1);
                char c = File.separatorChar;
                if (charAt == c) {
                    int a2 = C6112z.m27935a((CharSequence) str, c, 2, false, 4, (Object) null);
                    if (a2 >= 0) {
                        int a3 = C6112z.m27935a((CharSequence) str, File.separatorChar, a2 + 1, false, 4, (Object) null);
                        if (a3 >= 0) {
                            return a3 + 1;
                        }
                        return str.length();
                    }
                }
            }
            return 1;
        } else if (a > 0 && str.charAt(a - 1) == ':') {
            return a + 1;
        } else {
            if (a != -1 || !C6112z.m28032b((CharSequence) str, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    @C6003d
    /* renamed from: b */
    public static final String m63763b(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        String path = file.getPath();
        String str = C15222a.f44141w;
        C14445h0.m62453a((Object) path, str);
        String path2 = file.getPath();
        C14445h0.m62453a((Object) path2, str);
        int a = m63760a(path2);
        if (path != null) {
            String substring = path.substring(0, a);
            C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public static final boolean m63764c(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        String path = file.getPath();
        C14445h0.m62453a((Object) path, C15222a.f44141w);
        return m63760a(path) > 0;
    }

    @C6003d
    /* renamed from: d */
    public static final C14698f m63765d(@C6003d File file) {
        List list;
        C14445h0.m62478f(file, "$receiver");
        String path = file.getPath();
        C14445h0.m62453a((Object) path, C15222a.f44141w);
        int a = m63760a(path);
        String substring = path.substring(0, a);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = path.substring(a);
        C14445h0.m62453a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            list = C6129u.m28145b();
        } else {
            List<String> a2 = C6112z.m27977a((CharSequence) substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            List arrayList = new ArrayList(C6131v.m28159a((Iterable<? extends T>) a2, 10));
            for (String file2 : a2) {
                arrayList.add(new File(file2));
            }
            list = arrayList;
        }
        return new C14698f(new File(substring), list);
    }

    @C6003d
    /* renamed from: a */
    public static final File m63761a(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        return new File(m63763b(file));
    }

    @C6003d
    /* renamed from: a */
    public static final File m63762a(@C6003d File file, int i, int i2) {
        C14445h0.m62478f(file, "$receiver");
        return m63765d(file).mo45950a(i, i2);
    }
}
