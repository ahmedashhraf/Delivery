package p053b.p061c.p062b;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.io.File;

/* renamed from: b.c.b.a */
/* compiled from: DocumentFile */
public abstract class C2102a {

    /* renamed from: b */
    static final String f7985b = "DocumentFile";
    @C0195i0

    /* renamed from: a */
    private final C2102a f7986a;

    C2102a(@C0195i0 C2102a aVar) {
        this.f7986a = aVar;
    }

    @C0193h0
    /* renamed from: a */
    public static C2102a m10885a(@C0193h0 File file) {
        return new C2104c(null, file);
    }

    @C0195i0
    /* renamed from: b */
    public static C2102a m10886b(@C0193h0 Context context, @C0193h0 Uri uri) {
        if (VERSION.SDK_INT >= 21) {
            return new C2106e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m10887c(@C0193h0 Context context, @C0195i0 Uri uri) {
        if (VERSION.SDK_INT >= 19) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
        return false;
    }

    @C0195i0
    /* renamed from: a */
    public abstract C2102a mo9115a(@C0193h0 String str);

    @C0195i0
    /* renamed from: a */
    public abstract C2102a mo9116a(@C0193h0 String str, @C0193h0 String str2);

    /* renamed from: a */
    public abstract boolean mo9117a();

    /* renamed from: b */
    public abstract boolean mo9119b();

    /* renamed from: c */
    public abstract boolean mo9120c();

    /* renamed from: c */
    public abstract boolean mo9121c(@C0193h0 String str);

    /* renamed from: d */
    public abstract boolean mo9122d();

    @C0195i0
    /* renamed from: e */
    public abstract String mo9123e();

    @C0195i0
    /* renamed from: f */
    public C2102a mo9124f() {
        return this.f7986a;
    }

    @C0195i0
    /* renamed from: g */
    public abstract String mo9125g();

    @C0193h0
    /* renamed from: h */
    public abstract Uri mo9126h();

    /* renamed from: i */
    public abstract boolean mo9127i();

    /* renamed from: j */
    public abstract boolean mo9128j();

    /* renamed from: k */
    public abstract boolean mo9129k();

    /* renamed from: l */
    public abstract long mo9130l();

    /* renamed from: m */
    public abstract long mo9131m();

    @C0193h0
    /* renamed from: n */
    public abstract C2102a[] mo9132n();

    @C0195i0
    /* renamed from: a */
    public static C2102a m10884a(@C0193h0 Context context, @C0193h0 Uri uri) {
        if (VERSION.SDK_INT >= 19) {
            return new C2105d(null, context, uri);
        }
        return null;
    }

    @C0195i0
    /* renamed from: b */
    public C2102a mo9118b(@C0193h0 String str) {
        C2102a[] n;
        for (C2102a aVar : mo9132n()) {
            if (str.equals(aVar.mo9123e())) {
                return aVar;
            }
        }
        return null;
    }
}
