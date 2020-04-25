package com.instabug.survey.p398b;

import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.C10060a.C10063c;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.C10083a;
import com.instabug.survey.models.Survey;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"DM_BOXED_PRIMITIVE_FOR_COMPARE"})
/* renamed from: com.instabug.survey.b.g */
/* compiled from: SurveysValidator */
public class C10073g {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26802c;

    /* renamed from: a */
    private String f26803a;

    /* renamed from: b */
    private String f26804b;

    /* renamed from: com.instabug.survey.b.g$a */
    /* compiled from: SurveysValidator */
    class C10074a implements Comparator<Survey> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26805b;

        /* renamed from: a */
        final /* synthetic */ C10073g f26806a;

        C10074a(C10073g gVar) {
            boolean[] a = m46873a();
            this.f26806a = gVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46873a() {
            boolean[] zArr = f26805b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2294702033435813860L, "com/instabug/survey/utils/SurveysValidator$1", 3);
            f26805b = a;
            return a;
        }

        /* renamed from: a */
        public int mo36147a(Survey survey, Survey survey2) {
            boolean[] a = m46873a();
            int compareTo = Long.valueOf(survey.getDismissedAt()).compareTo(Long.valueOf(survey2.getDismissedAt()));
            a[1] = true;
            return compareTo;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            boolean[] a = m46873a();
            int a2 = mo36147a((Survey) obj, (Survey) obj2);
            a[2] = true;
            return a2;
        }
    }

    public C10073g(String str, String str2) {
        boolean[] d = m46852d();
        this.f26804b = str;
        this.f26803a = str2;
        d[0] = true;
    }

    /* renamed from: c */
    private boolean m46849c(Survey survey) {
        boolean z;
        boolean[] d = m46852d();
        int a = mo36130a(survey.getDismissedAt() * 1000, System.currentTimeMillis());
        d[32] = true;
        if (a >= C10063c.m46803e().mo36127d()) {
            d[33] = true;
            z = true;
        } else {
            z = false;
            d[34] = true;
        }
        d[35] = true;
        return z;
    }

    /* renamed from: d */
    private boolean m46851d(Survey survey) {
        boolean z;
        boolean[] d = m46852d();
        int sessionCounter = survey.getSessionCounter();
        C10063c e = C10063c.m46803e();
        d[36] = true;
        if (sessionCounter >= e.mo36126c()) {
            d[37] = true;
            z = true;
        } else {
            z = false;
            d[38] = true;
        }
        d[39] = true;
        return z;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m46852d() {
        boolean[] zArr = f26802c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4258464257280811027L, "com/instabug/survey/utils/SurveysValidator", 372);
        f26802c = a;
        return a;
    }

    /* renamed from: e */
    private boolean m46853e(C10083a aVar) {
        boolean[] d = m46852d();
        boolean g = m46855g(aVar);
        d[156] = true;
        return g;
    }

    /* renamed from: f */
    private boolean m46854f(C10083a aVar) throws ParseException {
        boolean[] d = m46852d();
        int a = mo36131a(aVar.mo36203a());
        d[197] = true;
        boolean b = m46846b(aVar, a);
        d[198] = true;
        return b;
    }

    /* renamed from: g */
    private boolean m46855g(C10083a aVar) {
        boolean[] d = m46852d();
        boolean z = false;
        if (aVar.mo36207d() == null) {
            d[334] = true;
            return false;
        }
        int parseInt = Integer.parseInt(aVar.mo36207d());
        d[335] = true;
        int a = C10065a.m46825a(InstabugCore.getFirstRunAt());
        d[336] = true;
        String e = aVar.mo36208e();
        char c = 65535;
        switch (e.hashCode()) {
            case -1374681402:
                if (e.equals("greater_than")) {
                    d[343] = true;
                    c = 2;
                    break;
                } else {
                    d[342] = true;
                    break;
                }
            case 96757556:
                if (e.equals("equal")) {
                    d[339] = true;
                    c = 0;
                    break;
                } else {
                    d[338] = true;
                    break;
                }
            case 365984903:
                if (e.equals("less_than")) {
                    d[345] = true;
                    c = 3;
                    break;
                } else {
                    d[344] = true;
                    break;
                }
            case 1614662344:
                if (e.equals("not_equal")) {
                    d[341] = true;
                    c = 1;
                    break;
                } else {
                    d[340] = true;
                    break;
                }
            default:
                d[337] = true;
                break;
        }
        if (c == 0) {
            if (a == parseInt) {
                d[346] = true;
                z = true;
            } else {
                d[347] = true;
            }
            d[348] = true;
            return z;
        } else if (c == 1) {
            if (a != parseInt) {
                d[349] = true;
                z = true;
            } else {
                d[350] = true;
            }
            d[351] = true;
            return z;
        } else if (c == 2) {
            if (a > parseInt) {
                d[352] = true;
                z = true;
            } else {
                d[353] = true;
            }
            d[354] = true;
            return z;
        } else if (c != 3) {
            d[358] = true;
            return false;
        } else {
            if (a < parseInt) {
                d[355] = true;
                z = true;
            } else {
                d[356] = true;
            }
            d[357] = true;
            return z;
        }
    }

    @C0195i0
    /* renamed from: a */
    public Survey mo36132a() throws ParseException {
        Survey survey;
        boolean[] d = m46852d();
        List<Survey> notAnsweredSurveys = SurveysCacheManager.getNotAnsweredSurveys();
        d[1] = true;
        ArrayList<Survey> arrayList = new ArrayList<>();
        d[2] = true;
        d[3] = true;
        for (Survey survey2 : notAnsweredSurveys) {
            d[4] = true;
            if (!mo36142b(survey2)) {
                d[5] = true;
            } else {
                d[6] = true;
                if (!survey2.isCancelled()) {
                    d[7] = true;
                } else if (survey2.isPaused()) {
                    d[8] = true;
                } else if (!survey2.shouldShowAgain()) {
                    d[9] = true;
                } else {
                    d[10] = true;
                    if (!mo36133a(survey2)) {
                        d[11] = true;
                    } else {
                        d[12] = true;
                        arrayList.add(survey2);
                        d[13] = true;
                    }
                }
                arrayList.add(survey2);
                d[14] = true;
            }
            d[15] = true;
        }
        Collections.sort(arrayList, new C10074a(this));
        d[16] = true;
        if (arrayList.size() <= 0) {
            d[17] = true;
        } else {
            d[18] = true;
            d[19] = true;
            for (Survey survey3 : arrayList) {
                d[21] = true;
                if (survey3.getDismissedAt() > 0) {
                    d[22] = true;
                    return survey3;
                }
                d[23] = true;
            }
            d[20] = true;
        }
        if (arrayList.size() > 0) {
            survey = (Survey) arrayList.get(0);
            d[24] = true;
        } else {
            survey = null;
            d[25] = true;
        }
        d[26] = true;
        return survey;
    }

    /* renamed from: b */
    public boolean mo36141b() throws ParseException {
        boolean z;
        boolean[] d = m46852d();
        if (mo36132a() != null) {
            d[40] = true;
            z = true;
        } else {
            z = false;
            d[41] = true;
        }
        d[42] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011b  */
    @androidx.annotation.C0224v0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36142b(com.instabug.survey.models.Survey r10) throws java.text.ParseException {
        /*
            r9 = this;
            boolean[] r0 = m46852d()
            java.util.ArrayList r1 = r10.getTargetAudiences()
            r2 = 1
            r3 = 43
            r0[r3] = r2
            java.lang.String r3 = r10.getConditionsOperator()
            long r4 = r10.getDismissedAt()
            r6 = 44
            r0[r6] = r2
            boolean r1 = r9.mo36140a(r1, r3, r4)
            r3 = 45
            r0[r3] = r2
            java.util.ArrayList r3 = r10.getCustomAttributes()
            r4 = 46
            r0[r4] = r2
            java.lang.String r4 = r10.getConditionsOperator()
            r5 = 47
            r0[r5] = r2
            boolean r3 = r9.mo36139a(r3, r4)
            r4 = 48
            r0[r4] = r2
            java.util.ArrayList r4 = r10.getUserEvents()
            r5 = 49
            r0[r5] = r2
            java.lang.String r5 = r10.getConditionsOperator()
            r6 = 50
            r0[r6] = r2
            boolean r4 = r9.m46848b(r4, r5)
            r5 = 51
            r0[r5] = r2
            java.util.ArrayList r5 = r10.getUserEvents()
            if (r5 != 0) goto L_0x005c
            r5 = 52
            r0[r5] = r2
            goto L_0x006f
        L_0x005c:
            java.util.ArrayList r5 = r10.getUserEvents()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x006b
            r5 = 53
            r0[r5] = r2
            goto L_0x0094
        L_0x006b:
            r5 = 54
            r0[r5] = r2
        L_0x006f:
            r5 = 55
            r0[r5] = r2
            java.util.ArrayList r5 = r10.getCustomAttributes()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0082
            r5 = 56
            r0[r5] = r2
            goto L_0x0094
        L_0x0082:
            r5 = 57
            r0[r5] = r2
            java.util.ArrayList r5 = r10.getTargetAudiences()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x013e
            r5 = 58
            r0[r5] = r2
        L_0x0094:
            java.lang.String r10 = r10.getConditionsOperator()
            r5 = -1
            int r6 = r10.hashCode()
            r7 = 3555(0xde3, float:4.982E-42)
            r8 = 0
            if (r6 == r7) goto L_0x00bf
            r7 = 96727(0x179d7, float:1.35543E-40)
            if (r6 == r7) goto L_0x00ac
            r10 = 59
            r0[r10] = r2
            goto L_0x00d1
        L_0x00ac:
            java.lang.String r6 = "and"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00b9
            r10 = 60
            r0[r10] = r2
            goto L_0x00d1
        L_0x00b9:
            r10 = 61
            r0[r10] = r2
            r5 = 0
            goto L_0x00d1
        L_0x00bf:
            java.lang.String r6 = "or"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00cc
            r10 = 62
            r0[r10] = r2
            goto L_0x00d1
        L_0x00cc:
            r10 = 63
            r0[r10] = r2
            r5 = 1
        L_0x00d1:
            if (r5 == 0) goto L_0x011b
            if (r5 == r2) goto L_0x00f8
            if (r1 != 0) goto L_0x00dc
            r10 = 76
            r0[r10] = r2
            goto L_0x00e9
        L_0x00dc:
            if (r3 != 0) goto L_0x00e3
            r10 = 77
            r0[r10] = r2
            goto L_0x00e9
        L_0x00e3:
            if (r4 != 0) goto L_0x00ee
            r10 = 78
            r0[r10] = r2
        L_0x00e9:
            r10 = 80
            r0[r10] = r2
            goto L_0x00f3
        L_0x00ee:
            r10 = 79
            r0[r10] = r2
            r8 = 1
        L_0x00f3:
            r10 = 81
            r0[r10] = r2
            return r8
        L_0x00f8:
            if (r1 == 0) goto L_0x00ff
            r10 = 70
            r0[r10] = r2
            goto L_0x010c
        L_0x00ff:
            if (r3 == 0) goto L_0x0106
            r10 = 71
            r0[r10] = r2
            goto L_0x010c
        L_0x0106:
            if (r4 == 0) goto L_0x0112
            r10 = 72
            r0[r10] = r2
        L_0x010c:
            r10 = 73
            r0[r10] = r2
            r8 = 1
            goto L_0x0116
        L_0x0112:
            r10 = 74
            r0[r10] = r2
        L_0x0116:
            r10 = 75
            r0[r10] = r2
            return r8
        L_0x011b:
            if (r1 != 0) goto L_0x0122
            r10 = 64
            r0[r10] = r2
            goto L_0x012f
        L_0x0122:
            if (r3 != 0) goto L_0x0129
            r10 = 65
            r0[r10] = r2
            goto L_0x012f
        L_0x0129:
            if (r4 != 0) goto L_0x0134
            r10 = 66
            r0[r10] = r2
        L_0x012f:
            r10 = 68
            r0[r10] = r2
            goto L_0x0139
        L_0x0134:
            r10 = 67
            r0[r10] = r2
            r8 = 1
        L_0x0139:
            r10 = 69
            r0[r10] = r2
            return r8
        L_0x013e:
            r10 = 82
            r0[r10] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.p398b.C10073g.mo36142b(com.instabug.survey.models.Survey):boolean");
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public boolean mo36145c(C10083a aVar) throws ParseException {
        boolean[] d = m46852d();
        String identifiedUserEmail = InstabugCore.getIdentifiedUserEmail();
        d[152] = true;
        boolean a = mo36137a(aVar, identifiedUserEmail);
        d[153] = true;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: d */
    public boolean mo36146d(C10083a aVar) {
        boolean z;
        boolean[] d = m46852d();
        HashMap all = UserAttributesCacheManager.getAll();
        if (all == null) {
            d[172] = true;
        } else {
            d[173] = true;
            String a = aVar.mo36203a();
            d[174] = true;
            if (!all.containsKey(a)) {
                d[175] = true;
            } else {
                d[176] = true;
                String str = (String) all.get(aVar.mo36203a());
                d[177] = true;
                if (!mo36137a(aVar, str)) {
                    d[178] = true;
                } else {
                    d[179] = true;
                    z = true;
                    d[181] = true;
                    return z;
                }
            }
        }
        z = false;
        d[180] = true;
        d[181] = true;
        return z;
    }

    /* renamed from: c */
    private boolean m46850c(C10083a aVar, int i) {
        boolean[] d = m46852d();
        boolean z = false;
        if (aVar.mo36207d() == null) {
            d[310] = true;
            return false;
        }
        int parseInt = Integer.parseInt(aVar.mo36207d());
        d[311] = true;
        String e = aVar.mo36208e();
        char c = 65535;
        switch (e.hashCode()) {
            case -1374681402:
                if (e.equals("greater_than")) {
                    d[318] = true;
                    c = 2;
                    break;
                } else {
                    d[317] = true;
                    break;
                }
            case 96757556:
                if (e.equals("equal")) {
                    d[314] = true;
                    c = 0;
                    break;
                } else {
                    d[313] = true;
                    break;
                }
            case 365984903:
                if (e.equals("less_than")) {
                    d[320] = true;
                    c = 3;
                    break;
                } else {
                    d[319] = true;
                    break;
                }
            case 1614662344:
                if (e.equals("not_equal")) {
                    d[316] = true;
                    c = 1;
                    break;
                } else {
                    d[315] = true;
                    break;
                }
            default:
                d[312] = true;
                break;
        }
        if (c == 0) {
            if (i == parseInt) {
                d[321] = true;
                z = true;
            } else {
                d[322] = true;
            }
            d[323] = true;
            return z;
        } else if (c == 1) {
            if (i != parseInt) {
                d[324] = true;
                z = true;
            } else {
                d[325] = true;
            }
            d[326] = true;
            return z;
        } else if (c == 2) {
            if (i > parseInt) {
                d[327] = true;
                z = true;
            } else {
                d[328] = true;
            }
            d[329] = true;
            return z;
        } else if (c != 3) {
            d[333] = true;
            return false;
        } else {
            if (i < parseInt) {
                d[330] = true;
                z = true;
            } else {
                d[331] = true;
            }
            d[332] = true;
            return z;
        }
    }

    /* renamed from: c */
    public List<com.instabug.survey.Survey> mo36144c() {
        boolean[] d = m46852d();
        List<Survey> notAnsweredSurveys = SurveysCacheManager.getNotAnsweredSurveys();
        d[360] = true;
        ArrayList arrayList = new ArrayList();
        d[361] = true;
        d[362] = true;
        for (Survey survey : notAnsweredSurveys) {
            try {
                d[363] = true;
                if (!mo36142b(survey)) {
                    d[364] = true;
                } else {
                    d[365] = true;
                    arrayList.add(new com.instabug.survey.Survey(survey.getId(), survey.getTitle()));
                    d[366] = true;
                }
                d[367] = true;
            } catch (ParseException e) {
                d[368] = true;
                e.printStackTrace();
                d[369] = true;
            }
            d[370] = true;
        }
        d[371] = true;
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo36133a(Survey survey) {
        boolean z;
        boolean[] d = m46852d();
        if (!m46851d(survey)) {
            d[27] = true;
        } else if (!m46849c(survey)) {
            d[28] = true;
        } else {
            d[29] = true;
            z = true;
            d[31] = true;
            return z;
        }
        z = false;
        d[30] = true;
        d[31] = true;
        return z;
    }

    /* renamed from: b */
    private String m46845b(String str) {
        boolean[] d = m46852d();
        d[145] = true;
        Pattern compile = Pattern.compile("\\d+(\\.\\d+)*");
        d[146] = true;
        Matcher matcher = compile.matcher(str);
        d[147] = true;
        if (matcher.find()) {
            d[148] = true;
            String group = matcher.group(0);
            d[149] = true;
            return group;
        }
        d[150] = true;
        return null;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo36140a(ArrayList<C10083a> arrayList, String str, long j) throws ParseException {
        boolean[] d = m46852d();
        String str2 = "and";
        boolean equals = str.equals(str2);
        d[83] = true;
        d[84] = true;
        boolean z = equals;
        int i = 0;
        while (i < arrayList.size()) {
            d[85] = true;
            boolean a = mo36135a((C10083a) arrayList.get(i), j);
            if (i == 0) {
                d[86] = true;
                z = a;
            } else {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        d[87] = true;
                    } else if (!str.equals(str2)) {
                        d[88] = true;
                    } else {
                        d[89] = true;
                        c = 0;
                    }
                } else if (!str.equals("or")) {
                    d[90] = true;
                } else {
                    d[91] = true;
                    c = 1;
                }
                if (c == 0) {
                    z &= a;
                    d[92] = true;
                } else if (c != 1) {
                    z &= a;
                    d[94] = true;
                } else {
                    z |= a;
                    d[93] = true;
                }
            }
            i++;
            d[95] = true;
        }
        d[96] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: b */
    public boolean mo36143b(C10083a aVar) throws ParseException {
        boolean[] d = m46852d();
        boolean a = mo36138a(aVar, new Date());
        d[151] = true;
        return a;
    }

    /* renamed from: b */
    private boolean m46848b(ArrayList<C10083a> arrayList, String str) throws ParseException {
        boolean z;
        boolean[] d = m46852d();
        String str2 = "and";
        boolean equals = str.equals(str2);
        if (arrayList == null) {
            d[182] = true;
            return equals;
        }
        d[183] = true;
        boolean z2 = equals;
        int i = 0;
        while (i < arrayList.size()) {
            d[184] = true;
            boolean f = m46854f((C10083a) arrayList.get(i));
            if (i == 0) {
                d[185] = true;
                z2 = f;
            } else {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        d[186] = true;
                    } else if (!str.equals(str2)) {
                        d[187] = true;
                    } else {
                        d[188] = true;
                        c = 0;
                    }
                } else if (!str.equals("or")) {
                    d[189] = true;
                } else {
                    d[190] = true;
                    c = 1;
                }
                if (c == 0) {
                    z = z2 & f;
                    d[191] = true;
                } else if (c != 1) {
                    z = z2 & f;
                    d[193] = true;
                } else {
                    z = z2 | f;
                    d[192] = true;
                }
                z2 = z & f;
                d[194] = true;
            }
            i++;
            d[195] = true;
        }
        d[196] = true;
        return z2;
    }

    /* access modifiers changed from: 0000 */
    @androidx.annotation.C0224v0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36135a(com.instabug.survey.models.C10083a r10, long r11) throws java.text.ParseException {
        /*
            r9 = this;
            boolean[] r0 = m46852d()
            java.lang.String r1 = r10.mo36203a()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r2) {
                case -1464712027: goto L_0x007b;
                case -901870406: goto L_0x0068;
                case 3076014: goto L_0x0055;
                case 96619420: goto L_0x0042;
                case 1421955229: goto L_0x002f;
                case 1905908461: goto L_0x001b;
                default: goto L_0x0015;
            }
        L_0x0015:
            r1 = 97
            r0[r1] = r8
            goto L_0x008e
        L_0x001b:
            java.lang.String r2 = "sessions_count"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0029
            r1 = 104(0x68, float:1.46E-43)
            r0[r1] = r8
            goto L_0x008e
        L_0x0029:
            r1 = 105(0x69, float:1.47E-43)
            r0[r1] = r8
            r1 = 3
            goto L_0x008f
        L_0x002f:
            java.lang.String r2 = "days_since_dismiss"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003c
            r1 = 108(0x6c, float:1.51E-43)
            r0[r1] = r8
            goto L_0x008e
        L_0x003c:
            r1 = 109(0x6d, float:1.53E-43)
            r0[r1] = r8
            r1 = 5
            goto L_0x008f
        L_0x0042:
            java.lang.String r2 = "email"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004f
            r1 = 102(0x66, float:1.43E-43)
            r0[r1] = r8
            goto L_0x008e
        L_0x004f:
            r1 = 103(0x67, float:1.44E-43)
            r0[r1] = r8
            r1 = 2
            goto L_0x008f
        L_0x0055:
            java.lang.String r2 = "date"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0062
            r1 = 100
            r0[r1] = r8
            goto L_0x008e
        L_0x0062:
            r1 = 101(0x65, float:1.42E-43)
            r0[r1] = r8
            r1 = 1
            goto L_0x008f
        L_0x0068:
            java.lang.String r2 = "app_version"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0075
            r1 = 98
            r0[r1] = r8
            goto L_0x008e
        L_0x0075:
            r1 = 99
            r0[r1] = r8
            r1 = 0
            goto L_0x008f
        L_0x007b:
            java.lang.String r2 = "days_since_signup"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0088
            r1 = 106(0x6a, float:1.49E-43)
            r0[r1] = r8
            goto L_0x008e
        L_0x0088:
            r1 = 107(0x6b, float:1.5E-43)
            r0[r1] = r8
            r1 = 4
            goto L_0x008f
        L_0x008e:
            r1 = -1
        L_0x008f:
            if (r1 == 0) goto L_0x00e1
            if (r1 == r8) goto L_0x00d8
            if (r1 == r7) goto L_0x00cf
            if (r1 == r6) goto L_0x00b6
            if (r1 == r5) goto L_0x00ad
            if (r1 == r4) goto L_0x00a0
            r10 = 118(0x76, float:1.65E-43)
            r0[r10] = r8
            return r3
        L_0x00a0:
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            boolean r10 = r9.mo36136a(r10, r11)
            r11 = 117(0x75, float:1.64E-43)
            r0[r11] = r8
            return r10
        L_0x00ad:
            boolean r10 = r9.m46853e(r10)
            r11 = 116(0x74, float:1.63E-43)
            r0[r11] = r8
            return r10
        L_0x00b6:
            com.instabug.library.settings.SettingsManager r11 = com.instabug.library.settings.SettingsManager.getInstance()
            r12 = 113(0x71, float:1.58E-43)
            r0[r12] = r8
            int r11 = r11.getSessionsCount()
            r12 = 114(0x72, float:1.6E-43)
            r0[r12] = r8
            boolean r10 = r9.m46844a(r10, r11)
            r11 = 115(0x73, float:1.61E-43)
            r0[r11] = r8
            return r10
        L_0x00cf:
            boolean r10 = r9.mo36145c(r10)
            r11 = 112(0x70, float:1.57E-43)
            r0[r11] = r8
            return r10
        L_0x00d8:
            boolean r10 = r9.mo36143b(r10)
            r11 = 111(0x6f, float:1.56E-43)
            r0[r11] = r8
            return r10
        L_0x00e1:
            boolean r10 = r9.mo36134a(r10)
            r11 = 110(0x6e, float:1.54E-43)
            r0[r11] = r8
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.p398b.C10073g.mo36135a(com.instabug.survey.models.a, long):boolean");
    }

    /* renamed from: b */
    private boolean m46846b(C10083a aVar, int i) {
        boolean[] d = m46852d();
        boolean z = false;
        if (aVar.mo36207d() == null) {
            d[235] = true;
            return false;
        }
        int parseInt = Integer.parseInt(aVar.mo36207d());
        d[236] = true;
        String e = aVar.mo36208e();
        char c = 65535;
        switch (e.hashCode()) {
            case -1374681402:
                if (e.equals("greater_than")) {
                    d[243] = true;
                    c = 2;
                    break;
                } else {
                    d[242] = true;
                    break;
                }
            case 96757556:
                if (e.equals("equal")) {
                    d[239] = true;
                    c = 0;
                    break;
                } else {
                    d[238] = true;
                    break;
                }
            case 365984903:
                if (e.equals("less_than")) {
                    d[245] = true;
                    c = 3;
                    break;
                } else {
                    d[244] = true;
                    break;
                }
            case 1614662344:
                if (e.equals("not_equal")) {
                    d[241] = true;
                    c = 1;
                    break;
                } else {
                    d[240] = true;
                    break;
                }
            default:
                d[237] = true;
                break;
        }
        if (c == 0) {
            if (i == parseInt) {
                d[246] = true;
                z = true;
            } else {
                d[247] = true;
            }
            d[248] = true;
            return z;
        } else if (c == 1) {
            if (i != parseInt) {
                d[249] = true;
                z = true;
            } else {
                d[250] = true;
            }
            d[251] = true;
            return z;
        } else if (c == 2) {
            if (i > parseInt) {
                d[252] = true;
                z = true;
            } else {
                d[253] = true;
            }
            d[254] = true;
            return z;
        } else if (c != 3) {
            d[258] = true;
            return false;
        } else {
            if (i < parseInt) {
                d[255] = true;
                z = true;
            } else {
                d[256] = true;
            }
            d[257] = true;
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    @androidx.annotation.C0224v0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36134a(com.instabug.survey.models.C10083a r9) {
        /*
            r8 = this;
            boolean[] r0 = m46852d()
            java.lang.String r1 = r9.mo36207d()
            java.lang.String r1 = r8.m46845b(r1)
            r2 = 1
            r3 = 119(0x77, float:1.67E-43)
            r0[r3] = r2
            java.lang.String r3 = r8.f26803a
            java.lang.String r3 = r8.m46845b(r3)
            if (r1 == 0) goto L_0x00d8
            r4 = 120(0x78, float:1.68E-43)
            r5 = 0
            r0[r4] = r2     // Catch:{ NumberFormatException -> 0x00d3 }
            int r1 = com.instabug.library.util.StringUtility.compareVersion(r3, r1)     // Catch:{ NumberFormatException -> 0x00d3 }
            java.lang.String r9 = r9.mo36208e()
            int r3 = r9.hashCode()
            r4 = 3
            r6 = 2
            r7 = -1
            switch(r3) {
                case -1374681402: goto L_0x006e;
                case 96757556: goto L_0x005b;
                case 365984903: goto L_0x0048;
                case 1614662344: goto L_0x0035;
                default: goto L_0x0030;
            }
        L_0x0030:
            r9 = 122(0x7a, float:1.71E-43)
            r0[r9] = r2
            goto L_0x0081
        L_0x0035:
            java.lang.String r3 = "not_equal"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x0042
            r9 = 125(0x7d, float:1.75E-43)
            r0[r9] = r2
            goto L_0x0081
        L_0x0042:
            r9 = 126(0x7e, float:1.77E-43)
            r0[r9] = r2
            r9 = 1
            goto L_0x0082
        L_0x0048:
            java.lang.String r3 = "less_than"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x0055
            r9 = 129(0x81, float:1.81E-43)
            r0[r9] = r2
            goto L_0x0081
        L_0x0055:
            r9 = 130(0x82, float:1.82E-43)
            r0[r9] = r2
            r9 = 3
            goto L_0x0082
        L_0x005b:
            java.lang.String r3 = "equal"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x0068
            r9 = 123(0x7b, float:1.72E-43)
            r0[r9] = r2
            goto L_0x0081
        L_0x0068:
            r9 = 124(0x7c, float:1.74E-43)
            r0[r9] = r2
            r9 = 0
            goto L_0x0082
        L_0x006e:
            java.lang.String r3 = "greater_than"
            boolean r9 = r9.equals(r3)
            if (r9 != 0) goto L_0x007b
            r9 = 127(0x7f, float:1.78E-43)
            r0[r9] = r2
            goto L_0x0081
        L_0x007b:
            r9 = 128(0x80, float:1.794E-43)
            r0[r9] = r2
            r9 = 2
            goto L_0x0082
        L_0x0081:
            r9 = -1
        L_0x0082:
            if (r9 == 0) goto L_0x00c2
            if (r9 == r2) goto L_0x00b1
            if (r9 == r6) goto L_0x00a0
            if (r9 == r4) goto L_0x008f
            r9 = 143(0x8f, float:2.0E-43)
            r0[r9] = r2
            return r5
        L_0x008f:
            if (r1 != r7) goto L_0x0097
            r9 = 140(0x8c, float:1.96E-43)
            r0[r9] = r2
            r5 = 1
            goto L_0x009b
        L_0x0097:
            r9 = 141(0x8d, float:1.98E-43)
            r0[r9] = r2
        L_0x009b:
            r9 = 142(0x8e, float:1.99E-43)
            r0[r9] = r2
            return r5
        L_0x00a0:
            if (r1 != r2) goto L_0x00a8
            r9 = 137(0x89, float:1.92E-43)
            r0[r9] = r2
            r5 = 1
            goto L_0x00ac
        L_0x00a8:
            r9 = 138(0x8a, float:1.93E-43)
            r0[r9] = r2
        L_0x00ac:
            r9 = 139(0x8b, float:1.95E-43)
            r0[r9] = r2
            return r5
        L_0x00b1:
            if (r1 == 0) goto L_0x00b9
            r9 = 134(0x86, float:1.88E-43)
            r0[r9] = r2
            r5 = 1
            goto L_0x00bd
        L_0x00b9:
            r9 = 135(0x87, float:1.89E-43)
            r0[r9] = r2
        L_0x00bd:
            r9 = 136(0x88, float:1.9E-43)
            r0[r9] = r2
            return r5
        L_0x00c2:
            if (r1 != 0) goto L_0x00ca
            r9 = 131(0x83, float:1.84E-43)
            r0[r9] = r2
            r5 = 1
            goto L_0x00ce
        L_0x00ca:
            r9 = 132(0x84, float:1.85E-43)
            r0[r9] = r2
        L_0x00ce:
            r9 = 133(0x85, float:1.86E-43)
            r0[r9] = r2
            return r5
        L_0x00d3:
            r9 = 121(0x79, float:1.7E-43)
            r0[r9] = r2
            return r5
        L_0x00d8:
            java.lang.String r1 = r8.f26804b
            boolean r9 = r8.mo36137a(r9, r1)
            r1 = 144(0x90, float:2.02E-43)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.p398b.C10073g.mo36134a(com.instabug.survey.models.a):boolean");
    }

    /* renamed from: b */
    private boolean m46847b(C10083a aVar, long j) {
        boolean[] d = m46852d();
        boolean z = false;
        if (aVar.mo36207d() == null) {
            d[284] = true;
            return false;
        } else if (j == 0) {
            d[285] = true;
            return true;
        } else {
            int parseInt = Integer.parseInt(aVar.mo36207d());
            d[286] = true;
            int a = C10065a.m46825a(j);
            d[287] = true;
            String e = aVar.mo36208e();
            char c = 65535;
            switch (e.hashCode()) {
                case -1374681402:
                    if (e.equals("greater_than")) {
                        d[294] = true;
                        c = 2;
                        break;
                    } else {
                        d[293] = true;
                        break;
                    }
                case 96757556:
                    if (e.equals("equal")) {
                        d[290] = true;
                        c = 0;
                        break;
                    } else {
                        d[289] = true;
                        break;
                    }
                case 365984903:
                    if (e.equals("less_than")) {
                        d[296] = true;
                        c = 3;
                        break;
                    } else {
                        d[295] = true;
                        break;
                    }
                case 1614662344:
                    if (e.equals("not_equal")) {
                        d[292] = true;
                        c = 1;
                        break;
                    } else {
                        d[291] = true;
                        break;
                    }
                default:
                    d[288] = true;
                    break;
            }
            if (c == 0) {
                if (a == parseInt) {
                    d[297] = true;
                    z = true;
                } else {
                    d[298] = true;
                }
                d[299] = true;
                return z;
            } else if (c == 1) {
                if (a != parseInt) {
                    d[300] = true;
                    z = true;
                } else {
                    d[301] = true;
                }
                d[302] = true;
                return z;
            } else if (c == 2) {
                if (a > parseInt) {
                    d[303] = true;
                    z = true;
                } else {
                    d[304] = true;
                }
                d[305] = true;
                return z;
            } else if (c != 3) {
                d[309] = true;
                return false;
            } else {
                if (a < parseInt) {
                    d[306] = true;
                    z = true;
                } else {
                    d[307] = true;
                }
                d[308] = true;
                return z;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo36136a(C10083a aVar, Long l) throws ParseException {
        boolean[] d = m46852d();
        boolean b = m46847b(aVar, l.longValue());
        d[154] = true;
        return b;
    }

    /* renamed from: a */
    private boolean m46844a(C10083a aVar, int i) {
        boolean[] d = m46852d();
        boolean c = m46850c(aVar, i);
        d[155] = true;
        return c;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo36139a(ArrayList<C10083a> arrayList, String str) {
        boolean z;
        boolean[] d = m46852d();
        String str2 = "and";
        boolean equals = str.equals(str2);
        d[157] = true;
        d[158] = true;
        boolean z2 = equals;
        int i = 0;
        while (i < arrayList.size()) {
            d[159] = true;
            boolean d2 = mo36146d((C10083a) arrayList.get(i));
            if (i == 0) {
                d[160] = true;
                z2 = d2;
            } else {
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        d[161] = true;
                    } else if (!str.equals(str2)) {
                        d[162] = true;
                    } else {
                        d[163] = true;
                        c = 0;
                    }
                } else if (!str.equals("or")) {
                    d[164] = true;
                } else {
                    d[165] = true;
                    c = 1;
                }
                if (c == 0) {
                    z = z2 & d2;
                    d[166] = true;
                } else if (c != 1) {
                    z = z2 & d2;
                    d[168] = true;
                } else {
                    z = z2 | d2;
                    d[167] = true;
                }
                z2 = z & d2;
                d[169] = true;
            }
            i++;
            d[170] = true;
        }
        d[171] = true;
        return z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo36131a(String str) {
        String str2 = "METHOD NOT FOUND !";
        Class<C10073g> cls = C10073g.class;
        boolean[] d = m46852d();
        Class<InstabugUserEventLogger> cls2 = InstabugUserEventLogger.class;
        try {
            Class[] clsArr = {String.class};
            d[199] = true;
            Method declaredMethod = cls2.getDeclaredMethod("getLoggingEventCount", clsArr);
            d[200] = true;
            declaredMethod.setAccessible(true);
            d[201] = true;
            int intValue = ((Integer) declaredMethod.invoke(InstabugUserEventLogger.getInstance(), new Object[]{str})).intValue();
            d[202] = true;
            return intValue;
        } catch (NoSuchMethodException e) {
            d[203] = true;
            InstabugSDKLogger.m46623e(cls, str2);
            d[204] = true;
            e.printStackTrace();
            d[205] = true;
            d[212] = true;
            return 0;
        } catch (IllegalAccessException e2) {
            d[206] = true;
            InstabugSDKLogger.m46623e(cls, str2);
            d[207] = true;
            e2.printStackTrace();
            d[208] = true;
            d[212] = true;
            return 0;
        } catch (InvocationTargetException e3) {
            d[209] = true;
            InstabugSDKLogger.m46623e(cls, str2);
            d[210] = true;
            e3.printStackTrace();
            d[211] = true;
            d[212] = true;
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo36137a(C10083a aVar, String str) {
        boolean[] d = m46852d();
        boolean z = false;
        if (aVar.mo36207d() == null) {
            d[213] = true;
        } else if (str == null) {
            d[214] = true;
        } else {
            String d2 = aVar.mo36207d();
            d[216] = true;
            String e = aVar.mo36208e();
            char c = 65535;
            switch (e.hashCode()) {
                case -630852760:
                    if (e.equals("not_contain")) {
                        d[225] = true;
                        c = 3;
                        break;
                    } else {
                        d[224] = true;
                        break;
                    }
                case 96757556:
                    if (e.equals("equal")) {
                        d[219] = true;
                        c = 0;
                        break;
                    } else {
                        d[218] = true;
                        break;
                    }
                case 951526612:
                    if (e.equals("contain")) {
                        d[223] = true;
                        c = 2;
                        break;
                    } else {
                        d[222] = true;
                        break;
                    }
                case 1614662344:
                    if (e.equals("not_equal")) {
                        d[221] = true;
                        c = 1;
                        break;
                    } else {
                        d[220] = true;
                        break;
                    }
                default:
                    d[217] = true;
                    break;
            }
            if (c == 0) {
                boolean equals = str.equals(d2);
                d[226] = true;
                return equals;
            } else if (c == 1) {
                if (!str.equals(d2)) {
                    d[227] = true;
                    z = true;
                } else {
                    d[228] = true;
                }
                d[229] = true;
                return z;
            } else if (c == 2) {
                boolean contains = str.contains(d2);
                d[230] = true;
                return contains;
            } else if (c != 3) {
                d[234] = true;
                return false;
            } else {
                if (!str.contains(d2)) {
                    d[231] = true;
                    z = true;
                } else {
                    d[232] = true;
                }
                d[233] = true;
                return z;
            }
        }
        d[215] = true;
        return false;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo36138a(C10083a aVar, Date date) throws ParseException {
        boolean[] d = m46852d();
        boolean z = false;
        if (aVar.mo36207d() == null) {
            d[259] = true;
        } else if (date == null) {
            d[260] = true;
        } else {
            d[262] = true;
            Date date2 = InstabugDateFormatter.getDate(aVar.mo36207d());
            d[263] = true;
            Date standardizedDate = InstabugDateFormatter.getStandardizedDate(date2);
            d[264] = true;
            Date standardizedDate2 = InstabugDateFormatter.getStandardizedDate(date);
            d[265] = true;
            String e = aVar.mo36208e();
            char c = 65535;
            switch (e.hashCode()) {
                case -1374681402:
                    if (e.equals("greater_than")) {
                        d[272] = true;
                        c = 2;
                        break;
                    } else {
                        d[271] = true;
                        break;
                    }
                case 96757556:
                    if (e.equals("equal")) {
                        d[268] = true;
                        c = 0;
                        break;
                    } else {
                        d[267] = true;
                        break;
                    }
                case 365984903:
                    if (e.equals("less_than")) {
                        d[274] = true;
                        c = 3;
                        break;
                    } else {
                        d[273] = true;
                        break;
                    }
                case 1614662344:
                    if (e.equals("not_equal")) {
                        d[270] = true;
                        c = 1;
                        break;
                    } else {
                        d[269] = true;
                        break;
                    }
                default:
                    d[266] = true;
                    break;
            }
            if (c == 0) {
                if (standardizedDate2.getDate() == standardizedDate.getDate()) {
                    d[275] = true;
                    z = true;
                } else {
                    d[276] = true;
                }
                d[277] = true;
                return z;
            } else if (c == 1) {
                if (standardizedDate2.getDate() != standardizedDate.getDate()) {
                    d[278] = true;
                    z = true;
                } else {
                    d[279] = true;
                }
                d[280] = true;
                return z;
            } else if (c == 2) {
                boolean after = standardizedDate2.after(standardizedDate);
                d[281] = true;
                return after;
            } else if (c != 3) {
                d[283] = true;
                return false;
            } else {
                boolean before = standardizedDate2.before(standardizedDate);
                d[282] = true;
                return before;
            }
        }
        d[261] = true;
        return false;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public int mo36130a(long j, long j2) {
        int convert = (int) TimeUnit.DAYS.convert(j2 - j, TimeUnit.MILLISECONDS);
        m46852d()[359] = true;
        return convert;
    }
}
