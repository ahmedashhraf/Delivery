package com.instabug.library.internal.storage.cache;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class CacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String DEFAULT_IN_MEMORY_CACHE_KEY = "DEFAULT_IN_MEMORY_CACHE_KEY";
    private static CacheManager INSTANCE;
    private final List<C9840b> caches = new ArrayList();

    public static abstract class KeyExtractor<K, V> {
        private static transient /* synthetic */ boolean[] $jacocoData;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-146220614628196971L, "com/instabug/library/internal/storage/cache/CacheManager$KeyExtractor", 1);
            $jacocoData = a;
            return a;
        }

        public KeyExtractor() {
            $jacocoInit()[0] = true;
        }

        public abstract K extractKey(V v);
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7740956933111322313L, "com/instabug/library/internal/storage/cache/CacheManager", 91);
        $jacocoData = a;
        return a;
    }

    public CacheManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
        InMemoryCache inMemoryCache = new InMemoryCache(DEFAULT_IN_MEMORY_CACHE_KEY);
        $jacocoInit[2] = true;
        this.caches.add(inMemoryCache);
        $jacocoInit[3] = true;
    }

    public static synchronized CacheManager getInstance() {
        CacheManager cacheManager;
        synchronized (CacheManager.class) {
            boolean[] $jacocoInit = $jacocoInit();
            if (INSTANCE != null) {
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
                INSTANCE = new CacheManager();
                $jacocoInit[6] = true;
            }
            cacheManager = INSTANCE;
            $jacocoInit[7] = true;
        }
        return cacheManager;
    }

    public C9840b addCache(C9840b bVar) {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = getCache(bVar.getId());
        if (cache != null) {
            $jacocoInit[16] = true;
            return cache;
        }
        synchronized (this.caches) {
            try {
                $jacocoInit[17] = true;
                this.caches.add(bVar);
            } finally {
                while (true) {
                    $jacocoInit[18] = true;
                }
            }
        }
        return bVar;
    }

    public boolean cacheExists(String str) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (getCache(str) != null) {
            $jacocoInit[24] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[25] = true;
        }
        $jacocoInit[26] = true;
        return z;
    }

    public boolean deleteCache(String str) {
        boolean remove;
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = getCache(str);
        if (cache != null) {
            synchronized (this.caches) {
                try {
                    $jacocoInit[20] = true;
                    remove = this.caches.remove(cache);
                } finally {
                    while (true) {
                        $jacocoInit[22] = true;
                    }
                }
            }
            return remove;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No cache was this ID was found ");
        sb.append(str);
        sb.append(" to be deleted");
        InstabugSDKLogger.m46622d(this, sb.toString());
        $jacocoInit[23] = true;
        return false;
    }

    /* JADX INFO: finally extract failed */
    @C0195i0
    public C9840b getCache(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.caches) {
            try {
                $jacocoInit[8] = true;
                $jacocoInit[9] = true;
                for (C9840b bVar : this.caches) {
                    $jacocoInit[10] = true;
                    if (!bVar.getId().equals(str)) {
                        $jacocoInit[11] = true;
                        $jacocoInit[13] = true;
                    } else {
                        $jacocoInit[12] = true;
                        return bVar;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("No cache with this ID was found ");
                sb.append(str);
                sb.append(" returning null");
                InstabugSDKLogger.m46622d(this, sb.toString());
                $jacocoInit[15] = true;
                return null;
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[14] = true;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void invalidateAllCaches() {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.caches) {
            try {
                $jacocoInit[35] = true;
                $jacocoInit[36] = true;
                for (C9840b bVar : this.caches) {
                    $jacocoInit[37] = true;
                    bVar.invalidate();
                    $jacocoInit[38] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[39] = true;
                    throw th;
                }
            }
        }
        InstabugSDKLogger.m46622d(this, "All caches have been invalidated");
        $jacocoInit[40] = true;
    }

    /* JADX INFO: finally extract failed */
    public void invalidateAllCachesButUserAttributes() {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.caches) {
            try {
                $jacocoInit[50] = true;
                $jacocoInit[51] = true;
                for (C9840b bVar : this.caches) {
                    $jacocoInit[52] = true;
                    if (bVar.getId().equalsIgnoreCase(UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY)) {
                        $jacocoInit[53] = true;
                    } else {
                        $jacocoInit[54] = true;
                        if (bVar.getId().equalsIgnoreCase(UserAttributesCacheManager.USER_ATTRIBUTES_DISK_CACHE_FILE_NAME)) {
                            $jacocoInit[55] = true;
                        } else {
                            $jacocoInit[56] = true;
                            if (bVar.getId().equalsIgnoreCase(UserAttributesCacheManager.USER_ATTRIBUTES_DISK_CACHE_KEY)) {
                                $jacocoInit[57] = true;
                            } else {
                                $jacocoInit[58] = true;
                                if (bVar.getId().equalsIgnoreCase(UserAttributesCacheManager.USER_ATTRIBUTES_MEMORY_CACHE_KEY)) {
                                    $jacocoInit[59] = true;
                                } else {
                                    $jacocoInit[60] = true;
                                    bVar.invalidate();
                                    $jacocoInit[61] = true;
                                }
                            }
                        }
                    }
                    $jacocoInit[62] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[63] = true;
                    throw th;
                }
            }
        }
        InstabugSDKLogger.m46622d(this, "All caches have been invalidated");
        $jacocoInit[64] = true;
    }

    /* JADX INFO: finally extract failed */
    public void invalidateAllCachesForIdentifyingUsers() {
        boolean[] $jacocoInit = $jacocoInit();
        synchronized (this.caches) {
            try {
                $jacocoInit[41] = true;
                $jacocoInit[42] = true;
                for (C9840b bVar : this.caches) {
                    $jacocoInit[43] = true;
                    if (bVar.getId().equals(UserAttributesCacheManager.USER_ATTRIBUTES_MEMORY_CACHE_KEY)) {
                        $jacocoInit[44] = true;
                    } else {
                        $jacocoInit[45] = true;
                        if (bVar.getId().equals(UserAttributesCacheManager.USER_ATTRIBUTES_DISK_CACHE_KEY)) {
                            $jacocoInit[46] = true;
                        } else {
                            bVar.invalidate();
                            $jacocoInit[47] = true;
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[48] = true;
                    throw th;
                }
            }
        }
        InstabugSDKLogger.m46622d(this, "All caches have been invalidated except user attributes cache");
        $jacocoInit[49] = true;
    }

    public <K, V> void migrateCache(@C0193h0 String str, @C0193h0 String str2, KeyExtractor<K, V> keyExtractor) throws IllegalArgumentException {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = getCache(str);
        $jacocoInit[65] = true;
        C9840b cache2 = getCache(str2);
        $jacocoInit[66] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Caches to be migrated ");
        sb.append(cache);
        sb.append(" - ");
        sb.append(cache2);
        InstabugSDKLogger.m46626v(this, sb.toString());
        if (cache == null) {
            $jacocoInit[67] = true;
            InstabugSDKLogger.m46624e(this, "Migration exception ", new IllegalArgumentException("No cache with these keys was found to migrate from"));
            $jacocoInit[68] = true;
            return;
        }
        if (cache2 != null) {
            $jacocoInit[69] = true;
        } else {
            $jacocoInit[70] = true;
            cache2 = new InMemoryCache(str2);
            $jacocoInit[71] = true;
            addCache(cache2);
            $jacocoInit[72] = true;
        }
        migrateCache(cache, cache2, keyExtractor);
        $jacocoInit[73] = true;
    }

    public boolean subscribe(String str, CacheChangedListener cacheChangedListener) {
        boolean[] $jacocoInit = $jacocoInit();
        if (cacheExists(str)) {
            $jacocoInit[27] = true;
            C9840b cache = getCache(str);
            $jacocoInit[28] = true;
            boolean addOnCacheChangedListener = cache.addOnCacheChangedListener(cacheChangedListener);
            $jacocoInit[29] = true;
            return addOnCacheChangedListener;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No cache exists with this ID to subscribe to");
        $jacocoInit[30] = true;
        throw illegalArgumentException;
    }

    public boolean unSubscribe(String str, CacheChangedListener cacheChangedListener) {
        boolean[] $jacocoInit = $jacocoInit();
        if (cacheExists(str)) {
            $jacocoInit[31] = true;
            C9840b cache = getCache(str);
            $jacocoInit[32] = true;
            boolean removeOnCacheChangedListener = cache.removeOnCacheChangedListener(cacheChangedListener);
            $jacocoInit[33] = true;
            return removeOnCacheChangedListener;
        }
        $jacocoInit[34] = true;
        return false;
    }

    public <K, V> void migrateCache(@C0193h0 C9840b<K, V> bVar, @C0193h0 C9840b<K, V> bVar2, KeyExtractor<K, V> keyExtractor) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, "Invalidated migratingTo cache");
        if (bVar2 == null) {
            $jacocoInit[74] = true;
        } else if (bVar == null) {
            $jacocoInit[75] = true;
        } else {
            bVar2.invalidate();
            $jacocoInit[77] = true;
            List values = bVar.getValues();
            $jacocoInit[78] = true;
            if (values == null) {
                $jacocoInit[79] = true;
            } else if (values.isEmpty()) {
                $jacocoInit[80] = true;
            } else {
                $jacocoInit[82] = true;
                for (Object next : values) {
                    if (next == null) {
                        $jacocoInit[83] = true;
                    } else {
                        $jacocoInit[84] = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding value ");
                        sb.append(next);
                        sb.append(" with key ");
                        $jacocoInit[85] = true;
                        sb.append(keyExtractor.extractKey(next));
                        String sb2 = sb.toString();
                        $jacocoInit[86] = true;
                        InstabugSDKLogger.m46626v(this, sb2);
                        $jacocoInit[87] = true;
                        bVar2.put(keyExtractor.extractKey(next), next);
                        $jacocoInit[88] = true;
                    }
                    $jacocoInit[89] = true;
                }
                $jacocoInit[90] = true;
                return;
            }
            InstabugSDKLogger.m46627w(this, "Cache to migrate from doesn't contain any elements, not going further with the migration");
            $jacocoInit[81] = true;
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("cache migration process got failure, migratingToCache: ");
        sb3.append(bVar2);
        sb3.append(", migratingFromCache: ");
        sb3.append(bVar);
        InstabugSDKLogger.m46627w(CacheManager.class, sb3.toString());
        $jacocoInit[76] = true;
    }
}
