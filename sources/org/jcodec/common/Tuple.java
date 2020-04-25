package org.jcodec.common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tuple {

    public interface Mapper<T, U> {
        U map(T t);
    }

    /* renamed from: org.jcodec.common.Tuple$_1 */
    public static class C15537_1<T0> {

        /* renamed from: v0 */
        public final T0 f44795v0;

        public C15537_1(T0 t0) {
            this.f44795v0 = t0;
        }
    }

    /* renamed from: org.jcodec.common.Tuple$_2 */
    public static class C15538_2<T0, T1> {

        /* renamed from: v0 */
        public final T0 f44796v0;

        /* renamed from: v1 */
        public final T1 f44797v1;

        public C15538_2(T0 t0, T1 t1) {
            this.f44796v0 = t0;
            this.f44797v1 = t1;
        }
    }

    /* renamed from: org.jcodec.common.Tuple$_3 */
    public static class C15539_3<T0, T1, T2> {

        /* renamed from: v0 */
        public final T0 f44798v0;

        /* renamed from: v1 */
        public final T1 f44799v1;

        /* renamed from: v2 */
        public final T2 f44800v2;

        public C15539_3(T0 t0, T1 t1, T2 t2) {
            this.f44798v0 = t0;
            this.f44799v1 = t1;
            this.f44800v2 = t2;
        }
    }

    /* renamed from: org.jcodec.common.Tuple$_4 */
    public static class C15540_4<T0, T1, T2, T3> {

        /* renamed from: v0 */
        public final T0 f44801v0;

        /* renamed from: v1 */
        public final T1 f44802v1;

        /* renamed from: v2 */
        public final T2 f44803v2;

        /* renamed from: v3 */
        public final T3 f44804v3;

        public C15540_4(T0 t0, T1 t1, T2 t2, T3 t3) {
            this.f44801v0 = t0;
            this.f44802v1 = t1;
            this.f44803v2 = t2;
            this.f44804v3 = t3;
        }
    }

    /* renamed from: _1 */
    public static <T0> C15537_1<T0> m68659_1(T0 t0) {
        return new C15537_1<>(t0);
    }

    public static <T0> List<T0> _1_project0(List<C15537_1<T0>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15537_1 _1 : list) {
            linkedList.add(_1.f44795v0);
        }
        return linkedList;
    }

    public static <T0, U> List<C15537_1<U>> _1map0(List<C15537_1<T0>> list, Mapper<T0, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15537_1 _1 : list) {
            linkedList.add(m68659_1(mapper.map(_1.f44795v0)));
        }
        return linkedList;
    }

    /* renamed from: _2 */
    public static <T0, T1> C15538_2<T0, T1> m68660_2(T0 t0, T1 t1) {
        return new C15538_2<>(t0, t1);
    }

    public static <T0, T1> List<T0> _2_project0(List<C15538_2<T0, T1>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15538_2 _2 : list) {
            linkedList.add(_2.f44796v0);
        }
        return linkedList;
    }

    public static <T0, T1> List<T1> _2_project1(List<C15538_2<T0, T1>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15538_2 _2 : list) {
            linkedList.add(_2.f44797v1);
        }
        return linkedList;
    }

    public static <T0, T1, U> List<C15538_2<U, T1>> _2map0(List<C15538_2<T0, T1>> list, Mapper<T0, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15538_2 _2 : list) {
            linkedList.add(m68660_2(mapper.map(_2.f44796v0), _2.f44797v1));
        }
        return linkedList;
    }

    public static <T0, T1, U> List<C15538_2<T0, U>> _2map1(List<C15538_2<T0, T1>> list, Mapper<T1, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15538_2 _2 : list) {
            linkedList.add(m68660_2(_2.f44796v0, mapper.map(_2.f44797v1)));
        }
        return linkedList;
    }

    /* renamed from: _3 */
    public static <T0, T1, T2> C15539_3<T0, T1, T2> m68661_3(T0 t0, T1 t1, T2 t2) {
        return new C15539_3<>(t0, t1, t2);
    }

    public static <T0, T1, T2, T3> List<T0> _3_project0(List<C15539_3<T0, T1, T2>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15539_3 _3 : list) {
            linkedList.add(_3.f44798v0);
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3> List<T1> _3_project1(List<C15539_3<T0, T1, T2>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15539_3 _3 : list) {
            linkedList.add(_3.f44799v1);
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3> List<T2> _3_project2(List<C15539_3<T0, T1, T2>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15539_3 _3 : list) {
            linkedList.add(_3.f44800v2);
        }
        return linkedList;
    }

    public static <T0, T1, T2, U> List<C15539_3<U, T1, T2>> _3map0(List<C15539_3<T0, T1, T2>> list, Mapper<T0, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15539_3 _3 : list) {
            linkedList.add(m68661_3(mapper.map(_3.f44798v0), _3.f44799v1, _3.f44800v2));
        }
        return linkedList;
    }

    public static <T0, T1, T2, U> List<C15539_3<T0, U, T2>> _3map1(List<C15539_3<T0, T1, T2>> list, Mapper<T1, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15539_3 _3 : list) {
            linkedList.add(m68661_3(_3.f44798v0, mapper.map(_3.f44799v1), _3.f44800v2));
        }
        return linkedList;
    }

    public static <T0, T1, T2, U> List<C15539_3<T0, T1, U>> _3map3(List<C15539_3<T0, T1, T2>> list, Mapper<T2, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15539_3 _3 : list) {
            linkedList.add(m68661_3(_3.f44798v0, _3.f44799v1, mapper.map(_3.f44800v2)));
        }
        return linkedList;
    }

    /* renamed from: _4 */
    public static <T0, T1, T2, T3> C15540_4<T0, T1, T2, T3> m68662_4(T0 t0, T1 t1, T2 t2, T3 t3) {
        return new C15540_4<>(t0, t1, t2, t3);
    }

    public static <T0, T1, T2, T3> List<T0> _4_project0(List<C15540_4<T0, T1, T2, T3>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(_4.f44801v0);
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3> List<T1> _4_project1(List<C15540_4<T0, T1, T2, T3>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(_4.f44802v1);
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3> List<T2> _4_project2(List<C15540_4<T0, T1, T2, T3>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(_4.f44803v2);
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3> List<T3> _4_project3(List<C15540_4<T0, T1, T2, T3>> list) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(_4.f44804v3);
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3, U> List<C15540_4<U, T1, T2, T3>> _4map0(List<C15540_4<T0, T1, T2, T3>> list, Mapper<T0, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(m68662_4(mapper.map(_4.f44801v0), _4.f44802v1, _4.f44803v2, _4.f44804v3));
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3, U> List<C15540_4<T0, U, T2, T3>> _4map1(List<C15540_4<T0, T1, T2, T3>> list, Mapper<T1, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(m68662_4(_4.f44801v0, mapper.map(_4.f44802v1), _4.f44803v2, _4.f44804v3));
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3, U> List<C15540_4<T0, T1, U, T3>> _4map3(List<C15540_4<T0, T1, T2, T3>> list, Mapper<T2, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(m68662_4(_4.f44801v0, _4.f44802v1, mapper.map(_4.f44803v2), _4.f44804v3));
        }
        return linkedList;
    }

    public static <T0, T1, T2, T3, U> List<C15540_4<T0, T1, T2, U>> _4map4(List<C15540_4<T0, T1, T2, T3>> list, Mapper<T3, U> mapper) {
        LinkedList linkedList = new LinkedList();
        for (C15540_4 _4 : list) {
            linkedList.add(m68662_4(_4.f44801v0, _4.f44802v1, _4.f44803v2, mapper.map(_4.f44804v3)));
        }
        return linkedList;
    }

    public static <T0, T1> C15538_2<T0, T1>[] asArray(Map<T0, T1> map) {
        C15538_2<T0, T1>[] _2Arr = (C15538_2[]) new Object[map.size()];
        int i = 0;
        for (Entry entry : map.entrySet()) {
            int i2 = i + 1;
            _2Arr[i] = m68660_2(entry.getKey(), entry.getValue());
            i = i2;
        }
        return _2Arr;
    }

    public static <T0, T1> List<C15538_2<T0, T1>> asList(Map<T0, T1> map) {
        LinkedList linkedList = new LinkedList();
        for (Entry entry : map.entrySet()) {
            linkedList.add(m68660_2(entry.getKey(), entry.getValue()));
        }
        return linkedList;
    }

    public static <T0, T1> Map<T0, T1> asMap(Iterable<C15538_2<T0, T1>> iterable) {
        HashMap hashMap = new HashMap();
        for (C15538_2 _2 : iterable) {
            hashMap.put(_2.f44796v0, _2.f44797v1);
        }
        return hashMap;
    }

    public static <T0, T1> Map<T0, T1> asMap(C15538_2<T0, T1>[] _2Arr) {
        HashMap hashMap = new HashMap();
        for (C15538_2<T0, T1> _2 : _2Arr) {
            hashMap.put(_2.f44796v0, _2.f44797v1);
        }
        return hashMap;
    }
}
