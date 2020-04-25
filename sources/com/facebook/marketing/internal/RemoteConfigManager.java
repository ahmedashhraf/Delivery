package com.facebook.marketing.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0195i0;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.AttributionIdentifiers;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class RemoteConfigManager {
    private static final String SAMPLING_ENDPOINT_PATH = "%s/button_auto_detection_device_selection";
    private static final String SAMPLING_RESULT_FIELD = "is_selected";
    private static final String TAG = "com.facebook.marketing.internal.RemoteConfigManager";
    private static final Map<String, RemoteConfig> remoteConfigs = new ConcurrentHashMap();

    /* access modifiers changed from: private */
    @C0195i0
    public static JSONObject getRemoteConfigQueryResponse(String str) {
        try {
            String format = String.format(Locale.US, SAMPLING_ENDPOINT_PATH, new Object[]{str});
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, SAMPLING_RESULT_FIELD);
            GraphRequest graphRequest = new GraphRequest(null, format, bundle, HttpMethod.GET, null);
            graphRequest.setSkipClientToken(true);
            return graphRequest.executeAndWait().getJSONObject();
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @C0195i0
    public static RemoteConfig getRemoteConfigWithoutQuery(String str) {
        if (str != null) {
            return (RemoteConfig) remoteConfigs.get(str);
        }
        return null;
    }

    public static void loadRemoteConfigAsync() {
        FacebookSdk.getExecutor().execute(new Runnable() {
            public void run() {
                Context applicationContext = FacebookSdk.getApplicationContext();
                String applicationId = FacebookSdk.getApplicationId();
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(applicationContext);
                if ((attributionIdentifiers != null ? attributionIdentifiers.getAndroidAdvertiserId() : null) != null) {
                    JSONObject access$000 = RemoteConfigManager.getRemoteConfigQueryResponse(applicationId);
                    if (access$000 != null) {
                        RemoteConfigManager.parseRemoteConfigFromJSON(applicationId, access$000);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static void parseRemoteConfigFromJSON(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject != null) {
                remoteConfigs.put(str, new RemoteConfig(optJSONObject.optBoolean(SAMPLING_RESULT_FIELD, false)));
            }
        }
    }
}
