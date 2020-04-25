package com.instabug.library.sessionprofiler.model.timeline;

import com.mrsool.utils.webservice.C11687c;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.sessionprofiler.model.timeline.b */
/* compiled from: ScreenOrientationMode */
public class C9986b extends C9988d {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26551b;

    /* renamed from: a */
    private String f26552a;

    public C9986b(String str) {
        boolean[] a = m46414a();
        this.f26552a = str;
        a[0] = true;
    }

    /* renamed from: a */
    private static C9986b m46412a(JSONObject jSONObject) throws JSONException {
        boolean[] a = m46414a();
        a[3] = true;
        C9986b bVar = new C9986b(jSONObject.getString(C11687c.f33838t0));
        a[4] = true;
        bVar.setTime(jSONObject.getDouble("t"));
        a[5] = true;
        return bVar;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46414a() {
        boolean[] zArr = f26551b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8487510481981267363L, "com/instabug/library/sessionprofiler/model/timeline/ScreenOrientationMode", 11);
        f26551b = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public JSONObject toJSONObject() throws JSONException {
        boolean[] a = m46414a();
        JSONObject timelinePointJSONObject = getTimelinePointJSONObject(this.f26552a);
        a[2] = true;
        return timelinePointJSONObject;
    }

    /* renamed from: a */
    static LinkedList<C9988d> m46413a(JSONArray jSONArray) throws JSONException {
        boolean[] a = m46414a();
        LinkedList<C9988d> linkedList = new LinkedList<>();
        a[6] = true;
        a[7] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            a[8] = true;
            linkedList.add(m46412a(jSONArray.getJSONObject(i)));
            i++;
            a[9] = true;
        }
        a[10] = true;
        return linkedList;
    }
}
