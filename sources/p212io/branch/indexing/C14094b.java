package p212io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AbsListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14204x;

/* renamed from: io.branch.indexing.b */
/* compiled from: ContentDiscoverer */
public class C14094b {

    /* renamed from: A */
    private static final String f41393A = "e";

    /* renamed from: B */
    private static final String f41394B = "$";

    /* renamed from: C */
    private static final String f41395C = "bnc_esw";

    /* renamed from: D */
    private static final String f41396D = "RecyclerView";

    /* renamed from: n */
    private static C14094b f41397n = null;

    /* renamed from: o */
    private static final int f41398o = 1000;

    /* renamed from: p */
    private static final int f41399p = 1500;

    /* renamed from: q */
    private static final String f41400q = "ts";

    /* renamed from: r */
    private static final String f41401r = "tc";

    /* renamed from: s */
    private static final String f41402s = "n";

    /* renamed from: t */
    private static final String f41403t = "rl";

    /* renamed from: u */
    private static final String f41404u = "cl";

    /* renamed from: v */
    private static final String f41405v = "cm";

    /* renamed from: w */
    private static final String f41406w = "v";

    /* renamed from: x */
    private static final String f41407x = "cd";

    /* renamed from: y */
    private static final String f41408y = "ck";

    /* renamed from: z */
    private static final String f41409z = "p";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Handler f41410a = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Activity> f41411b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f41412c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public JSONObject f41413d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f41414e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f41415f = 15;

    /* renamed from: g */
    private final C14098d f41416g = new C14098d();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C14099c f41417h;

    /* renamed from: i */
    private final Map<String, WeakReference<ViewTreeObserver>> f41418i = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ArrayList<String> f41419j = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Runnable f41420k = new C14095a();

    /* renamed from: l */
    private OnScrollChangedListener f41421l = new C14096b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Runnable f41422m = new C14097c();

    /* renamed from: io.branch.indexing.b$a */
    /* compiled from: ContentDiscoverer */
    class C14095a implements Runnable {
        C14095a() {
        }

