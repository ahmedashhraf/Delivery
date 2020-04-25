package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.C0224v0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.g */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public final class C8645g<T> {

    /* renamed from: c */
    private static final String f22681c = "ComponentDiscovery";

    /* renamed from: d */
    private static final String f22682d = "com.google.firebase.components.ComponentRegistrar";

    /* renamed from: e */
    private static final String f22683e = "com.google.firebase.components:";

    /* renamed from: a */
    private final T f22684a;

    /* renamed from: b */
    private final C8648c<T> f22685b;

    /* renamed from: com.google.firebase.components.g$b */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8647b implements C8648c<Context> {
        private C8647b() {
        }

        /* renamed from: b */
        private static Bundle m40665b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public List<String> mo32010a(Context context) {
            Bundle b = m40665b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if (C8645g.f22682d.equals(b.get(str)) && str.startsWith(C8645g.f22683e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @C0224v0
    /* renamed from: com.google.firebase.components.g$c */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    interface C8648c<T> {
        /* renamed from: a */
        List<String> mo32010a(T t);
    }

    @C0224v0
    C8645g(T t, C8648c<T> cVar) {
        this.f22684a = t;
        this.f22685b = cVar;
    }

    /* renamed from: a */
    public static C8645g<Context> m40662a(Context context) {
        return new C8645g<>(context, new C8647b());
    }

    /* renamed from: a */
    public List<C8650i> mo32008a() {
        return m40663a(this.f22685b.mo32010a(this.f22684a));
    }

    /* renamed from: a */
    private static List<C8650i> m40663a(List<String> list) {
        String str = "Could not instantiate %s";
        String str2 = "Could not instantiate %s.";
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            try {
                Class cls = Class.forName(str3);
                if (!C8650i.class.isAssignableFrom(cls)) {
                    String.format("Class %s is not an instance of %s", new Object[]{str3, f22682d});
                } else {
                    arrayList.add((C8650i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not an found.", new Object[]{str3});
            } catch (IllegalAccessException unused2) {
                String.format(str2, new Object[]{str3});
            } catch (InstantiationException unused3) {
                String.format(str2, new Object[]{str3});
            } catch (NoSuchMethodException unused4) {
                String.format(str, new Object[]{str3});
            } catch (InvocationTargetException unused5) {
                String.format(str, new Object[]{str3});
            }
        }
        return arrayList;
    }
}
