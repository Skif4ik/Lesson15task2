import model.OverflowPetListException;
import model.Pet;
import model.PetList;

public class Main {
    public static void main(String[] args) {
        PetList petList1 = new PetList();

        try {
            petList1.add(new Pet("Murzik", 3));
            petList1.add(new Pet("Rex", 2));
            petList1.add(new Pet("Snezhok", 5));
            petList1.add(new Pet("Barsik", 4));
            petList1.add(new Pet("Polkan", 1));
            petList1.add(new Pet("Zhuzha", 4));
        } catch (OverflowPetListException e) {
            System.out.println(e);
        }

        petList1.show();
    }
}