        public void run() {
            JSONArray jSONArray;
            try {
                C14094b.this.f41414e = C14094b.this.f41414e + 1;
                if (C14094b.this.f41417h.mo44582e() && C14094b.this.f41411b != null && C14094b.this.f41411b.get() != null) {
                    Activity activity = (Activity) C14094b.this.f41411b.get();
                    C14094b.this.f41413d = new JSONObject();
                    C14094b.this.f41413d.put(C14094b.f41400q, System.currentTimeMillis());
                    if (!TextUtils.isEmpty(C14094b.this.f41412c)) {
                        C14094b.this.f41413d.put(C14094b.f41403t, C14094b.this.f41412c);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("/");
                    sb.append(activity.getClass().getSimpleName());
                    String sb2 = sb.toString();
                    C14094b.this.f41413d.put("v", sb2);
                    ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                    if (viewGroup != null) {
                        C14100a a = C14094b.this.f41417h.mo44576a(activity);
                        boolean z = true;
                        boolean z2 = a != null && a.mo44586d();
                        if (a != null) {
                            z2 = a.mo44586d();
                            JSONObject g = C14094b.this.f41413d;
                            String str = XHTMLText.f45021H;
                            if (z2) {
                                z = false;
                            }
                            g.put(str, z);
                            jSONArray = a.mo44584b();
                        } else {
                            jSONArray = null;
                        }
                        boolean z3 = z2;
                        String str2 = C14094b.f41408y;
                        if (jSONArray != null) {
                            if (jSONArray.length() > 0) {
                                JSONArray jSONArray2 = new JSONArray();
                                C14094b.this.f41413d.put(str2, jSONArray2);
                                JSONArray jSONArray3 = new JSONArray();
                                C14094b.this.f41413d.put("cd", jSONArray3);
                                C14094b.this.m60948a(jSONArray, jSONArray3, jSONArray2, activity, z3);
                                C14094b.this.f41419j.add(sb2);
                                C14204x.m61505a((Context) activity).mo44951a(C14094b.this.f41413d);
                                int a2 = C14094b.this.f41417h.mo44576a(activity).mo44583a();
                                C14094b.this.f41415f = C14094b.this.f41417h.mo44576a(activity).mo44585c();
                                if (C14094b.this.f41414e < C14094b.this.f41415f && a2 >= 500 && jSONArray != null && jSONArray.length() > 0) {
                                    C14094b.this.f41410a.postDelayed(C14094b.this.f41420k, (long) a2);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!C14094b.this.f41419j.contains(sb2)) {
                            JSONArray jSONArray4 = new JSONArray();
                            C14094b.this.f41413d.put(str2, jSONArray4);
                            C14094b.this.m60943a(viewGroup, jSONArray4, activity.getResources());
                        }
                        C14094b.this.f41419j.add(sb2);
                        C14204x.m61505a((Context) activity).mo44951a(C14094b.this.f41413d);
                        int a22 = C14094b.this.f41417h.mo44576a(activity).mo44583a();
                        C14094b.this.f41415f = C14094b.this.f41417h.mo44576a(activity).mo44585c();
                        if (C14094b.this.f41414e < C14094b.this.f41415f) {
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: io.branch.indexing.b$b */
    /* compiled from: ContentDiscoverer */
    class C14096b implements OnScrollChangedListener {
        C14096b() {
        }

        public void onScrollChanged() {
            C14094b.this.f41410a.removeCallbacks(C14094b.this.f41422m);
            if (C14094b.this.f41415f > C14094b.this.f41414e) {
                C14094b.this.f41410a.postDelayed(C14094b.this.f41422m, 1500);
            }
        }
    }

    /* renamed from: io.branch.indexing.b$c */
    /* compiled from: ContentDiscoverer */
    class C14097c implements Runnable {
        C14097c() {
        }

        public void run() {
            C14094b.this.f41420k.run();
        }
    }

    /* renamed from: io.branch.indexing.b$d */
    /* compiled from: ContentDiscoverer */
    private class C14098d {

        /* renamed from: a */
        MessageDigest f41426a;

        C14098d() {
            try {
                this.f41426a = MessageDigest.getInstance(StringUtils.MD5);
            } catch (NoSuchAlgorithmException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo44575a(String str) {
            MessageDigest messageDigest = this.f41426a;
            if (messageDigest == null) {
                return "";
            }
            messageDigest.reset();
            this.f41426a.update(str.getBytes());
            return new String(this.f41426a.digest());
        }
    }

    private C14094b() {
    }

    /* renamed from: b */
    public void mo44571b(Activity activity, String str) {
        this.f41419j = new ArrayList<>();
        mo44570a(activity, str);
    }

    /* renamed from: b */
    private void m60951b(Activity activity) {
        this.f41414e = 0;
        if (this.f41419j.size() < this.f41417h.mo44581d()) {
            this.f41410a.removeCallbacks(this.f41420k);
            this.f41411b = new WeakReference<>(activity);
            this.f41410a.postDelayed(this.f41420k, 1000);
        }
    }

    /* renamed from: a */
    public static C14094b m60938a() {
        if (f41397n == null) {
            f41397n = new C14094b();
        }
        return f41397n;
    }

    /* renamed from: b */
    private void m60950b() {
        try {
            if (this.f41413d != null) {
                this.f41413d.put(f41401r, System.currentTimeMillis());
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void mo44570a(Activity activity, String str) {
        this.f41417h = C14099c.m60966a((Context) activity);
        this.f41412c = str;
        C14100a a = this.f41417h.mo44576a(activity);
        if (a != null) {
            if (!a.mo44587e()) {
                m60951b(activity);
            }
        } else if (!TextUtils.isEmpty(this.f41412c)) {
            m60951b(activity);
        }
    }

    /* renamed from: a */
    public void mo44569a(Activity activity) {
        WeakReference<Activity> weakReference = this.f41411b;
        if (!(weakReference == null || weakReference.get() == null || !((Activity) this.f41411b.get()).getClass().getName().equals(activity.getClass().getName()))) {
            this.f41410a.removeCallbacks(this.f41420k);
            this.f41411b = null;
        }
        m60950b();
        for (WeakReference weakReference2 : this.f41418i.values()) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference2.get();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.f41421l);
            }
        }
        this.f41418i.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m60943a(ViewGroup viewGroup, JSONArray jSONArray, Resources resources) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if ((childAt instanceof AbsListView) || childAt.getClass().getSimpleName().equals(f41396D)) {
                    m60942a((ViewGroup) childAt, resources, jSONArray);
                } else if (childAt instanceof ViewGroup) {
                    m60943a((ViewGroup) childAt, jSONArray, resources);
                } else if (childAt instanceof TextView) {
                    jSONArray.put(m60939a(childAt, resources));
                }
            }
        }
    }

    /* renamed from: a */
    private void m60942a(ViewGroup viewGroup, Resources resources, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (viewGroup != null && viewGroup.getChildCount() > -1) {
            int i = 1;
            if (viewGroup.getChildCount() <= 1) {
                i = 0;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONObject.put(m60939a((View) viewGroup, resources), jSONArray2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (childAt instanceof ViewGroup) {
                    m60943a((ViewGroup) childAt, jSONArray2, resources);
                } else if (childAt instanceof TextView) {
                    jSONArray2.put(m60939a(childAt, resources));
                }
                if (jSONObject.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(f41394B);
                    sb.append(jSONObject);
                    jSONArray.put(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m60948a(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, Activity activity, boolean z) {
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                String string = jSONArray.getString(i);
                if (string.startsWith(f41394B)) {
                    m60946a(string, activity, z, jSONArray2, jSONArray3);
                } else {
                    m60947a(string, activity.findViewById(activity.getResources().getIdentifier(jSONArray.getString(i), "id", activity.getPackageName())), z, jSONArray2, jSONArray3);
                }
                i++;
            } catch (JSONException unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m60946a(String str, Activity activity, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        String str2 = str;
        String str3 = f41395C;
        String str4 = "id";
        JSONObject jSONObject = new JSONObject();
        jSONArray2.put(str2);
        jSONArray.put(jSONObject);
        String str5 = "";
        String replace = str2.replace(f41394B, str5);
        try {
            JSONObject jSONObject2 = new JSONObject(replace);
            if (jSONObject2.length() > 0) {
                String str6 = (String) jSONObject2.keys().next();
                int identifier = activity.getResources().getIdentifier(str6, str4, activity.getPackageName());
                View findViewById = activity.getCurrentFocus() != null ? activity.getCurrentFocus().findViewById(identifier) : null;
                if (findViewById == null) {
                    findViewById = activity.findViewById(identifier);
                } else {
                    Activity activity2 = activity;
                }
                if (findViewById != null && (findViewById instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    JSONArray jSONArray3 = jSONObject2.getJSONArray(str6);
                    int[] iArr = new int[jSONArray3.length()];
                    for (int i = 0; i < jSONArray3.length(); i++) {
                        iArr[i] = activity.getResources().getIdentifier(jSONArray3.getString(i), str4, activity.getPackageName());
                    }
                    int firstVisiblePosition = viewGroup instanceof AbsListView ? ((AbsListView) viewGroup).getFirstVisiblePosition() : 0;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        if (viewGroup.getChildAt(i2) != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str5);
                            sb.append(i2 + firstVisiblePosition);
                            jSONObject.put(sb.toString(), jSONObject3);
                            for (int i3 = 0; i3 < iArr.length; i3++) {
                                if (viewGroup.getChildAt(i2) != null) {
                                    View findViewById2 = viewGroup.getChildAt(i2).findViewById(iArr[i3]);
                                    if (findViewById2 instanceof TextView) {
                                        jSONObject3.put(jSONArray3.getString(i3), m60940a(findViewById2, z));
                                    }
                                }
                                boolean z2 = z;
                            }
                        }
                        boolean z3 = z;
                    }
                    if ((jSONObject2.has(str3) && jSONObject2.getBoolean(str3)) && !this.f41418i.containsKey(replace)) {
                        viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f41421l);
                        this.f41418i.put(replace, new WeakReference(viewGroup.getViewTreeObserver()));
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m60939a(View view, Resources resources) {
        try {
            return resources.getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return String.valueOf(view.getId());
        }
    }

    /* renamed from: a */
    private String m60940a(View view, boolean z) {
        TextView textView = (TextView) view;
        if (textView.getText() == null) {
            return null;
        }
        String substring = textView.getText().toString().substring(0, Math.min(textView.getText().toString().length(), this.f41417h.mo44580c()));
        return z ? substring : this.f41416g.mo44575a(substring);
    }

    /* renamed from: a */
    private void m60947a(String str, View view, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        if (view instanceof TextView) {
            jSONArray.put(m60940a(view, z));
            jSONArray2.put(str);
        }
    }

    /* renamed from: a */
    public JSONObject mo44568a(Context context) {
        JSONObject jSONObject;
        String str = "p";
        JSONObject h = C14204x.m61505a(context).mo44976h();
        if (h.length() <= 0 || h.toString().length() >= this.f41417h.mo44579b()) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C14099c.f41429k, C14099c.m60966a(context).mo44577a()).put(f41393A, h);
                if (context != null) {
                    jSONObject.put(str, context.getPackageName());
                    jSONObject.put(str, context.getPackageName());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C14204x.m61505a(context).mo44943a();
        return jSONObject;
    }
}
