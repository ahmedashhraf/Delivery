package p076c.p284e.p285a;

import com.pusher.java_websocket.drafts.Draft;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import java.net.InetSocketAddress;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p287k.C6756e;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6761e;
import p076c.p284e.p285a.p288l.C6764h;
import p076c.p284e.p285a.p288l.C6765i;

/* renamed from: c.e.a.e */
/* compiled from: WebSocketAdapter */
public abstract class C6742e implements C6745h {
    /* renamed from: a */
    public C6765i mo26947a(C6739d dVar, Draft draft, C6757a aVar) throws InvalidDataException {
        return new C6761e();
    }

    /* renamed from: a */
    public void mo26949a(C6739d dVar, C6754d dVar2) {
    }

    /* renamed from: a */
    public void mo26950a(C6739d dVar, C6757a aVar) throws InvalidDataException {
    }

    /* renamed from: a */
    public void mo26951a(C6739d dVar, C6757a aVar, C6764h hVar) throws InvalidDataException {
    }

    /* renamed from: b */
    public void mo26952b(C6739d dVar, C6754d dVar2) {
        C6756e eVar = new C6756e(dVar2);
        eVar.mo26999a(C6755a.PONG);
        dVar.mo26931a((C6754d) eVar);
    }

    /* renamed from: c */
    public void mo26953c(C6739d dVar, C6754d dVar2) {
    }

    /* renamed from: a */
    public String mo26948a(C6739d dVar) throws InvalidDataException {
        InetSocketAddress i = dVar.mo26944i();
        if (i != null) {
            StringBuffer stringBuffer = new StringBuffer(90);
            stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringBuffer.append(i.getPort());
            stringBuffer.append("\" /></cross-domain-policy>\u0000");
            return stringBuffer.toString();
        }
        throw new InvalidHandshakeException("socket not bound");
    }
}
