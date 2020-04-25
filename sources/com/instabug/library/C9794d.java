package com.instabug.library;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.instabug.library.bugreporting.model.ReportCategory;
import com.instabug.library.extendedbugreport.ExtendedBugReport.State;
import com.instabug.library.model.BugCategory;
import com.mrsool.utils.C11644i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.d */
/* compiled from: InstabugTouchesCoordinates */
public class C9794d {

    /* renamed from: b */
    private static C9794d f25979b = new C9794d();

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25980c;

    /* renamed from: a */
    private C9795a[] f25981a;

    /* renamed from: com.instabug.library.d$a */
    /* compiled from: InstabugTouchesCoordinates */
    public static class C9795a {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25982c;

        /* renamed from: a */
        private int f25983a = -1;

        /* renamed from: b */
        private int f25984b = -1;

        public C9795a(int i, int i2) {
            boolean[] c = m45675c();
            this.f25983a = i;
            this.f25984b = i2;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m45675c() {
            boolean[] zArr = f25982c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2481878653747578789L, "com/instabug/library/InstabugTouchesCoordinates$InstabugTouchEvent", 5);
            f25982c = a;
            return a;
        }

        /* renamed from: a */
        public int mo34923a() {
            boolean[] c = m45675c();
            int i = this.f25983a;
            c[1] = true;
            return i;
        }

        /* renamed from: b */
        public int mo34924b() {
            boolean[] c = m45675c();
            int i = this.f25984b;
            c[3] = true;
            return i;
        }
    }

    /* renamed from: com.instabug.library.d$b */
    /* compiled from: InstabugBugReporting */
    public class C9796b {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25985a;

