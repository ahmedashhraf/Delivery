package p205i.p489f.p490h;

import java.io.PrintStream;

/* renamed from: i.f.h.l */
/* compiled from: Util */
public class C14082l {
    /* renamed from: a */
    public static final void m60860a(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    /* renamed from: a */
    public static final void m60859a(String str) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("SLF4J: ");
        sb.append(str);
        printStream.println(sb.toString());
    }
}
