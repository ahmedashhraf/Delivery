package p076c.p112d.p134b.p135a.p143g;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: c.d.b.a.g.t */
/* compiled from: IOUtils */
public class C6423t {
    /* renamed from: a */
    public static void m29817a(InputStream inputStream, OutputStream outputStream) throws IOException {
        m29818a(inputStream, outputStream, true);
    }

    /* renamed from: a */
    public static void m29818a(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        try {
            C6382i.m29673a(inputStream, outputStream);
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static long m29814a(C6397m0 m0Var) throws IOException {
        C6380h hVar = new C6380h();
        try {
            m0Var.writeTo(hVar);
            hVar.close();
            return hVar.f17800a;
        } catch (Throwable th) {
            hVar.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m29821a(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m29819a(obj, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static void m29819a(Object obj, OutputStream outputStream) throws IOException {
        try {
            new ObjectOutputStream(outputStream).writeObject(obj);
        } finally {
            outputStream.close();
        }
    }

    /* renamed from: a */
    public static <S extends Serializable> S m29816a(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return m29815a((InputStream) new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public static <S extends Serializable> S m29815a(InputStream inputStream) throws IOException {
        try {
            S s = (Serializable) new ObjectInputStream(inputStream).readObject();
            inputStream.close();
            return s;
        } catch (ClassNotFoundException e) {
            IOException iOException = new IOException("Failed to deserialize object");
            iOException.initCause(e);
            throw iOException;
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m29820a(File file) throws IOException {
        try {
            Class cls = Class.forName("java.nio.file.Files");
            Class cls2 = Class.forName("java.nio.file.Path");
            Object invoke = File.class.getMethod("toPath", new Class[0]).invoke(file, new Object[0]);
            return ((Boolean) cls.getMethod("isSymbolicLink", new Class[]{cls2}).invoke(null, new Object[]{invoke})).booleanValue();
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            C6406p0.m29737a(cause, IOException.class);
            throw new RuntimeException(cause);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException unused) {
            if (File.separatorChar == '\\') {
                return false;
            }
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
    }
}
