package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.q */
public abstract class C2664q extends C2657j implements C2663p {
    /* renamed from: a */
    public static C2663p m12955a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof C2663p ? (C2663p) queryLocalInterface : new C2665r(iBinder);
    }
}
