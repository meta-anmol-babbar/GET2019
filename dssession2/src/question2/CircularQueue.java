package question2;

public class CircularQueue {

	int[] circularQueue;
	int start = -1, end = -1;

	public CircularQueue(int length) {
		circularQueue = new int[length];

	}

	public String addItem(int value) {
		if (start == -1 && end == -1) {
			circularQueue[0] = value;
			start = end = 0;
		} else if (start - end == 1) {
			return "Queue Full";
		} else if (end == circularQueue.length - 1 && start == 0) {
			return "Queue Full";
		}
		else if (end == circularQueue.length - 1 && start != 0) {
			end=0;
			circularQueue[end]=value;
		}else {
			end++;
			circularQueue[end]=value;
		}

		return "added";

	}
	
	public String deleteItem(){
		if(start==-1)
			return "empty";
		else if(start==end){
			circularQueue[start]=0;
			start=-1;
			end=-1;
		}
		else if(start==circularQueue.length-1){
			start=0;
			circularQueue[start]=0;
		}
		else {
			circularQueue[start]=0;
			start++;
		}
			
			
			return "deleted";
	}
	
	public String checkEmptyOrFull(){
		if ((start - end == 1) ||  (end == circularQueue.length - 1 && start == 0)) 
			return "Queue is Full";
		return "Queue empty";
	}
	
	public void print(){
		for(int i=0;i<circularQueue.length;i++){
			System.out.println(circularQueue[i]);
		}
	}

}
