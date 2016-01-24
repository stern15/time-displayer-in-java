/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
/**
 *
 * @author semasuka
 */
public class Array {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        time tmObj = new time();
        tmObj.setTime(13, 34, 04);
        System.out.println(tmObj.toMilitary());
        System.out.println(tmObj.normal());
    }

}