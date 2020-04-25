package p468g;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: g.q */
/* compiled from: Dns */
public interface C13857q {

    /* renamed from: a */
    public static final C13857q f40191a = new C13858a();

    /* renamed from: g.q$a */
    /* compiled from: Dns */
    class C13858a implements C13857q {
        C13858a() {
        }

        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Broken system behaviour for dns lookup of ");
                    sb.append(str);
                    UnknownHostException unknownHostException = new UnknownHostException(sb.toString());
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
