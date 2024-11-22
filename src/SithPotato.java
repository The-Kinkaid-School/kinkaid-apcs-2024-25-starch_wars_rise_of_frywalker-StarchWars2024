public class SithPotato extends EvilPotato
{
    public SithPotato(String eyes)
    {
        super(eyes, "light saber");
    }

    public void sayGreeting()
    {
        System.out.println("The fries are strong with this one.");
    }

    public void useWeapon()
    {
        System.out.println("Once I was the student, now I am the masher.");
    }

    public boolean isAPotato()
    {
        System.out.println("Really, I am just a Potato.");
        return super.isAPotato();
    }


    public String toString()
    {
        return "SithPotato{"+super.toString()+"}";
    }
}
