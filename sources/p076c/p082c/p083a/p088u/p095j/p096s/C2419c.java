package p076c.p082c.p083a.p088u.p095j.p096s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2411n;

/* renamed from: c.c.a.u.j.s.c */
/* compiled from: FileDescriptorResourceLoader */
public class C2419c extends C2411n<ParcelFileDescriptor> implements C2418b<Integer> {

    /* renamed from: c.c.a.u.j.s.c$a */
    /* compiled from: FileDescriptorResourceLoader */
    public static class C2420a implements C2410m<Integer, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2409l<Integer, ParcelFileDescriptor> mo9847a(Context context, C2393c cVar) {
            return new C2419c(context, cVar.mo9813a(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2419c(Context context) {
        this(context, C2232l.m11637a(Uri.class, context));
    }

    public C2419c(Context context, C2409l<Uri, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }
}
