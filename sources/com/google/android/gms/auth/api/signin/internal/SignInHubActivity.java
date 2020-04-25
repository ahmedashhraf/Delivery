package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C1376c;
import androidx.loader.p046a.C1492a.C1493a;
import androidx.loader.p047b.C1502c;
import com.google.android.gms.auth.api.signin.C3985b;
import com.google.android.gms.auth.api.signin.C3991f;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends C1376c {

    /* renamed from: Q */
    private static boolean f12675Q = false;

    /* renamed from: N */
    private boolean f12676N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public int f12677O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public Intent f12678P;

    /* renamed from: a */
    private boolean f12679a = false;

    /* renamed from: b */
    private SignInConfiguration f12680b;

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C3995a implements C1493a<Void> {
        private C3995a() {
        }

        /* renamed from: a */
        public final C1502c<Void> mo6550a(int i, Bundle bundle) {
            return new C4001f(SignInHubActivity.this, C4086i.m17622k());
        }

        /* renamed from: a */
        public final void mo6551a(C1502c<Void> cVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo6552a(C1502c cVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f12677O, SignInHubActivity.this.f12678P);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: C */
    private final void m17367C() {
        getSupportLoaderManager().mo6543a(0, null, new C3995a());
        f12675Q = false;
    }

    /* renamed from: h */
    private final void m17370h(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f12675Q = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f12679a) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    String str = C3985b.f12654a;
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(str);
                    if (signInAccount == null || signInAccount.mo17487N() == null) {
                        String str2 = "errorCode";
                        if (intent.hasExtra(str2)) {
                            int intExtra = intent.getIntExtra(str2, 8);
                            if (intExtra == 13) {
                                intExtra = C3991f.f12667q;
                            }
                            m17370h(intExtra);
                            return;
                        }
                    } else {
                        GoogleSignInAccount N = signInAccount.mo17487N();
                        C4012q.m17427a(this).mo17538a(this.f12680b.mo17511N(), N);
                        intent.removeExtra(str);
                        intent.putExtra("googleSignInAccount", N);
                        this.f12676N = true;
                        this.f12677O = i2;
                        this.f12678P = intent;
                        m17367C();
                        return;
                    }
                }
                m17370h(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m17370h(C3991f.f12666p);
            return;
        }
        String str = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        if (action.equals(str) || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String str2 = "config";
            this.f12680b = (SignInConfiguration) intent.getBundleExtra(str2).getParcelable(str2);
            if (this.f12680b == null) {
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.f12676N = bundle.getBoolean("signingInGoogleApiClients");
                if (this.f12676N) {
                    this.f12677O = bundle.getInt("signInResultCode");
                    this.f12678P = (Intent) bundle.getParcelable("signInResultData");
                    m17367C();
                }
            } else if (f12675Q) {
                setResult(0);
                m17370h(C3991f.f12668r);
            } else {
                f12675Q = true;
                Intent intent2 = new Intent(action);
                if (action.equals(str)) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra(str2, this.f12680b);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f12679a = true;
                    m17370h(17);
                }
            }
        } else {
            String str3 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                new String(str3);
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f12676N);
        if (this.f12676N) {
            bundle.putInt("signInResultCode", this.f12677O);
            bundle.putParcelable("signInResultData", this.f12678P);
        }
    }
}
