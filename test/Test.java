// 1. Shape 类
class Shape {
    public double getArea() {
        return 0.0; // 默认返回 0，子类会重写
    }
}

// 2. Square 类
class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}

// 3. Cube 类
class Cube extends Square {
    private double heightLength;

    public Cube(double sideLength, double heightLength) {
        super(sideLength); // 调用父类 Square 的构造方法，设置底面边长
        this.heightLength = heightLength;
    }

    @Override
    public double getArea() { // 重写 getArea() 方法计算体积
        return super.getArea() * heightLength; // 底面积 * 高
    }
}

// 4. Test 类
public class Test {
    public static void main(String[] args) {
        // 创建 Square 对象并输出面积
        Square square = new Square(5.0);
        System.out.println("正方形的面积: " + square.getArea());

        // 创建 Cube 对象并输出体积
        Cube cube = new Cube(5.0, 5.0); // 底面边长 5.0，高 5.0
        System.out.println("正方体的体积: " + cube.getArea());
    }
}
