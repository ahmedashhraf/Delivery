package com.instabug.library.internal.storage.cache;

import android.content.Context;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.model.AssetEntity.AssetType;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.p394a.C9960b;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class AssetsCacheManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String ASSETS_MEMORY_CACHE_KEY = "assets_memory_cache";
    private static LinkedHashMap<String, C9836b> currentDownloadingFiles = new LinkedHashMap<>();

    public interface OnDownloadFinished {
        void onFailed(Throwable th);

        void onSuccess(AssetEntity assetEntity);
    }

    /* renamed from: com.instabug.library.internal.storage.cache.AssetsCacheManager$a */
    static class C9835a implements Callbacks<AssetEntity, Throwable> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26064b;

        /* renamed from: a */
        final /* synthetic */ AssetEntity f26065a;

        C9835a(AssetEntity assetEntity) {
            boolean[] a = m45839a();
            this.f26065a = assetEntity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45839a() {
            boolean[] zArr = f26064b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4663862115780727833L, "com/instabug/library/internal/storage/cache/AssetsCacheManager$1", 7);
            f26064b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34977a(AssetEntity assetEntity) {
            boolean[] a = m45839a();
            AssetsCacheManager.addAssetEntity(assetEntity);
            a[1] = true;
            AssetsCacheManager.notifyDownloadFinishedSuccessfully(assetEntity);
            a[2] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m45839a();
            mo34978a((Throwable) obj);
            a[5] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m45839a();
            mo34977a((AssetEntity) obj);
            a[6] = true;
        }

        /* renamed from: a */
        public void mo34978a(Throwable th) {
            boolean[] a = m45839a();
            InstabugSDKLogger.m46624e(this, "downloading asset entity got error: ", th);
            a[3] = true;
            AssetsCacheManager.notifyDownloadFailed(this.f26065a, th);
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.storage.cache.AssetsCacheManager$b */
    public static class C9836b {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f26066d;

        /* renamed from: a */
        public AssetEntity f26067a;

        /* renamed from: b */
        public C12314c f26068b;

        /* renamed from: c */
        public List<OnDownloadFinished> f26069c = new ArrayList();

        public C9836b() {
            boolean[] d = m45842d();
            d[0] = true;
            d[1] = true;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m45842d() {
            boolean[] zArr = f26066d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4774685224529879722L, "com/instabug/library/internal/storage/cache/AssetsCacheManager$DownloadingEntity", 8);
            f26066d = a;
            return a;
        }

        /* renamed from: a */
        public C9836b mo34979a(AssetEntity assetEntity) {
            boolean[] d = m45842d();
            this.f26067a = assetEntity;
            d[2] = true;
            return this;
        }

        /* renamed from: b */
        public AssetEntity mo34983b() {
            boolean[] d = m45842d();
            AssetEntity assetEntity = this.f26067a;
            d[5] = true;
            return assetEntity;
        }

        /* renamed from: c */
        public List<OnDownloadFinished> mo34984c() {
            boolean[] d = m45842d();
            List<OnDownloadFinished> list = this.f26069c;
            d[7] = true;
            return list;
        }

        /* renamed from: a */
        public C12314c mo34982a() {
            boolean[] d = m45842d();
            C12314c cVar = this.f26068b;
            d[3] = true;
            return cVar;
        }

        /* renamed from: a */
        public C9836b mo34981a(List<OnDownloadFinished> list) {
            boolean[] d = m45842d();
            this.f26069c = list;
            d[4] = true;
            return this;
        }

        /* renamed from: a */
        public C9836b mo34980a(C12314c cVar) {
            boolean[] d = m45842d();
            this.f26068b = cVar;
            d[6] = true;
            return this;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3727060432891230983L, "com/instabug/library/internal/storage/cache/AssetsCacheManager", 90);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[89] = true;
    }

    public AssetsCacheManager() {
        $jacocoInit()[0] = true;
    }

    public static void addAssetEntity(AssetEntity assetEntity) {
        boolean[] $jacocoInit = $jacocoInit();
        C9839a cache = getCache();
        if (cache == null) {
            $jacocoInit[30] = true;
        } else {
            $jacocoInit[31] = true;
            cache.put(assetEntity.getKey(), assetEntity);
            $jacocoInit[32] = true;
        }
        $jacocoInit[33] = true;
    }

    public static void cleanUpCache(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        stopRunningDownloads();
        $jacocoInit[65] = true;
        CacheManager instance = CacheManager.getInstance();
        String str = ASSETS_MEMORY_CACHE_KEY;
        if (!instance.cacheExists(str)) {
            $jacocoInit[66] = true;
        } else {
            $jacocoInit[67] = true;
            C9840b cache = CacheManager.getInstance().getCache(str);
            if (cache == null) {
                $jacocoInit[68] = true;
            } else {
                $jacocoInit[69] = true;
                cache.invalidate();
                $jacocoInit[70] = true;
            }
        }
        clearRedundantFiles(context);
        $jacocoInit[71] = true;
    }

    public static void clearRedundantFiles(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        File[] listFiles = getCashDirectory(context).listFiles();
        if (listFiles == null) {
            $jacocoInit[60] = true;
            return;
        }
        int length = listFiles.length;
        int i = 0;
        $jacocoInit[61] = true;
        while (i < length) {
            File file = listFiles[i];
            $jacocoInit[62] = true;
            file.delete();
            i++;
            $jacocoInit[63] = true;
        }
        $jacocoInit[64] = true;
    }

    public static AssetEntity createEmptyEntity(Context context, String str, AssetType assetType) {
        boolean[] $jacocoInit = $jacocoInit();
        File file = new File(getCashDirectory(context), String.valueOf(str.hashCode()));
        $jacocoInit[8] = true;
        AssetEntity assetEntity = new AssetEntity(String.valueOf(str.hashCode()), assetType, str, file);
        $jacocoInit[9] = true;
        return assetEntity;
    }

    public static void downloadAssetEntity(Context context, AssetEntity assetEntity, OnDownloadFinished onDownloadFinished) {
        boolean[] $jacocoInit = $jacocoInit();
        C9836b bVar = new C9836b();
        $jacocoInit[22] = true;
        bVar.mo34979a(assetEntity);
        $jacocoInit[23] = true;
        List c = bVar.mo34984c();
        $jacocoInit[24] = true;
        c.add(onDownloadFinished);
        $jacocoInit[25] = true;
        bVar.mo34981a(c);
        $jacocoInit[26] = true;
        C13787e a = C9960b.m46342a().mo35562a(context, assetEntity, new C9835a(assetEntity));
        $jacocoInit[27] = true;
        bVar.mo34980a((C12314c) a);
        $jacocoInit[28] = true;
        currentDownloadingFiles.put(bVar.mo34983b().getKey(), bVar);
        $jacocoInit[29] = true;
    }

    public static void getAssetEntity(Context context, AssetEntity assetEntity, OnDownloadFinished onDownloadFinished) {
        AssetEntity assetEntity2;
        Class<AssetsCacheManager> cls = AssetsCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        C9839a cache = getCache();
        if (cache != null) {
            $jacocoInit[10] = true;
            assetEntity2 = (AssetEntity) cache.get(assetEntity.getKey());
            $jacocoInit[11] = true;
        } else {
            assetEntity2 = null;
            $jacocoInit[12] = true;
        }
        if (assetEntity2 != null) {
            $jacocoInit[13] = true;
            InstabugSDKLogger.m46622d(cls, "Get file from cache");
            $jacocoInit[14] = true;
            onDownloadFinished.onSuccess(assetEntity2);
            $jacocoInit[15] = true;
        } else if (isDownloading(assetEntity.getKey())) {
            $jacocoInit[16] = true;
            InstabugSDKLogger.m46622d(cls, "File currently downloading, wait download to finish");
            $jacocoInit[17] = true;
            waitDownloadToFinish(assetEntity, onDownloadFinished);
            $jacocoInit[18] = true;
        } else {
            InstabugSDKLogger.m46622d(cls, "File not exist download it");
            $jacocoInit[19] = true;
            downloadAssetEntity(context, assetEntity, onDownloadFinished);
            $jacocoInit[20] = true;
        }
        $jacocoInit[21] = true;
    }

    public static C9839a getCache() {
        Class<AssetsCacheManager> cls = AssetsCacheManager.class;
        boolean[] $jacocoInit = $jacocoInit();
        CacheManager instance = CacheManager.getInstance();
        String str = ASSETS_MEMORY_CACHE_KEY;
        if (instance.cacheExists(str)) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            InstabugSDKLogger.m46622d(cls, "In-memory assets cache not found, create it");
            $jacocoInit[3] = true;
            CacheManager.getInstance().addCache(new C9839a(str));
            $jacocoInit[4] = true;
            InstabugSDKLogger.m46622d(cls, "In-memory assets created successfully");
            $jacocoInit[5] = true;
        }
        InstabugSDKLogger.m46622d(cls, "In-memory assets cache found");
        $jacocoInit[6] = true;
        C9839a aVar = (C9839a) CacheManager.getInstance().getCache(str);
        $jacocoInit[7] = true;
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getCashDirectory(android.content.Context r6) {
        /*
            java.lang.Class<com.instabug.library.internal.storage.cache.AssetsCacheManager> r0 = com.instabug.library.internal.storage.cache.AssetsCacheManager.class
            boolean[] r1 = $jacocoInit()
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            java.lang.String r3 = "mounted"
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r2 = 72
            r1[r2] = r3
            goto L_0x0022
        L_0x0018:
            java.io.File r2 = r6.getExternalCacheDir()
            if (r2 != 0) goto L_0x0038
            r2 = 73
            r1[r2] = r3
        L_0x0022:
            java.lang.String r2 = "External storage not available, saving file to internal storage."
            com.instabug.library.util.InstabugSDKLogger.m46622d(r0, r2)
            r2 = 77
            r1[r2] = r3
            java.io.File r6 = r6.getCacheDir()
            java.lang.String r6 = r6.getAbsolutePath()
            r2 = 78
            r1[r2] = r3
            goto L_0x0051
        L_0x0038:
            r2 = 74
            r1[r2] = r3
            java.lang.String r2 = "Media Mounted"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r0, r2)
            r2 = 75
            r1[r2] = r3
            java.io.File r6 = r6.getExternalCacheDir()
            java.lang.String r6 = r6.getPath()
            r2 = 76
            r1[r2] = r3
        L_0x0051:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r6 = "/instabug/assetCache"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r2.<init>(r6)
            r6 = 79
            r1[r6] = r3
            boolean r6 = r2.exists()
            if (r6 == 0) goto L_0x0076
            r6 = 80
            r1[r6] = r3
            goto L_0x00b9
        L_0x0076:
            r6 = 81
            r1[r6] = r3
            boolean r6 = r2.mkdirs()
            r4 = 82
            r1[r4] = r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Is created: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            com.instabug.library.util.InstabugSDKLogger.m46622d(r0, r6)
            r6 = 83
            r1[r6] = r3
            java.io.File r6 = new java.io.File
            java.lang.String r0 = ".nomedia"
            r6.<init>(r2, r0)
            r0 = 84
            r1[r0] = r3     // Catch:{ IOException -> 0x00ad }
            r6.createNewFile()     // Catch:{ IOException -> 0x00ad }
            r6 = 85
            r1[r6] = r3
            goto L_0x00b9
        L_0x00ad:
            r6 = move-exception
            r0 = 86
            r1[r0] = r3
            r6.printStackTrace()
            r6 = 87
            r1[r6] = r3
        L_0x00b9:
            r6 = 88
            r1[r6] = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.AssetsCacheManager.getCashDirectory(android.content.Context):java.io.File");
    }

    public static boolean isDownloading(String str) {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (currentDownloadingFiles.get(str) != null) {
            $jacocoInit[34] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[35] = true;
        }
        $jacocoInit[36] = true;
        return z;
    }

    public static void notifyDownloadFailed(AssetEntity assetEntity, Throwable th) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[47] = true;
        for (OnDownloadFinished onDownloadFinished : ((C9836b) currentDownloadingFiles.get(assetEntity.getKey())).mo34984c()) {
            if (onDownloadFinished == null) {
                $jacocoInit[48] = true;
            } else {
                $jacocoInit[49] = true;
                onDownloadFinished.onFailed(th);
                $jacocoInit[50] = true;
                currentDownloadingFiles.remove(assetEntity.getKey());
                $jacocoInit[51] = true;
            }
            $jacocoInit[52] = true;
        }
        $jacocoInit[53] = true;
    }

    public static void notifyDownloadFinishedSuccessfully(AssetEntity assetEntity) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[40] = true;
        for (OnDownloadFinished onDownloadFinished : ((C9836b) currentDownloadingFiles.get(assetEntity.getKey())).mo34984c()) {
            if (onDownloadFinished == null) {
                $jacocoInit[41] = true;
            } else {
                $jacocoInit[42] = true;
                onDownloadFinished.onSuccess(assetEntity);
                $jacocoInit[43] = true;
                currentDownloadingFiles.remove(assetEntity.getKey());
                $jacocoInit[44] = true;
            }
            $jacocoInit[45] = true;
        }
        $jacocoInit[46] = true;
    }

    public static void stopRunningDownloads() {
        boolean[] $jacocoInit = $jacocoInit();
        LinkedHashMap<String, C9836b> linkedHashMap = currentDownloadingFiles;
        $jacocoInit[54] = true;
        Set<Entry> entrySet = linkedHashMap.entrySet();
        $jacocoInit[55] = true;
        $jacocoInit[56] = true;
        for (Entry entry : entrySet) {
            $jacocoInit[57] = true;
            ((C9836b) entry.getValue()).mo34982a().dispose();
            $jacocoInit[58] = true;
        }
        currentDownloadingFiles.clear();
        $jacocoInit[59] = true;
    }

    public static void waitDownloadToFinish(AssetEntity assetEntity, OnDownloadFinished onDownloadFinished) {
        boolean[] $jacocoInit = $jacocoInit();
        List c = ((C9836b) currentDownloadingFiles.get(assetEntity.getKey())).mo34984c();
        $jacocoInit[37] = true;
        c.add(onDownloadFinished);
        $jacocoInit[38] = true;
        ((C9836b) currentDownloadingFiles.get(assetEntity.getKey())).mo34981a(c);
        $jacocoInit[39] = true;
    }
}
