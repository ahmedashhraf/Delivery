package com.mrsool.stickers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import com.mrsool.C10232R;
import com.mrsool.C10830i;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C5880q;
import java.lang.ref.WeakReference;

public class StickerPackDetailsStickerActivity extends C11494i implements OnClickListener {

    /* renamed from: e0 */
    public static final String f32408e0 = "sticker_pack_id";

    /* renamed from: f0 */
    public static final String f32409f0 = "sticker_pack_authority";

    /* renamed from: g0 */
    public static final String f32410g0 = "sticker_pack_name";

    /* renamed from: h0 */
    public static final int f32411h0 = 200;

    /* renamed from: i0 */
    public static final String f32412i0 = "sticker_pack_website";

    /* renamed from: j0 */
    public static final String f32413j0 = "sticker_pack_email";

    /* renamed from: k0 */
    public static final String f32414k0 = "sticker_pack_privacy_policy";

    /* renamed from: l0 */
    public static final String f32415l0 = "sticker_pack_tray_icon";

    /* renamed from: m0 */
    public static final String f32416m0 = "show_up_button";

    /* renamed from: n0 */
    public static final String f32417n0 = "sticker_pack";

    /* renamed from: o0 */
    private static final String f32418o0 = "StickerPackDetails";
    /* access modifiers changed from: private */

    /* renamed from: S */
    public RecyclerView f32419S;

    /* renamed from: T */
    private GridLayoutManager f32420T;

    /* renamed from: U */
    private C11502o f32421U;

    /* renamed from: V */
    private int f32422V;

    /* renamed from: W */
    private View f32423W;

    /* renamed from: X */
    private View f32424X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public StickerPack f32425Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public View f32426Z;

    /* renamed from: a0 */
    private C11483d f32427a0;

    /* renamed from: b0 */
    private ImageView f32428b0;

    /* renamed from: c0 */
    private final OnGlobalLayoutListener f32429c0 = new C11481b();

    /* renamed from: d0 */
    private final C1660t f32430d0 = new C11482c();

    /* renamed from: com.mrsool.stickers.StickerPackDetailsStickerActivity$a */
    class C11480a implements OnClickListener {
        C11480a() {
        }

        public void onClick(View view) {
            StickerPackDetailsStickerActivity stickerPackDetailsStickerActivity = StickerPackDetailsStickerActivity.this;
            stickerPackDetailsStickerActivity.m51842i(stickerPackDetailsStickerActivity.f32425Y.f32407b);
        }
    }

    /* renamed from: com.mrsool.stickers.StickerPackDetailsStickerActivity$b */
    class C11481b implements OnGlobalLayoutListener {
        C11481b() {
        }

        public void onGlobalLayout() {
            StickerPackDetailsStickerActivity stickerPackDetailsStickerActivity = StickerPackDetailsStickerActivity.this;
            stickerPackDetailsStickerActivity.m51843j(stickerPackDetailsStickerActivity.f32419S.getWidth() / StickerPackDetailsStickerActivity.this.f32419S.getContext().getResources().getDimensionPixelSize(C10232R.dimen.sticker_pack_details_image_size));
        }
    }

    /* renamed from: com.mrsool.stickers.StickerPackDetailsStickerActivity$c */
    class C11482c extends C1660t {
        C11482c() {
        }

        /* renamed from: a */
        public void mo7531a(@C0193h0 RecyclerView recyclerView, int i) {
            super.mo7531a(recyclerView, i);
            m51844a(recyclerView);
        }

        /* renamed from: a */
        public void mo7532a(@C0193h0 RecyclerView recyclerView, int i, int i2) {
            super.mo7532a(recyclerView, i, i2);
            m51844a(recyclerView);
        }

        /* renamed from: a */
        private void m51844a(RecyclerView recyclerView) {
            int i = 0;
            boolean z = recyclerView.computeVerticalScrollOffset() > 0;
            if (StickerPackDetailsStickerActivity.this.f32426Z != null) {
                View c = StickerPackDetailsStickerActivity.this.f32426Z;
                if (!z) {
                    i = 4;
                }
                c.setVisibility(i);
            }
        }
    }

    /* renamed from: com.mrsool.stickers.StickerPackDetailsStickerActivity$d */
    static class C11483d extends AsyncTask<StickerPack, Void, Boolean> {

        /* renamed from: a */
        private final WeakReference<StickerPackDetailsStickerActivity> f32434a;

