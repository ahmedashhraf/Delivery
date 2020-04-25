package p076c.p112d.p148d.p275b;

import com.google.common.base.C7397x;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2778d;

@C2776b
@C2775a
/* renamed from: c.d.d.b.b */
/* compiled from: ArrayBasedEscaperMap */
public final class C6512b {

    /* renamed from: b */
    private static final char[][] f18216b = ((char[][]) Array.newInstance(char.class, new int[]{0, 0}));

    /* renamed from: a */
    private final char[][] f18217a;

    private C6512b(char[][] cArr) {
        this.f18217a = cArr;
    }

    /* renamed from: a */
    public static C6512b m30979a(Map<Character, String> map) {
        return new C6512b(m30980b(map));
    }

    @C2778d
    /* renamed from: b */
    static char[][] m30980b(Map<Character, String> map) {
        C7397x.m35664a(map);
        if (map.isEmpty()) {
            return f18216b;
        }
        char[][] cArr = new char[(((Character) Collections.max(map.keySet())).charValue() + 1)][];
        for (Character charValue : map.keySet()) {
            char charValue2 = charValue.charValue();
            cArr[charValue2] = ((String) map.get(Character.valueOf(charValue2))).toCharArray();
        }
        return cArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public char[][] mo26399a() {
        return this.f18217a;
    }
}
