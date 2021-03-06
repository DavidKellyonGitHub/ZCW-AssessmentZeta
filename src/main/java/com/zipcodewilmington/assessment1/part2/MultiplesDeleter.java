package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int evensCounter = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]%2==0){
                ints[i]= null;
                evensCounter++;
            }
        }
        Integer[] odds = new Integer[ints.length-evensCounter];
        int counter2 = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]!=null){
                odds[counter2] = ints[i];
                counter2++;
            }
        }

        return odds;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int oddsCounter = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]%2!=0){
                ints[i]= null;
                oddsCounter++;
            }
        }
        Integer[] evens = new Integer[ints.length-oddsCounter];
        int counter2 = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]!=null){
                evens[counter2] = ints[i];
                counter2++;
            }
        }

        return evens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int multipleCounter = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]%3==0){
                ints[i]= null;
                multipleCounter++;
            }
        }
        Integer[] nonMultiples = new Integer[ints.length-multipleCounter];
        int counter2 = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]!=null){
                nonMultiples[counter2] = ints[i];
                counter2++;
            }
        }

        return nonMultiples;

    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int multipleCounter = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]%multiple==0){
                ints[i]= null;
                multipleCounter++;
            }
        }
        Integer[] nonMultiples = new Integer[ints.length-multipleCounter];
        int counter2 = 0;
        for (int i = 0;i<ints.length;i++){
            if (ints[i]!=null){
                nonMultiples[counter2] = ints[i];
                counter2++;
            }
        }

        return nonMultiples;
    }
}
