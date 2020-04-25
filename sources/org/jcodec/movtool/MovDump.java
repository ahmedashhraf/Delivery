package org.jcodec.movtool;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.MP4Util.Atom;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.NodeBox;

public class MovDump {
    private static void dumpHeader(File file, File file2) throws IOException, FileNotFoundException {
        FileChannelWrapper fileChannelWrapper;
        FileChannelWrapper fileChannelWrapper2 = null;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file2);
            try {
                FileChannelWrapper writableFileChannel = NIOUtils.writableFileChannel(file);
                for (Atom atom : MP4Util.getRootAtoms(fileChannelWrapper)) {
                    String fourcc = atom.getHeader().getFourcc();
                    if ("moov".equals(fourcc) || "ftyp".equals(fourcc)) {
                        atom.copy(fileChannelWrapper, writableFileChannel);
                    }
                }
                fileChannelWrapper.close();
                writableFileChannel.close();
            } catch (Throwable th) {
                th = th;
                fileChannelWrapper.close();
                fileChannelWrapper2.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = fileChannelWrapper2;
            fileChannelWrapper.close();
            fileChannelWrapper2.close();
            throw th;
        }
    }

    private static Box findDeep(NodeBox nodeBox, String str) {
        for (Box box : nodeBox.getBoxes()) {
            if (str.equalsIgnoreCase(box.getFourcc())) {
                return box;
            }
            if (box instanceof NodeBox) {
                Box findDeep = findDeep((NodeBox) box, str);
                if (findDeep != null) {
                    return findDeep;
                }
            }
        }
        return null;
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length < 1) {
            System.out.println("Syntax: movdump [options] <filename>");
            System.out.println("Options: \n\t-f <filename> save header to a file\n\t-a <atom name> dump only a specific atom\n");
            return;
        }
        int i = 0;
        File file = null;
        String str = null;
        while (i < strArr.length) {
            if (!"-f".equals(strArr[i])) {
                if (!"-a".equals(strArr[i])) {
                    break;
                }
                int i2 = i + 1;
                int i3 = i2 + 1;
                str = strArr[i2];
                i = i3;
            } else {
                int i4 = i + 1;
                int i5 = i4 + 1;
                file = new File(strArr[i4]);
                i = i5;
            }
        }
        File file2 = new File(strArr[i]);
        if (file != null) {
            dumpHeader(file, file2);
        }
        if (str == null) {
            System.out.println(print(file2));
        } else {
            String print = print(file2, str);
            if (print != null) {
                System.out.println(print);
            }
        }
    }

    public static String print(File file) throws IOException {
        return MP4Util.parseMovie(file).toString();
    }

    public static String print(File file, String str) throws IOException {
        Box findDeep = findDeep(MP4Util.parseMovie(file), str);
        if (findDeep != null) {
            return findDeep.toString();
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Atom ");
        sb.append(str);
        sb.append(" not found.");
        printStream.println(sb.toString());
        return null;
    }
}
