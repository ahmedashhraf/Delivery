package org.jivesoftware.smackx.caps.cache;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smack.util.stringencoder.Base32;
import org.jivesoftware.smack.util.stringencoder.StringEncoder;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;

public class SimpleDirectoryPersistentCache implements EntityCapsPersistentCache {
    private static final Logger LOGGER = Logger.getLogger(SimpleDirectoryPersistentCache.class.getName());
    private File cacheDir;
    private StringEncoder filenameEncoder;

    public SimpleDirectoryPersistentCache(File file) {
        this(file, Base32.getStringEncoder());
    }

    private File getFileFor(String str) {
        return new File(this.cacheDir, this.filenameEncoder.encode(str));
    }

    private static DiscoverInfo restoreInfoFromFile(File file) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            String readUTF = dataInputStream.readUTF();
            if (readUTF == null) {
                return null;
            }
            return (DiscoverInfo) PacketParserUtils.parseStanza(readUTF);
        } finally {
            dataInputStream.close();
        }
    }

    private static void writeInfoToFile(File file, DiscoverInfo discoverInfo) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeUTF(discoverInfo.toXML().toString());
        } finally {
            dataOutputStream.close();
        }
    }

    public void addDiscoverInfoByNodePersistent(String str, DiscoverInfo discoverInfo) {
        File fileFor = getFileFor(str);
        try {
            if (fileFor.createNewFile()) {
                writeInfoToFile(fileFor, discoverInfo);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Failed to write disco info to file", e);
        }
    }

    public void emptyCache() {
        for (File delete : this.cacheDir.listFiles()) {
            delete.delete();
        }
    }

    public DiscoverInfo lookup(String str) {
        File fileFor = getFileFor(str);
        DiscoverInfo discoverInfo = null;
        if (!fileFor.isFile()) {
            return null;
        }
        try {
            discoverInfo = restoreInfoFromFile(fileFor);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Coud not restore info from file", e);
        }
        return discoverInfo;
    }

    public SimpleDirectoryPersistentCache(File file, StringEncoder stringEncoder) {
        String str = "Cache directory \"";
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(file);
            sb.append("\" does not exist");
            throw new IllegalStateException(sb.toString());
        } else if (file.isDirectory()) {
            this.cacheDir = file;
            this.filenameEncoder = stringEncoder;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(file);
            sb2.append("\" is not a directory");
            throw new IllegalStateException(sb2.toString());
        }
    }
}
