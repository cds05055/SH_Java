package com.kh.day03.array.run;

import com.kh.day03.array.exercise.Exercise_Array1;
import com.kh.day03.array.exercise.Exercise_For;

public class Run {
	public static void main(String [] args) 
	{
		// Exercise_Array1 cannot be resolved to a type import되지 않았음
		Exercise_Array1 exArr = new Exercise_Array1();
//		 exArr.exercise1();
//		exArr.exercise2();
//		exArr.arryCopyExercise();
		exArr.lottoExercise();
//		exArr.rockScissorPaper();
		
		Exercise_For exFor = new Exercise_For();
//		exFor.forExercise2();
//		exFor.forDoubleExercise3();
	}
}
