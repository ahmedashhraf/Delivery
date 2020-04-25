package com.instabug.library.visualusersteps;

import android.annotation.SuppressLint;
import androidx.annotation.C0195i0;
import com.instabug.library.Instabug;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.visualusersteps.C10032a.C10033a;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.visualusersteps.c */
/* compiled from: VisualUserSteps */
public class C10037c {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26726c;

    /* renamed from: a */
    private LinkedList<C10032a> f26727a = new LinkedList<>();

    /* renamed from: b */
    private int f26728b;

    /* renamed from: com.instabug.library.visualusersteps.c$a */
    /* compiled from: VisualUserSteps */
    class C10038a implements C12331g<Boolean> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26729b;

        /* renamed from: a */
        final /* synthetic */ C10037c f26730a;

        C10038a(C10037c cVar) {
            boolean[] a = m46728a();
            this.f26730a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46728a() {
            boolean[] zArr = f26729b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6956032744150365135L, "com/instabug/library/visualusersteps/VisualUserSteps$1", 3);
            f26729b = a;
            return a;
        }

        /* renamed from: a */
        public void mo36084a(Boolean bool) {
            m46728a()[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46728a();
            mo36084a((Boolean) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.visualusersteps.c$b */
    /* compiled from: VisualUserSteps */
    class C10039b implements Callable<Boolean> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26731N;

        /* renamed from: a */
        final /* synthetic */ String f26732a;

        /* renamed from: b */
        final /* synthetic */ C10037c f26733b;

        C10039b(C10037c cVar, String str) {
            boolean[] b = m46731b();
            this.f26733b = cVar;
            this.f26732a = str;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m46731b() {
            boolean[] zArr = f26731N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6221852601847338200L, "com/instabug/library/visualusersteps/VisualUserSteps$2", 3);
            f26731N = a;
            return a;
        }

        /* renamed from: a */
        public Boolean mo36085a() {
            boolean[] b = m46731b();
            Boolean valueOf = Boolean.valueOf(C10037c.m46713a(this.f26733b, this.f26732a));
            b[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m46731b();
            Boolean a = mo36085a();
            b[2] = true;
            return a;
        }
    }

    C10037c() {
        boolean[] h = m46719h();
        h[0] = true;
        h[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m46713a(C10037c cVar, String str) {
        boolean[] h = m46719h();
        boolean a = cVar.m46714a(str);
        h[35] = true;
        return a;
    }

    /* renamed from: f */
    private C10032a m46717f() {
        C10032a aVar = (C10032a) this.f26727a.getFirst();
        m46719h()[5] = true;
        return aVar;
    }

    /* renamed from: g */
    private void m46718g() {
        boolean[] h = m46719h();
        C10033a f = ((C10032a) this.f26727a.getFirst()).mo36047f();
        if (f == null) {
            h[15] = true;
        } else {
            h[16] = true;
            m46715b(f.mo36049a());
            h[17] = true;
        }
        this.f26728b -= ((C10032a) this.f26727a.getFirst()).mo36044c();
        h[18] = true;
        this.f26727a.removeFirst();
        h[19] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46719h() {
        boolean[] zArr = f26726c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8260594007844819786L, "com/instabug/library/visualusersteps/VisualUserSteps", 36);
        f26726c = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: b */
    public C10032a mo36080b() {
        boolean[] h = m46719h();
        if (this.f26727a.isEmpty()) {
            h[3] = true;
            return null;
        }
        C10032a aVar = (C10032a) this.f26727a.getLast();
        h[4] = true;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo36081c() {
        boolean[] h = m46719h();
        C10032a f = m46717f();
        h[7] = true;
        if (f.mo36044c() > 1) {
            this.f26728b--;
            h[8] = true;
            m46717f().mo36045d();
            h[9] = true;
        } else {
            m46718g();
            h[10] = true;
        }
        h[11] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo36082d() {
        boolean[] h = m46719h();
        int i = this.f26728b;
        h[12] = true;
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo36083e() {
        boolean[] h = m46719h();
        int size = this.f26727a.size();
        h[14] = true;
        return size;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public LinkedList<C10032a> mo36076a() {
        boolean[] h = m46719h();
        LinkedList<C10032a> linkedList = this.f26727a;
        h[2] = true;
        return linkedList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36079a(C10034b bVar) {
        boolean[] h = m46719h();
        mo36080b().mo36042a(bVar);
        this.f26728b++;
        h[6] = true;
    }

    @SuppressLint({"CheckResult"})
    @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED"})
    /* renamed from: b */
    private void m46715b(String str) {
        boolean[] h = m46719h();
        C5923b0 c = m46716c(str).mo23950c(C12228b.m55094b());
        C10038a aVar = new C10038a(this);
        h[32] = true;
        c.mo24041i((C12331g<? super T>) aVar);
        h[33] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36078a(C10032a aVar) {
        boolean[] h = m46719h();
        this.f26727a.add(aVar);
        h[13] = true;
    }

    /* renamed from: c */
    private C5923b0<Boolean> m46716c(String str) {
        boolean[] h = m46719h();
        C5923b0<Boolean> f = C5923b0.m26194f((Callable<? extends T>) new C10039b<Object>(this, str));
        h[34] = true;
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36077a(int i) {
        boolean[] h = m46719h();
        h[20] = true;
        int i2 = 0;
        while (i2 < i) {
            h[21] = true;
            m46718g();
            i2++;
            h[22] = true;
        }
        h[23] = true;
    }

    /* renamed from: a */
    private boolean m46714a(String str) {
        Class<C10040d> cls = C10040d.class;
        boolean[] h = m46719h();
        StringBuilder sb = new StringBuilder();
        h[24] = true;
        sb.append(VisualUserStepsHelper.getVisualUserStepsDirectory(Instabug.getApplicationContext()));
        sb.append(File.separator);
        sb.append(str);
        File file = new File(sb.toString());
        h[25] = true;
        if (!file.exists()) {
            h[26] = true;
        } else {
            h[27] = true;
            if (!file.delete()) {
                h[28] = true;
            } else {
                h[29] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("VisualUserStep screenshot deleted! filename= ");
                sb2.append(str);
                InstabugSDKLogger.m46626v(cls, sb2.toString());
                h[30] = true;
                return true;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("VisualUserStep screenshot doesn't deleted! filename= ");
        sb3.append(str);
        sb3.append("\n Something went wrong");
        InstabugSDKLogger.m46626v(cls, sb3.toString());
        h[31] = true;
        return false;
    }
}
