class car{
    String brand;
    int year;

    car(String b, int y){
        brand = b;
        year = y;
    }

    void showDetails(){
        System.out.println("Brand : "+ brand);
        System.out.println("Year : "+ year);
    }
}

public class CreatingObjectAndClass {
    public static void main(String[] args) {

        car c2 = new car("honda",2023);
        c2.showDetails();
    }
}