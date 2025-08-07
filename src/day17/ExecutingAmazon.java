package day17;

public class ExecutingAmazon {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.login("ashish.mishra.sse@gmail.com", "test@1234");
        amazon.login(8860418225L, 5678);
        amazon.search(1200, "Samsung");
        amazon.search("Apple", 128);

    }
}
