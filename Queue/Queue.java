package queue;

// A class to represent a queue
public class Queue {

	int front, rear, size;
	int capacity;
	int array[];

	public Queue(int capacity) {

		this.capacity = capacity;
		front = this.size = 0;
		rear = -1;
		array = new int[this.capacity];
	}

	// Queue is full when size becomes
	// equal to the capacity
	boolean isFull() {
		
		return (this.size == this.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty() {
		
		return (this.size == 0);
	}

	// Method to add an item to the queue.
	// It changes rear and size
	void enqueue(int item) {

		if (isFull())
			return;

		rear = (rear + 1) % this.capacity;
		array[rear] = item;
		size = size + 1;

		System.out.println(item + " enqueued to queue");
	}

	// Method to remove an item from queue.
	// It changes front and size
	int dequeue() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		int item = array[front];
		
		
		front = (front + 1) % capacity;
		size = size - 1;
		
		return item;
	}

	// Method to get front of queue
	int front() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	// Method to get rear of queue
	int rear() {
		if (isEmpty())
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}

}
