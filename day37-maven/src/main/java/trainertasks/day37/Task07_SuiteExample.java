package trainertasks.day37;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        Task01_MockList.class,
        Task02_WhenThenReturn.class,
        Task03_VerifyExample.class
})
public class Task07_SuiteExample {
}