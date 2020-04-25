package p076c.p112d.p113a.p114a.p129i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.stats.C4465d;
import p053b.p068f.p070b.C2125a;

@C4056a
@C4312d0
/* renamed from: c.d.a.a.i.b */
public abstract class C2686b extends C2125a {

    /* renamed from: d */
    private static String f9789d = "GCoreWakefulBroadcastReceiver";

    @C4056a
    @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
    /* renamed from: c */
    public static boolean m13051c(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            C4465d.m19284a().mo18553a(context, intent);
        } else {
            String str = "context shouldn't be null. intent: ";
            String valueOf = String.valueOf(intent.toUri(0));
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
        }
        return C2125a.m11086a(intent);
    }
}
