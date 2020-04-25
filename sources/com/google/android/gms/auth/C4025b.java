package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.C4300a0;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.google.android.gms.auth.b */
public final class C4025b extends C4041h {

    /* renamed from: m */
    public static final String f12706m = "com.google";

    /* renamed from: n */
    public static final String f12707n = "com.google.work";

    /* renamed from: o */
    public static final String f12708o = "suppressProgressScreen";

    /* renamed from: p */
    private static final String f12709p = C4041h.f12724e;

    /* renamed from: q */
    private static final String f12710q = C4041h.f12725f;

    /* renamed from: r */
    public static final int f12711r = 1;

    /* renamed from: s */
    public static final int f12712s = 2;

    /* renamed from: t */
    public static final int f12713t = 3;

    /* renamed from: u */
    public static final int f12714u = 4;

    private C4025b() {
    }

    @Deprecated
    /* renamed from: a */
    public static String m17457a(Context context, String str, String str2, Bundle bundle, Intent intent) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return m17453a(context, new Account(str, "com.google"), str2, bundle, intent);
    }

    @Deprecated
    /* renamed from: b */
    public static String m17462b(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return m17463c(context, new Account(str, "com.google"), str2, bundle);
    }

    /* renamed from: c */
    public static String m17463c(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return m17465d(context, account, str, bundle).mo17293i();
    }

    /* renamed from: d */
    private static TokenData m17465d(Context context, Account account, String str, Bundle bundle) throws IOException, GoogleAuthException {
        String str2 = "User intervention required. Notification has been pushed.";
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            TokenData b = C4041h.m17501b(context, account, str, bundle);
            C4284g.cancelAvailabilityErrorNotifications(context);
            return b;
        } catch (GooglePlayServicesAvailabilityException e) {
            GooglePlayServicesUtil.showErrorNotification(e.mo17290d(), context);
            throw new UserRecoverableNotifiedException(str2);
        } catch (UserRecoverableAuthException unused) {
            C4284g.cancelAvailabilityErrorNotifications(context);
            throw new UserRecoverableNotifiedException(str2);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m17458a(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        return m17454a(context, new Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    /* renamed from: b */
    public static String m17461b(Context context, String str) throws GoogleAuthException, IOException {
        return C4041h.m17503b(context, str);
    }

    /* renamed from: a */
    public static String m17453a(Context context, Account account, String str, Bundle bundle, Intent intent) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (intent != null) {
            try {
                Intent.parseUri(intent.toUri(1), 1);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putParcelable("callback_intent", intent);
                bundle.putBoolean("handle_notification", true);
                return m17465d(context, account, str, bundle).mo17293i();
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
            }
        } else {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
    }

    @Deprecated
    @C0203m0("android.permission.MANAGE_ACCOUNTS")
    /* renamed from: c */
    public static void m17464c(Context context, String str) {
        C4041h.m17504c(context, str);
    }

    /* renamed from: a */
    public static String m17454a(Context context, Account account, String str, Bundle bundle, String str2, Bundle bundle2) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        C4300a0.m18622a(str2, (Object) "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return m17465d(context, account, str, bundle).mo17293i();
    }

    @Deprecated
    /* renamed from: a */
    public static String m17455a(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return C4041h.m17495a(context, str, str2);
    }

    @Deprecated
    /* renamed from: a */
    public static String m17456a(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return C4041h.m17496a(context, str, str2, bundle);
    }

    /* renamed from: a */
    public static String m17451a(Context context, Account account, String str) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return C4041h.m17493a(context, account, str);
    }

    /* renamed from: a */
    public static String m17452a(Context context, Account account, String str, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return C4041h.m17494a(context, account, str, bundle);
    }

    /* renamed from: a */
    public static void m17460a(Context context, String str) throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException {
        C4041h.m17500a(context, str);
    }

    /* renamed from: a */
    public static List<AccountChangeEvent> m17459a(Context context, int i, String str) throws GoogleAuthException, IOException {
        return C4041h.m17497a(context, i, str);
    }

    @TargetApi(23)
    /* renamed from: a */
    public static Bundle m17449a(Context context, Account account) throws GoogleAuthException, IOException {
        return C4041h.m17488a(context, account);
    }

    @TargetApi(26)
    /* renamed from: a */
    public static Boolean m17450a(Context context) throws GoogleAuthException, IOException {
        return C4041h.m17490a(context);
    }
}
