package com.instabug.library.migration;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.migration.g */
/* compiled from: V2CacheFilesMigration */
public class C9945g extends AbstractMigration {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26426b;

    /* renamed from: a */
    private Context f26427a;

    /* renamed from: com.instabug.library.migration.g$a */
    /* compiled from: V2CacheFilesMigration */
    class C9946a implements C12243e0<AbstractMigration> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26428b;

        /* renamed from: a */
        final /* synthetic */ C9945g f26429a;

        C9946a(C9945g gVar) {
            boolean[] a = m46243a();
            this.f26429a = gVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46243a() {
            boolean[] zArr = f26428b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8099840034156823883L, "com/instabug/library/migration/V2CacheFilesMigration$1", 17);
            f26428b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35286a(C12226d0<AbstractMigration> d0Var) {
            boolean z;
            Class<C9945g> cls = C9945g.class;
            boolean[] a = m46243a();
            StringBuilder sb = new StringBuilder();
            sb.append(C9945g.m46241a(this.f26429a).getCacheDir());
            sb.append("/issues.cache");
            File file = new File(sb.toString());
            a[1] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C9945g.m46241a(this.f26429a).getCacheDir());
            sb2.append("/conversations.cache");
            File file2 = new File(sb2.toString());
            a[2] = true;
            boolean z2 = false;
            if (!file.exists()) {
                a[3] = true;
                z = false;
            } else {
                a[4] = true;
                z = file.delete();
                a[5] = true;
            }
            if (!z) {
                a[6] = true;
            } else {
                a[7] = true;
                InstabugSDKLogger.m46626v(cls, "Issues cache file found and deleted");
                a[8] = true;
            }
            if (!file2.exists()) {
                a[9] = true;
            } else {
                a[10] = true;
                z2 = file2.delete();
                a[11] = true;
            }
            if (!z2) {
                a[12] = true;
            } else {
                a[13] = true;
                InstabugSDKLogger.m46626v(cls, "Conversations cache file found and deleted");
                a[14] = true;
            }
            d0Var.mo42030a(this.f26429a);
            a[15] = true;
            d0Var.onComplete();
            a[16] = true;
        }
    }

    C9945g() {
        boolean[] a = m46242a();
        super("v2_cache_files_migration");
        a[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Context m46241a(C9945g gVar) {
        boolean[] a = m46242a();
        Context context = gVar.f26427a;
        a[19] = true;
        return context;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46242a() {
        boolean[] zArr = f26426b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1946895303028218902L, "com/instabug/library/migration/V2CacheFilesMigration", 20);
        f26426b = a;
        return a;
    }

    public void doAfterMigration() {
        m46242a()[18] = true;
    }

    public void doPreMigration() {
        m46242a()[17] = true;
    }

    public int getMigrationVersion() {
        m46242a()[1] = true;
        return 2;
    }

    public void initialize(@C0193h0 Context context) {
        boolean[] a = m46242a();
        this.f26427a = context;
        a[2] = true;
    }

    public C5923b0<AbstractMigration> migrate() {
        boolean[] a = m46242a();
        C5923b0<AbstractMigration> a2 = C5923b0.m26095a((C12243e0<T>) new C9946a<T>(this));
        a[16] = true;
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean shouldMigrate() {
        /*
            r7 = this;
            boolean[] r0 = m46242a()
            int r1 = r7.getMigrationVersion()
            com.instabug.library.settings.SettingsManager r2 = com.instabug.library.settings.SettingsManager.getInstance()
            int r2 = r2.getLastMigrationVersion()
            r3 = 0
            r4 = 1
            if (r1 > r2) goto L_0x0018
            r1 = 3
            r0[r1] = r4
            return r3
        L_0x0018:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r5 = r7.f26427a
            java.io.File r5 = r5.getCacheDir()
            r2.append(r5)
            java.lang.String r5 = "/issues.cache"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = 4
            r0[r2] = r4
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r6 = r7.f26427a
            java.io.File r6 = r6.getCacheDir()
            r5.append(r6)
            java.lang.String r6 = "/conversations.cache"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.<init>(r5)
            r5 = 5
            r0[r5] = r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.getMigrationId()
            r5.append(r6)
            java.lang.String r6 = " is "
            r5.append(r6)
            boolean r6 = r1.exists()
            if (r6 == 0) goto L_0x0071
            r6 = 6
            r0[r6] = r4
            goto L_0x007a
        L_0x0071:
            boolean r6 = r2.exists()
            if (r6 == 0) goto L_0x0080
            r6 = 7
            r0[r6] = r4
        L_0x007a:
            r6 = 8
            r0[r6] = r4
            r6 = 1
            goto L_0x0085
        L_0x0080:
            r6 = 9
            r0[r6] = r4
            r6 = 0
        L_0x0085:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.instabug.library.util.InstabugSDKLogger.m46626v(r7, r5)
            r5 = 10
            r0[r5] = r4
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x009e
            r1 = 11
            r0[r1] = r4
            goto L_0x00a8
        L_0x009e:
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x00ae
            r1 = 12
            r0[r1] = r4
        L_0x00a8:
            r1 = 13
            r0[r1] = r4
            r3 = 1
            goto L_0x00b2
        L_0x00ae:
            r1 = 14
            r0[r1] = r4
        L_0x00b2:
            r1 = 15
            r0[r1] = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.migration.C9945g.shouldMigrate():boolean");
    }
}
