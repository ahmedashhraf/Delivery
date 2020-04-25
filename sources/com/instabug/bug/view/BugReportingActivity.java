package com.instabug.bug.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1382h.C1385c;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.bug.BugPlugin;
import com.instabug.bug.C9231R;
import com.instabug.bug.C9250d.C9252b;
import com.instabug.bug.C9253e;
import com.instabug.bug.C9254f;
import com.instabug.bug.OnSdkDismissedCallback.DismissType;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.view.C9303b.C9315i;
import com.instabug.bug.view.C9303b.C9315i.C9316a;
import com.instabug.bug.view.C9319d.C9321b;
import com.instabug.bug.view.C9319d.C9322c;
import com.instabug.bug.view.C9319d.C9323d;
import com.instabug.bug.view.C9319d.C9324e;
import com.instabug.bug.view.C9319d.C9324e.C9326b;
import com.instabug.bug.view.C9319d.C9327f;
import com.instabug.bug.view.C9331e.C9347o;
import com.instabug.library.C9700R;
import com.instabug.library.FragmentVisibilityChangedListener;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.InstabugState;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.VideoProcessingServiceEventBus;
import com.instabug.library.core.p382ui.BaseToolbarActivity;
import com.instabug.library.internal.storage.cache.C9840b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.video.VideoProcessingService.Action;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.model.Attachment.Type;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapUtils.OnSaveBitmapCallback;
import com.instabug.library.util.BitmapWorkerTask.OnImageLoadedListener;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.StatusBarUtils;
import java.util.ArrayList;
import org.apache.http.C15470v;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class BugReportingActivity extends BaseToolbarActivity<C9366h> implements C1385c, OnClickListener, C9316a, C9321b, C9326b, C9347o, _InstabugActivity {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24610b;

    /* renamed from: a */
    private boolean f24611a = true;

    /* renamed from: com.instabug.bug.view.BugReportingActivity$a */
    class C9294a implements OnSaveBitmapCallback {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24612b;

        /* renamed from: a */
        final /* synthetic */ BugReportingActivity f24613a;

        C9294a(BugReportingActivity bugReportingActivity) {
            boolean[] a = m43572a();
            this.f24613a = bugReportingActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43572a() {
            boolean[] zArr = f24612b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6723808767174650052L, "com/instabug/bug/view/BugReportingActivity$1", 3);
            f24612b = a;
            return a;
        }

        public void onError(Throwable th) {
            m43572a()[2] = true;
        }

        public void onSuccess(Uri uri) {
            boolean[] a = m43572a();
            C9254f.m43255h().mo33433b((Context) this.f24613a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.BugReportingActivity$b */
    class C9295b implements OnImageLoadedListener {

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f24614e;

        /* renamed from: a */
        final /* synthetic */ float f24615a;

        /* renamed from: b */
        final /* synthetic */ float f24616b;

        /* renamed from: c */
        final /* synthetic */ ImageView f24617c;

        /* renamed from: d */
        final /* synthetic */ BugReportingActivity f24618d;

        /* renamed from: com.instabug.bug.view.BugReportingActivity$b$a */
        class C9296a implements AnimationListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24619b;

            /* renamed from: a */
            final /* synthetic */ C9295b f24620a;

            C9296a(C9295b bVar) {
                boolean[] a = m43574a();
                this.f24620a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43574a() {
                boolean[] zArr = f24619b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7956106325467644562L, "com/instabug/bug/view/BugReportingActivity$2$1", 4);
                f24619b = a;
                return a;
            }

            public void onAnimationEnd(Animation animation) {
                boolean[] a = m43574a();
                this.f24620a.f24617c.setVisibility(8);
                a[2] = true;
            }

            public void onAnimationRepeat(Animation animation) {
                m43574a()[3] = true;
            }

            public void onAnimationStart(Animation animation) {
                m43574a()[1] = true;
            }
        }

        C9295b(BugReportingActivity bugReportingActivity, float f, float f2, ImageView imageView) {
            boolean[] a = m43573a();
            this.f24618d = bugReportingActivity;
            this.f24615a = f;
            this.f24616b = f2;
            this.f24617c = imageView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43573a() {
            boolean[] zArr = f24614e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1725958523367516548L, "com/instabug/bug/view/BugReportingActivity$2", 6);
            f24614e = a;
            return a;
        }

        public void onImageLoaded() {
            boolean[] a = m43573a();
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, this.f24615a, 1, this.f24616b);
            a[1] = true;
            scaleAnimation.setDuration(500);
            a[2] = true;
            scaleAnimation.setFillAfter(false);
            a[3] = true;
            scaleAnimation.setAnimationListener(new C9296a(this));
            a[4] = true;
            this.f24617c.startAnimation(scaleAnimation);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.BugReportingActivity$c */
    class C9297c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24621b;

        /* renamed from: a */
        final /* synthetic */ BugReportingActivity f24622a;

        C9297c(BugReportingActivity bugReportingActivity) {
            boolean[] a = m43575a();
            this.f24622a = bugReportingActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43575a() {
            boolean[] zArr = f24621b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7706039780668860064L, "com/instabug/bug/view/BugReportingActivity$3", 2);
            f24621b = a;
            return a;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean[] a = m43575a();
            this.f24622a.mo33664d();
            a[1] = true;
        }
    }

    public BugReportingActivity() {
        boolean[] k = m43556k();
        k[0] = true;
    }

    /* renamed from: j */
    private void m43555j() {
        boolean[] k = m43556k();
        getSupportFragmentManager().mo6245j();
        k[187] = true;
    }

    /* renamed from: k */
    private static /* synthetic */ boolean[] m43556k() {
        boolean[] zArr = f24610b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7970429884710577954L, "com/instabug/bug/view/BugReportingActivity", C15470v.f44665f);
        f24610b = a;
        return a;
    }

    /* renamed from: l */
    private void m43557l() {
        boolean[] k = m43556k();
        m43551a(false, C9700R.C9704id.instabug_fragment_container);
        int i = C9700R.C9704id.instabug_fragment_container;
        k[188] = true;
        C9324e d = C9324e.m43663d();
        k[189] = true;
        m43552b(i, d, "disclaimer", true);
        k[190] = true;
    }

    /* renamed from: m */
    private void m43558m() {
        boolean[] k = m43556k();
        C9299a.m43580a(this, C9231R.string.instabug_str_bugreport_dismiss_warning_title, C9231R.string.instabug_str_bugreport_dismiss_warning_message, C9231R.string.instabug_str_bugreport_dismiss_discard, C9231R.string.instabug_str_bugreport_dismiss_cancel, new C9297c(this), null);
        k[201] = true;
    }

    /* renamed from: a */
    public void mo33659a(@C0195i0 Bitmap bitmap, Uri uri) {
        int i;
        boolean[] k = m43556k();
        InstabugSDKLogger.m46626v(this, "onImageEditingDone");
        if (bitmap == null) {
            k[106] = true;
        } else {
            k[107] = true;
            BitmapUtils.saveBitmap(bitmap, uri, this, new C9294a(this));
            k[108] = true;
        }
        m43551a(false, C9231R.C9235id.instabug_fragment_container);
        k[109] = true;
        m43555j();
        k[110] = true;
        String str = "feedback";
        if (getSupportFragmentManager().mo6223a(str) != null) {
            k[111] = true;
        } else {
            k[112] = true;
            InstabugSDKLogger.m46626v(this, "Instabug Feedback fragment equal null");
            int i2 = C9231R.C9235id.instabug_fragment_container;
            k[113] = true;
            C9278b e = C9254f.m43255h().mo33434c().mo33514e();
            k[114] = true;
            String f = C9254f.m43255h().mo33434c().mo33517f();
            k[115] = true;
            if (C9254f.m43255h().mo33434c().mo33514e() == C9278b.BUG) {
                i = C13959t.f40977y2;
                k[116] = true;
            } else {
                i = C13959t.f40973x2;
                k[117] = true;
            }
            String d = m43554d(i);
            k[118] = true;
            C9331e a = C9331e.m43685a(e, f, d);
            k[119] = true;
            m43550a(i2, a, str, false);
            k[120] = true;
        }
        k[121] = true;
    }

    /* renamed from: b */
    public int mo33662b(int i) {
        boolean[] k = m43556k();
        if (i == 161) {
            k[173] = true;
            return C13959t.f40973x2;
        } else if (i == 167) {
            k[172] = true;
            return C13959t.f40780D2;
        } else if (i != 169) {
            k[171] = true;
            return C13959t.f40977y2;
        } else {
            k[174] = true;
            return C13959t.f40788F2;
        }
    }

    /* renamed from: c */
    public void mo33663c() {
        boolean[] k = m43556k();
        InstabugSDKLogger.m46626v(this, "startBugReporter");
        k[78] = true;
        if (C9254f.m43255h().mo33434c() == null) {
            k[79] = true;
            return;
        }
        C9254f.m43255h().mo33434c().mo33501a(C9278b.BUG);
        k[80] = true;
        String d = C9254f.m43255h().mo33434c().mo33511d();
        k[81] = true;
        if (C9254f.m43255h().mo33434c().mo33527l()) {
            k[82] = true;
        } else if (d == null) {
            k[83] = true;
        } else {
            k[84] = true;
            C9254f.m43255h().mo33434c().mo33498a(Uri.parse(d), Type.MAIN_SCREENSHOT);
            k[85] = true;
        }
        m43551a(false, C9231R.C9235id.instabug_fragment_container);
        int i = C9231R.C9235id.instabug_fragment_container;
        C9278b bVar = C9278b.BUG;
        k[86] = true;
        String f = C9254f.m43255h().mo33434c().mo33517f();
        k[87] = true;
        String d2 = m43554d(C13959t.f40977y2);
        k[88] = true;
        C9331e a = C9331e.m43685a(bVar, f, d2);
        k[89] = true;
        m43552b(i, a, "feedback", false);
        k[90] = true;
        ((C9366h) this.presenter).mo33805d();
        k[91] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: d */
    public void mo33664d() {
        boolean[] k = m43556k();
        if (getSupportFragmentManager().mo6238c() >= 1) {
            k[56] = true;
        } else {
            k[57] = true;
            C9254f.m43255h().mo33429a(DismissType.CANCEL);
            k[58] = true;
            InstabugSDKLogger.m46622d(this, "Reporting bug canceled. Deleting attachments");
            k[59] = true;
            C9840b cache = CacheManager.getInstance().getCache(CacheManager.DEFAULT_IN_MEMORY_CACHE_KEY);
            if (cache == null) {
                k[60] = true;
            } else {
                k[61] = true;
                cache.delete("video.path");
                k[62] = true;
            }
            VideoProcessingServiceEventBus.getInstance().post(Action.STOP);
            k[63] = true;
            C9253e.m43238a();
            k[64] = true;
        }
        if (Instabug.getState() == InstabugState.TAKING_SCREENSHOT_FOR_CHAT) {
            k[65] = true;
        } else {
            k[66] = true;
            if (Instabug.getState() != InstabugState.IMPORTING_IMAGE_FROM_GALLERY_FOR_CHAT) {
                k[67] = true;
                m43551a(false, C9231R.C9235id.instabug_fragment_container);
                k[73] = true;
            }
            k[68] = true;
        }
        k[69] = true;
        if (!(getSupportFragmentManager().mo6221a(C9231R.C9235id.instabug_fragment_container) instanceof C9315i)) {
            k[70] = true;
        } else {
            k[71] = true;
            Instabug.setState(InstabugState.ENABLED);
            k[72] = true;
        }
        m43551a(false, C9231R.C9235id.instabug_fragment_container);
        k[73] = true;
    }

    /* renamed from: e */
    public void mo33665e() {
        boolean[] k = m43556k();
        InstabugSDKLogger.m46626v(this, "startFeedbackSender");
        k[92] = true;
        if (C9254f.m43255h().mo33434c() == null) {
            k[93] = true;
            return;
        }
        C9254f.m43255h().mo33434c().mo33501a(C9278b.FEEDBACK);
        k[94] = true;
        String d = C9254f.m43255h().mo33434c().mo33511d();
        k[95] = true;
        if (C9254f.m43255h().mo33434c().mo33527l()) {
            k[96] = true;
        } else if (d == null) {
            k[97] = true;
        } else {
            k[98] = true;
            C9254f.m43255h().mo33434c().mo33498a(Uri.parse(d), Type.MAIN_SCREENSHOT);
            k[99] = true;
        }
        m43551a(false, C9231R.C9235id.instabug_fragment_container);
        int i = C9231R.C9235id.instabug_fragment_container;
        C9278b bVar = C9278b.FEEDBACK;
        k[100] = true;
        String f = C9254f.m43255h().mo33434c().mo33517f();
        k[101] = true;
        String d2 = m43554d(C13959t.f40973x2);
        k[102] = true;
        C9331e a = C9331e.m43685a(bVar, f, d2);
        k[103] = true;
        m43550a(i, a, "feedback", false);
        k[104] = true;
        ((C9366h) this.presenter).mo33805d();
        k[105] = true;
    }

    /* renamed from: f */
    public void mo33666f() {
        int i;
        boolean[] k = m43556k();
        InstabugSDKLogger.m46626v(this, "startWithHangingBug");
        k[123] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("bug attachment size): ");
        k[124] = true;
        sb.append(C9254f.m43255h().mo33434c().mo33519g().size());
        String sb2 = sb.toString();
        k[125] = true;
        InstabugSDKLogger.m46626v(this, sb2);
        k[126] = true;
        C9254f.m43255h().mo33431a(false);
        k[127] = true;
        String str = "feedback";
        if (getSupportFragmentManager().mo6223a(str) != null) {
            k[128] = true;
        } else {
            k[129] = true;
            m43551a(false, C9231R.C9235id.instabug_fragment_container);
            int i2 = C9231R.C9235id.instabug_fragment_container;
            k[130] = true;
            C9278b e = C9254f.m43255h().mo33434c().mo33514e();
            k[131] = true;
            String f = C9254f.m43255h().mo33434c().mo33517f();
            k[132] = true;
            if (C9254f.m43255h().mo33434c().mo33514e() == C9278b.BUG) {
                i = C13959t.f40977y2;
                k[133] = true;
            } else {
                i = C13959t.f40973x2;
                k[134] = true;
            }
            String d = m43554d(i);
            k[135] = true;
            C9331e a = C9331e.m43685a(e, f, d);
            k[136] = true;
            m43552b(i2, a, str, false);
            k[137] = true;
        }
        C9254f.m43255h().mo33433b((Context) this);
        k[138] = true;
        ((C9366h) this.presenter).mo33805d();
        k[139] = true;
    }

    public void finish() {
        boolean[] k = m43556k();
        super.finish();
        k[54] = true;
        overridePendingTransition(17432576, 17432577);
        k[55] = true;
    }

    /* renamed from: g */
    public void mo33668g() {
        boolean[] k = m43556k();
        C9840b cache = CacheManager.getInstance().getCache(CacheManager.DEFAULT_IN_MEMORY_CACHE_KEY);
        if (cache == null) {
            k[167] = true;
        } else {
            k[168] = true;
            cache.delete("video.path");
            k[169] = true;
        }
        finish();
        k[170] = true;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] k = m43556k();
        int i = C9231R.layout.ib_bug_activity_bug_reporting;
        k[41] = true;
        return i;
    }

    /* renamed from: h */
    public void mo33670h() {
        boolean[] k = m43556k();
        if (LocaleUtils.isRTL(Instabug.getLocale(this))) {
            Toolbar toolbar = this.toolbar;
            int i = C9231R.C9234drawable.instabug_ic_back;
            k[195] = true;
            Drawable rotateDrawable = DrawableUtils.getRotateDrawable(C0841b.m4928c(this, i), 180.0f);
            k[196] = true;
            toolbar.setNavigationIcon(rotateDrawable);
            k[197] = true;
        } else {
            this.toolbar.setNavigationIcon(C9231R.C9234drawable.instabug_ic_back);
            k[198] = true;
        }
        k[199] = true;
    }

    /* renamed from: i */
    public void mo33671i() {
        boolean[] k = m43556k();
        this.toolbar.setNavigationIcon(C9231R.C9234drawable.instabug_ic_close);
        k[200] = true;
    }

    /* access modifiers changed from: protected */
    public void initContentViews() {
        boolean[] k = m43556k();
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            k[37] = true;
            this.toolbar.setBackgroundColor(Instabug.getPrimaryColor());
            k[38] = true;
        } else {
            this.toolbar.setBackgroundColor(C0841b.m4915a((Context) this, C9231R.C9233color.instabug_attachment_bar_color_dark));
            k[39] = true;
        }
        k[40] = true;
    }

    public void onBackPressed() {
        boolean[] k = m43556k();
        if (getSupportFragmentManager().mo6238c() >= 1) {
            k[48] = true;
            overridePendingTransition(17432576, 17432577);
            k[49] = true;
            super.onBackPressed();
            k[50] = true;
        } else {
            KeyboardUtils.hide(this);
            k[51] = true;
            m43558m();
            k[52] = true;
        }
        k[53] = true;
    }

    public void onClick(View view) {
        boolean[] k = m43556k();
        StringBuilder sb = new StringBuilder();
        sb.append("onClick: ");
        sb.append(view.getId());
        InstabugSDKLogger.m46622d(this, sb.toString());
        k[42] = true;
        ArrayList arrayList = new ArrayList(getSupportFragmentManager().mo6240e());
        k[43] = true;
        ArrayList arrayList2 = new ArrayList();
        k[44] = true;
        arrayList2.add(null);
        k[45] = true;
        arrayList.removeAll(arrayList2);
        k[46] = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dark space clicked, fragments size is ");
        sb2.append(arrayList.size());
        sb2.append(" fragments are ");
        sb2.append(arrayList);
        InstabugSDKLogger.m46626v(this, sb2.toString());
        k[47] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] k = m43556k();
        overridePendingTransition(17432576, 17432577);
        k[8] = true;
        super.onCreate(bundle);
        k[9] = true;
        StatusBarUtils.darkenStatusBarColor(this, Instabug.getPrimaryColor());
        k[10] = true;
        setTheme(C9252b.m43236a(Instabug.getTheme()));
        k[11] = true;
        getSupportFragmentManager().mo6230a((C1385c) this);
        k[12] = true;
        this.presenter = new C9366h(this);
        k[13] = true;
        int intExtra = getIntent().getIntExtra("com.instabug.library.process", C13959t.f40977y2);
        if (bundle != null) {
            k[14] = true;
        } else {
            k[15] = true;
            ((C9366h) this.presenter).mo33804b(mo33662b(intExtra));
            k[16] = true;
        }
        getWindow().setSoftInputMode(3);
        k[17] = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        boolean[] k = m43556k();
        if (C9254f.m43255h().mo33437e()) {
            k[30] = true;
        } else {
            k[31] = true;
            if (C9254f.m43255h().mo33436d() != DismissType.ADD_ATTACHMENT) {
                k[32] = true;
            } else {
                k[33] = true;
                C9254f.m43255h().mo33429a(DismissType.CANCEL);
                k[34] = true;
            }
        }
        OrientationUtils.unlockOrientation(this);
        k[35] = true;
        super.onDestroy();
        k[36] = true;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        boolean[] k = m43556k();
        super.onNewIntent(intent);
        k[1] = true;
        this.presenter = new C9366h(this);
        k[2] = true;
        if (C9327f.m43668a(intent.getData())) {
            k[3] = true;
            m43557l();
            k[4] = true;
        } else {
            int intExtra = intent.getIntExtra("com.instabug.library.process", C13959t.f40977y2);
            k[5] = true;
            ((C9366h) this.presenter).mo33804b(mo33662b(intExtra));
            k[6] = true;
        }
        k[7] = true;
    }

    public void onStart() {
        boolean[] k = m43556k();
        super.onStart();
        k[18] = true;
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (bugPlugin == null) {
            k[19] = true;
        } else {
            k[20] = true;
            bugPlugin.setState(1);
            k[21] = true;
        }
        InstabugSDKLogger.m46622d(this, "onStart(),  SDK Invoking State Changed: true");
        k[22] = true;
    }

    public void onStop() {
        boolean[] k = m43556k();
        super.onStop();
        k[23] = true;
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        k[24] = true;
        if (bugPlugin == null) {
            k[25] = true;
        } else if (bugPlugin.getState() == 2) {
            k[26] = true;
        } else {
            k[27] = true;
            bugPlugin.setState(0);
            k[28] = true;
        }
        InstabugSDKLogger.m46622d(this, "onPause(),  SDK Invoking State Changed: false");
        k[29] = true;
    }

    /* renamed from: z */
    public void mo6261z() {
        boolean[] k = m43556k();
        StringBuilder sb = new StringBuilder();
        sb.append("Back stack changed, back stack size: ");
        k[74] = true;
        sb.append(getSupportFragmentManager().mo6238c());
        String sb2 = sb.toString();
        k[75] = true;
        InstabugSDKLogger.m46626v(this, sb2);
        k[76] = true;
        m43551a(true, C9231R.C9235id.instabug_fragment_container);
        k[77] = true;
    }

    /* renamed from: b */
    private void m43552b(@C0225w int i, Fragment fragment, @C0195i0 String str, boolean z) {
        boolean[] k = m43556k();
        C1382h supportFragmentManager = getSupportFragmentManager();
        k[180] = true;
        C1406n a = supportFragmentManager.mo6224a().mo6395a(i, fragment, str);
        if (!z) {
            k[181] = true;
        } else {
            k[182] = true;
            a.mo6401a(str);
            k[183] = true;
        }
        a.mo6097e();
        k[184] = true;
    }

    /* renamed from: b */
    private void m43553b(C9322c cVar) {
        boolean[] k = m43556k();
        m43551a(false, C9700R.C9704id.instabug_fragment_container);
        int i = C9700R.C9704id.instabug_fragment_container;
        k[191] = true;
        C9323d a = C9323d.m43658a(cVar);
        k[192] = true;
        m43552b(i, a, "disclaimer_details", true);
        k[193] = true;
    }

    /* renamed from: d */
    private String m43554d(int i) {
        boolean[] k = m43556k();
        if (i == 161) {
            Key key = Key.COMMENT_FIELD_HINT_FOR_FEEDBACK;
            int i2 = C9231R.string.instabug_str_feedback_comment_hint;
            k[154] = true;
            String string = getString(i2);
            k[155] = true;
            String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
            k[156] = true;
            return placeHolder;
        }
        Key key2 = Key.COMMENT_FIELD_HINT_FOR_BUG_REPORT;
        int i3 = C9231R.string.instabug_str_bug_comment_hint;
        k[157] = true;
        String string2 = getString(i3);
        k[158] = true;
        String placeHolder2 = PlaceHolderUtils.getPlaceHolder(key2, string2);
        k[159] = true;
        return placeHolder2;
    }

    /* renamed from: a */
    public void mo33658a(float f, float f2) {
        boolean[] k = m43556k();
        Intent intent = getIntent();
        String str = InstabugDialogActivity.KEY_SCREENSHOT_URI;
        if (intent.getParcelableExtra(str) == null) {
            k[140] = true;
        } else if (!this.f24611a) {
            k[141] = true;
        } else {
            this.f24611a = false;
            k[142] = true;
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().getRootView();
            k[143] = true;
            ImageView imageView = new ImageView(this);
            k[144] = true;
            imageView.setBackgroundColor(C0841b.m4915a((Context) this, 17170443));
            k[145] = true;
            viewGroup.addView(imageView, new LayoutParams(-1, -1));
            k[146] = true;
            BitmapUtils.loadBitmap(((Uri) getIntent().getParcelableExtra(str)).getPath(), imageView, new C9295b(this, f, f2, imageView));
            k[147] = true;
            getIntent().putExtra(str, null);
            k[148] = true;
        }
        k[149] = true;
    }

    /* renamed from: a */
    private void m43551a(boolean z, int i) {
        boolean[] k = m43556k();
        if (!(getSupportFragmentManager().mo6221a(i) instanceof FragmentVisibilityChangedListener)) {
            k[150] = true;
        } else {
            k[151] = true;
            ((FragmentVisibilityChangedListener) getSupportFragmentManager().mo6221a(i)).onVisibilityChanged(z);
            k[152] = true;
        }
        k[153] = true;
    }

    /* renamed from: a */
    public void mo33661a(boolean z) {
        int i;
        boolean[] k = m43556k();
        View findViewById = findViewById(C9231R.C9235id.instabug_pbi_footer);
        if (z) {
            i = 0;
            k[160] = true;
        } else {
            i = 8;
            k[161] = true;
        }
        findViewById.setVisibility(i);
        k[162] = true;
        findViewById(C9231R.C9235id.instabug_pbi_footer).setBackgroundColor(AttrResolver.getColor(getViewContext(), C9231R.attr.ib_bug_color_bg_pbi));
        k[163] = true;
        ImageView imageView = (ImageView) findViewById(C9700R.C9704id.image_instabug_logo);
        k[164] = true;
        imageView.setColorFilter(AttrResolver.resolveAttributeColor(getViewContext(), C9231R.attr.instabug_foreground_color), Mode.SRC_ATOP);
        k[165] = true;
        imageView.setImageResource(C9700R.C9703drawable.ic_instabug_logo);
        k[166] = true;
    }

    /* renamed from: a */
    private void m43550a(@C0225w int i, Fragment fragment, @C0195i0 String str, boolean z) {
        boolean[] k = m43556k();
        C1382h supportFragmentManager = getSupportFragmentManager();
        k[175] = true;
        C1406n b = supportFragmentManager.mo6224a().mo6406b(i, fragment, str);
        if (!z) {
            k[176] = true;
        } else {
            k[177] = true;
            b.mo6401a(str);
            k[178] = true;
        }
        b.mo6097e();
        k[179] = true;
    }

    /* renamed from: a */
    public void mo33660a(C9322c cVar) {
        boolean[] k = m43556k();
        m43553b(cVar);
        k[194] = true;
    }
}
