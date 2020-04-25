package com.instabug.bug.view;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C5662e;
import com.instabug.bug.C9231R;
import com.instabug.bug.C9254f;
import com.instabug.bug.extendedbugreport.ExtendedBugReport;
import com.instabug.bug.extendedbugreport.ExtendedBugReport.State;
import com.instabug.bug.model.Bug;
import com.instabug.bug.model.C9277a;
import com.instabug.bug.model.C9278b;
import com.instabug.bug.p355b.C9246b;
import com.instabug.bug.settings.C9291a;
import com.instabug.bug.view.C9303b.C9309e;
import com.instabug.bug.view.C9303b.C9315i;
import com.instabug.bug.view.C9357f.C9358a;
import com.instabug.bug.view.C9357f.C9359b;
import com.instabug.library.Feature;
import com.instabug.library.FragmentVisibilityChangedListener;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.p382ui.BaseContract;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.internal.video.ScreenRecordEvent;
import com.instabug.library.internal.video.VideoPlayerFragment;
import com.instabug.library.model.Attachment;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.SimpleTextWatcher;
import com.instabug.library.util.SystemServiceUtils;
import com.instabug.library.view.ViewUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import org.jcodec.containers.mps.MPSUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p072g.p073b.C2128a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.bug.view.e */
/* compiled from: BugReportingFragment */
public class C9331e extends C9792a<C9358a> implements OnClickListener, C9309e, C9359b {

    /* renamed from: g0 */
    private static int f24712g0 = -1;

    /* renamed from: h0 */
    private static transient /* synthetic */ boolean[] f24713h0;

    /* renamed from: N */
    private TextView f24714N;

    /* renamed from: O */
    private RecyclerView f24715O;
    @C0224v0

    /* renamed from: P */
    ScrollView f24716P;

    /* renamed from: Q */
    private String f24717Q;

    /* renamed from: R */
    private String f24718R;

    /* renamed from: S */
    private C9278b f24719S;

    /* renamed from: T */
    private boolean f24720T;

    /* renamed from: U */
    private BroadcastReceiver f24721U;

    /* renamed from: V */
    private ProgressDialog f24722V;

    /* renamed from: W */
    private C9303b f24723W;

    /* renamed from: X */
    private C12314c f24724X;

    /* renamed from: Y */
    private C9347o f24725Y;

    /* renamed from: Z */
    private BottomSheetBehavior f24726Z;

    /* renamed from: a */
    private EditText f24727a;

    /* renamed from: a0 */
    private ImageView f24728a0;

    /* renamed from: b */
    private EditText f24729b;

    /* renamed from: b0 */
    private int f24730b0 = 0;

    /* renamed from: c0 */
    private boolean f24731c0 = false;

    /* renamed from: d0 */
    private boolean f24732d0 = false;

    /* renamed from: e0 */
    private long f24733e0 = 0;

    /* renamed from: f0 */
    OnGlobalLayoutListener f24734f0;

    /* renamed from: com.instabug.bug.view.e$a */
    /* compiled from: BugReportingFragment */
    class C9332a extends C5662e {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24735b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24736a;

        C9332a(C9331e eVar) {
            boolean[] a = m43745a();
            this.f24736a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43745a() {
            boolean[] zArr = f24735b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8112590383102714554L, "com/instabug/bug/view/BugReportingFragment$5", 15);
            f24735b = a;
            return a;
        }

        /* renamed from: a */
        public void mo22487a(@C0193h0 View view, int i) {
            boolean[] a = m43745a();
            C9331e.m43692b(i);
            if (i == 4) {
                a[1] = true;
                C9331e eVar = this.f24736a;
                eVar.f24716P.setPadding(0, 0, 0, ViewUtils.convertDpToPx(eVar.getContext(), 0.0f));
                a[2] = true;
            } else if (i != 3) {
                a[3] = true;
            } else {
                a[4] = true;
                C9331e eVar2 = this.f24736a;
                eVar2.f24716P.setPadding(0, 0, 0, ViewUtils.convertDpToPx(eVar2.getContext(), 130.0f));
                a[5] = true;
            }
            if (i != 1) {
                a[6] = true;
            } else if (C9331e.m43703g(this.f24736a)) {
                a[7] = true;
                C9331e.m43705i(this.f24736a);
                a[10] = true;
                return;
            } else {
                a[8] = true;
            }
            if (C9331e.m43704h(this.f24736a)) {
                a[9] = true;
                C9331e.m43705i(this.f24736a);
                a[10] = true;
                return;
            }
            if (i != 4) {
                C9331e.m43706j(this.f24736a);
                a[12] = true;
            } else {
                C9331e.m43705i(this.f24736a);
                a[11] = true;
            }
            a[13] = true;
        }

