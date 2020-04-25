package com.instabug.library.core.plugin;

import android.content.Context;
import com.instabug.library.core.plugin.PluginPromptOption.C9788a;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.core.plugin.a */
/* compiled from: PluginsManager */
public class C9789a {

    /* renamed from: a */
    private static List<Plugin> f25970a;

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25971b;

    public C9789a() {
        m45664e()[0] = true;
    }

    /* renamed from: a */
    public static synchronized void m45659a(Context context) {
        Class<C9789a> cls = C9789a.class;
        synchronized (cls) {
            boolean[] e = m45664e();
            if (f25970a != null) {
                e[1] = true;
            } else {
                e[2] = true;
                f25970a = new ArrayList();
                int i = 0;
                String[] strArr = {"com.instabug.crash.CrashPlugin", "com.instabug.survey.SurveyPlugin", "com.instabug.chat.ChatPlugin", "com.instabug.bug.BugPlugin", "com.instabug.featuresrequest.FeaturesRequestPlugin"};
                int length = strArr.length;
                e[3] = true;
                while (i < length) {
                    String str = strArr[i];
                    try {
                        e[5] = true;
                        Plugin plugin = (Plugin) Class.forName(str).newInstance();
                        e[6] = true;
                        plugin.init(context);
                        e[7] = true;
                        f25970a.add(plugin);
                        e[8] = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("pluginClassPath: ");
                        sb.append(str);
                        InstabugSDKLogger.m46622d(cls, sb.toString());
                        e[9] = true;
                    } catch (ClassNotFoundException e2) {
                        e[10] = true;
                        e2.printStackTrace();
                        e[11] = true;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Can't get: ");
                        sb2.append(str);
                        InstabugSDKLogger.m46623e(cls, sb2.toString());
                        e[12] = true;
                    } catch (InstantiationException e3) {
                        e[13] = true;
                        e3.printStackTrace();
                        e[14] = true;
                    } catch (IllegalAccessException e4) {
                        e[15] = true;
                        e4.printStackTrace();
                        e[16] = true;
                    }
                    i++;
                    e[17] = true;
                }
                e[4] = true;
            }
            e[18] = true;
        }
    }

    /* renamed from: b */
    public static long m45661b() {
        boolean[] e = m45664e();
        if (f25970a != null) {
            e[26] = true;
        } else {
            e[27] = true;
            InstabugSDKLogger.m46623e(C9789a.class, "PluginsManager.getLastActivityTime() was called before PluginsManager.init() was called");
            e[28] = true;
        }
        long j = 0;
        e[29] = true;
        e[30] = true;
        for (Plugin plugin : f25970a) {
            e[31] = true;
            long lastActivityTime = plugin.getLastActivityTime();
            if (lastActivityTime <= j) {
                e[32] = true;
            } else {
                e[33] = true;
                j = lastActivityTime;
            }
            e[34] = true;
        }
        e[35] = true;
        return j;
    }

    /* renamed from: c */
    public static ArrayList<PluginPromptOption> m45662c() {
        boolean[] e = m45664e();
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        e[36] = true;
        e[37] = true;
        for (Plugin plugin : f25970a) {
            e[38] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("plugin: ");
            sb.append(plugin.toString());
            InstabugSDKLogger.m46626v(C9789a.class, sb.toString());
            e[39] = true;
            ArrayList promptOptions = plugin.getPromptOptions();
            if (promptOptions == null) {
                e[40] = true;
            } else {
                e[41] = true;
                arrayList.addAll(promptOptions);
                e[42] = true;
            }
            e[43] = true;
        }
        m45660a(arrayList);
        e[44] = true;
        return arrayList;
    }

    /* renamed from: d */
    public static boolean m45663d() {
        boolean z;
        boolean[] e = m45664e();
        List<Plugin> list = f25970a;
        if (list == null) {
            e[46] = true;
        } else {
            e[47] = true;
            e[48] = true;
            for (Plugin plugin : list) {
                e[50] = true;
                if (plugin.getState() != 0) {
                    e[51] = true;
                    return true;
                }
                e[52] = true;
            }
            e[49] = true;
        }
        if (SettingsManager.getInstance().isPromptOptionsScreenShown()) {
            e[53] = true;
        } else {
            e[54] = true;
            if (SettingsManager.getInstance().isRequestPermissionScreenShown()) {
                e[55] = true;
            } else {
                e[56] = true;
                if (SettingsManager.getInstance().isOnboardingShowing()) {
                    e[57] = true;
                } else {
                    z = false;
                    e[59] = true;
                    e[60] = true;
                    return z;
                }
            }
        }
        e[58] = true;
        z = true;
        e[60] = true;
        return z;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45664e() {
        boolean[] zArr = f25971b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1249042494878411374L, "com/instabug/library/core/plugin/PluginsManager", 69);
        f25971b = a;
        return a;
    }

    /* renamed from: a */
    public static void m45658a() {
        boolean[] e = m45664e();
        if (f25970a != null) {
            e[19] = true;
        } else {
            e[20] = true;
            InstabugSDKLogger.m46623e(C9789a.class, "PluginsManager.releasePlugins() was called before PluginsManager.init() was called");
            e[21] = true;
        }
        e[22] = true;
        for (Plugin plugin : f25970a) {
            e[23] = true;
            plugin.release();
            e[24] = true;
        }
        e[25] = true;
    }

    /* renamed from: a */
    private static void m45660a(ArrayList<PluginPromptOption> arrayList) {
        boolean[] e = m45664e();
        Collections.sort(arrayList, new C9788a());
        e[45] = true;
    }

    /* renamed from: a */
    public static Plugin m45657a(Class cls) {
        boolean[] e = m45664e();
        List<Plugin> list = f25970a;
        if (list == null) {
            e[61] = true;
        } else {
            e[62] = true;
            e[63] = true;
            for (Plugin plugin : list) {
                e[65] = true;
                if (cls.isInstance(plugin)) {
                    e[66] = true;
                    return plugin;
                }
                e[67] = true;
            }
            e[64] = true;
        }
        e[68] = true;
        return null;
    }
}
