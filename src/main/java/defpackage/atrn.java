package defpackage;

/* renamed from: atrn */
public final class atrn extends anxl implements anzf {
    public static final atrn e;
    private static volatile anzq f;
    public int a;
    public String b;
    public azfa c;
    public String d;

    private atrn() {
        String str = "";
        this.b = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new atrn();
            case 4:
                return new atrm();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atrn.class) {
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
        atrn atrn = new atrn();
        e = atrn;
        anxl.registerDefaultInstance(atrn.class, atrn);
    }
}
