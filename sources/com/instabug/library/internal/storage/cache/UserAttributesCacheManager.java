package com.instabug.library.internal.storage.cache;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.model.C9948b;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.HashMap;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class UserAttributesCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String USER_ATTRIBUTES_CACHE_KEY = "attrs";
    public static final String USER_ATTRIBUTES_DISK_CACHE_FILE_NAME = "/user_attributes.cache";
    public static final String USER_ATTRIBUTES_DISK_CACHE_KEY = "user_attributes_disk_cache";
    public static final String USER_ATTRIBUTES_MEMORY_CACHE_KEY = "user_attributes_memory_cache";

    /* renamed from: com.instabug.library.internal.storage.cache.UserAttributesCacheManager$a */
    static class C9837a extends KeyExtractor<String, C9948b> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26070a;

        C9837a() {
            m45849a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45849a() {
            boolean[] zArr = f26070a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2358686291816709895L, "com/instabug/library/internal/storage/cache/UserAttributesCacheManager$1", 3);
            f26070a = a;
            return a;
        }

        /* renamed from: a */
        public String mo35007a(C9948b bVar) {
            m45849a()[1] = true;
            return UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m45849a();
            String a2 = mo35007a((C9948b) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.UserAttributesCacheManager$b */
    static class C9838b extends KeyExtractor<String, C9948b> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26071a;

        C9838b() {
            m45851a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45851a() {
            boolean[] zArr = f26071a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6555695079233924685L, "com/instabug/library/internal/storage/cache/UserAttributesCacheManager$2", 3);
            f26071a = a;
            return a;
        }

        /* renamed from: a */
        public String mo35008a(C9948b bVar) {
            m45851a()[1] = true;
            return UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m45851a();
            String a2 = mo35008a((C9948b) obj);
            a[2] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7902779433791604974L, "com/instabug/library/internal/storage/cache/UserAttributesCacheManager", 55);
        $jacocoData = a;
        return a;
    }

    public UserAttributesCacheManager() {
        $jacocoInit()[0] = true;
    }

    public static void deleteAll() {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            cache.invalidate();
            $jacocoInit[30] = true;
        }
        saveCacheToDisk();
        $jacocoInit[31] = true;
    }

    public static void deleteAttribute(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[22] = true;
        } else {
            $jacocoInit[23] = true;
            C9948b bVar = (C9948b) cache.get(USER_ATTRIBUTES_CACHE_KEY);
            if (bVar == null) {
                $jacocoInit[24] = true;
            } else {
                $jacocoInit[25] = true;
                bVar.mo35474c(str);
                $jacocoInit[26] = true;
            }
        }
        saveCacheToDisk();
        $jacocoInit[27] = true;
    }

    @C0195i0
    public static HashMap<String, String> getAll() {
        C9948b bVar;
        boolean[] $jacocoInit = $jacocoInit();
        HashMap<String, String> hashMap = null;
        if (getCache() != null) {
            $jacocoInit[32] = true;
            bVar = (C9948b) getCache().get(USER_ATTRIBUTES_CACHE_KEY);
            $jacocoInit[33] = true;
        } else {
            $jacocoInit[34] = true;
            bVar = null;
        }
        if (bVar == null) {
            $jacocoInit[35] = true;
        } else if (bVar.mo35471a() == null) {
            $jacocoInit[36] = true;
        } else if (bVar.mo35471a().isEmpty()) {
            $jacocoInit[37] = true;
        } else {
            $jacocoInit[39] = true;
            hashMap = bVar.mo35471a();
            $jacocoInit[40] = true;
            $jacocoInit[41] = true;
            return hashMap;
        }
        $jacocoInit[38] = true;
        $jacocoInit[41] = true;
        return hashMap;
    }

    @C0195i0
    public static String getAttribute(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[16] = true;
        } else {
            $jacocoInit[17] = true;
            C9948b bVar = (C9948b) cache.get(USER_ATTRIBUTES_CACHE_KEY);
            if (bVar == null) {
                $jacocoInit[18] = true;
            } else {
                $jacocoInit[19] = true;
                String b = bVar.mo35473b(str);
                $jacocoInit[20] = true;
                return b;
            }
        }
        $jacocoInit[21] = true;
        return null;
    }

    public static InMemoryCache<String, C9948b> getCache() {
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        C9837a aVar = new C9837a();
        String str = USER_ATTRIBUTES_MEMORY_CACHE_KEY;
        instance.migrateCache(USER_ATTRIBUTES_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) aVar);
        $jacocoInit[1] = true;
        InMemoryCache<String, C9948b> inMemoryCache = (InMemoryCache) CacheManager.getInstance().getCache(str);
        $jacocoInit[2] = true;
        return inMemoryCache;
    }

    public static String getUserAttributes() {
        String str;
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[42] = true;
        HashMap all = getAll();
        if (all == null) {
            $jacocoInit[43] = true;
        } else {
            $jacocoInit[44] = true;
            if (all.size() == 0) {
                $jacocoInit[45] = true;
            } else {
                $jacocoInit[46] = true;
                C9948b bVar = new C9948b();
                $jacocoInit[47] = true;
                bVar.mo35472a(all);
                try {
                    $jacocoInit[48] = true;
                    str = bVar.toJson();
                    $jacocoInit[49] = true;
                } catch (JSONException e) {
                    $jacocoInit[50] = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("parsing user attributes got error: ");
                    $jacocoInit[51] = true;
                    sb.append(e.getMessage());
                    String sb2 = sb.toString();
                    $jacocoInit[52] = true;
                    InstabugSDKLogger.m46624e(State.class, sb2, e);
                    $jacocoInit[53] = true;
                }
                $jacocoInit[54] = true;
                return str;
            }
        }
        str = "{}";
        $jacocoInit[54] = true;
        return str;
    }

    public static void putAttribute(@C0193h0 String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            String str3 = USER_ATTRIBUTES_CACHE_KEY;
            if (cache.get(str3) != null) {
                $jacocoInit[11] = true;
            } else {
                $jacocoInit[12] = true;
                cache.put(str3, new C9948b());
                $jacocoInit[13] = true;
            }
            ((C9948b) cache.get(str3)).mo35470a(str, str2);
            $jacocoInit[14] = true;
        }
        saveCacheToDisk();
        $jacocoInit[15] = true;
    }

    public static void saveCacheToDisk() {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = CacheManager.getInstance().getCache(USER_ATTRIBUTES_MEMORY_CACHE_KEY);
        $jacocoInit[3] = true;
        C9840b cache2 = CacheManager.getInstance().getCache(USER_ATTRIBUTES_DISK_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[4] = true;
        } else if (cache2 == null) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            CacheManager.getInstance().migrateCache(cache, cache2, (KeyExtractor<K, V>) new C9838b<K,V>());
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
    }
}
