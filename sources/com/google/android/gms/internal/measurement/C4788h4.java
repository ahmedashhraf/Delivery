package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5005u3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
abstract class C4788h4<T extends C5005u3> {

    /* renamed from: a */
    private static final Logger f14166a = Logger.getLogger(zzek.class.getName());

    /* renamed from: b */
    private static String f14167b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C4788h4() {
    }

    /* renamed from: a */
    static <T extends C5005u3> T m20257a(Class<T> cls) {
        String str;
        Class<C4788h4> cls2 = C4788h4.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C5005u3.class)) {
            str = f14167b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C5005u3) cls.cast(((C4788h4) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo19027a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C4788h4) it.next()).mo19027a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f14166a;
                    Level level = Level.SEVERE;
                    String str2 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C5005u3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C5005u3) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo19027a();
}
