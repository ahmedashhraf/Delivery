package com.instabug.library.invocation.invocationdialog;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.util.Colorizer;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.invocation.invocationdialog.c */
/* compiled from: InstabugDialogAdapter */
public class C9915c extends BaseAdapter {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26360b;

    /* renamed from: a */
    private ArrayList<InstabugDialogItem> f26361a = new ArrayList<>();

    /* renamed from: com.instabug.library.invocation.invocationdialog.c$a */
    /* compiled from: InstabugDialogAdapter */
    private static class C9916a {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f26362d;

        /* renamed from: a */
        public ImageView f26363a;

        /* renamed from: b */
        public TextView f26364b;

        /* renamed from: c */
        public TextView f26365c;

        C9916a(View view) {
            boolean[] a = m46142a();
            a[0] = true;
            this.f26363a = (ImageView) view.findViewById(C9700R.C9704id.instabug_prompt_option_icon);
            a[1] = true;
            this.f26364b = (TextView) view.findViewById(C9700R.C9704id.instabug_prompt_option_title);
            a[2] = true;
            this.f26365c = (TextView) view.findViewById(C9700R.C9704id.instabug_notification_count);
            a[3] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46142a() {
            boolean[] zArr = f26362d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4369641730653756831L, "com/instabug/library/invocation/invocationdialog/InstabugDialogAdapter$ViewHolder", 4);
            f26362d = a;
            return a;
        }
    }

    public C9915c() {
        boolean[] a = m46139a();
        a[0] = true;
        a[1] = true;
    }

    /* renamed from: a */
    public static void m46137a(View view, int i, int i2, int i3, int i4) {
        boolean[] a = m46139a();
        if (!(view.getLayoutParams() instanceof MarginLayoutParams)) {
            a[2] = true;
        } else {
            a[3] = true;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            a[4] = true;
            marginLayoutParams.setMargins(i, i2, i3, i4);
            a[5] = true;
            view.requestLayout();
            a[6] = true;
        }
        a[7] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46139a() {
        boolean[] zArr = f26360b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1782278470736206215L, "com/instabug/library/invocation/invocationdialog/InstabugDialogAdapter", 34);
        f26360b = a;
        return a;
    }

    public int getCount() {
        boolean[] a = m46139a();
        int size = this.f26361a.size();
        a[8] = true;
        return size;
    }

    public /* synthetic */ Object getItem(int i) {
        boolean[] a = m46139a();
        InstabugDialogItem a2 = mo35237a(i);
        a[33] = true;
        return a2;
    }

    public long getItemId(int i) {
        long j = (long) i;
        m46139a()[10] = true;
        return j;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C9916a aVar;
        boolean[] a = m46139a();
        if (view == null) {
            a[11] = true;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            int i2 = C9700R.layout.ib_dialog_list_item;
            a[12] = true;
            view = from.inflate(i2, viewGroup, false);
            a[13] = true;
            aVar = new C9916a(view);
            a[14] = true;
            view.setTag(aVar);
            a[15] = true;
        } else {
            aVar = (C9916a) view.getTag();
            a[16] = true;
        }
        m46138a(aVar, mo35237a(i));
        a[17] = true;
        return view;
    }

    /* renamed from: a */
    public InstabugDialogItem mo35237a(int i) {
        InstabugDialogItem instabugDialogItem = (InstabugDialogItem) this.f26361a.get(i);
        m46139a()[9] = true;
        return instabugDialogItem;
    }

    /* renamed from: a */
    private void m46138a(C9916a aVar, InstabugDialogItem instabugDialogItem) {
        boolean[] a = m46139a();
        aVar.f26364b.setText(instabugDialogItem.getTitle());
        a[18] = true;
        if (instabugDialogItem.getResDrawable() != 0) {
            a[19] = true;
            aVar.f26363a.setImageResource(instabugDialogItem.getResDrawable());
            a[20] = true;
            aVar.f26363a.setVisibility(0);
            a[21] = true;
            aVar.f26363a.getDrawable().setColorFilter(Instabug.getPrimaryColor(), Mode.SRC_IN);
            a[22] = true;
        } else {
            aVar.f26363a.setVisibility(8);
            a[23] = true;
            m46137a(aVar.f26364b, 0, 0, 0, 0);
            a[24] = true;
        }
        if (instabugDialogItem.getBadgeCount() > 0) {
            a[25] = true;
            aVar.f26365c.setVisibility(0);
            TextView textView = aVar.f26365c;
            a[26] = true;
            Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(C0841b.m4928c(textView.getContext(), C9700R.C9703drawable.instabug_bg_white_oval));
            a[27] = true;
            aVar.f26365c.setBackgroundDrawable(primaryColorTintedDrawable);
            a[28] = true;
            aVar.f26365c.setText(String.valueOf(instabugDialogItem.getBadgeCount()));
            a[29] = true;
        } else {
            aVar.f26365c.setVisibility(8);
            a[30] = true;
        }
        a[31] = true;
    }

    /* renamed from: a */
    public void mo35238a(ArrayList<InstabugDialogItem> arrayList) {
        boolean[] a = m46139a();
        this.f26361a = arrayList;
        a[32] = true;
    }
}
