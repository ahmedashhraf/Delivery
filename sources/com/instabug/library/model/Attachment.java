package com.instabug.library.model;

import android.webkit.MimeTypeMap;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Attachment implements Cacheable, Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    static final String KEY_ATTACHMENT_STATE = "attachment_state";
    static final String KEY_DURATION = "duration";
    static final String KEY_LOCALE_PATH = "local_path";
    static final String KEY_NAME = "name";
    static final String KEY_TYPE = "type";
    static final String KEY_URL = "url";
    static final String KEY_VIDEO_ENCODED = "video_encoded";
    private AttachmentState attachmentState;
    private String duration;

    /* renamed from: id */
    private long f26430id = -1;
    private boolean isVideoEncoded = false;
    private String localPath;
    private String name;
    private boolean shouldAnimate = true;
    private Type type;
    private String url;

    public enum AttachmentState {
        OFFLINE,
        SYNCED,
        NOT_AVAILABLE;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    public enum Type {
        MAIN_SCREENSHOT("main-screenshot"),
        IMAGE("image"),
        AUDIO("audio"),
        VIDEO("video"),
        ATTACHMENT_FILE("attachment-file"),
        VIEW_HIERARCHY("view-hierarchy"),
        NOT_AVAILABLE("not-available"),
        VISUAL_USER_STEPS("user-repro-steps"),
        AUTO_SCREEN_RECORDING("auto-screen-recording");
        
        private static final Map<String, Type> lookup = null;
        private final String name;

        static {
            boolean[] $jacocoInit;
            int i;
            $jacocoInit[10] = true;
            lookup = new HashMap();
            $jacocoInit[11] = true;
            Type[] values = values();
            int length = values.length;
            $jacocoInit[12] = true;
            while (i < length) {
                Type type = values[i];
                $jacocoInit[13] = true;
                lookup.put(type.name, type);
                i++;
                $jacocoInit[14] = true;
            }
            $jacocoInit[15] = true;
        }

        private Type(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.name = str;
            $jacocoInit[2] = true;
        }

        public static Type get(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            Type type = (Type) lookup.get(str);
            if (type == null) {
                type = NOT_AVAILABLE;
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
            }
            $jacocoInit[6] = true;
            return type;
        }

        public String toString() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.name;
            $jacocoInit[3] = true;
            return str;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(139258017711844548L, "com/instabug/library/model/Attachment", 107);
        $jacocoData = a;
        return a;
    }

    public Attachment() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        setType(Type.NOT_AVAILABLE);
        $jacocoInit[1] = true;
        setAttachmentState(AttachmentState.NOT_AVAILABLE);
        $jacocoInit[2] = true;
    }

    public static List<Attachment> fromJson(JSONArray jSONArray) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[8] = true;
        $jacocoInit[9] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            $jacocoInit[10] = true;
            Attachment attachment = new Attachment();
            $jacocoInit[11] = true;
            attachment.fromJson(jSONArray.getJSONObject(i).toString());
            $jacocoInit[12] = true;
            arrayList.add(attachment);
            i++;
            $jacocoInit[13] = true;
        }
        $jacocoInit[14] = true;
        return arrayList;
    }

    public static JSONArray toJson(List<Attachment> list) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[3] = true;
        $jacocoInit[4] = true;
        int i = 0;
        while (i < list.size()) {
            $jacocoInit[5] = true;
            jSONArray.put(new JSONObject(((Attachment) list.get(i)).toJson()));
            i++;
            $jacocoInit[6] = true;
        }
        $jacocoInit[7] = true;
        return jSONArray;
    }

    public boolean equals(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (obj == null) {
            $jacocoInit[80] = true;
        } else if (!(obj instanceof Attachment)) {
            $jacocoInit[81] = true;
        } else {
            Attachment attachment = (Attachment) obj;
            $jacocoInit[82] = true;
            if (!String.valueOf(attachment.getName()).equals(String.valueOf(getName()))) {
                $jacocoInit[83] = true;
            } else {
                $jacocoInit[84] = true;
                String valueOf = String.valueOf(attachment.getLocalPath());
                $jacocoInit[85] = true;
                String valueOf2 = String.valueOf(getLocalPath());
                $jacocoInit[86] = true;
                if (!valueOf.equals(valueOf2)) {
                    $jacocoInit[87] = true;
                } else {
                    $jacocoInit[88] = true;
                    if (!String.valueOf(attachment.getUrl()).equals(String.valueOf(getUrl()))) {
                        $jacocoInit[89] = true;
                    } else {
                        $jacocoInit[90] = true;
                        if (attachment.getType() != getType()) {
                            $jacocoInit[91] = true;
                        } else {
                            $jacocoInit[92] = true;
                            if (attachment.getAttachmentState() != getAttachmentState()) {
                                $jacocoInit[93] = true;
                            } else {
                                $jacocoInit[94] = true;
                                if (attachment.isVideoEncoded() != isVideoEncoded()) {
                                    $jacocoInit[95] = true;
                                } else {
                                    $jacocoInit[96] = true;
                                    String valueOf3 = String.valueOf(attachment.getDuration());
                                    $jacocoInit[97] = true;
                                    String valueOf4 = String.valueOf(getDuration());
                                    $jacocoInit[98] = true;
                                    if (!valueOf3.equals(valueOf4)) {
                                        $jacocoInit[99] = true;
                                    } else {
                                        $jacocoInit[100] = true;
                                        z = true;
                                        $jacocoInit[102] = true;
                                        return z;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            $jacocoInit[101] = true;
            $jacocoInit[102] = true;
            return z;
        }
        $jacocoInit[103] = true;
        return false;
    }

    public AttachmentState getAttachmentState() {
        boolean[] $jacocoInit = $jacocoInit();
        AttachmentState attachmentState2 = this.attachmentState;
        $jacocoInit[40] = true;
        return attachmentState2;
    }

    public String getDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.duration;
        $jacocoInit[42] = true;
        return str;
    }

    public String getFileType() {
        boolean[] $jacocoInit = $jacocoInit();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getName());
        $jacocoInit[29] = true;
        if (fileExtensionFromUrl == null) {
            $jacocoInit[30] = true;
        } else {
            String str = "";
            if (fileExtensionFromUrl.equals(str)) {
                $jacocoInit[31] = true;
            } else {
                $jacocoInit[32] = true;
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                $jacocoInit[33] = true;
                if (mimeTypeFromExtension == null) {
                    $jacocoInit[34] = true;
                } else if (mimeTypeFromExtension.equals(str)) {
                    $jacocoInit[35] = true;
                } else {
                    $jacocoInit[36] = true;
                    $jacocoInit[38] = true;
                    return mimeTypeFromExtension;
                }
                mimeTypeFromExtension = getType().toString();
                $jacocoInit[37] = true;
                $jacocoInit[38] = true;
                return mimeTypeFromExtension;
            }
        }
        String type2 = getType().toString();
        $jacocoInit[39] = true;
        return type2;
    }

    public long getId() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.f26430id;
        $jacocoInit[15] = true;
        return j;
    }

    public String getLocalPath() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.localPath;
        $jacocoInit[19] = true;
        return str;
    }

    public String getName() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.name;
        $jacocoInit[17] = true;
        return str;
    }

    public Type getType() {
        boolean[] $jacocoInit = $jacocoInit();
        Type type2 = this.type;
        $jacocoInit[23] = true;
        return type2;
    }

    public String getUrl() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.url;
        $jacocoInit[21] = true;
        return str;
    }

    public int hashCode() {
        boolean[] $jacocoInit = $jacocoInit();
        if (getName() != null) {
            $jacocoInit[104] = true;
            int hashCode = getName().hashCode();
            $jacocoInit[105] = true;
            return hashCode;
        }
        $jacocoInit[106] = true;
        return -1;
    }

    public boolean isVideoEncoded() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isVideoEncoded;
        $jacocoInit[27] = true;
        return z;
    }

    public Attachment setAttachmentState(AttachmentState attachmentState2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.attachmentState = attachmentState2;
        $jacocoInit[41] = true;
        return this;
    }

    public void setDuration(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.duration = str;
        $jacocoInit[43] = true;
    }

    public void setId(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.f26430id = j;
        $jacocoInit[16] = true;
    }

    public Attachment setLocalPath(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.localPath = str;
        $jacocoInit[20] = true;
        return this;
    }

    public Attachment setName(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.name = str;
        $jacocoInit[18] = true;
        return this;
    }

    public void setShouldAnimate(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shouldAnimate = z;
        $jacocoInit[26] = true;
    }

    public Attachment setType(Type type2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.type = type2;
        $jacocoInit[24] = true;
        return this;
    }

    public Attachment setUrl(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.url = str;
        $jacocoInit[22] = true;
        return this;
    }

    public Attachment setVideoEncoded(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isVideoEncoded = z;
        $jacocoInit[28] = true;
        return this;
    }

    public boolean shouldAnimate() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.shouldAnimate;
        $jacocoInit[25] = true;
        return z;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(getName());
        sb.append(", Local Path: ");
        sb.append(getLocalPath());
        sb.append(", Type: ");
        sb.append(getType());
        sb.append(", Duration: ");
        $jacocoInit[77] = true;
        sb.append(getDuration());
        sb.append(", Url: ");
        sb.append(getUrl());
        sb.append(", Attachment State: ");
        $jacocoInit[78] = true;
        sb.append(getAttachmentState());
        String sb2 = sb.toString();
        $jacocoInit[79] = true;
        return sb2;
    }

    public String toJson() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[44] = true;
        JSONObject put = jSONObject.put("name", getName());
        $jacocoInit[45] = true;
        JSONObject put2 = put.put("local_path", getLocalPath());
        $jacocoInit[46] = true;
        JSONObject put3 = put2.put("url", getUrl());
        $jacocoInit[47] = true;
        JSONObject put4 = put3.put("type", getType().toString());
        $jacocoInit[48] = true;
        JSONObject put5 = put4.put("attachment_state", getAttachmentState().toString());
        $jacocoInit[49] = true;
        JSONObject put6 = put5.put("video_encoded", isVideoEncoded());
        $jacocoInit[50] = true;
        put6.put("duration", getDuration());
        $jacocoInit[51] = true;
        String jSONObject2 = jSONObject.toString();
        $jacocoInit[52] = true;
        return jSONObject2;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject(str);
        $jacocoInit[53] = true;
        String str2 = "name";
        if (!jSONObject.has(str2)) {
            $jacocoInit[54] = true;
        } else {
            $jacocoInit[55] = true;
            setName(jSONObject.getString(str2));
            $jacocoInit[56] = true;
        }
        String str3 = "local_path";
        if (!jSONObject.has(str3)) {
            $jacocoInit[57] = true;
        } else {
            $jacocoInit[58] = true;
            setLocalPath(jSONObject.getString(str3));
            $jacocoInit[59] = true;
        }
        String str4 = "url";
        if (!jSONObject.has(str4)) {
            $jacocoInit[60] = true;
        } else {
            $jacocoInit[61] = true;
            setUrl(jSONObject.getString(str4));
            $jacocoInit[62] = true;
        }
        String str5 = "type";
        if (!jSONObject.has(str5)) {
            $jacocoInit[63] = true;
        } else {
            $jacocoInit[64] = true;
            setType(Type.get(jSONObject.getString(str5)));
            $jacocoInit[65] = true;
        }
        String str6 = "attachment_state";
        if (!jSONObject.has(str6)) {
            $jacocoInit[66] = true;
        } else {
            $jacocoInit[67] = true;
            String string = jSONObject.getString(str6);
            $jacocoInit[68] = true;
            setAttachmentState(AttachmentState.valueOf(string));
            $jacocoInit[69] = true;
        }
        String str7 = "video_encoded";
        if (!jSONObject.has(str7)) {
            $jacocoInit[70] = true;
        } else {
            $jacocoInit[71] = true;
            setVideoEncoded(jSONObject.getBoolean(str7));
            $jacocoInit[72] = true;
        }
        String str8 = "duration";
        if (!jSONObject.has(str8)) {
            $jacocoInit[73] = true;
        } else {
            $jacocoInit[74] = true;
            setDuration(jSONObject.getString(str8));
            $jacocoInit[75] = true;
        }
        $jacocoInit[76] = true;
    }
}
