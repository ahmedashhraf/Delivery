package com.mrsool.createorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.BookmarkPlaceBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;

/* renamed from: com.mrsool.createorder.n */
/* compiled from: BookmarkLocationAdapter */
public class C10641n extends C1638g<C10644c> {

    /* renamed from: c */
    private List<BookmarkPlaceBean> f29053c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f29054d;

    /* renamed from: e */
    private C5887x f29055e;

    /* renamed from: f */
    private final String f29056f = "home";

    /* renamed from: g */
    private final String f29057g = "المنزل";

    /* renamed from: h */
    private final String f29058h = "office";

    /* renamed from: i */
    private final String f29059i = "العمل";

    /* renamed from: com.mrsool.createorder.n$a */
    /* compiled from: BookmarkLocationAdapter */
    class C10642a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29060a;

        C10642a(int i) {
            this.f29060a = i;
        }

        public void onClick(View view) {
            if (C10641n.this.f29054d != null) {
                C10641n.this.f29054d.mo38064e(this.f29060a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.n$b */
    /* compiled from: BookmarkLocationAdapter */
    class C10643b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29062a;

        C10643b(int i) {
            this.f29062a = i;
        }

        public void onClick(View view) {
            if (C10641n.this.f29054d != null) {
                C10641n.this.f29054d.mo37847a(this.f29062a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.n$c */
    /* compiled from: BookmarkLocationAdapter */
    public static class C10644c extends C1635d0 {

        /* renamed from: s0 */
        TextView f29064s0;

        /* renamed from: t0 */
        TextView f29065t0;

        /* renamed from: u0 */
        ImageView f29066u0;

        /* renamed from: v0 */
        ImageView f29067v0;

        /* renamed from: w0 */
        LinearLayout f29068w0;

        public C10644c(View view) {
            super(view);
            this.f29064s0 = (TextView) view.findViewById(C10232R.C10236id.tvBookMarkName);
            this.f29065t0 = (TextView) view.findViewById(C10232R.C10236id.tvLocation);
            this.f29066u0 = (ImageView) view.findViewById(C10232R.C10236id.ivDelete);
            this.f29067v0 = (ImageView) view.findViewById(C10232R.C10236id.ivCategory);
            this.f29068w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
        }
    }

    public C10641n(List<BookmarkPlaceBean> list, C11725f fVar) {
        this.f29053c = list;
        this.f29054d = fVar;
    }

    /* renamed from: a */
    public void mo38037a(List<BookmarkPlaceBean> list) {
        this.f29053c = list;
    }

    /* renamed from: a */
    public void mo7330b(C10644c cVar, int i) {
        if (this.f29055e.mo23496R()) {
            cVar.f29065t0.setTextDirection(4);
        }
        cVar.f29064s0.setText(((BookmarkPlaceBean) this.f29053c.get(i)).getName());
        cVar.f29065t0.setText(((BookmarkPlaceBean) this.f29053c.get(i)).getAddress());
        String name = ((BookmarkPlaceBean) this.f29053c.get(i)).getName();
        int i2 = (name.equalsIgnoreCase("home") || name.equalsIgnoreCase("المنزل")) ? C10232R.C10235drawable.ic_home_icon : (name.equalsIgnoreCase("office") || name.equalsIgnoreCase("العمل")) ? C10232R.C10235drawable.ic_office : C10232R.C10235drawable.star_white;
        cVar.f29067v0.setImageResource(i2);
        cVar.f29066u0.setOnClickListener(new C10642a(i));
        cVar.f29068w0.setOnClickListener(new C10643b(i));
    }

    /* renamed from: b */
    public C10644c m49083b(ViewGroup viewGroup, int i) {
        this.f29055e = new C5887x(viewGroup.getContext());
        return new C10644c(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_dialog_location, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<BookmarkPlaceBean> list = this.f29053c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
