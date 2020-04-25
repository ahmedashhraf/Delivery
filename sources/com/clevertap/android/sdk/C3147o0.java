package com.clevertap.android.sdk;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.o0 */
/* compiled from: CTWebInterface */
public class C3147o0 {

    /* renamed from: a */
    private WeakReference<C3150p0> f11226a;

    public C3147o0(C3150p0 p0Var) {
        this.f11226a = new WeakReference<>(p0Var);
    }

    @JavascriptInterface
    public void addMultiValueForKey(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12445a(str, str2);
        }
    }

    @JavascriptInterface
    public void addMultiValuesForKey(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str == null) {
            C3111h1.m14938f("Key passed to CTWebInterface is null");
        } else if (str2 != null) {
            try {
                p0Var.mo12447a(str, C3238w1.m15661a(new JSONArray(str2)));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse values from WebView ");
                sb.append(e.getLocalizedMessage());
                C3111h1.m14938f(sb.toString());
            }
        } else {
            C3111h1.m14938f("values passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void pushEvent(String str) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12481h(str);
        }
    }

    @JavascriptInterface
    public void pushProfile(String str) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str != null) {
            try {
                p0Var.mo12465b((Map<String, Object>) C3238w1.m15663a(new JSONObject(str)));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse profile from WebView ");
                sb.append(e.getLocalizedMessage());
                C3111h1.m14938f(sb.toString());
            }
        } else {
            C3111h1.m14938f("profile passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void removeMultiValueForKey(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str == null) {
            C3111h1.m14938f("Key passed to CTWebInterface is null");
        } else if (str2 == null) {
            C3111h1.m14938f("Value passed to CTWebInterface is null");
        } else {
            p0Var.mo12462b(str, str2);
        }
    }

    @JavascriptInterface
    public void removeMultiValuesForKey(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str == null) {
            C3111h1.m14938f("Key passed to CTWebInterface is null");
        } else if (str2 != null) {
            try {
                p0Var.mo12463b(str, C3238w1.m15661a(new JSONArray(str2)));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse values from WebView ");
                sb.append(e.getLocalizedMessage());
                C3111h1.m14938f(sb.toString());
            }
        } else {
            C3111h1.m14938f("values passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void removeValueForKey(String str) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str == null) {
            C3111h1.m14938f("Key passed to CTWebInterface is null");
        } else {
            p0Var.mo12485j(str);
        }
    }

    @JavascriptInterface
    public void setMultiValueForKey(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str == null) {
            C3111h1.m14938f("Key passed to CTWebInterface is null");
        } else if (str2 != null) {
            try {
                p0Var.mo12470c(str, C3238w1.m15661a(new JSONArray(str2)));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse values from WebView ");
                sb.append(e.getLocalizedMessage());
                C3111h1.m14938f(sb.toString());
            }
        } else {
            C3111h1.m14938f("values passed to CTWebInterface is null");
        }
    }

    @JavascriptInterface
    public void pushEvent(String str, String str2) {
        C3150p0 p0Var = (C3150p0) this.f11226a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else if (str2 != null) {
            try {
                p0Var.mo12448a(str, (Map<String, Object>) C3238w1.m15663a(new JSONObject(str2)));
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse eventActions from WebView ");
                sb.append(e.getLocalizedMessage());
                C3111h1.m14938f(sb.toString());
            }
        } else {
            C3111h1.m14938f("eventActions passed to CTWebInterface is null");
        }
    }
}
