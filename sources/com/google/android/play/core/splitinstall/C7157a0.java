package com.google.android.play.core.splitinstall;

/* renamed from: com.google.android.play.core.splitinstall.a0 */
final class C7157a0 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ int f20266N;

    /* renamed from: O */
    private final /* synthetic */ C5772b0 f20267O;

    /* renamed from: a */
    private final /* synthetic */ SplitInstallSessionState f20268a;

    /* renamed from: b */
    private final /* synthetic */ int f20269b;

    C7157a0(C5772b0 b0Var, SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.f20267O = b0Var;
        this.f20268a = splitInstallSessionState;
        this.f20269b = i;
        this.f20266N = i2;
    }

    public final void run() {
        C5772b0 b0Var = this.f20267O;
        SplitInstallSessionState splitInstallSessionState = this.f20268a;
        C7166f fVar = new C7166f(splitInstallSessionState.sessionId(), this.f20269b, this.f20266N, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.mo28562a(), splitInstallSessionState.mo28563b(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.mo28565c());
        b0Var.mo10355a(fVar);
    }
}
