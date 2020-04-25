package com.instabug.survey.p400ui;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.util.DisplayUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.C10060a.C10063c;
import com.instabug.survey.C10060a.C10064d;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.network.service.InstabugSurveysSubmitterService;
import com.instabug.survey.p400ui.C10105c.C10106a;
import com.instabug.survey.p400ui.C10105c.C10110c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.e */
/* compiled from: SurveyPresenter */
public class C10154e extends BasePresenter<C10106a> {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f27048b;

    /* renamed from: a */
    private C10159g f27049a;

    /* renamed from: com.instabug.survey.ui.e$a */
    /* compiled from: SurveyPresenter */
    class C10155a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f27050b;

        /* renamed from: a */
        final /* synthetic */ C10154e f27051a;

        C10155a(C10154e eVar) {
            boolean[] a = m47213a();
            this.f27051a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47213a() {
            boolean[] zArr = f27050b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8874466221855769552L, "com/instabug/survey/ui/SurveyPresenter$1", 2);
            f27050b = a;
            return a;
        }

        public void run() {
            boolean[] a = m47213a();
            SurveysCacheManager.saveCacheToDisk();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.e$b */
    /* compiled from: SurveyPresenter */
    class C10156b implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f27052b;

        /* renamed from: a */
        final /* synthetic */ C10154e f27053a;

        C10156b(C10154e eVar) {
            boolean[] a = m47214a();
            this.f27053a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47214a() {
            boolean[] zArr = f27052b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8361982791373599913L, "com/instabug/survey/ui/SurveyPresenter$2", 2);
            f27052b = a;
            return a;
        }

        public void run() {
            boolean[] a = m47214a();
            SurveysCacheManager.saveCacheToDisk();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.e$c */
    /* compiled from: SurveyPresenter */
    static /* synthetic */ class C10157c {

        /* renamed from: a */
        static final /* synthetic */ int[] f27054a = new int[C10159g.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f27055b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m47215a()
                com.instabug.survey.ui.g[] r1 = com.instabug.survey.p400ui.C10159g.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f27054a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f27054a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.survey.ui.g r5 = com.instabug.survey.p400ui.C10159g.PARTIAL     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f27054a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.survey.ui.g r5 = com.instabug.survey.p400ui.C10159g.PRIMARY     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f27054a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.survey.ui.g r3 = com.instabug.survey.p400ui.C10159g.SECONDARY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                r1 = 7
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.p400ui.C10154e.C10157c.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47215a() {
            boolean[] zArr = f27055b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1529970619156839435L, "com/instabug/survey/ui/SurveyPresenter$3", 8);
            f27055b = a;
            return a;
        }
    }

    public C10154e(C10106a aVar) {
        boolean[] f = m47206f();
        super(aVar);
        f[0] = true;
    }

    /* renamed from: f */
    private static /* synthetic */ boolean[] m47206f() {
        boolean[] zArr = f27048b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8184482339752970177L, "com/instabug/survey/ui/SurveyPresenter", 97);
        f27048b = a;
        return a;
    }

    /* renamed from: a */
    public void mo36367a(C10159g gVar, boolean z) {
        int i;
        boolean[] f = m47206f();
        this.f27049a = gVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            f[1] = true;
        } else {
            f[2] = true;
            C10106a aVar = (C10106a) weakReference.get();
            if (aVar == null) {
                f[3] = true;
            } else {
                f[4] = true;
                if (aVar.getViewContext() == null) {
                    f[5] = true;
                } else {
                    f[6] = true;
                    C1376c cVar = (C1376c) aVar.getViewContext();
                    if (cVar == null) {
                        f[7] = true;
                    } else {
                        f[8] = true;
                        int displayHeightInPx = DisplayUtils.getDisplayHeightInPx(cVar);
                        f[9] = true;
                        int i2 = C10157c.f27054a[gVar.ordinal()];
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (OrientationUtils.isInLandscape(cVar)) {
                                    f[10] = true;
                                    if (InstabugDeviceProperties.isTablet(cVar)) {
                                        i = (displayHeightInPx * 40) / 100;
                                        f[11] = true;
                                    } else {
                                        i = (displayHeightInPx * 45) / 100;
                                        f[12] = true;
                                    }
                                } else if (InstabugDeviceProperties.isTablet(cVar)) {
                                    i = (displayHeightInPx * 25) / 100;
                                    f[13] = true;
                                } else {
                                    i = (displayHeightInPx * 38) / 100;
                                    f[14] = true;
                                }
                            } else if (InstabugDeviceProperties.isTablet(cVar)) {
                                i = (displayHeightInPx * 80) / 100;
                                f[20] = true;
                            } else if (OrientationUtils.isInLandscape(cVar)) {
                                i = (displayHeightInPx * 95) / 100;
                                f[21] = true;
                            } else {
                                i = (displayHeightInPx * 88) / 100;
                                f[22] = true;
                            }
                        } else if (InstabugDeviceProperties.isTablet(cVar)) {
                            f[15] = true;
                            if (OrientationUtils.isInLandscape(cVar)) {
                                i = (displayHeightInPx * 60) / 100;
                                f[16] = true;
                            } else {
                                i = (displayHeightInPx * 45) / 100;
                                f[17] = true;
                            }
                        } else if (OrientationUtils.isInLandscape(cVar)) {
                            i = (displayHeightInPx * 75) / 100;
                            f[18] = true;
                        } else {
                            i = (displayHeightInPx * 52) / 100;
                            f[19] = true;
                        }
                        if (z) {
                            f[23] = true;
                            aVar.mo36239b(i);
                            f[24] = true;
                        } else {
                            aVar.mo36245d(i);
                            f[25] = true;
                        }
                    }
                }
            }
        }
        f[26] = true;
    }

    /* renamed from: b */
    public void mo36368b(Survey survey) {
        boolean[] f = m47206f();
        if (survey == null) {
            f[68] = true;
        } else {
            f[69] = true;
            survey.setDismissed();
            f[70] = true;
            if (!survey.isCancelled()) {
                f[71] = true;
            } else {
                f[72] = true;
                int sessionCounter = survey.getSessionCounter();
                f[73] = true;
                if (sessionCounter < C10064d.m46823f()) {
                    f[74] = true;
                } else {
                    f[75] = true;
                    if (survey.isOptInSurvey()) {
                        f[76] = true;
                        survey.setShouldShowAgain(true);
                        f[77] = true;
                        survey.resetSessionsCounter();
                        f[78] = true;
                    } else if (survey.getSessionCounter() == 0) {
                        f[79] = true;
                    } else {
                        f[80] = true;
                        survey.setShouldShowAgain(false);
                        f[81] = true;
                    }
                }
            }
            SurveysCacheManager.addSurvey(survey);
            f[82] = true;
            PoolProvider.postIOTask(new C10156b(this));
            f[83] = true;
            C10063c.m46803e().mo36123a(System.currentTimeMillis());
            f[84] = true;
            if (this.view.get() == null) {
                f[85] = true;
            } else {
                f[86] = true;
                C10106a aVar = (C10106a) this.view.get();
                f[87] = true;
                if (aVar == null) {
                    f[88] = true;
                } else if (aVar.getViewContext() == null) {
                    f[89] = true;
                } else {
                    f[90] = true;
                    Context context = (Context) aVar.getViewContext();
                    f[91] = true;
                    Intent intent = new Intent((Context) aVar.getViewContext(), InstabugSurveysSubmitterService.class);
                    f[92] = true;
                    InstabugSurveysSubmitterService.m46933a(context, intent);
                    f[93] = true;
                    aVar.mo36238a(false);
                    f[94] = true;
                }
            }
        }
        f[95] = true;
    }

    /* renamed from: c */
    public void mo36369c() {
        boolean[] f = m47206f();
        if (this.view.get() == null) {
            f[28] = true;
        } else {
            f[29] = true;
            C10106a aVar = (C10106a) this.view.get();
            f[30] = true;
            if (aVar == null) {
                f[31] = true;
            } else if (aVar.getViewContext() == null) {
                f[32] = true;
            } else {
                f[33] = true;
                C1376c cVar = (C1376c) aVar.getViewContext();
                if (cVar == null) {
                    f[34] = true;
                } else {
                    f[35] = true;
                    if (cVar.getSupportFragmentManager().mo6240e().size() <= 0) {
                        f[36] = true;
                    } else {
                        f[37] = true;
                        C1382h supportFragmentManager = cVar.getSupportFragmentManager();
                        f[38] = true;
                        List e = supportFragmentManager.mo6240e();
                        f[39] = true;
                        Iterator it = e.iterator();
                        f[40] = true;
                        while (true) {
                            if (!it.hasNext()) {
                                f[41] = true;
                                break;
                            }
                            Fragment fragment = (Fragment) it.next();
                            if (fragment instanceof C10110c) {
                                f[42] = true;
                                ((C10110c) fragment).mo36282d();
                                f[43] = true;
                                break;
                            }
                            f[44] = true;
                        }
                    }
                }
            }
        }
        f[45] = true;
    }

    /* renamed from: d */
    public C10159g mo36370d() {
        boolean[] f = m47206f();
        C10159g gVar = this.f27049a;
        f[27] = true;
        return gVar;
    }

    /* renamed from: e */
    public boolean mo36371e() {
        boolean[] f = m47206f();
        boolean booleanValue = C10064d.m46821d().booleanValue();
        f[96] = true;
        return booleanValue;
    }

    /* renamed from: a */
    public void mo36366a(Survey survey) {
        boolean[] f = m47206f();
        survey.setSubmitted();
        f[46] = true;
        SurveysCacheManager.addSurvey(survey);
        f[47] = true;
        PoolProvider.postIOTask(new C10155a(this));
        f[48] = true;
        C10063c.m46803e().mo36123a(System.currentTimeMillis());
        f[49] = true;
        if (this.view.get() == null) {
            f[50] = true;
        } else {
            f[51] = true;
            C10106a aVar = (C10106a) this.view.get();
            f[52] = true;
            if (aVar == null) {
                f[53] = true;
            } else if (aVar.getViewContext() == null) {
                f[54] = true;
            } else {
                f[55] = true;
                Context context = (Context) aVar.getViewContext();
                f[56] = true;
                Intent intent = new Intent((Context) aVar.getViewContext(), InstabugSurveysSubmitterService.class);
                f[57] = true;
                InstabugSurveysSubmitterService.m46933a(context, intent);
                f[58] = true;
                if (!survey.isNPSSurvey()) {
                    f[59] = true;
                } else if (!survey.hasPositiveNpsAnswer()) {
                    f[60] = true;
                } else {
                    f[61] = true;
                    if (survey.isLifeVersion()) {
                        f[62] = true;
                    } else {
                        f[63] = true;
                        aVar.mo36238a(true);
                        f[64] = true;
                    }
                    f[65] = true;
                    return;
                }
                aVar.mo36238a(true);
                f[66] = true;
            }
        }
        f[67] = true;
    }
}
