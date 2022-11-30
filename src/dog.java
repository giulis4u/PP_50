public class dog
{ //private instant variables
    private String name;

    private int age;

    private String breed;

    private double pounds;

    private static int getNumDogs;


    //full constructor
    public dog(String MyName, int MyAge, String MyBreed, double MyPounds)
    {
      this.name = MyName;

      this.age = MyAge;

      this.breed = MyBreed;

      this.pounds = MyPounds;

      getNumDogs++;
    }

    //default constructor

    public dog()
    {
        name = "name goes here";
        breed = "none";
        pounds = 0.0;
        age = 0;
        getNumDogs++;
    }

    // brain methods
    public double converter()
    {
        return pounds * 0.453592;
    }

    //getters
    public static int getCountDogs()
    {
        return getNumDogs;
    }

    public String getBreed()
    {
        return breed;
    }

    public int getAge()
    {
        return age;
    }

    public double getPounds()
    {
        return converter();
    }

    // there are no setters since it doesn't require any changes

    public String toString()
    {
        String output  = "\n Name of dog: " + name + "\n Dog's age: " + age +
                        "\n breed: " + breed + "\n weight: " + converter() + " kg";
                return output;
    }

}