        /* renamed from: a */
        public void mo22486a(@C0193h0 View view, float f) {
            boolean[] a = m43745a();
            C9331e.m43707k(this.f24736a).setRotation((1.0f - f) * 180.0f);
            a[14] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$b */
    /* compiled from: BugReportingFragment */
    class C9333b extends C5662e {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24737b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24738a;

        C9333b(C9331e eVar) {
            boolean[] a = m43748a();
            this.f24738a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43748a() {
            boolean[] zArr = f24737b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5111998970714492543L, "com/instabug/bug/view/BugReportingFragment$6", 3);
            f24737b = a;
            return a;
        }

        /* renamed from: a */
        public void mo22487a(@C0193h0 View view, int i) {
            boolean[] a = m43748a();
            C9331e.m43684a(this.f24738a).mo22474e(4);
            a[1] = true;
        }

        /* renamed from: a */
        public void mo22486a(@C0193h0 View view, float f) {
            m43748a()[2] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$c */
    /* compiled from: BugReportingFragment */
    class C9334c implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24739b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24740a;

        C9334c(C9331e eVar) {
            boolean[] a = m43751a();
            this.f24740a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43751a() {
            boolean[] zArr = f24739b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6371353577008262734L, "com/instabug/bug/view/BugReportingFragment$7", 6);
            f24739b = a;
            return a;
        }

        public void run() {
            boolean[] a = m43751a();
            if (C9331e.m43684a(this.f24740a).mo22478h() == 4) {
                a[1] = true;
                C9331e.m43696c(this.f24740a, C9231R.C9235id.instabug_add_attachment).setVisibility(8);
                a[2] = true;
                C9331e.m43684a(this.f24740a).mo22474e(3);
                a[3] = true;
            } else {
                C9331e.m43684a(this.f24740a).mo22474e(4);
                a[4] = true;
            }
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$d */
    /* compiled from: BugReportingFragment */
    class C9335d implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24741b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24742a;

        C9335d(C9331e eVar) {
            boolean[] a = m43752a();
            this.f24742a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43752a() {
            boolean[] zArr = f24741b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3018888730814746462L, "com/instabug/bug/view/BugReportingFragment$8", 3);
            f24741b = a;
            return a;
        }

        public void run() {
            boolean[] a = m43752a();
            C9331e.m43699d(this.f24742a, C9231R.C9235id.instabug_add_attachment).setVisibility(8);
            a[1] = true;
            C9331e.m43684a(this.f24742a).mo22474e(3);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$e */
    /* compiled from: BugReportingFragment */
    class C9336e implements Runnable {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24743P;

        /* renamed from: N */
        final /* synthetic */ Attachment f24744N;

        /* renamed from: O */
        final /* synthetic */ C9331e f24745O;

        /* renamed from: a */
        final /* synthetic */ int f24746a;

        /* renamed from: b */
        final /* synthetic */ View f24747b;

        C9336e(C9331e eVar, int i, View view, Attachment attachment) {
            boolean[] a = m43753a();
            this.f24745O = eVar;
            this.f24746a = i;
            this.f24747b = view;
            this.f24744N = attachment;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43753a() {
            boolean[] zArr = f24743P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3633750010696605420L, "com/instabug/bug/view/BugReportingFragment$9", 10);
            f24743P = a;
            return a;
        }

        public void run() {
            boolean[] a = m43753a();
            int i = this.f24746a;
            if (i == C9231R.C9235id.instabug_attachment_img_item) {
                a[1] = true;
                C9331e eVar = this.f24745O;
                C9331e.m43688a(eVar, this.f24747b, this.f24744N, eVar.mo33745d());
                a[2] = true;
            } else if (i == C9231R.C9235id.instabug_btn_remove_attachment) {
                a[3] = true;
                ((C9358a) C9331e.m43708l(this.f24745O)).mo33786a(this.f24744N);
                a[4] = true;
            } else if (i != C9231R.C9235id.instabug_attachment_video_item) {
                a[5] = true;
            } else {
                a[6] = true;
                C9331e.m43698c(this.f24745O, true);
                a[7] = true;
                this.f24745O.mo33737a(this.f24744N.getLocalPath());
                a[8] = true;
            }
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$f */
    /* compiled from: BugReportingFragment */
    class C9337f implements OnGlobalLayoutListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24748b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24749a;

        C9337f(C9331e eVar) {
            boolean[] a = m43754a();
            this.f24749a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43754a() {
            boolean[] zArr = f24748b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3447515221437207074L, "com/instabug/bug/view/BugReportingFragment$1", 15);
            f24748b = a;
            return a;
        }

        public void onGlobalLayout() {
            boolean[] a = m43754a();
            Rect rect = new Rect();
            a[1] = true;
            this.f24749a.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            a[2] = true;
            View decorView = this.f24749a.getActivity().getWindow().getDecorView();
            a[3] = true;
            int height = decorView.getRootView().getHeight();
            double d = (double) (height - rect.bottom);
            double d2 = (double) height;
            Double.isNaN(d2);
            if (d > d2 * 0.15d) {
                a[4] = true;
                C9331e.m43691a(this.f24749a, true);
                a[5] = true;
                C9331e.m43684a(this.f24749a).mo22474e(4);
                a[6] = true;
                C9331e.m43695b(this.f24749a, true);
                a[7] = true;
                C9331e.m43683a(this.f24749a, C9231R.C9235id.arrow_handler).setVisibility(4);
                a[8] = true;
            } else {
                C9331e.m43695b(this.f24749a, false);
                a[9] = true;
                C9331e.m43691a(this.f24749a, false);
                a[10] = true;
                if (C9331e.m43693b(this.f24749a) <= 1) {
                    a[11] = true;
                } else {
                    a[12] = true;
                    C9331e.m43694b(this.f24749a, C9231R.C9235id.arrow_handler).setVisibility(0);
                    a[13] = true;
                }
            }
            a[14] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$g */
    /* compiled from: BugReportingFragment */
    class C9338g implements DialogInterface.OnClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24750b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24751a;

        C9338g(C9331e eVar) {
            boolean[] a = m43755a();
            this.f24751a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43755a() {
            boolean[] zArr = f24750b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2323167137262737865L, "com/instabug/bug/view/BugReportingFragment$10", 2);
            f24750b = a;
            return a;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            m43755a()[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$h */
    /* compiled from: BugReportingFragment */
    class C9339h implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24752b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24753a;

        C9339h(C9331e eVar) {
            boolean[] a = m43756a();
            this.f24753a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43756a() {
            boolean[] zArr = f24752b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(146988079324045015L, "com/instabug/bug/view/BugReportingFragment$11", 10);
            f24752b = a;
            return a;
        }

        public void run() {
            boolean[] a = m43756a();
            View c = C9331e.m43710n(this.f24753a).getLayoutManager().mo6989c(C9331e.m43709m(this.f24753a).mo7325b() - 1);
            a[1] = true;
            if (c == null) {
                a[2] = true;
            } else if (this.f24753a.getActivity() == null) {
                a[3] = true;
            } else {
                a[4] = true;
                Rect rect = new Rect();
                a[5] = true;
                c.getGlobalVisibleRect(rect);
                a[6] = true;
                DisplayMetrics displayMetrics = DeviceStateProvider.getDisplayMetrics(this.f24753a.getActivity());
                float f = ((float) (rect.right + rect.left)) / 2.0f;
                float f2 = ((float) (rect.top + rect.bottom)) / 2.0f;
                a[7] = true;
                ((BugReportingActivity) this.f24753a.getActivity()).mo33658a(f / ((float) displayMetrics.widthPixels), f2 / ((float) displayMetrics.heightPixels));
                a[8] = true;
            }
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$i */
    /* compiled from: BugReportingFragment */
    class C9340i implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24754b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24755a;

        C9340i(C9331e eVar) {
            boolean[] a = m43757a();
            this.f24755a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43757a() {
            boolean[] zArr = f24754b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4247093237944121232L, "com/instabug/bug/view/BugReportingFragment$12", 8);
            f24754b = a;
            return a;
        }

        public void run() {
            boolean[] a = m43757a();
            if (C9291a.m43476r().mo33618k()) {
                a[1] = true;
                C9367i d = C9367i.m43855d();
                a[2] = true;
                d.show(this.f24755a.getFragmentManager(), "Instabug-Thanks-Fragment");
                a[3] = true;
            } else if (C9331e.m43712o(this.f24755a) == null) {
                a[4] = true;
            } else {
                a[5] = true;
                C9331e.m43712o(this.f24755a).mo33668g();
                a[6] = true;
            }
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$j */
    /* compiled from: BugReportingFragment */
    class C9341j extends BroadcastReceiver {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24756b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24757a;

        C9341j(C9331e eVar) {
            boolean[] a = m43758a();
            this.f24757a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43758a() {
            boolean[] zArr = f24756b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3580794033734069949L, "com/instabug/bug/view/BugReportingFragment$13", 6);
            f24756b = a;
            return a;
        }

        public void onReceive(Context context, Intent intent) {
            boolean[] a = m43758a();
            InstabugSDKLogger.m46625i(this, "Refreshing Attachments");
            a[1] = true;
            if (this.f24757a.getActivity() == null) {
                a[2] = true;
            } else {
                a[3] = true;
                ((C9358a) C9331e.m43714p(this.f24757a)).mo33793e();
                a[4] = true;
            }
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$k */
    /* compiled from: BugReportingFragment */
    class C9342k implements C12331g<ScreenRecordEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24758b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24759a;

        /* renamed from: com.instabug.bug.view.e$k$a */
        /* compiled from: BugReportingFragment */
        class C9343a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24760N;

            /* renamed from: a */
            final /* synthetic */ ScreenRecordEvent f24761a;

            /* renamed from: b */
            final /* synthetic */ C9342k f24762b;

            C9343a(C9342k kVar, ScreenRecordEvent screenRecordEvent) {
                boolean[] a = m43762a();
                this.f24762b = kVar;
                this.f24761a = screenRecordEvent;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43762a() {
                boolean[] zArr = f24760N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6611133143067395805L, "com/instabug/bug/view/BugReportingFragment$14$1", 7);
                f24760N = a;
                return a;
            }

            public void run() {
                boolean[] a = m43762a();
                if (this.f24761a.getStatus() == 1) {
                    a[1] = true;
                    C9331e.m43689a(this.f24762b.f24759a, this.f24761a);
                    a[2] = true;
                } else if (this.f24761a.getStatus() != 2) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    C9331e.m43716q(this.f24762b.f24759a);
                    a[5] = true;
                }
                a[6] = true;
            }
        }

        C9342k(C9331e eVar) {
            boolean[] a = m43759a();
            this.f24759a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43759a() {
            boolean[] zArr = f24758b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(537161899278335605L, "com/instabug/bug/view/BugReportingFragment$14", 3);
            f24758b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33765a(ScreenRecordEvent screenRecordEvent) {
            boolean[] a = m43759a();
            this.f24759a.getActivity().runOnUiThread(new C9343a(this, screenRecordEvent));
            a[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m43759a();
            mo33765a((ScreenRecordEvent) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$l */
    /* compiled from: BugReportingFragment */
    class C9344l extends SimpleTextWatcher {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24763b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24764a;

        C9344l(C9331e eVar) {
            boolean[] a = m43763a();
            this.f24764a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43763a() {
            boolean[] zArr = f24763b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6814218333328541687L, "com/instabug/bug/view/BugReportingFragment$2", 3);
            f24763b = a;
            return a;
        }

        public void afterTextChanged(Editable editable) {
            boolean[] a = m43763a();
            String obj = C9331e.m43697c(this.f24764a).getText().toString();
            a[1] = true;
            ((C9358a) C9331e.m43700d(this.f24764a)).mo33787a(obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$m */
    /* compiled from: BugReportingFragment */
    class C9345m extends SimpleTextWatcher {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24765b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24766a;

        C9345m(C9331e eVar) {
            boolean[] a = m43764a();
            this.f24766a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43764a() {
            boolean[] zArr = f24765b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1748326976929426308L, "com/instabug/bug/view/BugReportingFragment$3", 5);
            f24765b = a;
            return a;
        }

        public void afterTextChanged(Editable editable) {
            boolean[] a = m43764a();
            if (this.f24766a.getActivity() == null) {
                a[1] = true;
            } else {
                a[2] = true;
                ((C9358a) C9331e.m43702f(this.f24766a)).mo33789b(C9331e.m43701e(this.f24766a).getText().toString());
                a[3] = true;
            }
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$n */
    /* compiled from: BugReportingFragment */
    class C9346n implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24767b;

        /* renamed from: a */
        final /* synthetic */ C9331e f24768a;

        C9346n(C9331e eVar) {
            boolean[] a = m43765a();
            this.f24768a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43765a() {
            boolean[] zArr = f24767b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7722674454023650042L, "com/instabug/bug/view/BugReportingFragment$4", 2);
            f24767b = a;
            return a;
        }

        public void run() {
            boolean[] a = m43765a();
            KeyboardUtils.hide(this.f24768a.getActivity());
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$o */
    /* compiled from: BugReportingFragment */
    public interface C9347o {
        /* renamed from: g */
        void mo33668g();
    }

    /* renamed from: com.instabug.bug.view.e$p */
    /* compiled from: ExtraFieldsContract */
    class C9348p {

        /* renamed from: com.instabug.bug.view.e$p$a */
        interface C9349a extends Presenter {
        }

        /* renamed from: com.instabug.bug.view.e$p$b */
        /* compiled from: ExtraFieldsContract */
        interface C9350b extends BaseContract.View<Fragment> {
            /* renamed from: b */
            void mo33769b(int i);

            /* renamed from: d */
            void mo33770d(int i);
        }
    }

    /* renamed from: com.instabug.bug.view.e$q */
    /* compiled from: ExtraFieldsFragment */
    public class C9351q extends C9792a<C9355r> implements C9350b {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f24769P;

        /* renamed from: N */
        private long f24770N;

        /* renamed from: O */
        private boolean f24771O;
        @C0224v0

        /* renamed from: a */
        String f24772a;

        /* renamed from: b */
        List<C9277a> f24773b;

        /* renamed from: com.instabug.bug.view.e$q$a */
        /* compiled from: ExtraFieldsFragment */
        class C9352a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24774b;

            /* renamed from: a */
            final /* synthetic */ C9351q f24775a;

            C9352a(C9351q qVar) {
                boolean[] a = m43776a();
                this.f24775a = qVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43776a() {
                boolean[] zArr = f24774b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7361092563832451374L, "com/instabug/bug/view/extrafields/ExtraFieldsFragment$1", 9);
                f24774b = a;
                return a;
            }

            public void run() {
                boolean[] a = m43776a();
                if (C9291a.m43476r().mo33618k()) {
                    a[1] = true;
                    C9367i d = C9367i.m43855d();
                    a[2] = true;
                    if (this.f24775a.getFragmentManager() == null) {
                        a[3] = true;
                    } else {
                        a[4] = true;
                        d.show(this.f24775a.getFragmentManager(), "Instabug-Thanks-Fragment");
                        a[5] = true;
                    }
                    a[6] = true;
                } else {
                    this.f24775a.finishActivity();
                    a[7] = true;
                }
                a[8] = true;
            }
        }

        /* renamed from: com.instabug.bug.view.e$q$b */
        /* compiled from: ExtraFieldsFragment */
        private class C9353b extends SimpleTextWatcher {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f24776N;

            /* renamed from: a */
            private WeakReference<EditText> f24777a;

            /* renamed from: b */
            final /* synthetic */ C9351q f24778b;

            public C9353b(C9351q qVar, EditText editText) {
                boolean[] a = m43777a();
                this.f24778b = qVar;
                a[0] = true;
                this.f24777a = new WeakReference<>(editText);
                a[1] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43777a() {
                boolean[] zArr = f24776N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7820130560081565756L, "com/instabug/bug/view/extrafields/ExtraFieldsFragment$CustomTextSwitcher", 7);
                f24776N = a;
                return a;
            }

            public void afterTextChanged(Editable editable) {
                boolean[] a = m43777a();
                super.afterTextChanged(editable);
                a[2] = true;
                EditText editText = (EditText) this.f24777a.get();
                if (editText == null) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    ((C9277a) this.f24778b.f24773b.get(editText.getId())).mo33547a(editable.toString());
                    a[5] = true;
                }
                a[6] = true;
            }
        }

        /* renamed from: com.instabug.bug.view.e$q$c */
        /* compiled from: ExtraFieldsFragment */
        class C9354c extends C1635d0 {

            /* renamed from: w0 */
            private static transient /* synthetic */ boolean[] f24779w0;

            /* renamed from: s0 */
            private EditText f24780s0;

            /* renamed from: t0 */
            private TextView f24781t0;

            /* renamed from: u0 */
            private View f24782u0;

            /* renamed from: v0 */
            final /* synthetic */ C9351q f24783v0;

            public C9354c(C9351q qVar, View view) {
                boolean[] F = m43778F();
                this.f24783v0 = qVar;
                int i = 0;
                F[0] = true;
                super(view);
                if (!(view instanceof LinearLayout)) {
                    F[1] = true;
                } else {
                    LinearLayout linearLayout = (LinearLayout) view;
                    F[2] = true;
                    F[3] = true;
                    while (i < linearLayout.getChildCount()) {
                        F[5] = true;
                        View childAt = linearLayout.getChildAt(i);
                        if (childAt instanceof EditText) {
                            this.f24780s0 = (EditText) childAt;
                            F[6] = true;
                        } else if (childAt instanceof TextView) {
                            this.f24781t0 = (TextView) childAt;
                            F[7] = true;
                        } else {
                            this.f24782u0 = childAt;
                            F[8] = true;
                        }
                        i++;
                        F[9] = true;
                    }
                    F[4] = true;
                }
                F[10] = true;
            }

            /* renamed from: F */
            private static /* synthetic */ boolean[] m43778F() {
                boolean[] zArr = f24779w0;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(878206649376203818L, "com/instabug/bug/view/extrafields/ExtraFieldsFragment$InstabugEditTextViewholder", 17);
                f24779w0 = a;
                return a;
            }

            /* renamed from: D */
            public EditText mo8948D() {
                boolean[] F = m43778F();
                EditText editText = this.f24780s0;
                F[11] = true;
                return editText;
            }

            /* renamed from: E */
            public void mo33774E() {
                boolean[] F = m43778F();
                this.f24781t0.setText(null);
                F[15] = true;
                this.f24782u0.setBackgroundColor(AttrResolver.resolveAttributeColor(this.f24783v0.getContext(), C9231R.attr.instabug_seperator_color));
                F[16] = true;
            }

            /* renamed from: a */
            public void mo33775a(String str) {
                boolean[] F = m43778F();
                this.f24781t0.setText(str);
                F[13] = true;
                this.f24782u0.setBackgroundColor(C0841b.m4915a(this.f24783v0.getContext(), C9231R.C9233color.instabug_extrafield_error));
                F[14] = true;
            }
        }

        public C9351q() {
            m43771f()[0] = true;
        }

        /* renamed from: a */
        public static C9351q m43769a(String str) {
            boolean[] f = m43771f();
            Bundle bundle = new Bundle();
            f[1] = true;
            bundle.putString("title", str);
            f[2] = true;
            C9351q qVar = new C9351q();
            f[3] = true;
            qVar.setArguments(bundle);
            f[4] = true;
            return qVar;
        }

        /* renamed from: e */
        private void m43770e() {
            CharSequence charSequence;
            boolean[] f = m43771f();
            this.f24773b = ((C9355r) this.presenter).mo33781d();
            f[22] = true;
            LinearLayout linearLayout = (LinearLayout) findViewById(C9231R.C9235id.linearLayout);
            f[23] = true;
            f[24] = true;
            int i = 0;
            while (i < this.f24773b.size()) {
                f[25] = true;
                LayoutInflater from = LayoutInflater.from(getContext());
                int i2 = C9231R.layout.ib_bug_item_edittext;
                f[26] = true;
                LinearLayout linearLayout2 = (LinearLayout) from.inflate(i2, linearLayout, false);
                f[27] = true;
                linearLayout2.setId(i);
                f[28] = true;
                C9354c cVar = new C9354c(this, linearLayout2);
                f[29] = true;
                EditText D = cVar.mo8948D();
                if (((C9277a) this.f24773b.get(i)).mo33551e()) {
                    StringBuilder sb = new StringBuilder();
                    List<C9277a> list = this.f24773b;
                    f[30] = true;
                    sb.append(((C9277a) list.get(i)).mo33549c());
                    sb.append(" *");
                    charSequence = String.valueOf(sb.toString());
                    f[31] = true;
                } else {
                    List<C9277a> list2 = this.f24773b;
                    f[32] = true;
                    charSequence = ((C9277a) list2.get(i)).mo33549c();
                    f[33] = true;
                }
                D.setHint(charSequence);
                f[34] = true;
                cVar.mo8948D().setText(((C9277a) this.f24773b.get(i)).mo33548b());
                f[35] = true;
                cVar.mo8948D().setId(i);
                f[36] = true;
                EditText D2 = cVar.mo8948D();
                f[37] = true;
                C9353b bVar = new C9353b(this, cVar.mo8948D());
                f[38] = true;
                D2.addTextChangedListener(bVar);
                f[39] = true;
                cVar.mo8948D().setImeOptions(6);
                f[40] = true;
                linearLayout.addView(linearLayout2);
                i++;
                f[41] = true;
            }
            f[42] = true;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m43771f() {
            boolean[] zArr = f24769P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7540662538029351977L, "com/instabug/bug/view/extrafields/ExtraFieldsFragment", 78);
            f24769P = a;
            return a;
        }

        /* renamed from: b */
        public void mo33769b(int i) {
            boolean[] f = m43771f();
            C9354c cVar = new C9354c(this, findViewById(i));
            f[43] = true;
            cVar.mo33774E();
            f[44] = true;
        }

        /* renamed from: c */
        public void mo33771c() {
            boolean[] f = m43771f();
            KeyboardUtils.hide(getActivity());
            f[45] = true;
            new Handler().postDelayed(new C9352a(this), 200);
            f[46] = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo33772d() {
            boolean[] f = m43771f();
            if (!((C9355r) this.presenter).mo33780c()) {
                f[18] = true;
                return;
            }
            ((C9355r) this.presenter).mo33777a(this.f24773b);
            this.f24771O = true;
            f[19] = true;
            C9254f.m43255h().mo33435c(getContext());
            f[20] = true;
            mo33771c();
            f[21] = true;
        }

        /* access modifiers changed from: protected */
        public int getLayout() {
            boolean[] f = m43771f();
            int i = C9231R.layout.ib_bug_lyt_extra_fields;
            f[12] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public void initViews(View view, Bundle bundle) {
            boolean[] f = m43771f();
            if (!(getActivity() instanceof BugReportingActivity)) {
                f[13] = true;
            } else {
                f[14] = true;
                ((BugReportingActivity) getActivity()).mo33670h();
                f[15] = true;
            }
            m43770e();
            f[16] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] f = m43771f();
            super.onCreate(bundle);
            f[5] = true;
            setHasOptionsMenu(true);
            f[6] = true;
            if (getActivity() == null) {
                f[7] = true;
            } else {
                f[8] = true;
                getActivity().getWindow().setSoftInputMode(2);
                f[9] = true;
            }
            this.f24772a = getArguments().getString("title");
            f[10] = true;
            this.presenter = new C9355r(this);
            f[11] = true;
        }

        public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
            boolean[] f = m43771f();
            MenuItem findItem = menu.findItem(C9231R.C9235id.instabug_bugreporting_send);
            if (findItem == null) {
                f[53] = true;
            } else {
                f[54] = true;
                findItem.setVisible(true);
                f[55] = true;
            }
            MenuItem findItem2 = menu.findItem(C9231R.C9235id.instabug_bugreporting_next);
            if (findItem2 == null) {
                f[56] = true;
            } else {
                f[57] = true;
                findItem2.setVisible(false);
                f[58] = true;
            }
            if (!LocaleUtils.isRTL(Instabug.getLocale(getContext()))) {
                f[59] = true;
            } else {
                f[60] = true;
                MenuItem findItem3 = menu.findItem(C9231R.C9235id.instabug_bugreporting_send);
                int i = C9231R.C9235id.instabug_bugreporting_send;
                f[61] = true;
                Drawable rotateDrawable = DrawableUtils.getRotateDrawable(menu.findItem(i).getIcon(), 180.0f);
                f[62] = true;
                findItem3.setIcon(rotateDrawable);
                f[63] = true;
            }
            f[64] = true;
        }

        public void onDestroy() {
            boolean[] f = m43771f();
            super.onDestroy();
            f[65] = true;
            ((BugReportingActivity) getActivity()).mo33671i();
            f[66] = true;
        }

        public boolean onOptionsItemSelected(MenuItem menuItem) {
            boolean[] f = m43771f();
            if (this.f24771O) {
                f[67] = true;
                return false;
            } else if (SystemClock.elapsedRealtime() - this.f24770N < 1000) {
                f[68] = true;
                return false;
            } else {
                this.f24770N = SystemClock.elapsedRealtime();
                f[69] = true;
                if (menuItem.getItemId() == C9231R.C9235id.instabug_bugreporting_send) {
                    f[70] = true;
                    mo33772d();
                    f[71] = true;
                    return true;
                }
                if (menuItem.getItemId() != 16908332) {
                    f[72] = true;
                } else {
                    f[73] = true;
                    if (getActivity() == null) {
                        f[74] = true;
                    } else {
                        f[75] = true;
                        getActivity().onBackPressed();
                        f[76] = true;
                    }
                }
                f[77] = true;
                return false;
            }
        }

        /* renamed from: d */
        public void mo33770d(int i) {
            boolean[] f = m43771f();
            C9277a aVar = (C9277a) this.f24773b.get(i);
            int i2 = C9231R.string.instabug_err_invalid_extra_field;
            f[47] = true;
            Object[] objArr = {aVar.mo33549c()};
            f[48] = true;
            String string = getString(i2, objArr);
            f[49] = true;
            C9354c cVar = new C9354c(this, findViewById(i));
            f[50] = true;
            cVar.mo8948D().requestFocus();
            f[51] = true;
            cVar.mo33775a(string);
            f[52] = true;
        }
    }

    /* renamed from: com.instabug.bug.view.e$r */
    /* compiled from: ExtraFieldsPresenter */
    class C9355r extends BasePresenter<C9350b> implements C9349a {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24784a;

        /* renamed from: com.instabug.bug.view.e$r$a */
        /* compiled from: ExtraFieldsPresenter */
        static /* synthetic */ class C9356a {

            /* renamed from: a */
            static final /* synthetic */ int[] f24785a = new int[State.values().length];

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f24786b;

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
                    boolean[] r0 = m43791a()
                    com.instabug.bug.extendedbugreport.ExtendedBugReport$State[] r1 = com.instabug.bug.extendedbugreport.ExtendedBugReport.State.values()
                    int r1 = r1.length
                    int[] r1 = new int[r1]
                    f24785a = r1
                    r1 = 0
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                    int[] r1 = f24785a     // Catch:{ NoSuchFieldError -> 0x0020 }
                    com.instabug.bug.extendedbugreport.ExtendedBugReport$State r5 = com.instabug.bug.extendedbugreport.ExtendedBugReport.State.ENABLED_WITH_OPTIONAL_FIELDS     // Catch:{ NoSuchFieldError -> 0x0020 }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                    r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                    r0[r4] = r4
                    goto L_0x0022
                L_0x0020:
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
                L_0x0022:
                    int[] r1 = f24785a     // Catch:{ NoSuchFieldError -> 0x002f }
                    com.instabug.bug.extendedbugreport.ExtendedBugReport$State r5 = com.instabug.bug.extendedbugreport.ExtendedBugReport.State.ENABLED_WITH_REQUIRED_FIELDS     // Catch:{ NoSuchFieldError -> 0x002f }
                    int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                    r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                    r0[r2] = r4
                    goto L_0x0032
                L_0x002f:
                    r1 = 4
                    r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
                L_0x0032:
                    int[] r1 = f24785a     // Catch:{ NoSuchFieldError -> 0x0040 }
                    com.instabug.bug.extendedbugreport.ExtendedBugReport$State r3 = com.instabug.bug.extendedbugreport.ExtendedBugReport.State.DISABLED     // Catch:{ NoSuchFieldError -> 0x0040 }
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
                throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.C9331e.C9355r.C9356a.<clinit>():void");
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m43791a() {
                boolean[] zArr = f24786b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(2130122028324694494L, "com/instabug/bug/view/extrafields/ExtraFieldsPresenter$1", 8);
                f24786b = a;
                return a;
            }
        }

        C9355r(C9350b bVar) {
            boolean[] f = m43783f();
            super(bVar);
            f[0] = true;
        }

        /* renamed from: e */
        private void m43782e() {
            boolean[] f = m43783f();
            List<C9277a> n = C9291a.m43476r().mo33621n();
            f[41] = true;
            f[42] = true;
            for (C9277a aVar : n) {
                f[43] = true;
                aVar.mo33547a(null);
                f[44] = true;
            }
            f[45] = true;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m43783f() {
            boolean[] zArr = f24784a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-190745483903067540L, "com/instabug/bug/view/extrafields/ExtraFieldsPresenter", 87);
            f24784a = a;
            return a;
        }

        /* renamed from: a */
        public void mo33777a(List<C9277a> list) {
            boolean[] f = m43783f();
            State p = C9291a.m43476r().mo33623p();
            if (p == State.ENABLED_WITH_OPTIONAL_FIELDS) {
                f[11] = true;
            } else if (p == State.ENABLED_WITH_REQUIRED_FIELDS) {
                f[12] = true;
            } else {
                mo33779c(list);
                f[14] = true;
                f[15] = true;
            }
            mo33778b(list);
            f[13] = true;
            f[15] = true;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: b */
        public void mo33778b(List<C9277a> list) {
            boolean[] f = m43783f();
            String f2 = C9254f.m43255h().mo33434c().mo33517f();
            f[16] = true;
            JSONArray a = mo33776a(f2, list);
            f[17] = true;
            C9254f.m43255h().mo33434c().mo33513e(a.toString());
            f[18] = true;
            m43782e();
            f[19] = true;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: c */
        public void mo33779c(List<C9277a> list) {
            boolean[] f = m43783f();
            String f2 = C9254f.m43255h().mo33434c().mo33517f();
            f[46] = true;
            StringBuilder sb = new StringBuilder();
            if (f2 == null) {
                f[47] = true;
            } else {
                f[48] = true;
                sb.append(f2);
                f[49] = true;
            }
            f[50] = true;
            for (C9277a aVar : list) {
                f[51] = true;
                String str = "\n";
                if (sb.length() <= 0) {
                    f[52] = true;
                } else {
                    f[53] = true;
                    sb.append(str);
                    f[54] = true;
                }
                sb.append(aVar.mo33549c());
                f[55] = true;
                sb.append(":");
                f[56] = true;
                sb.append(str);
                f[57] = true;
                sb.append(aVar.mo33548b());
                f[58] = true;
            }
            C9254f.m43255h().mo33434c().mo33513e(sb.toString());
            f[59] = true;
            m43782e();
            f[60] = true;
        }

        /* renamed from: d */
        public List<C9277a> mo33781d() {
            boolean[] f = m43783f();
            Bug c = C9254f.m43255h().mo33434c();
            f[1] = true;
            List<C9277a> o = c.mo33530o();
            if (o != null) {
                f[2] = true;
                return o;
            }
            State p = C9291a.m43476r().mo33623p();
            f[3] = true;
            int i = C9356a.f24785a[p.ordinal()];
            if (i == 1 || i == 2) {
                C9350b bVar = (C9350b) this.view.get();
                if (bVar == null) {
                    f[4] = true;
                } else {
                    f[5] = true;
                    Fragment fragment = (Fragment) bVar.getViewContext();
                    f[6] = true;
                    Context context = fragment.getContext();
                    f[7] = true;
                    o = ExtendedBugReport.getFields(context, p);
                    f[8] = true;
                }
            } else {
                o = C9291a.m43476r().mo33621n();
                f[9] = true;
            }
            C9254f.m43255h().mo33434c().mo33509b(o);
            f[10] = true;
            return o;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: a */
        public JSONArray mo33776a(String str, List<C9277a> list) {
            String str2;
            String str3 = "value";
            String str4 = "name";
            String str5 = "id";
            boolean[] f = m43783f();
            JSONArray jSONArray = new JSONArray();
            try {
                f[20] = true;
                JSONObject jSONObject = new JSONObject();
                f[21] = true;
                jSONObject.put(str5, "description");
                f[22] = true;
                jSONObject.put(str4, "Description");
                f[23] = true;
                String str6 = "";
                if (str != null) {
                    f[24] = true;
                } else {
                    f[25] = true;
                    str = str6;
                }
                jSONObject.put(str3, str);
                f[26] = true;
                jSONArray.put(jSONObject);
                f[27] = true;
                f[28] = true;
                for (C9277a aVar : list) {
                    f[29] = true;
                    JSONObject jSONObject2 = new JSONObject();
                    f[30] = true;
                    jSONObject2.put(str5, aVar.mo33546a());
                    f[31] = true;
                    jSONObject2.put(str4, aVar.mo33550d());
                    f[32] = true;
                    if (aVar.mo33548b() != null) {
                        str2 = aVar.mo33548b();
                        f[33] = true;
                    } else {
                        f[34] = true;
                        str2 = str6;
                    }
                    jSONObject2.put(str3, str2);
                    f[35] = true;
                    jSONArray.put(jSONObject2);
                    f[36] = true;
                }
                f[37] = true;
            } catch (JSONException e) {
                f[38] = true;
                e.printStackTrace();
                f[39] = true;
            }
            f[40] = true;
            return jSONArray;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: d */
        public void mo33782d(List<C9277a> list) {
            boolean[] f = m43783f();
            C9350b bVar = (C9350b) this.view.get();
            if (bVar == null) {
                f[80] = true;
            } else {
                f[81] = true;
                int i = 0;
                f[82] = true;
                while (i < list.size()) {
                    f[84] = true;
                    bVar.mo33769b(i);
                    i++;
                    f[85] = true;
                }
                f[83] = true;
            }
            f[86] = true;
        }

        /* renamed from: c */
        public boolean mo33780c() {
            boolean[] f = m43783f();
            Bug c = C9254f.m43255h().mo33434c();
            f[61] = true;
            List o = c.mo33530o();
            f[62] = true;
            mo33782d(o);
            f[63] = true;
            C9350b bVar = (C9350b) this.view.get();
            if (bVar == null) {
                f[64] = true;
            } else {
                f[65] = true;
                f[66] = true;
                int i = 0;
                while (i < o.size()) {
                    f[68] = true;
                    C9277a aVar = (C9277a) o.get(i);
                    f[69] = true;
                    if (!aVar.mo33551e()) {
                        f[70] = true;
                    } else {
                        f[71] = true;
                        if (aVar.mo33548b() == null) {
                            f[72] = true;
                            bVar.mo33770d(i);
                            f[73] = true;
                            return false;
                        }
                        String trim = aVar.mo33548b().trim();
                        f[74] = true;
                        if (!trim.isEmpty()) {
                            f[75] = true;
                        } else {
                            f[76] = true;
                            bVar.mo33770d(i);
                            f[77] = true;
                            return false;
                        }
                    }
                    i++;
                    f[78] = true;
                }
                f[67] = true;
            }
            f[79] = true;
            return true;
        }
    }

    static {
        boolean[] w = m43719w();
        w[478] = true;
    }

    public C9331e() {
        boolean[] w = m43719w();
        w[0] = true;
        this.f24734f0 = new C9337f(this);
        w[1] = true;
    }

    /* renamed from: A */
    private void m43676A() {
        boolean[] w = m43719w();
        String str = "android.permission.RECORD_AUDIO";
        if (C0841b.m4916a((Context) getActivity(), str) != 0) {
            w[219] = true;
            requestPermissions(new String[]{str}, C13959t.f40820N2);
            w[220] = true;
        } else {
            ((C9358a) this.presenter).mo33794f();
            w[221] = true;
        }
        w[222] = true;
    }

    /* renamed from: B */
    private void m43677B() {
        boolean[] w = m43719w();
        Builder builder = new Builder(getContext());
        w[233] = true;
        builder.setTitle(C9231R.string.instabug_str_alert_title_max_attachments);
        w[234] = true;
        builder.setMessage(C9231R.string.instabug_str_alert_message_max_attachments);
        w[235] = true;
        builder.setPositiveButton(C9231R.string.instabug_str_ok, new C9338g(this));
        w[236] = true;
        builder.show();
        w[237] = true;
    }

    /* renamed from: C */
    private void m43678C() {
        boolean[] w = m43719w();
        this.f24721U = new C9341j(this);
        w[361] = true;
    }

    /* renamed from: D */
    private void m43679D() {
        boolean[] w = m43719w();
        if (this.f24724X != null) {
            w[362] = true;
        } else {
            w[363] = true;
            ScreenRecordingEventBus instance = ScreenRecordingEventBus.getInstance();
            C9342k kVar = new C9342k(this);
            w[364] = true;
            this.f24724X = instance.subscribe(kVar);
            w[365] = true;
        }
        w[366] = true;
    }

    /* renamed from: E */
    private void m43680E() {
        boolean[] w = m43719w();
        if (C9254f.m43255h().mo33434c() == null) {
            w[367] = true;
        } else {
            C9358a aVar = (C9358a) this.presenter;
            w[368] = true;
            List g = C9254f.m43255h().mo33434c().mo33519g();
            w[369] = true;
            Attachment a = aVar.mo33783a(g);
            if (a == null) {
                w[370] = true;
            } else {
                w[371] = true;
                ((C9358a) this.presenter).mo33786a(a);
                w[372] = true;
            }
            ((C9358a) this.presenter).mo33793e();
            w[373] = true;
        }
        w[374] = true;
    }

    /* renamed from: F */
    private void m43681F() {
        boolean[] w = m43719w();
        ViewTreeObserver viewTreeObserver = getActivity().getWindow().getDecorView().getViewTreeObserver();
        OnGlobalLayoutListener onGlobalLayoutListener = this.f24734f0;
        w[444] = true;
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        w[445] = true;
    }

    /* renamed from: G */
    private void m43682G() {
        boolean[] w = m43719w();
        if (VERSION.SDK_INT < 16) {
            w[446] = true;
        } else {
            w[447] = true;
            ViewTreeObserver viewTreeObserver = getActivity().getWindow().getDecorView().getViewTreeObserver();
            OnGlobalLayoutListener onGlobalLayoutListener = this.f24734f0;
            w[448] = true;
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            w[449] = true;
        }
        w[450] = true;
    }

    /* renamed from: a */
    static /* synthetic */ View m43683a(C9331e eVar, int i) {
        boolean[] w = m43719w();
        View findViewById = eVar.findViewById(i);
        w[454] = true;
        return findViewById;
    }

    /* renamed from: b */
    static /* synthetic */ int m43692b(int i) {
        boolean[] w = m43719w();
        f24712g0 = i;
        w[461] = true;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ View m43696c(C9331e eVar, int i) {
        boolean[] w = m43719w();
        View findViewById = eVar.findViewById(i);
        w[467] = true;
        return findViewById;
    }

    /* renamed from: d */
    static /* synthetic */ View m43699d(C9331e eVar, int i) {
        boolean[] w = m43719w();
        View findViewById = eVar.findViewById(i);
        w[468] = true;
        return findViewById;
    }

    /* renamed from: e */
    static /* synthetic */ EditText m43701e(C9331e eVar) {
        boolean[] w = m43719w();
        EditText editText = eVar.f24729b;
        w[459] = true;
        return editText;
    }

    /* renamed from: f */
    static /* synthetic */ Presenter m43702f(C9331e eVar) {
        boolean[] w = m43719w();
        P p = eVar.presenter;
        w[460] = true;
        return p;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m43703g(C9331e eVar) {
        boolean[] w = m43719w();
        boolean z = eVar.f24732d0;
        w[462] = true;
        return z;
    }

    /* renamed from: h */
    static /* synthetic */ boolean m43704h(C9331e eVar) {
        boolean[] w = m43719w();
        boolean z = eVar.f24731c0;
        w[463] = true;
        return z;
    }

    /* renamed from: i */
    static /* synthetic */ void m43705i(C9331e eVar) {
        boolean[] w = m43719w();
        eVar.m43711n();
        w[464] = true;
    }

    /* renamed from: j */
    static /* synthetic */ void m43706j(C9331e eVar) {
        boolean[] w = m43719w();
        eVar.m43713o();
        w[465] = true;
    }

    /* renamed from: k */
    static /* synthetic */ ImageView m43707k(C9331e eVar) {
        boolean[] w = m43719w();
        ImageView imageView = eVar.f24728a0;
        w[466] = true;
        return imageView;
    }

    /* renamed from: l */
    static /* synthetic */ Presenter m43708l(C9331e eVar) {
        boolean[] w = m43719w();
        P p = eVar.presenter;
        w[470] = true;
        return p;
    }

    /* renamed from: m */
    static /* synthetic */ C9303b m43709m(C9331e eVar) {
        boolean[] w = m43719w();
        C9303b bVar = eVar.f24723W;
        w[472] = true;
        return bVar;
    }

    /* renamed from: n */
    static /* synthetic */ RecyclerView m43710n(C9331e eVar) {
        boolean[] w = m43719w();
        RecyclerView recyclerView = eVar.f24715O;
        w[473] = true;
        return recyclerView;
    }

    /* renamed from: o */
    static /* synthetic */ C9347o m43712o(C9331e eVar) {
        boolean[] w = m43719w();
        C9347o oVar = eVar.f24725Y;
        w[474] = true;
        return oVar;
    }

    /* renamed from: p */
    static /* synthetic */ Presenter m43714p(C9331e eVar) {
        boolean[] w = m43719w();
        P p = eVar.presenter;
        w[475] = true;
        return p;
    }

    /* renamed from: q */
    static /* synthetic */ void m43716q(C9331e eVar) {
        boolean[] w = m43719w();
        eVar.m43680E();
        w[477] = true;
    }

    /* renamed from: r */
    private void m43717r() {
        boolean[] w = m43719w();
        if (this.f24730b0 != 1) {
            w[113] = true;
        } else {
            w[114] = true;
            this.f24728a0.setVisibility(8);
            w[115] = true;
            findViewById(C9231R.C9235id.instabug_add_attachment).setVisibility(8);
            w[116] = true;
        }
        w[117] = true;
    }

    /* renamed from: v */
    private void m43718v() {
        boolean[] w = m43719w();
        TextView textView = (TextView) findViewById(C9231R.C9235id.instabug_attach_gallery_image_label);
        Key key = Key.ADD_IMAGE_FROM_GALLERY;
        int i = C9231R.string.instabug_str_add_photo;
        w[148] = true;
        textView.setText(PlaceHolderUtils.getPlaceHolder(key, getString(i)));
        w[149] = true;
        TextView textView2 = (TextView) findViewById(C9231R.C9235id.instabug_attach_screenshot_label);
        Key key2 = Key.ADD_EXTRA_SCREENSHOT;
        int i2 = C9231R.string.instabug_str_take_screenshot;
        w[150] = true;
        textView2.setText(PlaceHolderUtils.getPlaceHolder(key2, getString(i2)));
        w[151] = true;
        TextView textView3 = (TextView) findViewById(C9231R.C9235id.instabug_attach_video_label);
        Key key3 = Key.ADD_VIDEO;
        int i3 = C9231R.string.instabug_str_record_video;
        w[152] = true;
        textView3.setText(PlaceHolderUtils.getPlaceHolder(key3, getString(i3)));
        w[153] = true;
    }

    /* renamed from: w */
    private static /* synthetic */ boolean[] m43719w() {
        boolean[] zArr = f24713h0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7668012078343139507L, "com/instabug/bug/view/BugReportingFragment", MPSUtils.AUDIO_MAX);
        f24713h0 = a;
        return a;
    }

    /* renamed from: x */
    private void m43720x() {
        boolean[] w = m43719w();
        if (C9291a.m43476r().mo33607c().isAllowScreenRecording()) {
            this.f24730b0++;
            w[120] = true;
            findViewById(C9231R.C9235id.instabug_attach_video).setOnClickListener(this);
            w[121] = true;
            ImageView imageView = (ImageView) findViewById(C9231R.C9235id.instabug_attach_video_icon);
            w[122] = true;
            ImageView imageView2 = (ImageView) findViewById(C9231R.C9235id.ib_bug_attachment_collapsed_video_icon);
            w[123] = true;
            m43687a(imageView, Instabug.getPrimaryColor());
            w[124] = true;
            m43687a(imageView2, AttrResolver.resolveAttributeColor(getContext(), C9231R.attr.add_attachment_icon_color));
            w[125] = true;
        } else {
            findViewById(C9231R.C9235id.instabug_attach_video).setVisibility(8);
            w[126] = true;
            findViewById(C9231R.C9235id.ib_bug_attachment_collapsed_video_icon).setVisibility(8);
            w[127] = true;
            findViewById(C9231R.C9235id.ib_bug_videorecording_separator).setVisibility(8);
            w[128] = true;
        }
        if (C9291a.m43476r().mo33607c().isAllowTakeExtraScreenshot()) {
            this.f24730b0++;
            w[129] = true;
            findViewById(C9231R.C9235id.instabug_attach_screenshot).setOnClickListener(this);
            w[130] = true;
            ImageView imageView3 = (ImageView) findViewById(C9231R.C9235id.instabug_attach_screenshot_icon);
            w[131] = true;
            ImageView imageView4 = (ImageView) findViewById(C9231R.C9235id.ib_bug_attachment_collapsed_screenshot_icon);
            w[132] = true;
            m43687a(imageView3, Instabug.getPrimaryColor());
            w[133] = true;
            m43687a(imageView4, AttrResolver.resolveAttributeColor(getContext(), C9231R.attr.add_attachment_icon_color));
            w[134] = true;
        } else {
            findViewById(C9231R.C9235id.instabug_attach_screenshot).setVisibility(8);
            w[135] = true;
            findViewById(C9231R.C9235id.ib_bug_attachment_collapsed_screenshot_icon).setVisibility(8);
            w[136] = true;
            findViewById(C9231R.C9235id.ib_bug_screenshot_separator).setVisibility(8);
            w[137] = true;
        }
        if (C9291a.m43476r().mo33607c().isAllowAttachImageFromGallery()) {
            this.f24730b0++;
            w[138] = true;
            findViewById(C9231R.C9235id.instabug_attach_gallery_image).setOnClickListener(this);
            w[139] = true;
            ImageView imageView5 = (ImageView) findViewById(C9231R.C9235id.instabug_attach_gallery_image_icon);
            w[140] = true;
            ImageView imageView6 = (ImageView) findViewById(C9231R.C9235id.ib_bug_attachment_collapsed_photo_library_icon);
            w[141] = true;
            m43687a(imageView6, AttrResolver.resolveAttributeColor(getContext(), C9231R.attr.add_attachment_icon_color));
            w[142] = true;
            m43687a(imageView5, Instabug.getPrimaryColor());
            w[143] = true;
        } else {
            findViewById(C9231R.C9235id.instabug_attach_gallery_image).setVisibility(8);
            w[144] = true;
            findViewById(C9231R.C9235id.ib_bug_attachment_collapsed_photo_library_icon).setVisibility(8);
            w[145] = true;
        }
        w[146] = true;
    }

    /* renamed from: y */
    private void m43721y() {
        boolean[] w = m43719w();
        if (!C9246b.m43210b().mo33422a()) {
            w[206] = true;
            m43676A();
            w[207] = true;
        } else {
            Toast makeText = Toast.makeText(getContext(), C9231R.string.instabug_str_video_encoder_busy, 0);
            w[208] = true;
            makeText.show();
            w[209] = true;
        }
        w[210] = true;
    }

    /* renamed from: z */
    private void m43722z() {
        boolean[] w = m43719w();
        this.f24727a.clearFocus();
        w[215] = true;
        this.f24727a.setError(null);
        w[216] = true;
        this.f24729b.clearFocus();
        w[217] = true;
        this.f24729b.setError(null);
        w[218] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] w = m43719w();
        int i = C9231R.layout.ib_bug_lyt_feedback;
        w[24] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        Spanned spanned;
        boolean[] w = m43719w();
        getActivity().setTitle(mo33745d());
        w[25] = true;
        this.f24716P = (ScrollView) findViewById(C9231R.C9235id.ib_bug_scroll_view);
        w[26] = true;
        this.f24729b = (EditText) findViewById(C9231R.C9235id.instabug_edit_text_message);
        w[27] = true;
        this.f24727a = (EditText) findViewById(C9231R.C9235id.instabug_edit_text_email);
        w[28] = true;
        m43715p();
        w[29] = true;
        this.f24715O = (RecyclerView) findViewById(C9231R.C9235id.instabug_lyt_attachments_list);
        w[30] = true;
        this.f24715O.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        w[31] = true;
        this.f24723W = new C9303b(getActivity(), null, this);
        EditText editText = this.f24727a;
        Key key = Key.EMAIL_FIELD_HINT;
        int i = C9231R.string.instabug_str_email_hint;
        w[32] = true;
        String string = getString(i);
        w[33] = true;
        editText.setHint(PlaceHolderUtils.getPlaceHolder(key, string));
        w[34] = true;
        this.f24727a.addTextChangedListener(new C9344l(this));
        w[35] = true;
        this.f24729b.addTextChangedListener(new C9345m(this));
        w[36] = true;
        this.f24714N = (TextView) findViewById(C9231R.C9235id.instabug_text_view_disclaimer);
        if (VERSION.SDK_INT >= 11) {
            w[37] = true;
        } else {
            w[38] = true;
            this.f24729b.setBackgroundResource(C9231R.C9234drawable.instabug_bg_edit_text);
            w[39] = true;
            this.f24727a.setBackgroundResource(C9231R.C9234drawable.instabug_bg_edit_text);
            w[40] = true;
        }
        if (C9291a.m43476r().mo33614g()) {
            w[41] = true;
        } else {
            w[42] = true;
            this.f24727a.setVisibility(8);
            w[43] = true;
            this.f24729b.setGravity(16);
            w[44] = true;
        }
        String str = this.f24718R;
        if (str == null) {
            w[45] = true;
        } else {
            w[46] = true;
            this.f24729b.setHint(str);
            w[47] = true;
        }
        String str2 = this.f24717Q;
        if (str2 == null) {
            w[48] = true;
        } else {
            w[49] = true;
            this.f24729b.setText(str2);
            w[50] = true;
        }
        com.instabug.library.model.State state = C9254f.m43255h().mo33434c().getState();
        if (state != null) {
            w[51] = true;
            String userEmail = state.getUserEmail();
            w[52] = true;
            if (userEmail == null) {
                w[53] = true;
            } else if (userEmail.isEmpty()) {
                w[54] = true;
            } else {
                w[55] = true;
                this.f24727a.setText(userEmail);
                w[56] = true;
            }
            w[57] = true;
        } else {
            ((C9358a) this.presenter).mo33798j();
            w[58] = true;
        }
        String l = C9291a.m43476r().mo33619l();
        w[59] = true;
        if (l == null) {
            w[60] = true;
        } else if (l.isEmpty()) {
            w[61] = true;
        } else {
            Feature feature = Feature.DISCLAIMER;
            w[62] = true;
            if (InstabugCore.getFeatureState(feature) != Feature.State.ENABLED) {
                w[63] = true;
            } else {
                w[64] = true;
                String c = ((C9358a) this.presenter).mo33790c(l);
                if (VERSION.SDK_INT >= 24) {
                    w[65] = true;
                    spanned = Html.fromHtml(c, 0);
                    w[66] = true;
                } else {
                    spanned = Html.fromHtml(c);
                    w[67] = true;
                }
                this.f24714N.setText(spanned);
                w[68] = true;
                this.f24714N.setMovementMethod(LinkMovementMethod.getInstance());
                w[69] = true;
                new Handler().postDelayed(new C9346n(this), 100);
                w[71] = true;
            }
        }
        this.f24714N.setVisibility(8);
        w[70] = true;
        new Handler().postDelayed(new C9346n(this), 100);
        w[71] = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean[] w = m43719w();
        super.onActivityResult(i, i2, intent);
        w[170] = true;
        ((C9358a) this.presenter).mo33784a(i, i2, intent);
        w[171] = true;
    }

    public void onAttach(Context context) {
        boolean[] w = m43719w();
        super.onAttach(context);
        try {
            w[19] = true;
            this.f24725Y = (C9347o) context;
            w[22] = true;
        } catch (ClassCastException unused) {
            w[20] = true;
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().toString());
            sb.append(" must implement InstabugSuccessFragment.OnImageEditingListener");
            ClassCastException classCastException = new ClassCastException(sb.toString());
            w[21] = true;
            throw classCastException;
        }
    }

    public void onClick(View view) {
        boolean[] w = m43719w();
        if (SystemClock.elapsedRealtime() - this.f24733e0 < 1000) {
            w[181] = true;
            return;
        }
        this.f24733e0 = SystemClock.elapsedRealtime();
        w[182] = true;
        int id = view.getId();
        if (id == C9231R.C9235id.instabug_attach_screenshot) {
            w[183] = true;
            if (C9254f.m43255h().mo33434c().mo33526k() < 4) {
                w[184] = true;
                ((C9358a) this.presenter).mo33795g();
                w[185] = true;
            } else {
                m43677B();
                w[186] = true;
            }
        } else if (id == C9231R.C9235id.instabug_attach_gallery_image) {
            w[187] = true;
            if (C9254f.m43255h().mo33434c().mo33526k() < 4) {
                w[188] = true;
                ((C9358a) this.presenter).mo33796h();
                w[189] = true;
            } else {
                m43677B();
                w[190] = true;
            }
        } else if (id == C9231R.C9235id.instabug_attach_video) {
            w[191] = true;
            if (C9254f.m43255h().mo33434c().mo33526k() < 4) {
                w[192] = true;
                m43721y();
                w[193] = true;
            } else {
                m43677B();
                w[194] = true;
            }
        } else {
            if (id == C9231R.C9235id.ib_bottomsheet_arrow_layout) {
                w[195] = true;
            } else if (id == C9231R.C9235id.arrow_handler) {
                w[196] = true;
            } else if (id != C9231R.C9235id.instabug_add_attachment) {
                w[199] = true;
            } else {
                w[200] = true;
                if (this.f24726Z.mo22478h() != 4) {
                    w[201] = true;
                } else {
                    w[202] = true;
                    KeyboardUtils.hide(getActivity());
                    w[203] = true;
                    new Handler().postDelayed(new C9335d(this), 200);
                    w[204] = true;
                }
            }
            KeyboardUtils.hide(getActivity());
            w[197] = true;
            new Handler().postDelayed(new C9334c(this), 200);
            w[198] = true;
        }
        w[205] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] w = m43719w();
        postponeEnterTransition();
        w[8] = true;
        super.onCreate(bundle);
        w[9] = true;
        setHasOptionsMenu(true);
        w[10] = true;
        m43678C();
        w[11] = true;
        m43679D();
        w[12] = true;
        this.f24719S = (C9278b) getArguments().getSerializable("bug_type");
        w[13] = true;
        this.f24717Q = getArguments().getString("bug_message");
        w[14] = true;
        this.f24718R = getArguments().getString("bug_message_hint");
        if (this.presenter != null) {
            w[15] = true;
        } else {
            w[16] = true;
            this.presenter = mo33742c();
            w[17] = true;
        }
        w[18] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateOptionsMenu(android.view.Menu r6, android.view.MenuInflater r7) {
        /*
            r5 = this;
            boolean[] r0 = m43719w()
            int r1 = com.instabug.bug.C9231R.C9236menu.instabug_bug_reporting
            r7.inflate(r1, r6)
            r7 = 1
            r1 = 403(0x193, float:5.65E-43)
            r0[r1] = r7
            com.instabug.bug.settings.a r1 = com.instabug.bug.settings.C9291a.m43476r()
            java.util.List r1 = r1.mo33621n()
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0022
            r1 = 404(0x194, float:5.66E-43)
            r0[r1] = r7
            goto L_0x0036
        L_0x0022:
            r1 = 405(0x195, float:5.68E-43)
            r0[r1] = r7
            com.instabug.bug.settings.a r1 = com.instabug.bug.settings.C9291a.m43476r()
            com.instabug.bug.extendedbugreport.ExtendedBugReport$State r1 = r1.mo33623p()
            com.instabug.bug.extendedbugreport.ExtendedBugReport$State r3 = com.instabug.bug.extendedbugreport.ExtendedBugReport.State.DISABLED
            if (r1 == r3) goto L_0x003c
            r1 = 406(0x196, float:5.69E-43)
            r0[r1] = r7
        L_0x0036:
            r1 = 407(0x197, float:5.7E-43)
            r0[r1] = r7
            r1 = 1
            goto L_0x0041
        L_0x003c:
            r1 = 408(0x198, float:5.72E-43)
            r0[r1] = r7
            r1 = 0
        L_0x0041:
            r3 = 1127481344(0x43340000, float:180.0)
            if (r1 == 0) goto L_0x009f
            r1 = 409(0x199, float:5.73E-43)
            r0[r1] = r7
            int r1 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_send
            android.view.MenuItem r1 = r6.findItem(r1)
            r1.setVisible(r2)
            r1 = 410(0x19a, float:5.75E-43)
            r0[r1] = r7
            int r1 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_next
            android.view.MenuItem r1 = r6.findItem(r1)
            r1.setVisible(r7)
            r1 = 411(0x19b, float:5.76E-43)
            r0[r1] = r7
            android.content.Context r1 = r5.getContext()
            java.util.Locale r1 = com.instabug.library.Instabug.getLocale(r1)
            boolean r1 = com.instabug.library.util.LocaleUtils.isRTL(r1)
            if (r1 != 0) goto L_0x0077
            r6 = 412(0x19c, float:5.77E-43)
            r0[r6] = r7
            goto L_0x00f3
        L_0x0077:
            r1 = 413(0x19d, float:5.79E-43)
            r0[r1] = r7
            int r1 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_next
            android.view.MenuItem r1 = r6.findItem(r1)
            int r2 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_next
            r4 = 414(0x19e, float:5.8E-43)
            r0[r4] = r7
            android.view.MenuItem r6 = r6.findItem(r2)
            android.graphics.drawable.Drawable r6 = r6.getIcon()
            android.graphics.drawable.Drawable r6 = com.instabug.library.util.DrawableUtils.getRotateDrawable(r6, r3)
            r2 = 415(0x19f, float:5.82E-43)
            r0[r2] = r7
            r1.setIcon(r6)
            r6 = 416(0x1a0, float:5.83E-43)
            r0[r6] = r7
            goto L_0x00f3
        L_0x009f:
            int r1 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_send
            android.view.MenuItem r1 = r6.findItem(r1)
            r1.setVisible(r7)
            r1 = 417(0x1a1, float:5.84E-43)
            r0[r1] = r7
            int r1 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_next
            android.view.MenuItem r1 = r6.findItem(r1)
            r1.setVisible(r2)
            r1 = 418(0x1a2, float:5.86E-43)
            r0[r1] = r7
            android.content.Context r1 = r5.getContext()
            java.util.Locale r1 = com.instabug.library.Instabug.getLocale(r1)
            boolean r1 = com.instabug.library.util.LocaleUtils.isRTL(r1)
            if (r1 != 0) goto L_0x00cc
            r6 = 419(0x1a3, float:5.87E-43)
            r0[r6] = r7
            goto L_0x00f3
        L_0x00cc:
            r1 = 420(0x1a4, float:5.89E-43)
            r0[r1] = r7
            int r1 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_send
            android.view.MenuItem r1 = r6.findItem(r1)
            int r2 = com.instabug.bug.C9231R.C9235id.instabug_bugreporting_send
            r4 = 421(0x1a5, float:5.9E-43)
            r0[r4] = r7
            android.view.MenuItem r6 = r6.findItem(r2)
            android.graphics.drawable.Drawable r6 = r6.getIcon()
            android.graphics.drawable.Drawable r6 = com.instabug.library.util.DrawableUtils.getRotateDrawable(r6, r3)
            r2 = 422(0x1a6, float:5.91E-43)
            r0[r2] = r7
            r1.setIcon(r6)
            r6 = 423(0x1a7, float:5.93E-43)
            r0[r6] = r7
        L_0x00f3:
            r6 = 424(0x1a8, float:5.94E-43)
            r0[r6] = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.C9331e.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    @SuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public void onDestroy() {
        boolean[] w = m43719w();
        super.onDestroy();
        w[398] = true;
        if (this.f24724X.mo41878d()) {
            w[399] = true;
        } else {
            w[400] = true;
            this.f24724X.dispose();
            w[401] = true;
        }
        f24712g0 = -1;
        w[402] = true;
    }

    public void onDestroyView() {
        boolean[] w = m43719w();
        super.onDestroyView();
        this.f24730b0 = 0;
        w[397] = true;
    }

    public void onDetach() {
        boolean[] w = m43719w();
        super.onDetach();
        this.f24725Y = null;
        w[23] = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean[] w = m43719w();
        if (SystemClock.elapsedRealtime() - this.f24733e0 < 1000) {
            w[425] = true;
            return false;
        }
        this.f24733e0 = SystemClock.elapsedRealtime();
        w[426] = true;
        if (menuItem.getItemId() == C9231R.C9235id.instabug_bugreporting_next) {
            w[427] = true;
            ((C9358a) this.presenter).mo33797i();
            w[428] = true;
        } else if (menuItem.getItemId() == C9231R.C9235id.instabug_bugreporting_send) {
            w[429] = true;
            if (getFragmentManager() == null) {
                w[430] = true;
            } else {
                w[431] = true;
                w[432] = true;
                for (Fragment fragment : getFragmentManager().mo6240e()) {
                    if (fragment instanceof C9351q) {
                        w[434] = true;
                        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                        w[435] = true;
                        return onOptionsItemSelected;
                    }
                    w[436] = true;
                }
                w[433] = true;
            }
            ((C9358a) this.presenter).mo33797i();
            w[437] = true;
        } else if (menuItem.getItemId() != 16908332) {
            w[438] = true;
        } else {
            w[439] = true;
            if (getActivity() == null) {
                w[440] = true;
            } else {
                w[441] = true;
                getActivity().onBackPressed();
                w[442] = true;
            }
        }
        w[443] = true;
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean[] w = m43719w();
        if (iArr.length <= 0) {
            w[223] = true;
        } else if (iArr[0] != 0) {
            w[224] = true;
        } else {
            if (i == 177) {
                ((C9358a) this.presenter).mo33794f();
                w[227] = true;
            } else if (i != 3873) {
                super.onRequestPermissionsResult(i, strArr, iArr);
                w[228] = true;
            } else {
                mo33752j();
                w[225] = true;
                C9254f.m43255h().mo33439g();
                w[226] = true;
            }
            w[232] = true;
        }
        if (i != 177) {
            w[229] = true;
        } else {
            w[230] = true;
            ((C9358a) this.presenter).mo33794f();
            w[231] = true;
        }
        w[232] = true;
    }

    public void onResume() {
        boolean[] w = m43719w();
        super.onResume();
        w[118] = true;
        m43681F();
        w[119] = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean[] w = m43719w();
        ((C9358a) this.presenter).mo33785a(bundle);
        w[168] = true;
        super.onSaveInstanceState(bundle);
        w[169] = true;
    }

    public void onStart() {
        boolean[] w = m43719w();
        super.onStart();
        w[156] = true;
        ((C9358a) this.presenter).mo33792d();
        w[157] = true;
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f24721U, new IntentFilter("refresh.attachments"));
        w[158] = true;
        ((C9358a) this.presenter).mo33793e();
        w[159] = true;
    }

    public void onStop() {
        boolean[] w = m43719w();
        super.onStop();
        w[160] = true;
        ((C9358a) this.presenter).mo33791c();
        w[161] = true;
        C2128a a = C2128a.m11089a((Context) getActivity());
        BroadcastReceiver broadcastReceiver = this.f24721U;
        w[162] = true;
        a.mo9217a(broadcastReceiver);
        w[163] = true;
        if (this.f24724X.mo41878d()) {
            w[164] = true;
        } else {
            w[165] = true;
            this.f24724X.dispose();
            w[166] = true;
        }
        m43682G();
        w[167] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] w = m43719w();
        super.onViewCreated(view, bundle);
        w[154] = true;
        getActivity().getWindow().setSoftInputMode(16);
        w[155] = true;
    }

    public void onViewStateRestored(@C0195i0 Bundle bundle) {
        boolean[] w = m43719w();
        super.onViewStateRestored(bundle);
        w[172] = true;
        ((C9358a) this.presenter).mo33785a(bundle);
        w[173] = true;
    }

    /* renamed from: a */
    static /* synthetic */ BottomSheetBehavior m43684a(C9331e eVar) {
        boolean[] w = m43719w();
        BottomSheetBehavior bottomSheetBehavior = eVar.f24726Z;
        w[452] = true;
        return bottomSheetBehavior;
    }

    /* renamed from: b */
    static /* synthetic */ int m43693b(C9331e eVar) {
        boolean[] w = m43719w();
        int i = eVar.f24730b0;
        w[455] = true;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ EditText m43697c(C9331e eVar) {
        boolean[] w = m43719w();
        EditText editText = eVar.f24727a;
        w[457] = true;
        return editText;
    }

    /* renamed from: d */
    static /* synthetic */ Presenter m43700d(C9331e eVar) {
        boolean[] w = m43719w();
        P p = eVar.presenter;
        w[458] = true;
        return p;
    }

    /* renamed from: n */
    private void m43711n() {
        boolean[] w = m43719w();
        findViewById(C9231R.C9235id.instabug_add_attachment).setVisibility(0);
        w[72] = true;
        if (C9291a.m43476r().mo33607c().isAllowScreenRecording()) {
            w[73] = true;
            findViewById(C9231R.C9235id.instabug_attach_video).setVisibility(4);
            w[74] = true;
        } else {
            findViewById(C9231R.C9235id.instabug_attach_video).setVisibility(8);
            w[75] = true;
        }
        w[76] = true;
    }

    /* renamed from: o */
    private void m43713o() {
        boolean[] w = m43719w();
        if (C9291a.m43476r().mo33607c().isAllowScreenRecording()) {
            w[77] = true;
            findViewById(C9231R.C9235id.instabug_add_attachment).setVisibility(4);
            w[78] = true;
            findViewById(C9231R.C9235id.instabug_attach_video).setVisibility(0);
            w[79] = true;
        } else {
            findViewById(C9231R.C9235id.instabug_add_attachment).setVisibility(8);
            w[80] = true;
            findViewById(C9231R.C9235id.instabug_attach_video).setVisibility(8);
            w[81] = true;
        }
        w[82] = true;
    }

    /* renamed from: p */
    private void m43715p() {
        boolean[] w = m43719w();
        View findViewById = findViewById(C9231R.C9235id.instabug_attachment_bottom_sheet);
        w[83] = true;
        ImageView imageView = (ImageView) findViewById(C9231R.C9235id.instabug_add_attachment_icon);
        w[84] = true;
        this.f24728a0 = (ImageView) findViewById(C9231R.C9235id.arrow_handler);
        w[85] = true;
        this.f24728a0.setRotation(0.0f);
        w[86] = true;
        this.f24726Z = BottomSheetBehavior.m24700c(findViewById);
        w[87] = true;
        this.f24726Z.mo22467c(ViewUtils.convertDpToPx(getContext(), 100.0f));
        w[88] = true;
        this.f24728a0.setOnClickListener(this);
        w[89] = true;
        findViewById(C9231R.C9235id.instabug_add_attachment).setOnClickListener(this);
        w[90] = true;
        findViewById(C9231R.C9235id.ib_bottomsheet_arrow_layout).setOnClickListener(this);
        w[91] = true;
        m43687a(imageView, Instabug.getPrimaryColor());
        w[92] = true;
        m43720x();
        w[93] = true;
        findViewById(C9231R.C9235id.instabug_add_attachment).setVisibility(4);
        w[94] = true;
        findViewById(C9231R.C9235id.instabug_attach_video).setVisibility(0);
        if (this.f24730b0 > 1) {
            w[95] = true;
            this.f24726Z.mo22468c((C5662e) new C9332a(this));
            w[96] = true;
        } else {
            this.f24726Z.mo22468c((C5662e) new C9333b(this));
            w[97] = true;
        }
        BottomSheetBehavior bottomSheetBehavior = this.f24726Z;
        int i = f24712g0;
        if (i == -1) {
            i = 3;
            w[98] = true;
        } else {
            w[99] = true;
        }
        bottomSheetBehavior.mo22474e(i);
        if (f24712g0 == 4) {
            w[100] = true;
            m43711n();
            w[101] = true;
            this.f24726Z.mo22474e(4);
            w[102] = true;
            this.f24728a0.setRotation(180.0f);
            w[103] = true;
        } else {
            m43713o();
            w[104] = true;
            this.f24728a0.setRotation(0.0f);
            w[105] = true;
        }
        m43718v();
        w[106] = true;
        if (!OrientationUtils.isInLandscape(getActivity())) {
            w[107] = true;
        } else {
            w[108] = true;
            m43711n();
            w[109] = true;
            this.f24726Z.mo22474e(4);
            w[110] = true;
            this.f24728a0.setRotation(180.0f);
            w[111] = true;
        }
        m43717r();
        w[112] = true;
    }

    /* renamed from: e */
    public boolean mo33747e() {
        boolean z;
        boolean[] w = m43719w();
        if (this.f24723W.mo33699f() == null) {
            w[289] = true;
        } else {
            C9303b bVar = this.f24723W;
            w[290] = true;
            if (bVar.mo33699f().getVisibility() != 0) {
                w[291] = true;
            } else {
                w[292] = true;
                z = true;
                w[294] = true;
                return z;
            }
        }
        z = false;
        w[293] = true;
        w[294] = true;
        return z;
    }

    /* renamed from: f */
    public boolean mo33748f() {
        boolean z;
        boolean[] w = m43719w();
        if (this.f24723W.mo33700g() == null) {
            w[295] = true;
        } else {
            C9303b bVar = this.f24723W;
            w[296] = true;
            if (bVar.mo33700g().getVisibility() != 0) {
                w[297] = true;
            } else {
                w[298] = true;
                z = true;
                w[300] = true;
                return z;
            }
        }
        z = false;
        w[299] = true;
        w[300] = true;
        return z;
    }

    /* renamed from: g */
    public boolean mo33749g() {
        boolean[] w = m43719w();
        boolean z = this.f24720T;
        w[309] = true;
        return z;
    }

    /* renamed from: h */
    public void mo33750h() {
        boolean[] w = m43719w();
        KeyboardUtils.hide(getActivity());
        w[328] = true;
        new Handler().postDelayed(new C9340i(this), 200);
        w[329] = true;
    }

    /* renamed from: i */
    public void mo33751i() {
        boolean[] w = m43719w();
        C1382h fragmentManager = getFragmentManager();
        w[330] = true;
        C1406n a = fragmentManager.mo6224a();
        int i = C9231R.C9235id.instabug_fragment_container;
        w[331] = true;
        C1406n a2 = a.mo6394a(i, (Fragment) C9351q.m43769a(mo33745d()));
        w[332] = true;
        C1406n a3 = a2.mo6401a("ExtraFieldsFragment");
        w[333] = true;
        a3.mo6097e();
        w[334] = true;
    }

    /* renamed from: j */
    public void mo33752j() {
        boolean[] w = m43719w();
        Intent intent = new Intent("android.intent.action.PICK");
        w[335] = true;
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        w[336] = true;
        intent.setType("image/*");
        w[337] = true;
        mo33735a(intent, 3862);
        w[338] = true;
    }

    /* renamed from: k */
    public String mo33753k() {
        boolean[] w = m43719w();
        String obj = this.f24727a.getText().toString();
        w[359] = true;
        return obj;
    }

    /* renamed from: l */
    public void mo33754l() {
        boolean[] w = m43719w();
        ProgressDialog progressDialog = this.f24722V;
        if (progressDialog != null) {
            w[339] = true;
            if (progressDialog.isShowing()) {
                w[340] = true;
            } else {
                w[341] = true;
                this.f24722V.show();
                w[342] = true;
            }
        } else {
            this.f24722V = new ProgressDialog(getActivity());
            w[343] = true;
            this.f24722V.setCancelable(false);
            w[344] = true;
            this.f24722V.setMessage(getResources().getString(C9231R.string.instabug_str_dialog_message_preparing));
            w[345] = true;
            this.f24722V.show();
            w[346] = true;
        }
        w[347] = true;
    }

    /* renamed from: m */
    public void mo33755m() {
        boolean[] w = m43719w();
        ProgressDialog progressDialog = this.f24722V;
        if (progressDialog == null) {
            w[348] = true;
        } else if (!progressDialog.isShowing()) {
            w[349] = true;
        } else {
            w[350] = true;
            this.f24722V.dismiss();
            w[351] = true;
        }
        w[352] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43688a(C9331e eVar, View view, Attachment attachment, String str) {
        boolean[] w = m43719w();
        eVar.m43686a(view, attachment, str);
        w[469] = true;
    }

    /* renamed from: b */
    static /* synthetic */ View m43694b(C9331e eVar, int i) {
        boolean[] w = m43719w();
        View findViewById = eVar.findViewById(i);
        w[456] = true;
        return findViewById;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m43698c(C9331e eVar, boolean z) {
        boolean[] w = m43719w();
        eVar.f24720T = z;
        w[471] = true;
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo33745d() {
        boolean[] w = m43719w();
        if (this.f24719S == C9278b.BUG) {
            Key key = Key.BUG_REPORT_HEADER;
            int i = C9231R.string.instabug_str_bug_header;
            w[174] = true;
            String string = getString(i);
            w[175] = true;
            String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
            w[176] = true;
            return placeHolder;
        }
        Key key2 = Key.FEEDBACK_REPORT_HEADER;
        int i2 = C9231R.string.instabug_str_feedback_header;
        w[177] = true;
        String string2 = getString(i2);
        w[178] = true;
        String placeHolder2 = PlaceHolderUtils.getPlaceHolder(key2, string2);
        w[179] = true;
        return placeHolder2;
    }

    /* renamed from: a */
    static /* synthetic */ void m43689a(C9331e eVar, ScreenRecordEvent screenRecordEvent) {
        boolean[] w = m43719w();
        eVar.m43690a(screenRecordEvent);
        w[476] = true;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m43695b(C9331e eVar, boolean z) {
        boolean[] w = m43719w();
        eVar.f24732d0 = z;
        w[453] = true;
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C9358a mo33742c() {
        boolean[] w = m43719w();
        C9360g gVar = new C9360g(this);
        w[180] = true;
        return gVar;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m43691a(C9331e eVar, boolean z) {
        boolean[] w = m43719w();
        eVar.f24731c0 = z;
        w[451] = true;
        return z;
    }

    /* renamed from: b */
    public void mo33741b(boolean z) {
        boolean[] w = m43719w();
        if (!(getFragmentManager().mo6221a(C9231R.C9235id.instabug_fragment_container) instanceof FragmentVisibilityChangedListener)) {
            w[311] = true;
        } else {
            w[312] = true;
            FragmentVisibilityChangedListener fragmentVisibilityChangedListener = (FragmentVisibilityChangedListener) getFragmentManager().mo6221a(C9231R.C9235id.instabug_fragment_container);
            w[313] = true;
            fragmentVisibilityChangedListener.onVisibilityChanged(z);
            w[314] = true;
        }
        w[315] = true;
    }

    /* renamed from: c */
    public void mo33744c(boolean z) {
        boolean[] w = m43719w();
        if (z) {
            w[305] = true;
            this.f24723W.mo33700g().setVisibility(0);
            w[306] = true;
        } else {
            this.f24723W.mo33700g().setVisibility(8);
            w[307] = true;
        }
        w[308] = true;
    }

    /* renamed from: a */
    public static C9331e m43685a(C9278b bVar, String str, String str2) {
        boolean[] w = m43719w();
        C9331e eVar = new C9331e();
        w[2] = true;
        Bundle bundle = new Bundle();
        w[3] = true;
        bundle.putSerializable("bug_type", bVar);
        w[4] = true;
        bundle.putString("bug_message", str);
        w[5] = true;
        bundle.putString("bug_message_hint", str2);
        w[6] = true;
        eVar.setArguments(bundle);
        w[7] = true;
        return eVar;
    }

    /* renamed from: b */
    public void mo33740b(String str) {
        boolean[] w = m43719w();
        this.f24727a.requestFocus();
        w[355] = true;
        this.f24727a.setError(str);
        w[356] = true;
    }

    /* renamed from: c */
    public void mo33743c(String str) {
        boolean[] w = m43719w();
        this.f24729b.requestFocus();
        w[357] = true;
        this.f24729b.setError(str);
        w[358] = true;
    }

    /* renamed from: d */
    public void mo33746d(String str) {
        boolean[] w = m43719w();
        this.f24727a.setText(str);
        w[360] = true;
    }

    /* renamed from: a */
    private void m43687a(ImageView imageView, int i) {
        boolean[] w = m43719w();
        imageView.getDrawable().setColorFilter(i, Mode.SRC_IN);
        w[147] = true;
    }

    /* renamed from: a */
    public void mo33713a(View view, Attachment attachment) {
        boolean[] w = m43719w();
        m43722z();
        w[211] = true;
        SystemServiceUtils.hideInputMethod(getActivity());
        w[212] = true;
        int id = view.getId();
        w[213] = true;
        new Handler().postDelayed(new C9336e(this, id, view, attachment), 200);
        w[214] = true;
    }

    /* renamed from: a */
    private void m43686a(View view, Attachment attachment, String str) {
        boolean[] w = m43719w();
        KeyboardUtils.hide(getActivity());
        w[238] = true;
        mo33741b(false);
        w[239] = true;
        C1406n a = getFragmentManager().mo6224a();
        w[240] = true;
        Uri fromFile = Uri.fromFile(new File(attachment.getLocalPath()));
        w[241] = true;
        View findViewById = view.findViewById(C9231R.C9235id.instabug_img_attachment);
        int i = C9231R.C9235id.instabug_img_attachment;
        w[242] = true;
        String S = C0962e0.m5415S(view.findViewById(i));
        w[243] = true;
        a.mo6396a(findViewById, S);
        w[244] = true;
        if (((BitmapDrawable) ((ImageView) view.findViewById(C9231R.C9235id.instabug_img_attachment)).getDrawable()) == null) {
            w[245] = true;
        } else {
            int i2 = C9231R.C9235id.instabug_fragment_container;
            w[246] = true;
            C9315i a2 = C9315i.m43633a(str, fromFile, attachment.getName());
            w[247] = true;
            String str2 = "annotation";
            C1406n b = a.mo6406b(i2, a2, str2);
            w[248] = true;
            C1406n a3 = b.mo6401a(str2);
            w[249] = true;
            a3.mo6097e();
            w[250] = true;
        }
        w[251] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33738a(java.util.List<com.instabug.library.model.Attachment> r7) {
        /*
            r6 = this;
            boolean[] r0 = m43719w()
            com.instabug.bug.view.b r1 = r6.f24723W
            r1.mo33702h()
            r1 = 1
            r2 = 254(0xfe, float:3.56E-43)
            r0[r2] = r1
            r2 = 255(0xff, float:3.57E-43)
            r0[r2] = r1
            r2 = 0
            r3 = 0
        L_0x0014:
            int r4 = r7.size()
            if (r3 >= r4) goto L_0x00cb
            r4 = 256(0x100, float:3.59E-43)
            r0[r4] = r1
            java.lang.Object r4 = r7.get(r3)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.MAIN_SCREENSHOT
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0035
            r4 = 257(0x101, float:3.6E-43)
            r0[r4] = r1
            goto L_0x008a
        L_0x0035:
            r4 = 258(0x102, float:3.62E-43)
            r0[r4] = r1
            java.lang.Object r4 = r7.get(r3)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.IMAGE
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0050
            r4 = 259(0x103, float:3.63E-43)
            r0[r4] = r1
            goto L_0x008a
        L_0x0050:
            r4 = 260(0x104, float:3.64E-43)
            r0[r4] = r1
            java.lang.Object r4 = r7.get(r3)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.AUDIO
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x006b
            r4 = 261(0x105, float:3.66E-43)
            r0[r4] = r1
            goto L_0x008a
        L_0x006b:
            r4 = 262(0x106, float:3.67E-43)
            r0[r4] = r1
            java.lang.Object r4 = r7.get(r3)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.VIDEO
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0086
            r4 = 263(0x107, float:3.69E-43)
            r0[r4] = r1
            goto L_0x0099
        L_0x0086:
            r4 = 264(0x108, float:3.7E-43)
            r0[r4] = r1
        L_0x008a:
            com.instabug.bug.view.b r4 = r6.f24723W
            java.lang.Object r5 = r7.get(r3)
            com.instabug.library.model.Attachment r5 = (com.instabug.library.model.Attachment) r5
            r4.mo33697a(r5)
            r4 = 265(0x109, float:3.71E-43)
            r0[r4] = r1
        L_0x0099:
            java.lang.Object r4 = r7.get(r3)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.VIDEO
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b0
            r4 = 266(0x10a, float:3.73E-43)
            r0[r4] = r1
            goto L_0x00c3
        L_0x00b0:
            r4 = 267(0x10b, float:3.74E-43)
            r0[r4] = r1
            com.instabug.bug.f r4 = com.instabug.bug.C9254f.m43255h()
            com.instabug.bug.model.Bug r4 = r4.mo33434c()
            r4.setHasVideo(r1)
            r4 = 268(0x10c, float:3.76E-43)
            r0[r4] = r1
        L_0x00c3:
            int r3 = r3 + 1
            r4 = 269(0x10d, float:3.77E-43)
            r0[r4] = r1
            goto L_0x0014
        L_0x00cb:
            r7 = 270(0x10e, float:3.78E-43)
            r0[r7] = r1
            r7 = -1
            r7 = 0
            r3 = -1
        L_0x00d2:
            com.instabug.bug.view.b r4 = r6.f24723W
            java.util.List r4 = r4.mo33704i()
            int r4 = r4.size()
            if (r7 >= r4) goto L_0x0130
            r4 = 271(0x10f, float:3.8E-43)
            r0[r4] = r1
            com.instabug.bug.view.b r4 = r6.f24723W
            java.util.List r4 = r4.mo33704i()
            java.lang.Object r4 = r4.get(r7)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.MAIN_SCREENSHOT
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ff
            r3 = 272(0x110, float:3.81E-43)
            r0[r3] = r1
            goto L_0x0124
        L_0x00ff:
            com.instabug.bug.view.b r4 = r6.f24723W
            r5 = 273(0x111, float:3.83E-43)
            r0[r5] = r1
            java.util.List r4 = r4.mo33704i()
            java.lang.Object r4 = r4.get(r7)
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4
            com.instabug.library.model.Attachment$Type r4 = r4.getType()
            com.instabug.library.model.Attachment$Type r5 = com.instabug.library.model.Attachment.Type.IMAGE
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0120
            r4 = 274(0x112, float:3.84E-43)
            r0[r4] = r1
            goto L_0x0129
        L_0x0120:
            r3 = 275(0x113, float:3.85E-43)
            r0[r3] = r1
        L_0x0124:
            r3 = 276(0x114, float:3.87E-43)
            r0[r3] = r1
            r3 = r7
        L_0x0129:
            int r7 = r7 + 1
            r4 = 277(0x115, float:3.88E-43)
            r0[r4] = r1
            goto L_0x00d2
        L_0x0130:
            com.instabug.bug.view.b r7 = r6.f24723W
            r7.mo33703h(r3)
            r7 = 278(0x116, float:3.9E-43)
            r0[r7] = r1
            androidx.recyclerview.widget.RecyclerView r7 = r6.f24715O
            com.instabug.bug.view.b r3 = r6.f24723W
            r7.setAdapter(r3)
            r7 = 279(0x117, float:3.91E-43)
            r0[r7] = r1
            com.instabug.bug.view.b r7 = r6.f24723W
            r7.mo7341e()
            r7 = 280(0x118, float:3.92E-43)
            r0[r7] = r1
            com.instabug.library.Feature r7 = com.instabug.library.Feature.MULTIPLE_ATTACHMENTS
            com.instabug.library.Feature$State r7 = com.instabug.library.core.InstabugCore.getFeatureState(r7)
            com.instabug.library.Feature$State r3 = com.instabug.library.Feature.State.ENABLED
            if (r7 == r3) goto L_0x015c
            r7 = 281(0x119, float:3.94E-43)
            r0[r7] = r1
            goto L_0x016e
        L_0x015c:
            r7 = 282(0x11a, float:3.95E-43)
            r0[r7] = r1
            com.instabug.bug.settings.a r7 = com.instabug.bug.settings.C9291a.m43476r()
            boolean r7 = r7.mo33610d()
            if (r7 != 0) goto L_0x017e
            r7 = 283(0x11b, float:3.97E-43)
            r0[r7] = r1
        L_0x016e:
            int r7 = com.instabug.bug.C9231R.C9235id.instabug_attachment_bottom_sheet
            android.view.View r7 = r6.findViewById(r7)
            r2 = 8
            r7.setVisibility(r2)
            r7 = 286(0x11e, float:4.01E-43)
            r0[r7] = r1
            goto L_0x018f
        L_0x017e:
            r7 = 284(0x11c, float:3.98E-43)
            r0[r7] = r1
            int r7 = com.instabug.bug.C9231R.C9235id.instabug_attachment_bottom_sheet
            android.view.View r7 = r6.findViewById(r7)
            r7.setVisibility(r2)
            r7 = 285(0x11d, float:4.0E-43)
            r0[r7] = r1
        L_0x018f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f24715O
            com.instabug.bug.view.e$h r2 = new com.instabug.bug.view.e$h
            r2.<init>(r6)
            r7.post(r2)
            r7 = 287(0x11f, float:4.02E-43)
            r0[r7] = r1
            r6.startPostponedEnterTransition()
            r7 = 288(0x120, float:4.04E-43)
            r0[r7] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.C9331e.mo33738a(java.util.List):void");
    }

    /* renamed from: a */
    public void mo33739a(boolean z) {
        boolean[] w = m43719w();
        if (z) {
            w[301] = true;
            this.f24723W.mo33699f().setVisibility(0);
            w[302] = true;
        } else {
            this.f24723W.mo33699f().setVisibility(8);
            w[303] = true;
        }
        w[304] = true;
    }

    /* renamed from: a */
    public void mo33735a(Intent intent, int i) {
        boolean[] w = m43719w();
        startActivityForResult(intent, i);
        w[310] = true;
    }

    /* renamed from: a */
    public void mo33737a(String str) {
        boolean[] w = m43719w();
        if (str != null) {
            w[316] = true;
            C1406n a = getFragmentManager().mo6224a();
            int i = C9231R.C9235id.instabug_fragment_container;
            w[317] = true;
            VideoPlayerFragment newInstance = VideoPlayerFragment.newInstance(str);
            w[318] = true;
            C1406n a2 = a.mo6395a(i, newInstance, "video_player");
            w[319] = true;
            a2.mo6401a("play video").mo6097e();
            w[320] = true;
        } else {
            if (mo33747e()) {
                w[321] = true;
            } else {
                w[322] = true;
                mo33739a(true);
                w[323] = true;
            }
            if (!mo33748f()) {
                w[324] = true;
            } else {
                w[325] = true;
                mo33744c(false);
                w[326] = true;
            }
        }
        w[327] = true;
    }

    /* renamed from: a */
    public void mo33736a(Attachment attachment) {
        boolean[] w = m43719w();
        this.f24723W.mo33698b(attachment);
        w[353] = true;
        this.f24723W.mo7341e();
        w[354] = true;
    }

    /* renamed from: a */
    private void m43690a(ScreenRecordEvent screenRecordEvent) {
        boolean[] w = m43719w();
        if (C9254f.m43255h().mo33434c() == null) {
            w[375] = true;
            return;
        }
        String path = screenRecordEvent.getVideoUri().getPath();
        if (path == null) {
            w[376] = true;
            m43680E();
            w[377] = true;
            return;
        }
        File file = new File(path);
        w[378] = true;
        if (!file.exists()) {
            w[379] = true;
            m43680E();
            w[380] = true;
            return;
        }
        C9358a aVar = (C9358a) this.presenter;
        C9254f h = C9254f.m43255h();
        w[381] = true;
        Bug c = h.mo33434c();
        w[382] = true;
        List g = c.mo33519g();
        w[383] = true;
        aVar.mo33788a(g, path);
        w[384] = true;
        C9254f.m43255h().mo33434c().setVideoEncoded(true);
        w[385] = true;
        if (mo33749g()) {
            w[386] = true;
            if (!mo33747e()) {
                w[387] = true;
            } else {
                w[388] = true;
                mo33739a(false);
                w[389] = true;
            }
            if (mo33748f()) {
                w[390] = true;
            } else {
                w[391] = true;
                mo33744c(true);
                w[392] = true;
            }
            ((C9358a) this.presenter).mo33793e();
            w[393] = true;
            mo33737a(path);
            w[394] = true;
        } else {
            ((C9358a) this.presenter).mo33793e();
            w[395] = true;
        }
        w[396] = true;
    }
}
