package p076c.p082c.p083a.p088u.p095j;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import p076c.p082c.p083a.p088u.p089h.C2279c;

/* renamed from: c.c.a.u.j.p */
/* compiled from: StringLoader */
public class C2413p<T> implements C2409l<String, T> {

    /* renamed from: a */
    private final C2409l<Uri, T> f9395a;

    public C2413p(C2409l<Uri, T> lVar) {
        this.f9395a = lVar;
    }

    /* renamed from: a */
    public C2279c<T> mo9812a(String str, int i, int i2) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            uri = m12272a(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? m12272a(str) : parse;
        }
        return this.f9395a.mo9812a(uri, i, i2);
    }

    /* renamed from: a */
    private static Uri m12272a(String str) {
        return Uri.fromFile(new File(str));
    }
}
