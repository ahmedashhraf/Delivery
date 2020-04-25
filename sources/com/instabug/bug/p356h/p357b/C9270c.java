package com.instabug.bug.p356h.p357b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.instabug.library.C9700R;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C5923b0;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.instabug.bug.h.b.c */
/* compiled from: ViewHierarchyInspector */
public class C9270c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24526a;

    /* renamed from: com.instabug.bug.h.b.c$a */
    /* compiled from: ViewHierarchyInspector */
    static class C9271a implements Callable<C9269b> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24527b;

        /* renamed from: a */
        final /* synthetic */ C9269b f24528a;

        C9271a(C9269b bVar) {
            boolean[] b = m43368b();
            this.f24528a = bVar;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m43368b() {
            boolean[] zArr = f24527b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2985723724713699294L, "com/instabug/bug/screenshot/viewhierarchy/ViewHierarchyInspector$1", 3);
            f24527b = a;
            return a;
        }

        /* renamed from: a */
        public C9269b mo33496a() {
            boolean[] b = m43368b();
            C9269b c = C9270c.m43357c(this.f24528a);
            b[1] = true;
            return c;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m43368b();
            C9269b a = mo33496a();
            b[2] = true;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.h.b.c$b */
    /* compiled from: ViewHierarchyInspector */
    public enum C9272b {
        STARTED,
        FAILED,
        COMPLETED;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    /* renamed from: a */
    public static C5923b0<C9269b> m43346a(C9269b bVar) {
        boolean[] a = m43354a();
        C5923b0<C9269b> f = C5923b0.m26194f((Callable<? extends T>) new C9271a<Object>(bVar));
        a[1] = true;
        return f;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43354a() {
        boolean[] zArr = f24526a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3045377171274533674L, "com/instabug/bug/screenshot/viewhierarchy/ViewHierarchyInspector", 240);
        f24526a = a;
        return a;
    }

    /* renamed from: b */
    private static String m43355b(View view) {
        boolean[] a = m43354a();
        String simpleName = view.getClass().getSimpleName();
        a[107] = true;
        return simpleName;
    }

    /* renamed from: c */
    static /* synthetic */ C9269b m43357c(C9269b bVar) {
        boolean[] a = m43354a();
        C9269b d = m43360d(bVar);
        a[239] = true;
        return d;
    }

    /* renamed from: d */
    private static C9269b m43360d(C9269b bVar) {
        boolean[] a = m43354a();
        if (bVar.mo33494o().getVisibility() != 0) {
            a[2] = true;
        } else {
            try {
                a[3] = true;
                bVar.mo33482c(m43355b(bVar.mo33494o()));
                a[4] = true;
                bVar.mo33478b(m43349a(bVar.mo33494o()));
                a[5] = true;
                bVar.mo33473a(m43358c(bVar.mo33494o()));
                a[6] = true;
                bVar.mo33476b(m43359d(bVar.mo33494o()));
                a[7] = true;
                bVar.mo33468a(m43362f(bVar));
                a[8] = true;
                bVar.mo33479b(m43367k(bVar));
                a[9] = true;
                if (bVar.mo33494o() instanceof ViewGroup) {
                    a[10] = true;
                    bVar.mo33474a(true);
                    a[11] = true;
                    m43361e(bVar);
                    a[12] = true;
                } else {
                    bVar.mo33474a(false);
                    a[13] = true;
                }
                a[14] = true;
            } catch (JSONException e) {
                a[15] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("inspect view hierarchy got error: ");
                sb.append(e.getMessage());
                sb.append(",View hierarchy id:");
                sb.append(bVar.mo33465a());
                sb.append(", time in MS: ");
                sb.append(System.currentTimeMillis());
                InstabugSDKLogger.m46624e(C9260a.class, sb.toString(), e);
                a[16] = true;
            }
        }
        a[17] = true;
        return bVar;
    }

    /* renamed from: e */
    private static void m43361e(C9269b bVar) {
        boolean[] a = m43354a();
        if (!(bVar.mo33494o() instanceof ViewGroup)) {
            a[18] = true;
        } else {
            a[19] = true;
            ViewGroup viewGroup = (ViewGroup) bVar.mo33494o();
            a[20] = true;
            a[21] = true;
            int i = 0;
            while (i < viewGroup.getChildCount()) {
                a[23] = true;
                if (viewGroup.getChildAt(i).getId() == C9700R.C9704id.instabug_extra_screenshot_button) {
                    a[24] = true;
                } else {
                    a[25] = true;
                    if (viewGroup.getChildAt(i).getId() == C9700R.C9704id.instabug_floating_button) {
                        a[26] = true;
                    } else {
                        a[27] = true;
                        C9269b bVar2 = new C9269b();
                        a[28] = true;
                        bVar2.mo33480b(false);
                        a[29] = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append(bVar.mo33465a());
                        sb.append("-");
                        sb.append(i);
                        bVar2.mo33472a(sb.toString());
                        a[30] = true;
                        bVar2.mo33470a(viewGroup.getChildAt(i));
                        a[31] = true;
                        bVar2.mo33471a(bVar);
                        a[32] = true;
                        bVar2.mo33466a(bVar.mo33495p());
                        a[33] = true;
                        bVar.mo33477b(m43360d(bVar2));
                        a[34] = true;
                    }
                }
                i++;
                a[35] = true;
            }
            a[22] = true;
        }
        a[36] = true;
    }

    /* renamed from: f */
    private static Rect m43362f(C9269b bVar) {
        boolean[] a = m43354a();
        if (bVar.mo33488i()) {
            a[190] = true;
            Rect n = bVar.mo33493n();
            a[191] = true;
            return n;
        }
        a[192] = true;
        int i = bVar.mo33493n().left;
        a[193] = true;
        int i2 = bVar.mo33493n().top;
        a[194] = true;
        int i3 = bVar.mo33493n().right;
        a[195] = true;
        Rect rect = new Rect(i, i2, i3, bVar.mo33493n().bottom);
        a[196] = true;
        int g = m43363g(bVar.mo33485f());
        a[197] = true;
        int h = m43364h(bVar.mo33485f());
        a[198] = true;
        int i4 = m43365i(bVar.mo33485f());
        a[199] = true;
        Rect rect2 = new Rect(g, h, i4, m43366j(bVar.mo33485f()));
        a[200] = true;
        if (rect.intersect(rect2)) {
            a[201] = true;
            return rect;
        }
        Rect rect3 = new Rect(0, 0, 0, 0);
        a[202] = true;
        return rect3;
    }

    /* renamed from: g */
    private static int m43363g(C9269b bVar) {
        boolean[] a = m43354a();
        int i = bVar.mo33492m().left;
        a[203] = true;
        int paddingLeft = bVar.mo33494o().getPaddingLeft();
        a[204] = true;
        int i2 = bVar.mo33493n().left;
        if (paddingLeft == 0) {
            a[205] = true;
            return i;
        }
        int i3 = i2 + paddingLeft;
        if (i > i3) {
            a[206] = true;
            return i;
        }
        a[207] = true;
        return i3;
    }

    /* renamed from: h */
    private static int m43364h(C9269b bVar) {
        boolean[] a = m43354a();
        int i = bVar.mo33492m().top;
        a[208] = true;
        int paddingTop = bVar.mo33494o().getPaddingTop();
        a[209] = true;
        int i2 = bVar.mo33493n().top;
        if (paddingTop == 0) {
            a[210] = true;
            return i;
        }
        int i3 = i2 + paddingTop;
        if (i > i3) {
            a[211] = true;
            return i;
        }
        a[212] = true;
        return i3;
    }

    /* renamed from: i */
    private static int m43365i(C9269b bVar) {
        boolean[] a = m43354a();
        int i = bVar.mo33492m().right;
        a[213] = true;
        int paddingRight = bVar.mo33494o().getPaddingRight();
        a[214] = true;
        int i2 = bVar.mo33493n().right;
        if (paddingRight == 0) {
            a[215] = true;
            return i;
        }
        int i3 = i2 - paddingRight;
        if (i < i3) {
            a[216] = true;
            return i;
        }
        a[217] = true;
        return i3;
    }

    /* renamed from: j */
    private static int m43366j(C9269b bVar) {
        boolean[] a = m43354a();
        int i = bVar.mo33492m().bottom;
        a[218] = true;
        int paddingBottom = bVar.mo33494o().getPaddingBottom();
        a[219] = true;
        int i2 = bVar.mo33493n().bottom;
        if (paddingBottom == 0) {
            a[220] = true;
            return i;
        }
        int i3 = i2 - paddingBottom;
        if (i < i3) {
            a[221] = true;
            return i;
        }
        a[222] = true;
        return i3;
    }

    /* renamed from: k */
    private static JSONObject m43367k(C9269b bVar) throws JSONException {
        boolean[] a = m43354a();
        JSONObject put = new JSONObject().put("x", bVar.mo33492m().left / bVar.mo33495p());
        a[223] = true;
        JSONObject put2 = put.put("y", bVar.mo33492m().top / bVar.mo33495p());
        a[224] = true;
        JSONObject put3 = put2.put("w", bVar.mo33492m().width() / bVar.mo33495p());
        a[225] = true;
        JSONObject put4 = put3.put(XHTMLText.f45021H, bVar.mo33492m().height() / bVar.mo33495p());
        a[226] = true;
        return put4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0209, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020a, code lost:
        r0[103(0x67)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020f, code lost:
        r0[102(0x66)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0214, code lost:
        r0[101(0x65)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0218, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0219, code lost:
        r0[100] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x021d, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021e, code lost:
        r0[99] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0224, code lost:
        return "ListView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0225, code lost:
        r0[98] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0229, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022a, code lost:
        r0[97] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022e, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022f, code lost:
        r0[96] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0235, code lost:
        return "ScrollView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0236, code lost:
        r0[95] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023a, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023b, code lost:
        r0[94] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0241, code lost:
        return "AutoCompleteTextView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0242, code lost:
        r0[93] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0246, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0247, code lost:
        r0[92] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x024d, code lost:
        return "EditText";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x024e, code lost:
        r0[91] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0252, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0253, code lost:
        r0[90] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0257, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0258, code lost:
        r0[89] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025e, code lost:
        return "Button";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x025f, code lost:
        r0[88] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0263, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0264, code lost:
        r0[87] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x026a, code lost:
        return "TableLayout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x026b, code lost:
        r0[86] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0271, code lost:
        return "FrameLayout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0272, code lost:
        r0[85] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0276, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0277, code lost:
        r1 = (android.widget.LinearLayout) r18;
        r0[82] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0283, code lost:
        if (r1.getOrientation() != 0) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0285, code lost:
        r0[83] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x028b, code lost:
        return "HorizontalLinearLayout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x028c, code lost:
        r0[84] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0292, code lost:
        return "VerticalLinearLayout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c1, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ca, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f5, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f6, code lost:
        switch(r1) {
            case 0: goto L_0x0277;
            case 1: goto L_0x0272;
            case 2: goto L_0x026b;
            case 3: goto L_0x0264;
            case 4: goto L_0x025f;
            case 5: goto L_0x0258;
            case 6: goto L_0x0253;
            case 7: goto L_0x024e;
            case 8: goto L_0x0247;
            case 9: goto L_0x0242;
            case 10: goto L_0x023b;
            case 11: goto L_0x0236;
            case 12: goto L_0x022f;
            case 13: goto L_0x022a;
            case 14: goto L_0x0225;
            case 15: goto L_0x021e;
            case 16: goto L_0x0219;
            case 17: goto L_0x0214;
            case 18: goto L_0x020f;
            case 19: goto L_0x020a;
            case 20: goto L_0x0205;
            case 21: goto L_0x0200;
            default: goto L_0x01f9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f9, code lost:
        r0[106(0x6a)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ff, code lost:
        return p212io.branch.referral.C6009d.f17209I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0200, code lost:
        r0[105(0x69)] = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0204, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0205, code lost:
        r0[104(0x68)] = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m43349a(android.view.View r18) {
        /*
            boolean[] r0 = m43354a()
            java.lang.Class r1 = r18.getClass()
            java.lang.String r1 = r1.getSimpleName()
            int r2 = r1.hashCode()
            java.lang.String r3 = "SearchView"
            java.lang.String r4 = "ImageView"
            java.lang.String r5 = "ToggleButton"
            java.lang.String r6 = "RadioButton"
            java.lang.String r7 = "GridView"
            java.lang.String r8 = "RelativeLayout"
            java.lang.String r9 = "TableRow"
            java.lang.String r10 = "ImageButton"
            java.lang.String r11 = "TextView"
            java.lang.String r12 = "VideoView"
            java.lang.String r13 = "HorizontalScrollView"
            java.lang.String r14 = "MultiAutoCompleteTextView"
            java.lang.String r15 = "WebView"
            r16 = r15
            java.lang.String r15 = "ProgressBar"
            r17 = 1
            switch(r2) {
                case -1495589242: goto L_0x01e1;
                case -1406842887: goto L_0x01cd;
                case -1346021293: goto L_0x01b7;
                case -1125439882: goto L_0x01a5;
                case -957993568: goto L_0x0193;
                case -938935918: goto L_0x0181;
                case -937446323: goto L_0x0170;
                case -830787764: goto L_0x015f;
                case -443652810: goto L_0x014a;
                case 382765867: goto L_0x0136;
                case 776382189: goto L_0x0122;
                case 799298502: goto L_0x010e;
                case 1125864064: goto L_0x00fb;
                case 1127291599: goto L_0x00e6;
                case 1283054733: goto L_0x00d2;
                case 1310765783: goto L_0x00bd;
                case 1410352259: goto L_0x00a7;
                case 1413872058: goto L_0x0091;
                case 1666676343: goto L_0x007b;
                case 1713715320: goto L_0x0066;
                case 2001146706: goto L_0x0051;
                case 2059813682: goto L_0x003b;
                default: goto L_0x0033;
            }
        L_0x0033:
            r2 = r16
            r1 = 37
            r0[r1] = r17
            goto L_0x01f5
        L_0x003b:
            java.lang.String r2 = "ScrollView"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0049
            r1 = 62
            r0[r1] = r17
            goto L_0x01c1
        L_0x0049:
            r1 = 12
            r2 = 63
            r0[r2] = r17
            goto L_0x01ca
        L_0x0051:
            java.lang.String r2 = "Button"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005f
            r1 = 48
            r0[r1] = r17
            goto L_0x01c1
        L_0x005f:
            r1 = 5
            r2 = 49
            r0[r2] = r17
            goto L_0x01ca
        L_0x0066:
            java.lang.String r2 = "TableLayout"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0074
            r1 = 44
            r0[r1] = r17
            goto L_0x01c1
        L_0x0074:
            r1 = 3
            r2 = 45
            r0[r2] = r17
            goto L_0x01ca
        L_0x007b:
            java.lang.String r2 = "EditText"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0089
            r1 = 54
            r0[r1] = r17
            goto L_0x01c1
        L_0x0089:
            r1 = 8
            r2 = 55
            r0[r2] = r17
            goto L_0x01ca
        L_0x0091:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x009f
            r1 = 58
            r0[r1] = r17
            goto L_0x01c1
        L_0x009f:
            r1 = 10
            r2 = 59
            r0[r2] = r17
            goto L_0x01ca
        L_0x00a7:
            java.lang.String r2 = "ListView"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b5
            r1 = 68
            r0[r1] = r17
            goto L_0x01c1
        L_0x00b5:
            r1 = 15
            r2 = 69
            r0[r2] = r17
            goto L_0x01ca
        L_0x00bd:
            java.lang.String r2 = "FrameLayout"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00cb
            r1 = 42
            r0[r1] = r17
            goto L_0x01c1
        L_0x00cb:
            r1 = 2
            r2 = 43
            r0[r2] = r17
            goto L_0x01ca
        L_0x00d2:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00de
            r1 = 78
            r0[r1] = r17
            goto L_0x01c1
        L_0x00de:
            r1 = 20
            r2 = 79
            r0[r2] = r17
            goto L_0x01ca
        L_0x00e6:
            java.lang.String r2 = "LinearLayout"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f4
            r1 = 38
            r0[r1] = r17
            goto L_0x01c1
        L_0x00f4:
            r1 = 0
            r2 = 39
            r0[r2] = r17
            goto L_0x01ca
        L_0x00fb:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0107
            r1 = 52
            r0[r1] = r17
            goto L_0x01c1
        L_0x0107:
            r1 = 7
            r2 = 53
            r0[r2] = r17
            goto L_0x01ca
        L_0x010e:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x011a
            r1 = 80
            r0[r1] = r17
            goto L_0x01c1
        L_0x011a:
            r1 = 21
            r2 = 81
            r0[r2] = r17
            goto L_0x01ca
        L_0x0122:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x012e
            r1 = 72
            r0[r1] = r17
            goto L_0x01c1
        L_0x012e:
            r1 = 17
            r2 = 73
            r0[r2] = r17
            goto L_0x01ca
        L_0x0136:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0142
            r1 = 66
            r0[r1] = r17
            goto L_0x01c1
        L_0x0142:
            r1 = 14
            r2 = 67
            r0[r2] = r17
            goto L_0x01ca
        L_0x014a:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0156
            r1 = 40
            r0[r1] = r17
            goto L_0x01c1
        L_0x0156:
            r1 = 41
            r0[r1] = r17
            r2 = r16
            r1 = 1
            goto L_0x01f6
        L_0x015f:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x016a
            r1 = 46
            r0[r1] = r17
            goto L_0x01c1
        L_0x016a:
            r1 = 4
            r2 = 47
            r0[r2] = r17
            goto L_0x01ca
        L_0x0170:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x017b
            r1 = 50
            r0[r1] = r17
            goto L_0x01c1
        L_0x017b:
            r1 = 6
            r2 = 51
            r0[r2] = r17
            goto L_0x01ca
        L_0x0181:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x018c
            r1 = 56
            r0[r1] = r17
            goto L_0x01c1
        L_0x018c:
            r1 = 9
            r2 = 57
            r0[r2] = r17
            goto L_0x01ca
        L_0x0193:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x019e
            r1 = 74
            r0[r1] = r17
            goto L_0x01c1
        L_0x019e:
            r1 = 18
            r2 = 75
            r0[r2] = r17
            goto L_0x01ca
        L_0x01a5:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x01b0
            r1 = 64
            r0[r1] = r17
            goto L_0x01c1
        L_0x01b0:
            r1 = 13
            r2 = 65
            r0[r2] = r17
            goto L_0x01ca
        L_0x01b7:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x01c4
            r1 = 60
            r0[r1] = r17
        L_0x01c1:
            r2 = r16
            goto L_0x01f5
        L_0x01c4:
            r1 = 11
            r2 = 61
            r0[r2] = r17
        L_0x01ca:
            r2 = r16
            goto L_0x01f6
        L_0x01cd:
            r2 = r16
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01da
            r1 = 76
            r0[r1] = r17
            goto L_0x01f5
        L_0x01da:
            r1 = 19
            r16 = 77
            r0[r16] = r17
            goto L_0x01f6
        L_0x01e1:
            r2 = r16
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x01ee
            r1 = 70
            r0[r1] = r17
            goto L_0x01f5
        L_0x01ee:
            r1 = 16
            r16 = 71
            r0[r16] = r17
            goto L_0x01f6
        L_0x01f5:
            r1 = -1
        L_0x01f6:
            switch(r1) {
                case 0: goto L_0x0277;
                case 1: goto L_0x0272;
                case 2: goto L_0x026b;
                case 3: goto L_0x0264;
                case 4: goto L_0x025f;
                case 5: goto L_0x0258;
                case 6: goto L_0x0253;
                case 7: goto L_0x024e;
                case 8: goto L_0x0247;
                case 9: goto L_0x0242;
                case 10: goto L_0x023b;
                case 11: goto L_0x0236;
                case 12: goto L_0x022f;
                case 13: goto L_0x022a;
                case 14: goto L_0x0225;
                case 15: goto L_0x021e;
                case 16: goto L_0x0219;
                case 17: goto L_0x0214;
                case 18: goto L_0x020f;
                case 19: goto L_0x020a;
                case 20: goto L_0x0205;
                case 21: goto L_0x0200;
                default: goto L_0x01f9;
            }
        L_0x01f9:
            r1 = 106(0x6a, float:1.49E-43)
            r0[r1] = r17
            java.lang.String r0 = "default"
            return r0
        L_0x0200:
            r1 = 105(0x69, float:1.47E-43)
            r0[r1] = r17
            return r5
        L_0x0205:
            r1 = 104(0x68, float:1.46E-43)
            r0[r1] = r17
            return r3
        L_0x020a:
            r1 = 103(0x67, float:1.44E-43)
            r0[r1] = r17
            return r2
        L_0x020f:
            r1 = 102(0x66, float:1.43E-43)
            r0[r1] = r17
            return r12
        L_0x0214:
            r1 = 101(0x65, float:1.42E-43)
            r0[r1] = r17
            return r6
        L_0x0219:
            r1 = 100
            r0[r1] = r17
            return r15
        L_0x021e:
            r1 = 99
            r0[r1] = r17
            java.lang.String r0 = "ListView"
            return r0
        L_0x0225:
            r1 = 98
            r0[r1] = r17
            return r7
        L_0x022a:
            r1 = 97
            r0[r1] = r17
            return r13
        L_0x022f:
            r1 = 96
            r0[r1] = r17
            java.lang.String r0 = "ScrollView"
            return r0
        L_0x0236:
            r1 = 95
            r0[r1] = r17
            return r14
        L_0x023b:
            r1 = 94
            r0[r1] = r17
            java.lang.String r0 = "AutoCompleteTextView"
            return r0
        L_0x0242:
            r1 = 93
            r0[r1] = r17
            return r11
        L_0x0247:
            r1 = 92
            r0[r1] = r17
            java.lang.String r0 = "EditText"
            return r0
        L_0x024e:
            r1 = 91
            r0[r1] = r17
            return r4
        L_0x0253:
            r1 = 90
            r0[r1] = r17
            return r10
        L_0x0258:
            r1 = 89
            r0[r1] = r17
            java.lang.String r0 = "Button"
            return r0
        L_0x025f:
            r1 = 88
            r0[r1] = r17
            return r9
        L_0x0264:
            r1 = 87
            r0[r1] = r17
            java.lang.String r0 = "TableLayout"
            return r0
        L_0x026b:
            r1 = 86
            r0[r1] = r17
            java.lang.String r0 = "FrameLayout"
            return r0
        L_0x0272:
            r1 = 85
            r0[r1] = r17
            return r8
        L_0x0277:
            r1 = r18
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 82
            r0[r2] = r17
            int r1 = r1.getOrientation()
            if (r1 != 0) goto L_0x028c
            r1 = 83
            r0[r1] = r17
            java.lang.String r0 = "HorizontalLinearLayout"
            return r0
        L_0x028c:
            r1 = 84
            r0[r1] = r17
            java.lang.String r0 = "VerticalLinearLayout"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.p356h.p357b.C9270c.m43349a(android.view.View):java.lang.String");
    }

    /* renamed from: b */
    public static List<C9269b> m43356b(C9269b bVar) {
        boolean[] a = m43354a();
        ArrayList arrayList = new ArrayList();
        if (bVar == null) {
            a[229] = true;
        } else {
            a[230] = true;
            arrayList.add(bVar);
            a[231] = true;
            if (!bVar.mo33487h()) {
                a[232] = true;
            } else {
                a[233] = true;
                Iterator it = bVar.mo33486g().iterator();
                a[234] = true;
                while (it.hasNext()) {
                    C9269b bVar2 = (C9269b) it.next();
                    a[236] = true;
                    arrayList.addAll(m43356b(bVar2));
                    a[237] = true;
                }
                a[235] = true;
            }
        }
        a[238] = true;
        return arrayList;
    }

    /* renamed from: c */
    private static JSONObject m43358c(View view) throws JSONException {
        boolean[] a = m43354a();
        JSONObject jSONObject = new JSONObject();
        a[108] = true;
        JSONObject put = jSONObject.put("resource_id", m43348a(view.getContext(), view.getId()));
        a[109] = true;
        JSONObject put2 = put.put(C14330v.f42320e0, view.getHeight());
        a[110] = true;
        JSONObject put3 = put2.put(C14330v.f42318d0, view.getWidth());
        a[111] = true;
        JSONObject put4 = put3.put("padding_top", view.getPaddingTop());
        a[112] = true;
        JSONObject put5 = put4.put("padding_bottom", view.getPaddingBottom());
        a[113] = true;
        JSONObject put6 = put5.put("padding_right", view.getPaddingRight());
        a[114] = true;
        JSONObject put7 = put6.put("padding_left", view.getPaddingLeft());
        a[115] = true;
        put7.put("visibility", view.getVisibility());
        if (VERSION.SDK_INT < 17) {
            a[116] = true;
        } else {
            a[117] = true;
            JSONObject put8 = jSONObject.put("padding_end", view.getPaddingEnd());
            a[118] = true;
            put8.put("padding_start", view.getPaddingStart());
            a[119] = true;
        }
        if (VERSION.SDK_INT < 11) {
            a[120] = true;
        } else {
            a[121] = true;
            JSONObject put9 = jSONObject.put("x", (double) view.getX());
            a[122] = true;
            put9.put("y", (double) view.getY());
            a[123] = true;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            a[124] = true;
            m43353a((LayoutParams) view.getLayoutParams(), jSONObject);
            a[125] = true;
        } else if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            a[126] = true;
            m43352a((FrameLayout.LayoutParams) view.getLayoutParams(), jSONObject);
            a[127] = true;
        } else if (!(view.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            a[128] = true;
        } else {
            a[129] = true;
            m43351a(view.getContext(), (RelativeLayout.LayoutParams) view.getLayoutParams(), jSONObject);
            a[130] = true;
        }
        a[131] = true;
        return jSONObject;
    }

    /* renamed from: d */
    private static Rect m43359d(View view) {
        boolean[] a = m43354a();
        int[] iArr = new int[2];
        a[186] = true;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[0];
        a[187] = true;
        int width = i3 + view.getWidth();
        int i4 = iArr[1];
        a[188] = true;
        Rect rect = new Rect(i, i2, width, i4 + view.getHeight());
        a[189] = true;
        return rect;
    }

    /* renamed from: a */
    private static String m43348a(Context context, int i) {
        String str;
        boolean[] a = m43354a();
        if (i != -1) {
            a[132] = true;
            if (context == null) {
                try {
                    a[135] = true;
                } catch (NotFoundException unused) {
                    a[142] = true;
                    String valueOf = String.valueOf(i);
                    a[143] = true;
                    return valueOf;
                }
            } else if (context.getResources() == null) {
                a[136] = true;
            } else if (context.getResources().getResourceEntryName(i) == null) {
                a[137] = true;
            } else {
                a[138] = true;
                str = context.getResources().getResourceEntryName(i);
                a[139] = true;
                a[141] = true;
                return str;
            }
            str = String.valueOf(i);
            a[140] = true;
            a[141] = true;
            return str;
        }
        a[133] = true;
        String valueOf2 = String.valueOf(i);
        a[134] = true;
        return valueOf2;
    }

    /* renamed from: a */
    private static void m43353a(LayoutParams layoutParams, JSONObject jSONObject) throws JSONException {
        boolean[] a = m43354a();
        JSONObject put = jSONObject.put("gravity", layoutParams.gravity);
        int i = layoutParams.topMargin;
        a[144] = true;
        JSONObject put2 = put.put("margin_top", i);
        int i2 = layoutParams.bottomMargin;
        a[145] = true;
        JSONObject put3 = put2.put("margin_bottom", i2);
        int i3 = layoutParams.leftMargin;
        a[146] = true;
        JSONObject put4 = put3.put("margin_left", i3);
        int i4 = layoutParams.rightMargin;
        a[147] = true;
        put4.put("margin_right", i4);
        a[148] = true;
    }

    /* renamed from: a */
    private static void m43352a(FrameLayout.LayoutParams layoutParams, JSONObject jSONObject) throws JSONException {
        boolean[] a = m43354a();
        JSONObject put = jSONObject.put("gravity", layoutParams.gravity);
        int i = layoutParams.topMargin;
        a[149] = true;
        JSONObject put2 = put.put("margin_top", i);
        int i2 = layoutParams.bottomMargin;
        a[150] = true;
        JSONObject put3 = put2.put("margin_bottom", i2);
        int i3 = layoutParams.leftMargin;
        a[151] = true;
        JSONObject put4 = put3.put("margin_left", i3);
        int i4 = layoutParams.rightMargin;
        a[152] = true;
        put4.put("margin_right", i4);
        a[153] = true;
    }

    /* renamed from: a */
    private static void m43351a(Context context, RelativeLayout.LayoutParams layoutParams, JSONObject jSONObject) throws JSONException {
        String str;
        boolean[] a = m43354a();
        JSONObject put = jSONObject.put("margin_top", layoutParams.topMargin);
        int i = layoutParams.bottomMargin;
        a[154] = true;
        JSONObject put2 = put.put("margin_bottom", i);
        int i2 = layoutParams.leftMargin;
        a[155] = true;
        JSONObject put3 = put2.put("margin_left", i2);
        int i3 = layoutParams.rightMargin;
        a[156] = true;
        put3.put("margin_right", i3);
        a[157] = true;
        int[] rules = layoutParams.getRules();
        a[158] = true;
        int i4 = 0;
        while (i4 < rules.length) {
            if (rules[i4] > 0) {
                a[159] = true;
                str = m43348a(context, rules[i4]);
                a[160] = true;
            } else {
                str = String.valueOf(rules[i4]);
                a[161] = true;
            }
            jSONObject.put(m43347a(i4), str);
            i4++;
            a[162] = true;
        }
        a[163] = true;
    }

    /* renamed from: a */
    private static String m43347a(int i) {
        boolean[] a = m43354a();
        switch (i) {
            case 0:
                a[164] = true;
                return "leftOf";
            case 1:
                a[165] = true;
                return "rightOf";
            case 2:
                a[166] = true;
                return "above";
            case 3:
                a[167] = true;
                return "below";
            case 4:
                a[168] = true;
                return "alignBaseline";
            case 5:
                a[169] = true;
                return "alignLeft";
            case 6:
                a[170] = true;
                return "alignTop";
            case 7:
                a[171] = true;
                return "alignRight";
            case 8:
                a[172] = true;
                return "alignBottom";
            case 9:
                a[173] = true;
                return "alignParentLeft";
            case 10:
                a[174] = true;
                return "alignParentTop";
            case 11:
                a[175] = true;
                return "alignParentRight";
            case 12:
                a[176] = true;
                return "alignParentBottom";
            case 13:
                a[177] = true;
                return "centerInParent";
            case 14:
                a[178] = true;
                return "centerHorizontal";
            case 15:
                a[179] = true;
                return "centerVertical";
            case 16:
                a[180] = true;
                return "startOf";
            case 18:
                a[181] = true;
                return "alignStart";
            case 19:
                a[182] = true;
                return "alignEnd";
            case 20:
                a[183] = true;
                return "alignParentStart";
            case 21:
                a[184] = true;
                return "alignParentEnd";
            default:
                a[185] = true;
                return "notIdentified";
        }
    }

    /* renamed from: a */
    static JSONObject m43350a(Activity activity, int i) throws JSONException {
        boolean[] a = m43354a();
        JSONObject put = new JSONObject().put("w", activity.getWindow().getDecorView().getWidth() / i);
        a[227] = true;
        JSONObject put2 = put.put(XHTMLText.f45021H, activity.getWindow().getDecorView().getHeight() / i);
        a[228] = true;
        return put2;
    }
}
