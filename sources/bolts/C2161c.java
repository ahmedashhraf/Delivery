package bolts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import bolts.C2159b.C2160a;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.applinks.AppLinkData;
import com.facebook.internal.AnalyticsEvents;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Failed;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: bolts.c */
/* compiled from: AppLinkNavigation */
public class C2161c {

    /* renamed from: d */
    private static final String f8600d = "user_agent";

    /* renamed from: e */
    private static final String f8601e = "version";

    /* renamed from: f */
    private static final String f8602f = "referer_app_link";

    /* renamed from: g */
    private static final String f8603g = "app_name";

    /* renamed from: h */
    private static final String f8604h = "package";

    /* renamed from: i */
    private static final String f8605i = "1.0";

    /* renamed from: j */
    private static C2164d f8606j;

    /* renamed from: a */
    private final C2159b f8607a;

    /* renamed from: b */
    private final Bundle f8608b;

    /* renamed from: c */
    private final Bundle f8609c;

    /* renamed from: bolts.c$a */
    /* compiled from: AppLinkNavigation */
    static class C2162a implements C2175l<C2159b, C2163b> {

        /* renamed from: a */
        final /* synthetic */ Context f8610a;

        C2162a(Context context) {
            this.f8610a = context;
        }

        public C2163b then(C2177n<C2159b> nVar) throws Exception {
            return C2161c.m11173a(this.f8610a, (C2159b) nVar.mo9321c());
        }
    }

    /* renamed from: bolts.c$b */
    /* compiled from: AppLinkNavigation */
    public enum C2163b {
        FAILED(Failed.ELEMENT, false),
        WEB(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, true),
        APP(C14330v.f42313b, true);
        
        private String code;
        private boolean succeeded;

        private C2163b(String str, boolean z) {
            this.code = str;
            this.succeeded = z;
        }

        /* renamed from: d */
        public String mo9278d() {
            return this.code;
        }

        /* renamed from: e */
        public boolean mo9279e() {
            return this.succeeded;
        }
    }

    public C2161c(C2159b bVar, Bundle bundle, Bundle bundle2) {
        if (bVar != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            this.f8607a = bVar;
            this.f8608b = bundle;
            this.f8609c = bundle2;
            return;
        }
        throw new IllegalArgumentException("appLink must not be null.");
    }

    /* renamed from: d */
    public static C2164d m11186d() {
        return f8606j;
    }

    /* renamed from: a */
    public C2159b mo9273a() {
        return this.f8607a;
    }

    /* renamed from: b */
    public Bundle mo9275b() {
        return this.f8609c;
    }

    /* renamed from: c */
    public Bundle mo9276c() {
        return this.f8608b;
    }

