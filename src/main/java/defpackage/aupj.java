package defpackage;

/* renamed from: aupj */
public final class aupj extends anxl implements anzf {
    public static final aupj f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public boolean c;
    public int d;
    public arml e;
    private byte g = (byte) 2;

    private aupj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0001\u0002\b\u0000\u0003\u0007\u0001\u0004\u0004\u0002\u0005Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aupj();
            case 4:
                return new aupm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aupj.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aupj aupj = new aupj();
        f = aupj;
        anxl.registerDefaultInstance(aupj.class, aupj);
    }
}