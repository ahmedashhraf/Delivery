package org.jcodec.containers.mps.psi;

import java.nio.ByteBuffer;

public class PSISection {
    private int currentNextIndicator;
    private int lastSectionNumber;
    private int sectionNumber;
    private int specificId;
    private int tableId;
    private int versionNumber;

    public PSISection(PSISection pSISection) {
        this(pSISection.tableId, pSISection.specificId, pSISection.versionNumber, pSISection.currentNextIndicator, pSISection.sectionNumber, pSISection.lastSectionNumber);
    }

    public static PSISection parse(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get() & 255;
        short s = byteBuffer.getShort() & 65535;
        if ((49152 & s) == 32768) {
            byteBuffer.limit(byteBuffer.position() + (s & 4095));
            byte b2 = byteBuffer.get() & 255;
            PSISection pSISection = new PSISection(b, byteBuffer.getShort() & 65535, (b2 >> 1) & 31, b2 & 1, byteBuffer.get() & 255, byteBuffer.get() & 255);
            return pSISection;
        }
        throw new RuntimeException("Invalid section data");
    }

    public int getCurrentNextIndicator() {
        return this.currentNextIndicator;
    }

    public int getLastSectionNumber() {
        return this.lastSectionNumber;
    }

    public int getSectionNumber() {
        return this.sectionNumber;
    }

    public int getSpecificId() {
        return this.specificId;
    }

    public int getTableId() {
        return this.tableId;
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }

    public PSISection(int i, int i2, int i3, int i4, int i5, int i6) {
        this.tableId = i;
        this.specificId = i2;
        this.versionNumber = i3;
        this.currentNextIndicator = i4;
        this.sectionNumber = i5;
        this.lastSectionNumber = i6;
    }
}
