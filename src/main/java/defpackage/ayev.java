package defpackage;

/* renamed from: ayev */
public final class ayev extends anxl implements anzf {
    public static final ayev d;
    private static volatile anzq e;
    public int a;
    public boolean b;
    public int c;

    private ayev() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ayev();
            case 4:
                return new ayey();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayev.class) {
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
        ayev ayev = new ayev();
        d = ayev;
        anxl.registerDefaultInstance(ayev.class, ayev);
    }
}
