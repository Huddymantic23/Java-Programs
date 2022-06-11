import java.io.File;
import java.util.Scanner;

public class Handle {
	private Handle(String name) {
		try{
			File file=new File(name);
			print("Select Your Operation \n \n");
			
			print("<Info :: 1> <Read :: 2> <Delete :: 3> <Create :: 4>");
			try {
				int choice=Integer.parseInt(new Scanner(System.in).nextLine());
				switch(choice) {
					case 1:
						informationAboutFile(file);
					break;
					case 2:
						decorate();
						readFile(file);
						decorate();
					break;
					case 3:
						try {
							file.delete();
						}
						catch(Exception e) {
							print("Error Occured ");
						}
					break;
					case 4:
						makeNewFile();
					break;
					default:
						print("This Operation Is Not Valid");
					break;
				}
			}
			catch(Exception e){
				print("Enter an Integer");
			}
		}
		catch(Exception e){
			print("Failed To Open");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
	print("\t File Handler \n");
		print("Enter your File Name :");
		String string=String.valueOf(new Scanner(System.in).nextLine());
		Handle handler=new Handle(string);
	}
	
	static void print(String string) {
		System.out.println(string);
	}
	
	public void makeNewFile() {
		String fileName=new Scanner(System.in).nextLine();
		try {
			File file=new File(fileName);
			if(file.createNewFile()) {
				decorate();
				print("Created a new file ");
				print("Path :: "+file.getAbsolutePath());
				decorate();
			}
			else {
				decorate();
				print("This already Exists");
				print("Path :: "+file.getAbsolutePath());
				decorate();
			}
		}
		catch(Exception e) {
			print("Failed To Create");
		}
	}
	
	public void informationAboutFile(File file) {
		try {
			print("Name ->> "+file.getName());
			print("Path ->> "+file.getAbsolutePath());
			print("Size ->> "+file.length()+" bytes");
		}
		catch(Exception e){
			print("Some Error Occured !");
		}
	}
	
	public void decorate() {
		for(int i=1;i<=20;i++){
			System.out.print("=");
		}
		print("\n");
	}
	
	public void readFile(File file){
		int lines=0;
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				print(String.valueOf(sc.nextLine()));
				lines++;
			}
			print("Lines :: "+String.valueOf(lines));
			sc.close();
		}
		catch(Exception e){
			print("Failed To Read This File ");
			System.exit(0);
		}
	}
}