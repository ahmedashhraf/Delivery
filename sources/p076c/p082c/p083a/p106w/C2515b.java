package p076c.p082c.p083a.p106w;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.c.a.w.b */
/* compiled from: ManifestParser */
public final class C2515b {

    /* renamed from: b */
    private static final String f9547b = "GlideModule";

    /* renamed from: a */
    private final Context f9548a;

    public C2515b(Context context) {
        this.f9548a = context;
    }

    /* renamed from: a */
    public List<C2514a> mo9973a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f9548a.getPackageManager().getApplicationInfo(this.f9548a.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if (f9547b.equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(m12491a(str));
                    }
                }
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    /* renamed from: a */
    private static C2514a m12491a(String str) {
        String str2 = "Unable to instantiate GlideModule implementation for ";
        try {
            Class cls = Class.forName(str);
            try {
                Object newInstance = cls.newInstance();
                if (newInstance instanceof C2514a) {
                    return (C2514a) newInstance;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected instanceof GlideModule, but found: ");
                sb.append(newInstance);
                throw new RuntimeException(sb.toString());
            } catch (InstantiationException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }
}
