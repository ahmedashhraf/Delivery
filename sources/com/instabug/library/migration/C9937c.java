package com.instabug.library.migration;

import android.content.Context;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Arrays;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.migration.c */
/* compiled from: MigrationManager */
public final class C9937c {

    /* renamed from: a */
    private static final AbstractMigration[] f26413a = {new C9933a(), new C9945g(), new C9935b(), new C9941e(), new C9943f(), new C9939d()};

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26414b;

    /* renamed from: com.instabug.library.migration.c$a */
    /* compiled from: MigrationManager */
    static class C9938a extends C13787e<AbstractMigration> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26415b;

        C9938a() {
            m46228c()[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46228c() {
            boolean[] zArr = f26415b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5262183850219721530L, "com/instabug/library/migration/MigrationManager$1", 7);
            f26415b = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46228c();
            mo35287a((AbstractMigration) obj);
            c[6] = true;
        }

        public void onComplete() {
            boolean[] c = m46228c();
            InstabugSDKLogger.m46622d(C9937c.class, "All Migrations completed, setting lastMigrationVersion to 4");
            c[1] = true;
            SettingsManager.getInstance().setLastMigrationVersion(4);
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46228c();
            StringBuilder sb = new StringBuilder();
            sb.append("Migration failed");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46622d(C9937c.class, sb.toString());
            c[3] = true;
        }

        /* renamed from: a */
        public void mo35287a(AbstractMigration abstractMigration) {
            boolean[] c = m46228c();
            StringBuilder sb = new StringBuilder();
            sb.append("Migration ");
            sb.append(abstractMigration.getMigrationId());
            sb.append(" done");
            InstabugSDKLogger.m46622d(C9937c.class, sb.toString());
            c[4] = true;
            abstractMigration.doAfterMigration();
            c[5] = true;
        }
    }

    static {
        boolean[] a = m46226a();
        a[31] = true;
    }

    public C9937c() {
        m46226a()[0] = true;
    }

    /* renamed from: a */
    public static void m46223a(Context context) {
        boolean[] a = m46226a();
        C5923b0[] b = m46227b(context);
        if (b == null) {
            a[1] = true;
        } else if (b.length == 0) {
            a[2] = true;
        } else {
            a[3] = true;
            C5923b0 g = C5923b0.m26197g((Iterable<? extends C5926g0<? extends T>>) Arrays.asList(b));
            a[4] = true;
            C5923b0 a2 = g.mo23825a(C12228b.m55094b());
            a[5] = true;
            C5923b0 c = a2.mo23950c(C12228b.m55094b());
            C9938a aVar = new C9938a();
            a[6] = true;
            c.mo23893a((C12280i0<? super T>) aVar);
            a[7] = true;
            a[9] = true;
        }
        InstabugSDKLogger.m46622d(C9937c.class, "No migrations to run");
        a[8] = true;
        a[9] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46226a() {
        boolean[] zArr = f26414b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-476418831906996028L, "com/instabug/library/migration/MigrationManager", 32);
        f26414b = a;
        return a;
    }

    /* renamed from: b */
    private static C5923b0<AbstractMigration>[] m46227b(Context context) {
        boolean[] a = m46226a();
        ArrayList arrayList = new ArrayList();
        AbstractMigration[] abstractMigrationArr = f26413a;
        int length = abstractMigrationArr.length;
        a[10] = true;
        int i = 0;
        while (i < length) {
            AbstractMigration abstractMigration = abstractMigrationArr[i];
            a[11] = true;
            abstractMigration.initialize(context);
            a[12] = true;
            if (!m46224a(abstractMigration)) {
                a[13] = true;
            } else {
                a[14] = true;
                abstractMigration.doPreMigration();
                a[15] = true;
                arrayList.add(abstractMigration.migrate());
                a[16] = true;
            }
            i++;
            a[17] = true;
        }
        C5923b0<AbstractMigration>[] a2 = m46225a(arrayList);
        a[18] = true;
        return a2;
    }

    /* renamed from: a */
    private static boolean m46224a(AbstractMigration abstractMigration) {
        boolean z;
        boolean[] a = m46226a();
        if (abstractMigration.getMigrationVersion() > 4) {
            a[19] = true;
        } else {
            a[20] = true;
            if (!abstractMigration.shouldMigrate()) {
                a[21] = true;
            } else {
                a[22] = true;
                z = true;
                a[24] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Checking if should apply this migration: ");
                sb.append(abstractMigration.getMigrationId());
                sb.append(", result is ");
                sb.append(z);
                sb.append(" last migration version is ");
                sb.append(SettingsManager.getInstance().getLastMigrationVersion());
                sb.append(" target migration version ");
                sb.append(4);
                InstabugSDKLogger.m46622d(C9937c.class, sb.toString());
                a[25] = true;
                return z;
            }
        }
        z = false;
        a[23] = true;
        a[24] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Checking if should apply this migration: ");
        sb2.append(abstractMigration.getMigrationId());
        sb2.append(", result is ");
        sb2.append(z);
        sb2.append(" last migration version is ");
        sb2.append(SettingsManager.getInstance().getLastMigrationVersion());
        sb2.append(" target migration version ");
        sb2.append(4);
        InstabugSDKLogger.m46622d(C9937c.class, sb2.toString());
        a[25] = true;
        return z;
    }

    /* renamed from: a */
    private static C5923b0[] m46225a(ArrayList<C5923b0<AbstractMigration>> arrayList) {
        boolean[] a = m46226a();
        C5923b0[] b0VarArr = new C5923b0[arrayList.size()];
        a[26] = true;
        a[27] = true;
        int i = 0;
        while (i < arrayList.size()) {
            a[28] = true;
            b0VarArr[i] = (C5923b0) arrayList.get(i);
            i++;
            a[29] = true;
        }
        a[30] = true;
        return b0VarArr;
    }
}
