package p053b.p061c.p062b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(21)
/* renamed from: b.c.b.e */
/* compiled from: TreeDocumentFile */
class C2106e extends C2102a {

    /* renamed from: c */
    private Context f7992c;

    /* renamed from: d */
    private Uri f7993d;

    C2106e(@C0195i0 C2102a aVar, Context context, Uri uri) {
        super(aVar);
        this.f7992c = context;
        this.f7993d = uri;
    }

    @C0195i0
    /* renamed from: a */
    public C2102a mo9116a(String str, String str2) {
        Uri a = m10956a(this.f7992c, this.f7993d, str, str2);
        if (a != null) {
            return new C2106e(this, this.f7992c, a);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo9119b() {
        return C2103b.m10911b(this.f7992c, this.f7993d);
    }

    /* renamed from: c */
    public boolean mo9120c() {
        try {
            return DocumentsContract.deleteDocument(this.f7992c.getContentResolver(), this.f7993d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo9122d() {
        return C2103b.m10912c(this.f7992c, this.f7993d);
    }

    @C0195i0
    /* renamed from: e */
    public String mo9123e() {
        return C2103b.m10914e(this.f7992c, this.f7993d);
    }

    @C0195i0
    /* renamed from: g */
    public String mo9125g() {
        return C2103b.m10916g(this.f7992c, this.f7993d);
    }

    /* renamed from: h */
    public Uri mo9126h() {
        return this.f7993d;
    }

    /* renamed from: i */
    public boolean mo9127i() {
        return C2103b.m10917h(this.f7992c, this.f7993d);
    }

    /* renamed from: j */
    public boolean mo9128j() {
        return C2103b.m10918i(this.f7992c, this.f7993d);
    }

    /* renamed from: k */
    public boolean mo9129k() {
        return C2103b.m10919j(this.f7992c, this.f7993d);
    }

    /* renamed from: l */
    public long mo9130l() {
        return C2103b.m10920k(this.f7992c, this.f7993d);
    }

    /* renamed from: m */
    public long mo9131m() {
        return C2103b.m10921l(this.f7992c, this.f7993d);
    }

    /* renamed from: n */
    public C2102a[] mo9132n() {
        ContentResolver contentResolver = this.f7992c.getContentResolver();
        Uri uri = this.f7993d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f7993d, cursor.getString(0)));
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            sb.toString();
        } catch (Throwable th) {
            m10957a((AutoCloseable) null);
            throw th;
        }
        m10957a((AutoCloseable) cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        C2102a[] aVarArr = new C2102a[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            aVarArr[i] = new C2106e(this, this.f7992c, uriArr[i]);
        }
        return aVarArr;
    }

    /* renamed from: c */
    public boolean mo9121c(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f7992c.getContentResolver(), this.f7993d, str);
            if (renameDocument != null) {
                this.f7993d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @C0195i0
    /* renamed from: a */
    private static Uri m10956a(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @C0195i0
    /* renamed from: a */
    public C2102a mo9115a(String str) {
        Uri a = m10956a(this.f7992c, this.f7993d, "vnd.android.document/directory", str);
        if (a != null) {
            return new C2106e(this, this.f7992c, a);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo9117a() {
        return C2103b.m10910a(this.f7992c, this.f7993d);
    }

    /* renamed from: a */
    private static void m10957a(@C0195i0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
