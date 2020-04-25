package com.mrsool.stickers;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;
import androidx.recyclerview.widget.C1734j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.C10830i;
import com.mrsool.stickers.C11497k.C11498a;
import com.mrsool.utils.C5880q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class StickerPackListStickerActivity extends C11494i {

    /* renamed from: Y */
    public static final String f32436Y = "sticker_pack_list";

    /* renamed from: Z */
    private static final int f32437Z = 5;

    /* renamed from: a0 */
    private static final String f32438a0 = "StickerPackList";

    /* renamed from: S */
    private LinearLayoutManager f32439S;

    /* renamed from: T */
    private RecyclerView f32440T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C11497k f32441U;

    /* renamed from: V */
    C11484a f32442V;

    /* renamed from: W */
    ArrayList<StickerPack> f32443W;

    /* renamed from: X */
    private C11498a f32444X = new C11493h(this);

    /* renamed from: com.mrsool.stickers.StickerPackListStickerActivity$a */
    static class C11484a extends AsyncTask<List<StickerPack>, Void, List<StickerPack>> {

        /* renamed from: a */
        private final WeakReference<StickerPackListStickerActivity> f32445a;

        C11484a(StickerPackListStickerActivity stickerPackListStickerActivity) {
            this.f32445a = new WeakReference<>(stickerPackListStickerActivity);
        }

        /* access modifiers changed from: protected */
        @SafeVarargs
        /* renamed from: a */
        public final List<StickerPack> doInBackground(List<StickerPack>... listArr) {
            List<StickerPack> list = listArr[0];
            StickerPackListStickerActivity stickerPackListStickerActivity = (StickerPackListStickerActivity) this.f32445a.get();
            if (stickerPackListStickerActivity == null) {
                return list;
            }
            for (StickerPack stickerPack : list) {
                stickerPack.mo39586a(C11504q.m51900a((Context) stickerPackListStickerActivity, stickerPack.f32406a));
            }
            return list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(List<StickerPack> list) {
            StickerPackListStickerActivity stickerPackListStickerActivity = (StickerPackListStickerActivity) this.f32445a.get();
            if (stickerPackListStickerActivity != null) {
                stickerPackListStickerActivity.f32441U.mo7341e();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m51854J() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C10232R.dimen.sticker_pack_list_item_preview_image_size);
        C11499l lVar = (C11499l) this.f32440T.findViewHolderForAdapterPosition(this.f32439S.mo6959N());
        if (lVar != null) {
            this.f32441U.mo39628g(Math.min(5, Math.max(lVar.f32473x0.getMeasuredWidth() / dimensionPixelSize, 1)));
        }
    }

    /* renamed from: b */
    private void m51857b(List<StickerPack> list) {
        this.f32441U = new C11497k(list, this.f32444X);
        this.f32440T.setAdapter(this.f32441U);
        this.f32439S = new LinearLayoutManager(this);
        this.f32439S.mo7000l(1);
        this.f32440T.addItemDecoration(new C1734j(this.f32440T.getContext(), this.f32439S.mo6963R()));
        this.f32440T.setLayoutManager(this.f32439S);
        this.f32440T.getViewTreeObserver().addOnGlobalLayoutListener(new C11492g(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200 && i2 == 0 && intent != null) {
            String stringExtra = intent.getStringExtra("validation_error");
            if (stringExtra != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("StickerPackListValidation failed:");
                sb.append(stringExtra);
                C5880q.m25751b(sb.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.sticker_pack_list_activity);
        mo38412e(getResources().getString(C10232R.string.lbl_whatsApp_sticker));
        this.f32440T = (RecyclerView) findViewById(C10232R.C10236id.sticker_pack_list);
        this.f32443W = getIntent().getParcelableArrayListExtra(f32436Y);
        m51857b((List<StickerPack>) this.f32443W);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C11484a aVar = this.f32442V;
        if (aVar != null && !aVar.isCancelled()) {
            this.f32442V.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f32442V = new C11484a(this);
        this.f32442V.execute(new List[]{this.f32443W});
    }

    /* renamed from: a */
    public /* synthetic */ void mo39607a(StickerPack stickerPack) {
        Intent intent = new Intent();
        intent.setAction("com.whatsapp.intent.action.ENABLE_STICKER_PACK");
        intent.putExtra(StickerPackDetailsStickerActivity.f32408e0, stickerPack.f32406a);
        intent.putExtra(StickerPackDetailsStickerActivity.f32409f0, C10830i.f29740h);
        intent.putExtra("sticker_pack_name", stickerPack.f32407b);
        try {
            startActivityForResult(intent, 200);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, C10232R.string.error_adding_sticker_pack, 1).show();
        }
    }
}
