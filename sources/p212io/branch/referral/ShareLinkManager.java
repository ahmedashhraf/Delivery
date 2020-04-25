package p212io.branch.referral;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p212io.branch.referral.C14158p0.C14159a;
import p212io.branch.referral.C6009d.C6013d;
import p212io.branch.referral.C6009d.C6014e;
import p212io.branch.referral.C6009d.C6024o;
import p212io.branch.referral.C6009d.C6028s;

/* renamed from: io.branch.referral.ShareLinkManager */
class ShareLinkManager {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static int f41465q = 100;

    /* renamed from: a */
    C14113a f41466a;

    /* renamed from: b */
    C6014e f41467b;

    /* renamed from: c */
    C6024o f41468c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<ResolveInfo> f41469d;

    /* renamed from: e */
    private Intent f41470e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f41471f = Color.argb(60, 17, 4, 56);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f41472g = Color.argb(20, 17, 4, 56);

    /* renamed from: h */
    Context f41473h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f41474i = false;

    /* renamed from: j */
    private int f41475j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f41476k = 50;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C6028s f41477l;

    /* renamed from: m */
    final int f41478m = 5;

    /* renamed from: n */
    final int f41479n = 100;

    /* renamed from: o */
    private List<String> f41480o = new ArrayList();

    /* renamed from: p */
    private List<String> f41481p = new ArrayList();

    /* renamed from: io.branch.referral.ShareLinkManager$CopyLinkItem */
    private class CopyLinkItem extends ResolveInfo {
        private CopyLinkItem() {
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return ShareLinkManager.this.f41477l.mo24891f();
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return ShareLinkManager.this.f41477l.mo24889e();
        }

