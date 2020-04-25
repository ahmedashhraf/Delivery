package com.pusher.java_websocket.drafts;

import com.pusher.java_websocket.drafts.Draft.HandshakeState;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6758b;

/* renamed from: com.pusher.java_websocket.drafts.b */
/* compiled from: Draft_17 */
public class C12048b extends C12046a {
    /* renamed from: a */
    public HandshakeState mo41194a(C6757a aVar) throws InvalidHandshakeException {
        if (C12046a.m54380b(aVar) == 13) {
            return HandshakeState.MATCHED;
        }
        return HandshakeState.NOT_MATCHED;
    }

    /* renamed from: a */
    public C6758b mo41192a(C6758b bVar) {
        super.mo41192a(bVar);
        bVar.mo27008a("Sec-WebSocket-Version", "13");
        return bVar;
    }

    /* renamed from: a */
    public Draft mo41196a() {
        return new C12048b();
    }
}
