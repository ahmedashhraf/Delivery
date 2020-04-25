package com.facebook.imagepipeline.image;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferInputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.SharedReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5967b;

@C5967b
public class EncodedImage implements Closeable {
    public static final int DEFAULT_SAMPLE_SIZE = 1;
    public static final int UNKNOWN_HEIGHT = -1;
    public static final int UNKNOWN_ROTATION_ANGLE = -1;
    public static final int UNKNOWN_STREAM_SIZE = -1;
    public static final int UNKNOWN_WIDTH = -1;
    @C5952h
    private BytesRange mBytesRange;
    private int mExifOrientation;
    private int mHeight;
    private ImageFormat mImageFormat;
    @C5952h
    private final Supplier<FileInputStream> mInputStreamSupplier;
    @C5952h
    private final CloseableReference<PooledByteBuffer> mPooledByteBufferRef;
    private int mRotationAngle;
    private int mSampleSize;
    private int mStreamSize;
    private int mWidth;

    public EncodedImage(CloseableReference<PooledByteBuffer> closeableReference) {
        this.mImageFormat = ImageFormat.UNKNOWN;
        this.mRotationAngle = -1;
        this.mExifOrientation = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        Preconditions.checkArgument(CloseableReference.isValid(closeableReference));
        this.mPooledByteBufferRef = closeableReference.clone();
        this.mInputStreamSupplier = null;
    }

    public static EncodedImage cloneOrNull(EncodedImage encodedImage) {
        if (encodedImage != null) {
            return encodedImage.cloneOrNull();
        }
        return null;
    }

    public static void closeSafely(@C5952h EncodedImage encodedImage) {
        if (encodedImage != null) {
            encodedImage.close();
        }
    }

    public static boolean isMetaDataAvailable(EncodedImage encodedImage) {
        return encodedImage.mRotationAngle >= 0 && encodedImage.mWidth >= 0 && encodedImage.mHeight >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[SYNTHETIC, Splitter:B:15:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.lang.Integer> readImageSize() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ all -> 0x0026 }
            android.util.Pair r1 = com.facebook.imageutils.BitmapUtil.decodeDimensions(r0)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x001e
            java.lang.Object r2 = r1.first     // Catch:{ all -> 0x0024 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0024 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0024 }
            r3.mWidth = r2     // Catch:{ all -> 0x0024 }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0024 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0024 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0024 }
            r3.mHeight = r2     // Catch:{ all -> 0x0024 }
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r1
        L_0x0024:
            r1 = move-exception
            goto L_0x0028
        L_0x0026:
            r1 = move-exception
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.image.EncodedImage.readImageSize():android.util.Pair");
    }

    private Pair<Integer, Integer> readWebPImageSize() {
        Pair<Integer, Integer> size = WebpUtil.getSize(getInputStream());
        if (size != null) {
            this.mWidth = ((Integer) size.first).intValue();
            this.mHeight = ((Integer) size.second).intValue();
        }
        return size;
    }

    public void close() {
        CloseableReference.closeSafely(this.mPooledByteBufferRef);
    }

    public void copyMetaDataFrom(EncodedImage encodedImage) {
        this.mImageFormat = encodedImage.getImageFormat();
        this.mWidth = encodedImage.getWidth();
        this.mHeight = encodedImage.getHeight();
        this.mRotationAngle = encodedImage.getRotationAngle();
        this.mExifOrientation = encodedImage.getExifOrientation();
        this.mSampleSize = encodedImage.getSampleSize();
        this.mStreamSize = encodedImage.getSize();
        this.mBytesRange = encodedImage.getBytesRange();
    }

    public CloseableReference<PooledByteBuffer> getByteBufferRef() {
        return CloseableReference.cloneOrNull(this.mPooledByteBufferRef);
    }

