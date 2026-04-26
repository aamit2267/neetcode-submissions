class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private HashMap<Integer, Node> cache;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        Node node = cache.get(key);
        removeNode(node);
        addNodeToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)){
            Node lruNode = cache.get(key);
            lruNode.value = value;
            removeNode(lruNode);
            addNodeToFront(lruNode);
        } else {
            if (cache.size() == capacity){
                Node lruNode = tail.prev;
                cache.remove(lruNode.key);
                removeNode(lruNode);
            }

            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addNodeToFront(newNode);
        }
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addNodeToFront(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
