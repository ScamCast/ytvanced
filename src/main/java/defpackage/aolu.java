package defpackage;

/* renamed from: aolu */
public final class aolu extends anxl implements anzf {
    public static final aolu e;
    private static volatile anzq f;
    public int a;
    public int b;
    public float c;
    public long d;

    private aolu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001\u0003\u0002\u0002", new Object[]{"a", "b", aolw.a, "c", "d"});
            case 3:
                return new aolu();
            case 4:
                return new aoly();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aolu.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aolu aolu = new aolu();
        e = aolu;
        anxl.registerDefaultInstance(aolu.class, aolu);
    }
}
