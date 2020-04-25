package com.instabug.chat.cache;

import com.instabug.chat.model.C9426d;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ReadQueueCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String READ_QUEUE_DISK_CACHE_FILE_NAME = "/read_queue.cache";
    public static final String READ_QUEUE_DISK_CACHE_KEY = "read_queue_disk_cache_key";
    public static final String READ_QUEUE_MEMORY_CACHE_KEY = "read_queue_memory_cache_key";
    private static ReadQueueCacheManager mReadQueueCacheManager;

    /* renamed from: com.instabug.chat.cache.ReadQueueCacheManager$a */
    static class C9407a extends KeyExtractor<String, C9426d> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24902a;

        C9407a() {
            m43998a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43998a() {
            boolean[] zArr = f24902a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4123680403551284737L, "com/instabug/chat/cache/ReadQueueCacheManager$1", 3);
            f24902a = a;
            return a;
        }

        /* renamed from: a */
        public String mo33853a(C9426d dVar) {
            boolean[] a = m43998a();
            String a2 = dVar.mo33972a();
            a[1] = true;
            return a2;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m43998a();
            String a2 = mo33853a((C9426d) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.chat.cache.ReadQueueCacheManager$b */
    static class C9408b extends KeyExtractor<String, C9426d> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24903a;

        C9408b() {
            m44000a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44000a() {
            boolean[] zArr = f24903a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(522613897188600055L, "com/instabug/chat/cache/ReadQueueCacheManager$2", 3);
            f24903a = a;
            return a;
        }

        /* renamed from: a */
        public String mo33854a(C9426d dVar) {
            boolean[] a = m44000a();
            String valueOf = String.valueOf(dVar.mo33972a());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m44000a();
            String a2 = mo33854a((C9426d) obj);
            a[2] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5185141669789798499L, "com/instabug/chat/cache/ReadQueueCacheManager", 76);
        $jacocoData = a;
        return a;
    }

    private ReadQueueCacheManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        InstabugSDKLogger.m46622d(this, "Initializing ReadQueueCacheManager");
        $jacocoInit[1] = true;
        InMemoryCache inMemoryCache = new InMemoryCache(READ_QUEUE_MEMORY_CACHE_KEY);
        $jacocoInit[2] = true;
        CacheManager.getInstance().addCache(inMemoryCache);
        $jacocoInit[3] = true;
    }

    public static InMemoryCache<String, C9426d> getCache() {
        Class<ReadQueueCacheManager> cls = ReadQueueCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = READ_QUEUE_MEMORY_CACHE_KEY;
        if (!instance.cacheExists(str)) {
            $jacocoInit[8] = true;
        } else {
            $jacocoInit[9] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            $jacocoInit[10] = true;
            if (cache.getValues().size() <= 0) {
                $jacocoInit[11] = true;
                InstabugSDKLogger.m46622d(cls, "In-memory cache found");
                $jacocoInit[23] = true;
                CacheManager instance2 = CacheManager.getInstance();
                $jacocoInit[24] = true;
                InMemoryCache<String, C9426d> inMemoryCache = (InMemoryCache) instance2.getCache(str);
                $jacocoInit[25] = true;
                return inMemoryCache;
            }
            $jacocoInit[12] = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("In-memory cache not found, loading it from disk ");
        $jacocoInit[13] = true;
        sb.append(CacheManager.getInstance().getCache(str));
        String sb2 = sb.toString();
        $jacocoInit[14] = true;
        InstabugSDKLogger.m46622d(cls, sb2);
        $jacocoInit[15] = true;
        CacheManager.getInstance().migrateCache(READ_QUEUE_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C9407a<K,V>());
        $jacocoInit[16] = true;
        CacheManager instance3 = CacheManager.getInstance();
        $jacocoInit[17] = true;
        C9840b cache2 = instance3.getCache(str);
        if (cache2 == null) {
            $jacocoInit[18] = true;
        } else {
            $jacocoInit[19] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("In-memory cache restored from disk, ");
            $jacocoInit[20] = true;
            sb3.append(cache2.getValues().size());
            sb3.append(" elements restored");
            String sb4 = sb3.toString();
            $jacocoInit[21] = true;
            InstabugSDKLogger.m46622d(cls, sb4);
            $jacocoInit[22] = true;
        }
        InstabugSDKLogger.m46622d(cls, "In-memory cache found");
        $jacocoInit[23] = true;
        CacheManager instance22 = CacheManager.getInstance();
        $jacocoInit[24] = true;
        InMemoryCache<String, C9426d> inMemoryCache2 = (InMemoryCache) instance22.getCache(str);
        $jacocoInit[25] = true;
        return inMemoryCache2;
    }

    public static ReadQueueCacheManager getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (mReadQueueCacheManager != null) {
            $jacocoInit[4] = true;
        } else {
            $jacocoInit[5] = true;
            mReadQueueCacheManager = new ReadQueueCacheManager();
            $jacocoInit[6] = true;
        }
        ReadQueueCacheManager readQueueCacheManager = mReadQueueCacheManager;
        $jacocoInit[7] = true;
        return readQueueCacheManager;
    }

    private void remove(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[60] = true;
        } else {
            $jacocoInit[61] = true;
            cache.delete(str);
            $jacocoInit[62] = true;
        }
        $jacocoInit[63] = true;
    }

    public static void saveCacheToDisk() {
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        $jacocoInit[26] = true;
        C9840b cache = instance.getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        $jacocoInit[27] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[28] = true;
        C9840b cache2 = instance2.getCache(READ_QUEUE_DISK_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[29] = true;
        } else if (cache2 == null) {
            $jacocoInit[30] = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving In-memory cache to disk, no. of items to save is ");
            $jacocoInit[32] = true;
            sb.append(cache.getValues());
            String sb2 = sb.toString();
            $jacocoInit[33] = true;
            InstabugSDKLogger.m46622d(ReadQueueCacheManager.class, sb2);
            $jacocoInit[34] = true;
            CacheManager.getInstance().migrateCache(cache, cache2, (KeyExtractor<K, V>) new C9408b<K,V>());
            $jacocoInit[35] = true;
            return;
        }
        $jacocoInit[31] = true;
    }

    public void add(C9426d dVar) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Adding message ");
        sb.append(dVar);
        sb.append(" to read queue in-memory cache");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[36] = true;
        C9840b cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[37] = true;
        } else {
            $jacocoInit[38] = true;
            cache.put(dVar.mo33972a(), dVar);
            $jacocoInit[39] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Added message ");
            sb2.append(dVar);
            sb2.append(" to read queue in-memory cache ");
            $jacocoInit[40] = true;
            sb2.append(cache.size());
            String sb3 = sb2.toString();
            $jacocoInit[41] = true;
            InstabugSDKLogger.m46626v(this, sb3);
            $jacocoInit[42] = true;
        }
        $jacocoInit[43] = true;
    }

    public List<C9426d> getAll() {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        if (cache != null) {
            $jacocoInit[57] = true;
            List<C9426d> values = cache.getValues();
            $jacocoInit[58] = true;
            return values;
        }
        ArrayList arrayList = new ArrayList();
        $jacocoInit[59] = true;
        return arrayList;
    }

    public JSONArray getReadMessagesArray() {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[44] = true;
        List<C9426d> all = getAll();
        $jacocoInit[45] = true;
        $jacocoInit[46] = true;
        for (C9426d dVar : all) {
            try {
                $jacocoInit[47] = true;
                JSONObject jSONObject = new JSONObject();
                $jacocoInit[48] = true;
                jSONObject.put("chat_number", dVar.mo33972a());
                $jacocoInit[49] = true;
                jSONObject.put("message_id", dVar.mo33977c());
                $jacocoInit[50] = true;
                jSONObject.put("read_at", dVar.mo33975b());
                $jacocoInit[51] = true;
                jSONArray.put(jSONObject);
                $jacocoInit[52] = true;
            } catch (JSONException e) {
                $jacocoInit[53] = true;
                e.printStackTrace();
                $jacocoInit[54] = true;
            }
            $jacocoInit[55] = true;
        }
        $jacocoInit[56] = true;
        return jSONArray;
    }

    public void notify(List<C9426d> list) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[64] = true;
        for (C9426d dVar : getAll()) {
            $jacocoInit[65] = true;
            $jacocoInit[66] = true;
            for (C9426d dVar2 : list) {
                $jacocoInit[67] = true;
                if (!dVar.mo33972a().equals(dVar2.mo33972a())) {
                    $jacocoInit[68] = true;
                } else {
                    $jacocoInit[69] = true;
                    if (!dVar.mo33977c().equals(dVar2.mo33977c())) {
                        $jacocoInit[70] = true;
                    } else {
                        $jacocoInit[71] = true;
                        remove(dVar2.mo33972a());
                        $jacocoInit[72] = true;
                    }
                }
                $jacocoInit[73] = true;
            }
            $jacocoInit[74] = true;
        }
        $jacocoInit[75] = true;
    }
}
