package com.instabug.chat.synchronization;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0195i0;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.model.Chat;
import com.instabug.chat.model.Message;
import com.instabug.chat.model.Message.MessageState;
import com.instabug.chat.settings.C9441a;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.synchronization.a */
/* compiled from: NewMessagesHandler */
public class C9448a {

    /* renamed from: b */
    private static C9448a f25032b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25033c;

    /* renamed from: a */
    private List<C9449b> f25034a = new ArrayList();

    public C9448a() {
        boolean[] c = m44272c();
        c[0] = true;
        c[1] = true;
    }

    /* renamed from: a */
    public static C9448a m44260a() {
        boolean[] c = m44272c();
        if (f25032b != null) {
            c[2] = true;
        } else {
            c[3] = true;
            f25032b = new C9448a();
            c[4] = true;
        }
        C9448a aVar = f25032b;
        c[5] = true;
        return aVar;
    }

    /* renamed from: b */
    private void m44269b(Context context, List<Message> list) {
        boolean[] c = m44272c();
        InstabugSDKLogger.m46626v(this, "START Invalidate Cache");
        c[34] = true;
        List notSentMessages = ChatsCacheManager.getNotSentMessages();
        c[35] = true;
        InMemoryCache cache = ChatsCacheManager.getCache();
        if (cache == null) {
            c[36] = true;
        } else {
            c[37] = true;
            cache.invalidate();
            c[38] = true;
        }
        InstabugSDKLogger.m46626v(this, "finish Invalidate Cache");
        c[39] = true;
        List a = m44262a(list, notSentMessages);
        c[40] = true;
        m44264a(context, a);
        c[41] = true;
    }

    @C0195i0
    /* renamed from: c */
    private Message m44271c(Message message) {
        boolean[] c = m44272c();
        List<Message> b = m44267b(message);
        if (b == null) {
            c[89] = true;
        } else {
            c[90] = true;
            c[91] = true;
            for (Message message2 : b) {
                c[93] = true;
                if (message2.mo33908a().equals(message.mo33908a())) {
                    c[94] = true;
                    return message2;
                }
                c[95] = true;
            }
            c[92] = true;
        }
        c[96] = true;
        return null;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m44272c() {
        boolean[] zArr = f25033c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1127115774808672670L, "com/instabug/chat/synchronization/NewMessagesHandler", 252);
        f25033c = a;
        return a;
    }

    /* renamed from: d */
    private boolean m44273d(Message message) {
        boolean z;
        boolean[] c = m44272c();
        if (m44271c(message) == null) {
            c[97] = true;
            z = true;
        } else {
            z = false;
            c[98] = true;
        }
        c[99] = true;
        return z;
    }

    /* renamed from: e */
    private void m44274e(Message message) {
        boolean[] c = m44272c();
        Chat a = m44259a(message);
        if (a != null) {
            c[100] = true;
        } else {
            c[101] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Chat with id ");
            sb.append(message.mo33914d());
            sb.append(" doesn't exist, creating new one");
            InstabugSDKLogger.m46626v(this, sb.toString());
            c[102] = true;
            a = new Chat(message.mo33914d());
            c[103] = true;
        }
        a.mo33883a().add(message);
        c[104] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Message ");
        sb2.append(message);
        sb2.append(" added to cached chat: ");
        sb2.append(a);
        InstabugSDKLogger.m46622d(this, sb2.toString());
        c[105] = true;
        InMemoryCache cache = ChatsCacheManager.getCache();
        if (cache == null) {
            c[106] = true;
        } else {
            c[107] = true;
            cache.put(a.getId(), a);
            c[108] = true;
        }
        c[109] = true;
    }

    /* renamed from: f */
    private boolean m44275f(Message message) {
        boolean z;
        boolean[] c = m44272c();
        Message c2 = m44271c(message);
        if (c2 == null) {
            c[110] = true;
        } else {
            c[111] = true;
            if (!c2.mo33908a().equals(message.mo33908a())) {
                c[112] = true;
            } else {
                c[113] = true;
                if (!c2.mo33925k().equals(MessageState.SYNCED)) {
                    c[114] = true;
                } else {
                    c[115] = true;
                    if (c2.mo33926l().size() != message.mo33926l().size()) {
                        c[116] = true;
                    } else {
                        c[117] = true;
                        z = true;
                        c[119] = true;
                        return z;
                    }
                }
            }
        }
        z = false;
        c[118] = true;
        c[119] = true;
        return z;
    }

