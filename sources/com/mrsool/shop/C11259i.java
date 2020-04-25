package com.mrsool.shop;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.MenuItemsBean;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;

/* renamed from: com.mrsool.shop.i */
/* compiled from: ShopMenuAdapter */
public class C11259i extends C1638g<C11262c> {

    /* renamed from: c */
    private List<MenuItemsBean> f31366c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f31367d;

    /* renamed from: e */
    public int f31368e = 0;

    /* renamed from: f */
    public C11263d f31369f;

    /* renamed from: com.mrsool.shop.i$a */
    /* compiled from: ShopMenuAdapter */
    class C11260a extends C2557j<Bitmap> {

        /* renamed from: O */
        final /* synthetic */ C11262c f31370O;

        C11260a(C11262c cVar) {
            this.f31370O = cVar;
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (!((Activity) C11259i.this.f31367d).isFinishing()) {
                C0894c a = C0895d.m5185a(C11259i.this.f31367d.getResources(), bitmap);
                a.mo4594a(C11259i.this.f31367d.getResources().getDimension(C10232R.dimen.dp_5));
                this.f31370O.f31375t0.setImageDrawable(a);
                this.f31370O.f31376u0.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.shop.i$b */
    /* compiled from: ShopMenuAdapter */
    class C11261b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f31372a;

        C11261b(int i) {
            this.f31372a = i;
        }

        public void onClick(View view) {
            C11259i.this.f31369f.mo39098a(this.f31372a);
        }
    }

    /* renamed from: com.mrsool.shop.i$c */
    /* compiled from: ShopMenuAdapter */
    public class C11262c extends C1635d0 {

        /* renamed from: s0 */
        private TextView f31374s0;
        /* access modifiers changed from: private */

        /* renamed from: t0 */
        public ImageView f31375t0;
        /* access modifiers changed from: private */

        /* renamed from: u0 */
        public ProgressBar f31376u0;

        public C11262c(View view) {
            super(view);
            this.f31375t0 = (ImageView) view.findViewById(C10232R.C10236id.ivMenu);
            this.f31376u0 = (ProgressBar) view.findViewById(C10232R.C10236id.progressbar);
        }
    }

    /* renamed from: com.mrsool.shop.i$d */
    /* compiled from: ShopMenuAdapter */
    public interface C11263d {
        /* renamed from: a */
        void mo39098a(int i);
    }

    public C11259i(Context context, List<MenuItemsBean> list) {
        this.f31366c = list;
        this.f31367d = context;
        int i = 3;
        if (list.size() <= 3) {
            i = list.size();
        }
        this.f31368e = i;
    }

    /* renamed from: f */
    public C11263d mo39094f() {
        return this.f31369f;
    }

    /* renamed from: g */
    public void mo39095g(int i) {
        this.f31368e = i;
        mo7341e();
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    public void mo7330b(C11262c cVar, int i) {
        cVar.f6294a.setVisibility(0);
        if (!TextUtils.isEmpty(((MenuItemsBean) this.f31366c.get(i)).getImage())) {
            C2232l.m11649c(this.f31367d).mo9515a(((MenuItemsBean) this.f31366c.get(i)).getImage()).mo9441j().mo9458b(new C11260a(cVar));
        } else {
            cVar.f31376u0.setVisibility(8);
        }
        cVar.f31375t0.setOnClickListener(new C11261b(i));
    }

    /* renamed from: b */
    public C11262c m50907b(ViewGroup viewGroup, int i) {
        return new C11262c(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_shop_menu, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f31366c.size();
    }

    /* renamed from: a */
    public void mo39093a(C11263d dVar) {
        this.f31369f = dVar;
    }

    /* renamed from: a */
    public static Bitmap m50902a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, 30.0f, 30.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }
}
