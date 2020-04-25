package com.instabug.crash;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.crash.models.Crash;
import com.instabug.crash.models.Crash.C9514a;
import com.instabug.crash.models.Crash.CrashState;
import com.instabug.crash.p364a.C9505a;
import com.instabug.crash.p365c.C9507a;
import com.instabug.crash.p365c.C9508b;
import com.instabug.crash.p367e.C9513b;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.executor.WriteOperationExecutor;
import com.instabug.library.internal.storage.operation.WriteStateToFileDiskOperation;
import com.instabug.library.internal.video.AutoScreenRecordingService.Action;
import com.instabug.library.model.Report;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.ReportHelper;
import java.io.File;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.b */
/* compiled from: InstabugUncaughtExceptionHandler */
public class C9506b implements UncaughtExceptionHandler {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25162b;

    /* renamed from: a */
    UncaughtExceptionHandler f25163a = Thread.getDefaultUncaughtExceptionHandler();

    public C9506b() {
        boolean[] b = m44506b();
        b[0] = true;
        b[1] = true;
    }

    /* renamed from: a */
    private void m44505a(Crash crash) {
        boolean[] b = m44506b();
        AutoScreenRecordingEventBus.getInstance().post(Action.STOP_KEEP);
        b[36] = true;
        C9507a.m44512a(crash);
        b[37] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44506b() {
        boolean[] zArr = f25162b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7421871834804157492L, "com/instabug/crash/InstabugUncaughtExceptionHandler", 81);
        f25162b = a;
        return a;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Class<Instabug> cls = Instabug.class;
        boolean[] b = m44506b();
        if (InstabugCore.getFeatureState(Feature.CRASH_REPORTING) == State.DISABLED) {
            b[2] = true;
            this.f25163a.uncaughtException(thread, th);
            b[3] = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Instabug Caught an Unhandled Exception: ");
            b[4] = true;
            sb.append(th.getClass().getCanonicalName());
            String sb2 = sb.toString();
            b[5] = true;
            InstabugSDKLogger.m46624e(cls, sb2, th);
            b[6] = true;
            JSONObject jSONObject = new JSONObject();
            try {
                b[7] = true;
                jSONObject = mo34165a(thread, th);
                b[8] = true;
            } catch (JSONException e) {
                b[9] = true;
                e.printStackTrace();
                b[10] = true;
            }
            if (mo34167a(jSONObject.toString())) {
                b[11] = true;
                this.f25163a.uncaughtException(thread, th);
                b[12] = true;
                return;
            }
            if (SettingsManager.getInstance().getPreReportRunnable() == null) {
                b[13] = true;
            } else {
                try {
                    b[14] = true;
                    SettingsManager.getInstance().getPreReportRunnable().run();
                    b[15] = true;
                } catch (Exception e2) {
                    b[16] = true;
                    InstabugSDKLogger.m46624e(cls, "Pre sending runnable failed to run.", e2);
                    b[17] = true;
                }
            }
            Context applicationContext = Instabug.getApplicationContext();
            b[18] = true;
            Crash a = new C9514a().mo34193a(applicationContext, com.instabug.library.model.State.getState(applicationContext));
            b[19] = true;
            Crash a2 = mo34163a(a, jSONObject, applicationContext);
            b[20] = true;
            Report a3 = mo34164a();
            b[21] = true;
            ReportHelper.update(a2.mo34187e(), a3);
            b[22] = true;
            if (!C9508b.m44515b().isEnabled()) {
                b[23] = true;
            } else {
                b[24] = true;
                if (!SettingsManager.getInstance().autoScreenRecordingEnabled()) {
                    b[25] = true;
                } else {
                    b[26] = true;
                    m44505a(a2);
                    try {
                        b[27] = true;
                    } catch (JSONException e3) {
                        b[29] = true;
                        InstabugSDKLogger.m46623e(this, e3.getMessage());
                        b[30] = true;
                    } catch (IOException e4) {
                        b[31] = true;
                        InstabugSDKLogger.m46623e(CrashReporting.class, e4.toString());
                        b[32] = true;
                    }
                }
            }
            mo34166a(applicationContext, a2);
            b[28] = true;
            InstabugSDKLogger.m46625i(cls, "Crash persisted for upload at next startup");
            b[33] = true;
            this.f25163a.uncaughtException(thread, th);
            b[34] = true;
        }
        b[35] = true;
    }