        /* renamed from: a */
        public static void m45679a(OnSdkDismissedCallback onSdkDismissedCallback) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setLegacyOnSdkDismissedCallback");
                if (a == null) {
                    d[23] = true;
                } else {
                    d[24] = true;
                    a.invoke(null, new Object[]{onSdkDismissedCallback});
                    d[25] = true;
                }
                d[26] = true;
            } catch (ClassNotFoundException e) {
                d[27] = true;
                e.printStackTrace();
                d[28] = true;
            } catch (InvocationTargetException e2) {
                d[29] = true;
                e2.printStackTrace();
                d[30] = true;
            } catch (IllegalAccessException e3) {
                d[31] = true;
                e3.printStackTrace();
                d[32] = true;
            }
            d[33] = true;
        }

        /* renamed from: b */
        public static void m45687b(boolean z) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setCommentFieldRequired");
                if (a == null) {
                    d[99] = true;
                } else {
                    d[100] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[101] = true;
                }
                d[102] = true;
            } catch (ClassNotFoundException e) {
                d[103] = true;
                e.printStackTrace();
                d[104] = true;
            } catch (InvocationTargetException e2) {
                d[105] = true;
                e2.printStackTrace();
                d[106] = true;
            } catch (IllegalAccessException e3) {
                d[107] = true;
                e3.printStackTrace();
                d[108] = true;
            }
            d[109] = true;
        }

        /* renamed from: c */
        public static void m45689c(boolean z) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setEmailFieldVisibility");
                if (a == null) {
                    d[110] = true;
                } else {
                    d[111] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[112] = true;
                }
                d[113] = true;
            } catch (ClassNotFoundException e) {
                d[114] = true;
                e.printStackTrace();
                d[115] = true;
            } catch (InvocationTargetException e2) {
                d[116] = true;
                e2.printStackTrace();
                d[117] = true;
            } catch (IllegalAccessException e3) {
                d[118] = true;
                e3.printStackTrace();
                d[119] = true;
            }
            d[120] = true;
        }

        /* renamed from: d */
        public static void m45690d(boolean z) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setSuccessDialogEnabled");
                if (a == null) {
                    d[156] = true;
                } else {
                    d[157] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[158] = true;
                }
                d[159] = true;
            } catch (ClassNotFoundException e) {
                d[160] = true;
                e.printStackTrace();
                d[161] = true;
            } catch (InvocationTargetException e2) {
                d[162] = true;
                e2.printStackTrace();
                d[163] = true;
            } catch (IllegalAccessException e3) {
                d[164] = true;
                e3.printStackTrace();
                d[165] = true;
            }
            d[166] = true;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m45691d() {
            boolean[] zArr = f25985a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6653428984320168631L, "com/instabug/library/temp/InstabugBugReporting", C11644i.f33366n0);
            f25985a = a;
            return a;
        }

        /* renamed from: e */
        public static void m45692e(boolean z) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setScreenshotRequired");
                if (a == null) {
                    d[210] = true;
                } else {
                    d[211] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[212] = true;
                }
                d[213] = true;
            } catch (ClassNotFoundException e) {
                d[214] = true;
                e.printStackTrace();
                d[215] = true;
            } catch (InvocationTargetException e2) {
                d[216] = true;
                e2.printStackTrace();
                d[217] = true;
            } catch (IllegalAccessException e3) {
                d[218] = true;
                e3.printStackTrace();
                d[219] = true;
            }
            d[220] = true;
        }

        /* renamed from: a */
        public static void m45683a(boolean z) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setEmailFieldRequired");
                if (a == null) {
                    d[88] = true;
                } else {
                    d[89] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[90] = true;
                }
                d[91] = true;
            } catch (ClassNotFoundException e) {
                d[92] = true;
                e.printStackTrace();
                d[93] = true;
            } catch (InvocationTargetException e2) {
                d[94] = true;
                e2.printStackTrace();
                d[95] = true;
            } catch (IllegalAccessException e3) {
                d[96] = true;
                e3.printStackTrace();
                d[97] = true;
            }
            d[98] = true;
        }

        /* renamed from: b */
        public static void m45686b(List<ReportCategory> list) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setLegacyReportCategories");
                if (a == null) {
                    d[145] = true;
                } else {
                    d[146] = true;
                    a.invoke(null, new Object[]{list});
                    d[147] = true;
                }
                d[148] = true;
            } catch (ClassNotFoundException e) {
                d[149] = true;
                e.printStackTrace();
                d[150] = true;
            } catch (InvocationTargetException e2) {
                d[151] = true;
                e2.printStackTrace();
                d[152] = true;
            } catch (IllegalAccessException e3) {
                d[153] = true;
                e3.printStackTrace();
                d[154] = true;
            }
            d[155] = true;
        }

        /* renamed from: c */
        private static Class m45688c() throws ClassNotFoundException {
            boolean[] d = m45691d();
            Class cls = Class.forName("com.instabug.bug.BugReporting");
            d[221] = true;
            return cls;
        }

        /* renamed from: a */
        public static void m45684a(boolean z, boolean z2, boolean z3, boolean z4) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setAttachmentTypesEnabled");
                if (a == null) {
                    d[121] = true;
                } else {
                    d[122] = true;
                    d[123] = true;
                    Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)};
                    d[124] = true;
                    a.invoke(null, objArr);
                    d[125] = true;
                }
                d[126] = true;
            } catch (ClassNotFoundException e) {
                d[127] = true;
                e.printStackTrace();
                d[128] = true;
            } catch (InvocationTargetException e2) {
                d[129] = true;
                e2.printStackTrace();
                d[130] = true;
            } catch (IllegalAccessException e3) {
                d[131] = true;
                e3.printStackTrace();
                d[132] = true;
            }
            d[133] = true;
        }

        /* renamed from: b */
        public static void m45685b() {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "clearExtraReportFields");
                if (a == null) {
                    d[188] = true;
                } else {
                    d[189] = true;
                    a.invoke(null, new Object[0]);
                    d[190] = true;
                }
                d[191] = true;
            } catch (ClassNotFoundException e) {
                d[192] = true;
                e.printStackTrace();
                d[193] = true;
            } catch (InvocationTargetException e2) {
                d[194] = true;
                e2.printStackTrace();
                d[195] = true;
            } catch (IllegalAccessException e3) {
                d[196] = true;
                e3.printStackTrace();
                d[197] = true;
            }
            d[198] = true;
        }

        /* renamed from: a */
        public static void m45682a(List<BugCategory> list) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setLegacyBugCategories");
                if (a == null) {
                    d[134] = true;
                } else {
                    d[135] = true;
                    a.invoke(null, new Object[]{list});
                    d[136] = true;
                }
                d[137] = true;
            } catch (ClassNotFoundException e) {
                d[138] = true;
                e.printStackTrace();
                d[139] = true;
            } catch (InvocationTargetException e2) {
                d[140] = true;
                e2.printStackTrace();
                d[141] = true;
            } catch (IllegalAccessException e3) {
                d[142] = true;
                e3.printStackTrace();
                d[143] = true;
            }
            d[144] = true;
        }

        /* renamed from: a */
        public static Runnable m45678a() {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "getPreReportRunnable");
                if (a != null) {
                    d[167] = true;
                    Runnable runnable = (Runnable) a.invoke(null, new Object[0]);
                    d[168] = true;
                    return runnable;
                }
                d[169] = true;
                d[176] = true;
                return null;
            } catch (ClassNotFoundException e) {
                d[170] = true;
                e.printStackTrace();
                d[171] = true;
            } catch (InvocationTargetException e2) {
                d[172] = true;
                e2.printStackTrace();
                d[173] = true;
            } catch (IllegalAccessException e3) {
                d[174] = true;
                e3.printStackTrace();
                d[175] = true;
            }
        }

        /* renamed from: a */
        public static void m45681a(CharSequence charSequence, boolean z) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "addExtraReportField");
                if (a == null) {
                    d[177] = true;
                } else {
                    d[178] = true;
                    a.invoke(null, new Object[]{charSequence, Boolean.valueOf(z)});
                    d[179] = true;
                }
                d[180] = true;
            } catch (ClassNotFoundException e) {
                d[181] = true;
                e.printStackTrace();
                d[182] = true;
            } catch (InvocationTargetException e2) {
                d[183] = true;
                e2.printStackTrace();
                d[184] = true;
            } catch (IllegalAccessException e3) {
                d[185] = true;
                e3.printStackTrace();
                d[186] = true;
            }
            d[187] = true;
        }

        /* renamed from: a */
        public static void m45680a(State state) {
            boolean[] d = m45691d();
            try {
                Method a = C9809f.m45759a(m45688c(), "setExtendedBugReportState");
                if (a == null) {
                    d[199] = true;
                } else {
                    d[200] = true;
                    a.invoke(null, new Object[]{state});
                    d[201] = true;
                }
                d[202] = true;
            } catch (ClassNotFoundException e) {
                d[203] = true;
                e.printStackTrace();
                d[204] = true;
            } catch (InvocationTargetException e2) {
                d[205] = true;
                e2.printStackTrace();
                d[206] = true;
            } catch (IllegalAccessException e3) {
                d[207] = true;
                e3.printStackTrace();
                d[208] = true;
            }
            d[209] = true;
        }
    }

    /* renamed from: com.instabug.library.d$c */
    /* compiled from: InstabugChat */
    public class C9797c {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25986a;

        /* renamed from: a */
        public static void m45696a(Runnable runnable) throws IllegalStateException {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "setNewMessageHandler");
                if (a == null) {
                    d[1] = true;
                } else {
                    d[2] = true;
                    a.invoke(null, new Object[]{runnable});
                    d[3] = true;
                }
                d[4] = true;
            } catch (ClassNotFoundException e) {
                d[5] = true;
                e.printStackTrace();
                d[6] = true;
            } catch (InvocationTargetException e2) {
                d[7] = true;
                e2.printStackTrace();
                d[8] = true;
            } catch (IllegalAccessException e3) {
                d[9] = true;
                e3.printStackTrace();
                d[10] = true;
            }
            d[11] = true;
        }

        /* renamed from: b */
        public static void m45703b(Bundle bundle) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45760a(m45707c(), "showNotification", Bundle.class);
                if (a == null) {
                    d[45] = true;
                } else {
                    d[46] = true;
                    a.invoke(null, new Object[]{bundle});
                    d[47] = true;
                }
                d[48] = true;
            } catch (ClassNotFoundException e) {
                d[49] = true;
                e.printStackTrace();
                d[50] = true;
            } catch (InvocationTargetException e2) {
                d[51] = true;
                e2.printStackTrace();
                d[52] = true;
            } catch (IllegalAccessException e3) {
                d[53] = true;
                e3.printStackTrace();
                d[54] = true;
            }
            d[55] = true;
        }

        /* renamed from: c */
        public static void m45708c(boolean z) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "enableSystemNotificationSound");
                if (a == null) {
                    d[100] = true;
                } else {
                    d[101] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[102] = true;
                }
                d[103] = true;
            } catch (ClassNotFoundException e) {
                d[104] = true;
                e.printStackTrace();
                d[105] = true;
            } catch (InvocationTargetException e2) {
                d[106] = true;
                e2.printStackTrace();
                d[107] = true;
            } catch (IllegalAccessException e3) {
                d[108] = true;
                e3.printStackTrace();
                d[109] = true;
            }
            d[110] = true;
        }

        /* renamed from: d */
        public static void m45709d(boolean z) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "enableInAppNotificationSound");
                if (a == null) {
                    d[111] = true;
                } else {
                    d[112] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[113] = true;
                }
                d[114] = true;
            } catch (ClassNotFoundException e) {
                d[115] = true;
                e.printStackTrace();
                d[116] = true;
            } catch (InvocationTargetException e2) {
                d[117] = true;
                e2.printStackTrace();
                d[118] = true;
            } catch (IllegalAccessException e3) {
                d[119] = true;
                e3.printStackTrace();
                d[120] = true;
            }
            d[121] = true;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m45710d() {
            boolean[] zArr = f25986a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7244317628349870474L, "com/instabug/library/temp/InstabugChat", C13959t.f40868Z2);
            f25986a = a;
            return a;
        }

        /* renamed from: a */
        public static int m45693a() throws IllegalStateException {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "getUnreadMessagesCount");
                if (a != null) {
                    d[12] = true;
                    Object invoke = a.invoke(null, new Object[0]);
                    d[13] = true;
                    int intValue = ((Integer) invoke).intValue();
                    d[14] = true;
                    return intValue;
                }
                d[15] = true;
                d[22] = true;
                return 0;
            } catch (ClassNotFoundException e) {
                d[16] = true;
                e.printStackTrace();
                d[17] = true;
            } catch (InvocationTargetException e2) {
                d[18] = true;
                e2.printStackTrace();
                d[19] = true;
            } catch (IllegalAccessException e3) {
                d[20] = true;
                e3.printStackTrace();
                d[21] = true;
            }
        }

        /* renamed from: b */
        public static void m45705b(Map<String, String> map) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45760a(m45707c(), "showNotification", Map.class);
                if (a == null) {
                    d[56] = true;
                } else {
                    d[57] = true;
                    a.invoke(null, new Object[]{map});
                    d[58] = true;
                }
                d[59] = true;
            } catch (ClassNotFoundException e) {
                d[60] = true;
                e.printStackTrace();
                d[61] = true;
            } catch (InvocationTargetException e2) {
                d[62] = true;
                e2.printStackTrace();
                d[63] = true;
            } catch (IllegalAccessException e3) {
                d[64] = true;
                e3.printStackTrace();
                d[65] = true;
            }
            d[66] = true;
        }

        /* renamed from: c */
        private static Class m45707c() throws ClassNotFoundException {
            boolean[] d = m45710d();
            Class cls = Class.forName("com.instabug.chat.InstabugChat");
            d[188] = true;
            return cls;
        }

        /* renamed from: b */
        public static void m45706b(boolean z) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "enableConversationSound");
                if (a == null) {
                    d[89] = true;
                } else {
                    d[90] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[91] = true;
                }
                d[92] = true;
            } catch (ClassNotFoundException e) {
                d[93] = true;
                e.printStackTrace();
                d[94] = true;
            } catch (InvocationTargetException e2) {
                d[95] = true;
                e2.printStackTrace();
                d[96] = true;
            } catch (IllegalAccessException e3) {
                d[97] = true;
                e3.printStackTrace();
                d[98] = true;
            }
            d[99] = true;
        }

        /* renamed from: a */
        public static boolean m45700a(Bundle bundle) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45760a(m45707c(), "isInstabugNotification", Bundle.class);
                if (a != null) {
                    d[23] = true;
                    Object invoke = a.invoke(null, new Object[]{bundle});
                    d[24] = true;
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    d[25] = true;
                    return booleanValue;
                }
                d[26] = true;
                d[33] = true;
                return false;
            } catch (ClassNotFoundException e) {
                d[27] = true;
                e.printStackTrace();
                d[28] = true;
            } catch (InvocationTargetException e2) {
                d[29] = true;
                e2.printStackTrace();
                d[30] = true;
            } catch (IllegalAccessException e3) {
                d[31] = true;
                e3.printStackTrace();
                d[32] = true;
            }
        }

        /* renamed from: b */
        public static void m45702b() {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "openNewChat");
                if (a == null) {
                    d[144] = true;
                } else {
                    d[145] = true;
                    a.invoke(null, new Object[0]);
                    d[146] = true;
                }
                d[147] = true;
            } catch (ClassNotFoundException e) {
                d[148] = true;
                e.printStackTrace();
                d[149] = true;
            } catch (InvocationTargetException e2) {
                d[150] = true;
                e2.printStackTrace();
                d[151] = true;
            } catch (IllegalAccessException e3) {
                d[152] = true;
                e3.printStackTrace();
                d[153] = true;
            }
            d[154] = true;
        }

        /* renamed from: a */
        public static boolean m45701a(Map<String, String> map) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45760a(m45707c(), "isInstabugNotification", Map.class);
                if (a != null) {
                    d[34] = true;
                    Object invoke = a.invoke(null, new Object[]{map});
                    d[35] = true;
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    d[36] = true;
                    return booleanValue;
                }
                d[37] = true;
                d[44] = true;
                return false;
            } catch (ClassNotFoundException e) {
                d[38] = true;
                e.printStackTrace();
                d[39] = true;
            } catch (InvocationTargetException e2) {
                d[40] = true;
                e2.printStackTrace();
                d[41] = true;
            } catch (IllegalAccessException e3) {
                d[42] = true;
                e3.printStackTrace();
                d[43] = true;
            }
        }

        /* renamed from: b */
        public static void m45704b(String str) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "setPushNotificationChannelId");
                if (a == null) {
                    d[177] = true;
                } else {
                    d[178] = true;
                    a.invoke(null, new Object[]{str});
                    d[179] = true;
                }
                d[180] = true;
            } catch (ClassNotFoundException e) {
                d[181] = true;
                e.printStackTrace();
                d[182] = true;
            } catch (InvocationTargetException e2) {
                d[183] = true;
                e2.printStackTrace();
                d[184] = true;
            } catch (IllegalAccessException e3) {
                d[185] = true;
                e3.printStackTrace();
                d[186] = true;
            }
            d[187] = true;
        }

        /* renamed from: a */
        public static void m45698a(boolean z) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "enableNotification");
                if (a == null) {
                    d[67] = true;
                } else {
                    d[68] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[69] = true;
                }
                d[70] = true;
            } catch (ClassNotFoundException e) {
                d[71] = true;
                e.printStackTrace();
                d[72] = true;
            } catch (InvocationTargetException e2) {
                d[73] = true;
                e2.printStackTrace();
                d[74] = true;
            } catch (IllegalAccessException e3) {
                d[75] = true;
                e3.printStackTrace();
                d[76] = true;
            }
            d[77] = true;
        }

        /* renamed from: a */
        public static void m45697a(String str) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "setPushNotificationRegistrationToken");
                if (a == null) {
                    d[78] = true;
                } else {
                    d[79] = true;
                    a.invoke(null, new Object[]{str});
                    d[80] = true;
                }
                d[81] = true;
            } catch (ClassNotFoundException e) {
                d[82] = true;
                e.printStackTrace();
                d[83] = true;
            } catch (InvocationTargetException e2) {
                d[84] = true;
                e2.printStackTrace();
                d[85] = true;
            } catch (IllegalAccessException e3) {
                d[86] = true;
                e3.printStackTrace();
                d[87] = true;
            }
            d[88] = true;
        }

        /* renamed from: a */
        public static void m45694a(int i) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "setNotificationIcon");
                if (a == null) {
                    d[122] = true;
                } else {
                    d[123] = true;
                    a.invoke(null, new Object[]{Integer.valueOf(i)});
                    d[124] = true;
                }
                d[125] = true;
            } catch (ClassNotFoundException e) {
                d[126] = true;
                e.printStackTrace();
                d[127] = true;
            } catch (InvocationTargetException e2) {
                d[128] = true;
                e2.printStackTrace();
                d[129] = true;
            } catch (IllegalAccessException e3) {
                d[130] = true;
                e3.printStackTrace();
                d[131] = true;
            }
            d[132] = true;
        }

        /* renamed from: a */
        public static void m45699a(boolean z, boolean z2, boolean z3) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "setAttachmentTypesEnabled");
                if (a == null) {
                    d[133] = true;
                } else {
                    d[134] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)});
                    d[135] = true;
                }
                d[136] = true;
            } catch (ClassNotFoundException e) {
                d[137] = true;
                e.printStackTrace();
                d[138] = true;
            } catch (InvocationTargetException e2) {
                d[139] = true;
                e2.printStackTrace();
                d[140] = true;
            } catch (IllegalAccessException e3) {
                d[141] = true;
                e3.printStackTrace();
                d[142] = true;
            }
            d[143] = true;
        }

        /* renamed from: a */
        public static void m45695a(OnSdkDismissedCallback onSdkDismissedCallback) {
            boolean[] d = m45710d();
            try {
                Method a = C9809f.m45759a(m45707c(), "setOnSdkDismissedCallback");
                if (a == null) {
                    d[166] = true;
                } else {
                    d[167] = true;
                    a.invoke(null, new Object[]{onSdkDismissedCallback});
                    d[168] = true;
                }
                d[169] = true;
            } catch (ClassNotFoundException e) {
                d[170] = true;
                e.printStackTrace();
                d[171] = true;
            } catch (InvocationTargetException e2) {
                d[172] = true;
                e2.printStackTrace();
                d[173] = true;
            } catch (IllegalAccessException e3) {
                d[174] = true;
                e3.printStackTrace();
                d[175] = true;
            }
            d[176] = true;
        }
    }

    /* renamed from: com.instabug.library.d$d */
    /* compiled from: InstabugCrash */
    public class C9798d {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25987a;

        /* renamed from: a */
        public static void m45712a(Throwable th, @C0195i0 String str) {
            boolean[] b = m45713b();
            try {
                Method a = C9809f.m45760a(m45711a(), "reportException", Throwable.class, String.class);
                if (a == null) {
                    b[1] = true;
                } else {
                    b[2] = true;
                    a.invoke(null, new Object[]{th, str});
                    b[3] = true;
                }
                b[4] = true;
            } catch (ClassNotFoundException e) {
                b[5] = true;
                e.printStackTrace();
                b[6] = true;
            } catch (InvocationTargetException e2) {
                b[7] = true;
                e2.printStackTrace();
                b[8] = true;
            } catch (IllegalAccessException e3) {
                b[9] = true;
                e3.printStackTrace();
                b[10] = true;
            }
            b[11] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45713b() {
            boolean[] zArr = f25987a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7468639051350672304L, "com/instabug/library/temp/InstabugCrash", 24);
            f25987a = a;
            return a;
        }

        /* renamed from: a */
        private static Class m45711a() throws ClassNotFoundException {
            boolean[] b = m45713b();
            Class cls = Class.forName("com.instabug.crash.CrashReporting");
            b[23] = true;
            return cls;
        }
    }

    /* renamed from: com.instabug.library.d$e */
    /* compiled from: InstabugFeatureRequests */
    public class C9799e {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25988a;

        /* renamed from: a */
        public static boolean m45714a() {
            boolean[] c = m45718c();
            try {
                Method a = C9809f.m45759a(m45716b(), "showFeatureRequests");
                if (a == null) {
                    c[1] = true;
                } else {
                    c[2] = true;
                    a.invoke(null, new Object[0]);
                    c[3] = true;
                }
                c[4] = true;
            } catch (ClassNotFoundException e) {
                c[5] = true;
                e.printStackTrace();
                c[6] = true;
            } catch (InvocationTargetException e2) {
                c[7] = true;
                e2.printStackTrace();
                c[8] = true;
            } catch (IllegalAccessException e3) {
                c[9] = true;
                e3.printStackTrace();
                c[10] = true;
            }
            c[11] = true;
            return false;
        }

        /* renamed from: b */
        public static boolean m45717b(boolean z) {
            boolean[] c = m45718c();
            try {
                Method a = C9809f.m45759a(m45716b(), "setCommenterEmailFieldRequired");
                if (a == null) {
                    c[23] = true;
                } else {
                    c[24] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    c[25] = true;
                }
                c[26] = true;
            } catch (ClassNotFoundException e) {
                c[27] = true;
                e.printStackTrace();
                c[28] = true;
            } catch (InvocationTargetException e2) {
                c[29] = true;
                e2.printStackTrace();
                c[30] = true;
            } catch (IllegalAccessException e3) {
                c[31] = true;
                e3.printStackTrace();
                c[32] = true;
            }
            c[33] = true;
            return false;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m45718c() {
            boolean[] zArr = f25988a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4982406700849153889L, "com/instabug/library/temp/InstabugFeatureRequests", 35);
            f25988a = a;
            return a;
        }

        /* renamed from: a */
        public static boolean m45715a(boolean z) {
            boolean[] c = m45718c();
            try {
                Method a = C9809f.m45759a(m45716b(), "setNewFeatureEmailFieldRequired");
                if (a == null) {
                    c[12] = true;
                } else {
                    c[13] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    c[14] = true;
                }
                c[15] = true;
            } catch (ClassNotFoundException e) {
                c[16] = true;
                e.printStackTrace();
                c[17] = true;
            } catch (InvocationTargetException e2) {
                c[18] = true;
                e2.printStackTrace();
                c[19] = true;
            } catch (IllegalAccessException e3) {
                c[20] = true;
                e3.printStackTrace();
                c[21] = true;
            }
            c[22] = true;
            return false;
        }

        /* renamed from: b */
        private static Class m45716b() throws ClassNotFoundException {
            boolean[] c = m45718c();
            Class cls = Class.forName("com.instabug.featuresrequest.FeatureRequests");
            c[34] = true;
            return cls;
        }
    }

    /* renamed from: com.instabug.library.d$f */
    /* compiled from: InstabugSurvey */
    public class C9800f {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f25989a;

        /* renamed from: a */
        public static boolean m45722a() {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "showValidSurvey");
                if (a != null) {
                    d[1] = true;
                    Object invoke = a.invoke(null, new Object[0]);
                    d[2] = true;
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    d[3] = true;
                    return booleanValue;
                }
                d[4] = true;
                d[11] = true;
                return false;
            } catch (ClassNotFoundException e) {
                d[5] = true;
                e.printStackTrace();
                d[6] = true;
            } catch (InvocationTargetException e2) {
                d[7] = true;
                e2.printStackTrace();
                d[8] = true;
            } catch (IllegalAccessException e3) {
                d[9] = true;
                e3.printStackTrace();
                d[10] = true;
            }
        }

        /* renamed from: b */
        public static boolean m45726b() {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "hasValidSurveys");
                if (a != null) {
                    d[12] = true;
                    Object invoke = a.invoke(null, new Object[0]);
                    d[13] = true;
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    d[14] = true;
                    return booleanValue;
                }
                d[15] = true;
                d[22] = true;
                return false;
            } catch (ClassNotFoundException e) {
                d[16] = true;
                e.printStackTrace();
                d[17] = true;
            } catch (InvocationTargetException e2) {
                d[18] = true;
                e2.printStackTrace();
                d[19] = true;
            } catch (IllegalAccessException e3) {
                d[20] = true;
                e3.printStackTrace();
                d[21] = true;
            }
        }

        /* renamed from: c */
        private static Class m45728c() throws ClassNotFoundException {
            boolean[] d = m45729d();
            Class cls = Class.forName("com.instabug.survey.Surveys");
            d[100] = true;
            return cls;
        }

        /* renamed from: d */
        private static /* synthetic */ boolean[] m45729d() {
            boolean[] zArr = f25989a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7643322942912630729L, "com/instabug/library/temp/InstabugSurvey", 101);
            f25989a = a;
            return a;
        }

        /* renamed from: a */
        public static void m45720a(Runnable runnable) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "setPreShowingSurveyRunnable");
                if (a == null) {
                    d[23] = true;
                } else {
                    d[24] = true;
                    a.invoke(null, new Object[]{runnable});
                    d[25] = true;
                }
                d[26] = true;
            } catch (ClassNotFoundException e) {
                d[27] = true;
                e.printStackTrace();
                d[28] = true;
            } catch (InvocationTargetException e2) {
                d[29] = true;
                e2.printStackTrace();
                d[30] = true;
            } catch (IllegalAccessException e3) {
                d[31] = true;
                e3.printStackTrace();
                d[32] = true;
            }
            d[33] = true;
        }

        /* renamed from: b */
        public static void m45724b(Runnable runnable) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "setAfterShowingSurveyRunnable");
                if (a == null) {
                    d[34] = true;
                } else {
                    d[35] = true;
                    a.invoke(null, new Object[]{runnable});
                    d[36] = true;
                }
                d[37] = true;
            } catch (ClassNotFoundException e) {
                d[38] = true;
                e.printStackTrace();
                d[39] = true;
            } catch (InvocationTargetException e2) {
                d[40] = true;
                e2.printStackTrace();
                d[41] = true;
            } catch (IllegalAccessException e3) {
                d[42] = true;
                e3.printStackTrace();
                d[43] = true;
            }
            d[44] = true;
        }

        /* renamed from: a */
        public static void m45721a(boolean z) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "setSurveysAutoShowing");
                if (a == null) {
                    d[45] = true;
                } else {
                    d[46] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[47] = true;
                }
                d[48] = true;
            } catch (ClassNotFoundException e) {
                d[49] = true;
                e.printStackTrace();
                d[50] = true;
            } catch (InvocationTargetException e2) {
                d[51] = true;
                e2.printStackTrace();
                d[52] = true;
            } catch (IllegalAccessException e3) {
                d[53] = true;
                e3.printStackTrace();
                d[54] = true;
            }
            d[55] = true;
        }

        /* renamed from: b */
        public static boolean m45727b(@C0193h0 String str) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "hasRespondToSurvey");
                if (a != null) {
                    d[67] = true;
                    Object invoke = a.invoke(null, new Object[]{str});
                    d[68] = true;
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    d[69] = true;
                    return booleanValue;
                }
                d[70] = true;
                d[77] = true;
                return false;
            } catch (ClassNotFoundException e) {
                d[71] = true;
                e.printStackTrace();
                d[72] = true;
            } catch (InvocationTargetException e2) {
                d[73] = true;
                e2.printStackTrace();
                d[74] = true;
            } catch (IllegalAccessException e3) {
                d[75] = true;
                e3.printStackTrace();
                d[76] = true;
            }
        }

        /* renamed from: a */
        public static boolean m45723a(@C0193h0 String str) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "showSurvey");
                if (a != null) {
                    d[56] = true;
                    Object invoke = a.invoke(null, new Object[]{str});
                    d[57] = true;
                    boolean booleanValue = ((Boolean) invoke).booleanValue();
                    d[58] = true;
                    return booleanValue;
                }
                d[59] = true;
                d[66] = true;
                return false;
            } catch (ClassNotFoundException e) {
                d[60] = true;
                e.printStackTrace();
                d[61] = true;
            } catch (InvocationTargetException e2) {
                d[62] = true;
                e2.printStackTrace();
                d[63] = true;
            } catch (IllegalAccessException e3) {
                d[64] = true;
                e3.printStackTrace();
                d[65] = true;
            }
        }

        /* renamed from: b */
        public static void m45725b(boolean z) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "setShouldShowSurveysWelcomeScreen");
                if (a == null) {
                    d[89] = true;
                } else {
                    d[90] = true;
                    a.invoke(null, new Object[]{Boolean.valueOf(z)});
                    d[91] = true;
                }
                d[92] = true;
            } catch (ClassNotFoundException e) {
                d[93] = true;
                e.printStackTrace();
                d[94] = true;
            } catch (InvocationTargetException e2) {
                d[95] = true;
                e2.printStackTrace();
                d[96] = true;
            } catch (IllegalAccessException e3) {
                d[97] = true;
                e3.printStackTrace();
                d[98] = true;
            }
            d[99] = true;
        }

        /* renamed from: a */
        public static void m45719a(int i, int i2) {
            boolean[] d = m45729d();
            try {
                Method a = C9809f.m45759a(m45728c(), "setThresholdForReshowingSurveyAfterDismiss");
                if (a == null) {
                    d[78] = true;
                } else {
                    d[79] = true;
                    a.invoke(null, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                    d[80] = true;
                }
                d[81] = true;
            } catch (ClassNotFoundException e) {
                d[82] = true;
                e.printStackTrace();
                d[83] = true;
            } catch (InvocationTargetException e2) {
                d[84] = true;
                e2.printStackTrace();
                d[85] = true;
            } catch (IllegalAccessException e3) {
                d[86] = true;
                e3.printStackTrace();
                d[87] = true;
            }
            d[88] = true;
        }
    }

    static {
        boolean[] c = m45672c();
        c[5] = true;
    }

    private C9794d() {
        m45672c()[1] = true;
    }

    /* renamed from: b */
    public static C9794d m45671b() {
        boolean[] c = m45672c();
        C9794d dVar = f25979b;
        c[0] = true;
        return dVar;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45672c() {
        boolean[] zArr = f25980c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1404585360026687287L, "com/instabug/library/InstabugTouchesCoordinates", 6);
        f25980c = a;
        return a;
    }

    /* renamed from: a */
    public C9795a[] mo34922a() {
        boolean[] c = m45672c();
        C9795a[] aVarArr = this.f25981a;
        if (aVarArr == null) {
            c[2] = true;
            return null;
        }
        C9795a[] aVarArr2 = (C9795a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        c[3] = true;
        return aVarArr2;
    }

    /* renamed from: a */
    public void mo34921a(C9795a[] aVarArr) {
        boolean[] c = m45672c();
        this.f25981a = (C9795a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        c[4] = true;
    }
}
