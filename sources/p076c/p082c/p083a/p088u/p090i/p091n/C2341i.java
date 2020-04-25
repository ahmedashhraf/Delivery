package p076c.p082c.p083a.p088u.p090i.p091n;

import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: c.c.a.u.i.n.i */
/* compiled from: PrettyPrintTreeMap */
class C2341i<K, V> extends TreeMap<K, V> {
    C2341i() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        for (Entry entry : entrySet()) {
            sb.append('{');
            sb.append(entry.getKey());
            sb.append(':');
            sb.append(entry.getValue());
            sb.append("}, ");
        }
        if (!isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(" )");
        return sb.toString();
    }
}
