package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.appcompat.app.C0279a;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import com.krishna.fileloader.p408i.C10186b;
import com.theartofdev.edmodo.cropper.CropImage.ActivityResult;
import com.theartofdev.edmodo.cropper.CropImageView.C12061b;
import com.theartofdev.edmodo.cropper.CropImageView.C12064e;
import com.theartofdev.edmodo.cropper.CropImageView.C12068i;
import java.io.File;
import java.io.IOException;

public class CropImageActivity extends C0295d implements C12068i, C12064e {

    /* renamed from: N */
    private CropImageOptions f34778N;

    /* renamed from: a */
    private CropImageView f34779a;

    /* renamed from: b */
    private Uri f34780b;

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo41275C() {
        if (this.f34778N.f34825w0) {
            mo41281b(null, null, 1);
            return;
        }
        Uri D = mo41276D();
        CropImageView cropImageView = this.f34779a;
        CropImageOptions cropImageOptions = this.f34778N;
        cropImageView.mo41299a(D, cropImageOptions.f34820r0, cropImageOptions.f34821s0, cropImageOptions.f34822t0, cropImageOptions.f34823u0, cropImageOptions.f34824v0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Uri mo41276D() {
        Uri uri = this.f34778N.f34819q0;
        if (uri != null && !uri.equals(Uri.EMPTY)) {
            return uri;
        }
        try {
            String str = this.f34778N.f34820r0 == CompressFormat.JPEG ? C10186b.f27189b : this.f34778N.f34820r0 == CompressFormat.PNG ? ".png" : ".webp";
            return Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp file for output image", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo41277E() {
        setResult(0);
        finish();
    }

    /* renamed from: a */
    public void mo41279a(CropImageView cropImageView, Uri uri, Exception exc) {
        if (exc == null) {
            Rect rect = this.f34778N.f34826x0;
            if (rect != null) {
                this.f34779a.setCropRect(rect);
            }
            int i = this.f34778N.f34827y0;
            if (i > -1) {
                this.f34779a.setRotatedDegrees(i);
                return;
            }
            return;
        }
        mo41281b(null, exc, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41281b(Uri uri, Exception exc, int i) {
        setResult(exc == null ? -1 : 204, mo41278a(uri, exc, i));
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo41282h(int i) {
        this.f34779a.mo41293a(i);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200) {
            if (i2 == 0) {
                mo41277E();
            }
            if (i2 == -1) {
                this.f34780b = CropImage.m54435a((Context) this, intent);
                if (CropImage.m54445b(this, this.f34780b)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                    return;
                }
                this.f34779a.setImageUriAsync(this.f34780b);
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo41277E();
    }

    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView(C12074R.layout.crop_image_activity);
        this.f34779a = (CropImageView) findViewById(C12074R.C12077id.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra(CropImage.f34769c);
        this.f34780b = (Uri) bundleExtra.getParcelable(CropImage.f34767a);
        this.f34778N = (CropImageOptions) bundleExtra.getParcelable(CropImage.f34768b);
        if (bundle == null) {
            Uri uri = this.f34780b;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (CropImage.m54446c(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, CropImage.f34773g);
                } else {
                    CropImage.m54441a((Activity) this);
                }
            } else if (CropImage.m54445b(this, this.f34780b)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.f34779a.setImageUriAsync(this.f34780b);
            }
        }
        C0279a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions = this.f34778N;
            if (cropImageOptions != null) {
                CharSequence charSequence2 = cropImageOptions.f34817o0;
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = this.f34778N.f34817o0;
                    supportActionBar.mo945c(charSequence);
                    supportActionBar.mo950d(true);
                }
            }
            charSequence = getResources().getString(C12074R.string.crop_image_activity_title);
            supportActionBar.mo945c(charSequence);
            supportActionBar.mo950d(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C12074R.C12078menu.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f34778N;
        if (!cropImageOptions.f34828z0) {
            menu.removeItem(C12074R.C12077id.crop_image_menu_rotate_left);
            menu.removeItem(C12074R.C12077id.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f34782B0) {
            menu.findItem(C12074R.C12077id.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f34778N.f34781A0) {
            menu.removeItem(C12074R.C12077id.crop_image_menu_flip);
        }
        if (this.f34778N.f34786F0 != null) {
            menu.findItem(C12074R.C12077id.crop_image_menu_crop).setTitle(this.f34778N.f34786F0);
        }
        Drawable drawable = null;
        try {
            if (this.f34778N.f34787G0 != 0) {
                drawable = C0841b.m4928c(this, this.f34778N.f34787G0);
                menu.findItem(C12074R.C12077id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception unused) {
        }
        int i = this.f34778N.f34818p0;
        if (i != 0) {
            m54498a(menu, C12074R.C12077id.crop_image_menu_rotate_left, i);
            m54498a(menu, C12074R.C12077id.crop_image_menu_rotate_right, this.f34778N.f34818p0);
            m54498a(menu, C12074R.C12077id.crop_image_menu_flip, this.f34778N.f34818p0);
            if (drawable != null) {
                m54498a(menu, C12074R.C12077id.crop_image_menu_crop, this.f34778N.f34818p0);
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C12074R.C12077id.crop_image_menu_crop) {
            mo41275C();
            return true;
        } else if (menuItem.getItemId() == C12074R.C12077id.crop_image_menu_rotate_left) {
            mo41282h(-this.f34778N.f34783C0);
            return true;
        } else if (menuItem.getItemId() == C12074R.C12077id.crop_image_menu_rotate_right) {
            mo41282h(this.f34778N.f34783C0);
            return true;
        } else if (menuItem.getItemId() == C12074R.C12077id.crop_image_menu_flip_horizontally) {
            this.f34779a.mo41305c();
            return true;
        } else if (menuItem.getItemId() == C12074R.C12077id.crop_image_menu_flip_vertically) {
            this.f34779a.mo41307d();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            mo41277E();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        if (i == 201) {
            Uri uri = this.f34780b;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, C12074R.string.crop_image_activity_no_permissions, 1).show();
                mo41277E();
            } else {
                this.f34779a.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            CropImage.m54441a((Activity) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f34779a.setOnSetImageUriCompleteListener(this);
        this.f34779a.setOnCropImageCompleteListener(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f34779a.setOnSetImageUriCompleteListener(null);
        this.f34779a.setOnCropImageCompleteListener(null);
    }

    /* renamed from: a */
    public void mo41280a(CropImageView cropImageView, C12061b bVar) {
        mo41281b(bVar.mo41369n(), bVar.mo41364i(), bVar.mo41368m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo41278a(Uri uri, Exception exc, int i) {
        ActivityResult activityResult = new ActivityResult(this.f34779a.getImageUri(), uri, exc, this.f34779a.getCropPoints(), this.f34779a.getCropRect(), this.f34779a.getRotatedDegrees(), this.f34779a.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra(CropImage.f34770d, activityResult);
        return intent;
    }

    /* renamed from: a */
    private void m54498a(Menu menu, int i, int i2) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            Drawable icon = findItem.getIcon();
            if (icon != null) {
                try {
                    icon.mutate();
                    icon.setColorFilter(i2, Mode.SRC_ATOP);
                    findItem.setIcon(icon);
                } catch (Exception unused) {
                }
            }
        }
    }
}
