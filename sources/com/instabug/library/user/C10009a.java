package com.instabug.library.user;

import android.content.Context;
import android.util.Patterns;
import androidx.annotation.C0193h0;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.User;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.core.plugin.C9789a;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.p394a.C9962c;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.C10022c;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.UUID;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.user.a */
/* compiled from: UserManager */
public class C10009a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26630a;

    /* renamed from: com.instabug.library.user.a$a */
    /* compiled from: UserManager */
    static class C10010a implements Callbacks<String, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26631c;

        /* renamed from: a */
        final /* synthetic */ String f26632a;

        /* renamed from: b */
        final /* synthetic */ Context f26633b;

        C10010a(String str, Context context) {
            boolean[] a = m46609a();
            this.f26632a = str;
            this.f26633b = context;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46609a() {
            boolean[] zArr = f26631c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6327779015004935671L, "com/instabug/library/user/UserManager$1", 7);
            f26631c = a;
            return a;
        }

        /* renamed from: a */
        public void mo35985a(String str) {
            boolean[] a = m46609a();
            C10009a.m46604h();
            a[1] = true;
            C10009a.m46592a(this.f26632a, this.f26633b);
            a[2] = true;
            SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(false);
            a[3] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m46609a();
            mo35986a((Throwable) obj);
            a[5] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m46609a();
            mo35985a((String) obj);
            a[6] = true;
        }

        /* renamed from: a */
        public void mo35986a(Throwable th) {
            boolean[] a = m46609a();
            SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(true);
            a[4] = true;
        }
    }

    private C10009a() {
        m46608l()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m46592a(String str, Context context) {
        boolean[] l = m46608l();
        m46595b(str, context);
        l[94] = true;
    }

    /* renamed from: b */
    private static void m46595b(String str, Context context) {
        boolean[] l = m46608l();
        SDKCoreEventPublisher.post(new SDKCoreEvent("user", User.VALUE_LOGGED_IN));
        l[45] = true;
        SettingsManager.getInstance().setUserLoggedOut(false);
        l[46] = true;
        SettingsManager.getInstance().setMD5Uuid(str);
        l[47] = true;
        CacheManager.getInstance().invalidateAllCachesForIdentifyingUsers();
        l[48] = true;
    }

    /* renamed from: c */
    public static String m46596c() {
        boolean[] l = m46608l();
        String identifiedUsername = SettingsManager.getInstance().getIdentifiedUsername();
        l[56] = true;
        if (!identifiedUsername.isEmpty()) {
            l[57] = true;
        } else {
            l[58] = true;
            identifiedUsername = SettingsManager.getInstance().getEnteredUsername();
            l[59] = true;
        }
        l[60] = true;
        return identifiedUsername;
    }

    /* renamed from: d */
    public static String m46598d() {
        boolean[] l = m46608l();
        String enteredUsername = SettingsManager.getInstance().getEnteredUsername();
        l[62] = true;
        return enteredUsername;
    }

    /* renamed from: e */
    public static String m46600e() {
        boolean[] l = m46608l();
        String enteredEmail = SettingsManager.getInstance().getEnteredEmail();
        l[64] = true;
        return enteredEmail;
    }

    /* renamed from: f */
    public static String m46602f() {
        boolean[] l = m46608l();
        String mD5Uuid = SettingsManager.getInstance().getMD5Uuid();
        l[78] = true;
        if (mD5Uuid == null) {
            l[79] = true;
        } else if (!mD5Uuid.isEmpty()) {
            l[80] = true;
            l[88] = true;
            return mD5Uuid;
        } else {
            l[81] = true;
        }
        mD5Uuid = SettingsManager.getInstance().getUuid();
        l[82] = true;
        if (mD5Uuid == null) {
            l[83] = true;
        } else if (!mD5Uuid.isEmpty()) {
            l[84] = true;
            l[88] = true;
            return mD5Uuid;
        } else {
            l[85] = true;
        }
        mD5Uuid = UUID.randomUUID().toString();
        l[86] = true;
        SettingsManager.getInstance().setUuid(mD5Uuid);
        l[87] = true;
        l[88] = true;
        return mD5Uuid;
    }

    /* renamed from: g */
    public static void m46603g() {
        boolean[] l = m46608l();
        if (!SettingsManager.getInstance().shouldMakeUUIDMigrationRequest()) {
            l[89] = true;
        } else {
            l[90] = true;
            m46589a(Instabug.getApplicationContext());
            l[91] = true;
        }
        l[92] = true;
    }

    /* renamed from: h */
    static /* synthetic */ void m46604h() {
        boolean[] l = m46608l();
        m46605i();
        l[93] = true;
    }

    /* renamed from: i */
    private static void m46605i() {
        boolean[] l = m46608l();
        SettingsManager.getInstance().setLastContactedAt(0);
        l[29] = true;
        CacheManager.getInstance().invalidateAllCachesForIdentifyingUsers();
        l[30] = true;
    }

    /* renamed from: j */
    private static boolean m46606j() {
        boolean[] l = m46608l();
        boolean isUserLoggedOut = SettingsManager.getInstance().isUserLoggedOut();
        l[49] = true;
        return isUserLoggedOut;
    }

    /* renamed from: k */
    private static boolean m46607k() {
        boolean z;
        boolean[] l = m46608l();
        if (C9789a.m45661b() != 0) {
            l[75] = true;
            z = true;
        } else {
            z = false;
            l[76] = true;
        }
        l[77] = true;
        return z;
    }

    /* renamed from: l */
    private static /* synthetic */ boolean[] m46608l() {
        boolean[] zArr = f26630a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1699096091474171916L, "com/instabug/library/user/UserManager", 95);
        f26630a = a;
        return a;
    }

    /* renamed from: a */
    public static void m46589a(Context context) {
        boolean[] l = m46608l();
        String mD5Uuid = SettingsManager.getInstance().getMD5Uuid();
        l[1] = true;
        if (!m46607k()) {
            l[2] = true;
        } else if (!m46606j()) {
            l[3] = true;
        } else {
            l[4] = true;
            SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(true);
            try {
                l[5] = true;
                String uuid = SettingsManager.getInstance().getUuid();
                if (uuid != null) {
                    l[6] = true;
                    C9962c.m46348a().mo35564a(context, uuid, mD5Uuid, new C10010a(mD5Uuid, context));
                    l[8] = true;
                    l[13] = true;
                }
                l[7] = true;
                return;
            } catch (JSONException e) {
                l[9] = true;
                InstabugSDKLogger.m46624e(C10009a.class, "Something went wrong while do UUID migration request", e);
                l[10] = true;
            }
        }
        m46605i();
        l[11] = true;
        m46595b(mD5Uuid, context);
        l[12] = true;
        l[13] = true;
    }

    /* renamed from: d */
    public static void m46599d(@C0193h0 String str) {
        Class<C10009a> cls = C10009a.class;
        boolean[] l = m46608l();
        SettingsManager.getInstance().setIdentifiedUserEmail(str);
        l[65] = true;
        if ("".equals(str)) {
            l[66] = true;
            InstabugSDKLogger.m46622d(cls, "Email set to empty string, enabling user input of email");
            l[67] = true;
            return;
        }
        if (Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            l[68] = true;
        } else {
            l[69] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid email ");
            sb.append(str);
            sb.append(" passed to setIdentifiedUserEmail, ignoring.");
            InstabugSDKLogger.m46627w(cls, sb.toString());
            l[70] = true;
        }
        l[71] = true;
    }

    /* renamed from: e */
    private static String m46601e(@C0193h0 String str) {
        boolean[] l = m46608l();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        l[72] = true;
        sb.append(SettingsManager.getInstance().getAppToken());
        String sb2 = sb.toString();
        l[73] = true;
        String a = C10022c.m46633a(sb2);
        l[74] = true;
        return a;
    }

    /* renamed from: c */
    public static void m46597c(String str) {
        boolean[] l = m46608l();
        SettingsManager.getInstance().setEnteredEmail(str);
        l[63] = true;
    }

    @C0193h0
    /* renamed from: b */
    public static String m46593b() throws IllegalStateException {
        boolean[] l = m46608l();
        String identifiedUserEmail = SettingsManager.getInstance().getIdentifiedUserEmail();
        l[50] = true;
        if (!identifiedUserEmail.isEmpty()) {
            l[51] = true;
        } else {
            l[52] = true;
            identifiedUserEmail = SettingsManager.getInstance().getEnteredEmail();
            l[53] = true;
        }
        l[54] = true;
        return identifiedUserEmail;
    }

    /* renamed from: b */
    public static void m46594b(String str) {
        boolean[] l = m46608l();
        SettingsManager.getInstance().setEnteredUsername(str);
        l[61] = true;
    }

    /* renamed from: a */
    public static void m46590a(Context context, String str, String str2) {
        boolean[] l = m46608l();
        if (str == null) {
            l[14] = true;
        } else if (str.isEmpty()) {
            l[15] = true;
        } else if (str2 == null) {
            l[16] = true;
        } else if (str2.isEmpty()) {
            l[17] = true;
        } else {
            String identifiedUserEmail = SettingsManager.getInstance().getIdentifiedUserEmail();
            l[19] = true;
            if (identifiedUserEmail.equals(str2)) {
                l[20] = true;
            } else {
                l[21] = true;
                m46599d(str2);
                l[22] = true;
                m46591a(str);
                l[23] = true;
                m46594b(str);
                l[24] = true;
                m46597c(str2);
                l[25] = true;
                SettingsManager.getInstance().setMD5Uuid(m46601e(str2));
                l[26] = true;
                m46589a(context);
                l[27] = true;
            }
            l[28] = true;
            return;
        }
        InstabugSDKLogger.m46627w(C10009a.class, "Empty username or email");
        l[18] = true;
    }

    /* renamed from: a */
    public static void m46588a() {
        boolean[] l = m46608l();
        String str = "";
        m46597c(str);
        l[31] = true;
        m46594b(str);
        l[32] = true;
        if (SettingsManager.getInstance().getIdentifiedUserEmail().isEmpty()) {
            l[33] = true;
        } else {
            l[34] = true;
            if (SettingsManager.getInstance().getIdentifiedUsername().isEmpty()) {
                l[35] = true;
            } else {
                SDKCoreEventPublisher.post(new SDKCoreEvent("user", User.VALUE_LOGGED_OUT));
                l[37] = true;
                SettingsManager.getInstance().setUserLoggedOut(true);
                l[38] = true;
                SettingsManager.getInstance().setUuid(null);
                l[39] = true;
                SettingsManager.getInstance().setMD5Uuid(null);
                l[40] = true;
                m46599d(str);
                l[41] = true;
                m46591a(str);
                l[42] = true;
                SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(false);
                l[43] = true;
                m46605i();
                l[44] = true;
                return;
            }
        }
        l[36] = true;
    }

    /* renamed from: a */
    public static void m46591a(@C0193h0 String str) {
        boolean[] l = m46608l();
        SettingsManager.getInstance().setIdentifiedUsername(str);
        l[55] = true;
    }
}
