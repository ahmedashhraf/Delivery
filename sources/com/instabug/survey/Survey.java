package com.instabug.survey;

import com.instabug.library.Instabug;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Survey {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private long surveyId;
    private String title;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8428553668888230125L, "com/instabug/survey/Survey", 4);
        $jacocoData = a;
        return a;
    }

    public Survey(long j, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.title = str;
        this.surveyId = j;
        $jacocoInit[0] = true;
    }

    public String getTitle() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.title;
        $jacocoInit[1] = true;
        return str;
    }

    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.title = str;
        $jacocoInit[2] = true;
    }

    public void show() {
        boolean[] $jacocoInit = $jacocoInit();
        C10060a.m46770a(Instabug.getApplicationContext()).mo36103a(this.surveyId);
        $jacocoInit[3] = true;
    }
}
