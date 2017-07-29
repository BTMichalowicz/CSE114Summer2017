/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_programs;

/**
 *
 * @author Ben Michalowicz
 */



interface Edible{
    public void howToEat();
}
public class EdibleTest {
    
    public static void main(String[] args) {
        Object[] a = {new Tiger(), new Apple(), new Orange()};
        
        for(Object o: a){
            if(o instanceof Edible){
                ((Edible) o).howToEat();
            }
        }
    }
    
}



abstract class Animal{}


class Tiger extends Animal{}


class Chicken extends Animal implements Edible{
    
    @Override
    public void howToEat(){
        System.out.println("Chicken: Fry it up!!");
    }
}


abstract class Fruit implements Edible{
    
}


class Apple extends Fruit{
    
    @Override
    public void howToEat(){
        System.out.println("Cider");
    }
}


class Orange extends Fruit{

    @Override
    public void howToEat() {
        System.out.println("Juice");
    }
    
}
