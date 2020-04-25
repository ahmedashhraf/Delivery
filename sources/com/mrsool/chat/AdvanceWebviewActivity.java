package com.mrsool.chat;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toolbar;
import androidx.appcompat.app.C0295d;
import androidx.core.app.C0727a;
import androidx.core.content.C0841b;
import com.krishna.fileloader.p408i.C10186b;
import com.mrsool.C10232R;
import com.mrsool.p409me.C10925h;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

public class AdvanceWebviewActivity extends C0295d implements OnClickListener {

    /* renamed from: Z */
    private static final int f27633Z = 1;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final String f27634a0 = AdvanceWebviewActivity.class.getSimpleName();

    /* renamed from: b0 */
    private static final int f27635b0 = 1;

    /* renamed from: c0 */
    private static String[] f27636c0 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"};
    /* access modifiers changed from: private */

    /* renamed from: N */
    public ValueCallback<Uri[]> f27637N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public String f27638O = null;

    /* renamed from: P */
    private long f27639P = 0;

    /* renamed from: Q */
    private TextView f27640Q;

    /* renamed from: R */
    private View f27641R;

    /* renamed from: S */
    private WebView f27642S;

    /* renamed from: T */
    private C5887x f27643T;

    /* renamed from: U */
    private Toolbar f27644U;

    /* renamed from: V */
    private LinearLayout f27645V;

    /* renamed from: W */
    private ImageView f27646W;

    /* renamed from: X */
    public ProgressBar f27647X;

    /* renamed from: Y */
    private ImageView f27648Y;

    /* renamed from: a */
    private WebView f27649a;

    /* renamed from: b */
    private WebSettings f27650b;

    /* renamed from: com.mrsool.chat.AdvanceWebviewActivity$a */
    class C10301a {
        C10301a() {
        }

        @JavascriptInterface
        public void backToChat(String str) {
            AdvanceWebviewActivity.this.setResult(-1);
            AdvanceWebviewActivity.this.finish();
        }
    }

