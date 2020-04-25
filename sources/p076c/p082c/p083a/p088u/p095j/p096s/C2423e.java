package p076c.p082c.p083a.p088u.p095j.p096s;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p089h.C2281e;
import p076c.p082c.p083a.p088u.p089h.C2282f;
import p076c.p082c.p083a.p088u.p095j.C2393c;
import p076c.p082c.p083a.p088u.p095j.C2395d;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p095j.C2410m;
import p076c.p082c.p083a.p088u.p095j.C2414q;

/* renamed from: c.c.a.u.j.s.e */
/* compiled from: FileDescriptorUriLoader */
public class C2423e extends C2414q<ParcelFileDescriptor> implements C2418b<Uri> {

    /* renamed from: c.c.a.u.j.s.e$a */
    /* compiled from: FileDescriptorUriLoader */
    public static class C2424a implements C2410m<Uri, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2409l<Uri, ParcelFileDescriptor> mo9847a(Context context, C2393c cVar) {
            return new C2423e(context, cVar.mo9813a(C2395d.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo9848a() {
        }
    }

    public C2423e(Context context) {
        this(context, C2232l.m11637a(C2395d.class, context));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2279c<ParcelFileDescriptor> mo9852a(Context context, Uri uri) {
        return new C2282f(context, uri);
    }

    public C2423e(Context context, C2409l<C2395d, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2279c<ParcelFileDescriptor> mo9853a(Context context, String str) {
        return new C2281e(context.getApplicationContext().getAssets(), str);
    }
}
