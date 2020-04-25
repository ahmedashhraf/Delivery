package com.instabug.survey.models;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.models.C10084b.C10085a;
import com.instabug.survey.models.C10086c.C10087a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Survey implements Cacheable, Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String HAS_RESPOND = "has_respond";
    private static final String KEY_ANSWERED = "answered";
    private static final String KEY_CONDITIONS_OPERATOR = "operator";
    private static final String KEY_CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String KEY_DISMISSED_AT = "dismissed_at";
    private static final String KEY_ID = "id";
    private static final String KEY_IS_CANCELLED = "is_cancelled";
    private static final String KEY_PAUSED = "paused";
    private static final String KEY_PUBLISHED = "published";
    private static final String KEY_QUESTIONS = "questions";
    @Deprecated
    private static final String KEY_QUESTION_DEPRECATED = "question";
    private static final String KEY_SESSION_COUNTER = "session_counter";
    private static final String KEY_SHOULD_SHOW_AGAIN = "should_show_again";
    @Deprecated
    private static final String KEY_SUBMITTED = "submitted";
    private static final String KEY_SURVEY_EVENTS = "events";
    private static final String KEY_SURVEY_STATE = "survey_state";
    private static final String KEY_TARGET = "target";
    private static final String KEY_TARGET_AUDIENCE = "primitive_types";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TOKEN = "token";
    private static final String KEY_USER_EVENTS = "user_events";
    private static final String KEY_WELCOME_SCREEN = "welcome_screen";
    private boolean answered;
    private int attemptCount = -1;
    private String conditionsOperator;
    private ArrayList<C10083a> customAttributes;
    private long dismissedAt;
    private int eventIndex = -1;

    /* renamed from: id */
    private long f26817id;
    private boolean isCancelled;
    private boolean paused = false;
    private ArrayList<C10084b> questions;
    private int sessionCounter = 0;
    private boolean shouldShowAgain = true;
    private ArrayList<C10086c> surveyEvents;
    private SurveyState surveyState;
    private ArrayList<C10083a> targetAudiences;
    private String title;
    private String token;
    private ArrayList<C10083a> userEvents;

    public enum SurveyState {
        READY_TO_SEND,
        NOT_AVAILABLE,
        SYNCED;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[3] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4547075143898325898L, "com/instabug/survey/models/Survey", 280);
        $jacocoData = a;
        return a;
    }

    public Survey() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[12] = true;
        this.targetAudiences = new ArrayList<>();
        $jacocoInit[13] = true;
        this.customAttributes = new ArrayList<>();
        $jacocoInit[14] = true;
        this.surveyEvents = new ArrayList<>();
        this.answered = false;
        this.isCancelled = false;
        this.conditionsOperator = "and";
        this.surveyState = SurveyState.NOT_AVAILABLE;
        $jacocoInit[15] = true;
    }

    public static List<Survey> fromJson(JSONObject jSONObject) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_PUBLISHED);
        $jacocoInit[16] = true;
        ArrayList arrayList = new ArrayList();
        $jacocoInit[17] = true;
        $jacocoInit[18] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            $jacocoInit[19] = true;
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            $jacocoInit[20] = true;
            Survey survey = new Survey();
            $jacocoInit[21] = true;
            survey.fromJson(jSONObject2.toString());
            $jacocoInit[22] = true;
            arrayList.add(survey);
            i++;
            $jacocoInit[23] = true;
        }
        $jacocoInit[24] = true;
        return arrayList;
    }

    private int getAttempt() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.attemptCount;
        this.attemptCount = i + 1;
        $jacocoInit[114] = true;
        return i;
    }

    private int getEventIndex() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.eventIndex;
        $jacocoInit[115] = true;
        return i;
    }

    public static List<Survey> getPausedSurveysFromJson(JSONObject jSONObject) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_PAUSED);
        $jacocoInit[2] = true;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        $jacocoInit[3] = true;
        $jacocoInit[4] = true;
        int i = 0;
        while (i < jSONArray.length()) {
            $jacocoInit[5] = true;
            Survey survey = new Survey();
            $jacocoInit[6] = true;
            survey.setId(jSONArray.getLong(i));
            $jacocoInit[7] = true;
            survey.setPaused(true);
            $jacocoInit[8] = true;
            arrayList.add(survey);
            i++;
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
        return arrayList;
    }

    private boolean hasNPSSubmitted() {
        boolean[] $jacocoInit = $jacocoInit();
        if (getSurveyEvents() == null) {
            $jacocoInit[89] = true;
        } else {
            $jacocoInit[90] = true;
            Iterator it = getSurveyEvents().iterator();
            $jacocoInit[91] = true;
            while (it.hasNext()) {
                C10086c cVar = (C10086c) it.next();
                $jacocoInit[93] = true;
                if (cVar.mo36221a() == C10087a.SUBMIT) {
                    $jacocoInit[94] = true;
                    return true;
                }
                $jacocoInit[95] = true;
            }
            $jacocoInit[92] = true;
        }
        $jacocoInit[96] = true;
        return false;
    }

    private void setSessionCounter(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.sessionCounter = i;
        $jacocoInit[133] = true;
    }

    public void addShowEvent() {
        boolean[] $jacocoInit = $jacocoInit();
        C10087a aVar = C10087a.SHOW;
        $jacocoInit[111] = true;
        C10086c cVar = new C10086c(aVar, System.currentTimeMillis() / 1000, incrementEventIndex());
        $jacocoInit[112] = true;
        getSurveyEvents().add(cVar);
        $jacocoInit[113] = true;
    }

    public void clearAnswers() {
        boolean[] $jacocoInit = $jacocoInit();
        Iterator it = this.questions.iterator();
        $jacocoInit[261] = true;
        while (it.hasNext()) {
            C10084b bVar = (C10084b) it.next();
            $jacocoInit[262] = true;
            bVar.mo36214c(null);
            $jacocoInit[263] = true;
        }
        $jacocoInit[264] = true;
    }

    public boolean equals(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (obj == null) {
            $jacocoInit[254] = true;
        } else if (!(obj instanceof Survey)) {
            $jacocoInit[255] = true;
        } else {
            Survey survey = (Survey) obj;
            $jacocoInit[256] = true;
            if (survey.getId() == getId()) {
                $jacocoInit[257] = true;
                z = true;
            } else {
                $jacocoInit[258] = true;
            }
            $jacocoInit[259] = true;
            return z;
        }
        $jacocoInit[260] = true;
        return false;
    }

    public String getConditionsOperator() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.conditionsOperator;
        $jacocoInit[37] = true;
        return str;
    }

    public ArrayList<C10083a> getCustomAttributes() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10083a> arrayList = this.customAttributes;
        $jacocoInit[33] = true;
        return arrayList;
    }

    public long getDismissedAt() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.dismissedAt;
        $jacocoInit[124] = true;
        return j;
    }

    public long getId() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.f26817id;
        $jacocoInit[25] = true;
        return j;
    }

    public ArrayList<C10084b> getQuestions() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10084b> arrayList = this.questions;
        $jacocoInit[29] = true;
        return arrayList;
    }

    public long getRespondedAt() {
        boolean[] $jacocoInit = $jacocoInit();
        if (isLastEventDismiss()) {
            $jacocoInit[143] = true;
            return 0;
        }
        if (getSurveyEvents() == null) {
            $jacocoInit[144] = true;
        } else if (getSurveyEvents().size() <= 0) {
            $jacocoInit[145] = true;
        } else {
            $jacocoInit[146] = true;
            Iterator it = getSurveyEvents().iterator();
            $jacocoInit[147] = true;
            while (it.hasNext()) {
                C10086c cVar = (C10086c) it.next();
                $jacocoInit[149] = true;
                if (cVar.mo36221a() == C10087a.SUBMIT) {
                    $jacocoInit[150] = true;
                    long d = cVar.mo36225d();
                    $jacocoInit[151] = true;
                    return d;
                }
                $jacocoInit[152] = true;
            }
            $jacocoInit[148] = true;
        }
        if (getQuestions() == null) {
            $jacocoInit[153] = true;
        } else if (getQuestions().size() <= 0) {
            $jacocoInit[154] = true;
        } else {
            $jacocoInit[155] = true;
            int size = getQuestions().size() - 1;
            $jacocoInit[156] = true;
            while (size >= 0) {
                $jacocoInit[158] = true;
                if (((C10084b) getQuestions().get(size)).mo36219h() > 0) {
                    $jacocoInit[159] = true;
                    long h = ((C10084b) getQuestions().get(size)).mo36219h();
                    $jacocoInit[160] = true;
                    return h;
                }
                size--;
                $jacocoInit[161] = true;
            }
            $jacocoInit[157] = true;
        }
        $jacocoInit[162] = true;
        return 0;
    }

    public int getSessionCounter() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.sessionCounter;
        $jacocoInit[134] = true;
        return i;
    }

    public ArrayList<C10086c> getSurveyEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10086c> arrayList = this.surveyEvents;
        $jacocoInit[129] = true;
        return arrayList;
    }

    public SurveyState getSurveyState() {
        boolean[] $jacocoInit = $jacocoInit();
        SurveyState surveyState2 = this.surveyState;
        $jacocoInit[131] = true;
        return surveyState2;
    }

    public ArrayList<C10083a> getTargetAudiences() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10083a> arrayList = this.targetAudiences;
        $jacocoInit[31] = true;
        return arrayList;
    }

    public String getTitle() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.title;
        $jacocoInit[27] = true;
        return str;
    }

    public String getToken() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.token;
        $jacocoInit[126] = true;
        return str;
    }

    public ArrayList<C10083a> getUserEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10083a> arrayList = this.userEvents;
        $jacocoInit[35] = true;
        return arrayList;
    }

    public boolean hasPositiveNpsAnswer() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (!isNPSSurvey()) {
            $jacocoInit[79] = true;
        } else if (((C10084b) getQuestions().get(0)).mo36218g() == null) {
            $jacocoInit[80] = true;
        } else {
            $jacocoInit[81] = true;
            if (((C10084b) getQuestions().get(0)).mo36218g().equals("9")) {
                $jacocoInit[82] = true;
            } else {
                $jacocoInit[83] = true;
                if (!((C10084b) getQuestions().get(0)).mo36218g().equals("10")) {
                    $jacocoInit[84] = true;
                } else {
                    $jacocoInit[85] = true;
                }
            }
            $jacocoInit[86] = true;
            z = true;
            $jacocoInit[88] = true;
            return z;
        }
        $jacocoInit[87] = true;
        $jacocoInit[88] = true;
        return z;
    }

    public int hashCode() {
        boolean[] $jacocoInit = $jacocoInit();
        int hashCode = String.valueOf(getId()).hashCode();
        $jacocoInit[279] = true;
        return hashCode;
    }

    public int incrementEventIndex() {
        boolean[] $jacocoInit = $jacocoInit();
        this.attemptCount++;
        int i = this.eventIndex + 1;
        this.eventIndex = i;
        $jacocoInit[11] = true;
        return i;
    }

    public void incrementSessionCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.sessionCounter + 1;
        this.sessionCounter = i;
        setSessionCounter(i);
        $jacocoInit[135] = true;
    }

    public boolean isAnswered() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.answered;
        $jacocoInit[39] = true;
        return z;
    }

    public boolean isCancelled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isCancelled;
        $jacocoInit[128] = true;
        return z;
    }

    public boolean isLastEventDismiss() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10086c> arrayList = this.surveyEvents;
        if (arrayList == null) {
            $jacocoInit[265] = true;
        } else if (arrayList.size() <= 0) {
            $jacocoInit[266] = true;
        } else {
            ArrayList<C10086c> arrayList2 = this.surveyEvents;
            $jacocoInit[267] = true;
            if (((C10086c) arrayList2.get(arrayList2.size() - 1)).f26831a != C10087a.DISMISS) {
                $jacocoInit[268] = true;
            } else {
                $jacocoInit[269] = true;
                z = true;
                $jacocoInit[271] = true;
                return z;
            }
        }
        z = false;
        $jacocoInit[270] = true;
        $jacocoInit[271] = true;
        return z;
    }

    public boolean isLastEventSubmit() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10086c> arrayList = this.surveyEvents;
        if (arrayList == null) {
            $jacocoInit[272] = true;
        } else if (arrayList.size() <= 0) {
            $jacocoInit[273] = true;
        } else {
            ArrayList<C10086c> arrayList2 = this.surveyEvents;
            $jacocoInit[274] = true;
            if (((C10086c) arrayList2.get(arrayList2.size() - 1)).f26831a != C10087a.SUBMIT) {
                $jacocoInit[275] = true;
            } else {
                $jacocoInit[276] = true;
                z = true;
                $jacocoInit[278] = true;
                return z;
            }
        }
        z = false;
        $jacocoInit[277] = true;
        $jacocoInit[278] = true;
        return z;
    }

    public boolean isLifeVersion() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<C10084b> arrayList = this.questions;
        if (arrayList == null) {
            $jacocoInit[67] = true;
        } else if (arrayList.size() != 3) {
            $jacocoInit[68] = true;
        } else {
            $jacocoInit[69] = true;
            z = true;
            $jacocoInit[71] = true;
            return z;
        }
        z = false;
        $jacocoInit[70] = true;
        $jacocoInit[71] = true;
        return z;
    }

    public boolean isNPSSurvey() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (getQuestions() == null) {
            $jacocoInit[72] = true;
        } else if (getQuestions().size() <= 0) {
            $jacocoInit[73] = true;
        } else {
            $jacocoInit[74] = true;
            if (((C10084b) getQuestions().get(0)).mo36216e() != C10085a.NPS) {
                $jacocoInit[75] = true;
            } else {
                $jacocoInit[76] = true;
                z = true;
                $jacocoInit[78] = true;
                return z;
            }
        }
        $jacocoInit[77] = true;
        $jacocoInit[78] = true;
        return z;
    }

    public boolean isOptInSurvey() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (getToken() == null) {
            $jacocoInit[138] = true;
        } else if (String.valueOf(getToken()).equals("null")) {
            $jacocoInit[139] = true;
        } else {
            $jacocoInit[140] = true;
            z = true;
            $jacocoInit[142] = true;
            return z;
        }
        z = false;
        $jacocoInit[141] = true;
        $jacocoInit[142] = true;
        return z;
    }

    public boolean isPaused() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.paused;
        $jacocoInit[0] = true;
        return z;
    }

    public boolean isPromoter() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (((C10084b) this.questions.get(0)).mo36218g() == null) {
            $jacocoInit[116] = true;
        } else {
            ArrayList<C10084b> arrayList = this.questions;
            $jacocoInit[117] = true;
            if (((C10084b) arrayList.get(0)).mo36218g().equals("9")) {
                $jacocoInit[118] = true;
            } else if (!((C10084b) this.questions.get(0)).mo36218g().equals("10")) {
                $jacocoInit[119] = true;
            } else {
                $jacocoInit[120] = true;
            }
            $jacocoInit[121] = true;
            z = true;
            $jacocoInit[123] = true;
            return z;
        }
        $jacocoInit[122] = true;
        $jacocoInit[123] = true;
        return z;
    }

    public void resetSessionsCounter() {
        boolean[] $jacocoInit = $jacocoInit();
        this.sessionCounter = 0;
        $jacocoInit[136] = true;
    }

    public void setAnswered(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.answered = z;
        $jacocoInit[40] = true;
    }

    public void setCancelled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isCancelled = z;
        $jacocoInit[127] = true;
    }

    public void setConditionsOperator(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.conditionsOperator = str;
        $jacocoInit[38] = true;
    }

    public void setCustomAttributes(ArrayList<C10083a> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.customAttributes = arrayList;
        $jacocoInit[34] = true;
    }

    public void setDismissed() {
        boolean[] $jacocoInit = $jacocoInit();
        setSurveyState(SurveyState.READY_TO_SEND);
        $jacocoInit[97] = true;
        if (!isNPSSurvey()) {
            $jacocoInit[98] = true;
        } else if (!hasPositiveNpsAnswer()) {
            $jacocoInit[99] = true;
        } else if (!hasNPSSubmitted()) {
            $jacocoInit[100] = true;
        } else {
            $jacocoInit[101] = true;
            return;
        }
        this.dismissedAt = System.currentTimeMillis() / 1000;
        $jacocoInit[102] = true;
        setCancelled(true);
        $jacocoInit[103] = true;
        if (getSurveyEvents().size() <= 0) {
            $jacocoInit[104] = true;
        } else {
            $jacocoInit[105] = true;
            if (((C10086c) getSurveyEvents().get(getSurveyEvents().size() - 1)).f26831a != C10087a.DISMISS) {
                $jacocoInit[106] = true;
            } else {
                $jacocoInit[107] = true;
                return;
            }
        }
        C10087a aVar = C10087a.DISMISS;
        long j = this.dismissedAt;
        $jacocoInit[108] = true;
        C10086c cVar = new C10086c(aVar, j, getEventIndex());
        $jacocoInit[109] = true;
        getSurveyEvents().add(cVar);
        $jacocoInit[110] = true;
    }

    public void setDismissedAt(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.dismissedAt = j;
        $jacocoInit[137] = true;
    }

    public Survey setId(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.f26817id = j;
        $jacocoInit[26] = true;
        return this;
    }

    public void setPaused(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.paused = z;
        $jacocoInit[1] = true;
    }

    public void setQuestions(ArrayList<C10084b> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.questions = arrayList;
        $jacocoInit[30] = true;
    }

    public void setShouldShowAgain(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shouldShowAgain = z;
        $jacocoInit[42] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSubmitted() {
        /*
            r9 = this;
            boolean[] r0 = $jacocoInit()
            r1 = 0
            r9.setCancelled(r1)
            r2 = 1
            r3 = 43
            r0[r3] = r2
            r9.setAnswered(r2)
            r3 = 44
            r0[r3] = r2
            boolean r3 = r9.isOptInSurvey()
            if (r3 == 0) goto L_0x0026
            r3 = 45
            r0[r3] = r2
            r9.setShouldShowAgain(r2)
            r3 = 46
            r0[r3] = r2
            goto L_0x002d
        L_0x0026:
            r9.setShouldShowAgain(r1)
            r3 = 47
            r0[r3] = r2
        L_0x002d:
            boolean r3 = r9.isNPSSurvey()
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r3 != 0) goto L_0x003a
            r3 = 48
            r0[r3] = r2
            goto L_0x0069
        L_0x003a:
            boolean r3 = r9.isAnswered()
            if (r3 != 0) goto L_0x0045
            r3 = 49
            r0[r3] = r2
            goto L_0x0069
        L_0x0045:
            boolean r3 = r9.hasNPSSubmitted()
            if (r3 != 0) goto L_0x0050
            r3 = 50
            r0[r3] = r2
            goto L_0x0069
        L_0x0050:
            boolean r3 = r9.hasPositiveNpsAnswer()
            if (r3 != 0) goto L_0x005b
            r3 = 51
            r0[r3] = r2
            goto L_0x0069
        L_0x005b:
            r3 = 52
            r0[r3] = r2
            boolean r3 = r9.isLifeVersion()
            if (r3 != 0) goto L_0x0093
            r3 = 53
            r0[r3] = r2
        L_0x0069:
            com.instabug.survey.models.c r3 = new com.instabug.survey.models.c
            com.instabug.survey.models.c$a r6 = com.instabug.survey.models.C10086c.C10087a.SUBMIT
            r7 = 56
            r0[r7] = r2
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 / r4
            int r4 = r9.getEventIndex()
            r3.<init>(r6, r7, r4)
            r4 = 57
            r0[r4] = r2
            boolean r4 = r9.isOptInSurvey()
            if (r4 != 0) goto L_0x008c
            r1 = 58
            r0[r1] = r2
            goto L_0x00ab
        L_0x008c:
            r9.attemptCount = r1
            r1 = 59
            r0[r1] = r2
            goto L_0x00ab
        L_0x0093:
            com.instabug.survey.models.c r3 = new com.instabug.survey.models.c
            com.instabug.survey.models.c$a r1 = com.instabug.survey.models.C10086c.C10087a.RATE
            r6 = 54
            r0[r6] = r2
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 / r4
            int r4 = r9.getEventIndex()
            r3.<init>(r1, r6, r4)
            r1 = 55
            r0[r1] = r2
        L_0x00ab:
            com.instabug.survey.models.Survey$SurveyState r1 = com.instabug.survey.models.Survey.SurveyState.READY_TO_SEND
            r9.setSurveyState(r1)
            r1 = 60
            r0[r1] = r2
            java.util.ArrayList r1 = r9.getSurveyEvents()
            int r1 = r1.size()
            if (r1 > 0) goto L_0x00c3
            r1 = 61
            r0[r1] = r2
            goto L_0x00ed
        L_0x00c3:
            r1 = 62
            r0[r1] = r2
            java.util.ArrayList r1 = r9.getSurveyEvents()
            java.util.ArrayList r4 = r9.getSurveyEvents()
            int r4 = r4.size()
            int r4 = r4 - r2
            java.lang.Object r1 = r1.get(r4)
            com.instabug.survey.models.c r1 = (com.instabug.survey.models.C10086c) r1
            com.instabug.survey.models.c$a r1 = r1.f26831a
            com.instabug.survey.models.c$a r4 = com.instabug.survey.models.C10086c.C10087a.SUBMIT
            if (r1 == r4) goto L_0x00e5
            r1 = 63
            r0[r1] = r2
            goto L_0x00ed
        L_0x00e5:
            com.instabug.survey.models.c$a r1 = r3.f26831a
            if (r1 == r4) goto L_0x00f9
            r1 = 64
            r0[r1] = r2
        L_0x00ed:
            java.util.ArrayList r1 = r9.getSurveyEvents()
            r1.add(r3)
            r1 = 66
            r0[r1] = r2
            return
        L_0x00f9:
            r1 = 65
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.models.Survey.setSubmitted():void");
    }

    public void setSurveyEvents(ArrayList<C10086c> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.surveyEvents = arrayList;
        $jacocoInit[130] = true;
    }

    public void setSurveyState(SurveyState surveyState2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.surveyState = surveyState2;
        $jacocoInit[132] = true;
    }

    public void setTargetAudiences(ArrayList<C10083a> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.targetAudiences = arrayList;
        $jacocoInit[32] = true;
    }

    public void setTitle(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.title = str;
        $jacocoInit[28] = true;
    }

    public void setToken(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.token = str;
        $jacocoInit[125] = true;
    }

    public void setUserEvents(ArrayList<C10083a> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userEvents = arrayList;
        $jacocoInit[36] = true;
    }

    public boolean shouldShowAgain() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.shouldShowAgain;
        $jacocoInit[41] = true;
        return z;
    }

    public String toJson() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[163] = true;
        JSONObject put = jSONObject.put("id", this.f26817id);
        String str = this.title;
        $jacocoInit[164] = true;
        JSONObject put2 = put.put("title", str);
        String str2 = this.token;
        $jacocoInit[165] = true;
        JSONObject put3 = put2.put("token", str2);
        ArrayList<C10084b> arrayList = this.questions;
        $jacocoInit[166] = true;
        JSONObject put4 = put3.put(KEY_QUESTIONS, C10084b.m46906b(arrayList));
        JSONObject jSONObject2 = new JSONObject();
        ArrayList<C10083a> arrayList2 = this.targetAudiences;
        $jacocoInit[167] = true;
        JSONObject put5 = jSONObject2.put(KEY_TARGET_AUDIENCE, C10083a.m46897a(arrayList2));
        ArrayList<C10083a> arrayList3 = this.customAttributes;
        $jacocoInit[168] = true;
        JSONObject put6 = put5.put(KEY_CUSTOM_ATTRIBUTES, C10083a.m46897a(arrayList3));
        ArrayList<C10083a> arrayList4 = this.userEvents;
        $jacocoInit[169] = true;
        JSONObject put7 = put6.put("user_events", C10083a.m46897a(arrayList4));
        String str3 = this.conditionsOperator;
        $jacocoInit[170] = true;
        JSONObject put8 = put7.put(KEY_CONDITIONS_OPERATOR, str3);
        $jacocoInit[171] = true;
        JSONObject put9 = put4.put(KEY_TARGET, put8);
        ArrayList<C10086c> arrayList5 = this.surveyEvents;
        $jacocoInit[172] = true;
        JSONObject put10 = put9.put(KEY_SURVEY_EVENTS, C10086c.m46923a(arrayList5));
        boolean z = this.answered;
        $jacocoInit[173] = true;
        JSONObject put11 = put10.put(KEY_ANSWERED, z);
        $jacocoInit[174] = true;
        JSONObject put12 = put11.put(KEY_DISMISSED_AT, getDismissedAt());
        boolean z2 = this.isCancelled;
        $jacocoInit[175] = true;
        JSONObject put13 = put12.put(KEY_IS_CANCELLED, z2);
        $jacocoInit[176] = true;
        JSONObject put14 = put13.put(KEY_SURVEY_STATE, getSurveyState().toString());
        $jacocoInit[177] = true;
        JSONObject put15 = put14.put(KEY_SHOULD_SHOW_AGAIN, shouldShowAgain());
        $jacocoInit[178] = true;
        put15.put(KEY_SESSION_COUNTER, getSessionCounter());
        $jacocoInit[179] = true;
        String jSONObject3 = jSONObject.toString();
        $jacocoInit[180] = true;
        return jSONObject3;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject(str);
        $jacocoInit[181] = true;
        String str2 = "id";
        if (!jSONObject.has(str2)) {
            $jacocoInit[182] = true;
        } else {
            $jacocoInit[183] = true;
            setId(jSONObject.getLong(str2));
            $jacocoInit[184] = true;
        }
        String str3 = "title";
        if (!jSONObject.has(str3)) {
            $jacocoInit[185] = true;
        } else {
            $jacocoInit[186] = true;
            setTitle(jSONObject.getString(str3));
            $jacocoInit[187] = true;
        }
        String str4 = "token";
        if (!jSONObject.has(str4)) {
            $jacocoInit[188] = true;
        } else {
            $jacocoInit[189] = true;
            setToken(jSONObject.getString(str4));
            $jacocoInit[190] = true;
        }
        String str5 = KEY_SURVEY_EVENTS;
        if (!jSONObject.has(str5)) {
            $jacocoInit[191] = true;
        } else {
            $jacocoInit[192] = true;
            setSurveyEvents(C10086c.m46922a(jSONObject.getJSONArray(str5)));
            $jacocoInit[193] = true;
        }
        String str6 = KEY_QUESTIONS;
        if (jSONObject.has(str6)) {
            $jacocoInit[194] = true;
            setQuestions(C10084b.m46905a(jSONObject.getJSONArray(str6)));
            $jacocoInit[195] = true;
        } else {
            String str7 = KEY_QUESTION_DEPRECATED;
            if (!jSONObject.has(str7)) {
                $jacocoInit[196] = true;
            } else {
                $jacocoInit[197] = true;
                InstabugSDKLogger.m46622d(this, "Migrating old surveys");
                $jacocoInit[198] = true;
                C10084b bVar = new C10084b();
                $jacocoInit[199] = true;
                bVar.mo36210a(getId());
                $jacocoInit[200] = true;
                bVar.fromJson(jSONObject.get(str7).toString());
                $jacocoInit[201] = true;
                ArrayList arrayList = new ArrayList();
                $jacocoInit[202] = true;
                arrayList.add(bVar);
                $jacocoInit[203] = true;
                setQuestions(arrayList);
                $jacocoInit[204] = true;
            }
        }
        String str8 = KEY_TARGET;
        if (!jSONObject.has(str8)) {
            $jacocoInit[205] = true;
        } else {
            $jacocoInit[206] = true;
            JSONObject jSONObject2 = jSONObject.getJSONObject(str8);
            $jacocoInit[207] = true;
            String str9 = KEY_TARGET_AUDIENCE;
            if (!jSONObject2.has(str9)) {
                $jacocoInit[208] = true;
            } else {
                $jacocoInit[209] = true;
                JSONArray jSONArray = jSONObject2.getJSONArray(str9);
                $jacocoInit[210] = true;
                setTargetAudiences(C10083a.m46896a(jSONArray));
                $jacocoInit[211] = true;
            }
            String str10 = KEY_CUSTOM_ATTRIBUTES;
            if (!jSONObject2.has(str10)) {
                $jacocoInit[212] = true;
            } else {
                $jacocoInit[213] = true;
                JSONArray jSONArray2 = jSONObject2.getJSONArray(str10);
                $jacocoInit[214] = true;
                setCustomAttributes(C10083a.m46896a(jSONArray2));
                $jacocoInit[215] = true;
            }
            String str11 = "user_events";
            if (!jSONObject2.has(str11)) {
                $jacocoInit[216] = true;
            } else {
                $jacocoInit[217] = true;
                JSONArray jSONArray3 = jSONObject2.getJSONArray(str11);
                $jacocoInit[218] = true;
                setUserEvents(C10083a.m46896a(jSONArray3));
                $jacocoInit[219] = true;
            }
            String str12 = KEY_CONDITIONS_OPERATOR;
            if (!jSONObject2.has(str12)) {
                $jacocoInit[220] = true;
            } else {
                $jacocoInit[221] = true;
                setConditionsOperator(jSONObject2.getString(str12));
                $jacocoInit[222] = true;
            }
        }
        String str13 = KEY_ANSWERED;
        if (!jSONObject.has(str13)) {
            $jacocoInit[223] = true;
        } else {
            $jacocoInit[224] = true;
            setAnswered(jSONObject.getBoolean(str13));
            $jacocoInit[225] = true;
        }
        String str14 = KEY_SUBMITTED;
        if (!jSONObject.has(str14)) {
            $jacocoInit[226] = true;
        } else {
            $jacocoInit[227] = true;
            boolean z = jSONObject.getBoolean(str14);
            $jacocoInit[228] = true;
            if (!isAnswered()) {
                $jacocoInit[229] = true;
            } else if (z) {
                $jacocoInit[230] = true;
            } else {
                $jacocoInit[231] = true;
                setSurveyState(SurveyState.READY_TO_SEND);
                $jacocoInit[232] = true;
            }
            if (!isAnswered()) {
                $jacocoInit[233] = true;
            } else if (!z) {
                $jacocoInit[234] = true;
            } else {
                $jacocoInit[235] = true;
                setSurveyState(SurveyState.SYNCED);
                $jacocoInit[236] = true;
            }
            setSurveyState(SurveyState.NOT_AVAILABLE);
            $jacocoInit[237] = true;
        }
        String str15 = KEY_IS_CANCELLED;
        if (!jSONObject.has(str15)) {
            $jacocoInit[238] = true;
        } else {
            $jacocoInit[239] = true;
            setCancelled(jSONObject.getBoolean(str15));
            $jacocoInit[240] = true;
        }
        if (!jSONObject.has(KEY_SURVEY_STATE)) {
            $jacocoInit[241] = true;
        } else {
            $jacocoInit[242] = true;
            setSurveyState(SurveyState.valueOf(jSONObject.getString(KEY_SURVEY_STATE)));
            $jacocoInit[243] = true;
        }
        if (!jSONObject.has(KEY_SHOULD_SHOW_AGAIN)) {
            $jacocoInit[244] = true;
        } else {
            $jacocoInit[245] = true;
            setShouldShowAgain(jSONObject.getBoolean(KEY_SHOULD_SHOW_AGAIN));
            $jacocoInit[246] = true;
        }
        if (!jSONObject.has(KEY_SESSION_COUNTER)) {
            $jacocoInit[247] = true;
        } else {
            $jacocoInit[248] = true;
            setSessionCounter(jSONObject.getInt(KEY_SESSION_COUNTER));
            $jacocoInit[249] = true;
        }
        if (!jSONObject.has(KEY_DISMISSED_AT)) {
            $jacocoInit[250] = true;
        } else {
            $jacocoInit[251] = true;
            setDismissedAt((long) jSONObject.getInt(KEY_DISMISSED_AT));
            $jacocoInit[252] = true;
        }
        $jacocoInit[253] = true;
    }
}
