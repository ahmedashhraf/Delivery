package com.instabug.chat.model;

import android.webkit.MimeTypeMap;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import org.jcodec.common.StringUtils;
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
    public static final String STATE_NOT_AVAILABLE = "not_available";
    public static final String STATE_OFFLINE = "offline";
    public static final String STATE_SYNCED = "synced";
    public static final String TYPE_AUDIO = "audio";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_NOT_AVAILABLE = "not_available";
    public static final String TYPE_VIDEO = "video";
    private String duration;
    private boolean isVideoEncoded = false;
    private String localPath;
    private String name;
    private String state;
    private String type;
    private String url;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AttachmentState {
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1033430706618854425L, "com/instabug/chat/model/Attachment", 118);
        $jacocoData = a;
        return a;
    }

    public Attachment() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        String str = "not_available";
        setType(str);
        $jacocoInit[1] = true;
        setState(str);
        $jacocoInit[2] = true;
    }

    public static ArrayList<Attachment> fromJson(JSONArray jSONArray) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<Attachment> arrayList = new ArrayList<>();
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

    public static JSONArray toJson(ArrayList<Attachment> arrayList) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = new JSONArray();
        $jacocoInit[3] = true;
        $jacocoInit[4] = true;
        int i = 0;
        while (i < arrayList.size()) {
            $jacocoInit[5] = true;
            jSONArray.put(new JSONObject(((Attachment) arrayList.get(i)).toJson()));
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
            $jacocoInit[91] = true;
        } else if (!(obj instanceof Attachment)) {
            $jacocoInit[92] = true;
        } else {
            Attachment attachment = (Attachment) obj;
            $jacocoInit[93] = true;
            if (!String.valueOf(attachment.getName()).equals(String.valueOf(getName()))) {
                $jacocoInit[94] = true;
            } else {
                $jacocoInit[95] = true;
                String valueOf = String.valueOf(attachment.getLocalPath());
                $jacocoInit[96] = true;
                String valueOf2 = String.valueOf(getLocalPath());
                $jacocoInit[97] = true;
                if (!valueOf.equals(valueOf2)) {
                    $jacocoInit[98] = true;
                } else {
                    $jacocoInit[99] = true;
                    if (!String.valueOf(attachment.getUrl()).equals(String.valueOf(getUrl()))) {
                        $jacocoInit[100] = true;
                    } else {
                        $jacocoInit[101] = true;
                        if (!attachment.getType().equals(getType())) {
                            $jacocoInit[102] = true;
                        } else {
                            $jacocoInit[103] = true;
                            if (!attachment.getState().equals(getState())) {
                                $jacocoInit[104] = true;
                            } else {
                                $jacocoInit[105] = true;
                                if (attachment.isVideoEncoded() != isVideoEncoded()) {
                                    $jacocoInit[106] = true;
                                } else {
                                    $jacocoInit[107] = true;
                                    String valueOf3 = String.valueOf(attachment.getDuration());
                                    $jacocoInit[108] = true;
                                    String valueOf4 = String.valueOf(getDuration());
                                    $jacocoInit[109] = true;
                                    if (!valueOf3.equals(valueOf4)) {
                                        $jacocoInit[110] = true;
                                    } else {
                                        $jacocoInit[111] = true;
                                        z = true;
                                        $jacocoInit[113] = true;
                                        return z;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            $jacocoInit[112] = true;
            $jacocoInit[113] = true;
            return z;
        }
        $jacocoInit[114] = true;
        return false;
    }

    public String getDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.duration;
        $jacocoInit[38] = true;
        return str;
    }

    public String getFileType() {
        boolean[] $jacocoInit = $jacocoInit();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getName());
        $jacocoInit[25] = true;
        if (fileExtensionFromUrl == null) {
            $jacocoInit[26] = true;
        } else if (StringUtils.isEmpty(fileExtensionFromUrl)) {
            $jacocoInit[27] = true;
        } else {
            $jacocoInit[28] = true;
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            $jacocoInit[29] = true;
            if (mimeTypeFromExtension == null) {
                $jacocoInit[30] = true;
            } else if (mimeTypeFromExtension.equals("")) {
                $jacocoInit[31] = true;
            } else {
                $jacocoInit[32] = true;
                $jacocoInit[34] = true;
                return mimeTypeFromExtension;
            }
            mimeTypeFromExtension = getType();
            $jacocoInit[33] = true;
            $jacocoInit[34] = true;
            return mimeTypeFromExtension;
        }
        String type2 = getType();
        $jacocoInit[35] = true;
        return type2;
    }

    public String getLocalPath() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.localPath;
        $jacocoInit[17] = true;
        return str;
    }

    public String getName() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.name;
        $jacocoInit[15] = true;
        return str;
    }

    public String getState() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.state;
        $jacocoInit[36] = true;
        return str;
    }

    public String getType() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.type;
        $jacocoInit[21] = true;
        return str;
    }

    public String getUrl() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.url;
        $jacocoInit[19] = true;
        return str;
    }

    public int hashCode() {
        boolean[] $jacocoInit = $jacocoInit();
        if (getName() != null) {
            $jacocoInit[115] = true;
            int hashCode = getName().hashCode();
            $jacocoInit[116] = true;
            return hashCode;
        }
        $jacocoInit[117] = true;
        return -1;
    }

    public boolean isVideoEncoded() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isVideoEncoded;
        $jacocoInit[23] = true;
        return z;
    }

    public void setDuration(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.duration = str;
        $jacocoInit[39] = true;
    }

    public Attachment setLocalPath(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.localPath = str;
        $jacocoInit[18] = true;
        return this;
    }

    public Attachment setName(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.name = str;
        $jacocoInit[16] = true;
        return this;
    }

    public Attachment setState(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.state = str;
        $jacocoInit[37] = true;
        return this;
    }

    public Attachment setType(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.type = str;
        $jacocoInit[22] = true;
        return this;
    }

    public Attachment setUrl(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.url = str;
        $jacocoInit[20] = true;
        return this;
    }

    public Attachment setVideoEncoded(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isVideoEncoded = z;
        $jacocoInit[24] = true;
        return this;
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
        sb.append(", Url: ");
        $jacocoInit[89] = true;
        sb.append(getUrl());
        sb.append(", Attachment State: ");
        sb.append(getState());
        String sb2 = sb.toString();
        $jacocoInit[90] = true;
        return sb2;
    }

    public String toJson() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[40] = true;
        JSONObject put = jSONObject.put("name", getName());
        $jacocoInit[41] = true;
        JSONObject put2 = put.put("local_path", getLocalPath());
        $jacocoInit[42] = true;
        JSONObject put3 = put2.put("url", getUrl());
        $jacocoInit[43] = true;
        JSONObject put4 = put3.put("type", getType());
        $jacocoInit[44] = true;
        JSONObject put5 = put4.put("attachment_state", getState().toString());
        $jacocoInit[45] = true;
        JSONObject put6 = put5.put("video_encoded", isVideoEncoded());
        $jacocoInit[46] = true;
        put6.put("duration", getDuration());
        $jacocoInit[47] = true;
        String jSONObject2 = jSONObject.toString();
        $jacocoInit[48] = true;
        return jSONObject2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fromJson(java.lang.String r13) throws org.json.JSONException {
        /*
            r12 = this;
            boolean[] r0 = $jacocoInit()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r13)
            r13 = 1
            r2 = 49
            r0[r2] = r13
            java.lang.String r2 = "name"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x001b
            r2 = 50
            r0[r2] = r13
            goto L_0x002a
        L_0x001b:
            r3 = 51
            r0[r3] = r13
            java.lang.String r2 = r1.getString(r2)
            r12.setName(r2)
            r2 = 52
            r0[r2] = r13
        L_0x002a:
            java.lang.String r2 = "local_path"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0037
            r2 = 53
            r0[r2] = r13
            goto L_0x0046
        L_0x0037:
            r3 = 54
            r0[r3] = r13
            java.lang.String r2 = r1.getString(r2)
            r12.setLocalPath(r2)
            r2 = 55
            r0[r2] = r13
        L_0x0046:
            java.lang.String r2 = "url"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0053
            r2 = 56
            r0[r2] = r13
            goto L_0x0062
        L_0x0053:
            r3 = 57
            r0[r3] = r13
            java.lang.String r2 = r1.getString(r2)
            r12.setUrl(r2)
            r2 = 58
            r0[r2] = r13
        L_0x0062:
            java.lang.String r2 = "type"
            boolean r3 = r1.has(r2)
            java.lang.String r4 = "not_available"
            r5 = 0
            r6 = -1
            if (r3 != 0) goto L_0x0074
            r2 = 59
            r0[r2] = r13
            goto L_0x00f3
        L_0x0074:
            r3 = 60
            r0[r3] = r13
            java.lang.String r2 = r1.getString(r2)
            int r3 = r2.hashCode()
            r7 = 93166550(0x58d9bd6, float:1.3316821E-35)
            r8 = 2
            java.lang.String r9 = "video"
            java.lang.String r10 = "image"
            java.lang.String r11 = "audio"
            if (r3 == r7) goto L_0x00bd
            r7 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r3 == r7) goto L_0x00ac
            r7 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r3 == r7) goto L_0x009b
            r2 = 61
            r0[r2] = r13
            goto L_0x00c7
        L_0x009b:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x00a6
            r2 = 66
            r0[r2] = r13
            goto L_0x00c7
        L_0x00a6:
            r2 = 67
            r0[r2] = r13
            r2 = 2
            goto L_0x00ce
        L_0x00ac:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00b7
            r2 = 62
            r0[r2] = r13
            goto L_0x00c7
        L_0x00b7:
            r2 = 63
            r0[r2] = r13
            r2 = 0
            goto L_0x00ce
        L_0x00bd:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x00c9
            r2 = 64
            r0[r2] = r13
        L_0x00c7:
            r2 = -1
            goto L_0x00ce
        L_0x00c9:
            r2 = 65
            r0[r2] = r13
            r2 = 1
        L_0x00ce:
            if (r2 == 0) goto L_0x00ec
            if (r2 == r13) goto L_0x00e4
            if (r2 == r8) goto L_0x00dc
            r12.setType(r4)
            r2 = 71
            r0[r2] = r13
            goto L_0x00f3
        L_0x00dc:
            r12.setType(r9)
            r2 = 70
            r0[r2] = r13
            goto L_0x00f3
        L_0x00e4:
            r12.setType(r11)
            r2 = 69
            r0[r2] = r13
            goto L_0x00f3
        L_0x00ec:
            r12.setType(r10)
            r2 = 68
            r0[r2] = r13
        L_0x00f3:
            java.lang.String r2 = "attachment_state"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0100
            r2 = 72
            r0[r2] = r13
            goto L_0x015b
        L_0x0100:
            r3 = 73
            r0[r3] = r13
            java.lang.String r2 = r1.getString(r2)
            int r3 = r2.hashCode()
            r7 = -1548612125(0xffffffffa3b20de3, float:-1.930468E-17)
            java.lang.String r8 = "synced"
            java.lang.String r9 = "offline"
            if (r3 == r7) goto L_0x0130
            r5 = -887493510(0xffffffffcb19ec7a, float:-1.0087546E7)
            if (r3 == r5) goto L_0x011f
            r2 = 74
            r0[r2] = r13
            goto L_0x013a
        L_0x011f:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x012a
            r2 = 77
            r0[r2] = r13
            goto L_0x013a
        L_0x012a:
            r2 = 78
            r0[r2] = r13
            r5 = 1
            goto L_0x0140
        L_0x0130:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x013c
            r2 = 75
            r0[r2] = r13
        L_0x013a:
            r5 = -1
            goto L_0x0140
        L_0x013c:
            r2 = 76
            r0[r2] = r13
        L_0x0140:
            if (r5 == 0) goto L_0x0154
            if (r5 == r13) goto L_0x014c
            r12.setState(r4)
            r2 = 81
            r0[r2] = r13
            goto L_0x015b
        L_0x014c:
            r12.setState(r8)
            r2 = 80
            r0[r2] = r13
            goto L_0x015b
        L_0x0154:
            r12.setState(r9)
            r2 = 79
            r0[r2] = r13
        L_0x015b:
            java.lang.String r2 = "video_encoded"
            boolean r2 = r1.has(r2)
            if (r2 != 0) goto L_0x0168
            r2 = 82
            r0[r2] = r13
            goto L_0x0179
        L_0x0168:
            r2 = 83
            r0[r2] = r13
            java.lang.String r2 = "video_encoded"
            boolean r2 = r1.getBoolean(r2)
            r12.setVideoEncoded(r2)
            r2 = 84
            r0[r2] = r13
        L_0x0179:
            java.lang.String r2 = "duration"
            boolean r2 = r1.has(r2)
            if (r2 != 0) goto L_0x0186
            r1 = 85
            r0[r1] = r13
            goto L_0x0197
        L_0x0186:
            r2 = 86
            r0[r2] = r13
            java.lang.String r2 = "duration"
            java.lang.String r1 = r1.getString(r2)
            r12.setDuration(r1)
            r1 = 87
            r0[r1] = r13
        L_0x0197:
            r1 = 88
            r0[r1] = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.chat.model.Attachment.fromJson(java.lang.String):void");
    }
}
