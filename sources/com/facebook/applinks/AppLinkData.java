package com.facebook.applinks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLinkData {
    private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
    private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
    private static final String APPLINK_VERSION_KEY = "version";
    public static final String ARGUMENTS_EXTRAS_KEY = "extras";
    public static final String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
    public static final String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
    public static final String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
    public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
    private static final String BRIDGE_ARGS_METHOD_KEY = "method";
    private static final String BUNDLE_AL_APPLINK_DATA_KEY = "al_applink_data";
    static final String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
    private static final String DEFERRED_APP_LINK_ARGS_FIELD = "applink_args";
    private static final String DEFERRED_APP_LINK_CLASS_FIELD = "applink_class";
    private static final String DEFERRED_APP_LINK_CLICK_TIME_FIELD = "click_time";
    private static final String DEFERRED_APP_LINK_EVENT = "DEFERRED_APP_LINK";
    private static final String DEFERRED_APP_LINK_PATH = "%s/activities";
    private static final String DEFERRED_APP_LINK_URL_FIELD = "applink_url";
    private static final String EXTRAS_DEEPLINK_CONTEXT_KEY = "deeplink_context";
    private static final String METHOD_ARGS_REF_KEY = "ref";
    private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
    private static final String PROMOTION_CODE_KEY = "promo_code";
    private static final String REFERER_DATA_REF_KEY = "fb_ref";
    private static final String TAG = "com.facebook.applinks.AppLinkData";
    private Bundle argumentBundle;
    private JSONObject arguments;
    private String promotionCode;
    private String ref;
    private Uri targetUri;

    public interface CompletionHandler {
        void onDeferredAppLinkDataFetched(AppLinkData appLinkData);
    }

    private AppLinkData() {
    }

    public static AppLinkData createFromActivity(Activity activity) {
        Validate.notNull(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        AppLinkData createFromAlApplinkData = createFromAlApplinkData(intent);
        if (createFromAlApplinkData == null) {
            createFromAlApplinkData = createFromJson(intent.getStringExtra(BUNDLE_APPLINK_ARGS_KEY));
        }
        if (createFromAlApplinkData == null) {
            createFromAlApplinkData = createFromUri(intent.getData());
        }
        return createFromAlApplinkData;
    }

    public static AppLinkData createFromAlApplinkData(Intent intent) {
        String str = "promo_code";
        if (intent == null) {
            return null;
        }
        Bundle bundleExtra = intent.getBundleExtra(BUNDLE_AL_APPLINK_DATA_KEY);
        if (bundleExtra == null) {
            return null;
        }
        AppLinkData appLinkData = new AppLinkData();
        appLinkData.targetUri = intent.getData();
        if (appLinkData.targetUri == null) {
            String string = bundleExtra.getString(METHOD_ARGS_TARGET_URL_KEY);
            if (string != null) {
                appLinkData.targetUri = Uri.parse(string);
            }
        }
        appLinkData.argumentBundle = bundleExtra;
        appLinkData.arguments = null;
        Bundle bundle = bundleExtra.getBundle(ARGUMENTS_REFERER_DATA_KEY);
        if (bundle != null) {
            appLinkData.ref = bundle.getString(REFERER_DATA_REF_KEY);
        }
        Bundle bundle2 = bundleExtra.getBundle(ARGUMENTS_EXTRAS_KEY);
        if (bundle2 != null) {
            String string2 = bundle2.getString("deeplink_context");
            if (string2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    if (jSONObject.has(str)) {
                        appLinkData.promotionCode = jSONObject.getString(str);
                    }
                } catch (JSONException e) {
                    Utility.logd(TAG, "Unable to parse deeplink_context JSON", e);
                }
            }
        }
        return appLinkData;
    }

    private static AppLinkData createFromJson(String str) {
        String str2 = "promo_code";
        String str3 = "deeplink_context";
        String str4 = ARGUMENTS_EXTRAS_KEY;
        String str5 = REFERER_DATA_REF_KEY;
        String str6 = METHOD_ARGS_TARGET_URL_KEY;
        String str7 = ARGUMENTS_REFERER_DATA_KEY;
        String str8 = METHOD_ARGS_REF_KEY;
        String str9 = "Unable to parse AppLink JSON";
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                AppLinkData appLinkData = new AppLinkData();
                appLinkData.arguments = jSONObject.getJSONObject("method_args");
                if (appLinkData.arguments.has(str8)) {
                    appLinkData.ref = appLinkData.arguments.getString(str8);
                } else if (appLinkData.arguments.has(str7)) {
                    JSONObject jSONObject2 = appLinkData.arguments.getJSONObject(str7);
                    if (jSONObject2.has(str5)) {
                        appLinkData.ref = jSONObject2.getString(str5);
                    }
                }
                if (appLinkData.arguments.has(str6)) {
                    appLinkData.targetUri = Uri.parse(appLinkData.arguments.getString(str6));
                }
                if (appLinkData.arguments.has(str4)) {
                    JSONObject jSONObject3 = appLinkData.arguments.getJSONObject(str4);
                    if (jSONObject3.has(str3)) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject(str3);
                        if (jSONObject4.has(str2)) {
                            appLinkData.promotionCode = jSONObject4.getString(str2);
                        }
                    }
                }
                appLinkData.argumentBundle = toBundle(appLinkData.arguments);
                return appLinkData;
            }
        } catch (JSONException e) {
            Utility.logd(TAG, str9, e);
        } catch (FacebookException e2) {
            Utility.logd(TAG, str9, e2);
        }
        return null;
    }

    private static AppLinkData createFromUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        AppLinkData appLinkData = new AppLinkData();
        appLinkData.targetUri = uri;
        return appLinkData;
    }

    public static void fetchDeferredAppLinkData(Context context, CompletionHandler completionHandler) {
        fetchDeferredAppLinkData(context, null, completionHandler);
    }

    /* JADX INFO: used method not loaded: com.facebook.internal.Utility.logd(java.lang.String, java.lang.String):null, types can be incorrect */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        com.facebook.internal.Utility.logd(TAG, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        com.facebook.internal.Utility.logd(TAG, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.facebook.internal.Utility.logd(TAG, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        com.facebook.internal.Utility.logd(TAG, "Unable to fetch deferred applink from server");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0089 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void fetchDeferredAppLinkFromServer(android.content.Context r7, java.lang.String r8, com.facebook.applinks.AppLinkData.CompletionHandler r9) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "event"
            java.lang.String r2 = "DEFERRED_APP_LINK"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00d2 }
            com.facebook.internal.AttributionIdentifiers r1 = com.facebook.internal.AttributionIdentifiers.getAttributionIdentifiers(r7)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r2 = com.facebook.appevents.AppEventsLogger.getAnonymousAppDeviceGUID(r7)     // Catch:{ JSONException -> 0x00d2 }
            boolean r3 = com.facebook.FacebookSdk.getLimitEventAndDataUsage(r7)     // Catch:{ JSONException -> 0x00d2 }
            com.facebook.internal.Utility.setAppEventAttributionParameters(r0, r1, r2, r3)     // Catch:{ JSONException -> 0x00d2 }
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ JSONException -> 0x00d2 }
            com.facebook.internal.Utility.setAppEventExtendedDeviceInfoParameters(r0, r1)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r1 = "application_package_name"
            java.lang.String r7 = r7.getPackageName()     // Catch:{ JSONException -> 0x00d2 }
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x00d2 }
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r1 = 0
            r7[r1] = r8
            java.lang.String r8 = "%s/activities"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r8 = 0
            com.facebook.GraphRequest r7 = com.facebook.GraphRequest.newPostRequest(r8, r7, r0, r8)     // Catch:{ Exception -> 0x00c7 }
            com.facebook.GraphResponse r7 = r7.executeAndWait()     // Catch:{ Exception -> 0x00c7 }
            org.json.JSONObject r7 = r7.getJSONObject()     // Catch:{ Exception -> 0x00c7 }
            if (r7 == 0) goto L_0x00ce
            java.lang.String r0 = "applink_args"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "click_time"
            r2 = -1
            long r4 = r7.optLong(r1, r2)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r1 = "applink_class"
            java.lang.String r1 = r7.optString(r1)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r6 = "applink_url"
            java.lang.String r7 = r7.optString(r6)     // Catch:{ Exception -> 0x00c7 }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00c7 }
            if (r6 != 0) goto L_0x00ce
            com.facebook.applinks.AppLinkData r8 = createFromJson(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "Unable to put tap time in AppLinkData.arguments"
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x008e
            org.json.JSONObject r2 = r8.arguments     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r3 = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
            if (r2 == 0) goto L_0x007b
            org.json.JSONObject r2 = r8.arguments     // Catch:{ JSONException -> 0x0089 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0089 }
        L_0x007b:
            android.os.Bundle r2 = r8.argumentBundle     // Catch:{ JSONException -> 0x0089 }
            if (r2 == 0) goto L_0x008e
            android.os.Bundle r2 = r8.argumentBundle     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ JSONException -> 0x0089 }
            r2.putString(r3, r4)     // Catch:{ JSONException -> 0x0089 }
            goto L_0x008e
        L_0x0089:
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x00c7 }
            com.facebook.internal.Utility.logd(r2, r0)     // Catch:{ Exception -> 0x00c7 }
        L_0x008e:
            if (r1 == 0) goto L_0x00aa
            org.json.JSONObject r2 = r8.arguments     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r3 = "com.facebook.platform.APPLINK_NATIVE_CLASS"
            if (r2 == 0) goto L_0x009b
            org.json.JSONObject r2 = r8.arguments     // Catch:{ JSONException -> 0x00a5 }
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x00a5 }
        L_0x009b:
            android.os.Bundle r2 = r8.argumentBundle     // Catch:{ JSONException -> 0x00a5 }
            if (r2 == 0) goto L_0x00aa
            android.os.Bundle r2 = r8.argumentBundle     // Catch:{ JSONException -> 0x00a5 }
            r2.putString(r3, r1)     // Catch:{ JSONException -> 0x00a5 }
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r1 = TAG     // Catch:{ Exception -> 0x00c7 }
            com.facebook.internal.Utility.logd(r1, r0)     // Catch:{ Exception -> 0x00c7 }
        L_0x00aa:
            if (r7 == 0) goto L_0x00ce
            org.json.JSONObject r1 = r8.arguments     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r2 = "com.facebook.platform.APPLINK_NATIVE_URL"
            if (r1 == 0) goto L_0x00b7
            org.json.JSONObject r1 = r8.arguments     // Catch:{ JSONException -> 0x00c1 }
            r1.put(r2, r7)     // Catch:{ JSONException -> 0x00c1 }
        L_0x00b7:
            android.os.Bundle r1 = r8.argumentBundle     // Catch:{ JSONException -> 0x00c1 }
            if (r1 == 0) goto L_0x00ce
            android.os.Bundle r1 = r8.argumentBundle     // Catch:{ JSONException -> 0x00c1 }
            r1.putString(r2, r7)     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x00ce
        L_0x00c1:
            java.lang.String r7 = TAG     // Catch:{ Exception -> 0x00c7 }
            com.facebook.internal.Utility.logd(r7, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00ce
        L_0x00c7:
            java.lang.String r7 = TAG
            java.lang.String r0 = "Unable to fetch deferred applink from server"
            com.facebook.internal.Utility.logd(r7, r0)
        L_0x00ce:
            r9.onDeferredAppLinkDataFetched(r8)
            return
        L_0x00d2:
            r7 = move-exception
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "An error occurred while preparing deferred app link"
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.applinks.AppLinkData.fetchDeferredAppLinkFromServer(android.content.Context, java.lang.String, com.facebook.applinks.AppLinkData$CompletionHandler):void");
    }

    private static Bundle toBundle(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                bundle.putBundle(str, toBundle((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(str, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = toBundle(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(str, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(str, strArr);
                    } else {
                        throw new FacebookException("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    public Bundle getArgumentBundle() {
        return this.argumentBundle;
    }

    public String getPromotionCode() {
        return this.promotionCode;
    }

    public String getRef() {
        return this.ref;
    }

    public Bundle getRefererData() {
        Bundle bundle = this.argumentBundle;
        if (bundle != null) {
            return bundle.getBundle(ARGUMENTS_REFERER_DATA_KEY);
        }
        return null;
    }

    public Uri getTargetUri() {
        return this.targetUri;
    }

    public static void fetchDeferredAppLinkData(Context context, final String str, final CompletionHandler completionHandler) {
        Validate.notNull(context, "context");
        Validate.notNull(completionHandler, "completionHandler");
        if (str == null) {
            str = Utility.getMetadataApplicationId(context);
        }
        Validate.notNull(str, "applicationId");
        final Context applicationContext = context.getApplicationContext();
        FacebookSdk.getExecutor().execute(new Runnable() {
            public void run() {
                AppLinkData.fetchDeferredAppLinkFromServer(applicationContext, str, completionHandler);
            }
        });
    }
}
