package SinglyLL;

class Node {
	protected String data;
    protected Node link;

    public Node() {
        link = null;
       data = "";

    }

    public Node(String val, Node n) {
        data = val;
        link = n;
    }
    
 // Method for setting link to the next Node
    public void setLink(Node n) {
        link = n;
    }

    // Method to set the data to the current Node
    public void setData(String d) {
        data = d;
    }

    // Method to get link to next node
    public Node getLink() {
        return link;
    }

    // Method to get data from current Node
    public String getData() {
        return data;
    }
   
}
