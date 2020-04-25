package p205i.p489f.p490h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p205i.p489f.p491i.C14085c;

/* renamed from: i.f.h.a */
/* compiled from: BasicMDCAdapter */
public class C14071a implements C14085c {

    /* renamed from: b */
    static boolean f41346b = m60757c();

    /* renamed from: a */
    private InheritableThreadLocal f41347a = new InheritableThreadLocal();

    /* renamed from: c */
    static boolean m60757c() {
        try {
            return System.getProperty("java.version").startsWith("1.4");
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo44496a(String str, String str2) {
        if (str != null) {
            Map map = (Map) this.f41347a.get();
            if (map == null) {
                map = Collections.synchronizedMap(new HashMap());
                this.f41347a.set(map);
            }
            map.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("key cannot be null");
    }

    /* renamed from: b */
    public String mo44498b(String str) {
        Map map = (Map) this.f41347a.get();
        if (map == null || str == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public void clear() {
        Map map = (Map) this.f41347a.get();
        if (map != null) {
            map.clear();
            if (m60757c()) {
                this.f41347a.set(null);
            } else {
                this.f41347a.remove();
            }
        }
    }

    public void remove(String str) {
        Map map = (Map) this.f41347a.get();
        if (map != null) {
            map.remove(str);
        }
    }

    /* renamed from: b */
    public Set mo44499b() {
        Map map = (Map) this.f41347a.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    /* renamed from: a */
    public Map mo44495a() {
        Map map = (Map) this.f41347a.get();
        if (map == null) {
            return null;
        }
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronized (map) {
            synchronizedMap.putAll(map);
        }
        return synchronizedMap;
    }

    /* renamed from: a */
    public void mo44497a(Map map) {
        this.f41347a.set(Collections.synchronizedMap(new HashMap(map)));
    }
}
