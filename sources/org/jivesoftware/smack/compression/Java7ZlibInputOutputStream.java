package org.jivesoftware.smack.compression;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.jivesoftware.smack.compression.XMPPInputOutputStream.FlushMethod;

public class Java7ZlibInputOutputStream extends XMPPInputOutputStream {
    private static final int FULL_FLUSH_INT = 3;
    private static final int SYNC_FLUSH_INT = 2;
    private static final int compressionLevel = -1;
    /* access modifiers changed from: private */
    public static final Method method;
    /* access modifiers changed from: private */
    public static final boolean supported;

    static {
        Method method2;
        boolean z = true;
        try {
            method2 = Deflater.class.getMethod("deflate", new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE});
        } catch (NoSuchMethodException | SecurityException unused) {
            method2 = null;
        }
        method = method2;
        if (method == null) {
            z = false;
        }
        supported = z;
    }

    public Java7ZlibInputOutputStream() {
        super("zlib");
    }

    public InputStream getInputStream(InputStream inputStream) {
        return new InflaterInputStream(inputStream, new Inflater(), 512) {
            public int available() throws IOException {
                if (this.inf.needsInput()) {
                    return 0;
                }
                return super.available();
            }
        };
    }

    public OutputStream getOutputStream(OutputStream outputStream) {
        final int i = XMPPInputOutputStream.flushMethod == FlushMethod.SYNC_FLUSH ? 2 : 3;
        return new DeflaterOutputStream(outputStream, new Deflater(-1)) {
            public void flush() throws IOException {
                String str = "Can't flush";
                if (!Java7ZlibInputOutputStream.supported) {
                    super.flush();
                    return;
                }
                while (true) {
                    try {
                        int intValue = ((Integer) Java7ZlibInputOutputStream.method.invoke(this.def, new Object[]{this.buf, Integer.valueOf(0), Integer.valueOf(this.buf.length), Integer.valueOf(i)})).intValue();
                        if (intValue != 0) {
                            this.out.write(this.buf, 0, intValue);
                        } else {
                            super.flush();
                            return;
                        }
                    } catch (IllegalArgumentException unused) {
                        throw new IOException(str);
                    } catch (IllegalAccessException unused2) {
                        throw new IOException(str);
                    } catch (InvocationTargetException unused3) {
                        throw new IOException(str);
                    }
                }
            }
        };
    }

    public boolean isSupported() {
        return supported;
    }
}
