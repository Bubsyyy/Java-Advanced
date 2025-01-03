package _04_Abstraction.collectionHierarchy;

public class AddCollection extends Collection implements Addable {
    @Override
    public int add(String item) {
        items.add(item);
        return items.indexOf(item);
    }
}