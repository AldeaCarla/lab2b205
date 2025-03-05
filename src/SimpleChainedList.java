public class SimpleChainedList {
    private SimpleChainedNode head;

    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode(value) {
        };
        if (head == null) {
            head = newNode;
            return;
        }
        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            temp = temp.getNextNode();
        }
        temp.setNextNode(newNode);
    }
    public SimpleChainedNode getNodeByValue(int value) {
        SimpleChainedNode temp = head;
        while (temp != null) {
            if (temp.getValue() == value) {
                return temp;
            }
            temp = temp.getNextNode();
        }
        return null;
    }

    public void removeNodeByValue(int value) {
        if (head == null) return;
        if (head.getValue() == value) {
            head = head.getNextNode();
            return;
        }
        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getNextNode().getValue() == value) {
                temp.setNextNode(temp.getNextNode().getNextNode());
                return;
            }
            temp = temp.getNextNode();
        }
    }

    public void listNodes() {
        SimpleChainedNode temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.getNextNode();
        }
        System.out.println();
    }

    public int sumNodes() {
        int sum = 0;
        SimpleChainedNode temp = head;
        while (temp != null) {
            sum += temp.getValue();
            temp = temp.getNextNode();
        }
        return sum;
    }

    public boolean isSorted() {
        if (head == null) return true;
        SimpleChainedNode temp = head;
        while (temp.getNextNode() != null) {
            if (temp.getValue() > temp.getNextNode().getValue()) {
                return false;
            }
            temp = temp.getNextNode();
        }
        return true;
    }
}
