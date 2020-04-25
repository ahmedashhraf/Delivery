package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.f0 */
public abstract class C2651f0 extends C2657j implements C2649e0 {
    /* renamed from: a */
    public static C2649e0 m12866a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return queryLocalInterface instanceof C2649e0 ? (C2649e0) queryLocalInterface : new C2653g0(iBinder);
    }
}
