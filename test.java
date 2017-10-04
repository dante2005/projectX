/* For launch - press F6 and copy/paste three strings below, save as...

cd "$(CURRENT_DIRECTORY)"
javac $(FILE_NAME)
java $(NAME_PART)
*/

/* ********** Статьи с примерами:*****************

 http://developer.alexanderklimov.ru/android/java/hashmap.php

 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;


/*
public class test{
	
	public static void main(String []args) {
		
	
	System.out.println(SummMethod(123));
	
	}
		
	public static int SummMethod(int m) {
		
	String s = String.valueOf(567);   // конвертировать число в сроку   String
	
	//int a = s.length();            // возвращает количество символов строки  int       // b = Integer.parseInt(a);  // конвертировать String в int
	
	//Character b = s.charAt(0);           // возвращает код символа
	
	//int c = Character.digit(b, 10);     //  переводит цифру ch системы счисления с основанием radix в ее числовое значение типа int .
	
	//return c;
	
	char charCode;
	int summ = 0;
		
		for (int i = 0; i < s.length(); i++) {
		
		charCode = s.charAt(i);
		summ += Character.digit(charCode, 10);
		
		}	

		return summ;
	
	}		
		
}
*/
/*
public class test {
	
	public static void main(String []args) throws Exception {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		String salary = read.readLine();
		int salaryInt = Integer.parseInt(salary);
		
		System.out.println("I will be earn $ " + salaryInt + " per month!");
		
		
	}
		
}
*/

/*
public class test {
	
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int year = Integer.parseInt(num);
        int x=0;
        
        if(year > 0 && year < 100 && year % 4 == 0) {
            x = 366;    
            }
		else if(year >= 100 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			x = 366;
        else
        x = 365;
        
        System.out.println("Days: " + x);
	}
}
*/

/*
public class test {
	
	public static void main(String []args) throws Exception {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        
        
        String a = reader.readLine();
		int a1 = Integer.parseInt(a);
		String b = reader.readLine();
        int b1 = Integer.parseInt(b);
		String c = reader.readLine();
        int c1 = Integer.parseInt(c);
        
        if(a1 < b1 + c1 && b1 < a1 + c1 && c1 < a1 + b1)
        System.out.println("Треугольник существует. ");
        else
        System.out.println("Треугольник не существует. ");
	}
}
*/
/*

public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String t = reader.readLine();
		Float tDb = Float.parseFloat(t);
		
		if(tDb > 5)
		tDb = tDb % 5;
	
		if(tDb >= 0 && tDb <= 3)
			System.out.println("Зелёный green");
		else if(tDb > 3 && tDb <= 4)
			System.out.println("Оранжевый orange");
		else
			System.out.println("Красный Red");
				
	}
		
}
	*/
	/*
public class test {
	public static void main(String []args) throws Exception {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	String num1 = reader.readLine();
	int a = Integer.parseInt(num1);
	String num2 = reader.readLine();
	int b = Integer.parseInt(num2);
	String num3 = reader.readLine();
	int c = Integer.parseInt(num3);
	
	if(a == b && a == c)
		System.out.println(a + " " + b + " " + c);
	else if(a == b)
		System.out.println(a + " " + b);
	else if(b == c)
		System.out.println(b + " " + c);
	else if(a == c)
		System.out.println(a + " " + c);
	
	}

}
*/
// Сортировка 3 чисел, упорядочивание
/*
public class test {
	public static void main(String []args) throws Exception {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	String num1 = reader.readLine();
	int a = Integer.parseInt(num1);
	String num2 = reader.readLine();
	int b = Integer.parseInt(num2);
	String num3 = reader.readLine();
	int c = Integer.parseInt(num3);
	
	
	if(a >= b && a >= c && b >= c )
		System.out.println(a + " " + b + " " + c );
	else if(a >= b && a >= c && c >= b)
		System.out.println(a + " " + c + " " + b );
	else if(b >= a && b >= c && c >= a)
		System.out.println(b + " " + c + " " + a );
	else if(b >= a && b >= c && a >= c)
		System.out.println(b + " " + a + " " + c );
	else if(c >= a && c >= b && a >= b)
		System.out.println(c + " " + a + " " + b );
	else if(c >= a && c >= b && b >= a)
		System.out.println(c + " " + b + " " + a );
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name1 = reader.readLine();
		String name2 = reader.readLine();
		
		
		if(name1.equals(name2))
			System.out.println("Names equals!!");
		else if(name1.length() == name2.length())
			System.out.println("Names length are equal!");
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        
        if(a != b && a != c && b == c)
            System.out.println(1);
        else if(b != a && b != c && a == c)
            System.out.println(2);
        else if(c != a && c != b && a == b)
            System.out.println(3);
	}
}
*/

