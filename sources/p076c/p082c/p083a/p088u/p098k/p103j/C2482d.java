package p076c.p082c.p083a.p088u.p098k.p103j;

import android.graphics.Bitmap;
import java.io.OutputStream;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p098k.p102i.C2458b;

/* renamed from: c.c.a.u.k.j.d */
/* compiled from: GifBitmapWrapperResourceEncoder */
public class C2482d implements C2275f<C2477a> {

    /* renamed from: a */
    private final C2275f<Bitmap> f9495a;

    /* renamed from: b */
    private final C2275f<C2458b> f9496b;

    /* renamed from: c */
    private String f9497c;

    public C2482d(C2275f<Bitmap> fVar, C2275f<C2458b> fVar2) {
        this.f9495a = fVar;
        this.f9496b = fVar2;
    }

    public String getId() {
        if (this.f9497c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9495a.getId());
            sb.append(this.f9496b.getId());
            this.f9497c = sb.toString();
        }
        return this.f9497c;
    }

    /* renamed from: a */
    public boolean mo9634a(C2322l<C2477a> lVar, OutputStream outputStream) {
        C2477a aVar = (C2477a) lVar.get();
        C2322l a = aVar.mo9918a();
        if (a != null) {
            return this.f9495a.mo9634a(a, outputStream);
        }
        return this.f9496b.mo9634a(aVar.mo9919b(), outputStream);
    }
}
