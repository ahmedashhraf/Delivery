package com.instabug.library.network;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0193h0;
import androidx.core.app.C0758m;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.b */
/* compiled from: InstabugBackgroundService */
public abstract class C9969b extends C0758m {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(246687458993224040L, "com/instabug/library/network/InstabugBackgroundService", 19);
        $jacocoData = a;
        return a;
    }

    public C9969b() {
        $jacocoInit()[0] = true;
    }

    protected static void enqueueInstabugWork(Context context, Class cls, int i, Intent intent) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            C0758m.enqueueWork(context, cls, i, intent);
            $jacocoInit[15] = true;
        } catch (Exception unused) {
            $jacocoInit[16] = true;
            InstabugSDKLogger.m46626v(C9969b.class, "job destroyed");
            $jacocoInit[17] = true;
        }
        $jacocoInit[18] = true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean mustHaveNetworkConnection();

    public void onCreate() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onCreate();
        $jacocoInit[1] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("New ");
        sb.append(getClass().getSimpleName());
        sb.append(" created");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[2] = true;
    }

    public void onDestroy() {
        boolean[] $jacocoInit = $jacocoInit();
        super.onDestroy();
        $jacocoInit[13] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" destroyed");
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[14] = true;
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(@C0193h0 Intent intent) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" started with intent ");
        sb.append(intent);
        InstabugSDKLogger.m46626v(this, sb.toString());
        $jacocoInit[3] = true;
        if (!mustHaveNetworkConnection()) {
            $jacocoInit[4] = true;
        } else if (!NetworkManager.isOnline(this)) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            InstabugSDKLogger.m46626v(this, "Internet is good to go");
            try {
                $jacocoInit[7] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Starting ");
                sb2.append(getClass().getSimpleName());
                sb2.append(" task");
                InstabugSDKLogger.m46626v(this, sb2.toString());
                $jacocoInit[8] = true;
                runBackgroundTask();
                $jacocoInit[9] = true;
            } catch (Exception e) {
                $jacocoInit[10] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("An error occurred while doing ");
                sb3.append(getClass().getSimpleName());
                sb3.append("'s required task ");
                sb3.append(e.getMessage());
                InstabugSDKLogger.m46624e(this, sb3.toString(), e);
                $jacocoInit[11] = true;
            }
        }
        $jacocoInit[12] = true;
    }

    /* access modifiers changed from: protected */
    public abstract void runBackgroundTask() throws Exception;
}
