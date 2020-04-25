package org.jcodec.containers.mp4.boxes;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.jcodec.codecs.wav.StringReader;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.logging.Logger;

public class Header {
    private static final long MAX_UNSIGNED_INT = 4294967296L;
    private String fourcc;
    private boolean lng;
    private long size;

    public Header(String str) {
        this.fourcc = str;
    }

    public static Header read(ByteBuffer byteBuffer) {
        long j = 0;
        while (byteBuffer.remaining() >= 4) {
            j = ((long) byteBuffer.getInt()) & 4294967295L;
            if (j != 0) {
                break;
            }
        }
        String str = "Broken atom of size ";
        if (byteBuffer.remaining() < 4 || (j < 8 && j != 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(j);
            Logger.error(sb.toString());
            return null;
        }
        String readString = NIOUtils.readString(byteBuffer, 4);
        boolean z = false;
        if (j == 1) {
            if (byteBuffer.remaining() >= 8) {
                z = true;
                j = byteBuffer.getLong();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(j);
                Logger.error(sb2.toString());
                return null;
            }
        }
        return new Header(readString, j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Header.class != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        String str = this.fourcc;
        if (str == null) {
            if (header.fourcc != null) {
                return false;
            }
        } else if (!str.equals(header.fourcc)) {
            return false;
        }
        return true;
    }

    public long getBodySize() {
        return this.size - headerSize();
    }

    public String getFourcc() {
        return this.fourcc;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.fourcc;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public long headerSize() {
        return (this.lng || this.size > MAX_UNSIGNED_INT) ? 16 : 8;
    }

    public byte[] readContents(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; ((long) i) < this.size - headerSize(); i++) {
            byteArrayOutputStream.write(inputStream.read());
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void setBodySize(int i) {
        this.size = ((long) i) + headerSize();
    }

    public void skip(InputStream inputStream) throws IOException {
        StringReader.sureSkip(inputStream, this.size - headerSize());
    }

    public void write(ByteBuffer byteBuffer) {
        long j = this.size;
        if (j > MAX_UNSIGNED_INT) {
            byteBuffer.putInt(1);
        } else {
            byteBuffer.putInt((int) j);
        }
        byteBuffer.put(JCodecUtil.asciiString(this.fourcc));
        long j2 = this.size;
        if (j2 > MAX_UNSIGNED_INT) {
            byteBuffer.putLong(j2);
        }
    }

    public Header(String str, long j) {
        this.size = j;
        this.fourcc = str;
    }

    public Header(Header header) {
        this.fourcc = header.fourcc;
        this.size = header.size;
    }

    public void write(SeekableByteChannel seekableByteChannel) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        write(allocate);
        allocate.flip();
        seekableByteChannel.write(allocate);
    }

    public Header(String str, long j, boolean z) {
        this(str, j);
        this.lng = z;
    }
}
