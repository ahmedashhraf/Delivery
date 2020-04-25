package p076c.p082c.p083a.p088u.p095j;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import p076c.p082c.p083a.p088u.C2271b;

/* renamed from: c.c.a.u.j.h */
/* compiled from: ImageVideoWrapperEncoder */
public class C2401h implements C2271b<C2400g> {

    /* renamed from: a */
    private final C2271b<InputStream> f9369a;

    /* renamed from: b */
    private final C2271b<ParcelFileDescriptor> f9370b;

    /* renamed from: c */
    private String f9371c;

    public C2401h(C2271b<InputStream> bVar, C2271b<ParcelFileDescriptor> bVar2) {
        this.f9369a = bVar;
        this.f9370b = bVar2;
    }

    public String getId() {
        if (this.f9371c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9369a.getId());
            sb.append(this.f9370b.getId());
            this.f9371c = sb.toString();
        }
        return this.f9371c;
    }

    /* renamed from: a */
    public boolean mo9634a(C2400g gVar, OutputStream outputStream) {
        if (gVar.mo9827b() != null) {
            return this.f9369a.mo9634a(gVar.mo9827b(), outputStream);
        }
        return this.f9370b.mo9634a(gVar.mo9826a(), outputStream);
    }
}
