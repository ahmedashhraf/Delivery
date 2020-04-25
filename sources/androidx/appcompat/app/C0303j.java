package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.LongSparseArray;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.j */
/* compiled from: ResourcesFlusher */
class C0303j {

    /* renamed from: a */
    private static final String f906a = "ResourcesFlusher";

    /* renamed from: b */
    private static Field f907b;

    /* renamed from: c */
    private static boolean f908c;

    /* renamed from: d */
    private static Class<?> f909d;

    /* renamed from: e */
    private static boolean f910e;

    /* renamed from: f */
    private static Field f911f;

    /* renamed from: g */
    private static boolean f912g;

    /* renamed from: h */
    private static Field f913h;

    /* renamed from: i */
    private static boolean f914i;

    private C0303j() {
    }

    /* renamed from: a */
    static void m1513a(@C0193h0 Resources resources) {
        int i = VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1517d(resources);
            } else if (i >= 23) {
                m1516c(resources);
            } else if (i >= 21) {
                m1515b(resources);
            }
        }
    }

    @RequiresApi(21)
    /* renamed from: b */
    private static void m1515b(@C0193h0 Resources resources) {
        Map map;
        if (!f908c) {
            try {
                f907b = Resources.class.getDeclaredField("mDrawableCache");
                f907b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f908c = true;
        }
        Field field = f907b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: c */
    private static void m1516c(@C0193h0 Resources resources) {
        if (!f908c) {
            try {
                f907b = Resources.class.getDeclaredField("mDrawableCache");
                f907b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f908c = true;
        }
        Object obj = null;
        Field field = f907b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj != null) {
            m1514a(obj);
        }
    }

    @RequiresApi(24)
    /* renamed from: d */
    private static void m1517d(@C0193h0 Resources resources) {
        Object obj;
        if (!f914i) {
            try {
                f913h = Resources.class.getDeclaredField("mResourcesImpl");
                f913h.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f914i = true;
        }
        Field field = f913h;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj != null) {
                if (!f908c) {
                    try {
                        f907b = obj.getClass().getDeclaredField("mDrawableCache");
                        f907b.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f908c = true;
                }
                Field field2 = f907b;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (obj2 != null) {
                    m1514a(obj2);
                }
            }
        }
    }

    @RequiresApi(16)
    /* renamed from: a */
    private static void m1514a(@C0193h0 Object obj) {
        LongSparseArray longSparseArray;
        if (!f910e) {
            try {
                f909d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f910e = true;
        }
        Class<?> cls = f909d;
        if (cls != null) {
            if (!f912g) {
                try {
                    f911f = cls.getDeclaredField("mUnthemedEntries");
                    f911f.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f912g = true;
            }
            Field field = f911f;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
