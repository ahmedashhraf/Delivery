package p076c.p082c.p083a.p088u.p089h;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import p076c.p082c.p083a.C2244p;

/* renamed from: c.c.a.u.h.a */
/* compiled from: AssetPathFetcher */
public abstract class C2277a<T> implements C2279c<T> {

    /* renamed from: d */
    private static final String f9092d = "AssetUriFetcher";

    /* renamed from: a */
    private final String f9093a;

    /* renamed from: b */
    private final AssetManager f9094b;

    /* renamed from: c */
    private T f9095c;

    public C2277a(AssetManager assetManager, String str) {
        this.f9094b = assetManager;
        this.f9093a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo9643a(AssetManager assetManager, String str) throws IOException;

    /* renamed from: a */
    public T mo9644a(C2244p pVar) throws Exception {
        this.f9095c = mo9643a(this.f9094b, this.f9093a);
        return this.f9095c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9646a(T t) throws IOException;

    public void cancel() {
    }

    public String getId() {
        return this.f9093a;
    }

    /* renamed from: a */
    public void mo9645a() {
        T t = this.f9095c;
        if (t != null) {
            try {
                mo9646a(t);
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable(f9092d, 2);
            }
        }
    }
}
