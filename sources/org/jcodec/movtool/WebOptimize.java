package org.jcodec.movtool;

import java.io.File;
import java.io.IOException;
import org.jcodec.containers.mp4.MP4Util;

public class WebOptimize {
    public static void main(String[] strArr) throws IOException {
        if (strArr.length < 1) {
            System.out.println("Syntax: optimize <movie>");
            System.exit(-1);
        }
        File file = new File(strArr[0]);
        File hidFile = Remux.hidFile(file);
        file.renameTo(hidFile);
        try {
            new Flattern().flattern(MP4Util.createRefMovie(hidFile), file);
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
}
