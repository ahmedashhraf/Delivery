package okhttp3.internal.http2;

import com.facebook.common.util.UriUtil;
import com.instabug.library.model.NetworkLog;
import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.C14910b;
import org.apache.http.cookie.C15222a;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import p470h.C13883a0;
import p470h.C13887c;
import p470h.C13894e;
import p470h.C13896f;
import p470h.C13906p;

/* renamed from: okhttp3.internal.http2.c */
/* compiled from: Hpack */
final class C14966c {

    /* renamed from: a */
    private static final int f43415a = 15;

    /* renamed from: b */
    private static final int f43416b = 31;

    /* renamed from: c */
    private static final int f43417c = 63;

    /* renamed from: d */
    private static final int f43418d = 127;

    /* renamed from: e */
    static final C14964b[] f43419e;

    /* renamed from: f */
    static final Map<C13896f, Integer> f43420f = m66300a();

    /* renamed from: okhttp3.internal.http2.c$a */
    /* compiled from: Hpack */
    static final class C14967a {

        /* renamed from: a */
        private final List<C14964b> f43421a;

        /* renamed from: b */
        private final C13894e f43422b;

        /* renamed from: c */
        private final int f43423c;

        /* renamed from: d */
        private int f43424d;

        /* renamed from: e */
        C14964b[] f43425e;

        /* renamed from: f */
        int f43426f;

        /* renamed from: g */
        int f43427g;

        /* renamed from: h */
        int f43428h;

        C14967a(int i, C13883a0 a0Var) {
            this(i, i, a0Var);
        }

