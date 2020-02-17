package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer numOccurrences = 0;
        for (int i = 0;i<objectArray.length;i++){
            if (objectArray[i] == objectToCount){
                numOccurrences++;
            }
        }
        return numOccurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Object objectToRemove) {
        Integer[] placeHolderArray = new Integer[objectArray.length];
        int counter = 0;
        for (int i = 0;i < objectArray.length;i++){
            if (objectArray[i]!=objectToRemove){
                placeHolderArray[counter] = objectArray[i];
                counter ++;
            }
        }
        Integer[] resultArray = new Integer[counter];
        for (int i=0;i<placeHolderArray.length;i++){
            if (placeHolderArray[i]!=null){
                resultArray[i] = placeHolderArray[i];
            }
        }
        return resultArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */

    public static Integer getMostCommon(Integer[] objectArray) {
        int maxCount = 0;
        int modeIndex = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (getNumberOfOccurrences(objectArray, objectArray[i]) > maxCount) {
                maxCount = getNumberOfOccurrences(objectArray, objectArray[i]);
                modeIndex = i;
            }

        }
        return objectArray[modeIndex];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int minCount = objectArray.length;
        int leastIndex = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (getNumberOfOccurrences(objectArray, objectArray[i]) < minCount) {
                minCount = getNumberOfOccurrences(objectArray, objectArray[i]);
                leastIndex = i;
            }
        }
        return objectArray[leastIndex];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Integer[] combined = new Integer[objectArray.length + objectArrayToAdd.length];
        for (int i = 0;i<objectArray.length;i++){
            combined[i]=objectArray[i];
        }
        for (int i = 0;i<objectArrayToAdd.length;i++){
            combined[i+objectArray.length] = objectArrayToAdd[i];
        }
        return combined;
    }
}
