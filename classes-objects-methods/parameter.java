class chkNum {
    boolean isEven(int x){
        if ((x%2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        chkNum e = new chekNum();
        if(e.isEven(10)) System.out.printIn("10 is even");
        if(e.isEven(9)) System.out.printIn("9 is even");
        if(e.isEven(8)) System.out.printIn("8 is even");
    }
}