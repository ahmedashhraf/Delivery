package com.instabug.library.migration;

import android.content.Context;
import androidx.annotation.C0193h0;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public abstract class AbstractMigration {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private String migrationId;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3481626581091931885L, "com/instabug/library/migration/AbstractMigration", 2);
        $jacocoData = a;
        return a;
    }

    public AbstractMigration(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.migrationId = str;
        $jacocoInit[0] = true;
    }

    public abstract void doAfterMigration();

    public abstract void doPreMigration();

    public String getMigrationId() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.migrationId;
        $jacocoInit[1] = true;
        return str;
    }

    public abstract int getMigrationVersion();

    public abstract void initialize(@C0193h0 Context context);

    public abstract C5923b0<AbstractMigration> migrate();

    public abstract boolean shouldMigrate();
}
