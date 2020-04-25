package p076c.p082c.p083a.p088u.p095j;

import android.net.Uri;
import java.io.File;
import p076c.p082c.p083a.p088u.p089h.C2279c;

/* renamed from: c.c.a.u.j.b */
/* compiled from: FileLoader */
public class C2392b<T> implements C2409l<File, T> {

    /* renamed from: a */
    private final C2409l<Uri, T> f9349a;

    public C2392b(C2409l<Uri, T> lVar) {
        this.f9349a = lVar;
    }

    /* renamed from: a */
    public C2279c<T> mo9812a(File file, int i, int i2) {
        return this.f9349a.mo9812a(Uri.fromFile(file), i, i2);
    }
}
