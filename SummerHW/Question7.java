public class Question7 {

	public static void main(String[] args) {
		int arr[][]={{20,10,6},
					 {50,4,20}};
		int m=0;int n=0;

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<3;j++) {
				if(m<arr[i][j]) {
					m=arr[i][j];
				}
				if(n<arr[i][j]) {
					n=arr[i][j];
				}
			}
		}
		System.out.println("G : "+m);
		System.out.println("S : "+n);
	}
}