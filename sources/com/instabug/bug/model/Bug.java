package com.instabug.bug.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.BugEntry;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.model.BaseReport;
import com.instabug.library.model.State.Builder;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class Bug extends BaseReport implements Cacheable, Serializable {

    /* renamed from: X */
    private static transient /* synthetic */ boolean[] f24531X;

    /* renamed from: N */
    private String f24532N;

    /* renamed from: O */
    private C9278b f24533O;

    /* renamed from: P */
    private String f24534P;

    /* renamed from: Q */
    private List<Attachment> f24535Q;

    /* renamed from: R */
    private BugState f24536R;

    /* renamed from: S */
    private String f24537S;

    /* renamed from: T */
    private boolean f24538T;

    /* renamed from: U */
    private ViewHierarchyInspectionState f24539U;

    /* renamed from: V */
    private transient List<C9277a> f24540V;

    /* renamed from: W */
    private ArrayList<String> f24541W;

    /* renamed from: a */
    private String f24542a;

    /* renamed from: b */
    private String f24543b;

    public enum BugState {
        IN_PROGRESS,
        WAITING_VIDEO,
        READY_TO_BE_SENT,
        LOGS_READY_TO_BE_UPLOADED,
        ATTACHMENTS_READY_TO_BE_UPLOADED,
        NOT_AVAILABLE;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    public enum ViewHierarchyInspectionState {
        IN_PROGRESS,
        FAILED,
        DONE;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.bug.model.Bug$a */
    public static class C9274a {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24544a;

        /* renamed from: com.instabug.bug.model.Bug$a$a */
        class C9275a implements Runnable {

            /* renamed from: O */
            private static transient /* synthetic */ boolean[] f24545O;

            /* renamed from: N */
            final /* synthetic */ C9274a f24546N;

            /* renamed from: a */
            final /* synthetic */ Bug f24547a;

            /* renamed from: b */
            final /* synthetic */ Context f24548b;

            C9275a(C9274a aVar, Bug bug, Context context) {
                boolean[] a = m43407a();
                this.f24546N = aVar;
                this.f24547a = bug;
                this.f24548b = context;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43407a() {
                boolean[] zArr = f24545O;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-8981282329268409339L, "com/instabug/bug/model/Bug$Factory$1", 2);
                f24545O = a;
                return a;
            }

            public void run() {
                boolean[] a = m43407a();
                this.f24547a.mo33502a(new Builder(this.f24548b).build(false));
                a[1] = true;
            }
        }

        /* renamed from: com.instabug.bug.model.Bug$a$b */
        class C9276b implements C12331g<Uri> {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24549N;

            /* renamed from: a */
            final /* synthetic */ Bug f24550a;

            /* renamed from: b */
            final /* synthetic */ C9274a f24551b;

            C9276b(C9274a aVar, Bug bug) {
                boolean[] a = m43408a();
                this.f24551b = aVar;
                this.f24550a = bug;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43408a() {
                boolean[] zArr = f24549N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5850908392861859167L, "com/instabug/bug/model/Bug$Factory$2", 3);
                f24549N = a;
                return a;
            }

            /* renamed from: a */
            public void mo33538a(Uri uri) {
                boolean[] a = m43408a();
                this.f24550a.mo33498a(uri, Type.VISUAL_USER_STEPS);
                a[1] = true;
            }

            /* renamed from: c */
            public /* synthetic */ void mo33410c(Object obj) throws Exception {
                boolean[] a = m43408a();
                mo33538a((Uri) obj);
                a[2] = true;
            }
        }

        public C9274a() {
            m43405a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43405a() {
            boolean[] zArr = f24544a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6004947285035263318L, "com/instabug/bug/model/Bug$Factory", 13);
            f24544a = a;
            return a;
        }

        @SuppressLint({"CheckResult"})
        @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED"})
        /* renamed from: a */
        public Bug mo33536a(Context context) {
            boolean z;
            boolean[] a = m43405a();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append("");
            Bug bug = new Bug(sb.toString(), null, BugState.IN_PROGRESS);
            a[1] = true;
            PoolProvider.postIOTask(new C9275a(this, bug, context));
            a[2] = true;
            if (InstabugCore.getFeatureState(Feature.VIEW_HIERARCHY) == State.ENABLED) {
                a[3] = true;
                z = true;
            } else {
                z = false;
                a[4] = true;
            }
            a[5] = true;
            bug.mo33504a(z);
            a[6] = true;
            if (InstabugCore.getFeatureState(Feature.REPRO_STEPS) != State.ENABLED) {
                a[7] = true;
            } else {
                a[8] = true;
                C5923b0 visualUserStepsFileObservable = VisualUserStepsHelper.getVisualUserStepsFileObservable(context, bug.getId());
                a[9] = true;
                C5923b0 c = visualUserStepsFileObservable.mo23950c(C12228b.m55094b());
                C9276b bVar = new C9276b(this, bug);
                a[10] = true;
                c.mo24041i((C12331g<? super T>) bVar);
                a[11] = true;
            }
            a[12] = true;
            return bug;
        }
    }

    public Bug() {
        boolean[] q = m43374q();
        this.f24536R = BugState.NOT_AVAILABLE;
        this.f24533O = C9278b.NOT_AVAILABLE;
        q[0] = true;
    }

    /* renamed from: q */
    private static /* synthetic */ boolean[] m43374q() {
        boolean[] zArr = f24531X;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(9197581428284214905L, "com/instabug/bug/model/Bug", C13959t.f40933n2);
        f24531X = a;
        return a;
    }

    /* renamed from: a */
    public String mo33505a() {
        boolean[] q = m43374q();
        String str = this.f24532N;
        q[6] = true;
        return str;
    }

    /* renamed from: b */
    public Bug mo33508b(String str) {
        boolean[] q = m43374q();
        this.f24543b = str;
        q[5] = true;
        return this;
    }

    /* renamed from: c */
    public Bug mo33510c(String str) {
        boolean[] q = m43374q();
        this.f24532N = str;
        q[7] = true;
        return this;
    }

    /* renamed from: d */
    public void mo33512d(String str) {
        boolean[] q = m43374q();
        this.f24542a = str;
        q[8] = true;
    }

    /* renamed from: e */
    public C9278b mo33514e() {
        boolean[] q = m43374q();
        C9278b bVar = this.f24533O;
        q[10] = true;
        return bVar;
    }

    public boolean equals(Object obj) {
        boolean[] q = m43374q();
        if (obj == null) {
            q[120] = true;
        } else if (!(obj instanceof Bug)) {
            q[121] = true;
        } else {
            Bug bug = (Bug) obj;
            q[122] = true;
            if (!String.valueOf(bug.getId()).equals(String.valueOf(getId()))) {
                q[123] = true;
            } else {
                q[124] = true;
                if (!String.valueOf(bug.mo33517f()).equals(String.valueOf(mo33517f()))) {
                    q[125] = true;
                } else {
                    q[126] = true;
                    if (!String.valueOf(bug.mo33505a()).equals(String.valueOf(mo33505a()))) {
                        q[127] = true;
                    } else {
                        q[128] = true;
                        if (bug.mo33522h() != mo33522h()) {
                            q[129] = true;
                        } else {
                            q[130] = true;
                            if (!bug.getState().equals(getState())) {
                                q[131] = true;
                            } else {
                                q[132] = true;
                                if (bug.mo33514e() != mo33514e()) {
                                    q[133] = true;
                                } else {
                                    q[134] = true;
                                    if (bug.mo33519g() == null) {
                                        q[135] = true;
                                    } else {
                                        q[136] = true;
                                        if (bug.mo33519g().size() != mo33519g().size()) {
                                            q[137] = true;
                                        } else {
                                            q[138] = true;
                                            q[139] = true;
                                            int i = 0;
                                            while (i < bug.mo33519g().size()) {
                                                q[140] = true;
                                                if (!((Attachment) bug.mo33519g().get(i)).equals(mo33519g().get(i))) {
                                                    q[141] = true;
                                                    return false;
                                                }
                                                i++;
                                                q[142] = true;
                                            }
                                            q[143] = true;
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            q[144] = true;
            return false;
        }
        q[145] = true;
        return false;
    }

    /* renamed from: f */
    public String mo33517f() {
        boolean[] q = m43374q();
        String str = this.f24534P;
        q[12] = true;
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fromJson(java.lang.String r7) throws org.json.JSONException {
        /*
            r6 = this;
            boolean[] r0 = m43374q()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
            r7 = 1
            r2 = 43
            r0[r2] = r7
            java.lang.String r2 = "id"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x001b
            r2 = 44
            r0[r2] = r7
            goto L_0x002a
        L_0x001b:
            r3 = 45
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33508b(r2)
            r2 = 46
            r0[r2] = r7
        L_0x002a:
            java.lang.String r2 = "temporary_server_token"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0037
            r2 = 47
            r0[r2] = r7
            goto L_0x0046
        L_0x0037:
            r3 = 48
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33510c(r2)
            r2 = 49
            r0[r2] = r7
        L_0x0046:
            java.lang.String r2 = "type"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0053
            r2 = 50
            r0[r2] = r7
            goto L_0x00b4
        L_0x0053:
            r3 = 51
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r3 = -1
            int r4 = r2.hashCode()
            r5 = -191501435(0xfffffffff495eb85, float:-9.502309E31)
            if (r4 == r5) goto L_0x0082
            r5 = 97908(0x17e74, float:1.37198E-40)
            if (r4 == r5) goto L_0x006f
            r2 = 52
            r0[r2] = r7
            goto L_0x008e
        L_0x006f:
            java.lang.String r4 = "bug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x007c
            r2 = 53
            r0[r2] = r7
            goto L_0x008e
        L_0x007c:
            r2 = 0
            r3 = 54
            r0[r3] = r7
            goto L_0x0095
        L_0x0082:
            java.lang.String r4 = "feedback"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0090
            r2 = 55
            r0[r2] = r7
        L_0x008e:
            r2 = -1
            goto L_0x0095
        L_0x0090:
            r2 = 56
            r0[r2] = r7
            r2 = 1
        L_0x0095:
            if (r2 == 0) goto L_0x00a7
            if (r2 == r7) goto L_0x00a0
            com.instabug.bug.model.b r2 = com.instabug.bug.model.C9278b.NOT_AVAILABLE
            r3 = 59
            r0[r3] = r7
            goto L_0x00ad
        L_0x00a0:
            com.instabug.bug.model.b r2 = com.instabug.bug.model.C9278b.FEEDBACK
            r3 = 58
            r0[r3] = r7
            goto L_0x00ad
        L_0x00a7:
            com.instabug.bug.model.b r2 = com.instabug.bug.model.C9278b.BUG
            r3 = 57
            r0[r3] = r7
        L_0x00ad:
            r6.mo33501a(r2)
            r2 = 60
            r0[r2] = r7
        L_0x00b4:
            java.lang.String r2 = "message"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00c1
            r2 = 61
            r0[r2] = r7
            goto L_0x00d0
        L_0x00c1:
            r3 = 62
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33513e(r2)
            r2 = 63
            r0[r2] = r7
        L_0x00d0:
            java.lang.String r2 = "bug_state"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00dd
            r2 = 64
            r0[r2] = r7
            goto L_0x00f0
        L_0x00dd:
            r3 = 65
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            com.instabug.bug.model.Bug$BugState r2 = com.instabug.bug.model.Bug.BugState.valueOf(r2)
            r6.mo33499a(r2)
            r2 = 66
            r0[r2] = r7
        L_0x00f0:
            java.lang.String r2 = "state"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00fd
            r2 = 67
            r0[r2] = r7
            goto L_0x011c
        L_0x00fd:
            r3 = 68
            r0[r3] = r7
            com.instabug.library.model.State r3 = new com.instabug.library.model.State
            r3.<init>()
            r4 = 69
            r0[r4] = r7
            java.lang.String r2 = r1.getString(r2)
            r3.fromJson(r2)
            r2 = 70
            r0[r2] = r7
            r6.mo33502a(r3)
            r2 = 71
            r0[r2] = r7
        L_0x011c:
            java.lang.String r2 = "attachments"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0129
            r2 = 72
            r0[r2] = r7
            goto L_0x013c
        L_0x0129:
            r3 = 73
            r0[r3] = r7
            org.json.JSONArray r2 = r1.getJSONArray(r2)
            java.util.List r2 = com.instabug.library.model.Attachment.fromJson(r2)
            r6.mo33503a(r2)
            r2 = 74
            r0[r2] = r7
        L_0x013c:
            java.lang.String r2 = "view_hierarchy"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0149
            r2 = 75
            r0[r2] = r7
            goto L_0x0158
        L_0x0149:
            r3 = 76
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33516f(r2)
            r2 = 77
            r0[r2] = r7
        L_0x0158:
            java.lang.String r2 = "categories_list"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0165
            r1 = 78
            r0[r1] = r7
            goto L_0x0174
        L_0x0165:
            r3 = 79
            r0[r3] = r7
            org.json.JSONArray r1 = r1.getJSONArray(r2)
            r6.mo33507a(r1)
            r1 = 80
            r0[r1] = r7
        L_0x0174:
            r1 = 81
            r0[r1] = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.model.Bug.fromJson(java.lang.String):void");
    }

    /* renamed from: g */
    public synchronized List<Attachment> mo33519g() {
        List<Attachment> list;
        boolean[] q = m43374q();
        list = this.f24535Q;
        q[23] = true;
        return list;
    }

    public String getId() {
        boolean[] q = m43374q();
        String str = this.f24543b;
        q[4] = true;
        return str;
    }

    /* renamed from: h */
    public BugState mo33522h() {
        boolean[] q = m43374q();
        BugState bugState = this.f24536R;
        q[26] = true;
        return bugState;
    }

    public int hashCode() {
        boolean[] q = m43374q();
        if (getId() != null) {
            q[146] = true;
            int hashCode = getId().hashCode();
            q[147] = true;
            return hashCode;
        }
        q[148] = true;
        return -1;
    }

    /* renamed from: i */
    public String mo33524i() {
        boolean[] q = m43374q();
        String str = this.f24537S;
        q[28] = true;
        return str;
    }

    /* renamed from: j */
    public JSONArray mo33525j() {
        boolean[] q = m43374q();
        JSONArray jSONArray = new JSONArray();
        q[82] = true;
        Iterator it = this.f24541W.iterator();
        q[83] = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            q[84] = true;
            jSONArray.put(str);
            q[85] = true;
        }
        q[86] = true;
        return jSONArray;
    }

    /* renamed from: k */
    public int mo33526k() {
        boolean[] q = m43374q();
        q[92] = true;
        q[93] = true;
        int i = 0;
        for (Attachment attachment : mo33519g()) {
            q[94] = true;
            if (attachment.getType() == Type.MAIN_SCREENSHOT) {
                q[95] = true;
            } else {
                q[96] = true;
                if (attachment.getType() == Type.IMAGE) {
                    q[97] = true;
                } else {
                    q[98] = true;
                    if (attachment.getType() == Type.VIDEO) {
                        q[99] = true;
                    } else {
                        q[100] = true;
                        if (attachment.getType() != Type.AUDIO) {
                            q[101] = true;
                            q[104] = true;
                        } else {
                            q[102] = true;
                        }
                    }
                }
            }
            i++;
            q[103] = true;
            q[104] = true;
        }
        q[105] = true;
        return i;
    }

    /* renamed from: l */
    public boolean mo33527l() {
        boolean[] q = m43374q();
        q[106] = true;
        for (Attachment attachment : mo33519g()) {
            q[107] = true;
            if (attachment.getType() == Type.MAIN_SCREENSHOT) {
                q[108] = true;
                return true;
            }
            q[109] = true;
        }
        q[110] = true;
        return false;
    }

    /* renamed from: m */
    public boolean mo33528m() {
        boolean[] q = m43374q();
        boolean z = this.f24538T;
        q[111] = true;
        return z;
    }

    /* renamed from: n */
    public ViewHierarchyInspectionState mo33529n() {
        boolean[] q = m43374q();
        ViewHierarchyInspectionState viewHierarchyInspectionState = this.f24539U;
        q[113] = true;
        return viewHierarchyInspectionState;
    }

    /* renamed from: o */
    public List<C9277a> mo33530o() {
        boolean[] q = m43374q();
        List<C9277a> list = this.f24540V;
        q[115] = true;
        return list;
    }

    /* renamed from: p */
    public String mo33531p() {
        boolean[] q = m43374q();
        String commaSeparated = StringUtility.toCommaSeparated(this.f24541W);
        q[118] = true;
        return commaSeparated;
    }

    public /* synthetic */ BaseReport setId(String str) {
        boolean[] q = m43374q();
        Bug b = mo33508b(str);
        q[150] = true;
        return b;
    }

    public /* synthetic */ BaseReport setState(com.instabug.library.model.State state) {
        boolean[] q = m43374q();
        Bug a = mo33502a(state);
        q[149] = true;
        return a;
    }

    public String toJson() throws JSONException {
        boolean[] q = m43374q();
        JSONObject jSONObject = new JSONObject();
        q[32] = true;
        JSONObject put = jSONObject.put("id", getId());
        q[33] = true;
        JSONObject put2 = put.put("temporary_server_token", mo33505a());
        q[34] = true;
        JSONObject put3 = put2.put("type", mo33514e().toString());
        q[35] = true;
        JSONObject put4 = put3.put("message", mo33517f());
        q[36] = true;
        JSONObject put5 = put4.put(BugEntry.COLUMN_BUG_STATE, mo33522h().toString());
        q[37] = true;
        JSONObject put6 = put5.put("state", getState().toJson());
        q[38] = true;
        JSONObject put7 = put6.put(AttachmentEntry.TABLE_NAME, Attachment.toJson(mo33519g()));
        q[39] = true;
        JSONObject put8 = put7.put(BugEntry.COLUMN_VIEW_HIERARCHY, mo33524i());
        q[40] = true;
        put8.put(BugEntry.COLUMN_CATEGORIES_LIST, mo33525j());
        q[41] = true;
        String jSONObject2 = jSONObject.toString();
        q[42] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] q = m43374q();
        StringBuilder sb = new StringBuilder();
        sb.append("Internal Id: ");
        sb.append(this.f24543b);
        sb.append(", TemporaryServerToken:");
        sb.append(this.f24532N);
        sb.append(", Message:");
        sb.append(this.f24534P);
        sb.append(", Type:");
        sb.append(this.f24533O);
        String sb2 = sb.toString();
        q[119] = true;
        return sb2;
    }

    /* renamed from: a */
    public Bug mo33501a(C9278b bVar) {
        boolean[] q = m43374q();
        this.f24533O = bVar;
        q[11] = true;
        return this;
    }

    /* renamed from: e */
    public Bug mo33513e(String str) {
        boolean[] q = m43374q();
        this.f24534P = str;
        q[13] = true;
        return this;
    }

    /* renamed from: f */
    public Bug mo33516f(String str) {
        boolean[] q = m43374q();
        this.f24537S = str;
        q[29] = true;
        return this;
    }

    /* renamed from: g */
    public void mo33520g(String str) {
        boolean[] q = m43374q();
        this.f24541W.add(str);
        q[117] = true;
    }

    /* renamed from: b */
    public void mo33509b(List<C9277a> list) {
        boolean[] q = m43374q();
        this.f24540V = list;
        q[116] = true;
    }

    /* renamed from: d */
    public String mo33511d() {
        boolean[] q = m43374q();
        String str = this.f24542a;
        q[9] = true;
        return str;
    }

    /* renamed from: a */
    public Bug mo33498a(Uri uri, Type type) {
        boolean[] q = m43374q();
        if (uri == null) {
            q[14] = true;
            InstabugSDKLogger.m46627w(this, "Adding attachment with a null Uri, ignored.");
            q[15] = true;
            return this;
        } else if (type == null) {
            q[16] = true;
            InstabugSDKLogger.m46627w(this, "Adding attachment with a null Attachment.Type, ignored.");
            q[17] = true;
            return this;
        } else {
            Attachment attachment = new Attachment();
            q[18] = true;
            attachment.setName(uri.getLastPathSegment());
            q[19] = true;
            attachment.setLocalPath(uri.getPath());
            q[20] = true;
            attachment.setType(type);
            q[21] = true;
            this.f24535Q.add(attachment);
            q[22] = true;
            return this;
        }
    }

    public Bug(@C0193h0 String str, @C0193h0 com.instabug.library.model.State state, @C0193h0 BugState bugState) {
        boolean[] q = m43374q();
        this.f24543b = str;
        this.state = state;
        this.f24536R = bugState;
        this.f24533O = C9278b.NOT_AVAILABLE;
        q[1] = true;
        this.f24535Q = new CopyOnWriteArrayList();
        q[2] = true;
        this.f24541W = new ArrayList<>();
        q[3] = true;
    }

    /* renamed from: a */
    public Bug mo33503a(List<Attachment> list) {
        boolean[] q = m43374q();
        this.f24535Q = new CopyOnWriteArrayList(list);
        q[24] = true;
        return this;
    }

    /* renamed from: a */
    public Bug mo33502a(com.instabug.library.model.State state) {
        boolean[] q = m43374q();
        this.state = state;
        q[25] = true;
        return this;
    }

    /* renamed from: a */
    public Bug mo33499a(BugState bugState) {
        boolean[] q = m43374q();
        this.f24536R = bugState;
        q[27] = true;
        return this;
    }

    /* renamed from: a */
    public void mo33506a(ArrayList<String> arrayList) {
        boolean[] q = m43374q();
        this.f24541W = arrayList;
        q[31] = true;
    }

    /* renamed from: a */
    public void mo33507a(JSONArray jSONArray) throws JSONException {
        boolean[] q = m43374q();
        ArrayList arrayList = new ArrayList();
        q[87] = true;
        q[88] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            q[89] = true;
            arrayList.add(jSONArray.getString(i));
            i++;
            q[90] = true;
        }
        mo33506a(arrayList);
        q[91] = true;
    }

    /* renamed from: a */
    public Bug mo33504a(boolean z) {
        boolean[] q = m43374q();
        this.f24538T = z;
        q[112] = true;
        return this;
    }

    /* renamed from: a */
    public Bug mo33500a(ViewHierarchyInspectionState viewHierarchyInspectionState) {
        boolean[] q = m43374q();
        this.f24539U = viewHierarchyInspectionState;
        q[114] = true;
        return this;
    }
}
