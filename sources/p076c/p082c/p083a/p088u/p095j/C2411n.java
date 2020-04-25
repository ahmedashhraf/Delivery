package p076c.p082c.p083a.p088u.p095j;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;
import p076c.p082c.p083a.p088u.p089h.C2279c;

/* renamed from: c.c.a.u.j.n */
/* compiled from: ResourceLoader */
public class C2411n<T> implements C2409l<Integer, T> {

    /* renamed from: c */
    private static final String f9391c = "ResourceLoader";

    /* renamed from: a */
    private final C2409l<Uri, T> f9392a;

    /* renamed from: b */
    private final Resources f9393b;

    public C2411n(Context context, C2409l<Uri, T> lVar) {
        this(context.getResources(), lVar);
    }

    public C2411n(Resources resources, C2409l<Uri, T> lVar) {
        this.f9393b = resources;
        this.f9392a = lVar;
    }

    /* renamed from: a */
    public C2279c<T> mo9812a(Integer num, int i, int i2) {
        Object obj;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f9393b.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.f9393b.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.f9393b.getResourceEntryName(num.intValue()));
            obj = Uri.parse(sb.toString());
        } catch (NotFoundException unused) {
            if (Log.isLoggable(f9391c, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(num);
                sb2.toString();
            }
            obj = null;
        }
        if (obj != null) {
            return this.f9392a.mo9812a(obj, i, i2);
        }
        return null;
    }
}
