package variable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.channels.NonWritableChannelException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test_Variable {
	public static void main(String[] args) {
		//method1();//利用FileInputStream读取数据
		//method2();//利用bufferedInputStream
		//method3();//利用bufferedReader读取
		//method4();//利用FileOutputStream字节输出
		method5();//文件复制
	}

	private static void method5() {
		try {
			File from = new File("D:\\1_JT\\image\\1.txt");
			BufferedInputStream in = 
					new BufferedInputStream(new FileInputStream(from));
			File to = new File("D:\\1_JT\\image\\2.txt");
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(to));
			int b = 0;
			while ((b = in.read())!=-1) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void method4() {
		try {
			FileOutputStream out = 
					new FileOutputStream("D:\\1_JT\\image\\1.txt");
			out.write(97);
			out.write(98);
			out.write(99);
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method3() {
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("D:\\1_JT\\image\\CSSYS.sql")));
			int b = 0;
			while((b = in.read())!=-1) {
				System.out.println(b);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method2() {
		try {
			BufferedInputStream in = 
					new BufferedInputStream(new FileInputStream("D:\\1_JT\\image\\CSSYS.sql"));
			int b = 0;
			while ((b = in.read())!=-1) {
				System.out.println(b);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method1() {
		try {
			FileInputStream in = 
					new FileInputStream("D:\\1_JT\\image\\CSSYS.sql");
			int b = 0;
			while ((b = in.read())!=-1) {
				System.out.print(b);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}