package com.instabug.library.internal.storage.cache;

import android.content.Context;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.p217i1.C14662d0;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class OnDiskCache<V extends Cacheable> extends C9840b<String, V> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private Class<V> VClass;
    private final File cacheDir;
    private final File cacheFile;
    private final Charset charset;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4060122240202462254L, "com/instabug/library/internal/storage/cache/OnDiskCache", 292);
        $jacocoData = a;
        return a;
    }

    public OnDiskCache(Context context, String str, String str2, Class<V> cls) {
        boolean[] $jacocoInit = $jacocoInit();
        super(str);
        this.VClass = cls;
        $jacocoInit[0] = true;
        this.cacheDir = context.getCacheDir();
        $jacocoInit[1] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(this.cacheDir);
        sb.append(str2);
        this.cacheFile = new File(sb.toString());
        $jacocoInit[2] = true;
        if (this.cacheFile.exists()) {
            $jacocoInit[3] = true;
        } else {
            try {
                $jacocoInit[4] = true;
                this.cacheFile.createNewFile();
                $jacocoInit[5] = true;
            } catch (IOException e) {
                $jacocoInit[6] = true;
                InstabugSDKLogger.m46624e(this, "Failed to create", e);
                $jacocoInit[7] = true;
            }
        }
        String str3 = "UTF-8";
        if (Charset.isSupported(str3)) {
            $jacocoInit[8] = true;
            this.charset = Charset.forName(str3);
            $jacocoInit[9] = true;
        } else {
            this.charset = Charset.defaultCharset();
            $jacocoInit[10] = true;
        }
        if (checkCacheValidity()) {
            $jacocoInit[11] = true;
        } else {
            $jacocoInit[12] = true;
            invalidate();
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0158 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b4 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0129 A[Catch:{  }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkCacheValidity() {
        /*
            r10 = this;
            boolean[] r0 = $jacocoInit()
            java.io.File r1 = r10.cacheFile
            boolean r1 = r1.exists()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001c
            r1 = 237(0xed, float:3.32E-43)
            r0[r1] = r3
            java.lang.String r1 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r10, r1)
            r1 = 238(0xee, float:3.34E-43)
            r0[r1] = r3
            return r2
        L_0x001c:
            java.io.File r1 = r10.cacheFile
            monitor-enter(r1)
            r4 = 239(0xef, float:3.35E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            r4 = 0
            r5 = 240(0xf0, float:3.36E-43)
            r0[r5] = r3     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            java.io.File r8 = r10.cacheFile     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            java.nio.charset.Charset r8 = r10.charset     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0114, JSONException -> 0x00d5, OutOfMemoryError -> 0x009b }
            r4 = 241(0xf1, float:3.38E-43)
            r0[r4] = r3     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            java.lang.String r4 = r5.readLine()     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            if (r4 != 0) goto L_0x004a
            r4 = 242(0xf2, float:3.39E-43)
            r0[r4] = r3     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            goto L_0x006e
        L_0x004a:
            r6 = 243(0xf3, float:3.4E-43)
            r0[r6] = r3     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            java.lang.String r4 = r10.getValue(r4)     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            r6 = 244(0xf4, float:3.42E-43)
            r0[r6] = r3     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            if (r6 == 0) goto L_0x0061
            r4 = 245(0xf5, float:3.43E-43)
            r0[r4] = r3     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            goto L_0x006e
        L_0x0061:
            r6 = 246(0xf6, float:3.45E-43)
            r0[r6] = r3     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            r6.<init>(r4)     // Catch:{ IOException -> 0x0094, JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
            r4 = 247(0xf7, float:3.46E-43)
            r0[r4] = r3     // Catch:{ JSONException -> 0x0092, OutOfMemoryError -> 0x008f }
        L_0x006e:
            r2 = 249(0xf9, float:3.49E-43)
            r0[r2] = r3     // Catch:{ IOException -> 0x007f }
            r5.close()     // Catch:{ IOException -> 0x007f }
            r2 = 250(0xfa, float:3.5E-43)
            r0[r2] = r3     // Catch:{ IOException -> 0x007f }
            r2 = 251(0xfb, float:3.52E-43)
            r0[r2] = r3     // Catch:{ all -> 0x017b }
            goto L_0x0147
        L_0x007f:
            r2 = move-exception
            r4 = 252(0xfc, float:3.53E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r4, r2)     // Catch:{ all -> 0x017b }
            r2 = 253(0xfd, float:3.55E-43)
            r0[r2] = r3     // Catch:{ all -> 0x017b }
            goto L_0x0147
        L_0x008f:
            r2 = move-exception
            r4 = r5
            goto L_0x009c
        L_0x0092:
            r4 = move-exception
            goto L_0x00d9
        L_0x0094:
            r2 = move-exception
            r4 = r5
            goto L_0x0115
        L_0x0098:
            r2 = move-exception
            goto L_0x014d
        L_0x009b:
            r2 = move-exception
        L_0x009c:
            r5 = 271(0x10f, float:3.8E-43)
            r0[r5] = r3     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = "OOM while fetching values "
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0098 }
            com.instabug.library.util.InstabugSDKLogger.m46623e(r5, r2)     // Catch:{ all -> 0x0098 }
            r2 = 272(0x110, float:3.81E-43)
            r0[r2] = r3     // Catch:{ IOException -> 0x00c5 }
            if (r4 != 0) goto L_0x00b4
            r2 = 273(0x111, float:3.83E-43)
            r0[r2] = r3     // Catch:{  }
            goto L_0x00bf
        L_0x00b4:
            r2 = 274(0x112, float:3.84E-43)
            r0[r2] = r3     // Catch:{  }
            r4.close()     // Catch:{  }
            r2 = 275(0x113, float:3.85E-43)
            r0[r2] = r3     // Catch:{  }
        L_0x00bf:
            r2 = 276(0x114, float:3.87E-43)
            r0[r2] = r3     // Catch:{ all -> 0x017b }
            goto L_0x0147
        L_0x00c5:
            r2 = move-exception
            r4 = 277(0x115, float:3.88E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r4, r2)     // Catch:{ all -> 0x017b }
            r2 = 278(0x116, float:3.9E-43)
            r0[r2] = r3     // Catch:{ all -> 0x017b }
            goto L_0x0147
        L_0x00d5:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L_0x00d9:
            r6 = 262(0x106, float:3.67E-43)
            r0[r6] = r3     // Catch:{ all -> 0x0111 }
            java.lang.String r6 = "JSONException went wrong while fetching values"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r6, r4)     // Catch:{ all -> 0x0111 }
            r4 = 263(0x107, float:3.69E-43)
            r0[r4] = r3     // Catch:{ IOException -> 0x00fd }
            if (r5 != 0) goto L_0x00ed
            r4 = 264(0x108, float:3.7E-43)
            r0[r4] = r3     // Catch:{  }
            goto L_0x00f8
        L_0x00ed:
            r4 = 265(0x109, float:3.71E-43)
            r0[r4] = r3     // Catch:{  }
            r5.close()     // Catch:{  }
            r4 = 266(0x10a, float:3.73E-43)
            r0[r4] = r3     // Catch:{  }
        L_0x00f8:
            r4 = 267(0x10b, float:3.74E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            goto L_0x010b
        L_0x00fd:
            r4 = move-exception
            r5 = 268(0x10c, float:3.76E-43)
            r0[r5] = r3     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x017b }
            r4 = 269(0x10d, float:3.77E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
        L_0x010b:
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            r1 = 270(0x10e, float:3.78E-43)
            r0[r1] = r3
            return r2
        L_0x0111:
            r2 = move-exception
            r4 = r5
            goto L_0x014d
        L_0x0114:
            r2 = move-exception
        L_0x0115:
            r5 = 254(0xfe, float:3.56E-43)
            r0[r5] = r3     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = "IOException went wrong while fetching values"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r2)     // Catch:{ all -> 0x0098 }
            r2 = 255(0xff, float:3.57E-43)
            r0[r2] = r3     // Catch:{ IOException -> 0x0139 }
            if (r4 != 0) goto L_0x0129
            r2 = 256(0x100, float:3.59E-43)
            r0[r2] = r3     // Catch:{  }
            goto L_0x0134
        L_0x0129:
            r2 = 257(0x101, float:3.6E-43)
            r0[r2] = r3     // Catch:{  }
            r4.close()     // Catch:{  }
            r2 = 258(0x102, float:3.62E-43)
            r0[r2] = r3     // Catch:{  }
        L_0x0134:
            r2 = 259(0x103, float:3.63E-43)
            r0[r2] = r3     // Catch:{ all -> 0x017b }
            goto L_0x0147
        L_0x0139:
            r2 = move-exception
            r4 = 260(0x104, float:3.64E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            java.lang.String r4 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r4, r2)     // Catch:{ all -> 0x017b }
            r2 = 261(0x105, float:3.66E-43)
            r0[r2] = r3     // Catch:{ all -> 0x017b }
        L_0x0147:
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            r1 = 287(0x11f, float:4.02E-43)
            r0[r1] = r3
            return r3
        L_0x014d:
            r5 = 279(0x117, float:3.91E-43)
            r0[r5] = r3     // Catch:{ IOException -> 0x0168 }
            if (r4 != 0) goto L_0x0158
            r4 = 280(0x118, float:3.92E-43)
            r0[r4] = r3     // Catch:{  }
            goto L_0x0163
        L_0x0158:
            r5 = 281(0x119, float:3.94E-43)
            r0[r5] = r3     // Catch:{  }
            r4.close()     // Catch:{  }
            r4 = 282(0x11a, float:3.95E-43)
            r0[r4] = r3     // Catch:{  }
        L_0x0163:
            r4 = 283(0x11b, float:3.97E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            goto L_0x0176
        L_0x0168:
            r4 = move-exception
            r5 = 284(0x11c, float:3.98E-43)
            r0[r5] = r3     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x017b }
            r4 = 285(0x11d, float:4.0E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
        L_0x0176:
            r4 = 286(0x11e, float:4.01E-43)
            r0[r4] = r3     // Catch:{ all -> 0x017b }
            throw r2     // Catch:{ all -> 0x017b }
        L_0x017b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017b }
            r1 = 288(0x120, float:4.04E-43)
            r0[r1] = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.checkCacheValidity():boolean");
    }

    public /* synthetic */ Object delete(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        Cacheable delete = delete((String) obj);
        $jacocoInit[289] = true;
        return delete;
    }

    public /* synthetic */ Object get(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        Cacheable cacheable = get((String) obj);
        $jacocoInit[291] = true;
        return cacheable;
    }

    public String getKey(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (str == null) {
            $jacocoInit[231] = true;
        } else if (str.isEmpty()) {
            $jacocoInit[232] = true;
        } else {
            String str2 = ":";
            if (!str.contains(str2)) {
                $jacocoInit[233] = true;
            } else {
                $jacocoInit[234] = true;
                String substring = str.substring(0, str.indexOf(str2));
                $jacocoInit[235] = true;
                return substring;
            }
        }
        $jacocoInit[236] = true;
        return null;
    }

    public String getValue(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (str == null) {
            $jacocoInit[225] = true;
        } else if (str.isEmpty()) {
            $jacocoInit[226] = true;
        } else {
            String str2 = ":";
            if (!str.contains(str2)) {
                $jacocoInit[227] = true;
            } else {
                $jacocoInit[228] = true;
                String substring = str.substring(str.indexOf(str2) + 1);
                $jacocoInit[229] = true;
                return substring;
            }
        }
        $jacocoInit[230] = true;
        return null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0185 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b6 A[Catch:{ IOException -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014e A[Catch:{  }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<V> getValues() {
        /*
            r10 = this;
            boolean[] r0 = $jacocoInit()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 15
            r0[r3] = r2
            java.io.File r3 = r10.cacheFile
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0024
            r3 = 16
            r0[r3] = r2
            java.lang.String r3 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r10, r3)
            r3 = 17
            r0[r3] = r2
            return r1
        L_0x0024:
            java.io.File r3 = r10.cacheFile
            monitor-enter(r3)
            r4 = 18
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            r4 = 0
            r5 = 19
            r0[r5] = r2     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            java.io.File r8 = r10.cacheFile     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            r7.<init>(r8)     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            java.nio.charset.Charset r8 = r10.charset     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            r6.<init>(r7, r8)     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            r5.<init>(r6)     // Catch:{ InstantiationException -> 0x016d, IllegalAccessException -> 0x0136, IOException -> 0x00fd, JSONException -> 0x00c4, all -> 0x00c1 }
            r4 = 20
            r0[r4] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
        L_0x0047:
            java.lang.String r4 = r5.readLine()     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r6 = 21
            r0[r6] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            java.lang.String r6 = r10.getValue(r4)     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r7 = 22
            r0[r7] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            if (r6 != 0) goto L_0x005e
            r6 = 23
            r0[r6] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            goto L_0x008b
        L_0x005e:
            boolean r6 = r6.isEmpty()     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            if (r6 == 0) goto L_0x0069
            r6 = 24
            r0[r6] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            goto L_0x008b
        L_0x0069:
            r6 = 25
            r0[r6] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            java.lang.Class<V> r6 = r10.VClass     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            java.lang.Object r6 = r6.newInstance()     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            com.instabug.library.internal.storage.cache.Cacheable r6 = (com.instabug.library.internal.storage.cache.Cacheable) r6     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r7 = 26
            r0[r7] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            java.lang.String r7 = r10.getValue(r4)     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r6.fromJson(r7)     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r7 = 27
            r0[r7] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r1.add(r6)     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            r6 = 28
            r0[r6] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
        L_0x008b:
            if (r4 == 0) goto L_0x0092
            r4 = 29
            r0[r4] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, IOException -> 0x00b9, JSONException -> 0x00b7 }
            goto L_0x0047
        L_0x0092:
            r4 = 30
            r0[r4] = r2     // Catch:{ InstantiationException -> 0x00be, IllegalAccessException -> 0x00bb, JSONException -> 0x00b7 }
            r4 = 32
            r0[r4] = r2     // Catch:{ IOException -> 0x00a7 }
            r5.close()     // Catch:{ IOException -> 0x00a7 }
            r4 = 33
            r0[r4] = r2     // Catch:{ IOException -> 0x00a7 }
            r4 = 34
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x00a7:
            r4 = move-exception
            r5 = 35
            r0[r5] = r2     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x01d9 }
            r4 = 36
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x00b7:
            r4 = move-exception
            goto L_0x00c8
        L_0x00b9:
            r4 = move-exception
            goto L_0x0101
        L_0x00bb:
            r4 = move-exception
            goto L_0x013a
        L_0x00be:
            r4 = move-exception
            goto L_0x0171
        L_0x00c1:
            r1 = move-exception
            goto L_0x01ab
        L_0x00c4:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L_0x00c8:
            r6 = 61
            r0[r6] = r2     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "JSONException went wrong while fetching values"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r6, r4)     // Catch:{ all -> 0x01a9 }
            r4 = 62
            r0[r4] = r2     // Catch:{ IOException -> 0x00ed }
            if (r5 != 0) goto L_0x00dc
            r4 = 63
            r0[r4] = r2     // Catch:{  }
            goto L_0x00e7
        L_0x00dc:
            r4 = 64
            r0[r4] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r4 = 65
            r0[r4] = r2     // Catch:{  }
        L_0x00e7:
            r4 = 66
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x00ed:
            r4 = move-exception
            r5 = 67
            r0[r5] = r2     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x01d9 }
            r4 = 68
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x00fd:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L_0x0101:
            r6 = 53
            r0[r6] = r2     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "IOException went wrong while fetching values"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r6, r4)     // Catch:{ all -> 0x01a9 }
            r4 = 54
            r0[r4] = r2     // Catch:{ IOException -> 0x0126 }
            if (r5 != 0) goto L_0x0115
            r4 = 55
            r0[r4] = r2     // Catch:{  }
            goto L_0x0120
        L_0x0115:
            r4 = 56
            r0[r4] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r4 = 57
            r0[r4] = r2     // Catch:{  }
        L_0x0120:
            r4 = 58
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x0126:
            r4 = move-exception
            r5 = 59
            r0[r5] = r2     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x01d9 }
            r4 = 60
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x0136:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L_0x013a:
            r6 = 45
            r0[r6] = r2     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "IllegalAccessException went wrong while fetching"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r6, r4)     // Catch:{ all -> 0x01a9 }
            r4 = 46
            r0[r4] = r2     // Catch:{ IOException -> 0x015e }
            if (r5 != 0) goto L_0x014e
            r4 = 47
            r0[r4] = r2     // Catch:{  }
            goto L_0x0159
        L_0x014e:
            r4 = 48
            r0[r4] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r4 = 49
            r0[r4] = r2     // Catch:{  }
        L_0x0159:
            r4 = 50
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x015e:
            r4 = move-exception
            r5 = 51
            r0[r5] = r2     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x01d9 }
            r4 = 52
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x016d:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L_0x0171:
            r6 = 37
            r0[r6] = r2     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "InstantiationException happened while fetching values"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r6, r4)     // Catch:{ all -> 0x01a9 }
            r4 = 38
            r0[r4] = r2     // Catch:{ IOException -> 0x0195 }
            if (r5 != 0) goto L_0x0185
            r4 = 39
            r0[r4] = r2     // Catch:{  }
            goto L_0x0190
        L_0x0185:
            r4 = 40
            r0[r4] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r4 = 41
            r0[r4] = r2     // Catch:{  }
        L_0x0190:
            r4 = 42
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01a3
        L_0x0195:
            r4 = move-exception
            r5 = 43
            r0[r5] = r2     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x01d9 }
            r4 = 44
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
        L_0x01a3:
            monitor-exit(r3)     // Catch:{ all -> 0x01d9 }
            r3 = 78
            r0[r3] = r2
            return r1
        L_0x01a9:
            r1 = move-exception
            r4 = r5
        L_0x01ab:
            r5 = 69
            r0[r5] = r2     // Catch:{ all -> 0x00c1 }
            if (r4 != 0) goto L_0x01b6
            r4 = 70
            r0[r4] = r2     // Catch:{ IOException -> 0x01c6 }
            goto L_0x01c1
        L_0x01b6:
            r5 = 71
            r0[r5] = r2     // Catch:{ IOException -> 0x01c6 }
            r4.close()     // Catch:{ IOException -> 0x01c6 }
            r4 = 72
            r0[r4] = r2     // Catch:{ IOException -> 0x01c6 }
        L_0x01c1:
            r4 = 73
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            goto L_0x01d4
        L_0x01c6:
            r4 = move-exception
            r5 = 74
            r0[r5] = r2     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r10, r5, r4)     // Catch:{ all -> 0x01d9 }
            r4 = 75
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
        L_0x01d4:
            r4 = 76
            r0[r4] = r2     // Catch:{ all -> 0x01d9 }
            throw r1     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d9 }
            r3 = 77
            r0[r3] = r2
            goto L_0x01e1
        L_0x01e0:
            throw r1
        L_0x01e1:
            goto L_0x01e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.getValues():java.util.List");
    }

    public void invalidate() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.cacheFile.exists()) {
            $jacocoInit[216] = true;
        } else {
            $jacocoInit[217] = true;
            InstabugSDKLogger.m46622d(this, "Cache file  exist");
            synchronized (this.cacheFile) {
                try {
                    $jacocoInit[218] = true;
                    this.cacheFile.delete();
                } finally {
                    while (true) {
                        $jacocoInit[220] = true;
                    }
                }
            }
        }
        try {
            this.cacheFile.createNewFile();
            $jacocoInit[221] = true;
        } catch (IOException e) {
            $jacocoInit[222] = true;
            InstabugSDKLogger.m46624e(this, "Failed to create cache file", e);
            $jacocoInit[223] = true;
        }
        $jacocoInit[224] = true;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        boolean[] $jacocoInit = $jacocoInit();
        Cacheable put = put((String) obj, (V) (Cacheable) obj2);
        $jacocoInit[290] = true;
        return put;
    }

    public long size() {
        long totalSpace;
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.cacheFile.exists()) {
            $jacocoInit[211] = true;
            InstabugSDKLogger.m46622d(this, "Cache file doesn't exist");
            $jacocoInit[212] = true;
            return -1;
        }
        synchronized (this.cacheFile) {
            try {
                $jacocoInit[213] = true;
                totalSpace = this.cacheFile.getTotalSpace();
            } finally {
                while (true) {
                    $jacocoInit[C14662d0.f42856g] = true;
                }
            }
        }
        return totalSpace;
    }

    public V delete(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        V v = null;
        if (!this.cacheFile.exists()) {
            $jacocoInit[175] = true;
            InstabugSDKLogger.m46622d(this, "Cache file doesn't exist");
            $jacocoInit[176] = true;
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.cacheDir);
        sb.append("/cache.tmp");
        File file = new File(sb.toString());
        try {
            $jacocoInit[177] = true;
            V v2 = (Cacheable) this.VClass.newInstance();
            $jacocoInit[178] = true;
            v = v2;
        } catch (InstantiationException e) {
            $jacocoInit[179] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("InstantiationException happened while deleting value for key ");
            sb2.append(str);
            InstabugSDKLogger.m46624e(this, sb2.toString(), e);
            $jacocoInit[180] = true;
        } catch (IllegalAccessException e2) {
            $jacocoInit[181] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("IllegalAccessException went wrong while deleting value for key ");
            sb3.append(str);
            InstabugSDKLogger.m46624e(this, sb3.toString(), e2);
            $jacocoInit[182] = true;
        }
        synchronized (this.cacheFile) {
            try {
                $jacocoInit[183] = true;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.cacheFile), this.charset));
                $jacocoInit[184] = true;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), this.charset));
                $jacocoInit[185] = true;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    $jacocoInit[186] = true;
                    String key = getKey(readLine);
                    if (key == null) {
                        $jacocoInit[187] = true;
                    } else {
                        $jacocoInit[188] = true;
                        if (key.equals(str)) {
                            $jacocoInit[189] = true;
                            v.fromJson(getValue(readLine));
                            $jacocoInit[190] = true;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(readLine);
                            sb4.append("\n");
                            bufferedWriter.write(sb4.toString());
                            $jacocoInit[191] = true;
                        }
                    }
                    if (readLine == null) {
                        break;
                    }
                    $jacocoInit[192] = true;
                }
                $jacocoInit[193] = true;
                bufferedReader.close();
                $jacocoInit[194] = true;
                bufferedWriter.flush();
                $jacocoInit[195] = true;
                bufferedWriter.close();
                $jacocoInit[196] = true;
                if (!this.cacheFile.delete()) {
                    $jacocoInit[197] = true;
                } else {
                    $jacocoInit[198] = true;
                    if (file.renameTo(this.cacheFile)) {
                        $jacocoInit[199] = true;
                    } else {
                        $jacocoInit[200] = true;
                        InstabugSDKLogger.m46623e(this, "Couldn't rename temp cache file");
                        $jacocoInit[201] = true;
                    }
                }
                $jacocoInit[202] = true;
            } catch (IOException e3) {
                $jacocoInit[203] = true;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("IOException went wrong while deleting value for key ");
                sb5.append(str);
                InstabugSDKLogger.m46624e(this, sb5.toString(), e3);
                $jacocoInit[204] = true;
            } catch (JSONException e4) {
                $jacocoInit[205] = true;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("JSONException went wrong while deleting value for key ");
                sb6.append(str);
                InstabugSDKLogger.m46624e(this, sb6.toString(), e4);
                $jacocoInit[206] = true;
            } catch (OutOfMemoryError e5) {
                $jacocoInit[207] = true;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("OOM while deleting value for key ");
                sb7.append(str);
                InstabugSDKLogger.m46623e(sb7.toString(), e5.toString());
                $jacocoInit[208] = true;
            } catch (Throwable th) {
                while (true) {
                    $jacocoInit[209] = true;
                    throw th;
                }
            }
        }
        $jacocoInit[210] = true;
        return v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01af, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b0, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r0[112(0x70)] = true;
        r6 = new java.lang.StringBuilder();
        r6.append("IOException went wrong while fetching value for key ");
        r6.append(r10);
        com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r6.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r0[113(0x71)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cd, code lost:
        if (r5 != null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r0[114(0x72)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d4, code lost:
        r0[115(0x73)] = true;
        r5.close();
        r0[116(0x74)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        r0[117(0x75)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e4, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e5, code lost:
        r0[118(0x76)] = true;
        com.instabug.library.util.InstabugSDKLogger.m46624e(r9, "Failed to close file reader", r3);
        r0[119(0x77)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0241, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0243, code lost:
        r0[144] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0248, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0[105(0x69)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0[107(0x6b)] = true;
        r5.close();
        r3 = 'l';
        r0[r3] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0[109(0x6d)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d4, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        r0[110(0x6e)] = true;
        com.instabug.library.util.InstabugSDKLogger.m46624e(r9, "Failed to close file reader", r3);
        r3 = 'o';
        r0[r3] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r0[95] = true;
        r3.fromJson(getValue(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0[96] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0[98] = true;
        r5.close();
        r0[99] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0[100] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0103, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0104, code lost:
        r0[101(0x65)] = true;
        com.instabug.library.util.InstabugSDKLogger.m46624e(r9, "Failed to close file reader", r10);
        r0[102(0x66)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0121, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0[130(0x82)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014a, code lost:
        r0[131(0x83)] = true;
        r5.close();
        r0[132(0x84)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016b, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016c, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r0[122(0x7a)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0190, code lost:
        r0[123(0x7b)] = true;
        r5.close();
        r0[124(0x7c)] = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d4 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x021e A[Catch:{ IOException -> 0x022e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014a A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0190 A[Catch:{  }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.String r10) {
        /*
            r9 = this;
            boolean[] r0 = $jacocoInit()
            r1 = 0
            r2 = 1
            if (r10 != 0) goto L_0x0016
            r10 = 79
            r0[r10] = r2
            java.lang.String r10 = "Key equal null"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r9, r10)
            r10 = 80
            r0[r10] = r2
            return r1
        L_0x0016:
            java.io.File r3 = r9.cacheFile
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x002c
            r10 = 81
            r0[r10] = r2
            java.lang.String r10 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r9, r10)
            r10 = 82
            r0[r10] = r2
            return r1
        L_0x002c:
            r3 = 83
            r0[r3] = r2     // Catch:{ InstantiationException -> 0x005b, IllegalAccessException -> 0x003d }
            java.lang.Class<V> r3 = r9.VClass     // Catch:{ InstantiationException -> 0x005b, IllegalAccessException -> 0x003d }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ InstantiationException -> 0x005b, IllegalAccessException -> 0x003d }
            com.instabug.library.internal.storage.cache.Cacheable r3 = (com.instabug.library.internal.storage.cache.Cacheable) r3     // Catch:{ InstantiationException -> 0x005b, IllegalAccessException -> 0x003d }
            r4 = 84
            r0[r4] = r2
            goto L_0x0079
        L_0x003d:
            r3 = move-exception
            r4 = 87
            r0[r4] = r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "IllegalAccessException went wrong while fetching value for key "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r4, r3)
            r3 = 88
            r0[r3] = r2
            goto L_0x0078
        L_0x005b:
            r3 = move-exception
            r4 = 85
            r0[r4] = r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "InstantiationException happened while fetching value for key "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r4, r3)
            r3 = 86
            r0[r3] = r2
        L_0x0078:
            r3 = r1
        L_0x0079:
            java.io.File r4 = r9.cacheFile
            monitor-enter(r4)
            r5 = 89
            r0[r5] = r2     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            java.io.File r8 = r9.cacheFile     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            r7.<init>(r8)     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            java.nio.charset.Charset r8 = r9.charset     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            r5.<init>(r6)     // Catch:{ IOException -> 0x01af, JSONException -> 0x016b, OutOfMemoryError -> 0x0121, all -> 0x011e }
            r6 = 90
            r0[r6] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
        L_0x0097:
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            r7 = 91
            r0[r7] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            java.lang.String r7 = r9.getKey(r6)     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            r8 = 92
            r0[r8] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            if (r7 != 0) goto L_0x00ae
            r7 = 93
            r0[r7] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            goto L_0x00b8
        L_0x00ae:
            boolean r7 = r7.equals(r10)     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            if (r7 != 0) goto L_0x00e4
            r7 = 94
            r0[r7] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
        L_0x00b8:
            if (r6 == 0) goto L_0x00bf
            r6 = 104(0x68, float:1.46E-43)
            r0[r6] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            goto L_0x0097
        L_0x00bf:
            r3 = 105(0x69, float:1.47E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x00d4, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            r3 = 107(0x6b, float:1.5E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x00d4 }
            r5.close()     // Catch:{ IOException -> 0x00d4 }
            r3 = 108(0x6c, float:1.51E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x00d4 }
            r3 = 109(0x6d, float:1.53E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x00d4:
            r3 = move-exception
            r5 = 110(0x6e, float:1.54E-43)
            r0[r5] = r2     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r5, r3)     // Catch:{ all -> 0x0241 }
            r3 = 111(0x6f, float:1.56E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x00e4:
            r7 = 95
            r0[r7] = r2     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            java.lang.String r6 = r9.getValue(r6)     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            r3.fromJson(r6)     // Catch:{ IOException -> 0x011b, JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            r6 = 96
            r0[r6] = r2     // Catch:{ JSONException -> 0x0119, OutOfMemoryError -> 0x0117 }
            r10 = 98
            r0[r10] = r2     // Catch:{ IOException -> 0x0103 }
            r5.close()     // Catch:{ IOException -> 0x0103 }
            r10 = 99
            r0[r10] = r2     // Catch:{ IOException -> 0x0103 }
            r10 = 100
            r0[r10] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x0111
        L_0x0103:
            r10 = move-exception
            r1 = 101(0x65, float:1.42E-43)
            r0[r1] = r2     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r1, r10)     // Catch:{ all -> 0x0241 }
            r10 = 102(0x66, float:1.43E-43)
            r0[r10] = r2     // Catch:{ all -> 0x0241 }
        L_0x0111:
            monitor-exit(r4)     // Catch:{ all -> 0x0241 }
            r10 = 103(0x67, float:1.44E-43)
            r0[r10] = r2
            return r3
        L_0x0117:
            r3 = move-exception
            goto L_0x0123
        L_0x0119:
            r3 = move-exception
            goto L_0x016d
        L_0x011b:
            r3 = move-exception
            goto L_0x01b1
        L_0x011e:
            r10 = move-exception
            goto L_0x0213
        L_0x0121:
            r3 = move-exception
            r5 = r1
        L_0x0123:
            r6 = 128(0x80, float:1.794E-43)
            r0[r6] = r2     // Catch:{ all -> 0x0211 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0211 }
            r6.<init>()     // Catch:{ all -> 0x0211 }
            java.lang.String r7 = "OOM while fetching value for key "
            r6.append(r7)     // Catch:{ all -> 0x0211 }
            r6.append(r10)     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0211 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0211 }
            com.instabug.library.util.InstabugSDKLogger.m46623e(r6, r3)     // Catch:{ all -> 0x0211 }
            r3 = 129(0x81, float:1.81E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x015b }
            if (r5 != 0) goto L_0x014a
            r3 = 130(0x82, float:1.82E-43)
            r0[r3] = r2     // Catch:{  }
            goto L_0x0155
        L_0x014a:
            r3 = 131(0x83, float:1.84E-43)
            r0[r3] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r3 = 132(0x84, float:1.85E-43)
            r0[r3] = r2     // Catch:{  }
        L_0x0155:
            r3 = 133(0x85, float:1.86E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x015b:
            r3 = move-exception
            r5 = 134(0x86, float:1.88E-43)
            r0[r5] = r2     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r5, r3)     // Catch:{ all -> 0x0241 }
            r3 = 135(0x87, float:1.89E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x016b:
            r3 = move-exception
            r5 = r1
        L_0x016d:
            r6 = 120(0x78, float:1.68E-43)
            r0[r6] = r2     // Catch:{ all -> 0x0211 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0211 }
            r6.<init>()     // Catch:{ all -> 0x0211 }
            java.lang.String r7 = "JSONException went wrong while fetching value for key "
            r6.append(r7)     // Catch:{ all -> 0x0211 }
            r6.append(r10)     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0211 }
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r6, r3)     // Catch:{ all -> 0x0211 }
            r3 = 121(0x79, float:1.7E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x01a0 }
            if (r5 != 0) goto L_0x0190
            r3 = 122(0x7a, float:1.71E-43)
            r0[r3] = r2     // Catch:{  }
            goto L_0x019b
        L_0x0190:
            r3 = 123(0x7b, float:1.72E-43)
            r0[r3] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r3 = 124(0x7c, float:1.74E-43)
            r0[r3] = r2     // Catch:{  }
        L_0x019b:
            r3 = 125(0x7d, float:1.75E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x01a0:
            r3 = move-exception
            r5 = 126(0x7e, float:1.77E-43)
            r0[r5] = r2     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r5, r3)     // Catch:{ all -> 0x0241 }
            r3 = 127(0x7f, float:1.78E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x01af:
            r3 = move-exception
            r5 = r1
        L_0x01b1:
            r6 = 112(0x70, float:1.57E-43)
            r0[r6] = r2     // Catch:{ all -> 0x0211 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0211 }
            r6.<init>()     // Catch:{ all -> 0x0211 }
            java.lang.String r7 = "IOException went wrong while fetching value for key "
            r6.append(r7)     // Catch:{ all -> 0x0211 }
            r6.append(r10)     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0211 }
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r6, r3)     // Catch:{ all -> 0x0211 }
            r3 = 113(0x71, float:1.58E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x01e4 }
            if (r5 != 0) goto L_0x01d4
            r3 = 114(0x72, float:1.6E-43)
            r0[r3] = r2     // Catch:{  }
            goto L_0x01df
        L_0x01d4:
            r3 = 115(0x73, float:1.61E-43)
            r0[r3] = r2     // Catch:{  }
            r5.close()     // Catch:{  }
            r3 = 116(0x74, float:1.63E-43)
            r0[r3] = r2     // Catch:{  }
        L_0x01df:
            r3 = 117(0x75, float:1.64E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x01f2
        L_0x01e4:
            r3 = move-exception
            r5 = 118(0x76, float:1.65E-43)
            r0[r5] = r2     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r5, r3)     // Catch:{ all -> 0x0241 }
            r3 = 119(0x77, float:1.67E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
        L_0x01f2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r3.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r5 = "No value found for key "
            r3.append(r5)     // Catch:{ all -> 0x0241 }
            r3.append(r10)     // Catch:{ all -> 0x0241 }
            java.lang.String r10 = ", returning null"
            r3.append(r10)     // Catch:{ all -> 0x0241 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x0241 }
            com.instabug.library.util.InstabugSDKLogger.m46622d(r9, r10)     // Catch:{ all -> 0x0241 }
            monitor-exit(r4)     // Catch:{ all -> 0x0241 }
            r10 = 145(0x91, float:2.03E-43)
            r0[r10] = r2
            return r1
        L_0x0211:
            r10 = move-exception
            r1 = r5
        L_0x0213:
            r3 = 136(0x88, float:1.9E-43)
            r0[r3] = r2     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x021e
            r1 = 137(0x89, float:1.92E-43)
            r0[r1] = r2     // Catch:{ IOException -> 0x022e }
            goto L_0x0229
        L_0x021e:
            r3 = 138(0x8a, float:1.93E-43)
            r0[r3] = r2     // Catch:{ IOException -> 0x022e }
            r1.close()     // Catch:{ IOException -> 0x022e }
            r1 = 139(0x8b, float:1.95E-43)
            r0[r1] = r2     // Catch:{ IOException -> 0x022e }
        L_0x0229:
            r1 = 140(0x8c, float:1.96E-43)
            r0[r1] = r2     // Catch:{ all -> 0x0241 }
            goto L_0x023c
        L_0x022e:
            r1 = move-exception
            r3 = 141(0x8d, float:1.98E-43)
            r0[r3] = r2     // Catch:{ all -> 0x0241 }
            java.lang.String r3 = "Failed to close file reader"
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r3, r1)     // Catch:{ all -> 0x0241 }
            r1 = 142(0x8e, float:1.99E-43)
            r0[r1] = r2     // Catch:{ all -> 0x0241 }
        L_0x023c:
            r1 = 143(0x8f, float:2.0E-43)
            r0[r1] = r2     // Catch:{ all -> 0x0241 }
            throw r10     // Catch:{ all -> 0x0241 }
        L_0x0241:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0241 }
            r1 = 144(0x90, float:2.02E-43)
            r0[r1] = r2
            goto L_0x0249
        L_0x0248:
            throw r10
        L_0x0249:
            goto L_0x0248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.get(java.lang.String):com.instabug.library.internal.storage.cache.Cacheable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V put(java.lang.String r10, V r11) {
        /*
            r9 = this;
            boolean[] r0 = $jacocoInit()
            r1 = 0
            r2 = 1
            if (r10 != 0) goto L_0x0016
            r10 = 146(0x92, float:2.05E-43)
            r0[r10] = r2
            java.lang.String r10 = "Key equal null"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r9, r10)
            r10 = 147(0x93, float:2.06E-43)
            r0[r10] = r2
            return r1
        L_0x0016:
            if (r11 != 0) goto L_0x0026
            r10 = 148(0x94, float:2.07E-43)
            r0[r10] = r2
            java.lang.String r10 = "Value equal null"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r9, r10)
            r10 = 149(0x95, float:2.09E-43)
            r0[r10] = r2
            return r1
        L_0x0026:
            java.io.File r3 = r9.cacheFile
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x003c
            r10 = 150(0x96, float:2.1E-43)
            r0[r10] = r2
            java.lang.String r10 = "Cache file doesn't exist"
            com.instabug.library.util.InstabugSDKLogger.m46622d(r9, r10)
            r10 = 151(0x97, float:2.12E-43)
            r0[r10] = r2
            return r1
        L_0x003c:
            com.instabug.library.internal.storage.cache.Cacheable r3 = r9.get(r10)
            if (r3 != 0) goto L_0x0047
            r4 = 152(0x98, float:2.13E-43)
            r0[r4] = r2
            goto L_0x0052
        L_0x0047:
            r4 = 153(0x99, float:2.14E-43)
            r0[r4] = r2
            r9.delete(r10)
            r4 = 154(0x9a, float:2.16E-43)
            r0[r4] = r2
        L_0x0052:
            java.io.File r4 = r9.cacheFile
            monitor-enter(r4)
            r5 = 155(0x9b, float:2.17E-43)
            r0[r5] = r2     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            java.io.File r7 = r9.cacheFile     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            r6.<init>(r7, r2)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            java.nio.charset.Charset r7 = r9.charset     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x00ea, JSONException -> 0x00d6, OutOfMemoryError -> 0x00aa }
            r1 = 156(0x9c, float:2.19E-43)
            r0[r1] = r2     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            r1.<init>(r5)     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            r6 = 157(0x9d, float:2.2E-43)
            r0[r6] = r2     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            java.io.Writer r6 = r1.append(r10)     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            java.lang.String r7 = ":"
            java.io.Writer r6 = r6.append(r7)     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            java.lang.String r7 = r11.toJson()     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            java.io.Writer r6 = r6.append(r7)     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            java.lang.String r7 = "\n"
            r6.append(r7)     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            r6 = 158(0x9e, float:2.21E-43)
            r0[r6] = r2     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            r1.close()     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            r1 = 159(0x9f, float:2.23E-43)
            r0[r1] = r2     // Catch:{ IOException -> 0x00a4, JSONException -> 0x00a1, OutOfMemoryError -> 0x009f }
            com.instabug.library.util.C10021b.m46631a(r5)     // Catch:{ all -> 0x012c }
            r10 = 160(0xa0, float:2.24E-43)
            r0[r10] = r2     // Catch:{ all -> 0x012c }
            goto L_0x0111
        L_0x009f:
            r1 = move-exception
            goto L_0x00ae
        L_0x00a1:
            r10 = move-exception
            r1 = r5
            goto L_0x00d7
        L_0x00a4:
            r1 = move-exception
            goto L_0x00ee
        L_0x00a6:
            r10 = move-exception
            r5 = r1
            goto L_0x0124
        L_0x00aa:
            r5 = move-exception
            r8 = r5
            r5 = r1
            r1 = r8
        L_0x00ae:
            r6 = 167(0xa7, float:2.34E-43)
            r0[r6] = r2     // Catch:{ all -> 0x0123 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            r6.<init>()     // Catch:{ all -> 0x0123 }
            java.lang.String r7 = "OOM while while setting value for key "
            r6.append(r7)     // Catch:{ all -> 0x0123 }
            r6.append(r10)     // Catch:{ all -> 0x0123 }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0123 }
            com.instabug.library.util.InstabugSDKLogger.m46623e(r10, r1)     // Catch:{ all -> 0x0123 }
            r10 = 168(0xa8, float:2.35E-43)
            r0[r10] = r2     // Catch:{ all -> 0x0123 }
            com.instabug.library.util.C10021b.m46631a(r5)     // Catch:{ all -> 0x012c }
            r10 = 169(0xa9, float:2.37E-43)
            r0[r10] = r2     // Catch:{ all -> 0x012c }
            goto L_0x0111
        L_0x00d6:
            r10 = move-exception
        L_0x00d7:
            r5 = 164(0xa4, float:2.3E-43)
            r0[r5] = r2     // Catch:{ all -> 0x00a6 }
            r10.printStackTrace()     // Catch:{ all -> 0x00a6 }
            r10 = 165(0xa5, float:2.31E-43)
            r0[r10] = r2     // Catch:{ all -> 0x00a6 }
            com.instabug.library.util.C10021b.m46631a(r1)     // Catch:{ all -> 0x012c }
            r10 = 166(0xa6, float:2.33E-43)
            r0[r10] = r2     // Catch:{ all -> 0x012c }
            goto L_0x0111
        L_0x00ea:
            r5 = move-exception
            r8 = r5
            r5 = r1
            r1 = r8
        L_0x00ee:
            r6 = 161(0xa1, float:2.26E-43)
            r0[r6] = r2     // Catch:{ all -> 0x0123 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0123 }
            r6.<init>()     // Catch:{ all -> 0x0123 }
            java.lang.String r7 = "Something went wrong while setting value for key "
            r6.append(r7)     // Catch:{ all -> 0x0123 }
            r6.append(r10)     // Catch:{ all -> 0x0123 }
            java.lang.String r10 = r6.toString()     // Catch:{ all -> 0x0123 }
            com.instabug.library.util.InstabugSDKLogger.m46624e(r9, r10, r1)     // Catch:{ all -> 0x0123 }
            r10 = 162(0xa2, float:2.27E-43)
            r0[r10] = r2     // Catch:{ all -> 0x0123 }
            com.instabug.library.util.C10021b.m46631a(r5)     // Catch:{ all -> 0x012c }
            r10 = 163(0xa3, float:2.28E-43)
            r0[r10] = r2     // Catch:{ all -> 0x012c }
        L_0x0111:
            monitor-exit(r4)     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x011a
            r10 = 172(0xac, float:2.41E-43)
            r0[r10] = r2
            r11 = r3
            goto L_0x011e
        L_0x011a:
            r10 = 173(0xad, float:2.42E-43)
            r0[r10] = r2
        L_0x011e:
            r10 = 174(0xae, float:2.44E-43)
            r0[r10] = r2
            return r11
        L_0x0123:
            r10 = move-exception
        L_0x0124:
            com.instabug.library.util.C10021b.m46631a(r5)     // Catch:{ all -> 0x012c }
            r11 = 170(0xaa, float:2.38E-43)
            r0[r11] = r2     // Catch:{ all -> 0x012c }
            throw r10     // Catch:{ all -> 0x012c }
        L_0x012c:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x012c }
            r11 = 171(0xab, float:2.4E-43)
            r0[r11] = r2
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.OnDiskCache.put(java.lang.String, com.instabug.library.internal.storage.cache.Cacheable):com.instabug.library.internal.storage.cache.Cacheable");
    }
}
