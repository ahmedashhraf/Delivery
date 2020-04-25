package com.mrsool.utils.p420b0;

import com.amplitude.api.C2876e;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mrsool.utils.b0.h */
/* compiled from: PlaceJSONParser */
public class C11597h {
    /* renamed from: b */
    private HashMap<String, String> m52259b(JSONObject jSONObject) {
        String str = "reference";
        String str2 = "description";
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String string = jSONObject.getString(str2);
            String string2 = jSONObject.getString("id");
            String string3 = jSONObject.getString(str);
            JSONArray jSONArray = jSONObject.getJSONArray("terms");
            if (jSONArray.length() >= 3) {
                hashMap.put(C2876e.f10110S, jSONArray.getJSONObject(jSONArray.length() - 3).getString("value"));
            }
            hashMap.put(str2, string);
            hashMap.put(FeatureRequestEntry.COLUMN_ID, string2);
            hashMap.put(str, string3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: a */
    public List<HashMap<String, String>> mo39802a(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            jSONArray = jSONObject.getJSONArray("predictions");
        } catch (JSONException e) {
            e.printStackTrace();
            jSONArray = null;
        }
        return m52258a(jSONArray);
    }

    /* renamed from: a */
    private List<HashMap<String, String>> m52258a(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(m52259b((JSONObject) jSONArray.get(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
