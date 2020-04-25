package com.instabug.featuresrequest.cache;

import androidx.annotation.C0224v0;
import com.instabug.featuresrequest.models.C9575f;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class TimelineCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String TIMELINE_DISK_CACHE_FILE_NAME = "/timeline.cache";
    public static final String TIMELINE_DISK_CACHE_KEY = "timeline_disk_cache";
    public static final String TIMELINE_MEMORY_CACHE_KEY = "timeline_memory_cache";

    /* renamed from: com.instabug.featuresrequest.cache.TimelineCacheManager$a */
    static class C9559a extends KeyExtractor<Long, C9575f> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25270a;

        C9559a() {
            m44670a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44670a() {
            boolean[] zArr = f25270a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6743207956553067083L, "com/instabug/featuresrequest/cache/TimelineCacheManager$1", 3);
            f25270a = a;
            return a;
        }

        /* renamed from: a */
        public Long mo34238a(C9575f fVar) {
            boolean[] a = m44670a();
            Long valueOf = Long.valueOf(fVar.mo34316d());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44670a();
            Long a2 = mo34238a((C9575f) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.featuresrequest.cache.TimelineCacheManager$b */
    static class C9560b extends KeyExtractor<String, C9575f> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25271a;

        C9560b() {
            m44672a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44672a() {
            boolean[] zArr = f25271a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4418010763570981124L, "com/instabug/featuresrequest/cache/TimelineCacheManager$2", 3);
            f25271a = a;
            return a;
        }

        /* renamed from: a */
        public String mo34239a(C9575f fVar) {
            boolean[] a = m44672a();
            String valueOf = String.valueOf(fVar.mo34316d());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44672a();
            String a2 = mo34239a((C9575f) obj);
            a[2] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3377952161002762069L, "com/instabug/featuresrequest/cache/TimelineCacheManager", 28);
        $jacocoData = a;
        return a;
    }

    public TimelineCacheManager() {
        $jacocoInit()[0] = true;
    }

    public static void addTimeline(C9575f fVar) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            cache.put(Long.valueOf(fVar.mo34316d()), fVar);
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
    }

    public static InMemoryCache<Long, C9575f> getCache() throws IllegalArgumentException {
        Class<TimelineCacheManager> cls = TimelineCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = TIMELINE_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory comments cache not found, loading it from disk ");
            $jacocoInit[3] = true;
            sb.append(CacheManager.getInstance().getCache(str));
            String sb2 = sb.toString();
            $jacocoInit[4] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[5] = true;
            CacheManager.getInstance().migrateCache(TIMELINE_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C9559a<K,V>());
            $jacocoInit[6] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            if (cache == null) {
                $jacocoInit[7] = true;
            } else {
                $jacocoInit[8] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-memory Comments cache restored from disk, ");
                $jacocoInit[9] = true;
                sb3.append(cache.size());
                sb3.append(" elements restored");
                String sb4 = sb3.toString();
                $jacocoInit[10] = true;
                InstabugSDKLogger.m46622d(cls, sb4);
                $jacocoInit[11] = true;
            }
        }
        InstabugSDKLogger.m46622d(FeatureRequestCacheManager.class, "In-memory Comments cache found");
        $jacocoInit[12] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[13] = true;
        InMemoryCache<Long, C9575f> inMemoryCache = (InMemoryCache) instance2.getCache(str);
        $jacocoInit[14] = true;
        return inMemoryCache;
    }

    public static C9575f getComments(long j) {
        C9575f fVar = (C9575f) getCache().get(Long.valueOf(j));
        $jacocoInit()[23] = true;
        return fVar;
    }

    public static void saveCacheToDisk() {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = CacheManager.getInstance().getCache(TIMELINE_DISK_CACHE_KEY);
        $jacocoInit[17] = true;
        C9840b cache2 = CacheManager.getInstance().getCache(TIMELINE_MEMORY_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[18] = true;
        } else {
            $jacocoInit[20] = true;
            CacheManager.getInstance().migrateCache(cache2, cache, (KeyExtractor<K, V>) new C9560b<K,V>());
            $jacocoInit[21] = true;
        }
        $jacocoInit[22] = true;
    }

    @C0224v0
    static void tearDown() {
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager.getInstance().deleteCache(TIMELINE_DISK_CACHE_KEY);
        $jacocoInit[15] = true;
        CacheManager.getInstance().deleteCache(TIMELINE_MEMORY_CACHE_KEY);
        $jacocoInit[16] = true;
    }
}
