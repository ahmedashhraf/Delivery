package com.instabug.survey.cache;

import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.CacheManager.KeyExtractor;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.Survey.SurveyState;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SurveysCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String SURVEYS_DISK_CACHE_FILE_NAME = "/surveys.cache";
    public static final String SURVEYS_DISK_CACHE_KEY = "surveys_disk_cache";
    public static final String SURVEYS_MEMORY_CACHE_KEY = "surveys_memory_cache";

    /* renamed from: com.instabug.survey.cache.SurveysCacheManager$a */
    static class C10081a extends KeyExtractor<Long, Survey> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26815a;

        C10081a() {
            m46892a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46892a() {
            boolean[] zArr = f26815a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2234499464449497111L, "com/instabug/survey/cache/SurveysCacheManager$1", 3);
            f26815a = a;
            return a;
        }

        /* renamed from: a */
        public Long mo36153a(Survey survey) {
            boolean[] a = m46892a();
            Long valueOf = Long.valueOf(survey.getId());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m46892a();
            Long a2 = mo36153a((Survey) obj);
            a[2] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.survey.cache.SurveysCacheManager$b */
    static class C10082b extends KeyExtractor<String, Survey> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26816a;

        C10082b() {
            m46894a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46894a() {
            boolean[] zArr = f26816a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2056376577337742816L, "com/instabug/survey/cache/SurveysCacheManager$2", 3);
            f26816a = a;
            return a;
        }

        /* renamed from: a */
        public String mo36154a(Survey survey) {
            boolean[] a = m46894a();
            String valueOf = String.valueOf(survey.getId());
            a[1] = true;
            return valueOf;
        }

        public /* synthetic */ Object extractKey(Object obj) {
            boolean[] a = m46894a();
            String a2 = mo36154a((Survey) obj);
            a[2] = true;
            return a2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8374155905018380195L, "com/instabug/survey/cache/SurveysCacheManager", 67);
        $jacocoData = a;
        return a;
    }

    public SurveysCacheManager() {
        $jacocoInit()[0] = true;
    }

    public static void addSurvey(Survey survey) {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            cache.put(Long.valueOf(survey.getId()), survey);
            $jacocoInit[23] = true;
        }
        $jacocoInit[24] = true;
    }

    public static void addSurveys(List<Survey> list) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[25] = true;
        for (Survey survey : list) {
            $jacocoInit[26] = true;
            addSurvey(survey);
            $jacocoInit[27] = true;
        }
        $jacocoInit[28] = true;
    }

    public static InMemoryCache<Long, Survey> getCache() throws IllegalArgumentException {
        Class<SurveysCacheManager> cls = SurveysCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = SURVEYS_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("In-memory Surveys cache not found, loading it from disk ");
            $jacocoInit[3] = true;
            sb.append(CacheManager.getInstance().getCache(str));
            String sb2 = sb.toString();
            $jacocoInit[4] = true;
            InstabugSDKLogger.m46622d(cls, sb2);
            $jacocoInit[5] = true;
            CacheManager.getInstance().migrateCache(SURVEYS_DISK_CACHE_KEY, str, (KeyExtractor<K, V>) new C10081a<K,V>());
            $jacocoInit[6] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            if (cache == null) {
                $jacocoInit[7] = true;
            } else {
                $jacocoInit[8] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("In-memory Surveys cache restored from disk, ");
                $jacocoInit[9] = true;
                sb3.append(cache.size());
                sb3.append(" elements restored");
                String sb4 = sb3.toString();
                $jacocoInit[10] = true;
                InstabugSDKLogger.m46622d(cls, sb4);
                $jacocoInit[11] = true;
            }
        }
        InstabugSDKLogger.m46622d(cls, "In-memory Surveys cache found");
        $jacocoInit[12] = true;
        CacheManager instance2 = CacheManager.getInstance();
        $jacocoInit[13] = true;
        InMemoryCache<Long, Survey> inMemoryCache = (InMemoryCache) instance2.getCache(str);
        $jacocoInit[14] = true;
        return inMemoryCache;
    }

    public static List<Survey> getNotAnsweredSurveys() {
        Class<SurveysCacheManager> cls = SurveysCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[32] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[33] = true;
        } else {
            $jacocoInit[34] = true;
            List<Survey> values = cache.getValues();
            $jacocoInit[35] = true;
            $jacocoInit[36] = true;
            for (Survey survey : values) {
                $jacocoInit[38] = true;
                if (survey.isOptInSurvey()) {
                    $jacocoInit[39] = true;
                } else {
                    $jacocoInit[40] = true;
                    if (survey.isAnswered()) {
                        $jacocoInit[41] = true;
                    } else {
                        $jacocoInit[42] = true;
                        if (!survey.shouldShowAgain()) {
                            $jacocoInit[43] = true;
                        } else {
                            $jacocoInit[44] = true;
                            if (survey.isPaused()) {
                                $jacocoInit[45] = true;
                            } else {
                                $jacocoInit[46] = true;
                                arrayList.add(survey);
                                $jacocoInit[47] = true;
                                StringBuilder sb = new StringBuilder();
                                sb.append("survey id: ");
                                $jacocoInit[48] = true;
                                sb.append(survey.getId());
                                String sb2 = sb.toString();
                                $jacocoInit[49] = true;
                                InstabugSDKLogger.m46622d(cls, sb2);
                                $jacocoInit[50] = true;
                            }
                        }
                    }
                }
                $jacocoInit[51] = true;
            }
            $jacocoInit[37] = true;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("NotAnsweredSurveys size: ");
        $jacocoInit[52] = true;
        sb3.append(arrayList.size());
        String sb4 = sb3.toString();
        $jacocoInit[53] = true;
        InstabugSDKLogger.m46622d(cls, sb4);
        $jacocoInit[54] = true;
        return arrayList;
    }

    public static List<Survey> getReadyToSendSurveys() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[55] = true;
        InMemoryCache cache = getCache();
        if (cache == null) {
            $jacocoInit[56] = true;
        } else {
            $jacocoInit[57] = true;
            List<Survey> values = cache.getValues();
            $jacocoInit[58] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("size: ");
            sb.append(values.size());
            InstabugSDKLogger.m46622d(SurveysCacheManager.class, sb.toString());
            $jacocoInit[59] = true;
            $jacocoInit[60] = true;
            for (Survey survey : values) {
                $jacocoInit[62] = true;
                if (survey.getSurveyState() != SurveyState.READY_TO_SEND) {
                    $jacocoInit[63] = true;
                } else {
                    arrayList.add(survey);
                    $jacocoInit[64] = true;
                }
                $jacocoInit[65] = true;
            }
            $jacocoInit[61] = true;
        }
        $jacocoInit[66] = true;
        return arrayList;
    }

    public static List<Survey> getSurveys() {
        boolean[] $jacocoInit = $jacocoInit();
        InMemoryCache cache = getCache();
        if (cache != null) {
            $jacocoInit[29] = true;
            List<Survey> values = cache.getValues();
            $jacocoInit[30] = true;
            return values;
        }
        ArrayList arrayList = new ArrayList();
        $jacocoInit[31] = true;
        return arrayList;
    }

    public static void saveCacheToDisk() {
        boolean[] $jacocoInit = $jacocoInit();
        C9840b cache = CacheManager.getInstance().getCache(SURVEYS_DISK_CACHE_KEY);
        $jacocoInit[15] = true;
        C9840b cache2 = CacheManager.getInstance().getCache(SURVEYS_MEMORY_CACHE_KEY);
        if (cache == null) {
            $jacocoInit[16] = true;
        } else if (cache2 == null) {
            $jacocoInit[17] = true;
        } else {
            $jacocoInit[18] = true;
            CacheManager.getInstance().migrateCache(cache2, cache, (KeyExtractor<K, V>) new C10082b<K,V>());
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
    }
}
