package defpackage;

/* renamed from: aopp */
public final class aopp extends anxl implements anzf {
    public static final aopp e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    private aopp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aopp();
            case 4:
                return new aopo();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aopp.class) {
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
        aopp aopp = new aopp();
        e = aopp;
        anxl.registerDefaultInstance(aopp.class, aopp);
    }
}
