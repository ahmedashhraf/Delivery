package com.instabug.featuresrequest.cache;

import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class NewFeatureRequestsCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String NEW_FEATURES_DISK_CACHE_FILE_NAME = "/new_feature_requests.cache";
    public static final String NEW_FEATURES_DISK_CACHE_KEY = "new_feature_requests_disk_cache";
    public static final String NEW_FEATURES_MEMORY_CACHE_KEY = "new_feature_requests._memory_cache";

    /* renamed from: com.instabug.featuresrequest.cache.NewFeatureRequestsCacheManager$a */
    static class C9556a extends KeyExtractor<Long, C9567a> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25264a;

        C9556a() {
            m44665a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44665a() {
            boolean[] zArr = f25264a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3810039812331841961L, "com/instabug/featuresrequest/cache/NewFeatureRequestsCacheManager$1", 3);
            f25264a = a;
            return a;
        }

        /* renamed from: a */
        public Long mo34235a(C9567a aVar) {
            boolean[] a = m44665a();
            Long valueOf = Long.valueOf(aVar.mo34271h());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44665a();
            Long a2 = mo34235a((C9567a) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.featuresrequest.cache.NewFeatureRequestsCacheManager$b */
    static class C9557b implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25265N;

        /* renamed from: a */
        final /* synthetic */ C9840b f25266a;

        /* renamed from: b */
        final /* synthetic */ C9840b f25267b;

        /* renamed from: com.instabug.featuresrequest.cache.NewFeatureRequestsCacheManager$b$a */
        class C9558a extends KeyExtractor<String, C9567a> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25268b;

            /* renamed from: a */
            final /* synthetic */ C9557b f25269a;

            C9558a(C9557b bVar) {
                boolean[] a = m44668a();
                this.f25269a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44668a() {
                boolean[] zArr = f25268b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-1662851055673399330L, "com/instabug/featuresrequest/cache/NewFeatureRequestsCacheManager$2$1", 3);
                f25268b = a;
                return a;
            }

            /* renamed from: a */
            public String mo34237a(C9567a aVar) {
                boolean[] a = m44668a();
                String valueOf = String.valueOf(aVar.mo34271h());
                a[1] = true;
                return valueOf;
            }

            public /* synthetic */ Object extractKey(Object obj) {
                boolean[] a = m44668a();
                String a2 = mo34237a((C9567a) obj);
                a[2] = true;
                return a2;
            }
        }

        C9557b(C9840b bVar, C9840b bVar2) {
            boolean[] a = m44667a();
            this.f25266a = bVar;
            this.f25267b = bVar2;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44667a() {
            boolean[] zArr = f25265N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-523346547185168085L, "com/instabug/featuresrequest/cache/NewFeatureRequestsCacheManager$2", 2);
            f25265N = a;
            return a;
        }

        public void run() {
            boolean[] a = m44667a();
            CacheManager.getInstance().migrateCache(this.f25266a, this.f25267b, (KeyExtractor<K, V>) new C9558a<K,V>(this));
            a[1] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6182863628317597449L, "com/instabug/featuresrequest/cache/NewFeatureRequestsCacheManager", 41);
        $jacocoData = a;
        return a;
    }

    public NewFeatureRequestsCacheManager() {
        $jacocoInit()[0] = true;
    }

    public static void addNewFeatureRequest(C9567a aVar) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            cache.put(Long.valueOf(aVar.mo34271h()), aVar);
            $jacocoInit[30] = true;
        }
        $jacocoInit[31] = true;
    }

    @C0195i0
    public static C9567a deleteNewFeatureRequest(C9567a aVar) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache != null) {
            $jacocoInit[35] = true;
            C9567a aVar2 = (C9567a) cache.delete(Long.valueOf(aVar.mo34271h()));
            $jacocoInit[36] = true;
            return aVar2;
        }
        $jacocoInit[37] = true;
        return null;
    }

    @C0195i0
    public static InMemoryCache<Long, C9567a> getCache() throws IllegalArgumentException {
        Class<NewFeatureRequestsCacheManager> cls = NewFeatureRequestsCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = NEW_FEATURES_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory new_feature_requests cache not found, loading it from disk ");
            $jacocoInit[3] = true;
            CacheManager instance2 = CacheManager.getInstance();
            $jacocoInit[4] = true;
            sb.append(instance2.getCache(str));
            String sb2 = sb.toString();
            $jacocoInit[5] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[6] = true;
            CacheManager.getInstance().migrateCache(NEW_FEATURES_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C9556a<K,V>());
            $jacocoInit[7] = true;
            CacheManager instance3 = CacheManager.getInstance();
            $jacocoInit[8] = true;
            C9840b cache = instance3.getCache(str);
            if (cache == null) {
                $jacocoInit[9] = true;
            } else {
                $jacocoInit[10] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-memory new_feature_requests cache restored from disk, ");
                $jacocoInit[11] = true;
                sb3.append(cache.getValues().size());
                sb3.append(" elements restored");
                String sb4 = sb3.toString();
                $jacocoInit[12] = true;
                InstabugSDKLogger.m46622d(cls, sb4);
                $jacocoInit[13] = true;
            }
        }
        InstabugSDKLogger.m46622d(cls, "In-memory new_feature_requests cache found");
        $jacocoInit[14] = true;
        CacheManager instance4 = CacheManager.getInstance();
        $jacocoInit[15] = true;
        InMemoryCache<Long, C9567a> inMemoryCache = (InMemoryCache) instance4.getCache(str);
        $jacocoInit[16] = true;
        return inMemoryCache;
    }

    @C0195i0
    public static C9567a getNewFeatureRequest(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache != null) {
            $jacocoInit[32] = true;
            C9567a aVar = (C9567a) cache.get(Long.valueOf(j));
            $jacocoInit[33] = true;
            return aVar;
        }
        $jacocoInit[34] = true;
        return null;
    }

    public static List<C9567a> getNewFeatureRequests() {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache != null) {
            $jacocoInit[38] = true;
            List<C9567a> values = cache.getValues();
            $jacocoInit[39] = true;
            return values;
        }
        ArrayList arrayList = new ArrayList();
        $jacocoInit[40] = true;
        return arrayList;
    }

    public static void saveCacheToDisk() {
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        $jacocoInit[19] = true;
        C9840b cache = instance.getCache(NEW_FEATURES_MEMORY_CACHE_KEY);
        $jacocoInit[20] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[21] = true;
        C9840b cache2 = instance2.getCache(NEW_FEATURES_DISK_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[22] = true;
        } else if (cache2 == null) {
            $jacocoInit[23] = true;
        } else {
            $jacocoInit[24] = true;
            Thread thread = new Thread(new C9557b(cache, cache2));
            $jacocoInit[25] = true;
            thread.start();
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
    }

    @C0224v0
    static void tearDown() {
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager.getInstance().deleteCache(NEW_FEATURES_MEMORY_CACHE_KEY);
        $jacocoInit[17] = true;
        CacheManager.getInstance().deleteCache(NEW_FEATURES_DISK_CACHE_KEY);
        $jacocoInit[18] = true;
    }
}
