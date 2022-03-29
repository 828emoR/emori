package com.edu.collect;

import java.io.*;
import java.util.*;

//studentServiceFileImpl(중첩클래스의 기능대체)
//입력, 수정, 삭제=> 파일에 저장이 되도록.
public class StudentServiceFile implements StudentService {

	List<Student> list = new ArrayList<Student>();
	File file;

	public StudentServiceFile() {

		try {
			FileReader fr = new FileReader("studentList.data");
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(",");// 101,홍길동,80,90 split=배열안의
//				contents[0] <= 101, contents[1] <= 홍길동, contents[2] <= 80 contents[0] <= 90
				list.add(new Student(Integer.parseInt(contents[0]), //
						contents[1], Integer.parseInt(contents[2]), //
						Integer.parseInt(contents[3])//
				));
				}
			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void insertStudent(Student student) {
		list.add(student);
	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == sno) {
				return list.get(i);
			}
		}

		return null;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == student.getStuNo()) {
				list.get(i).setEngScore(student.getEngScore());// 영어점수 수정
				list.get(i).setKoScore(student.getKoScore()); // 국어점수 수정
			}
		}
	}

	@Override
	public List<Student> studentList() {
		return list;
	}

	@Override
	public void removeStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNo() == sno) {
				list.remove(list.get(i).getStuNo());
			}
		}
	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> searchStudent = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getStuName().equals(name)) {
				searchStudent.add(list.get(i));
			}
		}
		return searchStudent;
	}

	public void saveToFile() {
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림의 생성자의 매개값으로 기본스트림.

			for (Student stud : list) {
				bw.write(
						stud.getStuNo() + "," + stud.getStuName() + "," + stud.getEngScore() + "," + stud.getKoScore());
			}
			bw.close();
			fw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
