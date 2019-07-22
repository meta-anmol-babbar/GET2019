package scfsession7;

import java.util.ArrayList;
import java.util.List;

public class SparseMatrixOperations {
	final int matrix[][];
	final int nonZeroMatrix[][];
	int transposeMatrix[][];
	int size;

	public SparseMatrixOperations(int[][] input) {
		matrix = input;
		size = 0;
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix[1].length; j++) {
				if (matrix[i][j] != 0)
					size++;

			}
		}
		nonZeroMatrix = new int[3][size];
		System.out.println("reached here size is" + size);

		int k = 0;
		for (int i = 0; i < matrix[1].length; i++) {
			System.out.println("i " + i);
			for (int j = 0; j < matrix[1].length; j++) {
				System.out.println("j " + j);
				if (matrix[i][j] != 0) {
					nonZeroMatrix[0][k] = i;
					nonZeroMatrix[1][k] = j;
					nonZeroMatrix[2][k] = matrix[i][j];
					k++;

				}
			}
		}
		System.out.println("length"+nonZeroMatrix[0].length);
		for (int i = 0; i < nonZeroMatrix.length; i++) {
			for (int j = 0; j < nonZeroMatrix[0].length; j++) {
				System.out.print(nonZeroMatrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("_______________________________________");
	}

	public int[][] transposeMatrix(SparseMatrixOperations obj) {
		transposeMatrix = new int[3][size];
		for (int i = 0; i < nonZeroMatrix[0].length; i++) {
			transposeMatrix[0][i] = nonZeroMatrix[1][i];
			transposeMatrix[1][i] = nonZeroMatrix[0][i];
			transposeMatrix[2][i] = nonZeroMatrix[2][i];
		}

		for (int i = 0; i < transposeMatrix.length; i++) {
			for (int j = 0; j < transposeMatrix[0].length; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}

		return matrix;

	}

	public boolean symetric(SparseMatrixOperations obj) {
		obj.transposeMatrix(obj);
		for (int i = 0; i < nonZeroMatrix[0].length; i++) {
			if (transposeMatrix[0][i] == nonZeroMatrix[0][i]
					&& transposeMatrix[1][i] == nonZeroMatrix[1][i]
					&& transposeMatrix[2][i] == nonZeroMatrix[2][i]) {
				// System.out.println("true");

			} else
				return false;
		}

		return true;
	}

	public int[][] matrixAddition(SparseMatrixOperations matrix1,
			SparseMatrixOperations matrix2) {
		int length1=matrix1.nonZeroMatrix[0].length;
		int length2=matrix2.nonZeroMatrix[0].length;
		
		ArrayList [][]newNonZeroMatrix = new ArrayList[3][size];
		for(int i=0;i<length1;i++){
			
		}

		return matrix;

	}
	
	public int[][] matrixMultiplication(SparseMatrixOperations matrix1,
			SparseMatrixOperations matrix2){
		int sum=0;
		int rowMatrix1=0,rowMatrix2=0;
		int colMatrix1=0,colMatrix2=0;
		
		rowMatrix1=matrix1.matrix.length;
		colMatrix1=matrix1.matrix[0].length;
		rowMatrix2=matrix2.matrix.length;
		colMatrix2=matrix2.matrix[0].length;
		
	      if (colMatrix1 != rowMatrix2)
	          throw new AssertionError("matrices can not be multiplied");
	       else
	       {
	          int second[][] = new int[rowMatrix2][colMatrix2];
	          int multiply[][] = new int[rowMatrix1][colMatrix2];
	  
	           
	          for (int i = 0; i < rowMatrix1; i++)
	          {
	             for (int j = 0; j<colMatrix2 ; j++)
	             {  
	                for (int k = 0; k < rowMatrix1; k++)
	                {
	                   sum = sum + matrix1.matrix[i][k]*matrix2.matrix[k][j];
	                }
	  
	                multiply[c][d] = sum;
	                sum = 0;
	             }
	          }
	  
	          System.out.println("Product of the matrices:");
	  
	          for (c = 0; c < m; c++)
	          {
	             for (d = 0; d < q; d++)
	                System.out.print(multiply[c][d]+"\t");
	  
	             System.out.print("\n");
	          }
	       }
	    }
	 }

		
		return matrix;
		
	}

}
