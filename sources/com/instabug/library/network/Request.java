package com.instabug.library.network;

import android.net.Uri.Builder;
import androidx.annotation.C0193h0;
import com.instabug.library.network.NetworkManager.RequestType;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Request {

    /* renamed from: j */
    protected static final String f26472j = "https://api.instabug.com/api/sdk/v3";

    /* renamed from: k */
    private static transient /* synthetic */ boolean[] f26473k;

    /* renamed from: a */
    private String f26474a;

    /* renamed from: b */
    private String f26475b;

    /* renamed from: c */
    private RequestMethod f26476c;

    /* renamed from: d */
    private RequestType f26477d;

    /* renamed from: e */
    private ArrayList<RequestParameter> f26478e;

    /* renamed from: f */
    private ArrayList<RequestParameter> f26479f;

    /* renamed from: g */
    private ArrayList<RequestParameter> f26480g;

    /* renamed from: h */
    private FileToUpload f26481h;

    /* renamed from: i */
    private File f26482i;

    public interface Callbacks<T, K> {
        void onFailed(K k);

        void onSucceeded(T t);
    }

    public enum Endpoint {
        ReportBug("/bugs"),
        AddBugAttachment("/bugs/:bug_token/attachments"),
        ReportCrash("/crashes"),
        AddCrashAttachment("/crashes/:crash_token/attachments"),
        TriggerChat("/chats"),
        SendMessage("/chats/:chat_number/messages"),
        AddMessageAttachment("/chats/:chat_number/messages/:message_id/attachments"),
        SyncChats("/chats/sync"),
        AppSettings("/features"),
        SendSession("/sessions"),
        GetSurveys("/surveys/v5"),
        SubmitSurvey("/surveys/:survey_id/v5/responses"),
        bugLogs("/bugs/:bug_token/state_logs"),
        crashLogs("/crashes/:crash_token/state_logs"),
        chatLogs("/chats/:chat_token/state_logs"),
        MigrateUUID("/migrate_uuid"),
        Analytics("/analytics"),
        PushToken("/push_token"),
        ReportCategories("/application_categories"),
        GetFeaturesRequest("/feature_reqs"),
        GetFeatureDetails("/feature_reqs/:feature_req_id"),
        GetFeatureTimeline("/feature_reqs/:feature_req_id/timeline"),
        VoteFeature("/feature_reqs/:feature_req_id/like"),
        Search("/search"),
        ADD_NEW_FEATURE("/feature_reqs"),
        AddComment("/feature_reqs/:feature_req_id/comment");
        
        private final String name;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[24] = true;
        }

        private Endpoint(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.name = str;
            $jacocoInit[2] = true;
        }

        public String toString() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.name;
            $jacocoInit[3] = true;
            return str;
        }
    }

    public static class FileToUpload {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private String fileName;
        private String filePartName;
        private String filePath;
        private String fileType;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7116989750190207996L, "com/instabug/library/network/Request$FileToUpload", 5);
            $jacocoData = a;
            return a;
        }

        public FileToUpload(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3, @C0193h0 String str4) {
            boolean[] $jacocoInit = $jacocoInit();
            this.filePartName = str;
            this.fileName = str2;
            this.filePath = str3;
            this.fileType = str4;
            $jacocoInit[0] = true;
        }

        public String getFileName() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.fileName;
            $jacocoInit[2] = true;
            return str;
        }

        public String getFilePartName() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.filePartName;
            $jacocoInit[1] = true;
            return str;
        }

        public String getFilePath() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.filePath;
            $jacocoInit[3] = true;
            return str;
        }

        public String getFileType() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.fileType;
            $jacocoInit[4] = true;
            return str;
        }
    }

    public enum RequestMethod {
        Get("GET"),
        Post("POST"),
        put("PUT"),
        Delete("DELETE");
        
        private final String name;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[7] = true;
        }

        private RequestMethod(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.name = str;
            $jacocoInit[2] = true;
        }

        public String toString() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.name;
            $jacocoInit[3] = true;
            return str;
        }
    }

    public static class RequestParameter implements Serializable {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private String key;
        private Object value;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2338378832825454425L, "com/instabug/library/network/Request$RequestParameter", 3);
            $jacocoData = a;
            return a;
        }

        public RequestParameter(String str, Object obj) {
            boolean[] $jacocoInit = $jacocoInit();
            this.key = str;
            this.value = obj;
            $jacocoInit[0] = true;
        }

        public String getKey() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.key;
            $jacocoInit[2] = true;
            return str;
        }

        public Object getValue() {
            boolean[] $jacocoInit = $jacocoInit();
            Object obj = this.value;
            $jacocoInit[1] = true;
            return obj;
        }
    }

    public Request(Endpoint endpoint, RequestType requestType) {
        boolean[] m = m46310m();
        m[0] = true;
        this.f26475b = endpoint.toString();
        m[1] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(f26472j);
        sb.append(mo35539d());
        this.f26474a = sb.toString();
        this.f26477d = requestType;
        m[2] = true;
        m46312o();
        m[3] = true;
    }

    /* renamed from: m */
    private static /* synthetic */ boolean[] m46310m() {
        boolean[] zArr = f26473k;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6571534087412865884L, "com/instabug/library/network/Request", 49);
        f26473k = a;
        return a;
    }

    /* renamed from: n */
    private String m46311n() {
        boolean[] m = m46310m();
        Builder builder = new Builder();
        m[33] = true;
        Iterator it = this.f26478e.iterator();
        m[34] = true;
        while (it.hasNext()) {
            RequestParameter requestParameter = (RequestParameter) it.next();
            m[35] = true;
            builder.appendQueryParameter(requestParameter.getKey(), requestParameter.getValue().toString());
            m[36] = true;
        }
        String builder2 = builder.toString();
        m[37] = true;
        return builder2;
    }

    /* renamed from: o */
    private void m46312o() {
        boolean[] m = m46310m();
        this.f26478e = new ArrayList<>();
        m[6] = true;
        this.f26479f = new ArrayList<>();
        m[7] = true;
        this.f26480g = new ArrayList<>();
        m[8] = true;
    }

    /* renamed from: a */
    public void mo35531a(RequestMethod requestMethod) {
        boolean[] m = m46310m();
        this.f26476c = requestMethod;
        m[15] = true;
    }

    /* renamed from: b */
    public void mo35535b(String str) {
        boolean[] m = m46310m();
        this.f26475b = str;
        m[10] = true;
        StringBuilder sb = new StringBuilder();
        sb.append(f26472j);
        sb.append(mo35539d());
        this.f26474a = sb.toString();
        m[11] = true;
    }

    /* renamed from: c */
    public void mo35538c(String str, Object obj) throws JSONException {
        boolean[] m = m46310m();
        this.f26478e.add(new RequestParameter(str, obj));
        m[25] = true;
    }

    /* renamed from: d */
    public String mo35539d() {
        boolean[] m = m46310m();
        String str = this.f26475b;
        m[9] = true;
        return str;
    }

    /* renamed from: e */
    public FileToUpload mo35540e() {
        boolean[] m = m46310m();
        FileToUpload fileToUpload = this.f26481h;
        m[45] = true;
        return fileToUpload;
    }

    /* renamed from: f */
    public ArrayList<RequestParameter> mo35541f() {
        boolean[] m = m46310m();
        ArrayList<RequestParameter> arrayList = this.f26480g;
        m[19] = true;
        return arrayList;
    }

    /* renamed from: g */
    public String mo35542g() {
        boolean[] m = m46310m();
        try {
            JSONObject jSONObject = new JSONObject();
            m[38] = true;
            Iterator it = mo35543h().iterator();
            m[39] = true;
            while (it.hasNext()) {
                RequestParameter requestParameter = (RequestParameter) it.next();
                m[40] = true;
                jSONObject.put(requestParameter.getKey(), requestParameter.getValue());
                m[41] = true;
            }
            String jSONObject2 = jSONObject.toString();
            m[42] = true;
            return jSONObject2;
        } catch (JSONException e) {
            m[43] = true;
            e.printStackTrace();
            m[44] = true;
            return "";
        }
    }

    /* renamed from: h */
    public ArrayList<RequestParameter> mo35543h() {
        boolean[] m = m46310m();
        ArrayList<RequestParameter> arrayList = this.f26479f;
        m[31] = true;
        return arrayList;
    }

    /* renamed from: i */
    public RequestMethod mo35544i() {
        boolean[] m = m46310m();
        RequestMethod requestMethod = this.f26476c;
        m[16] = true;
        return requestMethod;
    }

    /* renamed from: j */
    public RequestType mo35545j() {
        boolean[] m = m46310m();
        RequestType requestType = this.f26477d;
        m[17] = true;
        return requestType;
    }

    /* renamed from: k */
    public String mo35546k() {
        boolean[] m = m46310m();
        if (m46311n() != null) {
            m[12] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f26474a);
            sb.append(m46311n());
            String sb2 = sb.toString();
            m[13] = true;
            return sb2;
        }
        String str = this.f26474a;
        m[14] = true;
        return str;
    }

    /* renamed from: l */
    public ArrayList<RequestParameter> mo35547l() {
        boolean[] m = m46310m();
        ArrayList<RequestParameter> arrayList = this.f26478e;
        m[27] = true;
        return arrayList;
    }

    /* renamed from: a */
    public void mo35532a(RequestParameter requestParameter) {
        boolean[] m = m46310m();
        this.f26480g.add(requestParameter);
        m[18] = true;
    }

    /* renamed from: c */
    public File mo35537c() {
        boolean[] m = m46310m();
        File file = this.f26482i;
        m[47] = true;
        return file;
    }

    /* renamed from: b */
    public ArrayList<RequestParameter> mo35534b(ArrayList<RequestParameter> arrayList) {
        boolean[] m = m46310m();
        this.f26478e = arrayList;
        m[26] = true;
        return arrayList;
    }

    /* renamed from: a */
    public Request mo35528a(String str, Object obj) throws JSONException {
        boolean[] m = m46310m();
        if (this.f26476c.equals(RequestMethod.Get)) {
            m[20] = true;
        } else if (this.f26476c.equals(RequestMethod.Delete)) {
            m[21] = true;
        } else {
            mo35536b(str, obj);
            m[23] = true;
            m[24] = true;
            return this;
        }
        mo35538c(str, obj);
        m[22] = true;
        m[24] = true;
        return this;
    }

    /* renamed from: b */
    public ArrayList<RequestParameter> mo35533b() {
        boolean[] m = m46310m();
        this.f26478e.clear();
        ArrayList<RequestParameter> arrayList = this.f26478e;
        m[28] = true;
        return arrayList;
    }

    public Request(String str, RequestType requestType) {
        boolean[] m = m46310m();
        this.f26474a = str;
        this.f26477d = requestType;
        m[4] = true;
        m46312o();
        m[5] = true;
    }

    /* renamed from: b */
    public void mo35536b(String str, Object obj) throws JSONException {
        boolean[] m = m46310m();
        this.f26479f.add(new RequestParameter(str, obj));
        m[29] = true;
    }

    /* renamed from: a */
    public ArrayList<RequestParameter> mo35530a(ArrayList<RequestParameter> arrayList) {
        boolean[] m = m46310m();
        this.f26479f = arrayList;
        m[30] = true;
        return arrayList;
    }

    /* renamed from: a */
    public ArrayList<RequestParameter> mo35529a() {
        boolean[] m = m46310m();
        this.f26479f.clear();
        ArrayList<RequestParameter> arrayList = this.f26479f;
        m[32] = true;
        return arrayList;
    }

    /* renamed from: a */
    public Request mo35526a(FileToUpload fileToUpload) {
        boolean[] m = m46310m();
        this.f26481h = fileToUpload;
        m[46] = true;
        return this;
    }

    /* renamed from: a */
    public Request mo35527a(String str) {
        boolean[] m = m46310m();
        this.f26482i = new File(str);
        m[48] = true;
        return this;
    }
}
