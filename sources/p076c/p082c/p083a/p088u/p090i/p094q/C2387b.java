package p076c.p082c.p083a.p088u.p090i.p094q;

import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i;
import p076c.p082c.p083a.p088u.p090i.p094q.C2389d.C2390a;

/* renamed from: c.c.a.u.i.q.b */
/* compiled from: BitmapPreFiller */
public final class C2387b {

    /* renamed from: a */
    private final C2367i f9328a;

    /* renamed from: b */
    private final C2330c f9329b;

    /* renamed from: c */
    private final C2270a f9330c;

    /* renamed from: d */
    private final Handler f9331d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private C2383a f9332e;

    public C2387b(C2367i iVar, C2330c cVar, C2270a aVar) {
        this.f9328a = iVar;
        this.f9329b = cVar;
        this.f9330c = aVar;
    }

    /* renamed from: a */
    public void mo9796a(C2390a... aVarArr) {
        C2383a aVar = this.f9332e;
        if (aVar != null) {
            aVar.mo9792a();
        }
        C2389d[] dVarArr = new C2389d[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C2390a aVar2 = aVarArr[i];
            if (aVar2.mo9810b() == null) {
                C2270a aVar3 = this.f9330c;
                aVar2.mo9808a((aVar3 == C2270a.ALWAYS_ARGB_8888 || aVar3 == C2270a.PREFER_ARGB_8888) ? Config.ARGB_8888 : Config.RGB_565);
            }
            dVarArr[i] = aVar2.mo9809a();
        }
        this.f9332e = new C2383a(this.f9329b, this.f9328a, mo9795a(dVarArr));
        this.f9331d.post(this.f9332e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2388c mo9795a(C2389d[] dVarArr) {
        int a = (this.f9328a.mo9774a() - this.f9328a.mo9777c()) + this.f9329b.mo9730a();
        int i = 0;
        for (C2389d c : dVarArr) {
            i += c.mo9802c();
        }
        float f = ((float) a) / ((float) i);
        HashMap hashMap = new HashMap();
        for (C2389d dVar : dVarArr) {
            hashMap.put(dVar, Integer.valueOf(Math.round(((float) dVar.mo9802c()) * f) / m12203a(dVar)));
        }
        return new C2388c(hashMap);
    }

    /* renamed from: a */
    private static int m12203a(C2389d dVar) {
        return C2216i.m11336a(dVar.mo9803d(), dVar.mo9801b(), dVar.mo9800a());
    }
}
