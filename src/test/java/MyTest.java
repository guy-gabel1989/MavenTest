import org.testng.annotations.Test;

public class MyTest {
    @Test (priority = 1)
    public void firstTest() {
        System.out.println("wow, a test");
        System.out.println("first commit");
        System.out.println("another try");

// change in github
        }
    @Test (priority = 2)
    public void secondTest() {
        System.out.println("new test was added");
        System.out.println(20 + 10);
        
    }
}
