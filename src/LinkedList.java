public interface LinkedList {
    int size();
    void add(int value);
    void add(int value, int position);
    void replace(int value, int position);
    void removeByIndex(int position);
    boolean removeFirstByValue(int value);
    boolean contains(int value);
    int get(int position);
    int getPosition(int value);
}
