class Area {
    private double length;
    private double breadth;


    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area obj = new Area();


        double length = 5;
        double breadth = 10;
        obj.setDim(length, breadth);


        double area = obj.getArea();
        System.out.println("Area of the rectangle: " +area);
}
}