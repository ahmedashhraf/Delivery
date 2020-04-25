package p433d.p434a.p435a;

import com.google.android.gms.common.ConnectionResult;
import com.mrsool.chat.C10526n;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import p433d.p434a.p435a.C12175c.C12177b;
import p433d.p434a.p435a.C12181f.C12183b;
import p433d.p434a.p435a.C12181f.C12184c;

/* renamed from: d.a.a.a */
/* compiled from: Client */
public class C12172a {

    /* renamed from: e */
    private static final Logger f35118e = Logger.getLogger(C12172a.class.getName());

    /* renamed from: a */
    protected Random f35119a;

    /* renamed from: b */
    protected int f35120b;

    /* renamed from: c */
    protected int f35121c;

    /* renamed from: d */
    protected C12174b f35122d;

    /* renamed from: d.a.a.a$a */
    /* compiled from: Client */
    class C12173a implements C12174b {

        /* renamed from: a */
        final /* synthetic */ Map f35123a;

        C12173a(Map map) {
            this.f35123a = map;
        }

        public C12175c get(C12180e eVar) {
            return (C12175c) this.f35123a.get(eVar);
        }

        public void put(C12180e eVar, C12175c cVar) {
            this.f35123a.put(eVar, cVar);
        }
    }

    public C12172a(C12174b bVar) {
        this.f35120b = ConnectionResult.f12762k0;
        this.f35121c = C10526n.f28536a;
        try {
            this.f35119a = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            this.f35119a = new SecureRandom();
        }
        this.f35122d = bVar;
    }

