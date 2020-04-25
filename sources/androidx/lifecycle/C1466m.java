package androidx.lifecycle;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.HashMap;
import java.util.Map;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.m */
/* compiled from: MethodCallsLogger */
public class C1466m {

    /* renamed from: a */
    private Map<String, Integer> f5725a = new HashMap();

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo6521a(String str, int i) {
        Integer num = (Integer) this.f5725a.get(str);
        boolean z = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue & i) != 0) {
            z = true;
        }
        this.f5725a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}
