package p212io.branch.referral;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0213q;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.o */
/* compiled from: BranchUtil */
public class C6031o {

    /* renamed from: a */
    static boolean f17310a = false;

    /* renamed from: io.branch.referral.o$a */
    /* compiled from: BranchUtil */
    public static class C6032a {

        /* renamed from: a */
        private final JSONObject f17311a;

        public C6032a(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f17311a = jSONObject2;
        }

        /* renamed from: a */
        public JSONObject mo24921a() {
            return this.f17311a;
        }

        /* renamed from: b */
        public Object mo24923b(String str) {
            Object opt = this.f17311a.opt(str);
            this.f17311a.remove(str);
            return opt;
        }

        /* renamed from: c */
        public boolean mo24925c(String str) {
            boolean optBoolean = this.f17311a.optBoolean(str);
            this.f17311a.remove(str);
            return optBoolean;
        }

        /* renamed from: d */
        public double mo24926d(String str) {
            double optDouble = this.f17311a.optDouble(str);
            this.f17311a.remove(str);
            return optDouble;
        }

        /* renamed from: e */
        public int mo24927e(String str) {
            int optInt = this.f17311a.optInt(str);
            this.f17311a.remove(str);
            return optInt;
        }

        /* renamed from: f */
        public JSONArray mo24928f(String str) {
            JSONArray optJSONArray = this.f17311a.optJSONArray(str);
            this.f17311a.remove(str);
            return optJSONArray;
        }

        /* renamed from: g */
        public long mo24929g(String str) {
            long optLong = this.f17311a.optLong(str);
            this.f17311a.remove(str);
            return optLong;
        }

        /* renamed from: h */
        public String mo24930h(String str) {
            String optString = this.f17311a.optString(str);
            this.f17311a.remove(str);
            return optString;
        }

        /* renamed from: a */
        public Integer mo24919a(String str, Integer num) {
            if (!this.f17311a.has(str)) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f17311a.optInt(str));
            this.f17311a.remove(str);
            return valueOf;
        }

        /* renamed from: b */
        public Iterator<String> mo24924b() {
            return this.f17311a.keys();
        }

        /* renamed from: a */
        public String mo24920a(String str, String str2) {
            String optString = this.f17311a.optString(str, str2);
            this.f17311a.remove(str);
            return optString;
        }

        /* renamed from: a */
        public Double mo24918a(String str, Double d) {
            if (!this.f17311a.has(str)) {
                return d;
            }
            Double valueOf = Double.valueOf(this.f17311a.optDouble(str));
            this.f17311a.remove(str);
            return valueOf;
        }

        /* renamed from: a */
        public boolean mo24922a(String str) {
            return this.f17311a.has(str);
        }
    }

    /* renamed from: a */
    static JSONObject m27710a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("source", "android");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    static JSONObject m27712b(JSONObject jSONObject) {
        return m27710a(jSONObject);
    }

    /* renamed from: c */
    public static boolean m27714c(Context context) {
        boolean parseBoolean;
        if (f17310a) {
            return true;
        }
        String str = "io.branch.sdk.TestMode";
        boolean z = false;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str)) {
                Resources resources = context.getResources();
                parseBoolean = Boolean.parseBoolean(resources.getString(resources.getIdentifier(str, "string", context.getPackageName())));
            } else {
                parseBoolean = applicationInfo.metaData.getBoolean(str, false);
            }
            z = parseBoolean;
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: b */
    public static Drawable m27711b(@C0193h0 Context context, @C0213q int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getResources().getDrawable(i, context.getTheme());
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: a */
    public static int m27708a(Context context, int i) {
        return Math.round(((float) i) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    /* renamed from: b */
    public static boolean m27713b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], org.json.JSONObject, ?[OBJECT, ARRAY]]
      uses: [org.json.JSONObject, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.InputStream]
      mth insns count: 43
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[SYNTHETIC, Splitter:B:21:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052 A[Catch:{ IOException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a A[SYNTHETIC, Splitter:B:31:0x005a] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m27709a(android.content.Context r5) {
        /*
            boolean r0 = m27713b(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0060
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch:{ Exception -> 0x0056, all -> 0x0049 }
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0056, all -> 0x0049 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x0056, all -> 0x0049 }
            r3 = 0
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch:{ Exception -> 0x0056, all -> 0x0049 }
            java.lang.String r5 = r5.publicSourceDir     // Catch:{ Exception -> 0x0056, all -> 0x0049 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0056, all -> 0x0049 }
            java.lang.String r5 = "AndroidManifest.xml"
            java.util.zip.ZipEntry r5 = r0.getEntry(r5)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            java.io.InputStream r5 = r0.getInputStream(r5)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            int r2 = r5.available()     // Catch:{ Exception -> 0x0058, all -> 0x0040 }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0058, all -> 0x0040 }
            r5.read(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0040 }
            io.branch.referral.b r3 = new io.branch.referral.b     // Catch:{ Exception -> 0x0058, all -> 0x0040 }
            r3.<init>()     // Catch:{ Exception -> 0x0058, all -> 0x0040 }
            org.json.JSONObject r1 = r3.mo44629a(r2)     // Catch:{ Exception -> 0x0058, all -> 0x0040 }
            if (r5 == 0) goto L_0x003c
            r5.close()     // Catch:{ IOException -> 0x0060 }
        L_0x003c:
            r0.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0060
        L_0x0040:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x004b
        L_0x0045:
            r5 = move-exception
            goto L_0x004b
        L_0x0047:
            r5 = r1
            goto L_0x0058
        L_0x0049:
            r5 = move-exception
            r0 = r1
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            throw r5
        L_0x0056:
            r5 = r1
            r0 = r5
        L_0x0058:
            if (r5 == 0) goto L_0x005d
            r5.close()     // Catch:{ IOException -> 0x0060 }
        L_0x005d:
            if (r0 == 0) goto L_0x0060
            goto L_0x003c
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C6031o.m27709a(android.content.Context):org.json.JSONObject");
    }
}
