package p212io.fabric.sdk.android;

import p212io.fabric.sdk.android.p493p.p495b.C14278y;
import p212io.fabric.sdk.android.services.concurrency.C14349f;
import p212io.fabric.sdk.android.services.concurrency.C14350g;
import p212io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: io.fabric.sdk.android.h */
/* compiled from: InitializationTask */
class C14224h<Result> extends C14350g<Void, Void, Result> {

    /* renamed from: f0 */
    private static final String f41959f0 = "KitInitialization";

    /* renamed from: e0 */
    final C14225i<Result> f41960e0;

    public C14224h(C14225i<Result> iVar) {
        this.f41960e0 = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45092b(Result result) {
        this.f41960e0.onPostExecute(result);
        this.f41960e0.initializationCallback.mo45068a(result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo45093e() {
        super.mo45093e();
        C14278y a = m61711a("onPreExecute");
        try {
            boolean onPreExecute = this.f41960e0.onPreExecute();
            a.mo45199c();
            if (onPreExecute) {
                return;
            }
        } catch (UnmetDependencyException e) {
            throw e;
        } catch (Exception e2) {
            C14215d.m61672j().mo45045e(C14215d.f41919m, "Failure onPreExecute()", e2);
            a.mo45199c();
        } catch (Throwable th) {
            a.mo45199c();
            mo45284a(true);
            throw th;
        }
        mo45284a(true);
    }

    public C14349f getPriority() {
        return C14349f.HIGH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Result mo45089a(Void... voidArr) {
        C14278y a = m61711a("doInBackground");
        Result doInBackground = !mo45288c() ? this.f41960e0.doInBackground() : null;
        a.mo45199c();
        return doInBackground;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45091a(Result result) {
        this.f41960e0.onCancelled(result);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41960e0.getIdentifier());
        sb.append(" Initialization was cancelled");
        this.f41960e0.initializationCallback.mo45067a((Exception) new InitializationException(sb.toString()));
    }

    /* renamed from: a */
    private C14278y m61711a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41960e0.getIdentifier());
        sb.append(".");
        sb.append(str);
        C14278y yVar = new C14278y(sb.toString(), f41959f0);
        yVar.mo45198b();
        return yVar;
    }
}
