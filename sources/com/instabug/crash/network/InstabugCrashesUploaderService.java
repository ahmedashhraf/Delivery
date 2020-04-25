package com.instabug.crash.network;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.crash.models.Crash;
import com.instabug.crash.models.Crash.CrashState;
import com.instabug.crash.p364a.C9505a;
import com.instabug.crash.p366d.C9509a;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.CrashEntry;
import com.instabug.library.internal.storage.executor.DeleteOperationExecutor;
import com.instabug.library.internal.storage.operation.DeleteStateFileDiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.internal.video.InstabugVideoUtils;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugCrashesUploaderService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25188a;

    /* renamed from: com.instabug.crash.network.InstabugCrashesUploaderService$a */
    class C9516a implements Callbacks<String, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25189c;

        /* renamed from: a */
        final /* synthetic */ Crash f25190a;

        /* renamed from: b */
        final /* synthetic */ InstabugCrashesUploaderService f25191b;

        C9516a(InstabugCrashesUploaderService instabugCrashesUploaderService, Crash crash) {
            boolean[] a = m44567a();
            this.f25191b = instabugCrashesUploaderService;
            this.f25190a = crash;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44567a() {
            boolean[] zArr = f25189c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(453045716352111379L, "com/instabug/crash/network/InstabugCrashesUploaderService$1", 13);
            f25189c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34195a(String str) {
            boolean[] a = m44567a();
            InstabugCrashesUploaderService instabugCrashesUploaderService = this.f25191b;
            StringBuilder sb = new StringBuilder();
            sb.append("crash uploaded successfully, setting crash TemporaryServerToken equal ");
            sb.append(str);
            InstabugSDKLogger.m46622d(instabugCrashesUploaderService, sb.toString());
            a[1] = true;
            this.f25190a.mo34182b(str);
            a[2] = true;
            this.f25190a.mo34176a(CrashState.LOGS_READY_TO_BE_UPLOADED);
            a[3] = true;
            ContentValues contentValues = new ContentValues();
            a[4] = true;
            contentValues.put("temporary_server_token", str);
            a[5] = true;
            contentValues.put(CrashEntry.COLUMN_CRASH_STATE, CrashState.LOGS_READY_TO_BE_UPLOADED.name());
            a[6] = true;
            C9505a.m44503a(this.f25190a.mo34181a(), contentValues);
            a[7] = true;
            InstabugCrashesUploaderService.m44561a(this.f25191b, this.f25190a);
            a[8] = true;
            InstabugCrashesUploaderService.m44560a(this.f25191b);
            a[9] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44567a();
            mo34196a((Throwable) obj);
            a[11] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44567a();
            mo34195a((String) obj);
            a[12] = true;
        }

        /* renamed from: a */
        public void mo34196a(Throwable th) {
            boolean[] a = m44567a();
            InstabugSDKLogger.m46622d(this.f25191b, "Something went wrong while uploading crash");
            a[10] = true;
        }
    }

    /* renamed from: com.instabug.crash.network.InstabugCrashesUploaderService$b */
    class C9517b implements Callbacks<Boolean, Crash> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25192c;

        /* renamed from: a */
        final /* synthetic */ Crash f25193a;

        /* renamed from: b */
        final /* synthetic */ InstabugCrashesUploaderService f25194b;

        C9517b(InstabugCrashesUploaderService instabugCrashesUploaderService, Crash crash) {
            boolean[] a = m44570a();
            this.f25194b = instabugCrashesUploaderService;
            this.f25193a = crash;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44570a() {
            boolean[] zArr = f25192c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7483507904446036861L, "com/instabug/crash/network/InstabugCrashesUploaderService$2", 15);
            f25192c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34198a(Boolean bool) {
            boolean[] a = m44570a();
            InstabugSDKLogger.m46622d(this.f25194b, "crash logs uploaded successfully, change its state");
            a[1] = true;
            this.f25193a.mo34176a(CrashState.ATTACHMENTS_READY_TO_BE_UPLOADED);
            a[2] = true;
            ContentValues contentValues = new ContentValues();
            a[3] = true;
            contentValues.put(CrashEntry.COLUMN_CRASH_STATE, CrashState.ATTACHMENTS_READY_TO_BE_UPLOADED.name());
            a[4] = true;
            C9505a.m44503a(this.f25193a.mo34181a(), contentValues);
            try {
                a[5] = true;
                InstabugCrashesUploaderService.m44564b(this.f25194b, this.f25193a);
                a[6] = true;
            } catch (FileNotFoundException | JSONException e) {
                a[7] = true;
                InstabugCrashesUploaderService instabugCrashesUploaderService = this.f25194b;
                StringBuilder sb = new StringBuilder();
                sb.append("Something went wrong while uploading crash attachments e: ");
                a[8] = true;
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                a[9] = true;
                InstabugSDKLogger.m46623e(instabugCrashesUploaderService, sb2);
                a[10] = true;
            }
            a[11] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44570a();
            mo34197a((Crash) obj);
            a[13] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44570a();
            mo34198a((Boolean) obj);
            a[14] = true;
        }

        /* renamed from: a */
        public void mo34197a(Crash crash) {
            boolean[] a = m44570a();
            InstabugSDKLogger.m46622d(this.f25194b, "Something went wrong while uploading crash logs");
            a[12] = true;
        }
    }

    /* renamed from: com.instabug.crash.network.InstabugCrashesUploaderService$c */
    class C9518c implements Callbacks<Boolean, Crash> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25195c;

        /* renamed from: a */
        final /* synthetic */ Crash f25196a;

        /* renamed from: b */
        final /* synthetic */ InstabugCrashesUploaderService f25197b;

        /* renamed from: com.instabug.crash.network.InstabugCrashesUploaderService$c$a */
        class C9519a implements DiskOperationCallback<Boolean> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25198b;

            /* renamed from: a */
            final /* synthetic */ C9518c f25199a;

            C9519a(C9518c cVar) {
                boolean[] a = m44576a();
                this.f25199a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44576a() {
                boolean[] zArr = f25198b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7847154848366399488L, "com/instabug/crash/network/InstabugCrashesUploaderService$3$1", 4);
                f25198b = a;
                return a;
            }

            /* renamed from: a */
            public void mo34201a(Boolean bool) {
                boolean[] a = m44576a();
                StringBuilder sb = new StringBuilder();
                sb.append("result:");
                sb.append(bool);
                InstabugSDKLogger.m46625i(this, sb.toString());
                a[1] = true;
            }

            public void onFailure(Throwable th) {
                boolean[] a = m44576a();
                InstabugSDKLogger.m46624e(this, th.getClass().getSimpleName(), th);
                a[2] = true;
            }

            public /* synthetic */ void onSuccess(Object obj) {
                boolean[] a = m44576a();
                mo34201a((Boolean) obj);
                a[3] = true;
            }
        }

        C9518c(InstabugCrashesUploaderService instabugCrashesUploaderService, Crash crash) {
            boolean[] a = m44573a();
            this.f25197b = instabugCrashesUploaderService;
            this.f25196a = crash;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44573a() {
            boolean[] zArr = f25195c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1713445322752656100L, "com/instabug/crash/network/InstabugCrashesUploaderService$3", 13);
            f25195c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34200a(Boolean bool) {
            boolean[] a = m44573a();
            InstabugSDKLogger.m46622d(this.f25197b, "Crash attachments uploaded successfully, deleting crash");
            a[1] = true;
            C9505a.m44502a(this.f25196a.mo34181a());
            a[2] = true;
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null) {
                a[3] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("attempting to delete state file for crash with id: ");
                sb.append(this.f25196a.mo34181a());
                InstabugSDKLogger.m46625i(this, sb.toString());
                a[4] = true;
                DiskUtils with = DiskUtils.with(applicationContext);
                Crash crash = this.f25196a;
                a[5] = true;
                DeleteOperationExecutor deleteOperation = with.deleteOperation(new DeleteStateFileDiskOperation(crash.mo34187e().getUri()));
                C9519a aVar = new C9519a(this);
                a[6] = true;
                deleteOperation.executeAsync(aVar);
                a[7] = true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unable to delete state file for crash with id: ");
                sb2.append(this.f25196a.mo34181a());
                sb2.append("due to null context reference");
                InstabugSDKLogger.m46625i(this, sb2.toString());
                a[8] = true;
            }
            InstabugCrashesUploaderService.m44560a(this.f25197b);
            a[9] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44573a();
            mo34199a((Crash) obj);
            a[11] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44573a();
            mo34200a((Boolean) obj);
            a[12] = true;
        }

        /* renamed from: a */
        public void mo34199a(Crash crash) {
            boolean[] a = m44573a();
            InstabugSDKLogger.m46622d(this.f25197b, "Something went wrong while uploading crash attachments");
            a[10] = true;
        }
    }

    public InstabugCrashesUploaderService() {
        m44566d()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m44560a(InstabugCrashesUploaderService instabugCrashesUploaderService) {
        boolean[] d = m44566d();
        instabugCrashesUploaderService.m44565c();
        d[59] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m44564b(InstabugCrashesUploaderService instabugCrashesUploaderService, Crash crash) throws JSONException, FileNotFoundException {
        boolean[] d = m44566d();
        instabugCrashesUploaderService.m44563b(crash);
        d[60] = true;
    }

    /* renamed from: c */
    private void m44565c() {
        boolean[] d = m44566d();
        Calendar instance = Calendar.getInstance(Locale.ENGLISH);
        d[55] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Updating last_crash_time to ");
        sb.append(instance.getTime());
        InstabugSDKLogger.m46626v(this, sb.toString());
        d[56] = true;
        C9509a.m44519b().mo34171a(instance.getTime().getTime());
        d[57] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m44566d() {
        boolean[] zArr = f25188a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2078058901347187275L, "com/instabug/crash/network/InstabugCrashesUploaderService", 61);
        f25188a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] d = m44566d();
        m44557a();
        d[2] = true;
        m44562b();
        d[3] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m44561a(InstabugCrashesUploaderService instabugCrashesUploaderService, Crash crash) {
        boolean[] d = m44566d();
        instabugCrashesUploaderService.m44559a(crash);
        d[58] = true;
    }

    /* renamed from: b */
    private void m44562b() throws IOException, JSONException {
        boolean[] d = m44566d();
        List<Crash> a = C9505a.m44501a(getApplicationContext());
        d[31] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(a.size());
        sb.append(" crashes in cache");
        InstabugSDKLogger.m46622d(this, sb.toString());
        d[32] = true;
        d[33] = true;
        for (Crash crash : a) {
            d[34] = true;
            if (crash.mo34189f().equals(CrashState.READY_TO_BE_SENT)) {
                d[35] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Uploading crash: ");
                sb2.append(crash.toString());
                InstabugSDKLogger.m46622d(this, sb2.toString());
                d[36] = true;
                C9520a.m44578a().mo34205a((Context) this, crash, (Callbacks<String, Throwable>) new C9516a<String,Throwable>(this, crash));
                d[37] = true;
            } else {
                String str = "crash: ";
                if (crash.mo34189f().equals(CrashState.LOGS_READY_TO_BE_UPLOADED)) {
                    d[38] = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(crash.toString());
                    sb3.append(" already uploaded but has unsent logs, uploading now");
                    InstabugSDKLogger.m46622d(this, sb3.toString());
                    d[39] = true;
                    m44559a(crash);
                    d[40] = true;
                } else if (!crash.mo34189f().equals(CrashState.ATTACHMENTS_READY_TO_BE_UPLOADED)) {
                    d[41] = true;
                } else {
                    d[42] = true;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(crash.toString());
                    sb4.append(" already uploaded but has unsent attachments, uploading now");
                    InstabugSDKLogger.m46622d(this, sb4.toString());
                    d[43] = true;
                    m44563b(crash);
                    d[44] = true;
                }
            }
            d[45] = true;
        }
        d[46] = true;
    }

    /* renamed from: a */
    public static void m44558a(Context context, Intent intent) {
        boolean[] d = m44566d();
        C9969b.enqueueInstabugWork(context, InstabugCrashesUploaderService.class, 2582, intent);
        d[1] = true;
    }

    /* renamed from: a */
    private void m44557a() throws IOException, JSONException {
        boolean[] d = m44566d();
        if (!SettingsManager.getInstance().autoScreenRecordingEnabled()) {
            d[4] = true;
            return;
        }
        int autoScreenRecordingMaxDuration = SettingsManager.getInstance().autoScreenRecordingMaxDuration();
        d[5] = true;
        d[6] = true;
        for (Crash crash : C9505a.m44501a(getApplicationContext())) {
            d[7] = true;
            if (crash.mo34189f() != CrashState.WAITING_FOR_SCREEN_RECORDING_TO_BE_TRIMMED) {
                d[8] = true;
            } else {
                d[9] = true;
                Iterator it = crash.mo34186d().iterator();
                d[10] = true;
                while (true) {
                    if (!it.hasNext()) {
                        d[11] = true;
                        break;
                    }
                    Attachment attachment = (Attachment) it.next();
                    d[12] = true;
                    if (attachment.getType().toString().equalsIgnoreCase(Type.AUTO_SCREEN_RECORDING.toString())) {
                        d[13] = true;
                        File file = new File(attachment.getLocalPath());
                        d[14] = true;
                        File autoScreenRecordingFile = AttachmentManager.getAutoScreenRecordingFile(getApplicationContext());
                        d[15] = true;
                        File startTrim = InstabugVideoUtils.startTrim(file, autoScreenRecordingFile, autoScreenRecordingMaxDuration);
                        d[16] = true;
                        Uri fromFile = Uri.fromFile(startTrim);
                        d[17] = true;
                        attachment.setName(fromFile.getLastPathSegment());
                        d[18] = true;
                        attachment.setLocalPath(fromFile.getPath());
                        d[19] = true;
                        InstabugSDKLogger.m46622d(this, "auto screen recording trimmed");
                        d[20] = true;
                        crash.mo34176a(CrashState.READY_TO_BE_SENT);
                        d[21] = true;
                        ContentValues contentValues = new ContentValues();
                        d[22] = true;
                        contentValues.put(CrashEntry.COLUMN_CRASH_STATE, CrashState.READY_TO_BE_SENT.name());
                        d[23] = true;
                        C9505a.m44503a(crash.mo34181a(), contentValues);
                        d[24] = true;
                        ContentValues contentValues2 = new ContentValues();
                        d[25] = true;
                        contentValues2.put(AttachmentEntry.COLUMN_LOCALE_PATH, startTrim.getPath());
                        d[26] = true;
                        AttachmentsDbHelper.update(attachment.getId(), contentValues2);
                        d[27] = true;
                        break;
                    }
                    d[28] = true;
                }
            }
            d[29] = true;
        }
        d[30] = true;
    }

    /* renamed from: b */
    private void m44563b(Crash crash) throws JSONException, FileNotFoundException {
        boolean[] d = m44566d();
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(crash.mo34186d().size());
        sb.append(" attachments related to crash: ");
        d[51] = true;
        sb.append(crash.mo34185c());
        String sb2 = sb.toString();
        d[52] = true;
        InstabugSDKLogger.m46622d(this, sb2);
        d[53] = true;
        C9520a.m44578a().mo34207b(this, crash, new C9518c(this, crash));
        d[54] = true;
    }

    /* renamed from: a */
    private void m44559a(Crash crash) {
        boolean[] d = m44566d();
        StringBuilder sb = new StringBuilder();
        sb.append("START uploading all logs related to this crash id = ");
        d[47] = true;
        sb.append(crash.mo34181a());
        String sb2 = sb.toString();
        d[48] = true;
        InstabugSDKLogger.m46622d(this, sb2);
        d[49] = true;
        C9520a.m44578a().mo34209c(this, crash, new C9517b(this, crash));
        d[50] = true;
    }
}
