package me.java.Practice.DataStructure;

public class LinkedNode<E> implements Queue<E>{

    private E element;
    private LinkedNode<E> next;
    private int size;               //노드의 개수
    private LinkedNode<E> front;    //맨앞 노드
    private LinkedNode<E> rear;     //맨뒤 노드

    public LinkedNode(E item) {
        this.element = item;
    }

    public E element() {
        return this.element;
    }

    public void setNext(LinkedNode<E> next) {
        this.next = next;
    }   //노드 연결

    public LinkedNode<E> next() {
        return this.next;
    }

    /**
     * 큐가 비어있는지 확인
     * @return 비어있다면 true
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 큐가 가득차있는지 확인
     * @return false;
     * 메모리 초과되지 않는 이상 사이즈 제한 없음
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * 큐의 크기
     * @return 큐의 크기
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * front 노드 찾기
     * @return front 노드 반환
     */
    @Override
    public E front() {
        if(front == null) return null;
        return front.element;
    }

    /**
     * rear 노드 찾기
     * @return rear 노드 반환
     */
    @Override
    public E rear() {
        if(rear == null) return null;
        return rear.element;
    }

    /**
     * 노드 삽입
     * @param item 새로운 노드
     * @return true
     * 큐가 비어 있다면 front와 rear 모두 새로운 노드로 설정
     * 아니라면 기존 rear 노드의 다음 노드를 새로운 노드로 설정 후 rear를 새로운 노드로 설정
     */
    @Override
    public boolean offer(E item) {
        LinkedNode<E> newRearNode = new LinkedNode<>(item);

        if(isEmpty()) {
            this.front = newRearNode;
        }
        else {
            rear.setNext(newRearNode);//현재 rear 다음에 새로운 노드 추가
        }

        this.rear = newRearNode;//새로운 노드를 rear로 set
        size++;
        return true;
    }

    /**
     * 가장 먼저 들어온 노드 제거 및 출력
     * @return 가장 먼저 들어온 노드
     * front를 기존 front의 next로 설정
     * 만약 front가 비었다면 rear도 null로 설정
     */
    @Override
    public E poll() {

        if (isEmpty()) return null;

        E remove = this.front.element();
        this.front = this.front.next();

        if(this.front == null) this.rear = null;

        size--;
        return remove;
    }

    /**
     * front 노드 출력
     * @return front 노드
     */
    @Override
    public E peek() {
        if (isEmpty()) return null;
        return front.element();
    }

    /**
     * 큐 초기화하기
     * front와 rear를 null로 바꾸면 기존 노드들은 GC가 수거
     */
    @Override
    public void clear() {
        this.size = 0;
        this.front = null;
        this.rear = null;
    }
}
