package p053b.p061c.p062b;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: b.c.b.d */
/* compiled from: SingleDocumentFile */
class C2105d extends C2102a {

    /* renamed from: c */
    private Context f7990c;

    /* renamed from: d */
    private Uri f7991d;

    C2105d(@C0195i0 C2102a aVar, Context context, Uri uri) {
        super(aVar);
        this.f7990c = context;
        this.f7991d = uri;
    }

    /* renamed from: a */
    public C2102a mo9116a(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public boolean mo9119b() {
        return C2103b.m10911b(this.f7990c, this.f7991d);
    }

    /* renamed from: c */
    public boolean mo9120c() {
        try {
            return DocumentsContract.deleteDocument(this.f7990c.getContentResolver(), this.f7991d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo9122d() {
        return C2103b.m10912c(this.f7990c, this.f7991d);
    }

    @C0195i0
    /* renamed from: e */
    public String mo9123e() {
        return C2103b.m10914e(this.f7990c, this.f7991d);
    }

    @C0195i0
    /* renamed from: g */
    public String mo9125g() {
        return C2103b.m10916g(this.f7990c, this.f7991d);
    }

    /* renamed from: h */
    public Uri mo9126h() {
        return this.f7991d;
    }

    /* renamed from: i */
    public boolean mo9127i() {
        return C2103b.m10917h(this.f7990c, this.f7991d);
    }

    /* renamed from: j */
    public boolean mo9128j() {
        return C2103b.m10918i(this.f7990c, this.f7991d);
    }

    /* renamed from: k */
    public boolean mo9129k() {
        return C2103b.m10919j(this.f7990c, this.f7991d);
    }

    /* renamed from: l */
    public long mo9130l() {
        return C2103b.m10920k(this.f7990c, this.f7991d);
    }

    /* renamed from: m */
    public long mo9131m() {
        return C2103b.m10921l(this.f7990c, this.f7991d);
    }

    /* renamed from: n */
    public C2102a[] mo9132n() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C2102a mo9115a(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public boolean mo9121c(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo9117a() {
        return C2103b.m10910a(this.f7990c, this.f7991d);
    }
}