    /* renamed from: com.mrsool.chat.AdvanceWebviewActivity$b */
    public class C10302b extends WebChromeClient {
        public C10302b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onShowFileChooser(android.webkit.WebView r3, android.webkit.ValueCallback<android.net.Uri[]> r4, android.webkit.WebChromeClient.FileChooserParams r5) {
            /*
                r2 = this;
                com.mrsool.chat.AdvanceWebviewActivity r3 = com.mrsool.chat.AdvanceWebviewActivity.this
                android.webkit.ValueCallback r3 = r3.f27637N
                r5 = 0
                if (r3 == 0) goto L_0x0012
                com.mrsool.chat.AdvanceWebviewActivity r3 = com.mrsool.chat.AdvanceWebviewActivity.this
                android.webkit.ValueCallback r3 = r3.f27637N
                r3.onReceiveValue(r5)
            L_0x0012:
                com.mrsool.chat.AdvanceWebviewActivity r3 = com.mrsool.chat.AdvanceWebviewActivity.this
                r3.f27637N = r4
                r4.toString()
                android.content.Intent r3 = new android.content.Intent
                java.lang.String r4 = "android.media.action.IMAGE_CAPTURE"
                r3.<init>(r4)
                com.mrsool.chat.AdvanceWebviewActivity r4 = com.mrsool.chat.AdvanceWebviewActivity.this
                android.content.pm.PackageManager r4 = r4.getPackageManager()
                android.content.ComponentName r4 = r3.resolveActivity(r4)
                if (r4 == 0) goto L_0x006a
                com.mrsool.chat.AdvanceWebviewActivity r4 = com.mrsool.chat.AdvanceWebviewActivity.this     // Catch:{ IOException -> 0x003f }
                java.io.File r4 = r4.m47834D()     // Catch:{ IOException -> 0x003f }
                java.lang.String r0 = "PhotoPath"
                com.mrsool.chat.AdvanceWebviewActivity r1 = com.mrsool.chat.AdvanceWebviewActivity.this     // Catch:{ IOException -> 0x0040 }
                java.lang.String r1 = r1.f27638O     // Catch:{ IOException -> 0x0040 }
                r3.putExtra(r0, r1)     // Catch:{ IOException -> 0x0040 }
                goto L_0x0043
            L_0x003f:
                r4 = r5
            L_0x0040:
                com.mrsool.chat.AdvanceWebviewActivity.f27634a0
            L_0x0043:
                if (r4 == 0) goto L_0x0069
                com.mrsool.chat.AdvanceWebviewActivity r5 = com.mrsool.chat.AdvanceWebviewActivity.this
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "file:"
                r0.append(r1)
                java.lang.String r1 = r4.getAbsolutePath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r5.f27638O = r0
                android.net.Uri r4 = android.net.Uri.fromFile(r4)
                java.lang.String r5 = "output"
                r3.putExtra(r5, r4)
                goto L_0x006a
            L_0x0069:
                r3 = r5
            L_0x006a:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.intent.action.GET_CONTENT"
                r4.<init>(r5)
                java.lang.String r5 = "android.intent.category.OPENABLE"
                r4.addCategory(r5)
                r5 = 1
                java.lang.String r0 = "android.intent.extra.ALLOW_MULTIPLE"
                r4.putExtra(r0, r5)
                java.lang.String r0 = "image/*"
                r4.setType(r0)
                if (r3 == 0) goto L_0x0089
                android.content.Intent[] r0 = new android.content.Intent[r5]
                r1 = 0
                r0[r1] = r3
                goto L_0x008c
            L_0x0089:
                r3 = 2
                android.content.Intent[] r0 = new android.content.Intent[r3]
            L_0x008c:
                android.content.Intent r3 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.CHOOSER"
                r3.<init>(r1)
                java.lang.String r1 = "android.intent.extra.INTENT"
                r3.putExtra(r1, r4)
                java.lang.String r4 = "android.intent.extra.TITLE"
                java.lang.String r1 = "Image Chooser"
                r3.putExtra(r4, r1)
                java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
                r3.putExtra(r4, r0)
                com.mrsool.chat.AdvanceWebviewActivity r4 = com.mrsool.chat.AdvanceWebviewActivity.this
                java.lang.String r0 = "Select images"
                android.content.Intent r3 = android.content.Intent.createChooser(r3, r0)
                r4.startActivityForResult(r3, r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.chat.AdvanceWebviewActivity.C10302b.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public File m47834D() throws IOException {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("JPEG_");
        sb.append(format);
        sb.append(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
        return File.createTempFile(sb.toString(), C10186b.f27189b, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    /* renamed from: E */
    private void m47835E() {
        this.f27643T = new C5887x(this);
        C5887x xVar = this.f27643T;
        xVar.mo23477G(xVar.mo23496R() ? C11644i.f33191S5 : C11644i.f33183R5);
        this.f27647X = (ProgressBar) findViewById(C10232R.C10236id.pgComplaint);
        m47836G();
        this.f27640Q.setText(getIntent().getExtras().getString(C11644i.f33391q1));
        m47837H();
    }

    /* renamed from: G */
    private void m47836G() {
        this.f27640Q = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f27648Y = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f27648Y.setOnClickListener(this);
        if (this.f27643T.mo23496R()) {
            this.f27648Y.setScaleX(-1.0f);
        }
    }

    /* renamed from: H */
    private void m47837H() {
        m47841a((Activity) this);
        this.f27649a = (WebView) findViewById(C10232R.C10236id.wvTermsService);
        this.f27650b = this.f27649a.getSettings();
        this.f27650b.setAppCacheEnabled(false);
        this.f27650b.setCacheMode(2);
        this.f27650b.setJavaScriptEnabled(true);
        this.f27650b.setLoadWithOverviewMode(true);
        this.f27650b.setAllowFileAccess(true);
        this.f27649a.getSettings().setDomStorageEnabled(true);
        this.f27649a.setWebViewClient(new C10925h(this));
        this.f27649a.setWebChromeClient(new C10302b());
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            this.f27649a.setLayerType(2, null);
        } else if (i < 19) {
            this.f27649a.setLayerType(1, null);
        }
        this.f27649a.loadUrl(getIntent().getExtras().getString(C11644i.f33383p1));
        this.f27649a.addJavascriptInterface(new C10301a(), "automated_complaint");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ClipData clipData;
        if (i != 1 || this.f27637N == null) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        try {
            this.f27639P = new File(this.f27638O.replace("file:", "")).length();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error while opening image file");
            sb.append(e.getLocalizedMessage());
            sb.toString();
        }
        if (!(intent == null && this.f27638O == null)) {
            Integer valueOf = Integer.valueOf(0);
            try {
                clipData = intent.getClipData();
            } catch (Exception e2) {
                e2.getLocalizedMessage();
                clipData = null;
            }
            if (clipData == null && intent != null && intent.getDataString() != null) {
                valueOf = Integer.valueOf(intent.getDataString().length());
            } else if (clipData != null) {
                valueOf = Integer.valueOf(clipData.getItemCount());
            }
            Uri[] uriArr = new Uri[valueOf.intValue()];
            if (i2 == -1) {
                if (this.f27639P != 0) {
                    String str = this.f27638O;
                    if (str != null) {
                        uriArr = new Uri[]{Uri.parse(str)};
                    }
                } else if (intent.getClipData() == null) {
                    uriArr = new Uri[]{Uri.parse(intent.getDataString())};
                } else {
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        uriArr[i3] = clipData.getItemAt(i3).getUri();
                    }
                }
            }
            this.f27637N.onReceiveValue(uriArr);
            this.f27637N = null;
        }
    }

    public void onBackPressed() {
        setResult(-1);
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_terms_condition);
        m47835E();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f27649a.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f27649a.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f27643T;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }

    /* renamed from: a */
    public static void m47841a(Activity activity) {
        int a = C0841b.m4916a((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        int a2 = C0841b.m4916a((Context) activity, "android.permission.READ_EXTERNAL_STORAGE");
        int a3 = C0841b.m4916a((Context) activity, "android.permission.CAMERA");
        if (a != 0 || a2 != 0 || a3 != 0) {
            C0727a.m4243a(activity, f27636c0, 1);
        }
    }
}
