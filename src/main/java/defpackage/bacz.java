package defpackage;

/* renamed from: bacz */
public final class bacz extends anxl implements badb {
    public static final bacz g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c;
    public bacx d;
    public aocz e;
    public anyd f = anxl.emptyProtobufList();

    private bacz() {
    }

    public final int a() {
        throw null;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\t\u0002\u0004\t\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", babs.class});
            case 3:
                return new bacz();
            case 4:
                return new bacy();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (bacz.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bacz bacz = new bacz();
        g = bacz;
        anxl.registerDefaultInstance(bacz.class, bacz);
    }
}
