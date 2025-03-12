// example of Multilevel Inheritance

class Animal
{
    void eat()
     {   System.out.println("Animals Can Eat");
}
}
class dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barkingg");

    }
}
class puppy extends dog
{
    void weep()
    {
        System.out.println(" puppy weeps")

    }
}
class Test
{
    public static void main(String[] args)
    {
        puppy mypuppy = new puppy();
        mypuppy.eat();
        mypuppy.bark();
        mypuppy.weep();
    }
}