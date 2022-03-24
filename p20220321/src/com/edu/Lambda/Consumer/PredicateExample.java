package com.edu.Lambda.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
   String name;
   String gender;
   int score;

   public Student(String name, String gender, int score) {
      super();
      this.name = name;
      this.gender = gender;
      this.score = score;
   }

   /// 생성자

}

public class PredicateExample {
   public static void main(String[] args) {
      Predicate<Student> predic = new Predicate<Student>() {

         @Override
         public boolean test(Student t) {

            return t.gender.equals("남자");
         }

      };
      double avg = avg(predic);
      System.out.println("남학생의 평균: " + avg);
      predic = (s) -> s.gender.equals("여자");
      avg = avg(predic);
      System.out.println("남학생의 평균: " + avg);

   }

   public static double avg(Predicate<Student> pred) {
      List<Student> list = new ArrayList<Student>();
      list.add(new Student("홍길동", "남자", 70));
      list.add(new Student("김순희", "여자", 80));
      list.add(new Student("김부식", "남자", 85));
      list.add(new Student("박한나", "여자", 88));

      int cnt = 0;
      int sum = 0;
      double avg = 0;

      for (Student student : list) {
         if (pred.test(student)) {
            cnt++;
            sum += student.score;
         }
      }
      avg = sum / (double) cnt;
      return avg;
   }
}