/*
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
		
		if(a > 0 && b > 0)
			System.out.println(1);
		else if(a < 0 && b > 0)
			System.out.println(2);
		else if(a < 0 && b < 0)
			System.out.println(3);
		else if(a > 0 && b < 0)
			System.out.println(4);
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(reader.readLine());
		
        if((a < 0) && (a % 2 == 0))
		System.out.println("отрицательное четное число");
		else if((a < 0) && (a % 2 != 0))
		System.out.println("отрицательное нечетное число");
		else if(a == 0)
		System.out.println("ноль");
		else if((a > 0) && (a % 2 == 0))
		System.out.println("положительное четное число");
		else if((a > 0) && (a % 2 != 0))
		System.out.println("положительное нечетное число");

	}
}
*/

/*
public class test {
	public static void main(String []args) throws Exception {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	int a = Integer.parseInt(reader.readLine());
	int b = Integer.parseInt(reader.readLine());
	int c = Integer.parseInt(reader.readLine());
	
	int count = 0;
	
	if(a > 0)
		count += 1;
	
	if(b > 0)
		count += 1;
	
	if(c > 0)
		count += 1;
	
	System.out.println(count);
		
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	int a = Integer.parseInt(reader.readLine());
	int b = Integer.parseInt(reader.readLine());
	int c = Integer.parseInt(reader.readLine());
	
	int pos = 0;
	int neg = 0;
	
	if(a > 0)
		pos += 1;
		
	if(b > 0)
		pos += 1;
	
	if(c > 0)
		pos += 1;
	
	if(a < 0)
		neg += 1;
	
	if(b < 0)
		neg += 1;
	
	if(c < 0)
		neg += 1;
	
	System.out.println(pos + "   " + neg);
	}
}
*/

/*
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(reader.readLine());
		
		if(a > 0 && a < 10 && a % 2 == 0)
			System.out.println("четное однозначное число even onesigned");
		else if(a > 0 && a < 10 && a % 2 != 0)
			System.out.println("нечетное однозначное число odd onesigned");
		else if(a >= 10 && a < 100 && a % 2 == 0)
			System.out.println("четное двузначное число even twosigned");
		else if(a >= 10 && a < 100 && a % 2 != 0)
			System.out.println("нечетное двузначное число odd twosigned");
		else if(a >= 100 && a < 999 && a % 2 == 0)
			System.out.println("четное трехзначное число even threesigned");
		else if(a >= 100 && a <= 999 && a % 2 != 0)
			System.out.println("нечетное однозначное число odd threesigned");
			
	} 	
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {

int i = 10;
    while(i != 0) {
    System.out.println(i);
    i--;
    }

	
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();
		
		int i = Integer.parseInt(reader.readLine());
		int k = 0;
		
		while(k != i ) {
			System.out.println(s);
			k++;
			
		}			
	}	
}
*/
/*  //10 * 10  Матрица из буквы S
public class test {
	public static void main(String []args) {
		
		int a = 0, b = 0;
		
		while(a != 10) {
			
			
			while(b != 10) {
				
			System.out.print("S");
			b++;
			
			}
			System.out.println();			
			a++;
			b = 0;
		}
		
	}
}
*/
/*
// Таблица умножения
public class test {
	
	public static void main(String []args) {
		
		int a = 1, b = 1;
		
		while(a <= 10) {
			
			while(b <= 10) {
				System.out.print((a*b) + " ");
				b++;
			}
			
			System.out.println();
			b = 1;
			a++;
		}
		
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0)
			System.out.println(i);
			
		}			
	}
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		
		int i, j;
		
		for(i = 1; i <= m; i++) {
			
			for(j = 1; j <= n; j++) 
				System.out.print(8);
				
		System.out.println();
		j = 1;
		}	
	}
}
*/
/*
public class test {
	
	public static void main(String []args) {
		
		int i, j;
		
		for(i = 1; i <= 10; i++) {
			
			for(j = 1; j<= 0+i; j++)
				System.out.print(8);
			
		System.out.println();
		
		}		
	}	
}
*/
/*
public class test {
	public static void main(String []args) {
		
		int i, j;
		
		for( i = 1; i <= 10; i++)
 		System.out.print(8);
		System.out.println();
		for( j = 1; j <= 10; j++)
		System.out.println(8);			
	}
}
*/
/*   Phrase "*Name* + loves me"  
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		
		for(int i = 1; i <= 10; i++)
			System.out.println(name + " любит меня.");
		
	}
}
*/
/*
public class test {
public static void main(String[] args) {
    outer:
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (j > i) {
          System.out.println();
          continue outer;
        }
        System.out.print(" " + (i * j));
      }
    }
  	
  }
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//  a    b    c    --- Find middle number of three numbers ---
	int a = Integer.parseInt(reader.readLine());     
	int b = Integer.parseInt(reader.readLine());
	int c = Integer.parseInt(reader.readLine());
	
	if(a > b && a > c) {
		if(b > c)
		System.out.print(b);
		else if(c > b)
		System.out.print(c);
	}
	
	if(b > a && b > c) {
		if(a > c)
		System.out.print(a);
		else if(c > a)
		System.out.print(c);	
	}
	
	
	if(c > a && c > b) {
		if(a > b)	
		System.out.print(a);	
		else if(b > a)
		System.out.print(b);
	}		
	// Check if numbers are equal
	if((a == b) || (a == c) || (a == b && a == c)) 
	System.out.print(a);
		
	else if(b == c)
	System.out.print(b);	
	}	
}
*/

