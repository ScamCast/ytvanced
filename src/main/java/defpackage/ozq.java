package defpackage;

import android.text.TextUtils;

/* renamed from: ozq */
public final class ozq {
    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        int[] a = ozq.a(str2);
        if (a[0] != -1) {
            stringBuilder.append(str2);
            ozq.a(stringBuilder, a[1], a[2]);
            return stringBuilder.toString();
        }
        int[] a2 = ozq.a(str);
        int i;
        if (a[3] == 0) {
            stringBuilder.append(str, 0, a2[3]);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else if (a[2] == 0) {
            stringBuilder.append(str, 0, a2[2]);
            stringBuilder.append(str2);
            return stringBuilder.toString();
        } else if (a[1] != 0) {
            int i2 = a2[0] + 1;
            stringBuilder.append(str, 0, i2);
            stringBuilder.append(str2);
            return ozq.a(stringBuilder, a[1] + i2, i2 + a[2]);
        } else if (str2.charAt(0) == '/') {
            stringBuilder.append(str, 0, a2[1]);
            stringBuilder.append(str2);
            i = a2[1];
            return ozq.a(stringBuilder, i, a[2] + i);
        } else {
            int i3 = a2[0];
            int i4 = a2[1];
            if (i3 + 2 >= i4 || i4 != a2[2]) {
                i3 = str.lastIndexOf(47, a2[2] - 1);
                int i5 = i3 == -1 ? a2[1] : i3 + 1;
                stringBuilder.append(str, 0, i5);
                stringBuilder.append(str2);
                return ozq.a(stringBuilder, a2[1], i5 + a[2]);
            }
            stringBuilder.append(str, 0, i4);
            stringBuilder.append('/');
            stringBuilder.append(str2);
            i = a2[1];
            return ozq.a(stringBuilder, i, (a[2] + i) + 1);
        }
    }

    private static String a(StringBuilder stringBuilder, int i, int i2) {
        if (i >= i2) {
            return stringBuilder.toString();
        }
        if (stringBuilder.charAt(i) == '/') {
            i++;
        }
        int i3 = i;
        int i4 = i2;
        while (true) {
            i2 = i3;
            while (i2 <= i4) {
                int i5;
                if (i2 == i4) {
                    i5 = i2;
                } else if (stringBuilder.charAt(i2) != '/') {
                    i2++;
                } else {
                    i5 = i2 + 1;
                }
                int i6 = i3 + 1;
                if (i2 == i6 && stringBuilder.charAt(i3) == '.') {
                    stringBuilder.delete(i3, i5);
                    i4 -= i5 - i3;
                } else {
                    if (i2 == i3 + 2 && stringBuilder.charAt(i3) == '.' && stringBuilder.charAt(i6) == '.') {
                        i2 = stringBuilder.lastIndexOf("/", i3 - 2) + 1;
                        i3 = i2 > i ? i2 : i;
                        stringBuilder.delete(i3, i5);
                        i4 -= i5 - i3;
                    } else {
                        i2++;
                    }
                    i3 = i2;
                }
            }
            return stringBuilder.toString();
        }
    }

    private static int[] a(String str) {
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int indexOf;
        int length = str.length();
        int indexOf2 = str.indexOf(35);
        if (indexOf2 != -1) {
            length = indexOf2;
        }
        indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        indexOf3 = indexOf4 + 2;
        if (indexOf3 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(indexOf3) == '/') {
            indexOf = str.indexOf(47, indexOf4 + 3);
            if (indexOf == -1 || indexOf > indexOf2) {
                indexOf = indexOf2;
            }
        } else {
            indexOf = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = indexOf;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}