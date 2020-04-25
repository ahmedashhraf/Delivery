package com.instabug.library.internal.storage.cache;

import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.b */
/* compiled from: Cache */
public abstract class C9840b<K, V> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private int appVersion;

    /* renamed from: id */
    private String f26073id;
    private final List<CacheChangedListener<V>> listeners;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1390275144728763349L, "com/instabug/library/internal/storage/cache/Cache", 27);
        $jacocoData = a;
        return a;
    }

    public C9840b(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this(str, 1);
        $jacocoInit[0] = true;
    }

    public boolean addOnCacheChangedListener(CacheChangedListener<V> cacheChangedListener) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (this.listeners.contains(cacheChangedListener)) {
            $jacocoInit[21] = true;
        } else if (!this.listeners.add(cacheChangedListener)) {
            $jacocoInit[22] = true;
        } else {
            $jacocoInit[23] = true;
            z = true;
            $jacocoInit[25] = true;
            return z;
        }
        z = false;
        $jacocoInit[24] = true;
        $jacocoInit[25] = true;
        return z;
    }

    public abstract V delete(K k);

    public abstract V get(K k);

    public int getAppVersion() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.appVersion;
        $jacocoInit[20] = true;
        return i;
    }

    public String getId() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.f26073id;
        $jacocoInit[19] = true;
        return str;
    }

    public abstract List<V> getValues();

    public abstract void invalidate();

    public void notifyCacheInvalidated() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[15] = true;
        for (CacheChangedListener cacheChangedListener : this.listeners) {
            $jacocoInit[16] = true;
            cacheChangedListener.onCacheInvalidated();
            $jacocoInit[17] = true;
        }
        $jacocoInit[18] = true;
    }

    public void notifyItemAdded(V v) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[7] = true;
        for (CacheChangedListener cacheChangedListener : this.listeners) {
            $jacocoInit[8] = true;
            cacheChangedListener.onCachedItemAdded(v);
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
    }

    public void notifyItemRemoved(V v) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[3] = true;
        for (CacheChangedListener cacheChangedListener : this.listeners) {
            $jacocoInit[4] = true;
            cacheChangedListener.onCachedItemRemoved(v);
            $jacocoInit[5] = true;
        }
        $jacocoInit[6] = true;
    }

    public void notifyItemUpdated(V v, V v2) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[11] = true;
        for (CacheChangedListener cacheChangedListener : this.listeners) {
            $jacocoInit[12] = true;
            cacheChangedListener.onCachedItemUpdated(v, v2);
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
    }

    public abstract V put(K k, V v);

    public boolean removeOnCacheChangedListener(CacheChangedListener<V> cacheChangedListener) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean remove = this.listeners.remove(cacheChangedListener);
        $jacocoInit[26] = true;
        return remove;
    }

    public abstract long size();

    protected C9840b(String str, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.appVersion = -1;
        this.f26073id = str;
        this.appVersion = i;
        $jacocoInit[1] = true;
        this.listeners = new ArrayList();
        $jacocoInit[2] = true;
    }
}
