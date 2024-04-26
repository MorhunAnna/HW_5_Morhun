package org.example;
public class Point {
     int x;
     int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void info() {
        System.out.println("Point: (" + x + ";" + y + ")");
    }
    public boolean divideByTwo () {
        return x % 2 == 0 && y % 2 == 0;
    }
    public static void main(String[] args) {
        Point[] points = {new Point(51, 23), new Point(24, 46), new Point(10, 16), new Point(8, 7)};

        System.out.println("All points:");
        for (Point point : points) {
            point.info();
        }
        System.out.println("\n Point that is divided by 2:");
        for (Point point : points) {
            if (point.divideByTwo()) {
                point.info();
            }
        }
    }
}