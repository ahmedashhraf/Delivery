package p076c.p082c.p083a.p111z;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.z.a */
/* compiled from: ApplicationVersionSignature */
public final class C2565a {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, C2272c> f9660a = new ConcurrentHashMap<>();

    private C2565a() {
    }

    /* renamed from: a */
    public static C2272c m12662a(Context context) {
        String packageName = context.getPackageName();
        C2272c cVar = (C2272c) f9660a.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        C2272c b = m12664b(context);
        C2272c cVar2 = (C2272c) f9660a.putIfAbsent(packageName, b);
        return cVar2 == null ? b : cVar2;
    }

    /* renamed from: b */
    private static C2272c m12664b(Context context) {
        PackageInfo packageInfo;
        String str;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = String.valueOf(packageInfo.versionCode);
        } else {
            str = UUID.randomUUID().toString();
        }
        return new C2568d(str);
    }

    /* renamed from: a */
    static void m12663a() {
        f9660a.clear();
    }
}
