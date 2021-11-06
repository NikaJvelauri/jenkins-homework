import org.junit.Assert;
import org.junit.Test;

public class ValidateTest {

    @Test
    public void test(){
        String homePath = System.getenv("USERDOMAIN_ROAMINGPROFILE");
        String userName = "JVELA-2";
        Assert.assertEquals(homePath,userName);
        System.out.println(homePath);

    }
}