    /* renamed from: a */
    public void mo41661a(int i) {
        this.f35121c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo41663b() {
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            HashSet hashSet = new HashSet(6);
            while (true) {
                String readLine = lineNumberReader.readLine();
                if (readLine == null) {
                    break;
                }
                int indexOf = readLine.indexOf("]: [");
                if (indexOf != -1) {
                    String substring = readLine.substring(1, indexOf);
                    String substring2 = readLine.substring(indexOf + 4, readLine.length() - 1);
                    if (substring.endsWith(".dns") || substring.endsWith(".dns1") || substring.endsWith(".dns2") || substring.endsWith(".dns3") || substring.endsWith(".dns4")) {
                        InetAddress byName = InetAddress.getByName(substring2);
                        if (byName != null) {
                            String hostAddress = byName.getHostAddress();
                            if (hostAddress != null) {
                                if (hostAddress.length() != 0) {
                                    hashSet.add(hostAddress);
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.size() > 0) {
                return (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        } catch (IOException e) {
            f35118e.log(Level.WARNING, "Exception in findDNSByExec", e);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String[] mo41664c() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            ArrayList arrayList = new ArrayList(5);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) method.invoke(null, new Object[]{strArr[i]});
                if (str != null) {
                    if (str.length() != 0) {
                        if (!arrayList.contains(str)) {
                            InetAddress byName = InetAddress.getByName(str);
                            if (byName != null) {
                                String hostAddress = byName.getHostAddress();
                                if (hostAddress != null) {
                                    if (hostAddress.length() != 0) {
                                        if (!arrayList.contains(hostAddress)) {
                                            arrayList.add(hostAddress);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        } catch (Exception e) {
            f35118e.log(Level.WARNING, "Exception in findDNSByReflection", e);
        }
        return null;
    }

    /* renamed from: d */
    public int mo41665d() {
        return this.f35121c;
    }

    /* renamed from: a */
    public C12175c mo41660a(String str, C12184c cVar, C12183b bVar, String str2, int i) throws IOException {
        return mo41656a(new C12180e(str, cVar, bVar), str2, i);
    }

    /* renamed from: a */
    public C12175c mo41659a(String str, C12184c cVar, C12183b bVar, String str2) throws IOException {
        return mo41655a(new C12180e(str, cVar, bVar), str2);
    }

    /* renamed from: a */
    public C12175c mo41658a(String str, C12184c cVar, C12183b bVar) {
        return mo41654a(new C12180e(str, cVar, bVar));
    }

    public C12172a(Map<C12180e, C12175c> map) {
        this.f35120b = ConnectionResult.f12762k0;
        this.f35121c = C10526n.f28536a;
        try {
            this.f35119a = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException unused) {
            this.f35119a = new SecureRandom();
        }
        if (map != null) {
            this.f35122d = new C12173a(map);
        }
    }

    /* renamed from: a */
    public C12175c mo41657a(String str, C12184c cVar) {
        return mo41654a(new C12180e(str, cVar, C12183b.IN));
    }

    /* renamed from: a */
    public C12175c mo41655a(C12180e eVar, String str) throws IOException {
        return mo41656a(eVar, str, 53);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        throw r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p433d.p434a.p435a.C12175c mo41656a(p433d.p434a.p435a.C12180e r8, java.lang.String r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            d.a.a.b r0 = r7.f35122d
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = r1
            goto L_0x000b
        L_0x0007:
            d.a.a.c r0 = r0.get(r8)
        L_0x000b:
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            d.a.a.c r0 = new d.a.a.c
            r0.<init>()
            r2 = 1
            d.a.a.e[] r3 = new p433d.p434a.p435a.C12180e[r2]
            r4 = 0
            r3[r4] = r8
            r0.mo41670a(r3)
            r0.mo41680f(r2)
            java.util.Random r2 = r7.f35119a
            int r2 = r2.nextInt()
            r0.mo41668a(r2)
            byte[] r2 = r0.mo41692p()
            java.net.DatagramSocket r3 = new java.net.DatagramSocket
            r3.<init>()
            java.net.DatagramPacket r5 = new java.net.DatagramPacket     // Catch:{ all -> 0x0087 }
            int r6 = r2.length     // Catch:{ all -> 0x0087 }
            java.net.InetAddress r9 = java.net.InetAddress.getByName(r9)     // Catch:{ all -> 0x0087 }
            r5.<init>(r2, r6, r9, r10)     // Catch:{ all -> 0x0087 }
            int r9 = r7.f35121c     // Catch:{ all -> 0x0087 }
            r3.setSoTimeout(r9)     // Catch:{ all -> 0x0087 }
            r3.send(r5)     // Catch:{ all -> 0x0087 }
            java.net.DatagramPacket r9 = new java.net.DatagramPacket     // Catch:{ all -> 0x0087 }
            int r10 = r7.f35120b     // Catch:{ all -> 0x0087 }
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x0087 }
            int r2 = r7.f35120b     // Catch:{ all -> 0x0087 }
            r9.<init>(r10, r2)     // Catch:{ all -> 0x0087 }
            r3.receive(r9)     // Catch:{ all -> 0x0087 }
            byte[] r9 = r9.getData()     // Catch:{ all -> 0x0087 }
            d.a.a.c r9 = p433d.p434a.p435a.C12175c.m54747a(r9)     // Catch:{ all -> 0x0087 }
            int r10 = r9.mo41674c()     // Catch:{ all -> 0x0087 }
            int r0 = r0.mo41674c()     // Catch:{ all -> 0x0087 }
            if (r10 == r0) goto L_0x0067
            r3.close()
            return r1
        L_0x0067:
            d.a.a.f[] r10 = r9.mo41673b()     // Catch:{ all -> 0x0087 }
            int r0 = r10.length     // Catch:{ all -> 0x0087 }
        L_0x006c:
            if (r4 >= r0) goto L_0x0083
            r1 = r10[r4]     // Catch:{ all -> 0x0087 }
            boolean r1 = r1.mo41710a(r8)     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0080
            d.a.a.b r10 = r7.f35122d     // Catch:{ all -> 0x0087 }
            if (r10 == 0) goto L_0x0083
            d.a.a.b r10 = r7.f35122d     // Catch:{ all -> 0x0087 }
            r10.put(r8, r9)     // Catch:{ all -> 0x0087 }
            goto L_0x0083
        L_0x0080:
            int r4 = r4 + 1
            goto L_0x006c
        L_0x0083:
            r3.close()
            return r9
        L_0x0087:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r8 = move-exception
            r3.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            goto L_0x008f
        L_0x008e:
            throw r8
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: p433d.p434a.p435a.C12172a.mo41656a(d.a.a.e, java.lang.String, int):d.a.a.c");
    }

    public C12172a() {
        this((C12174b) null);
    }

    /* renamed from: a */
    public C12175c mo41654a(C12180e eVar) {
        C12174b bVar = this.f35122d;
        C12175c cVar = bVar == null ? null : bVar.get(eVar);
        if (cVar != null) {
            return cVar;
        }
        for (String a : mo41662a()) {
            try {
                C12175c a2 = mo41655a(eVar, a);
                if (a2 != null) {
                    if (a2.mo41684h() == C12177b.NO_ERROR) {
                        for (C12181f a3 : a2.mo41673b()) {
                            if (a3.mo41710a(eVar)) {
                                return a2;
                            }
                        }
                        continue;
                    }
                }
            } catch (IOException e) {
                f35118e.log(Level.FINE, "IOException in query", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public String[] mo41662a() {
        String[] c = mo41664c();
        if (c != null) {
            Logger logger = f35118e;
            StringBuilder sb = new StringBuilder();
            sb.append("Got DNS servers via reflection: ");
            sb.append(Arrays.toString(c));
            logger.fine(sb.toString());
            return c;
        }
        String[] b = mo41663b();
        if (b != null) {
            Logger logger2 = f35118e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got DNS servers via exec: ");
            sb2.append(Arrays.toString(b));
            logger2.fine(sb2.toString());
            return b;
        }
        f35118e.fine("No DNS found? Using fallback [8.8.8.8, [2001:4860:4860::8888]]");
        return new String[]{"8.8.8.8", "[2001:4860:4860::8888]"};
    }
}
