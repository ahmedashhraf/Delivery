package com.instabug.chat.model;

import androidx.annotation.C0193h0;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.AttachmentEntry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class Message implements Cacheable, Serializable {

    /* renamed from: X */
    private static transient /* synthetic */ boolean[] f24928X;

    /* renamed from: N */
    private String f24929N;

    /* renamed from: O */
    private String f24930O;

    /* renamed from: P */
    private String f24931P;

    /* renamed from: Q */
    private long f24932Q;

    /* renamed from: R */
    private boolean f24933R;

    /* renamed from: S */
    private long f24934S;

    /* renamed from: T */
    private ArrayList<Attachment> f24935T;

    /* renamed from: U */
    private ArrayList<C9423b> f24936U;

    /* renamed from: V */
    private C9419b f24937V;

    /* renamed from: W */
    private MessageState f24938W;

    /* renamed from: a */
    private String f24939a;

    /* renamed from: b */
    private String f24940b;

    public enum MessageState {
        STAY_OFFLINE,
        READY_TO_BE_SENT,
        SENT,
        READY_TO_BE_SYNCED,
        SYNCED,
        NOT_AVAILABLE;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.chat.model.Message$a */
    public static class C9418a implements Serializable, Comparator<Message> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24941b;

        /* renamed from: a */
        private int f24942a = 2;

        public C9418a() {
            boolean[] a = m44069a();
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44069a() {
            boolean[] zArr = f24941b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2966389530102295717L, "com/instabug/chat/model/Message$Comparator", 8);
            f24941b = a;
            return a;
        }

        /* renamed from: a */
        public int mo33931a(Message message, Message message2) {
            boolean[] a = m44069a();
            int i = this.f24942a;
            if (i == 1) {
                int compareTo = message.mo33914d().compareTo(message2.mo33914d());
                a[2] = true;
                return compareTo;
            } else if (i == 2) {
                Date date = new Date(message.mo33921h());
                a[3] = true;
                Date date2 = new Date(message2.mo33921h());
                a[4] = true;
                int compareTo2 = date.compareTo(date2);
                a[5] = true;
                return compareTo2;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Message comparator wasn't provided comparison messageIssueType");
                a[6] = true;
                throw illegalStateException;
            }
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            boolean[] a = m44069a();
            int a2 = mo33931a((Message) obj, (Message) obj2);
            a[7] = true;
            return a2;
        }

        public C9418a(int i) {
            boolean[] a = m44069a();
            this.f24942a = i;
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.chat.model.Message$b */
    public enum C9419b {
        INBOUND("inbound"),
        OUTBOUND("outbound"),
        NOT_AVAILABLE("not-available");
        
        private final String direction;

        static {
            boolean[] d;
            d[4] = true;
        }

        private C9419b(String str) {
            boolean[] d = m44071d();
            this.direction = str;
            d[2] = true;
        }

        public String toString() {
            boolean[] d = m44071d();
            String str = this.direction;
            d[3] = true;
            return str;
        }
    }

    public Message() {
        boolean[] p = m44041p();
        this(String.valueOf(System.currentTimeMillis()));
        p[0] = true;
    }

    /* renamed from: a */
    public static ArrayList<Message> m44039a(JSONArray jSONArray) throws JSONException {
        boolean[] p = m44041p();
        ArrayList<Message> arrayList = new ArrayList<>();
        p[9] = true;
        p[10] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            p[11] = true;
            Message message = new Message();
            p[12] = true;
            message.fromJson(jSONArray.getJSONObject(i).toString());
            p[13] = true;
            arrayList.add(message);
            i++;
            p[14] = true;
        }
        p[15] = true;
        return arrayList;
    }

    /* renamed from: c */
    public static JSONArray m44040c(ArrayList<Message> arrayList) throws JSONException {
        boolean[] p = m44041p();
        JSONArray jSONArray = new JSONArray();
        p[4] = true;
        p[5] = true;
        int i = 0;
        while (i < arrayList.size()) {
            p[6] = true;
            jSONArray.put(new JSONObject(((Message) arrayList.get(i)).toJson()));
            i++;
            p[7] = true;
        }
        p[8] = true;
        return jSONArray;
    }

    /* renamed from: p */
    private static /* synthetic */ boolean[] m44041p() {
        boolean[] zArr = f24928X;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3559572958492995869L, "com/instabug/chat/model/Message", C13959t.f40780D2);
        f24928X = a;
        return a;
    }

    /* renamed from: b */
    public Message mo33910b(String str) {
        boolean[] p = m44041p();
        this.f24939a = str;
        p[17] = true;
        return this;
    }

    /* renamed from: d */
    public String mo33914d() {
        boolean[] p = m44041p();
        String str = this.f24940b;
        p[18] = true;
        return str;
    }

    /* renamed from: e */
    public String mo33916e() {
        boolean[] p = m44041p();
        String str = this.f24929N;
        p[20] = true;
        return str;
    }

    public boolean equals(Object obj) {
        boolean[] p = m44041p();
        if (obj == null) {
            p[112] = true;
        } else if (!(obj instanceof Message)) {
            p[113] = true;
        } else {
            Message message = (Message) obj;
            p[114] = true;
            if (!String.valueOf(message.mo33908a()).equals(String.valueOf(mo33908a()))) {
                p[115] = true;
            } else {
                p[116] = true;
                String valueOf = String.valueOf(message.mo33914d());
                p[117] = true;
                String valueOf2 = String.valueOf(mo33914d());
                p[118] = true;
                if (!valueOf.equals(valueOf2)) {
                    p[119] = true;
                } else {
                    p[120] = true;
                    String valueOf3 = String.valueOf(message.mo33923i());
                    p[121] = true;
                    String valueOf4 = String.valueOf(mo33923i());
                    p[122] = true;
                    if (!valueOf3.equals(valueOf4)) {
                        p[123] = true;
                    } else {
                        p[124] = true;
                        String valueOf5 = String.valueOf(message.mo33924j());
                        p[125] = true;
                        String valueOf6 = String.valueOf(mo33924j());
                        p[126] = true;
                        if (!valueOf5.equals(valueOf6)) {
                            p[127] = true;
                        } else {
                            p[128] = true;
                            if (!String.valueOf(message.mo33916e()).equals(String.valueOf(mo33916e()))) {
                                p[129] = true;
                            } else {
                                p[130] = true;
                                if (message.mo33921h() != mo33921h()) {
                                    p[131] = true;
                                } else {
                                    p[132] = true;
                                    if (message.mo33925k() != mo33925k()) {
                                        p[133] = true;
                                    } else {
                                        p[134] = true;
                                        if (message.mo33928n() != mo33928n()) {
                                            p[135] = true;
                                        } else {
                                            p[136] = true;
                                            if (message.mo33929o() != mo33929o()) {
                                                p[137] = true;
                                            } else {
                                                p[138] = true;
                                                if (message.mo33919f() != mo33919f()) {
                                                    p[139] = true;
                                                } else {
                                                    p[140] = true;
                                                    if (message.mo33920g() != mo33920g()) {
                                                        p[141] = true;
                                                    } else {
                                                        p[142] = true;
                                                        if (message.mo33926l() == null) {
                                                            p[143] = true;
                                                        } else {
                                                            p[144] = true;
                                                            if (message.mo33926l().size() != mo33926l().size()) {
                                                                p[145] = true;
                                                            } else {
                                                                p[146] = true;
                                                                if (message.mo33927m() == null) {
                                                                    p[147] = true;
                                                                } else {
                                                                    p[148] = true;
                                                                    if (message.mo33927m().size() != mo33927m().size()) {
                                                                        p[149] = true;
                                                                    } else {
                                                                        p[150] = true;
                                                                        p[151] = true;
                                                                        int i = 0;
                                                                        while (i < message.mo33926l().size()) {
                                                                            p[152] = true;
                                                                            if (!((Attachment) message.mo33926l().get(i)).equals(mo33926l().get(i))) {
                                                                                p[153] = true;
                                                                                return false;
                                                                            }
                                                                            i++;
                                                                            p[154] = true;
                                                                        }
                                                                        p[155] = true;
                                                                        int i2 = 0;
                                                                        while (i2 < message.mo33927m().size()) {
                                                                            p[156] = true;
                                                                            if (!((C9423b) message.mo33927m().get(i2)).equals(mo33927m().get(i2))) {
                                                                                p[157] = true;
                                                                                return false;
                                                                            }
                                                                            i2++;
                                                                            p[158] = true;
                                                                        }
                                                                        p[159] = true;
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            p[160] = true;
            return false;
        }
        p[161] = true;
        return false;
    }

    /* renamed from: f */
    public boolean mo33919f() {
        boolean[] p = m44041p();
        boolean z = this.f24933R;
        p[22] = true;
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fromJson(java.lang.String r7) throws org.json.JSONException {
        /*
            r6 = this;
            boolean[] r0 = m44041p()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
            r7 = 1
            r2 = 65
            r0[r2] = r7
            java.lang.String r2 = "id"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x001b
            r2 = 66
            r0[r2] = r7
            goto L_0x002a
        L_0x001b:
            r3 = 67
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33910b(r2)
            r2 = 68
            r0[r2] = r7
        L_0x002a:
            java.lang.String r2 = "chat_id"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0037
            r2 = 69
            r0[r2] = r7
            goto L_0x0046
        L_0x0037:
            r3 = 70
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33912c(r2)
            r2 = 71
            r0[r2] = r7
        L_0x0046:
            java.lang.String r2 = "body"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0053
            r2 = 72
            r0[r2] = r7
            goto L_0x0062
        L_0x0053:
            r3 = 73
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33913d(r2)
            r2 = 74
            r0[r2] = r7
        L_0x0062:
            java.lang.String r2 = "sender_name"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x006f
            r2 = 75
            r0[r2] = r7
            goto L_0x007e
        L_0x006f:
            r3 = 76
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33915e(r2)
            r2 = 77
            r0[r2] = r7
        L_0x007e:
            java.lang.String r2 = "sender_avatar_url"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x008b
            r2 = 78
            r0[r2] = r7
            goto L_0x009a
        L_0x008b:
            r3 = 79
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo33918f(r2)
            r2 = 80
            r0[r2] = r7
        L_0x009a:
            java.lang.String r2 = "messaged_at"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00a7
            r2 = 81
            r0[r2] = r7
            goto L_0x00b6
        L_0x00a7:
            r3 = 82
            r0[r3] = r7
            long r2 = r1.getLong(r2)
            r6.mo33909b(r2)
            r2 = 83
            r0[r2] = r7
        L_0x00b6:
            java.lang.String r2 = "read"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00c3
            r2 = 84
            r0[r2] = r7
            goto L_0x00d2
        L_0x00c3:
            r3 = 85
            r0[r3] = r7
            boolean r2 = r1.getBoolean(r2)
            r6.mo33907a(r2)
            r2 = 86
            r0[r2] = r7
        L_0x00d2:
            java.lang.String r2 = "read_at"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00df
            r2 = 87
            r0[r2] = r7
            goto L_0x00ee
        L_0x00df:
            r3 = 88
            r0[r3] = r7
            long r2 = r1.getLong(r2)
            r6.mo33901a(r2)
            r2 = 89
            r0[r2] = r7
        L_0x00ee:
            java.lang.String r2 = "attachments"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00fb
            r2 = 90
            r0[r2] = r7
            goto L_0x010e
        L_0x00fb:
            r3 = 91
            r0[r3] = r7
            org.json.JSONArray r2 = r1.getJSONArray(r2)
            java.util.ArrayList r2 = com.instabug.chat.model.Attachment.fromJson(r2)
            r6.mo33906a(r2)
            r2 = 92
            r0[r2] = r7
        L_0x010e:
            java.lang.String r2 = "actions"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x011b
            r2 = 93
            r0[r2] = r7
            goto L_0x012e
        L_0x011b:
            r3 = 94
            r0[r3] = r7
            org.json.JSONArray r2 = r1.getJSONArray(r2)
            java.util.ArrayList r2 = com.instabug.chat.model.C9423b.m44096a(r2)
            r6.mo33911b(r2)
            r2 = 95
            r0[r2] = r7
        L_0x012e:
            java.lang.String r2 = "direction"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x013b
            r2 = 96
            r0[r2] = r7
            goto L_0x019c
        L_0x013b:
            r3 = 97
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 57076464(0x366eaf0, float:6.786062E-37)
            if (r4 == r5) goto L_0x016a
            r5 = 1941740409(0x73bc9b79, float:2.9886022E31)
            if (r4 == r5) goto L_0x0157
            r2 = 98
            r0[r2] = r7
            goto L_0x0176
        L_0x0157:
            java.lang.String r4 = "inbound"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0164
            r2 = 99
            r0[r2] = r7
            goto L_0x0176
        L_0x0164:
            r2 = 0
            r3 = 100
            r0[r3] = r7
            goto L_0x017d
        L_0x016a:
            java.lang.String r4 = "outbound"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0178
            r2 = 101(0x65, float:1.42E-43)
            r0[r2] = r7
        L_0x0176:
            r2 = -1
            goto L_0x017d
        L_0x0178:
            r2 = 102(0x66, float:1.43E-43)
            r0[r2] = r7
            r2 = 1
        L_0x017d:
            if (r2 == 0) goto L_0x018f
            if (r2 == r7) goto L_0x0188
            com.instabug.chat.model.Message$b r2 = com.instabug.chat.model.Message.C9419b.NOT_AVAILABLE
            r3 = 105(0x69, float:1.47E-43)
            r0[r3] = r7
            goto L_0x0195
        L_0x0188:
            com.instabug.chat.model.Message$b r2 = com.instabug.chat.model.Message.C9419b.OUTBOUND
            r3 = 104(0x68, float:1.46E-43)
            r0[r3] = r7
            goto L_0x0195
        L_0x018f:
            com.instabug.chat.model.Message$b r2 = com.instabug.chat.model.Message.C9419b.INBOUND
            r3 = 103(0x67, float:1.44E-43)
            r0[r3] = r7
        L_0x0195:
            r6.mo33904a(r2)
            r2 = 106(0x6a, float:1.49E-43)
            r0[r2] = r7
        L_0x019c:
            java.lang.String r2 = "messages_state"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x01a9
            r1 = 107(0x6b, float:1.5E-43)
            r0[r1] = r7
            goto L_0x01bc
        L_0x01a9:
            r3 = 108(0x6c, float:1.51E-43)
            r0[r3] = r7
            java.lang.String r1 = r1.getString(r2)
            com.instabug.chat.model.Message$MessageState r1 = com.instabug.chat.model.Message.MessageState.valueOf(r1)
            r6.mo33903a(r1)
            r1 = 109(0x6d, float:1.53E-43)
            r0[r1] = r7
        L_0x01bc:
            r1 = 110(0x6e, float:1.54E-43)
            r0[r1] = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.model.Message.fromJson(java.lang.String):void");
    }

    /* renamed from: g */
    public long mo33920g() {
        boolean[] p = m44041p();
        long j = this.f24934S;
        p[24] = true;
        return j;
    }

    /* renamed from: h */
    public long mo33921h() {
        boolean[] p = m44041p();
        long j = this.f24932Q;
        p[28] = true;
        return j;
    }

    public int hashCode() {
        boolean[] p = m44041p();
        if (mo33908a() != null) {
            p[162] = true;
            int hashCode = mo33908a().hashCode();
            p[163] = true;
            return hashCode;
        }
        p[164] = true;
        return -1;
    }

    /* renamed from: i */
    public String mo33923i() {
        boolean[] p = m44041p();
        String str = this.f24930O;
        p[30] = true;
        return str;
    }

    /* renamed from: j */
    public String mo33924j() {
        boolean[] p = m44041p();
        String str = this.f24931P;
        p[32] = true;
        return str;
    }

    /* renamed from: k */
    public MessageState mo33925k() {
        boolean[] p = m44041p();
        MessageState messageState = this.f24938W;
        p[34] = true;
        return messageState;
    }

    /* renamed from: l */
    public ArrayList<Attachment> mo33926l() {
        boolean[] p = m44041p();
        ArrayList<Attachment> arrayList = this.f24935T;
        p[36] = true;
        return arrayList;
    }

    /* renamed from: m */
    public ArrayList<C9423b> mo33927m() {
        boolean[] p = m44041p();
        ArrayList<C9423b> arrayList = this.f24936U;
        p[39] = true;
        return arrayList;
    }

    /* renamed from: n */
    public C9419b mo33928n() {
        boolean[] p = m44041p();
        C9419b bVar = this.f24937V;
        p[42] = true;
        return bVar;
    }

    /* renamed from: o */
    public boolean mo33929o() {
        boolean z;
        boolean[] p = m44041p();
        C9419b bVar = this.f24937V;
        if (bVar == null) {
            p[46] = true;
        } else if (bVar != C9419b.INBOUND) {
            p[47] = true;
        } else {
            p[48] = true;
            z = true;
            p[50] = true;
            return z;
        }
        z = false;
        p[49] = true;
        p[50] = true;
        return z;
    }

    public String toJson() throws JSONException {
        boolean[] p = m44041p();
        JSONObject jSONObject = new JSONObject();
        p[51] = true;
        JSONObject put = jSONObject.put("id", mo33908a());
        p[52] = true;
        JSONObject put2 = put.put("chat_id", mo33914d());
        p[53] = true;
        JSONObject put3 = put2.put("body", mo33916e());
        p[54] = true;
        JSONObject put4 = put3.put("sender_name", mo33923i());
        p[55] = true;
        JSONObject put5 = put4.put("sender_avatar_url", mo33924j());
        p[56] = true;
        JSONObject put6 = put5.put("messaged_at", mo33921h());
        p[57] = true;
        JSONObject put7 = put6.put("read", mo33919f());
        p[58] = true;
        JSONObject put8 = put7.put("read_at", mo33920g());
        p[59] = true;
        JSONObject put9 = put8.put("messages_state", mo33925k().toString());
        p[60] = true;
        JSONObject put10 = put9.put("direction", mo33928n().toString());
        p[61] = true;
        JSONObject put11 = put10.put(AttachmentEntry.TABLE_NAME, Attachment.toJson(mo33926l()));
        p[62] = true;
        put11.put("actions", C9423b.m44097a(mo33927m()));
        p[63] = true;
        String jSONObject2 = jSONObject.toString();
        p[64] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] p = m44041p();
        StringBuilder sb = new StringBuilder();
        sb.append("Message:[");
        sb.append(this.f24939a);
        String str = ", ";
        sb.append(str);
        sb.append(this.f24940b);
        sb.append(str);
        sb.append(this.f24929N);
        sb.append(str);
        sb.append(this.f24932Q);
        sb.append(str);
        sb.append(this.f24934S);
        sb.append(str);
        sb.append(this.f24930O);
        sb.append(str);
        sb.append(this.f24931P);
        sb.append(str);
        sb.append(this.f24938W);
        sb.append(str);
        sb.append(this.f24937V);
        sb.append(str);
        sb.append(this.f24933R);
        sb.append(str);
        sb.append(this.f24935T);
        sb.append("]");
        String sb2 = sb.toString();
        p[111] = true;
        return sb2;
    }

    /* renamed from: d */
    public Message mo33913d(String str) {
        boolean[] p = m44041p();
        this.f24929N = str;
        p[21] = true;
        return this;
    }

    /* renamed from: e */
    public Message mo33915e(String str) {
        boolean[] p = m44041p();
        this.f24930O = str;
        p[31] = true;
        return this;
    }

    /* renamed from: f */
    public Message mo33918f(String str) {
        boolean[] p = m44041p();
        this.f24931P = str;
        p[33] = true;
        return this;
    }

    public Message(String str) {
        boolean[] p = m44041p();
        this.f24939a = str;
        p[1] = true;
        this.f24935T = new ArrayList<>();
        p[2] = true;
        this.f24936U = new ArrayList<>();
        this.f24937V = C9419b.NOT_AVAILABLE;
        this.f24938W = MessageState.NOT_AVAILABLE;
        p[3] = true;
    }

    /* renamed from: b */
    public Message mo33909b(long j) {
        boolean[] p = m44041p();
        this.f24932Q = j;
        p[29] = true;
        return this;
    }

    /* renamed from: b */
    public Message mo33911b(ArrayList<C9423b> arrayList) {
        boolean[] p = m44041p();
        this.f24936U = arrayList;
        p[40] = true;
        return this;
    }

    /* renamed from: c */
    public Message mo33912c(String str) {
        boolean[] p = m44041p();
        this.f24940b = str;
        p[19] = true;
        return this;
    }

    /* renamed from: a */
    public String mo33908a() {
        boolean[] p = m44041p();
        String str = this.f24939a;
        p[16] = true;
        return str;
    }

    /* renamed from: a */
    public Message mo33907a(boolean z) {
        boolean[] p = m44041p();
        this.f24933R = z;
        p[23] = true;
        return this;
    }

    /* renamed from: a */
    public Message mo33901a(long j) {
        boolean[] p = m44041p();
        this.f24934S = j;
        if (j == 0) {
            p[25] = true;
        } else {
            this.f24933R = true;
            p[26] = true;
        }
        p[27] = true;
        return this;
    }

    /* renamed from: a */
    public Message mo33903a(MessageState messageState) {
        boolean[] p = m44041p();
        this.f24938W = messageState;
        p[35] = true;
        return this;
    }

    /* renamed from: a */
    public Message mo33906a(@C0193h0 ArrayList<Attachment> arrayList) {
        boolean[] p = m44041p();
        this.f24935T = arrayList;
        p[37] = true;
        return this;
    }

    /* renamed from: a */
    public Message mo33902a(Attachment attachment) {
        boolean[] p = m44041p();
        this.f24935T.add(attachment);
        p[38] = true;
        return this;
    }

    /* renamed from: a */
    public Message mo33905a(C9423b bVar) {
        boolean[] p = m44041p();
        this.f24936U.add(bVar);
        p[41] = true;
        return this;
    }

    /* renamed from: a */
    public Message mo33904a(C9419b bVar) {
        boolean[] p = m44041p();
        this.f24937V = bVar;
        if (bVar != C9419b.INBOUND) {
            p[43] = true;
        } else {
            this.f24933R = true;
            p[44] = true;
        }
        p[45] = true;
        return this;
    }
}
