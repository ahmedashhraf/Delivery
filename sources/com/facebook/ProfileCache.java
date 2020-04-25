package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.Validate;
import com.google.android.gms.common.C4420j;
import org.json.JSONException;
import org.json.JSONObject;

final class ProfileCache {
    static final String CACHED_PROFILE_KEY = "com.facebook.ProfileManager.CachedProfile";
    static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";
    private final SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    ProfileCache() {
    }

    /* access modifiers changed from: 0000 */
    public void clear() {
        this.sharedPreferences.edit().remove(CACHED_PROFILE_KEY).apply();
    }

    /* access modifiers changed from: 0000 */
    public Profile load() {
        String string = this.sharedPreferences.getString(CACHED_PROFILE_KEY, null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void save(Profile profile) {
        Validate.notNull(profile, C4420j.f13552a);
        JSONObject jSONObject = profile.toJSONObject();
        if (jSONObject != null) {
            this.sharedPreferences.edit().putString(CACHED_PROFILE_KEY, jSONObject.toString()).apply();
        }
    }
}
