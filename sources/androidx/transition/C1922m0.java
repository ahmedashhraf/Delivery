package androidx.transition;

import android.view.View;
import androidx.annotation.C0193h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.m0 */
/* compiled from: TransitionValues */
public class C1922m0 {

    /* renamed from: a */
    public final Map<String, Object> f7403a = new HashMap();

    /* renamed from: b */
    public View f7404b;

    /* renamed from: c */
    final ArrayList<C1880f0> f7405c = new ArrayList<>();

    @Deprecated
    public C1922m0() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1922m0) {
            C1922m0 m0Var = (C1922m0) obj;
            if (this.f7404b == m0Var.f7404b && this.f7403a.equals(m0Var.f7403a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f7404b.hashCode() * 31) + this.f7403a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f7404b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.f7403a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.f7403a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }

    public C1922m0(@C0193h0 View view) {
        this.f7404b = view;
    }
}
