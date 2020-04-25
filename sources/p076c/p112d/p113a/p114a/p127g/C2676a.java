package p076c.p112d.p113a.p114a.p127g;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.util.Log;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4488i;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.lang.reflect.Method;

/* renamed from: c.d.a.a.g.a */
public class C2676a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C4282f f9755a = C4282f.m18511a();

    /* renamed from: b */
    private static final Object f9756b = new Object();

    /* renamed from: c */
    private static Method f9757c = null;

    /* renamed from: d */
    public static final String f9758d = "GmsCore_OpenSSL";

    /* renamed from: c.d.a.a.g.a$a */
    public interface C2677a {
        /* renamed from: a */
        void mo10327a();

        /* renamed from: a */
        void mo10328a(int i, Intent intent);
    }

    /* renamed from: a */
    public static void m13028a(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C4300a0.m18621a(context, (Object) "Context must not be null");
        f9755a.mo18126d(context, 11925000);
        Context b = m13030b(context);
        if (b == null) {
            b = m13031c(context);
        }
        if (b != null) {
            synchronized (f9756b) {
                try {
                    if (f9757c == null) {
                        f9757c = b.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                    }
                    f9757c.invoke(null, new Object[]{b});
                } catch (Exception e) {
                    Throwable cause = e.getCause();
                    if (Log.isLoggable("ProviderInstaller", 6)) {
                        String str = "Failed to install provider: ";
                        String valueOf = String.valueOf(cause == 0 ? e.getMessage() : cause.getMessage());
                        if (valueOf.length() != 0) {
                            str.concat(valueOf);
                        } else {
                            new String(str);
                        }
                    }
                    C4488i.m19364a(context, cause == 0 ? e : cause);
                    throw new GooglePlayServicesNotAvailableException(8);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new GooglePlayServicesNotAvailableException(8);
    }

    @C0195i0
    /* renamed from: b */
    private static Context m13030b(Context context) {
        try {
            return DynamiteModule.m19544a(context, DynamiteModule.f13812l, "providerinstaller").mo18635a();
        } catch (LoadingException e) {
            String str = "Failed to load providerinstaller module: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            return null;
        }
    }

    @C0195i0
    /* renamed from: c */
    private static Context m13031c(Context context) {
        try {
            return C4284g.getRemoteContext(context);
        } catch (NotFoundException e) {
            String str = "Failed to load GMS Core context for providerinstaller: ";
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            C4488i.m19364a(context, e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m13029a(Context context, C2677a aVar) {
        C4300a0.m18621a(context, (Object) "Context must not be null");
        C4300a0.m18621a(aVar, (Object) "Listener must not be null");
        C4300a0.m18626a("Must be called on the UI thread");
        new C2678b(context, aVar).execute(new Void[0]);
    }
}
