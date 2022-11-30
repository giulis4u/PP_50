public class dogdrive
{
    public static void main (String[] args)
    {
        //first dog
        dog huskey  = new dog("Fang", 5, "Huskey", 80);
        System.out.print("\n Fang's breed and age is " + huskey.getBreed());
        System.out.println(", " + huskey.getAge() + " five years old");


        dog shepard = new dog ("Piper", 3, "Australian Sheperd", 45);
        System.out.println("\n Pipers weight is " + shepard.getPounds() + "kgs");

        //The description of my dog (actual dog)
        dog spaniel = new dog ("Walter", 7, "Tibetten Spaniel", 45);
        System.out.println(spaniel.toString());


        System.out.println("I have a total of " + dog.getCountDogs());
    }
}
