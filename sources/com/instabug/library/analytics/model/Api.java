package com.instabug.library.analytics.model;

import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Api {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String KEY_COUNT = "count";
    private static final String KEY_IS_DEPRECATED = "is_deprecated";
    private static final String KEY_METHOD = "method";
    private static final String KEY_PARAMETERS = "parameters";
    private static final String KEY_TIME_STAMP = "time_stamp";
    private String apiName;
    private int count = 1;
    private boolean isDeprecated;
    private ArrayList<Parameter> parameters;
    private long timeStamp;

    public static class Parameter {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        private static final String KEY_NAME = "name";
        private static final String KEY_TYPE = "type";
        private static final String KEY_VALUE = "value";
        private String name;
        private String type;
        private String value;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1034930892702304603L, "com/instabug/library/analytics/model/Api$Parameter", 50);
            $jacocoData = a;
            return a;
        }

        public Parameter() {
            $jacocoInit()[0] = true;
        }

        public static Parameter fromJson(JSONObject jSONObject) {
            String str = "value";
            String str2 = "type";
            String str3 = "name";
            boolean[] $jacocoInit = $jacocoInit();
            Parameter parameter = new Parameter();
            try {
                $jacocoInit[23] = true;
                if (!jSONObject.has(str3)) {
                    $jacocoInit[24] = true;
                } else {
                    $jacocoInit[25] = true;
                    parameter.name = jSONObject.getString(str3);
                    $jacocoInit[26] = true;
                }
                if (!jSONObject.has(str2)) {
                    $jacocoInit[27] = true;
                } else {
                    $jacocoInit[28] = true;
                    parameter.type = jSONObject.getString(str2);
                    $jacocoInit[29] = true;
                }
                if (!jSONObject.has(str)) {
                    $jacocoInit[30] = true;
                } else {
                    $jacocoInit[31] = true;
                    parameter.value = jSONObject.getString(str);
                    $jacocoInit[32] = true;
                }
                $jacocoInit[33] = true;
            } catch (JSONException e) {
                $jacocoInit[34] = true;
                InstabugSDKLogger.m46624e(Parameter.class, e.getMessage(), e);
                $jacocoInit[35] = true;
            }
            $jacocoInit[36] = true;
            return parameter;
        }

        public String getName() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.name;
            $jacocoInit[1] = true;
            return str;
        }

        public String getType() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.type;
            $jacocoInit[3] = true;
            return str;
        }

        public String getValue() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.value;
            $jacocoInit[5] = true;
            return str;
        }

        public Parameter setName(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.name = str;
            $jacocoInit[2] = true;
            return this;
        }

        public Parameter setType(Class<?> cls) {
            boolean[] $jacocoInit = $jacocoInit();
            this.type = cls.getSimpleName();
            $jacocoInit[4] = true;
            return this;
        }

        public Parameter setValue(Object obj) {
            boolean[] $jacocoInit = $jacocoInit();
            if (obj == null) {
                this.value = "null";
                $jacocoInit[6] = true;
            } else {
                this.value = obj.toString();
                $jacocoInit[7] = true;
            }
            $jacocoInit[8] = true;
            return this;
        }

        public JSONObject toJson() {
            boolean[] $jacocoInit = $jacocoInit();
            JSONObject jSONObject = new JSONObject();
            try {
                $jacocoInit[9] = true;
                if (getName() == null) {
                    $jacocoInit[10] = true;
                } else {
                    $jacocoInit[11] = true;
                    jSONObject.put("name", getName());
                    $jacocoInit[12] = true;
                }
                if (getType() == null) {
                    $jacocoInit[13] = true;
                } else {
                    $jacocoInit[14] = true;
                    jSONObject.put("type", getType());
                    $jacocoInit[15] = true;
                }
                if (getValue() == null) {
                    $jacocoInit[16] = true;
                } else {
                    $jacocoInit[17] = true;
                    jSONObject.put("value", getValue());
                    $jacocoInit[18] = true;
                }
                $jacocoInit[19] = true;
            } catch (JSONException e) {
                $jacocoInit[20] = true;
                InstabugSDKLogger.m46624e(Parameter.class, e.getMessage(), e);
                $jacocoInit[21] = true;
            }
            $jacocoInit[22] = true;
            return jSONObject;
        }

        public static ArrayList<Parameter> fromJson(JSONArray jSONArray) {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList<Parameter> arrayList = new ArrayList<>();
            $jacocoInit[42] = true;
            $jacocoInit[43] = true;
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    $jacocoInit[44] = true;
                    arrayList.add(fromJson(jSONArray.getJSONObject(i)));
                    $jacocoInit[45] = true;
                } catch (JSONException e) {
                    $jacocoInit[46] = true;
                    InstabugSDKLogger.m46624e(Parameter.class, e.getMessage(), e);
                    $jacocoInit[47] = true;
                }
                i++;
                $jacocoInit[48] = true;
            }
            $jacocoInit[49] = true;
            return arrayList;
        }

        public static JSONArray toJson(ArrayList<Parameter> arrayList) {
            boolean[] $jacocoInit = $jacocoInit();
            JSONArray jSONArray = new JSONArray();
            $jacocoInit[37] = true;
            Iterator it = arrayList.iterator();
            $jacocoInit[38] = true;
            while (it.hasNext()) {
                Parameter parameter = (Parameter) it.next();
                $jacocoInit[39] = true;
                jSONArray.put(parameter.toJson());
                $jacocoInit[40] = true;
            }
            $jacocoInit[41] = true;
            return jSONArray;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2607393265076316168L, "com/instabug/library/analytics/model/Api", 28);
        $jacocoData = a;
        return a;
    }

    public Api() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        setTimeStamp(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds());
        $jacocoInit[1] = true;
    }

    public String getApiName() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.apiName;
        $jacocoInit[4] = true;
        return str;
    }

    public int getCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.count;
        $jacocoInit[8] = true;
        return i;
    }

    public ArrayList<Parameter> getParameters() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<Parameter> arrayList = this.parameters;
        $jacocoInit[11] = true;
        return arrayList;
    }

    public long getTimeStamp() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.timeStamp;
        $jacocoInit[2] = true;
        return j;
    }

    public void incrementCount() {
        boolean[] $jacocoInit = $jacocoInit();
        this.count++;
        $jacocoInit[10] = true;
    }

    public boolean isDeprecated() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isDeprecated;
        $jacocoInit[6] = true;
        return z;
    }

    public Api setApiName(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.apiName = str;
        $jacocoInit[5] = true;
        return this;
    }

    public void setCount(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.count = i;
        $jacocoInit[9] = true;
    }

    public Api setDeprecated(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isDeprecated = z;
        $jacocoInit[7] = true;
        return this;
    }

    public Api setParameters(ArrayList<Parameter> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.parameters = arrayList;
        $jacocoInit[12] = true;
        return this;
    }

    public Api setTimeStamp(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.timeStamp = j;
        $jacocoInit[3] = true;
        return this;
    }

    public JSONObject toJson() {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        try {
            $jacocoInit[13] = true;
            $jacocoInit[14] = true;
            $jacocoInit[15] = true;
            $jacocoInit[16] = true;
            $jacocoInit[17] = true;
            $jacocoInit[18] = true;
            jSONObject.put("time_stamp", getTimeStamp()).put("method", getApiName()).put("is_deprecated", isDeprecated()).put("count", getCount()).put("parameters", Parameter.toJson(getParameters()));
            $jacocoInit[19] = true;
        } catch (JSONException e) {
            $jacocoInit[20] = true;
            InstabugSDKLogger.m46624e(Api.class, e.getMessage(), e);
            $jacocoInit[21] = true;
        }
        $jacocoInit[22] = true;
        return jSONObject;
    }

    public static JSONArray toJson(ArrayList<Api> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[23] = true;
        Iterator it = arrayList.iterator();
        $jacocoInit[24] = true;
        while (it.hasNext()) {
            Api api = (Api) it.next();
            $jacocoInit[25] = true;
            jSONArray.put(api.toJson());
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
        return jSONArray;
    }
}
