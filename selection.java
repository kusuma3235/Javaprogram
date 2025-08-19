
		public class Main {
	public static void main(String[] args) {
		int[] arr={20,12,10,15,2};
		int n=arr.length;
		int temp;
		int swapcount=0;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			if(min!=i){
					temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
					swapcount++;
			}
		}
	    System.out.println("Sorted Array in ascending order:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("\n Swap count:"+swapcount);
	}
}