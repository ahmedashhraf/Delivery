package com.crashlytics.android.core;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

class MetaDataStore {
    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_EMAIL = "userEmail";
    private static final String KEY_USER_ID = "userId";
    private static final String KEY_USER_NAME = "userName";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            hashMap.put(str2, valueOrNull(jSONObject, str2));
        }
        return hashMap;
    }

    private static UserMetaData jsonToUserData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(valueOrNull(jSONObject, KEY_USER_ID), valueOrNull(jSONObject, KEY_USER_NAME), valueOrNull(jSONObject, KEY_USER_EMAIL));
    }

    private static String keysDataToJson(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String userDataToJson(final UserMetaData userMetaData) throws JSONException {
        return new JSONObject() {
            {
                put(MetaDataStore.KEY_USER_ID, userMetaData.f11755id);
                put(MetaDataStore.KEY_USER_NAME, userMetaData.name);
                put(MetaDataStore.KEY_USER_EMAIL, userMetaData.email);
            }
        }.toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(KEYDATA_SUFFIX);
        sb.append(METADATA_EXT);
        return new File(file, sb.toString());
    }

    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user");
        sb.append(METADATA_EXT);
        return new File(file, sb.toString());
    }

    public Map<String, String> readKeyData(String str) {
        String str2 = "Failed to close user metadata file.";
        File keysFileForSession = getKeysFileForSession(str);
        if (!keysFileForSession.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(keysFileForSession);
            try {
                Map<String, String> jsonToKeysData = jsonToKeysData(C14248i.m61823b((InputStream) fileInputStream2));
                C14248i.m61815a((Closeable) fileInputStream2, str2);
                return jsonToKeysData;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
                    C14248i.m61815a((Closeable) fileInputStream, str2);
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    C14248i.m61815a((Closeable) fileInputStream, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C14248i.m61815a((Closeable) fileInputStream, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
            C14248i.m61815a((Closeable) fileInputStream, str2);
            return Collections.emptyMap();
        }
    }

    public UserMetaData readUserData(String str) {
        String str2 = "Failed to close user metadata file.";
        File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return UserMetaData.EMPTY;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(userDataFileForSession);
            try {
                UserMetaData jsonToUserData = jsonToUserData(C14248i.m61823b((InputStream) fileInputStream2));
                C14248i.m61815a((Closeable) fileInputStream2, str2);
                return jsonToUserData;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
                    C14248i.m61815a((Closeable) fileInputStream, str2);
                    return UserMetaData.EMPTY;
                } catch (Throwable th) {
                    th = th;
                    C14248i.m61815a((Closeable) fileInputStream, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C14248i.m61815a((Closeable) fileInputStream, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error deserializing user metadata.", e);
            C14248i.m61815a((Closeable) fileInputStream, str2);
            return UserMetaData.EMPTY;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        String str2 = "Failed to close key/value metadata file.";
        File keysFileForSession = getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String keysDataToJson = keysDataToJson(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(keysFileForSession), UTF_8));
            try {
                bufferedWriter2.write(keysDataToJson);
                bufferedWriter2.flush();
                C14248i.m61815a((Closeable) bufferedWriter2, str2);
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", e);
                    C14248i.m61815a((Closeable) bufferedWriter, str2);
                } catch (Throwable th) {
                    th = th;
                    C14248i.m61815a((Closeable) bufferedWriter, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C14248i.m61815a((Closeable) bufferedWriter, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", e);
            C14248i.m61815a((Closeable) bufferedWriter, str2);
        }
    }

    public void writeUserData(String str, UserMetaData userMetaData) {
        String str2 = "Failed to close user metadata file.";
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String userDataToJson = userDataToJson(userMetaData);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            try {
                bufferedWriter2.write(userDataToJson);
                bufferedWriter2.flush();
                C14248i.m61815a((Closeable) bufferedWriter2, str2);
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error serializing user metadata.", e);
                    C14248i.m61815a((Closeable) bufferedWriter, str2);
                } catch (Throwable th) {
                    th = th;
                    C14248i.m61815a((Closeable) bufferedWriter, str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C14248i.m61815a((Closeable) bufferedWriter, str2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C14215d.m61672j().mo45045e(CrashlyticsCore.TAG, "Error serializing user metadata.", e);
            C14248i.m61815a((Closeable) bufferedWriter, str2);
        }
    }
}
