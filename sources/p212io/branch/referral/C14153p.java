package p212io.branch.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.instabug.library.model.NetworkLog;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;

/* renamed from: io.branch.referral.p */
/* compiled from: BranchViewHandler */
public class C14153p {

    /* renamed from: h */
    private static C14153p f41638h = null;

    /* renamed from: i */
    private static final String f41639i = "branch-cta";

    /* renamed from: j */
    private static final String f41640j = "accept";

    /* renamed from: k */
    private static final String f41641k = "cancel";

    /* renamed from: l */
    public static final int f41642l = -200;

    /* renamed from: m */
    public static final int f41643m = -201;

    /* renamed from: n */
    public static final int f41644n = -202;

    /* renamed from: o */
    public static final int f41645o = -203;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f41646a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f41647b;

    /* renamed from: c */
    private C14156c f41648c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f41649d = false;

    /* renamed from: e */
    private String f41650e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f41651f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Dialog f41652g;

    /* renamed from: io.branch.referral.p$d */
    /* compiled from: BranchViewHandler */
    public interface C6033d {
        /* renamed from: a */
        void mo24750a(int i, String str, String str2);

        /* renamed from: a */
        void mo24765a(String str, String str2);

        /* renamed from: b */
        void mo24795b(String str, String str2);

        /* renamed from: c */
        void mo24801c(String str, String str2);
    }

    /* renamed from: io.branch.referral.p$a */
    /* compiled from: BranchViewHandler */
    class C14154a extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ C14156c f41653a;

        /* renamed from: b */
        final /* synthetic */ C6033d f41654b;

        /* renamed from: c */
        final /* synthetic */ WebView f41655c;

