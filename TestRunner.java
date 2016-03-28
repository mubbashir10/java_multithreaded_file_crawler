//importing libraries
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//test runner class
public class TestRunner {
	
	//main methd	
	public static void main(String[] args) {

		//additon
		Result resultA = JUnitCore.runClasses(DBTest.class);
		for (Failure failureA : resultA.getFailures())
			System.out.println(failureA.toString());
		System.out.println("DB Test: "+resultA.wasSuccessful());

	}	
}  	