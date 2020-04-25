package p076c.p112d.p134b.p135a.p235c.p248j.p249e;

import com.google.api.client.googleapis.json.C7247b;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p235c.p239e.C6222b;
import p076c.p112d.p134b.p135a.p235c.p239e.p240e.C6231a;
import p076c.p112d.p134b.p135a.p235c.p248j.C6251b;

/* renamed from: c.d.b.a.c.j.e.b */
/* compiled from: AbstractGoogleJsonClientRequest */
public abstract class C6257b<T> extends C6251b<T> {

    /* renamed from: a0 */
    private final Object f17608a0;

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.api.client.http.l0.a] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.api.client.http.m] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, com.google.api.client.http.l0.a]
      uses: [?[OBJECT, ARRAY], java.lang.String]
      mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C6257b(p076c.p112d.p134b.p135a.p235c.p248j.p249e.C6255a r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11, java.lang.Class<T> r12) {
        /*
            r7 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
        L_0x0003:
            r5 = r0
            goto L_0x0024
        L_0x0005:
            com.google.api.client.http.l0.a r1 = new com.google.api.client.http.l0.a
            c.d.b.a.d.d r2 = r8.mo25475k()
            r1.<init>(r2, r11)
            c.d.b.a.d.f r2 = r8.m29015e()
            java.util.Set r2 = r2.mo25507b()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            java.lang.String r0 = "data"
        L_0x001f:
            com.google.api.client.http.l0.a r0 = r1.mo28994a(r0)
            goto L_0x0003
        L_0x0024:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f17608a0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p235c.p248j.p249e.C6257b.<init>(c.d.b.a.c.j.e.a, java.lang.String, java.lang.String, java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: z */
    public Object mo25478z() {
        return this.f17608a0;
    }

    /* renamed from: m */
    public C6255a m29049m() {
        return (C6255a) super.mo25458m();
    }

    /* renamed from: b */
    public C6257b<T> m29046b(String str, Object obj) {
        return (C6257b) super.m28986b(str, obj);
    }

    /* renamed from: a */
    public C6257b<T> m29041a(boolean z) {
        return (C6257b) super.mo25442a(z);
    }

    /* renamed from: a */
    public C6257b<T> m29040a(C7299q qVar) {
        return (C6257b) super.mo25441a(qVar);
    }

    /* renamed from: a */
    public final void mo25477a(C6222b bVar, C6231a<T> aVar) throws IOException {
        super.mo25444a(bVar, C7247b.class, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GoogleJsonResponseException m29043a(C7309x xVar) {
        return GoogleJsonResponseException.m34865a(mo25458m().mo25475k(), xVar);
    }
}
