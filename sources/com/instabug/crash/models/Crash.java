package com.instabug.crash.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.CrashEntry;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Crash implements Cacheable {

    /* renamed from: S */
    private static transient /* synthetic */ boolean[] f25176S;

    /* renamed from: N */
    private String f25177N;

    /* renamed from: O */
    private List<Attachment> f25178O;

    /* renamed from: P */
    private State f25179P;

    /* renamed from: Q */
    private CrashState f25180Q;

    /* renamed from: R */
    private boolean f25181R;

    /* renamed from: a */
    private String f25182a;

    /* renamed from: b */
    private String f25183b;

    public enum CrashState {
        READY_TO_BE_SENT,
        LOGS_READY_TO_BE_UPLOADED,
        ATTACHMENTS_READY_TO_BE_UPLOADED,
        NOT_AVAILABLE,
        WAITING_FOR_SCREEN_RECORDING_TO_BE_TRIMMED;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[4] = true;
        }
    }

    /* renamed from: com.instabug.crash.models.Crash$a */
    public static class C9514a {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25184a;

        /* renamed from: com.instabug.crash.models.Crash$a$a */
        class C9515a implements C12331g<Uri> {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25185N;

            /* renamed from: a */
            final /* synthetic */ Crash f25186a;

            /* renamed from: b */
            final /* synthetic */ C9514a f25187b;

            C9515a(C9514a aVar, Crash crash) {
                boolean[] a = m44554a();
                this.f25187b = aVar;
                this.f25186a = crash;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44554a() {
                boolean[] zArr = f25185N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-9006074238217083157L, "com/instabug/crash/models/Crash$Factory$1", 3);
                f25185N = a;
                return a;
            }

            /* renamed from: a */
            public void mo34194a(Uri uri) {
                boolean[] a = m44554a();
                this.f25186a.mo34175a(uri, Type.VISUAL_USER_STEPS);
                a[1] = true;
            }

            /* renamed from: c */
            public /* synthetic */ void mo33410c(Object obj) throws Exception {
                boolean[] a = m44554a();
                mo34194a((Uri) obj);
                a[2] = true;
            }
        }

        public C9514a() {
            m44552a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44552a() {
            boolean[] zArr = f25184a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4590579201105778166L, "com/instabug/crash/models/Crash$Factory", 10);
            f25184a = a;
            return a;
        }

        @SuppressLint({"CheckResult"})
        @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED"})
        /* renamed from: a */
        public Crash mo34193a(Context context, State state) {
            boolean[] a = m44552a();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append("");
            Crash crash = new Crash(sb.toString(), state);
            a[1] = true;
            if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) != Feature.State.ENABLED) {
                a[2] = true;
            } else {
                a[3] = true;
                if (!InstabugCore.isReproStepsScreenshotEnabled()) {
                    a[4] = true;
                } else {
                    a[5] = true;
                    C5923b0 visualUserStepsFileObservable = VisualUserStepsHelper.getVisualUserStepsFileObservable(context, crash.mo34181a());
                    a[6] = true;
                    C5923b0 c = visualUserStepsFileObservable.mo23950c(C12228b.m55094b());
                    C9515a aVar = new C9515a(this, crash);
                    a[7] = true;
                    c.mo24041i((C12331g<? super T>) aVar);
                    a[8] = true;
                }
            }
            a[9] = true;
            return crash;
        }
    }

    public Crash() {
        boolean[] h = m44535h();
        this.f25180Q = CrashState.NOT_AVAILABLE;
        h[0] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m44535h() {
        boolean[] zArr = f25176S;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2861940923615422812L, "com/instabug/crash/models/Crash", 93);
        f25176S = a;
        return a;
    }

    /* renamed from: a */
    public String mo34181a() {
        boolean[] h = m44535h();
        String str = this.f25182a;
        h[3] = true;
        return str;
    }

    /* renamed from: b */
    public String mo34183b() {
        boolean[] h = m44535h();
        String str = this.f25183b;
        h[5] = true;
        return str;
    }

    /* renamed from: c */
    public String mo34185c() {
        boolean[] h = m44535h();
        String str = this.f25177N;
        h[7] = true;
        return str;
    }

    /* renamed from: d */
    public List<Attachment> mo34186d() {
        boolean[] h = m44535h();
        List<Attachment> list = this.f25178O;
        h[17] = true;
        return list;
    }

    /* renamed from: e */
    public State mo34187e() {
        boolean[] h = m44535h();
        State state = this.f25179P;
        h[19] = true;
        return state;
    }

    public boolean equals(Object obj) {
        boolean[] h = m44535h();
        if (obj == null) {
            h[60] = true;
        } else if (!(obj instanceof Crash)) {
            h[61] = true;
        } else {
            Crash crash = (Crash) obj;
            h[62] = true;
            if (!String.valueOf(crash.mo34181a()).equals(String.valueOf(mo34181a()))) {
                h[63] = true;
            } else {
                h[64] = true;
                String valueOf = String.valueOf(crash.mo34185c());
                h[65] = true;
                String valueOf2 = String.valueOf(mo34185c());
                h[66] = true;
                if (!valueOf.equals(valueOf2)) {
                    h[67] = true;
                } else {
                    h[68] = true;
                    String valueOf3 = String.valueOf(crash.mo34183b());
                    h[69] = true;
                    String valueOf4 = String.valueOf(mo34183b());
                    h[70] = true;
                    if (!valueOf3.equals(valueOf4)) {
                        h[71] = true;
                    } else {
                        h[72] = true;
                        if (crash.mo34189f() != mo34189f()) {
                            h[73] = true;
                        } else {
                            h[74] = true;
                            if (!crash.mo34187e().equals(mo34187e())) {
                                h[75] = true;
                            } else {
                                h[76] = true;
                                if (crash.mo34190g() != mo34190g()) {
                                    h[77] = true;
                                } else {
                                    h[78] = true;
                                    if (crash.mo34186d() == null) {
                                        h[79] = true;
                                    } else {
                                        h[80] = true;
                                        if (crash.mo34186d().size() != mo34186d().size()) {
                                            h[81] = true;
                                        } else {
                                            h[82] = true;
                                            h[83] = true;
                                            int i = 0;
                                            while (i < crash.mo34186d().size()) {
                                                h[84] = true;
                                                if (!((Attachment) crash.mo34186d().get(i)).equals(mo34186d().get(i))) {
                                                    h[85] = true;
                                                    return false;
                                                }
                                                i++;
                                                h[86] = true;
                                            }
                                            h[87] = true;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            h[88] = true;
            return false;
        }
        h[89] = true;
        return false;
    }

    /* renamed from: f */
    public CrashState mo34189f() {
        boolean[] h = m44535h();
        CrashState crashState = this.f25180Q;
        h[21] = true;
        return crashState;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] h = m44535h();
        JSONObject jSONObject = new JSONObject(str);
        h[34] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            h[35] = true;
        } else {
            h[36] = true;
            mo34178a(jSONObject.getString(str2));
            h[37] = true;
        }
        String str3 = "temporary_server_token";
        if (!jSONObject.has(str3)) {
            h[38] = true;
        } else {
            h[39] = true;
            mo34182b(jSONObject.getString(str3));
            h[40] = true;
        }
        String str4 = CrashEntry.COLUMN_CRASH_MESSAGE;
        if (!jSONObject.has(str4)) {
            h[41] = true;
        } else {
            h[42] = true;
            mo34184c(jSONObject.getString(str4));
            h[43] = true;
        }
        String str5 = CrashEntry.COLUMN_CRASH_STATE;
        if (!jSONObject.has(str5)) {
            h[44] = true;
        } else {
            h[45] = true;
            mo34176a(CrashState.valueOf(jSONObject.getString(str5)));
            h[46] = true;
        }
        String str6 = "state";
        if (!jSONObject.has(str6)) {
            h[47] = true;
        } else {
            h[48] = true;
            State state = new State();
            h[49] = true;
            state.fromJson(jSONObject.getString(str6));
            h[50] = true;
            mo34177a(state);
            h[51] = true;
        }
        String str7 = AttachmentEntry.TABLE_NAME;
        if (!jSONObject.has(str7)) {
            h[52] = true;
        } else {
            h[53] = true;
            mo34179a(Attachment.fromJson(jSONObject.getJSONArray(str7)));
            h[54] = true;
        }
        String str8 = CrashEntry.COLUMN_HANDLED;
        if (!jSONObject.has(str8)) {
            h[55] = true;
        } else {
            h[56] = true;
            mo34180a(jSONObject.getBoolean(str8));
            h[57] = true;
        }
        h[58] = true;
    }

    /* renamed from: g */
    public boolean mo34190g() {
        boolean[] h = m44535h();
        boolean z = this.f25181R;
        h[23] = true;
        return z;
    }

    public int hashCode() {
        boolean[] h = m44535h();
        if (mo34181a() != null) {
            h[90] = true;
            int hashCode = mo34181a().hashCode();
            h[91] = true;
            return hashCode;
        }
        h[92] = true;
        return -1;
    }

    public String toJson() throws JSONException {
        boolean[] h = m44535h();
        JSONObject jSONObject = new JSONObject();
        h[25] = true;
        JSONObject put = jSONObject.put("id", mo34181a());
        h[26] = true;
        JSONObject put2 = put.put("temporary_server_token", mo34183b());
        h[27] = true;
        JSONObject put3 = put2.put(CrashEntry.COLUMN_CRASH_MESSAGE, mo34185c());
        h[28] = true;
        JSONObject put4 = put3.put(CrashEntry.COLUMN_CRASH_STATE, mo34189f().toString());
        h[29] = true;
        JSONObject put5 = put4.put("state", mo34187e().toJson());
        h[30] = true;
        JSONObject put6 = put5.put(AttachmentEntry.TABLE_NAME, Attachment.toJson(mo34186d()));
        h[31] = true;
        put6.put(CrashEntry.COLUMN_HANDLED, mo34190g());
        h[32] = true;
        String jSONObject2 = jSONObject.toString();
        h[33] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] h = m44535h();
        StringBuilder sb = new StringBuilder();
        sb.append("Internal Id: ");
        sb.append(this.f25182a);
        sb.append(", TemporaryServerToken:");
        sb.append(this.f25183b);
        sb.append(", crashMessage:");
        sb.append(this.f25177N);
        sb.append(", handled:");
        sb.append(this.f25181R);
        String sb2 = sb.toString();
        h[59] = true;
        return sb2;
    }

    /* renamed from: a */
    public Crash mo34178a(String str) {
        boolean[] h = m44535h();
        this.f25182a = str;
        h[4] = true;
        return this;
    }

    /* renamed from: b */
    public Crash mo34182b(String str) {
        boolean[] h = m44535h();
        this.f25183b = str;
        h[6] = true;
        return this;
    }

    /* renamed from: c */
    public Crash mo34184c(String str) {
        boolean[] h = m44535h();
        this.f25177N = str;
        h[8] = true;
        return this;
    }

    public Crash(@C0193h0 String str, @C0193h0 State state) {
        boolean[] h = m44535h();
        this();
        this.f25182a = str;
        this.f25179P = state;
        h[1] = true;
        this.f25178O = new CopyOnWriteArrayList();
        h[2] = true;
    }

    /* renamed from: a */
    public Crash mo34174a(Uri uri) {
        boolean[] h = m44535h();
        Crash a = mo34175a(uri, Type.ATTACHMENT_FILE);
        h[9] = true;
        return a;
    }

    /* renamed from: a */
    public Crash mo34175a(Uri uri, Type type) {
        boolean[] h = m44535h();
        if (uri == null) {
            h[10] = true;
            InstabugSDKLogger.m46627w(this, "Adding attachment with a null Uri, ignored.");
            h[11] = true;
            return this;
        }
        Attachment attachment = new Attachment();
        h[12] = true;
        attachment.setName(uri.getLastPathSegment());
        h[13] = true;
        attachment.setLocalPath(uri.getPath());
        h[14] = true;
        attachment.setType(type);
        h[15] = true;
        this.f25178O.add(attachment);
        h[16] = true;
        return this;
    }

    /* renamed from: a */
    public Crash mo34179a(@C0193h0 List<Attachment> list) {
        boolean[] h = m44535h();
        this.f25178O = new CopyOnWriteArrayList(list);
        h[18] = true;
        return this;
    }

    /* renamed from: a */
    public Crash mo34177a(State state) {
        boolean[] h = m44535h();
        this.f25179P = state;
        h[20] = true;
        return this;
    }

    /* renamed from: a */
    public Crash mo34176a(CrashState crashState) {
        boolean[] h = m44535h();
        this.f25180Q = crashState;
        h[22] = true;
        return this;
    }

    /* renamed from: a */
    public Crash mo34180a(boolean z) {
        boolean[] h = m44535h();
        this.f25181R = z;
        h[24] = true;
        return this;
    }
}
