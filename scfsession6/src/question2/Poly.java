package question2;

import java.util.Arrays;

public class Poly {
	int[] polynimial;
	
	/**
	 * Poly() is a constructor of class Poly for initialising input polynimial
	 * @param inputPolynomial is input polynomial from user
	 */
	Poly(int[] inputPolynomial){
		polynimial=inputPolynomial;
		if(polynimial.length==0)
			throw new AssertionError("Array empty");

	}
	
	 Poly() {
		// default constructor for Poly
		}

	/**
	 * evaluate takes in value of variable in polynomial and calculates the value of the polynomial 
	 * @param value is input value for variable
	 * @return evaluatedValue is the evaluated value of the polynomial
	 */
	public float evaluate(float value){
		
		float evaluatedValue=0;
		for(int i=0;i<polynimial.length;i++){
			evaluatedValue+=polynimial[i]*(Math.pow(value,i));
		}
		
		return evaluatedValue;
		
	}
	/**
	 * degree calculates the degree of the polynomial
	 * @return length is highest degree of polynomial 
	 */
	public int degree(){
		
		int length = polynimial.length-1;
		while(polynimial[length]==0){
			if(length==0)
				break;
			length--;
			}
		return length;
	}
	/**
	 * add accepts two objects of Poly class and returns the sum of two polynomials
	 * @param value1 is first Polynomial
	 * @param value2 is second polynomial
	 */
	public String add(Poly value1,Poly value2){
		int length1=value1.polynimial.length;
		int length2=value2.polynimial.length;
		int minLength=Math.min(length1, length2);
		int maxLength=Math.max(length1, length2);
		int sumList[]=new int[maxLength];
		
		String retString;
		for(int i=0;i<maxLength;i++){
			if(i<minLength)
				sumList[i]=value1.polynimial[i]+value2.polynimial[i];
			else{
				if(length1 == maxLength)
					sumList[i]=value1.polynimial[i];
				else
					sumList[i]=value2.polynimial[i];
				
			}
		}
		retString=Arrays.toString(sumList);
		return retString;		
		}
	
	/**
	 * mul accepts two objects of Poly class and returns the multiplication of two polynomials
	 * @param value1 is first Polynomial
	 * @param value2 is second polynomial
	 * @return String value of polynomial
	 */
	public String mul(Poly value1,Poly value2){
		int length1=value1.polynimial.length;
		int length2=value2.polynimial.length;
		int mulList[]=new int[length1+length2-1];
		String retString = null;
		
		
		for (int i = 0; i < length1; i++)  
        { 
            /* Multiply the current term of first polynomial 
             with every term of second polynomial.
             */ 
            for (int j = 0; j < length2; j++)  
            { 
                mulList[i + j] += value1.polynimial[i] * value2.polynimial[j]; 
            } 
        } 
		retString=Arrays.toString(mulList);
		
		return retString;
		}
	
	}
	
	


