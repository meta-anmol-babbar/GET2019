package question2;

import java.util.Scanner;

public class JobScheduler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of processes");
		do{
			n = sc.nextInt();
			if(n<=0)
			System.out.println("Enter valid value");
		}while(n<=0);
		int[][] input = new int[n][2];
		int complitionTimeOfProcess[] = new int[n];
		int waitingTimeOfProcess[] = new int[n];
		int turnAroundTimeOfProcess[] = new int[n];
		int avgWaitingTime = 0;
		int maxWaitingTime = 0;
		System.out.println("Enter burst time of process and arrival time for "+n+" processes");	
		for (int i = 0; i < n; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}

		complitionTimeOfProcess = complitionTime(input, n);
		waitingTimeOfProcess = waitingTime(input, n);
		turnAroundTimeOfProcess = turnAroundTime(input,
				complitionTimeOfProcess, n);
		avgWaitingTime = averageWaitingTime(waitingTimeOfProcess);
		maxWaitingTime = maxWaitingTime(waitingTimeOfProcess);
		System.out.println("Process\t\t Arrival Time\t BurstTime\t Complition Time\t Waiting Time\t Turn Around Time");
		for (int i = 0; i < n; i++) {
			System.out.println((i+1) + "\t\t " + input[i][0] + "\t\t " + input[i][1] + "\t\t " +complitionTimeOfProcess[i]+ "\t\t\t "+ waitingTimeOfProcess[i] + "\t\t " + turnAroundTimeOfProcess[i]);
			}
		System.out.println("Average Waiting Time Of Processes : "+avgWaitingTime );
		System.out.println("Maximum Waiting Time Of Processes : "+maxWaitingTime );
		sc.close();

	}

	private static int maxWaitingTime(int[] waitingTimeOfProcess) {
		int maxWaitTime = 0;
		for (int i = 0; i < waitingTimeOfProcess.length; i++) {
			if (waitingTimeOfProcess[i] > maxWaitTime) {
				maxWaitTime = waitingTimeOfProcess[i];
			}
		}
		return maxWaitTime;
	}

	private static int averageWaitingTime(int[] waitingTimeOfProcess) {
		int avgWaitTime = 0;
		for (int i = 0; i < waitingTimeOfProcess.length; i++) {
			avgWaitTime = avgWaitTime + waitingTimeOfProcess[i];
		}
		avgWaitTime = (avgWaitTime / waitingTimeOfProcess.length);

		return avgWaitTime;
	}

	private static int[] turnAroundTime(int[][] input, int complitionTime[],
			int n) {
		int[] turnAroundTimeOfProcess = new int[n];
		for (int i = 0; i < n; i++) {
			turnAroundTimeOfProcess[i] = complitionTime[i] - input[i][0];
		}

		return turnAroundTimeOfProcess;
	}

	private static int[] waitingTime(int[][] input, int n) {
		int[] waitingTimeOfProcess = new int[n];
		int timeTaken = 0, i = 0;
		do {
			if (input[i][0] <= timeTaken) {
				waitingTimeOfProcess[i] = timeTaken - input[i][0];
				timeTaken = timeTaken + input[i][1];
			} else {
				timeTaken = input[i][0];
				waitingTimeOfProcess[i] = timeTaken - input[i][0];
			}
			i++;
		} while (i < input.length);

		return waitingTimeOfProcess;
	}

	private static int[] complitionTime(int[][] input, int n) {
		int[] complitionTimeOfProcess = new int[n];
		int timeTaken = 0, i = 0;
		do {
			if (input[i][0] <= timeTaken) {
				complitionTimeOfProcess[i] = timeTaken + input[i][1];
				timeTaken = timeTaken + input[i][1];
			} else {
				timeTaken = input[i][0];
				complitionTimeOfProcess[i] = timeTaken + input[i][1];
			}
			i++;
		} while (i < input.length);

		return complitionTimeOfProcess;
	}

}
