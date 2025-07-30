package day12;

public class SwitchStatement {
    public static void main(String[] args) {

        String browserName = "Tornado";
        switch (browserName) {
            case "Firefox":
                System.out.println("Launch Firefox browser...");
                break;
            case "Chrome":
                System.out.println("Launch Chrome browser...");
                break;
            case "IE":
                System.out.println("Launch IE browser...");
                break;
            case "Edge":
                System.out.println("Launch Edge browser...");
                break;
            default:
                System.out.println("Please enter a valid browser name....");
                break;
        }
    }
}
