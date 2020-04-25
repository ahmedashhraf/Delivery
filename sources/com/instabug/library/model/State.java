package com.instabug.library.model;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import com.facebook.appevents.AppEventsConstants;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.logging.C9932b;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.p391j.C9922a;
import com.instabug.library.sessionprofiler.model.timeline.C9987c;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.C9995d;
import com.instabug.library.user.C10009a;
import com.instabug.library.user.UserEvent;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.visualusersteps.C10034b;
import com.instabug.library.visualusersteps.C10040d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jcodec.containers.mps.MPSUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class State implements Cacheable, Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String KEY_APP_PACKAGE_NAME = "bundle_id";
    public static final String KEY_APP_VERSION = "app_version";
    public static final String KEY_BATTERY_LEVEL = "battery_level";
    public static final String KEY_BATTERY_STATUS = "battery_state";
    public static final String KEY_CARRIER = "carrier";
    public static final String KEY_CONSOLE_LOG = "console_log";
    public static final String KEY_CURRENT_VIEW = "current_view";
    public static final String KEY_DENSITY = "density";
    public static final String KEY_DEVICE = "device";
    public static final String KEY_DEVICE_ROOTED = "device_rooted";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_INSTABUG_LOG = "instabug_log";
    public static final String KEY_LOCALE = "locale";
    public static final String KEY_MEMORY_FREE = "memory_free";
    public static final String KEY_MEMORY_TOTAL = "memory_total";
    public static final String KEY_MEMORY_USED = "memory_used";
    public static final String KEY_NETWORK_LOGS = "network_log";
    public static final String KEY_ORIENTATION = "orientation";
    public static final String KEY_OS = "os";
    public static final String KEY_REPORTED_AT = "reported_at";
    public static final String KEY_SCREEN_SIZE = "screen_size";
    public static final String KEY_SDK_VERSION = "sdk_version";
    public static final String KEY_SESSIONS_PROFILER = "sessions_profiler";
    public static final String KEY_STORAGE_FREE = "storage_free";
    public static final String KEY_STORAGE_TOTAL = "storage_total";
    public static final String KEY_STORAGE_USED = "storage_used";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_USER_ATTRIBUTES = "user_attributes";
    public static final String KEY_USER_DATA = "user_data";
    public static final String KEY_USER_EVENTS = "user_events";
    public static final String KEY_USER_STEPS = "user_steps";
    public static final String KEY_VISUAL_USER_STEPS = "user_repro_steps";
    public static final String KEY_WIFI_SSID = "wifi_ssid";
    public static final String KEY_WIFI_STATE = "wifi_state";

    /* renamed from: OS */
    private String f26440OS;
    private String ScreenOrientation;
    private String appPackageName;
    private String appVersion;
    private int batteryLevel;
    private String batteryState;
    private String carrier;
    private ArrayList<C9947a> consoleLog;
    private String currentView;
    private String device;
    private long duration;
    private long freeMemory;
    private long freeStorage;
    private String instabugLog;
    private boolean isDeviceRooted;
    private String locale;
    private String networkLogs;
    private long reportedAt;
    private String screenDensity;
    private String screenSize;
    private String sdkVersion;
    private C9987c sessionProfilerTimeline;
    private String tags;
    private long totalMemory;
    private long totalStorage;
    private Uri uri;
    private long usedMemory;
    private long usedStorage;
    private String userAttributes;
    private String userData;
    private String userEmail;
    private String userEvents;
    private ArrayList<C9949c> userSteps;
    private ArrayList<C10034b> visualUserSteps;
    private String wifiSSID;
    private boolean wifiState;

    public static class Builder implements Serializable {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private Context context;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7624401007136353660L, "com/instabug/library/model/State$Builder", C13959t.f40872a2);
            $jacocoData = a;
            return a;
        }

        public Builder(Context context2) {
            boolean[] $jacocoInit = $jacocoInit();
            this.context = context2;
            $jacocoInit[0] = true;
        }

        static /* synthetic */ ArrayList access$000() {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList consoleLog = getConsoleLog();
            $jacocoInit[136] = true;
            return consoleLog;
        }

        static /* synthetic */ ArrayList access$100(ArrayList arrayList) {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList consoleLog = getConsoleLog(arrayList);
            $jacocoInit[137] = true;
            return consoleLog;
        }

        private static ArrayList<C9947a> getConsoleLog(ArrayList<C9947a> arrayList) {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList<C9947a> consoleLog = getConsoleLog();
            $jacocoInit[1] = true;
            consoleLog.addAll(arrayList);
            $jacocoInit[2] = true;
            return consoleLog;
        }

        private String getInstabugLog() {
            boolean[] $jacocoInit = $jacocoInit();
            if (C9780c.m45631b().mo34869b(Feature.INSTABUG_LOGS) == com.instabug.library.Feature.State.ENABLED) {
                $jacocoInit[108] = true;
                String logs = InstabugLog.getLogs();
                $jacocoInit[109] = true;
                return logs;
            }
            $jacocoInit[110] = true;
            return null;
        }

        private long getReportedAt() {
            boolean[] $jacocoInit = $jacocoInit();
            long currentUTCTimeStampInSeconds = InstabugDateFormatter.getCurrentUTCTimeStampInSeconds();
            $jacocoInit[116] = true;
            return currentUTCTimeStampInSeconds;
        }

        private C9987c getSessionProfilerTimeline() {
            boolean[] $jacocoInit = $jacocoInit();
            C9987c d = C9922a.m46167e().mo35255d();
            $jacocoInit[113] = true;
            return d;
        }

        private String getTags() {
            boolean[] $jacocoInit = $jacocoInit();
            String tagsAsString = SettingsManager.getInstance().getTagsAsString();
            $jacocoInit[117] = true;
            return tagsAsString;
        }

        private String getUserAttributes() {
            String str;
            boolean[] $jacocoInit = $jacocoInit();
            $jacocoInit[123] = true;
            HashMap all = UserAttributesCacheManager.getAll();
            if (all == null) {
                $jacocoInit[124] = true;
            } else {
                $jacocoInit[125] = true;
                if (all.size() == 0) {
                    $jacocoInit[126] = true;
                } else {
                    $jacocoInit[127] = true;
                    C9948b bVar = new C9948b();
                    $jacocoInit[128] = true;
                    bVar.mo35472a(all);
                    try {
                        $jacocoInit[129] = true;
                        str = bVar.toJson();
                        $jacocoInit[130] = true;
                    } catch (JSONException e) {
                        $jacocoInit[131] = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("parsing user attributes got error: ");
                        $jacocoInit[132] = true;
                        sb.append(e.getMessage());
                        String sb2 = sb.toString();
                        $jacocoInit[133] = true;
                        InstabugSDKLogger.m46624e(this, sb2, e);
                        $jacocoInit[134] = true;
                    }
                    $jacocoInit[135] = true;
                    return str;
                }
            }
            str = "{}";
            $jacocoInit[135] = true;
            return str;
        }

        private String getUserData() {
            boolean[] $jacocoInit = $jacocoInit();
            String userData = SettingsManager.getInstance().getUserData();
            $jacocoInit[115] = true;
            return userData;
        }

        private String getUserEmail() {
            boolean[] $jacocoInit = $jacocoInit();
            String e = C10009a.m46600e();
            $jacocoInit[114] = true;
            return e;
        }

        private String getUserEvents() {
            boolean[] $jacocoInit = $jacocoInit();
            try {
                JSONArray json = UserEvent.toJson(InstabugUserEventLogger.getInstance().getUserEvents());
                $jacocoInit[119] = true;
                String jSONArray = json.toString();
                $jacocoInit[120] = true;
                return jSONArray;
            } catch (JSONException e) {
                $jacocoInit[121] = true;
                InstabugSDKLogger.m46624e(this, "Got error while parsing user events logs", e);
                $jacocoInit[122] = true;
                return "";
            }
        }

        private ArrayList<C9949c> getUserSteps() {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList<C9949c> b = C9995d.m46539c().mo35849b();
            $jacocoInit[111] = true;
            return b;
        }

        private ArrayList<C10034b> getVisualUserSteps() {
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList<C10034b> a = C10040d.m46740b().mo36087a();
            $jacocoInit[112] = true;
            return a;
        }

        public State build(boolean z) {
            boolean[] $jacocoInit = $jacocoInit();
            State state = new State();
            $jacocoInit[32] = true;
            State sdkVersion = state.setSdkVersion(DeviceStateProvider.getSdkVersion());
            Context context2 = this.context;
            $jacocoInit[33] = true;
            State locale = sdkVersion.setLocale(DeviceStateProvider.getLocale(context2));
            $jacocoInit[34] = true;
            State duration = locale.setDuration(DeviceStateProvider.getActiveSessionDuration());
            $jacocoInit[35] = true;
            State device = duration.setDevice(DeviceStateProvider.getDevice());
            $jacocoInit[36] = true;
            State isDeviceRooted = device.setIsDeviceRooted(DeviceStateProvider.isDeviceRooted());
            $jacocoInit[37] = true;
            State os = isDeviceRooted.setOS(DeviceStateProvider.getOS());
            Context context3 = this.context;
            $jacocoInit[38] = true;
            State carrier = os.setCarrier(DeviceStateProvider.getCarrier(context3));
            Context context4 = this.context;
            $jacocoInit[39] = true;
            State appVersion = carrier.setAppVersion(DeviceStateProvider.getAppVersion(context4));
            Context context5 = this.context;
            $jacocoInit[40] = true;
            State appPackageName = appVersion.setAppPackageName(DeviceStateProvider.getAppPackageName(context5));
            Context context6 = this.context;
            $jacocoInit[41] = true;
            State batteryLevel = appPackageName.setBatteryLevel(DeviceStateProvider.getBatteryLevel(context6));
            Context context7 = this.context;
            $jacocoInit[42] = true;
            State batteryState = batteryLevel.setBatteryState(DeviceStateProvider.getBatteryState(context7));
            Context context8 = this.context;
            $jacocoInit[43] = true;
            State wifiState = batteryState.setWifiState(DeviceStateProvider.getWifiState(context8));
            Context context9 = this.context;
            $jacocoInit[44] = true;
            State wifiSSID = wifiState.setWifiSSID(DeviceStateProvider.getWifiSSID(context9));
            Context context10 = this.context;
            $jacocoInit[45] = true;
            State freeMemory = wifiSSID.setFreeMemory(DeviceStateProvider.getFreeMemory(context10));
            Context context11 = this.context;
            $jacocoInit[46] = true;
            State usedMemory = freeMemory.setUsedMemory(DeviceStateProvider.getUsedMemory(context11));
            Context context12 = this.context;
            $jacocoInit[47] = true;
            State totalMemory = usedMemory.setTotalMemory(DeviceStateProvider.getTotalMemory(context12));
            $jacocoInit[48] = true;
            State freeStorage = totalMemory.setFreeStorage(DeviceStateProvider.getFreeStorage());
            $jacocoInit[49] = true;
            State usedStorage = freeStorage.setUsedStorage(DeviceStateProvider.getUsedStorage());
            $jacocoInit[50] = true;
            State totalStorage = usedStorage.setTotalStorage(DeviceStateProvider.getTotalStorage());
            Context context13 = this.context;
            $jacocoInit[51] = true;
            State screenDensity = totalStorage.setScreenDensity(DeviceStateProvider.getScreenDensity(context13));
            Context context14 = this.context;
            $jacocoInit[52] = true;
            State screenSize = screenDensity.setScreenSize(DeviceStateProvider.getScreenSize(context14));
            Context context15 = this.context;
            $jacocoInit[53] = true;
            State screenOrientation = screenSize.setScreenOrientation(DeviceStateProvider.getScreenOrientation(context15));
            $jacocoInit[54] = true;
            State currentView = screenOrientation.setCurrentView(DeviceStateProvider.getCurrentView());
            $jacocoInit[55] = true;
            State consoleLog = currentView.setConsoleLog(getConsoleLog());
            $jacocoInit[56] = true;
            State userSteps = consoleLog.setUserSteps(getUserSteps());
            $jacocoInit[57] = true;
            State userEmail = userSteps.setUserEmail(getUserEmail());
            $jacocoInit[58] = true;
            State userData = userEmail.setUserData(getUserData());
            $jacocoInit[59] = true;
            State reportedAt = userData.setReportedAt(getReportedAt());
            $jacocoInit[60] = true;
            State tags = reportedAt.setTags(getTags());
            $jacocoInit[61] = true;
            State userAttributes = tags.setUserAttributes(UserAttributesCacheManager.getUserAttributes());
            $jacocoInit[62] = true;
            State networkLogs = userAttributes.setNetworkLogs(getNetworkLogs());
            $jacocoInit[63] = true;
            State userEvents = networkLogs.setUserEvents(getUserEvents());
            $jacocoInit[64] = true;
            State visualUserSteps = userEvents.setVisualUserSteps(getVisualUserSteps());
            $jacocoInit[65] = true;
            State sessionProfilerTimeline = visualUserSteps.setSessionProfilerTimeline(getSessionProfilerTimeline());
            if (!z) {
                $jacocoInit[66] = true;
            } else {
                $jacocoInit[67] = true;
                sessionProfilerTimeline.setInstabugLog(getInstabugLog());
                $jacocoInit[68] = true;
            }
            $jacocoInit[69] = true;
            return sessionProfilerTimeline;
        }

        public State buildInternalState() {
            boolean[] $jacocoInit = $jacocoInit();
            State state = new State();
            $jacocoInit[70] = true;
            State sdkVersion = state.setSdkVersion(DeviceStateProvider.getSdkVersion());
            Context context2 = this.context;
            $jacocoInit[71] = true;
            State locale = sdkVersion.setLocale(DeviceStateProvider.getLocale(context2));
            $jacocoInit[72] = true;
            State duration = locale.setDuration(DeviceStateProvider.getActiveSessionDuration());
            $jacocoInit[73] = true;
            State device = duration.setDevice(DeviceStateProvider.getDevice());
            $jacocoInit[74] = true;
            State isDeviceRooted = device.setIsDeviceRooted(DeviceStateProvider.isDeviceRooted());
            $jacocoInit[75] = true;
            State os = isDeviceRooted.setOS(DeviceStateProvider.getOS());
            Context context3 = this.context;
            $jacocoInit[76] = true;
            State carrier = os.setCarrier(DeviceStateProvider.getCarrier(context3));
            Context context4 = this.context;
            $jacocoInit[77] = true;
            State appVersion = carrier.setAppVersion(DeviceStateProvider.getAppVersion(context4));
            Context context5 = this.context;
            $jacocoInit[78] = true;
            State appPackageName = appVersion.setAppPackageName(DeviceStateProvider.getAppPackageName(context5));
            Context context6 = this.context;
            $jacocoInit[79] = true;
            State batteryLevel = appPackageName.setBatteryLevel(DeviceStateProvider.getBatteryLevel(context6));
            Context context7 = this.context;
            $jacocoInit[80] = true;
            State batteryState = batteryLevel.setBatteryState(DeviceStateProvider.getBatteryState(context7));
            Context context8 = this.context;
            $jacocoInit[81] = true;
            State wifiState = batteryState.setWifiState(DeviceStateProvider.getWifiState(context8));
            Context context9 = this.context;
            $jacocoInit[82] = true;
            State wifiSSID = wifiState.setWifiSSID(DeviceStateProvider.getWifiSSID(context9));
            Context context10 = this.context;
            $jacocoInit[83] = true;
            State freeMemory = wifiSSID.setFreeMemory(DeviceStateProvider.getFreeMemory(context10));
            Context context11 = this.context;
            $jacocoInit[84] = true;
            State usedMemory = freeMemory.setUsedMemory(DeviceStateProvider.getUsedMemory(context11));
            Context context12 = this.context;
            $jacocoInit[85] = true;
            State totalMemory = usedMemory.setTotalMemory(DeviceStateProvider.getTotalMemory(context12));
            $jacocoInit[86] = true;
            State freeStorage = totalMemory.setFreeStorage(DeviceStateProvider.getFreeStorage());
            $jacocoInit[87] = true;
            State usedStorage = freeStorage.setUsedStorage(DeviceStateProvider.getUsedStorage());
            $jacocoInit[88] = true;
            State totalStorage = usedStorage.setTotalStorage(DeviceStateProvider.getTotalStorage());
            Context context13 = this.context;
            $jacocoInit[89] = true;
            State screenDensity = totalStorage.setScreenDensity(DeviceStateProvider.getScreenDensity(context13));
            Context context14 = this.context;
            $jacocoInit[90] = true;
            State screenSize = screenDensity.setScreenSize(DeviceStateProvider.getScreenSize(context14));
            Context context15 = this.context;
            $jacocoInit[91] = true;
            State screenOrientation = screenSize.setScreenOrientation(DeviceStateProvider.getScreenOrientation(context15));
            $jacocoInit[92] = true;
            State currentView = screenOrientation.setCurrentView(DeviceStateProvider.getCurrentView());
            $jacocoInit[93] = true;
            State reportedAt = currentView.setReportedAt(getReportedAt());
            $jacocoInit[94] = true;
            return reportedAt;
        }

        public String formatSessionDuration(long j) {
            boolean[] $jacocoInit = $jacocoInit();
            StringBuilder sb = new StringBuilder();
            int i = ((int) j) % 60;
            long j2 = j / 60;
            int i2 = ((int) j2) % 60;
            int i3 = ((int) (j2 / 60)) % 60;
            String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            if (i3 > 9) {
                $jacocoInit[95] = true;
            } else {
                $jacocoInit[96] = true;
                sb.append(str);
                $jacocoInit[97] = true;
            }
            sb.append(i3);
            $jacocoInit[98] = true;
            String str2 = ":";
            sb.append(str2);
            if (i2 > 9) {
                $jacocoInit[99] = true;
            } else {
                $jacocoInit[100] = true;
                sb.append(str);
                $jacocoInit[101] = true;
            }
            sb.append(i2);
            $jacocoInit[102] = true;
            sb.append(str2);
            if (i > 9) {
                $jacocoInit[103] = true;
            } else {
                $jacocoInit[104] = true;
                sb.append(str);
                $jacocoInit[105] = true;
            }
            sb.append(i);
            $jacocoInit[106] = true;
            String sb2 = sb.toString();
            $jacocoInit[107] = true;
            return sb2;
        }

        public String getNetworkLogs() {
            boolean[] $jacocoInit = $jacocoInit();
            String b = C9932b.m46215b();
            $jacocoInit[118] = true;
            return b;
        }

        private static ArrayList<C9947a> getConsoleLog() {
            int i;
            boolean[] $jacocoInit = $jacocoInit();
            ArrayList<C9947a> arrayList = new ArrayList<>();
            $jacocoInit[3] = true;
            if (C9780c.m45631b().mo34869b(Feature.CONSOLE_LOGS) == com.instabug.library.Feature.State.ENABLED) {
                try {
                    $jacocoInit[4] = true;
                    Runtime runtime = Runtime.getRuntime();
                    StringBuilder sb = new StringBuilder();
                    sb.append("logcat -v time -d ");
                    $jacocoInit[5] = true;
                    sb.append(Process.myPid());
                    String sb2 = sb.toString();
                    $jacocoInit[6] = true;
                    Process exec = runtime.exec(sb2);
                    $jacocoInit[7] = true;
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName("UTF-8")));
                    $jacocoInit[8] = true;
                    ArrayList arrayList2 = new ArrayList();
                    $jacocoInit[9] = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        $jacocoInit[10] = true;
                        arrayList2.add(readLine);
                        $jacocoInit[11] = true;
                    }
                    bufferedReader.close();
                    $jacocoInit[12] = true;
                    arrayList2.trimToSize();
                    $jacocoInit[13] = true;
                    if (arrayList2.size() <= 700) {
                        $jacocoInit[14] = true;
                        i = 0;
                    } else {
                        $jacocoInit[15] = true;
                        i = arrayList2.size() - 700;
                        $jacocoInit[16] = true;
                    }
                    $jacocoInit[17] = true;
                    while (i < arrayList2.size()) {
                        $jacocoInit[18] = true;
                        if (((String) arrayList2.get(i)).length() <= 18) {
                            $jacocoInit[19] = true;
                        } else {
                            $jacocoInit[20] = true;
                            C9947a aVar = new C9947a();
                            $jacocoInit[21] = true;
                            aVar.mo35467b(((String) arrayList2.get(i)).substring(18));
                            $jacocoInit[22] = true;
                            String substring = ((String) arrayList2.get(i)).substring(0, 18);
                            $jacocoInit[23] = true;
                            long c = C9947a.m46255c(substring);
                            $jacocoInit[24] = true;
                            aVar.mo35466a(c);
                            $jacocoInit[25] = true;
                            arrayList.add(aVar);
                            $jacocoInit[26] = true;
                        }
                        i++;
                        $jacocoInit[27] = true;
                    }
                    arrayList2.clear();
                    $jacocoInit[28] = true;
                    return arrayList;
                } catch (IOException e) {
                    $jacocoInit[29] = true;
                    InstabugSDKLogger.m46624e(Builder.class, "Could not read logcat log", e);
                    $jacocoInit[30] = true;
                    return arrayList;
                }
            } else {
                $jacocoInit[31] = true;
                return arrayList;
            }
        }
    }

    public static class StateItem<V> implements Serializable {
        private static transient /* synthetic */ boolean[] $jacocoData;
        String key;
        V value;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8568882826421557547L, "com/instabug/library/model/State$StateItem", 6);
            $jacocoData = a;
            return a;
        }

        public StateItem() {
            $jacocoInit()[0] = true;
        }

        public String getKey() {
            boolean[] $jacocoInit = $jacocoInit();
            String str = this.key;
            $jacocoInit[1] = true;
            return str;
        }

        public V getValue() {
            boolean[] $jacocoInit = $jacocoInit();
            V v = this.value;
            $jacocoInit[3] = true;
            return v;
        }

        public StateItem<V> setKey(String str) {
            boolean[] $jacocoInit = $jacocoInit();
            this.key = str;
            $jacocoInit[2] = true;
            return this;
        }

        public StateItem<V> setValue(V v) {
            boolean[] $jacocoInit = $jacocoInit();
            this.value = v;
            $jacocoInit[4] = true;
            return this;
        }

        public String toString() {
            boolean[] $jacocoInit = $jacocoInit();
            StringBuilder sb = new StringBuilder();
            sb.append("key: ");
            sb.append(getKey());
            sb.append(", value: ");
            sb.append(getValue());
            String sb2 = sb.toString();
            $jacocoInit[5] = true;
            return sb2;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1339094413760146538L, "com/instabug/library/model/State", MPSUtils.PSM);
        $jacocoData = a;
        return a;
    }

    public State() {
        $jacocoInit()[0] = true;
    }

    public static State getState(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        Builder builder = new Builder(context);
        $jacocoInit[1] = true;
        State build = builder.build(true);
        $jacocoInit[2] = true;
        return build;
    }

    private static String getTagsAsString(List<String> list) {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        $jacocoInit[67] = true;
        if (list == null) {
            $jacocoInit[68] = true;
        } else if (list.size() <= 0) {
            $jacocoInit[69] = true;
        } else {
            $jacocoInit[70] = true;
            int size = list.size();
            int i = 0;
            $jacocoInit[71] = true;
            while (i < size) {
                $jacocoInit[73] = true;
                sb.append((String) list.get(i));
                if (i == size - 1) {
                    $jacocoInit[74] = true;
                } else {
                    $jacocoInit[75] = true;
                    sb.append(", ");
                    $jacocoInit[76] = true;
                }
                i++;
                $jacocoInit[77] = true;
            }
            $jacocoInit[72] = true;
        }
        String sb2 = sb.toString();
        $jacocoInit[78] = true;
        return sb2;
    }

    public boolean equals(Object obj) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (obj == null) {
            $jacocoInit[333] = true;
        } else if (!(obj instanceof State)) {
            $jacocoInit[334] = true;
        } else {
            State state = (State) obj;
            $jacocoInit[335] = true;
            String valueOf = String.valueOf(state.getAppVersion());
            $jacocoInit[336] = true;
            String valueOf2 = String.valueOf(getAppVersion());
            $jacocoInit[337] = true;
            if (!valueOf.equals(valueOf2)) {
                $jacocoInit[338] = true;
            } else {
                $jacocoInit[339] = true;
                if (state.getBatteryLevel() != getBatteryLevel()) {
                    $jacocoInit[340] = true;
                } else {
                    $jacocoInit[341] = true;
                    String valueOf3 = String.valueOf(state.getBatteryState());
                    $jacocoInit[342] = true;
                    String valueOf4 = String.valueOf(getBatteryState());
                    $jacocoInit[343] = true;
                    if (!valueOf3.equals(valueOf4)) {
                        $jacocoInit[344] = true;
                    } else {
                        $jacocoInit[345] = true;
                        String valueOf5 = String.valueOf(state.getCarrier());
                        $jacocoInit[346] = true;
                        String valueOf6 = String.valueOf(getCarrier());
                        $jacocoInit[347] = true;
                        if (!valueOf5.equals(valueOf6)) {
                            $jacocoInit[348] = true;
                        } else {
                            $jacocoInit[349] = true;
                            String valueOf7 = String.valueOf(state.getConsoleLog());
                            $jacocoInit[350] = true;
                            String valueOf8 = String.valueOf(getConsoleLog());
                            $jacocoInit[351] = true;
                            if (!valueOf7.equals(valueOf8)) {
                                $jacocoInit[352] = true;
                            } else {
                                $jacocoInit[353] = true;
                                String valueOf9 = String.valueOf(state.getCurrentView());
                                $jacocoInit[354] = true;
                                String valueOf10 = String.valueOf(getCurrentView());
                                $jacocoInit[355] = true;
                                if (!valueOf9.equals(valueOf10)) {
                                    $jacocoInit[356] = true;
                                } else {
                                    $jacocoInit[357] = true;
                                    if (state.getDuration() != getDuration()) {
                                        $jacocoInit[358] = true;
                                    } else {
                                        $jacocoInit[359] = true;
                                        if (!String.valueOf(state.getDevice()).equals(String.valueOf(getDevice()))) {
                                            $jacocoInit[360] = true;
                                        } else {
                                            $jacocoInit[361] = true;
                                            if (state.getFreeMemory() != getFreeMemory()) {
                                                $jacocoInit[362] = true;
                                            } else {
                                                $jacocoInit[363] = true;
                                                if (state.getFreeStorage() != getFreeStorage()) {
                                                    $jacocoInit[364] = true;
                                                } else {
                                                    $jacocoInit[365] = true;
                                                    if (!String.valueOf(state.getLocale()).equals(String.valueOf(getLocale()))) {
                                                        $jacocoInit[366] = true;
                                                    } else {
                                                        $jacocoInit[367] = true;
                                                        if (!String.valueOf(state.getOS()).equals(String.valueOf(getOS()))) {
                                                            $jacocoInit[368] = true;
                                                        } else {
                                                            $jacocoInit[369] = true;
                                                            if (state.getReportedAt() != getReportedAt()) {
                                                                $jacocoInit[370] = true;
                                                            } else {
                                                                $jacocoInit[371] = true;
                                                                String valueOf11 = String.valueOf(state.getScreenDensity());
                                                                $jacocoInit[372] = true;
                                                                String valueOf12 = String.valueOf(getScreenDensity());
                                                                $jacocoInit[373] = true;
                                                                if (!valueOf11.equals(valueOf12)) {
                                                                    $jacocoInit[374] = true;
                                                                } else {
                                                                    $jacocoInit[375] = true;
                                                                    String valueOf13 = String.valueOf(state.getScreenOrientation());
                                                                    $jacocoInit[376] = true;
                                                                    String valueOf14 = String.valueOf(getScreenOrientation());
                                                                    $jacocoInit[377] = true;
                                                                    if (!valueOf13.equals(valueOf14)) {
                                                                        $jacocoInit[378] = true;
                                                                    } else {
                                                                        $jacocoInit[379] = true;
                                                                        String valueOf15 = String.valueOf(state.getScreenSize());
                                                                        $jacocoInit[380] = true;
                                                                        String valueOf16 = String.valueOf(getScreenSize());
                                                                        $jacocoInit[381] = true;
                                                                        if (!valueOf15.equals(valueOf16)) {
                                                                            $jacocoInit[382] = true;
                                                                        } else {
                                                                            $jacocoInit[383] = true;
                                                                            String valueOf17 = String.valueOf(state.getSdkVersion());
                                                                            $jacocoInit[384] = true;
                                                                            String valueOf18 = String.valueOf(getSdkVersion());
                                                                            $jacocoInit[385] = true;
                                                                            if (!valueOf17.equals(valueOf18)) {
                                                                                $jacocoInit[386] = true;
                                                                            } else {
                                                                                $jacocoInit[387] = true;
                                                                                if (state.getTotalMemory() != getTotalMemory()) {
                                                                                    $jacocoInit[388] = true;
                                                                                } else {
                                                                                    $jacocoInit[389] = true;
                                                                                    if (state.getTotalStorage() != getTotalStorage()) {
                                                                                        $jacocoInit[390] = true;
                                                                                    } else {
                                                                                        $jacocoInit[391] = true;
                                                                                        if (!String.valueOf(state.getTags()).equals(String.valueOf(getTags()))) {
                                                                                            $jacocoInit[392] = true;
                                                                                        } else {
                                                                                            $jacocoInit[393] = true;
                                                                                            if (state.getUsedMemory() != getUsedMemory()) {
                                                                                                $jacocoInit[394] = true;
                                                                                            } else {
                                                                                                $jacocoInit[395] = true;
                                                                                                if (state.getUsedStorage() != getUsedStorage()) {
                                                                                                    $jacocoInit[396] = true;
                                                                                                } else {
                                                                                                    $jacocoInit[397] = true;
                                                                                                    String valueOf19 = String.valueOf(state.getUserData());
                                                                                                    $jacocoInit[398] = true;
                                                                                                    String valueOf20 = String.valueOf(getUserData());
                                                                                                    $jacocoInit[399] = true;
                                                                                                    if (!valueOf19.equals(valueOf20)) {
                                                                                                        $jacocoInit[400] = true;
                                                                                                    } else {
                                                                                                        $jacocoInit[401] = true;
                                                                                                        String valueOf21 = String.valueOf(state.getUserEmail());
                                                                                                        $jacocoInit[402] = true;
                                                                                                        String valueOf22 = String.valueOf(getUserEmail());
                                                                                                        $jacocoInit[403] = true;
                                                                                                        if (!valueOf21.equals(valueOf22)) {
                                                                                                            $jacocoInit[404] = true;
                                                                                                        } else {
                                                                                                            $jacocoInit[405] = true;
                                                                                                            String valueOf23 = String.valueOf(state.getUserSteps());
                                                                                                            $jacocoInit[406] = true;
                                                                                                            String valueOf24 = String.valueOf(getUserSteps());
                                                                                                            $jacocoInit[407] = true;
                                                                                                            if (!valueOf23.equals(valueOf24)) {
                                                                                                                $jacocoInit[408] = true;
                                                                                                            } else {
                                                                                                                $jacocoInit[409] = true;
                                                                                                                String valueOf25 = String.valueOf(state.getWifiSSID());
                                                                                                                $jacocoInit[410] = true;
                                                                                                                String valueOf26 = String.valueOf(getWifiSSID());
                                                                                                                $jacocoInit[411] = true;
                                                                                                                if (!valueOf25.equals(valueOf26)) {
                                                                                                                    $jacocoInit[412] = true;
                                                                                                                } else {
                                                                                                                    $jacocoInit[413] = true;
                                                                                                                    if (state.isDeviceRooted() != isDeviceRooted()) {
                                                                                                                        $jacocoInit[414] = true;
                                                                                                                    } else {
                                                                                                                        $jacocoInit[415] = true;
                                                                                                                        if (state.isWifiEnable() != isWifiEnable()) {
                                                                                                                            $jacocoInit[416] = true;
                                                                                                                        } else {
                                                                                                                            $jacocoInit[417] = true;
                                                                                                                            String valueOf27 = String.valueOf(state.getInstabugLog());
                                                                                                                            $jacocoInit[418] = true;
                                                                                                                            String valueOf28 = String.valueOf(getInstabugLog());
                                                                                                                            $jacocoInit[419] = true;
                                                                                                                            if (!valueOf27.equals(valueOf28)) {
                                                                                                                                $jacocoInit[420] = true;
                                                                                                                            } else {
                                                                                                                                $jacocoInit[421] = true;
                                                                                                                                String valueOf29 = String.valueOf(state.getUserAttributes());
                                                                                                                                $jacocoInit[422] = true;
                                                                                                                                String valueOf30 = String.valueOf(getUserAttributes());
                                                                                                                                $jacocoInit[423] = true;
                                                                                                                                if (!valueOf29.equals(valueOf30)) {
                                                                                                                                    $jacocoInit[424] = true;
                                                                                                                                } else {
                                                                                                                                    $jacocoInit[425] = true;
                                                                                                                                    String valueOf31 = String.valueOf(state.getNetworkLogs());
                                                                                                                                    $jacocoInit[426] = true;
                                                                                                                                    String valueOf32 = String.valueOf(getNetworkLogs());
                                                                                                                                    $jacocoInit[427] = true;
                                                                                                                                    if (!valueOf31.equals(valueOf32)) {
                                                                                                                                        $jacocoInit[428] = true;
                                                                                                                                    } else {
                                                                                                                                        $jacocoInit[429] = true;
                                                                                                                                        String valueOf33 = String.valueOf(state.getUserEvents());
                                                                                                                                        $jacocoInit[430] = true;
                                                                                                                                        String valueOf34 = String.valueOf(getUserEvents());
                                                                                                                                        $jacocoInit[431] = true;
                                                                                                                                        if (!valueOf33.equals(valueOf34)) {
                                                                                                                                            $jacocoInit[432] = true;
                                                                                                                                        } else {
                                                                                                                                            $jacocoInit[433] = true;
                                                                                                                                            String valueOf35 = String.valueOf(state.getVisualUserSteps());
                                                                                                                                            $jacocoInit[434] = true;
                                                                                                                                            if (!valueOf35.equals(String.valueOf(getVisualUserSteps()))) {
                                                                                                                                                $jacocoInit[435] = true;
                                                                                                                                            } else {
                                                                                                                                                $jacocoInit[436] = true;
                                                                                                                                                String valueOf36 = String.valueOf(state.getSessionProfilerTimeline());
                                                                                                                                                $jacocoInit[437] = true;
                                                                                                                                                if (!valueOf36.equals(String.valueOf(getSessionProfilerTimeline()))) {
                                                                                                                                                    $jacocoInit[438] = true;
                                                                                                                                                } else {
                                                                                                                                                    $jacocoInit[439] = true;
                                                                                                                                                    z = true;
                                                                                                                                                    $jacocoInit[441] = true;
                                                                                                                                                    return z;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            $jacocoInit[440] = true;
            $jacocoInit[441] = true;
            return z;
        }
        $jacocoInit[442] = true;
        return false;
    }

    public void fromJson(String str) throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject(str);
        $jacocoInit[183] = true;
        String str2 = KEY_APP_PACKAGE_NAME;
        if (!jSONObject.has(str2)) {
            $jacocoInit[184] = true;
        } else {
            $jacocoInit[185] = true;
            setAppPackageName(jSONObject.getString(str2));
            $jacocoInit[186] = true;
        }
        String str3 = KEY_APP_VERSION;
        if (!jSONObject.has(str3)) {
            $jacocoInit[187] = true;
        } else {
            $jacocoInit[188] = true;
            setAppVersion(jSONObject.getString(str3));
            $jacocoInit[189] = true;
        }
        String str4 = KEY_BATTERY_LEVEL;
        if (!jSONObject.has(str4)) {
            $jacocoInit[190] = true;
        } else {
            $jacocoInit[191] = true;
            setBatteryLevel(jSONObject.getInt(str4));
            $jacocoInit[192] = true;
        }
        String str5 = KEY_BATTERY_STATUS;
        if (!jSONObject.has(str5)) {
            $jacocoInit[193] = true;
        } else {
            $jacocoInit[194] = true;
            setBatteryState(jSONObject.getString(str5));
            $jacocoInit[195] = true;
        }
        String str6 = "carrier";
        if (!jSONObject.has(str6)) {
            $jacocoInit[196] = true;
        } else {
            $jacocoInit[197] = true;
            setCarrier(jSONObject.getString(str6));
            $jacocoInit[198] = true;
        }
        String str7 = KEY_CONSOLE_LOG;
        if (!jSONObject.has(str7)) {
            $jacocoInit[199] = true;
        } else {
            $jacocoInit[200] = true;
            JSONArray jSONArray = new JSONArray(jSONObject.getString(str7));
            $jacocoInit[201] = true;
            setConsoleLog(C9947a.m46253a(jSONArray));
            $jacocoInit[202] = true;
        }
        String str8 = KEY_CURRENT_VIEW;
        if (!jSONObject.has(str8)) {
            $jacocoInit[203] = true;
        } else {
            $jacocoInit[204] = true;
            setCurrentView(jSONObject.getString(str8));
            $jacocoInit[205] = true;
        }
        String str9 = KEY_DENSITY;
        if (!jSONObject.has(str9)) {
            $jacocoInit[206] = true;
        } else {
            $jacocoInit[207] = true;
            setScreenDensity(jSONObject.getString(str9));
            $jacocoInit[208] = true;
        }
        String str10 = KEY_DEVICE;
        if (!jSONObject.has(str10)) {
            $jacocoInit[209] = true;
        } else {
            $jacocoInit[210] = true;
            setDevice(jSONObject.getString(str10));
            $jacocoInit[211] = true;
        }
        String str11 = KEY_DEVICE_ROOTED;
        if (!jSONObject.has(str11)) {
            $jacocoInit[212] = true;
        } else {
            $jacocoInit[213] = true;
            setIsDeviceRooted(jSONObject.getBoolean(str11));
            $jacocoInit[214] = true;
        }
        String str12 = "duration";
        if (!jSONObject.has(str12)) {
            $jacocoInit[215] = true;
        } else {
            $jacocoInit[216] = true;
            setDuration(jSONObject.getLong(str12));
            $jacocoInit[217] = true;
        }
        String str13 = "email";
        if (!jSONObject.has(str13)) {
            $jacocoInit[218] = true;
        } else {
            $jacocoInit[219] = true;
            setUserEmail(jSONObject.getString(str13));
            $jacocoInit[220] = true;
        }
        String str14 = KEY_INSTABUG_LOG;
        if (!jSONObject.has(str14)) {
            $jacocoInit[221] = true;
        } else {
            $jacocoInit[222] = true;
            setInstabugLog(jSONObject.getString(str14));
            $jacocoInit[223] = true;
        }
        String str15 = KEY_LOCALE;
        if (!jSONObject.has(str15)) {
            $jacocoInit[224] = true;
        } else {
            $jacocoInit[225] = true;
            setLocale(jSONObject.getString(str15));
            $jacocoInit[226] = true;
        }
        if (!jSONObject.has(KEY_MEMORY_FREE)) {
            $jacocoInit[227] = true;
        } else {
            $jacocoInit[228] = true;
            setFreeMemory(jSONObject.getLong(KEY_MEMORY_FREE));
            $jacocoInit[229] = true;
        }
        if (!jSONObject.has(KEY_MEMORY_TOTAL)) {
            $jacocoInit[230] = true;
        } else {
            $jacocoInit[231] = true;
            setTotalMemory(jSONObject.getLong(KEY_MEMORY_TOTAL));
            $jacocoInit[232] = true;
        }
        if (!jSONObject.has(KEY_MEMORY_USED)) {
            $jacocoInit[233] = true;
        } else {
            $jacocoInit[234] = true;
            setUsedMemory(jSONObject.getLong(KEY_MEMORY_USED));
            $jacocoInit[235] = true;
        }
        if (!jSONObject.has(KEY_ORIENTATION)) {
            $jacocoInit[236] = true;
        } else {
            $jacocoInit[237] = true;
            setScreenOrientation(jSONObject.getString(KEY_ORIENTATION));
            $jacocoInit[238] = true;
        }
        if (!jSONObject.has(KEY_OS)) {
            $jacocoInit[239] = true;
        } else {
            $jacocoInit[240] = true;
            setOS(jSONObject.getString(KEY_OS));
            $jacocoInit[241] = true;
        }
        if (!jSONObject.has(KEY_REPORTED_AT)) {
            $jacocoInit[242] = true;
        } else {
            $jacocoInit[243] = true;
            setReportedAt(jSONObject.getLong(KEY_REPORTED_AT));
            $jacocoInit[244] = true;
        }
        if (!jSONObject.has(KEY_SCREEN_SIZE)) {
            $jacocoInit[245] = true;
        } else {
            $jacocoInit[246] = true;
            setScreenSize(jSONObject.getString(KEY_SCREEN_SIZE));
            $jacocoInit[247] = true;
        }
        if (!jSONObject.has(KEY_SDK_VERSION)) {
            $jacocoInit[248] = true;
        } else {
            $jacocoInit[249] = true;
            setSdkVersion(jSONObject.getString(KEY_SDK_VERSION));
            $jacocoInit[250] = true;
        }
        if (!jSONObject.has(KEY_STORAGE_FREE)) {
            $jacocoInit[251] = true;
        } else {
            $jacocoInit[252] = true;
            setFreeStorage(jSONObject.getLong(KEY_STORAGE_FREE));
            $jacocoInit[253] = true;
        }
        if (!jSONObject.has(KEY_STORAGE_TOTAL)) {
            $jacocoInit[254] = true;
        } else {
            $jacocoInit[255] = true;
            setTotalStorage(jSONObject.getLong(KEY_STORAGE_TOTAL));
            $jacocoInit[256] = true;
        }
        if (!jSONObject.has(KEY_STORAGE_USED)) {
            $jacocoInit[257] = true;
        } else {
            $jacocoInit[258] = true;
            setUsedStorage(jSONObject.getLong(KEY_STORAGE_USED));
            $jacocoInit[259] = true;
        }
        if (!jSONObject.has(KEY_TAGS)) {
            $jacocoInit[260] = true;
        } else {
            $jacocoInit[261] = true;
            setTags(jSONObject.getString(KEY_TAGS));
            $jacocoInit[262] = true;
        }
        if (!jSONObject.has(KEY_USER_DATA)) {
            $jacocoInit[263] = true;
        } else {
            $jacocoInit[264] = true;
            setUserData(jSONObject.getString(KEY_USER_DATA));
            $jacocoInit[265] = true;
        }
        if (!jSONObject.has(KEY_USER_STEPS)) {
            $jacocoInit[266] = true;
        } else {
            $jacocoInit[267] = true;
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString(KEY_USER_STEPS));
            $jacocoInit[268] = true;
            setUserSteps(C9949c.m46267a(jSONArray2));
            $jacocoInit[269] = true;
        }
        if (!jSONObject.has(KEY_WIFI_SSID)) {
            $jacocoInit[270] = true;
        } else {
            $jacocoInit[271] = true;
            setWifiSSID(jSONObject.getString(KEY_WIFI_SSID));
            $jacocoInit[272] = true;
        }
        if (!jSONObject.has(KEY_WIFI_STATE)) {
            $jacocoInit[273] = true;
        } else {
            $jacocoInit[274] = true;
            setWifiState(jSONObject.getBoolean(KEY_WIFI_STATE));
            $jacocoInit[275] = true;
        }
        if (!jSONObject.has("user_attributes")) {
            $jacocoInit[276] = true;
        } else {
            $jacocoInit[277] = true;
            setUserAttributes(jSONObject.getString("user_attributes"));
            $jacocoInit[278] = true;
        }
        if (!jSONObject.has(KEY_NETWORK_LOGS)) {
            $jacocoInit[279] = true;
        } else {
            $jacocoInit[280] = true;
            setNetworkLogs(jSONObject.getString(KEY_NETWORK_LOGS));
            $jacocoInit[281] = true;
        }
        if (!jSONObject.has("user_events")) {
            $jacocoInit[282] = true;
        } else {
            $jacocoInit[283] = true;
            setUserEvents(jSONObject.getString("user_events"));
            $jacocoInit[284] = true;
        }
        if (!jSONObject.has(KEY_VISUAL_USER_STEPS)) {
            $jacocoInit[285] = true;
        } else {
            $jacocoInit[286] = true;
            JSONArray jSONArray3 = new JSONArray(jSONObject.getString(KEY_VISUAL_USER_STEPS));
            $jacocoInit[287] = true;
            setVisualUserSteps(C10034b.m46677a(jSONArray3));
            $jacocoInit[288] = true;
        }
        if (!jSONObject.has(KEY_SESSIONS_PROFILER)) {
            $jacocoInit[289] = true;
        } else {
            $jacocoInit[290] = true;
            C9987c a = C9987c.m46415a(new JSONObject(jSONObject.getString(KEY_SESSIONS_PROFILER)));
            $jacocoInit[291] = true;
            setSessionProfilerTimeline(a);
            $jacocoInit[292] = true;
        }
        $jacocoInit[293] = true;
    }

    public String getAppPackageName() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.appPackageName;
        $jacocoInit[17] = true;
        return str;
    }

    public String getAppVersion() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.appVersion;
        $jacocoInit[19] = true;
        return str;
    }

    public int getBatteryLevel() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.batteryLevel;
        $jacocoInit[21] = true;
        return i;
    }

    public String getBatteryState() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.batteryState;
        $jacocoInit[25] = true;
        return str;
    }

    public String getCarrier() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.carrier;
        $jacocoInit[15] = true;
        return str;
    }

    public JSONArray getConsoleLog() {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray a = C9947a.m46254a(this.consoleLog);
        $jacocoInit[55] = true;
        return a;
    }

    public String getCurrentView() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.currentView;
        $jacocoInit[49] = true;
        return str;
    }

    public String getDevice() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.device;
        $jacocoInit[9] = true;
        return str;
    }

    public long getDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.duration;
        $jacocoInit[7] = true;
        return j;
    }

    public long getFreeMemory() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.freeMemory;
        $jacocoInit[33] = true;
        return j;
    }

    public long getFreeStorage() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.freeStorage;
        $jacocoInit[39] = true;
        return j;
    }

    public String getInstabugLog() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.instabugLog;
        $jacocoInit[51] = true;
        return str;
    }

    public String getLocale() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.locale;
        $jacocoInit[5] = true;
        return str;
    }

    public ArrayList<StateItem> getLogsItems() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<StateItem> arrayList = new ArrayList<>();
        $jacocoInit[294] = true;
        StateItem stateItem = new StateItem();
        $jacocoInit[295] = true;
        StateItem value = stateItem.setKey(KEY_CONSOLE_LOG).setValue(getConsoleLog().toString());
        $jacocoInit[296] = true;
        arrayList.add(value);
        $jacocoInit[297] = true;
        StateItem stateItem2 = new StateItem();
        $jacocoInit[298] = true;
        StateItem value2 = stateItem2.setKey(KEY_INSTABUG_LOG).setValue(getInstabugLog());
        $jacocoInit[299] = true;
        arrayList.add(value2);
        $jacocoInit[300] = true;
        StateItem stateItem3 = new StateItem();
        $jacocoInit[301] = true;
        StateItem value3 = stateItem3.setKey(KEY_USER_DATA).setValue(getUserData());
        $jacocoInit[302] = true;
        arrayList.add(value3);
        $jacocoInit[303] = true;
        StateItem stateItem4 = new StateItem();
        $jacocoInit[304] = true;
        StateItem value4 = stateItem4.setKey(KEY_NETWORK_LOGS).setValue(getNetworkLogs());
        $jacocoInit[305] = true;
        arrayList.add(value4);
        $jacocoInit[306] = true;
        StateItem stateItem5 = new StateItem();
        $jacocoInit[307] = true;
        StateItem value5 = stateItem5.setKey("user_events").setValue(getUserEvents());
        $jacocoInit[308] = true;
        arrayList.add(value5);
        $jacocoInit[309] = true;
        if (C9780c.m45631b().mo34869b(Feature.TRACK_USER_STEPS) != com.instabug.library.Feature.State.ENABLED) {
            $jacocoInit[310] = true;
        } else {
            $jacocoInit[311] = true;
            StateItem stateItem6 = new StateItem();
            $jacocoInit[312] = true;
            StateItem value6 = stateItem6.setKey(KEY_USER_STEPS).setValue(getUserSteps().toString());
            $jacocoInit[313] = true;
            arrayList.add(value6);
            $jacocoInit[314] = true;
        }
        if (C9780c.m45631b().mo34869b(Feature.REPRO_STEPS) != com.instabug.library.Feature.State.ENABLED) {
            $jacocoInit[315] = true;
        } else {
            $jacocoInit[316] = true;
            StateItem stateItem7 = new StateItem();
            $jacocoInit[317] = true;
            StateItem value7 = stateItem7.setKey(KEY_VISUAL_USER_STEPS).setValue(getVisualUserSteps());
            $jacocoInit[318] = true;
            arrayList.add(value7);
            $jacocoInit[319] = true;
        }
        if (C9780c.m45631b().mo34869b(Feature.SESSION_PROFILER) != com.instabug.library.Feature.State.ENABLED) {
            $jacocoInit[320] = true;
        } else if (this.sessionProfilerTimeline == null) {
            $jacocoInit[321] = true;
        } else {
            $jacocoInit[322] = true;
            StateItem stateItem8 = new StateItem();
            $jacocoInit[323] = true;
            StateItem value8 = stateItem8.setKey(KEY_SESSIONS_PROFILER).setValue(getSessionProfilerTimeline());
            $jacocoInit[324] = true;
            arrayList.add(value8);
            $jacocoInit[325] = true;
        }
        $jacocoInit[326] = true;
        return arrayList;
    }

    public String getNetworkLogs() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.networkLogs;
        $jacocoInit[82] = true;
        return str;
    }

    public String getOS() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.f26440OS;
        $jacocoInit[13] = true;
        return str;
    }

    public long getReportedAt() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.reportedAt;
        $jacocoInit[63] = true;
        return j;
    }

    public String getScreenDensity() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.screenDensity;
        $jacocoInit[43] = true;
        return str;
    }

    public String getScreenOrientation() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.ScreenOrientation;
        $jacocoInit[47] = true;
        return str;
    }

    public String getScreenSize() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.screenSize;
        $jacocoInit[45] = true;
        return str;
    }

    public String getSdkVersion() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.sdkVersion;
        $jacocoInit[3] = true;
        return str;
    }

    public String getSessionProfilerTimeline() {
        boolean[] $jacocoInit = $jacocoInit();
        String jSONObject = this.sessionProfilerTimeline.mo35601d().toString();
        $jacocoInit[88] = true;
        return jSONObject;
    }

    public ArrayList<StateItem> getStateItems() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<StateItem> arrayList = new ArrayList<>();
        $jacocoInit[90] = true;
        StateItem stateItem = new StateItem();
        $jacocoInit[91] = true;
        StateItem value = stateItem.setKey(KEY_APP_PACKAGE_NAME).setValue(getAppPackageName());
        $jacocoInit[92] = true;
        arrayList.add(value);
        $jacocoInit[93] = true;
        StateItem stateItem2 = new StateItem();
        $jacocoInit[94] = true;
        StateItem value2 = stateItem2.setKey(KEY_APP_VERSION).setValue(getAppVersion());
        $jacocoInit[95] = true;
        arrayList.add(value2);
        $jacocoInit[96] = true;
        StateItem stateItem3 = new StateItem();
        $jacocoInit[97] = true;
        StateItem value3 = stateItem3.setKey(KEY_BATTERY_LEVEL).setValue(Integer.valueOf(getBatteryLevel()));
        $jacocoInit[98] = true;
        arrayList.add(value3);
        $jacocoInit[99] = true;
        StateItem stateItem4 = new StateItem();
        $jacocoInit[100] = true;
        StateItem value4 = stateItem4.setKey(KEY_BATTERY_STATUS).setValue(getBatteryState());
        $jacocoInit[101] = true;
        arrayList.add(value4);
        $jacocoInit[102] = true;
        StateItem stateItem5 = new StateItem();
        $jacocoInit[103] = true;
        StateItem value5 = stateItem5.setKey("carrier").setValue(getCarrier());
        $jacocoInit[104] = true;
        arrayList.add(value5);
        $jacocoInit[105] = true;
        StateItem stateItem6 = new StateItem();
        $jacocoInit[106] = true;
        StateItem value6 = stateItem6.setKey(KEY_CURRENT_VIEW).setValue(getCurrentView());
        $jacocoInit[107] = true;
        arrayList.add(value6);
        $jacocoInit[108] = true;
        StateItem stateItem7 = new StateItem();
        $jacocoInit[109] = true;
        StateItem value7 = stateItem7.setKey(KEY_DENSITY).setValue(getScreenDensity());
        $jacocoInit[110] = true;
        arrayList.add(value7);
        $jacocoInit[111] = true;
        StateItem stateItem8 = new StateItem();
        $jacocoInit[112] = true;
        StateItem value8 = stateItem8.setKey(KEY_DEVICE).setValue(getDevice());
        $jacocoInit[113] = true;
        arrayList.add(value8);
        $jacocoInit[114] = true;
        StateItem stateItem9 = new StateItem();
        $jacocoInit[115] = true;
        StateItem value9 = stateItem9.setKey(KEY_DEVICE_ROOTED).setValue(Boolean.valueOf(isDeviceRooted()));
        $jacocoInit[116] = true;
        arrayList.add(value9);
        $jacocoInit[117] = true;
        StateItem stateItem10 = new StateItem();
        $jacocoInit[118] = true;
        StateItem value10 = stateItem10.setKey("duration").setValue(Long.valueOf(getDuration()));
        $jacocoInit[119] = true;
        arrayList.add(value10);
        $jacocoInit[120] = true;
        StateItem stateItem11 = new StateItem();
        $jacocoInit[121] = true;
        StateItem value11 = stateItem11.setKey("email").setValue(getUserEmail());
        $jacocoInit[122] = true;
        arrayList.add(value11);
        $jacocoInit[123] = true;
        StateItem stateItem12 = new StateItem();
        $jacocoInit[124] = true;
        StateItem value12 = stateItem12.setKey(KEY_LOCALE).setValue(getLocale());
        $jacocoInit[125] = true;
        arrayList.add(value12);
        $jacocoInit[126] = true;
        StateItem stateItem13 = new StateItem();
        $jacocoInit[127] = true;
        StateItem value13 = stateItem13.setKey(KEY_MEMORY_FREE).setValue(Long.valueOf(getFreeMemory()));
        $jacocoInit[128] = true;
        arrayList.add(value13);
        $jacocoInit[129] = true;
        StateItem stateItem14 = new StateItem();
        $jacocoInit[130] = true;
        StateItem value14 = stateItem14.setKey(KEY_MEMORY_TOTAL).setValue(Long.valueOf(getTotalMemory()));
        $jacocoInit[131] = true;
        arrayList.add(value14);
        $jacocoInit[132] = true;
        StateItem stateItem15 = new StateItem();
        $jacocoInit[133] = true;
        StateItem value15 = stateItem15.setKey(KEY_MEMORY_USED).setValue(Long.valueOf(getUsedMemory()));
        $jacocoInit[134] = true;
        arrayList.add(value15);
        $jacocoInit[135] = true;
        StateItem stateItem16 = new StateItem();
        $jacocoInit[136] = true;
        StateItem value16 = stateItem16.setKey(KEY_ORIENTATION).setValue(getScreenOrientation());
        $jacocoInit[137] = true;
        arrayList.add(value16);
        $jacocoInit[138] = true;
        StateItem stateItem17 = new StateItem();
        $jacocoInit[139] = true;
        StateItem value17 = stateItem17.setKey(KEY_OS).setValue(getOS());
        $jacocoInit[140] = true;
        arrayList.add(value17);
        $jacocoInit[141] = true;
        StateItem stateItem18 = new StateItem();
        $jacocoInit[142] = true;
        StateItem value18 = stateItem18.setKey(KEY_REPORTED_AT).setValue(Long.valueOf(getReportedAt()));
        $jacocoInit[143] = true;
        arrayList.add(value18);
        $jacocoInit[144] = true;
        StateItem stateItem19 = new StateItem();
        $jacocoInit[145] = true;
        StateItem value19 = stateItem19.setKey(KEY_SCREEN_SIZE).setValue(getScreenSize());
        $jacocoInit[146] = true;
        arrayList.add(value19);
        $jacocoInit[147] = true;
        StateItem stateItem20 = new StateItem();
        $jacocoInit[148] = true;
        StateItem value20 = stateItem20.setKey(KEY_SDK_VERSION).setValue(getSdkVersion());
        $jacocoInit[149] = true;
        arrayList.add(value20);
        $jacocoInit[150] = true;
        StateItem stateItem21 = new StateItem();
        $jacocoInit[151] = true;
        StateItem value21 = stateItem21.setKey(KEY_STORAGE_FREE).setValue(Long.valueOf(getFreeStorage()));
        $jacocoInit[152] = true;
        arrayList.add(value21);
        $jacocoInit[153] = true;
        StateItem stateItem22 = new StateItem();
        $jacocoInit[154] = true;
        StateItem value22 = stateItem22.setKey(KEY_STORAGE_TOTAL).setValue(Long.valueOf(getTotalStorage()));
        $jacocoInit[155] = true;
        arrayList.add(value22);
        $jacocoInit[156] = true;
        StateItem stateItem23 = new StateItem();
        $jacocoInit[157] = true;
        StateItem value23 = stateItem23.setKey(KEY_STORAGE_USED).setValue(Long.valueOf(getUsedStorage()));
        $jacocoInit[158] = true;
        arrayList.add(value23);
        $jacocoInit[159] = true;
        StateItem stateItem24 = new StateItem();
        $jacocoInit[160] = true;
        StateItem value24 = stateItem24.setKey(KEY_TAGS).setValue(getTags());
        $jacocoInit[161] = true;
        arrayList.add(value24);
        $jacocoInit[162] = true;
        StateItem stateItem25 = new StateItem();
        $jacocoInit[163] = true;
        StateItem value25 = stateItem25.setKey(KEY_WIFI_SSID).setValue(getWifiSSID());
        $jacocoInit[164] = true;
        arrayList.add(value25);
        $jacocoInit[165] = true;
        StateItem stateItem26 = new StateItem();
        $jacocoInit[166] = true;
        StateItem value26 = stateItem26.setKey(KEY_WIFI_STATE).setValue(Boolean.valueOf(isWifiEnable()));
        $jacocoInit[167] = true;
        arrayList.add(value26);
        $jacocoInit[168] = true;
        StateItem stateItem27 = new StateItem();
        $jacocoInit[169] = true;
        StateItem value27 = stateItem27.setKey("user_attributes").setValue(getUserAttributes());
        $jacocoInit[170] = true;
        arrayList.add(value27);
        $jacocoInit[171] = true;
        return arrayList;
    }

    public String getTags() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.tags;
        $jacocoInit[65] = true;
        return str;
    }

    public long getTotalMemory() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.totalMemory;
        $jacocoInit[35] = true;
        return j;
    }

    public long getTotalStorage() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.totalStorage;
        $jacocoInit[41] = true;
        return j;
    }

    public Uri getUri() {
        boolean[] $jacocoInit = $jacocoInit();
        Uri uri2 = this.uri;
        $jacocoInit[22] = true;
        return uri2;
    }

    public long getUsedMemory() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.usedMemory;
        $jacocoInit[31] = true;
        return j;
    }

    public long getUsedStorage() {
        boolean[] $jacocoInit = $jacocoInit();
        long j = this.usedStorage;
        $jacocoInit[37] = true;
        return j;
    }

    public String getUserAttributes() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.userAttributes;
        $jacocoInit[80] = true;
        return str;
    }

    public String getUserData() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.userData;
        $jacocoInit[61] = true;
        return str;
    }

    public String getUserEmail() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.userEmail;
        $jacocoInit[59] = true;
        return str;
    }

    public String getUserEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.userEvents;
        $jacocoInit[84] = true;
        return str;
    }

    public JSONArray getUserSteps() {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray a = C9949c.m46268a(this.userSteps);
        $jacocoInit[57] = true;
        return a;
    }

    public String getVisualUserSteps() {
        boolean[] $jacocoInit = $jacocoInit();
        String a = C10034b.m46676a(this.visualUserSteps);
        $jacocoInit[86] = true;
        return a;
    }

    public String getWifiSSID() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.wifiSSID;
        $jacocoInit[29] = true;
        return str;
    }

    public int hashCode() {
        boolean[] $jacocoInit = $jacocoInit();
        int hashCode = String.valueOf(getReportedAt()).hashCode();
        $jacocoInit[443] = true;
        return hashCode;
    }

    public boolean isDeviceRooted() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isDeviceRooted;
        $jacocoInit[11] = true;
        return z;
    }

    public boolean isWifiEnable() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.wifiState;
        $jacocoInit[27] = true;
        return z;
    }

    public State setAppPackageName(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.appPackageName = str;
        $jacocoInit[18] = true;
        return this;
    }

    public State setAppVersion(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.appVersion = str;
        $jacocoInit[20] = true;
        return this;
    }

    public State setBatteryLevel(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.batteryLevel = i;
        $jacocoInit[24] = true;
        return this;
    }

    public State setBatteryState(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.batteryState = str;
        $jacocoInit[26] = true;
        return this;
    }

    public State setCarrier(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.carrier = str;
        $jacocoInit[16] = true;
        return this;
    }

    public State setConsoleLog(ArrayList<C9947a> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.consoleLog = arrayList;
        $jacocoInit[56] = true;
        return this;
    }

    public State setCurrentView(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.currentView = str;
        $jacocoInit[50] = true;
        return this;
    }

    public State setDevice(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.device = str;
        $jacocoInit[10] = true;
        return this;
    }

    public State setDuration(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.duration = j;
        $jacocoInit[8] = true;
        return this;
    }

    public State setFreeMemory(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.freeMemory = j;
        $jacocoInit[34] = true;
        return this;
    }

    public State setFreeStorage(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.freeStorage = j;
        $jacocoInit[40] = true;
        return this;
    }

    public State setInstabugLog(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.instabugLog = str;
        $jacocoInit[52] = true;
        return this;
    }

    public State setIsDeviceRooted(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isDeviceRooted = z;
        $jacocoInit[12] = true;
        return this;
    }

    public State setLocale(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.locale = str;
        $jacocoInit[6] = true;
        return this;
    }

    public State setNetworkLogs(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.networkLogs = str;
        $jacocoInit[83] = true;
        return this;
    }

    public State setOS(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.f26440OS = str;
        $jacocoInit[14] = true;
        return this;
    }

    public State setReportedAt(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.reportedAt = j;
        $jacocoInit[64] = true;
        return this;
    }

    public State setScreenDensity(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.screenDensity = str;
        $jacocoInit[44] = true;
        return this;
    }

    public State setScreenOrientation(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.ScreenOrientation = str;
        $jacocoInit[48] = true;
        return this;
    }

    public State setScreenSize(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.screenSize = str;
        $jacocoInit[46] = true;
        return this;
    }

    public State setSdkVersion(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.sdkVersion = str;
        $jacocoInit[4] = true;
        return this;
    }

    public State setSessionProfilerTimeline(C9987c cVar) {
        boolean[] $jacocoInit = $jacocoInit();
        this.sessionProfilerTimeline = cVar;
        $jacocoInit[89] = true;
        return this;
    }

    public State setTags(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.tags = str;
        $jacocoInit[66] = true;
        return this;
    }

    public State setTotalMemory(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.totalMemory = j;
        $jacocoInit[36] = true;
        return this;
    }

    public State setTotalStorage(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.totalStorage = j;
        $jacocoInit[42] = true;
        return this;
    }

    public void setUri(Uri uri2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.uri = uri2;
        $jacocoInit[23] = true;
    }

    public State setUsedMemory(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.usedMemory = j;
        $jacocoInit[32] = true;
        return this;
    }

    public State setUsedStorage(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        this.usedStorage = j;
        $jacocoInit[38] = true;
        return this;
    }

    public State setUserAttributes(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userAttributes = str;
        $jacocoInit[81] = true;
        return this;
    }

    public State setUserData(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userData = str;
        $jacocoInit[62] = true;
        return this;
    }

    public State setUserEmail(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userEmail = str;
        $jacocoInit[60] = true;
        return this;
    }

    public State setUserEvents(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userEvents = str;
        $jacocoInit[85] = true;
        return this;
    }

    public State setUserSteps(ArrayList<C9949c> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.userSteps = arrayList;
        $jacocoInit[58] = true;
        return this;
    }

    public State setVisualUserSteps(ArrayList<C10034b> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        this.visualUserSteps = arrayList;
        $jacocoInit[87] = true;
        return this;
    }

    public State setWifiSSID(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.wifiSSID = str;
        $jacocoInit[30] = true;
        return this;
    }

    public State setWifiState(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.wifiState = z;
        $jacocoInit[28] = true;
        return this;
    }

    public String toJson() throws JSONException {
        boolean[] $jacocoInit = $jacocoInit();
        JSONObject jSONObject = new JSONObject();
        $jacocoInit[172] = true;
        ArrayList stateItems = getStateItems();
        $jacocoInit[173] = true;
        $jacocoInit[174] = true;
        int i = 0;
        int i2 = 0;
        while (i2 < stateItems.size()) {
            $jacocoInit[175] = true;
            jSONObject.put(((StateItem) stateItems.get(i2)).getKey(), ((StateItem) stateItems.get(i2)).getValue());
            i2++;
            $jacocoInit[176] = true;
        }
        ArrayList logsItems = getLogsItems();
        $jacocoInit[177] = true;
        $jacocoInit[178] = true;
        while (i < logsItems.size()) {
            $jacocoInit[179] = true;
            jSONObject.put(((StateItem) logsItems.get(i)).getKey(), ((StateItem) logsItems.get(i)).getValue());
            i++;
            $jacocoInit[180] = true;
        }
        InstabugSDKLogger.m46626v(this, jSONObject.toString());
        $jacocoInit[181] = true;
        String jSONObject2 = jSONObject.toString();
        $jacocoInit[182] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            String json = toJson();
            $jacocoInit[327] = true;
            return json;
        } catch (JSONException e) {
            $jacocoInit[328] = true;
            e.printStackTrace();
            $jacocoInit[329] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong while getting state.toString()");
            $jacocoInit[330] = true;
            sb.append(e.getMessage());
            String sb2 = sb.toString();
            $jacocoInit[331] = true;
            InstabugSDKLogger.m46624e(this, sb2, e);
            $jacocoInit[332] = true;
            return "error";
        }
    }

    public void updateConsoleLog() {
        boolean[] $jacocoInit = $jacocoInit();
        setConsoleLog(Builder.access$000());
        $jacocoInit[53] = true;
    }

    public State setTags(List<String> list) {
        boolean[] $jacocoInit = $jacocoInit();
        this.tags = getTagsAsString(list);
        $jacocoInit[79] = true;
        return this;
    }

    public void updateConsoleLog(ArrayList<C9947a> arrayList) {
        boolean[] $jacocoInit = $jacocoInit();
        setConsoleLog(Builder.access$100(arrayList));
        $jacocoInit[54] = true;
    }
}
