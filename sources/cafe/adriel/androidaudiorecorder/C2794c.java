package cafe.adriel.androidaudiorecorder;

import android.graphics.Color;
import android.os.Handler;
import cafe.adriel.androidaudiorecorder.p151e.C2796a;
import cafe.adriel.androidaudiorecorder.p151e.C2798b;
import cafe.adriel.androidaudiorecorder.p151e.C2799c;
import com.facebook.appevents.AppEventsConstants;
import omrecorder.C15038c.C15039a;
import omrecorder.C15051i;
import omrecorder.C15051i.C15054c;

/* renamed from: cafe.adriel.androidaudiorecorder.c */
/* compiled from: Util */
public class C2794c {

    /* renamed from: a */
    private static final Handler f9977a = new Handler();

    private C2794c() {
    }

    /* renamed from: a */
    public static void m13408a(int i, Runnable runnable) {
        f9977a.postDelayed(runnable, (long) i);
    }

    /* renamed from: b */
    public static int m13409b(int i) {
        return Color.argb(Color.alpha(i), Math.max((int) (((float) Color.red(i)) * 0.8f), 0), Math.max((int) (((float) Color.green(i)) * 0.8f), 0), Math.max((int) (((float) Color.blue(i)) * 0.8f), 0));
    }

    /* renamed from: c */
    private static String m13410c(int i) {
        if (i < 0 || i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        sb2.append(i);
        return sb2.toString();
    }

    /* renamed from: d */
    public static boolean m13411d(int i) {
        boolean z = true;
        if (17170445 == i) {
            return true;
        }
        int[] iArr = {Color.red(i), Color.green(i), Color.blue(i)};
        double d = (double) (iArr[0] * iArr[0]);
        Double.isNaN(d);
        double d2 = d * 0.241d;
        double d3 = (double) (iArr[1] * iArr[1]);
        Double.isNaN(d3);
        double d4 = d2 + (d3 * 0.691d);
        double d5 = (double) (iArr[2] * iArr[2]);
        Double.isNaN(d5);
        if (((int) Math.sqrt(d4 + (d5 * 0.068d))) < 200) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static C15051i m13407a(C2799c cVar, C2796a aVar, C2798b bVar) {
        return new C15054c(new C15039a(cVar.mo10547d(), 2, aVar.mo10545d(), bVar.mo10546d()));
    }

    /* renamed from: a */
    public static String m13406a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(m13410c(i / 3600));
        String str = ":";
        sb.append(str);
        sb.append(m13410c(i / 60));
        sb.append(str);
        sb.append(m13410c(i % 60));
        return sb.toString();
    }
}
