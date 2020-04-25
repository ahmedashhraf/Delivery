package com.instabug.library.invocation.invocationdialog;

import androidx.annotation.C0213q;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugDialogItem implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    int badgeCount;
    @C0213q
    int resDrawable;
    String title;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(9158321674541502404L, "com/instabug/library/invocation/invocationdialog/InstabugDialogItem", 8);
        $jacocoData = a;
        return a;
    }

    public InstabugDialogItem() {
        $jacocoInit()[0] = true;
    }

    public int getBadgeCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.badgeCount;
        $jacocoInit[4] = true;
        return i;
    }

    public int getResDrawable() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.resDrawable;
        $jacocoInit[6] = true;
        return i;
    }

    public String getTitle() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.title;
        $jacocoInit[2] = true;
        return str;
    }

    public void setBadge(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.badgeCount = i;
        $jacocoInit[5] = true;
    }

    public void setResDrawable(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.resDrawable = i;
        $jacocoInit[7] = true;
    }

    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.title = str;
        $jacocoInit[3] = true;
    }

    public InstabugDialogItem(String str, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.title = str;
        this.badgeCount = i;
        this.resDrawable = i2;
        $jacocoInit[1] = true;
    }
}
