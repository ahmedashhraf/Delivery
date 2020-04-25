package p076c.p082c.p083a.p088u.p089h;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import p076c.p082c.p083a.C2244p;

/* renamed from: c.c.a.u.h.h */
/* compiled from: LocalUriFetcher */
public abstract class C2287h<T> implements C2279c<T> {

    /* renamed from: d */
    private static final String f9112d = "LocalUriFetcher";

    /* renamed from: a */
    private final Uri f9113a;

    /* renamed from: b */
    private final Context f9114b;

    /* renamed from: c */
    private T f9115c;

    public C2287h(Context context, Uri uri) {
        this.f9114b = context.getApplicationContext();
        this.f9113a = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo9656a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* renamed from: a */
    public final T mo9644a(C2244p pVar) throws Exception {
        this.f9115c = mo9656a(this.f9113a, this.f9114b.getContentResolver());
        return this.f9115c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9658a(T t) throws IOException;

    public void cancel() {
    }

    public String getId() {
        return this.f9113a.toString();
    }

    /* renamed from: a */
    public void mo9645a() {
        T t = this.f9115c;
        if (t != null) {
            try {
                mo9658a(t);
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable(f9112d, 2);
            }
        }
    }
}
