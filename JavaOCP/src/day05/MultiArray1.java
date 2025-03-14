package day05;

public class MultiArray1 {

	public static void main(String[] args) {
		int[] class1 = {100, 80, 40};
		int[] class2 = {85, 55, 90};
		// ---------------------------------
		//  {
		//     {100, 80, 40},
		//     {85, 55, 90}
		//  }
		// ---------------------------------
		//                行  0    1   2   
		int[][] classes = {
							{100, 80, 40},   // 列 0
							{85,  55, 90}    // 列 1
						  };
		// ---------------------------------
		System.out.println(class1);  // [I@65ae6ba4
		System.out.println(class2);  // [I@7960847b
		System.out.println(classes); // [[I@6a6824be
		// ---------------------------------
		// classes[列][行]
		// 取 100
		System.out.println(classes[0][0]);
		// 取 90
		System.out.println(classes[1][2]);
	}

}