    @C5952h
    public BytesRange getBytesRange() {
        return this.mBytesRange;
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    public String getFirstBytesAsHexString(int i) {
        CloseableReference byteBufferRef = getByteBufferRef();
        String str = "";
        if (byteBufferRef == null) {
            return str;
        }
        int min = Math.min(getSize(), i);
        byte[] bArr = new byte[min];
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) byteBufferRef.get();
            if (pooledByteBuffer == null) {
                return str;
            }
            pooledByteBuffer.read(0, bArr, 0, min);
            byteBufferRef.close();
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte valueOf : bArr) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } finally {
            byteBufferRef.close();
        }
    }

    public int getHeight() {
        return this.mHeight;
    }

    public ImageFormat getImageFormat() {
        return this.mImageFormat;
    }

    public InputStream getInputStream() {
        Supplier<FileInputStream> supplier = this.mInputStreamSupplier;
        if (supplier != null) {
            return (InputStream) supplier.get();
        }
        CloseableReference cloneOrNull = CloseableReference.cloneOrNull(this.mPooledByteBufferRef);
        if (cloneOrNull == null) {
            return null;
        }
        try {
            return new PooledByteBufferInputStream((PooledByteBuffer) cloneOrNull.get());
        } finally {
            CloseableReference.closeSafely(cloneOrNull);
        }
    }

    public int getRotationAngle() {
        return this.mRotationAngle;
    }

    public int getSampleSize() {
        return this.mSampleSize;
    }

    public int getSize() {
        CloseableReference<PooledByteBuffer> closeableReference = this.mPooledByteBufferRef;
        if (closeableReference == null || closeableReference.get() == null) {
            return this.mStreamSize;
        }
        return ((PooledByteBuffer) this.mPooledByteBufferRef.get()).size();
    }

    @VisibleForTesting
    public synchronized SharedReference<PooledByteBuffer> getUnderlyingReferenceTestOnly() {
        return this.mPooledByteBufferRef != null ? this.mPooledByteBufferRef.getUnderlyingReferenceTestOnly() : null;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isCompleteAt(int i) {
        boolean z = true;
        if (this.mImageFormat != DefaultImageFormats.JPEG || this.mInputStreamSupplier != null) {
            return true;
        }
        Preconditions.checkNotNull(this.mPooledByteBufferRef);
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) this.mPooledByteBufferRef.get();
        if (!(pooledByteBuffer.read(i - 2) == -1 && pooledByteBuffer.read(i - 1) == -39)) {
            z = false;
        }
        return z;
    }

    public synchronized boolean isValid() {
        return CloseableReference.isValid(this.mPooledByteBufferRef) || this.mInputStreamSupplier != null;
    }

    public void parseMetaData() {
        Pair pair;
        ImageFormat imageFormat_WrapIOException = ImageFormatChecker.getImageFormat_WrapIOException(getInputStream());
        this.mImageFormat = imageFormat_WrapIOException;
        if (DefaultImageFormats.isWebpFormat(imageFormat_WrapIOException)) {
            pair = readWebPImageSize();
        } else {
            pair = readImageSize();
        }
        if (imageFormat_WrapIOException != DefaultImageFormats.JPEG || this.mRotationAngle != -1) {
            this.mRotationAngle = 0;
        } else if (pair != null) {
            this.mExifOrientation = JfifUtil.getOrientation(getInputStream());
            this.mRotationAngle = JfifUtil.getAutoRotateAngleFromOrientation(this.mExifOrientation);
        }
    }

    public void setBytesRange(@C5952h BytesRange bytesRange) {
        this.mBytesRange = bytesRange;
    }

    public void setExifOrientation(int i) {
        this.mExifOrientation = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setImageFormat(ImageFormat imageFormat) {
        this.mImageFormat = imageFormat;
    }

    public void setRotationAngle(int i) {
        this.mRotationAngle = i;
    }

    public void setSampleSize(int i) {
        this.mSampleSize = i;
    }

    public void setStreamSize(int i) {
        this.mStreamSize = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public static boolean isValid(@C5952h EncodedImage encodedImage) {
        return encodedImage != null && encodedImage.isValid();
    }

    public EncodedImage cloneOrNull() {
        EncodedImage encodedImage;
        Supplier<FileInputStream> supplier = this.mInputStreamSupplier;
        if (supplier != null) {
            encodedImage = new EncodedImage(supplier, this.mStreamSize);
        } else {
            CloseableReference cloneOrNull = CloseableReference.cloneOrNull(this.mPooledByteBufferRef);
            if (cloneOrNull == null) {
                encodedImage = null;
            } else {
                try {
                    encodedImage = new EncodedImage(cloneOrNull);
                } catch (Throwable th) {
                    CloseableReference.closeSafely(cloneOrNull);
                    throw th;
                }
            }
            CloseableReference.closeSafely(cloneOrNull);
        }
        if (encodedImage != null) {
            encodedImage.copyMetaDataFrom(this);
        }
        return encodedImage;
    }

    public EncodedImage(Supplier<FileInputStream> supplier) {
        this.mImageFormat = ImageFormat.UNKNOWN;
        this.mRotationAngle = -1;
        this.mExifOrientation = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mSampleSize = 1;
        this.mStreamSize = -1;
        Preconditions.checkNotNull(supplier);
        this.mPooledByteBufferRef = null;
        this.mInputStreamSupplier = supplier;
    }

    public EncodedImage(Supplier<FileInputStream> supplier, int i) {
        this(supplier);
        this.mStreamSize = i;
    }
}
