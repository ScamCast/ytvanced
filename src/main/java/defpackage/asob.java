package defpackage;

/* renamed from: asob */
public final class asob extends anxl implements anzf {
    public static final asob e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private asob() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0002\u0003\u0001Љ\u0000\u0004Л\u0005Л", new Object[]{"a", "b", "c", asnv.class, "d", apxu.class});
            case 3:
                return new asob();
            case 4:
                return new asoa();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asob.class) {
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
        asob asob = new asob();
        e = asob;
        anxl.registerDefaultInstance(asob.class, asob);
    }
}