    /* renamed from: g */
    private boolean m44276g(Message message) {
        boolean z;
        boolean[] c = m44272c();
        Message c2 = m44271c(message);
        if (c2 == null) {
            c[120] = true;
        } else {
            c[121] = true;
            if (!c2.mo33908a().equals(message.mo33908a())) {
                c[122] = true;
            } else {
                c[123] = true;
                if (!c2.mo33925k().equals(MessageState.READY_TO_BE_SYNCED)) {
                    c[124] = true;
                } else {
                    c[125] = true;
                    if (c2.mo33926l().size() != message.mo33926l().size()) {
                        c[126] = true;
                    } else {
                        c[127] = true;
                        z = true;
                        c[129] = true;
                        return z;
                    }
                }
            }
        }
        z = false;
        c[128] = true;
        c[129] = true;
        return z;
    }

    /* renamed from: h */
    private boolean m44277h(Message message) {
        boolean z;
        boolean[] c = m44272c();
        Message c2 = m44271c(message);
        if (c2 == null) {
            c[130] = true;
        } else {
            c[131] = true;
            if (!c2.mo33908a().equals(message.mo33908a())) {
                c[132] = true;
            } else {
                c[133] = true;
                if (!c2.mo33925k().equals(MessageState.SENT)) {
                    c[134] = true;
                } else {
                    c[135] = true;
                    if (c2.mo33926l().size() == message.mo33926l().size()) {
                        c[136] = true;
                    } else {
                        c[137] = true;
                        z = true;
                        c[139] = true;
                        return z;
                    }
                }
            }
        }
        z = false;
        c[138] = true;
        c[139] = true;
        return z;
    }

