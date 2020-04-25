package org.jcodec.movtool;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedList;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.movtool.QTEdit.EditFactory;

public class QTRefEdit {
    protected final EditFactory[] factories;

    public QTRefEdit(EditFactory... editFactoryArr) {
        this.factories = editFactoryArr;
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
        if (linkedList.size() == 0) {
            System.err.println("ERROR: A movie output file should be specified");
            help();
        }
        File file2 = new File((String) linkedList.remove(0));
        if (!file.exists()) {
            PrintStream printStream2 = System.err;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ERROR: Input file '");
            sb2.append(file.getAbsolutePath());
            sb2.append("' doesn't exist");
            printStream2.println(sb2.toString());
            help();
        }
        if (file2.exists()) {
            PrintStream printStream3 = System.err;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("WARNING: Output file '");
            sb3.append(file2.getAbsolutePath());
            sb3.append("' exist, overwritting");
            printStream3.println(sb3.toString());
        }
        MovieBox createRefMovie = MP4Util.createRefMovie(file);
        new CompoundMP4Edit(linkedList2).apply(createRefMovie);
        MP4Util.writeMovie(file2, createRefMovie);
        PrintStream printStream4 = System.out;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("INFO: Created reference file: ");
        sb4.append(file2.getAbsolutePath());
        printStream4.println(sb4.toString());
    }

    /* access modifiers changed from: protected */
    public void help() {
        EditFactory[] editFactoryArr;
        System.out.println("Quicktime movie editor");
        System.out.println("Syntax: qtedit <command1> <options> ... <commandN> <options> <movie> <output>");
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
