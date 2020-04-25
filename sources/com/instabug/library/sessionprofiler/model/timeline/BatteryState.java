package com.instabug.library.sessionprofiler.model.timeline;

import com.mrsool.utils.webservice.C11687c;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class BatteryState extends C9988d {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String KEY_PLUGGED = "plugged";
    private boolean plugged;
    private float value;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(172626009227357850L, "com/instabug/library/sessionprofiler/model/timeline/BatteryState", 15);
        $jacocoData = a;
        return a;
    }

    public BatteryState(float f, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.value = f;
        this.plugged = z;
        $jacocoInit[0] = true;
    }

    static LinkedList<C9988d> fromJSONArray(JSONArray jSONArray) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        LinkedList<C9988d> linkedList = new LinkedList<>();
        $jacocoInit[10] = true;
        $jacocoInit[11] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            $jacocoInit[12] = true;
            linkedList.add(fromJSONObject(jSONArray.getJSONObject(i)));
            i++;
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
        return linkedList;
    }

    private static BatteryState fromJSONObject(JSONObject jSONObject) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        float f = (float) jSONObject.getDouble(C11687c.f33838t0);
        $jacocoInit[7] = true;
        BatteryState batteryState = new BatteryState(f, jSONObject.getBoolean(KEY_PLUGGED));
        $jacocoInit[8] = true;
        batteryState.setTime(jSONObject.getDouble("t"));
        $jacocoInit[9] = true;
        return batteryState;
    }

    public float getValue() {
        boolean[] $jacocoInit = $jacocoInit();
        float f = this.value;
        $jacocoInit[1] = true;
        return f;
    }

    public boolean isPlugged() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.plugged;
        $jacocoInit[3] = true;
        return z;
    }

    public void setPlugged(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.plugged = z;
        $jacocoInit[4] = true;
    }

    public void setValue(float f) {
        boolean[] $jacocoInit = $jacocoInit();
        this.value = f;
        $jacocoInit[2] = true;
    }

    /* access modifiers changed from: protected */
    public JSONObject toJSONObject() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject timelinePointJSONObject = getTimelinePointJSONObject(Float.valueOf(this.value));
        $jacocoInit[5] = true;
        timelinePointJSONObject.put(KEY_PLUGGED, this.plugged);
        $jacocoInit[6] = true;
        return timelinePointJSONObject;
    }
}
