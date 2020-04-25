package com.instabug.bug.view.actionList.service;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import java.io.IOException;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ReportCategoriesService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24634a;

    public ReportCategoriesService() {
        m43586b()[0] = true;
    }

    /* renamed from: a */
    public static void m43585a(Context context, Intent intent) {
        boolean[] b = m43586b();
        C9969b.enqueueInstabugWork(context, ReportCategoriesService.class, 2611, intent);
        b[1] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43586b() {
        boolean[] zArr = f24634a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1570976921848171127L, "com/instabug/bug/view/actionList/service/ReportCategoriesService", 8);
        f24634a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] b = m43586b();
        m43583a();
        b[6] = true;
    }

    /* renamed from: a */
    public static void m43584a(Context context) {
        boolean[] b = m43586b();
        if (System.currentTimeMillis() - C9301a.m43591b() <= 86400000) {
            b[2] = true;
        } else {
            b[3] = true;
            m43585a(context, new Intent(context, ReportCategoriesService.class));
            b[4] = true;
        }
        b[5] = true;
    }

    /* renamed from: a */
    private void m43583a() throws IOException, JSONException {
        boolean[] b = m43586b();
        C9301a.m43587a().mo33693a((Context) this);
        b[7] = true;
    }
}
