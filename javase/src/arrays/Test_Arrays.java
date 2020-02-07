package arrays;

import java.util.Arrays;

public class Test_Arrays {
	/**
	 * Arrays工具类
	 * Arrays.toString(数组)	
	 * Arrays.sort(数组)
	 * Arrays.copyOf(原数组,新的长度)
	 * @param args
	 */
	public static void main(String[] args) {
		//method();//测试sort
		System.out.println("2222");
		method1();
	}

	private static void method1() {
		//创建数组
		int[]arrays = new int[] {2,2,5,6,7,5,9,7};
		//复制数组
		int[] array = Arrays.copyOf(arrays, 5);
		System.out.println(Arrays.toString(array));
		int[] array1 = Arrays.copyOf(arrays, 10);
		System.out.println(Arrays.toString(array1));
	}

	private static void method() {
		//创建数组
		int[] arrays = new int[] {1,0,45,35,25};
		//对数组进行排序
		Arrays.sort(arrays);
		//对数组进行字符串拼接
		System.out.println(Arrays.toString(arrays));
	}
}
