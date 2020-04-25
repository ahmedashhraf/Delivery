package p212io.branch.referral;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.common.util.UriUtil;
import com.google.common.base.C5785c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p489f.C14069f;
import p212io.branch.referral.C14168s.C14169a;

/* renamed from: io.branch.referral.b */
/* compiled from: ApkParser */
class C14117b {

    /* renamed from: a */
    private static final int f41507a = 1048833;

    /* renamed from: b */
    private static final int f41508b = 1048834;

    /* renamed from: c */
    private static final int f41509c = 1048835;

    C14117b() {
    }

    /* renamed from: b */
    private String m61041b(byte[] bArr, int i) {
        byte b = ((bArr[i + 1] << 8) & 65280) | (bArr[i] & 255);
        byte[] bArr2 = new byte[b];
        for (int i2 = 0; i2 < b; i2++) {
            bArr2[i2] = bArr[i + 2 + (i2 * 2)];
        }
        return new String(bArr2);
    }

    /* renamed from: a */
    public JSONObject mo44629a(byte[] bArr) {
        int i;
        int i2;
        String str;
        JSONObject jSONObject;
        String str2;
        String str3;
        String str4;
        byte[] bArr2 = bArr;
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        int i3 = 36;
        int a = (m61038a(bArr2, 16) * 4) + 36;
        int a2 = m61038a(bArr2, 12);
        int i4 = a2;
        while (true) {
            int length = bArr2.length - 4;
            i = f41508b;
            if (i4 >= length) {
                break;
            } else if (m61038a(bArr2, i4) == f41508b) {
                a2 = i4;
                break;
            } else {
                i4 += 4;
            }
        }
        String str5 = "";
        while (true) {
            try {
                int length2 = bArr2.length;
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                if (i2 >= length2) {
                    jSONObject = jSONObject3;
                    break;
                }
                int a3 = m61038a(bArr2, i2);
                if (a3 != i) {
                    jSONObject = jSONObject3;
                    if (a3 != f41509c) {
                        break;
                    }
                    i2 += 24;
                } else {
                    int a4 = m61038a(bArr2, i2 + 28);
                    i2 += 36;
                    int i5 = 0;
                    while (i5 < a4) {
                        int a5 = m61038a(bArr2, i2 + 4);
                        int a6 = m61038a(bArr2, i2 + 8);
                        int a7 = m61038a(bArr2, i2 + 16);
                        int i6 = i2 + 20;
                        String a8 = m61039a(bArr2, i3, a, a5);
                        boolean equals = "scheme".equals(a8);
                        String str6 = UriUtil.HTTPS_SCHEME;
                        int i7 = i6;
                        String str7 = "http";
                        int i8 = a4;
                        String str8 = "resourceID 0x";
                        JSONObject jSONObject4 = jSONObject3;
                        if (equals) {
                            if (a6 != -1) {
                                try {
                                    str4 = m61039a(bArr2, 36, a, a6);
                                } catch (JSONException e) {
                                    e = e;
                                    jSONObject3 = jSONObject4;
                                    e.printStackTrace();
                                    return jSONObject3;
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str8);
                                sb.append(Integer.toHexString(a7));
                                str4 = sb.toString();
                            }
                            if (m61040a(str4)) {
                                if (!jSONObject2.has(str4)) {
                                    jSONObject2.put(str4, new JSONArray());
                                } else if (jSONObject2.has(str)) {
                                    jSONObject2.put(str4, (JSONArray) jSONObject2.get(str));
                                    jSONObject2.remove(str);
                                }
                                str5 = str4;
                            }
                            if (str7.equals(str4) || str6.equals(str4)) {
                                str5 = str4;
                            }
                        } else if ("host".equals(a8)) {
                            if (a6 != -1) {
                                str3 = m61039a(bArr2, 36, a, a6);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str8);
                                sb2.append(Integer.toHexString(a7));
                                str3 = sb2.toString();
                            }
                            if (!jSONObject2.has(str5) || str5 == null || str6.equals(str5) || str7.equals(str5)) {
                                if (!str6.equals(str5)) {
                                    if (!str7.equals(str5)) {
                                        JSONArray jSONArray2 = new JSONArray();
                                        jSONArray2.put(str3);
                                        jSONObject2.put(str, jSONArray2);
                                    }
                                }
                                jSONArray.put(str3);
                            } else {
                                JSONArray jSONArray3 = jSONObject2.getJSONArray(str5);
                                jSONArray3.put(str3);
                                jSONObject2.put(str5, jSONArray3);
                            }
                        } else if ("name".equals(a8)) {
                            if (a6 != -1) {
                                str2 = m61039a(bArr2, 36, a, a6);
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str8);
                                sb3.append(Integer.toHexString(a7));
                                str2 = sb3.toString();
                            }
                            if ("android.intent.action.VIEW".equals(str2)) {
                                str5 = null;
                            }
                            i5++;
                            i2 = i7;
                            a4 = i8;
                            jSONObject3 = jSONObject4;
                            i3 = 36;
                        }
                        i5++;
                        i2 = i7;
                        a4 = i8;
                        jSONObject3 = jSONObject4;
                        i3 = 36;
                    }
                    jSONObject = jSONObject3;
                }
                jSONObject3 = jSONObject;
                i3 = 36;
                i = f41508b;
            } catch (JSONException e2) {
                e = e2;
            }
        }
        jSONObject2.remove(str);
        jSONObject3 = jSONObject;
        jSONObject3.put(C14169a.URIScheme.mo44764d(), jSONObject2);
        jSONObject3.put(C14169a.AppLinks.mo44764d(), jSONArray);
        return jSONObject3;
    }

    /* renamed from: a */
    private boolean m61040a(String str) {
        return str != null && !"http".equals(str) && !str.equals(UriUtil.HTTPS_SCHEME) && !str.equals("geo") && !str.equals(C14069f.f41343G) && !str.equals("package") && !str.equals("sms") && !str.equals("smsto") && !str.equals("mms") && !str.equals("mmsto") && !str.equals("tel") && !str.equals("voicemail") && !str.equals(UriUtil.LOCAL_FILE_SCHEME) && !str.equals("content") && !str.equals("mailto");
    }

    /* renamed from: a */
    private String m61039a(byte[] bArr, int i, int i2, int i3) {
        if (i3 < 0) {
            return null;
        }
        return m61041b(bArr, i2 + m61038a(bArr, i + (i3 * 4)));
    }

    /* renamed from: a */
    private int m61038a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 3] << C5785c.f16669B) & -16777216) | ((bArr[i + 2] << 16) & 16711680) | ((bArr[i + 1] << 8) & 65280);
    }
}
