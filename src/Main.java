import java.util.*;

public class Main {

    static List<char[]> changeIntToCharArray(int[] nums){
        List<char[]> listOfChars = new ArrayList<>();
        for (int number: nums ) {
            listOfChars.add(Integer.toBinaryString(number).toCharArray());

        }
        listOfChars.forEach(e -> System.out.println(Arrays.toString(e)));
        return listOfChars;
    }

    static void calculateBiggestBinaryGap(List<char[]> listOfBinaries){
        listOfBinaries.stream().forEach(element -> {
            int licznikZer = 0;
            int obecnieNajdluzszyCiagZer = 0;
            for (int i = 0; i < element.length; i++) {
                if(element[i] == '0'){
                    licznikZer++;
                }
                if(element[i] == '1'){
                    obecnieNajdluzszyCiagZer = (obecnieNajdluzszyCiagZer < licznikZer) ?  licznikZer : obecnieNajdluzszyCiagZer;
                    licznikZer = 0;
                }
            }
            System.out.println(obecnieNajdluzszyCiagZer);
        });
    }


    public static void main(String[] args) {
        int[] liczby = {9, 529, 1041};
        calculateBiggestBinaryGap(changeIntToCharArray(liczby));

        System.out.println("Please input numbers:");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }

        for (Integer p : list){
            System.out.println(p);
        }
        input.close();


        calculateBiggestBinaryGap(changeIntToCharArray(list.stream().mapToInt(i->i).toArray()));

    }
}
