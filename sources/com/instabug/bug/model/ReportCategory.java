package com.instabug.bug.model;

import androidx.annotation.C0213q;
import com.instabug.bug.settings.C9291a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ReportCategory {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String CATEGORY_REPORT_A_PROBLEM = "report-a-problem";
    private static final String CATEGORY_SUGGEST_AN_IMPROVEMENT = "suggest-an-improvement";
    private static final String KEY_LABEL = "name";
    private static final String KEY_SLUG = "slug";
    private static final String KEY_SUBS = "subs";
    private int icon;
    private String label;
    private List<ReportCategory> subs;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4889103163914584279L, "com/instabug/bug/model/ReportCategory", 70);
        $jacocoData = a;
        return a;
    }

    private ReportCategory() {
        $jacocoInit()[0] = true;
    }

    private static ReportCategory fromJsonObject(JSONObject jSONObject) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        ReportCategory reportCategory = new ReportCategory();
        $jacocoInit[10] = true;
        String str = "name";
        if (!jSONObject.has(str)) {
            $jacocoInit[11] = true;
        } else {
            $jacocoInit[12] = true;
            reportCategory.setLabel(jSONObject.getString(str));
            $jacocoInit[13] = true;
        }
        ArrayList arrayList = new ArrayList();
        $jacocoInit[14] = true;
        String str2 = KEY_SUBS;
        if (!jSONObject.has(str2)) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            $jacocoInit[17] = true;
            int i = 0;
            $jacocoInit[18] = true;
            while (i < jSONArray.length()) {
                $jacocoInit[20] = true;
                arrayList.add(fromJsonObject(jSONArray.getJSONObject(i)));
                i++;
                $jacocoInit[21] = true;
            }
            $jacocoInit[19] = true;
        }
        reportCategory.setSubs(arrayList);
        $jacocoInit[22] = true;
        return reportCategory;
    }

    public static ReportCategory getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        ReportCategory reportCategory = new ReportCategory();
        $jacocoInit[1] = true;
        return reportCategory;
    }

    private static List<ReportCategory> getRemoteSubReportCategories(C9278b bVar) {
        boolean[] $jacocoInit = $jacocoInit();
        String b = C9291a.m43476r().mo33603b();
        if (b == null) {
            $jacocoInit[26] = true;
        } else {
            try {
                $jacocoInit[27] = true;
                JSONArray jSONArray = new JSONArray(b);
                if (bVar != C9278b.BUG) {
                    $jacocoInit[28] = true;
                    if (bVar != C9278b.FEEDBACK) {
                        $jacocoInit[34] = true;
                    } else {
                        $jacocoInit[35] = true;
                        List<ReportCategory> subCategories = getSubCategories(jSONArray, CATEGORY_SUGGEST_AN_IMPROVEMENT);
                        $jacocoInit[36] = true;
                        if (subCategories == null) {
                            $jacocoInit[37] = true;
                        } else if (subCategories.size() <= 0) {
                            $jacocoInit[38] = true;
                        } else {
                            $jacocoInit[39] = true;
                            return subCategories;
                        }
                    }
                } else {
                    $jacocoInit[29] = true;
                    List<ReportCategory> subCategories2 = getSubCategories(jSONArray, CATEGORY_REPORT_A_PROBLEM);
                    $jacocoInit[30] = true;
                    if (subCategories2 == null) {
                        $jacocoInit[31] = true;
                    } else if (subCategories2.size() <= 0) {
                        $jacocoInit[32] = true;
                    } else {
                        $jacocoInit[33] = true;
                        return subCategories2;
                    }
                }
                $jacocoInit[40] = true;
            } catch (JSONException e) {
                $jacocoInit[41] = true;
                e.printStackTrace();
                $jacocoInit[42] = true;
            }
        }
        $jacocoInit[43] = true;
        return null;
    }

    private static List<ReportCategory> getSubCategories(JSONArray jSONArray, String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[44] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            $jacocoInit[45] = true;
            String string = jSONArray.getJSONObject(i).getString(KEY_SLUG);
            $jacocoInit[46] = true;
            if (str.equals(string)) {
                $jacocoInit[47] = true;
                List<ReportCategory> subs2 = fromJsonObject(jSONArray.getJSONObject(i)).getSubs();
                $jacocoInit[48] = true;
                return subs2;
            }
            i++;
            $jacocoInit[49] = true;
        }
        $jacocoInit[50] = true;
        return null;
    }

    public static List<ReportCategory> getSubReportCategories(C9278b bVar) {
        boolean[] $jacocoInit = $jacocoInit();
        List<ReportCategory> remoteSubReportCategories = getRemoteSubReportCategories(bVar);
        if (remoteSubReportCategories != null) {
            $jacocoInit[23] = true;
        } else {
            remoteSubReportCategories = C9291a.m43476r().mo33592a();
            $jacocoInit[24] = true;
        }
        $jacocoInit[25] = true;
        return remoteSubReportCategories;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hasSubCategories(com.instabug.bug.model.C9278b r6) {
        /*
            boolean[] r0 = $jacocoInit()
            com.instabug.bug.model.b r1 = com.instabug.bug.model.C9278b.BUG
            r2 = 1
            r3 = 51
            r0[r3] = r2
            java.util.List r1 = getRemoteSubReportCategories(r1)
            com.instabug.bug.model.b r3 = com.instabug.bug.model.C9278b.FEEDBACK
            r4 = 52
            r0[r4] = r2
            java.util.List r3 = getRemoteSubReportCategories(r3)
            r4 = 53
            r0[r4] = r2
            r4 = 0
            if (r1 != 0) goto L_0x0025
            r1 = 54
            r0[r1] = r2
            goto L_0x002f
        L_0x0025:
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0031
            r1 = 55
            r0[r1] = r2
        L_0x002f:
            r1 = 0
            goto L_0x003f
        L_0x0031:
            com.instabug.bug.model.b r1 = com.instabug.bug.model.C9278b.BUG
            if (r6 != r1) goto L_0x003a
            r6 = 56
            r0[r6] = r2
            return r2
        L_0x003a:
            r1 = 57
            r0[r1] = r2
            r1 = 1
        L_0x003f:
            if (r3 != 0) goto L_0x0046
            r6 = 58
            r0[r6] = r2
            goto L_0x0063
        L_0x0046:
            r5 = 59
            r0[r5] = r2
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0055
            r6 = 60
            r0[r6] = r2
            goto L_0x0063
        L_0x0055:
            com.instabug.bug.model.b r1 = com.instabug.bug.model.C9278b.FEEDBACK
            if (r6 != r1) goto L_0x005e
            r6 = 61
            r0[r6] = r2
            return r2
        L_0x005e:
            r6 = 62
            r0[r6] = r2
            r1 = 1
        L_0x0063:
            com.instabug.bug.settings.a r6 = com.instabug.bug.settings.C9291a.m43476r()
            java.util.List r6 = r6.mo33592a()
            r3 = 63
            r0[r3] = r2
            if (r1 == 0) goto L_0x0076
            r6 = 64
            r0[r6] = r2
            goto L_0x0087
        L_0x0076:
            if (r6 != 0) goto L_0x007d
            r6 = 65
            r0[r6] = r2
            goto L_0x0087
        L_0x007d:
            int r6 = r6.size()
            if (r6 > 0) goto L_0x008c
            r6 = 66
            r0[r6] = r2
        L_0x0087:
            r6 = 68
            r0[r6] = r2
            goto L_0x0091
        L_0x008c:
            r6 = 67
            r0[r6] = r2
            r4 = 1
        L_0x0091:
            r6 = 69
            r0[r6] = r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.model.ReportCategory.hasSubCategories(com.instabug.bug.model.b):boolean");
    }

    private void setSubs(List<ReportCategory> list) {
        boolean[] $jacocoInit = $jacocoInit();
        this.subs = list;
        $jacocoInit[9] = true;
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

    public List<ReportCategory> getSubs() {
        boolean[] $jacocoInit = $jacocoInit();
        List<ReportCategory> list = this.subs;
        $jacocoInit[8] = true;
        return list;
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
