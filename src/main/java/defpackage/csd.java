package defpackage;

/* renamed from: csd */
public final class csd {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    csd(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = ((str.hashCode() * 961) + ((str2 != null ? str2.hashCode() : 0) * 31)) + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = false;
        if (obj != null && getClass() == obj.getClass()) {
            csd csd = (csd) obj;
            if (this.a == csd.a) {
                String str = this.b;
                String str2 = csd.b;
                if (str == str2 || (str != null && str.equals(str2))) {
                    str = this.c;
                    String str3 = csd.c;
                    if (str == str3) {
                        z = true;
                    } else if (str != null && str.equals(str3)) {
                        return true;
                    }
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TransitionId{\"");
        stringBuilder.append(this.b);
        stringBuilder.append("\", ");
        int i = this.a;
        if (i == 1) {
            stringBuilder.append("GLOBAL");
        } else if (i == 2) {
            stringBuilder.append("SCOPED(");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
        } else if (i == 3) {
            stringBuilder.append("AUTOGENERATED");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
