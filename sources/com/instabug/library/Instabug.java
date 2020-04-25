package com.instabug.library;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0196j;
import androidx.annotation.C0198k;
import androidx.annotation.C0213q;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.C4306c0.C4307a;
import com.instabug.library.C9794d.C9796b;
import com.instabug.library.C9794d.C9797c;
import com.instabug.library.C9794d.C9798d;
import com.instabug.library.C9794d.C9799e;
import com.instabug.library.C9794d.C9800f;
import com.instabug.library.Feature.State;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.bugreporting.model.ReportCategory;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.extendedbugreport.ExtendedBugReport;
import com.instabug.library.internal.layer.CapturableView;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InstabugInvocationMode;
import com.instabug.library.invocation.Invocation;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.InvocationSettings;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.model.BugCategory;
import com.instabug.library.model.Report.OnReportCreatedListener;
import com.instabug.library.p397ui.onboarding.WelcomeMessage;
import com.instabug.library.settings.AttachmentsTypesParams;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.user.C10009a;
import com.instabug.library.user.UserEventParam;
import com.instabug.library.util.InstabugDeprecationLogger;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.StringUtility;
import com.mrsool.utils.C11644i;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Instabug {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InstabugState INSTABUG_STATE = InstabugState.NOT_BUILT;
    private static Instabug INSTANCE = null;
    private C9764b delegate;

    @SuppressFBWarnings({"URF_UNREAD_FIELD"})
    public static class Builder {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private Application application;
        private Context applicationContext;
        private String applicationToken;
        private AttachmentsTypesParams attachmentsTypesParams;
        private boolean bugPromptOptionEnable;
        private boolean chatPromptOptionEnable;
        private boolean commentFieldRequired;
        private State consoleLogState;
        private State crashReportingState;
        private int defaultInvocationMode;
        private boolean emailFieldRequired;
        private boolean emailFieldVisibility;
        private boolean feedbackPromptOptionEnable;
        private int floatingButtonOffsetFromTop;
        private State inAppMessagingState;
        private InstabugFloatingButtonEdge instabugFloatingButtonEdge;
        private InstabugInvocationEvent[] instabugInvocationEvents;
        private Locale instabugLocale;
        private State instabugLogState;
        private int instabugPrimaryColor;
        private int instabugStatusBarColor;
        private InstabugColorTheme instabugTheme;
        private boolean introMessageEnabled;
        private boolean isSurveysAutoShowing;
        private int notificationIcon;
        private boolean playInAppNotificationSound;
        private boolean playSystemNotificationSound;
        private State pushNotificationState;
        private com.instabug.library.visualusersteps.State reproStepsState;
        private int shakingThreshold;
        private boolean shouldPlaySounds;
        private boolean successDialogEnabled;
        private State surveysState;
        private State trackingUserStepsState;
        private State userDataState;
        private State userEventsState;
        private State viewHierarchyState;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9047918264483490162L, "com/instabug/library/Instabug$Builder", 335);
            $jacocoData = a;
            return a;
        }

        public Builder(Application application2, String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this(application2, str, InstabugInvocationEvent.SHAKE);
            $jacocoInit[0] = true;
        }

        private void setFeaturesStates(Boolean bool) {
            boolean[] $jacocoInit = $jacocoInit();
            StringBuilder sb = new StringBuilder();
            sb.append("Setting user data feature state ");
            sb.append(this.userDataState);
            InstabugSDKLogger.m46626v(this, sb.toString());
            $jacocoInit[309] = true;
            C9780c.m45631b().mo34865a(Feature.USER_DATA, this.userDataState);
            $jacocoInit[310] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Setting console log feature state ");
            sb2.append(this.consoleLogState);
            InstabugSDKLogger.m46626v(this, sb2.toString());
            $jacocoInit[311] = true;
            C9780c.m45631b().mo34865a(Feature.CONSOLE_LOGS, this.consoleLogState);
            $jacocoInit[312] = true;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting Instabug logs feature state ");
            sb3.append(this.instabugLogState);
            InstabugSDKLogger.m46626v(this, sb3.toString());
            $jacocoInit[313] = true;
            C9780c.m45631b().mo34865a(Feature.INSTABUG_LOGS, this.instabugLogState);
            $jacocoInit[314] = true;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Setting crash reporting feature state ");
            sb4.append(this.crashReportingState);
            InstabugSDKLogger.m46626v(this, sb4.toString());
            $jacocoInit[315] = true;
            C9780c.m45631b().mo34865a(Feature.CRASH_REPORTING, this.crashReportingState);
            $jacocoInit[316] = true;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Setting in-app messaging feature state ");
            sb5.append(this.inAppMessagingState);
            InstabugSDKLogger.m46626v(this, sb5.toString());
            $jacocoInit[317] = true;
            C9780c.m45631b().mo34865a(Feature.IN_APP_MESSAGING, this.inAppMessagingState);
            $jacocoInit[318] = true;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Setting push notification feature state ");
            sb6.append(this.pushNotificationState);
            InstabugSDKLogger.m46626v(this, sb6.toString());
            $jacocoInit[319] = true;
            C9780c.m45631b().mo34865a(Feature.PUSH_NOTIFICATION, this.pushNotificationState);
            $jacocoInit[320] = true;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Setting tracking user steps feature state ");
            sb7.append(this.trackingUserStepsState);
            InstabugSDKLogger.m46626v(this, sb7.toString());
            $jacocoInit[321] = true;
            C9780c.m45631b().mo34865a(Feature.TRACK_USER_STEPS, this.trackingUserStepsState);
            $jacocoInit[322] = true;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Setting repro steps feature state ");
            sb8.append(this.reproStepsState);
            InstabugSDKLogger.m46626v(this, sb8.toString());
            $jacocoInit[323] = true;
            Instabug.setReproStepsState(this.reproStepsState);
            $jacocoInit[324] = true;
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Setting view hierarchy  feature state ");
            sb9.append(this.viewHierarchyState);
            InstabugSDKLogger.m46626v(this, sb9.toString());
            $jacocoInit[325] = true;
            C9780c.m45631b().mo34865a(Feature.VIEW_HIERARCHY, this.viewHierarchyState);
            $jacocoInit[326] = true;
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Setting surveys feature state ");
            sb10.append(this.surveysState);
            InstabugSDKLogger.m46626v(this, sb10.toString());
            $jacocoInit[327] = true;
            C9780c.m45631b().mo34865a(Feature.SURVEYS, this.surveysState);
            $jacocoInit[328] = true;
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Setting user events feature state ");
            sb11.append(this.userEventsState);
            InstabugSDKLogger.m46626v(this, sb11.toString());
            $jacocoInit[329] = true;
            C9780c.m45631b().mo34865a(Feature.USER_EVENTS, this.userEventsState);
            $jacocoInit[330] = true;
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Setting instabug overall state ");
            sb12.append(bool);
            InstabugSDKLogger.m46626v(this, sb12.toString());
            $jacocoInit[331] = true;
            C9780c b = C9780c.m45631b();
            Feature feature = Feature.INSTABUG;
            $jacocoInit[332] = true;
            boolean booleanValue = bool.booleanValue();
            $jacocoInit[333] = true;
            b.mo34866a(feature, booleanValue);
            $jacocoInit[334] = true;
        }

        public Instabug build(State state) {
            boolean z;
            boolean[] $jacocoInit = $jacocoInit();
            SettingsManager.init(this.applicationContext);
            if (state == State.ENABLED) {
                $jacocoInit[257] = true;
                z = true;
            } else {
                z = false;
                $jacocoInit[258] = true;
            }
            $jacocoInit[259] = true;
            setFeaturesStates(Boolean.valueOf(z));
            $jacocoInit[260] = true;
            C9764b bVar = new C9764b(this.applicationContext);
            $jacocoInit[261] = true;
            Instabug.access$002(new Instabug(bVar, null));
            $jacocoInit[262] = true;
            Instabug.setState(InstabugState.BUILT);
            $jacocoInit[263] = true;
            bVar.mo34829a(this.applicationContext);
            $jacocoInit[264] = true;
            InstabugInternalTrackingDelegate.init(this.application);
            $jacocoInit[265] = true;
            SettingsManager.getInstance().setAppToken(this.applicationToken);
            $jacocoInit[266] = true;
            bVar.mo34828a();
            $jacocoInit[267] = true;
            SettingsManager.getInstance().setInstabugLocale(this.instabugLocale);
            $jacocoInit[268] = true;
            SettingsManager.getInstance().setTheme(this.instabugTheme);
            $jacocoInit[269] = true;
            SettingsManager.getInstance().setPrimaryColor(this.instabugPrimaryColor);
            $jacocoInit[270] = true;
            SettingsManager.getInstance().setStatusBarColor(this.instabugStatusBarColor);
            AttachmentsTypesParams attachmentsTypesParams2 = this.attachmentsTypesParams;
            $jacocoInit[271] = true;
            boolean isShouldTakesInitialScreenshot = attachmentsTypesParams2.isShouldTakesInitialScreenshot();
            AttachmentsTypesParams attachmentsTypesParams3 = this.attachmentsTypesParams;
            $jacocoInit[272] = true;
            boolean isAllowTakeExtraScreenshot = attachmentsTypesParams3.isAllowTakeExtraScreenshot();
            AttachmentsTypesParams attachmentsTypesParams4 = this.attachmentsTypesParams;
            $jacocoInit[273] = true;
            boolean isAllowAttachImageFromGallery = attachmentsTypesParams4.isAllowAttachImageFromGallery();
            AttachmentsTypesParams attachmentsTypesParams5 = this.attachmentsTypesParams;
            $jacocoInit[274] = true;
            boolean isAllowScreenRecording = attachmentsTypesParams5.isAllowScreenRecording();
            $jacocoInit[275] = true;
            C9796b.m45684a(isShouldTakesInitialScreenshot, isAllowTakeExtraScreenshot, isAllowAttachImageFromGallery, isAllowScreenRecording);
            $jacocoInit[276] = true;
            C9796b.m45683a(this.emailFieldRequired);
            $jacocoInit[277] = true;
            C9796b.m45689c(this.emailFieldVisibility);
            $jacocoInit[278] = true;
            C9796b.m45690d(this.successDialogEnabled);
            $jacocoInit[279] = true;
            InvocationManager.getInstance().setInstabugInvocationEvent(this.instabugInvocationEvents);
            $jacocoInit[280] = true;
            Instabug.setPromptOptionsEnabled(this.chatPromptOptionEnable, this.bugPromptOptionEnable, this.feedbackPromptOptionEnable);
            $jacocoInit[281] = true;
            InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
            int i = this.defaultInvocationMode;
            $jacocoInit[282] = true;
            currentInvocationSettings.setDefaultInvocationMode(i);
            $jacocoInit[283] = true;
            InvocationSettings currentInvocationSettings2 = InvocationManager.getInstance().getCurrentInvocationSettings();
            int i2 = this.shakingThreshold;
            $jacocoInit[284] = true;
            currentInvocationSettings2.setShakingThreshold(i2);
            $jacocoInit[285] = true;
            InvocationSettings currentInvocationSettings3 = InvocationManager.getInstance().getCurrentInvocationSettings();
            InstabugFloatingButtonEdge instabugFloatingButtonEdge2 = this.instabugFloatingButtonEdge;
            $jacocoInit[286] = true;
            currentInvocationSettings3.setFloatingButtonEdge(instabugFloatingButtonEdge2);
            if (this.floatingButtonOffsetFromTop == -1) {
                $jacocoInit[287] = true;
            } else {
                $jacocoInit[288] = true;
                InvocationSettings currentInvocationSettings4 = InvocationManager.getInstance().getCurrentInvocationSettings();
                int i3 = this.floatingButtonOffsetFromTop;
                $jacocoInit[289] = true;
                currentInvocationSettings4.setFloatingButtonOffsetFromTop(i3);
                $jacocoInit[290] = true;
            }
            C9796b.m45687b(this.commentFieldRequired);
            $jacocoInit[291] = true;
            C9797c.m45706b(this.shouldPlaySounds);
            $jacocoInit[292] = true;
            C9797c.m45708c(this.playSystemNotificationSound);
            $jacocoInit[293] = true;
            C9797c.m45709d(this.playInAppNotificationSound);
            $jacocoInit[294] = true;
            C9797c.m45694a(this.notificationIcon);
            AttachmentsTypesParams attachmentsTypesParams6 = this.attachmentsTypesParams;
            $jacocoInit[295] = true;
            boolean isAllowTakeExtraScreenshot2 = attachmentsTypesParams6.isAllowTakeExtraScreenshot();
            AttachmentsTypesParams attachmentsTypesParams7 = this.attachmentsTypesParams;
            $jacocoInit[296] = true;
            boolean isAllowAttachImageFromGallery2 = attachmentsTypesParams7.isAllowAttachImageFromGallery();
            AttachmentsTypesParams attachmentsTypesParams8 = this.attachmentsTypesParams;
            $jacocoInit[297] = true;
            boolean isAllowScreenRecording2 = attachmentsTypesParams8.isAllowScreenRecording();
            $jacocoInit[298] = true;
            C9797c.m45699a(isAllowTakeExtraScreenshot2, isAllowAttachImageFromGallery2, isAllowScreenRecording2);
            $jacocoInit[299] = true;
            C9800f.m45721a(this.isSurveysAutoShowing);
            $jacocoInit[300] = true;
            Instabug access$000 = Instabug.access$000();
            $jacocoInit[301] = true;
            return access$000;
        }

        @Deprecated
        public Builder setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[172] = true;
            Parameter name = parameter.setName("initialScreenshot");
            Class cls = Boolean.TYPE;
            $jacocoInit[173] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[174] = true;
            Parameter parameter2 = new Parameter();
            $jacocoInit[175] = true;
            Parameter name2 = parameter2.setName("extraScreenshot");
            Class cls2 = Boolean.TYPE;
            $jacocoInit[176] = true;
            Parameter type2 = name2.setType(cls2);
            $jacocoInit[177] = true;
            Parameter parameter3 = new Parameter();
            $jacocoInit[178] = true;
            Parameter name3 = parameter3.setName("galleryImage");
            Class cls3 = Boolean.TYPE;
            $jacocoInit[179] = true;
            Parameter type3 = name3.setType(cls3);
            $jacocoInit[180] = true;
            Parameter parameter4 = new Parameter();
            $jacocoInit[181] = true;
            Parameter name4 = parameter4.setName("voiceNote");
            Class cls4 = Boolean.TYPE;
            $jacocoInit[182] = true;
            Parameter type4 = name4.setType(cls4);
            $jacocoInit[183] = true;
            Parameter parameter5 = new Parameter();
            $jacocoInit[184] = true;
            Parameter name5 = parameter5.setName("screenRecording");
            Class cls5 = Boolean.TYPE;
            $jacocoInit[185] = true;
            Parameter type5 = name5.setType(cls5);
            $jacocoInit[186] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z)), type2.setValue(Boolean.valueOf(z2)), type3.setValue(Boolean.valueOf(z3)), type4.setValue(Boolean.valueOf(z4)), type5.setValue(Boolean.valueOf(z5))};
            $jacocoInit[187] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[188] = true;
            AttachmentsTypesParams shouldTakesInitialScreenshot = this.attachmentsTypesParams.setShouldTakesInitialScreenshot(z);
            $jacocoInit[189] = true;
            AttachmentsTypesParams allowTakeExtraScreenshot = shouldTakesInitialScreenshot.setAllowTakeExtraScreenshot(z2);
            $jacocoInit[190] = true;
            AttachmentsTypesParams allowAttachImageFromGallery = allowTakeExtraScreenshot.setAllowAttachImageFromGallery(z3);
            $jacocoInit[191] = true;
            allowAttachImageFromGallery.setAllowScreenRecording(z5);
            $jacocoInit[192] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[193] = true;
            return this;
        }

        @Deprecated
        public Builder setColorTheme(IBGColorTheme iBGColorTheme) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[200] = true;
            $jacocoInit[201] = true;
            Parameter type = parameter.setName("theme").setType(IBGColorTheme.class);
            $jacocoInit[202] = true;
            Parameter[] parameterArr = {type.setValue(iBGColorTheme)};
            $jacocoInit[203] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[204] = true;
            int i = C9694b.f25687f[iBGColorTheme.ordinal()];
            if (i == 1) {
                this.instabugTheme = InstabugColorTheme.InstabugColorThemeDark;
                this.instabugPrimaryColor = -9580554;
                $jacocoInit[206] = true;
            } else if (i == 2) {
                this.instabugTheme = InstabugColorTheme.InstabugColorThemeLight;
                this.instabugPrimaryColor = -15893761;
                $jacocoInit[207] = true;
            } else if (i != 3) {
                $jacocoInit[205] = true;
            } else {
                this.instabugTheme = InstabugColorTheme.InstabugColorThemeLight;
                this.instabugPrimaryColor = -15893761;
                $jacocoInit[208] = true;
            }
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[209] = true;
            return this;
        }

        @Deprecated
        public Builder setCommentFieldRequired(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[147] = true;
            Parameter name = parameter.setName("commentFieldRequired");
            Class cls = Boolean.TYPE;
            $jacocoInit[148] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[149] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[150] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.commentFieldRequired = z;
            $jacocoInit[151] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[152] = true;
            return this;
        }

        public Builder setConsoleLogState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[107] = true;
            $jacocoInit[108] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[109] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[110] = true;
            instance.catchApiUsage(parameterArr);
            this.consoleLogState = state;
            $jacocoInit[111] = true;
            return this;
        }

        public Builder setCrashReportingState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[112] = true;
            $jacocoInit[113] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[114] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[115] = true;
            instance.catchApiUsage(parameterArr);
            this.crashReportingState = state;
            $jacocoInit[116] = true;
            return this;
        }

        @Deprecated
        public Builder setDefaultInvocationMode(IBGInvocationMode iBGInvocationMode) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[46] = true;
            $jacocoInit[47] = true;
            Parameter type = parameter.setName("invocationMode").setType(IBGInvocationMode.class);
            $jacocoInit[48] = true;
            Parameter[] parameterArr = {type.setValue(iBGInvocationMode)};
            $jacocoInit[49] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[50] = true;
            int i = C9694b.f25685d[iBGInvocationMode.ordinal()];
            if (i == 1) {
                this.defaultInvocationMode = 0;
                $jacocoInit[52] = true;
            } else if (i == 2) {
                this.defaultInvocationMode = 1;
                $jacocoInit[53] = true;
            } else if (i != 3) {
                $jacocoInit[51] = true;
            } else {
                this.defaultInvocationMode = 2;
                $jacocoInit[54] = true;
            }
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[55] = true;
            return this;
        }

        @Deprecated
        public Builder setEmailFieldRequired(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[153] = true;
            Parameter name = parameter.setName("emailFieldRequired");
            Class cls = Boolean.TYPE;
            $jacocoInit[154] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[155] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[156] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.emailFieldRequired = z;
            $jacocoInit[157] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[158] = true;
            return this;
        }

        @Deprecated
        public Builder setEmailFieldVisibility(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[159] = true;
            Parameter name = parameter.setName("emailFieldVisibility");
            Class cls = Boolean.TYPE;
            $jacocoInit[160] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[161] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[162] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.emailFieldVisibility = z;
            $jacocoInit[163] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[164] = true;
            return this;
        }

        @Deprecated
        public Builder setEnableInAppNotificationSound(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[40] = true;
            Parameter name = parameter.setName("shouldPlaySound");
            Class cls = Boolean.TYPE;
            $jacocoInit[41] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[42] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[43] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.playInAppNotificationSound = z;
            $jacocoInit[44] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[45] = true;
            return this;
        }

        @Deprecated
        public Builder setEnableSystemNotificationSound(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[34] = true;
            Parameter name = parameter.setName("shouldPlaySound");
            Class cls = Boolean.TYPE;
            $jacocoInit[35] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[36] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[37] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.playSystemNotificationSound = z;
            $jacocoInit[38] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[39] = true;
            return this;
        }

        @Deprecated
        public Builder setFloatingButtonEdge(IBGFloatingButtonEdge iBGFloatingButtonEdge) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[219] = true;
            $jacocoInit[220] = true;
            Parameter type = parameter.setName("floatingButtonEdge").setType(IBGFloatingButtonEdge.class);
            $jacocoInit[221] = true;
            Parameter[] parameterArr = {type.setValue(iBGFloatingButtonEdge)};
            $jacocoInit[222] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[223] = true;
            int i = C9694b.f25688g[iBGFloatingButtonEdge.ordinal()];
            if (i == 1) {
                setFloatingButtonEdge(InstabugFloatingButtonEdge.RIGHT);
                $jacocoInit[225] = true;
            } else if (i != 2) {
                $jacocoInit[224] = true;
            } else {
                setFloatingButtonEdge(InstabugFloatingButtonEdge.LEFT);
                $jacocoInit[226] = true;
            }
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[227] = true;
            return this;
        }

        @Deprecated
        public Builder setFloatingButtonOffsetFromTop(@C0237z(from = 0) int i) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[234] = true;
            Parameter name = parameter.setName("floatingButtonOffsetFromTop");
            Class cls = Integer.TYPE;
            $jacocoInit[235] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[236] = true;
            Parameter[] parameterArr = {type.setValue(Integer.toString(i))};
            $jacocoInit[237] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.floatingButtonOffsetFromTop = i;
            $jacocoInit[238] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[239] = true;
            return this;
        }

        public Builder setInAppMessagingState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[127] = true;
            $jacocoInit[128] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[129] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[130] = true;
            instance.catchApiUsage(parameterArr);
            this.inAppMessagingState = state;
            $jacocoInit[131] = true;
            return this;
        }

        public Builder setInstabugLogState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[117] = true;
            $jacocoInit[118] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[119] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[120] = true;
            instance.catchApiUsage(parameterArr);
            this.instabugLogState = state;
            $jacocoInit[121] = true;
            return this;
        }

        @Deprecated
        public Builder setIntroMessageEnabled(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[86] = true;
            Parameter name = parameter.setName(Enabled.ELEMENT);
            Class cls = Boolean.TYPE;
            $jacocoInit[87] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[88] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[89] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.introMessageEnabled = z;
            $jacocoInit[90] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[91] = true;
            return this;
        }

        @Deprecated
        public Builder setInvocationEvent(IBGInvocationEvent iBGInvocationEvent) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[5] = true;
            $jacocoInit[6] = true;
            Parameter type = parameter.setName("invocationEvent").setType(IBGInvocationEvent.class);
            $jacocoInit[7] = true;
            Parameter[] parameterArr = {type.setValue(iBGInvocationEvent)};
            $jacocoInit[8] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[9] = true;
            int i = C9694b.f25683b[iBGInvocationEvent.ordinal()];
            if (i == 1) {
                setInvocationEvent(InstabugInvocationEvent.NONE);
                $jacocoInit[11] = true;
            } else if (i == 2) {
                setInvocationEvent(InstabugInvocationEvent.SHAKE);
                $jacocoInit[12] = true;
            } else if (i == 3) {
                setInvocationEvent(InstabugInvocationEvent.FLOATING_BUTTON);
                $jacocoInit[13] = true;
            } else if (i == 4) {
                setInvocationEvent(InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT);
                $jacocoInit[14] = true;
            } else if (i != 5) {
                $jacocoInit[10] = true;
            } else {
                setInvocationEvent(InstabugInvocationEvent.SCREENSHOT_GESTURE);
                $jacocoInit[15] = true;
            }
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[16] = true;
            return this;
        }

        public Builder setInvocationEvents(@C0193h0 InstabugInvocationEvent... instabugInvocationEventArr) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[23] = true;
            $jacocoInit[24] = true;
            Parameter type = parameter.setName("instabugInvocationEvent").setType(InstabugInvocationEvent.class);
            $jacocoInit[25] = true;
            Parameter[] parameterArr = {type.setValue(TextUtils.join(",", instabugInvocationEventArr))};
            $jacocoInit[26] = true;
            instance.catchApiUsage(parameterArr);
            this.instabugInvocationEvents = instabugInvocationEventArr;
            $jacocoInit[27] = true;
            return this;
        }

        @Deprecated
        public Builder setLocale(Locale locale) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[240] = true;
            $jacocoInit[241] = true;
            Parameter type = parameter.setName(com.instabug.library.model.State.KEY_LOCALE).setType(Locale.class);
            $jacocoInit[242] = true;
            Parameter[] parameterArr = {type.setValue(locale)};
            $jacocoInit[243] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.instabugLocale = locale;
            $jacocoInit[244] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[245] = true;
            return this;
        }

        @Deprecated
        public Builder setNotificationIcon(int i) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[246] = true;
            Parameter name = parameter.setName("notificationIcon");
            Class cls = Integer.TYPE;
            $jacocoInit[247] = true;
            Parameter[] parameterArr = {name.setType(cls)};
            $jacocoInit[248] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.notificationIcon = i;
            $jacocoInit[249] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[250] = true;
            return this;
        }

        @Deprecated
        public Builder setPromptOptionsEnabled(boolean z, boolean z2, boolean z3) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[56] = true;
            Parameter name = parameter.setName(C11644i.f33274c6);
            Class cls = Boolean.TYPE;
            $jacocoInit[57] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[58] = true;
            Parameter parameter2 = new Parameter();
            $jacocoInit[59] = true;
            Parameter name2 = parameter2.setName("bug");
            Class cls2 = Boolean.TYPE;
            $jacocoInit[60] = true;
            Parameter type2 = name2.setType(cls2);
            $jacocoInit[61] = true;
            Parameter parameter3 = new Parameter();
            $jacocoInit[62] = true;
            Parameter name3 = parameter3.setName("feedback");
            Class cls3 = Boolean.TYPE;
            $jacocoInit[63] = true;
            Parameter type3 = name3.setType(cls3);
            $jacocoInit[64] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z)), type2.setValue(Boolean.valueOf(z2)), type3.setValue(Boolean.toString(z3))};
            $jacocoInit[65] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.chatPromptOptionEnable = z;
            this.bugPromptOptionEnable = z2;
            this.feedbackPromptOptionEnable = z3;
            $jacocoInit[66] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[67] = true;
            return this;
        }

        public Builder setPushNotificationState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[102] = true;
            $jacocoInit[103] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[104] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[105] = true;
            instance.catchApiUsage(parameterArr);
            this.pushNotificationState = state;
            $jacocoInit[106] = true;
            return this;
        }

        public Builder setReproStepsState(com.instabug.library.visualusersteps.State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[97] = true;
            $jacocoInit[98] = true;
            Parameter type = parameter.setName("state").setType(com.instabug.library.visualusersteps.State.class);
            $jacocoInit[99] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[100] = true;
            instance.catchApiUsage(parameterArr);
            this.reproStepsState = state;
            $jacocoInit[101] = true;
            return this;
        }

        @Deprecated
        public Builder setShakingThreshold(int i) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[68] = true;
            Parameter name = parameter.setName("threshold");
            Class cls = Integer.TYPE;
            $jacocoInit[69] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[70] = true;
            Parameter[] parameterArr = {type.setValue(Integer.toString(i))};
            $jacocoInit[71] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.shakingThreshold = i;
            $jacocoInit[72] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[73] = true;
            return this;
        }

        @Deprecated
        public Builder setShouldPlayConversationSounds(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[28] = true;
            Parameter name = parameter.setName("shouldPlaySounds");
            Class cls = Boolean.TYPE;
            $jacocoInit[29] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[30] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[31] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.shouldPlaySounds = z;
            $jacocoInit[32] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[33] = true;
            return this;
        }

        @Deprecated
        public Builder setShouldShowIntroDialog(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[74] = true;
            Parameter name = parameter.setName(Enabled.ELEMENT);
            Class cls = Boolean.TYPE;
            $jacocoInit[75] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[76] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[77] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.introMessageEnabled = z;
            $jacocoInit[78] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[79] = true;
            return this;
        }

        @Deprecated
        public Builder setSuccessDialogEnabled(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[80] = true;
            Parameter name = parameter.setName(Enabled.ELEMENT);
            Class cls = Boolean.TYPE;
            $jacocoInit[81] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[82] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[83] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.successDialogEnabled = z;
            $jacocoInit[84] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[85] = true;
            return this;
        }

        @Deprecated
        public Builder setSurveysAutoShowing(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[251] = true;
            Parameter name = parameter.setName("isSurveysAutoShowing");
            Class cls = Boolean.TYPE;
            $jacocoInit[252] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[253] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[254] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.isSurveysAutoShowing = z;
            $jacocoInit[255] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[256] = true;
            return this;
        }

        public Builder setSurveysState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[137] = true;
            $jacocoInit[138] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[139] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[140] = true;
            instance.catchApiUsage(parameterArr);
            this.surveysState = state;
            $jacocoInit[141] = true;
            return this;
        }

        @Deprecated
        public Builder setTheme(@C0193h0 InstabugColorTheme instabugColorTheme) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[210] = true;
            $jacocoInit[211] = true;
            Parameter type = parameter.setName("instabugTheme").setType(InstabugColorTheme.class);
            $jacocoInit[212] = true;
            Parameter[] parameterArr = {type.setValue(instabugColorTheme)};
            $jacocoInit[213] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.instabugTheme = instabugColorTheme;
            $jacocoInit[214] = true;
            int i = C9694b.f25682a[instabugColorTheme.ordinal()];
            if (i == 1) {
                this.instabugPrimaryColor = -9580554;
                this.instabugStatusBarColor = -16119286;
                $jacocoInit[216] = true;
            } else if (i != 2) {
                $jacocoInit[215] = true;
            } else {
                this.instabugPrimaryColor = -15893761;
                this.instabugStatusBarColor = -3815737;
                $jacocoInit[217] = true;
            }
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[218] = true;
            return this;
        }

        public Builder setTrackingUserStepsState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[92] = true;
            $jacocoInit[93] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[94] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[95] = true;
            instance.catchApiUsage(parameterArr);
            this.trackingUserStepsState = state;
            $jacocoInit[96] = true;
            return this;
        }

        public Builder setUserDataState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[122] = true;
            $jacocoInit[123] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[124] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[125] = true;
            instance.catchApiUsage(parameterArr);
            this.userDataState = state;
            $jacocoInit[126] = true;
            return this;
        }

        public Builder setUserEventsState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[142] = true;
            $jacocoInit[143] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[144] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[145] = true;
            instance.catchApiUsage(parameterArr);
            this.userEventsState = state;
            $jacocoInit[146] = true;
            return this;
        }

        public Builder setViewHierarchyState(@C0193h0 State state) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[132] = true;
            $jacocoInit[133] = true;
            Parameter type = parameter.setName("state").setType(State.class);
            $jacocoInit[134] = true;
            Parameter[] parameterArr = {type.setValue(state)};
            $jacocoInit[135] = true;
            instance.catchApiUsage(parameterArr);
            this.viewHierarchyState = state;
            $jacocoInit[136] = true;
            return this;
        }

        @Deprecated
        public Builder setWillSkipScreenshotAnnotation(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[194] = true;
            Parameter name = parameter.setName("willSkipInitialScreenshotAnnotating");
            Class cls = Boolean.TYPE;
            $jacocoInit[195] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[196] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[197] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[198] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[199] = true;
            return this;
        }

        @Deprecated
        public Builder setWillTakeScreenshot(boolean z) throws IllegalStateException {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[165] = true;
            Parameter name = parameter.setName("willTakeInitialScreenshot");
            Class cls = Boolean.TYPE;
            $jacocoInit[166] = true;
            Parameter type = name.setType(cls);
            $jacocoInit[167] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
            $jacocoInit[168] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[169] = true;
            this.attachmentsTypesParams.setShouldTakesInitialScreenshot(z);
            $jacocoInit[170] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[171] = true;
            return this;
        }

        public Builder(@C0193h0 Application application2, @C0193h0 String str, @C0193h0 InstabugInvocationEvent... instabugInvocationEventArr) {
            boolean[] $jacocoInit = $jacocoInit();
            this(application2.getApplicationContext(), str, instabugInvocationEventArr);
            this.application = application2;
            $jacocoInit[1] = true;
        }

        Builder(@C0193h0 Context context, @C0193h0 String str, @C0193h0 InstabugInvocationEvent... instabugInvocationEventArr) {
            boolean[] $jacocoInit = $jacocoInit();
            this.instabugTheme = InstabugColorTheme.InstabugColorThemeLight;
            this.instabugPrimaryColor = -15893761;
            this.instabugStatusBarColor = -3815737;
            this.instabugInvocationEvents = new InstabugInvocationEvent[]{InstabugInvocationEvent.SHAKE};
            this.defaultInvocationMode = 0;
            State state = C9780c.f25950e;
            this.userDataState = state;
            this.consoleLogState = state;
            this.instabugLogState = state;
            this.inAppMessagingState = state;
            this.crashReportingState = state;
            this.pushNotificationState = state;
            this.trackingUserStepsState = state;
            this.reproStepsState = com.instabug.library.visualusersteps.State.ENABLED;
            State state2 = C9780c.f25950e;
            this.viewHierarchyState = state2;
            this.surveysState = state2;
            this.userEventsState = state2;
            this.emailFieldRequired = true;
            this.emailFieldVisibility = true;
            $jacocoInit[2] = true;
            this.attachmentsTypesParams = new AttachmentsTypesParams();
            this.commentFieldRequired = false;
            this.introMessageEnabled = true;
            this.shouldPlaySounds = false;
            this.successDialogEnabled = true;
            this.instabugFloatingButtonEdge = InstabugFloatingButtonEdge.RIGHT;
            this.shakingThreshold = InvocationSettings.SHAKE_DEFAULT_THRESHOLD;
            this.floatingButtonOffsetFromTop = -1;
            $jacocoInit[3] = true;
            this.instabugLocale = Locale.getDefault();
            this.isSurveysAutoShowing = true;
            this.chatPromptOptionEnable = true;
            this.bugPromptOptionEnable = true;
            this.feedbackPromptOptionEnable = true;
            this.applicationContext = context;
            this.instabugInvocationEvents = instabugInvocationEventArr;
            this.applicationToken = str;
            $jacocoInit[4] = true;
        }

        @Deprecated
        public Builder setFloatingButtonEdge(@C0193h0 InstabugFloatingButtonEdge instabugFloatingButtonEdge2) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[228] = true;
            $jacocoInit[229] = true;
            Parameter type = parameter.setName("instabugFloatingButtonEdge").setType(IBGFloatingButtonEdge.class);
            $jacocoInit[230] = true;
            Parameter[] parameterArr = {type.setValue(instabugFloatingButtonEdge2)};
            $jacocoInit[231] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.instabugFloatingButtonEdge = instabugFloatingButtonEdge2;
            $jacocoInit[232] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[233] = true;
            return this;
        }

        @Deprecated
        public Builder setInvocationEvent(@C0193h0 InstabugInvocationEvent instabugInvocationEvent) {
            boolean[] $jacocoInit = $jacocoInit();
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[17] = true;
            $jacocoInit[18] = true;
            Parameter type = parameter.setName("instabugInvocationEvent").setType(InstabugInvocationEvent.class);
            $jacocoInit[19] = true;
            Parameter[] parameterArr = {type.setValue(instabugInvocationEvent)};
            $jacocoInit[20] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            this.instabugInvocationEvents = new InstabugInvocationEvent[]{instabugInvocationEvent};
            $jacocoInit[21] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[22] = true;
            return this;
        }

        public Instabug build() {
            boolean[] $jacocoInit = $jacocoInit();
            if (!Instabug.isBuilt()) {
                $jacocoInit[302] = true;
            } else {
                $jacocoInit[303] = true;
                if (!InternalScreenRecordHelper.getInstance().isRecording()) {
                    $jacocoInit[304] = true;
                } else {
                    $jacocoInit[305] = true;
                    InternalScreenRecordHelper.getInstance().cancel();
                    $jacocoInit[306] = true;
                }
                Instabug.disable();
                $jacocoInit[307] = true;
            }
            Instabug build = build(State.ENABLED);
            $jacocoInit[308] = true;
            return build;
        }
    }

    /* renamed from: com.instabug.library.Instabug$a */
    static class C9693a implements OnInvokeCallback {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25680b;

        /* renamed from: a */
        final /* synthetic */ Runnable f25681a;

        C9693a(Runnable runnable) {
            boolean[] a = m45284a();
            this.f25681a = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45284a() {
            boolean[] zArr = f25680b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6962068711087230789L, "com/instabug/library/Instabug$1", 2);
            f25680b = a;
            return a;
        }

        public void onInvoke() {
            boolean[] a = m45284a();
            this.f25681a.run();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.Instabug$b */
    static /* synthetic */ class C9694b {

        /* renamed from: a */
        static final /* synthetic */ int[] f25682a = new int[InstabugColorTheme.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f25683b = new int[IBGInvocationEvent.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f25684c = new int[InstabugInvocationMode.values().length];

        /* renamed from: d */
        static final /* synthetic */ int[] f25685d = new int[IBGInvocationMode.values().length];

        /* renamed from: e */
        static final /* synthetic */ int[] f25686e = new int[InstabugVideoRecordingButtonCorner.values().length];

        /* renamed from: f */
        static final /* synthetic */ int[] f25687f = new int[IBGColorTheme.values().length];

        /* renamed from: g */
        static final /* synthetic */ int[] f25688g = new int[IBGFloatingButtonEdge.values().length];

        /* renamed from: h */
        private static transient /* synthetic */ boolean[] f25689h;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
        static {
            /*
                boolean[] r0 = m45285a()
                com.instabug.library.IBGFloatingButtonEdge[] r1 = com.instabug.library.IBGFloatingButtonEdge.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25688g = r1
                r1 = 0
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                int[] r1 = f25688g     // Catch:{ NoSuchFieldError -> 0x0021 }
                com.instabug.library.IBGFloatingButtonEdge r6 = com.instabug.library.IBGFloatingButtonEdge.Right     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r5] = r5
                goto L_0x0023
            L_0x0021:
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0023:
                int[] r1 = f25688g     // Catch:{ NoSuchFieldError -> 0x0030 }
                com.instabug.library.IBGFloatingButtonEdge r6 = com.instabug.library.IBGFloatingButtonEdge.Left     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0030 }
                r0[r3] = r5
                goto L_0x0032
            L_0x0030:
                r0[r2] = r5
            L_0x0032:
                com.instabug.library.IBGColorTheme[] r1 = com.instabug.library.IBGColorTheme.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25687f = r1
                r1 = 5
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x004c }
                int[] r6 = f25687f     // Catch:{ NoSuchFieldError -> 0x004c }
                com.instabug.library.IBGColorTheme r7 = com.instabug.library.IBGColorTheme.IBGColorThemeDark     // Catch:{ NoSuchFieldError -> 0x004c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004c }
                r6 = 6
                r0[r6] = r5
                goto L_0x004f
            L_0x004c:
                r6 = 7
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x004f:
                int[] r6 = f25687f     // Catch:{ NoSuchFieldError -> 0x005e }
                com.instabug.library.IBGColorTheme r7 = com.instabug.library.IBGColorTheme.IBGColorThemeLight     // Catch:{ NoSuchFieldError -> 0x005e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x005e }
                r6 = 8
                r0[r6] = r5
                goto L_0x0062
            L_0x005e:
                r6 = 9
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0062:
                int[] r6 = f25687f     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.instabug.library.IBGColorTheme r7 = com.instabug.library.IBGColorTheme.theme     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
                r6 = 10
                r0[r6] = r5
                goto L_0x0075
            L_0x0071:
                r6 = 11
                r0[r6] = r5
            L_0x0075:
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner[] r6 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f25686e = r6
                r6 = 12
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0091 }
                int[] r6 = f25686e     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner r7 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0091 }
                r6 = 13
                r0[r6] = r5
                goto L_0x0095
            L_0x0091:
                r6 = 14
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x0095:
                int[] r6 = f25686e     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner r7 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r6 = 15
                r0[r6] = r5
                goto L_0x00a8
            L_0x00a4:
                r6 = 16
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00a8:
                int[] r6 = f25686e     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner r7 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r6 = 17
                r0[r6] = r5
                goto L_0x00bb
            L_0x00b7:
                r6 = 18
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00ca }
            L_0x00bb:
                int[] r6 = f25686e     // Catch:{ NoSuchFieldError -> 0x00ca }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner r7 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonCorner.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x00ca }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ca }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00ca }
                r6 = 19
                r0[r6] = r5
                goto L_0x00ce
            L_0x00ca:
                r6 = 20
                r0[r6] = r5
            L_0x00ce:
                com.instabug.library.IBGInvocationMode[] r6 = com.instabug.library.IBGInvocationMode.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f25685d = r6
                r6 = 21
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
                int[] r6 = f25685d     // Catch:{ NoSuchFieldError -> 0x00ea }
                com.instabug.library.IBGInvocationMode r7 = com.instabug.library.IBGInvocationMode.IBGInvocationModeNA     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
                r6 = 22
                r0[r6] = r5
                goto L_0x00ee
            L_0x00ea:
                r6 = 23
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00ee:
                int[] r6 = f25685d     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.instabug.library.IBGInvocationMode r7 = com.instabug.library.IBGInvocationMode.IBGInvocationModeBugReporter     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00fd }
                r6 = 24
                r0[r6] = r5
                goto L_0x0101
            L_0x00fd:
                r6 = 25
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0110 }
            L_0x0101:
                int[] r6 = f25685d     // Catch:{ NoSuchFieldError -> 0x0110 }
                com.instabug.library.IBGInvocationMode r7 = com.instabug.library.IBGInvocationMode.IBGInvocationModeFeedbackSender     // Catch:{ NoSuchFieldError -> 0x0110 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0110 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0110 }
                r6 = 26
                r0[r6] = r5
                goto L_0x0114
            L_0x0110:
                r6 = 27
                r0[r6] = r5
            L_0x0114:
                com.instabug.library.invocation.InstabugInvocationMode[] r6 = com.instabug.library.invocation.InstabugInvocationMode.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f25684c = r6
                r6 = 28
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0130 }
                int[] r6 = f25684c     // Catch:{ NoSuchFieldError -> 0x0130 }
                com.instabug.library.invocation.InstabugInvocationMode r7 = com.instabug.library.invocation.InstabugInvocationMode.NEW_BUG     // Catch:{ NoSuchFieldError -> 0x0130 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0130 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0130 }
                r6 = 29
                r0[r6] = r5
                goto L_0x0134
            L_0x0130:
                r6 = 30
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0143 }
            L_0x0134:
                int[] r6 = f25684c     // Catch:{ NoSuchFieldError -> 0x0143 }
                com.instabug.library.invocation.InstabugInvocationMode r7 = com.instabug.library.invocation.InstabugInvocationMode.NEW_FEEDBACK     // Catch:{ NoSuchFieldError -> 0x0143 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0143 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0143 }
                r6 = 31
                r0[r6] = r5
                goto L_0x0147
            L_0x0143:
                r6 = 32
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0156 }
            L_0x0147:
                int[] r6 = f25684c     // Catch:{ NoSuchFieldError -> 0x0156 }
                com.instabug.library.invocation.InstabugInvocationMode r7 = com.instabug.library.invocation.InstabugInvocationMode.NEW_CHAT     // Catch:{ NoSuchFieldError -> 0x0156 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0156 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0156 }
                r6 = 33
                r0[r6] = r5
                goto L_0x015a
            L_0x0156:
                r6 = 34
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0169 }
            L_0x015a:
                int[] r6 = f25684c     // Catch:{ NoSuchFieldError -> 0x0169 }
                com.instabug.library.invocation.InstabugInvocationMode r7 = com.instabug.library.invocation.InstabugInvocationMode.CHATS_LIST     // Catch:{ NoSuchFieldError -> 0x0169 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0169 }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0169 }
                r6 = 35
                r0[r6] = r5
                goto L_0x016d
            L_0x0169:
                r6 = 36
                r0[r6] = r5
            L_0x016d:
                com.instabug.library.IBGInvocationEvent[] r6 = com.instabug.library.IBGInvocationEvent.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f25683b = r6
                r6 = 37
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0189 }
                int[] r6 = f25683b     // Catch:{ NoSuchFieldError -> 0x0189 }
                com.instabug.library.IBGInvocationEvent r7 = com.instabug.library.IBGInvocationEvent.IBGInvocationEventNone     // Catch:{ NoSuchFieldError -> 0x0189 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0189 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0189 }
                r6 = 38
                r0[r6] = r5
                goto L_0x018d
            L_0x0189:
                r6 = 39
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x019c }
            L_0x018d:
                int[] r6 = f25683b     // Catch:{ NoSuchFieldError -> 0x019c }
                com.instabug.library.IBGInvocationEvent r7 = com.instabug.library.IBGInvocationEvent.IBGInvocationEventShake     // Catch:{ NoSuchFieldError -> 0x019c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x019c }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x019c }
                r6 = 40
                r0[r6] = r5
                goto L_0x01a0
            L_0x019c:
                r6 = 41
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x01af }
            L_0x01a0:
                int[] r6 = f25683b     // Catch:{ NoSuchFieldError -> 0x01af }
                com.instabug.library.IBGInvocationEvent r7 = com.instabug.library.IBGInvocationEvent.IBGInvocationEventFloatingButton     // Catch:{ NoSuchFieldError -> 0x01af }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x01af }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x01af }
                r3 = 42
                r0[r3] = r5
                goto L_0x01b3
            L_0x01af:
                r3 = 43
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x01c2 }
            L_0x01b3:
                int[] r3 = f25683b     // Catch:{ NoSuchFieldError -> 0x01c2 }
                com.instabug.library.IBGInvocationEvent r6 = com.instabug.library.IBGInvocationEvent.IBGInvocationEventTwoFingersSwipeLeft     // Catch:{ NoSuchFieldError -> 0x01c2 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                r3[r6] = r2     // Catch:{ NoSuchFieldError -> 0x01c2 }
                r2 = 44
                r0[r2] = r5
                goto L_0x01c6
            L_0x01c2:
                r2 = 45
                r0[r2] = r5     // Catch:{ NoSuchFieldError -> 0x01d5 }
            L_0x01c6:
                int[] r2 = f25683b     // Catch:{ NoSuchFieldError -> 0x01d5 }
                com.instabug.library.IBGInvocationEvent r3 = com.instabug.library.IBGInvocationEvent.IBGInvocationScreenshotGesture     // Catch:{ NoSuchFieldError -> 0x01d5 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d5 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x01d5 }
                r1 = 46
                r0[r1] = r5
                goto L_0x01d9
            L_0x01d5:
                r1 = 47
                r0[r1] = r5
            L_0x01d9:
                com.instabug.library.InstabugColorTheme[] r1 = com.instabug.library.InstabugColorTheme.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25682a = r1
                r1 = 48
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x01f5 }
                int[] r1 = f25682a     // Catch:{ NoSuchFieldError -> 0x01f5 }
                com.instabug.library.InstabugColorTheme r2 = com.instabug.library.InstabugColorTheme.InstabugColorThemeDark     // Catch:{ NoSuchFieldError -> 0x01f5 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f5 }
                r1[r2] = r5     // Catch:{ NoSuchFieldError -> 0x01f5 }
                r1 = 49
                r0[r1] = r5
                goto L_0x01f9
            L_0x01f5:
                r1 = 50
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0208 }
            L_0x01f9:
                int[] r1 = f25682a     // Catch:{ NoSuchFieldError -> 0x0208 }
                com.instabug.library.InstabugColorTheme r2 = com.instabug.library.InstabugColorTheme.InstabugColorThemeLight     // Catch:{ NoSuchFieldError -> 0x0208 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0208 }
                r1[r2] = r4     // Catch:{ NoSuchFieldError -> 0x0208 }
                r1 = 51
                r0[r1] = r5
                goto L_0x020c
            L_0x0208:
                r1 = 52
                r0[r1] = r5
            L_0x020c:
                r1 = 53
                r0[r1] = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.Instabug.C9694b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45285a() {
            boolean[] zArr = f25689h;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5645968566493622805L, "com/instabug/library/Instabug$2", 54);
            f25689h = a;
            return a;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5019766366238920211L, "com/instabug/library/Instabug", 799);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[798] = true;
    }

    /* synthetic */ Instabug(C9764b bVar, C9693a aVar) {
        boolean[] $jacocoInit = $jacocoInit();
        this(bVar);
        $jacocoInit[796] = true;
    }

    static /* synthetic */ Instabug access$000() {
        boolean[] $jacocoInit = $jacocoInit();
        Instabug instabug = INSTANCE;
        $jacocoInit[797] = true;
        return instabug;
    }

    static /* synthetic */ Instabug access$002(Instabug instabug) {
        boolean[] $jacocoInit = $jacocoInit();
        INSTANCE = instabug;
        $jacocoInit[795] = true;
        return instabug;
    }

    @Deprecated
    public static void addCapturableView(@C0193h0 CapturableView capturableView) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[380] = true;
        $jacocoInit[381] = true;
        Parameter[] parameterArr = {parameter.setName("capturableView").setType(CapturableView.class)};
        $jacocoInit[382] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[383] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[384] = true;
    }

    @Deprecated
    public static void addExtraReportField(CharSequence charSequence, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[761] = true;
        $jacocoInit[762] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[763] = true;
        Parameter type = parameter2.setName("required").setType(Boolean.TYPE);
        $jacocoInit[764] = true;
        Parameter[] parameterArr = {parameter.setName("fieldHint").setType(CharSequence.class).setValue(charSequence), type.setValue(Boolean.valueOf(z))};
        $jacocoInit[765] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[766] = true;
        C9796b.m45681a(charSequence, z);
        $jacocoInit[767] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[768] = true;
    }

    public static void addFileAttachment(@C0193h0 Uri uri, @C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[23] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[24] = true;
        $jacocoInit[25] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[26] = true;
        $jacocoInit[27] = true;
        Parameter[] parameterArr = {parameter.setName("fileUri").setType(Uri.class), parameter2.setName("fileNameWithExtension").setType(String.class)};
        $jacocoInit[28] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[29] = true;
        SettingsManager.getInstance().addExtraAttachmentFile(uri, str);
        $jacocoInit[30] = true;
    }

    @Deprecated
    public static void addMapView(@C0193h0 View view, @C0193h0 Object obj) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[373] = true;
        $jacocoInit[374] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[375] = true;
        $jacocoInit[376] = true;
        Parameter[] parameterArr = {parameter.setName("mapView").setType(View.class), parameter2.setName("googleMap").setType(Object.class)};
        $jacocoInit[377] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[378] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[379] = true;
    }

    public static void addTags(String... strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[114] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[115] = true;
        String[] trimStrings = StringUtility.trimStrings(strArr);
        $jacocoInit[116] = true;
        SettingsManager.getInstance().addTags(trimStrings);
        $jacocoInit[117] = true;
    }

    @Deprecated
    public static void changeInvocationEvent(@C0193h0 InstabugInvocationEvent instabugInvocationEvent) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[346] = true;
        $jacocoInit[347] = true;
        Parameter type = parameter.setName("instabugInvocationEvent").setType(InstabugInvocationEvent.class);
        $jacocoInit[348] = true;
        Parameter[] parameterArr = {type.setValue(instabugInvocationEvent)};
        $jacocoInit[349] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[350] = true;
        InvocationManager.getInstance().setInstabugInvocationEvent(instabugInvocationEvent);
        $jacocoInit[351] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[352] = true;
    }

    @Deprecated
    public static void changeLocale(Locale locale) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[492] = true;
        $jacocoInit[493] = true;
        Parameter type = parameter.setName(com.instabug.library.model.State.KEY_LOCALE).setType(Locale.class);
        $jacocoInit[494] = true;
        Parameter[] parameterArr = {type.setValue(locale)};
        $jacocoInit[495] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[496] = true;
        SettingsManager.getInstance().setInstabugLocale(locale);
        $jacocoInit[497] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[498] = true;
    }

    public static void clearAllUserAttributes() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[202] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[203] = true;
        UserAttributesCacheManager.deleteAll();
        $jacocoInit[204] = true;
    }

    @Deprecated
    public static void clearExtraReportFields() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[769] = true;
        C9796b.m45685b();
        $jacocoInit[770] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[771] = true;
    }

    public static void clearFileAttachment() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[39] = true;
        AnalyticsObserver.getInstance().catchLoggingApiUsage(new Parameter[0]);
        $jacocoInit[40] = true;
        SettingsManager.getInstance().clearExtraAttachmentFiles();
        $jacocoInit[41] = true;
    }

    @Deprecated
    public static void clearLog() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedLoggingApiUsage(new Parameter[0]);
        $jacocoInit[435] = true;
        InstabugLog.clearLogs();
        $jacocoInit[436] = true;
    }

    public static void disable() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[93] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[94] = true;
        if (!isEnabled()) {
            $jacocoInit[95] = true;
        } else {
            $jacocoInit[96] = true;
            C9780c.m45631b().mo34865a(Feature.INSTABUG, State.DISABLED);
            $jacocoInit[97] = true;
            C9780c.m45631b().mo34866a(Feature.INSTABUG, false);
            $jacocoInit[98] = true;
            C9780c.m45631b().mo34864a(getApplicationContext());
            $jacocoInit[99] = true;
            getInstance().delegate.mo34838h();
            $jacocoInit[100] = true;
        }
        $jacocoInit[101] = true;
    }

    @Deprecated
    public static void dismiss() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[509] = true;
        getInstance().delegate.mo34841k();
        $jacocoInit[510] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[511] = true;
    }

    public static void enable() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[84] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[85] = true;
        if (isEnabled()) {
            $jacocoInit[86] = true;
        } else {
            $jacocoInit[87] = true;
            C9780c.m45631b().mo34866a(Feature.INSTABUG, true);
            $jacocoInit[88] = true;
            C9780c.m45631b().mo34865a(Feature.INSTABUG, State.ENABLED);
            $jacocoInit[89] = true;
            C9780c.m45631b().mo34864a(getApplicationContext());
            $jacocoInit[90] = true;
            getInstance().delegate.mo34828a();
            $jacocoInit[91] = true;
        }
        $jacocoInit[92] = true;
    }

    @C0195i0
    public static HashMap<String, String> getAllUserAttributes() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[178] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[179] = true;
        HashMap<String, String> all = UserAttributesCacheManager.getAll();
        $jacocoInit[180] = true;
        return all;
    }

    public static String getAppToken() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[58] = true;
        String appToken = SettingsManager.getInstance().getAppToken();
        $jacocoInit[59] = true;
        return appToken;
    }

    @C0195i0
    public static Context getApplicationContext() {
        boolean[] $jacocoInit = $jacocoInit();
        Context j = getInstance().delegate.mo34840j();
        $jacocoInit[4] = true;
        return j;
    }

    @Deprecated
    public static IBGColorTheme getColorTheme() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[457] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[458] = true;
        int i = C9694b.f25682a[SettingsManager.getInstance().getTheme().ordinal()];
        if (i == 1) {
            IBGColorTheme iBGColorTheme = IBGColorTheme.IBGColorThemeDark;
            $jacocoInit[459] = true;
            return iBGColorTheme;
        } else if (i != 2) {
            IBGColorTheme iBGColorTheme2 = IBGColorTheme.IBGColorThemeLight;
            $jacocoInit[461] = true;
            return iBGColorTheme2;
        } else {
            IBGColorTheme iBGColorTheme3 = IBGColorTheme.IBGColorThemeLight;
            $jacocoInit[460] = true;
            return iBGColorTheme3;
        }
    }

    public static Date getFirstRunAt() {
        boolean[] $jacocoInit = $jacocoInit();
        Date firstRunAt = SettingsManager.getInstance().getFirstRunAt();
        $jacocoInit[205] = true;
        return firstRunAt;
    }

    static Instabug getInstance() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        Instabug instabug = INSTANCE;
        if (instabug != null) {
            $jacocoInit[3] = true;
            return instabug;
        }
        $jacocoInit[1] = true;
        IllegalStateException illegalStateException = new IllegalStateException("Instabug getInstance called before Instabug.Builder().build() was called");
        $jacocoInit[2] = true;
        throw illegalStateException;
    }

    public static Locale getLocale(Context context) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[109] = true;
        Locale instabugLocale = SettingsManager.getInstance().getInstabugLocale(context);
        $jacocoInit[110] = true;
        return instabugLocale;
    }

    public static int getPrimaryColor() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[12] = true;
        int primaryColor = SettingsManager.getInstance().getPrimaryColor();
        $jacocoInit[13] = true;
        return primaryColor;
    }

    @C0196j
    @Deprecated
    public static int getRequestedOrientation() {
        boolean[] $jacocoInit = $jacocoInit();
        SettingsManager instance = SettingsManager.getInstance();
        $jacocoInit[583] = true;
        int requestedOrientation = instance.getRequestedOrientation();
        $jacocoInit[584] = true;
        int orientation = OrientationUtils.getOrientation(requestedOrientation);
        $jacocoInit[585] = true;
        return orientation;
    }

    public static InstabugState getState() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugState instabugState = INSTABUG_STATE;
        $jacocoInit[71] = true;
        return instabugState;
    }

    public static ArrayList<String> getTags() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[118] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[119] = true;
        ArrayList<String> tags = SettingsManager.getInstance().getTags();
        $jacocoInit[120] = true;
        return tags;
    }

    public static InstabugColorTheme getTheme() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[21] = true;
        InstabugColorTheme theme = SettingsManager.getInstance().getTheme();
        $jacocoInit[22] = true;
        return theme;
    }

    public static int getUnreadMessagesCount() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[111] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[112] = true;
        int a = C9797c.m45693a();
        $jacocoInit[113] = true;
        return a;
    }

    @C0195i0
    public static String getUserAttribute(@C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[190] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[191] = true;
        $jacocoInit[192] = true;
        Parameter[] parameterArr = {parameter.setName("key").setType(String.class)};
        $jacocoInit[193] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[194] = true;
        String attribute = UserAttributesCacheManager.getAttribute(str);
        $jacocoInit[195] = true;
        return attribute;
    }

    public static String getUserData() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[42] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[43] = true;
        String userData = SettingsManager.getInstance().getUserData();
        $jacocoInit[44] = true;
        return userData;
    }

    public static String getUserEmail() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[55] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[56] = true;
        String b = C10009a.m46593b();
        $jacocoInit[57] = true;
        return b;
    }

    @Deprecated
    public static boolean hasRespondToSurvey(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[727] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[728] = true;
        boolean b = C9800f.m45727b(str);
        $jacocoInit[729] = true;
        return b;
    }

    @Deprecated
    public static boolean hasValidSurveys() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[785] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[786] = true;
        boolean b = C9800f.m45726b();
        $jacocoInit[787] = true;
        return b;
    }

    public static void identifyUser(@C0193h0 String str, @C0193h0 String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[60] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[61] = true;
        $jacocoInit[62] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[63] = true;
        Parameter[] parameterArr = {parameter.setName("username").setType(String.class), parameter2.setName("email")};
        $jacocoInit[64] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[65] = true;
        C10009a.m46590a(getApplicationContext(), str, str2);
        $jacocoInit[66] = true;
    }

    @Deprecated
    public static void invoke() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[365] = true;
        InvocationManager.getInstance().invoke();
        $jacocoInit[366] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[367] = true;
    }

    @Deprecated
    public static void invokeConversations() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[401] = true;
        invoke(InstabugInvocationMode.CHATS_LIST);
        $jacocoInit[402] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[403] = true;
    }

    public static boolean isAppOnForeground() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean isAppOnForeground = SettingsManager.getInstance().isAppOnForeground();
        $jacocoInit[206] = true;
        return isAppOnForeground;
    }

    public static boolean isBuilt() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE == null) {
            $jacocoInit[72] = true;
        } else if (getState() == InstabugState.NOT_BUILT) {
            $jacocoInit[73] = true;
        } else {
            $jacocoInit[74] = true;
            z = true;
            $jacocoInit[76] = true;
            return z;
        }
        z = false;
        $jacocoInit[75] = true;
        $jacocoInit[76] = true;
        return z;
    }

    public static boolean isEnabled() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[77] = true;
        if (!C9780c.m45631b().mo34868a(Feature.INSTABUG)) {
            $jacocoInit[78] = true;
        } else {
            $jacocoInit[79] = true;
            if (C9780c.m45631b().mo34869b(Feature.INSTABUG) != State.ENABLED) {
                $jacocoInit[80] = true;
            } else {
                $jacocoInit[81] = true;
                z = true;
                $jacocoInit[83] = true;
                return z;
            }
        }
        z = false;
        $jacocoInit[82] = true;
        $jacocoInit[83] = true;
        return z;
    }

    public static boolean isInstabugNotification(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[124] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[125] = true;
        $jacocoInit[126] = true;
        Parameter[] parameterArr = {parameter.setName("data").setType(Bundle.class)};
        $jacocoInit[127] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[128] = true;
        boolean a = C9797c.m45700a(bundle);
        $jacocoInit[129] = true;
        return a;
    }

    @Deprecated
    public static void log(@C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[428] = true;
        Parameter[] parameterArr = {parameter.setName("message").setType(String.class)};
        $jacocoInit[429] = true;
        instance.catchDeprecatedLoggingApiUsage(parameterArr);
        $jacocoInit[430] = true;
        if (C9780c.m45631b().mo34869b(Feature.INSTABUG_LOGS) != State.ENABLED) {
            $jacocoInit[431] = true;
        } else {
            $jacocoInit[432] = true;
            InstabugLog.m46184d(str);
            $jacocoInit[433] = true;
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[434] = true;
    }

    public static void logUserEvent(@C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[330] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[331] = true;
        $jacocoInit[332] = true;
        Parameter[] parameterArr = {parameter.setName("eventIdentifier").setType(String.class)};
        $jacocoInit[333] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[334] = true;
        InstabugUserEventLogger.getInstance().logUserEvent(str, new UserEventParam[0]);
        $jacocoInit[335] = true;
    }

    public static void logoutUser() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[67] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[68] = true;
        C10009a.m46588a();
        $jacocoInit[69] = true;
    }

    public static void onReportSubmitHandler(OnReportCreatedListener onReportCreatedListener) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[336] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[337] = true;
        $jacocoInit[338] = true;
        Parameter[] parameterArr = {parameter.setName(C4307a.f13384a).setType(OnReportCreatedListener.class)};
        $jacocoInit[339] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[340] = true;
        SettingsManager.getInstance().setOnReportCreatedListener(onReportCreatedListener);
        $jacocoInit[341] = true;
    }

    public static void removeUserAttribute(@C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[196] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[197] = true;
        $jacocoInit[198] = true;
        Parameter[] parameterArr = {parameter.setName("key").setType(String.class)};
        $jacocoInit[199] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[200] = true;
        UserAttributesCacheManager.deleteAttribute(str);
        $jacocoInit[201] = true;
    }

    @Deprecated
    public static void reportException(@C0193h0 Throwable th) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[437] = true;
        $jacocoInit[438] = true;
        Parameter[] parameterArr = {parameter.setName("throwable").setType(Throwable.class)};
        $jacocoInit[439] = true;
        instance.catchDeprecatedLoggingApiUsage(parameterArr);
        $jacocoInit[440] = true;
        reportException(th, null);
        $jacocoInit[441] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[442] = true;
    }

    @Deprecated
    public static void resetDefaultInvocationMode() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[422] = true;
        InvocationManager.getInstance().getCurrentInvocationSettings().resetDefaultInvocationMode();
        $jacocoInit[423] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[424] = true;
    }

    @Deprecated
    public static void resetRequestedOrientation() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[580] = true;
        SettingsManager.getInstance().resetRequestedOrientation();
        $jacocoInit[581] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[582] = true;
    }

    public static void resetTags() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[121] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[122] = true;
        SettingsManager.getInstance().resetTags();
        $jacocoInit[123] = true;
    }

    @Deprecated
    public static void setAfterShowingSurveyRunnable(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[574] = true;
        C9800f.m45724b(runnable);
        $jacocoInit[575] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[576] = true;
    }

    @Deprecated
    public static void setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3, boolean z4) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[160] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[161] = true;
        Parameter name = parameter.setName("initialScreenshot");
        Class cls = Boolean.TYPE;
        $jacocoInit[162] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[163] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[164] = true;
        Parameter name2 = parameter2.setName("extraScreenshot");
        Class cls2 = Boolean.TYPE;
        $jacocoInit[165] = true;
        Parameter type2 = name2.setType(cls2);
        $jacocoInit[166] = true;
        Parameter parameter3 = new Parameter();
        $jacocoInit[167] = true;
        Parameter name3 = parameter3.setName("galleryImage");
        Class cls3 = Boolean.TYPE;
        $jacocoInit[168] = true;
        Parameter type3 = name3.setType(cls3);
        $jacocoInit[169] = true;
        Parameter parameter4 = new Parameter();
        $jacocoInit[170] = true;
        Parameter name4 = parameter4.setName("screenRecording");
        Class cls4 = Boolean.TYPE;
        $jacocoInit[171] = true;
        Parameter type4 = name4.setType(cls4);
        $jacocoInit[172] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z)), type2.setValue(Boolean.valueOf(z2)), type3.setValue(Boolean.valueOf(z3)), type4.setValue(Boolean.valueOf(z4))};
        $jacocoInit[173] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[174] = true;
        C9796b.m45684a(z, z2, z3, z4);
        $jacocoInit[175] = true;
        C9797c.m45699a(z2, z3, z4);
        $jacocoInit[176] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[177] = true;
    }

    public static void setAutoScreenRecordingEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[252] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[253] = true;
        $jacocoInit[254] = true;
        Parameter type = parameter.setName("setAutoScreenRecordingEnabled").setType(Boolean.class);
        $jacocoInit[255] = true;
        Parameter[] parameterArr = {type.setValue(String.valueOf(z))};
        $jacocoInit[256] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[257] = true;
        SettingsManager.getInstance().setAutoScreenRecordingEnabled(z);
        $jacocoInit[258] = true;
        InternalAutoScreenRecorderHelper.getInstance().start();
        $jacocoInit[259] = true;
    }

    public static void setAutoScreenRecordingMaxDuration(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[260] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[261] = true;
        $jacocoInit[262] = true;
        Parameter type = parameter.setName("setAutoScreenRecordingMaxDuration").setType(Boolean.class);
        $jacocoInit[263] = true;
        Parameter[] parameterArr = {type.setValue(String.valueOf(i))};
        $jacocoInit[264] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[265] = true;
        SettingsManager.getInstance().setAutoScreenRecordingMaxDuration(i);
        $jacocoInit[266] = true;
    }

    @Deprecated
    public static void setBugCategories(List<BugCategory> list) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[519] = true;
        $jacocoInit[520] = true;
        Parameter[] parameterArr = {parameter.setName("bugCategories").setType(List.class)};
        $jacocoInit[521] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[522] = true;
        C9796b.m45682a(list);
        $jacocoInit[523] = true;
    }

    @Deprecated
    public static void setChatNotificationEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[512] = true;
        Parameter name = parameter.setName("isChatNotificationEnable");
        Class cls = Boolean.TYPE;
        $jacocoInit[513] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[514] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[515] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[516] = true;
        C9797c.m45698a(z);
        $jacocoInit[517] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[518] = true;
    }

    public static void setColorTheme(@C0193h0 InstabugColorTheme instabugColorTheme) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[317] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[318] = true;
        $jacocoInit[319] = true;
        Parameter type = parameter.setName("instabugTheme").setType(InstabugColorTheme.class);
        $jacocoInit[320] = true;
        Parameter[] parameterArr = {type.setValue(instabugColorTheme)};
        $jacocoInit[321] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[322] = true;
        SettingsManager.getInstance().setTheme(instabugColorTheme);
        $jacocoInit[323] = true;
        int i = C9694b.f25682a[instabugColorTheme.ordinal()];
        if (i == 1) {
            SettingsManager.getInstance().setPrimaryColor(-9580554);
            $jacocoInit[325] = true;
            SettingsManager.getInstance().setStatusBarColor(-16119286);
            $jacocoInit[326] = true;
        } else if (i != 2) {
            $jacocoInit[324] = true;
        } else {
            SettingsManager.getInstance().setPrimaryColor(-15893761);
            $jacocoInit[327] = true;
            SettingsManager.getInstance().setStatusBarColor(-3815737);
            $jacocoInit[328] = true;
        }
        $jacocoInit[329] = true;
    }

    @Deprecated
    public static void setCommentFieldRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[666] = true;
        Parameter name = parameter.setName("commentFieldRequired");
        Class cls = Boolean.TYPE;
        $jacocoInit[667] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[668] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[669] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[670] = true;
        C9796b.m45687b(z);
        $jacocoInit[671] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[672] = true;
    }

    public static void setCrashReportingState(@C0193h0 State state) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[245] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[246] = true;
        $jacocoInit[247] = true;
        Parameter type = parameter.setName("state").setType(State.class);
        $jacocoInit[248] = true;
        Parameter[] parameterArr = {type.setValue(state)};
        $jacocoInit[249] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[250] = true;
        C9780c.m45631b().mo34865a(Feature.CRASH_REPORTING, state);
        $jacocoInit[251] = true;
    }

    public static void setCustomTextPlaceHolders(InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[154] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[155] = true;
        $jacocoInit[156] = true;
        Parameter[] parameterArr = {parameter.setName("instabugCustomTextPlaceHolder").setType(InstabugCustomTextPlaceHolder.class)};
        $jacocoInit[157] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[158] = true;
        SettingsManager.getInstance().setCustomPlaceHolders(instabugCustomTextPlaceHolder);
        $jacocoInit[159] = true;
    }

    public static void setDebugEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[5] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[6] = true;
        Parameter name = parameter.setName("isDebugEnabled");
        Class cls = Boolean.TYPE;
        $jacocoInit[7] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[8] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[9] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[10] = true;
        SettingsManager.getInstance().setDebugEnabled(z);
        $jacocoInit[11] = true;
    }

    @Deprecated
    public static void setDefaultInvocationMode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[414] = true;
        $jacocoInit[415] = true;
        Parameter type = parameter.setName("setDefaultInvocationMode").setType(Invocation.class);
        $jacocoInit[416] = true;
        Parameter[] parameterArr = {type.setValue(Integer.valueOf(i))};
        $jacocoInit[417] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[418] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[419] = true;
        currentInvocationSettings.setDefaultInvocationMode(i);
        $jacocoInit[420] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[421] = true;
    }

    @Deprecated
    public static void setDialog(@C0193h0 Dialog dialog) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[368] = true;
        $jacocoInit[369] = true;
        Parameter[] parameterArr = {parameter.setName("dialog").setType(Dialog.class)};
        $jacocoInit[370] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[371] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[372] = true;
    }

    @Deprecated
    public static void setEmailFieldRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[680] = true;
        setEmailFieldRequired(z, 1);
        $jacocoInit[681] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[682] = true;
    }

    @Deprecated
    public static void setEmailFieldVisibility(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[673] = true;
        Parameter name = parameter.setName("emailFieldVisibility");
        Class cls = Boolean.TYPE;
        $jacocoInit[674] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[675] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[676] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[677] = true;
        C9796b.m45689c(z);
        $jacocoInit[678] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[679] = true;
    }

    @Deprecated
    public static void setEnableInAppNotificationSound(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[593] = true;
        Parameter name = parameter.setName("shouldPlaySound");
        Class cls = Boolean.TYPE;
        $jacocoInit[594] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[595] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[596] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[597] = true;
        C9797c.m45709d(z);
        $jacocoInit[598] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[599] = true;
    }

    @Deprecated
    public static void setEnableSystemNotificationSound(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[586] = true;
        Parameter name = parameter.setName("shouldPlaySound");
        Class cls = Boolean.TYPE;
        $jacocoInit[587] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[588] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[589] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[590] = true;
        C9797c.m45708c(z);
        $jacocoInit[591] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[592] = true;
    }

    @Deprecated
    public static void setExtendedBugReportState(ExtendedBugReport.State state) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[772] = true;
        $jacocoInit[773] = true;
        Parameter type = parameter.setName("state").setType(ExtendedBugReport.State.class);
        $jacocoInit[774] = true;
        Parameter[] parameterArr = {type.setValue(state)};
        $jacocoInit[775] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[776] = true;
        C9796b.m45680a(state);
        $jacocoInit[777] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[778] = true;
    }

    @Deprecated
    public static void setFileAttachment(Uri uri, @C0195i0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[462] = true;
        $jacocoInit[463] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[464] = true;
        $jacocoInit[465] = true;
        Parameter[] parameterArr = {parameter.setName("fileUri").setType(Uri.class), parameter2.setName("fileNameWithExtension").setType(String.class)};
        $jacocoInit[466] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[467] = true;
        addFileAttachment(uri, str);
        $jacocoInit[468] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[469] = true;
    }

    @Deprecated
    public static void setFloatingButtonEdge(@C0193h0 InstabugFloatingButtonEdge instabugFloatingButtonEdge) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[730] = true;
        $jacocoInit[731] = true;
        Parameter type = parameter.setName("instabugFloatingButtonEdge").setType(InstabugFloatingButtonEdge.class);
        $jacocoInit[732] = true;
        Parameter[] parameterArr = {type.setValue(instabugFloatingButtonEdge)};
        $jacocoInit[733] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[734] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[735] = true;
        currentInvocationSettings.setFloatingButtonEdge(instabugFloatingButtonEdge);
        $jacocoInit[736] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[737] = true;
    }

    @Deprecated
    public static void setFloatingButtonOffsetFromTop(@C0237z(from = 0) int i) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[738] = true;
        Parameter name = parameter.setName("floatingButtonOffsetFromTop");
        Class cls = Integer.TYPE;
        $jacocoInit[739] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[740] = true;
        Parameter[] parameterArr = {type.setValue(Integer.toString(i))};
        $jacocoInit[741] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[742] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[743] = true;
        currentInvocationSettings.setFloatingButtonOffsetFromTop(i);
        $jacocoInit[744] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[745] = true;
    }

    @Deprecated
    public static void setGLSurfaceView(@C0193h0 GLSurfaceView gLSurfaceView) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[385] = true;
        $jacocoInit[386] = true;
        Parameter[] parameterArr = {parameter.setName("surfaceView").setType(GLSurfaceView.class)};
        $jacocoInit[387] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[388] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[389] = true;
    }

    public static void setInAppReplyNotificationSound(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[310] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[311] = true;
        Parameter name = parameter.setName("shouldPlaySound");
        Class cls = Boolean.TYPE;
        $jacocoInit[312] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[313] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[314] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[315] = true;
        C9797c.m45709d(z);
        $jacocoInit[316] = true;
    }

    @Deprecated
    public static void setIntroMessageEnabled(boolean z) {
        WelcomeMessage.State state;
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[657] = true;
        Parameter name = parameter.setName(Enabled.ELEMENT);
        Class cls = Boolean.TYPE;
        $jacocoInit[658] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[659] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[660] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[661] = true;
        if (z) {
            state = WelcomeMessage.State.LIVE;
            $jacocoInit[662] = true;
        } else {
            state = WelcomeMessage.State.DISABLED;
            $jacocoInit[663] = true;
        }
        setWelcomeMessageState(state);
        $jacocoInit[664] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[665] = true;
    }

    public static void setLocale(Locale locale) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[102] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[103] = true;
        $jacocoInit[104] = true;
        Parameter type = parameter.setName(com.instabug.library.model.State.KEY_LOCALE).setType(Locale.class);
        $jacocoInit[105] = true;
        Parameter[] parameterArr = {type.setValue(locale)};
        $jacocoInit[106] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[107] = true;
        SettingsManager.getInstance().setInstabugLocale(locale);
        $jacocoInit[108] = true;
    }

    @Deprecated
    public static void setNewMessageHandler(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        C9797c.m45696a(runnable);
        $jacocoInit[490] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[491] = true;
    }

    public static void setNotificationIcon(@C0213q int i) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[232] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[233] = true;
        Parameter name = parameter.setName("notificationIcon");
        Class cls = Integer.TYPE;
        $jacocoInit[234] = true;
        Parameter[] parameterArr = {name.setType(cls)};
        $jacocoInit[235] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[236] = true;
        C9797c.m45694a(i);
        $jacocoInit[237] = true;
    }

    public static void setOnNewReplyReceivedCallback(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[293] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[294] = true;
        C9797c.m45696a(runnable);
        $jacocoInit[295] = true;
    }

    @Deprecated
    public static void setOnSdkDismissedCallback(OnSdkDismissedCallback onSdkDismissedCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[482] = true;
        $jacocoInit[483] = true;
        Parameter[] parameterArr = {parameter.setName("onSdkDismissedCallback").setType(OnSdkDismissedCallback.class)};
        $jacocoInit[484] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[485] = true;
        C9796b.m45679a(onSdkDismissedCallback);
        $jacocoInit[486] = true;
        C9797c.m45695a(onSdkDismissedCallback);
        $jacocoInit[487] = true;
        SettingsManager.getInstance().setOnSdkDismissedCallback(onSdkDismissedCallback);
        $jacocoInit[488] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[489] = true;
    }

    @Deprecated
    public static void setOnSdkInvokedCallback(OnSdkInvokedCallback onSdkInvokedCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[470] = true;
        $jacocoInit[471] = true;
        Parameter[] parameterArr = {parameter.setName("onSdkInvokedCallback").setType(OnSdkInvokedCallback.class)};
        $jacocoInit[472] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[473] = true;
        SettingsManager.getInstance().setOnSdkInvokedCallback(onSdkInvokedCallback);
        $jacocoInit[474] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[475] = true;
    }

    @Deprecated
    public static void setPreInvocation(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[476] = true;
        $jacocoInit[477] = true;
        Parameter[] parameterArr = {parameter.setName("preSdkInvocationRunnable").setType(Runnable.class)};
        $jacocoInit[478] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[479] = true;
        SettingsManager.getInstance().setOnInvokeCallback(new C9693a(runnable));
        $jacocoInit[480] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[481] = true;
    }

    @Deprecated
    public static void setPreSendingRunnable(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[451] = true;
        $jacocoInit[452] = true;
        Parameter[] parameterArr = {parameter.setName("preSendingRunnable").setType(Runnable.class)};
        $jacocoInit[453] = true;
        instance.catchDeprecatedLoggingApiUsage(parameterArr);
        $jacocoInit[454] = true;
        SettingsManager.getInstance().setPreReportRunnable(runnable);
        $jacocoInit[455] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[456] = true;
    }

    @Deprecated
    public static void setPreShowingSurveyRunnable(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[571] = true;
        C9800f.m45720a(runnable);
        $jacocoInit[572] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[573] = true;
    }

    public static void setPrimaryColor(@C0198k int i) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[14] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[15] = true;
        Parameter name = parameter.setName("primaryColorValue");
        Class cls = Integer.TYPE;
        $jacocoInit[16] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[17] = true;
        Parameter[] parameterArr = {type.setValue(String.valueOf(i))};
        $jacocoInit[18] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[19] = true;
        SettingsManager.getInstance().setPrimaryColor(i);
        $jacocoInit[20] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013d  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setPromptOptionsEnabled(boolean r8, boolean r9, boolean r10) {
        /*
            boolean[] r0 = $jacocoInit()
            com.instabug.library.analytics.AnalyticsObserver r1 = com.instabug.library.analytics.AnalyticsObserver.getInstance()
            r2 = 3
            com.instabug.library.analytics.model.Api$Parameter[] r2 = new com.instabug.library.analytics.model.Api.Parameter[r2]
            com.instabug.library.analytics.model.Api$Parameter r3 = new com.instabug.library.analytics.model.Api$Parameter
            r3.<init>()
            r4 = 1
            r5 = 600(0x258, float:8.41E-43)
            r0[r5] = r4
            java.lang.String r5 = "chat"
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setName(r5)
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r6 = 601(0x259, float:8.42E-43)
            r0[r6] = r4
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setType(r5)
            r5 = 602(0x25a, float:8.44E-43)
            r0[r5] = r4
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setValue(r5)
            r5 = 0
            r2[r5] = r3
            com.instabug.library.analytics.model.Api$Parameter r3 = new com.instabug.library.analytics.model.Api$Parameter
            r3.<init>()
            r6 = 603(0x25b, float:8.45E-43)
            r0[r6] = r4
            java.lang.String r6 = "bug"
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setName(r6)
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r7 = 604(0x25c, float:8.46E-43)
            r0[r7] = r4
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setType(r6)
            r6 = 605(0x25d, float:8.48E-43)
            r0[r6] = r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setValue(r6)
            r2[r4] = r3
            com.instabug.library.analytics.model.Api$Parameter r3 = new com.instabug.library.analytics.model.Api$Parameter
            r3.<init>()
            r6 = 606(0x25e, float:8.49E-43)
            r0[r6] = r4
            java.lang.String r6 = "feedback"
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setName(r6)
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r7 = 607(0x25f, float:8.5E-43)
            r0[r7] = r4
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setType(r6)
            r6 = 608(0x260, float:8.52E-43)
            r0[r6] = r4
            java.lang.String r6 = java.lang.Boolean.toString(r10)
            com.instabug.library.analytics.model.Api$Parameter r3 = r3.setValue(r6)
            r6 = 2
            r2[r6] = r3
            r3 = 609(0x261, float:8.53E-43)
            r0[r3] = r4
            r1.catchDeprecatedApiUsage(r2)
            r1 = 610(0x262, float:8.55E-43)
            r0[r1] = r4
            com.instabug.library.invocation.InvocationManager r1 = com.instabug.library.invocation.InvocationManager.getInstance()
            com.instabug.library.invocation.InvocationSettings r1 = r1.getCurrentInvocationSettings()
            r2 = 4
            if (r8 == 0) goto L_0x00a5
            r3 = 611(0x263, float:8.56E-43)
            r0[r3] = r4
            r1.enabledPromptOption(r2)
            r3 = 612(0x264, float:8.58E-43)
            r0[r3] = r4
            goto L_0x00ac
        L_0x00a5:
            r1.disabledPromptOption(r2)
            r3 = 613(0x265, float:8.59E-43)
            r0[r3] = r4
        L_0x00ac:
            if (r9 == 0) goto L_0x00ba
            r3 = 614(0x266, float:8.6E-43)
            r0[r3] = r4
            r1.enabledPromptOption(r4)
            r3 = 615(0x267, float:8.62E-43)
            r0[r3] = r4
            goto L_0x00c1
        L_0x00ba:
            r1.disabledPromptOption(r4)
            r3 = 616(0x268, float:8.63E-43)
            r0[r3] = r4
        L_0x00c1:
            if (r10 == 0) goto L_0x00cf
            r3 = 617(0x269, float:8.65E-43)
            r0[r3] = r4
            r1.enabledPromptOption(r6)
            r3 = 618(0x26a, float:8.66E-43)
            r0[r3] = r4
            goto L_0x00d6
        L_0x00cf:
            r1.disabledPromptOption(r6)
            r3 = 619(0x26b, float:8.67E-43)
            r0[r3] = r4
        L_0x00d6:
            if (r8 != 0) goto L_0x00dd
            r3 = 620(0x26c, float:8.69E-43)
            r0[r3] = r4
            goto L_0x00ef
        L_0x00dd:
            if (r9 == 0) goto L_0x00e4
            r2 = 621(0x26d, float:8.7E-43)
            r0[r2] = r4
            goto L_0x012f
        L_0x00e4:
            if (r10 == 0) goto L_0x00eb
            r2 = 622(0x26e, float:8.72E-43)
            r0[r2] = r4
            goto L_0x012f
        L_0x00eb:
            r3 = 623(0x26f, float:8.73E-43)
            r0[r3] = r4
        L_0x00ef:
            if (r9 != 0) goto L_0x00f6
            r3 = 624(0x270, float:8.74E-43)
            r0[r3] = r4
            goto L_0x00fc
        L_0x00f6:
            if (r10 != 0) goto L_0x012b
            r3 = 625(0x271, float:8.76E-43)
            r0[r3] = r4
        L_0x00fc:
            if (r8 == 0) goto L_0x010a
            r3 = 628(0x274, float:8.8E-43)
            r0[r3] = r4
            r1.setDefaultInvocationMode(r2)
            r2 = 629(0x275, float:8.81E-43)
            r0[r2] = r4
            goto L_0x0136
        L_0x010a:
            if (r9 == 0) goto L_0x0118
            r2 = 630(0x276, float:8.83E-43)
            r0[r2] = r4
            r1.setDefaultInvocationMode(r4)
            r2 = 631(0x277, float:8.84E-43)
            r0[r2] = r4
            goto L_0x0136
        L_0x0118:
            if (r10 != 0) goto L_0x011f
            r2 = 632(0x278, float:8.86E-43)
            r0[r2] = r4
            goto L_0x0136
        L_0x011f:
            r2 = 633(0x279, float:8.87E-43)
            r0[r2] = r4
            r1.setDefaultInvocationMode(r6)
            r2 = 634(0x27a, float:8.88E-43)
            r0[r2] = r4
            goto L_0x0136
        L_0x012b:
            r2 = 626(0x272, float:8.77E-43)
            r0[r2] = r4
        L_0x012f:
            r1.setDefaultInvocationMode(r5)
            r2 = 627(0x273, float:8.79E-43)
            r0[r2] = r4
        L_0x0136:
            if (r8 == 0) goto L_0x013d
            r8 = 635(0x27b, float:8.9E-43)
            r0[r8] = r4
            goto L_0x015d
        L_0x013d:
            if (r9 == 0) goto L_0x0144
            r8 = 636(0x27c, float:8.91E-43)
            r0[r8] = r4
            goto L_0x015d
        L_0x0144:
            if (r10 == 0) goto L_0x014b
            r8 = 637(0x27d, float:8.93E-43)
            r0[r8] = r4
            goto L_0x015d
        L_0x014b:
            r8 = 638(0x27e, float:8.94E-43)
            r0[r8] = r4
            r1.enabledPromptOption(r4)
            r8 = 639(0x27f, float:8.95E-43)
            r0[r8] = r4
            r1.setDefaultInvocationMode(r4)
            r8 = 640(0x280, float:8.97E-43)
            r0[r8] = r4
        L_0x015d:
            com.instabug.library.util.InstabugDeprecationLogger r8 = com.instabug.library.util.InstabugDeprecationLogger.getInstance()
            r8.log()
            r8 = 641(0x281, float:8.98E-43)
            r0[r8] = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.Instabug.setPromptOptionsEnabled(boolean, boolean, boolean):void");
    }

    @RequiresApi(api = 26)
    public static void setPushNotificationChannelId(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[267] = true;
        C9797c.m45704b(str);
        $jacocoInit[268] = true;
    }

    public static void setPushNotificationRegistrationToken(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[148] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[149] = true;
        $jacocoInit[150] = true;
        Parameter[] parameterArr = {parameter.setName("token").setType(String.class)};
        $jacocoInit[151] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[152] = true;
        C9797c.m45697a(str);
        $jacocoInit[153] = true;
    }

    public static void setReplyNotificationEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[296] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[297] = true;
        Parameter name = parameter.setName("isReplyNotificationEnabled");
        Class cls = Boolean.TYPE;
        $jacocoInit[298] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[299] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[300] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[301] = true;
        C9797c.m45698a(z);
        $jacocoInit[302] = true;
    }

    @Deprecated
    public static void setReportCategories(List<ReportCategory> list) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[524] = true;
        $jacocoInit[525] = true;
        Parameter[] parameterArr = {parameter.setName("reportCategories").setType(List.class)};
        $jacocoInit[526] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[527] = true;
        C9796b.m45686b(list);
        $jacocoInit[528] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[529] = true;
    }

    public static void setReproStepsState(com.instabug.library.visualusersteps.State state) {
        boolean[] $jacocoInit = $jacocoInit();
        if (state == com.instabug.library.visualusersteps.State.ENABLED) {
            $jacocoInit[283] = true;
            C9780c.m45631b().mo34865a(Feature.REPRO_STEPS, State.ENABLED);
            $jacocoInit[284] = true;
            SettingsManager.getInstance().setReproStepsScreenshotEnabled(true);
            $jacocoInit[285] = true;
        } else if (state == com.instabug.library.visualusersteps.State.ENABLED_WITH_NO_SCREENSHOTS) {
            $jacocoInit[286] = true;
            C9780c.m45631b().mo34865a(Feature.REPRO_STEPS, State.ENABLED);
            $jacocoInit[287] = true;
            SettingsManager.getInstance().setReproStepsScreenshotEnabled(false);
            $jacocoInit[288] = true;
        } else if (state != com.instabug.library.visualusersteps.State.DISABLED) {
            $jacocoInit[289] = true;
        } else {
            $jacocoInit[290] = true;
            C9780c.m45631b().mo34865a(Feature.REPRO_STEPS, State.DISABLED);
            $jacocoInit[291] = true;
        }
        $jacocoInit[292] = true;
    }

    @Deprecated
    public static void setRequestedOrientation(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[577] = true;
        SettingsManager.getInstance().setRequestedOrientation(i);
        $jacocoInit[578] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[579] = true;
    }

    public static void setSessionProfilerState(@C0193h0 State state) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[269] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[270] = true;
        $jacocoInit[271] = true;
        Parameter type = parameter.setName("state").setType(State.class);
        $jacocoInit[272] = true;
        Parameter[] parameterArr = {type.setValue(state)};
        $jacocoInit[273] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[274] = true;
        C9780c.m45631b().mo34865a(Feature.SESSION_PROFILER, state);
        $jacocoInit[275] = true;
    }

    @Deprecated
    public static void setShakingThreshold(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[642] = true;
        Parameter name = parameter.setName("threshold");
        Class cls = Integer.TYPE;
        $jacocoInit[643] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[644] = true;
        Parameter[] parameterArr = {type.setValue(Integer.toString(i))};
        $jacocoInit[645] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[646] = true;
        InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
        $jacocoInit[647] = true;
        currentInvocationSettings.setShakingThreshold(i);
        $jacocoInit[648] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[649] = true;
    }

    @Deprecated
    public static void setShouldAudioRecordingOptionAppear(boolean z) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[342] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[343] = true;
    }

    public static void setShouldPlayConversationSounds(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[207] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[208] = true;
        Parameter name = parameter.setName("shouldPlaySounds");
        Class cls = Boolean.TYPE;
        $jacocoInit[209] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[210] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[211] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[212] = true;
        C9797c.m45706b(z);
        $jacocoInit[213] = true;
    }

    @Deprecated
    public static void setShouldShowSurveysWelcomeScreen(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[782] = true;
        C9800f.m45725b(z);
        $jacocoInit[783] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[784] = true;
    }

    public static void setState(InstabugState instabugState) {
        boolean[] $jacocoInit = $jacocoInit();
        INSTABUG_STATE = instabugState;
        $jacocoInit[70] = true;
    }

    @Deprecated
    public static void setSuccessDialogEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[650] = true;
        Parameter name = parameter.setName(Enabled.ELEMENT);
        Class cls = Boolean.TYPE;
        $jacocoInit[651] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[652] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[653] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[654] = true;
        C9796b.m45690d(z);
        $jacocoInit[655] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[656] = true;
    }

    @Deprecated
    public static void setSurveysAutoShowing(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[564] = true;
        $jacocoInit[565] = true;
        Parameter type = parameter.setName("isSurveysAutoShowing").setType(Boolean.class);
        $jacocoInit[566] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[567] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[568] = true;
        C9800f.m45721a(z);
        $jacocoInit[569] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[570] = true;
    }

    public static void setSystemReplyNotificationSoundEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[303] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[304] = true;
        Parameter name = parameter.setName("setSystemReplyNotificationSoundEnabled");
        Class cls = Boolean.TYPE;
        $jacocoInit[305] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[306] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[307] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[308] = true;
        C9797c.m45708c(z);
        $jacocoInit[309] = true;
    }

    @Deprecated
    public static void setTheme(@C0193h0 InstabugColorTheme instabugColorTheme) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[712] = true;
        $jacocoInit[713] = true;
        Parameter type = parameter.setName("instabugTheme").setType(InstabugColorTheme.class);
        $jacocoInit[714] = true;
        Parameter[] parameterArr = {type.setValue(instabugColorTheme)};
        $jacocoInit[715] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[716] = true;
        SettingsManager.getInstance().setTheme(instabugColorTheme);
        $jacocoInit[717] = true;
        int i = C9694b.f25682a[instabugColorTheme.ordinal()];
        if (i == 1) {
            SettingsManager.getInstance().setPrimaryColor(-9580554);
            $jacocoInit[719] = true;
            SettingsManager.getInstance().setStatusBarColor(-16119286);
            $jacocoInit[720] = true;
        } else if (i != 2) {
            $jacocoInit[718] = true;
        } else {
            SettingsManager.getInstance().setPrimaryColor(-15893761);
            $jacocoInit[721] = true;
            SettingsManager.getInstance().setStatusBarColor(-3815737);
            $jacocoInit[722] = true;
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[723] = true;
    }

    @Deprecated
    public static void setThresholdForReshowingSurveyAfterDismiss(int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[561] = true;
        C9800f.m45719a(i, i2);
        $jacocoInit[562] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[563] = true;
    }

    public static void setTrackingUserStepsState(@C0193h0 State state) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[276] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[277] = true;
        $jacocoInit[278] = true;
        Parameter type = parameter.setName("state").setType(State.class);
        $jacocoInit[279] = true;
        Parameter[] parameterArr = {type.setValue(state)};
        $jacocoInit[280] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[281] = true;
        C9780c.m45631b().mo34865a(Feature.TRACK_USER_STEPS, state);
        $jacocoInit[282] = true;
    }

    public static void setUserAttribute(@C0193h0 String str, String str2) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[181] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[182] = true;
        $jacocoInit[183] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[184] = true;
        $jacocoInit[185] = true;
        Parameter[] parameterArr = {parameter.setName("key").setType(String.class), parameter2.setName("value").setType(String.class)};
        $jacocoInit[186] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[187] = true;
        String trimString = StringUtility.trimString(str2);
        $jacocoInit[188] = true;
        UserAttributesCacheManager.putAttribute(str, trimString);
        $jacocoInit[189] = true;
    }

    public static void setUserData(@C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[45] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[46] = true;
        $jacocoInit[47] = true;
        Parameter[] parameterArr = {parameter.setName("userData").setType(String.class)};
        $jacocoInit[48] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[49] = true;
        if (C9780c.m45631b().mo34869b(Feature.USER_DATA) != State.ENABLED) {
            $jacocoInit[50] = true;
        } else {
            $jacocoInit[51] = true;
            String trimString = StringUtility.trimString(str);
            $jacocoInit[52] = true;
            SettingsManager.getInstance().setUserData(trimString);
            $jacocoInit[53] = true;
        }
        $jacocoInit[54] = true;
    }

    @Deprecated
    public static void setUserEmail(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[499] = true;
        $jacocoInit[500] = true;
        Parameter[] parameterArr = {parameter.setName("email").setType(String.class)};
        $jacocoInit[501] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[502] = true;
        C10009a.m46599d(str);
        $jacocoInit[503] = true;
    }

    @Deprecated
    public static void setUsername(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[504] = true;
        $jacocoInit[505] = true;
        Parameter[] parameterArr = {parameter.setName("username").setType(String.class)};
        $jacocoInit[506] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[507] = true;
        C10009a.m46591a(str);
        $jacocoInit[508] = true;
    }

    @Deprecated
    public static void setVideoRecordingFloatingButtonCorner(@C0193h0 InstabugVideoRecordingButtonCorner instabugVideoRecordingButtonCorner) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[746] = true;
        $jacocoInit[747] = true;
        Parameter type = parameter.setName("instabugViewRecordingButtonCorner").setType(InstabugVideoRecordingButtonCorner.class);
        $jacocoInit[748] = true;
        Parameter[] parameterArr = {type.setValue(instabugVideoRecordingButtonCorner)};
        $jacocoInit[749] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[750] = true;
        int i = C9694b.f25686e[instabugVideoRecordingButtonCorner.ordinal()];
        if (i == 1) {
            InvocationSettings currentInvocationSettings = InvocationManager.getInstance().getCurrentInvocationSettings();
            InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition = InstabugVideoRecordingButtonPosition.TOP_LEFT;
            $jacocoInit[752] = true;
            currentInvocationSettings.setVideoRecordingButtonPosition(instabugVideoRecordingButtonPosition);
            $jacocoInit[753] = true;
        } else if (i == 2) {
            InvocationSettings currentInvocationSettings2 = InvocationManager.getInstance().getCurrentInvocationSettings();
            InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition2 = InstabugVideoRecordingButtonPosition.TOP_RIGHT;
            $jacocoInit[754] = true;
            currentInvocationSettings2.setVideoRecordingButtonPosition(instabugVideoRecordingButtonPosition2);
            $jacocoInit[755] = true;
        } else if (i == 3) {
            InvocationSettings currentInvocationSettings3 = InvocationManager.getInstance().getCurrentInvocationSettings();
            InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition3 = InstabugVideoRecordingButtonPosition.BOTTOM_RIGHT;
            $jacocoInit[756] = true;
            currentInvocationSettings3.setVideoRecordingButtonPosition(instabugVideoRecordingButtonPosition3);
            $jacocoInit[757] = true;
        } else if (i != 4) {
            $jacocoInit[751] = true;
        } else {
            InvocationSettings currentInvocationSettings4 = InvocationManager.getInstance().getCurrentInvocationSettings();
            InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition4 = InstabugVideoRecordingButtonPosition.BOTTOM_LEFT;
            $jacocoInit[758] = true;
            currentInvocationSettings4.setVideoRecordingButtonPosition(instabugVideoRecordingButtonPosition4);
            $jacocoInit[759] = true;
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[760] = true;
    }

    public static void setViewHierarchyState(@C0193h0 State state) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[238] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[239] = true;
        $jacocoInit[240] = true;
        Parameter type = parameter.setName("state").setType(State.class);
        $jacocoInit[241] = true;
        Parameter[] parameterArr = {type.setValue(state)};
        $jacocoInit[242] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[243] = true;
        C9780c.m45631b().mo34865a(Feature.VIEW_HIERARCHY, state);
        $jacocoInit[244] = true;
    }

    public static void setWelcomeMessageState(WelcomeMessage.State state) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[214] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[215] = true;
        $jacocoInit[216] = true;
        Parameter type = parameter.setName("WelcomeMessageState").setType(String.class);
        $jacocoInit[217] = true;
        Parameter[] parameterArr = {type.setValue(state.toString())};
        $jacocoInit[218] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[219] = true;
        SettingsManager.getInstance().setWelcomeMessageState(state);
        $jacocoInit[220] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[221] = true;
    }

    @Deprecated
    public static void setWillSkipScreenshotAnnotation(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[706] = true;
        Parameter name = parameter.setName("willSkipInitialScreenshotAnnotating");
        Class cls = Boolean.TYPE;
        $jacocoInit[707] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[708] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[709] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[710] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[711] = true;
    }

    @Deprecated
    static boolean shouldAudioRecordingOptionAppear() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[344] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[345] = true;
        return false;
    }

    @Deprecated
    public static void showFeatureRequests() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[779] = true;
        C9799e.m45714a();
        $jacocoInit[780] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[781] = true;
    }

    @Deprecated
    public static void showIntroMessage() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[425] = true;
        getInstance().delegate.mo34830a(WelcomeMessage.State.LIVE);
        $jacocoInit[426] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[427] = true;
    }

    public static void showNotification(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[136] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[137] = true;
        $jacocoInit[138] = true;
        Parameter[] parameterArr = {parameter.setName("data").setType(Bundle.class)};
        $jacocoInit[139] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[140] = true;
        C9797c.m45703b(bundle);
        $jacocoInit[141] = true;
    }

    @Deprecated
    public static boolean showSurvey(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[724] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[725] = true;
        boolean a = C9800f.m45723a(str);
        $jacocoInit[726] = true;
        return a;
    }

    @Deprecated
    public static boolean showValidSurvey() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[549] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[550] = true;
        boolean a = C9800f.m45722a();
        $jacocoInit[551] = true;
        return a;
    }

    public static void showWelcomeMessage(WelcomeMessage.State state) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[222] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[223] = true;
        $jacocoInit[224] = true;
        Parameter type = parameter.setName("showWelcomeMessage").setType(String.class);
        $jacocoInit[225] = true;
        Parameter[] parameterArr = {type.setValue(state.toString())};
        $jacocoInit[226] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[227] = true;
        if (InstabugCore.isForegroundBusy()) {
            $jacocoInit[228] = true;
        } else {
            $jacocoInit[229] = true;
            getInstance().delegate.mo34830a(state);
            $jacocoInit[230] = true;
        }
        $jacocoInit[231] = true;
    }

    private Instabug(@C0193h0 C9764b bVar) {
        boolean[] $jacocoInit = $jacocoInit();
        this.delegate = bVar;
        $jacocoInit[0] = true;
    }

    @Deprecated
    public static void invoke(@C0193h0 InstabugInvocationMode instabugInvocationMode) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[390] = true;
        $jacocoInit[391] = true;
        Parameter type = parameter.setName("instabugInvocationMode").setType(InstabugInvocationMode.class);
        $jacocoInit[392] = true;
        Parameter[] parameterArr = {type.setValue(instabugInvocationMode.toString())};
        $jacocoInit[393] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[394] = true;
        int i = C9694b.f25684c[instabugInvocationMode.ordinal()];
        if (i == 1) {
            InvocationManager.getInstance().invoke(1);
            $jacocoInit[395] = true;
        } else if (i == 2) {
            InvocationManager.getInstance().invoke(2);
            $jacocoInit[396] = true;
        } else if (i == 3) {
            InvocationManager.getInstance().invoke(3);
            $jacocoInit[397] = true;
        } else if (i != 4) {
            InvocationManager.getInstance().invoke(0);
            $jacocoInit[399] = true;
        } else {
            InvocationManager.getInstance().invoke(4);
            $jacocoInit[398] = true;
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[400] = true;
    }

    @Deprecated
    public static void setEmailFieldRequired(boolean z, int... iArr) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[683] = true;
        Parameter name = parameter.setName("emailFieldRequired");
        Class cls = Boolean.TYPE;
        $jacocoInit[684] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[685] = true;
        Parameter value = type.setValue(Boolean.valueOf(z));
        int i = 0;
        Parameter parameter2 = new Parameter();
        $jacocoInit[686] = true;
        $jacocoInit[687] = true;
        Parameter value2 = parameter2.setName("actions").setValue(String.class);
        $jacocoInit[688] = true;
        Parameter[] parameterArr = {value, value2.setValue(Arrays.toString(iArr))};
        $jacocoInit[689] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        if (iArr == null) {
            $jacocoInit[690] = true;
        } else if (iArr.length == 0) {
            $jacocoInit[691] = true;
        } else {
            int length = iArr.length;
            $jacocoInit[695] = true;
            while (i < length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 == 2) {
                        C9796b.m45683a(z);
                        $jacocoInit[701] = true;
                    } else if (i2 == 4) {
                        C9799e.m45715a(z);
                        $jacocoInit[702] = true;
                    } else if (i2 != 8) {
                        $jacocoInit[697] = true;
                    } else {
                        C9799e.m45717b(z);
                        $jacocoInit[703] = true;
                    }
                    i++;
                    $jacocoInit[704] = true;
                } else {
                    C9796b.m45683a(z);
                    $jacocoInit[698] = true;
                    C9799e.m45715a(z);
                    $jacocoInit[699] = true;
                    C9799e.m45717b(z);
                    $jacocoInit[700] = true;
                    return;
                }
            }
            $jacocoInit[696] = true;
            InstabugDeprecationLogger.getInstance().log();
            $jacocoInit[705] = true;
        }
        C9796b.m45683a(z);
        $jacocoInit[692] = true;
        C9799e.m45715a(z);
        $jacocoInit[693] = true;
        C9799e.m45717b(z);
        $jacocoInit[694] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[705] = true;
    }

    public static boolean isInstabugNotification(Map<String, String> map) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[130] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[131] = true;
        $jacocoInit[132] = true;
        Parameter[] parameterArr = {parameter.setName("data").setType(Map.class)};
        $jacocoInit[133] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[134] = true;
        boolean a = C9797c.m45701a(map);
        $jacocoInit[135] = true;
        return a;
    }

    @Deprecated
    public static void logUserEvent(@C0193h0 String str, UserEventParam... userEventParamArr) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[788] = true;
        $jacocoInit[789] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[790] = true;
        $jacocoInit[791] = true;
        Parameter[] parameterArr = {parameter.setName("eventIdentifier").setType(String.class), parameter2.setName("userEventParams").setType(UserEventParam.class)};
        $jacocoInit[792] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[793] = true;
        InstabugUserEventLogger.getInstance().logUserEvent(str, userEventParamArr);
        $jacocoInit[794] = true;
    }

    @Deprecated
    public static void reportException(@C0193h0 Throwable th, @C0195i0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[443] = true;
        $jacocoInit[444] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[445] = true;
        $jacocoInit[446] = true;
        Parameter[] parameterArr = {parameter.setName("throwable").setType(Throwable.class), parameter2.setName("exceptionIdentifier").setType(String.class)};
        $jacocoInit[447] = true;
        instance.catchDeprecatedLoggingApiUsage(parameterArr);
        $jacocoInit[448] = true;
        C9798d.m45712a(th, str);
        $jacocoInit[449] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[450] = true;
    }

    @Deprecated
    public static void setCustomTextPlaceHolders(IBGCustomTextPlaceHolder iBGCustomTextPlaceHolder) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[552] = true;
        $jacocoInit[553] = true;
        Parameter[] parameterArr = {parameter.setName("ibgCustomTextPlaceHolder").setType(IBGCustomTextPlaceHolder.class)};
        $jacocoInit[554] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[555] = true;
        InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder = new InstabugCustomTextPlaceHolder();
        $jacocoInit[556] = true;
        HashMap convertedHashMap = iBGCustomTextPlaceHolder.getConvertedHashMap();
        $jacocoInit[557] = true;
        instabugCustomTextPlaceHolder.setPlaceHoldersMap(convertedHashMap);
        $jacocoInit[558] = true;
        setCustomTextPlaceHolders(instabugCustomTextPlaceHolder);
        $jacocoInit[559] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[560] = true;
    }

    public static void showNotification(Map<String, String> map) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[142] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[143] = true;
        $jacocoInit[144] = true;
        Parameter[] parameterArr = {parameter.setName("data").setType(Map.class)};
        $jacocoInit[145] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[146] = true;
        C9797c.m45705b(map);
        $jacocoInit[147] = true;
    }

    @Deprecated
    public static void changeInvocationEvent(@C0193h0 IBGInvocationEvent iBGInvocationEvent) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[353] = true;
        $jacocoInit[354] = true;
        Parameter type = parameter.setName("invocationEvent").setType(IBGInvocationEvent.class);
        $jacocoInit[355] = true;
        Parameter[] parameterArr = {type.setValue(iBGInvocationEvent)};
        $jacocoInit[356] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[357] = true;
        int i = C9694b.f25683b[iBGInvocationEvent.ordinal()];
        if (i == 1) {
            changeInvocationEvent(InstabugInvocationEvent.NONE);
            $jacocoInit[359] = true;
        } else if (i == 2) {
            changeInvocationEvent(InstabugInvocationEvent.SHAKE);
            $jacocoInit[360] = true;
        } else if (i == 3) {
            changeInvocationEvent(InstabugInvocationEvent.FLOATING_BUTTON);
            $jacocoInit[361] = true;
        } else if (i == 4) {
            changeInvocationEvent(InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT);
            $jacocoInit[362] = true;
        } else if (i != 5) {
            $jacocoInit[358] = true;
        } else {
            changeInvocationEvent(InstabugInvocationEvent.SCREENSHOT_GESTURE);
            $jacocoInit[363] = true;
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[364] = true;
    }

    public static void addFileAttachment(@C0193h0 byte[] bArr, @C0193h0 String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[31] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[32] = true;
        $jacocoInit[33] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[34] = true;
        $jacocoInit[35] = true;
        Parameter[] parameterArr = {parameter.setName("data").setType(Uri.class), parameter2.setName("fileNameWithExtension").setType(String.class)};
        $jacocoInit[36] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[37] = true;
        SettingsManager.getInstance().addExtraAttachmentFile(bArr, str);
        $jacocoInit[38] = true;
    }

    @Deprecated
    public static void setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[530] = true;
        Parameter name = parameter.setName("initialScreenshot");
        Class cls = Boolean.TYPE;
        $jacocoInit[531] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[532] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[533] = true;
        Parameter name2 = parameter2.setName("extraScreenshot");
        Class cls2 = Boolean.TYPE;
        $jacocoInit[534] = true;
        Parameter type2 = name2.setType(cls2);
        $jacocoInit[535] = true;
        Parameter parameter3 = new Parameter();
        $jacocoInit[536] = true;
        Parameter name3 = parameter3.setName("galleryImage");
        Class cls3 = Boolean.TYPE;
        $jacocoInit[537] = true;
        Parameter type3 = name3.setType(cls3);
        $jacocoInit[538] = true;
        Parameter parameter4 = new Parameter();
        $jacocoInit[539] = true;
        Parameter name4 = parameter4.setName("voiceNote");
        Class cls4 = Boolean.TYPE;
        $jacocoInit[540] = true;
        Parameter type4 = name4.setType(cls4);
        $jacocoInit[541] = true;
        Parameter parameter5 = new Parameter();
        $jacocoInit[542] = true;
        Parameter name5 = parameter5.setName("screenRecording");
        Class cls5 = Boolean.TYPE;
        $jacocoInit[543] = true;
        Parameter type5 = name5.setType(cls5);
        $jacocoInit[544] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z)), type2.setValue(Boolean.valueOf(z2)), type3.setValue(Boolean.valueOf(z3)), type4.setValue(Boolean.valueOf(z4)), type5.setValue(Boolean.valueOf(z5))};
        $jacocoInit[545] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[546] = true;
        setAttachmentTypesEnabled(z, z2, z3, z5);
        $jacocoInit[547] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[548] = true;
    }

    @Deprecated
    public static void invoke(@C0193h0 IBGInvocationMode iBGInvocationMode) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[404] = true;
        $jacocoInit[405] = true;
        Parameter type = parameter.setName("invocationMode").setType(IBGInvocationMode.class);
        $jacocoInit[406] = true;
        Parameter[] parameterArr = {type.setValue(iBGInvocationMode)};
        $jacocoInit[407] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[408] = true;
        int i = C9694b.f25685d[iBGInvocationMode.ordinal()];
        if (i == 1) {
            invoke(InstabugInvocationMode.PROMPT_OPTION);
            $jacocoInit[410] = true;
        } else if (i == 2) {
            invoke(InstabugInvocationMode.NEW_BUG);
            $jacocoInit[411] = true;
        } else if (i != 3) {
            $jacocoInit[409] = true;
        } else {
            invoke(InstabugInvocationMode.NEW_FEEDBACK);
            $jacocoInit[412] = true;
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[413] = true;
    }
}
