package com.company;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Talant");
        Person person2 = new Person("Talant");
        Person person3 = new Person("Talant");
        Person[] perosns =new Person[]{person,person2,person3};
        Famil famil = new Famil(perosns);
        Kvartiry kvartiry = new Kvartiry("Kyrgyzystan",new Famil[]{famil});
        System.out.println(kvartiry);
        kvartiry.pay();
        System.out.println("kvaritada "+perosns.length+" person jashait");
        System.out.println("-----------------------");




        Person person1 =new Person("Donald");
        Person person4 =new Person("Obama");
        Person[] person5 =new Person[]{person1,person4};
        Famil famil1=new Famil(person5);

        Otel otel=new Otel("Moscow",new Famil[]{famil1});
        System.out.println(otel);
        otel.pay();
        System.out.println("Otel"+person5.length+ " jashait");

        System.out.println("-----------------");




       Person person6 =new Person("Atabek");
       Person person7 =new Person("Syimyk");
       Person person8 =new Person("Talant");
       Person[] person9 =new Person[]{person6,person7,person8};
       Famil famil2 =new Famil(person9);

       Obshezhita obshezhita =new Obshezhita("London",new Famil[]{famil2});
        System.out.println(obshezhita);
        obshezhita.pay();
        System.out.println("Obshezhita"+person9.length+" jazhait");

    }
}