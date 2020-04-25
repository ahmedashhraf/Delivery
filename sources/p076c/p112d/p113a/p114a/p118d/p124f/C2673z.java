package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.z */
public abstract class C2673z extends C2657j implements C2672y {
    /* renamed from: a */
    public static C2672y m13026a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        return queryLocalInterface instanceof C2672y ? (C2672y) queryLocalInterface : new C2641a0(iBinder);
    }
}
