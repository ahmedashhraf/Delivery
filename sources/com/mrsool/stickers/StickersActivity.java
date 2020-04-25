package com.mrsool.stickers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C5880q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class StickersActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private View f32446S;

    /* renamed from: T */
    private C11485a f32447T;

    /* renamed from: U */
    private ImageView f32448U;

    /* renamed from: com.mrsool.stickers.StickersActivity$a */
    static class C11485a extends AsyncTask<Void, Void, Pair<String, ArrayList<StickerPack>>> {

        /* renamed from: a */
        private final WeakReference<StickersActivity> f32449a;

        C11485a(StickersActivity stickersActivity) {
            this.f32449a = new WeakReference<>(stickersActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Pair<String, ArrayList<StickerPack>> doInBackground(Void... voidArr) {
            try {
                Context context = (Context) this.f32449a.get();
                if (context == null) {
                    return new Pair<>("could not fetch sticker packs", null);
                }
                ArrayList a = C11500m.m51886a(context);
                if (a.size() == 0) {
                    return new Pair<>("could not find any packs", null);
                }
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    C11501n.m51891a(context, (StickerPack) it.next());
                }
                return new Pair<>(null, a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("StickersActivityerror fetching sticker packs");
                sb.append(e);
                C5880q.m25751b(sb.toString());
                return new Pair<>(e.getMessage(), null);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Pair<String, ArrayList<StickerPack>> pair) {
            StickersActivity stickersActivity = (StickersActivity) this.f32449a.get();
            if (stickersActivity != null) {
                Object obj = pair.first;
                if (obj != null) {
                    stickersActivity.m51864i((String) obj);
                } else {
                    stickersActivity.m51863b((ArrayList) pair.second);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51863b(ArrayList<StickerPack> arrayList) {
        this.f32446S.setVisibility(8);
        if (arrayList.size() > 1) {
            Intent intent = new Intent(this, StickerPackListStickerActivity.class);
            intent.putParcelableArrayListExtra(StickerPackListStickerActivity.f32436Y, arrayList);
            startActivity(intent);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        Intent intent2 = new Intent(this, StickerPackDetailsStickerActivity.class);
        intent2.putExtra(StickerPackDetailsStickerActivity.f32416m0, false);
        intent2.putExtra(StickerPackDetailsStickerActivity.f32417n0, (Parcelable) arrayList.get(0));
        startActivity(intent2);
        finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m51864i(String str) {
        this.f32446S.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        sb.append("StickersActivity error fetching sticker packs, ");
        sb.append(str);
        C5880q.m25751b(sb.toString());
        ((TextView) findViewById(C10232R.C10236id.error_message)).setText(getString(C10232R.string.error_message, new Object[]{str}));
    }

    public void onClick(View view) {
        if (view == this.f32448U) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        Fresco.initialize(this);
        setContentView((int) C10232R.layout.sticker_activity_entry);
        overridePendingTransition(0, 0);
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo985t();
        }
        ((TextView) findViewById(C10232R.C10236id.txtTitle)).setText(getResources().getString(C10232R.string.lbl_whatsApp_sticker));
        this.f32448U = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f32448U.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f32448U.setScaleX(-1.0f);
        }
        this.f32446S = findViewById(C10232R.C10236id.entry_activity_progress);
        this.f32447T = new C11485a(this);
        this.f32447T.execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11485a aVar = this.f32447T;
        if (aVar != null && !aVar.isCancelled()) {
            this.f32447T.cancel(true);
        }
    }
}
