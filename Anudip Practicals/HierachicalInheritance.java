class Animal
{
void eat()
{
System.out.println("Eating");
}}
class Dog extends Animal
{
void bark()
{
System.out.println("Bark");
}}
class Cat extends Animal
{
void meow()
{
System.out.println("meow");
}}
class HierachicalInheritance{
public static void main(String args[]){
Cat c=new Cat();
c.eat();

c.meow();
}}