        /* renamed from: c */
        private C13896f m66304c(int i) throws IOException {
            if (m66305d(i)) {
                return C14966c.f43419e[i].f43412a;
            }
            int a = m66301a(i - C14966c.f43419e.length);
            if (a >= 0) {
                C14964b[] bVarArr = this.f43425e;
                if (a < bVarArr.length) {
                    return bVarArr[a].f43412a;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: e */
        private void m66306e() {
            int i = this.f43424d;
            int i2 = this.f43428h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m66308f();
            } else {
                m66303b(i2 - i);
            }
        }

        /* renamed from: f */
        private void m66308f() {
            Arrays.fill(this.f43425e, null);
            this.f43426f = this.f43425e.length - 1;
            this.f43427g = 0;
            this.f43428h = 0;
        }

        /* renamed from: g */
        private void m66311g(int i) throws IOException {
            this.f43421a.add(new C14964b(m66304c(i), mo46489c()));
        }

        /* renamed from: h */
        private void m66312h() throws IOException {
            m66302a(-1, new C14964b(C14966c.m66299a(mo46489c()), mo46489c()));
        }

        /* renamed from: i */
        private void m66313i() throws IOException {
            this.f43421a.add(new C14964b(C14966c.m66299a(mo46489c()), mo46489c()));
        }

        /* renamed from: a */
        public List<C14964b> mo46487a() {
            ArrayList arrayList = new ArrayList(this.f43421a);
            this.f43421a.clear();
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo46488b() {
            return this.f43424d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo46490d() throws IOException {
            while (!this.f43422b.mo43904p()) {
                byte readByte = this.f43422b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m66307e(mo46486a((int) readByte, 127) - 1);
                } else if (readByte == 64) {
                    m66312h();
                } else if ((readByte & 64) == 64) {
                    m66309f(mo46486a((int) readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    this.f43424d = mo46486a((int) readByte, 31);
                    int i = this.f43424d;
                    if (i < 0 || i > this.f43423c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.f43424d);
                        throw new IOException(sb.toString());
                    }
                    m66306e();
                } else if (readByte == 16 || readByte == 0) {
                    m66313i();
                } else {
                    m66311g(mo46486a((int) readByte, 15) - 1);
                }
            }
        }

        C14967a(int i, int i2, C13883a0 a0Var) {
            this.f43421a = new ArrayList();
            this.f43425e = new C14964b[8];
            this.f43426f = this.f43425e.length - 1;
            this.f43427g = 0;
            this.f43428h = 0;
            this.f43423c = i;
            this.f43424d = i2;
            this.f43422b = C13906p.m59739a(a0Var);
        }

        /* renamed from: b */
        private int m66303b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f43425e.length;
                while (true) {
                    length--;
                    if (length < this.f43426f || i <= 0) {
                        C14964b[] bVarArr = this.f43425e;
                        int i3 = this.f43426f;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i2, this.f43427g);
                        this.f43426f += i2;
                    } else {
                        C14964b[] bVarArr2 = this.f43425e;
                        i -= bVarArr2[length].f43414c;
                        this.f43428h -= bVarArr2[length].f43414c;
                        this.f43427g--;
                        i2++;
                    }
                }
                C14964b[] bVarArr3 = this.f43425e;
                int i32 = this.f43426f;
                System.arraycopy(bVarArr3, i32 + 1, bVarArr3, i32 + 1 + i2, this.f43427g);
                this.f43426f += i2;
            }
            return i2;
        }

        /* renamed from: a */
        private int m66301a(int i) {
            return this.f43426f + 1 + i;
        }

        /* renamed from: a */
        private void m66302a(int i, C14964b bVar) {
            this.f43421a.add(bVar);
            int i2 = bVar.f43414c;
            if (i != -1) {
                i2 -= this.f43425e[m66301a(i)].f43414c;
            }
            int i3 = this.f43424d;
            if (i2 > i3) {
                m66308f();
                return;
            }
            int b = m66303b((this.f43428h + i2) - i3);
            if (i == -1) {
                int i4 = this.f43427g + 1;
                C14964b[] bVarArr = this.f43425e;
                if (i4 > bVarArr.length) {
                    C14964b[] bVarArr2 = new C14964b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f43426f = this.f43425e.length - 1;
                    this.f43425e = bVarArr2;
                }
                int i5 = this.f43426f;
                this.f43426f = i5 - 1;
                this.f43425e[i5] = bVar;
                this.f43427g++;
            } else {
                this.f43425e[i + m66301a(i) + b] = bVar;
            }
            this.f43428h += i2;
        }

        /* renamed from: e */
        private void m66307e(int i) throws IOException {
            if (m66305d(i)) {
                this.f43421a.add(C14966c.f43419e[i]);
                return;
            }
            int a = m66301a(i - C14966c.f43419e.length);
            if (a >= 0) {
                C14964b[] bVarArr = this.f43425e;
                if (a < bVarArr.length) {
                    this.f43421a.add(bVarArr[a]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        /* renamed from: g */
        private int m66310g() throws IOException {
            return this.f43422b.readByte() & 255;
        }

        /* renamed from: f */
        private void m66309f(int i) throws IOException {
            m66302a(-1, new C14964b(m66304c(i), mo46489c()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C13896f mo46489c() throws IOException {
            int g = m66310g();
            boolean z = (g & 128) == 128;
            int a = mo46486a(g, 127);
            if (z) {
                return C13896f.m59656e(C14995j.m66485b().mo46588a(this.f43422b.mo43897j((long) a)));
            }
            return this.f43422b.mo43891h((long) a);
        }

        /* renamed from: d */
        private boolean m66305d(int i) {
            return i >= 0 && i <= C14966c.f43419e.length - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo46486a(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int g = m66310g();
                if ((g & 128) == 0) {
                    return i2 + (g << i4);
                }
                i2 += (g & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.c$b */
    /* compiled from: Hpack */
    static final class C14968b {

        /* renamed from: k */
        private static final int f43429k = 4096;

        /* renamed from: l */
        private static final int f43430l = 16384;

        /* renamed from: a */
        private final C13887c f43431a;

        /* renamed from: b */
        private final boolean f43432b;

        /* renamed from: c */
        private int f43433c;

        /* renamed from: d */
        private boolean f43434d;

        /* renamed from: e */
        int f43435e;

        /* renamed from: f */
        int f43436f;

        /* renamed from: g */
        C14964b[] f43437g;

        /* renamed from: h */
        int f43438h;

        /* renamed from: i */
        int f43439i;

        /* renamed from: j */
        int f43440j;

        C14968b(C13887c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m66320a(C14964b bVar) {
            int i = bVar.f43414c;
            int i2 = this.f43436f;
            if (i > i2) {
                m66322b();
                return;
            }
            m66321b((this.f43440j + i) - i2);
            int i3 = this.f43439i + 1;
            C14964b[] bVarArr = this.f43437g;
            if (i3 > bVarArr.length) {
                C14964b[] bVarArr2 = new C14964b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f43438h = this.f43437g.length - 1;
                this.f43437g = bVarArr2;
            }
            int i4 = this.f43438h;
            this.f43438h = i4 - 1;
            this.f43437g[i4] = bVar;
            this.f43439i++;
            this.f43440j += i;
        }

        /* renamed from: b */
        private void m66322b() {
            Arrays.fill(this.f43437g, null);
            this.f43438h = this.f43437g.length - 1;
            this.f43439i = 0;
            this.f43440j = 0;
        }

        C14968b(int i, boolean z, C13887c cVar) {
            this.f43433c = Integer.MAX_VALUE;
            this.f43437g = new C14964b[8];
            this.f43438h = this.f43437g.length - 1;
            this.f43439i = 0;
            this.f43440j = 0;
            this.f43435e = i;
            this.f43436f = i;
            this.f43432b = z;
            this.f43431a = cVar;
        }

        /* renamed from: b */
        private int m66321b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f43437g.length;
                while (true) {
                    length--;
                    if (length < this.f43438h || i <= 0) {
                        C14964b[] bVarArr = this.f43437g;
                        int i3 = this.f43438h;
                        System.arraycopy(bVarArr, i3 + 1, bVarArr, i3 + 1 + i2, this.f43439i);
                        C14964b[] bVarArr2 = this.f43437g;
                        int i4 = this.f43438h;
                        Arrays.fill(bVarArr2, i4 + 1, i4 + 1 + i2, null);
                        this.f43438h += i2;
                    } else {
                        C14964b[] bVarArr3 = this.f43437g;
                        i -= bVarArr3[length].f43414c;
                        this.f43440j -= bVarArr3[length].f43414c;
                        this.f43439i--;
                        i2++;
                    }
                }
                C14964b[] bVarArr4 = this.f43437g;
                int i32 = this.f43438h;
                System.arraycopy(bVarArr4, i32 + 1, bVarArr4, i32 + 1 + i2, this.f43439i);
                C14964b[] bVarArr22 = this.f43437g;
                int i42 = this.f43438h;
                Arrays.fill(bVarArr22, i42 + 1, i42 + 1 + i2, null);
                this.f43438h += i2;
            }
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46494a(List<C14964b> list) throws IOException {
            int i;
            int i2;
            if (this.f43434d) {
                int i3 = this.f43433c;
                if (i3 < this.f43436f) {
                    mo46492a(i3, 31, 32);
                }
                this.f43434d = false;
                this.f43433c = Integer.MAX_VALUE;
                mo46492a(this.f43436f, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C14964b bVar = (C14964b) list.get(i4);
                C13896f s = bVar.f43412a.mo43986s();
                C13896f fVar = bVar.f43413b;
                Integer num = (Integer) C14966c.f43420f.get(s);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (C14910b.m66061a((Object) C14966c.f43419e[i2 - 1].f43413b, (Object) fVar)) {
                            i = i2;
                        } else if (C14910b.m66061a((Object) C14966c.f43419e[i2].f43413b, (Object) fVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f43438h + 1;
                    int length = this.f43437g.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C14910b.m66061a((Object) this.f43437g[i5].f43412a, (Object) s)) {
                            if (C14910b.m66061a((Object) this.f43437g[i5].f43413b, (Object) fVar)) {
                                i2 = C14966c.f43419e.length + (i5 - this.f43438h);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f43438h) + C14966c.f43419e.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo46492a(i2, 127, 128);
                } else if (i == -1) {
                    this.f43431a.writeByte(64);
                    mo46493a(s);
                    mo46493a(fVar);
                    m66320a(bVar);
                } else if (!s.mo43978h(C14964b.f43401d) || C14964b.f43411n.equals(s)) {
                    mo46492a(i, 63, 64);
                    mo46493a(fVar);
                    m66320a(bVar);
                } else {
                    mo46492a(i, 15, 0);
                    mo46493a(fVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46492a(int i, int i2, int i3) {
            if (i < i2) {
                this.f43431a.writeByte(i | i3);
                return;
            }
            this.f43431a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f43431a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f43431a.writeByte(i4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46493a(C13896f fVar) throws IOException {
            if (!this.f43432b || C14995j.m66485b().mo46586a(fVar) >= fVar.mo43985r()) {
                mo46492a(fVar.mo43985r(), 127, 0);
                this.f43431a.m59514a(fVar);
                return;
            }
            C13887c cVar = new C13887c();
            C14995j.m66485b().mo46587a(fVar, cVar);
            C13896f t = cVar.mo43919t();
            mo46492a(t.mo43985r(), 127, 128);
            this.f43431a.m59514a(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46491a(int i) {
            this.f43435e = i;
            int min = Math.min(i, 16384);
            int i2 = this.f43436f;
            if (i2 != min) {
                if (min < i2) {
                    this.f43433c = Math.min(this.f43433c, min);
                }
                this.f43434d = true;
                this.f43436f = min;
                m66319a();
            }
        }

        /* renamed from: a */
        private void m66319a() {
            int i = this.f43436f;
            int i2 = this.f43440j;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m66322b();
            } else {
                m66321b(i2 - i);
            }
        }
    }

    static {
        String str = "";
        f43419e = new C14964b[]{new C14964b(C14964b.f43411n, str), new C14964b(C14964b.f43408k, "GET"), new C14964b(C14964b.f43408k, "POST"), new C14964b(C14964b.f43409l, "/"), new C14964b(C14964b.f43409l, "/index.html"), new C14964b(C14964b.f43410m, "http"), new C14964b(C14964b.f43410m, UriUtil.HTTPS_SCHEME), new C14964b(C14964b.f43407j, "200"), new C14964b(C14964b.f43407j, "204"), new C14964b(C14964b.f43407j, "206"), new C14964b(C14964b.f43407j, "304"), new C14964b(C14964b.f43407j, "400"), new C14964b(C14964b.f43407j, "404"), new C14964b(C14964b.f43407j, "500"), new C14964b("accept-charset", str), new C14964b("accept-encoding", "gzip, deflate"), new C14964b("accept-language", str), new C14964b("accept-ranges", str), new C14964b(C11644i.f33385p3, str), new C14964b("access-control-allow-origin", str), new C14964b("age", str), new C14964b("allow", str), new C14964b("authorization", str), new C14964b("cache-control", str), new C14964b("content-disposition", str), new C14964b("content-encoding", str), new C14964b("content-language", str), new C14964b("content-length", str), new C14964b("content-location", str), new C14964b("content-range", str), new C14964b(NetworkLog.CONTENT_TYPE, str), new C14964b("cookie", str), new C14964b("date", str), new C14964b("etag", str), new C14964b("expect", str), new C14964b(C15222a.f44136B, str), new C14964b(PrivacyItem.SUBSCRIPTION_FROM, str), new C14964b("host", str), new C14964b("if-match", str), new C14964b("if-modified-since", str), new C14964b("if-none-match", str), new C14964b("if-range", str), new C14964b("if-unmodified-since", str), new C14964b("last-modified", str), new C14964b("link", str), new C14964b("location", str), new C14964b("max-forwards", str), new C14964b("proxy-authenticate", str), new C14964b("proxy-authorization", str), new C14964b(RangeValidateElement.METHOD, str), new C14964b("referer", str), new C14964b("refresh", str), new C14964b("retry-after", str), new C14964b("server", str), new C14964b("set-cookie", str), new C14964b("strict-transport-security", str), new C14964b("transfer-encoding", str), new C14964b("user-agent", str), new C14964b("vary", str), new C14964b("via", str), new C14964b("www-authenticate", str)};
    }

    private C14966c() {
    }

    /* renamed from: a */
    private static Map<C13896f, Integer> m66300a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f43419e.length);
        int i = 0;
        while (true) {
            C14964b[] bVarArr = f43419e;
            if (i >= bVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(bVarArr[i].f43412a)) {
                linkedHashMap.put(f43419e[i].f43412a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* renamed from: a */
    static C13896f m66299a(C13896f fVar) throws IOException {
        int r = fVar.mo43985r();
        int i = 0;
        while (i < r) {
            byte a = fVar.mo43949a(i);
            if (a < 65 || a > 90) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(fVar.mo43990v());
                throw new IOException(sb.toString());
            }
        }
        return fVar;
    }
}
