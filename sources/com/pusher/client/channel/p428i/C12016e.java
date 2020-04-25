package com.pusher.client.channel.p428i;

import androidx.core.app.C0770p;
import com.google.gson.C8775f;
import com.google.gson.JsonSyntaxException;
import com.pusher.client.AuthorizationFailureException;
import com.pusher.client.C11993a;
import com.pusher.client.channel.C12000e;
import com.pusher.client.channel.C12001f;
import com.pusher.client.channel.C12002g;
import com.pusher.client.channel.ChannelState;
import com.pusher.client.connection.ConnectionState;
import com.pusher.client.connection.p429d.C12020a;
import com.pusher.client.p432f.C12041a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.AuthMechanism;

/* renamed from: com.pusher.client.channel.i.e */
/* compiled from: PrivateChannelImpl */
public class C12016e extends C12004a implements C12000e {

    /* renamed from: W */
    private static final C8775f f34626W = new C8775f();

    /* renamed from: X */
    private static final String f34627X = "client-";

    /* renamed from: U */
    private final C12020a f34628U;

    /* renamed from: V */
    private final C11993a f34629V;

    public C12016e(C12020a aVar, String str, C11993a aVar2, C12041a aVar3) {
        super(str, aVar3);
        this.f34628U = aVar;
        this.f34629V = aVar2;
    }

    /* renamed from: b */
    public void mo41102b(String str, String str2) {
        String str3 = "Cannot trigger event ";
        if (str == null || !str.startsWith(f34627X)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(": client events must start with \"client-\"");
            throw new IllegalArgumentException(sb.toString());
        }
        String str4 = " state";
        if (this.f34590N != ChannelState.SUBSCRIBED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(" because channel ");
            sb2.append(this.f34594a);
            sb2.append(" is in ");
            sb2.append(this.f34590N.toString());
            sb2.append(str4);
            throw new IllegalStateException(sb2.toString());
        } else if (this.f34628U.getState() == ConnectionState.CONNECTED) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(C0770p.f3524g0, str);
                linkedHashMap.put("channel", this.f34594a);
                linkedHashMap.put("data", str2);
                this.f34628U.mo41143a(f34626W.mo32317a((Object) linkedHashMap));
            } catch (JsonSyntaxException unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str);
                sb3.append(" because \"");
                sb3.append(str2);
                sb3.append("\" could not be parsed as valid JSON");
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(" because connection is in ");
            sb4.append(this.f34628U.getState().toString());
            sb4.append(str4);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String[] mo41115d() {
        return new String[]{"^(?!private-).*"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo41132e() {
        return this.f34629V.mo41078a(getName(), this.f34628U.mo41136c());
    }

    /* renamed from: m */
    public String mo41116m() {
        String str = AuthMechanism.ELEMENT;
        String e = mo41132e();
        try {
            String str2 = (String) ((Map) f34626W.mo32314a(e, Map.class)).get(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(C0770p.f3524g0, "pusher:subscribe");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("channel", this.f34594a);
            linkedHashMap2.put(str, str2);
            linkedHashMap.put("data", linkedHashMap2);
            return f34626W.mo32317a((Object) linkedHashMap);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse response from Authorizer: ");
            sb.append(e);
            throw new AuthorizationFailureException(sb.toString(), e2);
        }
    }

    public String toString() {
        return String.format("[Private Channel: name=%s]", new Object[]{this.f34594a});
    }

    /* renamed from: b */
    public void mo41095b(String str, C12002g gVar) {
        if (gVar instanceof C12001f) {
            super.mo41095b(str, gVar);
            return;
        }
        throw new IllegalArgumentException("Only instances of PrivateChannelEventListener can be bound to a private channel");
    }
}
