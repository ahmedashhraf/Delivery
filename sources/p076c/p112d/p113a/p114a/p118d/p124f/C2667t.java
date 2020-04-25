package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.t */
public abstract class C2667t extends C2657j implements C2666s {
    /* renamed from: a */
    public static C2666s m12992a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return queryLocalInterface instanceof C2666s ? (C2666s) queryLocalInterface : new C2668u(iBinder);
    }
}
