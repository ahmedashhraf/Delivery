package com.instabug.chat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0213q;
import com.instabug.chat.C9377a.C9397d;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.network.InstabugPushNotificationTokenService;
import com.instabug.chat.p361ui.C9456b;
import com.instabug.chat.settings.AttachmentTypesState;
import com.instabug.chat.settings.C9441a;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.core.InstabugCore;
import java.util.Map;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugChat {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2279790569445035524L, "com/instabug/chat/InstabugChat", 184);
        $jacocoData = a;
        return a;
    }

    public InstabugChat() {
        $jacocoInit()[0] = true;
    }

    public static void enableConversationSound(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[130] = true;
        } else {
            $jacocoInit[131] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[132] = true;
            $jacocoInit[133] = true;
            Parameter type = parameter.setName("shouldPlaySounds").setType(Boolean.class);
            $jacocoInit[134] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
            $jacocoInit[135] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[136] = true;
            C9441a.m44199d(z);
            $jacocoInit[137] = true;
        }
        $jacocoInit[138] = true;
    }

    public static void enableInAppNotificationSound(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[62] = true;
        } else {
            $jacocoInit[63] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[64] = true;
            $jacocoInit[65] = true;
            Parameter type = parameter.setName(Enable.ELEMENT).setType(Boolean.class);
            $jacocoInit[66] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
            $jacocoInit[67] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[68] = true;
            C9441a.m44196c(z);
            $jacocoInit[69] = true;
        }
        $jacocoInit[70] = true;
    }

    public static void enableNotification(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[44] = true;
        } else {
            $jacocoInit[45] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[46] = true;
            $jacocoInit[47] = true;
            Parameter type = parameter.setName(Enable.ELEMENT).setType(Boolean.class);
            $jacocoInit[48] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
            $jacocoInit[49] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[50] = true;
            C9441a.m44190a(z);
            $jacocoInit[51] = true;
        }
        $jacocoInit[52] = true;
    }

    public static void enableSystemNotificationSound(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[53] = true;
        } else {
            $jacocoInit[54] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[55] = true;
            $jacocoInit[56] = true;
            Parameter type = parameter.setName("shouldPlaySound").setType(Boolean.class);
            $jacocoInit[57] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
            $jacocoInit[58] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[59] = true;
            C9441a.m44195b(z);
            $jacocoInit[60] = true;
        }
        $jacocoInit[61] = true;
    }

    public static int getUnreadMessagesCount() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        if (isReadyToRun()) {
            $jacocoInit[40] = true;
            AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
            $jacocoInit[41] = true;
            int unreadCount = ChatsCacheManager.getUnreadCount();
            $jacocoInit[42] = true;
            return unreadCount;
        }
        $jacocoInit[43] = true;
        return 0;
    }

    private static boolean isChatFeatureEnabled() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == State.ENABLED) {
            $jacocoInit[171] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[172] = true;
        }
        $jacocoInit[173] = true;
        return z;
    }

    public static boolean isInstabugNotification(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        if (isReadyToRun()) {
            $jacocoInit[100] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[101] = true;
            Parameter name = parameter.setName("data");
            $jacocoInit[102] = true;
            Parameter[] parameterArr = {name.setType(bundle.getClass())};
            $jacocoInit[103] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[104] = true;
            boolean b = C9397d.m43935a().mo33838b(bundle);
            $jacocoInit[105] = true;
            return b;
        }
        $jacocoInit[106] = true;
        return false;
    }

    private static boolean isReadyToRun() {
        boolean[] $jacocoInit = $jacocoInit();
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        boolean z = false;
        if (chatPlugin != null) {
            $jacocoInit[164] = true;
            if (!chatPlugin.isAppContextAvailable()) {
                $jacocoInit[165] = true;
            } else if (!isChatFeatureEnabled()) {
                $jacocoInit[166] = true;
            } else {
                $jacocoInit[167] = true;
                z = true;
                $jacocoInit[169] = true;
                return z;
            }
            $jacocoInit[168] = true;
            $jacocoInit[169] = true;
            return z;
        }
        $jacocoInit[170] = true;
        return false;
    }

    public static void openNewChat() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[10] = true;
        } else {
            $jacocoInit[11] = true;
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            if (chatPlugin == null) {
                $jacocoInit[12] = true;
            } else {
                $jacocoInit[13] = true;
                Context appContext = chatPlugin.getAppContext();
                if (appContext == null) {
                    $jacocoInit[14] = true;
                } else {
                    $jacocoInit[15] = true;
                    Intent b = C9456b.m44301b(appContext);
                    $jacocoInit[16] = true;
                    appContext.startActivity(b);
                    $jacocoInit[17] = true;
                }
            }
        }
        $jacocoInit[18] = true;
    }

    public static void resetDefaultInvocationMode() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            Instabug.resetDefaultInvocationMode();
            $jacocoInit[30] = true;
        }
        $jacocoInit[31] = true;
    }

    @Deprecated
    public static void setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[139] = true;
        } else {
            $jacocoInit[140] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[141] = true;
            $jacocoInit[142] = true;
            Parameter type = parameter.setName("extraScreenshot").setType(Boolean.class);
            $jacocoInit[143] = true;
            Parameter parameter2 = new Parameter();
            $jacocoInit[144] = true;
            $jacocoInit[145] = true;
            Parameter type2 = parameter2.setName("galleryImage").setType(Boolean.class);
            $jacocoInit[146] = true;
            Parameter parameter3 = new Parameter();
            $jacocoInit[147] = true;
            $jacocoInit[148] = true;
            Parameter type3 = parameter3.setName("screenRecording").setType(Boolean.class);
            $jacocoInit[149] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.toString(z)), type2.setValue(Boolean.toString(z2)), type3.setValue(Boolean.toString(z3))};
            $jacocoInit[150] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[151] = true;
            AttachmentTypesState attachmentTypesState = new AttachmentTypesState(z, z2, z3);
            $jacocoInit[152] = true;
            C9441a.m44185a(attachmentTypesState);
            $jacocoInit[153] = true;
        }
        $jacocoInit[154] = true;
    }

    @Deprecated
    public static void setDefaultInvocationMode(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            Instabug.setDefaultInvocationMode(i);
            $jacocoInit[26] = true;
        }
        $jacocoInit[27] = true;
    }

    @Deprecated
    public static void setNewMessageHandler(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[32] = true;
        } else {
            $jacocoInit[33] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[34] = true;
            Parameter name = parameter.setName("runnable");
            $jacocoInit[35] = true;
            Parameter[] parameterArr = {name.setType(runnable.getClass())};
            $jacocoInit[36] = true;
            instance.catchDeprecatedApiUsage(parameterArr);
            $jacocoInit[37] = true;
            C9441a.m44188a(runnable);
            $jacocoInit[38] = true;
        }
        $jacocoInit[39] = true;
    }

    public static void setNotificationIcon(@C0213q int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[71] = true;
        } else {
            $jacocoInit[72] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[73] = true;
            $jacocoInit[74] = true;
            Parameter[] parameterArr = {parameter.setName("notificationIcon").setType(Integer.class)};
            $jacocoInit[75] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[76] = true;
            C9441a.m44182a(i);
            $jacocoInit[77] = true;
        }
        $jacocoInit[78] = true;
    }

    public static void setOnSdkDismissCallback(OnSdkDismissCallback onSdkDismissCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[19] = true;
        $jacocoInit[20] = true;
        Parameter[] parameterArr = {parameter.setName("onSdkDismissedCallback").setType(OnSdkDismissCallback.class)};
        $jacocoInit[21] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[22] = true;
        C9441a.m44186a(onSdkDismissCallback);
        $jacocoInit[23] = true;
    }

    public static void setOnSdkDismissedCallback(OnSdkDismissedCallback onSdkDismissedCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[174] = true;
        $jacocoInit[175] = true;
        Parameter[] parameterArr = {parameter.setName("onSdkDismissedCallback").setType(OnSdkDismissedCallback.class)};
        $jacocoInit[176] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[177] = true;
        C9441a.m44187a(onSdkDismissedCallback);
        $jacocoInit[178] = true;
    }

    public static void setPushNotificationChannelId(String str) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[179] = true;
        $jacocoInit[180] = true;
        Parameter[] parameterArr = {parameter.setName("pushNotificationChannelId").setType(OnSdkDismissedCallback.class)};
        $jacocoInit[181] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[182] = true;
        C9441a.m44194b(str);
        $jacocoInit[183] = true;
    }

    public static void setPushNotificationRegistrationToken(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[79] = true;
        } else {
            $jacocoInit[80] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[81] = true;
            $jacocoInit[82] = true;
            Parameter[] parameterArr = {parameter.setName("token").setType(String.class)};
            $jacocoInit[83] = true;
            instance.catchApiUsage(parameterArr);
            if (str == null) {
                $jacocoInit[84] = true;
            } else {
                $jacocoInit[85] = true;
                if (str.isEmpty()) {
                    $jacocoInit[86] = true;
                } else {
                    $jacocoInit[87] = true;
                    if (C9441a.m44210m().equalsIgnoreCase(str)) {
                        $jacocoInit[88] = true;
                    } else {
                        Feature feature = Feature.PUSH_NOTIFICATION;
                        $jacocoInit[89] = true;
                        if (InstabugCore.getFeatureState(feature) != State.ENABLED) {
                            $jacocoInit[90] = true;
                        } else {
                            $jacocoInit[91] = true;
                            C9441a.m44189a(str);
                            $jacocoInit[92] = true;
                            C9441a.m44202f(false);
                            $jacocoInit[93] = true;
                            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
                            if (chatPlugin == null) {
                                $jacocoInit[94] = true;
                            } else {
                                $jacocoInit[95] = true;
                                Context appContext = chatPlugin.getAppContext();
                                if (appContext == null) {
                                    $jacocoInit[96] = true;
                                } else {
                                    $jacocoInit[97] = true;
                                    InstabugPushNotificationTokenService.m44123a(appContext, new Intent(appContext, InstabugPushNotificationTokenService.class));
                                    $jacocoInit[98] = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        $jacocoInit[99] = true;
    }

    public static void showChats() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            if (chatPlugin == null) {
                $jacocoInit[3] = true;
            } else {
                $jacocoInit[4] = true;
                Context appContext = chatPlugin.getAppContext();
                if (appContext == null) {
                    $jacocoInit[5] = true;
                } else {
                    $jacocoInit[6] = true;
                    Intent a = C9456b.m44297a(appContext);
                    $jacocoInit[7] = true;
                    appContext.startActivity(a);
                    $jacocoInit[8] = true;
                }
            }
        }
        $jacocoInit[9] = true;
    }

    public static void showNotification(Bundle bundle) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[114] = true;
        } else {
            $jacocoInit[115] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[116] = true;
            Parameter name = parameter.setName("data");
            $jacocoInit[117] = true;
            Parameter[] parameterArr = {name.setType(bundle.getClass())};
            $jacocoInit[118] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[119] = true;
            C9397d.m43935a().mo33836a(bundle);
            $jacocoInit[120] = true;
        }
        $jacocoInit[121] = true;
    }

    public static void skipImageAttachmentAnnotation(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[155] = true;
        } else {
            $jacocoInit[156] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[157] = true;
            $jacocoInit[158] = true;
            Parameter type = parameter.setName("skipImageAnnotation").setType(Boolean.class);
            $jacocoInit[159] = true;
            Parameter[] parameterArr = {type.setValue(Boolean.toString(z))};
            $jacocoInit[160] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[161] = true;
            C9441a.m44201e(z);
            $jacocoInit[162] = true;
        }
        $jacocoInit[163] = true;
    }

    public static boolean isInstabugNotification(Map<String, String> map) {
        boolean[] $jacocoInit = $jacocoInit();
        if (isReadyToRun()) {
            $jacocoInit[107] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[108] = true;
            Parameter name = parameter.setName("data");
            $jacocoInit[109] = true;
            Parameter[] parameterArr = {name.setType(map.getClass())};
            $jacocoInit[110] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[111] = true;
            boolean b = C9397d.m43935a().mo33839b(map);
            $jacocoInit[112] = true;
            return b;
        }
        $jacocoInit[113] = true;
        return false;
    }

    public static void showNotification(Map<String, String> map) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isReadyToRun()) {
            $jacocoInit[122] = true;
        } else {
            $jacocoInit[123] = true;
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[124] = true;
            Parameter name = parameter.setName("data");
            $jacocoInit[125] = true;
            Parameter[] parameterArr = {name.setType(map.getClass())};
            $jacocoInit[126] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[127] = true;
            C9397d.m43935a().mo33837a(map);
            $jacocoInit[128] = true;
        }
        $jacocoInit[129] = true;
    }
}
