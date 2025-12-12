package EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Test_Student2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StudentsManager2 sm = new StudentsManagerImp2();

        sm.add(new Students2(1, 1, 1, "홍길동", 95));
        sm.add(new Students2(1, 2, 1, "손오공", 30));
        sm.add(new Students2(1, 3, 1, "손오반", 88));

        System.out.println("=== 전체 학생 ===");
        sm.printAll();

        System.out.println("\n[학생 검색]");
        System.out.print("학년 입력: ");
        int grade = scan.nextInt();
        System.out.print("반 입력: ");
        int classNum = scan.nextInt();
        System.out.print("번호 입력: ");
        int num = scan.nextInt();

        Students2 found = sm.find(grade, classNum, num);
        if (found != null) {
            System.out.println("검색 결과: " + found);
        } else {
            System.out.println("해당 학생이 없습니다.");
        }
        
//       
        

        System.out.println("\n[학생 삭제]");
        System.out.print("학년 입력: ");
        grade = scan.nextInt();
        System.out.print("반 입력: ");
        classNum = scan.nextInt();
        System.out.print("번호 입력: ");
        num = scan.nextInt();

        Students2 removed = sm.remove(grade, classNum, num);
        if (removed != null) {
            System.out.println("삭제된 학생: " + removed);
        } else {
            System.out.println("삭제할 학생이 없습니다.");
        }

        System.out.println("\n=== 점수 기준 정렬 후 전체 출력 ===");
        sm.sortByStudents();
        sm.printAll();

        scan.close();
    }
}

interface StudentsManager2 {
    boolean add(Students2 students2);
    Students2 add(int grade, int classNum, int num, String name);
	Students2 remove(int grade, int classNum, int num);
    Students2 find(int grade, int classNum, int num);
    void printAll();
    void sortByStudents();
}

class StudentsManagerImp2 implements StudentsManager2 {
    private ArrayList<Students2> list = new ArrayList<>();

    @Override
    public boolean add(Students2 students2) {
        if (students2 == null) {
        	return false;
        }
        
        return list.add(students2);
    }

    @Override
    public Students2 remove(int grade, int classNum, int num) {
        Iterator<Students2> it = list.iterator();
        while (it.hasNext()) {
            Students2 s = it.next();
            if (s.getGrade() == grade &&
                s.getClassNum() == classNum &&
                s.getNum() == num) {
                it.remove();
                return s;
            }
        }
        return null;
    }

    @Override
    public Students2 find(int grade, int classNum, int num) {
        for (Students2 s : list) {
            if (s.getGrade() == grade &&
                s.getClassNum() == classNum &&
                s.getNum() == num) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void printAll() {
        for (Students2 st : list) {
            System.out.println(st);
        }
    }

    @Override
    public void sortByStudents() {
        Collections.sort(list);
    }

	@Override
	public Students2 add(int grade, int classNum, int num, String name) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Students2 implements Comparable<Students2> {
    private int grade, classNum, num, score;
    private String name;

    public Students2(int grade, int classNum, int num, String name, int score) {
        this.grade = grade;
        this.classNum = classNum;
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public int getGrade() { 
    	return grade; 
    	}
    public int getClassNum() { 
    	return classNum; 
    	}
    public int getNum() { 
    	return num;
    	}
    public int getScore() {
    	return score; 
    	}

    @Override
    public String toString() {
        return grade + "학년 " + classNum + "반 " + num + "번 "
                + name + " - 점수: " + score;
    }

    @Override
    public int compareTo(Students2 o) {
        return Integer.compare(o.score, this.score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students2)) return false;
        Students2 s = (Students2) o;
        return grade == s.grade &&
               classNum == s.classNum &&
               num == s.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, classNum, num);
    }
}
