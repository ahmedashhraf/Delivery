package com.instabug.crash.network;

import android.content.Context;
import androidx.annotation.C0193h0;
import androidx.annotation.C0224v0;
import com.facebook.common.util.UriUtil;
import com.instabug.crash.models.Crash;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.CrashEntry;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.model.State.StateItem;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.NetworkManager.RequestType;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.FileToUpload;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.network.a */
/* compiled from: CrashesService */
public class C9520a {

    /* renamed from: b */
    private static C9520a f25200b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25201c;

    /* renamed from: a */
    private NetworkManager f25202a = new NetworkManager();

    /* renamed from: com.instabug.crash.network.a$a */
    /* compiled from: CrashesService */
    class C9521a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25203O;

        /* renamed from: N */
        final /* synthetic */ C9520a f25204N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25205b;

        C9521a(C9520a aVar, Callbacks callbacks) {
            boolean[] c = m44590c();
            this.f25204N = aVar;
            this.f25205b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44590c() {
            boolean[] zArr = f25203O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5048802878792076104L, "com/instabug/crash/network/CrashesService$1", 16);
            f25203O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44590c();
            mo34210a((RequestResponse) obj);
            c[15] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44590c();
            InstabugSDKLogger.m46622d(this, "reportingCrashRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44590c();
            InstabugSDKLogger.m46622d(this, "reportingCrashRequest completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44590c();
            StringBuilder sb = new StringBuilder();
            sb.append("reportingCrashRequest got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[3] = true;
            this.f25205b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo34210a(RequestResponse requestResponse) {
            boolean[] c = m44590c();
            StringBuilder sb = new StringBuilder();
            sb.append("reportingCrashRequest onNext, Response code: ");
            c[5] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[6] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[7] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            try {
                c[8] = true;
                Callbacks callbacks = this.f25205b;
                c[9] = true;
                String string = new JSONObject((String) requestResponse.getResponseBody()).getString("id");
                c[10] = true;
                callbacks.onSucceeded(string);
                c[11] = true;
            } catch (JSONException e) {
                c[12] = true;
                e.printStackTrace();
                c[13] = true;
            }
            c[14] = true;
        }
    }

    /* renamed from: com.instabug.crash.network.a$b */
    /* compiled from: CrashesService */
    class C9522b extends C13787e<RequestResponse> {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f25206P;

        /* renamed from: N */
        final /* synthetic */ Callbacks f25207N;

        /* renamed from: O */
        final /* synthetic */ C9520a f25208O;

        /* renamed from: b */
        final /* synthetic */ Crash f25209b;

        C9522b(C9520a aVar, Crash crash, Callbacks callbacks) {
            boolean[] c = m44594c();
            this.f25208O = aVar;
            this.f25209b = crash;
            this.f25207N = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44594c() {
            boolean[] zArr = f25206P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3765174623119985333L, "com/instabug/crash/network/CrashesService$2", 25);
            f25206P = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44594c();
            mo34211a((RequestResponse) obj);
            c[24] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44594c();
            InstabugSDKLogger.m46622d(this, "uploadingCrashAttachmentRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44594c();
            InstabugSDKLogger.m46622d(this, "uploadingCrashAttachmentRequest completed");
            c[2] = true;
            if (this.f25209b.mo34186d().size() != 0) {
                c[3] = true;
            } else {
                c[4] = true;
                this.f25207N.onSucceeded(Boolean.valueOf(true));
                c[5] = true;
            }
            c[6] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44594c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploadingCrashAttachmentRequest got error: ");
            c[7] = true;
            sb.append(th.getMessage());
            String sb2 = sb.toString();
            c[8] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            c[9] = true;
            this.f25207N.onFailed(this.f25209b);
            c[10] = true;
        }

        /* renamed from: a */
        public void mo34211a(RequestResponse requestResponse) {
            boolean[] c = m44594c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploadingCrashAttachmentRequest onNext, Response code: ");
            c[11] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[12] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[13] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[14] = true;
            File file = new File(((Attachment) this.f25209b.mo34186d().get(0)).getLocalPath());
            c[15] = true;
            boolean delete = file.delete();
            c[16] = true;
            Attachment attachment = (Attachment) this.f25209b.mo34186d().remove(0);
            String str = "Attachment: ";
            if (!delete) {
                c[17] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(attachment);
                sb3.append(" is not removed");
                InstabugSDKLogger.m46623e(this, sb3.toString());
                c[18] = true;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(attachment);
                sb4.append(" is removed");
                InstabugSDKLogger.m46622d(this, sb4.toString());
                c[19] = true;
            }
            if (attachment.getId() != -1) {
                c[20] = true;
                AttachmentsDbHelper.delete(attachment.getId());
                c[21] = true;
            } else {
                AttachmentsDbHelper.delete(attachment.getName(), this.f25209b.mo34181a());
                c[22] = true;
            }
            c[23] = true;
        }
    }

    /* renamed from: com.instabug.crash.network.a$c */
    /* compiled from: CrashesService */
    class C9523c extends C13787e<RequestResponse> {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f25210P;

        /* renamed from: N */
        final /* synthetic */ Crash f25211N;

        /* renamed from: O */
        final /* synthetic */ C9520a f25212O;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25213b;

        C9523c(C9520a aVar, Callbacks callbacks, Crash crash) {
            boolean[] c = m44598c();
            this.f25212O = aVar;
            this.f25213b = callbacks;
            this.f25211N = crash;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44598c() {
            boolean[] zArr = f25210P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5202200346373773776L, "com/instabug/crash/network/CrashesService$3", 11);
            f25210P = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44598c();
            mo34212a((RequestResponse) obj);
            c[10] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44598c();
            InstabugSDKLogger.m46622d(this, "uploading crash logs started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44598c();
            InstabugSDKLogger.m46622d(this, "uploading crash logs completed");
            c[6] = true;
            this.f25213b.onSucceeded(Boolean.valueOf(true));
            c[7] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44598c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploading crash logs got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[8] = true;
            this.f25213b.onFailed(this.f25211N);
            c[9] = true;
        }

        /* renamed from: a */
        public void mo34212a(RequestResponse requestResponse) {
            boolean[] c = m44598c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploading crash logs onNext, Response code: ");
            c[2] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[3] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[4] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[5] = true;
        }
    }

    private C9520a() {
        boolean[] b = m44581b();
        b[0] = true;
        b[1] = true;
    }

    /* renamed from: a */
    public static C9520a m44578a() {
        boolean[] b = m44581b();
        if (f25200b != null) {
            b[2] = true;
        } else {
            b[3] = true;
            f25200b = new C9520a();
            b[4] = true;
        }
        C9520a aVar = f25200b;
        b[5] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44581b() {
        boolean[] zArr = f25201c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3176245013658111842L, "com/instabug/crash/network/CrashesService", 82);
        f25201c = a;
        return a;
    }

    /* renamed from: b */
    public void mo34207b(Context context, Crash crash, Callbacks<Boolean, Crash> callbacks) throws JSONException {
        boolean[] b = m44581b();
        InstabugSDKLogger.m46622d(this, "Uploading Crash attachments");
        b[37] = true;
        ArrayList b2 = mo34206b(context, crash);
        b[38] = true;
        C13787e a = m44579a(crash, callbacks);
        b[39] = true;
        C5923b0.m26115a((Iterable<? extends C5926g0<? extends T>>) b2, 1).mo23893a((C12280i0<? super T>) a);
        b[40] = true;
    }

    /* renamed from: c */
    public void mo34209c(Context context, Crash crash, Callbacks<Boolean, Crash> callbacks) {
        boolean[] b = m44581b();
        try {
            Request c = mo34208c(context, crash);
            b[61] = true;
            C13787e b2 = m44580b(crash, callbacks);
            b[62] = true;
            this.f25202a.doRequest(c).mo23893a((C12280i0<? super T>) b2);
            b[63] = true;
        } catch (JSONException e) {
            b[64] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("uploading crash logs got Json error: ");
            sb.append(e.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            b[65] = true;
            callbacks.onFailed(crash);
            b[66] = true;
        }
        b[67] = true;
    }

    /* renamed from: a */
    public void mo34205a(Context context, Crash crash, Callbacks<String, Throwable> callbacks) throws JSONException {
        boolean[] b = m44581b();
        StringBuilder sb = new StringBuilder();
        sb.append("Reporting crash with crash message: ");
        sb.append(crash.mo34185c());
        InstabugSDKLogger.m46622d(this, sb.toString());
        b[6] = true;
        Request a = mo34202a(context, crash);
        b[7] = true;
        C13787e a2 = mo34204a(callbacks);
        b[8] = true;
        this.f25202a.doRequest(a).mo23893a((C12280i0<? super T>) a2);
        b[9] = true;
    }

    @C0193h0
    @C0224v0
    /* renamed from: b */
    public ArrayList<C5923b0<RequestResponse>> mo34206b(Context context, Crash crash) throws JSONException {
        boolean[] b = m44581b();
        b[42] = true;
        ArrayList<C5923b0<RequestResponse>> arrayList = new ArrayList<>(crash.mo34186d().size());
        b[43] = true;
        b[44] = true;
        int i = 0;
        while (i < crash.mo34186d().size()) {
            b[45] = true;
            Attachment attachment = (Attachment) crash.mo34186d().get(i);
            b[46] = true;
            Request a = mo34203a(context, crash, attachment);
            b[47] = true;
            arrayList.add(this.f25202a.doRequest(a));
            i++;
            b[48] = true;
        }
        b[49] = true;
        return arrayList;
    }

    @C0193h0
    @C0224v0
    /* renamed from: a */
    public Request mo34202a(Context context, Crash crash) throws JSONException {
        boolean[] b = m44581b();
        Request buildRequest = this.f25202a.buildRequest(context, Endpoint.ReportCrash, RequestMethod.Post);
        b[10] = true;
        if (crash.mo34185c() == null) {
            b[11] = true;
        } else if (!crash.mo34185c().contains("InstabugSDK-v: ")) {
            b[12] = true;
        } else {
            b[13] = true;
            buildRequest.mo35536b(NetworkManager.APP_TOKEN, "b1a9630002b2cbdfbfecd942744b9018");
            b[14] = true;
        }
        ArrayList stateItems = crash.mo34187e().getStateItems();
        b[15] = true;
        if (stateItems == null) {
            b[16] = true;
        } else if (stateItems.size() <= 0) {
            b[17] = true;
        } else {
            b[18] = true;
            int i = 0;
            b[19] = true;
            while (i < stateItems.size()) {
                b[21] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Crash State Key: ");
                sb.append(((StateItem) stateItems.get(i)).getKey());
                sb.append(", Crash State value: ");
                b[22] = true;
                sb.append(((StateItem) stateItems.get(i)).getValue());
                String sb2 = sb.toString();
                b[23] = true;
                InstabugSDKLogger.m46622d(this, sb2);
                b[24] = true;
                String key = ((StateItem) stateItems.get(i)).getKey();
                b[25] = true;
                Object value = ((StateItem) stateItems.get(i)).getValue();
                b[26] = true;
                buildRequest.mo35536b(key, value);
                i++;
                b[27] = true;
            }
            b[20] = true;
        }
        buildRequest.mo35536b("title", crash.mo34185c());
        b[28] = true;
        buildRequest.mo35536b(CrashEntry.COLUMN_HANDLED, Boolean.valueOf(crash.mo34190g()));
        b[29] = true;
        if (crash.mo34186d() == null) {
            b[30] = true;
        } else if (crash.mo34186d().size() <= 0) {
            b[31] = true;
        } else {
            b[32] = true;
            int size = crash.mo34186d().size();
            b[33] = true;
            buildRequest.mo35536b("attachments_count", Integer.valueOf(size));
            b[34] = true;
        }
        b[35] = true;
        return buildRequest;
    }

    @C0193h0
    @C0224v0
    /* renamed from: c */
    public Request mo34208c(Context context, Crash crash) throws JSONException {
        boolean[] b = m44581b();
        Request buildRequest = this.f25202a.buildRequest(context, Endpoint.crashLogs, RequestMethod.Post);
        b[69] = true;
        String d = buildRequest.mo35539d();
        b[70] = true;
        String b2 = crash.mo34183b();
        b[71] = true;
        buildRequest.mo35535b(d.replaceAll(":crash_token", b2));
        b[72] = true;
        ArrayList logsItems = crash.mo34187e().getLogsItems();
        b[73] = true;
        if (logsItems == null) {
            b[74] = true;
        } else if (logsItems.size() <= 0) {
            b[75] = true;
        } else {
            b[76] = true;
            Iterator it = logsItems.iterator();
            b[77] = true;
            while (it.hasNext()) {
                StateItem stateItem = (StateItem) it.next();
                b[79] = true;
                buildRequest.mo35536b(stateItem.getKey(), stateItem.getValue());
                b[80] = true;
            }
            b[78] = true;
        }
        b[81] = true;
        return buildRequest;
    }

    @C0193h0
    /* renamed from: b */
    private C13787e<RequestResponse> m44580b(Crash crash, Callbacks<Boolean, Crash> callbacks) {
        boolean[] b = m44581b();
        C9523c cVar = new C9523c(this, callbacks, crash);
        b[68] = true;
        return cVar;
    }

    @C0193h0
    /* renamed from: a */
    public C13787e<RequestResponse> mo34204a(Callbacks<String, Throwable> callbacks) {
        boolean[] b = m44581b();
        C9521a aVar = new C9521a(this, callbacks);
        b[36] = true;
        return aVar;
    }

    @C0193h0
    /* renamed from: a */
    private C13787e<RequestResponse> m44579a(Crash crash, Callbacks<Boolean, Crash> callbacks) {
        boolean[] b = m44581b();
        C9522b bVar = new C9522b(this, crash, callbacks);
        b[41] = true;
        return bVar;
    }

    @C0193h0
    @C0224v0
    /* renamed from: a */
    public Request mo34203a(Context context, Crash crash, Attachment attachment) throws JSONException {
        boolean[] b = m44581b();
        Request buildRequest = this.f25202a.buildRequest(context, Endpoint.AddCrashAttachment, RequestMethod.Post, RequestType.MULTI_PART);
        b[50] = true;
        String replaceAll = buildRequest.mo35539d().replaceAll(":crash_token", crash.mo34183b());
        b[51] = true;
        buildRequest.mo35535b(replaceAll);
        b[52] = true;
        buildRequest.mo35528a("metadata[file_type]", attachment.getType());
        b[53] = true;
        if (attachment.getType() != Type.AUDIO) {
            b[54] = true;
        } else {
            b[55] = true;
            String duration = attachment.getDuration();
            b[56] = true;
            buildRequest.mo35528a("metadata[duration]", duration);
            b[57] = true;
        }
        b[58] = true;
        FileToUpload fileToUpload = new FileToUpload(UriUtil.LOCAL_FILE_SCHEME, attachment.getName(), attachment.getLocalPath(), attachment.getFileType());
        b[59] = true;
        buildRequest.mo35526a(fileToUpload);
        b[60] = true;
        return buildRequest;
    }
}
