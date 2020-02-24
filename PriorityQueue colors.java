import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  PriorityQueue<String> queueColors = new PriorityQueue<>();
  
  queueColors.add("blue");
  queueColors.add("red");
  queueColors.add("green");
  queueColors.add("yellow");
  queueColors.add("pink");
  queueColors.add("magento");
  queueColors.add("orange");
  queueColors.add("cyan");
  
  System.out.println("Colors in the Priority Queues are: ");  
  System.out.println(queueColors);
  
  PriorityQueue<String> queueColors2 = new PriorityQueue<>();
  queueColors2.add("black");
  queueColors2.add("white"); 
  
  queueColors2.addAll(queueColors);
  
    System.out.println("Colors2  in the Priority Queues are: ");  
  System.out.println(queueColors2);
 }
}
