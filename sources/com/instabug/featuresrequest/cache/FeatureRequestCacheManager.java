package com.instabug.featuresrequest.cache;

import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.FeatureRequestResponse;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FeatureRequestCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String FEATURES_REQUESTS_EXTRAS_DISK_CACHE_FILE_NAME = "/features_request_extras.cache";
    public static final String FEATURES_REQUESTS_EXTRAS_DISK_CACHE_KEY = "features_request_extras_disk_cache";
    public static final String FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY = "features_request_extras_memory_cache";
    public static final String FEATURES_REQUEST_DISK_CACHE_FILE_NAME = "/features_request.cache";
    public static final String FEATURES_REQUEST_DISK_CACHE_KEY = "features_request_disk_cache";
    public static final String FEATURES_REQUEST_MEMORY_CACHE_KEY = "features_request_memory_cache";
    private final String TAG = FeatureRequestCacheManager.class.getSimpleName();

    /* renamed from: com.instabug.featuresrequest.cache.FeatureRequestCacheManager$a */
    static class C9552a extends KeyExtractor<Long, C9567a> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25260a;

        C9552a() {
            m44657a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44657a() {
            boolean[] zArr = f25260a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-59171709366053244L, "com/instabug/featuresrequest/cache/FeatureRequestCacheManager$1", 3);
            f25260a = a;
            return a;
        }

        /* renamed from: a */
        public Long mo34231a(C9567a aVar) {
            boolean[] a = m44657a();
            Long valueOf = Long.valueOf(aVar.mo34271h());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44657a();
            Long a2 = mo34231a((C9567a) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.featuresrequest.cache.FeatureRequestCacheManager$b */
    static class C9553b extends KeyExtractor<String, C9567a> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25261a;

        C9553b() {
            m44659a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44659a() {
            boolean[] zArr = f25261a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7263580536439214199L, "com/instabug/featuresrequest/cache/FeatureRequestCacheManager$2", 3);
            f25261a = a;
            return a;
        }

        /* renamed from: a */
        public String mo34232a(C9567a aVar) {
            boolean[] a = m44659a();
            String valueOf = String.valueOf(aVar.mo34271h());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44659a();
            String a2 = mo34232a((C9567a) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.featuresrequest.cache.FeatureRequestCacheManager$c */
    static class C9554c extends KeyExtractor<String, Object> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25262a;

        C9554c() {
            m44661a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44661a() {
            boolean[] zArr = f25262a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7004262475654630339L, "com/instabug/featuresrequest/cache/FeatureRequestCacheManager$3", 5);
            f25262a = a;
            return a;
        }

        /* renamed from: a */
        public String mo34233a(Object obj) {
            String str;
            boolean[] a = m44661a();
            if (obj instanceof Boolean) {
                a[1] = true;
                str = FeatureRequestResponse.KEY_NEXT_PAGE;
            } else {
                a[2] = true;
                str = FeatureRequestResponse.KEY_COMPLETED_FEATURES_COUNT;
            }
            a[3] = true;
            return str;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44661a();
            String a2 = mo34233a(obj);
            a[4] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.featuresrequest.cache.FeatureRequestCacheManager$d */
    static class C9555d extends KeyExtractor<String, Object> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25263a;

        C9555d() {
            m44663a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44663a() {
            boolean[] zArr = f25263a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3889014106443314681L, "com/instabug/featuresrequest/cache/FeatureRequestCacheManager$4", 5);
            f25263a = a;
            return a;
        }

        /* renamed from: a */
        public String mo34234a(Object obj) {
            String str;
            boolean[] a = m44663a();
            if (obj instanceof Boolean) {
                a[1] = true;
                str = FeatureRequestResponse.KEY_NEXT_PAGE;
            } else {
                a[2] = true;
                str = FeatureRequestResponse.KEY_COMPLETED_FEATURES_COUNT;
            }
            a[3] = true;
            return str;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44663a();
            String a2 = mo34234a(obj);
            a[4] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1102253913797014409L, "com/instabug/featuresrequest/cache/FeatureRequestCacheManager", 114);
        $jacocoData = a;
        return a;
    }

    public FeatureRequestCacheManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    public static void addFeature(C9567a aVar) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[39] = true;
        } else {
            $jacocoInit[40] = true;
            cache.put(Long.valueOf(aVar.mo34271h()), aVar);
            $jacocoInit[41] = true;
        }
        $jacocoInit[42] = true;
    }

    public static void addFeatures(List<C9567a> list) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[35] = true;
        for (C9567a aVar : list) {
            $jacocoInit[36] = true;
            addFeature(aVar);
            $jacocoInit[37] = true;
        }
        $jacocoInit[38] = true;
    }

    public static InMemoryCache<Long, C9567a> getCache() throws IllegalArgumentException {
        Class<FeatureRequestCacheManager> cls = FeatureRequestCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = FEATURES_REQUEST_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[2] = true;
        } else {
            $jacocoInit[3] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory features requet cache not found, loading it from disk ");
            $jacocoInit[4] = true;
            sb.append(CacheManager.getInstance().getCache(str));
            String sb2 = sb.toString();
            $jacocoInit[5] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[6] = true;
            CacheManager.getInstance().migrateCache(FEATURES_REQUEST_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C9552a<K,V>());
            $jacocoInit[7] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            if (cache == null) {
                $jacocoInit[8] = true;
            } else {
                $jacocoInit[9] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-memory Feature Request cache restored from disk, ");
                $jacocoInit[10] = true;
                sb3.append(cache.size());
                sb3.append(" elements restored");
                String sb4 = sb3.toString();
                $jacocoInit[11] = true;
                InstabugSDKLogger.m46622d(cls, sb4);
                $jacocoInit[12] = true;
            }
        }
        InstabugSDKLogger.m46622d(cls, "In-memory features request cache found");
        $jacocoInit[13] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[14] = true;
        InMemoryCache<Long, C9567a> inMemoryCache = (InMemoryCache) instance2.getCache(str);
        $jacocoInit[15] = true;
        return inMemoryCache;
    }

    public static int getCompletedFeaturesCount() {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache extrasCache = getExtrasCache();
        if (extrasCache == null) {
            $jacocoInit[104] = true;
        } else {
            $jacocoInit[105] = true;
            String str = FeatureRequestResponse.KEY_COMPLETED_FEATURES_COUNT;
            if (extrasCache.get(str) == null) {
                $jacocoInit[106] = true;
            } else {
                $jacocoInit[107] = true;
                int intValue = ((Integer) extrasCache.get(str)).intValue();
                $jacocoInit[108] = true;
                return intValue;
            }
        }
        $jacocoInit[109] = true;
        return 0;
    }

    public static InMemoryCache<String, Object> getExtrasCache() throws IllegalArgumentException {
        Class<FeatureRequestCacheManager> cls = FeatureRequestCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[61] = true;
        } else {
            $jacocoInit[62] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory features request extas cache not found, loading it from disk ");
            $jacocoInit[63] = true;
            CacheManager instance2 = CacheManager.getInstance();
            $jacocoInit[64] = true;
            sb.append(instance2.getCache(str));
            String sb2 = sb.toString();
            $jacocoInit[65] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[66] = true;
            CacheManager.getInstance().migrateCache(FEATURES_REQUESTS_EXTRAS_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C9554c<K,V>());
            $jacocoInit[67] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            if (cache == null) {
                $jacocoInit[68] = true;
            } else {
                $jacocoInit[69] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-memory Feature Request extras cache restored from disk, ");
                $jacocoInit[70] = true;
                sb3.append(cache.size());
                sb3.append(" elements restored");
                String sb4 = sb3.toString();
                $jacocoInit[71] = true;
                InstabugSDKLogger.m46622d(cls, sb4);
                $jacocoInit[72] = true;
            }
        }
        InstabugSDKLogger.m46622d(cls, "In-memory features request extras cache found");
        $jacocoInit[73] = true;
        CacheManager instance3 = CacheManager.getInstance();
        $jacocoInit[74] = true;
        InMemoryCache<String, Object> inMemoryCache = (InMemoryCache) instance3.getCache(str);
        $jacocoInit[75] = true;
        return inMemoryCache;
    }

    @C0195i0
    public static C9567a getFeature(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[46] = true;
        } else {
            $jacocoInit[47] = true;
            $jacocoInit[48] = true;
            for (C9567a aVar : cache.getValues()) {
                $jacocoInit[50] = true;
                if (aVar.mo34271h() == j) {
                    $jacocoInit[51] = true;
                    return aVar;
                }
                $jacocoInit[52] = true;
            }
            $jacocoInit[49] = true;
        }
        $jacocoInit[53] = true;
        return null;
    }

    public static List<C9567a> getFeatures() {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache != null) {
            $jacocoInit[43] = true;
            List<C9567a> values = cache.getValues();
            $jacocoInit[44] = true;
            return values;
        }
        ArrayList arrayList = new ArrayList();
        $jacocoInit[45] = true;
        return arrayList;
    }

    public static List<C9567a> getVotesToUpload() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[54] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[55] = true;
        } else {
            $jacocoInit[56] = true;
            List values = cache.getValues();
            $jacocoInit[57] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("size: ");
            sb.append(values.size());
            InstabugSDKLogger.m46622d(FeatureRequestCacheManager.class, sb.toString());
            $jacocoInit[58] = true;
            arrayList.addAll(values);
            $jacocoInit[59] = true;
        }
        $jacocoInit[60] = true;
        return arrayList;
    }

    public static boolean hasNextPage() {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache extrasCache = getExtrasCache();
        if (extrasCache == null) {
            $jacocoInit[98] = true;
        } else {
            $jacocoInit[99] = true;
            String str = FeatureRequestResponse.KEY_NEXT_PAGE;
            if (extrasCache.get(str) == null) {
                $jacocoInit[100] = true;
            } else {
                $jacocoInit[101] = true;
                boolean booleanValue = ((Boolean) extrasCache.get(str)).booleanValue();
                $jacocoInit[102] = true;
                return booleanValue;
            }
        }
        $jacocoInit[103] = true;
        return false;
    }

    public static void saveCacheToDisk() {
        int i;
        Class<FeatureRequestCacheManager> cls = FeatureRequestCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        $jacocoInit[18] = true;
        C9840b cache = instance.getCache(FEATURES_REQUEST_DISK_CACHE_KEY);
        $jacocoInit[19] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[20] = true;
        C9840b cache2 = instance2.getCache(FEATURES_REQUEST_MEMORY_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[21] = true;
        } else if (cache2 == null) {
            $jacocoInit[22] = true;
        } else {
            $jacocoInit[23] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Checking old values cached ");
            $jacocoInit[24] = true;
            sb.append(cache.getValues());
            String sb2 = sb.toString();
            $jacocoInit[25] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[26] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Saving In-memory feature requests cache to disk, no. of feature requests to save is ");
            $jacocoInit[27] = true;
            sb3.append(cache2.size());
            String sb4 = sb3.toString();
            $jacocoInit[28] = true;
            InstabugSDKLogger.m46622d(cls, sb4);
            $jacocoInit[29] = true;
            CacheManager instance3 = CacheManager.getInstance();
            C9553b bVar = new C9553b();
            $jacocoInit[30] = true;
            instance3.migrateCache(cache2, cache, (KeyExtractor<K, V>) bVar);
            $jacocoInit[31] = true;
            i = cache.getValues().size();
            $jacocoInit[32] = true;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("In-memory feature requests cache had been persisted on-disk, ");
            sb5.append(i);
            sb5.append(" feautre reuests saved");
            InstabugSDKLogger.m46622d(cls, sb5.toString());
            $jacocoInit[34] = true;
        }
        i = 0;
        $jacocoInit[33] = true;
        StringBuilder sb52 = new StringBuilder();
        sb52.append("In-memory feature requests cache had been persisted on-disk, ");
        sb52.append(i);
        sb52.append(" feautre reuests saved");
        InstabugSDKLogger.m46622d(cls, sb52.toString());
        $jacocoInit[34] = true;
    }

    public static void saveExtrasCacheToDisk() {
        int i;
        Class<FeatureRequestCacheManager> cls = FeatureRequestCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        $jacocoInit[76] = true;
        C9840b cache = instance.getCache(FEATURES_REQUESTS_EXTRAS_DISK_CACHE_KEY);
        $jacocoInit[77] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[78] = true;
        C9840b cache2 = instance2.getCache(FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[79] = true;
        } else if (cache2 == null) {
            $jacocoInit[80] = true;
        } else {
            $jacocoInit[81] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Checking old values cached ");
            $jacocoInit[82] = true;
            sb.append(cache.getValues());
            String sb2 = sb.toString();
            $jacocoInit[83] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[84] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Saving In-memory feature requests extras cache to disk, no. of feature requests to save is ");
            $jacocoInit[85] = true;
            sb3.append(cache2.size());
            String sb4 = sb3.toString();
            $jacocoInit[86] = true;
            InstabugSDKLogger.m46622d(cls, sb4);
            $jacocoInit[87] = true;
            CacheManager instance3 = CacheManager.getInstance();
            C9555d dVar = new C9555d();
            $jacocoInit[88] = true;
            instance3.migrateCache(cache2, cache, (KeyExtractor<K, V>) dVar);
            $jacocoInit[89] = true;
            List values = cache.getValues();
            $jacocoInit[90] = true;
            i = values.size();
            $jacocoInit[91] = true;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("In-memory feature requests extras cache had been persisted on-disk, ");
            sb5.append(i);
            sb5.append(" feauture requests extras saved");
            InstabugSDKLogger.m46622d(cls, sb5.toString());
            $jacocoInit[93] = true;
        }
        i = 0;
        $jacocoInit[92] = true;
        StringBuilder sb52 = new StringBuilder();
        sb52.append("In-memory feature requests extras cache had been persisted on-disk, ");
        sb52.append(i);
        sb52.append(" feauture requests extras saved");
        InstabugSDKLogger.m46622d(cls, sb52.toString());
        $jacocoInit[93] = true;
    }

    public static void setCompletedFeaturesCount(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache extrasCache = getExtrasCache();
        if (extrasCache == null) {
            $jacocoInit[110] = true;
        } else {
            $jacocoInit[111] = true;
            extrasCache.put(FeatureRequestResponse.KEY_COMPLETED_FEATURES_COUNT, Integer.valueOf(i));
            $jacocoInit[112] = true;
        }
        $jacocoInit[113] = true;
    }

    public static void setHasNextPage(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache extrasCache = getExtrasCache();
        if (extrasCache == null) {
            $jacocoInit[94] = true;
        } else {
            $jacocoInit[95] = true;
            extrasCache.put(FeatureRequestResponse.KEY_NEXT_PAGE, Boolean.valueOf(z));
            $jacocoInit[96] = true;
        }
        $jacocoInit[97] = true;
    }

    @C0224v0
    static void tearDown() {
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager.getInstance().deleteCache(FEATURES_REQUEST_MEMORY_CACHE_KEY);
        $jacocoInit[16] = true;
        CacheManager.getInstance().deleteCache(FEATURES_REQUEST_DISK_CACHE_KEY);
        $jacocoInit[17] = true;
    }
}
