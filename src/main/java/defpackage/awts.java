package defpackage;

/* renamed from: awts */
public final class awts extends anxl implements anzf {
    public static final awts g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public double c;
    public double d;
    public int e;
    public int f;

    private awts() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awts();
            case 4:
                return new awtv();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awts.class) {
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
        awts awts = new awts();
        g = awts;
        anxl.registerDefaultInstance(awts.class, awts);
    }
}
