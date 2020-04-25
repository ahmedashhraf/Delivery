package org.jcodec.movtool;

import java.io.File;
import java.nio.ByteBuffer;
import org.jcodec.codecs.prores.ProresFix;
import org.jcodec.containers.mp4.MP4Packet;

public class ReExport extends Remux {
    private ByteBuffer outBuf;

    public static void main(String[] strArr) throws Exception {
        if (strArr.length < 1) {
            System.out.println("reexport <movie> <out>");
            return;
        }
        File file = new File(strArr[0]);
        File hidFile = Remux.hidFile(file);
        file.renameTo(hidFile);
        try {
            new ReExport().remux(file, hidFile, null, null);
        } catch (Throwable th) {
            th.printStackTrace();
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(file.getName());
            sb.append(".error");
            file.renameTo(new File(parentFile, sb.toString()));
            hidFile.renameTo(file);
        }
    }

    /* access modifiers changed from: protected */
    public MP4Packet processFrame(MP4Packet mP4Packet) {
        if (this.outBuf == null) {
            this.outBuf = ByteBuffer.allocate(mP4Packet.getData().remaining() * 2);
        }
        return new MP4Packet(mP4Packet, ProresFix.transcode(mP4Packet.getData(), this.outBuf));
    }
}
