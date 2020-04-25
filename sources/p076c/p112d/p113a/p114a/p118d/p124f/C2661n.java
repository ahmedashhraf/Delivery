package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.f.n */
public abstract class C2661n extends C2657j implements C2660m {
    /* renamed from: a */
    public static C2660m m12927a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof C2660m ? (C2660m) queryLocalInterface : new C2662o(iBinder);
    }
}