/*  Summory 
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 0;  
		int summ = 0;
	
	while(a != -1) {
		a = Integer.parseInt(reader.readLine());
		summ += a;
	}

	System.out.print(summ);
	}	
}
*/
/*
public class test {
	public static void main(String []args) throws Exception {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		
		int y = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());
		int d = Integer.parseInt(reader.readLine());
		
		System.out.println("Меня зовут " + name + "." + "\n"+"Я родился " + d + "." + m + "." + y);	
	}	
}
*/
/*
public class test {
    public static void main(String[] args) {
        //напишите тут ваш код
        
        Cat cat1 = new Cat("Pun'ka",7, 6, 10);
        Cat cat2 = new Cat("Ksun'ka", 10, 4, 5);
        Cat cat3 = new Cat("Vas'ka", 3, 3, 3);
        
		}

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
*/
/*
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        
        Cat cat1 = new Cat("Pun'ka",7, 6, 10);
        Cat cat2 = new Cat("Ksun'ka", 10, 4, 5);
        Cat cat3 = new Cat("Vas'ka", 3, 3, 3);
        
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
*/
/*    Input whole or real numbers to find middle value
public class test {
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double a = 0, middle = 0;
		int count = 0;
		
		while(a != -1 ) {
			
			a = Double.parseDouble(reader.readLine());
			
			count += 1;
			middle += a;	
		}
	
	System.out.print((middle+1)/(count-1));	
		
	}	
}
*/
/* Getter and Setter for class Person
public class Person {
    //напишите тут ваш код
    
    String name;
    int age;
    char sex;
    
    public String getName() {
        return(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return(age);
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public char getSex() {
        return sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }


    public static void main(String[] args) {

    }
}
*/

/*  Initializing Class 
public class Cat {
    //напишите тут ваш код
    
    private String name = null;
    private int age = 0;
    private int weight = 0;
    private String address = null;
    private String color = null;
    
    
    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 3;
        this.color = "Gray";
        
    }
    
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "White";
        
    }
    
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "Black";
    }
    
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }
    
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5; 
    }

    public static void main(String[] args) {

    }
}
*/
/*
public class test {
public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Vas", 30, "Spb");
        Man man2 = new Man("Nma", 30, "Msk");
        Woman W1 = new Woman("Rmq", 30, "Wer");
        Woman W2 = new Woman("Eww", 30, "Rty");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(W1.name + " " + W1.age + " " + W1.address);
        System.out.println(W2.name + " " + W2.age + " " + W2.address);
    }

    //напишите тут ваш код
    public static class Man {
        String name = null;
        int age = 0;
        String address = null;
        
        Man () {
            this.name = "Ivan";
            this.age = 30;
            this.address = "Saint-Francisco";
        }
        
        Man (String name) {
            this.name = name;
            this.age = 30;
            this.address = "Saint-Francisco";
        }
        
        Man (String name, int age) {
            this.name = name;
            this.age = age;
            this.address = "Saint-Francisco";
        }
        
        Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
    }
    
    public static class Woman {
        String name = null;
        int age = 0;
        String address = null;
        
        Woman () {
            this.name = "Ira";
            this.age = 30;
            this.address = "Saint-Francisco";
        }
        
        Woman (String name) {
            this.name = name;
            this.age = 30;
            this.address = "Saint-Francisco";
        }
        
        Woman (String name, int age) {
            this.name = name;
            this.age = age;
            this.address = "Saint-Francisco";
        }
        
        Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }        
    }
}
*/
/*
// Current date in certain format
public class test {
	
	public static void main(String []args) {
	
	Date dateNow = new Date();
	
	//**** First way *****
	//SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd MM yyyy");
	
	//System.out.print(formatForDateNow.format(dateNow));	
	//******************* 
	
	
	System.out.printf("%1$td %1$tm %1$tY", dateNow);
		
		
	}	
}
*/

