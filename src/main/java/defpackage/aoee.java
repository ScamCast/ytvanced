package defpackage;

/* renamed from: aoee */
public final class aoee extends anxl implements anzf {
    public static final aoee d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private aoee() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"a", "b", aoek.a, "c", aoei.a});
            case 3:
                return new aoee();
            case 4:
                return new aoeh();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aoee.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoee aoee = new aoee();
        d = aoee;
        anxl.registerDefaultInstance(aoee.class, aoee);
    }
}
