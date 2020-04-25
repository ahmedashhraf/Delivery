package com.mrsool.stickers;

import android.content.Context;
import android.content.Intent;
import android.text.format.Formatter;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mrsool.C10232R;
import java.util.List;

/* renamed from: com.mrsool.stickers.k */
/* compiled from: StickerPackListAdapter */
public class C11497k extends C1638g<C11499l> {
    @C0193h0

    /* renamed from: c */
    private List<StickerPack> f32465c;
    @C0193h0

    /* renamed from: d */
    private final C11498a f32466d;

    /* renamed from: e */
    private int f32467e;

    /* renamed from: com.mrsool.stickers.k$a */
    /* compiled from: StickerPackListAdapter */
    public interface C11498a {
        /* renamed from: a */
        void mo39624a(StickerPack stickerPack);
    }

    C11497k(@C0193h0 List<StickerPack> list, @C0193h0 C11498a aVar) {
        this.f32465c = list;
        this.f32466d = aVar;
    }

    /* renamed from: a */
    public void mo7330b(@C0193h0 C11499l lVar, int i) {
        StickerPack stickerPack = (StickerPack) this.f32465c.get(i);
        Context context = lVar.f32470u0.getContext();
        lVar.f32470u0.setText(stickerPack.f32395N);
        lVar.f32471v0.setText(Formatter.formatShortFileSize(context, stickerPack.mo39589c()));
        lVar.f32469t0.setText(stickerPack.f32407b);
        lVar.f32468s0.setOnClickListener(new C11490e(stickerPack));
        lVar.f32473x0.removeAllViews();
        int min = Math.min(this.f32467e, stickerPack.mo39588b().size());
        for (int i2 = 0; i2 < min; i2++) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) LayoutInflater.from(context).inflate(C10232R.layout.sticker_pack_list_item_image, lVar.f32473x0, false);
            simpleDraweeView.setImageURI(C11500m.m51885a(stickerPack.f32406a, ((Sticker) stickerPack.mo39588b().get(i2)).f32368a));
            LayoutParams layoutParams = (LayoutParams) simpleDraweeView.getLayoutParams();
            int measuredWidth = (((lVar.f32473x0.getMeasuredWidth() - (this.f32467e * lVar.f32473x0.getContext().getResources().getDimensionPixelSize(C10232R.dimen.sticker_pack_list_item_preview_image_size))) / (this.f32467e - 1)) - layoutParams.leftMargin) - layoutParams.rightMargin;
            if (i2 != min - 1 && measuredWidth > 0) {
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin + measuredWidth, layoutParams.bottomMargin);
                simpleDraweeView.setLayoutParams(layoutParams);
            }
            lVar.f32473x0.addView(simpleDraweeView);
        }
        m51874a(lVar.f32472w0, stickerPack);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo39628g(int i) {
        if (this.f32467e != i) {
            this.f32467e = i;
            mo7341e();
        }
    }

    @C0193h0
    /* renamed from: b */
    public C11499l m51880b(@C0193h0 ViewGroup viewGroup, int i) {
        return new C11499l(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.sticker_packs_list_item, viewGroup, false));
    }

    /* renamed from: b */
    static /* synthetic */ void m51875b(StickerPack stickerPack, View view) {
        Intent intent = new Intent(view.getContext(), StickerPackDetailsStickerActivity.class);
        intent.putExtra(StickerPackDetailsStickerActivity.f32416m0, true);
        intent.putExtra(StickerPackDetailsStickerActivity.f32417n0, stickerPack);
        view.getContext().startActivity(intent);
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f32465c.size();
    }

    /* renamed from: a */
    private void m51874a(ImageView imageView, StickerPack stickerPack) {
        if (stickerPack.mo39587a()) {
            imageView.setImageResource(C10232R.C10235drawable.sticker_3rdparty_added);
            imageView.setClickable(false);
            imageView.setOnClickListener(null);
            imageView.setBackground(null);
            return;
        }
        imageView.setImageResource(C10232R.C10235drawable.sticker_3rdparty_add);
        imageView.setOnClickListener(new C11491f(this, stickerPack));
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        imageView.setBackgroundResource(typedValue.resourceId);
    }

    /* renamed from: a */
    public /* synthetic */ void mo39626a(StickerPack stickerPack, View view) {
        this.f32466d.mo39624a(stickerPack);
    }
}
