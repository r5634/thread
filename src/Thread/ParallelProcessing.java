package Thread;

import Algo.BinarySearch;

public class ParallelProcessing {
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	int mid=0;
	int start=0;
	int end=0;

	
	int search(int start,int end){
		int index=-1;
		mid=(start+end)/2;
		System.out.println("key "+" mid is "+mid+" start "+start+" end "+end+" ;arr mid "+arr[mid]);
		if (key==arr[mid]){
			System.out.println("found");
			index=mid;
		}else if (key<arr[mid]){
			System.out.println("left");
			index=search(start,mid,key);
		}else if (key>arr[mid]){
			System.out.println("right");
			index=search(mid,end,key);
		}
		System.out.println("index in search is "+index);
		return index;
	}
	
	public static void main(String args[]){
		BinarySearch bs= new BinarySearch();
		System.out.println("length "+bs.arr.length);
		System.out.println("index is "+bs.search(0, bs.arr.length, 10));

		
		
		
		
		
	}
}
