package defpackage;

/* renamed from: atys */
public final class atys extends anxl implements anzf {
    public static final atys d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c = "";

    private atys() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000", new Object[]{"a", "b", atyu.class, "c"});
            case 3:
                return new atys();
            case 4:
                return new atyv();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atys.class) {
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
        atys atys = new atys();
        d = atys;
        anxl.registerDefaultInstance(atys.class, atys);
    }
}
