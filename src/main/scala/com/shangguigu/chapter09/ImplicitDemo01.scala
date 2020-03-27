package com.shangguigu.chapter09

/**
 * Created by liuquan on 2020/3/13.
 */
object ImplicitDemo01 {
    def main(args: Array[String]): Unit = {
        // 定义一个隐式函数将Double数据转换为Int数据，该函数会自动被调用
        // 该方法在底层字节码文件中对应的方法名为f1$1(double d)。在方法中定义的方法，并没有内部方法、外部方法之分，
        // 它们在编译后的字节码文件中的地位是一样的，只不过这两个方法的修饰符不一样，外面的方法修饰符为public，
        // 里面的方法修饰符为private final，然后在里面的方法名后面加上 $1 ，若还有重名方法，则后缀变为$2、$3
        implicit def f1(d: Double): Int = {
            d.toInt
        }

        // 必须保证在当前作用域内，最多只能有一个隐式函数被匹配
        implicit def f2(f:Float):Int={
            f.toInt
        }
//        implicit def f3(f2:Float):Int={
//            f2.toInt
//        }

        val num: Int = 3.5      // 编译器在底层自动调用f1$1(double d)方法
        val num2: Int = 4.5f
    }
}
