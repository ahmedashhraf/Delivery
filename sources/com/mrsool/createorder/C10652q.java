package com.mrsool.createorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.jackandphantom.circularimageview.RoundedImage;
import com.mrsool.C10232R;
import com.mrsool.newBean.UploadImageBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C11644i;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.createorder.q */
/* compiled from: ImageAdapter */
public class C10652q extends C1638g<C10656d> {

    /* renamed from: c */
    private List<UploadImageBean> f29097c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f29098d;

    /* renamed from: e */
    private Context f29099e;

    /* renamed from: com.mrsool.createorder.q$a */
    /* compiled from: ImageAdapter */
    class C10653a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29100a;

        C10653a(int i) {
            this.f29100a = i;
        }

        public void onClick(View view) {
            if (C10652q.this.f29098d != null) {
                C10652q.this.f29098d.mo38064e(this.f29100a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.q$b */
    /* compiled from: ImageAdapter */
    class C10654b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29102a;

        C10654b(int i) {
            this.f29102a = i;
        }

        public void onClick(View view) {
            if (C10652q.this.f29098d != null) {
                C10652q.this.f29098d.mo37847a(this.f29102a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.q$c */
    /* compiled from: ImageAdapter */
    class C10655c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29104a;

        C10655c(int i) {
            this.f29104a = i;
        }

        public void onClick(View view) {
            if (C10652q.this.f29098d != null) {
                C10652q.this.f29098d.mo38063c(this.f29104a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.q$d */
    /* compiled from: ImageAdapter */
    public static class C10656d extends C1635d0 {

        /* renamed from: s0 */
        RoundedImage f29106s0;

        /* renamed from: t0 */
        ImageView f29107t0;

        /* renamed from: u0 */
        FrameLayout f29108u0;

        /* renamed from: v0 */
        FrameLayout f29109v0;

        public C10656d(View view) {
            super(view);
            this.f29107t0 = (ImageView) view.findViewById(C10232R.C10236id.ivDelete);
            this.f29106s0 = (RoundedImage) view.findViewById(C10232R.C10236id.ivImage);
            this.f29108u0 = (FrameLayout) view.findViewById(C10232R.C10236id.flAddImage);
            this.f29109v0 = (FrameLayout) view.findViewById(C10232R.C10236id.flAddImageSub);
        }
    }

    public C10652q(Context context, List<UploadImageBean> list, C11725f fVar) {
        this.f29099e = context;
        this.f29097c = list;
        this.f29098d = fVar;
    }

    /* renamed from: a */
    public void mo7330b(C10656d dVar, int i) {
        if (i < this.f29097c.size()) {
            dVar.f29106s0.setRoundedRadius((int) this.f29099e.getResources().getDimension(C10232R.dimen.dp_15));
            dVar.f29109v0.setVisibility(8);
            dVar.f29106s0.setVisibility(0);
            dVar.f29107t0.setVisibility(0);
            C2232l.m11649c(this.f29099e.getApplicationContext()).mo9511a(((UploadImageBean) this.f29097c.get(i)).getImageFile()).mo9441j().m11411d().mo9424a((ImageView) dVar.f29106s0);
            dVar.f29107t0.setOnClickListener(new C10653a(i));
            dVar.f29106s0.setOnClickListener(new C10654b(i));
        } else {
            dVar.f29109v0.setVisibility(0);
            dVar.f29106s0.setVisibility(8);
            dVar.f29107t0.setVisibility(8);
        }
        dVar.f29108u0.setOnClickListener(new C10655c(i));
    }

    /* renamed from: b */
    public C10656d m49101b(ViewGroup viewGroup, int i) {
        return new C10656d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_order_image, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        if (((float) this.f29097c.size()) >= C11644i.f33248Z6) {
            return this.f29097c.size();
        }
        return this.f29097c.size() + 1;
    }
}
