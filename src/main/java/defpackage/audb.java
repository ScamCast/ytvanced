package defpackage;

/* renamed from: audb */
public final class audb extends anxl implements anzf {
    public static final audb c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private audb() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000\u0001\u0005\u0002\u0000\u0000\u0002\u0001м\u0000\u0005м\u0000", new Object[]{"b", "a", arml.class, axak.class});
            case 3:
                return new audb();
            case 4:
                return new audd();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (audb.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        audb audb = new audb();
        c = audb;
        anxl.registerDefaultInstance(audb.class, audb);
    }
}
