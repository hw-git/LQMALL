package org.lanqiao.lqmall.test;

public class Sort {
	public static void main(String[] args) {
		int[] data={2,4,5,3,7,2,9};
		sort(data);
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
	public static void sort(int[] data){
		int left,right,mid,num;
		for(int i=1;i<data.length;i++){
			left=0;
			right=i-1;
			num=data[i];
			while(left<=right){
				mid=(left+right)/2;
				if(num<data[mid]){
					right=mid-1;
				}else{
					left=mid+1;
				}
			}
			for(int j=i-1;j>=left;j--){
				data[j+1]=data[j];
			}
			data[left]=num;
		}
	}
}
