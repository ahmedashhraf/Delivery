package androidx.browser.browseractions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.C0578R;
import androidx.core.content.p020h.C0874g;
import java.util.List;

/* renamed from: androidx.browser.browseractions.b */
/* compiled from: BrowserActionsFallbackMenuAdapter */
class C0609b extends BaseAdapter {

    /* renamed from: a */
    private final List<C0608a> f2406a;

    /* renamed from: b */
    private final Context f2407b;

    /* renamed from: androidx.browser.browseractions.b$a */
    /* compiled from: BrowserActionsFallbackMenuAdapter */
    static class C0610a {

        /* renamed from: a */
        ImageView f2408a;

        /* renamed from: b */
        TextView f2409b;

        C0610a() {
        }
    }

    C0609b(List<C0608a> list, Context context) {
        this.f2406a = list;
        this.f2407b = context;
    }

    public int getCount() {
        return this.f2406a.size();
    }

    public Object getItem(int i) {
        return this.f2406a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0610a aVar;
        C0608a aVar2 = (C0608a) this.f2406a.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f2407b).inflate(C0578R.layout.browser_actions_context_menu_row, null);
            aVar = new C0610a();
            aVar.f2408a = (ImageView) view.findViewById(C0578R.C0581id.browser_actions_menu_item_icon);
            aVar.f2409b = (TextView) view.findViewById(C0578R.C0581id.browser_actions_menu_item_text);
            view.setTag(aVar);
        } else {
            aVar = (C0610a) view.getTag();
        }
        aVar.f2409b.setText(aVar2.mo3086c());
        if (aVar2.mo3085b() != 0) {
            aVar.f2408a.setImageDrawable(C0874g.m5058c(this.f2407b.getResources(), aVar2.mo3085b(), null));
        } else {
            aVar.f2408a.setImageDrawable(null);
        }
        return view;
    }
}
