package bitcamp;

public class Main {
    String name;
    int kor, eng, math, tot;
    double avg;

    public void setMemberGrade(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.tot = kor + eng + math;
        this.avg = (double) tot / 3;
    }

    public void getMemberGrade() {
        System.out.println("이름 : " + name);
        System.out.println("국어점수 : " + kor);
        System.out.println("영어점수 : " + eng);
        System.out.println("수학점수 : " + math);
        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
    }

}