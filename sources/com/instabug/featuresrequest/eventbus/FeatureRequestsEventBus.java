package com.instabug.featuresrequest.eventbus;

import androidx.annotation.C0224v0;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.library.core.eventbus.EventBus;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FeatureRequestsEventBus extends EventBus<C9567a> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static volatile FeatureRequestsEventBus featureRequestsEventBus;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8721058000719353146L, "com/instabug/featuresrequest/eventbus/FeatureRequestsEventBus", 13);
        $jacocoData = a;
        return a;
    }

    private FeatureRequestsEventBus() {
        boolean[] $jacocoInit = $jacocoInit();
        if (featureRequestsEventBus == null) {
            $jacocoInit[2] = true;
            return;
        }
        $jacocoInit[0] = true;
        RuntimeException runtimeException = new RuntimeException("Use getInstance() method to get the single instance of this class");
        $jacocoInit[1] = true;
        throw runtimeException;
    }

    /* JADX INFO: finally extract failed */
    public static FeatureRequestsEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (featureRequestsEventBus != null) {
            $jacocoInit[3] = true;
        } else {
            synchronized (FeatureRequestsEventBus.class) {
                try {
                    $jacocoInit[4] = true;
                    if (featureRequestsEventBus != null) {
                        $jacocoInit[5] = true;
                    } else {
                        $jacocoInit[6] = true;
                        featureRequestsEventBus = new FeatureRequestsEventBus();
                        $jacocoInit[7] = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        $jacocoInit[9] = true;
                        throw th;
                    }
                }
            }
            $jacocoInit[8] = true;
        }
        FeatureRequestsEventBus featureRequestsEventBus2 = featureRequestsEventBus;
        $jacocoInit[10] = true;
        return featureRequestsEventBus2;
    }

    @C0224v0
    static void tearDown() {
        boolean[] $jacocoInit = $jacocoInit();
        featureRequestsEventBus = null;
        $jacocoInit[11] = true;
    }

    /* access modifiers changed from: protected */
    public FeatureRequestsEventBus readResolve() {
        boolean[] $jacocoInit = $jacocoInit();
        FeatureRequestsEventBus instance = getInstance();
        $jacocoInit[12] = true;
        return instance;
    }
}
