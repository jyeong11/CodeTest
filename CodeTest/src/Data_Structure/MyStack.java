package Data_Structure;

public class MyStack {
	private Node top;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // 스택에 데이터 추가
    public void push(int value) {
    	Node node = new Node(value, top);
    	top = node;
    	size++;
    }

    // 스택에서 맨 위 데이터 꺼내기
    public int pop() {
    	if(isEmpty()) {
    		throw new RuntimeException("스택이 비어있습니다");
    	}
    	
         Node temp = top;
         top = top.next;
         size--;
    	return temp.data;
    }

    // 맨 위 데이터 확인
    public int peek() {
    	if(isEmpty()) {
    		throw new RuntimeException("스택이 비어있습니다");
    	}
    	
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
