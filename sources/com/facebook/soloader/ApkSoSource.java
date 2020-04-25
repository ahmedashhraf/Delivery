package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

public class ApkSoSource extends ExtractFromZipSoSource {
    private static final byte APK_SO_SOURCE_SIGNATURE_VERSION = 2;
    private static final byte LIBS_DIR_DOESNT_EXIST = 1;
    private static final byte LIBS_DIR_DONT_CARE = 0;
    private static final byte LIBS_DIR_SNAPSHOT = 2;
    public static final int PREFER_ANDROID_LIBS_DIRECTORY = 1;
    private static final String TAG = "ApkSoSource";
    /* access modifiers changed from: private */
    public final int mFlags;

    protected class ApkUnpacker extends ZipUnpacker {
        private final int mFlags;
        private File mLibDir;

        ApkUnpacker(ExtractFromZipSoSource extractFromZipSoSource) throws IOException {
            super(extractFromZipSoSource);
            this.mLibDir = new File(ApkSoSource.this.mContext.getApplicationInfo().nativeLibraryDir);
            this.mFlags = ApkSoSource.this.mFlags;
        }

        /* access modifiers changed from: protected */
        public boolean shouldExtract(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(ApkSoSource.this.mCorruptedLib)) {
                ApkSoSource.this.mCorruptedLib = null;
                String.format("allowing consideration of corrupted lib %s", new Object[]{str});
                return true;
            } else if ((this.mFlags & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
                sb.toString();
                return true;
            } else {
                File file = new File(this.mLibDir, str);
                if (!file.isFile()) {
                    String.format("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                    return true;
                }
                long length = file.length();
                long size = zipEntry.getSize();
                if (length != size) {
                    String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    return true;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("not allowing consideration of ");
                sb2.append(name);
                sb2.append(": deferring to libdir");
                sb2.toString();
                return false;
            }
        }
    }

    public ApkSoSource(Context context, String str, int i) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
        this.mFlags = i;
    }

    /* access modifiers changed from: protected */
    public byte[] getDepsBlock() throws IOException {
        File canonicalFile = this.mZipFileName.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.getAppVersionCode(this.mContext));
            if ((this.mFlags & 1) == 0) {
                obtain.writeByte(0);
                return obtain.marshall();
            }
            String str = this.mContext.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte(2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public Unpacker makeUnpacker() throws IOException {
        return new ApkUnpacker(this);
    }
}
