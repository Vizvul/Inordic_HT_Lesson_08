public class SimplyLinkedList implements LinkedList {
    private IntLinkList second;
    private IntLinkList start;
    public int size = 0;

    public SimplyLinkedList() {
        start = null;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void add(int value) {
        IntLinkList addNewValue = new IntLinkList(value);
        addNewValue.setPositionLink(null);
        if (start == null) {
            start = addNewValue;
        } else {
            second.setPositionLink(addNewValue);
        }
        second = addNewValue;
        size++;
    }

    @Override
    public void add(int value, int position) {
        add(value);
        IntLinkList addNewPozition = start;
        int nextValue = 0;

        if (size() <= position) {
            return;
        }
        int i = 0;
        while (addNewPozition != null) {
            i++;
            if (i > position) {
                value = addNewPozition.getValue();
                addNewPozition.setValue(nextValue);
                position = i + 1;
            } else if (i == position) {
                nextValue = addNewPozition.getValue();
                addNewPozition.setValue(value);
            }
            addNewPozition = addNewPozition.getPositionLink();
        }
    }

    @Override
    public void replace(int value, int position) {
        int posToDelete = getPosition(value);
        if (position == posToDelete) { return; }
        removeByIndex(posToDelete);
        add(value, position);
    }

    @Override
    public int getPosition(int value) {
        IntLinkList getPosition = start;
        int k = 0;
        while (getPosition != null) {
            k++;
            if (getPosition.getValue() == value) {
                return k;
            }
            getPosition = getPosition.getPositionLink();
        }
        return -1;
    }

    @Override
    public void removeByIndex(int position) {
        IntLinkList removeByIndex = start;
        IntLinkList back = null;
        int j = 0;

        while (removeByIndex.getPositionLink() != null) {
            j++;
            if (j == position) {
                back.setPositionLink(removeByIndex.getPositionLink());
                size--;
            }
            back = removeByIndex;
            removeByIndex = removeByIndex.getPositionLink();
        }
    }

    @Override
    public boolean removeFirstByValue(int value) {
        if (getPosition(value) >= 0 ) {
            removeByIndex(getPosition(value));
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(int value) {
        IntLinkList contains = start;
        while (contains != null) {
            if (contains.getValue() == value) {
                return true;
            } else {
                contains = contains.getPositionLink();
            }
        }
        return false;
    }

    @Override
    public int get(int position) {
        IntLinkList getNewPozition = start;
        int t = 0;
        while (getNewPozition != null) {
            t++;
            if (t == position) {
                return getNewPozition.getValue();
            } else {
                getNewPozition = getNewPozition.getPositionLink();
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        IntLinkList test = start;
        int j = 0;
        while (test != null ) {
            j++;
            result.append(new StringBuilder(j + " element = " + test.getPositionLink() + " - " + test.getValue() + '\n'));
            test = test.getPositionLink();
        }
        return result.toString();
    }
}
