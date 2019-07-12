import com.factory.method.Factory;
import com.factory.method.Operation;

public class Test {
    public static void main(String[] args) {
        try {
            Factory addFactory = (Factory) Class.forName("com.factory.method.AddFactory").newInstance();
            Factory subFactory = (Factory) Class.forName("com.factory.method.SubFactory").newInstance();
            Factory mulFactory = (Factory) Class.forName("com.factory.method.MulFactory").newInstance();
            Factory divFactory = (Factory) Class.forName("com.factory.method.DivFactory").newInstance();

            Operation add = addFactory.createOperation();
            Operation sub = subFactory.createOperation();
            Operation mul = mulFactory.createOperation();
            Operation div = divFactory.createOperation();

            System.out.println(add.getResult(1, 1));
            System.out.println(sub.getResult(2, 1));
            System.out.println(mul.getResult(2, 3));
            System.out.println(div.getResult(3, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
