package defpackage;

/* renamed from: asqb */
public final class asqb extends anxl implements anzf {
    public static final asqb e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private asqb() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0003\u0001Љ\u0000\u0003Л\u0004Л", new Object[]{"a", "b", "c", aspr.class, "d", axak.class});
            case 3:
                return new asqb();
            case 4:
                return new asqe();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asqb.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asqb asqb = new asqb();
        e = asqb;
        anxl.registerDefaultInstance(asqb.class, asqb);
    }
}
