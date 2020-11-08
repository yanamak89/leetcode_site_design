package design;

public enum Tag {
    ARRAY("Array"),
    HASH_TABLE("Hash Table"),
    LINKED_LIST("Linked List"),
    MATH("Math"),
    TWO_POINTERS("Two Pointers"),
    STRING("String"),
    BINARY_SEARCH("Binary Search"),
    DIVIDE_AND_CONQUER("Divide and conquer"),
    BACKTRACKING("Backtracking"),
    STACK("Stack"),
    HEAP("Heap"),
    GREEDY("Greedy"),
    SORT("Sort"),
    BIT_MANIPULATION("Bit manipulation"),
    TREE("Tree"),
    DEPTH_FIRST_SEARCH("Depth-first Search"),
    BREADTH_FIRST_SEARCH("Breadth-first Search"),
    UNION_FIND("Union Find"),
    GRAPH("Graph"),
    DESIGN("Design"),
    TOPOLOGICAL_SORT("Topological Sort"),
    TRIE("Trie"),
    BINARY_SEARCH_TREE("Binary Search Tree"),
    RECURSION("Recursion"),
    BRAINTEASER("Brainteaser"),
    MEMOIZATION("Memoization"),
    QUEUE("Queue"),
    MINMAX("Minmax"),
    RESERVOIR_SAMPLING("Reservoir Sampling"),
    ORDERED_MAP("Ordered Map"),
    GEOMETRY("Geometry"),
    RANDOM("Random"),
    REJECTION_SAMPLING("Rejection Sampling"),
    SLIDING_WINDOW("Sliding Window"),
    LINE_SWEEP("Line Sweep"),
    ROLLING_HASH("Rolling Hash"),
    SUFFIX_ARRAY("Suffix Array");

    private String tagsName;

    Tag(String tagsName) {
        this.tagsName = tagsName;
    }

    public String getTagsName() {
        return tagsName;
    }
}

