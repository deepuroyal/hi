import java.util.Scanner;
public class fact{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,fact=1;
n=sc.nextInt();
System.out.println("Enter any number");
for(i=-1;i<=n;i++)
{
int fact=fact*i;
}
System.out.println("fact");
}
}