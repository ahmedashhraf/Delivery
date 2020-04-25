package androidx.browser.browseractions;

import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.net.Uri;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.browser.C0578R;
import androidx.core.widget.C1120m;
import java.util.List;

/* renamed from: androidx.browser.browseractions.d */
/* compiled from: BrowserActionsFallbackMenuUi */
class C0613d implements OnItemClickListener {

    /* renamed from: Q */
    private static final String f2415Q = "BrowserActionskMenuUi";

    /* renamed from: N */
    private final List<C0608a> f2416N;

    /* renamed from: O */
    C0616c f2417O;

    /* renamed from: P */
    private C0611c f2418P;

    /* renamed from: a */
    private final Context f2419a;

    /* renamed from: b */
    private final Uri f2420b;

    /* renamed from: androidx.browser.browseractions.d$a */
    /* compiled from: BrowserActionsFallbackMenuUi */
    class C0614a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ View f2421a;

        C0614a(View view) {
            this.f2421a = view;
        }

        public void onShow(DialogInterface dialogInterface) {
            C0613d.this.f2417O.mo3100a(this.f2421a);
        }
    }

    /* renamed from: androidx.browser.browseractions.d$b */
    /* compiled from: BrowserActionsFallbackMenuUi */
    class C0615b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f2423a;

        C0615b(TextView textView) {
            this.f2423a = textView;
        }

        public void onClick(View view) {
            if (C1120m.m6397k(this.f2423a) == Integer.MAX_VALUE) {
                this.f2423a.setMaxLines(1);
                this.f2423a.setEllipsize(TruncateAt.END);
                return;
            }
            this.f2423a.setMaxLines(Integer.MAX_VALUE);
            this.f2423a.setEllipsize(null);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    /* renamed from: androidx.browser.browseractions.d$c */
    /* compiled from: BrowserActionsFallbackMenuUi */
    interface C0616c {
        /* renamed from: a */
        void mo3100a(View view);
    }

    C0613d(Context context, Uri uri, List<C0608a> list) {
        this.f2419a = context;
        this.f2420b = uri;
        this.f2416N = list;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    /* renamed from: a */
    public void mo3096a(C0616c cVar) {
        this.f2417O = cVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            ((C0608a) this.f2416N.get(i)).mo3084a().send();
            this.f2418P.dismiss();
        } catch (CanceledException unused) {
        }
    }

    /* renamed from: a */
    public void mo3095a() {
        View inflate = LayoutInflater.from(this.f2419a).inflate(C0578R.layout.browser_actions_context_menu_page, null);
        this.f2418P = new C0611c(this.f2419a, m3244a(inflate));
        this.f2418P.setContentView(inflate);
        if (this.f2417O != null) {
            this.f2418P.setOnShowListener(new C0614a(inflate));
        }
        this.f2418P.show();
    }

    /* renamed from: a */
    private BrowserActionsFallbackMenuView m3244a(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(C0578R.C0581id.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(C0578R.C0581id.browser_actions_header_text);
        textView.setText(this.f2420b.toString());
        textView.setOnClickListener(new C0615b(textView));
        ListView listView = (ListView) view.findViewById(C0578R.C0581id.browser_actions_menu_items);
        listView.setAdapter(new C0609b(this.f2416N, this.f2419a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }
}
