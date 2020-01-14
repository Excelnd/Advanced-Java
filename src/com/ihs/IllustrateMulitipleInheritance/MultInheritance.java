package com.ihs.IllustrateMulitipleInheritance;

interface Sports {
    float sportWt = 6.0f;
    void putWt();
}

class Student {
    private int rollno;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void putNum() {
        System.out.println("Roll No: " + rollno);
    }
}

class Test extends Student {
    private float sub1, sub2;
    public void setMarks(float sub1, float sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public float[] getMarks() {
        return new float[] {sub1, sub2};
    }

    float subTotal() {
        return sub1 + sub2;
    }

    void putMarks() {
        System.out.println("===================");
        System.out.println("Marks Obtained");
        System.out.println("===================");
        System.out.println("Subject 1 = " +sub1);
        System.out.println("Subject 2 = " +sub2);
    }
}

class Results extends Test implements Sports {
    float total;
    public void putWt() {
        System.out.println("Sports Wt =" + sportWt);
    }

    void display() {
        float total = subTotal() + sportWt;
        putMarks();
        putWt();
        System.out.println("Total Score = " +total);
    }
}



public class MultInheritance {
    public static void main(String[] args) {
        Results student = new Results();
        student.setRollno(24);
        student.setMarks(45.9F, 47.5F);

        student.display();
    }
}
