package com.mrsool.stickers;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import com.mrsool.C10232R;

/* renamed from: com.mrsool.stickers.l */
/* compiled from: StickerPackListItemViewHolder */
public class C11499l extends C1635d0 {

    /* renamed from: s0 */
    View f32468s0;

    /* renamed from: t0 */
    TextView f32469t0;

    /* renamed from: u0 */
    TextView f32470u0;

    /* renamed from: v0 */
    TextView f32471v0;

    /* renamed from: w0 */
    ImageView f32472w0;

    /* renamed from: x0 */
    LinearLayout f32473x0;

    C11499l(View view) {
        super(view);
        this.f32468s0 = view;
        this.f32469t0 = (TextView) view.findViewById(C10232R.C10236id.sticker_pack_title);
        this.f32470u0 = (TextView) view.findViewById(C10232R.C10236id.sticker_pack_publisher);
        this.f32471v0 = (TextView) view.findViewById(C10232R.C10236id.sticker_pack_filesize);
        this.f32472w0 = (ImageView) view.findViewById(C10232R.C10236id.add_button_on_list);
        this.f32473x0 = (LinearLayout) view.findViewById(C10232R.C10236id.sticker_packs_list_item_image_list);
    }
}
