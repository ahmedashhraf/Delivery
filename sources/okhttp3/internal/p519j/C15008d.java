package okhttp3.internal.p519j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.C14910b;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import p201f.p202a.C5952h;
import p468g.C13799a0;

/* renamed from: okhttp3.internal.j.d */
/* compiled from: JdkWithJettyBootPlatform */
class C15008d extends C15011f {

    /* renamed from: e */
    private final Method f43626e;

    /* renamed from: f */
    private final Method f43627f;

    /* renamed from: g */
    private final Method f43628g;

    /* renamed from: h */
    private final Class<?> f43629h;

    /* renamed from: i */
    private final Class<?> f43630i;

    /* renamed from: okhttp3.internal.j.d$a */
    /* compiled from: JdkWithJettyBootPlatform */
    private static class C15009a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f43631a;

        /* renamed from: b */
        boolean f43632b;

        /* renamed from: c */
        String f43633c;

        C15009a(List<String> list) {
            this.f43631a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C14910b.f43159b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f43632b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f43631a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f43631a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.f43633c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f43631a.get(0);
                    this.f43633c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f43633c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C15008d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f43626e = method;
        this.f43627f = method2;
        this.f43628g = method3;
        this.f43629h = cls;
        this.f43630i = cls2;
    }

    /* renamed from: c */
    public static C15011f m66556c() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString());
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            C15008d dVar = new C15008d(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod(Item.REMOVE_ACTION, new Class[]{SSLSocket.class}), cls3, cls4);
            return dVar;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo46618a(SSLSocket sSLSocket, String str, List<C13799a0> list) {
        List a = C15011f.m66568a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(C15011f.class.getClassLoader(), new Class[]{this.f43629h, this.f43630i}, new C15009a(a));
            this.f43626e.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14910b.m66042a("unable to set alpn", (Exception) e);
        }
    }

    @C5952h
    /* renamed from: b */
    public String mo46619b(SSLSocket sSLSocket) {
        try {
            Object[] objArr = {sSLSocket};
            String str = null;
            C15009a aVar = (C15009a) Proxy.getInvocationHandler(this.f43627f.invoke(null, objArr));
            if (aVar.f43632b || aVar.f43633c != null) {
                if (!aVar.f43632b) {
                    str = aVar.f43633c;
                }
                return str;
            }
            C15011f.m66571d().mo46615a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14910b.m66042a("unable to get selected protocol", (Exception) e);
        }
    }

    /* renamed from: a */
    public void mo46633a(SSLSocket sSLSocket) {
        try {
            this.f43628g.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C14910b.m66042a("unable to remove alpn", (Exception) e);
        }
    }
}
