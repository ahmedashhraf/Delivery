package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.cache.disk.DefaultDiskStorage.FileType;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@C4056a
@C4312d0
@C4392a(creator = "BitmapTeleporterCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @C4056a
    public static final Creator<BitmapTeleporter> CREATOR = new C4276m();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final int f13236N;

    /* renamed from: O */
    private Bitmap f13237O;

    /* renamed from: P */
    private boolean f13238P;

    /* renamed from: Q */
    private File f13239Q;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13240a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private ParcelFileDescriptor f13241b;

    @C4393b
    BitmapTeleporter(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ParcelFileDescriptor parcelFileDescriptor, @C4396e(mo18387id = 3) int i2) {
        this.f13240a = i;
        this.f13241b = parcelFileDescriptor;
        this.f13236N = i2;
        this.f13237O = null;
        this.f13238P = false;
    }

    /* renamed from: O */
    private final FileOutputStream m18393O() {
        File file = this.f13239Q;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", FileType.TEMP, file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f13241b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    @C4056a
    /* renamed from: N */
    public Bitmap mo18030N() {
        if (!this.f13238P) {
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f13241b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Config valueOf = Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                m18394a((Closeable) dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.f13237O = createBitmap;
                this.f13238P = true;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                m18394a((Closeable) dataInputStream);
                throw th;
            }
        }
        return this.f13237O;
    }

    @C4056a
    /* renamed from: a */
    public void mo18031a(File file) {
        if (file != null) {
            this.f13239Q = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }

    @C4056a
    public void release() {
        if (!this.f13238P) {
            try {
                this.f13241b.close();
            } catch (IOException unused) {
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f13241b == null) {
            Bitmap bitmap = this.f13237O;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m18393O()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m18394a((Closeable) dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m18394a((Closeable) dataOutputStream);
                throw th;
            }
        }
        int i2 = i | 1;
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13240a);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f13241b, i2, false);
        C4399a.m18964a(parcel, 3, this.f13236N);
        C4399a.m18959a(parcel, a);
        this.f13241b = null;
    }

    /* renamed from: a */
    private static void m18394a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @C4056a
    public BitmapTeleporter(Bitmap bitmap) {
        this.f13240a = 1;
        this.f13241b = null;
        this.f13236N = 0;
        this.f13237O = bitmap;
        this.f13238P = true;
    }
}
