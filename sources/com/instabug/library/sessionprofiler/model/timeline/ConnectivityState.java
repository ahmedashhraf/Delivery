package com.instabug.library.sessionprofiler.model.timeline;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.instabug.library.util.DeviceStateProvider;
import com.mrsool.utils.webservice.C11687c;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ConnectivityState extends C9988d {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String KEY_NAME = "name";
    private static final String KEY_NO_CONNECTION = "no_connection";
    private static final String KEY_WIFI = "WIFI";
    private String name;
    private String value;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1150202397209370062L, "com/instabug/library/sessionprofiler/model/timeline/ConnectivityState", 33);
        $jacocoData = a;
        return a;
    }

    private ConnectivityState() {
        $jacocoInit()[0] = true;
    }

    static LinkedList<C9988d> fromJSONArray(JSONArray jSONArray) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        LinkedList<C9988d> linkedList = new LinkedList<>();
        $jacocoInit[28] = true;
        $jacocoInit[29] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            $jacocoInit[30] = true;
            linkedList.add(fromJSONObject(jSONArray.getJSONObject(i)));
            i++;
            $jacocoInit[31] = true;
        }
        $jacocoInit[32] = true;
        return linkedList;
    }

    private static ConnectivityState fromJSONObject(JSONObject jSONObject) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        ConnectivityState connectivityState = new ConnectivityState();
        $jacocoInit[21] = true;
        connectivityState.setTime(jSONObject.getDouble("t"));
        $jacocoInit[22] = true;
        connectivityState.setValue(jSONObject.getString(C11687c.f33838t0));
        $jacocoInit[23] = true;
        String str = "name";
        if (!jSONObject.has(str)) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            connectivityState.setName(jSONObject.getString(str));
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
        return connectivityState;
    }

    public static ConnectivityState getNetworkState(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        ConnectivityState connectivityState = new ConnectivityState();
        $jacocoInit[5] = true;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        $jacocoInit[6] = true;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            $jacocoInit[7] = true;
            if (activeNetworkInfo.getType() == 1) {
                $jacocoInit[8] = true;
                connectivityState.setValue(KEY_WIFI);
                $jacocoInit[9] = true;
                connectivityState.setName(DeviceStateProvider.getWifiSSID(context));
                $jacocoInit[10] = true;
            } else if (activeNetworkInfo.getType() != 0) {
                $jacocoInit[11] = true;
            } else {
                $jacocoInit[12] = true;
                connectivityState.setName(DeviceStateProvider.getCarrier(context));
                $jacocoInit[13] = true;
                connectivityState.setValue(activeNetworkInfo.getSubtypeName());
                $jacocoInit[14] = true;
            }
        } else {
            connectivityState.setValue(KEY_NO_CONNECTION);
            $jacocoInit[15] = true;
        }
        $jacocoInit[16] = true;
        return connectivityState;
    }

    public String getName() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.name;
        $jacocoInit[3] = true;
        return str;
    }

    public String getValue() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.value;
        $jacocoInit[1] = true;
        return str;
    }

    public void setName(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.name = str;
        $jacocoInit[4] = true;
    }

    public void setValue(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.value = str;
        $jacocoInit[2] = true;
    }

    /* access modifiers changed from: protected */
    public JSONObject toJSONObject() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject timelinePointJSONObject = getTimelinePointJSONObject(this.value);
        String str = this.name;
        if (str == null) {
            $jacocoInit[17] = true;
        } else {
            $jacocoInit[18] = true;
            timelinePointJSONObject.put("name", str);
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
        return timelinePointJSONObject;
    }
}
