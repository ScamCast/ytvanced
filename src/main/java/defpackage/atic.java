package defpackage;

/* renamed from: atic */
public final class atic extends anxl implements anzf {
    public static final atic e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private atic() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001Љ\u0000\u0003\u001a\u0004\u001a", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new atic();
            case 4:
                return new atib();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atic.class) {
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
        atic atic = new atic();
        e = atic;
        anxl.registerDefaultInstance(atic.class, atic);
    }
}