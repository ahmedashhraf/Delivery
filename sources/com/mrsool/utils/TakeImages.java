package com.mrsool.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import androidx.appcompat.app.C0295d;
import androidx.core.content.FileProvider;
import com.google.android.material.p296f.C6845b;
import com.krishna.fileloader.p408i.C10186b;
import com.mrsool.C10232R;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView.C12063d;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;

public class TakeImages extends C0295d {

    /* renamed from: N */
    private String f32751N;

    /* renamed from: O */
    private String f32752O;

    /* renamed from: P */
    private C5887x f32753P;

    /* renamed from: Q */
    private String f32754Q = "";

    /* renamed from: a */
    private int f32755a = 1;

    /* renamed from: b */
    private Uri f32756b;

    /* renamed from: com.mrsool.utils.TakeImages$a */
    class C11566a implements OnClickListener {
        C11566a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TakeImages.this.m52130H();
        }
    }

    /* renamed from: com.mrsool.utils.TakeImages$b */
    class C11567b implements OnClickListener {
        C11567b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TakeImages.this.m52129G();
        }
    }

    /* renamed from: com.mrsool.utils.TakeImages$c */
    class C11568c implements OnCancelListener {
        C11568c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            TakeImages.this.finish();
        }
    }

    /* renamed from: D */
    private void m52127D() {
        CropImage.m54438a(this.f32756b).mo41235a(C12063d.ON).mo41261e(false).mo41257d(true).mo41262f(0.0f).mo41239a((Activity) this);
    }

    /* renamed from: E */
    private File m52128E() {
        File file = new File(this.f32751N);
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", new Locale("EN")).format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(File.separator);
        sb.append("IMG_");
        sb.append(format);
        sb.append(C10186b.f27189b);
        return new File(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m52129G() {
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            this.f32756b = mo39709C();
            intent.putExtra(C14030b.f41237l, this.f32756b);
            intent.putExtra("return-data", true);
            startActivityForResult(intent, C11644i.f33382p0);
        } catch (ActivityNotFoundException unused) {
            finish();
            this.f32753P.mo23489M("Proper Activity not found to open Image");
        } catch (Exception e) {
            finish();
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m52130H() {
        try {
            startActivityForResult(new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI), C11644i.f33374o0);
        } catch (ActivityNotFoundException unused) {
            finish();
            this.f32753P.mo23489M("Proper Activity not found to open Image");
        } catch (Exception e) {
            finish();
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m52136e(String str) {
        if (str.equalsIgnoreCase(getString(C10232R.string.lbl_dg_title_both))) {
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            sb.append(Environment.getExternalStorageDirectory());
            sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse(sb.toString())));
            C6845b bVar = new C6845b(this, C10232R.style.AlertDialogTheme);
            bVar.mo770b((CharSequence) getString(C10232R.string.lbl_dg_title_choose_picture));
            bVar.mo758a((CharSequence) getString(C10232R.string.msg_dg_title_choose_picture));
            bVar.mo776c((CharSequence) getString(C10232R.string.lbl_dg_title_gallery), (OnClickListener) new C11566a());
            bVar.mo759a((CharSequence) getString(C10232R.string.lbl_dg_title_camera), (OnClickListener) new C11567b());
            bVar.mo746a((OnCancelListener) new C11568c());
            if (!isFinishing()) {
                bVar.mo778c();
            }
        } else if (str.equalsIgnoreCase(getString(C10232R.string.lbl_dg_title_camera))) {
            m52129G();
        } else if (str.equalsIgnoreCase(getString(C10232R.string.lbl_dg_title_gallery))) {
            m52130H();
        }
    }

    /* renamed from: C */
    public Uri mo39709C() {
        StringBuilder sb = new StringBuilder();
        sb.append(getApplicationContext().getPackageName());
        sb.append(".provider");
        return FileProvider.m4903a(this, sb.toString(), m52128E());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555 && i2 == -1) {
            if (intent != null) {
                m52134b(intent);
            }
        } else if (i == 666 && i2 == -1) {
            m52127D();
        } else if (i != 203 || i2 != -1) {
            finish();
        } else if (intent != null) {
            m52131a(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32753P = new C5887x(this);
        this.f32751N = this.f32753P.mo23652q(C11644i.f33285e);
        if (!new File(this.f32751N).exists()) {
            new File(this.f32751N).mkdirs();
        } else {
            new File(this.f32751N).delete();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = "pictureRatio";
            if (extras.containsKey(str)) {
                this.f32754Q = extras.getString(str);
                m52136e(getIntent().getStringExtra("PicType"));
            }
        }
        this.f32754Q = "";
        m52136e(getIntent().getStringExtra("PicType"));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f32756b = (Uri) bundle.getParcelable("file_uri");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("file_uri", this.f32756b);
    }

    /* renamed from: a */
    private void m52131a(Intent intent) {
        Uri n = CropImage.m54436a(intent).mo41369n();
        Intent intent2 = new Intent();
        intent2.putExtra("image_path", n.getPath());
        setResult(-1, intent2);
        finish();
    }

    /* renamed from: b */
    public static Bitmap m52133b(Bitmap bitmap) {
        if (bitmap.getWidth() <= bitmap.getHeight()) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: b */
    private void m52134b(Intent intent) {
        if (intent != null) {
            CropImage.m54438a(intent.getData()).mo41235a(C12063d.ON).mo41261e(false).mo41257d(true).mo41262f(0.0f).mo41239a((Activity) this);
        }
    }
}
