public class Main {
	public static void main(String[] args) {
		int a[]={11,16,35,34,45};
		int e=0,o=0,temp;
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length;j++){
				if(a[j]<a[i]){
				temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.println(a[j]);
				}
				else{
					System.out.println(a[i]);
				}
}
}
}
	}