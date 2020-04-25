package com.instabug.library.util;

import android.net.Uri;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.model.Report;
import com.instabug.library.model.State;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ReportHelper {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8958200303991881675L, "com/instabug/library/util/ReportHelper", 34);
        $jacocoData = a;
        return a;
    }

    public ReportHelper() {
        $jacocoInit()[0] = true;
    }

    private static String getAppendedUserData(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder("");
        $jacocoInit[19] = true;
        sb.append(Instabug.getUserData());
        $jacocoInit[20] = true;
        sb.append("\n");
        $jacocoInit[21] = true;
        sb.append(str);
        $jacocoInit[22] = true;
        if (sb.toString().length() > 100) {
            $jacocoInit[23] = true;
            String substring = sb.toString().substring(0, 1000);
            $jacocoInit[24] = true;
            return substring;
        }
        String sb2 = sb.toString();
        $jacocoInit[25] = true;
        return sb2;
    }

    private static String getAppendedUserTags(List<String> list) {
        boolean[] $jacocoInit = $jacocoInit();
        Instabug.getTags().addAll(list);
        $jacocoInit[26] = true;
        String tagsAsString = InstabugCore.getTagsAsString();
        $jacocoInit[27] = true;
        return tagsAsString;
    }

    private static String getUserAppendedAttributes(HashMap<String, String> hashMap) {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[28] = true;
        for (Entry entry : hashMap.entrySet()) {
            $jacocoInit[29] = true;
            String str = (String) entry.getKey();
            $jacocoInit[30] = true;
            String str2 = (String) entry.getValue();
            $jacocoInit[31] = true;
            UserAttributesCacheManager.putAttribute(str, str2);
            $jacocoInit[32] = true;
        }
        String userAttributes = UserAttributesCacheManager.getUserAttributes();
        $jacocoInit[33] = true;
        return userAttributes;
    }

    public static void update(State state, Report report) {
        boolean[] $jacocoInit = $jacocoInit();
        if (state == null) {
            $jacocoInit[1] = true;
            return;
        }
        state.setTags(getAppendedUserTags(report.getTags()));
        $jacocoInit[2] = true;
        state.updateConsoleLog(report.getConsoleLog());
        $jacocoInit[3] = true;
        $jacocoInit[4] = true;
        for (Entry entry : report.getFileAttachments().entrySet()) {
            $jacocoInit[5] = true;
            Uri uri = (Uri) entry.getKey();
            $jacocoInit[6] = true;
            String str = (String) entry.getValue();
            $jacocoInit[7] = true;
            Instabug.addFileAttachment(uri, str);
            $jacocoInit[8] = true;
        }
        if (InstabugCore.getFeatureState(Feature.USER_DATA) != Feature.State.ENABLED) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            if (report.getUserData() == null) {
                $jacocoInit[11] = true;
            } else {
                $jacocoInit[12] = true;
                state.setUserData(getAppendedUserData(report.getUserData()));
                $jacocoInit[13] = true;
            }
        }
        state.setUserAttributes(getUserAppendedAttributes(report.getUserAttributes()));
        $jacocoInit[14] = true;
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != Feature.State.ENABLED) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            state.setInstabugLog(InstabugLog.getLogs());
            $jacocoInit[17] = true;
        }
        $jacocoInit[18] = true;
    }
}
