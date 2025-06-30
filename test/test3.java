
    class Shape{
        public double getArea(){
            return 0.0;
        }
    }
    class Square extends Shape{
        private double side_length;
        public Square(double side_length){
            this.side_length = side_length;
        }
        @Override
        
        public double getArea(){
            return side_length * side_length;
        }
    }
    class Cube extends Square{
        private double height_length;
        public Cube(double side_length,double height_length){
            super(side_length);
            this.height_length = height_length;
        }
        @Override
        public double getArea(){
            return super.getArea()*height_length;
        }
    }
public class test3{
    public static void main(String[] args){
        Square square = new Square(10);
        System.out.println(square.getArea());
        Cube cube = new Cube(10,20);
        System.out.println(cube.getArea());
    }
}