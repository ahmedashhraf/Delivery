package com.instabug.bug.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Patterns;
import androidx.annotation.C0193h0;
import androidx.annotation.C0224v0;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.Fragment;
import com.instabug.bug.BugPlugin;
import com.instabug.bug.C9254f;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.Bug.BugState;
import com.instabug.bug.model.Bug.ViewHierarchyInspectionState;
import com.instabug.bug.p355b.C9246b;
import com.instabug.bug.p356h.C9259a;
import com.instabug.bug.p356h.p357b.C9270c.C9272b;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyInspectorEventBus;
import com.instabug.bug.settings.C9291a;
import com.instabug.bug.view.C9319d.C9322c;
import com.instabug.bug.view.C9357f.C9358a;
import com.instabug.bug.view.C9357f.C9359b;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.VideoProcessingServiceEventBus;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.video.VideoProcessingService.Action;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PermissionsUtils;
import com.instabug.library.util.PlaceHolderUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.g */
/* compiled from: BugReportingFragmentPresenter */
public class C9360g extends BasePresenter<C9359b> implements C9358a {

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f24787d;

    /* renamed from: a */
    private C12313b f24788a;

    /* renamed from: b */
    private C9365d f24789b;

    /* renamed from: c */
    private boolean f24790c = false;

    /* renamed from: com.instabug.bug.view.g$a */
    /* compiled from: BugReportingFragmentPresenter */
    class C9361a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24791N;

        /* renamed from: a */
        final /* synthetic */ C9359b f24792a;

        /* renamed from: b */
        final /* synthetic */ C9360g f24793b;

        C9361a(C9360g gVar, C9359b bVar) {
            boolean[] a = m43845a();
            this.f24793b = gVar;
            this.f24792a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43845a() {
            boolean[] zArr = f24791N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1569814000528851610L, "com/instabug/bug/view/BugReportingFragmentPresenter$1", 4);
            f24791N = a;
            return a;
        }

