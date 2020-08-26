package com.HarshSaxena;


public class Point {
    private int x;
    private int y;


    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));

    }
    public double distance(int x, int y){
        return Math.sqrt((x - this.x ) * (x - this.x) + (y - this.y) * (y - this.y));

    }
    public double distance(Point p2){
        return Math.sqrt((this.x - p2.getX()) * (this.x - p2.getX()) + ((this.y - p2.getY()) * (this.y - p2.getY())));

    }


}
