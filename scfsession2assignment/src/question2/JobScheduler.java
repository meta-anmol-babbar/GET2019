package question2;

import java.util.Scanner;

public class JobScheduler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of processes");
		n = sc.nextInt();
		int[][] input = new int[n][2];
		int complitionTimeOfProcess[] = new int[n];
		int waitingTimeOfProcess[] = new int[n];
		int turnAroundTimeOfProcess[] = new int[n];
		int avgWaitingTime = 0;
		int maxWaitingTime = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter arival time of process p" + (i + 1));
			input[i][0] = sc.nextInt();
			System.out.println("Enter burst time of process p" + i + 1);
			input[i][1] = sc.nextInt();
		}

		complitionTimeOfProcess = complitionTime(input, n);
		waitingTimeOfProcess = waitingTime(input, n);
		turnAroundTimeOfProcess = turnAroundTime(input,
				complitionTimeOfProcess, n);
		avgWaitingTime = averageWaitingTime(waitingTimeOfProcess);
		maxWaitingTime = maxWaitingTime(waitingTimeOfProcess);
		print(complitionTimeOfProcess, "Compliation Time Of Processes");
		print(waitingTimeOfProcess, "Waiting Time Of Processes");
		print(turnAroundTimeOfProcess, "Turn Around Time Of Processes");
		print(avgWaitingTime, "Average Waiting Time Of Processes");
		print(maxWaitingTime, "Maximum Waiting Time Of Processes");
		sc.close();

	}

	private static void print(int integerValue, String initials) {
		System.out.println(initials + " " + integerValue);
	}

	private static void print(int[] arrayPrint, String initials) {
		int n = arrayPrint.length;
		for (int i = 0; i < n; i++) {
			System.out.println(initials + " " + i + " " + arrayPrint[i]);
		}
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
