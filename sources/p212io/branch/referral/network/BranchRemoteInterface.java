package p212io.branch.referral.network;

import android.content.Context;
import androidx.annotation.C0195i0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14130h;
import p212io.branch.referral.C14152o0;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14204x;
import p212io.branch.referral.C6009d;

/* renamed from: io.branch.referral.network.BranchRemoteInterface */
public abstract class BranchRemoteInterface {

    /* renamed from: a */
    public static final String f41629a = "retryNumber";

    /* renamed from: io.branch.referral.network.BranchRemoteInterface$BranchRemoteException */
    public static class BranchRemoteException extends Exception {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f41630a = C14130h.f41560o;

        public BranchRemoteException(int i) {
            this.f41630a = i;
        }
    }

    /* renamed from: io.branch.referral.network.BranchRemoteInterface$a */
    public static class C14150a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f41631a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f41632b;

        public C14150a(@C0195i0 String str, int i) {
            this.f41631a = str;
            this.f41632b = i;
        }
    }

    /* renamed from: a */
    public abstract C14150a mo44714a(String str) throws BranchRemoteException;

    /* renamed from: a */
    public abstract C14150a mo44715a(String str, JSONObject jSONObject) throws BranchRemoteException;

    /* renamed from: a */
    public final C14152o0 mo44716a(String str, JSONObject jSONObject, String str2, String str3) {
        String str4 = "-";
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!m61221a(jSONObject, str3)) {
            return new C14152o0(str2, C14130h.f41561p);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m61220a(jSONObject));
        String sb2 = sb.toString();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("getting ");
        sb3.append(sb2);
        C14204x.m61509d("BranchSDK", sb3.toString());
        try {
            C14150a a = mo44714a(sb2);
            C14152o0 a2 = m61219a(a.f41631a, a.f41632b, str2);
            if (C6009d.m27463J() != null) {
                int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
                C6009d J = C6009d.m27463J();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(str4);
                sb4.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                J.mo24806d(sb4.toString(), String.valueOf(currentTimeMillis2));
            }
            return a2;
        } catch (BranchRemoteException e) {
            if (e.f41630a == -111) {
                C14152o0 o0Var = new C14152o0(str2, C14130h.f41558m);
                if (C6009d.m27463J() != null) {
                    int currentTimeMillis3 = (int) (System.currentTimeMillis() - currentTimeMillis);
                    C6009d J2 = C6009d.m27463J();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(str4);
                    sb5.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                    J2.mo24806d(sb5.toString(), String.valueOf(currentTimeMillis3));
                }
                return o0Var;
            }
            C14152o0 o0Var2 = new C14152o0(str2, C14130h.f41560o);
            if (C6009d.m27463J() != null) {
                int currentTimeMillis4 = (int) (System.currentTimeMillis() - currentTimeMillis);
                C6009d J3 = C6009d.m27463J();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(str4);
                sb6.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                J3.mo24806d(sb6.toString(), String.valueOf(currentTimeMillis4));
            }
            return o0Var2;
        } catch (Throwable th) {
            if (C6009d.m27463J() != null) {
                int currentTimeMillis5 = (int) (System.currentTimeMillis() - currentTimeMillis);
                C6009d J4 = C6009d.m27463J();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(str4);
                sb7.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                J4.mo24806d(sb7.toString(), String.valueOf(currentTimeMillis5));
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final C14152o0 mo44717a(JSONObject jSONObject, String str, String str2, String str3) {
        String str4 = "-";
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!m61221a(jSONObject, str3)) {
            return new C14152o0(str2, C14130h.f41561p);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("posting to ");
        sb.append(str);
        String str5 = "BranchSDK";
        C14204x.m61509d(str5, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Post value = ");
        sb2.append(jSONObject.toString());
        C14204x.m61509d(str5, sb2.toString());
        try {
            C14150a a = mo44715a(str, jSONObject);
            C14152o0 a2 = m61219a(a.f41631a, a.f41632b, str2);
            if (C6009d.m27463J() != null) {
                int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
                C6009d J = C6009d.m27463J();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(str4);
                sb3.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                J.mo24806d(sb3.toString(), String.valueOf(currentTimeMillis2));
            }
            return a2;
        } catch (BranchRemoteException e) {
            if (e.f41630a == -111) {
                C14152o0 o0Var = new C14152o0(str2, C14130h.f41558m);
                if (C6009d.m27463J() != null) {
                    int currentTimeMillis3 = (int) (System.currentTimeMillis() - currentTimeMillis);
                    C6009d J2 = C6009d.m27463J();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(str4);
                    sb4.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                    J2.mo24806d(sb4.toString(), String.valueOf(currentTimeMillis3));
                }
                return o0Var;
            }
            C14152o0 o0Var2 = new C14152o0(str2, C14130h.f41560o);
            if (C6009d.m27463J() != null) {
                int currentTimeMillis4 = (int) (System.currentTimeMillis() - currentTimeMillis);
                C6009d J3 = C6009d.m27463J();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(str4);
                sb5.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                J3.mo24806d(sb5.toString(), String.valueOf(currentTimeMillis4));
            }
            return o0Var2;
        } catch (Throwable th) {
            if (C6009d.m27463J() != null) {
                int currentTimeMillis5 = (int) (System.currentTimeMillis() - currentTimeMillis);
                C6009d J4 = C6009d.m27463J();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(str4);
                sb6.append(C14169a.Branch_Round_Trip_Time.mo44764d());
                J4.mo24806d(sb6.toString(), String.valueOf(currentTimeMillis5));
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static final BranchRemoteInterface m61218a(Context context) {
        return new C14151a(context);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p212io.branch.referral.C14152o0 m61219a(java.lang.String r3, int r4, java.lang.String r5) {
        /*
            r2 = this;
            io.branch.referral.o0 r0 = new io.branch.referral.o0
            r0.<init>(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "returned "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "BranchSDK"
            p212io.branch.referral.C14204x.m61509d(r5, r4)
            if (r3 == 0) goto L_0x0050
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0026 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0026 }
            r0.mo44719a(r4)     // Catch:{ JSONException -> 0x0026 }
            goto L_0x0050
        L_0x0026:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x002f }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x002f }
            r0.mo44719a(r4)     // Catch:{ JSONException -> 0x002f }
            goto L_0x0050
        L_0x002f:
            r3 = move-exception
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "JSON exception: "
            r5.append(r1)
            java.lang.String r3 = r3.getMessage()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            p212io.branch.referral.C14204x.m61509d(r4, r3)
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.network.BranchRemoteInterface.m61219a(java.lang.String, int, java.lang.String):io.branch.referral.o0");
    }

    /* renamed from: a */
    private boolean m61221a(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.has(C14169a.UserData.mo44764d())) {
                jSONObject.put(C14169a.SDK.mo44764d(), "android2.19.5");
            }
            if (!str.equals("bnc_no_value")) {
                jSONObject.put(C14169a.BranchKey.mo44764d(), str);
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    /* renamed from: a */
    private String m61220a(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            if (names != null) {
                int length = names.length();
                int i = 0;
                boolean z = true;
                while (i < length) {
                    try {
                        String string = names.getString(i);
                        if (z) {
                            sb.append("?");
                            z = false;
                        } else {
                            sb.append("&");
                        }
                        String string2 = jSONObject.getString(string);
                        sb.append(string);
                        sb.append("=");
                        sb.append(string2);
                        i++;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return sb.toString();
    }
}