        C14154a(C14156c cVar, C6033d dVar, WebView webView) {
            this.f41653a = cVar;
            this.f41654b = dVar;
            this.f41655c = webView;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C14153p.this.m61244a(this.f41653a, this.f41654b, this.f41655c);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C14153p.this.f41651f = true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean a = C14153p.this.m61250a(str);
            if (!a) {
                webView.loadUrl(str);
            } else if (C14153p.this.f41652g != null) {
                C14153p.this.f41652g.dismiss();
            }
            return a;
        }
    }

    /* renamed from: io.branch.referral.p$b */
    /* compiled from: BranchViewHandler */
    class C14155b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C6033d f41658a;

        /* renamed from: b */
        final /* synthetic */ C14156c f41659b;

        C14155b(C6033d dVar, C14156c cVar) {
            this.f41658a = dVar;
            this.f41659b = cVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C14153p.this.f41646a = false;
            C14153p.this.f41652g = null;
            if (this.f41658a == null) {
                return;
            }
            if (C14153p.this.f41647b) {
                this.f41658a.mo24795b(this.f41659b.f41662b, this.f41659b.f41661a);
            } else {
                this.f41658a.mo24765a(this.f41659b.f41662b, this.f41659b.f41661a);
            }
        }
    }

    /* renamed from: io.branch.referral.p$c */
    /* compiled from: BranchViewHandler */
    private class C14156c {

        /* renamed from: g */
        private static final int f41660g = -1;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f41661a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f41662b;

        /* renamed from: c */
        private int f41663c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f41664d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f41665e;

        /* synthetic */ C14156c(C14153p pVar, JSONObject jSONObject, String str, C14154a aVar) {
            this(jSONObject, str);
        }

        private C14156c(JSONObject jSONObject, String str) {
            String str2 = "";
            this.f41661a = str2;
            this.f41662b = str2;
            this.f41663c = 1;
            this.f41664d = str2;
            this.f41665e = str2;
            try {
                this.f41662b = str;
                if (jSONObject.has(C14169a.BranchViewID.mo44764d())) {
                    this.f41661a = jSONObject.getString(C14169a.BranchViewID.mo44764d());
                }
                if (jSONObject.has(C14169a.BranchViewNumOfUse.mo44764d())) {
                    this.f41663c = jSONObject.getInt(C14169a.BranchViewNumOfUse.mo44764d());
                }
                if (jSONObject.has(C14169a.BranchViewUrl.mo44764d())) {
                    this.f41664d = jSONObject.getString(C14169a.BranchViewUrl.mo44764d());
                }
                if (jSONObject.has(C14169a.BranchViewHtml.mo44764d())) {
                    this.f41665e = jSONObject.getString(C14169a.BranchViewHtml.mo44764d());
                }
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m61263a(Context context) {
            int d = C14204x.m61505a(context).mo44964d(this.f41661a);
            int i = this.f41663c;
            return i > d || i == -1;
        }

        /* renamed from: a */
        public void mo44734a(Context context, String str) {
            C14204x.m61505a(context).mo44929B(str);
        }
    }

    /* renamed from: io.branch.referral.p$e */
    /* compiled from: BranchViewHandler */
    private class C14157e extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        private final C14156c f41667a;

        /* renamed from: b */
        private final Context f41668b;

        /* renamed from: c */
        private final C6033d f41669c;

        /* renamed from: d */
        private String f41670d;

        public C14157e(C14156c cVar, Context context, C6033d dVar) {
            this.f41667a = cVar;
            this.f41668b = context;
            this.f41669c = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            int i;
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f41667a.f41664d).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                i = httpURLConnection.getResponseCode();
                if (i == 200) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        this.f41667a.f41665e = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                i = -1;
            }
            if (i == 200) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue()) {
                C14153p.this.m61243a(this.f41667a, this.f41668b, this.f41669c);
            } else {
                C6033d dVar = this.f41669c;
                if (dVar != null) {
                    dVar.mo24750a(C14153p.f41644n, "Unable to create a Branch view due to a temporary network error", this.f41667a.f41662b);
                }
            }
            C14153p.this.f41649d = false;
        }
    }

    private C14153p() {
    }

    /* renamed from: b */
    public boolean mo44728b(Context context) {
        boolean b = m61253b(this.f41648c, context, null);
        if (b) {
            this.f41648c = null;
        }
        return b;
    }

    /* renamed from: b */
    private boolean m61253b(C14156c cVar, Context context, C6033d dVar) {
        if (this.f41646a || this.f41649d) {
            if (dVar != null) {
                dVar.mo24750a(f41642l, "Unable to create a Branch view. A Branch view is already showing", cVar.f41662b);
            }
            return false;
        }
        this.f41646a = false;
        this.f41647b = false;
        if (!(context == null || cVar == null)) {
            if (cVar.m61263a(context)) {
                if (!TextUtils.isEmpty(cVar.f41665e)) {
                    m61243a(cVar, context, dVar);
                } else {
                    this.f41649d = true;
                    new C14157e(cVar, context, dVar).execute(new Void[0]);
                }
                return true;
            } else if (dVar != null) {
                dVar.mo24750a(f41645o, "Unable to create this Branch view. Reached maximum usage limit ", cVar.f41662b);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C14153p m61241a() {
        if (f41638h == null) {
            f41638h = new C14153p();
        }
        return f41638h;
    }

    /* renamed from: a */
    public boolean mo44727a(JSONObject jSONObject, String str, Context context, C6033d dVar) {
        return m61253b(new C14156c(this, jSONObject, str, null), context, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m61243a(C14156c cVar, Context context, C6033d dVar) {
        if (context != null && cVar != null) {
            WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            if (VERSION.SDK_INT >= 19) {
                webView.setLayerType(2, null);
            }
            this.f41651f = false;
            if (!TextUtils.isEmpty(cVar.f41665e)) {
                webView.loadDataWithBaseURL(null, cVar.f41665e, NetworkLog.HTML, "utf-8", null);
                webView.setWebViewClient(new C14154a(cVar, dVar, webView));
            }
        }
    }

    /* renamed from: b */
    private void m61252b(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m61244a(C14156c cVar, C6033d dVar, WebView webView) {
        if (this.f41651f || C6009d.m27463J() == null || C6009d.m27463J().f17270q == null) {
            this.f41646a = false;
            if (dVar != null) {
                dVar.mo24750a(f41644n, "Unable to create a Branch view due to a temporary network error", cVar.f41662b);
            }
        } else {
            Activity activity = (Activity) C6009d.m27463J().f17270q.get();
            if (activity != null) {
                cVar.mo44734a(activity.getApplicationContext(), cVar.f41661a);
                this.f41650e = activity.getClass().getName();
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                relativeLayout.setVisibility(8);
                relativeLayout.addView(webView, new LayoutParams(-1, -1));
                relativeLayout.setBackgroundColor(0);
                Dialog dialog = this.f41652g;
                if (dialog == null || !dialog.isShowing()) {
                    this.f41652g = new Dialog(activity, 16973834);
                    this.f41652g.setContentView(relativeLayout);
                    relativeLayout.setVisibility(0);
                    webView.setVisibility(0);
                    this.f41652g.show();
                    m61252b((View) relativeLayout);
                    m61252b((View) webView);
                    this.f41646a = true;
                    if (dVar != null) {
                        dVar.mo24801c(cVar.f41662b, cVar.f41661a);
                    }
                    this.f41652g.setOnDismissListener(new C14155b(dVar, cVar));
                } else {
                    if (dVar != null) {
                        dVar.mo24750a(f41642l, "Unable to create a Branch view. A Branch view is already showing", cVar.f41662b);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m61250a(String str) {
        try {
            URI uri = new URI(str);
            if (!uri.getScheme().equalsIgnoreCase(f41639i)) {
                return false;
            }
            if (uri.getHost().equalsIgnoreCase("accept")) {
                this.f41647b = true;
            } else if (!uri.getHost().equalsIgnoreCase("cancel")) {
                return false;
            } else {
                this.f41647b = false;
            }
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m61242a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(8);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public boolean mo44726a(JSONObject jSONObject, String str) {
        C14156c cVar = new C14156c(this, jSONObject, str, null);
        if (C6009d.m27463J().f17270q != null) {
            Activity activity = (Activity) C6009d.m27463J().f17270q.get();
            if (activity != null && cVar.m61263a((Context) activity)) {
                this.f41648c = new C14156c(this, jSONObject, str, null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo44725a(Context context) {
        C14156c cVar = this.f41648c;
        return cVar != null && cVar.m61263a(context);
    }

    /* renamed from: a */
    public void mo44724a(Activity activity) {
        String str = this.f41650e;
        if (str != null && str.equalsIgnoreCase(activity.getClass().getName())) {
            this.f41646a = false;
        }
    }
}
