package androidx.databinding.p040f0;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: androidx.databinding.f0.r */
/* compiled from: ListenerUtil */
public class C1244r {

    /* renamed from: a */
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> f5112a = new SparseArray<>();

    /* renamed from: a */
    public static <T> T m6821a(View view, T t, int i) {
        WeakReference weakReference;
        if (VERSION.SDK_INT >= 14) {
            T tag = view.getTag(i);
            view.setTag(i, t);
            return tag;
        }
        synchronized (f5112a) {
            WeakHashMap weakHashMap = (WeakHashMap) f5112a.get(i);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                f5112a.put(i, weakHashMap);
            }
            if (t == null) {
                weakReference = (WeakReference) weakHashMap.remove(view);
            } else {
                weakReference = (WeakReference) weakHashMap.put(view, new WeakReference(t));
            }
            if (weakReference == null) {
                return null;
            }
            T t2 = weakReference.get();
            return t2;
        }
    }

    /* renamed from: a */
    public static <T> T m6820a(View view, int i) {
        if (VERSION.SDK_INT >= 14) {
            return view.getTag(i);
        }
        synchronized (f5112a) {
            WeakHashMap weakHashMap = (WeakHashMap) f5112a.get(i);
            if (weakHashMap == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) weakHashMap.get(view);
            if (weakReference == null) {
                return null;
            }
            T t = weakReference.get();
            return t;
        }
    }
}
