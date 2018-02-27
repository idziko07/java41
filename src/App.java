import java.util.*;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        TreeSet<Integer> numbers = new TreeSet<>();
        int num;
        int i = 0;
        while(i <10) {
            num = rand.nextInt(1000);
            if(!(numbers.contains(num))) {
                numbers.add(num);
                i++;
            }
        }
        System.out.println(numbers);
        System.out.println("Najmniejsza liczba ze zbioru to: " + numbers.first());
        System.out.println("Najwieksza liczba ze zbioru to: " + numbers.last());
        System.out.println("Srednia zbioru wynosi: " + srednia(numbers));
        Set<Integer> wieksze = wiekszeOdSredniej(numbers);
        System.out.print("Liczby ze zbioru wieksze od średniej: ");
        for (Integer integer : wieksze) {
            System.out.print(integer + ", ");
        }

    }
    public static double srednia(Set<Integer> numbers){
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double srednia = sum /numbers.size();

        return srednia;
    }

    public static Set<Integer> wiekszeOdSredniej(Set<Integer> numbers){
        Set<Integer> wieksze = new TreeSet<>();
        double srednia = srednia(numbers);
        for (Integer number : numbers) {
            if(number > srednia){
                wieksze.add(number);
            }
        }
        return wieksze;
    }
}
