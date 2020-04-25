package p076c.p082c.p083a.p105v;

import android.content.Context;
import p076c.p082c.p083a.p105v.C2496c.C2497a;

/* renamed from: c.c.a.v.d */
/* compiled from: ConnectivityMonitorFactory */
public class C2498d {
    /* renamed from: a */
    public C2496c mo9934a(Context context, C2497a aVar) {
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new C2499e(context, aVar);
        }
        return new C2504i();
    }
}
