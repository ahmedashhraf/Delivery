package p076c.p082c.p083a.p088u.p095j.p096s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p095j.C2392b;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;

/* renamed from: c.c.a.u.j.s.a */
/* compiled from: FileDescriptorFileLoader */
public class C2416a extends C2392b<ParcelFileDescriptor> implements C2418b<File> {

    /* renamed from: c.c.a.u.j.s.a$a */
    /* compiled from: FileDescriptorFileLoader */
    public static class C2417a implements C2410m<File, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2409l<File, ParcelFileDescriptor> mo9847a(Context context, C2393c cVar) {
            return new C2416a(cVar.mo9813a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2416a(Context context) {
        this(C2232l.m11637a(Uri.class, context));
    }

    public C2416a(C2409l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
