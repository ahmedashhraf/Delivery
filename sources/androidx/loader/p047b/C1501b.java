package androidx.loader.p047b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.content.C0840a;
import androidx.core.p038os.C1058b;
import androidx.core.p038os.OperationCanceledException;
import androidx.loader.p047b.C1502c.C1503a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: androidx.loader.b.b */
/* compiled from: CursorLoader */
public class C1501b extends C1499a<Cursor> {

    /* renamed from: r */
    final C1503a f5769r = new C1503a<>();

    /* renamed from: s */
    Uri f5770s;

    /* renamed from: t */
    String[] f5771t;

    /* renamed from: u */
    String f5772u;

    /* renamed from: v */
    String[] f5773v;

    /* renamed from: w */
    String f5774w;

    /* renamed from: x */
    Cursor f5775x;

    /* renamed from: y */
    C1058b f5776y;

    public C1501b(@C0193h0 Context context) {
        super(context);
    }

    @C0195i0
    /* renamed from: C */
    public String[] mo6594C() {
        return this.f5771t;
    }

    @C0195i0
    /* renamed from: D */
    public String mo6595D() {
        return this.f5772u;
    }

    @C0195i0
    /* renamed from: E */
    public String[] mo6596E() {
        return this.f5773v;
    }

    @C0195i0
    /* renamed from: F */
    public String mo6597F() {
        return this.f5774w;
    }

    @C0193h0
    /* renamed from: G */
    public Uri mo6598G() {
        return this.f5770s;
    }

    /* renamed from: a */
    public void mo6604b(Cursor cursor) {
        if (mo6623i()) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f5775x;
        this.f5775x = cursor;
        if (mo6624j()) {
            super.mo6604b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo6607o() {
        super.mo6607o();
        mo6609q();
        Cursor cursor = this.f5775x;
        if (cursor != null && !cursor.isClosed()) {
            this.f5775x.close();
        }
        this.f5775x = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo6608p() {
        Cursor cursor = this.f5775x;
        if (cursor != null) {
            mo6604b(cursor);
        }
        if (mo6632v() || this.f5775x == null) {
            mo6619e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo6609q() {
        mo6616b();
    }

    /* renamed from: w */
    public void mo6584w() {
        super.mo6584w();
        synchronized (this) {
            if (this.f5776y != null) {
                this.f5776y.mo5199a();
            }
        }
    }

    /* renamed from: b */
    public void mo6581c(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* renamed from: z */
    public Cursor m7840z() {
        Cursor a;
        synchronized (this) {
            if (!mo6586y()) {
                this.f5776y = new C1058b();
            } else {
                throw new OperationCanceledException();
            }
        }
        try {
            a = C0840a.m4914a(mo6620f().getContentResolver(), this.f5770s, this.f5771t, this.f5772u, this.f5773v, this.f5774w, this.f5776y);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f5769r);
            }
            synchronized (this) {
                this.f5776y = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f5776y = null;
                throw th;
            }
        }
    }

    public C1501b(@C0193h0 Context context, @C0193h0 Uri uri, @C0195i0 String[] strArr, @C0195i0 String str, @C0195i0 String[] strArr2, @C0195i0 String str2) {
        super(context);
        this.f5770s = uri;
        this.f5771t = strArr;
        this.f5772u = str;
        this.f5773v = strArr2;
        this.f5774w = str2;
    }

    /* renamed from: b */
    public void mo6606b(@C0195i0 String[] strArr) {
        this.f5773v = strArr;
    }

    /* renamed from: b */
    public void mo6605b(@C0195i0 String str) {
        this.f5774w = str;
    }

    /* renamed from: a */
    public void mo6600a(@C0193h0 Uri uri) {
        this.f5770s = uri;
    }

    /* renamed from: a */
    public void mo6602a(@C0195i0 String[] strArr) {
        this.f5771t = strArr;
    }

    /* renamed from: a */
    public void mo6601a(@C0195i0 String str) {
        this.f5772u = str;
    }

    @Deprecated
    /* renamed from: a */
    public void mo6579a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo6579a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f5770s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f5771t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f5772u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f5773v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f5774w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f5775x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f5784h);
    }
}
