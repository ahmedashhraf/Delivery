package org.jcodec.containers.mp4.boxes;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.jcodec.common.Assert;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.tools.ToJSON;

public abstract class Box {
    private static final String GET_MODEL_FIELDS = "getModelFields";
    protected Header header;

    public Box(Header header2) {
        this.header = header2;
    }

    /* renamed from: as */
    public static <T extends Box> T m68668as(Class<T> cls, LeafBox leafBox) {
        try {
            T t = (Box) cls.getConstructor(new Class[]{Header.class}).newInstance(new Object[]{leafBox.getHeader()});
            t.parse(leafBox.getData());
            return t;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void checkWrongSignature(Class cls) {
        for (Method name : cls.getDeclaredMethods()) {
            String name2 = name.getName();
            String str = GET_MODEL_FIELDS;
            if (name2.equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class ");
                sb.append(cls.getCanonicalName());
                sb.append(" contains 'getModelFields' of wrong signature.\n");
                sb.append("Did you mean to define 'protected void ");
                sb.append(str);
                sb.append("(List<String> model) ?");
                Logger.warn(sb.toString());
                return;
            }
        }
    }

    public static Box[] findAll(Box box, String... strArr) {
        return (Box[]) findAll(box, Box.class, strArr);
    }

    public static Box findFirst(NodeBox nodeBox, String... strArr) {
        return (Box) findFirst(nodeBox, Box.class, strArr);
    }

    private static void findSub(Box box, List<String> list, Collection<Box> collection) {
        if (list.size() > 0) {
            String str = (String) list.remove(0);
            if (box instanceof NodeBox) {
                for (Box box2 : ((NodeBox) box).getBoxes()) {
                    if (str == null || str.equals(box2.header.getFourcc())) {
                        findSub(box2, list, collection);
                    }
                }
            }
            list.add(0, str);
            return;
        }
        collection.add(box);
    }

    /* access modifiers changed from: protected */
    public void collectModel(Class cls, List<String> list) {
        Class<Box> cls2 = Box.class;
        if (cls2 != cls && cls2.isAssignableFrom(cls)) {
            collectModel(cls.getSuperclass(), list);
            try {
                cls.getDeclaredMethod(GET_MODEL_FIELDS, new Class[]{List.class}).invoke(this, new Object[]{list});
            } catch (NoSuchMethodException unused) {
                checkWrongSignature(cls);
                list.addAll(ToJSON.allFields(cls));
            } catch (Exception unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void doWrite(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    public void dump(StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\"tag\":\"");
        sb2.append(this.header.getFourcc());
        sb2.append("\",");
        sb.append(sb2.toString());
        ArrayList arrayList = new ArrayList(0);
        collectModel(getClass(), arrayList);
        ToJSON.fieldsToJSON(this, sb, (String[]) arrayList.toArray(new String[0]));
        sb.append("}");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public String getFourcc() {
        return this.header.getFourcc();
    }

    public Header getHeader() {
        return this.header;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public abstract void parse(ByteBuffer byteBuffer);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        dump(sb);
        return sb.toString();
    }

    public void write(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        NIOUtils.skip(byteBuffer, 8);
        doWrite(byteBuffer);
        this.header.setBodySize((byteBuffer.position() - duplicate.position()) - 8);
        Assert.assertEquals(this.header.headerSize(), 8);
        this.header.write(duplicate);
    }

    public static <T> T[] findAll(Box box, Class<T> cls, String... strArr) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (String add : strArr) {
            linkedList2.add(add);
        }
        findSub(box, linkedList2, linkedList);
        return linkedList.toArray((Object[]) Array.newInstance(cls, 0));
    }

    public static <T> T findFirst(NodeBox nodeBox, Class<T> cls, String... strArr) {
        T[] findAll = findAll(nodeBox, cls, strArr);
        if (findAll.length > 0) {
            return findAll[0];
        }
        return null;
    }

    public Box(Box box) {
        this.header = box.header;
    }
}
