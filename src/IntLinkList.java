public class IntLinkList {
    private int value;
    private IntLinkList positionLink = null;

    public IntLinkList(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntLinkList getPositionLink() {
        return positionLink;
    }

    public void setPositionLink(IntLinkList positionLink) {
        this.positionLink = positionLink;
    }
}
