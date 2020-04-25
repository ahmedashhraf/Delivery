package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.c0 */
public abstract class C2645c0 extends C2657j implements C2643b0 {
    /* renamed from: a */
    public static C2643b0 m12799a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C2643b0 ? (C2643b0) queryLocalInterface : new C2647d0(iBinder);
    }
}
