package p212io.branch.referral;

import android.os.AsyncTask;
import android.os.Build.VERSION;

/* renamed from: io.branch.referral.f */
/* compiled from: BranchAsyncTask */
public abstract class C14126f<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    /* renamed from: a */
    public AsyncTask<Params, Progress, Result> mo44642a(Params... paramsArr) {
        if (VERSION.SDK_INT < 11) {
            return execute(paramsArr);
        }
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        } catch (Throwable unused) {
            return execute(paramsArr);
        }
    }
}
