package p076c.p284e.p285a.p288l;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: c.e.a.l.g */
/* compiled from: HandshakedataImpl1 */
public class C6763g implements C6759c {

    /* renamed from: a */
    private byte[] f18796a;

    /* renamed from: b */
    private TreeMap<String, String> f18797b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: a */
    public void mo27009a(byte[] bArr) {
        this.f18796a = bArr;
    }

    /* renamed from: b */
    public Iterator<String> mo27016b() {
        return Collections.unmodifiableSet(this.f18797b.keySet()).iterator();
    }

    public byte[] getContent() {
        return this.f18796a;
    }

    /* renamed from: a */
    public void mo27008a(String str, String str2) {
        this.f18797b.put(str, str2);
    }

    /* renamed from: b */
    public String mo27015b(String str) {
        String str2 = (String) this.f18797b.get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: a */
    public boolean mo27014a(String str) {
        return this.f18797b.containsKey(str);
    }
}
