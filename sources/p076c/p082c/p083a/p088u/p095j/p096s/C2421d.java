package p076c.p082c.p083a.p088u.p095j.p096s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2413p;

/* renamed from: c.c.a.u.j.s.d */
/* compiled from: FileDescriptorStringLoader */
public class C2421d extends C2413p<ParcelFileDescriptor> implements C2418b<String> {

    /* renamed from: c.c.a.u.j.s.d$a */
    /* compiled from: FileDescriptorStringLoader */
    public static class C2422a implements C2410m<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2409l<String, ParcelFileDescriptor> mo9847a(Context context, C2393c cVar) {
            return new C2421d(cVar.mo9813a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2421d(Context context) {
        this(C2232l.m11637a(Uri.class, context));
    }

    public C2421d(C2409l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
