package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.b */
public abstract class C2642b extends C2657j implements C2655h0 {
    /* renamed from: a */
    public static C2655h0 m12753a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof C2655h0 ? (C2655h0) queryLocalInterface : new C2644c(iBinder);
    }
}
