package org.jcodec.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class NIOUtils {

    public static abstract class FileReader {
        private int oldPd;

        /* access modifiers changed from: protected */
        public abstract void data(ByteBuffer byteBuffer, long j);

        /* access modifiers changed from: protected */
        public abstract void done();

        public void readFile(SeekableByteChannel seekableByteChannel, int i, FileReaderListener fileReaderListener) throws IOException {
            ByteBuffer allocate = ByteBuffer.allocate(i);
            long size = seekableByteChannel.size();
            while (true) {
                long position = seekableByteChannel.position();
                if (seekableByteChannel.read(allocate) != -1) {
                    allocate.flip();
                    data(allocate, position);
                    allocate.flip();
                    if (fileReaderListener != null) {
                        int i2 = (int) ((position * 100) / size);
                        if (i2 != this.oldPd) {
                            fileReaderListener.progress(i2);
                        }
                        this.oldPd = i2;
                    }
                } else {
                    done();
                    return;
                }
            }
        }

        public void readFile(File file, int i, FileReaderListener fileReaderListener) throws IOException {
            FileChannelWrapper fileChannelWrapper;
            try {
                fileChannelWrapper = NIOUtils.readableFileChannel(file);
                try {
                    readFile((SeekableByteChannel) fileChannelWrapper, i, fileReaderListener);
                    NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                } catch (Throwable th) {
                    th = th;
                    NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileChannelWrapper = null;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        }
    }

    public interface FileReaderListener {
        void progress(int i);
    }

    public static AutoFileChannelWrapper autoChannel(File file) throws IOException {
        return new AutoFileChannelWrapper(file);
    }

    public static ByteBuffer clone(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer cloneBuffer(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.clear();
        return allocate;
    }

    public static void closeQuietly(ReadableByteChannel readableByteChannel) {
        if (readableByteChannel != null) {
            try {
                readableByteChannel.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer combine(Iterable<ByteBuffer> iterable) {
        int i = 0;
        for (ByteBuffer remaining : iterable) {
            i += remaining.remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (ByteBuffer write : iterable) {
            write(allocate, write);
        }
        allocate.flip();
        return allocate;
    }

    public static void copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel, long j) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(65536);
        do {
            allocate.position(0);
            allocate.limit((int) Math.min(j, (long) allocate.capacity()));
            int read = readableByteChannel.read(allocate);
            if (read != -1) {
                allocate.flip();
                writableByteChannel.write(allocate);
                j -= (long) read;
            }
            if (read == -1) {
                return;
            }
        } while (j > 0);
    }

    public static ByteBuffer duplicate(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer fetchFrom(File file) throws IOException {
        return fetchFrom(file, (int) file.length());
    }

    public static void fill(ByteBuffer byteBuffer, byte b) {
        while (byteBuffer.hasRemaining()) {
            byteBuffer.put(b);
        }
    }

    public static int find(List<ByteBuffer> list, ByteBuffer byteBuffer) {
        byte[] array = toArray(byteBuffer);
        for (int i = 0; i < list.size(); i++) {
            if (Arrays.equals(toArray((ByteBuffer) list.get(i)), array)) {
                return i;
            }
        }
        return -1;
    }

    public static ByteBuffer from(ByteBuffer byteBuffer, int i) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + i);
        return duplicate;
    }

    public static byte getRel(ByteBuffer byteBuffer, int i) {
        return byteBuffer.get(byteBuffer.position() + i);
    }

    public static final MappedByteBuffer map(String str) throws IOException {
        return map(new File(str));
    }

    public static final ByteBuffer read(ByteBuffer byteBuffer, int i) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int position = byteBuffer.position() + i;
        duplicate.limit(position);
        byteBuffer.position(position);
        return duplicate;
    }

    public static byte readByte(ReadableByteChannel readableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        readableByteChannel.read(allocate);
        allocate.flip();
        return allocate.get();
    }

    public static int readInt(ReadableByteChannel readableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        readableByteChannel.read(allocate);
        allocate.flip();
        return allocate.getInt();
    }

    public static byte[] readNByte(ReadableByteChannel readableByteChannel, int i) throws IOException {
        byte[] bArr = new byte[i];
        readableByteChannel.read(ByteBuffer.wrap(bArr));
        return bArr;
    }

    public static String readNullTermString(ByteBuffer byteBuffer) {
        return readNullTermString(byteBuffer, Charset.defaultCharset());
    }

    public static String readPascalString(ByteBuffer byteBuffer, int i) {
        ByteBuffer read = read(byteBuffer, i + 1);
        return new String(toArray(read(read, Math.min(read.get() & 255, i))));
    }

    public static String readString(ByteBuffer byteBuffer, int i) {
        return new String(toArray(read(byteBuffer, i)));
    }

    public static FileChannelWrapper readableFileChannel(File file) throws FileNotFoundException {
        return new FileChannelWrapper(new FileInputStream(file).getChannel());
    }

    public static FileChannelWrapper rwFileChannel(File file) throws FileNotFoundException {
        return new FileChannelWrapper(new RandomAccessFile(file, "rw").getChannel());
    }

    public static ByteBuffer search(ByteBuffer byteBuffer, int i, byte... bArr) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        int position = byteBuffer.position();
        int i2 = i;
        loop0:
        while (true) {
            int i3 = 0;
            while (true) {
                if (!byteBuffer.hasRemaining()) {
                    break loop0;
                } else if (byteBuffer.get() == bArr[i3]) {
                    i3++;
                    if (i3 == bArr.length) {
                        if (i2 == 0) {
                            byteBuffer.position(position);
                            duplicate.limit(byteBuffer.position());
                            break;
                        }
                        i2--;
                    }
                } else if (i3 != 0) {
                    position++;
                    byteBuffer.position(position);
                    break;
                } else {
                    position = byteBuffer.position();
                }
            }
        }
        return duplicate;
    }

    public static int skip(ByteBuffer byteBuffer, int i) {
        int min = Math.min(byteBuffer.remaining(), i);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public static byte[] toArray(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.duplicate().get(bArr);
        return bArr;
    }

    public static FileChannelWrapper writableFileChannel(File file) throws FileNotFoundException {
        return new FileChannelWrapper(new FileOutputStream(file).getChannel());
    }

    public static void write(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2.hasArray()) {
            byteBuffer.put(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), Math.min(byteBuffer.remaining(), byteBuffer2.remaining()));
        } else {
            byteBuffer.put(toArray(byteBuffer2, byteBuffer.remaining()));
        }
    }

    public static void writeByte(WritableByteChannel writableByteChannel, byte b) throws IOException {
        writableByteChannel.write((ByteBuffer) ByteBuffer.allocate(1).put(b).flip());
    }

    public static void writeInt(WritableByteChannel writableByteChannel, int i, ByteOrder byteOrder) throws IOException {
        writableByteChannel.write((ByteBuffer) ByteBuffer.allocate(4).order(byteOrder).putInt(i).flip());
    }

    public static void writeIntLE(WritableByteChannel writableByteChannel, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        writableByteChannel.write((ByteBuffer) allocate.putInt(i).flip());
    }

    public static void writeLong(WritableByteChannel writableByteChannel, long j) throws IOException {
        writableByteChannel.write((ByteBuffer) ByteBuffer.allocate(8).putLong(j).flip());
    }

    public static void writePascalString(ByteBuffer byteBuffer, String str, int i) {
        byteBuffer.put((byte) str.length());
        byteBuffer.put(JCodecUtil.asciiString(str));
        skip(byteBuffer, i - str.length());
    }

    public static void writeTo(ByteBuffer byteBuffer, File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(byteBuffer);
        } finally {
            closeQuietly((ReadableByteChannel) fileChannel);
        }
    }

    public static void closeQuietly(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ByteBuffer fetchFrom(ReadableByteChannel readableByteChannel, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        read(readableByteChannel, allocate);
        allocate.flip();
        return allocate;
    }

    public static final MappedByteBuffer map(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        MappedByteBuffer map = fileInputStream.getChannel().map(MapMode.READ_ONLY, 0, file.length());
        fileInputStream.close();
        return map;
    }

    public static String readNullTermString(ByteBuffer byteBuffer, Charset charset) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.get() == 0) {
                break;
            }
        }
        if (byteBuffer.hasRemaining()) {
            duplicate.limit(byteBuffer.position() - 1);
        }
        return new String(toArray(duplicate), charset);
    }

    public static FileChannelWrapper readableFileChannel(String str) throws FileNotFoundException {
        return new FileChannelWrapper(new FileInputStream(str).getChannel());
    }

    public static FileChannelWrapper rwFileChannel(String str) throws FileNotFoundException {
        return new FileChannelWrapper(new RandomAccessFile(str, "rw").getChannel());
    }

    public static FileChannelWrapper writableFileChannel(String str) throws FileNotFoundException {
        return new FileChannelWrapper(new FileOutputStream(str).getChannel());
    }

    public static void writeInt(WritableByteChannel writableByteChannel, int i) throws IOException {
        writableByteChannel.write((ByteBuffer) ByteBuffer.allocate(4).putInt(i).flip());
    }

    public static String readPascalString(ByteBuffer byteBuffer) {
        return readString(byteBuffer, byteBuffer.get() & 255);
    }

    public static byte[] toArray(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[Math.min(byteBuffer.remaining(), i)];
        byteBuffer.duplicate().get(bArr);
        return bArr;
    }

    public static void write(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (byteBuffer2.hasArray()) {
            byteBuffer.put(byteBuffer2.array(), byteBuffer2.arrayOffset() + byteBuffer2.position(), Math.min(byteBuffer2.remaining(), i));
        } else {
            byteBuffer.put(toArray(byteBuffer2, i));
        }
    }

    public static void writePascalString(ByteBuffer byteBuffer, String str) {
        byteBuffer.put((byte) str.length());
        byteBuffer.put(JCodecUtil.asciiString(str));
    }

    public static ByteBuffer fetchFrom(ByteBuffer byteBuffer, ReadableByteChannel readableByteChannel, int i) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(i);
        read(readableByteChannel, duplicate);
        duplicate.flip();
        return duplicate;
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i) throws IOException {
        int read;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(Math.min(duplicate.position() + i, duplicate.limit()));
        do {
            read = readableByteChannel.read(duplicate);
            if (read == -1) {
                break;
            }
        } while (duplicate.hasRemaining());
        if (read == -1) {
            return -1;
        }
        byteBuffer.position(duplicate.position());
        return read;
    }

    public static int readInt(ReadableByteChannel readableByteChannel, ByteOrder byteOrder) throws IOException {
        ByteBuffer order = ByteBuffer.allocate(4).order(byteOrder);
        readableByteChannel.read(order);
        order.flip();
        return order.getInt();
    }

    public static ByteBuffer combine(ByteBuffer... byteBufferArr) {
        return combine(byteBufferArr);
    }

    public static ByteBuffer fetchFrom(File file, int i) throws IOException {
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            return fetchFrom((ReadableByteChannel) fileChannel, i);
        } finally {
            closeQuietly(fileChannel);
        }
    }

    public static int read(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        int position = byteBuffer.position();
        while (readableByteChannel.read(byteBuffer) != -1) {
            if (!byteBuffer.hasRemaining()) {
                break;
            }
        }
        return byteBuffer.position() - position;
    }

    public static ByteBuffer read(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        byteBuffer.position(byteBuffer.limit());
        return duplicate;
    }
}