        /* synthetic */ CopyLinkItem(ShareLinkManager shareLinkManager, C14108a aVar) {
            this();
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$MoreShareItem */
    private class MoreShareItem extends ResolveInfo {
        private MoreShareItem() {
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return ShareLinkManager.this.f41477l.mo24904n();
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return ShareLinkManager.this.f41477l.mo24905o();
        }

        /* synthetic */ MoreShareItem(ShareLinkManager shareLinkManager, C14108a aVar) {
            this();
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$a */
    class C14108a implements OnItemClickListener {

        /* renamed from: N */
        final /* synthetic */ ListView f41484N;

        /* renamed from: a */
        final /* synthetic */ List f41486a;

        /* renamed from: b */
        final /* synthetic */ C14111d f41487b;

        C14108a(List list, C14111d dVar, ListView listView) {
            this.f41486a = list;
            this.f41487b = dVar;
            this.f41484N = listView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view.getTag() instanceof MoreShareItem) {
                ShareLinkManager.this.f41469d = this.f41486a;
                this.f41487b.notifyDataSetChanged();
                return;
            }
            if (ShareLinkManager.this.f41467b != null) {
                String charSequence = (view.getTag() == null || ShareLinkManager.this.f41473h == null || ((ResolveInfo) view.getTag()).loadLabel(ShareLinkManager.this.f41473h.getPackageManager()) == null) ? "" : ((ResolveInfo) view.getTag()).loadLabel(ShareLinkManager.this.f41473h.getPackageManager()).toString();
                ShareLinkManager.this.f41477l.mo24911u().mo44695d(((ResolveInfo) view.getTag()).loadLabel(ShareLinkManager.this.f41473h.getPackageManager()).toString());
                ShareLinkManager.this.f41467b.mo24842a(charSequence);
            }
            this.f41487b.f41492a = i - this.f41484N.getHeaderViewsCount();
            this.f41487b.notifyDataSetChanged();
            ShareLinkManager.this.m61001a((ResolveInfo) view.getTag());
            C14113a aVar = ShareLinkManager.this.f41466a;
            if (aVar != null) {
                aVar.cancel();
            }
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$b */
    class C14109b implements OnDismissListener {
        C14109b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C6014e eVar = ShareLinkManager.this.f41467b;
            if (eVar != null) {
                eVar.mo24841a();
                ShareLinkManager.this.f41467b = null;
            }
            if (!ShareLinkManager.this.f41474i) {
                ShareLinkManager shareLinkManager = ShareLinkManager.this;
                shareLinkManager.f41473h = null;
                shareLinkManager.f41477l = null;
            }
            ShareLinkManager.this.f41466a = null;
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$c */
    class C14110c implements C6013d {

        /* renamed from: a */
        final /* synthetic */ ResolveInfo f41489a;

        /* renamed from: b */
        final /* synthetic */ String f41490b;

        C14110c(ResolveInfo resolveInfo, String str) {
            this.f41489a = resolveInfo;
            this.f41490b = str;
        }

        /* renamed from: a */
        public void mo24840a(String str, C14130h hVar) {
            if (hVar == null) {
                ShareLinkManager.this.m61002a(this.f41489a, str, this.f41490b);
                return;
            }
            String g = ShareLinkManager.this.f41477l.mo24894g();
            if (g == null || g.trim().length() <= 0) {
                C6014e eVar = ShareLinkManager.this.f41467b;
                if (eVar != null) {
                    eVar.mo24843a(str, this.f41490b, hVar);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to share link ");
                    sb.append(hVar.mo44646b());
                    sb.toString();
                }
                if (hVar.mo44645a() == -113 || hVar.mo44645a() == -117) {
                    ShareLinkManager.this.m61002a(this.f41489a, str, this.f41490b);
                    return;
                }
                ShareLinkManager.this.mo44593a(false);
                ShareLinkManager.this.f41474i = false;
                return;
            }
            ShareLinkManager.this.m61002a(this.f41489a, g, this.f41490b);
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$d */
    private class C14111d extends BaseAdapter {

        /* renamed from: a */
        public int f41492a;

        private C14111d() {
            this.f41492a = -1;
        }

        public int getCount() {
            return ShareLinkManager.this.f41469d.size();
        }

        public Object getItem(int i) {
            return ShareLinkManager.this.f41469d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C14112e eVar;
            if (view == null) {
                ShareLinkManager shareLinkManager = ShareLinkManager.this;
                eVar = new C14112e(shareLinkManager.f41473h);
            } else {
                eVar = (C14112e) view;
            }
            ResolveInfo resolveInfo = (ResolveInfo) ShareLinkManager.this.f41469d.get(i);
            eVar.mo44605a(resolveInfo.loadLabel(ShareLinkManager.this.f41473h.getPackageManager()).toString(), resolveInfo.loadIcon(ShareLinkManager.this.f41473h.getPackageManager()), i == this.f41492a);
            eVar.setTag(resolveInfo);
            eVar.setClickable(false);
            return eVar;
        }

        public boolean isEnabled(int i) {
            return this.f41492a < 0;
        }

        /* synthetic */ C14111d(ShareLinkManager shareLinkManager, C14108a aVar) {
            this();
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$e */
    private class C14112e extends TextView {

        /* renamed from: a */
        Context f41495a;

        /* renamed from: b */
        int f41496b;

        public C14112e(Context context) {
            super(context);
            this.f41495a = context;
            setPadding(100, 5, 5, 5);
            setGravity(8388627);
            setMinWidth(this.f41495a.getResources().getDisplayMetrics().widthPixels);
            this.f41496b = ShareLinkManager.this.f41476k != 0 ? C6031o.m27708a(context, ShareLinkManager.this.f41476k) : 0;
        }

        /* renamed from: a */
        public void mo44605a(String str, Drawable drawable, boolean z) {
            StringBuilder sb = new StringBuilder();
            sb.append("\t");
            sb.append(str);
            setText(sb.toString());
            setTag(str);
            if (drawable == null) {
                setTextAppearance(this.f41495a, 16973890);
                setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            } else {
                int i = this.f41496b;
                if (i != 0) {
                    drawable.setBounds(0, 0, i, i);
                    setCompoundDrawables(drawable, null, null, null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
                }
                setTextAppearance(this.f41495a, 16973892);
                ShareLinkManager.f41465q = Math.max(ShareLinkManager.f41465q, drawable.getIntrinsicHeight() + 5);
            }
            setMinHeight(ShareLinkManager.f41465q);
            setTextColor(this.f41495a.getResources().getColor(17170444));
            if (z) {
                setBackgroundColor(ShareLinkManager.this.f41471f);
            } else {
                setBackgroundColor(ShareLinkManager.this.f41472g);
            }
        }
    }

    ShareLinkManager() {
    }

    /* renamed from: a */
    public Dialog mo44592a(C6028s sVar) {
        this.f41477l = sVar;
        this.f41473h = sVar.mo24859a();
        this.f41467b = sVar.mo24882c();
        this.f41468c = sVar.mo24885d();
        this.f41470e = new Intent("android.intent.action.SEND");
        this.f41470e.setType("text/plain");
        this.f41475j = sVar.mo24912v();
        this.f41480o = sVar.mo24902l();
        this.f41481p = sVar.mo24900j();
        this.f41476k = sVar.mo24901k();
        try {
            m61006a((List<C14159a>) sVar.mo24906p());
        } catch (Exception e) {
            e.printStackTrace();
            C6014e eVar = this.f41467b;
            if (eVar != null) {
                eVar.mo24843a(null, null, new C14130h("Trouble sharing link", C14130h.f41557l));
            }
        }
        return this.f41466a;
    }

    /* renamed from: a */
    public void mo44593a(boolean z) {
        C14113a aVar = this.f41466a;
        if (aVar != null && aVar.isShowing()) {
            if (z) {
                this.f41466a.cancel();
            } else {
                this.f41466a.dismiss();
            }
        }
    }

    /* renamed from: a */
    private void m61006a(List<C14159a> list) {
        ListView listView;
        PackageManager packageManager = this.f41473h.getPackageManager();
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(this.f41470e, 65536);
        List<ResolveInfo> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(list);
        Iterator it = queryIntentActivities.iterator();
        while (true) {
            C14159a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            String str = resolveInfo.activityInfo.packageName;
            Iterator it2 = arrayList4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C14159a aVar2 = (C14159a) it2.next();
                if (resolveInfo.activityInfo != null && str.toLowerCase().contains(aVar2.toString().toLowerCase())) {
                    aVar = aVar2;
                    break;
                }
            }
            if (aVar != null) {
                arrayList.add(resolveInfo);
                list.remove(aVar);
            }
        }
        queryIntentActivities.removeAll(arrayList);
        queryIntentActivities.addAll(0, arrayList);
        if (this.f41480o.size() > 0) {
            for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                if (this.f41480o.contains(resolveInfo2.activityInfo.packageName)) {
                    arrayList2.add(resolveInfo2);
                }
            }
        } else {
            arrayList2 = queryIntentActivities;
        }
        for (ResolveInfo resolveInfo3 : arrayList2) {
            if (!this.f41481p.contains(resolveInfo3.activityInfo.packageName)) {
                arrayList3.add(resolveInfo3);
            }
        }
        for (ResolveInfo resolveInfo4 : queryIntentActivities) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                if (((C14159a) it3.next()).toString().equalsIgnoreCase(resolveInfo4.activityInfo.packageName)) {
                    arrayList3.add(resolveInfo4);
                }
            }
        }
        arrayList3.add(new CopyLinkItem(this, null));
        queryIntentActivities.add(new CopyLinkItem(this, null));
        arrayList.add(new CopyLinkItem(this, null));
        if (arrayList.size() > 1) {
            if (queryIntentActivities.size() > arrayList.size()) {
                arrayList.add(new MoreShareItem(this, null));
            }
            this.f41469d = arrayList;
        } else {
            this.f41469d = arrayList3;
        }
        C14111d dVar = new C14111d(this, null);
        int i = this.f41475j;
        if (i <= 1 || VERSION.SDK_INT < 21) {
            listView = new ListView(this.f41473h);
        } else {
            listView = new ListView(this.f41473h, null, 0, i);
        }
        listView.setHorizontalFadingEdgeEnabled(false);
        listView.setBackgroundColor(-1);
        listView.setSelector(new ColorDrawable(0));
        if (this.f41477l.mo24910t() != null) {
            listView.addHeaderView(this.f41477l.mo24910t(), null, false);
        } else if (!TextUtils.isEmpty(this.f41477l.mo24909s())) {
            TextView textView = new TextView(this.f41473h);
            textView.setText(this.f41477l.mo24909s());
            textView.setBackgroundColor(this.f41472g);
            textView.setTextColor(this.f41472g);
            textView.setTextAppearance(this.f41473h, 16973892);
            textView.setTextColor(this.f41473h.getResources().getColor(17170432));
            textView.setPadding(100, 5, 5, 5);
            listView.addHeaderView(textView, null, false);
        }
        listView.setAdapter(dVar);
        if (this.f41477l.mo24897i() >= 0) {
            listView.setDividerHeight(this.f41477l.mo24897i());
        } else if (this.f41477l.mo24903m()) {
            listView.setDividerHeight(0);
        }
        listView.setOnItemClickListener(new C14108a(arrayList3, dVar, listView));
        if (this.f41477l.mo24895h() > 0) {
            this.f41466a = new C14113a(this.f41473h, this.f41477l.mo24895h());
        } else {
            this.f41466a = new C14113a(this.f41473h, this.f41477l.mo24903m());
        }
        this.f41466a.setContentView(listView);
        this.f41466a.show();
        C6014e eVar = this.f41467b;
        if (eVar != null) {
            eVar.mo24844b();
        }
        this.f41466a.setOnDismissListener(new C14109b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m61001a(ResolveInfo resolveInfo) {
        this.f41474i = true;
        this.f41477l.mo24911u().mo44693b(new C14110c(resolveInfo, resolveInfo.loadLabel(this.f41473h.getPackageManager()).toString()), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m61002a(ResolveInfo resolveInfo, String str, String str2) {
        C6014e eVar = this.f41467b;
        if (eVar != null) {
            eVar.mo24843a(str, str2, null);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Shared link with ");
            sb.append(str2);
            sb.toString();
        }
        if (resolveInfo instanceof CopyLinkItem) {
            m61005a(str, this.f41477l.mo24907q());
            return;
        }
        this.f41470e.setPackage(resolveInfo.activityInfo.packageName);
        String r = this.f41477l.mo24908r();
        String q = this.f41477l.mo24907q();
        C6024o oVar = this.f41468c;
        if (oVar != null) {
            String a = oVar.mo24856a(str2);
            String b = this.f41468c.mo24857b(str2);
            if (!TextUtils.isEmpty(a)) {
                r = a;
            }
            if (!TextUtils.isEmpty(b)) {
                q = b;
            }
        }
        if (r != null && r.trim().length() > 0) {
            this.f41470e.putExtra("android.intent.extra.SUBJECT", r);
        }
        Intent intent = this.f41470e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q);
        sb2.append("\n");
        sb2.append(str);
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        this.f41473h.startActivity(this.f41470e);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m61005a(String str, String str2) {
        String str3 = "clipboard";
        if (VERSION.SDK_INT < 11) {
            ((ClipboardManager) this.f41473h.getSystemService(str3)).setText(str);
        } else {
            ((android.content.ClipboardManager) this.f41473h.getSystemService(str3)).setPrimaryClip(ClipData.newPlainText(str2, str));
        }
        Toast.makeText(this.f41473h, this.f41477l.mo24913w(), 0).show();
    }
}