    /* renamed from: a */
    public void mo34166a(Context context, Crash crash) throws IOException, JSONException {
        boolean[] b = m44506b();
        File createStateTextFile = DiskUtils.createStateTextFile(context);
        b[38] = true;
        DiskUtils with = DiskUtils.with(context);
        b[39] = true;
        WriteOperationExecutor writeOperation = with.writeOperation(new WriteStateToFileDiskOperation(createStateTextFile, crash.mo34187e().toJson()));
        b[40] = true;
        Uri execute = writeOperation.execute();
        b[41] = true;
        crash.mo34187e().setUri(execute);
        b[42] = true;
        C9505a.m44500a(crash);
        b[43] = true;
    }

    @C0193h0
    /* renamed from: a */
    public Crash mo34163a(Crash crash, JSONObject jSONObject, Context context) {
        boolean[] b = m44506b();
        crash.mo34184c(jSONObject.toString());
        b[44] = true;
        crash.mo34176a(CrashState.READY_TO_BE_SENT);
        b[45] = true;
        crash.mo34180a(false);
        b[46] = true;
        if (InstabugCore.getExtraAttachmentFiles().size() < 1) {
            b[47] = true;
        } else {
            b[48] = true;
            LinkedHashMap extraAttachmentFiles = InstabugCore.getExtraAttachmentFiles();
            b[49] = true;
            Set<Entry> entrySet = extraAttachmentFiles.entrySet();
            b[50] = true;
            b[51] = true;
            for (Entry entry : entrySet) {
                b[53] = true;
                Uri uri = (Uri) entry.getKey();
                b[54] = true;
                String str = (String) entry.getValue();
                b[55] = true;
                Uri newFileAttachmentUri = AttachmentsUtility.getNewFileAttachmentUri(context, uri, str);
                b[56] = true;
                crash.mo34174a(newFileAttachmentUri);
                b[57] = true;
            }
            b[52] = true;
        }
        b[58] = true;
        return crash;
    }

    @C0193h0
    /* renamed from: a */
    public Report mo34164a() {
        boolean[] b = m44506b();
        SettingsManager instance = SettingsManager.getInstance();
        b[59] = true;
        Report report = new Report();
        b[60] = true;
        if (instance.getOnReportCreatedListener() == null) {
            b[61] = true;
        } else {
            b[62] = true;
            instance.getOnReportCreatedListener().onReportCreated(report);
            b[63] = true;
        }
        b[64] = true;
        return report;
    }

    /* renamed from: a */
    public JSONObject mo34165a(Thread thread, Throwable th) throws JSONException {
        boolean[] b = m44506b();
        JSONObject jSONObject = new JSONObject();
        b[65] = true;
        JSONObject jSONObject2 = new JSONObject();
        b[66] = true;
        jSONObject2.put("threadName", thread.getName());
        b[67] = true;
        jSONObject2.put("threadId", thread.getId());
        b[68] = true;
        jSONObject2.put("threadPriority", thread.getPriority());
        b[69] = true;
        jSONObject2.put("threadState", thread.getState().toString());
        b[70] = true;
        ThreadGroup threadGroup = thread.getThreadGroup();
        if (threadGroup == null) {
            b[71] = true;
        } else {
            b[72] = true;
            JSONObject jSONObject3 = new JSONObject();
            b[73] = true;
            jSONObject3.put("name", threadGroup.getName());
            b[74] = true;
            jSONObject3.put("maxPriority", threadGroup.getMaxPriority());
            b[75] = true;
            jSONObject3.put("activeCount", threadGroup.activeCount());
            b[76] = true;
            jSONObject2.put("threadGroup", jSONObject3);
            b[77] = true;
        }
        jSONObject.put("thread", jSONObject2);
        b[78] = true;
        jSONObject.put("error", C9513b.m44533a(th, null));
        b[79] = true;
        return jSONObject;
    }

    /* renamed from: a */
    public boolean mo34167a(String str) {
        boolean[] b = m44506b();
        boolean contains = str.contains("com.facebook.react.modules");
        b[80] = true;
        return contains;
    }
}
