package com.instabug.library.p397ui.onboarding;

import android.os.Handler;
import androidx.annotation.C0213q;
import androidx.annotation.C0224v0;
import androidx.appcompat.app.C0295d;
import com.instabug.library.C9700R;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.p397ui.onboarding.C10003b.C10004a;
import com.instabug.library.p397ui.onboarding.WelcomeMessage.State;
import com.instabug.library.util.PlaceHolderUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"SF_SWITCH_NO_DEFAULT", "SF_SWITCH_NO_DEFAULT"})
/* renamed from: com.instabug.library.ui.onboarding.c */
/* compiled from: OnBoardingPresenter */
public class C10005c extends BasePresenter<C10004a> {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26614b;

    /* renamed from: a */
    private final C10004a f26615a = ((C10004a) this.view.get());

    /* renamed from: com.instabug.library.ui.onboarding.c$a */
    /* compiled from: OnBoardingPresenter */
    class C10006a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26616b;

        /* renamed from: a */
        final /* synthetic */ C10005c f26617a;

        C10006a(C10005c cVar) {
            boolean[] a = m46583a();
            this.f26617a = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46583a() {
            boolean[] zArr = f26616b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2099151249293617408L, "com/instabug/library/ui/onboarding/OnBoardingPresenter$1", 2);
            f26616b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46583a();
            C10005c.m46568a(this.f26617a).mo35959d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.ui.onboarding.c$b */
    /* compiled from: OnBoardingPresenter */
    static /* synthetic */ class C10007b {

        /* renamed from: a */
        static final /* synthetic */ int[] f26618a = new int[State.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f26619b = new int[InstabugInvocationEvent.values().length];

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26620c;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r0[8] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
            r0[10] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0031 */
        static {
            /*
                boolean[] r0 = m46584a()
                com.instabug.library.invocation.InstabugInvocationEvent[] r1 = com.instabug.library.invocation.InstabugInvocationEvent.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26619b = r1
                r1 = 0
                r2 = 5
                r3 = 3
                r4 = 4
                r5 = 2
                r6 = 1
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0022 }
                int[] r1 = f26619b     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.instabug.library.invocation.InstabugInvocationEvent r7 = com.instabug.library.invocation.InstabugInvocationEvent.FLOATING_BUTTON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r7] = r6     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r6] = r6
                goto L_0x0024
            L_0x0022:
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0024:
                int[] r1 = f26619b     // Catch:{ NoSuchFieldError -> 0x0031 }
                com.instabug.library.invocation.InstabugInvocationEvent r7 = com.instabug.library.invocation.InstabugInvocationEvent.SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x0031 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0031 }
                r1[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0031 }
                r0[r3] = r6
                goto L_0x0033
            L_0x0031:
                r0[r4] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0033:
                int[] r1 = f26619b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.library.invocation.InstabugInvocationEvent r7 = com.instabug.library.invocation.InstabugInvocationEvent.SCREENSHOT_GESTURE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0040 }
                r0[r2] = r6
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0043:
                int[] r1 = f26619b     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.instabug.library.invocation.InstabugInvocationEvent r3 = com.instabug.library.invocation.InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1 = 7
                r0[r1] = r6
                goto L_0x0055
            L_0x0051:
                r1 = 8
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0055:
                int[] r1 = f26619b     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.instabug.library.invocation.InstabugInvocationEvent r3 = com.instabug.library.invocation.InstabugInvocationEvent.SHAKE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1 = 9
                r0[r1] = r6
                goto L_0x0068
            L_0x0064:
                r1 = 10
                r0[r1] = r6
            L_0x0068:
                com.instabug.library.ui.onboarding.WelcomeMessage$State[] r1 = com.instabug.library.p397ui.onboarding.WelcomeMessage.State.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26618a = r1
                r1 = 11
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
                int[] r1 = f26618a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.instabug.library.ui.onboarding.WelcomeMessage$State r2 = com.instabug.library.p397ui.onboarding.WelcomeMessage.State.BETA     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1[r2] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
                r1 = 12
                r0[r1] = r6
                goto L_0x0088
            L_0x0084:
                r1 = 13
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0088:
                int[] r1 = f26618a     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.instabug.library.ui.onboarding.WelcomeMessage$State r2 = com.instabug.library.p397ui.onboarding.WelcomeMessage.State.LIVE     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1[r2] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
                r1 = 14
                r0[r1] = r6
                goto L_0x009b
            L_0x0097:
                r1 = 15
                r0[r1] = r6
            L_0x009b:
                r1 = 16
                r0[r1] = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p397ui.onboarding.C10005c.C10007b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46584a() {
            boolean[] zArr = f26620c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9089484576776429937L, "com/instabug/library/ui/onboarding/OnBoardingPresenter$2", 17);
            f26620c = a;
            return a;
        }
    }

    public C10005c(C10004a aVar) {
        boolean[] l = m46577l();
        super(aVar);
        l[0] = true;
        l[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C10004a m46568a(C10005c cVar) {
        boolean[] l = m46577l();
        C10004a aVar = cVar.f26615a;
        l[104] = true;
        return aVar;
    }

    /* renamed from: b */
    private C10008d m46570b() {
        String str;
        boolean[] l = m46577l();
        int a = m46567a(mo35964a(mo35966c()));
        Key key = Key.LIVE_WELCOME_MESSAGE_TITLE;
        C10004a aVar = this.f26615a;
        l[85] = true;
        String string = ((C0295d) aVar.getViewContext()).getString(C9700R.string.ib_str_live_welcome_message_title);
        l[86] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        l[87] = true;
        int i = C10007b.f26619b[mo35964a(mo35966c()).ordinal()];
        if (i == 1) {
            Key key2 = Key.LIVE_WELCOME_MESSAGE_CONTENT;
            C10004a aVar2 = this.f26615a;
            l[89] = true;
            String string2 = ((C0295d) aVar2.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_floating);
            l[90] = true;
            str = PlaceHolderUtils.getPlaceHolder(key2, string2);
            l[91] = true;
        } else if (i == 2 || i == 3) {
            Key key3 = Key.LIVE_WELCOME_MESSAGE_CONTENT;
            C10004a aVar3 = this.f26615a;
            l[92] = true;
            String string3 = ((C0295d) aVar3.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_screenshot);
            l[93] = true;
            str = PlaceHolderUtils.getPlaceHolder(key3, string3);
            l[94] = true;
        } else if (i == 4) {
            Key key4 = Key.LIVE_WELCOME_MESSAGE_CONTENT;
            C10004a aVar4 = this.f26615a;
            l[95] = true;
            String string4 = ((C0295d) aVar4.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_swipe);
            l[96] = true;
            str = PlaceHolderUtils.getPlaceHolder(key4, string4);
            l[97] = true;
        } else if (i != 5) {
            l[88] = true;
            str = null;
        } else {
            Key key5 = Key.LIVE_WELCOME_MESSAGE_CONTENT;
            C10004a aVar5 = this.f26615a;
            l[98] = true;
            String string5 = ((C0295d) aVar5.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_shake);
            l[99] = true;
            str = PlaceHolderUtils.getPlaceHolder(key5, string5);
            l[100] = true;
        }
        C10008d a2 = C10008d.m46586a(a, placeHolder, str, true);
        l[101] = true;
        return a2;
    }

    /* renamed from: f */
    private void m46571f() {
        boolean[] l = m46577l();
        C10004a aVar = this.f26615a;
        if (aVar == null) {
            l[7] = true;
        } else {
            l[8] = true;
            aVar.mo35961f();
            l[9] = true;
        }
        l[10] = true;
    }

    /* renamed from: g */
    private void m46572g() {
        boolean[] l = m46577l();
        if (this.f26615a == null) {
            l[11] = true;
        } else {
            l[12] = true;
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                l[13] = true;
                this.f26615a.mo35958c();
                l[14] = true;
            } else {
                this.f26615a.mo35960e();
                l[15] = true;
            }
        }
        l[16] = true;
    }

    /* renamed from: h */
    private List<C10008d> m46573h() {
        boolean[] l = m46577l();
        ArrayList arrayList = new ArrayList();
        l[21] = true;
        arrayList.add(m46574i());
        l[22] = true;
        arrayList.add(m46575j());
        l[23] = true;
        arrayList.add(m46569a());
        l[24] = true;
        return arrayList;
    }

    /* renamed from: i */
    private C10008d m46574i() {
        int i;
        boolean[] l = m46577l();
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = C9700R.C9703drawable.ib_ic_core_onboarding_welcome;
            l[25] = true;
        } else {
            i = C9700R.C9703drawable.ib_ic_core_onboarding_welcome_dark;
            l[26] = true;
        }
        Key key = Key.BETA_WELCOME_MESSAGE_WELCOME_STEP_TITLE;
        C10004a aVar = this.f26615a;
        l[27] = true;
        String string = ((C0295d) aVar.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_step_title);
        l[28] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        Key key2 = Key.BETA_WELCOME_MESSAGE_WELCOME_STEP_TITLE;
        C10004a aVar2 = this.f26615a;
        l[29] = true;
        String string2 = ((C0295d) aVar2.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_step_content);
        l[30] = true;
        String placeHolder2 = PlaceHolderUtils.getPlaceHolder(key2, string2);
        l[31] = true;
        C10008d a = C10008d.m46585a(i, placeHolder, placeHolder2);
        l[32] = true;
        return a;
    }

    /* renamed from: j */
    private C10008d m46575j() {
        String str;
        boolean[] l = m46577l();
        int a = m46567a(mo35964a(mo35966c()));
        Key key = Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_TITLE;
        C10004a aVar = this.f26615a;
        l[33] = true;
        String string = ((C0295d) aVar.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_title);
        l[34] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        l[35] = true;
        int i = C10007b.f26619b[mo35964a(mo35966c()).ordinal()];
        if (i == 1) {
            Key key2 = Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT;
            C10004a aVar2 = this.f26615a;
            l[37] = true;
            String string2 = ((C0295d) aVar2.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_floating);
            l[38] = true;
            str = PlaceHolderUtils.getPlaceHolder(key2, string2);
            l[39] = true;
        } else if (i == 2 || i == 3) {
            Key key3 = Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT;
            C10004a aVar3 = this.f26615a;
            l[40] = true;
            String string3 = ((C0295d) aVar3.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_screenshot);
            l[41] = true;
            str = PlaceHolderUtils.getPlaceHolder(key3, string3);
            l[42] = true;
        } else if (i == 4) {
            Key key4 = Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT;
            C10004a aVar4 = this.f26615a;
            l[43] = true;
            String string4 = ((C0295d) aVar4.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_swipe);
            l[44] = true;
            str = PlaceHolderUtils.getPlaceHolder(key4, string4);
            l[45] = true;
        } else if (i != 5) {
            l[36] = true;
            str = null;
        } else {
            Key key5 = Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT;
            C10004a aVar5 = this.f26615a;
            l[46] = true;
            String string5 = ((C0295d) aVar5.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_how_to_report_step_content_shake);
            l[47] = true;
            str = PlaceHolderUtils.getPlaceHolder(key5, string5);
            l[48] = true;
        }
        C10008d a2 = C10008d.m46585a(a, placeHolder, str);
        l[49] = true;
        return a2;
    }

    /* renamed from: k */
    private List<C10008d> m46576k() {
        boolean[] l = m46577l();
        ArrayList arrayList = new ArrayList();
        l[102] = true;
        arrayList.add(m46570b());
        l[103] = true;
        return arrayList;
    }

    /* renamed from: l */
    private static /* synthetic */ boolean[] m46577l() {
        boolean[] zArr = f26614b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1708973048703809206L, "com/instabug/library/ui/onboarding/OnBoardingPresenter", 105);
        f26614b = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public List<InstabugInvocationEvent> mo35966c() {
        boolean[] l = m46577l();
        List<InstabugInvocationEvent> asList = Arrays.asList(InvocationManager.getInstance().getCurrentInstabugInvocationEvents());
        l[58] = true;
        return asList;
    }

    /* renamed from: d */
    public void mo35967d() {
        boolean[] l = m46577l();
        List h = m46573h();
        C10004a aVar = this.f26615a;
        if (aVar == null) {
            l[17] = true;
        } else {
            l[18] = true;
            aVar.mo35957a(h);
            l[19] = true;
        }
        l[20] = true;
    }

    /* renamed from: e */
    public void mo35968e() {
        boolean[] l = m46577l();
        List k = m46576k();
        C10004a aVar = this.f26615a;
        if (aVar == null) {
            l[68] = true;
        } else {
            l[69] = true;
            aVar.mo35957a(k);
            l[70] = true;
            new Handler().postDelayed(new C10006a(this), 5000);
            l[71] = true;
        }
        l[72] = true;
    }

    /* renamed from: a */
    public void mo35965a(State state) {
        boolean[] l = m46577l();
        m46572g();
        l[2] = true;
        if (C10007b.f26618a[state.ordinal()] != 2) {
            mo35967d();
            l[3] = true;
        } else {
            mo35968e();
            l[4] = true;
            m46571f();
            l[5] = true;
        }
        l[6] = true;
    }

    /* renamed from: a */
    private C10008d m46569a() {
        int i;
        boolean[] l = m46577l();
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = C9700R.C9703drawable.ib_ic_core_onboarding_stay_updated;
            l[50] = true;
        } else {
            i = C9700R.C9703drawable.ib_ic_core_onboarding_stay_updated_dark;
            l[51] = true;
        }
        Key key = Key.BETA_WELCOME_MESSAGE_FINISH_STEP_TITLE;
        C10004a aVar = this.f26615a;
        l[52] = true;
        String string = ((C0295d) aVar.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_finishing_step_title);
        l[53] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        Key key2 = Key.BETA_WELCOME_MESSAGE_FINISH_STEP_CONTENT;
        C10004a aVar2 = this.f26615a;
        l[54] = true;
        String string2 = ((C0295d) aVar2.getViewContext()).getString(C9700R.string.ib_str_beta_welcome_finishing_step_content);
        l[55] = true;
        String placeHolder2 = PlaceHolderUtils.getPlaceHolder(key2, string2);
        l[56] = true;
        C10008d a = C10008d.m46585a(i, placeHolder, placeHolder2);
        l[57] = true;
        return a;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public InstabugInvocationEvent mo35964a(List<InstabugInvocationEvent> list) {
        boolean[] l = m46577l();
        if (list.size() == 1) {
            l[59] = true;
            InstabugInvocationEvent instabugInvocationEvent = (InstabugInvocationEvent) list.get(0);
            l[60] = true;
            return instabugInvocationEvent;
        } else if (list.contains(InstabugInvocationEvent.SHAKE)) {
            InstabugInvocationEvent instabugInvocationEvent2 = InstabugInvocationEvent.SHAKE;
            l[61] = true;
            return instabugInvocationEvent2;
        } else {
            if (list.contains(InstabugInvocationEvent.SCREENSHOT_GESTURE)) {
                l[62] = true;
            } else {
                InstabugInvocationEvent instabugInvocationEvent3 = InstabugInvocationEvent.SCREENSHOT;
                l[63] = true;
                if (list.contains(instabugInvocationEvent3)) {
                    l[64] = true;
                } else if (list.contains(InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT)) {
                    InstabugInvocationEvent instabugInvocationEvent4 = InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT;
                    l[66] = true;
                    return instabugInvocationEvent4;
                } else {
                    InstabugInvocationEvent instabugInvocationEvent5 = InstabugInvocationEvent.FLOATING_BUTTON;
                    l[67] = true;
                    return instabugInvocationEvent5;
                }
            }
            InstabugInvocationEvent instabugInvocationEvent6 = InstabugInvocationEvent.SCREENSHOT;
            l[65] = true;
            return instabugInvocationEvent6;
        }
    }

    @C0213q
    /* renamed from: a */
    private int m46567a(InstabugInvocationEvent instabugInvocationEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] l = m46577l();
        int i5 = C10007b.f26619b[instabugInvocationEvent.ordinal()];
        if (i5 == 1) {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                i = C9700R.C9703drawable.ib_ic_core_onboarding_floating_btn;
                l[73] = true;
            } else {
                i = C9700R.C9703drawable.ib_ic_core_onboarding_floating_btn_dark;
                l[74] = true;
            }
            l[75] = true;
            return i;
        } else if (i5 == 2 || i5 == 3) {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                i2 = C9700R.C9703drawable.ib_ic_core_onboarding_screenshot;
                l[76] = true;
            } else {
                i2 = C9700R.C9703drawable.ib_ic_core_onboarding_screenshot_dark;
                l[77] = true;
            }
            l[78] = true;
            return i2;
        } else if (i5 != 4) {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                i4 = C9700R.C9703drawable.ib_ic_core_onboarding_shake;
                l[82] = true;
            } else {
                i4 = C9700R.C9703drawable.ib_ic_core_onboarding_shake_dark;
                l[83] = true;
            }
            l[84] = true;
            return i4;
        } else {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                i3 = C9700R.C9703drawable.ib_ic_core_onboarding_swipe;
                l[79] = true;
            } else {
                i3 = C9700R.C9703drawable.ib_ic_core_onboarding_swipe_dark;
                l[80] = true;
            }
            l[81] = true;
            return i3;
        }
    }
}
