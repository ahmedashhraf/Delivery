package com.instabug.library.analytics.model;

import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SDKEvent {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String KEY_EVENT_NAME = "event_name";
    private static final String KEY_EXTRA_ATTRIBUTES = "extra_attributes";
    private static final String KEY_TIME_STAMP = "time_stamp";
    private String eventName;
    private ArrayList<ExtraAttribute> extraAttributes;
    private long timeStamp;

    public static class ExtraAttribute {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        private static final String KEY_KEY = "key";
        private static final String KEY_VALUE = "value";
        private String key;
        private String value;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4090979612593335311L, "com/instabug/library/analytics/model/SDKEvent$ExtraAttribute", 38);
            $jacocoData = a;
            return a;
        }

        public ExtraAttribute() {
            $jacocoInit()[0] = true;
        }

        public static ExtraAttribute fromJson(JSONObject jSONObject) {
            String str = "value";
            String str2 = KEY_KEY;
            boolean[] $jacocoInit = $jacocoInit();
            ExtraAttribute extraAttribute = new ExtraAttribute();
            try {
                $jacocoInit[12] = true;
                if (!jSONObject.has(str2)) {
                    $jacocoInit[13] = true;
                } else {
                    $jacocoInit[14] = true;
                    extraAttribute.setKey(jSONObject.getString(str2));
                    $jacocoInit[15] = true;
                }
                if (!jSONObject.has(str)) {
                    $jacocoInit[16] = true;
                } else {
                    $jacocoInit[17] = true;
                    extraAttribute.setValue(jSONObject.getString(str));
                    $jacocoInit[18] = true;
                }
                $jacocoInit[19] = true;
            } catch (JSONException e) {
                $jacocoInit[20] = true;
                InstabugSDKLogger.m46624e(SDKEvent.class, e.getMessage(), e);
                $jacocoInit[21] = true;
            }
            $jacocoInit[22] = true;
            return extraAttribute;
        }

        public String getKey() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.key;
            $jacocoInit[1] = true;
            return str;
        }

        public String getValue() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.value;
            $jacocoInit[3] = true;
            return str;
        }

        public ExtraAttribute setKey(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.key = str;
            $jacocoInit[2] = true;
            return this;
        }

        public ExtraAttribute setValue(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.value = str;
            $jacocoInit[4] = true;
            return this;
        }

        public JSONObject toJson() {
            boolean[] $jacocoInit = $jacocoInit();
            JSONObject jSONObject = new JSONObject();
            try {
                $jacocoInit[5] = true;
                String str = KEY_KEY;
                $jacocoInit[6] = true;
                $jacocoInit[7] = true;
                jSONObject.put(str, getKey()).put("value", getValue());
                $jacocoInit[8] = true;
            } catch (JSONException e) {
                $jacocoInit[9] = true;
                InstabugSDKLogger.m46624e(SDKEvent.class, e.getMessage(), e);
                $jacocoInit[10] = true;
            }
            $jacocoInit[11] = true;
            return jSONObject;
        }

        public static JSONArray toJson(ArrayList<ExtraAttribute> arrayList) {
            boolean[] $jacocoInit = $jacocoInit();
            JSONArray jSONArray = new JSONArray();
            $jacocoInit[23] = true;
            Iterator it = arrayList.iterator();
            $jacocoInit[24] = true;
            while (it.hasNext()) {
                ExtraAttribute extraAttribute = (ExtraAttribute) it.next();
                $jacocoInit[25] = true;
                jSONArray.put(extraAttribute.toJson());
                $jacocoInit[26] = true;
            }
            $jacocoInit[27] = true;
            return jSONArray;
        }

        public static ArrayList<ExtraAttribute> fromJson(JSONArray jSONArray) {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList<ExtraAttribute> arrayList = new ArrayList<>();
            $jacocoInit[28] = true;
            $jacocoInit[29] = true;
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    $jacocoInit[30] = true;
                    $jacocoInit[31] = true;
                    ExtraAttribute fromJson = fromJson(jSONArray.getJSONObject(i));
                    $jacocoInit[32] = true;
                    arrayList.add(fromJson);
                    $jacocoInit[33] = true;
                } catch (JSONException e) {
                    $jacocoInit[34] = true;
                    InstabugSDKLogger.m46624e(SDKEvent.class, e.getMessage(), e);
                    $jacocoInit[35] = true;
                }
                i++;
                $jacocoInit[36] = true;
            }
            $jacocoInit[37] = true;
            return arrayList;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6470880262475907715L, "com/instabug/library/analytics/model/SDKEvent", 20);
        $jacocoData = a;
        return a;
    }

    public SDKEvent() {
        $jacocoInit()[0] = true;
    }

    public String getEventName() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.eventName;
        $jacocoInit[1] = true;
        return str;
    }

    public ArrayList<ExtraAttribute> getExtraAttributes() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<ExtraAttribute> arrayList = this.extraAttributes;
        $jacocoInit[5] = true;
        return arrayList;
    }

    public long getTimeStamp() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.timeStamp;
        $jacocoInit[3] = true;
        return j;
    }

    public SDKEvent setEventName(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.eventName = str;
        $jacocoInit[2] = true;
        return this;
    }

    public SDKEvent setExtraAttributes(ArrayList<ExtraAttribute> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.extraAttributes = arrayList;
        $jacocoInit[6] = true;
        return this;
    }

    public SDKEvent setTimeStamp(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.timeStamp = j;
        $jacocoInit[4] = true;
        return this;
    }

    public JSONObject toJson() {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        try {
            $jacocoInit[7] = true;
            $jacocoInit[8] = true;
            $jacocoInit[9] = true;
            $jacocoInit[10] = true;
            jSONObject.put("time_stamp", getTimeStamp()).put("event_name", getEventName()).put("extra_attributes", ExtraAttribute.toJson(getExtraAttributes()));
            $jacocoInit[11] = true;
        } catch (JSONException e) {
            $jacocoInit[12] = true;
            InstabugSDKLogger.m46624e(SDKEvent.class, e.getMessage(), e);
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
        return jSONObject;
    }

    public static JSONArray toJson(ArrayList<SDKEvent> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[15] = true;
        Iterator it = arrayList.iterator();
        $jacocoInit[16] = true;
        while (it.hasNext()) {
            SDKEvent sDKEvent = (SDKEvent) it.next();
            $jacocoInit[17] = true;
            jSONArray.put(sDKEvent.toJson());
            $jacocoInit[18] = true;
        }
        $jacocoInit[19] = true;
        return jSONArray;
    }
}
