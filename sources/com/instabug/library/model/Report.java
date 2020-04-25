package com.instabug.library.model;

import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.StringUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Report {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private ArrayList<C9947a> consoleLogs;
    private HashMap<Uri, String> fileAttachments;
    private ArrayList<String> tags = new ArrayList<>();
    private HashMap<String, String> userAttributes;
    private String userData;

    public interface OnReportCreatedListener {
        void onReportCreated(Report report);
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3118825605940435829L, "com/instabug/library/model/Report", 39);
        $jacocoData = a;
        return a;
    }

    public Report() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
        this.consoleLogs = new ArrayList<>();
        $jacocoInit[2] = true;
        this.userAttributes = new HashMap<>();
        $jacocoInit[3] = true;
        this.fileAttachments = new HashMap<>();
        $jacocoInit[4] = true;
    }

    public void addFileAttachment(@C0193h0 Uri uri, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.fileAttachments.put(uri, str);
        $jacocoInit[6] = true;
    }

    public void addTag(String... strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        Collections.addAll(this.tags, strArr);
        $jacocoInit[5] = true;
    }

    public void appendToConsoleLogs(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9947a aVar = new C9947a();
        $jacocoInit[9] = true;
        aVar.mo35467b(str);
        $jacocoInit[10] = true;
        aVar.mo35466a(System.currentTimeMillis());
        $jacocoInit[11] = true;
        this.consoleLogs.add(aVar);
        $jacocoInit[12] = true;
    }

    public ArrayList<C9947a> getConsoleLog() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C9947a> arrayList = this.consoleLogs;
        $jacocoInit[34] = true;
        return arrayList;
    }

    public HashMap<Uri, String> getFileAttachments() {
        boolean[] $jacocoInit = $jacocoInit();
        HashMap<Uri, String> hashMap = this.fileAttachments;
        $jacocoInit[38] = true;
        return hashMap;
    }

    public List<String> getTags() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<String> arrayList = this.tags;
        $jacocoInit[33] = true;
        return arrayList;
    }

    public HashMap<String, String> getUserAttributes() {
        boolean[] $jacocoInit = $jacocoInit();
        HashMap<String, String> hashMap = this.userAttributes;
        $jacocoInit[37] = true;
        return hashMap;
    }

    public String getUserData() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.userData;
        $jacocoInit[35] = true;
        return str;
    }

    public void logDebug(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != State.ENABLED) {
            $jacocoInit[17] = true;
        } else {
            $jacocoInit[18] = true;
            InstabugLog.m46184d(str);
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
    }

    public void logError(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != State.ENABLED) {
            $jacocoInit[29] = true;
        } else {
            $jacocoInit[30] = true;
            InstabugLog.m46185e(str);
            $jacocoInit[31] = true;
        }
        $jacocoInit[32] = true;
    }

    public void logInfo(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != State.ENABLED) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            InstabugLog.m46186i(str);
            $jacocoInit[23] = true;
        }
        $jacocoInit[24] = true;
    }

    public void logVerbose(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != State.ENABLED) {
            $jacocoInit[13] = true;
        } else {
            $jacocoInit[14] = true;
            InstabugLog.m46187v(str);
            $jacocoInit[15] = true;
        }
        $jacocoInit[16] = true;
    }

    public void logWarn(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.INSTABUG_LOGS) != State.ENABLED) {
            $jacocoInit[25] = true;
        } else {
            $jacocoInit[26] = true;
            InstabugLog.m46188w(str);
            $jacocoInit[27] = true;
        }
        $jacocoInit[28] = true;
    }

    public void setUserAttribute(@C0193h0 String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userAttributes.put(str, str2);
        $jacocoInit[8] = true;
    }

    public void setUserData(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userData = StringUtility.trimString(str);
        $jacocoInit[36] = true;
    }

    public void addFileAttachment(@C0193h0 byte[] bArr, @C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.fileAttachments.put(AttachmentsUtility.getUriFromBytes(Instabug.getApplicationContext(), bArr, str), str);
        $jacocoInit[7] = true;
    }
}
