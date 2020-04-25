package com.instabug.crash;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.instabug.crash.models.Crash;
import com.instabug.crash.models.Crash.C9514a;
import com.instabug.crash.models.Crash.CrashState;
import com.instabug.crash.network.InstabugCrashesUploaderService;
import com.instabug.crash.p364a.C9505a;
import com.instabug.crash.p365c.C9507a;
import com.instabug.crash.p365c.C9508b;
import com.instabug.crash.p367e.C9513b;
import com.instabug.library.APIBuildChecker;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.executor.WriteOperationExecutor;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.internal.video.AutoScreenRecordingService.Action;
import com.instabug.library.model.Report;
import com.instabug.library.model.State;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class CrashReporting {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-861467367872570883L, "com/instabug/crash/CrashReporting", 73);
        $jacocoData = a;
        return a;
    }

    public CrashReporting() {
        $jacocoInit()[0] = true;
    }

    public static void addCrashAttachments(Context context, Crash crash) {
        boolean[] $jacocoInit = $jacocoInit();
        Set<Entry> entrySet = InstabugCore.getExtraAttachmentFiles().entrySet();
        $jacocoInit[52] = true;
        $jacocoInit[53] = true;
        for (Entry entry : entrySet) {
            $jacocoInit[54] = true;
            Uri uri = (Uri) entry.getKey();
            $jacocoInit[55] = true;
            String str = (String) entry.getValue();
            $jacocoInit[56] = true;
            Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(context, uri, str);
            $jacocoInit[57] = true;
            crash.mo34174a(newFileAttachmentUri);
            $jacocoInit[58] = true;
        }
        $jacocoInit[59] = true;
    }

    public static void createFormattedException(Throwable th, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        try {
            $jacocoInit[4] = true;
            $jacocoInit[5] = true;
            JSONObject a = C9513b.m44533a(th, str);
            $jacocoInit[6] = true;
            jSONObject.put("error", a);
            $jacocoInit[7] = true;
            reportException(jSONObject, true);
            $jacocoInit[8] = true;
        } catch (JSONException e) {
            $jacocoInit[9] = true;
            e.printStackTrace();
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
    }

    private static void createStateTextFile(Context context, Crash crash, File file) {
        Class<CrashReporting> cls = CrashReporting.class;
        boolean[] $jacocoInit = $jacocoInit();
        try {
            DiskUtils with = DiskUtils.with(context);
            $jacocoInit[40] = true;
            WriteOperationExecutor writeOperation = with.writeOperation(new WriteStateToFileDiskOperation(file, crash.mo34187e().toJson()));
            $jacocoInit[41] = true;
            Uri execute = writeOperation.execute();
            $jacocoInit[42] = true;
            crash.mo34187e().setUri(execute);
            $jacocoInit[43] = true;
            C9505a.m44500a(crash);
            $jacocoInit[44] = true;
        } catch (JSONException e) {
            $jacocoInit[45] = true;
            InstabugSDKLogger.m46623e(cls, e.toString());
            $jacocoInit[46] = true;
        } catch (IOException e2) {
            $jacocoInit[47] = true;
            InstabugSDKLogger.m46623e(cls, e2.toString());
            $jacocoInit[48] = true;
        }
        $jacocoInit[49] = true;
    }

    @C0193h0
    public static Crash getCrash(JSONObject jSONObject, boolean z, Context context, State state) {
        boolean[] $jacocoInit = $jacocoInit();
        Crash a = new C9514a().mo34193a(context, state);
        $jacocoInit[60] = true;
        a.mo34184c(jSONObject.toString());
        $jacocoInit[61] = true;
        a.mo34176a(CrashState.READY_TO_BE_SENT);
        $jacocoInit[62] = true;
        a.mo34180a(z);
        $jacocoInit[63] = true;
        return a;
    }

    @C0193h0
    public static Report getReport(SettingsManager settingsManager) {
        boolean[] $jacocoInit = $jacocoInit();
        Report report = new Report();
        $jacocoInit[64] = true;
        if (settingsManager.getOnReportCreatedListener() == null) {
            $jacocoInit[65] = true;
        } else {
            $jacocoInit[66] = true;
            settingsManager.getOnReportCreatedListener().onReportCreated(report);
            $jacocoInit[67] = true;
        }
        $jacocoInit[68] = true;
        return report;
    }

    public static void reportException(Throwable th) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[1] = true;
        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.DISABLED) {
            $jacocoInit[2] = true;
            return;
        }
        createFormattedException(th, null);
        $jacocoInit[3] = true;
    }

    private static void reportUncaughtException(JSONObject jSONObject) {
        boolean[] $jacocoInit = $jacocoInit();
        reportException(jSONObject, false);
        $jacocoInit[72] = true;
    }

    public static void stopAutoScreenRecordingAndAttach(Crash crash) {
        boolean[] $jacocoInit = $jacocoInit();
        AutoScreenRecordingEventBus.getInstance().post(Action.STOP_KEEP);
        $jacocoInit[50] = true;
        C9507a.m44512a(crash);
        $jacocoInit[51] = true;
    }

    private static void reportException(JSONObject jSONObject, boolean z) {
        Class<CrashReporting> cls = CrashReporting.class;
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.DISABLED) {
            $jacocoInit[12] = true;
            return;
        }
        if (SettingsManager.getInstance().getPreReportRunnable() == null) {
            $jacocoInit[13] = true;
        } else {
            try {
                $jacocoInit[14] = true;
                SettingsManager.getInstance().getPreReportRunnable().run();
                $jacocoInit[15] = true;
            } catch (Exception e) {
                $jacocoInit[16] = true;
                InstabugSDKLogger.m46624e(cls, "Pre sending runnable failed to run.", e);
                $jacocoInit[17] = true;
            }
        }
        Context applicationContext = Instabug.getApplicationContext();
        $jacocoInit[18] = true;
        State state = State.getState(applicationContext);
        $jacocoInit[19] = true;
        SettingsManager instance = SettingsManager.getInstance();
        $jacocoInit[20] = true;
        Report report = getReport(instance);
        $jacocoInit[21] = true;
        Crash crash = getCrash(jSONObject, z, applicationContext, state);
        $jacocoInit[22] = true;
        ReportHelper.update(crash.mo34187e(), report);
        $jacocoInit[23] = true;
        if (InstabugCore.getExtraAttachmentFiles().size() < 1) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            addCrashAttachments(applicationContext, crash);
            $jacocoInit[26] = true;
        }
        if (!C9508b.m44515b().isEnabled()) {
            $jacocoInit[27] = true;
        } else {
            $jacocoInit[28] = true;
            if (!SettingsManager.getInstance().autoScreenRecordingEnabled()) {
                $jacocoInit[29] = true;
            } else {
                $jacocoInit[30] = true;
                stopAutoScreenRecordingAndAttach(crash);
                $jacocoInit[31] = true;
            }
        }
        if (applicationContext == null) {
            $jacocoInit[32] = true;
        } else {
            $jacocoInit[33] = true;
            File createStateTextFile = DiskUtils.createStateTextFile(applicationContext);
            $jacocoInit[34] = true;
            createStateTextFile(applicationContext, crash, createStateTextFile);
            $jacocoInit[35] = true;
        }
        InstabugSDKLogger.m46625i(cls, "ReportCaughtException: Your exception has been reported");
        $jacocoInit[36] = true;
        Intent intent = new Intent(applicationContext, InstabugCrashesUploaderService.class);
        $jacocoInit[37] = true;
        InstabugCrashesUploaderService.m44558a(applicationContext, intent);
        $jacocoInit[38] = true;
        C9508b.m44515b().mo34169a();
        $jacocoInit[39] = true;
    }

    public static void reportException(Throwable th, @C0195i0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[69] = true;
        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == Feature.State.DISABLED) {
            $jacocoInit[70] = true;
            return;
        }
        createFormattedException(th, str);
        $jacocoInit[71] = true;
    }
}
