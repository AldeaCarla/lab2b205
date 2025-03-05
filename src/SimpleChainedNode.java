public abstract class SimpleChainedNode implements INode{
    private int value;
    private SimpleChainedNode next;
    public SimpleChainedNode(int value) {
       this.value = value;
       this.next = null;
      }
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setNextNode(SimpleChainedNode next) {
        this.next = next;
    }

    public SimpleChainedNode getNextNode() {
        return next;
    }
}


