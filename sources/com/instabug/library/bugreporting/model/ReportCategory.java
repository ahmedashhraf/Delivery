package com.instabug.library.bugreporting.model;

import androidx.annotation.C0213q;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ReportCategory {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private int icon;
    private String label;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1692395564953036822L, "com/instabug/library/bugreporting/model/ReportCategory", 8);
        $jacocoData = a;
        return a;
    }

    private ReportCategory() {
        $jacocoInit()[0] = true;
    }

    public static ReportCategory getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        ReportCategory reportCategory = new ReportCategory();
        $jacocoInit[1] = true;
        return reportCategory;
    }

    public int getIcon() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.icon;
        $jacocoInit[6] = true;
        return i;
    }

    public String getLabel() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.label;
        $jacocoInit[4] = true;
        return str;
    }

    public void setIcon(@C0213q int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.icon = i;
        $jacocoInit[7] = true;
    }

    public void setLabel(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.label = str;
        $jacocoInit[5] = true;
    }

    public ReportCategory withIcon(@C0213q int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.icon = i;
        $jacocoInit[3] = true;
        return this;
    }

    public ReportCategory withLabel(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.label = str;
        $jacocoInit[2] = true;
        return this;
    }
}
