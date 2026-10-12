
class Shape {
    int dimensionFirst;
    int dimensionSecond;
    Shape(int dimensionFirst, int dimensionSecond) {
        this.dimensionFirst = dimensionFirst;
        this.dimensionSecond = dimensionSecond;
        }

    double area(){
        return 0.0;
    }
}

class Rectangle extends Shape{
    Rectangle(int dimensionFirst, int dimensionSecond){
        super(dimensionFirst,dimensionSecond);
    }
    double area(){
        return dimensionFirst*dimensionSecond;
    }

}

class Triangle extends Shape{
    Triangle(int dimensionFirst, int dimensionSecond){
        super(dimensionFirst,dimensionSecond);
    }
    double area(){
        return 0.5*dimensionFirst* dimensionSecond;
    }
}

class ShapeApp{
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle(20,45);
        Triangle triangle = new Triangle(3,8);
        double areaRectangle = rectangle.area();
        double areaTriangle = triangle.area();
        System.out.println("area of rectangle is:"+areaRectangle);
        System.out.println("area of triangle is:"+areaTriangle);
    }
}                                                       