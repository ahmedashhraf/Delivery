package com.mrsool.order;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.ComplainAttachmentBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

/* renamed from: com.mrsool.order.g */
/* compiled from: FileComplainAttachmentAdapter */
public class C10992g extends C1638g<C10995c> {

    /* renamed from: c */
    private List<ComplainAttachmentBean> f30349c = new ArrayList();

    /* renamed from: d */
    private C10994b f30350d;

    /* renamed from: com.mrsool.order.g$a */
    /* compiled from: FileComplainAttachmentAdapter */
    class C10993a extends C2550c {

        /* renamed from: R */
        final /* synthetic */ C10995c f30351R;

        C10993a(ImageView imageView, C10995c cVar) {
            this.f30351R = cVar;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            this.f30351R.f30358x0.setVisibility(8);
            this.f30351R.f30354t0.setScaleType(ScaleType.CENTER_CROP);
            this.f30351R.f30354t0.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.mrsool.order.g$b */
    /* compiled from: FileComplainAttachmentAdapter */
    public interface C10994b {
        /* renamed from: a */
        void mo38741a(int i);
    }

    /* renamed from: com.mrsool.order.g$c */
    /* compiled from: FileComplainAttachmentAdapter */
    public static class C10995c extends C1635d0 {
        /* access modifiers changed from: private */

        /* renamed from: s0 */
        public LinearLayout f30353s0;
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public ImageView f30354t0;
        /* access modifiers changed from: private */

        /* renamed from: u0 */
        public ImageView f30355u0;
        /* access modifiers changed from: private */

        /* renamed from: v0 */
        public RelativeLayout f30356v0;
        /* access modifiers changed from: private */

        /* renamed from: w0 */
        public Space f30357w0;
        /* access modifiers changed from: private */

        /* renamed from: x0 */
        public ProgressBar f30358x0;

        public C10995c(View view) {
            super(view);
            this.f30353s0 = (LinearLayout) view.findViewById(C10232R.C10236id.llAddMore);
            this.f30354t0 = (ImageView) view.findViewById(C10232R.C10236id.imgAttachment);
            this.f30356v0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlAttachment);
            this.f30355u0 = (ImageView) view.findViewById(C10232R.C10236id.ivRemove);
            this.f30357w0 = (Space) view.findViewById(C10232R.C10236id.spacer);
            this.f30358x0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBillImage);
        }
    }

    public C10992g(ArrayList<ComplainAttachmentBean> arrayList, C10994b bVar) {
        this.f30349c = arrayList;
        this.f30350d = bVar;
    }

    /* renamed from: g */
    private void m50091g(int i) {
        boolean z;
        this.f30349c.remove(i);
        mo7343f(i);
        Iterator it = this.f30349c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((ComplainAttachmentBean) it.next()).getImageUri() == null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            this.f30349c.add(new ComplainAttachmentBean(null));
            mo7342e(this.f30349c.size() - 1);
        }
    }

    /* renamed from: a */
    public void mo7330b(C10995c cVar, int i) {
        ComplainAttachmentBean complainAttachmentBean = (ComplainAttachmentBean) this.f30349c.get(i);
        if (!TextUtils.isEmpty(complainAttachmentBean.getImageUri())) {
            m50090a(cVar, complainAttachmentBean.getImageUri());
        } else {
            cVar.f30354t0.setImageResource(C10232R.C10235drawable.bg_add_attachment);
            cVar.f30353s0.setVisibility(0);
            cVar.f30355u0.setVisibility(8);
            cVar.f30357w0.setVisibility(4);
            cVar.f30358x0.setVisibility(8);
        }
        cVar.f30356v0.setOnClickListener(new C10982c(this, cVar));
    }

    /* renamed from: b */
    public C10995c m50097b(ViewGroup viewGroup, int i) {
        return new C10995c(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_add_file_complain, viewGroup, false));
    }

    /* renamed from: b */
    public /* synthetic */ void mo38758b(C10995c cVar, View view) {
        this.f30350d.mo38741a(cVar.mo7273f());
    }

    /* renamed from: b */
    public int mo7325b() {
        List<ComplainAttachmentBean> list = this.f30349c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    private void m50090a(C10995c cVar, String str) {
        cVar.f30353s0.setVisibility(8);
        cVar.f30355u0.setVisibility(0);
        cVar.f30357w0.setVisibility(0);
        cVar.f30358x0.setVisibility(0);
        C2232l.m11649c(cVar.f6294a.getContext()).mo9515a(str).mo9441j().m11415e((int) C10232R.C10235drawable.ic_image_placeholder).m11411d().mo9458b(new C10993a(cVar.f30354t0, cVar));
        cVar.f30355u0.setOnClickListener(new C10981b(this, cVar));
    }

    /* renamed from: a */
    public /* synthetic */ void mo38756a(C10995c cVar, View view) {
        m50091g(cVar.mo7273f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38757a(String str, boolean z, int i) {
        ComplainAttachmentBean complainAttachmentBean = (ComplainAttachmentBean) this.f30349c.get(i);
        complainAttachmentBean.setImageUri(str);
        complainAttachmentBean.setServerImage(z);
        mo7337d(i);
    }
}
