public class Lab1 {
    //1.1
    public double fraction (double x) {
        int myInt = (int) x;
        return x - myInt;
    }
    //1.3
    public int charToNum (char x) {
        return (int) x - 48;
    }
    //1.5
    public boolean is2Digits (int x) {
        if ((x > 9 && x < 100) || (x > -100 && x < -9)) {
            return true;
        }
        return false;
    }
    //1.7
    public boolean isInRange (int a, int b, int num) {
        if ((num >= a && num <= b) || (num <= a && num >= b)) {
            return true;
        }
        else {
            return false;
        }
    }
    //1.9
    public boolean isEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        }
        return false;
    }
    //2.1
    public int abs (int x) {
        if (x >= 0) {
            return x;
        }
        else {
            return -x;
        }
    }
    //2.3
    public boolean is35 (int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        else if (x % 3 == 0 || x % 5 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    //2.5
    public int max3 (int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    //2.7
    public int sum2 (int x, int y) {
        if (x + y >= 10 && x + y <= 19) {
            return 20;
        }
        return x + y;
    }
    //2.9
    public String day (int x) {
        switch(x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели";
        }
    }
    //3.1
    public String listNums (int x) {
        String str = "";
        for (int i = 0; i<=x ; i++) {
            str = str + Integer.toString(i) + " ";
        }
        return str;
    }
    //3.3
    public String chet (int x) {
        String str = "";
        int i = 0;
        while (i<=x) {
            str = str + Integer.toString(i) + " ";
            i += 2;
        }
        return str;
    }
    //3.5
    public int numLen (long x) {
        int count = 0;
        do {
            count++;
            x /= 10;
        } while (x != 0);
        return count;
    }
    //3.7
    public void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //3.9
    public void rightTriangle (int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //4.1
    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    //4.3
    public int maxAbs (int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }
    //4.5
    public int[] add (int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        int index = 0;
        for (int i = 0; i < pos; i++) {
            res[index++] = arr[i];
        }
        for (int j = 0; j < ins.length; j++) {
            res[index++] = ins[j];
        }
        for (int i = pos; i < arr.length; i++) {
            res[index++] = arr[i];
        }
        return res;
    }
    //4.7
    public int[] reverseBack (int[] arr) {
        int[] res = new int[arr.length];
        int index = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            res[index++] = arr[j];
        }
        return res;
    }
    //4.9
    public int[] findAll (int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res[index++] = i;
            }
        }
        return res;
    }
}