    /* renamed from: a */
    private Object m11180a(Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            return m11181a((Bundle) obj);
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            for (Object a : (List) obj) {
                jSONArray.put(m11180a(a));
            }
            return jSONArray;
        }
        int i = 0;
        if (obj instanceof SparseArray) {
            JSONArray jSONArray2 = new JSONArray();
            SparseArray sparseArray = (SparseArray) obj;
            while (i < sparseArray.size()) {
                jSONArray2.put(sparseArray.keyAt(i), m11180a(sparseArray.valueAt(i)));
                i++;
            }
            return jSONArray2;
        } else if (obj instanceof Character) {
            return obj.toString();
        } else {
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof Number) {
                if ((obj instanceof Double) || (obj instanceof Float)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
                return Long.valueOf(((Number) obj).longValue());
            } else if (obj instanceof boolean[]) {
                JSONArray jSONArray3 = new JSONArray();
                boolean[] zArr = (boolean[]) obj;
                int length = zArr.length;
                while (i < length) {
                    jSONArray3.put(m11180a((Object) Boolean.valueOf(zArr[i])));
                    i++;
                }
                return jSONArray3;
            } else if (obj instanceof char[]) {
                JSONArray jSONArray4 = new JSONArray();
                char[] cArr = (char[]) obj;
                int length2 = cArr.length;
                while (i < length2) {
                    jSONArray4.put(m11180a((Object) Character.valueOf(cArr[i])));
                    i++;
                }
                return jSONArray4;
            } else if (obj instanceof CharSequence[]) {
                JSONArray jSONArray5 = new JSONArray();
                CharSequence[] charSequenceArr = (CharSequence[]) obj;
                int length3 = charSequenceArr.length;
                while (i < length3) {
                    jSONArray5.put(m11180a((Object) charSequenceArr[i]));
                    i++;
                }
                return jSONArray5;
            } else if (obj instanceof double[]) {
                JSONArray jSONArray6 = new JSONArray();
                double[] dArr = (double[]) obj;
                int length4 = dArr.length;
                while (i < length4) {
                    jSONArray6.put(m11180a((Object) Double.valueOf(dArr[i])));
                    i++;
                }
                return jSONArray6;
            } else if (obj instanceof float[]) {
                JSONArray jSONArray7 = new JSONArray();
                float[] fArr = (float[]) obj;
                int length5 = fArr.length;
                while (i < length5) {
                    jSONArray7.put(m11180a((Object) Float.valueOf(fArr[i])));
                    i++;
                }
                return jSONArray7;
            } else if (obj instanceof int[]) {
                JSONArray jSONArray8 = new JSONArray();
                int[] iArr = (int[]) obj;
                int length6 = iArr.length;
                while (i < length6) {
                    jSONArray8.put(m11180a((Object) Integer.valueOf(iArr[i])));
                    i++;
                }
                return jSONArray8;
            } else if (obj instanceof long[]) {
                JSONArray jSONArray9 = new JSONArray();
                long[] jArr = (long[]) obj;
                int length7 = jArr.length;
                while (i < length7) {
                    jSONArray9.put(m11180a((Object) Long.valueOf(jArr[i])));
                    i++;
                }
                return jSONArray9;
            } else if (obj instanceof short[]) {
                JSONArray jSONArray10 = new JSONArray();
                short[] sArr = (short[]) obj;
                int length8 = sArr.length;
                while (i < length8) {
                    jSONArray10.put(m11180a((Object) Short.valueOf(sArr[i])));
                    i++;
                }
                return jSONArray10;
            } else if (!(obj instanceof String[])) {
                return null;
            } else {
                JSONArray jSONArray11 = new JSONArray();
                String[] strArr = (String[]) obj;
                int length9 = strArr.length;
                while (i < length9) {
                    jSONArray11.put(m11180a((Object) strArr[i]));
                    i++;
                }
                return jSONArray11;
            }
        }
    }

    /* renamed from: b */
    private Bundle m11184b(Context context) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        if (context != null) {
            String packageName = context.getPackageName();
            if (packageName != null) {
                bundle2.putString(f8604h, packageName);
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                String string = context.getString(applicationInfo.labelRes);
                if (string != null) {
                    bundle2.putString("app_name", string);
                }
            }
        }
        bundle.putAll(mo9275b());
        bundle.putString("target_url", mo9273a().mo9266a().toString());
        bundle.putString("version", "1.0");
        bundle.putString(f8600d, "Bolts Android 1.4.0");
        bundle.putBundle(f8602f, bundle2);
        bundle.putBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY, mo9276c());
        return bundle;
    }

    /* renamed from: c */
    private static C2164d m11185c(Context context) {
        if (m11186d() != null) {
            return m11186d();
        }
        return new C2198q(context);
    }

    /* renamed from: a */
    private JSONObject m11181a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            jSONObject.put(str, m11180a(bundle.get(str)));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C2163b mo9274a(Context context) {
        String str;
        String str2;
        Intent intent;
        Intent intent2;
        PackageManager packageManager = context.getPackageManager();
        Bundle b = m11184b(context);
        Iterator it = mo9273a().mo9267b().iterator();
        while (true) {
            str = "al_applink_data";
            str2 = "android.intent.action.VIEW";
            if (!it.hasNext()) {
                intent = null;
                break;
            }
            C2160a aVar = (C2160a) it.next();
            intent = new Intent(str2);
            if (aVar.mo9272d() != null) {
                intent.setData(aVar.mo9272d());
            } else {
                intent.setData(this.f8607a.mo9266a());
            }
            intent.setPackage(aVar.mo9271c());
            if (aVar.mo9270b() != null) {
                intent.setClassName(aVar.mo9271c(), aVar.mo9270b());
            }
            intent.putExtra(str, b);
            if (packageManager.resolveActivity(intent, 65536) != null) {
                break;
            }
        }
        C2163b bVar = C2163b.FAILED;
        if (intent != null) {
            bVar = C2163b.APP;
            intent2 = intent;
        } else {
            Uri c = mo9273a().mo9268c();
            if (c != null) {
                try {
                    intent2 = new Intent(str2, c.buildUpon().appendQueryParameter(str, m11181a(b).toString()).build());
                    bVar = C2163b.WEB;
                } catch (JSONException e) {
                    m11182a(context, intent, C2163b.FAILED, e);
                    throw new RuntimeException(e);
                }
            } else {
                intent2 = null;
            }
        }
        m11182a(context, intent2, bVar, null);
        if (intent2 != null) {
            context.startActivity(intent2);
        }
        return bVar;
    }

    /* renamed from: a */
    private void m11182a(Context context, Intent intent, C2163b bVar, JSONException jSONException) {
        HashMap hashMap = new HashMap();
        if (jSONException != null) {
            hashMap.put("error", jSONException.getLocalizedMessage());
        }
        hashMap.put("success", bVar.mo9279e() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        hashMap.put("type", bVar.mo9278d());
        C2176m.m11226a(context, C2176m.f8637g, intent, (Map<String, String>) hashMap);
    }

    /* renamed from: a */
    public static void m11183a(C2164d dVar) {
        f8606j = dVar;
    }

    /* renamed from: a */
    public static C2163b m11173a(Context context, C2159b bVar) {
        return new C2161c(bVar, null, null).mo9274a(context);
    }

    /* renamed from: a */
    public static C2177n<C2163b> m11175a(Context context, Uri uri, C2164d dVar) {
        return dVar.getAppLinkFromUrlInBackground(uri).mo9319c((C2175l<TResult, TContinuationResult>) new C2162a<TResult,TContinuationResult>(context), C2177n.f8644k);
    }

    /* renamed from: a */
    public static C2177n<C2163b> m11179a(Context context, URL url, C2164d dVar) {
        return m11175a(context, Uri.parse(url.toString()), dVar);
    }

    /* renamed from: a */
    public static C2177n<C2163b> m11177a(Context context, String str, C2164d dVar) {
        return m11175a(context, Uri.parse(str), dVar);
    }

    /* renamed from: a */
    public static C2177n<C2163b> m11174a(Context context, Uri uri) {
        return m11175a(context, uri, m11185c(context));
    }

    /* renamed from: a */
    public static C2177n<C2163b> m11178a(Context context, URL url) {
        return m11179a(context, url, m11185c(context));
    }

    /* renamed from: a */
    public static C2177n<C2163b> m11176a(Context context, String str) {
        return m11177a(context, str, m11185c(context));
    }
}