    /* renamed from: a */
    public void mo34049a(Context context, boolean z, JSONObject... jSONObjectArr) {
        boolean[] c = m44272c();
        List a = m44263a(jSONObjectArr);
        c[6] = true;
        List a2 = m44261a(a);
        if (z) {
            c[7] = true;
            m44269b(context, a);
            c[8] = true;
        } else {
            m44264a(context, a);
            c[9] = true;
        }
        if (a2.size() <= 0) {
            c[10] = true;
        } else {
            c[11] = true;
            m44268b();
            c[12] = true;
        }
        if (this.f25034a.size() > 0) {
            c[13] = true;
            m44270b(a2);
            c[15] = true;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No one is listening for unread messages");
        c[14] = true;
        throw illegalStateException;
    }

    @C0195i0
    /* renamed from: b */
    private Message m44266b(Message message, List<Message> list) {
        boolean[] c = m44272c();
        c[60] = true;
        for (Message message2 : list) {
            c[61] = true;
            if (message.mo33908a().equals(message2.mo33908a())) {
                c[62] = true;
                return message2;
            }
            c[63] = true;
        }
        c[64] = true;
        return null;
    }

    /* renamed from: a */
    private void m44264a(Context context, List<Message> list) {
        boolean[] c = m44272c();
        StringBuilder sb = new StringBuilder();
        sb.append("new messages count: ");
        c[16] = true;
        sb.append(list.size());
        String sb2 = sb.toString();
        c[17] = true;
        InstabugSDKLogger.m46626v(this, sb2);
        c[18] = true;
        c[19] = true;
        for (Message message : list) {
            c[20] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("new message to updating: ");
            sb3.append(message.toString());
            InstabugSDKLogger.m46626v(this, sb3.toString());
            c[21] = true;
            if (m44273d(message)) {
                c[22] = true;
                m44274e(message);
                c[23] = true;
            } else if (!m44276g(message)) {
                c[24] = true;
            } else {
                c[25] = true;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Message:");
                sb4.append(message);
                sb4.append(" is ready to be synced");
                InstabugSDKLogger.m46626v(this, sb4.toString());
                try {
                    c[26] = true;
                    ChatsCacheManager.updateLocalMessageWithSyncedMessage(context, message);
                    c[27] = true;
                } catch (IOException e) {
                    c[28] = true;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to update local message: ");
                    c[29] = true;
                    sb5.append(m44271c(message));
                    sb5.append(" with synced message: ");
                    sb5.append(message);
                    String sb6 = sb5.toString();
                    c[30] = true;
                    InstabugSDKLogger.m46624e(this, sb6, e);
                    c[31] = true;
                }
            }
            c[32] = true;
        }
        c[33] = true;
    }

    @C0195i0
    /* renamed from: b */
    private List<Message> m44267b(Message message) {
        boolean[] c = m44272c();
        Chat a = m44259a(message);
        if (a == null) {
            c[87] = true;
            return null;
        }
        ArrayList a2 = a.mo33883a();
        c[88] = true;
        return a2;
    }

    /* renamed from: b */
    private void m44270b(List<Message> list) {
        Integer num;
        boolean[] c = m44272c();
        if (C9441a.m44203f()) {
            c[140] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Number of listeners to notify ");
            List<C9449b> list2 = this.f25034a;
            c[141] = true;
            sb.append(list2.size());
            String sb2 = sb.toString();
            c[142] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[143] = true;
            int size = this.f25034a.size() - 1;
            c[144] = true;
            while (true) {
                if (size < 0) {
                    c[145] = true;
                    break;
                }
                c[146] = true;
                C9449b bVar = (C9449b) this.f25034a.get(size);
                c[147] = true;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Notifying listener ");
                sb3.append(bVar);
                InstabugSDKLogger.m46622d(this, sb3.toString());
                c[148] = true;
                if (list == null) {
                    c[149] = true;
                    break;
                } else if (list.size() <= 0) {
                    c[150] = true;
                    break;
                } else {
                    c[151] = true;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Notifying listener with ");
                    sb4.append(list.size());
                    sb4.append(" message(s)");
                    InstabugSDKLogger.m46622d(this, sb4.toString());
                    c[152] = true;
                    list = bVar.onNewMessagesReceived(list);
                    c[153] = true;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Notified listener remained ");
                    if (list != null) {
                        c[154] = true;
                        num = Integer.valueOf(list.size());
                        c[155] = true;
                    } else {
                        num = null;
                        c[156] = true;
                    }
                    sb5.append(num);
                    sb5.append(" message(s) to be sent to next listener");
                    String sb6 = sb5.toString();
                    c[157] = true;
                    InstabugSDKLogger.m46622d(this, sb6);
                    size--;
                    c[158] = true;
                }
            }
            c[159] = true;
        } else {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Chat notification disabled, messages that would not be notified ");
            sb7.append(list);
            InstabugSDKLogger.m46626v(this, sb7.toString());
            c[160] = true;
        }
        c[161] = true;
    }

    /* renamed from: a */
    private List<Message> m44262a(List<Message> list, List<Message> list2) {
        boolean[] c = m44272c();
        ArrayList arrayList = new ArrayList(list);
        c[42] = true;
        c[43] = true;
        for (Message message : list2) {
            c[44] = true;
            if (!m44265a(message, list)) {
                c[45] = true;
            } else {
                c[46] = true;
                arrayList.add(message);
                c[47] = true;
            }
            if (message.mo33925k() != MessageState.SENT) {
                c[48] = true;
            } else {
                c[49] = true;
                if (m44266b(message, list) == null) {
                    c[50] = true;
                } else {
                    c[51] = true;
                    arrayList.remove(m44266b(message, list));
                    c[52] = true;
                }
            }
            c[53] = true;
        }
        c[54] = true;
        return arrayList;
    }

    /* renamed from: b */
    public void mo34051b(C9449b bVar) {
        boolean[] c = m44272c();
        this.f25034a.remove(bVar);
        c[166] = true;
    }

    /* renamed from: b */
    private void m44268b() {
        boolean[] c = m44272c();
        if (C9441a.m44181a() == null) {
            c[245] = true;
        } else {
            try {
                c[246] = true;
                Handler handler = new Handler(Looper.getMainLooper());
                c[247] = true;
                handler.post(C9441a.m44181a());
                c[248] = true;
            } catch (Exception e) {
                c[249] = true;
                InstabugSDKLogger.m46624e(this, "new message runnable failed to run.", e);
                c[250] = true;
            }
        }
        c[251] = true;
    }

    /* renamed from: a */
    private boolean m44265a(Message message, List<Message> list) {
        boolean[] c = m44272c();
        c[55] = true;
        for (Message message2 : list) {
            c[56] = true;
            if (message.mo33914d().equals(message2.mo33914d())) {
                c[57] = true;
                return true;
            }
            c[58] = true;
        }
        c[59] = true;
        return false;
    }

    /* renamed from: a */
    private List<Message> m44261a(List<Message> list) {
        boolean[] c = m44272c();
        ArrayList arrayList = new ArrayList(list);
        c[65] = true;
        c[66] = true;
        for (Message message : list) {
            c[67] = true;
            if (m44275f(message)) {
                c[68] = true;
            } else {
                c[69] = true;
                if (m44276g(message)) {
                    c[70] = true;
                } else {
                    c[71] = true;
                    if (m44277h(message)) {
                        c[72] = true;
                    } else {
                        c[73] = true;
                        if (message.mo33929o()) {
                            c[74] = true;
                        } else {
                            c[75] = true;
                            if (!message.mo33919f()) {
                                c[76] = true;
                                c[80] = true;
                            } else {
                                c[77] = true;
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Message ");
            sb.append(message.toString());
            sb.append(" removed from list to be notified");
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[78] = true;
            arrayList.remove(message);
            c[79] = true;
            c[80] = true;
        }
        c[81] = true;
        return arrayList;
    }

    @C0195i0
    /* renamed from: a */
    private Chat m44259a(Message message) {
        boolean[] c = m44272c();
        InMemoryCache cache = ChatsCacheManager.getCache();
        if (cache == null) {
            c[82] = true;
        } else {
            c[83] = true;
            Chat chat = (Chat) cache.get(message.mo33914d());
            if (chat == null) {
                c[84] = true;
            } else {
                c[85] = true;
                return chat;
            }
        }
        InstabugSDKLogger.m46626v(this, "No local chats match messages's chat");
        c[86] = true;
        return null;
    }

    /* renamed from: a */
    public void mo34050a(C9449b bVar) {
        boolean[] c = m44272c();
        if (this.f25034a.contains(bVar)) {
            c[162] = true;
        } else {
            c[163] = true;
            this.f25034a.add(bVar);
            c[164] = true;
        }
        c[165] = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x023c, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x027b, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x027c, code lost:
        if (r6 == 0) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027e, code lost:
        if (r6 == r7) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0281, code lost:
        if (r6 == 2) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0284, code lost:
        if (r6 == 3) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0286, code lost:
        r4[226(0xe2)] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028b, code lost:
        r15.setType(r1);
        r4[232(0xe8)] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0293, code lost:
        r15.setType(r1);
        r4[231(0xe7)] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029b, code lost:
        r15.setType(r12);
        r4[230(0xe6)] = r7;
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a4, code lost:
        r15.setType(r13);
        r7 = true;
        r4[227(0xe3)] = true;
        r1 = r14.getString("duration");
        r4[228(0xe4)] = true;
        r15.setDuration(r1);
        r4[229(0xe5)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02bd, code lost:
        r11.mo33926l().add(r15);
        r0 = r0 - 1;
        r4[233(0xe9)] = r7;
        r1 = r20;
        r6 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02db A[Catch:{ JSONException -> 0x0312 }, LOOP:2: B:101:0x02d9->B:102:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0108 A[Catch:{ JSONException -> 0x0312 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010d A[Catch:{ JSONException -> 0x0312 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017b A[Catch:{ JSONException -> 0x0312 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x019c A[Catch:{ JSONException -> 0x0312 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b3 A[Catch:{ JSONException -> 0x0312 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c5 A[Catch:{ JSONException -> 0x0312 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01da A[Catch:{ JSONException -> 0x0312 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.instabug.chat.model.Message> m44263a(org.json.JSONObject[] r20) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r2 = "read_at"
            java.lang.String r3 = "messaged_at"
            boolean[] r4 = m44272c()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 1
            r0 = 167(0xa7, float:2.34E-43)
            r4[r0] = r6
            r8 = 0
        L_0x0015:
            int r0 = r1.length
            if (r8 >= r0) goto L_0x033c
            r0 = 168(0xa8, float:2.35E-43)
            r4[r0] = r6     // Catch:{ JSONException -> 0x0312 }
            r0 = r1[r8]     // Catch:{ JSONException -> 0x0312 }
            r9 = 169(0xa9, float:2.37E-43)
            r4[r9] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r9 = "attachments"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x0312 }
            r10 = 170(0xaa, float:2.38E-43)
            r4[r10] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r10 = "actions"
            org.json.JSONArray r10 = r0.getJSONArray(r10)     // Catch:{ JSONException -> 0x0312 }
            r11 = 171(0xab, float:2.4E-43)
            r4[r11] = r6     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message r11 = new com.instabug.chat.model.Message     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "id"
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x0312 }
            r11.<init>(r12)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "chat_number"
            r13 = 172(0xac, float:2.41E-43)
            r4[r13] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message r11 = r11.mo33912c(r12)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "body"
            r13 = 173(0xad, float:2.42E-43)
            r4[r13] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message r11 = r11.mo33913d(r12)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "from"
            r13 = 174(0xae, float:2.44E-43)
            r4[r13] = r6     // Catch:{ JSONException -> 0x0312 }
            org.json.JSONObject r12 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r13 = "name"
            java.lang.String r12 = r12.getString(r13)     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message r11 = r11.mo33915e(r12)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "avatar"
            r13 = 175(0xaf, float:2.45E-43)
            r4[r13] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r12)     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message r11 = r11.mo33918f(r12)     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message$MessageState r12 = com.instabug.chat.model.Message.MessageState.SYNCED     // Catch:{ JSONException -> 0x0312 }
            r13 = 176(0xb0, float:2.47E-43)
            r4[r13] = r6     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Message r11 = r11.mo33903a(r12)     // Catch:{ JSONException -> 0x0312 }
            r12 = 177(0xb1, float:2.48E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r3)     // Catch:{ JSONException -> 0x0312 }
            r13 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r15 = "null"
            java.lang.String r7 = ""
            if (r12 != 0) goto L_0x00a1
            r12 = 178(0xb2, float:2.5E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
        L_0x009d:
            r18 = r7
            r12 = 1
            goto L_0x0102
        L_0x00a1:
            r12 = 179(0xb3, float:2.51E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r3)     // Catch:{ JSONException -> 0x0312 }
            boolean r12 = r12.equals(r7)     // Catch:{ JSONException -> 0x0312 }
            if (r12 == 0) goto L_0x00b4
            r12 = 180(0xb4, float:2.52E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            goto L_0x009d
        L_0x00b4:
            r12 = 181(0xb5, float:2.54E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r3)     // Catch:{ JSONException -> 0x0312 }
            boolean r12 = r12.equals(r15)     // Catch:{ JSONException -> 0x0312 }
            if (r12 == 0) goto L_0x00c7
            r12 = 182(0xb6, float:2.55E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            goto L_0x009d
        L_0x00c7:
            r12 = 183(0xb7, float:2.56E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r3)     // Catch:{ JSONException -> 0x0312 }
            java.util.Date r12 = com.instabug.library.util.InstabugDateFormatter.getDate(r12)     // Catch:{ JSONException -> 0x0312 }
            if (r12 != 0) goto L_0x00da
            r12 = 184(0xb8, float:2.58E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            goto L_0x009d
        L_0x00da:
            r12 = 185(0xb9, float:2.59E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = r0.getString(r3)     // Catch:{ JSONException -> 0x0312 }
            r16 = 186(0xba, float:2.6E-43)
            r4[r16] = r6     // Catch:{ JSONException -> 0x0312 }
            java.util.Date r12 = com.instabug.library.util.InstabugDateFormatter.getDate(r12)     // Catch:{ JSONException -> 0x0312 }
            r16 = 187(0xbb, float:2.62E-43)
            r4[r16] = r6     // Catch:{ JSONException -> 0x0312 }
            long r16 = r12.getTime()     // Catch:{ JSONException -> 0x0312 }
            r18 = r7
            long r6 = r16 / r13
            r16 = 188(0xbc, float:2.63E-43)
            r12 = 1
            r4[r16] = r12     // Catch:{ JSONException -> 0x0312 }
            r11.mo33909b(r6)     // Catch:{ JSONException -> 0x0312 }
            r6 = 189(0xbd, float:2.65E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
        L_0x0102:
            java.lang.String r6 = r0.getString(r2)     // Catch:{ JSONException -> 0x0312 }
            if (r6 != 0) goto L_0x010d
            r6 = 190(0xbe, float:2.66E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            goto L_0x016c
        L_0x010d:
            r6 = 191(0xbf, float:2.68E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r6 = r0.getString(r2)     // Catch:{ JSONException -> 0x0312 }
            r7 = r18
            boolean r6 = r6.equals(r7)     // Catch:{ JSONException -> 0x0312 }
            if (r6 == 0) goto L_0x0122
            r6 = 192(0xc0, float:2.69E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            goto L_0x016c
        L_0x0122:
            r6 = 193(0xc1, float:2.7E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r6 = r0.getString(r2)     // Catch:{ JSONException -> 0x0312 }
            boolean r6 = r6.equals(r15)     // Catch:{ JSONException -> 0x0312 }
            if (r6 == 0) goto L_0x0135
            r6 = 194(0xc2, float:2.72E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            goto L_0x016c
        L_0x0135:
            r6 = 195(0xc3, float:2.73E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r6 = r0.getString(r2)     // Catch:{ JSONException -> 0x0312 }
            java.util.Date r6 = com.instabug.library.util.InstabugDateFormatter.getDate(r6)     // Catch:{ JSONException -> 0x0312 }
            if (r6 != 0) goto L_0x0148
            r6 = 196(0xc4, float:2.75E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            goto L_0x016c
        L_0x0148:
            r6 = 197(0xc5, float:2.76E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r6 = r0.getString(r2)     // Catch:{ JSONException -> 0x0312 }
            r7 = 198(0xc6, float:2.77E-43)
            r4[r7] = r12     // Catch:{ JSONException -> 0x0312 }
            java.util.Date r6 = com.instabug.library.util.InstabugDateFormatter.getDate(r6)     // Catch:{ JSONException -> 0x0312 }
            r7 = 199(0xc7, float:2.79E-43)
            r4[r7] = r12     // Catch:{ JSONException -> 0x0312 }
            long r6 = r6.getTime()     // Catch:{ JSONException -> 0x0312 }
            long r6 = r6 / r13
            r13 = 200(0xc8, float:2.8E-43)
            r4[r13] = r12     // Catch:{ JSONException -> 0x0312 }
            r11.mo33901a(r6)     // Catch:{ JSONException -> 0x0312 }
            r6 = 201(0xc9, float:2.82E-43)
            r4[r6] = r12     // Catch:{ JSONException -> 0x0312 }
        L_0x016c:
            java.lang.String r6 = "direction"
            java.lang.String r0 = r0.getString(r6)     // Catch:{ JSONException -> 0x0312 }
            int r6 = r0.hashCode()     // Catch:{ JSONException -> 0x0312 }
            r7 = 57076464(0x366eaf0, float:6.786062E-37)
            if (r6 == r7) goto L_0x019c
            r7 = 1941740409(0x73bc9b79, float:2.9886022E31)
            if (r6 == r7) goto L_0x0187
            r0 = 202(0xca, float:2.83E-43)
            r6 = 1
            r4[r0] = r6     // Catch:{ JSONException -> 0x0312 }
        L_0x0185:
            r12 = 1
            goto L_0x01a9
        L_0x0187:
            r6 = 1
            java.lang.String r7 = "inbound"
            boolean r0 = r0.equals(r7)     // Catch:{ JSONException -> 0x0312 }
            if (r0 != 0) goto L_0x0195
            r0 = 203(0xcb, float:2.84E-43)
            r4[r0] = r6     // Catch:{ JSONException -> 0x0312 }
            goto L_0x0185
        L_0x0195:
            r0 = 204(0xcc, float:2.86E-43)
            r4[r0] = r6     // Catch:{ JSONException -> 0x0312 }
            r0 = 0
            r12 = 1
            goto L_0x01b1
        L_0x019c:
            java.lang.String r6 = "outbound"
            boolean r0 = r0.equals(r6)     // Catch:{ JSONException -> 0x0312 }
            if (r0 != 0) goto L_0x01ab
            r0 = 205(0xcd, float:2.87E-43)
            r12 = 1
            r4[r0] = r12     // Catch:{ JSONException -> 0x0312 }
        L_0x01a9:
            r0 = -1
            goto L_0x01b1
        L_0x01ab:
            r12 = 1
            r0 = 206(0xce, float:2.89E-43)
            r4[r0] = r12     // Catch:{ JSONException -> 0x0312 }
            r0 = 1
        L_0x01b1:
            if (r0 == 0) goto L_0x01c5
            if (r0 == r12) goto L_0x01bb
            r0 = 207(0xcf, float:2.9E-43)
            r4[r0] = r12     // Catch:{ JSONException -> 0x0312 }
        L_0x01b9:
            r6 = 1
            goto L_0x01cf
        L_0x01bb:
            com.instabug.chat.model.Message$b r0 = com.instabug.chat.model.Message.C9419b.OUTBOUND     // Catch:{ JSONException -> 0x0312 }
            r11.mo33904a(r0)     // Catch:{ JSONException -> 0x0312 }
            r0 = 209(0xd1, float:2.93E-43)
            r4[r0] = r12     // Catch:{ JSONException -> 0x0312 }
            goto L_0x01b9
        L_0x01c5:
            com.instabug.chat.model.Message$b r0 = com.instabug.chat.model.Message.C9419b.INBOUND     // Catch:{ JSONException -> 0x0312 }
            r11.mo33904a(r0)     // Catch:{ JSONException -> 0x0312 }
            r0 = 208(0xd0, float:2.91E-43)
            r6 = 1
            r4[r0] = r6     // Catch:{ JSONException -> 0x0312 }
        L_0x01cf:
            int r0 = r9.length()     // Catch:{ JSONException -> 0x0312 }
            int r0 = r0 - r6
            r7 = 210(0xd2, float:2.94E-43)
            r4[r7] = r6     // Catch:{ JSONException -> 0x0312 }
        L_0x01d8:
            if (r0 < 0) goto L_0x02cf
            r7 = 211(0xd3, float:2.96E-43)
            r4[r7] = r6     // Catch:{ JSONException -> 0x0312 }
            org.json.JSONObject r7 = r9.getJSONObject(r0)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "metadata"
            r14 = 212(0xd4, float:2.97E-43)
            r4[r14] = r6     // Catch:{ JSONException -> 0x0312 }
            org.json.JSONObject r14 = r7.getJSONObject(r12)     // Catch:{ JSONException -> 0x0312 }
            r12 = 213(0xd5, float:2.98E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.Attachment r15 = new com.instabug.chat.model.Attachment     // Catch:{ JSONException -> 0x0312 }
            r15.<init>()     // Catch:{ JSONException -> 0x0312 }
            r12 = 214(0xd6, float:3.0E-43)
            r4[r12] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "url"
            java.lang.String r7 = r7.getString(r12)     // Catch:{ JSONException -> 0x0312 }
            r15.setUrl(r7)     // Catch:{ JSONException -> 0x0312 }
            r7 = 215(0xd7, float:3.01E-43)
            r4[r7] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r7 = "synced"
            r15.setState(r7)     // Catch:{ JSONException -> 0x0312 }
            r7 = 216(0xd8, float:3.03E-43)
            r4[r7] = r6     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r6 = "file_type"
            java.lang.String r6 = r14.getString(r6)     // Catch:{ JSONException -> 0x0312 }
            int r7 = r6.hashCode()     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r12 = "video"
            java.lang.String r13 = "audio"
            java.lang.String r1 = "image"
            switch(r7) {
                case 93166550: goto L_0x0264;
                case 100313435: goto L_0x0251;
                case 112202875: goto L_0x023e;
                case 216616442: goto L_0x0228;
                default: goto L_0x0222;
            }
        L_0x0222:
            r7 = 1
            r6 = 217(0xd9, float:3.04E-43)
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x027b
        L_0x0228:
            java.lang.String r7 = "main-screenshot"
            boolean r6 = r6.equals(r7)     // Catch:{ JSONException -> 0x0312 }
            if (r6 != 0) goto L_0x0236
            r6 = 224(0xe0, float:3.14E-43)
            r7 = 1
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x027b
        L_0x0236:
            r7 = 1
            r6 = 225(0xe1, float:3.15E-43)
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            r6 = 3
        L_0x023c:
            r7 = 1
            goto L_0x027c
        L_0x023e:
            boolean r6 = r6.equals(r12)     // Catch:{ JSONException -> 0x0312 }
            if (r6 != 0) goto L_0x024a
            r6 = 220(0xdc, float:3.08E-43)
            r7 = 1
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x027b
        L_0x024a:
            r7 = 1
            r6 = 221(0xdd, float:3.1E-43)
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            r6 = 1
            goto L_0x023c
        L_0x0251:
            boolean r6 = r6.equals(r1)     // Catch:{ JSONException -> 0x0312 }
            if (r6 != 0) goto L_0x025d
            r6 = 222(0xde, float:3.11E-43)
            r7 = 1
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x027b
        L_0x025d:
            r7 = 1
            r6 = 223(0xdf, float:3.12E-43)
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            r6 = 2
            goto L_0x023c
        L_0x0264:
            boolean r6 = r6.equals(r13)     // Catch:{ JSONException -> 0x0277 }
            if (r6 != 0) goto L_0x0270
            r6 = 218(0xda, float:3.05E-43)
            r7 = 1
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x027b
        L_0x0270:
            r7 = 1
            r6 = 219(0xdb, float:3.07E-43)
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            r6 = 0
            goto L_0x027c
        L_0x0277:
            r0 = move-exception
            r7 = 1
            goto L_0x0313
        L_0x027b:
            r6 = -1
        L_0x027c:
            if (r6 == 0) goto L_0x02a4
            if (r6 == r7) goto L_0x029b
            r13 = 2
            if (r6 == r13) goto L_0x0293
            r12 = 3
            if (r6 == r12) goto L_0x028b
            r1 = 226(0xe2, float:3.17E-43)
            r4[r1] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x02bd
        L_0x028b:
            r15.setType(r1)     // Catch:{ JSONException -> 0x0312 }
            r1 = 232(0xe8, float:3.25E-43)
            r4[r1] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x02bd
        L_0x0293:
            r15.setType(r1)     // Catch:{ JSONException -> 0x0312 }
            r1 = 231(0xe7, float:3.24E-43)
            r4[r1] = r7     // Catch:{ JSONException -> 0x0312 }
            goto L_0x02bd
        L_0x029b:
            r15.setType(r12)     // Catch:{ JSONException -> 0x0312 }
            r1 = 230(0xe6, float:3.22E-43)
            r4[r1] = r7     // Catch:{ JSONException -> 0x0312 }
            r7 = 1
            goto L_0x02bd
        L_0x02a4:
            r15.setType(r13)     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r1 = "duration"
            r6 = 227(0xe3, float:3.18E-43)
            r7 = 1
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r1 = r14.getString(r1)     // Catch:{ JSONException -> 0x0312 }
            r6 = 228(0xe4, float:3.2E-43)
            r4[r6] = r7     // Catch:{ JSONException -> 0x0312 }
            r15.setDuration(r1)     // Catch:{ JSONException -> 0x0312 }
            r1 = 229(0xe5, float:3.21E-43)
            r4[r1] = r7     // Catch:{ JSONException -> 0x0312 }
        L_0x02bd:
            java.util.ArrayList r1 = r11.mo33926l()     // Catch:{ JSONException -> 0x0312 }
            r1.add(r15)     // Catch:{ JSONException -> 0x0312 }
            int r0 = r0 + -1
            r1 = 233(0xe9, float:3.27E-43)
            r4[r1] = r7     // Catch:{ JSONException -> 0x0312 }
            r1 = r20
            r6 = 1
            goto L_0x01d8
        L_0x02cf:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x0312 }
            r1 = 1
            int r0 = r0 - r1
            r6 = 234(0xea, float:3.28E-43)
            r4[r6] = r1     // Catch:{ JSONException -> 0x0312 }
        L_0x02d9:
            if (r0 < 0) goto L_0x0306
            r6 = 235(0xeb, float:3.3E-43)
            r4[r6] = r1     // Catch:{ JSONException -> 0x0312 }
            org.json.JSONObject r6 = r10.getJSONObject(r0)     // Catch:{ JSONException -> 0x0312 }
            r7 = 236(0xec, float:3.31E-43)
            r4[r7] = r1     // Catch:{ JSONException -> 0x0312 }
            com.instabug.chat.model.b r7 = new com.instabug.chat.model.b     // Catch:{ JSONException -> 0x0312 }
            r7.<init>()     // Catch:{ JSONException -> 0x0312 }
            r9 = 237(0xed, float:3.32E-43)
            r4[r9] = r1     // Catch:{ JSONException -> 0x0312 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0312 }
            r7.fromJson(r6)     // Catch:{ JSONException -> 0x0312 }
            r6 = 238(0xee, float:3.34E-43)
            r4[r6] = r1     // Catch:{ JSONException -> 0x0312 }
            r11.mo33905a(r7)     // Catch:{ JSONException -> 0x0312 }
            int r0 = r0 + -1
            r6 = 239(0xef, float:3.35E-43)
            r4[r6] = r1     // Catch:{ JSONException -> 0x0312 }
            r1 = 1
            goto L_0x02d9
        L_0x0306:
            r5.add(r11)     // Catch:{ JSONException -> 0x0312 }
            r0 = 240(0xf0, float:3.36E-43)
            r1 = 1
            r4[r0] = r1
            r6 = 1
            r7 = r19
            goto L_0x0332
        L_0x0312:
            r0 = move-exception
        L_0x0313:
            r1 = 241(0xf1, float:3.38E-43)
            r6 = 1
            r4[r1] = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Failed to parse message number "
            r1.append(r7)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r7 = r19
            com.instabug.library.util.InstabugSDKLogger.m46624e(r7, r1, r0)
            r0 = 242(0xf2, float:3.39E-43)
            r4[r0] = r6
        L_0x0332:
            int r8 = r8 + 1
            r0 = 243(0xf3, float:3.4E-43)
            r4[r0] = r6
            r1 = r20
            goto L_0x0015
        L_0x033c:
            r7 = r19
            r0 = 244(0xf4, float:3.42E-43)
            r4[r0] = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.synchronization.C9448a.m44263a(org.json.JSONObject[]):java.util.List");
    }
}
