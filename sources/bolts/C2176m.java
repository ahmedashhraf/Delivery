package bolts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bolts.m */
/* compiled from: MeasurementEvent */
public class C2176m {

    /* renamed from: d */
    public static final String f8634d = "com.parse.bolts.measurement_event";

    /* renamed from: e */
    public static final String f8635e = "event_name";

    /* renamed from: f */
    public static final String f8636f = "event_args";

    /* renamed from: g */
    public static final String f8637g = "al_nav_out";

    /* renamed from: h */
    public static final String f8638h = "al_nav_in";

    /* renamed from: a */
    private Context f8639a;

    /* renamed from: b */
    private String f8640b;

    /* renamed from: c */
    private Bundle f8641c;

    private C2176m(Context context, String str, Bundle bundle) {
        this.f8639a = context.getApplicationContext();
        this.f8640b = str;
        this.f8641c = bundle;
    }

    /* renamed from: a */
    static void m11226a(Context context, String str, Intent intent, Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (intent != null) {
            Bundle a = C2165e.m11194a(intent);
            if (a != null) {
                bundle = m11223a(context, str, a, intent);
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    bundle.putString("intentData", data.toString());
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str2 : extras.keySet()) {
                        bundle.putString(str2, m11224a(extras.get(str2)));
                    }
                }
            }
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                bundle.putString(str3, (String) map.get(str3));
            }
        }
        new C2176m(context, str, bundle).m11225a();
    }

    /* renamed from: a */
    private void m11225a() {
        String str = this.f8640b;
        try {
            Class cls = Class.forName("b.g.b.a");
            Method method = cls.getMethod("getInstance", new Class[]{Context.class});
            Method method2 = cls.getMethod("sendBroadcast", new Class[]{Intent.class});
            Object invoke = method.invoke(null, new Object[]{this.f8639a});
            Intent intent = new Intent(f8634d);
            intent.putExtra(f8635e, this.f8640b);
            intent.putExtra(f8636f, this.f8641c);
            method2.invoke(invoke, new Object[]{intent});
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static Bundle m11223a(Context context, String str, Bundle bundle, Intent intent) {
        Bundle bundle2 = new Bundle();
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity != null) {
            bundle2.putString("class", resolveActivity.getShortClassName());
        }
        String str2 = "package";
        if (f8637g.equals(str)) {
            if (resolveActivity != null) {
                bundle2.putString(str2, resolveActivity.getPackageName());
            }
            if (intent.getData() != null) {
                bundle2.putString("outputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("outputURLScheme", intent.getScheme());
            }
        } else if (f8638h.equals(str)) {
            if (intent.getData() != null) {
                bundle2.putString("inputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null) {
                bundle2.putString("inputURLScheme", intent.getScheme());
            }
        }
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof Bundle) {
                Bundle bundle3 = (Bundle) obj;
                for (String str4 : bundle3.keySet()) {
                    String a = m11224a(bundle3.get(str4));
                    if (str3.equals("referer_app_link")) {
                        if (str4.equalsIgnoreCase("url")) {
                            bundle2.putString("refererURL", a);
                        } else if (str4.equalsIgnoreCase(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING)) {
                            bundle2.putString("refererAppName", a);
                        } else if (str4.equalsIgnoreCase(str2)) {
                            bundle2.putString("sourceApplication", a);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("/");
                    sb.append(str4);
                    bundle2.putString(sb.toString(), a);
                }
            } else {
                String a2 = m11224a(obj);
                if (str3.equals("target_url")) {
                    Uri parse = Uri.parse(a2);
                    bundle2.putString("targetURL", parse.toString());
                    bundle2.putString("targetURLHost", parse.getHost());
                } else {
                    bundle2.putString(str3, a2);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    private static String m11224a(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj.toString();
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj).toString();
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj).toString();
            }
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
