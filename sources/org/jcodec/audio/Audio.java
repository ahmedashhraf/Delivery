package org.jcodec.audio;

import java.io.IOException;
import java.nio.FloatBuffer;

public class Audio {

    public static class DummyFilter implements AudioFilter {
        private int nInputs;

        public DummyFilter(int i) {
            this.nInputs = i;
        }

        public void filter(FloatBuffer[] floatBufferArr, long[] jArr, FloatBuffer[] floatBufferArr2) {
            for (int i = 0; i < floatBufferArr.length; i++) {
                if (floatBufferArr2[i].remaining() >= floatBufferArr[i].remaining()) {
                    floatBufferArr2[i].put(floatBufferArr[i]);
                } else {
                    floatBufferArr2[i].put((FloatBuffer) floatBufferArr[i].duplicate().limit(floatBufferArr[i].position() + floatBufferArr2[i].remaining()));
                }
            }
        }

        public int getDelay() {
            return 0;
        }

        public int getNInputs() {
            return this.nInputs;
        }

        public int getNOutputs() {
            return this.nInputs;
        }
    }

    public static void print(FloatBuffer floatBuffer) {
        FloatBuffer duplicate = floatBuffer.duplicate();
        while (duplicate.hasRemaining()) {
            System.out.print(String.format("%.3f,", new Object[]{Float.valueOf(duplicate.get())}));
        }
        System.out.println();
    }

    public static void rotate(FloatBuffer floatBuffer) {
        int i = 0;
        while (floatBuffer.hasRemaining()) {
            floatBuffer.put(i, floatBuffer.get());
            i++;
        }
        floatBuffer.position(i);
        floatBuffer.limit(floatBuffer.capacity());
    }

    public static void transfer(AudioSource audioSource, AudioSink audioSink) throws IOException {
        transfer(audioSource, new DummyFilter(1), audioSink);
    }

    public static void transfer(AudioSource audioSource, AudioFilter audioFilter, AudioSink audioSink) throws IOException {
        if (audioFilter.getNInputs() != 1) {
            throw new IllegalArgumentException("Audio filter has # inputs != 1");
        } else if (audioFilter.getNOutputs() != 1) {
            throw new IllegalArgumentException("Audio filter has # outputs != 1");
        } else if (audioFilter.getDelay() == 0) {
            FloatBuffer[] floatBufferArr = {FloatBuffer.allocate(4096)};
            FloatBuffer[] floatBufferArr2 = {FloatBuffer.allocate(8192)};
            long[] jArr = new long[1];
            while (audioSource.read(floatBufferArr[0]) != -1) {
                floatBufferArr[0].flip();
                audioFilter.filter(floatBufferArr, jArr, floatBufferArr2);
                jArr[0] = jArr[0] + ((long) floatBufferArr[0].position());
                rotate(floatBufferArr[0]);
                floatBufferArr2[0].flip();
                audioSink.write(floatBufferArr2[0]);
                floatBufferArr2[0].clear();
            }
        } else {
            throw new IllegalArgumentException("Audio filter has delay");
        }
    }
}
