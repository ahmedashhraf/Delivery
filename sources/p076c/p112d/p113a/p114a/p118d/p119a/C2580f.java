package p076c.p112d.p113a.p114a.p118d.p119a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c.d.a.a.d.a.f */
public abstract class C2580f extends C2576b implements C2579e {
    /* renamed from: a */
    public static C2579e m12675a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C14244c.f42007P);
        return queryLocalInterface instanceof C2579e ? (C2579e) queryLocalInterface : new C2581g(iBinder);
    }
}
