package com.pusher.client.channel.p428i;

import androidx.core.app.C0770p;
import com.google.gson.C8775f;
import com.google.gson.p193w.C5862c;
import com.pusher.client.AuthorizationFailureException;
import com.pusher.client.C11993a;
import com.pusher.client.channel.C11997b;
import com.pusher.client.channel.C11998c;
import com.pusher.client.channel.C11999d;
import com.pusher.client.channel.C12002g;
import com.pusher.client.channel.C12003h;
import com.pusher.client.connection.p429d.C12020a;
import com.pusher.client.p432f.C12041a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.AuthMechanism;

/* renamed from: com.pusher.client.channel.i.d */
/* compiled from: PresenceChannelImpl */
public class C12012d extends C12016e implements C11998c {

    /* renamed from: a0 */
    private static final String f34612a0 = "pusher_internal:member_added";

    /* renamed from: b0 */
    private static final String f34613b0 = "pusher_internal:member_removed";

    /* renamed from: c0 */
    private static final C8775f f34614c0 = new C8775f();

    /* renamed from: Y */
    private final Map<String, C12003h> f34615Y = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: Z */
    private String f34616Z;

    /* renamed from: com.pusher.client.channel.i.d$a */
    /* compiled from: PresenceChannelImpl */
    private class C12013a {
        @C5862c("user_id")

        /* renamed from: a */
        public String f34617a;
        @C5862c("user_info")

        /* renamed from: b */
        public Object f34618b;

        private C12013a() {
        }
    }

    /* renamed from: com.pusher.client.channel.i.d$b */
    /* compiled from: PresenceChannelImpl */
    private class C12014b {
        @C5862c("presence")

        /* renamed from: a */
        public C12015c f34620a;

        private C12014b() {
        }
    }

    /* renamed from: com.pusher.client.channel.i.d$c */
    /* compiled from: PresenceChannelImpl */
    private class C12015c {
        @C5862c("count")

        /* renamed from: a */
        public Integer f34622a;
        @C5862c("ids")

        /* renamed from: b */
        public List<String> f34623b;
        @C5862c("hash")

        /* renamed from: c */
        public Map<String, Object> f34624c;

        private C12015c() {
        }
    }

    public C12012d(C12020a aVar, String str, C11993a aVar2, C12041a aVar3) {
        super(aVar, str, aVar2, aVar3);
    }

    /* renamed from: d */
    private void m54235d(String str) {
        C12003h hVar = (C12003h) this.f34615Y.remove(((C12013a) f34614c0.mo32314a(m54231a(str), C12013a.class)).f34617a);
        C11997b n = mo41117n();
        if (n != null) {
            ((C11999d) n).mo41099a(getName(), hVar);
        }
    }

    /* renamed from: e */
    private void m54236e(String str) {
        C12015c b = m54233b(str);
        List<String> list = b.f34623b;
        Map<String, Object> map = b.f34624c;
        for (String str2 : list) {
            this.f34615Y.put(str2, new C12003h(str2, map.get(str2) != null ? f34614c0.mo32317a(map.get(str2)) : null));
        }
        C11997b n = mo41117n();
        if (n != null) {
            ((C11999d) n).mo41100a(getName(), mo41098c());
        }
    }

    /* renamed from: a */
    public void mo41113a(String str, String str2) {
        super.mo41113a(str, str2);
        if (str.equals("pusher_internal:subscription_succeeded")) {
            m54236e(str2);
        } else if (str.equals(f34612a0)) {
            m54234c(str2);
        } else if (str.equals(f34613b0)) {
            m54235d(str2);
        }
    }

    /* renamed from: b */
    public C12003h mo41097b() {
        return (C12003h) this.f34615Y.get(this.f34616Z);
    }

    /* renamed from: c */
    public Set<C12003h> mo41098c() {
        return new LinkedHashSet(this.f34615Y.values());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String[] mo41115d() {
        return new String[]{"^(?!presence-).*"};
    }

    /* renamed from: m */
    public String mo41116m() {
        String str = "channel_data";
        String str2 = AuthMechanism.ELEMENT;
        String e = mo41132e();
        try {
            Map map = (Map) f34614c0.mo32314a(e, Map.class);
            String str3 = (String) map.get(str2);
            Object obj = map.get(str);
            m54232a(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(C0770p.f3524g0, "pusher:subscribe");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("channel", this.f34594a);
            linkedHashMap2.put(str2, str3);
            linkedHashMap2.put(str, obj);
            linkedHashMap.put("data", linkedHashMap2);
            return f34614c0.mo32317a((Object) linkedHashMap);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse response from Authorizer: ");
            sb.append(e);
            throw new AuthorizationFailureException(sb.toString(), e2);
        }
    }

    public String toString() {
        return String.format("[Presence Channel: name=%s]", new Object[]{this.f34594a});
    }

    /* renamed from: c */
    private void m54234c(String str) {
        C12013a aVar = (C12013a) f34614c0.mo32314a(m54231a(str), C12013a.class);
        String str2 = aVar.f34617a;
        Object obj = aVar.f34618b;
        C12003h hVar = new C12003h(str2, obj != null ? f34614c0.mo32317a(obj) : null);
        this.f34615Y.put(str2, hVar);
        C11997b n = mo41117n();
        if (n != null) {
            ((C11999d) n).mo41101b(getName(), hVar);
        }
    }

    /* renamed from: b */
    public void mo41095b(String str, C12002g gVar) {
        if (gVar instanceof C11999d) {
            super.mo41095b(str, gVar);
            return;
        }
        throw new IllegalArgumentException("Only instances of PresenceChannelEventListener can be bound to a presence channel");
    }

    /* renamed from: b */
    private static C12015c m54233b(String str) {
        return ((C12014b) f34614c0.mo32314a(m54231a(str), C12014b.class)).f34620a;
    }

    /* renamed from: a */
    private static String m54231a(String str) {
        return (String) ((Map) f34614c0.mo32314a(str, Map.class)).get("data");
    }

    /* renamed from: a */
    private void m54232a(Object obj) {
        this.f34616Z = String.valueOf(((Map) f34614c0.mo32314a((String) obj, Map.class)).get("user_id"));
    }
}
