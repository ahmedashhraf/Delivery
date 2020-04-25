package com.instabug.library.user;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class UserEvent {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String EVENT = "event";
    private static final String PARAMS = "params";
    private static final String TIMESTAMP = "timestamp";
    private long date;
    private String eventIdentifier;
    private List<UserEventParam> params = new ArrayList();

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5113269904624316097L, "com/instabug/library/user/UserEvent", 40);
        $jacocoData = a;
        return a;
    }

    public UserEvent() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    public UserEvent addParam(UserEventParam userEventParam) {
        boolean[] $jacocoInit = $jacocoInit();
        this.params.add(userEventParam);
        $jacocoInit[7] = true;
        return this;
    }

    public boolean equals(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        if (obj == null) {
            $jacocoInit[21] = true;
        } else if (!(obj instanceof UserEvent)) {
            $jacocoInit[22] = true;
        } else {
            UserEvent userEvent = (UserEvent) obj;
            $jacocoInit[23] = true;
            if (!String.valueOf(userEvent.getEventIdentifier()).equals(String.valueOf(getEventIdentifier()))) {
                $jacocoInit[24] = true;
            } else {
                $jacocoInit[25] = true;
                if (!String.valueOf(userEvent.getDate()).equals(String.valueOf(getDate()))) {
                    $jacocoInit[26] = true;
                } else {
                    $jacocoInit[27] = true;
                    if (userEvent.getParams().size() == getParams().size()) {
                        $jacocoInit[28] = true;
                        $jacocoInit[29] = true;
                        int i = 0;
                        while (i < this.params.size()) {
                            $jacocoInit[30] = true;
                            if (!((UserEventParam) userEvent.getParams().get(i)).equals(getParams().get(i))) {
                                $jacocoInit[31] = true;
                                return false;
                            }
                            i++;
                            $jacocoInit[32] = true;
                        }
                        $jacocoInit[33] = true;
                        return true;
                    }
                    $jacocoInit[34] = true;
                    return false;
                }
            }
            $jacocoInit[35] = true;
            return false;
        }
        $jacocoInit[36] = true;
        return false;
    }

    public long getDate() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.date;
        $jacocoInit[4] = true;
        return j;
    }

    public String getEventIdentifier() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.eventIdentifier;
        $jacocoInit[2] = true;
        return str;
    }

    public List<UserEventParam> getParams() {
        boolean[] $jacocoInit = $jacocoInit();
        List<UserEventParam> list = this.params;
        $jacocoInit[6] = true;
        return list;
    }

    public int hashCode() {
        boolean[] $jacocoInit = $jacocoInit();
        if (getEventIdentifier() != null) {
            $jacocoInit[37] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(getDate());
            sb.append(": ");
            sb.append(getEventIdentifier());
            int hashCode = String.valueOf(sb.toString()).hashCode();
            $jacocoInit[38] = true;
            return hashCode;
        }
        $jacocoInit[39] = true;
        return -1;
    }

    public UserEvent setDate(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.date = j;
        $jacocoInit[5] = true;
        return this;
    }

    public UserEvent setEventIdentifier(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.eventIdentifier = str;
        $jacocoInit[3] = true;
        return this;
    }

    public JSONObject toJson() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[8] = true;
        jSONObject.put("event", getEventIdentifier());
        $jacocoInit[9] = true;
        jSONObject.put("timestamp", getDate());
        $jacocoInit[10] = true;
        JSONObject jSONObject2 = new JSONObject();
        $jacocoInit[11] = true;
        $jacocoInit[12] = true;
        for (UserEventParam userEventParam : getParams()) {
            $jacocoInit[13] = true;
            jSONObject2.put(userEventParam.getKey(), userEventParam.getValue());
            $jacocoInit[14] = true;
        }
        jSONObject.put("params", jSONObject2);
        $jacocoInit[15] = true;
        return jSONObject;
    }

    public static JSONArray toJson(List<UserEvent> list) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[16] = true;
        $jacocoInit[17] = true;
        for (UserEvent userEvent : list) {
            $jacocoInit[18] = true;
            jSONArray.put(userEvent.toJson());
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
        return jSONArray;
    }
}
