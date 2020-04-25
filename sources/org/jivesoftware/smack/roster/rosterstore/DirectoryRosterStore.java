package org.jivesoftware.smack.roster.rosterstore;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemStatus;
import org.jivesoftware.smack.roster.packet.RosterPacket.ItemType;
import org.jivesoftware.smack.util.FileUtils;
import org.jivesoftware.smack.util.XmlStringBuilder;
import org.jivesoftware.smack.util.stringencoder.Base32;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class DirectoryRosterStore implements RosterStore {
    private static final String ENTRY_PREFIX = "entry-";
    private static final Logger LOGGER = Logger.getLogger(DirectoryRosterStore.class.getName());
    private static final String STORE_ID = "DEFAULT_ROSTER_STORE";
    private static final String VERSION_FILE_NAME = "__version__";
    private static final FileFilter rosterDirFilter = new FileFilter() {
        public boolean accept(File file) {
            return file.getName().startsWith(DirectoryRosterStore.ENTRY_PREFIX);
        }
    };
    private final File fileDir;

    private DirectoryRosterStore(File file) {
        this.fileDir = file;
    }

    private boolean addEntryRaw(Item item) {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = "item";
        xmlStringBuilder.openElement(str);
        xmlStringBuilder.element("user", item.getUser());
        xmlStringBuilder.optElement("name", item.getName());
        xmlStringBuilder.optElement("type", (Enum<?>) item.getItemType());
        xmlStringBuilder.optElement("status", (Enum<?>) item.getItemStatus());
        for (String str2 : item.getGroupNames()) {
            String str3 = Item.GROUP;
            xmlStringBuilder.openElement(str3);
            xmlStringBuilder.element("groupName", str2);
            xmlStringBuilder.closeElement(str3);
        }
        xmlStringBuilder.closeElement(str);
        return FileUtils.writeFile(getBareJidFile(item.getUser()), xmlStringBuilder.toString());
    }

    private File getBareJidFile(String str) {
        String encode = Base32.encode(str);
        File file = this.fileDir;
        StringBuilder sb = new StringBuilder();
        sb.append(ENTRY_PREFIX);
        sb.append(encode);
        return new File(file, sb.toString());
    }

    private File getVersionFile() {
        return new File(this.fileDir, VERSION_FILE_NAME);
    }

    public static DirectoryRosterStore init(File file) {
        DirectoryRosterStore directoryRosterStore = new DirectoryRosterStore(file);
        if (directoryRosterStore.setRosterVersion("")) {
            return directoryRosterStore;
        }
        return null;
    }

    private void log(String str) {
        System.err.println(str);
    }

    public static DirectoryRosterStore open(File file) {
        DirectoryRosterStore directoryRosterStore = new DirectoryRosterStore(file);
        String readFile = FileUtils.readFile(directoryRosterStore.getVersionFile());
        if (readFile == null || !readFile.startsWith("DEFAULT_ROSTER_STORE\n")) {
            return null;
        }
        return directoryRosterStore;
    }

    private Item readEntry(File file) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "Invalid group entry in store entry file ";
        String str6 = "readEntry()";
        String readFile = FileUtils.readFile(file);
        if (readFile == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(readFile));
            boolean z = false;
            loop0:
            while (true) {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                while (!z) {
                    int next = newPullParser.next();
                    String name = newPullParser.getName();
                    String str7 = "item";
                    if (next == 2) {
                        if (!name.equals(str7)) {
                            if (name.equals("user")) {
                                newPullParser.next();
                                str = newPullParser.getText();
                            } else if (name.equals("name")) {
                                newPullParser.next();
                                str2 = newPullParser.getText();
                            } else if (name.equals("type")) {
                                newPullParser.next();
                                str3 = newPullParser.getText();
                            } else if (name.equals("status")) {
                                newPullParser.next();
                                str4 = newPullParser.getText();
                            } else if (name.equals(Item.GROUP)) {
                                newPullParser.next();
                                newPullParser.next();
                                String text = newPullParser.getText();
                                if (text != null) {
                                    arrayList.add(text);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str5);
                                    sb.append(file);
                                    log(sb.toString());
                                }
                            }
                        }
                    } else if (next == 3 && name.equals(str7)) {
                        z = true;
                    }
                }
                break loop0;
            }
            if (str == null) {
                return null;
            }
            Item item = new Item(str, str2);
            for (String addGroupName : arrayList) {
                item.addGroupName(addGroupName);
            }
            if (str3 != null) {
                try {
                    item.setItemType(ItemType.valueOf(str3));
                    if (str4 != null) {
                        ItemStatus fromString = ItemStatus.fromString(str4);
                        if (fromString == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid status in store entry file ");
                            sb2.append(file);
                            log(sb2.toString());
                            return null;
                        }
                        item.setItemStatus(fromString);
                    }
                } catch (IllegalArgumentException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid type in store entry file ");
                    sb3.append(file);
                    log(sb3.toString());
                    return null;
                }
            }
            return item;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, str6, e);
            return null;
        } catch (XmlPullParserException e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str5);
            sb4.append(file);
            log(sb4.toString());
            LOGGER.log(Level.SEVERE, str6, e2);
            return null;
        }
    }

    private boolean setRosterVersion(String str) {
        File versionFile = getVersionFile();
        StringBuilder sb = new StringBuilder();
        sb.append("DEFAULT_ROSTER_STORE\n");
        sb.append(str);
        return FileUtils.writeFile(versionFile, sb.toString());
    }

    public boolean addEntry(Item item, String str) {
        return addEntryRaw(item) && setRosterVersion(str);
    }

    public Item getEntry(String str) {
        return readEntry(getBareJidFile(str));
    }

    public String getRosterVersion() {
        String readFile = FileUtils.readFile(getVersionFile());
        if (readFile == null) {
            return null;
        }
        String[] split = readFile.split("\n", 2);
        if (split.length < 2) {
            return null;
        }
        return split[1];
    }

    public boolean removeEntry(String str, String str2) {
        return getBareJidFile(str).delete() && setRosterVersion(str2);
    }

    public boolean resetEntries(Collection<Item> collection, String str) {
        for (File delete : this.fileDir.listFiles(rosterDirFilter)) {
            delete.delete();
        }
        for (Item addEntryRaw : collection) {
            if (!addEntryRaw(addEntryRaw)) {
                return false;
            }
        }
        return setRosterVersion(str);
    }

    public List<Item> getEntries() {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        for (File file : this.fileDir.listFiles(rosterDirFilter)) {
            Item readEntry = readEntry(file);
            if (readEntry == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Roster store file '");
                sb.append(file);
                sb.append("' is invalid.");
                log(sb.toString());
            } else {
                arrayList.add(readEntry);
            }
        }
        return arrayList;
    }
}
