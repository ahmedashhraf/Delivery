package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.w */
public abstract class C2670w extends C2657j implements C2669v {
    /* renamed from: a */
    public static C2669v m13015a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return queryLocalInterface instanceof C2669v ? (C2669v) queryLocalInterface : new C2671x(iBinder);
    }
}
