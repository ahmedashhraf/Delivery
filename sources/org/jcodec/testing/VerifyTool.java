package org.jcodec.testing;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jcodec.codecs.h264.H264Decoder;
import org.jcodec.codecs.h264.MappedH264ES;
import org.jcodec.codecs.h264.p552io.model.Frame;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Packet;
import org.jcodec.common.model.Picture;

public class VerifyTool {

    /* renamed from: org.jcodec.testing.VerifyTool$a */
    class C15592a implements FilenameFilter {
        C15592a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".264");
        }
    }

    private void doIt(String str) throws IOException {
        File[] listFiles;
        for (File file : new File(str).listFiles(new C15592a())) {
            File file2 = new File(file.getParentFile(), file.getName().replaceAll(".264$", "_dec.yuv"));
            if (file.exists() && file2.exists()) {
                try {
                    if (test(file, file2)) {
                        PrintStream printStream = System.out;
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getAbsolutePath());
                        sb.append(" -- FIXED");
                        printStream.println(sb.toString());
                        file.delete();
                        file2.delete();
                    } else {
                        PrintStream printStream2 = System.out;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(file.getAbsolutePath());
                        sb2.append(" -- NOT FIXED!!!!");
                        printStream2.println(sb2.toString());
                    }
                } catch (Throwable th) {
                    PrintStream printStream3 = System.out;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(file.getAbsolutePath());
                    sb3.append(" -- ERROR: ");
                    sb3.append(th.getMessage());
                    printStream3.println(sb3.toString());
                }
            }
        }
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length != 1) {
            System.out.println("Syntax: <error folder location>");
        } else {
            new VerifyTool().doIt(strArr[0]);
        }
    }

    private boolean test(File file, File file2) throws IOException {
        Picture createCompatible;
        int i;
        ByteBuffer read;
        MappedH264ES mappedH264ES = new MappedH264ES(NIOUtils.fetchFrom(file));
        Picture create = Picture.create(1920, 1088, ColorSpace.YUV420);
        H264Decoder h264Decoder = new H264Decoder();
        ByteBuffer fetchFrom = NIOUtils.fetchFrom(file2);
        do {
            Packet nextFrame = mappedH264ES.nextFrame();
            if (nextFrame == null) {
                return true;
            }
            Frame cropped = h264Decoder.decodeFrame(nextFrame.getData(), create.getData()).cropped();
            createCompatible = cropped.createCompatible();
            createCompatible.copyFrom(cropped);
            int width = createCompatible.getWidth() * createCompatible.getHeight();
            i = width >> 2;
            read = NIOUtils.read(fetchFrom, width + i + i);
            if (!Arrays.equals(JCodecUtil.getAsIntArray(read, width), createCompatible.getPlaneData(0)) || !Arrays.equals(JCodecUtil.getAsIntArray(read, i), createCompatible.getPlaneData(1))) {
                return false;
            }
        } while (Arrays.equals(JCodecUtil.getAsIntArray(read, i), createCompatible.getPlaneData(2)));
        return false;
    }
}
