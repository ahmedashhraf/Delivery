package com.mrsool.stickers;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.mrsool.C10232R;

/* renamed from: com.mrsool.stickers.o */
/* compiled from: StickerPreviewAdapter */
public class C11502o extends C1638g<C11503p> {
    @C0193h0

    /* renamed from: c */
    private StickerPack f32485c;

    /* renamed from: d */
    private final int f32486d;

    /* renamed from: e */
    private int f32487e = 0;

    /* renamed from: f */
    private int f32488f;

    /* renamed from: g */
    private final int f32489g;

    /* renamed from: h */
    private final LayoutInflater f32490h;

    C11502o(@C0193h0 LayoutInflater layoutInflater, int i, int i2, int i3, @C0193h0 StickerPack stickerPack) {
        this.f32486d = i2;
        this.f32488f = i3;
        this.f32490h = layoutInflater;
        this.f32489g = i;
        this.f32485c = stickerPack;
    }

    /* renamed from: a */
    public void mo7330b(@C0193h0 C11503p pVar, int i) {
        pVar.f32491s0.setImageResource(this.f32489g);
        SimpleDraweeView simpleDraweeView = pVar.f32491s0;
        StickerPack stickerPack = this.f32485c;
        simpleDraweeView.setImageURI(C11500m.m51885a(stickerPack.f32406a, ((Sticker) stickerPack.mo39588b().get(i)).f32368a));
    }

    @C0193h0
    /* renamed from: b */
    public C11503p m51898b(@C0193h0 ViewGroup viewGroup, int i) {
        C11503p pVar = new C11503p(this.f32490h.inflate(C10232R.layout.sticker_image, viewGroup, false));
        LayoutParams layoutParams = pVar.f32491s0.getLayoutParams();
        int i2 = this.f32486d;
        layoutParams.height = i2;
        layoutParams.width = i2;
        pVar.f32491s0.setLayoutParams(layoutParams);
        SimpleDraweeView simpleDraweeView = pVar.f32491s0;
        int i3 = this.f32488f;
        simpleDraweeView.setPadding(i3, i3, i3, i3);
        return pVar;
    }

    /* renamed from: b */
    public int mo7325b() {
        int size = this.f32485c.mo39588b().size();
        int i = this.f32487e;
        return i > 0 ? Math.min(size, i) : size;
    }
}
