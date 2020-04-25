package com.instabug.library.sessionprofiler.model.timeline;

import java.io.Serializable;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.sessionprofiler.model.timeline.d */
/* compiled from: TimelinePoint */
public abstract class C9988d implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    protected static final String KEY_TIME = "t";
    protected static final String KEY_VALUE = "v";
    private double time;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1308560183621451676L, "com/instabug/library/sessionprofiler/model/timeline/TimelinePoint", 11);
        $jacocoData = a;
        return a;
    }

    public C9988d() {
        $jacocoInit()[0] = true;
    }

    public static JSONArray toJSONArray(LinkedList<C9988d> linkedList) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[6] = true;
        $jacocoInit[7] = true;
        int i = 0;
        while (i < linkedList.size()) {
            $jacocoInit[8] = true;
            jSONArray.put(((C9988d) linkedList.get(i)).toJSONObject());
            i++;
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
        return jSONArray;
    }

    public double getTime() {
        boolean[] $jacocoInit = $jacocoInit();
        double d = this.time;
        $jacocoInit[1] = true;
        return d;
    }

    /* access modifiers changed from: 0000 */
    public JSONObject getTimelinePointJSONObject(Object obj) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[3] = true;
        jSONObject.put(KEY_TIME, this.time);
        $jacocoInit[4] = true;
        jSONObject.put("v", obj);
        $jacocoInit[5] = true;
        return jSONObject;
    }

    public void setTime(double d) {
        boolean[] $jacocoInit = $jacocoInit();
        this.time = d;
        $jacocoInit[2] = true;
    }

    /* access modifiers changed from: 0000 */
    public abstract JSONObject toJSONObject() throws JSONException;
}
