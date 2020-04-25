package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.io.File;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14251j.C14252a;
import p212io.fabric.sdk.android.p493p.p495b.C14251j.C14253b;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p495b.C14264r;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p498e.C14323r;
import p212io.fabric.sdk.android.p493p.p498e.C14329u;

public class Answers extends C14225i<Boolean> {
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final String TAG = "Answers";
    SessionAnalyticsManager analyticsManager;
    boolean firebaseEnabled = false;

    public static Answers getInstance() {
        return (Answers) C14215d.m61662a(Answers.class);
    }

    private void logFirebaseModeEnabledWarning(String str) {
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" is not supported when using Crashlytics through Firebase.");
        j.mo45051w(TAG, sb.toString());
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    /* access modifiers changed from: 0000 */
    public String getOverridenSpiEndpoint() {
        return C14248i.m61822b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }

    public String getVersion() {
        return "1.4.7.32";
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        if (addToCartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(addToCartEvent);
            }
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        if (contentViewEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(contentViewEvent);
            }
        }
    }

    public void logCustom(CustomEvent customEvent) {
        if (customEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onCustom(customEvent);
            }
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        if (inviteEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(inviteEvent);
            }
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        if (levelEndEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(levelEndEvent);
            }
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        if (levelStartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(levelStartEvent);
            }
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        if (loginEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(loginEvent);
            }
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        if (purchaseEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(purchaseEvent);
            }
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        if (ratingEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(ratingEvent);
            }
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        if (searchEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(searchEvent);
            }
        }
    }

    public void logShare(ShareEvent shareEvent) {
        if (shareEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(shareEvent);
            }
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        if (signUpEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(signUpEvent);
            }
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        if (startCheckoutEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(startCheckoutEvent);
            }
        }
    }

    public void onException(C14253b bVar) {
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onError(bVar.mo45144b());
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public boolean onPreExecute() {
        long lastModified;
        try {
            Context context = getContext();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? C14265s.f42076o : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                lastModified = packageInfo.firstInstallTime;
            } else {
                lastModified = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.analyticsManager = SessionAnalyticsManager.build(this, context, getIdManager(), num, str, lastModified);
            this.analyticsManager.enable();
            this.firebaseEnabled = new C14264r().mo45158e(context);
            return true;
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(TAG, "Error retrieving app properties", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground() {
        String str = TAG;
        boolean a = C14255l.m61854a(getContext()).mo45147a();
        Boolean valueOf = Boolean.valueOf(false);
        if (!a) {
            C14215d.m61672j().mo45042d(C14215d.f41919m, "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.analyticsManager.disable();
            return valueOf;
        }
        try {
            C14329u a2 = C14323r.m62045e().mo45273a();
            if (a2 == null) {
                C14215d.m61672j().mo45044e(str, "Failed to retrieve settings");
                return valueOf;
            } else if (a2.f42270d.f42240d) {
                C14215d.m61672j().mo45042d(str, "Analytics collection enabled");
                this.analyticsManager.setAnalyticsSettingsData(a2.f42271e, getOverridenSpiEndpoint());
                return Boolean.valueOf(true);
            } else {
                C14215d.m61672j().mo45042d(str, "Analytics collection disabled");
                this.analyticsManager.disable();
                return valueOf;
            }
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(str, "Error dealing with settings", e);
            return valueOf;
        }
    }

    public void onException(C14252a aVar) {
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onCrash(aVar.mo45144b(), aVar.mo45143a());
        }
    }
}
