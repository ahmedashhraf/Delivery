package com.instabug.bug.network;

import android.content.ContentValues;
import android.content.Context;
import com.instabug.bug.C9238a.C9244f;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.BugState;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
import com.instabug.library.internal.storage.executor.DeleteOperationExecutor;
import com.instabug.library.internal.storage.operation.DeleteStateFileDiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.network.a */
/* compiled from: BugUploaderHelper */
public class C9279a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24559b;

    /* renamed from: a */
    private Context f24560a;

    /* renamed from: com.instabug.bug.network.a$a */
    /* compiled from: BugUploaderHelper */
    class C9280a implements Callbacks<String, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24561c;

        /* renamed from: a */
        final /* synthetic */ Bug f24562a;

        /* renamed from: b */
        final /* synthetic */ C9279a f24563b;

        C9280a(C9279a aVar, Bug bug) {
            boolean[] a = m43428a();
            this.f24563b = aVar;
            this.f24562a = bug;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43428a() {
            boolean[] zArr = f24561c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9173432046152953859L, "com/instabug/bug/network/BugUploaderHelper$1", 12);
            f24561c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33555a(String str) {
            boolean[] a = m43428a();
            C9279a aVar = this.f24563b;
            StringBuilder sb = new StringBuilder();
            sb.append("Bug uploaded successfully, setting bug TemporaryServerToken equal ");
            sb.append(str);
            InstabugSDKLogger.m46622d(aVar, sb.toString());
            a[1] = true;
            this.f24562a.mo33510c(str);
            a[2] = true;
            this.f24562a.mo33499a(BugState.LOGS_READY_TO_BE_UPLOADED);
            a[3] = true;
            ContentValues contentValues = new ContentValues();
            a[4] = true;
            contentValues.put("temporary_server_token", str);
            a[5] = true;
            contentValues.put(BugEntry.COLUMN_BUG_STATE, BugState.LOGS_READY_TO_BE_UPLOADED.name());
            a[6] = true;
            C9244f.m43205a(this.f24562a.getId(), contentValues);
            a[7] = true;
            C9279a.m43423a(this.f24563b, this.f24562a);
            a[8] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m43428a();
            mo33556a((Throwable) obj);
            a[10] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m43428a();
            mo33555a((String) obj);
            a[11] = true;
        }

        /* renamed from: a */
        public void mo33556a(Throwable th) {
            boolean[] a = m43428a();
            InstabugSDKLogger.m46622d(this.f24563b, "Something went wrong while uploading bug");
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.bug.network.a$b */
    /* compiled from: BugUploaderHelper */
    class C9281b implements Callbacks<Boolean, Bug> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24564c;

        /* renamed from: a */
        final /* synthetic */ Bug f24565a;

        /* renamed from: b */
        final /* synthetic */ C9279a f24566b;

        C9281b(C9279a aVar, Bug bug) {
            boolean[] a = m43431a();
            this.f24566b = aVar;
            this.f24565a = bug;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43431a() {
            boolean[] zArr = f24564c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2569904168206904121L, "com/instabug/bug/network/BugUploaderHelper$2", 15);
            f24564c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33560a(Boolean bool) {
            boolean[] a = m43431a();
            InstabugSDKLogger.m46622d(this.f24566b, "Bug logs uploaded successfully, change its state");
            a[1] = true;
            this.f24565a.mo33499a(BugState.ATTACHMENTS_READY_TO_BE_UPLOADED);
            a[2] = true;
            ContentValues contentValues = new ContentValues();
            a[3] = true;
            contentValues.put(BugEntry.COLUMN_BUG_STATE, BugState.ATTACHMENTS_READY_TO_BE_UPLOADED.name());
            a[4] = true;
            C9244f.m43205a(this.f24565a.getId(), contentValues);
            try {
                a[5] = true;
                C9279a.m43425b(this.f24566b, this.f24565a);
                a[6] = true;
            } catch (JSONException e) {
                a[7] = true;
                C9279a aVar = this.f24566b;
                StringBuilder sb = new StringBuilder();
                sb.append("Something went wrong while uploading bug attachments e: ");
                a[8] = true;
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                a[9] = true;
                InstabugSDKLogger.m46623e(aVar, sb2);
                a[10] = true;
            }
            a[11] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m43431a();
            mo33559a((Bug) obj);
            a[13] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m43431a();
            mo33560a((Boolean) obj);
            a[14] = true;
        }

        /* renamed from: a */
        public void mo33559a(Bug bug) {
            boolean[] a = m43431a();
            InstabugSDKLogger.m46622d(this.f24566b, "Something went wrong while uploading bug logs");
            a[12] = true;
        }
    }

    /* renamed from: com.instabug.bug.network.a$c */
    /* compiled from: BugUploaderHelper */
    class C9282c implements Callbacks<Boolean, Bug> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24567c;

        /* renamed from: a */
        final /* synthetic */ Bug f24568a;

        /* renamed from: b */
        final /* synthetic */ C9279a f24569b;

        /* renamed from: com.instabug.bug.network.a$c$a */
        /* compiled from: BugUploaderHelper */
        class C9283a implements DiskOperationCallback<Boolean> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24570b;

            /* renamed from: a */
            final /* synthetic */ C9282c f24571a;

            C9283a(C9282c cVar) {
                boolean[] a = m43437a();
                this.f24571a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43437a() {
                boolean[] zArr = f24570b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(8530700062000722768L, "com/instabug/bug/network/BugUploaderHelper$3$1", 4);
                f24570b = a;
                return a;
            }

            /* renamed from: a */
            public void mo33563a(Boolean bool) {
                boolean[] a = m43437a();
                StringBuilder sb = new StringBuilder();
                sb.append("result: ");
                sb.append(bool);
                InstabugSDKLogger.m46625i(this, sb.toString());
                a[1] = true;
            }

            public void onFailure(Throwable th) {
                boolean[] a = m43437a();
                InstabugSDKLogger.m46624e(this, th.getClass().getSimpleName(), th);
                a[2] = true;
            }

            public /* synthetic */ void onSuccess(Object obj) {
                boolean[] a = m43437a();
                mo33563a((Boolean) obj);
                a[3] = true;
            }
        }

        C9282c(C9279a aVar, Bug bug) {
            boolean[] a = m43434a();
            this.f24569b = aVar;
            this.f24568a = bug;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43434a() {
            boolean[] zArr = f24567c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8927596190852901075L, "com/instabug/bug/network/BugUploaderHelper$3", 10);
            f24567c = a;
            return a;
        }

        /* renamed from: a */
        public void mo33562a(Boolean bool) {
            boolean[] a = m43434a();
            InstabugSDKLogger.m46622d(this.f24569b, "Bug attachments uploaded successfully, deleting bug");
            a[1] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("attempting to delete state file for bug with id: ");
            sb.append(this.f24568a.getId());
            InstabugSDKLogger.m46625i(this, sb.toString());
            a[2] = true;
            DiskUtils with = DiskUtils.with(C9279a.m43421a(this.f24569b));
            Bug bug = this.f24568a;
            a[3] = true;
            DeleteOperationExecutor deleteOperation = with.deleteOperation(new DeleteStateFileDiskOperation(bug.getState().getUri()));
            C9283a aVar = new C9283a(this);
            a[4] = true;
            deleteOperation.executeAsync(aVar);
            a[5] = true;
            C9244f.m43204a(this.f24568a.getId());
            a[6] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m43434a();
            mo33561a((Bug) obj);
            a[8] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m43434a();
            mo33562a((Boolean) obj);
            a[9] = true;
        }

        /* renamed from: a */
        public void mo33561a(Bug bug) {
            boolean[] a = m43434a();
            InstabugSDKLogger.m46622d(this.f24569b, "Something went wrong while uploading bug attachments");
            a[7] = true;
        }
    }

    public C9279a(Context context) {
        boolean[] b = m43426b();
        this.f24560a = context;
        b[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Context m43421a(C9279a aVar) {
        boolean[] b = m43426b();
        Context context = aVar.f24560a;
        b[25] = true;
        return context;
    }

    /* renamed from: b */
    static /* synthetic */ void m43425b(C9279a aVar, Bug bug) throws JSONException {
        boolean[] b = m43426b();
        aVar.m43424b(bug);
        b[24] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43426b() {
        boolean[] zArr = f24559b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1293251655832392119L, "com/instabug/bug/network/BugUploaderHelper", 26);
        f24559b = a;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ void m43423a(C9279a aVar, Bug bug) {
        boolean[] b = m43426b();
        aVar.m43422a(bug);
        b[23] = true;
    }

    /* renamed from: b */
    private void m43424b(Bug bug) throws JSONException {
        boolean[] b = m43426b();
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(bug.mo33519g().size());
        sb.append(" attachments related to bug: ");
        b[19] = true;
        sb.append(bug.mo33517f());
        String sb2 = sb.toString();
        b[20] = true;
        InstabugSDKLogger.m46622d(this, sb2);
        b[21] = true;
        C9284b.m43439a().mo33571b(this.f24560a, bug, new C9282c(this, bug));
        b[22] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33554a() throws IOException, JSONException {
        boolean[] b = m43426b();
        List<Bug> a = C9244f.m43203a(this.f24560a);
        b[1] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(a.size());
        sb.append(" bugs in cache");
        InstabugSDKLogger.m46622d(this, sb.toString());
        b[2] = true;
        b[3] = true;
        for (Bug bug : a) {
            b[4] = true;
            if (bug.mo33522h().equals(BugState.READY_TO_BE_SENT)) {
                b[5] = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Uploading bug: ");
                sb2.append(bug.toString());
                InstabugSDKLogger.m46622d(this, sb2.toString());
                b[6] = true;
                C9284b.m43439a().mo33568a(this.f24560a, bug, new C9280a(this, bug));
                b[7] = true;
            } else {
                String str = "Bug: ";
                if (bug.mo33522h().equals(BugState.LOGS_READY_TO_BE_UPLOADED)) {
                    b[8] = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(bug.toString());
                    sb3.append(" already uploaded but has unsent logs, uploading now");
                    InstabugSDKLogger.m46622d(this, sb3.toString());
                    b[9] = true;
                    m43422a(bug);
                    b[10] = true;
                } else if (!bug.mo33522h().equals(BugState.ATTACHMENTS_READY_TO_BE_UPLOADED)) {
                    b[11] = true;
                } else {
                    b[12] = true;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(bug.toString());
                    sb4.append(" already uploaded but has unsent attachments, uploading now");
                    InstabugSDKLogger.m46622d(this, sb4.toString());
                    b[13] = true;
                    m43424b(bug);
                    b[14] = true;
                }
            }
            b[15] = true;
        }
        b[16] = true;
    }

    /* renamed from: a */
    private void m43422a(Bug bug) {
        boolean[] b = m43426b();
        StringBuilder sb = new StringBuilder();
        sb.append("START uploading all logs related to this bug id = ");
        sb.append(bug.getId());
        InstabugSDKLogger.m46622d(this, sb.toString());
        b[17] = true;
        C9284b.m43439a().mo33573c(this.f24560a, bug, new C9281b(this, bug));
        b[18] = true;
    }
}
