package day17;

public class Amazon {
    public void search(String brandName) {
        System.out.println("Search the product using the brand name: " + brandName);
    }

    public void search(String brandName, double storageCapacity) {
        System.out.println("Search the product using the brand name: " + brandName + " and Storage Capacity as: " + storageCapacity);
    }

    public void search(double RAMSize, int batteryCapacity) {
        System.out.println("Search the product using the RAM: " + RAMSize + " and Battery Capacity as: " + batteryCapacity);
    }

    public void search(double price, String brandName) {
        System.out.println("Search the product using the Price: " + price + " and Brand Name as: " + brandName);
    }

    public void login(String emailId, String password)
    {
        System.out.println("Login using email Id: " + emailId + " and Password: " + password);
    }

    public void login(long mobileNumber, int otp)
    {
        System.out.println("Login using mobileNumber: " + mobileNumber + " and OTP: " + otp);
    }

    public void login(String facebookApi)
    {
        System.out.println("Login using API: " + facebookApi);
    }
}
