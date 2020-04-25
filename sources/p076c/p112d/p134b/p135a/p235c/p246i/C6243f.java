package p076c.p112d.p134b.p135a.p235c.p246i;

import com.google.api.client.http.C7303s;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.c.i.f */
/* compiled from: TypedNotificationCallback */
public abstract class C6243f<T> implements C6245h {
    private static final long serialVersionUID = 1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Class<T> mo25401a() throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25402a(C6241d dVar, C6242e<T> eVar) throws IOException;

    /* renamed from: a */
    public final void mo25403a(C6241d dVar, C6244g gVar) throws IOException {
        C6242e eVar = new C6242e(gVar);
        String k = gVar.mo25408k();
        if (k != null) {
            eVar.mo25399a(mo25404b().mo25503a(gVar.mo25407j(), new C7303s(k).mo29070c(), (Class) C6381h0.m29663a(mo25401a())));
        }
        mo25402a(dVar, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C6372e0 mo25404b() throws IOException;
}
