package com.zipcodewilmington.assessment1.part3;
import com.zipcodewilmington.assessment1.part3.Pet;
/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name = "";
    Pet[] ownedPets= new Pet[101];

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        if (name != null){
            this.name = name;
        } else {
            this.name = "Pet owner name";
        }

        if (pets != null) {
            this.ownedPets = pets;
        }
        assignOwnership(this.ownedPets);
    }
    public PetOwner(){
        this.name = "Pet owner name";
    }

    public void assignOwnership(Pet[] pets){
        for (int i = 0;i<pets.length;i++){
            if (pets[i] != null){
                pets[i].owner = this;
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        boolean allPetsNull = true;
        for (int i = 0;i<ownedPets.length;i++){
            if (ownedPets[i]!= null){
                ownedPets[i]=pet;
                allPetsNull = false;
                break;
            }
            }
        if (allPetsNull){
            ownedPets[0] = pet;
        }
        }


    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0;i<ownedPets.length;i++){
            if (ownedPets[i]==pet){
                ownedPets[i]=null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0;i<ownedPets.length;i++){
            if (ownedPets[i] == pet){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int smallestAge = 1000;
        for (int i = 0; i < ownedPets.length; i++) {
            if (ownedPets[i] != null) {
                if (ownedPets[i].age < smallestAge) {
                    smallestAge = ownedPets[i].age;
                }
            }

        }
        return smallestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
            int largestAge = 0;
            for (int i = 0; i < ownedPets.length; i++) {
                if (ownedPets[i] != null) {
                    if (ownedPets[i].age > largestAge) {
                        largestAge = ownedPets[i].age;
                    }
                }


            }
        return largestAge;
        }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;
        float    numPets = 0;
        for (int i = 0;i < ownedPets.length;i++){
            if (ownedPets[i] != null){
                sum += ownedPets[i].age;
                numPets++;
            }
        }
        return sum / numPets;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int numPets = 0;
        for (int i = 0;i < ownedPets.length;i++){
            if (ownedPets[i]!=null){
                numPets++;
            }
        }
        return numPets;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return ownedPets;
    }
}
