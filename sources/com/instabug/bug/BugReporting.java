package com.instabug.bug;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0237z;
import com.instabug.bug.C9238a.C9244f;
import com.instabug.bug.OnSdkDismissedCallback.DismissType;
import com.instabug.bug.extendedbugreport.ExtendedBugReport;
import com.instabug.bug.invocation.InvocationMode;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.BugState;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.settings.AttachmentsTypesParams;
import com.instabug.bug.settings.C9291a;
import com.instabug.bug.settings.C9292b;
import com.instabug.chat.InstabugChat;
import com.instabug.library.APIBuildChecker;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.bugreporting.model.Bug.Type;
import com.instabug.library.extendedbugreport.ExtendedBugReport.State;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.InvocationSettings;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition;
import com.instabug.library.model.BugCategory;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.http.C15470v;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class BugReporting {
    private static transient /* synthetic */ boolean[] $jacocoData;

    /* renamed from: com.instabug.bug.BugReporting$a */
    static class C9229a implements OnSdkDismissedCallback {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24426b;

        /* renamed from: a */
        final /* synthetic */ OnSdkDismissedCallback f24427a;

        C9229a(OnSdkDismissedCallback onSdkDismissedCallback) {
            boolean[] a = m43163a();
            this.f24427a = onSdkDismissedCallback;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43163a() {
            boolean[] zArr = f24426b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(758069542478535256L, "com/instabug/bug/BugReporting$1", 10);
            f24426b = a;
            return a;
        }

        public void onSdkDismissed(DismissType dismissType, C9278b bVar) {
            Type type;
            OnSdkDismissedCallback.DismissType dismissType2;
            boolean[] a = m43163a();
            int i = C9230b.f24430c[bVar.ordinal()];
            if (i == 1) {
                type = Type.BUG;
                a[1] = true;
            } else if (i == 2) {
                type = Type.FEEDBACK;
                a[2] = true;
            } else if (i != 3) {
                type = Type.NOT_AVAILABLE;
                a[4] = true;
            } else {
                type = Type.NOT_AVAILABLE;
                a[3] = true;
            }
            int i2 = C9230b.f24431d[dismissType.ordinal()];
            if (i2 == 1) {
                dismissType2 = OnSdkDismissedCallback.DismissType.SUBMIT;
                a[5] = true;
            } else if (i2 == 2) {
                dismissType2 = OnSdkDismissedCallback.DismissType.CANCEL;
                a[6] = true;
            } else if (i2 != 3) {
                dismissType2 = OnSdkDismissedCallback.DismissType.CANCEL;
                a[8] = true;
            } else {
                dismissType2 = OnSdkDismissedCallback.DismissType.ADD_ATTACHMENT;
                a[7] = true;
            }
            this.f24427a.onSdkDismissed(dismissType2, type);
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.bug.BugReporting$b */
    static /* synthetic */ class C9230b {

        /* renamed from: a */
        static final /* synthetic */ int[] f24428a = new int[InvocationMode.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f24429b = new int[State.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f24430c = new int[C9278b.values().length];

        /* renamed from: d */
        static final /* synthetic */ int[] f24431d = new int[DismissType.values().length];

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f24432e;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        static {
            /*
                boolean[] r0 = m43164a()
                com.instabug.bug.OnSdkDismissedCallback$DismissType[] r1 = com.instabug.bug.OnSdkDismissedCallback.DismissType.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24431d = r1
                r1 = 0
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                int[] r1 = f24431d     // Catch:{ NoSuchFieldError -> 0x0021 }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r6 = com.instabug.bug.OnSdkDismissedCallback.DismissType.SUBMIT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r5] = r5
                goto L_0x0023
            L_0x0021:
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0023:
                int[] r1 = f24431d     // Catch:{ NoSuchFieldError -> 0x0030 }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r6 = com.instabug.bug.OnSdkDismissedCallback.DismissType.CANCEL     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0030 }
                r0[r3] = r5
                goto L_0x0032
            L_0x0030:
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f24431d     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.bug.OnSdkDismissedCallback$DismissType r6 = com.instabug.bug.OnSdkDismissedCallback.DismissType.ADD_ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r5
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r5
            L_0x0043:
                com.instabug.bug.model.b[] r1 = com.instabug.bug.model.C9278b.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24430c = r1
                r1 = 7
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x005e }
                int[] r1 = f24430c     // Catch:{ NoSuchFieldError -> 0x005e }
                com.instabug.bug.model.b r6 = com.instabug.bug.model.C9278b.BUG     // Catch:{ NoSuchFieldError -> 0x005e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x005e }
                r1 = 8
                r0[r1] = r5
                goto L_0x0062
            L_0x005e:
                r1 = 9
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0062:
                int[] r1 = f24430c     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.instabug.bug.model.b r6 = com.instabug.bug.model.C9278b.FEEDBACK     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0071 }
                r1 = 10
                r0[r1] = r5
                goto L_0x0075
            L_0x0071:
                r1 = 11
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0075:
                int[] r1 = f24430c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.instabug.bug.model.b r6 = com.instabug.bug.model.C9278b.NOT_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1 = 12
                r0[r1] = r5
                goto L_0x0088
            L_0x0084:
                r1 = 13
                r0[r1] = r5
            L_0x0088:
                com.instabug.library.extendedbugreport.ExtendedBugReport$State[] r1 = com.instabug.library.extendedbugreport.ExtendedBugReport.State.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24429b = r1
                r1 = 14
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int[] r1 = f24429b     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.instabug.library.extendedbugreport.ExtendedBugReport$State r6 = com.instabug.library.extendedbugreport.ExtendedBugReport.State.ENABLED_WITH_REQUIRED_FIELDS     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r1 = 15
                r0[r1] = r5
                goto L_0x00a8
            L_0x00a4:
                r1 = 16
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00a8:
                int[] r1 = f24429b     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.instabug.library.extendedbugreport.ExtendedBugReport$State r6 = com.instabug.library.extendedbugreport.ExtendedBugReport.State.ENABLED_WITH_OPTIONAL_FIELDS     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r1 = 17
                r0[r1] = r5
                goto L_0x00bb
            L_0x00b7:
                r1 = 18
                r0[r1] = r5
            L_0x00bb:
                com.instabug.bug.invocation.InvocationMode[] r1 = com.instabug.bug.invocation.InvocationMode.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24428a = r1
                r1 = 19
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int[] r1 = f24428a     // Catch:{ NoSuchFieldError -> 0x00d7 }
                com.instabug.bug.invocation.InvocationMode r6 = com.instabug.bug.invocation.InvocationMode.NEW_BUG     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r1 = 20
                r0[r1] = r5
                goto L_0x00db
            L_0x00d7:
                r1 = 21
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00db:
                int[] r1 = f24428a     // Catch:{ NoSuchFieldError -> 0x00ea }
                com.instabug.bug.invocation.InvocationMode r6 = com.instabug.bug.invocation.InvocationMode.NEW_FEEDBACK     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00ea }
                r1 = 22
                r0[r1] = r5
                goto L_0x00ee
            L_0x00ea:
                r1 = 23
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00ee:
                int[] r1 = f24428a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.instabug.bug.invocation.InvocationMode r4 = com.instabug.bug.invocation.InvocationMode.NEW_CHAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r1[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00fd }
                r1 = 24
                r0[r1] = r5
                goto L_0x0101
            L_0x00fd:
                r1 = 25
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0110 }
            L_0x0101:
                int[] r1 = f24428a     // Catch:{ NoSuchFieldError -> 0x0110 }
                com.instabug.bug.invocation.InvocationMode r3 = com.instabug.bug.invocation.InvocationMode.CHATS_LIST     // Catch:{ NoSuchFieldError -> 0x0110 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0110 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0110 }
                r1 = 26
                r0[r1] = r5
                goto L_0x0114
            L_0x0110:
                r1 = 27
                r0[r1] = r5
            L_0x0114:
                r1 = 28
                r0[r1] = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.BugReporting.C9230b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43164a() {
            boolean[] zArr = f24432e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9064650573445042542L, "com/instabug/bug/BugReporting$2", 29);
            f24432e = a;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5151547907126059183L, "com/instabug/bug/BugReporting", C15470v.f44668i);
        $jacocoData = a;
        return a;
    }

    public BugReporting() {
        $jacocoInit()[0] = true;
    }

    @Deprecated
    public static void addExtraReportField(CharSequence charSequence, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[179] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[180] = true;
        $jacocoInit[181] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[182] = true;
        Parameter type = parameter2.setName("required").setType(Boolean.TYPE);
        $jacocoInit[183] = true;
        Parameter[] parameterArr = {parameter.setName("fieldHint").setType(CharSequence.class).setValue(charSequence), type.setValue(Boolean.valueOf(z))};
        $jacocoInit[184] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[185] = true;
        C9291a.m43476r().mo33598a(charSequence, z);
        $jacocoInit[186] = true;
    }

    @Deprecated
    public static void clearExtraReportFields() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[187] = true;
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[188] = true;
        C9291a.m43476r().mo33620m();
        $jacocoInit[189] = true;
    }

    @Deprecated
    public static Runnable getPreSendingRunnable() {
        boolean[] $jacocoInit = $jacocoInit();
        Runnable f = C9292b.m43512m().mo33640f();
        $jacocoInit[142] = true;
        return f;
    }

    public static void invoke() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[8] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[9] = true;
        InvocationManager.getInstance().invoke();
        $jacocoInit[10] = true;
    }

    @Deprecated
    public static void openNewBugReport() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[176] = true;
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[177] = true;
        C9238a.m43187e();
        $jacocoInit[178] = true;
    }

    @Deprecated
    public static void openNewFeedback() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[173] = true;
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[174] = true;
        C9238a.m43184d();
        $jacocoInit[175] = true;
    }

    public static void setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[125] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[126] = true;
        $jacocoInit[127] = true;
        Parameter type = parameter.setName("initialScreenshot").setType(Boolean.class);
        $jacocoInit[128] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[129] = true;
        $jacocoInit[130] = true;
        Parameter type2 = parameter2.setName("extraScreenshot").setType(Boolean.class);
        $jacocoInit[131] = true;
        Parameter parameter3 = new Parameter();
        $jacocoInit[132] = true;
        $jacocoInit[133] = true;
        Parameter type3 = parameter3.setName("galleryImage").setType(Boolean.class);
        $jacocoInit[134] = true;
        Parameter parameter4 = new Parameter();
        $jacocoInit[135] = true;
        $jacocoInit[136] = true;
        Parameter type4 = parameter4.setName("screenRecording").setType(Boolean.class);
        $jacocoInit[137] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.toString(z)), type2.setValue(Boolean.toString(z2)), type3.setValue(Boolean.toString(z3)), type4.setValue(Boolean.toString(z4))};
        $jacocoInit[138] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[139] = true;
        AttachmentsTypesParams attachmentsTypesParams = new AttachmentsTypesParams(z, z2, z3, z4);
        $jacocoInit[140] = true;
        C9291a.m43476r().mo33596a(attachmentsTypesParams);
        $jacocoInit[141] = true;
    }

    @Deprecated
    public static void setCommentFieldRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[159] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[160] = true;
        $jacocoInit[161] = true;
        Parameter type = parameter.setName("commentFieldRequired").setType(Boolean.class);
        $jacocoInit[162] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
        $jacocoInit[163] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[164] = true;
        C9291a.m43476r().mo33608c(z);
        $jacocoInit[165] = true;
    }

    @Deprecated
    public static void setEmailFieldRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[150] = true;
        C9291a.m43476r().mo33602a(z);
        $jacocoInit[151] = true;
    }

    @Deprecated
    public static void setEmailFieldVisibility(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[152] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[153] = true;
        $jacocoInit[154] = true;
        Parameter type = parameter.setName("emailFieldVisibility").setType(Boolean.class);
        $jacocoInit[155] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
        $jacocoInit[156] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[157] = true;
        C9291a.m43476r().mo33606b(z);
        $jacocoInit[158] = true;
    }

    public static void setExtendedBugReportState(State state) {
        ExtendedBugReport.State state2;
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[89] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[90] = true;
        int i = C9230b.f24429b[state.ordinal()];
        if (i == 1) {
            state2 = ExtendedBugReport.State.ENABLED_WITH_REQUIRED_FIELDS;
            $jacocoInit[91] = true;
        } else if (i != 2) {
            state2 = ExtendedBugReport.State.DISABLED;
            $jacocoInit[93] = true;
        } else {
            state2 = ExtendedBugReport.State.ENABLED_WITH_OPTIONAL_FIELDS;
            $jacocoInit[92] = true;
        }
        C9291a.m43476r().mo33595a(state2);
        $jacocoInit[94] = true;
    }

    public static void setFloatingButtonEdge(@C0193h0 InstabugFloatingButtonEdge instabugFloatingButtonEdge) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[65] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[66] = true;
        $jacocoInit[67] = true;
        Parameter type = parameter.setName("instabugFloatingButtonEdge").setType(InstabugFloatingButtonEdge.class);
        $jacocoInit[68] = true;
        Parameter[] parameterArr = {type.setValue(instabugFloatingButtonEdge)};
        $jacocoInit[69] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[70] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[71] = true;
        currentInvocationSettings.setFloatingButtonEdge(instabugFloatingButtonEdge);
        $jacocoInit[72] = true;
    }

    public static void setFloatingButtonOffset(@C0237z(from = 0) int i) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[73] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[74] = true;
        Parameter name = parameter.setName("floatingButtonOffsetFromTop");
        Class cls = Integer.TYPE;
        $jacocoInit[75] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[76] = true;
        Parameter[] parameterArr = {type.setValue(Integer.toString(i))};
        $jacocoInit[77] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[78] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[79] = true;
        currentInvocationSettings.setFloatingButtonOffsetFromTop(i);
        $jacocoInit[80] = true;
    }

    public static void setInvocationEvents(InstabugInvocationEvent... instabugInvocationEventArr) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[1] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[2] = true;
        $jacocoInit[3] = true;
        Parameter type = parameter.setName("instabugInvocationEvent").setType(InstabugInvocationEvent.class);
        $jacocoInit[4] = true;
        Parameter[] parameterArr = {type.setValue(TextUtils.join(",", instabugInvocationEventArr))};
        $jacocoInit[5] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[6] = true;
        InvocationManager.getInstance().setInstabugInvocationEvent(instabugInvocationEventArr);
        $jacocoInit[7] = true;
    }

    public static void setInvocationOptions(@C0193h0 int... iArr) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        int length = iArr.length;
        $jacocoInit[27] = true;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (i2 == 2) {
                C9291a.m43476r().mo33606b(false);
                $jacocoInit[30] = true;
                C9291a.m43476r().mo33602a(false);
                $jacocoInit[31] = true;
            } else if (i2 == 4) {
                C9291a.m43476r().mo33606b(true);
                $jacocoInit[32] = true;
                C9291a.m43476r().mo33602a(false);
                $jacocoInit[33] = true;
            } else if (i2 == 8) {
                C9291a.m43476r().mo33608c(true);
                $jacocoInit[29] = true;
            } else if (i2 != 16) {
                $jacocoInit[28] = true;
            } else {
                C9291a.m43476r().mo33609d(false);
                $jacocoInit[34] = true;
            }
            i++;
            $jacocoInit[35] = true;
        }
        $jacocoInit[36] = true;
    }

    private static void setLegacyBugCategories(List<BugCategory> list) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[109] = true;
        $jacocoInit[110] = true;
        for (BugCategory bugCategory : list) {
            $jacocoInit[111] = true;
            ReportCategory instance = ReportCategory.getInstance();
            $jacocoInit[112] = true;
            ReportCategory withIcon = instance.withIcon(bugCategory.getIcon());
            $jacocoInit[113] = true;
            ReportCategory withLabel = withIcon.withLabel(bugCategory.getLabel());
            $jacocoInit[114] = true;
            arrayList.add(withLabel);
            $jacocoInit[115] = true;
        }
        setReportCategories(arrayList);
        $jacocoInit[116] = true;
    }

    private static void setLegacyOnSdkDismissedCallback(OnSdkDismissedCallback onSdkDismissedCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        C9229a aVar = new C9229a(onSdkDismissedCallback);
        $jacocoInit[117] = true;
        setOnSdkDismissedCallback(aVar);
        $jacocoInit[118] = true;
    }

    private static void setLegacyReportCategories(List<com.instabug.library.bugreporting.model.ReportCategory> list) {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList arrayList = new ArrayList();
        $jacocoInit[95] = true;
        $jacocoInit[96] = true;
        for (com.instabug.library.bugreporting.model.ReportCategory reportCategory : list) {
            $jacocoInit[97] = true;
            ReportCategory instance = ReportCategory.getInstance();
            $jacocoInit[98] = true;
            ReportCategory withIcon = instance.withIcon(reportCategory.getIcon());
            $jacocoInit[99] = true;
            ReportCategory withLabel = withIcon.withLabel(reportCategory.getLabel());
            $jacocoInit[100] = true;
            arrayList.add(withLabel);
            $jacocoInit[101] = true;
        }
        setReportCategories(arrayList);
        $jacocoInit[102] = true;
    }

    public static void setOnDismissCallback(OnSdkDismissCallback onSdkDismissCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[43] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[44] = true;
        $jacocoInit[45] = true;
        Parameter[] parameterArr = {parameter.setName("onSdkDismissedCallback").setType(OnSdkDismissedCallback.class)};
        $jacocoInit[46] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[47] = true;
        InstabugChat.setOnSdkDismissCallback(onSdkDismissCallback);
        $jacocoInit[48] = true;
        C9291a.m43476r().mo33597a(onSdkDismissCallback);
        $jacocoInit[49] = true;
    }

    public static void setOnInvokeCallback(OnInvokeCallback onInvokeCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[37] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[38] = true;
        $jacocoInit[39] = true;
        Parameter[] parameterArr = {parameter.setName("setOnInvokeCallback").setType(Runnable.class)};
        $jacocoInit[40] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[41] = true;
        SettingsManager.getInstance().setOnInvokeCallback(onInvokeCallback);
        $jacocoInit[42] = true;
    }

    @Deprecated
    public static void setOnSdkDismissedCallback(OnSdkDismissedCallback onSdkDismissedCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[119] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[120] = true;
        $jacocoInit[121] = true;
        Parameter[] parameterArr = {parameter.setName("onSdkDismissedCallback").setType(OnSdkDismissedCallback.class)};
        $jacocoInit[122] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[123] = true;
        C9291a.m43476r().mo33594a(onSdkDismissedCallback);
        $jacocoInit[124] = true;
    }

    @Deprecated
    public static void setPreSendingRunnable(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[143] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[144] = true;
        $jacocoInit[145] = true;
        Parameter[] parameterArr = {parameter.setName("runnable").setType(Runnable.class)};
        $jacocoInit[146] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[147] = true;
        C9291a.m43476r().mo33599a(runnable);
        $jacocoInit[148] = true;
    }

    public static void setPromptOptionsEnabled(PromptOption... promptOptionArr) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[50] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[51] = true;
        $jacocoInit[52] = true;
        Parameter type = parameter.setName("promptOptions").setType(PromptOption.class);
        $jacocoInit[53] = true;
        Parameter[] parameterArr = {type.setValue(Arrays.asList(promptOptionArr))};
        $jacocoInit[54] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[55] = true;
        C9250d.m43233a(promptOptionArr);
        $jacocoInit[56] = true;
    }

    @Deprecated
    public static void setReportCategories(List<ReportCategory> list) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[103] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[104] = true;
        $jacocoInit[105] = true;
        Parameter[] parameterArr = {parameter.setName("reportCategories").setType(ReportCategory.class)};
        $jacocoInit[106] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[107] = true;
        C9291a.m43476r().mo33601a(list);
        $jacocoInit[108] = true;
    }

    protected static void setScreenshotRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[190] = true;
        Parameter name = parameter.setName("screenshotRequired");
        Class cls = Boolean.TYPE;
        $jacocoInit[191] = true;
        Parameter[] parameterArr = {name.setType(cls)};
        $jacocoInit[192] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[193] = true;
        C9291a.m43476r().mo33611e(z);
        $jacocoInit[194] = true;
    }

    public static void setShakingThreshold(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[57] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[58] = true;
        Parameter name = parameter.setName("threshold");
        Class cls = Integer.TYPE;
        $jacocoInit[59] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[60] = true;
        Parameter[] parameterArr = {type.setValue(Integer.toString(i))};
        $jacocoInit[61] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[62] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[63] = true;
        currentInvocationSettings.setShakingThreshold(i);
        $jacocoInit[64] = true;
    }

    @Deprecated
    public static void setShouldSkipInitialScreenshotAnnotation(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[149] = true;
    }

    @Deprecated
    public static void setSuccessDialogEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[166] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[167] = true;
        $jacocoInit[168] = true;
        Parameter type = parameter.setName(Enabled.ELEMENT).setType(Boolean.class);
        $jacocoInit[169] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
        $jacocoInit[170] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[171] = true;
        C9291a.m43476r().mo33609d(z);
        $jacocoInit[172] = true;
    }

    public static void setVideoRecordingFloatingButtonPosition(@C0193h0 InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[81] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[82] = true;
        $jacocoInit[83] = true;
        Parameter type = parameter.setName("instabugViewRecordingButtonPosition").setType(InstabugVideoRecordingButtonPosition.class);
        $jacocoInit[84] = true;
        Parameter[] parameterArr = {type.setValue(instabugVideoRecordingButtonPosition)};
        $jacocoInit[85] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[86] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[87] = true;
        currentInvocationSettings.setVideoRecordingButtonPosition(instabugVideoRecordingButtonPosition);
        $jacocoInit[88] = true;
    }

    private void updateBugCacheManager(@C0193h0 Context context) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        List a = C9244f.m43203a(context);
        $jacocoInit[195] = true;
        Iterator it = a.iterator();
        $jacocoInit[196] = true;
        while (true) {
            if (!it.hasNext()) {
                $jacocoInit[197] = true;
                break;
            }
            Bug bug = (Bug) it.next();
            $jacocoInit[198] = true;
            if (bug.mo33522h() == BugState.WAITING_VIDEO) {
                $jacocoInit[199] = true;
                InstabugSDKLogger.m46626v(this, "found the video bug");
                $jacocoInit[200] = true;
                bug.mo33499a(BugState.READY_TO_BE_SENT);
                $jacocoInit[201] = true;
                C9244f.m43202a(bug);
                $jacocoInit[202] = true;
                break;
            }
            $jacocoInit[203] = true;
        }
        $jacocoInit[204] = true;
    }

    public static void invoke(@C0193h0 InvocationMode invocationMode, @C0193h0 int... iArr) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[11] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[12] = true;
        $jacocoInit[13] = true;
        Parameter type = parameter.setName("invocationMode").setType(InvocationMode.class);
        $jacocoInit[14] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[15] = true;
        $jacocoInit[16] = true;
        Parameter value = parameter2.setName("invocationOption").setValue(String.class);
        $jacocoInit[17] = true;
        Parameter[] parameterArr = {type.setValue(invocationMode.toString()), value.setValue(Arrays.toString(iArr))};
        $jacocoInit[18] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[19] = true;
        setInvocationOptions(iArr);
        $jacocoInit[20] = true;
        int i = C9230b.f24428a[invocationMode.ordinal()];
        if (i == 1) {
            InvocationManager.getInstance().invoke(1);
            $jacocoInit[21] = true;
        } else if (i == 2) {
            InvocationManager.getInstance().invoke(2);
            $jacocoInit[22] = true;
        } else if (i == 3) {
            InvocationManager.getInstance().invoke(3);
            $jacocoInit[23] = true;
        } else if (i != 4) {
            InvocationManager.getInstance().invoke(0);
            $jacocoInit[25] = true;
        } else {
            InvocationManager.getInstance().invoke(4);
            $jacocoInit[24] = true;
        }
        $jacocoInit[26] = true;
    }
}
