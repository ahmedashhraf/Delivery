package p212io.fabric.sdk.android.p493p.p498e;

import android.content.res.Resources.NotFoundException;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Locale;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14227k;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14274v;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: io.fabric.sdk.android.p.e.a */
/* compiled from: AbstractAppSpiCall */
abstract class C14306a extends C14236a implements C14311f {

    /* renamed from: a */
    public static final String f42161a = "app[identifier]";

    /* renamed from: b */
    public static final String f42162b = "app[name]";

    /* renamed from: c */
    public static final String f42163c = "app[instance_identifier]";

    /* renamed from: d */
    public static final String f42164d = "app[display_version]";

    /* renamed from: e */
    public static final String f42165e = "app[build_version]";

    /* renamed from: f */
    public static final String f42166f = "app[source]";

    /* renamed from: g */
    public static final String f42167g = "app[minimum_sdk_version]";

    /* renamed from: h */
    public static final String f42168h = "app[built_sdk_version]";

    /* renamed from: i */
    public static final String f42169i = "app[icon][hash]";

    /* renamed from: j */
    public static final String f42170j = "app[icon][data]";

    /* renamed from: k */
    public static final String f42171k = "app[icon][width]";

    /* renamed from: l */
    public static final String f42172l = "app[icon][height]";

    /* renamed from: m */
    public static final String f42173m = "app[icon][prerendered]";

    /* renamed from: n */
    public static final String f42174n = "app[build][libraries][%s]";

    /* renamed from: o */
    public static final String f42175o = "app[build][libraries][%s][version]";

    /* renamed from: p */
    public static final String f42176p = "app[build][libraries][%s][type]";

    /* renamed from: q */
    static final String f42177q = "icon.png";

    /* renamed from: r */
    static final String f42178r = "application/octet-stream";

    public C14306a(C14225i iVar, String str, String str2, C14388d dVar, C14387c cVar) {
        super(iVar, str, str2, dVar, cVar);
    }

    /* renamed from: b */
    private HttpRequest m62001b(HttpRequest httpRequest, C14309d dVar) {
        String str = "Failed to close app icon InputStream.";
        HttpRequest f = httpRequest.mo45452f(f42161a, dVar.f42195b).mo45452f(f42162b, dVar.f42199f).mo45452f(f42164d, dVar.f42196c).mo45452f(f42165e, dVar.f42197d).mo45431b(f42166f, (Number) Integer.valueOf(dVar.f42200g)).mo45452f(f42167g, dVar.f42201h).mo45452f(f42168h, dVar.f42202i);
        if (!C14248i.m61832c(dVar.f42198e)) {
            f.mo45452f(f42163c, dVar.f42198e);
        }
        if (dVar.f42203j != null) {
            InputStream inputStream = null;
            try {
                inputStream = this.kit.getContext().getResources().openRawResource(dVar.f42203j.f42243b);
                f.mo45452f(f42169i, dVar.f42203j.f42242a).mo45415a(f42170j, f42177q, "application/octet-stream", inputStream).mo45431b(f42171k, (Number) Integer.valueOf(dVar.f42203j.f42244c)).mo45431b(f42172l, (Number) Integer.valueOf(dVar.f42203j.f42245d));
            } catch (NotFoundException e) {
                C14228l j = C14215d.m61672j();
                String str2 = C14215d.f41919m;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find app icon with resource ID: ");
                sb.append(dVar.f42203j.f42243b);
                j.mo45045e(str2, sb.toString(), e);
            } catch (Throwable th) {
                C14248i.m61815a((Closeable) inputStream, str);
                throw th;
            }
            C14248i.m61815a((Closeable) inputStream, str);
        }
        Collection<C14227k> collection = dVar.f42204k;
        if (collection != null) {
            for (C14227k kVar : collection) {
                f.mo45452f(mo45258b(kVar), kVar.mo45109c());
                f.mo45452f(mo45256a(kVar), kVar.mo45107a());
            }
        }
        return f;
    }

    /* renamed from: a */
    public boolean mo45257a(C14309d dVar) {
        HttpRequest b = m62001b(m62000a(getHttpRequest(), dVar), dVar);
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Sending app info to ");
        sb.append(getUrl());
        String sb2 = sb.toString();
        String str = C14215d.f41919m;
        j.mo45042d(str, sb2);
        if (dVar.f42203j != null) {
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("App icon hash is ");
            sb3.append(dVar.f42203j.f42242a);
            j2.mo45042d(str, sb3.toString());
            C14228l j3 = C14215d.m61672j();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("App icon size is ");
            sb4.append(dVar.f42203j.f42244c);
            sb4.append("x");
            sb4.append(dVar.f42203j.f42245d);
            j3.mo45042d(str, sb4.toString());
        }
        int n = b.mo45471n();
        String str2 = "POST".equals(b.mo45375D()) ? "Create" : "Update";
        C14228l j4 = C14215d.m61672j();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append(" app request ID: ");
        sb5.append(b.mo45466k(C14236a.HEADER_REQUEST_ID));
        j4.mo45042d(str, sb5.toString());
        C14228l j5 = C14215d.m61672j();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Result was ");
        sb6.append(n);
        j5.mo45042d(str, sb6.toString());
        return C14274v.m61931a(n) == 0;
    }

    /* renamed from: a */
    private HttpRequest m62000a(HttpRequest httpRequest, C14309d dVar) {
        return httpRequest.mo45444d(C14236a.HEADER_API_KEY, dVar.f42194a).mo45444d(C14236a.HEADER_CLIENT_TYPE, "android").mo45444d(C14236a.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo45256a(C14227k kVar) {
        return String.format(Locale.US, f42176p, new Object[]{kVar.mo45108b()});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo45258b(C14227k kVar) {
        return String.format(Locale.US, f42175o, new Object[]{kVar.mo45108b()});
    }
}
