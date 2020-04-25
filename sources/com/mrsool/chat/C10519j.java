package com.mrsool.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.OptionMenuItemsBean;
import com.mrsool.p418u.C11557a;
import java.util.List;

/* renamed from: com.mrsool.chat.j */
/* compiled from: ChatOptionMenuListAdapter */
public class C10519j extends C1638g<C10521b> {

    /* renamed from: c */
    private Context f28506c;

    /* renamed from: d */
    private List<OptionMenuItemsBean> f28507d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11557a f28508e;

    /* renamed from: com.mrsool.chat.j$a */
    /* compiled from: ChatOptionMenuListAdapter */
    class C10520a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10521b f28509a;

        C10520a(C10521b bVar) {
            this.f28509a = bVar;
        }

        public void onClick(View view) {
            C10519j.this.f28508e.mo37901a(this.f28509a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.chat.j$b */
    /* compiled from: ChatOptionMenuListAdapter */
    public static class C10521b extends C1635d0 {

        /* renamed from: s0 */
        TextView f28511s0;

        /* renamed from: t0 */
        TextView f28512t0;

        /* renamed from: u0 */
        LinearLayout f28513u0;

        public C10521b(View view) {
            super(view);
            this.f28511s0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f28512t0 = (TextView) view.findViewById(C10232R.C10236id.tvDisableHint);
            this.f28513u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llChatOptionRoot);
        }
    }

    public C10519j(Context context, List<OptionMenuItemsBean> list, C11557a aVar) {
        this.f28506c = context;
        this.f28507d = list;
        this.f28508e = aVar;
    }

    /* renamed from: a */
    public void mo7330b(C10521b bVar, int i) {
        OptionMenuItemsBean optionMenuItemsBean = (OptionMenuItemsBean) this.f28507d.get(i);
        bVar.f28511s0.setText(optionMenuItemsBean.getTitle());
        if (!optionMenuItemsBean.isEnable()) {
            bVar.f28512t0.setVisibility(0);
            bVar.f28512t0.setText(optionMenuItemsBean.getDisableMessage());
            bVar.f28511s0.setTextColor(C0841b.m4915a(this.f28506c, (int) C10232R.C10234color.text_color_96));
        } else {
            bVar.f28512t0.setVisibility(8);
            bVar.f28511s0.setTextColor(C0841b.m4915a(this.f28506c, (int) C10232R.C10234color.sky_blue_color));
        }
        bVar.f28513u0.setOnClickListener(new C10520a(bVar));
    }

    /* renamed from: b */
    public C10521b m48624b(ViewGroup viewGroup, int i) {
        return new C10521b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_chat_options_menu, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<OptionMenuItemsBean> list = this.f28507d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
