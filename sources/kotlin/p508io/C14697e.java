package kotlin.p508io;

import java.io.File;
import kotlin.p214b1.p216u.C14445h0;

/* renamed from: kotlin.io.e */
/* compiled from: Exceptions.kt */
public final class C14697e {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m63731b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" -> ");
            sb2.append(file2);
            sb.append(sb2.toString());
        }
        if (str != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            sb3.append(str);
            sb.append(sb3.toString());
        }
        String sb4 = sb.toString();
        C14445h0.m62453a((Object) sb4, "sb.toString()");
        return sb4;
    }
}
