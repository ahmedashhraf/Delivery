package com.instabug.library.model;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.model.a */
/* compiled from: ConsoleLog */
public class C9947a implements Cacheable, Serializable {

    /* renamed from: N */
    private static transient /* synthetic */ boolean[] f26441N;

    /* renamed from: a */
    private String f26442a;

    /* renamed from: b */
    private long f26443b;

    public C9947a() {
        m46256e()[0] = true;
    }

    /* renamed from: a */
    public static ArrayList<C9947a> m46253a(JSONArray jSONArray) throws JSONException {
        boolean[] e = m46256e();
        ArrayList<C9947a> arrayList = new ArrayList<>();
        e[1] = true;
        if (jSONArray == null) {
            e[2] = true;
        } else if (jSONArray.length() <= 0) {
            e[3] = true;
        } else {
            e[4] = true;
            int i = 0;
            e[5] = true;
            while (i < jSONArray.length()) {
                e[7] = true;
                C9947a aVar = new C9947a();
                e[8] = true;
                aVar.fromJson(jSONArray.getJSONObject(i).toString());
                e[9] = true;
                arrayList.add(aVar);
                i++;
                e[10] = true;
            }
            e[6] = true;
        }
        e[11] = true;
        return arrayList;
    }

    /* renamed from: c */
    public static long m46255c(String str) {
        boolean[] e = m46256e();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(InstabugLog.LOG_MESSAGE_DATE_FORMAT, Locale.US);
            e[45] = true;
            Date parse = simpleDateFormat.parse(str);
            e[46] = true;
            Calendar instance = Calendar.getInstance();
            e[47] = true;
            instance.setTime(parse);
            e[48] = true;
            Calendar instance2 = Calendar.getInstance();
            e[49] = true;
            instance2.set(2, instance.get(2));
            e[50] = true;
            instance2.set(5, instance.get(5));
            e[51] = true;
            instance2.set(11, instance.get(11));
            e[52] = true;
            instance2.set(12, instance.get(12));
            e[53] = true;
            instance2.set(13, instance.get(13));
            e[54] = true;
            instance2.set(14, instance.get(14));
            e[55] = true;
            long timeInMillis = instance2.getTimeInMillis();
            e[56] = true;
            return timeInMillis;
        } catch (ParseException e2) {
            e[57] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("parsing error happened when trying to parse Console log message date: ");
            sb.append(str);
            sb.append(", error message: ");
            e[58] = true;
            sb.append(e2.getMessage());
            String sb2 = sb.toString();
            e[59] = true;
            InstabugSDKLogger.m46627w(C9947a.class, sb2);
            e[60] = true;
            return 0;
        }
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m46256e() {
        boolean[] zArr = f26441N;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8204729796882387356L, "com/instabug/library/model/ConsoleLog", 61);
        f26441N = a;
        return a;
    }

    /* renamed from: b */
    public void mo35467b(String str) {
        boolean[] e = m46256e();
        this.f26442a = str;
        e[27] = true;
    }

    /* renamed from: d */
    public String mo35468d() {
        boolean[] e = m46256e();
        String str = this.f26442a;
        e[26] = true;
        return str;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] e = m46256e();
        JSONObject jSONObject = new JSONObject(str);
        e[32] = true;
        String str2 = "timestamp";
        if (!jSONObject.has(str2)) {
            e[33] = true;
        } else {
            e[34] = true;
            if (StringUtility.isNumeric(jSONObject.getString(str2))) {
                e[35] = true;
                mo35466a(jSONObject.getLong(str2));
                e[36] = true;
            } else {
                e[37] = true;
                String string = jSONObject.getString(str2);
                e[38] = true;
                mo35466a(m46255c(string));
                e[39] = true;
            }
        }
        String str3 = "message";
        if (!jSONObject.has(str3)) {
            e[40] = true;
        } else {
            e[41] = true;
            mo35467b(jSONObject.getString(str3));
            e[42] = true;
        }
        e[43] = true;
    }

    public String toJson() throws JSONException {
        boolean[] e = m46256e();
        JSONObject jSONObject = new JSONObject();
        e[28] = true;
        jSONObject.put("timestamp", mo35465a());
        e[29] = true;
        jSONObject.put("message", mo35468d());
        e[30] = true;
        String jSONObject2 = jSONObject.toString();
        e[31] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] e = m46256e();
        StringBuilder sb = new StringBuilder();
        sb.append("ConsoleLog{timeStamp='");
        sb.append(this.f26443b);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.f26442a);
        sb.append('\'');
        sb.append('}');
        String sb2 = sb.toString();
        e[44] = true;
        return sb2;
    }

    /* renamed from: a */
    public static JSONArray m46254a(ArrayList<C9947a> arrayList) {
        boolean[] e = m46256e();
        JSONArray jSONArray = new JSONArray();
        e[12] = true;
        if (arrayList == null) {
            e[13] = true;
        } else if (arrayList.size() <= 0) {
            e[14] = true;
        } else {
            e[15] = true;
            Iterator it = arrayList.iterator();
            e[16] = true;
            while (it.hasNext()) {
                C9947a aVar = (C9947a) it.next();
                try {
                    e[18] = true;
                    jSONArray.put(new JSONObject(aVar.toJson()));
                    e[19] = true;
                } catch (JSONException e2) {
                    e[20] = true;
                    InstabugSDKLogger.m46626v(C9947a.class, e2.toString());
                    e[21] = true;
                }
                e[22] = true;
            }
            e[17] = true;
        }
        e[23] = true;
        return jSONArray;
    }

    /* renamed from: a */
    public long mo35465a() {
        boolean[] e = m46256e();
        long j = this.f26443b;
        e[24] = true;
        return j;
    }

    /* renamed from: a */
    public void mo35466a(long j) {
        boolean[] e = m46256e();
        this.f26443b = j;
        e[25] = true;
    }
}
