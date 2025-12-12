package EX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class Test_Student {
    public static void main(String[] args) {
        StudentsManagerImp sm = new StudentsManagerImp();
        sm.add(new Students(1,1,1,"홍길동",95));
        sm.add(new Students(1,2,1,"손오공",30));
        sm.add(new Students(1,3,1,"손오반",88));

        sm.sortByStudents(); // 이름 기준 정렬 예시
        sm.printAll();
    }
}

interface StudentsManager{
    boolean add(Students students);
    Students remove(int grade, int classNum, int num);
    Students find(int grade, int classNum, int num);
    void printAll();
    void sortByStudents();
}

class StudentsManagerImp implements StudentsManager{
    private ArrayList<Students> list = new ArrayList<>();

    @Override
    public boolean add(Students students) {
        if (students == null) return false;
        if (list.contains(students)) return false;
        return list.add(students);
    }

    @Override
    public Students remove(int grade, int classNum, int num) {
        Iterator<Students> it = list.iterator();
        while (it.hasNext()) {
            Students s = it.next();
            if (s.getGrade() == grade && s.getClassNum() == classNum && s.getNum() == num) {
                it.remove();
                return s;
            }
        }
        return null;
    }

    @Override
    public Students find(int grade, int classNum, int num) {
        for (Students s : list) {
            if (s.getGrade() == grade && s.getClassNum() == classNum && s.getNum() == num) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void printAll() {
        for (Students st : list) {
            System.out.println(st);
        }
    }

    @Override
    public void sortByStudents() {
        Collections.sort(list); // Students.compareTo 구현 필요
    }
}

class Students implements Comparable<Students>{
    int grade, classNum, num, score;
    String name;

    public Students(int grade, int classNum, int num, String name, int score) {
        this.grade = grade;
        this.classNum = classNum;
        this.num = num;
        this.name = name;
        this.score = score;
    }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }
    public int getClassNum() { return classNum; }
    public void setClassNum(int classNum) { this.classNum = classNum; }
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return grade + "학년 " + classNum + "반 " + num + "번 " + name + " - 점수: " + score;
    }

    @Override
    public int compareTo(Students o) {
        // 예: 이름 우선 정렬, 이름 같으면 score 내림차순
        int cmp = (this.name == null ? "" : this.name).compareTo(o.name == null ? "" : o.name);
        if (cmp != 0) return cmp;
        return Integer.compare(o.score, this.score); // 높은 점수 먼저
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students s = (Students) o;
        return grade == s.grade && classNum == s.classNum && num == s.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, classNum, num);
    }
}
