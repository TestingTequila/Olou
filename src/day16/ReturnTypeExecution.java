package day16;

public class ReturnTypeExecution {
    public static void main(String[] args) {
        MethodsWithReturnTypeAndWithoutParameter mwrtwp = new MethodsWithReturnTypeAndWithoutParameter();
        mwrtwp.x = 12;
        mwrtwp.y = 8;
        //int total1 =mwrtwp.addition1();//void

        int total2 = mwrtwp.addition2();//int
        System.out.println(total2 * 5);//100

        MethodsWithReturnTypeAndWithParameter mwrtwip = new MethodsWithReturnTypeAndWithParameter();
        //int total3 =mwrtwip.addition1(12,80);
        int total4 = mwrtwip.addition2(12, 80);
        System.out.println(total4+100);
    }
}
