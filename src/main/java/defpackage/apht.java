package defpackage;

/* renamed from: apht */
public final class apht extends anxl implements anzf {
    public static final apht c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private apht() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000⼞ヺ\u0002\u0000\u0000\u0002⼞м\u0000ヺм\u0000", new Object[]{"b", "a", aqqg.class, aruh.class});
            case 3:
                return new apht();
            case 4:
                return new aphw();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apht.class) {
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
        apht apht = new apht();
        c = apht;
        anxl.registerDefaultInstance(apht.class, apht);
    }
}
