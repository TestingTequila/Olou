package day16;

public class ExecutingAdvanceMethods {
    public static void main(String[] args) {
        System.out.println("========================Global Variable=============================");
        MethodsWithGlobalVariables mwgv = new MethodsWithGlobalVariables();
        mwgv.x = 12;
        mwgv.y = 8;
        mwgv.addition();//20
        mwgv.subtraction();//4

        MethodsWithGlobalVariables mwgv2 = new MethodsWithGlobalVariables();
        mwgv2.x = 122;
        mwgv2.y = 88;
        mwgv2.addition();//
        mwgv2.subtraction();//

        System.out.println("========================Parameters=============================");
        MethodsWithParameters mwp = new MethodsWithParameters();
        mwp.addition(12, 8);//20
        mwp.subtraction(32, 6);//26

        MethodsWithParameters mwp1 = new MethodsWithParameters();
        mwp1.addition(120, 80);//
        mwp1.subtraction(320, 60);//

        System.out.println("========================Local Variable=============================");
        MethodsWithLocalVariables mwlv = new MethodsWithLocalVariables();
        mwlv.addition();//20
        mwlv.subtraction();//28

        MethodsWithLocalVariables mwlv2 = new MethodsWithLocalVariables();
        mwlv2.addition();//20
        mwlv2.subtraction();//28

    }
}
