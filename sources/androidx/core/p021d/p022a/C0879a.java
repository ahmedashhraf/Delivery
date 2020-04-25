package androidx.core.p021d.p022a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.facebook.internal.ServerProtocol;
import java.util.WeakHashMap;

/* renamed from: androidx.core.d.a.a */
/* compiled from: DisplayManagerCompat */
public final class C0879a {

    /* renamed from: b */
    private static final WeakHashMap<Context, C0879a> f4048b = new WeakHashMap<>();

    /* renamed from: c */
    public static final String f4049c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a */
    private final Context f4050a;

    private C0879a(Context context) {
        this.f4050a = context;
    }

    @C0193h0
    /* renamed from: a */
    public static C0879a m5083a(@C0193h0 Context context) {
        C0879a aVar;
        synchronized (f4048b) {
            aVar = (C0879a) f4048b.get(context);
            if (aVar == null) {
                aVar = new C0879a(context);
                f4048b.put(context, aVar);
            }
        }
        return aVar;
    }

    @C0195i0
    /* renamed from: a */
    public Display mo4555a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f4050a.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplay(i);
        }
        Display defaultDisplay = ((WindowManager) this.f4050a.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getDisplayId() == i) {
            return defaultDisplay;
        }
        return null;
    }

    @C0193h0
    /* renamed from: a */
    public Display[] mo4556a() {
        if (VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f4050a.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplays();
        }
        return new Display[]{((WindowManager) this.f4050a.getSystemService("window")).getDefaultDisplay()};
    }

    @C0193h0
    /* renamed from: a */
    public Display[] mo4557a(@C0195i0 String str) {
        if (VERSION.SDK_INT >= 17) {
            return ((DisplayManager) this.f4050a.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)).getDisplays(str);
        }
        if (str == null) {
            return new Display[0];
        }
        return new Display[]{((WindowManager) this.f4050a.getSystemService("window")).getDefaultDisplay()};
    }
}
