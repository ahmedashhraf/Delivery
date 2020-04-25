package org.jcodec.audio;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jcodec.audio.Audio.DummyFilter;

public class FilterGraph implements AudioFilter {
    private FilterSocket[] sockets;

    public static class Factory {
        private List<FilterSocket> sockets = new ArrayList();

        protected Factory(AudioFilter audioFilter) {
            if (audioFilter.getDelay() != 0) {
                this.sockets.add(new FilterSocket(new DummyFilter(audioFilter.getNInputs())));
                addLevel(audioFilter);
                return;
            }
            this.sockets.add(new FilterSocket(audioFilter));
        }

        public Factory addLevel(AudioFilter... audioFilterArr) {
            FilterSocket filterSocket = new FilterSocket(audioFilterArr);
            filterSocket.allocateBuffers(4096);
            this.sockets.add(filterSocket);
            return this;
        }

        public Factory addLevelSpan(AudioFilter audioFilter) {
            List<FilterSocket> list = this.sockets;
            int totalOutputs = ((FilterSocket) list.get(list.size() - 1)).getTotalOutputs();
            if (totalOutputs % audioFilter.getNInputs() == 0) {
                return addLevel(audioFilter, totalOutputs / audioFilter.getNInputs());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Can't fill ");
            sb.append(totalOutputs);
            sb.append(" with multiple of ");
            sb.append(audioFilter.getNInputs());
            throw new IllegalArgumentException(sb.toString());
        }

        public FilterGraph create() {
            return new FilterGraph((FilterSocket[]) this.sockets.toArray(new FilterSocket[0]));
        }

        public Factory addLevel(AudioFilter audioFilter, int i) {
            AudioFilter[] audioFilterArr = new AudioFilter[i];
            Arrays.fill(audioFilterArr, audioFilter);
            return addLevel(audioFilterArr);
        }
    }

    public static Factory addLevel(AudioFilter audioFilter) {
        return new Factory(audioFilter);
    }

    public void filter(FloatBuffer[] floatBufferArr, long[] jArr, FloatBuffer[] floatBufferArr2) {
        this.sockets[0].setBuffers(floatBufferArr, jArr);
        int i = 0;
        while (true) {
            FilterSocket[] filterSocketArr = this.sockets;
            if (i < filterSocketArr.length) {
                FloatBuffer[] buffers = i < filterSocketArr.length + -1 ? filterSocketArr[i + 1].getBuffers() : floatBufferArr2;
                this.sockets[i].filter(buffers);
                if (i > 0) {
                    this.sockets[i].rotate();
                }
                if (i < this.sockets.length - 1) {
                    for (FloatBuffer flip : buffers) {
                        flip.flip();
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public int getDelay() {
        return this.sockets[0].getFilters()[0].getDelay();
    }

    public int getNInputs() {
        return this.sockets[0].getTotalInputs();
    }

    public int getNOutputs() {
        FilterSocket[] filterSocketArr = this.sockets;
        return filterSocketArr[filterSocketArr.length - 1].getTotalOutputs();
    }

    private FilterGraph(FilterSocket[] filterSocketArr) {
        this.sockets = filterSocketArr;
    }
}
