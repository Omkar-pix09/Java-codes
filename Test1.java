class Animal1
{
    public void makeSound()
    {
        System.out.println("Animals make Sound")
    }
}
class Dog extends Animal1
{
    public void bark()
    {
        system.out.println("Dog bark")
    }
}
class Test1 
{
    public static void main(string[] args)
    {
        Dog myDog = new Dog();
        myDog.makeSound():
        myDog.bark();
    }
}