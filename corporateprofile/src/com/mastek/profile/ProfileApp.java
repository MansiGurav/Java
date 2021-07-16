package com.mastek.profile;

import java.util.Scanner;

import com.mastek.profile.model.Candidate;

public class ProfileApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Candidate cnadidate=new Candidate();
		cnadidate.getInformation();
		System.out.println(cnadidate);
	}

}
