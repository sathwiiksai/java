/* Number1 */

/*class A
{
public static void main(String[]args)
{
int n=6;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
 System.out.print("* ");
}
 System.out.print("\n");
}
}
}*/

/* Number2 */

/*import java.util.Scanner;
public class A{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
 System.out.print((i+1)+" ");
}
 System.out.print("\n");
}
}
}*/

/* Number3 */

/*import java.util.Scanner;
public class A{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
 System.out.print((j+1)+" ");
}
 System.out.print("\n");
}
}
}*/


/* Number4 */

/*import java.util.Scanner;
public class A{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
 System.out.print(num+"\t");
num++;
}
 System.out.print("\n");
}
}
}*/

/* Number5 */

/*import java.util.Scanner;
public class A{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
 System.out.print(num+"\t");
if (num==9){
num=1;
continue;
}
num++;
}
 System.out.print("\n");
}
}
}*/

/* Number6 */

/*import java.util.Scanner;
public class A{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
 System.out.print(num+"\t");
num+=2;
}
 System.out.print("\n");
}
}
}*/

/* Number7 */

/*import java.util.Scanner;
public class A{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int n=sc.nextInt();
int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if (j%2==0){
  System.out.print(1);
}
else{
  System.out.print(0);
}
}
 System.out.println("");
}
}
}*/

/* Number8 */

/*import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value:");
int n;
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/


/* Number9 */

/*import java.util.Scanner;
public class A
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/


/* Number10 */

import java.util.Scanner;
class Pattern10
{
public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}
