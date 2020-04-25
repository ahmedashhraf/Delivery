package p212io.branch.referral;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: io.branch.referral.r */
/* compiled from: DeferredAppLinkDataHandler */
class C14164r {

    /* renamed from: a */
    private static final String f41688a = "com.facebook.platform.APPLINK_NATIVE_URL";

    /* renamed from: io.branch.referral.r$a */
    /* compiled from: DeferredAppLinkDataHandler */
    static class C14165a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class f41689a;

        /* renamed from: b */
        final /* synthetic */ C14166b f41690b;

        C14165a(Class cls, C14166b bVar) {
            this.f41689a = cls;
            this.f41690b = bVar;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!method.getName().equals("onDeferredAppLinkDataFetched") || objArr[0] == null) {
                C14166b bVar = this.f41690b;
                if (bVar != null) {
                    bVar.mo24831a(null);
                }
            } else {
                Bundle bundle = (Bundle) Bundle.class.cast(this.f41689a.getMethod("getArgumentBundle", new Class[0]).invoke(this.f41689a.cast(objArr[0]), new Object[0]));
                String string = bundle != null ? bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL") : null;
                C14166b bVar2 = this.f41690b;
                if (bVar2 != null) {
                    bVar2.mo24831a(string);
                }
            }
            return null;
        }
    }

    /* renamed from: io.branch.referral.r$b */
    /* compiled from: DeferredAppLinkDataHandler */
    public interface C14166b {
        /* renamed from: a */
        void mo24831a(String str);
    }

    C14164r() {
    }

    /* renamed from: a */
    public static Boolean m61295a(Context context, C14166b bVar) {
        boolean z = false;
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{Context.class}).invoke(null, new Object[]{context});
            Class cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls2});
            C14165a aVar = new C14165a(cls, bVar);
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, aVar);
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if (!TextUtils.isEmpty(string)) {
                method.invoke(null, new Object[]{context, string, newProxyInstance});
                z = true;
            }
        } catch (Throwable unused) {
        }
        return Boolean.valueOf(z);
    }
}
