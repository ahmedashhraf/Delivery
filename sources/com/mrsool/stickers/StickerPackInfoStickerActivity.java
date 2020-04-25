package com.mrsool.stickers;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.mrsool.C10232R;
import com.mrsool.utils.C5880q;
import java.io.FileNotFoundException;

public class StickerPackInfoStickerActivity extends C11494i {

    /* renamed from: S */
    private static final String f32435S = "StickerPackInfoStickerActivity";

    /* renamed from: i */
    private void m51849i(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        startActivity(Intent.createChooser(intent, "Send email with"));
    }

    /* renamed from: j */
    private void m51850j(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo39604a(String str, View view) {
        m51850j(str);
    }

    /* renamed from: b */
    public /* synthetic */ void mo39605b(String str, View view) {
        m51849i(str);
    }

    /* renamed from: c */
    public /* synthetic */ void mo39606c(String str, View view) {
        m51850j(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.sticker_pack_info_activity);
        String stringExtra = getIntent().getStringExtra(StickerPackDetailsStickerActivity.f32415l0);
        String stringExtra2 = getIntent().getStringExtra(StickerPackDetailsStickerActivity.f32412i0);
        String stringExtra3 = getIntent().getStringExtra(StickerPackDetailsStickerActivity.f32413j0);
        String stringExtra4 = getIntent().getStringExtra(StickerPackDetailsStickerActivity.f32414k0);
        TextView textView = (TextView) findViewById(C10232R.C10236id.tray_icon);
        try {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), getContentResolver().openInputStream(Uri.parse(stringExtra)));
            Drawable drawable = getResources().getDrawable(C10232R.C10235drawable.sticker_3rdparty_email);
            bitmapDrawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
            textView.setCompoundDrawables(bitmapDrawable, null, null, null);
        } catch (FileNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("StickerPackInfoStickerActivitycould not find the uri for the tray image:");
            sb.append(stringExtra);
            C5880q.m25751b(sb.toString());
        }
        TextView textView2 = (TextView) findViewById(C10232R.C10236id.view_webpage);
        if (TextUtils.isEmpty(stringExtra2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setOnClickListener(new C11487b(this, stringExtra2));
        }
        TextView textView3 = (TextView) findViewById(C10232R.C10236id.send_email);
        if (TextUtils.isEmpty(stringExtra3)) {
            textView3.setVisibility(8);
        } else {
            textView3.setOnClickListener(new C11488c(this, stringExtra3));
        }
        TextView textView4 = (TextView) findViewById(C10232R.C10236id.privacy_policy);
        if (TextUtils.isEmpty(stringExtra4)) {
            textView4.setVisibility(8);
        } else {
            textView4.setOnClickListener(new C11489d(this, stringExtra4));
        }
    }
}
