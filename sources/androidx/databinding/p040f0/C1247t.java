package androidx.databinding.p040f0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.databinding.C1301z;
import androidx.databinding.C1301z.C1302a;
import java.util.List;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.databinding.f0.t */
/* compiled from: ObservableListAdapter */
class C1247t<T> extends BaseAdapter {

    /* renamed from: N */
    private final Context f5115N;

    /* renamed from: O */
    private final int f5116O;

    /* renamed from: P */
    private final int f5117P;

    /* renamed from: Q */
    private final int f5118Q;

    /* renamed from: R */
    private final LayoutInflater f5119R;

    /* renamed from: a */
    private List<T> f5120a;

    /* renamed from: b */
    private C1302a f5121b;

    /* renamed from: androidx.databinding.f0.t$a */
    /* compiled from: ObservableListAdapter */
    class C1248a extends C1302a {
        C1248a() {
        }

        /* renamed from: a */
        public void mo5560a(C1301z zVar) {
            C1247t.this.notifyDataSetChanged();
        }

        /* renamed from: b */
        public void mo5564b(C1301z zVar, int i, int i2) {
            C1247t.this.notifyDataSetChanged();
        }

        /* renamed from: c */
        public void mo5566c(C1301z zVar, int i, int i2) {
            C1247t.this.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo5561a(C1301z zVar, int i, int i2) {
            C1247t.this.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo5562a(C1301z zVar, int i, int i2, int i3) {
            C1247t.this.notifyDataSetChanged();
        }
    }

    public C1247t(Context context, List<T> list, int i, int i2, int i3) {
        LayoutInflater layoutInflater;
        this.f5115N = context;
        this.f5117P = i;
        this.f5116O = i2;
        this.f5118Q = i3;
        if (i == 0) {
            layoutInflater = null;
        } else {
            layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }
        this.f5119R = layoutInflater;
        mo5639a(list);
    }

    /* renamed from: a */
    public void mo5639a(List<T> list) {
        List<T> list2 = this.f5120a;
        if (list2 != list) {
            if (list2 instanceof C1301z) {
                ((C1301z) list2).mo5698a(this.f5121b);
            }
            this.f5120a = list;
            if (this.f5120a instanceof C1301z) {
                if (this.f5121b == null) {
                    this.f5121b = new C1248a();
                }
                ((C1301z) this.f5120a).mo5703b(this.f5121b);
            }
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        return this.f5120a.size();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return mo5638a(this.f5116O, i, view, viewGroup);
    }

    public Object getItem(int i) {
        return this.f5120a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return mo5638a(this.f5117P, i, view, viewGroup);
    }

    /* renamed from: a */
    public View mo5638a(int i, int i2, View view, ViewGroup viewGroup) {
        View view2;
        CharSequence charSequence;
        if (view == null) {
            if (i == 0) {
                view = new TextView(this.f5115N);
            } else {
                view = this.f5119R.inflate(i, viewGroup, false);
            }
        }
        int i3 = this.f5118Q;
        if (i3 == 0) {
            view2 = view;
        } else {
            view2 = view.findViewById(i3);
        }
        TextView textView = (TextView) view2;
        Object obj = this.f5120a.get(i2);
        if (obj instanceof CharSequence) {
            charSequence = (CharSequence) obj;
        } else {
            charSequence = String.valueOf(obj);
        }
        textView.setText(charSequence);
        return view;
    }
}
