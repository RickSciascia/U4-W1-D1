public class Es3 {
    public int perimetroRettangolo(int l1, int l2){
        return (l1+l2)*2;
    }
    public int pariDispari(int n1) {
        if(n1 % 2 == 0) {
             return 0;
        } else {
            return 1;
        }
    }
    public double areaTriangolo(double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p * (p-a)*(p-b)*(p-c));
    }
}
