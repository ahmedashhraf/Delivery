package com.instabug.library.migration;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.instabug.library.settings.SettingsManager;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.migration.a */
/* compiled from: LastContactedAtMigration */
public class C9933a extends AbstractMigration {

    /* renamed from: b */
    private static String f26405b = "last_contacted_at_migration";

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26406c;

    /* renamed from: a */
    private Context f26407a;

    /* renamed from: com.instabug.library.migration.a$a */
    /* compiled from: LastContactedAtMigration */
    class C9934a implements C12243e0<AbstractMigration> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26408b;

        /* renamed from: a */
        final /* synthetic */ C9933a f26409a;

        C9934a(C9933a aVar) {
            boolean[] a = m46218a();
            this.f26409a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46218a() {
            boolean[] zArr = f26408b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6472736609375468999L, "com/instabug/library/migration/LastContactedAtMigration$1", 2);
            f26408b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35286a(C12226d0<AbstractMigration> d0Var) {
            m46218a()[1] = true;
        }
    }

    static {
        boolean[] a = m46217a();
        a[39] = true;
    }

    public C9933a() {
        boolean[] a = m46217a();
        super(f26405b);
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46217a() {
        boolean[] zArr = f26406c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8081195171689550663L, "com/instabug/library/migration/LastContactedAtMigration", 40);
        f26406c = a;
        return a;
    }

    public void doAfterMigration() {
        m46217a()[14] = true;
    }

    public void doPreMigration() {
        m46217a()[13] = true;
    }

    public String getMigrationId() {
        boolean[] a = m46217a();
        String str = f26405b;
        a[1] = true;
        return str;
    }

    public int getMigrationVersion() {
        m46217a()[2] = true;
        return 1;
    }

    public void initialize(@C0193h0 Context context) {
        boolean[] a = m46217a();
        this.f26407a = context;
        a[3] = true;
    }

    public C5923b0<AbstractMigration> migrate() {
        boolean[] a = m46217a();
        C5923b0<AbstractMigration> a2 = C5923b0.m26095a((C12243e0<T>) new C9934a<T>(this));
        a[12] = true;
        return a2;
    }

    public boolean shouldMigrate() {
        boolean z;
        boolean[] a = m46217a();
        if (getMigrationVersion() <= SettingsManager.getInstance().getLastMigrationVersion()) {
            a[4] = true;
        } else {
            a[5] = true;
            if (!SettingsManager.getInstance().isDeviceRegistered()) {
                a[6] = true;
            } else {
                a[7] = true;
                if (SettingsManager.getInstance().getLastContactedAt() != 0) {
                    a[8] = true;
                } else {
                    a[9] = true;
                    z = true;
                    a[11] = true;
                    return z;
                }
            }
        }
        z = false;
        a[10] = true;
        a[11] = true;
        return z;
    }
}
