package javastudy.lambda;

import org.junit.Test;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/3/31 22:05
 */
public class TestLambda2 {

    @Test
    public void lambdaTest1() {
        TestLambda2 tester = new TestLambda2();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
//        MathOperation addition = Integer::sum;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(addition, 10, 5));
        System.out.println("10 - 5 = " + tester.operate(subtraction, 10, 5));
        System.out.println("10 x 5 = " + tester.operate(multiplication, 10, 5));
        System.out.println("10 / 5 = " + tester.operate(division, 10, 5));


        // 不用括号
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }


    private int operate(MathOperation mathOperation, int a, int b) {
        return mathOperation.operation(a, b);
    }

    @Test
    public void lambdaTest2() {
//        final String salutation = "Hello! ";
//        String salutation = "Hello! ";

//        final int  salutation = 100;
        int salutation = 100;



//        GreetingService greetService1 = message -> System.out.println(salutation++ + message);//不能通过编译

//        在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量
//        GreetingService greetService1 = salutation -> System.out.println(salutation + 1 + salutation);

        GreetingService greetService1 = message -> System.out.println(salutation + 1 + message);


//        lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
//        salutation++;//不能通过编译

        greetService1.sayMessage(" Runoob");
    }
}