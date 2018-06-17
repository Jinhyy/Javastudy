import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	static List<Student> stArr = new ArrayList<Student>();
	static List<Prof> pfArr = new ArrayList<Prof>();
	static List<Subject> sbArr = new ArrayList<Subject>();
	static List<Grade> grArr = new ArrayList<Grade>();
	static Scanner in = new Scanner(System.in);
	
public static void main(String [] args)
{
	String select="";
	while(true) {
		System.out.println("1. �л�, 2. ����, 3. ����, 4.����, "
				+ "5. ���� : ");
		select = in.nextLine();
		if(select.equals("5"))
			break;
		switch(select) {
		case "1" :
			st();
			continue;
		case "2" :
			System.out.println("����");
			continue;
		case "3" :
			System.out.println("����");
			continue;
		case "4" :
			gr();
			continue;
		}
	}
	
}

/* 1���κ� */
static void st()
{
	String s ="";
	while(true) {
		System.out.println("1. ��ȸ, 2. �Է�, 3. ����, 4.����ȭ��");
		s = in.nextLine();
		if(s.equals("4"))
			break;
		switch(s) {
		case "1" :
			print_list(1);
			continue;
		case "2" :
			st_enter_list();
			continue;
		case "3" :
			System.out.println("����");
			continue;
		}
	}
}

void pf()
{
	System.out.println("1. ��ȸ, 2. �Է�, 3. ����, 4.����ȭ�� ");
	String s = in.nextLine();
	
}
void sb()
{
	System.out.println("1. ��ȸ, 2. �Է�, 3. ����, 4.����ȭ�� ");
	String s = in.nextLine();
	
}

/* 5�� �κ� */
static void gr()
{	
	Grade g = new Grade();
	String s= "";
	while(true) {
		System.out.println("1. �л��� ���� ��ȸ, 2. ���� ���� ��ȸ, "
				+ "3. ���� �Է�, 4. ���� ����,  5.����ȭ�� ");
		s = in.nextLine();
		if(s.equals("5"))
			break;
		switch(s) {
		case "1":
			System.out.println("�ش� �л���ȣ�� �Է��ϼ��� : ");
			s = in.nextLine();
			Student a;
			for(int i=0; i<grArr.size(); i++)
			{
				if(g.getStdNum() == s)
				{
					System.out.println("------------�ش� �л�����----------- \n"
							+ g.getGrNum() + g.getStdNum() + g.getSbNum() + g.getScore());
					
				}
				
			}
			
		}

	}
}

/* 1~4�� ���ó�� */
static void print_list(int n)
{
	Student a;
	Prof b;
	Subject c;
	Grade d;
	
	switch(n) {
	case 1:
		for(int i=0; i<stArr.size(); i++)
		{
			a=stArr.get(i);
			System.out.println("------------"+i+"��° �л�����----------- \n" 
			+ "��ȣ : "+ a.getNum() + " �̸� : " + a.getName() +
			" ���� : " + a.getBirth());
		}
		break;
	case 2: 
		for(int i=0; i<pfArr.size(); i++)
		{
			b=pfArr.get(i);
			System.out.println("------------"+i+"��° ��������----------- \n" 
			+ "��ȣ : "+ b.getNum() + " �̸� : " + b.getName() +
			" ���� : " + b.getBirth() + " ���� : " + b.getProfsub());
		}
	case 3:
		for(int i=0; i<sbArr.size(); i++)
		{
			c=sbArr.get(i);
			System.out.println("------------"+i+"��° ��������----------- \n" 
			+ "�����ȣ : "+ c.getsubjectNum() + " �̸� : " + c.getsubName());
		}
		
		
	}
	
}

/* �Է�ó�� */
static void st_enter_list()
{
	Student a = new Student();
	System.out.println("��ȣ �̸� ������� ������ �Է����ּ���.");
	String s= in.nextLine();
	String [] token = s.split(" ");
	a.setNum(token[0]);
	a.setName(token[1]);
	a.setBirth(token[2]);
	stArr.add(a);
	System.out.println(token[0]+"�� ���� �Է¿Ϸ�");
}
}