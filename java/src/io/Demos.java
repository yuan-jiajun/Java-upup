//package io;
//
///**
// * @author yuanjiajun
// * @description
// * @date 2020/2/7 11:40
// */
//public class Demos {
//    import java.io.*;
////InputStreamReader 和 BufferedReader 都在这个包里面,所以要把这个包引进来
//
//    public class Demo1
//    {
//        public static void main (String []args)
//        {
//            //从控制台接受两个数
//            try
//            {
//                //输入流,从键盘接收数
//                InputStreamReader isr = new InputStreamReader(System.in);       //system.in代表标准输入,就是键盘
//                BufferedReader br = new BufferedReader(isr);
//                //这些内容到控制台中才会详细讲解
//
//                System.out.println("请输入一个数");   //提示
//
//                //从控制台读取一行数据
//                String a1=br.readLine();
//                //控制台不管输入的是数还是字符串,他都认为是字符串,所以要用String接受
//
//                System.out.println("请输入第二个数");  //提示
//                String a2=br.readLine();
//
//                //把String -> float
//                float num1 = Float.parseFloat(a1);
//                float num2 = Float.parseFloat(a2);
//                if (num1 > num2)
//                {
//                    System.out.println("第一个大");
//                }
//                if(num1 == num2)
//                {
//                    System.out.println("相等");
//                }
//                if(num1 < num2)
//                {
//                    System.out.println("第二个大");
//                }
//
//
//            }catch(Exception e)
//            {
//                e.printStackTrace();
//            }
//        }
//    }
//}