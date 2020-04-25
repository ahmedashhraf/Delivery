package com.instabug.library.internal.storage.cache;

import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.internal.storage.cache.a */
/* compiled from: AssetCache */
public class C9839a extends InMemoryCache<String, AssetEntity> {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26072a;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = f26072a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4026571145876675979L, "com/instabug/library/internal/storage/cache/AssetCache", 8);
        f26072a = a;
        return a;
    }

    public C9839a(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        super(str);
        $jacocoInit[0] = true;
    }

    public void invalidate() {
        boolean[] $jacocoInit = $jacocoInit();
        List<AssetEntity> values = getValues();
        $jacocoInit[1] = true;
        $jacocoInit[2] = true;
        for (AssetEntity assetEntity : values) {
            $jacocoInit[3] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Delete file: ");
            sb.append(assetEntity.getFile().getPath());
            sb.append(",");
            $jacocoInit[4] = true;
            sb.append(assetEntity.getFile().delete());
            String sb2 = sb.toString();
            $jacocoInit[5] = true;
            InstabugSDKLogger.m46622d(AssetsCacheManager.class, sb2);
            $jacocoInit[6] = true;
        }
        super.invalidate();
        $jacocoInit[7] = true;
    }
}
