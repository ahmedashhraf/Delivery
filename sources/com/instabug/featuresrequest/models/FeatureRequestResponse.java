package com.instabug.featuresrequest.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FeatureRequestResponse implements Cacheable, Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String KEY_COMPLETED_FEATURES_COUNT = "completed_features_count";
    public static final String KEY_FEATURE_REQUESTS = "feature_reqs";
    public static final String KEY_NEXT_PAGE = "has_next_page";
    private int completedFeaturesCount;
    private List<C9567a> featureRequestList;
    private boolean hasNextPage;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(9036771144287554254L, "com/instabug/featuresrequest/models/FeatureRequestResponse", 39);
        $jacocoData = a;
        return a;
    }

    public FeatureRequestResponse() {
        $jacocoInit()[0] = true;
    }

    public static FeatureRequestResponse fromJson(JSONObject jSONObject) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        FeatureRequestResponse featureRequestResponse = new FeatureRequestResponse();
        $jacocoInit[1] = true;
        featureRequestResponse.fromJson(jSONObject.toString());
        $jacocoInit[2] = true;
        return featureRequestResponse;
    }

    public int getCompletedFeaturesCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.completedFeaturesCount;
        $jacocoInit[3] = true;
        return i;
    }

    public List<C9567a> getFeatureRequestList() {
        boolean[] $jacocoInit = $jacocoInit();
        List<C9567a> list = this.featureRequestList;
        $jacocoInit[7] = true;
        return list;
    }

    public boolean hasNextPage() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.hasNextPage;
        $jacocoInit[5] = true;
        return z;
    }

    public void setCompletedFeaturesCount(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.completedFeaturesCount = i;
        $jacocoInit[4] = true;
    }

    public void setFeatureRequestList(List<C9567a> list) {
        boolean[] $jacocoInit = $jacocoInit();
        this.featureRequestList = list;
        $jacocoInit[8] = true;
    }

    public void setHasNextPage(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.hasNextPage = z;
        $jacocoInit[6] = true;
    }

    public String toJson() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[9] = true;
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[10] = true;
        $jacocoInit[11] = true;
        for (C9567a aVar : getFeatureRequestList()) {
            $jacocoInit[12] = true;
            jSONArray.put(aVar.toJson());
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
        JSONObject put = jSONObject.put(KEY_NEXT_PAGE, hasNextPage());
        $jacocoInit[15] = true;
        JSONObject put2 = put.put(KEY_COMPLETED_FEATURES_COUNT, getCompletedFeaturesCount());
        $jacocoInit[16] = true;
        put2.put(KEY_FEATURE_REQUESTS, jSONArray);
        $jacocoInit[17] = true;
        String jSONObject2 = jSONObject.toString();
        $jacocoInit[18] = true;
        return jSONObject2;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46622d(this, str);
        $jacocoInit[19] = true;
        JSONObject jSONObject = new JSONObject(str);
        $jacocoInit[20] = true;
        String str2 = KEY_COMPLETED_FEATURES_COUNT;
        if (!jSONObject.has(str2)) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            setCompletedFeaturesCount(jSONObject.getInt(str2));
            $jacocoInit[23] = true;
        }
        String str3 = KEY_NEXT_PAGE;
        if (!jSONObject.has(str3)) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            setHasNextPage(jSONObject.getBoolean(str3));
            $jacocoInit[26] = true;
        }
        String str4 = KEY_FEATURE_REQUESTS;
        if (!jSONObject.has(str4)) {
            $jacocoInit[27] = true;
        } else {
            $jacocoInit[28] = true;
            ArrayList arrayList = new ArrayList();
            $jacocoInit[29] = true;
            JSONArray jSONArray = jSONObject.getJSONArray(str4);
            $jacocoInit[30] = true;
            int i = 0;
            $jacocoInit[31] = true;
            while (i < jSONArray.length()) {
                $jacocoInit[32] = true;
                JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i));
                $jacocoInit[33] = true;
                C9567a aVar = new C9567a();
                $jacocoInit[34] = true;
                aVar.fromJson(jSONObject2.toString());
                $jacocoInit[35] = true;
                arrayList.add(aVar);
                i++;
                $jacocoInit[36] = true;
            }
            setFeatureRequestList(arrayList);
            $jacocoInit[37] = true;
        }
        $jacocoInit[38] = true;
    }
}
