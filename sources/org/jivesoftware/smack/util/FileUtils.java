package org.jivesoftware.smack.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FileUtils {
    private static final Logger LOGGER = Logger.getLogger(FileUtils.class.getName());

    public static boolean addLines(String str, Set<String> set) throws MalformedURLException, IOException {
        InputStream streamForUrl = getStreamForUrl(str, null);
        if (streamForUrl == null) {
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamForUrl));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return true;
            }
            set.add(readLine);
        }
    }

    public static List<ClassLoader> getClassLoaders() {
        ClassLoader[] classLoaderArr = {FileUtils.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList(classLoaderArr.length);
        for (ClassLoader classLoader : classLoaderArr) {
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return arrayList;
    }

    public static InputStream getStreamForUrl(String str, ClassLoader classLoader) throws MalformedURLException, IOException {
        URI create = URI.create(str);
        if (create.getScheme() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No protocol found in file URL: ");
            sb.append(str);
            throw new MalformedURLException(sb.toString());
        } else if (!create.getScheme().equals("classpath")) {
            return create.toURL().openStream();
        } else {
            List<ClassLoader> classLoaders = getClassLoaders();
            if (classLoader != null) {
                classLoaders.add(0, classLoader);
            }
            for (ClassLoader resourceAsStream : classLoaders) {
                InputStream resourceAsStream2 = resourceAsStream.getResourceAsStream(create.getSchemeSpecificPart());
                if (resourceAsStream2 != null) {
                    return resourceAsStream2;
                }
            }
            return null;
        }
    }

    public static String readFile(File file) {
        String str = "readFile";
        try {
            return readFileOrThrow(file);
        } catch (FileNotFoundException e) {
            LOGGER.log(Level.FINE, str, e);
            return null;
        } catch (IOException e2) {
            LOGGER.log(Level.WARNING, str, e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFileOrThrow(java.io.File r4) throws java.io.FileNotFoundException, java.io.IOException {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0024 }
            r1.<init>(r4)     // Catch:{ all -> 0x0024 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x0022 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r0.<init>()     // Catch:{ all -> 0x0022 }
        L_0x000f:
            int r2 = r1.read(r4)     // Catch:{ all -> 0x0022 }
            if (r2 < 0) goto L_0x001a
            r3 = 0
            r0.append(r4, r3, r2)     // Catch:{ all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0022 }
            r1.close()
            return r4
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r4 = move-exception
            r1 = r0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()
        L_0x002b:
            goto L_0x002d
        L_0x002c:
            throw r4
        L_0x002d:
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.FileUtils.readFileOrThrow(java.io.File):java.lang.String");
    }

    public static boolean writeFile(File file, String str) {
        try {
            writeFileOrThrow(file, str);
            return true;
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "writeFile", e);
            return false;
        }
    }

    public static void writeFileOrThrow(File file, String str) throws IOException {
        FileWriter fileWriter = new FileWriter(file, false);
        fileWriter.write(str);
        fileWriter.close();
    }
}
