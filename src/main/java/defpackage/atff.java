package defpackage;

/* renamed from: atff */
public final class atff extends anxl implements anzf {
    public static final atff e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public boolean d;
    private byte f = (byte) 2;

    private atff() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001a\u0004\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new atff();
            case 4:
                return new atfi();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atff.class) {
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
        atff atff = new atff();
        e = atff;
        anxl.registerDefaultInstance(atff.class, atff);
    }
}
