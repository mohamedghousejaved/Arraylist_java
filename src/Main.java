import  java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

//            to remove single element use cars.remove(0)
//            to remove full elements use cars.clear()
    }
}
}