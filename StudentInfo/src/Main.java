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
		System.out.println("1. 학생, 2. 교수, 3. 과목, 4.성적, "
				+ "5. 종료 : ");
		select = in.nextLine();
		if(select.equals("5"))
			break;
		switch(select) {
		case "1" :
			st();
			continue;
		case "2" :
			System.out.println("교수");
			continue;
		case "3" :
			System.out.println("과목");
			continue;
		case "4" :
			gr();
			continue;
		}
	}
	
}

/* 1번부분 */
static void st()
{
	String s ="";
	while(true) {
		System.out.println("1. 조회, 2. 입력, 3. 삭제, 4.이전화면");
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
			System.out.println("과목");
			continue;
		}
	}
}

void pf()
{
	System.out.println("1. 조회, 2. 입력, 3. 삭제, 4.이전화면 ");
	String s = in.nextLine();
	
}
void sb()
{
	System.out.println("1. 조회, 2. 입력, 3. 삭제, 4.이전화면 ");
	String s = in.nextLine();
	
}

/* 5번 부분 */
static void gr()
{	
	Grade g = new Grade();
	String s= "";
	while(true) {
		System.out.println("1. 학생별 성적 조회, 2. 과목별 성적 조회, "
				+ "3. 성적 입력, 4. 성적 삭제,  5.이전화면 ");
		s = in.nextLine();
		if(s.equals("5"))
			break;
		switch(s) {
		case "1":
			System.out.println("해당 학생번호를 입력하세요 : ");
			s = in.nextLine();
			Student a;
			for(int i=0; i<grArr.size(); i++)
			{
				if(g.getStdNum() == s)
				{
					System.out.println("------------해당 학생정보----------- \n"
							+ g.getGrNum() + g.getStdNum() + g.getSbNum() + g.getScore());
					
				}
				
			}
			
		}

	}
}

/* 1~4번 출력처리 */
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
			System.out.println("------------"+i+"번째 학생정보----------- \n" 
			+ "번호 : "+ a.getNum() + " 이름 : " + a.getName() +
			" 생일 : " + a.getBirth());
		}
		break;
	case 2: 
		for(int i=0; i<pfArr.size(); i++)
		{
			b=pfArr.get(i);
			System.out.println("------------"+i+"번째 교수정보----------- \n" 
			+ "번호 : "+ b.getNum() + " 이름 : " + b.getName() +
			" 생일 : " + b.getBirth() + " 과목 : " + b.getProfsub());
		}
	case 3:
		for(int i=0; i<sbArr.size(); i++)
		{
			c=sbArr.get(i);
			System.out.println("------------"+i+"번째 과목정보----------- \n" 
			+ "과목번호 : "+ c.getsubjectNum() + " 이름 : " + c.getsubName());
		}
		
		
	}
	
}

/* 입력처리 */
static void st_enter_list()
{
	Student a = new Student();
	System.out.println("번호 이름 생년월일 순으로 입력해주세요.");
	String s= in.nextLine();
	String [] token = s.split(" ");
	a.setNum(token[0]);
	a.setName(token[1]);
	a.setBirth(token[2]);
	stArr.add(a);
	System.out.println(token[0]+"의 정보 입력완료");
}
}