/*
public class test 
{
	public static void main(String []args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String sSumm = null;
		int summ = 0, a = 0;
				
		while(!("summ").equals(sSumm = reader.readLine()))
		{
			a = Integer.parseInt(sSumm);
			summ += a;						
		}
		
		System.out.print(summ);		
	}
}
*/

/* Call method Finalize 

public class test {
	public static void main(String []args) {
		
		
		for(int i=1; i<=500000; i++)
		{
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
				
		}

	
	}	
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
*/
/*  Input int number and get even or/and odd digits out of it
public class test {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String val = reader.readLine();
		
		int even = 0, odd = 0;
		
		//System.out.println(val.length()); // int
		
		//System.out.println(val.charAt(3));  // char
		
		for(int i = 0; i < val.length(); i++)
		{
			
			//int b = Character.digit(val.charAt(i), 10);
						
			if ( Character.digit(val.charAt(i), 10) % 2 == 0)
			{
				even += 1;
			}
			else
			{
				odd += 1;
			}
			
		}
		
		System.out.print("Even: " + even + " Odd: " + odd);
		
	}
}
*/
/*
// Calculate MassIndex
public class test {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            
            double index = weight/(height*height); 
            if(index < 18.5)
            System.out.println("Недовес: меньше чем 18.5");
            else if(index > 18.5 && index < 24.9)
            System.out.println("Нормальный: между 18.5 и 24.9");
            else if(index > 25 && index < 29.9)
            System.out.println(": между 25 и 29.9" + " " + index);
            else if(index > 30)
            System.out.println("Ожирение: 30 или больше");
            
        }
    }
}
*/
/*
public class test {
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] list = new int[10];
		
		for(int i=0;i<list.length;i++) {
			//list[i] = Integer.toString(i);
			String b = reader.readLine();
			list[i] = Integer.parseInt(b);
			
			
		}
		
		for(int i=0;i<list.length;i++)
		System.out.print(list[i] + " ");
	}
}
*/
/*
public class test{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		int[] b = new int[3];
		//b[-2] = 3;
		
		for(int i=0;i<a.length;i++){
			a[i] = i*i;
			System.out.println(i + " * " + i + " = " + a[i]);
		}		
	}
}
*/  
/* //work with Map

public class test{
	public static void main(String[] args){
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		map1.put(1, 1);
		
		for(Map.Entry<Integer, Integer> i : map1.entrySet())
		{
			
			String k = i.getKey().toString();
			String j = i.getValue().toString();
			
			System.out.println(k + " : " + j);
			
		}		
		
		// в случае с Map цикл можно заменить вот на это выражение
		// map.forEach((key,value)->System.out.println(key + ":" + value));
	}
}
*/
/*
public class test {
	public static void main(String[] args){
		
		int x = 0;
		
		while ( x < 4 ){
			
			System.out.print("a");
			
			if ( x < 1 ) {
				System.out.print(" ");
			}
			System.out.print("n");
			
			if ( x < 1 ) {
				System.out.print("oise");
				x = x - 1;
			}
			
			if ( x == 1 ) {
				System.out.print("noys");
			}
			if ( x > 1 ) {
				System.out.print(" oyster");
			}
			
			System.out.println("");
			x = x + 2;
				
		}		
	}	
}
*/
public class test{
	public static void main(String[] args){
		
		Echo e1 = new Echo();
		Echo e2 = e1;
		int x = 0;
		
		while ( x < 4 ) {   //  x < 4  if e2.count = 10 at last,
			
			e1.hello();
			e1.count = e1.count + 1;
			
			if ( x > 0 ) {
				e2.count = e2.count + 1;
			}
			
			if ( x > 1) {
				e2.count = e2.count + e1.count;
			}
			
			x = x + 1;
			//System.out.println(e2.count + " " + e1.count);
		}
		
		System.out.println(e2.count + " " + e1.count);
	}	
} 
 
class Echo{
	int count = 0;
	void hello(){
		System.out.println("Priveeeet....");
	}
	
}
 
 
 