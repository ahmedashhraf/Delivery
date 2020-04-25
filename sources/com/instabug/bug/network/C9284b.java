package com.instabug.bug.network;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0224v0;
import com.facebook.common.util.UriUtil;
import com.instabug.bug.model.Bug;
import com.instabug.bug.settings.C9291a;
import com.instabug.library.broadcast.LastContactedChangedBroadcast;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
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
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p072g.p073b.C2128a;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.network.b */
/* compiled from: BugsService */
public class C9284b {

    /* renamed from: c */
    private static C9284b f24572c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f24573d;

    /* renamed from: a */
    private NetworkManager f24574a = new NetworkManager();
    @C0224v0

    /* renamed from: b */
    Request f24575b;

    /* renamed from: com.instabug.bug.network.b$a */
    /* compiled from: BugsService */
    class C9285a extends C13787e<RequestResponse> {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24576P;

        /* renamed from: N */
        final /* synthetic */ Context f24577N;

        /* renamed from: O */
        final /* synthetic */ C9284b f24578O;

        /* renamed from: b */
        final /* synthetic */ Callbacks f24579b;

        C9285a(C9284b bVar, Callbacks callbacks, Context context) {
            boolean[] c = m43449c();
            this.f24578O = bVar;
            this.f24579b = callbacks;
            this.f24577N = context;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43449c() {
            boolean[] zArr = f24576P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5459814197136507714L, "com/instabug/bug/network/BugsService$1", 23);
            f24576P = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m43449c();
            mo33574a((RequestResponse) obj);
            c[22] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m43449c();
            InstabugSDKLogger.m46622d(this, "reportingBugRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m43449c();
            InstabugSDKLogger.m46622d(this, "reportingBugRequest completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m43449c();
            StringBuilder sb = new StringBuilder();
            sb.append("reportingBugRequest got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(this, sb.toString(), th);
            c[3] = true;
            this.f24579b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo33574a(RequestResponse requestResponse) {
            boolean[] c = m43449c();
            StringBuilder sb = new StringBuilder();
            sb.append("reportingBugRequest onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[5] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[6] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            try {
                c[7] = true;
                this.f24579b.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()).getString("id"));
                c[8] = true;
            } catch (JSONException e) {
                c[9] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("reportingBugRequest onNext got error: ");
                sb3.append(e.getMessage());
                InstabugSDKLogger.m46624e(this, sb3.toString(), e);
                c[10] = true;
            }
            if (requestResponse.getResponseCode() != 200) {
                c[11] = true;
            } else {
                c[12] = true;
                Calendar instance = Calendar.getInstance(Locale.ENGLISH);
                c[13] = true;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Updating last_contacted_at to ");
                sb4.append(instance.getTime());
                InstabugSDKLogger.m46622d(this, sb4.toString());
                c[14] = true;
                C9291a.m43476r().mo33593a(instance.getTime().getTime());
                c[15] = true;
                InstabugCore.setLastContactedAt(instance.getTime().getTime());
                c[16] = true;
                Intent intent = new Intent();
                c[17] = true;
                intent.setAction(LastContactedChangedBroadcast.LAST_CONTACTED_CHANGED);
                c[18] = true;
                intent.putExtra(LastContactedChangedBroadcast.LAST_CONTACTED_AT, instance.getTime().getTime());
                c[19] = true;
                C2128a.m11089a(this.f24577N).mo9219a(intent);
                c[20] = true;
            }
            c[21] = true;
        }
    }

    /* renamed from: com.instabug.bug.network.b$b */
    /* compiled from: BugsService */
    class C9286b extends C13787e<RequestResponse> {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24580P;

        /* renamed from: N */
        final /* synthetic */ Callbacks f24581N;

        /* renamed from: O */
        final /* synthetic */ C9284b f24582O;

        /* renamed from: b */
        final /* synthetic */ Bug f24583b;

        C9286b(C9284b bVar, Bug bug, Callbacks callbacks) {
            boolean[] c = m43453c();
            this.f24582O = bVar;
            this.f24583b = bug;
            this.f24581N = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43453c() {
            boolean[] zArr = f24580P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4691479351523478445L, "com/instabug/bug/network/BugsService$2", 22);
            f24580P = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m43453c();
            mo33576a((RequestResponse) obj);
            c[21] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m43453c();
            InstabugSDKLogger.m46622d(this, "uploadingBugAttachmentRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m43453c();
            InstabugSDKLogger.m46622d(this, "uploadingBugAttachmentRequest completed");
            c[2] = true;
            if (this.f24583b.mo33519g().size() != 0) {
                c[3] = true;
            } else {
                c[4] = true;
                this.f24581N.onSucceeded(Boolean.valueOf(true));
                c[5] = true;
            }
            c[6] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m43453c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploadingBugAttachmentRequest got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(this, sb.toString(), th);
            c[7] = true;
            this.f24581N.onFailed(this.f24583b);
            c[8] = true;
        }

        /* renamed from: a */
        public void mo33576a(RequestResponse requestResponse) {
            boolean[] c = m43453c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploadingBugAttachmentRequest onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[9] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[10] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            c[11] = true;
            File file = new File(((Attachment) this.f24583b.mo33519g().get(0)).getLocalPath());
            c[12] = true;
            if (!file.delete()) {
                c[13] = true;
            } else {
                c[14] = true;
                InstabugSDKLogger.m46622d(this, "uploadingBugAttachmentRequest onNext, attachment file deleted successfully");
                c[15] = true;
            }
            Attachment attachment = (Attachment) this.f24583b.mo33519g().remove(0);
            c[16] = true;
            if (attachment.getId() != -1) {
                c[17] = true;
                AttachmentsDbHelper.delete(attachment.getId());
                c[18] = true;
            } else {
                AttachmentsDbHelper.delete(attachment.getName(), this.f24583b.getId());
                c[19] = true;
            }
            c[20] = true;
        }
    }

    /* renamed from: com.instabug.bug.network.b$c */
    /* compiled from: BugsService */
    class C9287c extends C13787e<RequestResponse> {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24584P;

        /* renamed from: N */
        final /* synthetic */ Bug f24585N;

        /* renamed from: O */
        final /* synthetic */ C9284b f24586O;

        /* renamed from: b */
        final /* synthetic */ Callbacks f24587b;

        C9287c(C9284b bVar, Callbacks callbacks, Bug bug) {
            boolean[] c = m43457c();
            this.f24586O = bVar;
            this.f24587b = callbacks;
            this.f24585N = bug;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43457c() {
            boolean[] zArr = f24584P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8597339754864638745L, "com/instabug/bug/network/BugsService$3", 11);
            f24584P = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m43457c();
            mo33577a((RequestResponse) obj);
            c[10] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m43457c();
            InstabugSDKLogger.m46622d(this, "uploading bug logs started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m43457c();
            InstabugSDKLogger.m46622d(this, "uploading bug logs completed");
            c[6] = true;
            this.f24587b.onSucceeded(Boolean.valueOf(true));
            c[7] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m43457c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploading bug logs got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[8] = true;
            this.f24587b.onFailed(this.f24585N);
            c[9] = true;
        }

        /* renamed from: a */
        public void mo33577a(RequestResponse requestResponse) {
            boolean[] c = m43457c();
            StringBuilder sb = new StringBuilder();
            sb.append("uploading bug logs onNext, Response code: ");
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

    private C9284b() {
        boolean[] b = m43440b();
        b[4] = true;
        b[5] = true;
    }

    /* renamed from: a */
    public static C9284b m43439a() {
        boolean[] b = m43440b();
        if (f24572c != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f24572c = new C9284b();
            b[2] = true;
        }
        C9284b bVar = f24572c;
        b[3] = true;
        return bVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43440b() {
        boolean[] zArr = f24573d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(599393020484240377L, "com/instabug/bug/network/BugsService", 62);
        f24573d = a;
        return a;
    }

    /* renamed from: b */
    public void mo33571b(Context context, Bug bug, Callbacks<Boolean, Bug> callbacks) throws JSONException {
        boolean[] b = m43440b();
        InstabugSDKLogger.m46622d(this, "Uploading Bug attachments");
        b[26] = true;
        ArrayList b2 = mo33570b(context, bug);
        b[27] = true;
        C5923b0.m26115a((Iterable<? extends C5926g0<? extends T>>) b2, 1).mo23893a((C12280i0<? super T>) new C9286b<Object>(this, bug, callbacks));
        b[28] = true;
    }

    /* renamed from: c */
    public void mo33573c(Context context, Bug bug, Callbacks<Boolean, Bug> callbacks) {
        boolean[] b = m43440b();
        try {
            Request c = mo33572c(context, bug);
            b[43] = true;
            this.f24574a.doRequest(c).mo23893a((C12280i0<? super T>) new C9287c<Object>(this, callbacks, bug));
            b[44] = true;
        } catch (JSONException e) {
            b[45] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("uploading bug logs got Json error: ");
            sb.append(e.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            b[46] = true;
            callbacks.onFailed(bug);
            b[47] = true;
        }
        b[48] = true;
    }

    /* renamed from: a */
    public void mo33568a(Context context, Bug bug, Callbacks<String, Throwable> callbacks) throws JSONException {
        boolean[] b = m43440b();
        StringBuilder sb = new StringBuilder();
        sb.append("Reporting a bug with message: ");
        sb.append(bug.mo33517f());
        InstabugSDKLogger.m46622d(this, sb.toString());
        b[7] = true;
        this.f24575b = mo33566a(context, bug);
        b[8] = true;
        this.f24574a.doRequest(this.f24575b).mo23893a(mo33567a(context, callbacks));
        b[9] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: b */
    public ArrayList<C5923b0<RequestResponse>> mo33570b(Context context, Bug bug) throws JSONException {
        boolean[] b = m43440b();
        b[29] = true;
        ArrayList<C5923b0<RequestResponse>> arrayList = new ArrayList<>(bug.mo33519g().size());
        b[30] = true;
        b[31] = true;
        int i = 0;
        while (i < bug.mo33519g().size()) {
            b[32] = true;
            Attachment attachment = (Attachment) bug.mo33519g().get(i);
            b[33] = true;
            Request buildRequest = this.f24574a.buildRequest(context, Endpoint.AddBugAttachment, RequestMethod.Post, RequestType.MULTI_PART);
            b[34] = true;
            buildRequest.mo35535b(buildRequest.mo35539d().replaceAll(":bug_token", bug.mo33505a()));
            b[35] = true;
            buildRequest.mo35528a("metadata[file_type]", attachment.getType());
            b[36] = true;
            if (attachment.getType() != Type.AUDIO) {
                b[37] = true;
            } else {
                b[38] = true;
                buildRequest.mo35528a("metadata[duration]", attachment.getDuration());
                b[39] = true;
            }
            buildRequest.mo35526a(new FileToUpload(UriUtil.LOCAL_FILE_SCHEME, attachment.getName(), attachment.getLocalPath(), attachment.getFileType()));
            b[40] = true;
            arrayList.add(this.f24574a.doRequest(buildRequest));
            i++;
            b[41] = true;
        }
        b[42] = true;
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public C12280i0<RequestResponse> mo33567a(Context context, Callbacks<String, Throwable> callbacks) {
        boolean[] b = m43440b();
        C9285a aVar = new C9285a(this, callbacks, context);
        b[10] = true;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public Request mo33572c(Context context, Bug bug) throws JSONException {
        boolean[] b = m43440b();
        Request buildRequest = this.f24574a.buildRequest(context, Endpoint.bugLogs, RequestMethod.Post);
        b[49] = true;
        String d = buildRequest.mo35539d();
        b[50] = true;
        String a = bug.mo33505a();
        b[51] = true;
        buildRequest.mo35535b(d.replaceAll(":bug_token", a));
        b[52] = true;
        ArrayList logsItems = bug.getState().getLogsItems();
        b[53] = true;
        Iterator it = logsItems.iterator();
        b[54] = true;
        while (it.hasNext()) {
            StateItem stateItem = (StateItem) it.next();
            b[55] = true;
            buildRequest.mo35536b(stateItem.getKey(), stateItem.getValue());
            b[56] = true;
        }
        if (bug.mo33524i() == null) {
            b[57] = true;
        } else {
            b[58] = true;
            buildRequest.mo35536b(BugEntry.COLUMN_VIEW_HIERARCHY, bug.mo33524i());
            b[59] = true;
        }
        b[60] = true;
        return buildRequest;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public Request mo33566a(Context context, Bug bug) throws JSONException {
        boolean[] b = m43440b();
        this.f24575b = this.f24574a.buildRequest(context, Endpoint.ReportBug, RequestMethod.Post);
        b[11] = true;
        mo33569a(this.f24575b, bug);
        b[12] = true;
        this.f24575b.mo35536b("title", bug.mo33517f());
        b[13] = true;
        this.f24575b.mo35536b("attachments_count", Integer.valueOf(bug.mo33519g().size()));
        b[14] = true;
        this.f24575b.mo35536b("categories", bug.mo33531p());
        Request request = this.f24575b;
        b[15] = true;
        return request;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo33569a(Request request, Bug bug) throws JSONException {
        boolean[] b = m43440b();
        ArrayList stateItems = bug.getState().getStateItems();
        b[16] = true;
        b[17] = true;
        int i = 0;
        while (i < stateItems.size()) {
            b[18] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Bug State Key: ");
            sb.append(((StateItem) stateItems.get(i)).getKey());
            sb.append(", Bug State value: ");
            b[19] = true;
            sb.append(((StateItem) stateItems.get(i)).getValue());
            String sb2 = sb.toString();
            b[20] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            b[21] = true;
            String key = ((StateItem) bug.getState().getStateItems().get(i)).getKey();
            b[22] = true;
            Object value = ((StateItem) bug.getState().getStateItems().get(i)).getValue();
            b[23] = true;
            request.mo35536b(key, value);
            i++;
            b[24] = true;
        }
        b[25] = true;
    }
}
