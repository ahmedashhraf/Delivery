package com.instabug.library.migration;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.util.C9712a;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.StringUtility;
import org.json.JSONException;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.migration.d */
/* compiled from: SDKAnalyticsMigration */
public class C9939d extends AbstractMigration {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26416b;

    /* renamed from: a */
    private Context f26417a;

    /* renamed from: com.instabug.library.migration.d$a */
    /* compiled from: SDKAnalyticsMigration */
    class C9940a implements C12243e0<AbstractMigration> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26418b;

        /* renamed from: a */
        final /* synthetic */ C9939d f26419a;

        C9940a(C9939d dVar) {
            boolean[] a = m46233a();
            this.f26419a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46233a() {
            boolean[] zArr = f26418b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3223191228950847250L, "com/instabug/library/migration/SDKAnalyticsMigration$1", 9);
            f26418b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35286a(C12226d0<AbstractMigration> d0Var) {
            boolean[] a = m46233a();
            CacheManager.getInstance().invalidateAllCaches();
            try {
                a[1] = true;
                C9712a.m45309a();
                a[2] = true;
                C9712a.m45312c();
                a[3] = true;
                AnalyticsObserver.setBeingCleaned(true, C9939d.m46231a(this.f26419a));
                a[4] = true;
            } catch (JSONException e) {
                a[5] = true;
                e.printStackTrace();
                a[6] = true;
            }
            d0Var.mo42030a(this.f26419a);
            a[7] = true;
            d0Var.onComplete();
            a[8] = true;
        }
    }

    public C9939d() {
        boolean[] a = m46232a();
        super("sdk_analytics_migration");
        a[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Context m46231a(C9939d dVar) {
        boolean[] a = m46232a();
        Context context = dVar.f26417a;
        a[27] = true;
        return context;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46232a() {
        boolean[] zArr = f26416b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4192960396120326083L, "com/instabug/library/migration/SDKAnalyticsMigration", 28);
        f26416b = a;
        return a;
    }

    public void doAfterMigration() {
        boolean[] a = m46232a();
        SettingsManager.getInstance().setCurrentSDKVersion("8.0.11");
        a[26] = true;
    }

    public void doPreMigration() {
        m46232a()[25] = true;
    }

    public int getMigrationVersion() {
        m46232a()[1] = true;
        return 4;
    }

    public void initialize(@C0193h0 Context context) {
        boolean[] a = m46232a();
        this.f26417a = context;
        a[2] = true;
    }

    public C5923b0<AbstractMigration> migrate() {
        boolean[] a = m46232a();
        C5923b0<AbstractMigration> a2 = C5923b0.m26095a((C12243e0<T>) new C9940a<T>(this));
        a[24] = true;
        return a2;
    }

    public boolean shouldMigrate() {
        boolean[] a = m46232a();
        String lastSDKVersion = SettingsManager.getInstance().getLastSDKVersion();
        a[3] = true;
        a[5] = true;
        String str = "8.0.11";
        boolean z = false;
        if (str.equalsIgnoreCase(lastSDKVersion)) {
            a[6] = true;
            a[7] = true;
            return false;
        } else if (AnalyticsObserver.haveBeenCleanedBefore(this.f26417a)) {
            a[8] = true;
            return false;
        } else {
            if (StringUtility.compareVersion(str, "8.0.0") == 1) {
                a[18] = true;
            } else {
                a[19] = true;
                if (!SettingsManager.getInstance().isSDKVersionSet()) {
                    a[20] = true;
                } else {
                    a[22] = true;
                    a[23] = true;
                    return z;
                }
            }
            a[21] = true;
            z = true;
            a[23] = true;
            return z;
        }
    }
}