        C11483d(StickerPackDetailsStickerActivity stickerPackDetailsStickerActivity) {
            this.f32434a = new WeakReference<>(stickerPackDetailsStickerActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Boolean doInBackground(StickerPack... stickerPackArr) {
            StickerPack stickerPack = stickerPackArr[0];
            StickerPackDetailsStickerActivity stickerPackDetailsStickerActivity = (StickerPackDetailsStickerActivity) this.f32434a.get();
            if (stickerPackDetailsStickerActivity == null) {
                return Boolean.valueOf(false);
            }
            return Boolean.valueOf(C11504q.m51900a((Context) stickerPackDetailsStickerActivity, stickerPack.f32406a));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            StickerPackDetailsStickerActivity stickerPackDetailsStickerActivity = (StickerPackDetailsStickerActivity) this.f32434a.get();
            if (stickerPackDetailsStickerActivity != null) {
                stickerPackDetailsStickerActivity.m51838a(bool);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m51842i(String str) {
        Intent intent = new Intent();
        intent.setAction("com.whatsapp.intent.action.ENABLE_STICKER_PACK");
        intent.putExtra(f32408e0, this.f32425Y.f32406a);
        intent.putExtra(f32409f0, C10830i.f29740h);
        intent.putExtra("sticker_pack_name", str);
        try {
            startActivityForResult(intent, 200);
        } catch (Exception unused) {
            Toast.makeText(this, C10232R.string.error_adding_sticker_pack, 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51843j(int i) {
        if (this.f32422V != i) {
            this.f32420T.mo6940m(i);
            this.f32422V = i;
            C11502o oVar = this.f32421U;
            if (oVar != null) {
                oVar.mo7341e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 200) {
            return;
        }
        if (i2 == 0 && intent != null) {
            String stringExtra = intent.getStringExtra("validation_error");
            if (stringExtra != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("StickerPackDetailsValidation failed:");
                sb.append(stringExtra);
                C5880q.m25751b(sb.toString());
            }
        } else if (i2 == 0 && intent == null) {
            this.f29642a.mo23491N(getString(C10232R.string.error_adding_sticker_pack));
        }
    }

    public void onClick(View view) {
        if (view == this.f32428b0) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.sticker_pack_details);
        ((TextView) findViewById(C10232R.C10236id.txtTitle)).setText(getResources().getString(C10232R.string.lbl_whatsApp_sticker));
        this.f32428b0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f32428b0.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f32428b0.setScaleX(-1.0f);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(f32416m0, false);
        this.f32425Y = (StickerPack) getIntent().getParcelableExtra(f32417n0);
        TextView textView = (TextView) findViewById(C10232R.C10236id.pack_name);
        TextView textView2 = (TextView) findViewById(C10232R.C10236id.author);
        ImageView imageView = (ImageView) findViewById(C10232R.C10236id.tray_image);
        TextView textView3 = (TextView) findViewById(C10232R.C10236id.pack_size);
        this.f32423W = findViewById(C10232R.C10236id.add_to_whatsapp_button);
        this.f32424X = findViewById(C10232R.C10236id.already_added_text);
        this.f32420T = new GridLayoutManager(this, 1);
        this.f32419S = (RecyclerView) findViewById(C10232R.C10236id.sticker_list);
        this.f32419S.setLayoutManager(this.f32420T);
        this.f32419S.getViewTreeObserver().addOnGlobalLayoutListener(this.f32429c0);
        this.f32419S.addOnScrollListener(this.f32430d0);
        this.f32426Z = findViewById(C10232R.C10236id.divider);
        if (this.f32421U == null) {
            C11502o oVar = new C11502o(getLayoutInflater(), C10232R.C10235drawable.sticker_error, getResources().getDimensionPixelSize(C10232R.dimen.sticker_pack_details_image_size), getResources().getDimensionPixelSize(C10232R.dimen.sticker_pack_details_image_padding), this.f32425Y);
            this.f32421U = oVar;
            this.f32419S.setAdapter(this.f32421U);
        }
        textView.setText(getString(C10232R.string.app_name));
        textView2.setText(getString(C10232R.string.app_name));
        StickerPack stickerPack = this.f32425Y;
        imageView.setImageURI(C11500m.m51885a(stickerPack.f32406a, stickerPack.f32396O));
        textView3.setText(Formatter.formatShortFileSize(this, this.f32425Y.mo39589c()));
        this.f32423W.setOnClickListener(new C11480a());
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo950d(booleanExtra);
            getSupportActionBar().mo979n(booleanExtra ? C10232R.string.title_activity_sticker_pack_details_multiple_pack : C10232R.string.title_activity_sticker_pack_details_single_pack);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C10232R.C10237menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C10232R.C10236id.action_info) {
            StickerPack stickerPack = this.f32425Y;
            if (stickerPack != null) {
                m51839a(stickerPack.f32398Q, stickerPack.f32397P, stickerPack.f32399R, C11500m.m51885a(stickerPack.f32406a, stickerPack.f32396O).toString());
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C11483d dVar = this.f32427a0;
        if (dVar != null && !dVar.isCancelled()) {
            this.f32427a0.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f32427a0 = new C11483d(this);
        this.f32427a0.execute(new StickerPack[]{this.f32425Y});
    }

    /* renamed from: a */
    private void m51839a(String str, String str2, String str3, String str4) {
        Intent intent = new Intent(this, StickerPackInfoStickerActivity.class);
        intent.putExtra(f32408e0, this.f32425Y.f32406a);
        intent.putExtra(f32412i0, str);
        intent.putExtra(f32413j0, str2);
        intent.putExtra(f32414k0, str3);
        intent.putExtra(f32415l0, str4);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51838a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f32423W.setVisibility(8);
            this.f32424X.setVisibility(0);
            return;
        }
        this.f32423W.setVisibility(0);
        this.f32424X.setVisibility(8);
    }
}
