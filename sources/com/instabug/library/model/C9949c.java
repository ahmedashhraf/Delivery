package com.instabug.library.model;

import androidx.core.app.C0770p;
import com.google.android.gms.plus.C5493f;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.model.C9953d.C9954a;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.model.c */
/* compiled from: UserStep */
public class C9949c implements Cacheable, Serializable {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f26446P;

    /* renamed from: N */
    private C9952c f26447N;

    /* renamed from: O */
    private C9951b f26448O;

    /* renamed from: a */
    private long f26449a;

    /* renamed from: b */
    private String f26450b;

    /* renamed from: com.instabug.library.model.c$a */
    /* compiled from: UserStep */
    static /* synthetic */ class C9950a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26451a = new int[C9954a.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26452b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r0[8] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r0[10] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r0[12] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r0[14] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
            r0[16] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0026 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0035 */
        static {
            /*
                boolean[] r0 = m46279a()
                com.instabug.library.model.d$a[] r1 = com.instabug.library.model.C9953d.C9954a.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26451a = r1
                r1 = 0
                r2 = 7
                r3 = 8
                r4 = 5
                r5 = 6
                r6 = 3
                r7 = 4
                r8 = 2
                r9 = 1
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x0026 }
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.library.model.d$a r10 = com.instabug.library.model.C9953d.C9954a.TAP     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r10] = r9     // Catch:{ NoSuchFieldError -> 0x0026 }
                r0[r9] = r9
                goto L_0x0028
            L_0x0026:
                r0[r8] = r9     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0028:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.instabug.library.model.d$a r10 = com.instabug.library.model.C9953d.C9954a.DOUBLE_TAP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r1[r10] = r8     // Catch:{ NoSuchFieldError -> 0x0035 }
                r0[r6] = r9
                goto L_0x0037
            L_0x0035:
                r0[r7] = r9     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0037:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.instabug.library.model.d$a r8 = com.instabug.library.model.C9953d.C9954a.LONG_PRESS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r1[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r9
                goto L_0x0046
            L_0x0044:
                r0[r5] = r9     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0046:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.instabug.library.model.d$a r6 = com.instabug.library.model.C9953d.C9954a.SCROLL     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r2] = r9
                goto L_0x0055
            L_0x0053:
                r0[r3] = r9     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0055:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.instabug.library.model.d$a r6 = com.instabug.library.model.C9953d.C9954a.SWIPE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1 = 9
                r0[r1] = r9
                goto L_0x0068
            L_0x0064:
                r1 = 10
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0068:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x0077 }
                com.instabug.library.model.d$a r4 = com.instabug.library.model.C9953d.C9954a.PINCH     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r1[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0077 }
                r1 = 11
                r0[r1] = r9
                goto L_0x007b
            L_0x0077:
                r1 = 12
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x008a }
            L_0x007b:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x008a }
                com.instabug.library.model.d$a r4 = com.instabug.library.model.C9953d.C9954a.SHAKE     // Catch:{ NoSuchFieldError -> 0x008a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x008a }
                r1 = 13
                r0[r1] = r9
                goto L_0x008e
            L_0x008a:
                r1 = 14
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x008e:
                int[] r1 = f26451a     // Catch:{ NoSuchFieldError -> 0x009d }
                com.instabug.library.model.d$a r2 = com.instabug.library.model.C9953d.C9954a.APPLICATION_CREATED     // Catch:{ NoSuchFieldError -> 0x009d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x009d }
                r1 = 15
                r0[r1] = r9
                goto L_0x00a1
            L_0x009d:
                r1 = 16
                r0[r1] = r9
            L_0x00a1:
                r1 = 17
                r0[r1] = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.model.C9949c.C9950a.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46279a() {
            boolean[] zArr = f26452b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6740273166291704222L, "com/instabug/library/model/UserStep$1", 18);
            f26452b = a;
            return a;
        }
    }

    /* renamed from: com.instabug.library.model.c$b */
    /* compiled from: UserStep */
    public static class C9951b implements Cacheable, Serializable {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f26453P;

        /* renamed from: N */
        private String f26454N;

        /* renamed from: O */
        private String f26455O;

        /* renamed from: a */
        private C9952c f26456a;

        /* renamed from: b */
        private String f26457b;

        public C9951b() {
            m46280g()[0] = true;
        }

        /* renamed from: g */
        private static /* synthetic */ boolean[] m46280g() {
            boolean[] zArr = f26453P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3616796128459091893L, "com/instabug/library/model/UserStep$Args", 65);
            f26453P = a;
            return a;
        }

        /* renamed from: a */
        public C9952c mo35486a() {
            boolean[] g = m46280g();
            C9952c cVar = this.f26456a;
            g[57] = true;
            return cVar;
        }

        /* renamed from: b */
        public void mo35488b(String str) {
            boolean[] g = m46280g();
            this.f26457b = str;
            g[60] = true;
        }

        /* renamed from: c */
        public void mo35489c(String str) {
            boolean[] g = m46280g();
            this.f26454N = str;
            g[62] = true;
        }

        /* renamed from: d */
        public String mo35490d() {
            boolean[] g = m46280g();
            String str = this.f26457b;
            g[59] = true;
            return str;
        }

        /* renamed from: e */
        public String mo35492e() {
            boolean[] g = m46280g();
            String str = this.f26454N;
            g[61] = true;
            return str;
        }

        /* renamed from: f */
        public String mo35493f() {
            boolean[] g = m46280g();
            String str = this.f26455O;
            g[63] = true;
            return str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
            switch(r2) {
                case 0: goto L_0x0163;
                case 1: goto L_0x0159;
                case 2: goto L_0x014f;
                case 3: goto L_0x0145;
                case 4: goto L_0x013b;
                case 5: goto L_0x0131;
                case 6: goto L_0x0127;
                case 7: goto L_0x011d;
                case 8: goto L_0x0113;
                case 9: goto L_0x0109;
                default: goto L_0x00ff;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ff, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.NOT_AVAILABLE);
            r0[46] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.DOUBLE_TAP);
            r0[45] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.SWIPE);
            r0[44] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.SCROLL);
            r0[43] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0127, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.LONG_PRESS);
            r0[42] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0131, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.PINCH);
            r0[41] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x013b, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.TAP);
            r0[40] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.TOUCH);
            r0[39] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x014f, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.MOTION);
            r0[38] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0159, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.VIEW);
            r0[37] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0163, code lost:
            mo35487a(com.instabug.library.model.C9949c.C9952c.APPLICATION);
            r0[36] = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void fromJson(java.lang.String r7) throws org.json.JSONException {
            /*
                r6 = this;
                boolean[] r0 = m46280g()
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>(r7)
                r7 = 1
                r2 = 12
                r0[r2] = r7
                java.lang.String r2 = "event"
                boolean r3 = r1.has(r2)
                java.lang.String r4 = "view"
                if (r3 != 0) goto L_0x001e
                r2 = 13
                r0[r2] = r7
                goto L_0x016c
            L_0x001e:
                r3 = 14
                r0[r3] = r7
                java.lang.String r2 = r1.getString(r2)
                r3 = -1
                int r5 = r2.hashCode()
                switch(r5) {
                    case -1068318794: goto L_0x00e8;
                    case -907680051: goto L_0x00d5;
                    case 110749: goto L_0x00c2;
                    case 114595: goto L_0x00af;
                    case 3619493: goto L_0x009e;
                    case 106671290: goto L_0x008a;
                    case 109854522: goto L_0x0074;
                    case 110550847: goto L_0x005f;
                    case 779098677: goto L_0x0049;
                    case 1554253136: goto L_0x0034;
                    default: goto L_0x002e;
                }
            L_0x002e:
                r2 = 15
                r0[r2] = r7
                goto L_0x00fb
            L_0x0034:
                java.lang.String r5 = "application"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0042
                r2 = 16
                r0[r2] = r7
                goto L_0x00fb
            L_0x0042:
                r2 = 0
                r3 = 17
                r0[r3] = r7
                goto L_0x00fc
            L_0x0049:
                java.lang.String r5 = "double_tap"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0057
                r2 = 34
                r0[r2] = r7
                goto L_0x00fb
            L_0x0057:
                r2 = 9
                r3 = 35
                r0[r3] = r7
                goto L_0x00fc
            L_0x005f:
                java.lang.String r5 = "touch"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x006d
                r2 = 22
                r0[r2] = r7
                goto L_0x00fb
            L_0x006d:
                r2 = 3
                r3 = 23
                r0[r3] = r7
                goto L_0x00fc
            L_0x0074:
                java.lang.String r5 = "swipe"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0082
                r2 = 32
                r0[r2] = r7
                goto L_0x00fb
            L_0x0082:
                r2 = 8
                r3 = 33
                r0[r3] = r7
                goto L_0x00fc
            L_0x008a:
                java.lang.String r5 = "pinch"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0098
                r2 = 26
                r0[r2] = r7
                goto L_0x00fb
            L_0x0098:
                r2 = 5
                r3 = 27
                r0[r3] = r7
                goto L_0x00fc
            L_0x009e:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x00a9
                r2 = 18
                r0[r2] = r7
                goto L_0x00fb
            L_0x00a9:
                r2 = 19
                r0[r2] = r7
                r2 = 1
                goto L_0x00fc
            L_0x00af:
                java.lang.String r5 = "tap"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x00bc
                r2 = 24
                r0[r2] = r7
                goto L_0x00fb
            L_0x00bc:
                r2 = 4
                r3 = 25
                r0[r3] = r7
                goto L_0x00fc
            L_0x00c2:
                java.lang.String r5 = "pan"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x00cf
                r2 = 28
                r0[r2] = r7
                goto L_0x00fb
            L_0x00cf:
                r2 = 6
                r3 = 29
                r0[r3] = r7
                goto L_0x00fc
            L_0x00d5:
                java.lang.String r5 = "scroll"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x00e2
                r2 = 30
                r0[r2] = r7
                goto L_0x00fb
            L_0x00e2:
                r2 = 7
                r3 = 31
                r0[r3] = r7
                goto L_0x00fc
            L_0x00e8:
                java.lang.String r5 = "motion"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x00f5
                r2 = 20
                r0[r2] = r7
                goto L_0x00fb
            L_0x00f5:
                r2 = 2
                r3 = 21
                r0[r3] = r7
                goto L_0x00fc
            L_0x00fb:
                r2 = -1
            L_0x00fc:
                switch(r2) {
                    case 0: goto L_0x0163;
                    case 1: goto L_0x0159;
                    case 2: goto L_0x014f;
                    case 3: goto L_0x0145;
                    case 4: goto L_0x013b;
                    case 5: goto L_0x0131;
                    case 6: goto L_0x0127;
                    case 7: goto L_0x011d;
                    case 8: goto L_0x0113;
                    case 9: goto L_0x0109;
                    default: goto L_0x00ff;
                }
            L_0x00ff:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.NOT_AVAILABLE
                r6.mo35487a(r2)
                r2 = 46
                r0[r2] = r7
                goto L_0x016c
            L_0x0109:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.DOUBLE_TAP
                r6.mo35487a(r2)
                r2 = 45
                r0[r2] = r7
                goto L_0x016c
            L_0x0113:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.SWIPE
                r6.mo35487a(r2)
                r2 = 44
                r0[r2] = r7
                goto L_0x016c
            L_0x011d:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.SCROLL
                r6.mo35487a(r2)
                r2 = 43
                r0[r2] = r7
                goto L_0x016c
            L_0x0127:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.LONG_PRESS
                r6.mo35487a(r2)
                r2 = 42
                r0[r2] = r7
                goto L_0x016c
            L_0x0131:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.PINCH
                r6.mo35487a(r2)
                r2 = 41
                r0[r2] = r7
                goto L_0x016c
            L_0x013b:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.TAP
                r6.mo35487a(r2)
                r2 = 40
                r0[r2] = r7
                goto L_0x016c
            L_0x0145:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.TOUCH
                r6.mo35487a(r2)
                r2 = 39
                r0[r2] = r7
                goto L_0x016c
            L_0x014f:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.MOTION
                r6.mo35487a(r2)
                r2 = 38
                r0[r2] = r7
                goto L_0x016c
            L_0x0159:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.VIEW
                r6.mo35487a(r2)
                r2 = 37
                r0[r2] = r7
                goto L_0x016c
            L_0x0163:
                com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.APPLICATION
                r6.mo35487a(r2)
                r2 = 36
                r0[r2] = r7
            L_0x016c:
                java.lang.String r2 = "class"
                boolean r3 = r1.has(r2)
                if (r3 != 0) goto L_0x0179
                r2 = 47
                r0[r2] = r7
                goto L_0x0188
            L_0x0179:
                r3 = 48
                r0[r3] = r7
                java.lang.String r2 = r1.getString(r2)
                r6.mo35489c(r2)
                r2 = 49
                r0[r2] = r7
            L_0x0188:
                java.lang.String r2 = "label"
                boolean r3 = r1.has(r2)
                if (r3 != 0) goto L_0x0195
                r2 = 50
                r0[r2] = r7
                goto L_0x01a4
            L_0x0195:
                r3 = 51
                r0[r3] = r7
                java.lang.String r2 = r1.getString(r2)
                r6.mo35488b(r2)
                r2 = 52
                r0[r2] = r7
            L_0x01a4:
                boolean r2 = r1.has(r4)
                if (r2 != 0) goto L_0x01af
                r1 = 53
                r0[r1] = r7
                goto L_0x01be
            L_0x01af:
                r2 = 54
                r0[r2] = r7
                java.lang.String r1 = r1.getString(r4)
                r6.mo35491d(r1)
                r1 = 55
                r0[r1] = r7
            L_0x01be:
                r1 = 56
                r0[r1] = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.model.C9949c.C9951b.fromJson(java.lang.String):void");
        }

        public String toJson() throws JSONException {
            boolean[] g = m46280g();
            JSONObject jSONObject = new JSONObject();
            g[6] = true;
            jSONObject.put(C0770p.f3524g0, mo35486a());
            g[7] = true;
            jSONObject.put(C5493f.f15781i, mo35490d());
            g[8] = true;
            jSONObject.put("class", mo35492e());
            g[9] = true;
            jSONObject.put("view", mo35493f());
            g[10] = true;
            String jSONObject2 = jSONObject.toString();
            g[11] = true;
            return jSONObject2;
        }

        /* renamed from: a */
        public void mo35487a(C9952c cVar) {
            boolean[] g = m46280g();
            this.f26456a = cVar;
            g[58] = true;
        }

        /* renamed from: d */
        public void mo35491d(String str) {
            boolean[] g = m46280g();
            this.f26455O = str;
            g[64] = true;
        }

        public C9951b(C9952c cVar, String str, String str2, String str3) {
            boolean[] g = m46280g();
            g[1] = true;
            mo35487a(cVar);
            g[2] = true;
            mo35488b(str);
            g[3] = true;
            mo35489c(str2);
            g[4] = true;
            mo35491d(str3);
            g[5] = true;
        }
    }

    /* renamed from: com.instabug.library.model.c$c */
    /* compiled from: UserStep */
    public enum C9952c {
        APPLICATION("application"),
        VIEW("view"),
        MOTION("motion"),
        TOUCH("touch"),
        TAP("tap"),
        PINCH("pinch"),
        LONG_PRESS("long_press"),
        SCROLL("scroll"),
        SWIPE("swipe"),
        DOUBLE_TAP("double_tap"),
        NOT_AVAILABLE("not_available");
        
        private final String name;

        static {
            boolean[] d;
            d[10] = true;
        }

        private C9952c(String str) {
            boolean[] d = m46289d();
            this.name = str;
            d[2] = true;
        }

        public String toString() {
            boolean[] d = m46289d();
            String str = this.name;
            d[3] = true;
            return str;
        }
    }

    public C9949c() {
        m46269g()[0] = true;
    }

    /* renamed from: a */
    public static ArrayList<C9949c> m46267a(JSONArray jSONArray) throws JSONException {
        boolean[] g = m46269g();
        ArrayList<C9949c> arrayList = new ArrayList<>();
        g[1] = true;
        if (jSONArray == null) {
            g[2] = true;
        } else if (jSONArray.length() <= 0) {
            g[3] = true;
        } else {
            g[4] = true;
            int i = 0;
            g[5] = true;
            while (i < jSONArray.length()) {
                g[7] = true;
                C9949c cVar = new C9949c();
                g[8] = true;
                cVar.fromJson(jSONArray.getJSONObject(i).toString());
                g[9] = true;
                arrayList.add(cVar);
                i++;
                g[10] = true;
            }
            g[6] = true;
        }
        g[11] = true;
        return arrayList;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46269g() {
        boolean[] zArr = f26446P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4761054037137116595L, "com/instabug/library/model/UserStep", 107);
        f26446P = a;
        return a;
    }

    /* renamed from: b */
    public void mo35481b(String str) {
        boolean[] g = m46269g();
        this.f26450b = str;
        g[27] = true;
    }

    /* renamed from: d */
    public String mo35482d() {
        boolean[] g = m46269g();
        String str = this.f26450b;
        g[26] = true;
        return str;
    }

    /* renamed from: e */
    public C9952c mo35483e() {
        boolean[] g = m46269g();
        C9952c cVar = this.f26447N;
        g[28] = true;
        return cVar;
    }

    /* renamed from: f */
    public C9951b mo35484f() {
        boolean[] g = m46269g();
        C9951b bVar = this.f26448O;
        g[30] = true;
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0185, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0186, code lost:
        switch(r2) {
            case 0: goto L_0x01ed;
            case 1: goto L_0x01e3;
            case 2: goto L_0x01d9;
            case 3: goto L_0x01cf;
            case 4: goto L_0x01c5;
            case 5: goto L_0x01bb;
            case 6: goto L_0x01b1;
            case 7: goto L_0x01a7;
            case 8: goto L_0x019d;
            case 9: goto L_0x0193;
            default: goto L_0x0189;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0189, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.NOT_AVAILABLE);
        r0[99] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0193, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.DOUBLE_TAP);
        r0[98] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019d, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.SWIPE);
        r0[97] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a7, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.SCROLL);
        r0[96] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b1, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.LONG_PRESS);
        r0[95] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bb, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.PINCH);
        r0[94] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c5, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.TAP);
        r0[93] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cf, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.TOUCH);
        r0[92] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d9, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.MOTION);
        r0[91] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e3, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.VIEW);
        r0[90] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ed, code lost:
        mo35479a(com.instabug.library.model.C9949c.C9952c.APPLICATION);
        r0[89] = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fromJson(java.lang.String r7) throws org.json.JSONException {
        /*
            r6 = this;
            boolean[] r0 = m46269g()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r7)
            r7 = 1
            r2 = 50
            r0[r2] = r7
            java.lang.String r2 = "timestamp"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x001b
            r2 = 51
            r0[r2] = r7
            goto L_0x007c
        L_0x001b:
            r3 = 52
            r0[r3] = r7
            java.lang.String r3 = r1.getString(r2)
            boolean r3 = com.instabug.library.util.StringUtility.isNumeric(r3)
            if (r3 != 0) goto L_0x006d
            r3 = 53
            r0[r3] = r7
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x005a }
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ ParseException -> 0x005a }
            r3.<init>(r4, r5)     // Catch:{ ParseException -> 0x005a }
            r4 = 56
            r0[r4] = r7     // Catch:{ ParseException -> 0x005a }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ ParseException -> 0x005a }
            r4 = 57
            r0[r4] = r7     // Catch:{ ParseException -> 0x005a }
            java.util.Date r2 = r3.parse(r2)     // Catch:{ ParseException -> 0x005a }
            r3 = 58
            r0[r3] = r7     // Catch:{ ParseException -> 0x005a }
            long r2 = r2.getTime()     // Catch:{ ParseException -> 0x005a }
            r4 = 59
            r0[r4] = r7     // Catch:{ ParseException -> 0x005a }
            r6.mo35477a(r2)     // Catch:{ ParseException -> 0x005a }
            r2 = 60
            r0[r2] = r7
            goto L_0x007c
        L_0x005a:
            r2 = move-exception
            r3 = 61
            r0[r3] = r7
            java.lang.Class<com.instabug.library.model.c> r3 = com.instabug.library.model.C9949c.class
            java.lang.String r2 = r2.getMessage()
            com.instabug.library.util.InstabugSDKLogger.m46623e(r3, r2)
            r2 = 62
            r0[r2] = r7
            goto L_0x007c
        L_0x006d:
            r3 = 54
            r0[r3] = r7
            long r2 = r1.getLong(r2)
            r6.mo35477a(r2)
            r2 = 55
            r0[r2] = r7
        L_0x007c:
            java.lang.String r2 = "message"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0089
            r2 = 63
            r0[r2] = r7
            goto L_0x0098
        L_0x0089:
            r3 = 64
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r6.mo35481b(r2)
            r2 = 65
            r0[r2] = r7
        L_0x0098:
            java.lang.String r2 = "type"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x00a6
            r2 = 66
            r0[r2] = r7
            goto L_0x01f6
        L_0x00a6:
            r3 = 67
            r0[r3] = r7
            java.lang.String r2 = r1.getString(r2)
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1068318794: goto L_0x0172;
                case -907680051: goto L_0x015f;
                case -326696768: goto L_0x014c;
                case 114595: goto L_0x0139;
                case 3619493: goto L_0x0126;
                case 106671290: goto L_0x0112;
                case 109854522: goto L_0x00fc;
                case 110550847: goto L_0x00e7;
                case 779098677: goto L_0x00d1;
                case 1554253136: goto L_0x00bc;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            r2 = 68
            r0[r2] = r7
            goto L_0x0185
        L_0x00bc:
            java.lang.String r4 = "application"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00ca
            r2 = 69
            r0[r2] = r7
            goto L_0x0185
        L_0x00ca:
            r2 = 0
            r3 = 70
            r0[r3] = r7
            goto L_0x0186
        L_0x00d1:
            java.lang.String r4 = "double_tap"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00df
            r2 = 87
            r0[r2] = r7
            goto L_0x0185
        L_0x00df:
            r2 = 9
            r3 = 88
            r0[r3] = r7
            goto L_0x0186
        L_0x00e7:
            java.lang.String r4 = "touch"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00f5
            r2 = 75
            r0[r2] = r7
            goto L_0x0185
        L_0x00f5:
            r2 = 3
            r3 = 76
            r0[r3] = r7
            goto L_0x0186
        L_0x00fc:
            java.lang.String r4 = "swipe"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x010a
            r2 = 85
            r0[r2] = r7
            goto L_0x0185
        L_0x010a:
            r2 = 8
            r3 = 86
            r0[r3] = r7
            goto L_0x0186
        L_0x0112:
            java.lang.String r4 = "pinch"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0120
            r2 = 79
            r0[r2] = r7
            goto L_0x0185
        L_0x0120:
            r2 = 5
            r3 = 80
            r0[r3] = r7
            goto L_0x0186
        L_0x0126:
            java.lang.String r4 = "view"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0133
            r2 = 71
            r0[r2] = r7
            goto L_0x0185
        L_0x0133:
            r2 = 72
            r0[r2] = r7
            r2 = 1
            goto L_0x0186
        L_0x0139:
            java.lang.String r4 = "tap"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0146
            r2 = 77
            r0[r2] = r7
            goto L_0x0185
        L_0x0146:
            r2 = 4
            r3 = 78
            r0[r3] = r7
            goto L_0x0186
        L_0x014c:
            java.lang.String r4 = "long_press"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0159
            r2 = 81
            r0[r2] = r7
            goto L_0x0185
        L_0x0159:
            r2 = 6
            r3 = 82
            r0[r3] = r7
            goto L_0x0186
        L_0x015f:
            java.lang.String r4 = "scroll"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x016c
            r2 = 83
            r0[r2] = r7
            goto L_0x0185
        L_0x016c:
            r2 = 7
            r3 = 84
            r0[r3] = r7
            goto L_0x0186
        L_0x0172:
            java.lang.String r4 = "motion"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x017f
            r2 = 73
            r0[r2] = r7
            goto L_0x0185
        L_0x017f:
            r2 = 2
            r3 = 74
            r0[r3] = r7
            goto L_0x0186
        L_0x0185:
            r2 = -1
        L_0x0186:
            switch(r2) {
                case 0: goto L_0x01ed;
                case 1: goto L_0x01e3;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01cf;
                case 4: goto L_0x01c5;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01b1;
                case 7: goto L_0x01a7;
                case 8: goto L_0x019d;
                case 9: goto L_0x0193;
                default: goto L_0x0189;
            }
        L_0x0189:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.NOT_AVAILABLE
            r6.mo35479a(r2)
            r2 = 99
            r0[r2] = r7
            goto L_0x01f6
        L_0x0193:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.DOUBLE_TAP
            r6.mo35479a(r2)
            r2 = 98
            r0[r2] = r7
            goto L_0x01f6
        L_0x019d:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.SWIPE
            r6.mo35479a(r2)
            r2 = 97
            r0[r2] = r7
            goto L_0x01f6
        L_0x01a7:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.SCROLL
            r6.mo35479a(r2)
            r2 = 96
            r0[r2] = r7
            goto L_0x01f6
        L_0x01b1:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.LONG_PRESS
            r6.mo35479a(r2)
            r2 = 95
            r0[r2] = r7
            goto L_0x01f6
        L_0x01bb:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.PINCH
            r6.mo35479a(r2)
            r2 = 94
            r0[r2] = r7
            goto L_0x01f6
        L_0x01c5:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.TAP
            r6.mo35479a(r2)
            r2 = 93
            r0[r2] = r7
            goto L_0x01f6
        L_0x01cf:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.TOUCH
            r6.mo35479a(r2)
            r2 = 92
            r0[r2] = r7
            goto L_0x01f6
        L_0x01d9:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.MOTION
            r6.mo35479a(r2)
            r2 = 91
            r0[r2] = r7
            goto L_0x01f6
        L_0x01e3:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.VIEW
            r6.mo35479a(r2)
            r2 = 90
            r0[r2] = r7
            goto L_0x01f6
        L_0x01ed:
            com.instabug.library.model.c$c r2 = com.instabug.library.model.C9949c.C9952c.APPLICATION
            r6.mo35479a(r2)
            r2 = 89
            r0[r2] = r7
        L_0x01f6:
            java.lang.String r2 = "args"
            boolean r3 = r1.has(r2)
            if (r3 != 0) goto L_0x0203
            r1 = 100
            r0[r1] = r7
            goto L_0x0222
        L_0x0203:
            r3 = 101(0x65, float:1.42E-43)
            r0[r3] = r7
            com.instabug.library.model.c$b r3 = new com.instabug.library.model.c$b
            r3.<init>()
            r4 = 102(0x66, float:1.43E-43)
            r0[r4] = r7
            java.lang.String r1 = r1.getString(r2)
            r3.fromJson(r1)
            r1 = 103(0x67, float:1.44E-43)
            r0[r1] = r7
            r6.mo35478a(r3)
            r1 = 104(0x68, float:1.46E-43)
            r0[r1] = r7
        L_0x0222:
            r1 = 105(0x69, float:1.47E-43)
            r0[r1] = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.model.C9949c.fromJson(java.lang.String):void");
    }

    public String toJson() throws JSONException {
        boolean[] g = m46269g();
        JSONObject jSONObject = new JSONObject();
        g[42] = true;
        jSONObject.put("timestamp", mo35476a());
        g[43] = true;
        jSONObject.put("message", mo35482d());
        g[44] = true;
        jSONObject.put("type", mo35483e().toString());
        g[45] = true;
        if (mo35484f() == null) {
            g[46] = true;
        } else {
            g[47] = true;
            jSONObject.put("args", mo35484f().toJson());
            g[48] = true;
        }
        String jSONObject2 = jSONObject.toString();
        g[49] = true;
        return jSONObject2;
    }

    public String toString() {
        boolean[] g = m46269g();
        StringBuilder sb = new StringBuilder();
        sb.append("UserStep{timeStamp='");
        sb.append(this.f26449a);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.f26450b);
        sb.append('\'');
        sb.append(", type=");
        sb.append(this.f26447N);
        sb.append('}');
        String sb2 = sb.toString();
        g[106] = true;
        return sb2;
    }

    /* renamed from: a */
    public static JSONArray m46268a(ArrayList<C9949c> arrayList) {
        boolean[] g = m46269g();
        JSONArray jSONArray = new JSONArray();
        g[12] = true;
        if (arrayList == null) {
            g[13] = true;
        } else if (arrayList.size() <= 0) {
            g[14] = true;
        } else {
            g[15] = true;
            Iterator it = arrayList.iterator();
            g[16] = true;
            while (it.hasNext()) {
                C9949c cVar = (C9949c) it.next();
                try {
                    g[18] = true;
                    jSONArray.put(new JSONObject(cVar.toJson()));
                    g[19] = true;
                } catch (JSONException e) {
                    g[20] = true;
                    InstabugSDKLogger.m46626v(C9949c.class, e.toString());
                    g[21] = true;
                }
                g[22] = true;
            }
            g[17] = true;
        }
        g[23] = true;
        return jSONArray;
    }

    /* renamed from: a */
    public long mo35476a() {
        boolean[] g = m46269g();
        long j = this.f26449a;
        g[24] = true;
        return j;
    }

    /* renamed from: a */
    public void mo35477a(long j) {
        boolean[] g = m46269g();
        this.f26449a = j;
        g[25] = true;
    }

    /* renamed from: a */
    public void mo35479a(C9952c cVar) {
        boolean[] g = m46269g();
        this.f26447N = cVar;
        g[29] = true;
    }

    /* renamed from: a */
    public void mo35478a(C9951b bVar) {
        boolean[] g = m46269g();
        this.f26448O = bVar;
        g[31] = true;
    }

    /* renamed from: a */
    public void mo35480a(C9954a aVar) {
        boolean[] g = m46269g();
        switch (C9950a.f26451a[aVar.ordinal()]) {
            case 1:
                mo35479a(C9952c.TAP);
                g[32] = true;
                break;
            case 2:
                mo35479a(C9952c.DOUBLE_TAP);
                g[33] = true;
                break;
            case 3:
                mo35479a(C9952c.LONG_PRESS);
                g[34] = true;
                break;
            case 4:
                mo35479a(C9952c.SCROLL);
                g[35] = true;
                break;
            case 5:
                mo35479a(C9952c.SWIPE);
                g[36] = true;
                break;
            case 6:
                mo35479a(C9952c.PINCH);
                g[37] = true;
                break;
            case 7:
                mo35479a(C9952c.MOTION);
                g[38] = true;
                break;
            case 8:
                mo35479a(C9952c.APPLICATION);
                g[39] = true;
                break;
            default:
                mo35479a(C9952c.VIEW);
                g[40] = true;
                break;
        }
        g[41] = true;
    }
}
