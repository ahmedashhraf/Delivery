package com.instabug.library.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class LastContactedChangedBroadcast extends BroadcastReceiver {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String LAST_CONTACTED_AT = "last_contacted_at";
    public static final String LAST_CONTACTED_CHANGED = "User last contact at changed";
    private C9777a mLastContactedMonitor;

    /* renamed from: com.instabug.library.broadcast.LastContactedChangedBroadcast$a */
    public interface C9777a {
        /* renamed from: d */
        void mo34855d();
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4147303876243813664L, "com/instabug/library/broadcast/LastContactedChangedBroadcast", 3);
        $jacocoData = a;
        return a;
    }

    public LastContactedChangedBroadcast(C9777a aVar) {
        boolean[] $jacocoInit = $jacocoInit();
        this.mLastContactedMonitor = aVar;
        $jacocoInit[0] = true;
    }

    public void onReceive(Context context, Intent intent) {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, " - onReceive");
        $jacocoInit[1] = true;
        this.mLastContactedMonitor.mo34855d();
        $jacocoInit[2] = true;
    }
}
