public class Circal {
    double d;
    double c;
    double a;
    String color;
    public void circl(){
d=1.0;
    }
    public void circl(int d){
        this.d = d;
        c= d*3.14159;
        a= 3.14159 * ((d/2)*(d/2));
    }
    public double diamater(){
        return d;
    }
    public double area(){
        return a;
    }public double cercunfern(){
        return c;
    }
}
