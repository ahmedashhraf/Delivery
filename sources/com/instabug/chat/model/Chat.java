package com.instabug.chat.model;

import android.content.Context;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.instabug.chat.model.Message.C9418a;
import com.instabug.chat.model.Message.MessageState;
import com.instabug.library.C9700R;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.model.BaseReport;
import com.instabug.library.model.State;
import com.instabug.library.model.State.Builder;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.threading.PoolProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class Chat extends BaseReport implements Cacheable, Serializable {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f24917P;

    /* renamed from: N */
    private ArrayList<Message> f24918N;

    /* renamed from: O */
    private ChatState f24919O;

    /* renamed from: a */
    private String f24920a;
    @C0195i0

    /* renamed from: b */
    private State f24921b;

    public enum ChatState {
        WAITING_ATTACHMENT_MESSAGE,
        READY_TO_BE_SENT,
        LOGS_READY_TO_BE_UPLOADED,
        SENT,
        NOT_AVAILABLE;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    /* renamed from: com.instabug.chat.model.Chat$a */
    public static class C9415a implements Serializable, Comparator<Chat> {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24922a;

        public C9415a() {
            m44034a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44034a() {
            boolean[] zArr = f24922a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1068769840958238622L, "com/instabug/chat/model/Chat$Comparator", 5);
            f24922a = a;
            return a;
        }

        /* renamed from: a */
        public int mo33897a(Chat chat, Chat chat2) {
            boolean[] a = m44034a();
            Date date = new Date(chat.mo33893i());
            a[1] = true;
            Date date2 = new Date(chat2.mo33893i());
            a[2] = true;
            int compareTo = date.compareTo(date2);
            a[3] = true;
            return compareTo;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            boolean[] a = m44034a();
            int a2 = mo33897a((Chat) obj, (Chat) obj2);
            a[4] = true;
            return a2;
        }
    }

    /* renamed from: com.instabug.chat.model.Chat$b */
    public static class C9416b {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24923a;

        /* renamed from: com.instabug.chat.model.Chat$b$a */
        class C9417a implements Runnable {

            /* renamed from: O */
            private static transient /* synthetic */ boolean[] f24924O;

            /* renamed from: N */
            final /* synthetic */ C9416b f24925N;

            /* renamed from: a */
            final /* synthetic */ Chat f24926a;

            /* renamed from: b */
            final /* synthetic */ Context f24927b;

            C9417a(C9416b bVar, Chat chat, Context context) {
                boolean[] a = m44038a();
                this.f24925N = bVar;
                this.f24926a = chat;
                this.f24927b = context;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44038a() {
                boolean[] zArr = f24924O;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-8742201877542715385L, "com/instabug/chat/model/Chat$Factory$1", 2);
                f24924O = a;
                return a;
            }

            public void run() {
                boolean[] a = m44038a();
                this.f24926a.mo33880a(new Builder(this.f24927b).build(true));
                a[1] = true;
            }
        }

        public C9416b() {
            m44036a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44036a() {
            boolean[] zArr = f24923a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9079060315711358433L, "com/instabug/chat/model/Chat$Factory", 3);
            f24923a = a;
            return a;
        }

        /* renamed from: a */
        public Chat mo33899a(Context context) {
            boolean[] a = m44036a();
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append("");
            Chat chat = new Chat(sb.toString(), null, ChatState.READY_TO_BE_SENT);
            a[1] = true;
            PoolProvider.postIOTask(new C9417a(this, chat, context));
            a[2] = true;
            return chat;
        }
    }

    public Chat(@C0193h0 String str, @C0193h0 State state, @C0193h0 ChatState chatState) {
        boolean[] n = m44019n();
        this.f24920a = str;
        this.f24921b = state;
        this.f24919O = chatState;
        n[0] = true;
        this.f24918N = new ArrayList<>();
        n[1] = true;
    }

    @C0195i0
    /* renamed from: l */
    private Message m44017l() {
        boolean[] n = m44019n();
        Message k = mo33895k();
        n[36] = true;
        if (k == null) {
            n[37] = true;
        } else if (!k.mo33929o()) {
            n[38] = true;
        } else {
            n[39] = true;
            Iterator it = this.f24918N.iterator();
            n[40] = true;
            while (it.hasNext()) {
                Message message = (Message) it.next();
                n[41] = true;
                if (!message.mo33929o()) {
                    n[42] = true;
                    return message;
                }
                n[43] = true;
            }
            n[44] = true;
            return null;
        }
        n[45] = true;
        return k;
    }

    /* renamed from: m */
    private void m44018m() {
        boolean[] n = m44019n();
        n[59] = true;
        int i = 0;
        while (i < mo33883a().size()) {
            n[60] = true;
            ((Message) mo33883a().get(i)).mo33912c(this.f24920a);
            i++;
            n[61] = true;
        }
        n[62] = true;
    }

    /* renamed from: n */
    private static /* synthetic */ boolean[] m44019n() {
        boolean[] zArr = f24917P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5424719182620885658L, "com/instabug/chat/model/Chat", C13959t.f40823O1);
        f24917P = a;
        return a;
    }

    /* renamed from: a */
    public ArrayList<Message> mo33883a() {
        boolean[] n = m44019n();
        ArrayList<Message> arrayList = this.f24918N;
        n[10] = true;
        return arrayList;
    }

    /* renamed from: b */
    public Chat mo33884b(String str) {
        boolean[] n = m44019n();
        this.f24920a = str;
        n[8] = true;
        m44018m();
        n[9] = true;
        return this;
    }

    /* renamed from: d */
    public ChatState mo33885d() {
        boolean[] n = m44019n();
        ChatState chatState = this.f24919O;
        n[15] = true;
        return chatState;
    }

    /* renamed from: e */
    public int mo33886e() {
        boolean[] n = m44019n();
        n[17] = true;
        Iterator it = this.f24918N.iterator();
        n[18] = true;
        int i = 0;
        while (it.hasNext()) {
            Message message = (Message) it.next();
            n[19] = true;
            if (message.mo33919f()) {
                n[20] = true;
            } else {
                i++;
                n[21] = true;
            }
            n[22] = true;
        }
        n[23] = true;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean[] r0 = m44019n()
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L_0x000d
            r7 = 101(0x65, float:1.42E-43)
            r0[r7] = r2
            goto L_0x0015
        L_0x000d:
            boolean r3 = r7 instanceof com.instabug.chat.model.Chat
            if (r3 != 0) goto L_0x001a
            r7 = 102(0x66, float:1.43E-43)
            r0[r7] = r2
        L_0x0015:
            r7 = 120(0x78, float:1.68E-43)
            r0[r7] = r2
            return r1
        L_0x001a:
            com.instabug.chat.model.Chat r7 = (com.instabug.chat.model.Chat) r7
            r3 = 103(0x67, float:1.44E-43)
            r0[r3] = r2
            java.lang.String r3 = r7.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.getId()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0037
            r7 = 104(0x68, float:1.46E-43)
            r0[r7] = r2
            goto L_0x007e
        L_0x0037:
            r3 = 105(0x69, float:1.47E-43)
            r0[r3] = r2
            com.instabug.chat.model.Chat$ChatState r3 = r7.mo33885d()
            com.instabug.chat.model.Chat$ChatState r4 = r6.mo33885d()
            if (r3 == r4) goto L_0x004a
            r7 = 106(0x6a, float:1.49E-43)
            r0[r7] = r2
            goto L_0x007e
        L_0x004a:
            r3 = 107(0x6b, float:1.5E-43)
            r0[r3] = r2
            com.instabug.library.model.State r3 = r7.getState()
            if (r3 == 0) goto L_0x0059
            r3 = 108(0x6c, float:1.51E-43)
            r0[r3] = r2
            goto L_0x0068
        L_0x0059:
            com.instabug.library.model.State r3 = r6.getState()
            if (r3 != 0) goto L_0x0064
            r3 = 109(0x6d, float:1.53E-43)
            r0[r3] = r2
            goto L_0x0087
        L_0x0064:
            r3 = 110(0x6e, float:1.54E-43)
            r0[r3] = r2
        L_0x0068:
            r3 = 111(0x6f, float:1.56E-43)
            r0[r3] = r2
            com.instabug.library.model.State r3 = r7.getState()
            com.instabug.library.model.State r4 = r6.getState()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0083
            r7 = 112(0x70, float:1.57E-43)
            r0[r7] = r2
        L_0x007e:
            r7 = 119(0x77, float:1.67E-43)
            r0[r7] = r2
            return r1
        L_0x0083:
            r3 = 113(0x71, float:1.58E-43)
            r0[r3] = r2
        L_0x0087:
            r3 = 114(0x72, float:1.6E-43)
            r0[r3] = r2
            r3 = 0
        L_0x008c:
            java.util.ArrayList r4 = r7.mo33883a()
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x00be
            r4 = 115(0x73, float:1.61E-43)
            r0[r4] = r2
            java.util.ArrayList r4 = r7.mo33883a()
            java.lang.Object r4 = r4.get(r3)
            com.instabug.chat.model.Message r4 = (com.instabug.chat.model.Message) r4
            java.util.ArrayList r5 = r6.mo33883a()
            java.lang.Object r5 = r5.get(r3)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b7
            r7 = 116(0x74, float:1.63E-43)
            r0[r7] = r2
            return r1
        L_0x00b7:
            int r3 = r3 + 1
            r4 = 117(0x75, float:1.64E-43)
            r0[r4] = r2
            goto L_0x008c
        L_0x00be:
            r7 = 118(0x76, float:1.65E-43)
            r0[r7] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.model.Chat.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public void mo33888f() {
        boolean[] n = m44019n();
        int size = this.f24918N.size() - 1;
        n[24] = true;
        while (size >= 0) {
            n[25] = true;
            ((Message) this.f24918N.get(size)).mo33907a(true);
            size--;
            n[26] = true;
        }
        n[27] = true;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] n = m44019n();
        JSONObject jSONObject = new JSONObject(str);
        n[84] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            n[85] = true;
        } else {
            n[86] = true;
            mo33884b(jSONObject.getString(str2));
            n[87] = true;
        }
        String str3 = "messages";
        if (!jSONObject.has(str3)) {
            n[88] = true;
        } else {
            n[89] = true;
            mo33881a(Message.m44039a(jSONObject.getJSONArray(str3)));
            n[90] = true;
        }
        String str4 = "chat_state";
        if (!jSONObject.has(str4)) {
            n[91] = true;
        } else {
            n[92] = true;
            mo33879a(ChatState.valueOf(jSONObject.getString(str4)));
            n[93] = true;
        }
        String str5 = "state";
        if (!jSONObject.has(str5)) {
            n[94] = true;
        } else {
            n[95] = true;
            State state = new State();
            n[96] = true;
            state.fromJson(jSONObject.getString(str5));
            n[97] = true;
            mo33880a(state);
            n[98] = true;
        }
        n[99] = true;
    }

    @C0195i0
    /* renamed from: g */
    public String mo33889g() {
        boolean[] n = m44019n();
        Message l = m44017l();
        if (l != null) {
            n[28] = true;
            String j = l.mo33924j();
            n[29] = true;
            return j;
        }
        n[30] = true;
        return null;
    }

    public String getId() {
        boolean[] n = m44019n();
        String str = this.f24920a;
        n[7] = true;
        return str;
    }

    @C0195i0
    public State getState() {
        boolean[] n = m44019n();
        State state = this.f24921b;
        n[13] = true;
        return state;
    }

    /* renamed from: h */
    public String mo33891h() {
        boolean[] n = m44019n();
        Message l = m44017l();
        if (l != null) {
            n[31] = true;
            String i = l.mo33923i();
            n[32] = true;
            return i;
        } else if (this.f24918N.size() != 0) {
            n[33] = true;
            ArrayList<Message> arrayList = this.f24918N;
            String i2 = ((Message) arrayList.get(arrayList.size() - 1)).mo33923i();
            n[34] = true;
            return i2;
        } else {
            n[35] = true;
            return "";
        }
    }

    public int hashCode() {
        boolean[] n = m44019n();
        if (getId() != null) {
            n[121] = true;
            int hashCode = getId().hashCode();
            n[122] = true;
            return hashCode;
        }
        n[123] = true;
        return -1;
    }

    /* renamed from: i */
    public long mo33893i() {
        boolean[] n = m44019n();
        if (mo33894j() != null) {
            n[46] = true;
            long h = mo33894j().mo33921h();
            n[47] = true;
            return h;
        }
        n[48] = true;
        return 0;
    }

    @C0195i0
    /* renamed from: j */
    public Message mo33894j() {
        boolean[] n = m44019n();
        if (this.f24918N.size() != 0) {
            n[49] = true;
            Collections.sort(this.f24918N, new C9418a(2));
            n[50] = true;
            ArrayList<Message> arrayList = this.f24918N;
            Message message = (Message) arrayList.get(arrayList.size() - 1);
            n[51] = true;
            return message;
        }
        n[52] = true;
        return null;
    }

    @C0195i0
    /* renamed from: k */
    public Message mo33895k() {
        boolean[] n = m44019n();
        int size = this.f24918N.size() - 1;
        n[53] = true;
        while (size >= 0) {
            n[54] = true;
            if (((Message) this.f24918N.get(size)).mo33925k() == MessageState.SYNCED) {
                n[55] = true;
                Message message = (Message) this.f24918N.get(size);
                n[56] = true;
                return message;
            }
            size--;
            n[57] = true;
        }
        n[58] = true;
        return null;
    }

    public /* synthetic */ BaseReport setId(String str) {
        boolean[] n = m44019n();
        Chat b = mo33884b(str);
        n[125] = true;
        return b;
    }

    public /* synthetic */ BaseReport setState(@C0195i0 State state) {
        boolean[] n = m44019n();
        Chat a = mo33880a(state);
        n[124] = true;
        return a;
    }

    public String toJson() throws JSONException {
        boolean[] n = m44019n();
        JSONObject jSONObject = new JSONObject();
        n[76] = true;
        JSONObject put = jSONObject.put("id", getId());
        n[77] = true;
        JSONObject put2 = put.put("messages", Message.m44040c(mo33883a()));
        n[78] = true;
        put2.put("chat_state", mo33885d().toString());
        n[79] = true;
        if (getState() == null) {
            n[80] = true;
        } else {
            n[81] = true;
            jSONObject.put("state", getState().toJson());
            n[82] = true;
        }
        String jSONObject2 = jSONObject.toString();
        n[83] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] n = m44019n();
        StringBuilder sb = new StringBuilder();
        sb.append("Chat:[");
        sb.append(this.f24920a);
        sb.append(" chatState: ");
        sb.append(mo33885d());
        sb.append(", ");
        sb.append(this.f24918N);
        sb.append("]");
        String sb2 = sb.toString();
        n[100] = true;
        return sb2;
    }

    /* renamed from: a */
    public Chat mo33881a(ArrayList<Message> arrayList) {
        boolean[] n = m44019n();
        this.f24918N = arrayList;
        n[11] = true;
        m44018m();
        n[12] = true;
        return this;
    }

    /* renamed from: a */
    public Chat mo33880a(@C0195i0 State state) {
        boolean[] n = m44019n();
        this.f24921b = state;
        n[14] = true;
        return this;
    }

    public Chat(@C0193h0 String str) {
        boolean[] n = m44019n();
        this.f24920a = str;
        n[2] = true;
        this.f24918N = new ArrayList<>();
        n[3] = true;
        mo33879a(ChatState.SENT);
        n[4] = true;
    }

    /* renamed from: a */
    public Chat mo33879a(ChatState chatState) {
        boolean[] n = m44019n();
        this.f24919O = chatState;
        n[16] = true;
        return this;
    }

    /* renamed from: a */
    public String mo33882a(Context context) {
        boolean[] n = m44019n();
        String h = mo33891h();
        n[63] = true;
        if (h == null) {
            n[64] = true;
        } else if (h.equals("")) {
            n[65] = true;
        } else if (h.equals(C3868i.f12248b)) {
            n[66] = true;
        } else {
            n[67] = true;
            if (h.equals("null")) {
                n[68] = true;
            } else if (mo33894j() == null) {
                n[69] = true;
            } else {
                n[70] = true;
                if (mo33894j().mo33929o()) {
                    n[71] = true;
                } else {
                    n[72] = true;
                    return h;
                }
            }
        }
        String string = context.getString(C9700R.string.instabug_str_notification_title);
        InstabugAppData instabugAppData = new InstabugAppData(context);
        n[73] = true;
        Object[] objArr = {instabugAppData.getAppName()};
        n[74] = true;
        String format = String.format(string, objArr);
        n[75] = true;
        return format;
    }

    public Chat() {
        boolean[] n = m44019n();
        this.f24919O = ChatState.NOT_AVAILABLE;
        n[5] = true;
        this.f24918N = new ArrayList<>();
        n[6] = true;
    }
}
