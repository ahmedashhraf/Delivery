package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.e */
public abstract class C2648e extends C2657j implements C2646d {
    /* renamed from: a */
    public static C2646d m12832a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return queryLocalInterface instanceof C2646d ? (C2646d) queryLocalInterface : new C2650f(iBinder);
    }
}