        public void run() {
            boolean[] a = m43845a();
            InstabugSDKLogger.m46625i(this.f24793b, "Permission granted");
            a[1] = true;
            C9254f.m43255h().mo33439g();
            a[2] = true;
            this.f24792a.mo33752j();
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.g$b */
    /* compiled from: BugReportingFragmentPresenter */
    class C9362b implements C12331g<C9272b> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24794b;

        /* renamed from: a */
        final /* synthetic */ C9360g f24795a;

        /* renamed from: com.instabug.bug.view.g$b$a */
        /* compiled from: BugReportingFragmentPresenter */
        class C9363a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24796N;

            /* renamed from: a */
            final /* synthetic */ C9359b f24797a;

            /* renamed from: b */
            final /* synthetic */ C9362b f24798b;

            C9363a(C9362b bVar, C9359b bVar2) {
                boolean[] a = m43849a();
                this.f24798b = bVar;
                this.f24797a = bVar2;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43849a() {
                boolean[] zArr = f24796N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(8632070260839916122L, "com/instabug/bug/view/BugReportingFragmentPresenter$2$1", 7);
                f24796N = a;
                return a;
            }

            public void run() {
                boolean[] a = m43849a();
                this.f24797a.mo33755m();
                a[1] = true;
                int i = C9364c.f24799a[C9360g.m43823c(this.f24798b.f24795a).ordinal()];
                if (i == 1) {
                    this.f24798b.f24795a.mo33797i();
                    a[3] = true;
                } else if (i == 2) {
                    this.f24798b.f24795a.mo33795g();
                    a[4] = true;
                } else if (i != 3) {
                    a[2] = true;
                } else {
                    this.f24798b.f24795a.mo33794f();
                    a[5] = true;
                }
                a[6] = true;
            }
        }

        C9362b(C9360g gVar) {
            boolean[] a = m43846a();
            this.f24795a = gVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43846a() {
            boolean[] zArr = f24794b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5124662953409891265L, "com/instabug/bug/view/BugReportingFragmentPresenter$2", 11);
            f24794b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33802a(C9272b bVar) {
            boolean[] a = m43846a();
            StringBuilder sb = new StringBuilder();
            sb.append("receive a view hierarchy inspection action, action value: ");
            sb.append(bVar);
            InstabugSDKLogger.m46626v(this, sb.toString());
            if (bVar == C9272b.COMPLETED) {
                a[1] = true;
            } else if (bVar != C9272b.FAILED) {
                a[2] = true;
                a[9] = true;
            } else {
                a[3] = true;
            }
            if (C9360g.m43820a(this.f24795a) == null) {
                a[4] = true;
            } else {
                a[5] = true;
                C9359b bVar2 = (C9359b) C9360g.m43821b(this.f24795a).get();
                if (bVar2 == null) {
                    a[6] = true;
                } else {
                    a[7] = true;
                    ((Fragment) bVar2.getViewContext()).getActivity().runOnUiThread(new C9363a(this, bVar2));
                    a[8] = true;
                }
            }
            a[9] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43846a();
            mo33802a((C9272b) obj);
            a[10] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.g$c */
    /* compiled from: BugReportingFragmentPresenter */
    static /* synthetic */ class C9364c {

        /* renamed from: a */
        static final /* synthetic */ int[] f24799a = new int[C9365d.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24800b;

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
                boolean[] r0 = m43850a()
                com.instabug.bug.view.g$d[] r1 = com.instabug.bug.view.C9360g.C9365d.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24799a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f24799a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.bug.view.g$d r5 = com.instabug.bug.view.C9360g.C9365d.SEND_BUG     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f24799a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.bug.view.g$d r5 = com.instabug.bug.view.C9360g.C9365d.TAKE_EXTRA_SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f24799a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.bug.view.g$d r3 = com.instabug.bug.view.C9360g.C9365d.RECORD_VIDEO     // Catch:{ NoSuchFieldError -> 0x0040 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.C9360g.C9364c.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43850a() {
            boolean[] zArr = f24800b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6062048903184132759L, "com/instabug/bug/view/BugReportingFragmentPresenter$3", 8);
            f24800b = a;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.view.g$d */
    /* compiled from: BugReportingFragmentPresenter */
    private enum C9365d {
        NONE,
        SEND_BUG,
        TAKE_EXTRA_SCREENSHOT,
        RECORD_VIDEO;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    public C9360g(C9359b bVar) {
        boolean[] m = m43826m();
        super(bVar);
        m[0] = true;
        m43822b();
        this.f24789b = C9365d.NONE;
        m[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m43820a(C9360g gVar) {
        boolean[] m = m43826m();
        WeakReference<V> weakReference = gVar.view;
        m[215] = true;
        return weakReference;
    }

    /* renamed from: b */
    static /* synthetic */ WeakReference m43821b(C9360g gVar) {
        boolean[] m = m43826m();
        WeakReference<V> weakReference = gVar.view;
        m[216] = true;
        return weakReference;
    }

    /* renamed from: c */
    static /* synthetic */ C9365d m43823c(C9360g gVar) {
        boolean[] m = m43826m();
        C9365d dVar = gVar.f24789b;
        m[217] = true;
        return dVar;
    }

    /* renamed from: k */
    private boolean m43824k() {
        boolean[] m = m43826m();
        C9359b bVar = (C9359b) this.view.get();
        m[174] = true;
        String f = C9254f.m43255h().mo33434c().mo33517f();
        m[175] = true;
        if (!C9291a.m43476r().mo33616i()) {
            m[176] = true;
        } else {
            if (f == null) {
                m[177] = true;
            } else {
                m[178] = true;
                if (f.trim().length() != 0) {
                    m[179] = true;
                } else {
                    m[180] = true;
                }
            }
            Key key = Key.INVALID_COMMENT_MESSAGE;
            m[181] = true;
            String string = ((Fragment) bVar.getViewContext()).getString(C9700R.string.instabug_err_invalid_comment);
            m[182] = true;
            String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
            m[183] = true;
            bVar.mo33743c(placeHolder);
            m[184] = true;
            return false;
        }
        m[185] = true;
        return true;
    }

    /* renamed from: l */
    private void m43825l() {
        boolean[] m = m43826m();
        this.f24788a.mo42072b(ViewHierarchyInspectorEventBus.getInstance().subscribe(new C9362b(this)));
        m[214] = true;
    }

    /* renamed from: m */
    private static /* synthetic */ boolean[] m43826m() {
        boolean[] zArr = f24787d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2020424653956022292L, "com/instabug/bug/view/BugReportingFragmentPresenter", 218);
        f24787d = a;
        return a;
    }

    /* renamed from: d */
    public void mo33792d() {
        boolean[] m = m43826m();
        this.f24788a = new C12313b();
        m[2] = true;
        m43825l();
        m[3] = true;
    }

    /* renamed from: e */
    public void mo33793e() {
        boolean[] m = m43826m();
        Bug c = C9254f.m43255h().mo33434c();
        if (c == null) {
            m[109] = true;
        } else {
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                m[110] = true;
            } else {
                m[111] = true;
                C9359b bVar = (C9359b) weakReference.get();
                if (bVar == null) {
                    m[112] = true;
                } else {
                    m[113] = true;
                    bVar.mo33738a(c.mo33519g());
                    m[114] = true;
                }
            }
        }
        m[115] = true;
    }

    /* renamed from: f */
    public void mo33794f() {
        boolean[] m = m43826m();
        if (this.f24790c) {
            m[42] = true;
            return;
        }
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            m[43] = true;
        } else {
            m[44] = true;
            C9359b bVar = (C9359b) weakReference.get();
            m[45] = true;
            if (!C9254f.m43255h().mo33434c().mo33528m()) {
                m[46] = true;
            } else {
                m[47] = true;
                if (C9254f.m43255h().mo33434c().mo33529n() != ViewHierarchyInspectionState.IN_PROGRESS) {
                    m[48] = true;
                } else {
                    this.f24789b = C9365d.RECORD_VIDEO;
                    if (bVar == null) {
                        m[49] = true;
                    } else {
                        m[50] = true;
                        bVar.mo33754l();
                        m[51] = true;
                    }
                }
            }
            C9254f.m43255h().mo33439g();
            m[52] = true;
            String id = C9254f.m43255h().mo33434c().getId();
            m[53] = true;
            C9246b.m43210b().mo33421a(id);
            if (bVar == null) {
                m[54] = true;
            } else {
                m[55] = true;
                bVar.finishActivity();
                m[56] = true;
            }
            BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
            if (bugPlugin == null) {
                m[57] = true;
            } else {
                m[58] = true;
                bugPlugin.setState(2);
                m[59] = true;
            }
        }
        m[60] = true;
    }

    /* renamed from: g */
    public void mo33795g() {
        boolean[] m = m43826m();
        if (this.f24790c) {
            m[22] = true;
            return;
        }
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            m[23] = true;
        } else {
            m[24] = true;
            C9359b bVar = (C9359b) weakReference.get();
            m[25] = true;
            if (!C9254f.m43255h().mo33434c().mo33528m()) {
                m[26] = true;
            } else {
                m[27] = true;
                if (C9254f.m43255h().mo33434c().mo33529n() != ViewHierarchyInspectionState.IN_PROGRESS) {
                    m[28] = true;
                } else {
                    this.f24789b = C9365d.TAKE_EXTRA_SCREENSHOT;
                    if (bVar == null) {
                        m[29] = true;
                    } else {
                        m[30] = true;
                        bVar.mo33754l();
                        m[31] = true;
                    }
                }
            }
            C9254f.m43255h().mo33439g();
            m[32] = true;
            C9254f.m43255h().mo33434c().mo33499a(BugState.IN_PROGRESS);
            m[33] = true;
            BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
            if (bugPlugin == null) {
                m[34] = true;
            } else {
                m[35] = true;
                bugPlugin.setState(2);
                m[36] = true;
                C9259a.m43286a().mo33450a(bugPlugin.getAppContext());
                m[37] = true;
            }
            if (bVar == null) {
                m[38] = true;
            } else {
                m[39] = true;
                bVar.finishActivity();
                m[40] = true;
            }
        }
        m[41] = true;
    }

    /* renamed from: h */
    public void mo33796h() {
        boolean[] m = m43826m();
        if (this.f24790c) {
            m[15] = true;
            return;
        }
        C9254f.m43255h().mo33431a(true);
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            m[16] = true;
        } else {
            m[17] = true;
            C9359b bVar = (C9359b) weakReference.get();
            if (bVar == null) {
                m[18] = true;
            } else {
                m[19] = true;
                PermissionsUtils.requestPermission((Fragment) bVar.getViewContext(), "android.permission.WRITE_EXTERNAL_STORAGE", 3873, (Runnable) null, (Runnable) new C9361a(this, bVar));
                m[20] = true;
            }
        }
        m[21] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33797i() {
        /*
            r6 = this;
            boolean[] r0 = m43826m()
            boolean r1 = r6.f24790c
            r2 = 1
            if (r1 == 0) goto L_0x000e
            r1 = 132(0x84, float:1.85E-43)
            r0[r1] = r2
            return
        L_0x000e:
            java.lang.ref.WeakReference<V> r1 = r6.view
            if (r1 != 0) goto L_0x0018
            r1 = 133(0x85, float:1.86E-43)
            r0[r1] = r2
            goto L_0x0125
        L_0x0018:
            r3 = 134(0x86, float:1.88E-43)
            r0[r3] = r2
            java.lang.Object r1 = r1.get()
            com.instabug.bug.view.f$b r1 = (com.instabug.bug.view.C9357f.C9359b) r1
            if (r1 != 0) goto L_0x002a
            r1 = 135(0x87, float:1.89E-43)
            r0[r1] = r2
            goto L_0x0125
        L_0x002a:
            r3 = 136(0x88, float:1.9E-43)
            r0[r3] = r2
            com.instabug.bug.f r3 = com.instabug.bug.C9254f.m43255h()
            com.instabug.bug.model.Bug r3 = r3.mo33434c()
            if (r3 == 0) goto L_0x003d
            r3 = 137(0x89, float:1.92E-43)
            r0[r3] = r2
            goto L_0x005f
        L_0x003d:
            r3 = 138(0x8a, float:1.93E-43)
            r0[r3] = r2
            java.lang.String r3 = "BUG WAS NULL - Recreate a new bug"
            com.instabug.library.util.InstabugSDKLogger.m46623e(r6, r3)
            r3 = 139(0x8b, float:1.95E-43)
            r0[r3] = r2
            com.instabug.bug.f r3 = com.instabug.bug.C9254f.m43255h()
            java.lang.Object r4 = r1.getViewContext()
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.content.Context r4 = r4.getContext()
            r3.mo33426a(r4)
            r3 = 140(0x8c, float:1.96E-43)
            r0[r3] = r2
        L_0x005f:
            com.instabug.bug.f r3 = com.instabug.bug.C9254f.m43255h()
            com.instabug.bug.model.Bug r3 = r3.mo33434c()
            boolean r3 = r3.mo33528m()
            if (r3 != 0) goto L_0x0072
            r3 = 141(0x8d, float:1.98E-43)
            r0[r3] = r2
            goto L_0x008a
        L_0x0072:
            r3 = 142(0x8e, float:1.99E-43)
            r0[r3] = r2
            com.instabug.bug.f r3 = com.instabug.bug.C9254f.m43255h()
            com.instabug.bug.model.Bug r3 = r3.mo33434c()
            com.instabug.bug.model.Bug$ViewHierarchyInspectionState r3 = r3.mo33529n()
            com.instabug.bug.model.Bug$ViewHierarchyInspectionState r4 = com.instabug.bug.model.Bug.ViewHierarchyInspectionState.IN_PROGRESS
            if (r3 == r4) goto L_0x0116
            r3 = 143(0x8f, float:2.0E-43)
            r0[r3] = r2
        L_0x008a:
            boolean r3 = r6.mo33799a()
            if (r3 != 0) goto L_0x0095
            r1 = 146(0x92, float:2.05E-43)
            r0[r1] = r2
            return
        L_0x0095:
            boolean r3 = r6.m43824k()
            if (r3 != 0) goto L_0x00a0
            r1 = 147(0x93, float:2.06E-43)
            r0[r1] = r2
            return
        L_0x00a0:
            com.instabug.library.settings.SettingsManager r3 = com.instabug.library.settings.SettingsManager.getInstance()
            java.lang.String r4 = r1.mo33753k()
            r3.setEnteredEmail(r4)
            r3 = 148(0x94, float:2.07E-43)
            r0[r3] = r2
            com.instabug.bug.settings.a r3 = com.instabug.bug.settings.C9291a.m43476r()
            java.util.List r3 = r3.mo33621n()
            boolean r3 = r3.isEmpty()
            r4 = 0
            if (r3 != 0) goto L_0x00c3
            r3 = 149(0x95, float:2.09E-43)
            r0[r3] = r2
            goto L_0x00d7
        L_0x00c3:
            r3 = 150(0x96, float:2.1E-43)
            r0[r3] = r2
            com.instabug.bug.settings.a r3 = com.instabug.bug.settings.C9291a.m43476r()
            com.instabug.bug.extendedbugreport.ExtendedBugReport$State r3 = r3.mo33623p()
            com.instabug.bug.extendedbugreport.ExtendedBugReport$State r5 = com.instabug.bug.extendedbugreport.ExtendedBugReport.State.DISABLED
            if (r3 == r5) goto L_0x00dd
            r3 = 151(0x97, float:2.12E-43)
            r0[r3] = r2
        L_0x00d7:
            r3 = 152(0x98, float:2.13E-43)
            r0[r3] = r2
            r3 = 1
            goto L_0x00e2
        L_0x00dd:
            r3 = 153(0x99, float:2.14E-43)
            r0[r3] = r2
            r3 = 0
        L_0x00e2:
            if (r3 != 0) goto L_0x0107
            r3 = 154(0x9a, float:2.16E-43)
            r0[r3] = r2
            com.instabug.bug.f r3 = com.instabug.bug.C9254f.m43255h()
            java.lang.Object r5 = r1.getViewContext()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            android.content.Context r5 = r5.getContext()
            r3.mo33435c(r5)
            r3 = 155(0x9b, float:2.17E-43)
            r0[r3] = r2
            r1.mo33750h()
            r6.f24790c = r2
            r3 = 156(0x9c, float:2.19E-43)
            r0[r3] = r2
            goto L_0x010e
        L_0x0107:
            r1.mo33751i()
            r3 = 157(0x9d, float:2.2E-43)
            r0[r3] = r2
        L_0x010e:
            r1.mo33741b(r4)
            r1 = 158(0x9e, float:2.21E-43)
            r0[r1] = r2
            goto L_0x0125
        L_0x0116:
            com.instabug.bug.view.g$d r3 = com.instabug.bug.view.C9360g.C9365d.SEND_BUG
            r6.f24789b = r3
            r3 = 144(0x90, float:2.02E-43)
            r0[r3] = r2
            r1.mo33754l()
            r1 = 145(0x91, float:2.03E-43)
            r0[r1] = r2
        L_0x0125:
            r1 = 159(0x9f, float:2.23E-43)
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.C9360g.mo33797i():void");
    }

    /* renamed from: j */
    public void mo33798j() {
        boolean[] m = m43826m();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            m[126] = true;
        } else {
            m[127] = true;
            C9359b bVar = (C9359b) weakReference.get();
            if (bVar == null) {
                m[128] = true;
            } else {
                m[129] = true;
                bVar.mo33746d(InstabugCore.getEnteredEmail());
                m[130] = true;
            }
        }
        m[131] = true;
    }

    /* renamed from: a */
    public void mo33787a(String str) {
        boolean[] m = m43826m();
        if (C9254f.m43255h().mo33434c() == null) {
            m[5] = true;
        } else {
            m[6] = true;
            if (C9254f.m43255h().mo33434c().getState() == null) {
                m[7] = true;
            } else {
                m[8] = true;
                C9254f.m43255h().mo33434c().getState().setUserEmail(str);
                m[9] = true;
            }
        }
        m[10] = true;
    }

    /* renamed from: b */
    public void mo33789b(String str) {
        boolean[] m = m43826m();
        if (C9254f.m43255h().mo33434c() == null) {
            m[11] = true;
        } else {
            m[12] = true;
            C9254f.m43255h().mo33434c().mo33513e(str);
            m[13] = true;
        }
        m[14] = true;
    }

    /* renamed from: c */
    public void mo33791c() {
        boolean[] m = m43826m();
        this.f24788a.dispose();
        m[4] = true;
    }

    /* renamed from: c */
    public String mo33790c(String str) {
        boolean[] m = m43826m();
        m[122] = true;
        int primaryColor = InstabugCore.getPrimaryColor();
        m[123] = true;
        String a = C9322c.m43649a(str, primaryColor);
        m[124] = true;
        String d = C9322c.m43650d(a);
        m[125] = true;
        return d;
    }

    /* renamed from: b */
    private void m43822b() {
        boolean[] m = m43826m();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            m[61] = true;
        } else {
            m[62] = true;
            C9359b bVar = (C9359b) weakReference.get();
            if (bVar == null) {
                m[63] = true;
            } else if (VERSION.SDK_INT >= 23) {
                m[64] = true;
            } else {
                m[65] = true;
                if (PermissionsUtils.isPermissionGranted(((Fragment) bVar.getViewContext()).getContext(), "android.permission.RECORD_AUDIO")) {
                    m[66] = true;
                } else {
                    m[67] = true;
                    Instabug.setShouldAudioRecordingOptionAppear(false);
                    m[68] = true;
                }
            }
        }
        m[69] = true;
    }

    /* renamed from: a */
    public void mo33785a(Bundle bundle) {
        m43826m()[70] = true;
    }

    /* renamed from: a */
    public void mo33784a(int i, int i2, Intent intent) {
        boolean[] m = m43826m();
        if (i != 3862) {
            m[72] = true;
        } else if (i2 != -1) {
            m[73] = true;
        } else if (intent == null) {
            m[74] = true;
        } else {
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                m[75] = true;
            } else {
                m[76] = true;
                C9359b bVar = (C9359b) weakReference.get();
                if (bVar == null) {
                    m[77] = true;
                } else {
                    m[78] = true;
                    Uri data = intent.getData();
                    m[79] = true;
                    C1376c activity = ((Fragment) bVar.getViewContext()).getActivity();
                    m[80] = true;
                    String galleryImagePath = AttachmentsUtility.getGalleryImagePath(activity, data);
                    if (galleryImagePath != null) {
                        m[81] = true;
                    } else {
                        m[82] = true;
                        galleryImagePath = intent.getData().getPath();
                        m[83] = true;
                    }
                    if (galleryImagePath == null) {
                        m[84] = true;
                    } else {
                        m[85] = true;
                        C9254f h = C9254f.m43255h();
                        m[86] = true;
                        Context context = ((Fragment) bVar.getViewContext()).getContext();
                        File file = new File(galleryImagePath);
                        m[87] = true;
                        Uri fromFile = Uri.fromFile(file);
                        m[88] = true;
                        h.mo33427a(context, fromFile);
                        m[89] = true;
                    }
                }
            }
            C9254f.m43255h().mo33431a(false);
            m[90] = true;
        }
        m[91] = true;
    }

    /* renamed from: b */
    public void mo33800b(Attachment attachment) {
        boolean[] m = m43826m();
        WeakReference<V> weakReference = this.view;
        if (weakReference == null) {
            m[116] = true;
        } else {
            m[117] = true;
            C9359b bVar = (C9359b) weakReference.get();
            if (bVar == null) {
                m[118] = true;
            } else {
                m[119] = true;
                bVar.mo33736a(attachment);
                m[120] = true;
            }
        }
        m[121] = true;
    }

    /* renamed from: a */
    public void mo33786a(@C0193h0 Attachment attachment) {
        boolean[] m = m43826m();
        C9254f.m43255h().mo33434c().mo33519g().remove(attachment);
        m[92] = true;
        File file = new File(attachment.getLocalPath());
        m[93] = true;
        if (!Type.VIDEO.equals(attachment.getType())) {
            m[94] = true;
        } else {
            m[95] = true;
            InstabugSDKLogger.m46625i(this, "removing video attachment");
            m[96] = true;
            CacheManager instance = CacheManager.getInstance();
            m[97] = true;
            C9840b cache = instance.getCache(CacheManager.DEFAULT_IN_MEMORY_CACHE_KEY);
            if (cache == null) {
                m[98] = true;
            } else {
                m[99] = true;
                if (cache.delete("video.path") == null) {
                    m[100] = true;
                } else {
                    m[101] = true;
                    InstabugSDKLogger.m46625i(this, "video attachment removed successfully");
                    m[102] = true;
                }
            }
            C9254f.m43255h().mo33434c().setHasVideo(false);
            m[103] = true;
            VideoProcessingServiceEventBus.getInstance().post(Action.STOP);
            m[104] = true;
        }
        if (!file.delete()) {
            m[105] = true;
        } else {
            m[106] = true;
            InstabugSDKLogger.m46625i(this, "attachment removed successfully");
            m[107] = true;
        }
        mo33800b(attachment);
        m[108] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo33799a() {
        boolean[] m = m43826m();
        C9359b bVar = (C9359b) this.view.get();
        m[160] = true;
        String userEmail = C9254f.m43255h().mo33434c().getState().getUserEmail();
        m[161] = true;
        if (!C9291a.m43476r().mo33612e()) {
            m[162] = true;
        } else {
            m[163] = true;
            if (!C9291a.m43476r().mo33614g()) {
                m[164] = true;
            } else {
                m[165] = true;
                if (userEmail == null) {
                    m[166] = true;
                } else if (Patterns.EMAIL_ADDRESS.matcher(userEmail).matches()) {
                    m[167] = true;
                } else {
                    m[168] = true;
                }
                Key key = Key.INVALID_EMAIL_MESSAGE;
                m[169] = true;
                String string = ((Fragment) bVar.getViewContext()).getString(C9700R.string.instabug_err_invalid_email);
                m[170] = true;
                String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
                m[171] = true;
                bVar.mo33740b(placeHolder);
                m[172] = true;
                return false;
            }
        }
        m[173] = true;
        return true;
    }

    /* renamed from: a */
    public Attachment mo33783a(List<Attachment> list) {
        boolean[] m = m43826m();
        int size = list.size() - 1;
        m[186] = true;
        while (size >= 0) {
            m[187] = true;
            Attachment attachment = (Attachment) list.get(size);
            m[188] = true;
            if (attachment.getType() == Type.VIDEO) {
                m[189] = true;
                return attachment;
            }
            size--;
            m[190] = true;
        }
        m[191] = true;
        return null;
    }

    /* renamed from: a */
    public void mo33788a(List<Attachment> list, String str) {
        boolean[] m = m43826m();
        int size = list.size() - 1;
        m[192] = true;
        while (true) {
            if (size < 0) {
                m[193] = true;
                break;
            }
            m[194] = true;
            Attachment attachment = (Attachment) list.get(size);
            m[195] = true;
            if (attachment.getType() == Type.VIDEO) {
                m[196] = true;
                attachment.setLocalPath(str);
                m[197] = true;
                attachment.setVideoEncoded(true);
                m[198] = true;
                break;
            }
            size--;
            m[199] = true;
        }
        m[200] = true;
    }
}
