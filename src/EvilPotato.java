public class EvilPotato extends Potato
{
    private String weapon;

    public EvilPotato(String eyes,
                      String hair,
                      String feet,
                      String ears,
                      String nose,
                      String mouth,
                      String weapon,
                      boolean hasMustache)
    {
        super(eyes, hair, feet, ears, nose, mouth, hasMustache);
        this.weapon = weapon;
    }

    public EvilPotato(String eyes, String weapon)
    {
        super(eyes, "helmet", "boots", "covered", "masked", "masked", false);
        this.weapon = weapon;
    }

    public void sayGreeting()
    {
        System.out.println("Fries! Yukon escape me!");
    }

    public void useWeapon()
    {
        System.out.println("Die, rebel spud!");
    }

    @Override
    public String toString()
    {
        return "EvilPotato{" +
                super.toString() +
                "weapon='" + weapon + '\'' +
                '}';
    }
}
