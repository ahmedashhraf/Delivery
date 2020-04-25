package org.jcodec.movtool;

import java.io.File;
import java.io.PrintStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.movtool.Flattern.ProgressListener;

public class QTEdit {
    protected final EditFactory[] factories;
    private final List<ProgressListener> listeners = new ArrayList();

    public static abstract class BaseCommand implements MP4Edit {
        public abstract void apply(MovieBox movieBox);

        public void apply(MovieBox movieBox, FileChannel[][] fileChannelArr) {
            apply(movieBox);
        }
    }

    public interface EditFactory {
        String getHelp();

        String getName();

        MP4Edit parseArgs(List<String> list);
    }

    public QTEdit(EditFactory... editFactoryArr) {
        this.factories = editFactoryArr;
    }

    public void addProgressListener(ProgressListener progressListener) {
        this.listeners.add(progressListener);
    }

    public void execute(String[] strArr) throws Exception {
        LinkedList linkedList = new LinkedList(Arrays.asList(strArr));
        LinkedList linkedList2 = new LinkedList();
        while (linkedList.size() > 0) {
            int i = 0;
            while (true) {
                if (i >= this.factories.length) {
                    break;
                } else if (((String) linkedList.get(0)).equals(this.factories[i].getName())) {
                    linkedList.remove(0);
                    try {
                        linkedList2.add(this.factories[i].parseArgs(linkedList));
                        break;
                    } catch (Exception e) {
                        PrintStream printStream = System.err;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ERROR: ");
                        sb.append(e.getMessage());
                        printStream.println(sb.toString());
                        return;
                    }
                } else {
                    i++;
                }
            }
            if (i == this.factories.length) {
                break;
            }
        }
        if (linkedList.size() == 0) {
            System.err.println("ERROR: A movie file should be specified");
            help();
        }
        if (linkedList2.size() == 0) {
            System.err.println("ERROR: At least one command should be specified");
            help();
        }
        File file = new File((String) linkedList.remove(0));
        if (!file.exists()) {
            PrintStream printStream2 = System.err;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ERROR: Input file '");
            sb2.append(file.getAbsolutePath());
            sb2.append("' doesn't exist");
            printStream2.println(sb2.toString());
            help();
        }
        new ReplaceMP4Editor().replace(file, new CompoundMP4Edit(linkedList2));
    }

    /* access modifiers changed from: protected */
    public void help() {
        EditFactory[] editFactoryArr;
        System.out.println("Quicktime movie editor");
        System.out.println("Syntax: qtedit <command1> <options> ... <commandN> <options> <movie>");
        System.out.println("Where options:");
        for (EditFactory editFactory : this.factories) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("\t");
            sb.append(editFactory.getHelp());
            printStream.println(sb.toString());
        }
        System.exit(-1);
    }
}
