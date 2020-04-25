package com.instabug.library.internal.storage.cache;

import androidx.annotation.C0195i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InMemoryCache<K, V> extends C9840b<K, V> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final LinkedHashMap<K, V> map;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4901026602068399987L, "com/instabug/library/internal/storage/cache/InMemoryCache", 32);
        $jacocoData = a;
        return a;
    }

    public InMemoryCache(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this(str, 1);
        $jacocoInit[0] = true;
    }

    public V delete(K k) {
        V remove;
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.map) {
            try {
                $jacocoInit[14] = true;
                remove = this.map.remove(k);
            } finally {
                while (true) {
                    $jacocoInit[15] = true;
                }
            }
        }
        if (remove != null) {
            $jacocoInit[17] = true;
            notifyItemRemoved(remove);
            $jacocoInit[18] = true;
        }
        $jacocoInit[19] = true;
        return remove;
    }

    @C0195i0
    public V get(K k) {
        V v;
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.map) {
            try {
                $jacocoInit[3] = true;
                v = this.map.get(k);
            } finally {
                while (true) {
                    $jacocoInit[5] = true;
                }
            }
        }
        return v;
    }

    /* JADX INFO: finally extract failed */
    public List<V> getValues() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        synchronized (this.map) {
            try {
                $jacocoInit[26] = true;
                $jacocoInit[27] = true;
                for (Object next : this.map.keySet()) {
                    $jacocoInit[28] = true;
                    arrayList.add(get(next));
                    $jacocoInit[29] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[30] = true;
                    throw th;
                }
            }
        }
        $jacocoInit[31] = true;
        return arrayList;
    }

    public void invalidate() {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.map) {
            try {
                $jacocoInit[23] = true;
                this.map.clear();
            } finally {
                while (true) {
                    $jacocoInit[24] = true;
                }
            }
        }
        notifyCacheInvalidated();
    }

    public V put(K k, V v) {
        V put;
        boolean[] $jacocoInit = $jacocoInit();
        if (v == null) {
            $jacocoInit[6] = true;
        } else if (k == null) {
            $jacocoInit[7] = true;
        } else {
            synchronized (this.map) {
                try {
                    $jacocoInit[8] = true;
                    put = this.map.put(k, v);
                } finally {
                    while (true) {
                        $jacocoInit[9] = true;
                    }
                }
            }
            if (put == null) {
                $jacocoInit[10] = true;
                notifyItemAdded(v);
                return v;
            }
            notifyItemUpdated(put, v);
            $jacocoInit[12] = true;
            return put;
        }
        $jacocoInit[13] = true;
        return null;
    }

    public long size() {
        long size;
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.map) {
            try {
                $jacocoInit[20] = true;
                size = (long) this.map.size();
            } finally {
                while (true) {
                    $jacocoInit[22] = true;
                }
            }
        }
        return size;
    }

    public InMemoryCache(String str, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(str, i);
        $jacocoInit[1] = true;
        this.map = new LinkedHashMap<>();
        $jacocoInit[2] = true;
    }
}
