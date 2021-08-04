package algo.trybe;

import java.util.List;

public class desafio1 {
    public static List<Integer> doubleTheChances(List<Integer> chances) {

        for(int i = 0; i < chances.size(); i++){
            chances.add(i, chances.get(i) * 2);
        }
        return chances;

    }
    public static void main(String[] args) {
        doubleTheChances(List <1,2,3,4,5,6> );
    }

}




