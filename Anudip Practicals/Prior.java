import java.util.*;
import java.io.*;
public class Prior
{
public static void main(String args[])
{
PriorityQueue<String> pq = new PriorityQueue<>();
pq.offer("Jayshree");
pq.offer("Ulhas");
pq.offer("Jadhav");
for(String x : pq){
System.out.print(x + " ");
}
System.out.println();
System.out.println(pq.peek());
System.out.println(pq.poll());
for(String x : pq){
System.out.print(x + " ");
}
}}