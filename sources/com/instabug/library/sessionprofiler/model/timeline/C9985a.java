package com.instabug.library.sessionprofiler.model.timeline;

import com.mrsool.utils.webservice.C11687c;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.sessionprofiler.model.timeline.a */
/* compiled from: MemoryUsage */
public class C9985a extends C9988d {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f26548N;

    /* renamed from: a */
    private long f26549a;

    /* renamed from: b */
    private long f26550b;

    public C9985a(long j) {
        boolean[] a = m46410a();
        this.f26549a = j;
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46410a() {
        boolean[] zArr = f26548N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6323944659531846630L, "com/instabug/library/sessionprofiler/model/timeline/MemoryUsage", 20);
        f26548N = a;
        return a;
    }

    /* renamed from: a */
    public void mo35594a(long j) {
        boolean[] a = m46410a();
        this.f26550b = j;
        a[3] = true;
    }

    /* access modifiers changed from: protected */
    public JSONObject toJSONObject() throws JSONException {
        boolean[] a = m46410a();
        JSONObject timelinePointJSONObject = getTimelinePointJSONObject(Long.valueOf(this.f26549a));
        long j = this.f26550b;
        if (j <= 0) {
            a[6] = true;
        } else {
            a[7] = true;
            timelinePointJSONObject.put("total", j);
            a[8] = true;
        }
        a[9] = true;
        return timelinePointJSONObject;
    }

    /* renamed from: a */
    private static C9985a m46408a(JSONObject jSONObject) throws JSONException {
        boolean[] a = m46410a();
        C9985a aVar = new C9985a(jSONObject.getLong(C11687c.f33838t0));
        a[10] = true;
        String str = "total";
        if (!jSONObject.has(str)) {
            a[11] = true;
        } else {
            a[12] = true;
            aVar.mo35594a(jSONObject.getLong(str));
            a[13] = true;
        }
        aVar.setTime(jSONObject.getDouble("t"));
        a[14] = true;
        return aVar;
    }

    public C9985a(long j, long j2) {
        boolean[] a = m46410a();
        this.f26549a = j;
        this.f26550b = j2;
        a[1] = true;
    }

    /* renamed from: a */
    static LinkedList<C9988d> m46409a(JSONArray jSONArray) throws JSONException {
        boolean[] a = m46410a();
        LinkedList<C9988d> linkedList = new LinkedList<>();
        a[15] = true;
        a[16] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            a[17] = true;
            linkedList.add(m46408a(jSONArray.getJSONObject(i)));
            i++;
            a[18] = true;
        }
        a[19] = true;
        return linkedList;
    }
}
