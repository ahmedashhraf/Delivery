package com.instabug.library.network;

import android.content.Context;
import android.os.AsyncTask;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public abstract class BaseNetworkTask {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private Context context;
    private C9955a taskProcessor;

    /* renamed from: com.instabug.library.network.BaseNetworkTask$a */
    final class C9955a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26465b;

        /* renamed from: a */
        final /* synthetic */ BaseNetworkTask f26466a;

        C9955a(BaseNetworkTask baseNetworkTask) {
            boolean[] a = m46304a();
            this.f26466a = baseNetworkTask;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46304a() {
            boolean[] zArr = f26465b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1005554883927287036L, "com/instabug/library/network/BaseNetworkTask$TaskProcessor", 18);
            f26465b = a;
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void mo35508a(Void... voidArr) {
            boolean[] a = m46304a();
            StringBuilder sb = new StringBuilder();
            sb.append(C9955a.class.getSimpleName());
            sb.append(" started network task ");
            InstabugSDKLogger.m46626v(this, sb.toString());
            a[1] = true;
            if (!NetworkManager.isOnline(BaseNetworkTask.access$000(this.f26466a))) {
                a[2] = true;
            } else {
                a[3] = true;
                InstabugSDKLogger.m46626v(this, "Internet is good to go");
                try {
                    a[4] = true;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Starting ");
                    sb2.append(getClass().getSimpleName());
                    sb2.append(" task");
                    InstabugSDKLogger.m46626v(this, sb2.toString());
                    a[5] = true;
                    this.f26466a.onHandleTask();
                    a[6] = true;
                } catch (Exception e) {
                    a[7] = true;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("An error occurred while doing ");
                    sb3.append(C9955a.class.getSimpleName());
                    sb3.append("'s required task ");
                    sb3.append(e.getMessage());
                    InstabugSDKLogger.m46624e(this, sb3.toString(), e);
                    a[8] = true;
                }
            }
            a[9] = true;
            return null;
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ Object doInBackground(Object[] objArr) {
            boolean[] a = m46304a();
            Void a2 = mo35508a((Void[]) objArr);
            a[17] = true;
            return a2;
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            boolean[] a = m46304a();
            super.onCancelled();
            a[13] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(C9955a.class.getSimpleName());
            sb.append(" cancelled");
            InstabugSDKLogger.m46626v(this, sb.toString());
            a[14] = true;
            this.f26466a.onTaskCancelled();
            a[15] = true;
        }

        /* access modifiers changed from: protected */
        public /* synthetic */ void onPostExecute(Object obj) {
            boolean[] a = m46304a();
            mo35509a((Void) obj);
            a[16] = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo35509a(Void voidR) {
            boolean[] a = m46304a();
            super.onPostExecute(voidR);
            a[10] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(C9955a.class.getSimpleName());
            sb.append(" finished");
            InstabugSDKLogger.m46626v(this, sb.toString());
            a[11] = true;
            this.f26466a.onTaskFinished();
            a[12] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-532819542869489534L, "com/instabug/library/network/BaseNetworkTask", 7);
        $jacocoData = a;
        return a;
    }

    public BaseNetworkTask(Context context2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.context = context2;
        if (this.taskProcessor != null) {
            $jacocoInit[0] = true;
        } else {
            $jacocoInit[1] = true;
            this.taskProcessor = new C9955a(this);
            $jacocoInit[2] = true;
            this.taskProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            $jacocoInit[3] = true;
        }
        $jacocoInit[4] = true;
    }

    static /* synthetic */ Context access$000(BaseNetworkTask baseNetworkTask) {
        boolean[] $jacocoInit = $jacocoInit();
        Context context2 = baseNetworkTask.context;
        $jacocoInit[6] = true;
        return context2;
    }

    public Context getContext() {
        boolean[] $jacocoInit = $jacocoInit();
        Context context2 = this.context;
        $jacocoInit[5] = true;
        return context2;
    }

    public abstract void onHandleTask() throws Exception;

    public abstract void onTaskCancelled();

    public abstract void onTaskFinished();
}
