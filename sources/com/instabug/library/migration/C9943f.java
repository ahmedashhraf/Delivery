package com.instabug.library.migration;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.migration.f */
/* compiled from: SDKForwardMigration */
public class C9943f extends AbstractMigration {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26423a;

    /* renamed from: com.instabug.library.migration.f$a */
    /* compiled from: SDKForwardMigration */
    class C9944a implements C12243e0<AbstractMigration> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26424b;

        /* renamed from: a */
        final /* synthetic */ C9943f f26425a;

        C9944a(C9943f fVar) {
            boolean[] a = m46239a();
            this.f26425a = fVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46239a() {
            boolean[] zArr = f26424b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2940657267280297616L, "com/instabug/library/migration/SDKForwardMigration$1", 4);
            f26424b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35286a(C12226d0<AbstractMigration> d0Var) {
            boolean[] a = m46239a();
            CacheManager.getInstance().invalidateAllCaches();
            a[1] = true;
            d0Var.mo42030a(this.f26425a);
            a[2] = true;
            d0Var.onComplete();
            a[3] = true;
        }
    }

    C9943f() {
        boolean[] a = m46238a();
        super("sdk_forward_migration");
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46238a() {
        boolean[] zArr = f26423a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5774698888946681505L, "com/instabug/library/migration/SDKForwardMigration", 24);
        f26423a = a;
        return a;
    }

    public void doAfterMigration() {
        boolean[] a = m46238a();
        InstabugSDKLogger.m46625i(this, "doAfterMigration called");
        a[22] = true;
        SettingsManager.getInstance().setCurrentSDKVersion("8.0.11");
        a[23] = true;
    }

    public void doPreMigration() {
        m46238a()[21] = true;
    }

    public int getMigrationVersion() {
        m46238a()[1] = true;
        return 4;
    }

    public void initialize(@C0193h0 Context context) {
        m46238a()[2] = true;
    }

    public C5923b0<AbstractMigration> migrate() {
        boolean[] a = m46238a();
        C5923b0<AbstractMigration> a2 = C5923b0.m26095a((C12243e0<T>) new C9944a<T>(this));
        a[20] = true;
        return a2;
    }

    public boolean shouldMigrate() {
        boolean[] a = m46238a();
        String lastSDKVersion = SettingsManager.getInstance().getLastSDKVersion();
        a[3] = true;
        String str = "8.0.11";
        boolean z = false;
        if (lastSDKVersion.contains("-")) {
            a[5] = true;
            String valueOf = String.valueOf(str.charAt(0));
            a[6] = true;
            String valueOf2 = String.valueOf(lastSDKVersion.charAt(0));
            a[7] = true;
            if (StringUtility.compareVersion(valueOf, valueOf2) == 1) {
                a[8] = true;
            } else {
                a[9] = true;
                if (!SettingsManager.getInstance().isSDKVersionSet()) {
                    a[10] = true;
                } else {
                    a[12] = true;
                    a[13] = true;
                    return z;
                }
            }
            a[11] = true;
            z = true;
            a[13] = true;
            return z;
        }
        if (StringUtility.compareVersion(str, lastSDKVersion) == 1) {
            a[14] = true;
        } else {
            a[15] = true;
            if (!SettingsManager.getInstance().isSDKVersionSet()) {
                a[16] = true;
            } else {
                a[18] = true;
                a[19] = true;
                return z;
            }
        }
        a[17] = true;
        z = true;
        a[19] = true;
        return z;
    }
}
