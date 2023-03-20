package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.app.Sorter;
import com.mycompany.app.Bubblesort;
import com.mycompany.app.Insertion;
import com.mycompany.app.MergeSort;

@RestController
public class ServiceController{

	@RequestMapping("/mergesort")
	public int[] service(){
		Sorter sorter = new Sorter();
		int temp[] = {22,4,67,23,89,100,8,42,99};

		return(sorter.Sort(temp,new MergeSort()));
	}
	@RequestMapping("/bubblesort")
	public int[] Bubble(){
		Sorter sorter = new Sorter();
		int temp[] = {22,4,67,23,89,100,8,42,99};

		return(sorter.Sort(temp,new Bubblesort()));
	}
	@RequestMapping("/insertion")
	public int[] Insert(){
		Sorter sorter = new Sorter();
		int temp[] = {22,4,67,23,89,100,8,42,99};

		return(sorter.Sort(temp,new Insertion()));
	}
}		
