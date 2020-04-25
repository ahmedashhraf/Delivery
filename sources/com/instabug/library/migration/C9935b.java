package com.instabug.library.migration;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.instabug.library.settings.SettingsManager;
import p195e.p196a.C12226d0;
import p195e.p196a.C12243e0;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.migration.b */
/* compiled from: LastContactedAtToLastBugAndLastChatTimeMigration */
public class C9935b extends AbstractMigration {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26410a;

    /* renamed from: com.instabug.library.migration.b$a */
    /* compiled from: LastContactedAtToLastBugAndLastChatTimeMigration */
    class C9936a implements C12243e0<AbstractMigration> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26411b;

        /* renamed from: a */
        final /* synthetic */ C9935b f26412a;

        C9936a(C9935b bVar) {
            boolean[] a = m46221a();
            this.f26412a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46221a() {
            boolean[] zArr = f26411b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5583517891888793790L, "com/instabug/library/migration/LastContactedAtToLastBugAndLastChatTimeMigration$1", 3);
            f26411b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35286a(C12226d0<AbstractMigration> d0Var) {
            boolean[] a = m46221a();
            d0Var.mo42030a(this.f26412a);
            a[1] = true;
            d0Var.onComplete();
            a[2] = true;
        }
    }

    public C9935b() {
        boolean[] a = m46220a();
        super("last_contacted_at_to_last_bug_and_last_chat_time_migration");
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46220a() {
        boolean[] zArr = f26410a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4700750724563335411L, "com/instabug/library/migration/LastContactedAtToLastBugAndLastChatTimeMigration", 13);
        f26410a = a;
        return a;
    }

    public void doAfterMigration() {
        m46220a()[12] = true;
    }

    public void doPreMigration() {
        m46220a()[11] = true;
    }

    public String getMigrationId() {
        m46220a()[1] = true;
        return "last_contacted_at_to_last_bug_and_last_chat_time_migration";
    }

    public int getMigrationVersion() {
        m46220a()[2] = true;
        return 3;
    }

    public void initialize(@C0193h0 Context context) {
        m46220a()[3] = true;
    }

    public C5923b0<AbstractMigration> migrate() {
        boolean[] a = m46220a();
        C5923b0<AbstractMigration> a2 = C5923b0.m26095a((C12243e0<T>) new C9936a<T>(this));
        a[10] = true;
        return a2;
    }

    public boolean shouldMigrate() {
        boolean z;
        boolean[] a = m46220a();
        if (getMigrationVersion() <= SettingsManager.getInstance().getLastMigrationVersion()) {
            a[4] = true;
        } else {
            a[5] = true;
            if (SettingsManager.getInstance().getLastContactedAt() == 0) {
                a[6] = true;
            } else {
                a[7] = true;
                z = true;
                a[9] = true;
                return z;
            }
        }
        z = false;
        a[8] = true;
        a[9] = true;
        return z;
    }
}
