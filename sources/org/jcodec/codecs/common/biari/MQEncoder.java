package org.jcodec.codecs.common.biari;

import androidx.core.p024e.p025b.C0886a;
import java.io.IOException;
import java.io.OutputStream;

public class MQEncoder {
    public static final int CARRY_MASK = 134217728;
    private int bitsToCode = 12;
    private int byteToGo;
    private long bytesOutput;
    private int offset = 0;
    private OutputStream out;
    private int range = 32768;

    public MQEncoder(OutputStream outputStream) {
        this.out = outputStream;
    }

    private void finalizeValue() {
        int i = this.offset;
        int i2 = i & 32768;
        this.offset = i & C0886a.f4059c;
        if (i2 == 0) {
            this.offset |= 32768;
        } else {
            this.offset += 65536;
        }
    }

    private void outputByte() throws IOException {
        if (this.bytesOutput == 0) {
            outputByteNoStuffing();
            return;
        }
        int i = this.byteToGo;
        if (i == 255) {
            outputByteWithStuffing();
            return;
        }
        int i2 = this.offset;
        if ((134217728 & i2) != 0) {
            this.byteToGo = i + 1;
            this.offset = 134217727 & i2;
            if (this.byteToGo == 255) {
                outputByteWithStuffing();
            } else {
                outputByteNoStuffing();
            }
        } else {
            outputByteNoStuffing();
        }
    }

    private void outputByteNoStuffing() throws IOException {
        this.bitsToCode = 8;
        if (this.bytesOutput > 0) {
            this.out.write(this.byteToGo);
        }
        int i = this.offset;
        this.byteToGo = (i >> 19) & 255;
        this.offset = i & 524287;
        this.bytesOutput++;
    }

    private void outputByteWithStuffing() throws IOException {
        this.bitsToCode = 7;
        if (this.bytesOutput > 0) {
            this.out.write(this.byteToGo);
        }
        int i = this.offset;
        this.byteToGo = (i >> 20) & 255;
        this.offset = i & 1048575;
        this.bytesOutput++;
    }

    private void renormalize() throws IOException {
        this.offset <<= 1;
        this.range <<= 1;
        this.range = (int) (((long) this.range) & 65535);
        this.bitsToCode--;
        if (this.bitsToCode == 0) {
            outputByte();
        }
    }

    public void encode(int i, Context context) throws IOException {
        int i2 = MQConst.pLps[context.getState()];
        if (i == context.getMps()) {
            this.range -= i2;
            this.offset += i2;
            if (this.range < 32768) {
                while (this.range < 32768) {
                    renormalize();
                }
                context.setState(MQConst.transitMPS[context.getState()]);
                return;
            }
            return;
        }
        this.range = i2;
        while (this.range < 32768) {
            renormalize();
        }
        if (MQConst.mpsSwitch[context.getState()] != 0) {
            context.setMps(1 - context.getMps());
        }
        context.setState(MQConst.transitLPS[context.getState()]);
    }

    public void finish() throws IOException {
        finalizeValue();
        int i = this.offset;
        int i2 = this.bitsToCode;
        this.offset = i << i2;
        int i3 = 12 - i2;
        outputByte();
        int i4 = this.bitsToCode;
        if (i3 - i4 > 0) {
            this.offset <<= i4;
            outputByte();
        }
        this.out.write(this.byteToGo);
    }
}
