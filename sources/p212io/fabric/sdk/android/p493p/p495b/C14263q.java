package p212io.fabric.sdk.android.p493p.p495b;

import android.content.Context;
import java.lang.reflect.Method;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

/* renamed from: io.fabric.sdk.android.p.b.q */
/* compiled from: FirebaseAppImpl */
final class C14263q implements C14262p {

    /* renamed from: c */
    private static final String f42066c = "com.google.firebase.FirebaseApp";

    /* renamed from: d */
    private static final String f42067d = "getInstance";

    /* renamed from: e */
    private static final String f42068e = "isDataCollectionDefaultEnabled";

    /* renamed from: a */
    private final Method f42069a;

    /* renamed from: b */
    private final Object f42070b;

    private C14263q(Class cls, Object obj) throws NoSuchMethodException {
        this.f42070b = obj;
        this.f42069a = cls.getDeclaredMethod(f42068e, new Class[0]);
    }

    /* renamed from: a */
    public static C14262p m61868a(Context context) {
        String str = C14215d.f41919m;
        try {
            Class loadClass = context.getClassLoader().loadClass(f42066c);
            return new C14263q(loadClass, loadClass.getDeclaredMethod(f42067d, new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C14215d.m61672j().mo45042d(str, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find method: ");
            sb.append(e.getMessage());
            j.mo45042d(str, sb.toString());
            return null;
        } catch (Exception e2) {
            C14215d.m61672j().mo45043d(str, "Unexpected error loading FirebaseApp instance.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo45152a() {
        try {
            return ((Boolean) this.f42069a.invoke(this.f42070b, new Object[0])).booleanValue();
        } catch (Exception e) {
            C14215d.m61672j().mo45043d(C14215d.f41919m, "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
            return false;
        }
    }
}
